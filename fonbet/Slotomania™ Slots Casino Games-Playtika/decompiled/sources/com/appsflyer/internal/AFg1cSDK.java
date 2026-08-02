package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFg1cSDK extends AFg1gSDK {
    private final AFc1fSDK getCurrencyIso4217Code;
    private final boolean getMonetizationNetwork;

    public AFg1cSDK(AFc1fSDK aFc1fSDK) {
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        this.getCurrencyIso4217Code = aFc1fSDK;
        this.getMonetizationNetwork = true;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final boolean getShouldExtendMsg() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void d(AFh1zSDK aFh1zSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork("D", getMonetizationNetwork(str, aFh1zSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void e(AFh1zSDK aFh1zSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z4) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork(ExifInterface.LONGITUDE_EAST, getMonetizationNetwork(str, aFh1zSDK));
        }
        if (z4) {
            this.getCurrencyIso4217Code.copy().AFAdRevenueData(th);
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void i(AFh1zSDK aFh1zSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork("I", getMonetizationNetwork(str, aFh1zSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void w(AFh1zSDK aFh1zSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork(ExifInterface.LONGITUDE_WEST, getMonetizationNetwork(str, aFh1zSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void v(AFh1zSDK aFh1zSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getCurrencyIso4217Code.copy().getMonetizationNetwork(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, getMonetizationNetwork(str, aFh1zSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1gSDK
    public final void force(AFh1zSDK aFh1zSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1zSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code.copy().getMonetizationNetwork("F", getMonetizationNetwork(str, aFh1zSDK));
    }
}
