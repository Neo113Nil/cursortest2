package com.bytedance.adsdk.sf.vj;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class fum {
    public static <T> List<com.bytedance.adsdk.sf.qf.pcc<T>> pcc(JsonReader jsonReader, com.bytedance.adsdk.sf.qf qfVar, float f, lrr<T> lrrVar, boolean z) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.sf.qf qfVar2;
        float f2;
        lrr<T> lrrVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            qfVar.pcc("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.sf.qf qfVar3 = qfVar;
                    float f3 = f;
                    lrr<T> lrrVar3 = lrrVar;
                    boolean z3 = z;
                    com.bytedance.adsdk.sf.qf.pcc pcc = lo.pcc(jsonReader3, qfVar3, f3, lrrVar3, false, z3);
                    jsonReader2 = jsonReader3;
                    qfVar2 = qfVar3;
                    f2 = f3;
                    lrrVar2 = lrrVar3;
                    z2 = z3;
                    arrayList.add(pcc);
                } else {
                    jsonReader2 = jsonReader;
                    qfVar2 = qfVar;
                    f2 = f;
                    lrrVar2 = lrrVar;
                    z2 = z;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(lo.pcc(jsonReader2, qfVar2, f2, lrrVar2, true, z2));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                qfVar = qfVar2;
                f = f2;
                lrrVar = lrrVar2;
                z = z2;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(lo.pcc(jsonReader4, qfVar, f, lrrVar, false, z));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        pcc(arrayList);
        return arrayList;
    }

    public static <T> void pcc(List<? extends com.bytedance.adsdk.sf.qf.pcc<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar = list.get(i2);
            i2++;
            com.bytedance.adsdk.sf.qf.pcc<T> pccVar2 = list.get(i2);
            pccVar.qf = Float.valueOf(pccVar2.wh);
            if (pccVar.sf == null && (t = pccVar2.pcc) != null) {
                pccVar.sf = t;
                if (pccVar instanceof com.bytedance.adsdk.sf.pcc.sf.vy) {
                    ((com.bytedance.adsdk.sf.pcc.sf.vy) pccVar).pcc();
                }
            }
        }
        com.bytedance.adsdk.sf.qf.pcc<T> pccVar3 = list.get(i);
        if ((pccVar3.pcc == null || pccVar3.sf == null) && list.size() > 1) {
            list.remove(pccVar3);
        }
    }
}
