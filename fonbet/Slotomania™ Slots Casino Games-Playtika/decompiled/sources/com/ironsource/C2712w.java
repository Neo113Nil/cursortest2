package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2712w {
    private final EnumC2567nf a;
    private final String b;
    private final String c;
    private final String d;
    private final R7 e;
    private final String f;

    public C2712w(EnumC2567nf recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, R7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adUnitId;
        this.e = adProvider;
        this.f = adInstanceId;
    }

    public final String a() {
        return this.f;
    }

    public final R7 b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final EnumC2567nf f() {
        return this.a;
    }

    public final G0 a(Ib<C2712w, G0> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
