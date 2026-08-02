package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import com.bytedance.adsdk.sf.gm.sf.vy;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class qy {
    public static com.bytedance.adsdk.sf.gm.sf.vy pcc(JsonReader jsonReader) throws IOException {
        String str = null;
        vy.pcc pccVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "mm":
                    pccVar = vy.pcc.pcc(jsonReader.nextInt());
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.sf.gm.sf.vy(str, pccVar, z);
    }
}
