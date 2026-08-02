package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class G6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T6 f33422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S6 f33423b;

    public G6(S6 s62, T6 t62) {
        this.f33422a = t62;
        Objects.requireNonNull(s62);
        this.f33423b = s62;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S6 s62 = this.f33423b;
        s62.u0(this.f33422a);
        s62.A0();
    }
}
