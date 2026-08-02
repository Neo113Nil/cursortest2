package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2551n extends E5 {
    private final IronSource.a a;
    private final UUID b;
    private final String c;

    public C2551n(IronSource.a adFormat, UUID adId, String adUnitId) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.a = adFormat;
        this.b = adId;
        this.c = adUnitId;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        return a(new C2445h0(this.a, this.b, this.c, null, null, null, 56, null));
    }
}
