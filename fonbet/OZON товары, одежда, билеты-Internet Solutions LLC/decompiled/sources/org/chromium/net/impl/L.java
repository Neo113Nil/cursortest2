package org.chromium.net.impl;

import java.util.Date;
import org.chromium.net.y;

/* loaded from: classes6.dex */
public final class L extends y.b {

    /* renamed from: a, reason: collision with root package name */
    private final long f78870a;

    /* renamed from: b, reason: collision with root package name */
    private final long f78871b;

    /* renamed from: c, reason: collision with root package name */
    private final long f78872c;

    /* renamed from: d, reason: collision with root package name */
    private final long f78873d;

    /* renamed from: e, reason: collision with root package name */
    private final long f78874e;

    /* renamed from: f, reason: collision with root package name */
    private final long f78875f;

    /* renamed from: g, reason: collision with root package name */
    private final long f78876g;

    /* renamed from: h, reason: collision with root package name */
    private final long f78877h;

    /* renamed from: i, reason: collision with root package name */
    private final long f78878i;

    /* renamed from: j, reason: collision with root package name */
    private final long f78879j;

    /* renamed from: k, reason: collision with root package name */
    private final long f78880k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f78881l;

    /* renamed from: m, reason: collision with root package name */
    private final Long f78882m;

    /* renamed from: n, reason: collision with root package name */
    private final Long f78883n;

    /* renamed from: o, reason: collision with root package name */
    private final Long f78884o;

    public L(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, boolean z11, long j23, long j24) {
        this.f78870a = j11;
        this.f78871b = j12;
        this.f78872c = j13;
        this.f78873d = j14;
        this.f78874e = j15;
        this.f78875f = j16;
        this.f78876g = j17;
        this.f78877h = j18;
        this.f78878i = j19;
        this.f78879j = j21;
        this.f78880k = j22;
        this.f78881l = z11;
        this.f78883n = Long.valueOf(j23);
        this.f78884o = Long.valueOf(j24);
        if (j11 != -1) {
            int i11 = (j21 > (-1L) ? 1 : (j21 == (-1L) ? 0 : -1));
        }
        if (j11 == -1 || j22 == -1) {
            this.f78882m = null;
        } else {
            this.f78882m = Long.valueOf(j22 - j11);
        }
    }

    private static Date p(long j11) {
        if (j11 != -1) {
            return new Date(j11);
        }
        return null;
    }

    @Override // org.chromium.net.y.b
    public final Date a() {
        return p(this.f78874e);
    }

    @Override // org.chromium.net.y.b
    public final Date b() {
        return p(this.f78873d);
    }

    @Override // org.chromium.net.y.b
    public final Date c() {
        return p(this.f78872c);
    }

    @Override // org.chromium.net.y.b
    public final Date d() {
        return p(this.f78871b);
    }

    @Override // org.chromium.net.y.b
    public final Date e() {
        return p(this.f78880k);
    }

    @Override // org.chromium.net.y.b
    public final Date f() {
        return p(this.f78879j);
    }

    @Override // org.chromium.net.y.b
    public final Date g() {
        return p(this.f78878i);
    }

    @Override // org.chromium.net.y.b
    public final Date h() {
        return p(this.f78877h);
    }

    @Override // org.chromium.net.y.b
    public final boolean i() {
        return this.f78881l;
    }

    @Override // org.chromium.net.y.b
    public final Date j() {
        return p(this.f78876g);
    }

    @Override // org.chromium.net.y.b
    public final Date k() {
        return p(this.f78875f);
    }

    @Override // org.chromium.net.y.b
    public final Long l() {
        return this.f78882m;
    }

    public final Long m() {
        return this.f78884o;
    }

    public final Date n() {
        return p(this.f78870a);
    }

    public final Long o() {
        return this.f78883n;
    }
}
