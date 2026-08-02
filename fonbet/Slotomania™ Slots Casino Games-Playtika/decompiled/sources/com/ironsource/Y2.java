package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Y2 extends C2565nd {
    private final C2588p0 b;
    private final ISBannerSize c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y2(C2588p0 adTools, ISBannerSize size, String placement) {
        super(placement);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.b = adTools;
        this.c = size;
    }

    @Override // com.ironsource.C2565nd, com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        Map<String, Object> mutableMap = MapsKt.toMutableMap(super.a(c0));
        this.b.a(mutableMap, this.c);
        return mutableMap;
    }
}
