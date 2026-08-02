package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3243e4 extends AbstractC3381w {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W4 f33997e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3243e4(W4 w42, Q3 q32) {
        super(q32);
        Objects.requireNonNull(w42);
        this.f33997e = w42;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3381w
    public final void a() {
        final W4 B10 = this.f33997e.f33578a.B();
        Objects.requireNonNull(B10);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.d4
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                W4.this.u0();
            }
        }).start();
    }
}
