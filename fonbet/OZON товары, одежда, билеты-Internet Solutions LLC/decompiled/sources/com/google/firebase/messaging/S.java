package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
final class S {

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<S> f59645b;

    /* renamed from: a, reason: collision with root package name */
    private N f59646a;

    public static synchronized S a(Context context, ScheduledExecutorService scheduledExecutorService) {
        S s11;
        synchronized (S.class) {
            try {
                WeakReference<S> weakReference = f59645b;
                s11 = weakReference != null ? weakReference.get() : null;
                if (s11 == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    s11 = new S();
                    synchronized (s11) {
                        s11.f59646a = N.b(sharedPreferences, scheduledExecutorService);
                    }
                    f59645b = new WeakReference<>(s11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s11;
    }

    final synchronized Q b() {
        String peek;
        N n11 = this.f59646a;
        synchronized (n11.f59628d) {
            peek = n11.f59628d.peek();
        }
        return Q.a(peek);
    }

    final synchronized void c(Q q11) {
        this.f59646a.c(q11.d());
    }
}
