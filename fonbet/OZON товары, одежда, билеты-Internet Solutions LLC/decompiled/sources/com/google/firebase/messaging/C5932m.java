package com.google.firebase.messaging;

import B0.A0;
import C2.ExecutorC2715j;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

@KeepForSdk
/* renamed from: com.google.firebase.messaging.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5932m {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f59726c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static c0 f59727d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f59728a;

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorC2715j f59729b = new ExecutorC2715j();

    public C5932m(Context context) {
        this.f59728a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z11, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? b(context, intent, z11).continueWith(new ExecutorC5927h(), new Nh.b()) : task;
    }

    private static Task<Integer> b(Context context, Intent intent, boolean z11) {
        c0 c0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f59726c) {
            try {
                if (f59727d == null) {
                    f59727d = new c0(context);
                }
                c0Var = f59727d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            return c0Var.b(intent).continueWith(new ExecutorC2715j(), new A0(5));
        }
        if (L.a().d(context)) {
            X.b(context, c0Var, intent);
        } else {
            c0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    @KeepForSdk
    public final Task<Integer> c(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        boolean isAtLeastO = PlatformVersion.isAtLeastO();
        final Context context = this.f59728a;
        boolean z11 = isAtLeastO && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z12 = (intent.getFlags() & 268435456) != 0;
        if (z11 && !z12) {
            return b(context, intent, z12);
        }
        ExecutorC2715j executorC2715j = this.f59729b;
        return Tasks.call(executorC2715j, new Callable() { // from class: com.google.firebase.messaging.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(L.a().e(context, intent));
            }
        }).continueWithTask(executorC2715j, new Continuation() { // from class: com.google.firebase.messaging.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C5932m.a(context, intent, z12, task);
            }
        });
    }
}
