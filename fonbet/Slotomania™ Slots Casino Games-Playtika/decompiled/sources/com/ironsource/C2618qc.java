package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.qc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2618qc {
    private final EnumC2567nf a;
    private final String b;
    private final R7 c;
    private final String d;

    public C2618qc(EnumC2567nf recordType, String advertiserBundleId, R7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = adProvider;
        this.d = adInstanceId;
    }

    public final String a() {
        return this.d;
    }

    public final R7 b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final EnumC2567nf d() {
        return this.a;
    }

    public final C2464i1 a(Ib<C2618qc, C2464i1> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
