package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f37966d;

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f37967a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f37968b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f37969c;

    public h0(SharedPreferences sharedPreferences, Executor executor) {
        this.f37969c = executor;
        this.f37967a = sharedPreferences;
    }

    public static synchronized h0 b(Context context, Executor executor) {
        h0 h0Var;
        synchronized (h0.class) {
            try {
                WeakReference weakReference = f37966d;
                h0Var = weakReference != null ? (h0) weakReference.get() : null;
                if (h0Var == null) {
                    h0Var = new h0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    h0Var.d();
                    f37966d = new WeakReference(h0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h0Var;
    }

    public synchronized boolean a(g0 g0Var) {
        return this.f37968b.b(g0Var.e());
    }

    public synchronized g0 c() {
        return g0.a(this.f37968b.f());
    }

    public final synchronized void d() {
        this.f37968b = d0.d(this.f37967a, "topic_operation_queue", ",", this.f37969c);
    }

    public synchronized boolean e(g0 g0Var) {
        return this.f37968b.g(g0Var.e());
    }
}
