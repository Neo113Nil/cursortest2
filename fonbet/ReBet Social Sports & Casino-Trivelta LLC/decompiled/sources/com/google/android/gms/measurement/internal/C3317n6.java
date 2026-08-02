package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3317n6 extends AbstractC3381w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3333p6 f34189e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3317n6(C3333p6 c3333p6, Q3 q32) {
        super(q32);
        Objects.requireNonNull(c3333p6);
        this.f34189e = c3333p6;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3381w
    public final void a() {
        C3333p6 c3333p6 = this.f34189e;
        C3348r6 c3348r6 = c3333p6.f34235d;
        c3348r6.h();
        C3298l3 c3298l3 = c3348r6.f33578a;
        c3333p6.d(false, false, c3298l3.e().b());
        c3348r6.f33578a.M().k(c3298l3.e().b());
    }
}
