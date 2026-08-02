package com.appsflyer.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFh1oSDK extends AFh1wSDK {
    private final boolean getCurrencyIso4217Code;
    private final AFd1kSDK getRevenue;

    public AFh1oSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.getRevenue = aFd1kSDK;
        this.getCurrencyIso4217Code = true;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final boolean getShouldExtendMsg() {
        return this.getCurrencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void d(AFh1xSDK aFh1xSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getRevenue.equals().AFAdRevenueData("D", AFAdRevenueData(str, aFh1xSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void e(AFh1xSDK aFh1xSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z4) {
            this.getRevenue.equals().AFAdRevenueData(ExifInterface.LONGITUDE_EAST, AFAdRevenueData(str, aFh1xSDK));
        }
        if (z4) {
            this.getRevenue.equals().getCurrencyIso4217Code(th);
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void i(AFh1xSDK aFh1xSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getRevenue.equals().AFAdRevenueData("I", AFAdRevenueData(str, aFh1xSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void w(AFh1xSDK aFh1xSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getRevenue.equals().AFAdRevenueData(ExifInterface.LONGITUDE_WEST, AFAdRevenueData(str, aFh1xSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void v(AFh1xSDK aFh1xSDK, String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.getRevenue.equals().AFAdRevenueData(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, AFAdRevenueData(str, aFh1xSDK));
        }
    }

    @Override // com.appsflyer.internal.AFh1wSDK
    public final void force(AFh1xSDK aFh1xSDK, String str) {
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue.equals().AFAdRevenueData("F", AFAdRevenueData(str, aFh1xSDK));
    }
}
