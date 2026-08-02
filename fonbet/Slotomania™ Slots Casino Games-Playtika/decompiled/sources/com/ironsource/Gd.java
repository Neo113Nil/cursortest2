package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class Gd {
    private final Map<String, List<String>> a;
    private final Map<String, List<String>> b;
    private final Map<String, List<String>> c;
    private final Map<String, List<String>> d;

    public Gd() {
        this(null, null, null, null, 15, null);
    }

    public final Map<String, List<String>> a() {
        return this.a;
    }

    public final Map<String, List<String>> b() {
        return this.b;
    }

    public final Map<String, List<String>> c() {
        return this.c;
    }

    public final Map<String, List<String>> d() {
        return this.d;
    }

    public final Map<String, List<String>> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gd)) {
            return false;
        }
        Gd gd = (Gd) obj;
        return Intrinsics.areEqual(this.a, gd.a) && Intrinsics.areEqual(this.b, gd.b) && Intrinsics.areEqual(this.c, gd.c) && Intrinsics.areEqual(this.d, gd.d);
    }

    public final Map<String, List<String>> f() {
        return this.b;
    }

    public final Map<String, List<String>> g() {
        return this.d;
    }

    public final Map<String, List<String>> h() {
        return this.a;
    }

    public int hashCode() {
        Map<String, List<String>> map = this.a;
        int hashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, List<String>> map2 = this.b;
        int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, List<String>> map3 = this.c;
        int hashCode3 = (hashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, List<String>> map4 = this.d;
        return hashCode3 + (map4 != null ? map4.hashCode() : 0);
    }

    public String toString() {
        return "ProviderOrder2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Gd(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public final Gd a(Map<String, ? extends List<String>> map, Map<String, ? extends List<String>> map2, Map<String, ? extends List<String>> map3, Map<String, ? extends List<String>> map4) {
        return new Gd(map, map2, map3, map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Gd a(Gd gd, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = gd.a;
        }
        if ((i & 2) != 0) {
            map2 = gd.b;
        }
        if ((i & 4) != 0) {
            map3 = gd.c;
        }
        if ((i & 8) != 0) {
            map4 = gd.d;
        }
        return gd.a(map, map2, map3, map4);
    }

    public /* synthetic */ Gd(Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4);
    }
}
