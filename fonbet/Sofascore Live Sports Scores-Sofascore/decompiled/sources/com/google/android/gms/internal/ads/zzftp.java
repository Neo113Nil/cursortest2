package com.google.android.gms.internal.ads;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import defpackage.bao;
import defpackage.cao;
import defpackage.nkn;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzftp {
    public final com.google.android.gms.ads.internal.util.zzg a;
    public ScheduledFuture c;
    public final ScheduledExecutorService f;
    public final zzfuf g;
    public final Clock h;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final LinkedHashMap d = new LinkedHashMap();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public zzftp(com.google.android.gms.ads.internal.util.zzj zzjVar, ScheduledExecutorService scheduledExecutorService, zzfuf zzfufVar, Clock clock) {
        this.a = zzjVar;
        this.f = scheduledExecutorService;
        this.g = zzfufVar;
        this.h = clock;
    }

    public static String g(String str, AdFormat adFormat) {
        return str + ":" + adFormat;
    }

    public final void a(zzfvd zzfvdVar) {
        int i = 1;
        if (zzfvdVar.t() <= 0 && !zzfvdVar.m.get()) {
            i = 0;
        }
        c(zzfvdVar, i);
    }

    public final void b(zzfvd zzfvdVar, boolean z) {
        long a = this.h.a();
        AdFormat q = zzfvdVar.q();
        String str = zzfvdVar.l;
        String r = zzfvdVar.r();
        zzeai a2 = this.g.a.a();
        a2.b("poaca_ts", Long.toString(a));
        a2.b("action", true != z ? "poac" : "poact");
        a2.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, r);
        a2.b("pid", str);
        if (q != null) {
            a2.b("ad_format", q.name().toLowerCase(Locale.ENGLISH));
        }
        a2.c();
        this.b.set(false);
        l();
    }

    public final void c(zzfvd zzfvdVar, int i) {
        if (i(zzfvdVar)) {
            return;
        }
        if (i > 0) {
            this.f.execute(new bao(this, zzfvdVar, i));
        }
        if (this.b.get() || zzfvdVar.t() != 0 || !zzfvdVar.u()) {
            k(0L);
            return;
        }
        zzfvdVar.k();
        k(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.d0)).longValue());
    }

    public final void d(zzfvd zzfvdVar) {
        AdFormat q = zzfvdVar.q();
        if (q == null) {
            return;
        }
        String g = g(zzfvdVar.l, q);
        LinkedHashMap linkedHashMap = this.d;
        synchronized (linkedHashMap) {
            if (linkedHashMap.containsKey(g)) {
                linkedHashMap.remove(g);
                int t = zzfvdVar.t();
                int i = t - 1;
                if (!zzfvdVar.m.get()) {
                    t = i;
                }
                this.f.execute(new bao(this, Math.max(t, 0), zzfvdVar));
            }
        }
    }

    public final int e() {
        zzgxm x;
        LinkedHashMap linkedHashMap = this.d;
        synchronized (linkedHashMap) {
            x = zzgxm.x(linkedHashMap.values());
        }
        int size = x.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zzfvd zzfvdVar = (zzfvd) x.get(i2);
            int t = zzfvdVar.t();
            int i3 = t - 1;
            if (!zzfvdVar.m.get()) {
                t = i3;
            }
            i += Math.max(t, 0);
        }
        return i;
    }

    public final int f() {
        int zzR = this.a.zzR();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S)).booleanValue() && zzR > 0) {
            return zzR;
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c0)).intValue();
    }

    public final void h(zzfvd zzfvdVar) {
        boolean z = false;
        if (zzfvdVar.t() > 0 || zzfvdVar.m.get()) {
            this.f.execute(new nkn(this, zzfvdVar, z, 23));
        }
        this.b.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.e.set(true);
    }

    public final boolean i(zzfvd zzfvdVar) {
        boolean z;
        AdFormat q = zzfvdVar.q();
        if (q == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.d;
        synchronized (linkedHashMap) {
            z = !linkedHashMap.containsKey(g(zzfvdVar.l, q));
        }
        return z;
    }

    public final boolean j() {
        zzgxm x;
        LinkedHashMap linkedHashMap = this.d;
        synchronized (linkedHashMap) {
            x = zzgxm.x(linkedHashMap.values());
        }
        int size = x.size();
        for (int i = 0; i < size; i++) {
            zzfvd zzfvdVar = (zzfvd) x.get(i);
            if (zzfvdVar.t() == 0 && zzfvdVar.u()) {
                return true;
            }
        }
        return false;
    }

    public final void k(long j) {
        if (this.e.compareAndSet(false, true)) {
            synchronized (this) {
                ScheduledExecutorService scheduledExecutorService = this.f;
                try {
                    if (j > 0) {
                        this.c = scheduledExecutorService.schedule(new cao(this, 1), j, TimeUnit.MILLISECONDS);
                    } else {
                        scheduledExecutorService.execute(new cao(this, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        zzfvd zzfvdVar;
        zzgxm x;
        if (this.b.get()) {
            return;
        }
        synchronized (this) {
            zzfvdVar = null;
            this.c = null;
        }
        int f = f();
        if (e() < f || j()) {
            LinkedHashMap linkedHashMap = this.d;
            synchronized (linkedHashMap) {
                x = zzgxm.x(linkedHashMap.values());
            }
            int size = x.size();
            double d = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                zzfvd zzfvdVar2 = (zzfvd) x.get(i);
                if (zzfvdVar2.u()) {
                    double t = zzfvdVar2.t() / zzfvdVar2.s();
                    if (t < d) {
                        d = t;
                    }
                    if (t < d) {
                        zzfvdVar = zzfvdVar2;
                    }
                }
            }
            if (zzfvdVar != null) {
                zzfvdVar.k();
                if (zzfvdVar.t() > 0) {
                    this.g.h("acmpa", this.h.a(), zzfvdVar.l, zzfvdVar.r(), zzfvdVar.q(), zzfvdVar.s(), zzfvdVar.t(), 0, e(), f);
                }
            }
            if (e() >= f) {
                m();
            }
            if (e() < f || j()) {
                if (j()) {
                    this.f.execute(new cao(this, 2));
                    return;
                }
                synchronized (this) {
                    this.c = this.f.schedule(new cao(this, 3), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.e0)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            m();
        }
        this.e.set(false);
    }

    public final void m() {
        int size;
        LinkedHashMap linkedHashMap = this.d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        zzfuf zzfufVar = this.g;
        long a = this.h.a();
        int f = f();
        zzeai a2 = zzfufVar.a.a();
        a2.b("action", "acmlr");
        a2.b("pat", Long.toString(a));
        a2.b("mpl", Integer.toString(f));
        a2.b("pas", Integer.toString(size));
        a2.c();
    }

    public final void n(zzfvd zzfvdVar, int i) {
        this.g.h("acmpr", this.h.a(), zzfvdVar.l, zzfvdVar.r(), zzfvdVar.q(), zzfvdVar.s(), zzfvdVar.t(), i, e(), f());
    }
}
