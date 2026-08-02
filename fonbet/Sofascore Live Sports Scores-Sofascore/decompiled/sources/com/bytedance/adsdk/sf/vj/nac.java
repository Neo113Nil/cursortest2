package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.lu;
import com.ironsource.C4427z5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.internal.task.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class nac {
    public static com.bytedance.adsdk.sf.gm.sf.wh pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        int i;
        char c;
        com.bytedance.adsdk.sf.gm.pcc.gm gmVar;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar;
        ArrayList arrayList = new ArrayList();
        String str = null;
        com.bytedance.adsdk.sf.gm.sf.qf qfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.gm gmVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.wh whVar3 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        lu.pcc pccVar = null;
        lu.sf sfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        float f = 0.0f;
        boolean z = false;
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            String str2 = str;
            com.bytedance.adsdk.sf.gm.pcc.oo ooVar2 = ooVar;
            com.bytedance.adsdk.sf.gm.sf.qf qfVar3 = qfVar2;
            switch (nextName.hashCode()) {
                case 100:
                    i = 1;
                    if (nextName.equals("d")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 101:
                    i = 1;
                    if (nextName.equals("e")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 103:
                    i = 1;
                    if (nextName.equals(g.e)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    i = 1;
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case INVALID_INDEX_URL_VALUE:
                    i = 1;
                    if (nextName.equals("s")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case GZIP_ENCODE_ERROR_VALUE:
                    i = 1;
                    if (nextName.equals("t")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    i = 1;
                    if (nextName.equals("w")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3324:
                    i = 1;
                    if (nextName.equals("hd")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3447:
                    i = 1;
                    if (nextName.equals("lc")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3454:
                    i = 1;
                    if (nextName.equals("lj")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3487:
                    i = 1;
                    if (nextName.equals("ml")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3519:
                    i = 1;
                    if (nextName.equals("nm")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    i = 1;
                    break;
            }
            switch (c) {
                case 0:
                    JsonReader jsonReader2 = jsonReader;
                    jsonReader2.beginArray();
                    while (jsonReader2.hasNext()) {
                        jsonReader2.beginObject();
                        com.bytedance.adsdk.sf.gm.pcc.sf sfVar4 = null;
                        String str3 = null;
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.sf.gm.pcc.gm gmVar3 = gmVar2;
                            String nextName2 = jsonReader.nextName();
                            nextName2.getClass();
                            com.bytedance.adsdk.sf.gm.pcc.wh whVar4 = whVar2;
                            if (nextName2.equals(C4427z5.q)) {
                                str3 = jsonReader.nextString();
                            } else if (nextName2.equals("v")) {
                                sfVar4 = oo.pcc(jsonReader, qfVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            gmVar2 = gmVar3;
                            whVar2 = whVar4;
                        }
                        com.bytedance.adsdk.sf.gm.pcc.gm gmVar4 = gmVar2;
                        com.bytedance.adsdk.sf.gm.pcc.wh whVar5 = whVar2;
                        jsonReader.endObject();
                        if (str3.equals("o")) {
                            sfVar3 = sfVar4;
                            gmVar2 = gmVar4;
                            whVar2 = whVar5;
                            jsonReader2 = jsonReader;
                        } else {
                            if (str3.equals("d") || str3.equals(g.e)) {
                                qfVar.pcc(true);
                                arrayList.add(sfVar4);
                            }
                            jsonReader2 = jsonReader;
                            gmVar2 = gmVar4;
                            whVar2 = whVar5;
                        }
                    }
                    gmVar = gmVar2;
                    whVar = whVar2;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        str = str2;
                        ooVar = ooVar2;
                        gmVar2 = gmVar;
                        qfVar2 = qfVar3;
                        whVar2 = whVar;
                        break;
                    }
                    str = str2;
                    ooVar = ooVar2;
                    gmVar2 = gmVar;
                    qfVar2 = qfVar3;
                    whVar2 = whVar;
                    break;
                case 1:
                    whVar3 = oo.gm(jsonReader, qfVar);
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int i2 = -1;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (nextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            gmVar2 = oo.pcc(jsonReader, qfVar, i2);
                        } else if (nextName3.equals(TtmlNode.TAG_P)) {
                            i2 = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case 3:
                    ooVar = oo.sf(jsonReader, qfVar);
                    str = str2;
                    qfVar2 = qfVar3;
                    break;
                case 4:
                    whVar2 = oo.gm(jsonReader, qfVar);
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case 5:
                    qfVar2 = jsonReader.nextInt() == i ? com.bytedance.adsdk.sf.gm.sf.qf.LINEAR : com.bytedance.adsdk.sf.gm.sf.qf.RADIAL;
                    str = str2;
                    ooVar = ooVar2;
                    break;
                case 6:
                    sfVar = oo.pcc(jsonReader, qfVar);
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case '\b':
                    pccVar = lu.pcc.values()[jsonReader.nextInt() - 1];
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case '\t':
                    sfVar2 = lu.sf.values()[jsonReader.nextInt() - 1];
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case '\n':
                    f = (float) jsonReader.nextDouble();
                    str = str2;
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                case 11:
                    str = jsonReader.nextString();
                    ooVar = ooVar2;
                    qfVar2 = qfVar3;
                    break;
                default:
                    jsonReader.skipValue();
                    gmVar = gmVar2;
                    whVar = whVar2;
                    str = str2;
                    ooVar = ooVar2;
                    gmVar2 = gmVar;
                    qfVar2 = qfVar3;
                    whVar2 = whVar;
                    break;
            }
        }
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar3 = ooVar;
        return new com.bytedance.adsdk.sf.gm.sf.wh(str, qfVar2, gmVar2, ooVar3 == null ? new com.bytedance.adsdk.sf.gm.pcc.oo(Collections.singletonList(new com.bytedance.adsdk.sf.qf.pcc(100))) : ooVar3, whVar2, whVar3, sfVar, pccVar, sfVar2, f, arrayList, sfVar3, z);
    }
}
