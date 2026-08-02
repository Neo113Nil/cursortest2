package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.q4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3339q4 extends AbstractC3381w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W4 f34249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3339q4(W4 w42, Q3 q32) {
        super(q32);
        Objects.requireNonNull(w42);
        this.f34249e = w42;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3381w
    public final void a() {
        W4 w42 = this.f34249e;
        if (w42.f33578a.n()) {
            w42.c0().b(2000L);
        }
    }
}
