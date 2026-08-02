package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public abstract class P3 extends O3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f33590b;

    public P3(C3298l3 c3298l3) {
        super(c3298l3);
        this.f33578a.k();
    }

    public abstract boolean i();

    public void j() {
    }

    public final boolean k() {
        return this.f33590b;
    }

    public final void l() {
        if (!k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f33590b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (i()) {
            return;
        }
        this.f33578a.l();
        this.f33590b = true;
    }

    public final void n() {
        if (this.f33590b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        j();
        this.f33578a.l();
        this.f33590b = true;
    }
}
