package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class L5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3241e2 f33543a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T5 f33544b;

    public L5(T5 t52, InterfaceC3241e2 interfaceC3241e2) {
        this.f33543a = interfaceC3241e2;
        Objects.requireNonNull(t52);
        this.f33544b = t52;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T5 t52 = this.f33544b;
        synchronized (t52) {
            try {
                t52.e(false);
                Z5 z52 = t52.f33671c;
                if (!z52.W()) {
                    z52.f33578a.a().w().a("Connected to service");
                    z52.z(this.f33543a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
