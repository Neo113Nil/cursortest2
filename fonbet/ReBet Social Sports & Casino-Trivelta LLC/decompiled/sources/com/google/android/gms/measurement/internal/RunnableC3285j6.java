package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3285j6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3348r6 f34065b;

    public RunnableC3285j6(C3348r6 c3348r6, long j10) {
        this.f34064a = j10;
        Objects.requireNonNull(c3348r6);
        this.f34065b = c3348r6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34065b.s(this.f34064a);
    }
}
