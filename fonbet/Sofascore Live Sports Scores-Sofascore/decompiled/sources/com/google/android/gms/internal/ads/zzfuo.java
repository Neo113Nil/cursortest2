package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.ironsource.Ua;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfuo {
    public final Object a;
    public final long b;
    public final Clock c;
    public final long d;
    public final double e;
    public final int f;

    public zzfuo(Object obj, Clock clock, double d, int i) {
        if (clock == null) {
            a70.p("Clock cannot be null.");
            throw null;
        }
        this.a = obj;
        this.c = clock;
        this.b = clock.a();
        this.d = Math.min(Math.max(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f0)).longValue() * 1000, Ua.s), 21600000L);
        this.e = d;
        this.f = i;
    }

    public final long a() {
        return this.d - (this.c.a() - this.b);
    }
}
