package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f33753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3406z0 f33754b;

    public Y(C3406z0 c3406z0, long j10) {
        this.f33753a = j10;
        Objects.requireNonNull(c3406z0);
        this.f33754b = c3406z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33754b.n(this.f33753a);
    }
}
