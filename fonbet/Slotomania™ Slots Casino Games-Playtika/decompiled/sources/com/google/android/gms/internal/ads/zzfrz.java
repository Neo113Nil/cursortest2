package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfrz {
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzfsp zzg;
    private final Clock zzh;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    final Map zza = new LinkedHashMap();
    final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzfrz(com.google.android.gms.ads.internal.util.zzg zzgVar, ScheduledExecutorService scheduledExecutorService, zzfsp zzfspVar, Clock clock) {
        this.zzc = zzgVar;
        this.zzf = scheduledExecutorService;
        this.zzg = zzfspVar;
        this.zzh = clock;
    }

    private final boolean zzA(zzftl zzftlVar) {
        if (this.zzd.get() || zzftlVar.zzp() != 0 || !zzftlVar.zzq()) {
            return false;
        }
        zzftlVar.zze();
        return true;
    }

    private final int zzq() {
        int zzR = this.zzc.zzR();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzO)).booleanValue() && zzR > 0) {
            return zzR;
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzY)).intValue();
    }

    private static String zzr(String str, AdFormat adFormat) {
        return String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, str, adFormat);
    }

    private final void zzs(final zzftl zzftlVar) {
        if (zzftlVar.zzp() > 0 || zzftlVar.zzs()) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfrz.this.zzi(zzftlVar);
                }
            });
        }
        this.zzd.set(true);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
        }
        this.zzb.set(true);
    }

    private final boolean zzt(zzftl zzftlVar) {
        boolean z;
        AdFormat zzo = zzftlVar.zzo();
        if (zzo == null) {
            return true;
        }
        Map map = this.zza;
        synchronized (map) {
            z = !map.containsKey(zzr(zzftlVar.zzn(), zzo));
        }
        return z;
    }

    private final boolean zzu() {
        zzgvz zzq;
        Map map = this.zza;
        synchronized (map) {
            zzq = zzgvz.zzq(map.values());
        }
        int size = zzq.size();
        for (int i = 0; i < size; i++) {
            zzftl zzftlVar = (zzftl) zzq.get(i);
            if (zzftlVar.zzp() == 0 && zzftlVar.zzq()) {
                return true;
            }
        }
        return false;
    }

    private final void zzv(long j) {
        if (this.zzb.compareAndSet(false, true)) {
            synchronized (this) {
                if (j > 0) {
                    this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrt
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfrz.this.zzl();
                        }
                    }, j, TimeUnit.MILLISECONDS);
                } else {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrs
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfrz.this.zzk();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzn() {
        zzftl zzftlVar;
        zzgvz zzq;
        if (this.zzd.get()) {
            return;
        }
        synchronized (this) {
            zzftlVar = null;
            this.zze = null;
        }
        int zzq2 = zzq();
        if (zzg() < zzq2 || zzu()) {
            Map map = this.zza;
            synchronized (map) {
                zzq = zzgvz.zzq(map.values());
            }
            int size = zzq.size();
            double d = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                zzftl zzftlVar2 = (zzftl) zzq.get(i);
                if (zzftlVar2.zzq()) {
                    double zzp = zzftlVar2.zzp() / zzftlVar2.zze.zzd;
                    if (zzp < d) {
                        d = zzp;
                    }
                    if (zzp < d) {
                        zzftlVar = zzftlVar2;
                    }
                }
            }
            if (zzftlVar != null) {
                zzftlVar.zze();
                if (zzftlVar.zzp() > 0) {
                    this.zzg.zzq(this.zzh.currentTimeMillis(), zzftlVar.zzn(), zzftlVar.zze.zza, zzftlVar.zzo(), zzftlVar.zze.zzd, zzftlVar.zzp(), zzg(), zzq2);
                }
            }
            if (zzg() >= zzq2) {
                zzy();
            }
            if (zzg() < zzq2 || zzu()) {
                if (zzu()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfru
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfrz.this.zzm();
                        }
                    });
                    return;
                }
                synchronized (this) {
                    this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfrz.this.zzn();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaa)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            zzy();
        }
        this.zzb.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzx, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        this.zzd.set(false);
        zzn();
    }

    private final void zzy() {
        int size;
        Map map = this.zza;
        synchronized (map) {
            size = map.size();
        }
        this.zzg.zzs(this.zzh.currentTimeMillis(), zzq(), size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzj(zzftl zzftlVar, int i) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzftlVar.zzn(), zzftlVar.zze.zza, zzftlVar.zzo(), zzftlVar.zze.zzd, zzftlVar.zzp(), i, zzg(), zzq());
    }

    public final void zza(zzftl zzftlVar) {
        int i = 1;
        if (zzftlVar.zzp() <= 0 && !zzftlVar.zzs()) {
            i = 0;
        }
        zzd(zzftlVar, i);
    }

    public final void zzb(zzftl zzftlVar) {
        if (zzt(zzftlVar)) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzU)).booleanValue()) {
            zzs(zzftlVar);
            return;
        }
        long zzy = zzftlVar.zzy();
        if (zzy <= 0) {
            zza(zzftlVar);
            return;
        }
        zzs(zzftlVar);
        synchronized (this) {
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfry
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfrz.this.zzh();
                }
            }, zzy, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzc() {
        zzh();
    }

    public final void zzd(final zzftl zzftlVar, final int i) {
        if (zzt(zzftlVar)) {
            return;
        }
        if (i > 0) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfrz.this.zzj(zzftlVar, i);
                }
            });
        }
        if (!zzA(zzftlVar)) {
            zzv(0L);
        } else {
            zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzZ)).longValue());
        }
    }

    public final void zze(String str, AdFormat adFormat, final zzftl zzftlVar) {
        Map map = this.zza;
        String zzr = zzr(str, adFormat);
        synchronized (map) {
            if (map.containsKey(zzr)) {
                return;
            }
            map.put(zzr, zzftlVar);
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfrz.this.zzo(zzftlVar);
                }
            });
        }
    }

    public final void zzf(final zzftl zzftlVar) {
        AdFormat zzo = zzftlVar.zzo();
        if (zzo == null) {
            return;
        }
        String zzr = zzr(zzftlVar.zzn(), zzo);
        Map map = this.zza;
        synchronized (map) {
            if (map.containsKey(zzr)) {
                map.remove(zzr);
                final int zzt = zzftlVar.zzt();
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfrz.this.zzp(zzt, zzftlVar);
                    }
                });
            }
        }
    }

    final int zzg() {
        zzgvz zzq;
        Map map = this.zza;
        synchronized (map) {
            zzq = zzgvz.zzq(map.values());
        }
        int size = zzq.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((zzftl) zzq.get(i2)).zzt();
        }
        return i;
    }

    final /* synthetic */ void zzi(zzftl zzftlVar) {
        zzj(zzftlVar, 1);
    }

    final /* synthetic */ void zzo(zzftl zzftlVar) {
        zzA(zzftlVar);
        zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzZ)).longValue());
    }

    final /* synthetic */ void zzp(int i, zzftl zzftlVar) {
        if (i > 0) {
            zzj(zzftlVar, i);
        }
        zzv(0L);
    }
}
