package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzfp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import defpackage.bnn;
import defpackage.c2a;
import defpackage.hao;
import defpackage.jao;
import defpackage.wmn;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfud extends zzcg {
    public final zzfuj a;
    public final zzftu b;

    public zzfud(zzfuj zzfujVar, zzftu zzftuVar) {
        this.a = zzfujVar;
        this.b = zzftuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00dc, code lost:
    
        r0.put((java.util.EnumMap) r4, (com.google.android.gms.ads.AdFormat) java.lang.Integer.valueOf(((java.lang.Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(r0, r4, 0)).intValue() + 1));
        r2.a(r2.zzd, r11.h.a(), new defpackage.hao(new com.google.android.gms.internal.ads.zzful(r3, r4)), "1");
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x009e A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:7:0x0089, B:8:0x0098, B:10:0x009e, B:15:0x00b6, B:17:0x00ba, B:18:0x00c1, B:19:0x00ca, B:22:0x00db, B:23:0x00dc, B:30:0x010e, B:35:0x010f, B:38:0x000e, B:40:0x0012, B:55:0x0032, B:56:0x0037, B:58:0x003b, B:59:0x007d, B:61:0x0053, B:64:0x005f, B:42:0x0013, B:48:0x0017, B:44:0x002f, B:51:0x0028, B:21:0x00cb), top: B:3:0x0003, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x003b A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0003, B:7:0x0089, B:8:0x0098, B:10:0x009e, B:15:0x00b6, B:17:0x00ba, B:18:0x00c1, B:19:0x00ca, B:22:0x00db, B:23:0x00dc, B:30:0x010e, B:35:0x010f, B:38:0x000e, B:40:0x0012, B:55:0x0032, B:56:0x0037, B:58:0x003b, B:59:0x007d, B:61:0x0053, B:64:0x005f, B:42:0x0013, B:48:0x0017, B:44:0x002f, B:51:0x0028, B:21:0x00cb), top: B:3:0x0003, inners: #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.ads.internal.client.zzch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(List list, zzcb zzcbVar) {
        Iterator it;
        zzfuj zzfujVar = this.a;
        synchronized (zzfujVar) {
            try {
                if (!zzfujVar.g.getAndSet(true)) {
                    if (zzfujVar.f == null) {
                        synchronized (zzfujVar) {
                            if (zzfujVar.f == null) {
                                try {
                                    zzfujVar.f = (ConnectivityManager) zzfujVar.e.getSystemService("connectivity");
                                } catch (ClassCastException e) {
                                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                                    zzo.zzj("Failed to get connectivity manager", e);
                                }
                            }
                        }
                    }
                    if (zzfujVar.f != null) {
                        zzfujVar.i = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L)).intValue());
                    } else {
                        try {
                            zzfujVar.f.registerDefaultNetworkCallback(new c2a(zzfujVar));
                        } catch (RuntimeException e2) {
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzj("Failed to register network callback", e2);
                            zzfujVar.i = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L)).intValue());
                        }
                    }
                    com.google.android.gms.ads.internal.zzt.zzg().b(new wmn(zzfujVar));
                }
                ArrayList d = zzfujVar.d(list);
                EnumMap enumMap = new EnumMap(AdFormat.class);
                it = d.iterator();
                while (it.hasNext()) {
                    zzfp zzfpVar = (zzfp) it.next();
                    String str = zzfpVar.zza;
                    AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
                    zzfvd a = zzfujVar.c.a(zzfpVar, zzcbVar);
                    if (adFormat != null && a != null) {
                        AtomicInteger atomicInteger = zzfujVar.i;
                        if (atomicInteger != null) {
                            a.p(atomicInteger.get());
                        }
                        zzfuf zzfufVar = zzfujVar.d;
                        a.q = zzfufVar;
                        String a2 = zzfuj.a(str, adFormat);
                        synchronized (zzfujVar) {
                            a.n.submit(new jao(a, 0));
                            zzfujVar.a.put(a2, a);
                        }
                    }
                }
                zzfujVar.d.b(enumMap, zzfujVar.h.a());
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zzfujVar.f != null) {
        }
        com.google.android.gms.ads.internal.zzt.zzg().b(new wmn(zzfujVar));
        ArrayList d2 = zzfujVar.d(list);
        EnumMap enumMap2 = new EnumMap(AdFormat.class);
        it = d2.iterator();
        while (it.hasNext()) {
        }
        zzfujVar.d.b(enumMap2, zzfujVar.h.a());
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) {
        boolean e;
        zzfuj zzfujVar = this.a;
        synchronized (zzfujVar) {
            e = zzfujVar.e(str, AdFormat.REWARDED);
        }
        return e;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzg(String str) {
        zzcda zzcdaVar;
        zzfuj zzfujVar = this.a;
        synchronized (zzfujVar) {
            zzcdaVar = (zzcda) zzfujVar.f(AdFormat.REWARDED, zzcda.class, str);
        }
        return zzcdaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) {
        boolean e;
        zzfuj zzfujVar = this.a;
        synchronized (zzfujVar) {
            e = zzfujVar.e(str, AdFormat.APP_OPEN_AD);
        }
        return e;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzi(String str) {
        zzbgz zzbgzVar;
        zzfuj zzfujVar = this.a;
        synchronized (zzfujVar) {
            zzbgzVar = (zzbgz) zzfujVar.f(AdFormat.APP_OPEN_AD, zzbgz.class, str);
        }
        return zzbgzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) {
        boolean e;
        zzfuj zzfujVar = this.a;
        synchronized (zzfujVar) {
            e = zzfujVar.e(str, AdFormat.INTERSTITIAL);
        }
        return e;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzbu zzk(String str) {
        com.google.android.gms.ads.internal.client.zzbu zzbuVar;
        zzfuj zzfujVar = this.a;
        synchronized (zzfujVar) {
            zzbuVar = (com.google.android.gms.ads.internal.client.zzbu) zzfujVar.f(AdFormat.INTERSTITIAL, com.google.android.gms.ads.internal.client.zzbu.class, str);
        }
        return zzbuVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016b  */
    @Override // com.google.android.gms.ads.internal.client.zzch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzm(String str, zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        zzfvd zzfvdVar;
        HashMap hashMap;
        boolean z;
        zzfvd zzfucVar;
        int zzT;
        String str2 = str;
        zzfp zzfpVar2 = zzfpVar;
        zzftu zzftuVar = this.b;
        if (!zzftuVar.f.getAndSet(true)) {
            if (zzftuVar.e == null) {
                synchronized (zzftuVar) {
                    if (zzftuVar.e == null) {
                        try {
                            zzftuVar.e = (ConnectivityManager) zzftuVar.d.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (zzftuVar.e == null) {
                zzftuVar.h = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L)).intValue());
            } else {
                try {
                    zzftuVar.e.registerDefaultNetworkCallback(new c2a(zzftuVar));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzj("Failed to register network callback", e2);
                    zzftuVar.h = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().b(new wmn(zzftuVar));
        }
        AdFormat adFormat = AdFormat.getAdFormat(zzfpVar2.zzb);
        if (adFormat != null) {
            HashMap hashMap2 = zzftuVar.a;
            synchronized (hashMap2) {
                try {
                    if (hashMap2.containsKey(adFormat)) {
                        if (!((Map) hashMap2.get(adFormat)).containsKey(str2)) {
                            if (zzftuVar.c(adFormat)) {
                                if (zzfpVar2.zze) {
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T)).booleanValue() && (zzT = zzftuVar.j.zzT()) > 0) {
                                        zzfpVar2 = zzfpVar2.zza(zzT);
                                    }
                                }
                                zzfp zzfpVar3 = zzfpVar2;
                                zzfve zzfveVar = zzftuVar.b;
                                VersionInfoParcel versionInfoParcel = zzfveVar.b;
                                AdFormat adFormat2 = AdFormat.getAdFormat(zzfpVar3.zzb);
                                if (adFormat2 != null) {
                                    int ordinal = adFormat2.ordinal();
                                    if (ordinal == 1) {
                                        hashMap = hashMap2;
                                        str2 = str;
                                        zzfucVar = new zzfuc(str2, zzfveVar.e, zzfveVar.a, versionInfoParcel.clientJarVersion, zzfveVar.f, zzfpVar3, zzceVar, zzfveVar.c, zzfveVar.d, zzfveVar.b(), zzfveVar.g, zzfveVar.h);
                                    } else if (ordinal == 2) {
                                        hashMap = hashMap2;
                                        str2 = str;
                                        zzfucVar = new zzfvi(str2, zzfveVar.e, zzfveVar.a, versionInfoParcel.clientJarVersion, zzfveVar.f, zzfpVar3, zzceVar, zzfveVar.c, zzfveVar.d, zzfveVar.b(), zzfveVar.g, zzfveVar.h);
                                    } else if (ordinal == 5) {
                                        hashMap = hashMap2;
                                        zzfucVar = new zzftx(str2, zzfveVar.e, zzfveVar.a, versionInfoParcel.clientJarVersion, zzfveVar.f, zzfpVar3, zzceVar, zzfveVar.c, zzfveVar.d, zzfveVar.b(), zzfveVar.g, zzfveVar.h);
                                        str2 = str;
                                    }
                                    zzfvdVar = zzfucVar;
                                    if (zzfvdVar == null) {
                                        AtomicInteger atomicInteger = zzftuVar.h;
                                        if (atomicInteger != null) {
                                            zzfvdVar.p(atomicInteger.get());
                                        }
                                        zzfuf zzfufVar = zzftuVar.c;
                                        zzfvdVar.q = zzfufVar;
                                        synchronized (hashMap) {
                                            if (!((Map) hashMap.get(adFormat)).containsKey(str2) && zzftuVar.c(adFormat)) {
                                                ((Map) hashMap.get(adFormat)).put(str2, zzfvdVar);
                                                zzftp zzftpVar = zzftuVar.i;
                                                if (zzftpVar != null) {
                                                    LinkedHashMap linkedHashMap = zzftpVar.d;
                                                    String g = zzftp.g(str2, adFormat);
                                                    synchronized (linkedHashMap) {
                                                        if (!linkedHashMap.containsKey(g)) {
                                                            linkedHashMap.put(g, zzfvdVar);
                                                            zzftpVar.f.execute(new bnn(21, zzftpVar, zzfvdVar));
                                                        }
                                                    }
                                                } else {
                                                    zzfvdVar.n.submit(new jao(zzfvdVar, 0));
                                                }
                                                zzful zzfulVar = new zzful(zzfpVar3.zza, adFormat);
                                                zzfulVar.c = str2;
                                                zzfufVar.a(zzfpVar3.zzd, zzftuVar.g.a(), new hao(zzfulVar), "2");
                                                return true;
                                            }
                                            z = false;
                                        }
                                    } else {
                                        z = false;
                                    }
                                }
                                zzfvdVar = null;
                                hashMap = hashMap2;
                                if (zzfvdVar == null) {
                                }
                            }
                        }
                    }
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    }
                }
            }
            return z;
        }
        z = false;
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        zzftu zzftuVar = this.b;
        Clock clock = zzftuVar.g;
        long a = clock.a();
        HashMap hashMap = zzftuVar.a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(adFormat)) {
                    return false;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) hashMap.get(adFormat)).get(str);
                hao haoVar = null;
                String o = zzfvdVar == null ? null : zzfvdVar.o();
                boolean z = o != null && adFormat.equals(zzfvdVar.q());
                Long valueOf = z ? Long.valueOf(clock.a()) : null;
                if (zzfvdVar != null) {
                    zzful zzfulVar = new zzful(zzfvdVar.r(), adFormat);
                    zzfulVar.c = str;
                    haoVar = new hao(zzfulVar);
                }
                zzftuVar.c.c(zzfvdVar == null ? 0 : zzfvdVar.s(), zzfvdVar != null ? zzfvdVar.t() : 0, a, valueOf, o, haoVar, "2");
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final com.google.android.gms.ads.internal.client.zzbu zzo(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) this.b.b(AdFormat.INTERSTITIAL, com.google.android.gms.ads.internal.client.zzbu.class, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgz zzp(String str) {
        return (zzbgz) this.b.b(AdFormat.APP_OPEN_AD, zzbgz.class, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzcda zzq(String str) {
        return (zzcda) this.b.b(AdFormat.REWARDED, zzcda.class, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat != null) {
            zzftu zzftuVar = this.b;
            HashMap hashMap = zzftuVar.a;
            synchronized (hashMap) {
                try {
                    if (!hashMap.containsKey(adFormat)) {
                        return null;
                    }
                    zzfvd zzfvdVar = (zzfvd) ((Map) hashMap.get(adFormat)).get(str);
                    zzftuVar.c.f("pgc", zzftuVar.g.a(), str, zzfvdVar == null ? null : zzfvdVar.r(), adFormat, zzfvdVar == null ? -1 : zzfvdVar.s(), zzfvdVar != null ? zzfvdVar.t() : -1, 1);
                    if (zzfvdVar != null) {
                        return (zzfp) zzfvdVar.e.get();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i) {
        zzftu zzftuVar = this.b;
        zzftuVar.getClass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = zzftuVar.a;
        AdFormat adFormat = AdFormat.getAdFormat(i);
        synchronized (hashMap2) {
            if (adFormat != null) {
                try {
                    if (hashMap2.containsKey(adFormat)) {
                        for (zzfvd zzfvdVar : ((Map) hashMap2.get(adFormat)).values()) {
                            hashMap.put(zzfvdVar.l, (zzfp) zzfvdVar.e.get());
                        }
                        zzftuVar.c.f("pgcs", zzftuVar.g.a(), null, null, adFormat, -1, -1, hashMap.size());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            zzfp zzfpVar = (zzfp) entry.getValue();
            Parcel obtain = Parcel.obtain();
            zzfpVar.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            bundle.putByteArray(str, marshall);
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return 0;
        }
        zzftu zzftuVar = this.b;
        HashMap hashMap = zzftuVar.a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(adFormat)) {
                    return 0;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) hashMap.get(adFormat)).get(str);
                int t = zzfvdVar != null ? zzfvdVar.t() : 0;
                zzftuVar.c.f("pnav", zzftuVar.g.a(), str, zzfvdVar == null ? null : zzfvdVar.r(), adFormat, zzfvdVar == null ? -1 : zzfvdVar.s(), t, 1);
                return t;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return false;
        }
        zzftu zzftuVar = this.b;
        HashMap hashMap = zzftuVar.a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(adFormat)) {
                    return false;
                }
                zzfvd zzfvdVar = (zzfvd) ((Map) hashMap.get(adFormat)).remove(str);
                if (zzfvdVar == null) {
                    return false;
                }
                zzfvdVar.g.set(false);
                zzfvdVar.p.set(false);
                zzftp zzftpVar = zzftuVar.i;
                if (zzftpVar != null) {
                    zzftpVar.d(zzfvdVar);
                }
                int t = zzfvdVar.t();
                Queue queue = zzfvdVar.j;
                synchronized (queue) {
                    queue.clear();
                }
                zzftuVar.c.f("pd", zzftuVar.g.a(), str, zzfvdVar.r(), adFormat, zzfvdVar.s(), t, 1);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) {
        zzftu zzftuVar = this.b;
        zzftuVar.getClass();
        AdFormat adFormat = AdFormat.getAdFormat(i);
        if (adFormat == null) {
            return;
        }
        HashMap hashMap = zzftuVar.a;
        synchronized (hashMap) {
            try {
                if (hashMap.containsKey(adFormat)) {
                    Map map = (Map) hashMap.get(adFormat);
                    int size = map.size();
                    if (size == 0) {
                        return;
                    }
                    zzgxm x = zzgxm.x(map.values());
                    map.clear();
                    int size2 = x.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        zzfvd zzfvdVar = (zzfvd) x.get(i2);
                        if (zzfvdVar != null) {
                            zzfvdVar.g.set(false);
                            zzfvdVar.p.set(false);
                            zzftp zzftpVar = zzftuVar.i;
                            if (zzftpVar != null) {
                                zzftpVar.d(zzfvdVar);
                            }
                            Queue queue = zzfvdVar.j;
                            synchronized (queue) {
                                queue.clear();
                            }
                            String valueOf = String.valueOf(zzfvdVar.l);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzh("Destroyed ad preloader for preloadId: ".concat(valueOf));
                        }
                    }
                    String concat = "Destroyed all ad preloaders for ad format: ".concat(adFormat.toString());
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzh(concat);
                    zzftuVar.c.f("pda", zzftuVar.g.a(), null, null, adFormat, -1, -1, size);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbvu zzbvuVar) {
    }
}
