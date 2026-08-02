package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Dk {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f12153a;

    /* renamed from: b, reason: collision with root package name */
    public final Uk f12154b;

    /* renamed from: c, reason: collision with root package name */
    public final Gk f12155c;

    /* renamed from: d, reason: collision with root package name */
    public long f12156d;

    /* renamed from: e, reason: collision with root package name */
    public long f12157e;

    /* renamed from: f, reason: collision with root package name */
    public AtomicLong f12158f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12159g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Sk f12160h;

    /* renamed from: i, reason: collision with root package name */
    public long f12161i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f12162k;

    public Dk(X4 x42, Uk uk, Gk gk, SystemTimeProvider systemTimeProvider) {
        this.f12153a = x42;
        this.f12154b = uk;
        this.f12155c = gk;
        this.f12162k = systemTimeProvider;
        a();
    }

    public final void a() {
        Gk gk = this.f12155c;
        long elapsedRealtime = this.f12162k.elapsedRealtime();
        Long l6 = gk.f12278c;
        if (l6 != null) {
            elapsedRealtime = l6.longValue();
        }
        this.f12157e = elapsedRealtime;
        Long l10 = this.f12155c.f12277b;
        this.f12156d = l10 == null ? -1L : l10.longValue();
        Long l11 = this.f12155c.f12280e;
        this.f12158f = new AtomicLong(l11 == null ? 0L : l11.longValue());
        Boolean bool = this.f12155c.f12281f;
        this.f12159g = bool == null ? true : bool.booleanValue();
        Long l12 = this.f12155c.f12282g;
        long longValue = l12 != null ? l12.longValue() : 0L;
        this.f12161i = longValue;
        Gk gk2 = this.f12155c;
        long j = longValue - this.f12157e;
        Long l13 = gk2.f12283h;
        if (l13 != null) {
            j = l13.longValue();
        }
        this.j = j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Session{id=");
        sb2.append(this.f12156d);
        sb2.append(", creationTime=");
        sb2.append(this.f12157e);
        sb2.append(", currentReportId=");
        sb2.append(this.f12158f);
        sb2.append(", sessionRequestParams=");
        sb2.append(this.f12160h);
        sb2.append(", sleepStart=");
        return d9.e.j(sb2, this.f12161i, '}');
    }
}
