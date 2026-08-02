package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.zzcn;

/* renamed from: com.google.android.gms.measurement.internal.r6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3348r6 extends AbstractC3225c2 {

    /* renamed from: c, reason: collision with root package name */
    public Handler f34267c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f34268d;

    /* renamed from: e, reason: collision with root package name */
    public final C3341q6 f34269e;

    /* renamed from: f, reason: collision with root package name */
    public final C3333p6 f34270f;

    /* renamed from: g, reason: collision with root package name */
    public final C3309m6 f34271g;

    public C3348r6(C3298l3 c3298l3) {
        super(c3298l3);
        this.f34268d = true;
        this.f34269e = new C3341q6(this);
        this.f34270f = new C3333p6(this);
        this.f34271g = new C3309m6(this);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3225c2
    public final boolean m() {
        return false;
    }

    public final void o(boolean z10) {
        h();
        this.f34268d = z10;
    }

    public final boolean p() {
        h();
        return this.f34268d;
    }

    public final /* synthetic */ void r(long j10) {
        h();
        q();
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (c3298l3.w().H(null, AbstractC3209a2.f33843V0)) {
            if (c3298l3.w().N() || this.f34268d) {
                this.f34270f.a(j10);
            }
        } else if (c3298l3.w().N() || c3298l3.x().f33530t.a()) {
            this.f34270f.a(j10);
        }
        this.f34271g.a();
        C3341q6 c3341q6 = this.f34269e;
        C3348r6 c3348r6 = c3341q6.f34256a;
        c3348r6.h();
        if (c3348r6.f33578a.g()) {
            c3341q6.b(c3348r6.f33578a.e().a(), false);
        }
    }

    public final /* synthetic */ void s(long j10) {
        h();
        q();
        C3298l3 c3298l3 = this.f33578a;
        c3298l3.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f34271g.b(j10);
        if (c3298l3.w().N()) {
            this.f34270f.b(j10);
        }
    }

    public final /* synthetic */ Handler t() {
        return this.f34267c;
    }

    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f34267c == null) {
            this.f34267c = new zzcn(Looper.getMainLooper());
        }
    }
}
