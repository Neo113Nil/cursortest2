package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* loaded from: classes.dex */
final class D {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void a(final Context context) {
        final boolean z11;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (F.c(context)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z11 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            if (PlatformVersion.isAtLeastQ()) {
                Tasks.forResult(null);
                return;
            }
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            new Runnable() { // from class: com.google.firebase.messaging.C
                @Override // java.lang.Runnable
                public final void run() {
                    String notificationDelegate;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    Context context2 = context;
                    try {
                        if (Binder.getCallingUid() != context2.getApplicationInfo().uid) {
                            Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                            taskCompletionSource2.trySetResult(null);
                            return;
                        }
                        F.d(context2);
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        if (z11) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                        taskCompletionSource2.trySetResult(null);
                    } catch (Throwable th2) {
                        taskCompletionSource2.trySetResult(null);
                        throw th2;
                    }
                }
            }.run();
            taskCompletionSource.getTask();
            return;
        }
        z11 = true;
        if (PlatformVersion.isAtLeastQ()) {
        }
    }
}
