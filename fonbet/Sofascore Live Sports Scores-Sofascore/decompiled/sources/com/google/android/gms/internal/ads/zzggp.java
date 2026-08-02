package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ddb;
import defpackage.emo;
import defpackage.yco;
import defpackage.zco;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzggp implements zzggk, zzggg, zzggv {
    public static final zzbdy u;
    public final Context a;
    public final zzgfo b;
    public final ExecutorService c;
    public final zzgfh d;
    public final boolean e;
    public final String f;
    public final long g;
    public final long h;
    public final double i;
    public final String j;
    public final long k;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final Object m = new Object();
    public final Object n = new Object();
    public final Object o = new Object();
    public final zzaxd p = zzaxe.D();
    public final ArrayList q = new ArrayList();
    public boolean r = false;
    public final HashMap s = new HashMap();
    public final int t;

    static {
        zzbdx D = zzbdy.D();
        D.n();
        ((zzbdy) D.b).E(17);
        u = (zzbdy) D.o();
    }

    public zzggp(Context context, zzgfo zzgfoVar, ExecutorService executorService, zzgfh zzgfhVar, Random random, String str, long j, long j2, double d, String str2, int i, long j3) {
        this.a = context;
        this.b = zzgfoVar;
        this.c = executorService;
        this.d = zzgfhVar;
        this.f = str;
        this.g = j;
        this.h = j2;
        this.i = d;
        this.j = str2;
        this.t = i;
        this.k = j3;
        this.e = random.nextDouble() < d;
    }

    @Override // com.google.android.gms.internal.ads.zzggv
    public final void a(zzggu zzgguVar) {
        synchronized (this.m) {
            zzaxd zzaxdVar = this.p;
            String zza = zzgguVar.zza();
            zzaxdVar.n();
            ((zzaxe) zzaxdVar.b).N(zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggv
    public final void b(zzifu zzifuVar) {
        synchronized (this.m) {
            zzaxd zzaxdVar = this.p;
            zzaxdVar.n();
            ((zzaxe) zzaxdVar.b).Q(zzifuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggk
    public final void c(int i, long j, String str, Throwable th) {
        long longValue;
        if (this.e) {
            synchronized (this.n) {
                try {
                    ArrayList arrayList = this.q;
                    synchronized (this.o) {
                        try {
                            HashMap hashMap = this.s;
                            Integer valueOf = Integer.valueOf(i);
                            Long l = (Long) hashMap.get(valueOf);
                            if (l == null) {
                                l = 0L;
                            }
                            longValue = 1 + l.longValue();
                            hashMap.put(valueOf, Long.valueOf(longValue));
                        } finally {
                        }
                    }
                    arrayList.add(new yco(i, j, th, str, longValue));
                    if (!this.r) {
                        this.r = true;
                        this.b.a(this.h, new zco(this, 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void d(zzaxe zzaxeVar) {
        try {
            zzbef D = zzbeg.D();
            zzbdy zzbdyVar = u;
            D.n();
            ((zzbeg) D.b).F(zzbdyVar);
            zzbed D2 = zzbee.D();
            D2.n();
            ((zzbee) D2.b).E(zzaxeVar);
            zzbee zzbeeVar = (zzbee) D2.o();
            D.n();
            ((zzbeg) D.b).E(zzbeeVar);
            this.d.a(this.f, ((zzbeg) D.o()).d());
        } catch (RuntimeException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggg
    public final ddb zza() {
        emo emoVar = new emo(Executors.callable(new zco(this, 0), null));
        this.c.execute(emoVar);
        return emoVar;
    }
}
