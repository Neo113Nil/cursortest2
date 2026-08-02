package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfst {
    private final zzftm zzc;
    private final zzfsp zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    zzfst(zzftm zzftmVar, zzfsp zzfspVar, Context context, Clock clock) {
        this.zzc = zzftmVar;
        this.zzd = zzfspVar;
        this.zze = context;
        this.zzh = clock;
    }

    static String zzh(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append("#");
        sb.append(name);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzy)).booleanValue()) {
            zzj(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z) {
        if (z) {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                ((zzftl) it.next()).zzj();
            }
        } else {
            Iterator it2 = this.zza.values().iterator();
            while (it2.hasNext()) {
                ((zzftl) it2.next()).zzi();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzB)).booleanValue() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzfp zzfpVar = (com.google.android.gms.ads.internal.client.zzfp) it.next();
            String zzh = zzh(zzfpVar.zza, AdFormat.getAdFormat(zzfpVar.zzb));
            hashSet.add(zzh);
            ConcurrentMap concurrentMap = this.zza;
            zzftl zzftlVar = (zzftl) concurrentMap.get(zzh);
            if (zzftlVar == null) {
                ConcurrentMap concurrentMap2 = this.zzb;
                if (concurrentMap2.containsKey(zzh)) {
                    zzftl zzftlVar2 = (zzftl) concurrentMap2.get(zzh);
                    if (zzftlVar2.zze.equals(zzfpVar)) {
                        zzftlVar2.zzw(zzfpVar.zzd);
                        zzftlVar2.zzj();
                        concurrentMap.put(zzh, zzftlVar2);
                        concurrentMap2.remove(zzh);
                    } else {
                        arrayList.add(zzfpVar);
                    }
                } else {
                    arrayList.add(zzfpVar);
                }
            } else if (zzftlVar.zze.equals(zzfpVar)) {
                zzftlVar.zzw(zzfpVar.zzd);
            } else {
                this.zzb.put(zzh, zzftlVar);
                concurrentMap.remove(zzh);
                arrayList.add(zzfpVar);
            }
        }
        Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains((String) entry.getKey())) {
                this.zzb.put((String) entry.getKey(), (zzftl) entry.getValue());
                it2.remove();
            }
        }
        Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            zzftl zzftlVar3 = (zzftl) ((Map.Entry) it3.next()).getValue();
            zzftlVar3.zzh();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzA)).booleanValue()) {
            }
            zzftlVar3.zzr();
            if (!zzftlVar3.zzf()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzftl zzftlVar) {
        zzftlVar.zzd();
        this.zza.put(str, zzftlVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z;
        Clock clock = this.zzh;
        long currentTimeMillis = clock.currentTimeMillis();
        zzftl zzq = zzq(str, adFormat);
        int i = 0;
        z = zzq != null && zzq.zzf();
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        zzfsw zzfswVar = new zzfsw(new zzfsv(str, adFormat), null);
        zzfsp zzfspVar = this.zzd;
        int i2 = zzq == null ? 0 : zzq.zze.zzd;
        if (zzq != null) {
            i = zzq.zzp();
        }
        zzfspVar.zzd(i2, i, currentTimeMillis, valueOf, zzq != null ? zzq.zzk() : null, zzfswVar, "1");
        return z;
    }

    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfsw zzfswVar = new zzfsw(new zzfsv(str, adFormat), null);
        zzfsp zzfspVar = this.zzd;
        Clock clock = this.zzh;
        zzfspVar.zzf(clock.currentTimeMillis(), zzfswVar, -1, -1, "1");
        zzftl zzq = zzq(str, adFormat);
        if (zzq == null) {
            return null;
        }
        try {
            String zzk = zzq.zzk();
            Object zzg = zzq.zzg();
            Object cast = zzg == null ? null : cls.cast(zzg);
            if (cast != null) {
                zzfspVar.zzh(clock.currentTimeMillis(), zzq.zze.zzd, zzq.zzp(), zzk, zzfswVar, "1");
            }
            return cast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PreloadAdManager.pollAd");
            String name = cls.getName();
            String.valueOf(name);
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(name)), e);
            return null;
        }
    }

    private final synchronized zzftl zzq(String str, AdFormat adFormat) {
        return (zzftl) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        if (!this.zzg.getAndSet(true)) {
            if (this.zzf == null) {
                synchronized (this) {
                    if (this.zzf == null) {
                        try {
                            this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                        } catch (ClassCastException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzH)).intValue());
            } else {
                try {
                    this.zzf.registerDefaultNetworkCallback(new zzfss(this));
                } catch (RuntimeException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzH)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfsr(this));
        }
        List<com.google.android.gms.ads.internal.client.zzfp> zzm = zzm(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzfp zzfpVar : zzm) {
            String str = zzfpVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzfpVar.zzb);
            zzftl zza = this.zzc.zza(zzfpVar, zzcbVar);
            if (adFormat != null && zza != null) {
                AtomicInteger atomicInteger = this.zzi;
                if (atomicInteger != null) {
                    zza.zzm(atomicInteger.get());
                }
                zzfsp zzfspVar = this.zzd;
                zza.zzl(zzfspVar);
                zzn(zzh(str, adFormat), zza);
                enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                zzfspVar.zza(zzfpVar.zzd, this.zzh.currentTimeMillis(), new zzfsw(new zzfsv(str, adFormat), null), "1");
            }
        }
        this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    public final synchronized zzcbw zzc(String str) {
        return (zzcbw) zzp(zzcbw.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized zzbfx zze(String str) {
        return (zzbfx) zzp(zzbfx.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbu zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbu) zzp(com.google.android.gms.ads.internal.client.zzbu.class, str, AdFormat.INTERSTITIAL);
    }
}
