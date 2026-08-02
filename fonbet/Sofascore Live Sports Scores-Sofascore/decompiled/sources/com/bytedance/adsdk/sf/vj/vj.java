package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class vj {
    public static com.bytedance.adsdk.sf.gm.sf.pcc pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        com.bytedance.adsdk.sf.gm.sf.pcc pccVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.sf.gm.sf.pcc sf = sf(jsonReader, qfVar);
                    if (sf != null) {
                        pccVar = sf;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return pccVar;
    }

    private static com.bytedance.adsdk.sf.gm.sf.pcc sf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.sf.gm.sf.pcc pccVar = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.getClass();
                if (nextName.equals("v")) {
                    if (z) {
                        pccVar = new com.bytedance.adsdk.sf.gm.sf.pcc(oo.pcc(jsonReader, qfVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!nextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z = true;
                }
            }
            jsonReader.endObject();
            return pccVar;
        }
    }
}
