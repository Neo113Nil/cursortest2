package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import defpackage.k13;
import defpackage.km5;
import defpackage.llf;
import defpackage.sub;
import defpackage.v6a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ed {

    @NotNull
    private final Map<LevelPlay.AdFormat, a> a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {

        @NotNull
        private final List<String> a;

        public b(@NotNull JSONArray jSONArray) {
            jSONArray.getClass();
            List<String> b = C4110ha.b(jSONArray);
            b.getClass();
            this.a = b;
        }

        @NotNull
        public final List<String> a() {
            return this.a;
        }
    }

    public Ed(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        LevelPlay.AdFormat[] values = LevelPlay.AdFormat.values();
        int c2 = sub.c(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2 < 16 ? 16 : c2);
        for (LevelPlay.AdFormat adFormat : values) {
            JSONObject optJSONObject = jSONObject.optJSONObject(Gf.a(adFormat));
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            linkedHashMap.put(adFormat, new a(optJSONObject));
        }
        this.a = linkedHashMap;
    }

    @NotNull
    public final List<c> a(@NotNull LevelPlay.AdFormat adFormat) {
        List<c> b2;
        adFormat.getClass();
        a aVar = this.a.get(adFormat);
        return (aVar == null || (b2 = aVar.b()) == null) ? km5.a : b2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final C0182a c = new C0182a(null);

        @NotNull
        private static final String d = "adUnitId";

        @NotNull
        private static final String e = "instances";

        @NotNull
        private final Map<String, b> a;

        @NotNull
        private final List<c> b;

        public a(@NotNull JSONObject jSONObject) {
            jSONObject.getClass();
            Iterable b = C4110ha.b(jSONObject.names());
            b = b == null ? km5.a : b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : b) {
                if (!Intrinsics.c((String) obj, "preload")) {
                    arrayList.add(obj);
                }
            }
            int c2 = sub.c(k13.r(arrayList, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(c2 < 16 ? 16 : c2);
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

        private final c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.has("adUnitId") ? jSONObject.optString("adUnitId") : null;
            JSONArray optJSONArray = jSONObject.optJSONArray("instances");
            return new c(optString, optJSONArray != null ? C4110ha.b(optJSONArray) : null);
        }

        private final List<c> b(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("preload");
            if (optJSONArray == null) {
                return km5.a;
            }
            IntRange j = llf.j(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            v6a it = j.iterator();
            while (it.c) {
                c a = a(optJSONArray.optJSONObject(it.nextInt()));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            return arrayList;
        }

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        /* renamed from: com.ironsource.Ed$a$a, reason: collision with other inner class name */
        public static final class C0182a {
            public /* synthetic */ C0182a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0182a() {
            }
        }

        @NotNull
        public final Map<String, b> a() {
            return this.a;
        }

        @NotNull
        public final List<c> b() {
            return this.b;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c {

        @Nullable
        private final String a;

        @Nullable
        private final List<String> b;

        public c(@Nullable String str, @Nullable List<String> list) {
            this.a = str;
            this.b = list;
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

        @Nullable
        public final List<String> b() {
            return this.b;
        }

        @Nullable
        public final String c() {
            return this.a;
        }

        @Nullable
        public final List<String> d() {
            return this.b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.c(this.a, cVar.a) && Intrinsics.c(this.b, cVar.b);
        }

        public int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.b;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AdUnitPreloadConfig(adUnitId=" + this.a + ", instanceIds=" + this.b + ")";
        }

        @NotNull
        public final c a(@Nullable String str, @Nullable List<String> list) {
            return new c(str, list);
        }

        @Nullable
        public final String a() {
            return this.a;
        }
    }

    @NotNull
    public final Map<LevelPlay.AdFormat, a> a() {
        return this.a;
    }
}
