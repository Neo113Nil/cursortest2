package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final String f33283a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33284b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33285c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33286d;

    /* renamed from: e, reason: collision with root package name */
    public final long f33287e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33288f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33289g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f33290h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f33291i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f33292j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f33293k;

    public B(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        AbstractC3191o.g(str);
        AbstractC3191o.g(str2);
        AbstractC3191o.a(j10 >= 0);
        AbstractC3191o.a(j11 >= 0);
        AbstractC3191o.a(j12 >= 0);
        AbstractC3191o.a(j14 >= 0);
        this.f33283a = str;
        this.f33284b = str2;
        this.f33285c = j10;
        this.f33286d = j11;
        this.f33287e = j12;
        this.f33288f = j13;
        this.f33289g = j14;
        this.f33290h = l10;
        this.f33291i = l11;
        this.f33292j = l12;
        this.f33293k = bool;
    }

    public final B a(long j10) {
        return new B(this.f33283a, this.f33284b, this.f33285c, this.f33286d, this.f33287e, j10, this.f33289g, this.f33290h, this.f33291i, this.f33292j, this.f33293k);
    }

    public final B b(long j10, long j11) {
        return new B(this.f33283a, this.f33284b, this.f33285c, this.f33286d, this.f33287e, this.f33288f, j10, Long.valueOf(j11), this.f33291i, this.f33292j, this.f33293k);
    }

    public final B c(Long l10, Long l11, Boolean bool) {
        return new B(this.f33283a, this.f33284b, this.f33285c, this.f33286d, this.f33287e, this.f33288f, this.f33289g, this.f33290h, l10, l11, bool);
    }
}
