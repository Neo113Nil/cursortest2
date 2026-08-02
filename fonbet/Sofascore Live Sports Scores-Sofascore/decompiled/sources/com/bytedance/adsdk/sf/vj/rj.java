package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class rj {
    public static com.bytedance.adsdk.sf.gm.sf.gpj pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        String str = null;
        gpj.pcc pccVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "e":
                    sfVar2 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "m":
                    pccVar = gpj.pcc.pcc(jsonReader.nextInt());
                    break;
                case "o":
                    sfVar3 = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "s":
                    sfVar = oo.pcc(jsonReader, qfVar, false);
                    break;
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.gpj(str, pccVar, sfVar, sfVar2, sfVar3, z);
    }
}
