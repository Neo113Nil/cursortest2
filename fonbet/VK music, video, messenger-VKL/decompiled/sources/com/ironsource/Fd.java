package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.j9x;
import xsna.k9x;
import xsna.on00;
import xsna.swe0;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class Fd {
    private final Map<LevelPlay.AdFormat, a> a;

    public static final class a {
        public static final C0199a c = new C0199a(null);
        private static final String d = "adUnitId";
        private static final String e = "instances";
        private final Map<String, b> a;
        private final List<c> b;

        /* renamed from: com.ironsource.Fd$a$a, reason: collision with other inner class name */
        public static final class C0199a {
            public /* synthetic */ C0199a(zcl zclVar) {
                this();
            }

            private C0199a() {
            }
        }

        public a(JSONObject jSONObject) {
            Iterable b = C4369ia.b(jSONObject.names());
            b = b == null ? EmptyList.b : b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : b) {
                if (!epx.f((String) obj, "preload")) {
                    arrayList.add(obj);
                }
            }
            int e2 = on00.e(c5g.u(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(e2 < 16 ? 16 : e2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                JSONArray optJSONArray = jSONObject.optJSONArray((String) next);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                linkedHashMap.put(next, new b(optJSONArray));
            }
            this.a = linkedHashMap;
            this.b = b(jSONObject);
        }

        public final Map<String, b> a() {
            return this.a;
        }

        public final List<c> b() {
            return this.b;
        }

        private final c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.has("adUnitId") ? jSONObject.optString("adUnitId") : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("instances");
            return new c(optString, optJSONArray != null ? C4369ia.b(optJSONArray) : null);
        }

        private final List<c> b(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("preload");
            if (optJSONArray == null) {
                return EmptyList.b;
            }
            k9x q = swe0.q(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            j9x it = q.iterator();
            while (it.d) {
                c a = a(optJSONArray.optJSONObject(it.nextInt()));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }
    }

    public static final class b {
        private final List<String> a;

        public b(JSONArray jSONArray) {
            this.a = C4369ia.b(jSONArray);
        }

        public final List<String> a() {
            return this.a;
        }
    }

    public static final class c {
        private final String a;
        private final List<String> b;

        public c(String str, List<String> list) {
            this.a = str;
            this.b = list;
        }

        public final String a() {
            return this.a;
        }

        public final List<String> b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public final List<String> d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "AdUnitPreloadConfig(adUnitId=" + this.a + ", instanceIds=" + this.b + ")";
        }

        public final c a(String str, List<String> list) {
            return new c(str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c a(c cVar, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.a;
            }
            if ((i & 2) != 0) {
                list = cVar.b;
            }
            return cVar.a(str, list);
        }
    }

    public Fd(JSONObject jSONObject) {
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        int e = on00.e(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = jSONObject.optJSONObject(If.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new a(optJSONObject));
        }
        this.a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, a> a() {
        return this.a;
    }

    public final List<c> a(LevelPlay.AdFormat adFormat) {
        List<c> b2;
        a aVar = this.a.get(adFormat);
        return (aVar == null || (b2 = aVar.b()) == null) ? EmptyList.b : b2;
    }
}
