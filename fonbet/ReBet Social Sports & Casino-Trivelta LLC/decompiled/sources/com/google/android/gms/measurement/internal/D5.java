package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class D5 extends AbstractC3381w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z5 f33374e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D5(Z5 z52, Q3 q32) {
        super(q32);
        Objects.requireNonNull(z52);
        this.f33374e = z52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3381w
    public final void a() {
        this.f33374e.f33578a.a().r().a("Tasks have been queued for a long time");
    }
}
