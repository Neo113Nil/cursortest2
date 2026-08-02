package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3229c6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ S6 f33969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f33970b;

    public RunnableC3229c6(C3269h6 c3269h6, S6 s62, Runnable runnable) {
        this.f33969a = s62;
        this.f33970b = runnable;
        Objects.requireNonNull(c3269h6);
    }

    @Override // java.lang.Runnable
    public final void run() {
        S6 s62 = this.f33969a;
        s62.E();
        s62.D(this.f33970b);
        s62.r();
    }
}
