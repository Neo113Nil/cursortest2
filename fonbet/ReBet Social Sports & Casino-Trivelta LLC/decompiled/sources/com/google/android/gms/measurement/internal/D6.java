package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public abstract class D6 extends AbstractC3412z6 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f33375c;

    public D6(S6 s62) {
        super(s62);
        this.f34418b.e0();
    }

    public final boolean i() {
        return this.f33375c;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f33375c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        l();
        this.f34418b.f0();
        this.f33375c = true;
    }

    public abstract boolean l();
}
