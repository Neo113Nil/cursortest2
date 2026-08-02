package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3250f3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3227c4 f34009a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3298l3 f34010b;

    public RunnableC3250f3(C3298l3 c3298l3, C3227c4 c3227c4) {
        this.f34009a = c3227c4;
        Objects.requireNonNull(c3298l3);
        this.f34010b = c3298l3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3298l3 c3298l3 = this.f34010b;
        C3227c4 c3227c4 = this.f34009a;
        c3298l3.p(c3227c4);
        c3298l3.v(c3227c4.f33965d);
    }
}
