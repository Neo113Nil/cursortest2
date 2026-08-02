package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class F4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V3 f33402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f33403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W4 f33405d;

    public F4(W4 w42, V3 v32, long j10, boolean z10) {
        this.f33402a = v32;
        this.f33403b = j10;
        this.f33404c = z10;
        Objects.requireNonNull(w42);
        this.f33405d = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4 w42 = this.f33405d;
        V3 v32 = this.f33402a;
        w42.o(v32);
        w42.X(v32, this.f33403b, false, this.f33404c);
    }
}
