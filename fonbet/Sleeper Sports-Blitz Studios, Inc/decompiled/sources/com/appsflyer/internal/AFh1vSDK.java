package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class AFh1vSDK extends AFh1wSDK {
    private final AFd1kSDK getCurrencyIso4217Code;

    public AFh1vSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getCurrencyIso4217Code = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void e(AFh1xSDK aFh1xSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z3) {
            if (StringsKt.isBlank(str)) {
                str = "missing label";
            }
            this.getCurrencyIso4217Code.afWarnLog().getMediationNetwork(th, withTag$SDK_prodRelease(str, aFh1xSDK));
        }
    }
}
