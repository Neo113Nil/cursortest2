package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Random;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfty {
    public final long a;
    public final long b;
    public final Clock f;
    public final zzfuf g;
    public long h;
    public long d = 5;
    public long e = 0;
    public final Random i = new Random();
    public long c = 0;

    public zzfty(long j, long j2, Clock clock, zzfuf zzfufVar) {
        this.a = j;
        this.b = j2;
        this.g = zzfufVar;
        this.f = clock;
        a();
    }

    public final synchronized void a() {
        this.h = this.a;
        this.c = 0L;
        this.e = 0L;
    }

    public final synchronized long b() {
        double d;
        double d2;
        long j;
        d = this.h;
        d2 = 0.2d * d;
        j = (long) (d + d2);
        return ((long) (d - d2)) + ((long) (this.i.nextDouble() * ((j - r0) + 1)));
    }

    public final synchronized void c() {
        long b = b();
        Clock clock = this.f;
        this.e = clock.a() + b;
        double d = this.h;
        long j = this.b;
        this.h = Math.min((long) (d + d), j);
        this.c++;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M)).booleanValue()) {
            this.g.e(clock.a(), this.c, this.h, this.d, j);
        }
    }

    public final synchronized boolean d() {
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N)).intValue() < 0) {
            return false;
        }
        if (this.c > Math.max(this.d, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(r0)).intValue())) {
            if (this.h >= this.b) {
                return true;
            }
        }
        return false;
    }
}
