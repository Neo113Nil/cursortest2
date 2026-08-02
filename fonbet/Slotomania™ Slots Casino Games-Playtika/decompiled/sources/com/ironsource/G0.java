package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class G0 {
    private final EnumC2567nf a;
    private final String b;
    private final String c;
    private final R7 d;
    private final String e;

    public G0(EnumC2567nf recordType, String advertiserBundleId, String networkInstanceId, R7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        Intrinsics.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = advertiserBundleId;
        this.c = networkInstanceId;
        this.d = adProvider;
        this.e = adInstanceId;
    }

    public final String a() {
        return this.e;
    }

    public final R7 b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final EnumC2567nf e() {
        return this.a;
    }

    public final C2618qc a(Ib<G0, C2618qc> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
