package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzddi;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzfuo;
import com.google.android.gms.internal.ads.zzfvd;
import defpackage.blo;
import defpackage.fjn;
import defpackage.fn0;
import defpackage.hao;
import defpackage.jao;
import defpackage.nkn;
import defpackage.v4n;
import defpackage.vlo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzfvd {
    public final ClientApi a;
    public final Context b;
    public final int c;
    public final zzfms d;
    public final AtomicReference e;
    public final zzftp f;
    public final AtomicBoolean g;
    public final zzcb h;
    public final com.google.android.gms.ads.internal.client.zzce i;
    public final Queue j;
    public final zzfty k;
    public final String l;
    public final AtomicBoolean m;
    public final ScheduledExecutorService n;
    public final zzfpm o;
    public final AtomicBoolean p;
    public zzfuf q;
    public final Clock r;
    public final hao s;

    public zzfvd(String str, ClientApi clientApi, Context context, int i, zzfms zzfmsVar, zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock, zzftp zzftpVar) {
        this.l = str;
        this.a = clientApi;
        this.b = context;
        this.c = i;
        this.d = zzfmsVar;
        AtomicReference atomicReference = new AtomicReference(zzfpVar);
        this.e = atomicReference;
        this.j = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.g0)).booleanValue() ? new zzfvg() : new PriorityQueue(Math.max(1, zzfpVar.zzd), v4n.m);
        this.g = new AtomicBoolean(true);
        this.m = new AtomicBoolean(false);
        this.n = scheduledExecutorService;
        this.o = zzfpmVar;
        this.k = zzftyVar;
        this.p = new AtomicBoolean(true);
        this.r = clock;
        zzful zzfulVar = new zzful(zzfpVar.zza, AdFormat.getAdFormat(((zzfp) atomicReference.get()).zzb));
        zzfulVar.c = str;
        this.s = new hao(zzfulVar);
        this.f = zzftpVar;
    }

    public final void a(final int i) {
        int size;
        zzftp zzftpVar;
        boolean z = true;
        int i2 = 0;
        Preconditions.b(i > 0);
        zzfp zzfpVar = (zzfp) this.e.getAndUpdate(new UnaryOperator() { // from class: lao
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return ((zzfp) obj).zza(i);
            }
        });
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
        int i3 = zzfpVar.zzd;
        Queue queue = this.j;
        synchronized (queue) {
            try {
                size = queue.size();
                if (queue.size() > i) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        while (i2 < i) {
                            zzfuo zzfuoVar = (zzfuo) queue.poll();
                            if (zzfuoVar != null) {
                                arrayList.add(zzfuoVar);
                            }
                            i2++;
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        i2 = arrayList.size();
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z && size > i2 && (zzftpVar = this.f) != null) {
            int i4 = size - i2;
            if (i2 == 0) {
                i4--;
            }
            zzftpVar.c(this, i4);
        }
        zzfuf zzfufVar = this.q;
        if (zzfufVar == null || adFormat == null) {
            return;
        }
        long a = this.r.a();
        String str = ((zzfp) this.e.get()).zza;
        String str2 = new zzful(str, adFormat).c;
        zzeai a2 = zzfufVar.a.a();
        a2.b("action", "cache_resize");
        a2.b("cs_ts", Long.toString(a));
        a2.b("orig_ma", Integer.toString(i3));
        a2.b("max_ads", Integer.toString(i));
        a2.b("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        a2.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, str);
        a2.b("pid", str2);
        a2.b("pv", "1");
        a2.c();
    }

    public final void b(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G)).booleanValue()) {
            Bundle bundle = zzmVar.zzC;
            bundle.putInt("plcs", t());
            bundle.putInt("plbs", s());
            bundle.putString("plid", this.l);
        }
    }

    public final void c(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.p.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new nkn(this, zzeVar));
        }
        this.m.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            d(true);
            return;
        }
        AtomicReference atomicReference = this.e;
        int i2 = ((zzfp) atomicReference.get()).zzb;
        String str = ((zzfp) atomicReference.get()).zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(i2).length() + 26 + 61);
        fn0.s(i2, "Preloading ", ", for adUnitId:", str, sb);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb2 = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzh(sb2);
        this.g.set(false);
        zzftp zzftpVar = this.f;
        if (zzftpVar != null) {
            zzftpVar.a(this);
        }
        String str2 = ((zzfp) atomicReference.get()).zza;
        AdFormat q = q();
        zzfuf zzfufVar = this.q;
        long a = this.r.a();
        int s = s();
        int t = t();
        String g = g();
        zzeai a2 = zzfufVar.a.a();
        a2.b("action", "pftla");
        a2.b("pftlat_ts", Long.toString(a));
        a2.b("pftlaec", Integer.toString(zzeVar.zza));
        a2.b("ad_format", q == null ? "unknown" : q.name().toLowerCase(Locale.ENGLISH));
        a2.b("max_ads", Integer.toString(s));
        a2.b("cache_size", Integer.toString(t));
        a2.b(MolocoMediationAdapter.KEY_AD_UNIT_ID, str2);
        a2.b("pid", this.l);
        a2.b("pv", g);
        a2.c();
    }

    public final void d(boolean z) {
        zzfty zzftyVar = this.k;
        zzftp zzftpVar = this.f;
        if (zzftpVar != null) {
            if (z) {
                zzftyVar.c();
            }
            zzftpVar.a(this);
        } else {
            if (zzftyVar.d()) {
                return;
            }
            if (z) {
                zzftyVar.c();
            }
            this.n.schedule(new jao(this, 0), zzftyVar.b(), TimeUnit.MILLISECONDS);
        }
    }

    public final void e() {
        boolean z;
        int i;
        int i2;
        Queue queue = this.j;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z = false;
                i = 0;
                while (true) {
                    boolean z2 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    zzfuo zzfuoVar = (zzfuo) it.next();
                    if (zzfuoVar.c.a() < zzfuoVar.b + zzfuoVar.d) {
                        z2 = false;
                    }
                    if (z2) {
                        it.remove();
                        i++;
                    }
                }
                if (i > 0 && queue.isEmpty()) {
                    z = true;
                }
                i2 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzftp zzftpVar = this.f;
        if (zzftpVar != null && i > 0) {
            zzftpVar.c(this, i2);
        }
        if (z) {
            f();
        }
    }

    public final void f() {
        if (this.p.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new jao(this, 1));
        }
        this.n.execute(new jao(this, 2));
    }

    public final String g() {
        return true != "none".equals(this.l) ? "2" : "1";
    }

    public abstract blo h(Context context);

    public long i() {
        throw null;
    }

    public abstract com.google.android.gms.ads.internal.client.zzdx j(Object obj);

    public final void k() {
        AtomicBoolean atomicBoolean = this.m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.g.get() || t() >= ((zzfp) this.e.get()).zzd) {
                atomicBoolean.set(false);
            } else {
                this.n.submit(new jao(this, 5));
            }
        }
    }

    public final boolean l() {
        boolean isEmpty;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O)).booleanValue()) {
            this.k.a();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H)).booleanValue() && this.f == null) {
            v();
        } else {
            e();
        }
        Queue queue = this.j;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        return !isEmpty;
    }

    public final Object m() {
        final zzfuo zzfuoVar;
        final boolean z;
        final zzfuo zzfuoVar2;
        Queue queue = this.j;
        final int t = t();
        synchronized (queue) {
            try {
                zzfuoVar = (zzfuo) queue.poll();
                boolean z2 = false;
                if (zzfuoVar != null && queue.isEmpty()) {
                    z2 = true;
                }
                z = z2;
                zzfuoVar2 = (zzfuoVar == null || queue.isEmpty()) ? null : (zzfuo) queue.peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        final long a = this.r.a();
        final int s = s();
        final int t2 = t();
        this.n.submit(new Runnable() { // from class: kao
            @Override // java.lang.Runnable
            public final void run() {
                zzfvd zzfvdVar = zzfvd.this;
                int i = t;
                zzfuo zzfuoVar3 = zzfuoVar;
                zzfuo zzfuoVar4 = zzfuoVar2;
                long j = a;
                int i2 = s;
                int i3 = t2;
                boolean z3 = z;
                if (((Boolean) zzba.zzc().a(zzbjg.Q)).booleanValue()) {
                    if (!((Boolean) zzba.zzc().a(zzbjg.P)).booleanValue()) {
                        zzfvdVar.k.a();
                    } else if (i == 1) {
                        zzfvdVar.k.a();
                    }
                }
                if (zzfuoVar3 != null && zzfuoVar4 != null) {
                    AdFormat adFormat = AdFormat.getAdFormat(((zzfp) zzfvdVar.e.get()).zzb);
                    zzdx j2 = zzfvdVar.j(zzfuoVar3.a);
                    String str = !(j2 instanceof zzddi) ? null : ((zzddi) j2).d;
                    if (adFormat != null && str != null && zzfuoVar4.b < zzfuoVar3.b) {
                        zzfvdVar.q.g("poll_ad", "psvroc_ts", j, i2, i3, str, zzfvdVar.s, zzfvdVar.g());
                    }
                }
                zzftp zzftpVar = zzfvdVar.f;
                if (zzftpVar == null) {
                    long i4 = zzfvdVar.i();
                    if (i4 < 0) {
                        i4 = ((Long) zzba.zzc().a(zzbjg.U)).longValue();
                    }
                    if (i4 > 0) {
                        zzfvdVar.n.schedule(new jao(zzfvdVar, 0), i4, TimeUnit.MILLISECONDS);
                    } else {
                        zzfvdVar.v();
                    }
                } else if (!zzftpVar.i(zzfvdVar)) {
                    if (((Boolean) zzba.zzc().a(zzbjg.Y)).booleanValue()) {
                        zzftpVar.h(zzfvdVar);
                    } else {
                        long i5 = zzfvdVar.i();
                        if (i5 < 0) {
                            i5 = ((Long) zzba.zzc().a(zzbjg.U)).longValue();
                        }
                        if (i5 > 0) {
                            zzftpVar.h(zzfvdVar);
                            synchronized (zzftpVar) {
                                zzftpVar.c = zzftpVar.f.schedule(new cao(zzftpVar, 4), i5, TimeUnit.MILLISECONDS);
                            }
                        } else {
                            zzftpVar.a(zzfvdVar);
                        }
                    }
                }
                if (z3) {
                    zzfvdVar.f();
                }
            }
        });
        if (zzfuoVar == null) {
            return null;
        }
        return zzfuoVar.a;
    }

    public final void n() {
        this.g.set(true);
        this.p.set(true);
        zzftp zzftpVar = this.f;
        if (zzftpVar != null) {
            zzftpVar.c(this, 0);
        } else {
            this.n.submit(new jao(this, 0));
        }
    }

    public final String o() {
        zzfuo zzfuoVar;
        Queue queue = this.j;
        synchronized (queue) {
            zzfuoVar = (zzfuo) queue.peek();
        }
        Object obj = zzfuoVar == null ? null : zzfuoVar.a;
        com.google.android.gms.ads.internal.client.zzdx j = obj == null ? null : j(obj);
        if (j instanceof zzddi) {
            return ((zzddi) j).d;
        }
        return null;
    }

    public final void p(int i) {
        Preconditions.b(i >= 5);
        zzfty zzftyVar = this.k;
        synchronized (zzftyVar) {
            Preconditions.b(i > 0);
            zzftyVar.d = i;
        }
    }

    public final AdFormat q() {
        return AdFormat.getAdFormat(((zzfp) this.e.get()).zzb);
    }

    public final String r() {
        return ((zzfp) this.e.get()).zza;
    }

    public final int s() {
        return ((zzfp) this.e.get()).zzd;
    }

    public final int t() {
        int size;
        Queue queue = this.j;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean u() {
        long a;
        long j;
        if (!this.g.get() || this.m.get() || t() >= s()) {
            return false;
        }
        zzfty zzftyVar = this.k;
        synchronized (zzftyVar) {
            a = zzftyVar.f.a();
            j = zzftyVar.e;
        }
        return a >= j && !zzftyVar.d();
    }

    public final void v() {
        e();
        AtomicBoolean atomicBoolean = this.m;
        if (atomicBoolean.compareAndSet(false, true)) {
            if (!this.g.get() || t() >= ((zzfp) this.e.get()).zzd) {
                atomicBoolean.set(false);
            } else {
                w();
            }
        }
    }

    public final void w() {
        blo h;
        Activity d = com.google.android.gms.ads.internal.zzt.zzg().d();
        if (d == null) {
            String valueOf = String.valueOf(((zzfp) this.e.get()).zza);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Empty activity context at preloading: ".concat(valueOf));
            h = h(this.b);
        } else {
            h = h(d);
        }
        h.addListener(new vlo(0, h, new fjn(this, 18)), this.n);
    }

    public zzfvd(String str, ClientApi clientApi, Context context, int i, zzfms zzfmsVar, zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock, zzftp zzftpVar) {
        this(str, clientApi, context, i, zzfmsVar, zzfpVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock, zzftpVar);
        this.i = zzceVar;
    }

    public zzfvd(ClientApi clientApi, Context context, int i, zzfms zzfmsVar, zzfp zzfpVar, zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock) {
        this("none", clientApi, context, i, zzfmsVar, zzfpVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock, null);
        this.h = zzcbVar;
    }
}
