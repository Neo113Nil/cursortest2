package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class kj {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cb, code lost:
    
        if (r2.equals("gf") == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.bytedance.adsdk.sf.gm.sf.gm pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        com.bytedance.adsdk.sf.gm.sf.gm gmVar;
        String str;
        jsonReader.beginObject();
        char c = 2;
        int i = 2;
        while (true) {
            gmVar = null;
            if (!jsonReader.hasNext()) {
                str = null;
                break;
            }
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals("d")) {
                if (nextName.equals("ty")) {
                    str = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                i = jsonReader.nextInt();
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT)) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals(b.JSON_KEY_SH)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = '\r';
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
                gmVar = wh.pcc(jsonReader, qfVar, i);
                break;
            case 1:
                gmVar = nn.pcc(jsonReader, qfVar);
                break;
            case 2:
                gmVar = dax.pcc(jsonReader, qfVar);
                break;
            case 3:
                gmVar = rnn.pcc(jsonReader, qfVar);
                break;
            case 4:
                gmVar = nac.pcc(jsonReader, qfVar);
                break;
            case 5:
                gmVar = qy.pcc(jsonReader);
                qfVar.pcc("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                gmVar = ye.pcc(jsonReader, qfVar);
                break;
            case 7:
                gmVar = zti.pcc(jsonReader, qfVar);
                break;
            case '\b':
                gmVar = lq.pcc(jsonReader, qfVar);
                break;
            case '\t':
                gmVar = tsx.pcc(jsonReader, qfVar);
                break;
            case '\n':
                gmVar = atb.pcc(jsonReader, qfVar, i);
                break;
            case 11:
                gmVar = kun.pcc(jsonReader, qfVar);
                break;
            case '\f':
                gmVar = rj.pcc(jsonReader, qfVar);
                break;
            case '\r':
                gmVar = gm.pcc(jsonReader, qfVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return gmVar;
    }
}
