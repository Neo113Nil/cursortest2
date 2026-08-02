package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;

/* renamed from: com.google.android.gms.measurement.internal.v6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3380v6 {

    /* renamed from: a, reason: collision with root package name */
    public final K9.e f34347a;

    /* renamed from: b, reason: collision with root package name */
    public long f34348b;

    public C3380v6(K9.e eVar) {
        AbstractC3191o.m(eVar);
        this.f34347a = eVar;
    }

    public final void a() {
        this.f34348b = this.f34347a.b();
    }

    public final void b() {
        this.f34348b = 0L;
    }

    public final boolean c(long j10) {
        return this.f34348b == 0 || this.f34347a.b() - this.f34348b >= 3600000;
    }
}
