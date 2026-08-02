package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3411z5 extends AbstractC3381w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z5 f34417e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3411z5(Z5 z52, Q3 q32) {
        super(q32);
        Objects.requireNonNull(z52);
        this.f34417e = z52;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3381w
    public final void a() {
        Z5 z52 = this.f34417e;
        z52.h();
        if (z52.W()) {
            z52.f33578a.a().w().a("Inactivity, disconnecting from the service");
            z52.A();
        }
    }
}
