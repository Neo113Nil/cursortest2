package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ea.C4189a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f38001a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f38002b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C4189a f38003c;

    public static void b(Context context) {
        if (f38003c == null) {
            C4189a c4189a = new C4189a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f38003c = c4189a;
            c4189a.d(true);
        }
    }

    public static void c(Intent intent) {
        synchronized (f38002b) {
            try {
                if (f38003c != null && d(intent)) {
                    f(intent, false);
                    f38003c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void e(Context context, r0 r0Var, final Intent intent) {
        synchronized (f38002b) {
            try {
                b(context);
                boolean d10 = d(intent);
                f(intent, true);
                if (!d10) {
                    f38003c.a(f38001a);
                }
                r0Var.d(intent).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.messaging.l0
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        m0.c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(Intent intent, boolean z10) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z10);
    }

    public static ComponentName g(Context context, Intent intent) {
        synchronized (f38002b) {
            try {
                b(context);
                boolean d10 = d(intent);
                f(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d10) {
                    f38003c.a(f38001a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
