package com.vk.dto.account;

import com.vk.dto.account.Experiment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.j9x;
import xsna.swe0;

/* compiled from: Experiments.kt */
/* loaded from: classes18.dex */
public final class a implements bxx {
    public final List<Experiment> b;

    /* compiled from: Experiments.kt */
    /* renamed from: com.vk.dto.account.a$a, reason: collision with other inner class name */
    public static final class C0901a {
        public static a a(JSONArray jSONArray, boolean z) {
            Experiment.Type type;
            Experiment.Type type2;
            if (jSONArray == null) {
                return new a(EmptyList.b);
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            j9x it = swe0.q(0, jSONArray.length()).iterator();
            while (it.d) {
                JSONObject jSONObject = jSONArray.getJSONObject(it.nextInt());
                String optString = jSONObject.optString("name");
                if (optString == null) {
                    optString = "";
                }
                String optString2 = jSONObject.optString("value");
                if (z) {
                    Experiment.Type[] values = Experiment.Type.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            type2 = null;
                            break;
                        }
                        type2 = values[i];
                        if (epx.f(type2.h(), optString)) {
                            break;
                        }
                        i++;
                    }
                    if (type2 == null) {
                        type2 = Experiment.Type.UNKNOWN;
                    }
                } else {
                    try {
                        type = Experiment.Type.valueOf(optString.toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException unused) {
                        type = Experiment.Type.UNKNOWN;
                    }
                    type2 = type;
                }
                Experiment experiment = new Experiment(type2, optString2);
                if (type2 != Experiment.Type.UNKNOWN) {
                    arrayList.add(experiment);
                }
            }
            return new a(arrayList);
        }

        public static a b(JSONObject jSONObject) {
            return a(jSONObject != null ? jSONObject.optJSONArray("array") : null, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends Experiment> list) {
        this.b = list;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONArray = new JSONArray();
            for (Experiment experiment : this.b) {
                experiment.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("name", experiment.a.name());
                    jSONObject.put("value", experiment.b);
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused2) {
            jSONArray = new JSONArray();
        }
        return jSONObject2.put("array", jSONArray);
    }
}
