package com.vk.push.core.utils;

import android.app.NotificationManager;
import android.content.Context;
import xsna.epx;

/* compiled from: ContextExtensions.kt */
/* loaded from: classes5.dex */
public final class ContextExtensionsKt {
    public static final boolean areNotificationsEnabled(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            return notificationManager.areNotificationsEnabled();
        }
        return false;
    }

    public static final <T> void setComponentEnabled(Context context, boolean z) {
        try {
            if (z) {
                context.getPackageManager();
                epx.k();
                throw null;
            }
            context.getPackageManager();
            epx.k();
            throw null;
        } catch (RuntimeException unused) {
        }
    }
}
