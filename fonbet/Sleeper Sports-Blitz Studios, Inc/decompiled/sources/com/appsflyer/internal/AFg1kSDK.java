package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;

/* loaded from: classes6.dex */
public final class AFg1kSDK extends AFa1mSDK {
    @Override // com.appsflyer.internal.AFa1mSDK
    public final boolean component2() {
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFg1kSDK(Context context) {
        super("Register", r0.toString(), Boolean.FALSE);
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFg1lSDK.getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFb1rSDK.getRevenue().getHostName()));
        sb.append(context.getPackageName());
    }

    @Override // com.appsflyer.internal.AFa1mSDK
    public final AFf1wSDK AFAdRevenueData() {
        return AFf1wSDK.REGISTER;
    }
}
