package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6154c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static k0 f6155d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f6156a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6157b;

    public l(ExecutorService executorService) {
        this.f6157b = new s.e(0);
        this.f6156a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z5) {
        k0 k0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f6154c) {
            try {
                if (f6155d == null) {
                    f6155d = new k0(context);
                }
                k0Var = f6155d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z5) {
            return k0Var.b(intent).g(new o.a(1), new k(0));
        }
        if (x.w().z(context)) {
            h0.c(context, k0Var, intent);
        } else {
            k0Var.b(intent);
        }
        return d5.q(-1);
    }

    public Task b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f6156a;
        o.a aVar = (o.a) this.f6157b;
        boolean z5 = q6.b.e() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z7 = (intent.getFlags() & 268435456) != 0;
        return (!z5 || z7) ? d5.d(aVar, new i(0, context, intent)).h(aVar, new w7.a() { // from class: com.google.firebase.messaging.j
            @Override // w7.a
            public final Object f(Task task) {
                return (q6.b.e() && ((Integer) task.getResult()).intValue() == 402) ? l.a(context, intent, z7).g(new o.a(1), new androidx.appcompat.app.b0(29)) : task;
            }
        }) : a(context, intent, z7);
    }

    public l(Context context) {
        this.f6156a = context;
        this.f6157b = new o.a(1);
    }

    public l(c0.w wVar, String str) {
        this.f6156a = wVar;
        this.f6157b = str;
    }
}
