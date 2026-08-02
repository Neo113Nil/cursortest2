package com.google.firebase.messaging;

import C.C2702w;
import C2.ExecutorC2715j;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes.dex */
final class F {
    public static void a(Context context, boolean z11) {
        C2702w.e(b(context), "proxy_retention", z11);
    }

    private static SharedPreferences b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    static boolean c(Context context) {
        return b(context).getBoolean("proxy_notification_initialized", false);
    }

    static void d(Context context) {
        C2702w.e(b(context), "proxy_notification_initialized", true);
    }

    static void e(final Context context, C5941w c5941w, final boolean z11) {
        if (PlatformVersion.isAtLeastQ()) {
            SharedPreferences b11 = b(context);
            if (b11.contains("proxy_retention") && b11.getBoolean("proxy_retention", false) == z11) {
                return;
            }
            c5941w.d(z11).addOnSuccessListener(new ExecutorC2715j(), new OnSuccessListener() { // from class: com.google.firebase.messaging.E
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    F.a(context, z11);
                }
            });
        }
    }
}
