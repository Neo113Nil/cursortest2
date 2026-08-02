package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class E4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V3 f33383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f33384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33385c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W4 f33386d;

    public E4(W4 w42, V3 v32, long j10, boolean z10) {
        this.f33383a = v32;
        this.f33384b = j10;
        this.f33385c = z10;
        Objects.requireNonNull(w42);
        this.f33386d = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4 w42 = this.f33386d;
        V3 v32 = this.f33383a;
        w42.o(v32);
        w42.X(v32, this.f33384b, true, this.f33385c);
    }
}
