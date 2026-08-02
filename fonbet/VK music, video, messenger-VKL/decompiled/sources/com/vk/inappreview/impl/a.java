package com.vk.inappreview.impl;

import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.brw;
import xsna.cq;
import xsna.cqf;
import xsna.epx;
import xsna.fsk;
import xsna.j9k;
import xsna.mnh0;
import xsna.n1d;
import xsna.pyw;
import xsna.r100;
import xsna.ttp0;
import xsna.upj;

/* compiled from: InAppReviewConditionManagerInitializer.kt */
/* loaded from: classes2.dex */
public final class a {
    public static void a(JSONObject jSONObject, pyw pywVar, boolean z, long j) {
        InAppReviewConditionKey inAppReviewConditionKey;
        InAppReviewConditionGroup inAppReviewConditionGroup;
        if (!(pywVar.a() || pywVar.b() || pywVar.c())) {
            L.e("InAppReview", "Can't init real condition manager: in app review not available");
            return;
        }
        if (z) {
            L.e("InAppReview", "Can't init real condition manager: device had crash or ANR in previous session");
            return;
        }
        long optLong = jSONObject.optLong("review_interval", brw.j);
        long optLong2 = jSONObject.optLong("fake_review_interval", brw.k);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("conditions");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject2.getString(next);
                InAppReviewConditionKey.Companion.getClass();
                InAppReviewConditionKey[] values = InAppReviewConditionKey.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        inAppReviewConditionKey = null;
                        break;
                    }
                    InAppReviewConditionKey inAppReviewConditionKey2 = values[i];
                    if (epx.f(inAppReviewConditionKey2.h(), next)) {
                        inAppReviewConditionKey = inAppReviewConditionKey2;
                        break;
                    }
                    i++;
                }
                InAppReviewConditionGroup.Companion.getClass();
                InAppReviewConditionGroup[] values2 = InAppReviewConditionGroup.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        inAppReviewConditionGroup = null;
                        break;
                    }
                    InAppReviewConditionGroup inAppReviewConditionGroup2 = values2[i2];
                    if (epx.f(inAppReviewConditionGroup2.h(), string)) {
                        inAppReviewConditionGroup = inAppReviewConditionGroup2;
                        break;
                    }
                    i2++;
                }
                if (inAppReviewConditionKey != null && inAppReviewConditionGroup != null) {
                    linkedHashMap.put(inAppReviewConditionKey, inAppReviewConditionGroup);
                }
            }
        } catch (Throwable th) {
            L.l("InAppReview", cq.c("Can't parse config json: ", jSONObject), mnh0.A(new r100.a("InAppReviewException", th)));
        }
        if (linkedHashMap.isEmpty()) {
            L.e("InAppReview", cq.c("Config with empty conditions: ", jSONObject));
            return;
        }
        brw brwVar = new brw(optLong, optLong2, j);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            InAppReviewConditionKey inAppReviewConditionKey3 = (InAppReviewConditionKey) entry.getKey();
            InAppReviewConditionGroup inAppReviewConditionGroup3 = (InAppReviewConditionGroup) entry.getValue();
            brw.a aVar = new brw.a(inAppReviewConditionGroup3);
            brwVar.f.put(inAppReviewConditionKey3, aVar);
            if (inAppReviewConditionGroup3 != InAppReviewConditionGroup.DEFAULT) {
                LinkedHashMap linkedHashMap2 = brwVar.e;
                Object obj = linkedHashMap2.get(inAppReviewConditionGroup3);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap2.put(inAppReviewConditionGroup3, obj);
                }
                ttp0.b((List) obj).add(aVar);
            }
        }
        if (pywVar.c()) {
            L.e("InAppReview", "Use RuStore in-app review manager.");
            upj.c = new cqf(brwVar, 26);
        } else if (pywVar.b()) {
            L.e("InAppReview", "Use Huawei in-app review manager.");
            upj.c = new j9k(brwVar, 22);
        } else if (pywVar.a()) {
            L.e("InAppReview", "Use Google in-app review manager.");
            upj.c = new n1d(brwVar, 24);
        }
        fsk.c = brwVar;
    }
}
