package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.p6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3333p6 {

    /* renamed from: a, reason: collision with root package name */
    public long f34232a;

    /* renamed from: b, reason: collision with root package name */
    public long f34233b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3381w f34234c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3348r6 f34235d;

    public C3333p6(C3348r6 c3348r6) {
        Objects.requireNonNull(c3348r6);
        this.f34235d = c3348r6;
        this.f34234c = new C3317n6(this, c3348r6.f33578a);
        long b10 = c3348r6.f33578a.e().b();
        this.f34232a = b10;
        this.f34233b = b10;
    }

    public final void a(long j10) {
        this.f34235d.h();
        this.f34234c.d();
        this.f34232a = j10;
        this.f34233b = j10;
    }

    public final void b(long j10) {
        this.f34234c.d();
    }

    public final void c() {
        this.f34234c.d();
        long b10 = this.f34235d.f33578a.e().b();
        this.f34232a = b10;
        this.f34233b = b10;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        C3348r6 c3348r6 = this.f34235d;
        c3348r6.h();
        c3348r6.j();
        if (c3348r6.f33578a.g()) {
            C3298l3 c3298l3 = c3348r6.f33578a;
            c3298l3.x().f33527q.b(c3298l3.e().a());
        }
        long j11 = j10 - this.f34232a;
        if (!z10 && j11 < 1000) {
            c3348r6.f33578a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f34233b;
            this.f34233b = j10;
        }
        C3298l3 c3298l32 = c3348r6.f33578a;
        c3298l32.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !c3298l32.w().N();
        C3298l3 c3298l33 = c3348r6.f33578a;
        b7.k0(c3298l33.I().q(z12), bundle, true);
        if (!z11) {
            c3298l33.B().t("auto", "_e", bundle);
        }
        this.f34232a = j10;
        AbstractC3381w abstractC3381w = this.f34234c;
        abstractC3381w.d();
        abstractC3381w.b(((Long) AbstractC3209a2.f33899r0.b(null)).longValue());
        return true;
    }
}
