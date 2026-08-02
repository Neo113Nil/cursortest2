package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class AFg1fSDK extends AFg1gSDK {
    private final AFc1fSDK getRevenue;

    public AFg1fSDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.getRevenue = aFc1fSDK;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z3) {
            if (StringsKt.isBlank(str)) {
                str = "missing label";
            }
            this.getRevenue.afRDLog().getRevenue(th, withTag$SDK_prodRelease(str, aFh1zSDK));
        }
    }
}
