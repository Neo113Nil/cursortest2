package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class D4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3389x f33372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W4 f33373b;

    public D4(W4 w42, C3389x c3389x) {
        this.f33372a = c3389x;
        Objects.requireNonNull(w42);
        this.f33373b = w42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        W4 w42 = this.f33373b;
        C3298l3 c3298l3 = w42.f33578a;
        L2 x10 = c3298l3.x();
        C3298l3 c3298l32 = x10.f33578a;
        x10.h();
        C3389x u10 = x10.u();
        C3389x c3389x = this.f33372a;
        if (!V3.u(c3389x.b(), u10.b())) {
            c3298l3.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c3389x.b()));
            return;
        }
        SharedPreferences.Editor edit = x10.p().edit();
        edit.putString("dma_consent_settings", c3389x.e());
        edit.apply();
        c3298l3.a().w().b("Setting DMA consent(FE)", c3389x);
        C3298l3 c3298l33 = w42.f33578a;
        if (c3298l33.J().D()) {
            c3298l33.J().a0();
        } else {
            c3298l33.J().Y(false);
        }
    }
}
