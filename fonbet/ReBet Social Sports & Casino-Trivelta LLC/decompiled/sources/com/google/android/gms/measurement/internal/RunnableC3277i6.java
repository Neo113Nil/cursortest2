package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3277i6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f34053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3348r6 f34054b;

    public RunnableC3277i6(C3348r6 c3348r6, long j10) {
        this.f34053a = j10;
        Objects.requireNonNull(c3348r6);
        this.f34054b = c3348r6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34054b.r(this.f34053a);
    }
}
