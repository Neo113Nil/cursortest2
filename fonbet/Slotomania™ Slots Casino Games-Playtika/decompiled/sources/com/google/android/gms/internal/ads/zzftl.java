package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public abstract class zzftl {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfli zzd;
    protected com.google.android.gms.ads.internal.client.zzfp zze;
    protected final zzfrz zzf;
    protected AtomicBoolean zzg;
    protected com.google.android.gms.ads.internal.client.zzce zzh;
    protected final ScheduledExecutorService zzi;
    private com.google.android.gms.ads.internal.client.zzcb zzj;
    private final Queue zzk;
    private final zzfsi zzl;
    private final String zzm;
    private AtomicBoolean zzn;
    private final zzfoc zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzfsp zzr;
    private final Clock zzs;
    private final zzfsw zzt;

    public zzftl(ClientApi clientApi, Context context, int i, zzfli zzfliVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfsi zzfsiVar, Clock clock) {
        this("none", clientApi, context, i, zzfliVar, zzfpVar, scheduledExecutorService, zzfocVar, zzfsiVar, clock, null);
        this.zzj = zzcbVar;
    }

    private final boolean zzM() {
        boolean isEmpty;
        Queue queue = this.zzk;
        synchronized (queue) {
            isEmpty = queue.isEmpty();
        }
        return isEmpty;
    }

    private final void zzN(boolean z) {
        zzfrz zzfrzVar = this.zzf;
        if (zzfrzVar != null) {
            if (z) {
                this.zzl.zzc();
            }
            zzfrzVar.zza(this);
        } else {
            zzfsi zzfsiVar = this.zzl;
            if (zzfsiVar.zze()) {
                return;
            }
            if (z) {
                zzfsiVar.zzc();
            }
            this.zzi.schedule(new zzftb(this), zzfsiVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzO, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzz() {
        int i;
        int i2;
        Queue queue = this.zzk;
        synchronized (queue) {
            Iterator it = queue.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((zzfsy) it.next()).zzb()) {
                    it.remove();
                    i++;
                }
            }
            i2 = (i <= 0 || !queue.isEmpty()) ? i : i - 1;
        }
        zzfrz zzfrzVar = this.zzf;
        if (zzfrzVar == null || i <= 0) {
            return;
        }
        zzfrzVar.zzd(this, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzP, reason: merged with bridge method [inline-methods] */
    public final String zzH() {
        return true != "none".equals(this.zzm) ? "2" : "1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzQ(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (zzdxVar instanceof zzdby) {
            return ((zzdby) zzdxVar).zzk();
        }
        return null;
    }

    final /* synthetic */ void zzB(Object obj) {
        Object obj2;
        if (obj != null) {
            this.zzl.zza();
            this.zzq.set(true);
            com.google.android.gms.ads.internal.client.zzdx zzc = zzc(obj);
            double zzl = !(zzc instanceof zzdby) ? 0.0d : ((zzdby) zzc).zzl();
            com.google.android.gms.ads.internal.client.zzdx zzc2 = zzc(obj);
            obj2 = obj;
            zzfsy zzfsyVar = new zzfsy(obj2, this.zzs, zzl, zzc2 instanceof zzdby ? ((zzdby) zzc2).zzm() : 2);
            Queue queue = this.zzk;
            synchronized (queue) {
                queue.add(zzfsyVar);
            }
            com.google.android.gms.ads.internal.client.zzdx zzc3 = zzc(obj2);
            long currentTimeMillis = this.zzs.currentTimeMillis();
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzftc(this, zzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzi;
            scheduledExecutorService.execute(new zzftd(this, currentTimeMillis, zzc3));
            if (this.zzf != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzE)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzftl.this.zzA();
                        }
                    }, zzfsyVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfti
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzftl.this.zzz();
                        }
                    }, zzfsyVar.zzc(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzE)).booleanValue()) {
                    this.zzo.zzb(new zzftb(this), zzfsyVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new zzftb(this), zzfsyVar.zzc(), TimeUnit.MILLISECONDS);
                }
            }
        } else {
            obj2 = obj;
        }
        this.zzn.set(false);
        if (obj2 == null || this.zzf == null) {
            zzN(obj2 == null);
        }
    }

    final /* synthetic */ void zzC(Throwable th) {
        this.zzn.set(false);
        if ((th instanceof zzfsa) && ((zzfsa) th).zza() == 0) {
            throw null;
        }
        zzN(true);
    }

    final /* synthetic */ void zzD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfte(this, zzeVar));
        }
        this.zzn.set(false);
        int i = zzeVar.zza;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            zzN(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = this.zze;
        int i2 = zzfpVar.zzb;
        String str = zzfpVar.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26 + String.valueOf(str).length() + 61);
        sb.append("Preloading ");
        sb.append(i2);
        sb.append(", for adUnitId:");
        sb.append(str);
        sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String sb2 = sb.toString();
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(sb2);
        this.zzg.set(false);
        zzfrz zzfrzVar = this.zzf;
        if (zzfrzVar != null) {
            zzfrzVar.zza(this);
        }
        zzfsv zzfsvVar = new zzfsv(this.zze.zza, zzo());
        zzfsvVar.zza(this.zzm);
        this.zzr.zzk(this.zzs.currentTimeMillis(), new zzfsw(zzfsvVar, null), zzeVar, this.zze.zzd, zzp(), zzH());
    }

    final /* synthetic */ void zzE(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzg(this.zzm, zzeVar);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    final /* synthetic */ void zzF(com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zze(this.zze);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zze(this.zzm, zzdxVar);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
            }
        }
    }

    final /* synthetic */ void zzG() {
        com.google.android.gms.ads.internal.client.zzcb zzcbVar = this.zzj;
        if (zzcbVar != null) {
            try {
                zzcbVar.zzf(this.zze);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzh;
        if (zzceVar != null) {
            try {
                zzceVar.zzf(this.zzm);
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
            }
        }
    }

    final /* synthetic */ zzfsp zzI() {
        return this.zzr;
    }

    final /* synthetic */ Clock zzJ() {
        return this.zzs;
    }

    final /* synthetic */ zzfsw zzK() {
        return this.zzt;
    }

    protected abstract ListenableFuture zza(Context context);

    protected long zzb() {
        throw null;
    }

    protected abstract com.google.android.gms.ads.internal.client.zzdx zzc(Object obj);

    public final zzftl zzd() {
        this.zzi.submit(new zzftb(this));
        return this;
    }

    public final void zze() {
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzp() >= this.zze.zzd) {
                this.zzn.set(false);
            } else {
                this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzftl.this.zzv();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzJ)).booleanValue()) {
            this.zzl.zza();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzD)).booleanValue() && this.zzf == null) {
            zzu();
        } else {
            zzz();
        }
        return !zzM();
    }

    public final Object zzg() {
        zzfsy zzfsyVar;
        zzfsy zzfsyVar2;
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzM)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzK)).booleanValue()) {
                this.zzl.zza();
            } else if (zzp() == 1) {
                this.zzl.zza();
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzL)).booleanValue()) {
            zzz();
        }
        Queue queue = this.zzk;
        synchronized (queue) {
            zzfsyVar = (zzfsy) queue.poll();
            AtomicBoolean atomicBoolean = this.zzq;
            if (zzfsyVar == null) {
                z = false;
            }
            atomicBoolean.set(z);
            if (zzfsyVar != null) {
                zzfsyVar2 = !queue.isEmpty() ? (zzfsy) queue.peek() : null;
            } else {
                zzfsyVar = null;
                zzfsyVar2 = null;
            }
        }
        if (zzfsyVar != null && zzfsyVar2 != null) {
            AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
            String zzQ = zzQ(zzc(zzfsyVar.zza()));
            if (adFormat != null && zzQ != null && zzfsyVar2.zzd() < zzfsyVar.zzd()) {
                this.zzr.zzg(this.zzs.currentTimeMillis(), this.zze.zzd, zzp(), zzQ, this.zzt, zzH());
            }
        }
        zzfrz zzfrzVar = this.zzf;
        if (zzfrzVar != null) {
            zzfrzVar.zzb(this);
        } else {
            long zzy = zzy();
            if (zzy > 0) {
                this.zzi.schedule(new zzftb(this), zzy, TimeUnit.MILLISECONDS);
            } else {
                zzu();
            }
        }
        if (zzfsyVar == null) {
            return null;
        }
        return zzfsyVar.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzi.submit(new zzftb(this));
        }
    }

    public final String zzk() {
        zzfsy zzfsyVar;
        Queue queue = this.zzk;
        synchronized (queue) {
            zzfsyVar = (zzfsy) queue.peek();
        }
        Object zza = zzfsyVar == null ? null : zzfsyVar.zza();
        return zzQ(zza != null ? zzc(zza) : null);
    }

    public final void zzl(zzfsp zzfspVar) {
        this.zzr = zzfspVar;
    }

    public final void zzm(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzl.zzf(i);
    }

    protected final String zzn() {
        return this.zzm;
    }

    protected final AdFormat zzo() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    protected final int zzp() {
        int size;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    protected final boolean zzq() {
        return this.zzg.get() && !this.zzn.get() && zzp() < this.zze.zzd && !this.zzl.zzd();
    }

    protected final void zzr() {
        Queue queue = this.zzk;
        synchronized (queue) {
            queue.clear();
        }
    }

    protected final boolean zzs() {
        return this.zzn.get();
    }

    protected final int zzt() {
        int zzp = zzp();
        int i = zzp - 1;
        if (!this.zzn.get()) {
            zzp = i;
        }
        return Math.max(zzp, 0);
    }

    protected final void zzu() {
        zzz();
        if (this.zzq.get() && zzM()) {
            this.zzq.set(false);
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzftf(this));
            }
            this.zzi.execute(new zzftg(this));
        }
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzp() >= this.zze.zzd) {
                this.zzn.set(false);
            } else {
                zzv();
            }
        }
    }

    protected final void zzv() {
        ListenableFuture zza;
        Activity zzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (zzd == null) {
            String str = this.zze.zza;
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(valueOf));
            zza = zza(this.zzb);
        } else {
            zza = zza(zzd);
        }
        zzhbi.zzr(zza, new zzfsz(this), this.zzi);
    }

    protected final void zzw(int i) {
        int size;
        zzfrz zzfrzVar;
        boolean z = true;
        int i2 = 0;
        Preconditions.checkArgument(i > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i3 = this.zze.zzd;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
            this.zze = this.zze.zza(i);
            if (queue.size() > i) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzx)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    while (i2 < i) {
                        zzfsy zzfsyVar = (zzfsy) queue.poll();
                        if (zzfsyVar != null) {
                            arrayList.add(zzfsyVar);
                        }
                        i2++;
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    i2 = arrayList.size();
                }
            }
            z = false;
        }
        if (z && size > i2 && (zzfrzVar = this.zzf) != null) {
            int i4 = size - i2;
            if (i2 == 0) {
                i4--;
            }
            zzfrzVar.zzd(this, i4);
        }
        zzfsp zzfspVar = this.zzr;
        if (zzfspVar == null || adFormat == null) {
            return;
        }
        zzfspVar.zzc(i3, i, this.zzs.currentTimeMillis(), new zzfsw(new zzfsv(this.zze.zza, adFormat), null));
    }

    protected final void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzC)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzp());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzm);
        }
    }

    final long zzy() {
        long zzb = zzb();
        if (zzb >= 0) {
            return zzb;
        }
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzQ)).longValue();
    }

    public zzftl(String str, ClientApi clientApi, Context context, int i, zzfli zzfliVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfsi zzfsiVar, Clock clock, zzfrz zzfrzVar) {
        this(str, clientApi, context, i, zzfliVar, zzfpVar, scheduledExecutorService, zzfocVar, zzfsiVar, clock, zzfrzVar);
        this.zzh = zzceVar;
    }

    private zzftl(String str, ClientApi clientApi, Context context, int i, zzfli zzfliVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, ScheduledExecutorService scheduledExecutorService, zzfoc zzfocVar, zzfsi zzfsiVar, Clock clock, zzfrz zzfrzVar) {
        Queue priorityQueue;
        this.zzm = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfliVar;
        this.zze = zzfpVar;
        int max = Math.max(1, zzfpVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzac)).booleanValue()) {
            priorityQueue = new zzfto();
        } else {
            priorityQueue = new PriorityQueue(max, zzfth.zza);
        }
        this.zzk = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzn = new AtomicBoolean(false);
        this.zzi = scheduledExecutorService;
        this.zzo = zzfocVar;
        this.zzl = zzfsiVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = clock;
        zzfsv zzfsvVar = new zzfsv(zzfpVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfsvVar.zza(str);
        this.zzt = new zzfsw(zzfsvVar, null);
        this.zzf = zzfrzVar;
    }
}
