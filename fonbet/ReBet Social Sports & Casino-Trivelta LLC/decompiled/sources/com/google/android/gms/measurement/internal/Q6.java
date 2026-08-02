package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class Q6 {

    /* renamed from: a, reason: collision with root package name */
    public final S6 f33601a;

    /* renamed from: b, reason: collision with root package name */
    public int f33602b = 1;

    /* renamed from: c, reason: collision with root package name */
    public long f33603c = d();

    public Q6(S6 s62) {
        this.f33601a = s62;
    }

    public final void a() {
        this.f33602b++;
        this.f33603c = d();
    }

    public final boolean b() {
        return this.f33601a.e().a() >= this.f33603c;
    }

    public final /* synthetic */ long c() {
        return this.f33603c;
    }

    public final long d() {
        S6 s62 = this.f33601a;
        AbstractC3191o.m(s62);
        long longValue = ((Long) AbstractC3209a2.f33906v.b(null)).longValue();
        long longValue2 = ((Long) AbstractC3209a2.f33908w.b(null)).longValue();
        for (int i10 = 1; i10 < this.f33602b; i10++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        return s62.e().a() + Math.min(longValue, longValue2);
    }
}
