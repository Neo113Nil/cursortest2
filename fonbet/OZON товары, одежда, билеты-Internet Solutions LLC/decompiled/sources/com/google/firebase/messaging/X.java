package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    static final long f59673a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f59674b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static WakeLock f59675c;

    static void a(@NonNull Intent intent) {
        synchronized (f59674b) {
            try {
                if (f59675c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f59675c.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"TaskMainThread"})
    static void b(Context context, c0 c0Var, final Intent intent) {
        synchronized (f59674b) {
            try {
                if (f59675c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f59675c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f59675c.acquire(f59673a);
                }
                c0Var.b(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.W
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        X.a(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static ComponentName c(@NonNull Context context, @NonNull Intent intent) {
        synchronized (f59674b) {
            try {
                if (f59675c == null) {
                    WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                    f59675c = wakeLock;
                    wakeLock.setReferenceCounted(true);
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f59675c.acquire(f59673a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
