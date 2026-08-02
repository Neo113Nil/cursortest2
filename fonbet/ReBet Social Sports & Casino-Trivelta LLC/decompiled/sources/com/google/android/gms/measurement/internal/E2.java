package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class E2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f33378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F2 f33379b;

    public E2(F2 f22, boolean z10) {
        this.f33378a = z10;
        Objects.requireNonNull(f22);
        this.f33379b = f22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33379b.c().s0(this.f33378a);
    }
}
