package com.vk.dto.hints;

import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.jgp;
import xsna.zcl;

/* compiled from: Hint.kt */
/* loaded from: classes18.dex */
public final class Hint extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Hint> CREATOR = new b();
    public final String b;
    public final String c;
    public final String d;
    public final Map<String, String> e;

    /* compiled from: Hint.kt */
    public static final class a {
        public static Hint a(JSONObject jSONObject) {
            HashMap hashMap;
            try {
                if (jSONObject.has("resources")) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray("resources");
                        hashMap = new HashMap();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String A = f370.A("key", jSONObject2);
                            String A2 = f370.A("value", jSONObject2);
                            if (A != null && A2 != null) {
                                hashMap.put(A, A2);
                            }
                        }
                    } catch (Exception e) {
                        L.E(e, new Object[0]);
                    }
                    return new Hint(jSONObject.getString("id"), jSONObject.optString("title"), jSONObject.optString("description"), hashMap);
                }
                hashMap = null;
                return new Hint(jSONObject.getString("id"), jSONObject.optString("title"), jSONObject.optString("description"), hashMap);
            } catch (Exception e2) {
                L.E(e2, new Object[0]);
                return null;
            }
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Hint> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Hint a(Serializer serializer) {
            Map map;
            String H = serializer.H();
            String H2 = serializer.H();
            String H3 = serializer.H();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H4 = serializer.H();
                        String H5 = serializer.H();
                        if (H4 != null && H5 != null) {
                            map.put(H4, H5);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                return new Hint(H, H2, H3, (HashMap) map);
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Hint[i];
        }
    }

    public /* synthetic */ Hint(String str, String str2, String str3, Map map, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : map);
    }

    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.b);
        jSONObject.put("title", this.c);
        jSONObject.put("description", this.d);
        Map<String, String> map = this.e;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("key", key);
                jSONObject2.put("value", value);
                arrayList.add(jSONObject2);
            }
            jSONObject.put("resources", new JSONArray((Collection) arrayList));
        }
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        Map<String, String> map = this.e;
        if (map != null) {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.j0((String) entry.getKey());
                serializer.j0((String) entry.getValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        Hint hint = obj instanceof Hint ? (Hint) obj : null;
        return epx.f(this.b, hint != null ? hint.b : null);
    }

    public final String getDescription() {
        return this.d;
    }

    public final String getId() {
        return this.b;
    }

    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Map<String, String> zb() {
        return this.e;
    }

    public Hint(String str, String str2, String str3, Map<String, String> map) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = map;
    }
}
