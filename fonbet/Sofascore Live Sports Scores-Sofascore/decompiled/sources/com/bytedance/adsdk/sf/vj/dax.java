package com.bytedance.adsdk.sf.vj;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.task.g;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class dax {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.adsdk.sf.gm.sf.vj pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        char c;
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        com.bytedance.adsdk.sf.gm.sf.qf qfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.gm gmVar = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar2 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            int i = -1;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    if (nextName.equals(g.e)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case ASSET_WRITE_ERROR_VALUE:
                    if (nextName.equals("r")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case INVALID_INDEX_URL_VALUE:
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case GZIP_ENCODE_ERROR_VALUE:
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    whVar2 = oo.gm(jsonReader, qfVar);
                    break;
                case 1:
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            gmVar = oo.pcc(jsonReader, qfVar, i);
                        } else if (nextName2.equals(TtmlNode.TAG_P)) {
                            i = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case 2:
                    ooVar = oo.sf(jsonReader, qfVar);
                    break;
                case 3:
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 4:
                    whVar = oo.gm(jsonReader, qfVar);
                    break;
                case 5:
                    qfVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.sf.gm.sf.qf.LINEAR : com.bytedance.adsdk.sf.gm.sf.qf.RADIAL;
                    break;
                case 6:
                    z = jsonReader.nextBoolean();
                    break;
                case 7:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (ooVar == null) {
            ooVar = new com.bytedance.adsdk.sf.gm.pcc.oo(Collections.singletonList(new com.bytedance.adsdk.sf.qf.pcc(100)));
        }
        return new com.bytedance.adsdk.sf.gm.sf.vj(str, qfVar2, fillType, gmVar, ooVar, whVar, whVar2, null, null, z);
    }
}
