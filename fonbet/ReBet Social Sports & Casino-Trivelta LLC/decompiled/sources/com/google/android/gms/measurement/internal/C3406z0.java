package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Iterator;
import java.util.Map;
import z.C6900a;

/* renamed from: com.google.android.gms.measurement.internal.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3406z0 extends B1 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f34409b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f34410c;

    /* renamed from: d, reason: collision with root package name */
    public long f34411d;

    public C3406z0(C3298l3 c3298l3) {
        super(c3298l3);
        this.f34410c = new C6900a();
        this.f34409b = new C6900a();
    }

    public final void i(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f33578a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f33578a.b().t(new RunnableC3206a(this, str, j10));
        }
    }

    public final void j(String str, long j10) {
        if (str == null || str.length() == 0) {
            this.f33578a.a().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f33578a.b().t(new RunnableC3397y(this, str, j10));
        }
    }

    public final void k(long j10) {
        C3268h5 q10 = this.f33578a.I().q(false);
        Map map = this.f34409b;
        for (String str : map.keySet()) {
            p(str, j10 - ((Long) map.get(str)).longValue(), q10);
        }
        if (!map.isEmpty()) {
            o(j10 - this.f34411d, q10);
        }
        n(j10);
    }

    public final /* synthetic */ void l(String str, long j10) {
        h();
        AbstractC3191o.g(str);
        Map map = this.f34410c;
        if (map.isEmpty()) {
            this.f34411d = j10;
        }
        Integer num = (Integer) map.get(str);
        if (num != null) {
            map.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (map.size() >= 100) {
            this.f33578a.a().r().a("Too many ads visible");
        } else {
            map.put(str, 1);
            this.f34409b.put(str, Long.valueOf(j10));
        }
    }

    public final /* synthetic */ void m(String str, long j10) {
        h();
        AbstractC3191o.g(str);
        Map map = this.f34410c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            this.f33578a.a().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C3268h5 q10 = this.f33578a.I().q(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            map.put(str, Integer.valueOf(intValue));
            return;
        }
        map.remove(str);
        Map map2 = this.f34409b;
        Long l10 = (Long) map2.get(str);
        if (l10 == null) {
            this.f33578a.a().o().a("First ad unit exposure time was never set");
        } else {
            long longValue = j10 - l10.longValue();
            map2.remove(str);
            p(str, longValue, q10);
        }
        if (map.isEmpty()) {
            long j11 = this.f34411d;
            if (j11 == 0) {
                this.f33578a.a().o().a("First ad exposure time was never set");
            } else {
                o(j10 - j11, q10);
                this.f34411d = 0L;
            }
        }
    }

    public final void o(long j10, C3268h5 c3268h5) {
        if (c3268h5 == null) {
            this.f33578a.a().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f33578a.a().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        b7.k0(c3268h5, bundle, true);
        this.f33578a.B().t("am", "_xa", bundle);
    }

    public final void p(String str, long j10, C3268h5 c3268h5) {
        if (c3268h5 == null) {
            this.f33578a.a().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            this.f33578a.a().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        b7.k0(c3268h5, bundle, true);
        this.f33578a.B().t("am", "_xu", bundle);
    }

    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void n(long j10) {
        Map map = this.f34409b;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Long.valueOf(j10));
        }
        if (map.isEmpty()) {
            return;
        }
        this.f34411d = j10;
    }
}
