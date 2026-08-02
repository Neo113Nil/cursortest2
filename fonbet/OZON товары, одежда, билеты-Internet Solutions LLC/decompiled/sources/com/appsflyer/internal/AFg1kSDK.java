package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final class AFg1kSDK {
    public static boolean AFInAppEventType(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
