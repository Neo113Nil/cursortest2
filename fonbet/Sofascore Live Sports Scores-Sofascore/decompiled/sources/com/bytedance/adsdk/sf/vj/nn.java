package com.bytedance.adsdk.sf.vj;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class nn {
    public static com.bytedance.adsdk.sf.gm.sf.jr pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        com.bytedance.adsdk.sf.gm.pcc.oo ooVar = null;
        String str = null;
        com.bytedance.adsdk.sf.gm.pcc.pcc pccVar = null;
        boolean z = false;
        boolean z2 = false;
        int i = 1;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "fillEnabled":
                    z = jsonReader.nextBoolean();
                    break;
                case "c":
                    pccVar = oo.qf(jsonReader, qfVar);
                    break;
                case "o":
                    ooVar = oo.sf(jsonReader, qfVar);
                    break;
                case "r":
                    i = jsonReader.nextInt();
                    break;
                case "hd":
                    z2 = jsonReader.nextBoolean();
                    break;
                case "nm":
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
        return new com.bytedance.adsdk.sf.gm.sf.jr(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, pccVar, ooVar, z2);
    }
}
