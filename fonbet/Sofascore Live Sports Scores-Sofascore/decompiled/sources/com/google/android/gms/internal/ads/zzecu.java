package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzeau;
import com.google.android.gms.internal.ads.zzecu;
import defpackage.ddb;
import defpackage.ewm;
import defpackage.hsn;
import defpackage.vlo;
import defpackage.wjn;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzecu {
    public final Context f;
    public final WeakReference g;
    public final zzdya h;
    public final hsn i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final zzeau l;
    public final VersionInfoParcel m;
    public final zzdkv o;
    public final zzfrj p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final zzcgo e = new zzcgo();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public boolean q = true;
    public final long d = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();

    public zzecu(Executor executor, Context context, WeakReference weakReference, hsn hsnVar, zzdya zzdyaVar, ScheduledExecutorService scheduledExecutorService, zzeau zzeauVar, VersionInfoParcel versionInfoParcel, zzdkv zzdkvVar, zzfrj zzfrjVar) {
        this.h = zzdyaVar;
        this.f = context;
        this.g = weakReference;
        this.i = hsnVar;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = zzeauVar;
        this.m = versionInfoParcel;
        this.o = zzdkvVar;
        this.p = zzfrjVar;
        d(0, "com.google.android.gms.ads.MobileAds", "", false);
    }

    public final void a() {
        final int i = 0;
        final int i2 = 1;
        if (!((Boolean) zzbln.a.c()).booleanValue()) {
            if (this.m.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.D2)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.a) {
                            return;
                        }
                        this.l.d();
                        this.o.zze();
                        zzcgo zzcgoVar = this.e;
                        Runnable runnable = new Runnable(this) { // from class: b3o
                            public final /* synthetic */ zzecu b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i) {
                                    case 0:
                                        zzecu zzecuVar = this.b;
                                        zzeau zzeauVar = zzecuVar.l;
                                        synchronized (zzeauVar) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(zzbjg.P2)).booleanValue() && !zzeauVar.d) {
                                                    HashMap e = zzeauVar.e();
                                                    e.put("action", "init_finished");
                                                    ArrayList arrayList = zzeauVar.b;
                                                    arrayList.add(e);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        zzeauVar.f.b((Map) it.next());
                                                    }
                                                    zzeauVar.d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        zzecuVar.o.zzf();
                                        zzecuVar.b = true;
                                        return;
                                    default:
                                        zzecu zzecuVar2 = this.b;
                                        synchronized (zzecuVar2) {
                                            try {
                                                if (zzecuVar2.c) {
                                                    return;
                                                }
                                                zzecuVar2.d((int) (zzt.zzk().elapsedRealtime() - zzecuVar2.d), "com.google.android.gms.ads.MobileAds", "Timeout.", false);
                                                zzecuVar2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzecuVar2.o.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzecuVar2.e.zzd(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        };
                        hsn hsnVar = this.i;
                        zzcgoVar.addListener(runnable, hsnVar);
                        this.a = true;
                        ddb c = c();
                        this.k.schedule(new Runnable(this) { // from class: b3o
                            public final /* synthetic */ zzecu b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        zzecu zzecuVar = this.b;
                                        zzeau zzeauVar = zzecuVar.l;
                                        synchronized (zzeauVar) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(zzbjg.P2)).booleanValue() && !zzeauVar.d) {
                                                    HashMap e = zzeauVar.e();
                                                    e.put("action", "init_finished");
                                                    ArrayList arrayList = zzeauVar.b;
                                                    arrayList.add(e);
                                                    Iterator it = arrayList.iterator();
                                                    while (it.hasNext()) {
                                                        zzeauVar.f.b((Map) it.next());
                                                    }
                                                    zzeauVar.d = true;
                                                }
                                            } finally {
                                            }
                                        }
                                        zzecuVar.o.zzf();
                                        zzecuVar.b = true;
                                        return;
                                    default:
                                        zzecu zzecuVar2 = this.b;
                                        synchronized (zzecuVar2) {
                                            try {
                                                if (zzecuVar2.c) {
                                                    return;
                                                }
                                                zzecuVar2.d((int) (zzt.zzk().elapsedRealtime() - zzecuVar2.d), "com.google.android.gms.ads.MobileAds", "Timeout.", false);
                                                zzecuVar2.l.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzecuVar2.o.c("com.google.android.gms.ads.MobileAds", "timeout");
                                                zzecuVar2.e.zzd(new Exception());
                                                return;
                                            } finally {
                                            }
                                        }
                                }
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.F2)).longValue(), TimeUnit.SECONDS);
                        c.addListener(new vlo(i, c, new ewm(this)), hsnVar);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.a) {
            return;
        }
        d(0, "com.google.android.gms.ads.MobileAds", "", true);
        this.e.zzc(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.n;
        for (String str : concurrentHashMap.keySet()) {
            zzbsh zzbshVar = (zzbsh) concurrentHashMap.get(str);
            arrayList.add(new zzbsh(zzbshVar.c, str, zzbshVar.d, zzbshVar.b));
        }
        return arrayList;
    }

    public final synchronized ddb c() {
        String str = com.google.android.gms.ads.internal.zzt.zzh().g().zzi().e;
        if (!TextUtils.isEmpty(str)) {
            return zzhcy.a(str);
        }
        zzcgo zzcgoVar = new zzcgo();
        com.google.android.gms.ads.internal.zzt.zzh().g().zzk(new wjn(14, this, zzcgoVar));
        return zzcgoVar;
    }

    public final void d(int i, String str, String str2, boolean z) {
        this.n.put(str, new zzbsh(i, str, str2, z));
    }
}
