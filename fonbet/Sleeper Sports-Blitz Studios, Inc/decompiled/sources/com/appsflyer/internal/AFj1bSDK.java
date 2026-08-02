package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class AFj1bSDK {
    public String getMediationNetwork;
    public final WeakReference<Context> getRevenue;

    public AFj1bSDK(Context context) {
        this.getRevenue = new WeakReference<>(context);
    }
}
