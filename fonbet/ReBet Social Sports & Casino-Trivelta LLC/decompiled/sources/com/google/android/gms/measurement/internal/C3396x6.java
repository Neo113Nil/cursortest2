package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.x6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3396x6 extends AbstractC3381w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3404y6 f34388e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3396x6(C3404y6 c3404y6, Q3 q32) {
        super(q32);
        Objects.requireNonNull(c3404y6);
        this.f34388e = c3404y6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3381w
    public final void a() {
        C3404y6 c3404y6 = this.f34388e;
        c3404y6.n();
        c3404y6.f33578a.a().w().a("Starting upload from DelayedRunnable");
        c3404y6.f34418b.r();
    }
}
