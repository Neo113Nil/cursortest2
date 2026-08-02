package com.bytedance.adsdk.sf.vj;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static com.bytedance.adsdk.sf.gm.pcc.vj pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(jsj.pcc(jsonReader, qfVar));
            }
            jsonReader.endArray();
            fum.pcc(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.sf.qf.pcc(gpj.sf(jsonReader, com.bytedance.adsdk.sf.wh.wh.pcc())));
        }
        return new com.bytedance.adsdk.sf.gm.pcc.vj(arrayList);
    }

    public static com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> sf(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.sf.gm.pcc.vj vjVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar = null;
        com.bytedance.adsdk.sf.gm.pcc.sf sfVar2 = null;
        boolean z = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName) {
                case "k":
                    vjVar = pcc(jsonReader, qfVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        sfVar = oo.pcc(jsonReader, qfVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        sfVar2 = oo.pcc(jsonReader, qfVar);
                        break;
                    } else {
                        z = true;
                        jsonReader.skipValue();
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            qfVar.pcc("Lottie doesn't support expressions.");
        }
        return vjVar != null ? vjVar : new com.bytedance.adsdk.sf.gm.pcc.vy(sfVar, sfVar2);
    }
}
