package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class O5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3241e2 f33580a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T5 f33581b;

    public O5(T5 t52, InterfaceC3241e2 interfaceC3241e2) {
        this.f33580a = interfaceC3241e2;
        Objects.requireNonNull(t52);
        this.f33581b = t52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T5 t52 = this.f33581b;
        synchronized (t52) {
            try {
                t52.e(false);
                Z5 z52 = t52.f33671c;
                if (!z52.W()) {
                    z52.f33578a.a().v().a("Connected to remote service");
                    z52.z(this.f33580a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Z5 z53 = this.f33581b.f33671c;
        if (z53.P() != null) {
            z53.P().shutdownNow();
            z53.Q(null);
        }
    }
}
