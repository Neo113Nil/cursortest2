package com.ironsource;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Fd {

    @Nullable
    private final Map<String, List<String>> a;

    @Nullable
    private final Map<String, List<String>> b;

    @Nullable
    private final Map<String, List<String>> c;

    @Nullable
    private final Map<String, List<String>> d;

    public /* synthetic */ Fd(Map map, Map map2, Map map3, Map map4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, (i & 4) != 0 ? null : map3, (i & 8) != 0 ? null : map4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fd a(Fd fd, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 1) != 0) {
            map = fd.a;
        }
        if ((i & 2) != 0) {
            map2 = fd.b;
        }
        if ((i & 4) != 0) {
            map3 = fd.c;
        }
        if ((i & 8) != 0) {
            map4 = fd.d;
        }
        return fd.a(map, map2, map3, map4);
    }

    @Nullable
    public final Map<String, List<String>> b() {
        return this.b;
    }

    @Nullable
    public final Map<String, List<String>> c() {
        return this.c;
    }

    @Nullable
    public final Map<String, List<String>> d() {
        return this.d;
    }

    @Nullable
    public final Map<String, List<String>> e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fd)) {
            return false;
        }
        Fd fd = (Fd) obj;
        return Intrinsics.c(this.a, fd.a) && Intrinsics.c(this.b, fd.b) && Intrinsics.c(this.c, fd.c) && Intrinsics.c(this.d, fd.d);
    }

    @Nullable
    public final Map<String, List<String>> f() {
        return this.b;
    }

    @Nullable
    public final Map<String, List<String>> g() {
        return this.d;
    }

    @Nullable
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

    @NotNull
    public String toString() {
        return "ProviderOrder2(rewarded=" + this.a + ", interstitial=" + this.b + ", banner=" + this.c + ", nativeAd=" + this.d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Fd(@Nullable Map<String, ? extends List<String>> map, @Nullable Map<String, ? extends List<String>> map2, @Nullable Map<String, ? extends List<String>> map3, @Nullable Map<String, ? extends List<String>> map4) {
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    @NotNull
    public final Fd a(@Nullable Map<String, ? extends List<String>> map, @Nullable Map<String, ? extends List<String>> map2, @Nullable Map<String, ? extends List<String>> map3, @Nullable Map<String, ? extends List<String>> map4) {
        return new Fd(map, map2, map3, map4);
    }

    public Fd() {
        this(null, null, null, null, 15, null);
    }

    @Nullable
    public final Map<String, List<String>> a() {
        return this.a;
    }
}
