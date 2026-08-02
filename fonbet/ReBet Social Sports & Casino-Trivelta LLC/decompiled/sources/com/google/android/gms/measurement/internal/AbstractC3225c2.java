package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3225c2 extends B1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f33957b;

    public AbstractC3225c2(C3298l3 c3298l3) {
        super(c3298l3);
        this.f33578a.k();
    }

    public final boolean i() {
        return this.f33957b;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.f33957b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.f33578a.l();
        this.f33957b = true;
    }

    public final void l() {
        if (this.f33957b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.f33578a.l();
        this.f33957b = true;
    }

    public abstract boolean m();

    public void n() {
    }
}
