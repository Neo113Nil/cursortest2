package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class AFk1wSDK {
    public String AFAdRevenueData;
    public final WeakReference<Context> getMonetizationNetwork;

    public AFk1wSDK(Context context) {
        this.getMonetizationNetwork = new WeakReference<>(context);
    }
}
