package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzadi implements zzbt {
    private final Context zza;
    private final zzbs zzb;
    private final SparseArray zzc;
    private final boolean zzd;
    private final zzaem zze;
    private final zzdo zzf;
    private final CopyOnWriteArraySet zzg;
    private final long zzh;
    private final zzadn zzi;
    private zzfg zzj = new zzfg(10);
    private zzv zzk;
    private zzdy zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private int zzr;

    /* JADX INFO: Access modifiers changed from: private */
    public static final zzi zzC(zzi zziVar) {
        return (zziVar == null || !zziVar.zzf()) ? zzi.zza : zziVar;
    }

    final /* synthetic */ void zzA(long j) {
        this.zzq = j;
    }

    public final void zza(int i) {
        this.zzr = 1;
    }

    public final zzaem zzb(int i) {
        SparseArray sparseArray = this.zzc;
        if (zzfk.zza(sparseArray, 0)) {
            return (zzaem) sparseArray.get(0);
        }
        zzadc zzadcVar = new zzadc(this, this.zza, 0);
        this.zzg.add(zzadcVar);
        sparseArray.put(0, zzadcVar);
        return zzadcVar;
    }

    public final void zzc(Surface surface, zzet zzetVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzet) this.zzm.second).equals(zzetVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzetVar);
        zzetVar.zza();
        zzetVar.zzb();
    }

    public final void zzd() {
        zzet zzetVar = zzet.zza;
        zzetVar.zza();
        zzetVar.zzb();
        this.zzm = null;
    }

    public final void zze() {
        this.zze.zza();
    }

    public final void zzf() {
        this.zze.zzb();
    }

    public final void zzg() {
        if (this.zzo == 2) {
            return;
        }
        zzdy zzdyVar = this.zzl;
        if (zzdyVar != null) {
            zzdyVar.zzl(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    final /* synthetic */ void zzh() {
        this.zzn--;
    }

    final /* synthetic */ boolean zzi(zzv zzvVar, int i) {
        zzgsw.zzi(this.zzo == 0);
        zzi zzC = zzC(zzvVar.zzF);
        try {
            int i2 = zzC.zzd;
            try {
                if (i2 == 7) {
                    if (Build.VERSION.SDK_INT < 34 && zzdw.zzd()) {
                        zzh zzd = zzC.zzd();
                        zzd.zzc(6);
                        zzC = zzd.zzg();
                        zzi zziVar = zzC;
                        zzdo zzdoVar = this.zzf;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        this.zzl = zzdoVar.zzd(myLooper, null);
                        zzbs zzbsVar = this.zzb;
                        Context context = this.zza;
                        zzl zzlVar = zzl.zzb;
                        final zzdy zzdyVar = this.zzl;
                        Objects.requireNonNull(zzdyVar);
                        zzbsVar.zza(context, zziVar, zzlVar, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzadb
                            @Override // java.util.concurrent.Executor
                            public final /* synthetic */ void execute(Runnable runnable) {
                                zzdy.this.zzm(runnable);
                            }
                        }, 0L, false);
                        throw null;
                    }
                    i2 = 7;
                }
                if (!zzdw.zzc(i2) && Build.VERSION.SDK_INT >= 29) {
                    Object[] objArr = {Integer.valueOf(i2)};
                    String str = zzfk.zza;
                    zzef.zzc("PlaybackVidGraphWrapper", String.format(Locale.US, "Color transfer %d is not supported. Falling back to OpenGl tone mapping.", objArr));
                    zzC = zzi.zza;
                    zzi zziVar2 = zzC;
                    zzdo zzdoVar2 = this.zzf;
                    Looper myLooper2 = Looper.myLooper();
                    myLooper2.getClass();
                    this.zzl = zzdoVar2.zzd(myLooper2, null);
                    zzbs zzbsVar2 = this.zzb;
                    Context context2 = this.zza;
                    zzl zzlVar2 = zzl.zzb;
                    final zzdy zzdyVar2 = this.zzl;
                    Objects.requireNonNull(zzdyVar2);
                    zzbsVar2.zza(context2, zziVar2, zzlVar2, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzadb
                        @Override // java.util.concurrent.Executor
                        public final /* synthetic */ void execute(Runnable runnable) {
                            zzdy.this.zzm(runnable);
                        }
                    }, 0L, false);
                    throw null;
                }
                zzbs zzbsVar22 = this.zzb;
                Context context22 = this.zza;
                zzl zzlVar22 = zzl.zzb;
                final zzdy zzdyVar22 = this.zzl;
                Objects.requireNonNull(zzdyVar22);
                zzbsVar22.zza(context22, zziVar2, zzlVar22, this, new Executor() { // from class: com.google.android.gms.internal.ads.zzadb
                    @Override // java.util.concurrent.Executor
                    public final /* synthetic */ void execute(Runnable runnable) {
                        zzdy.this.zzm(runnable);
                    }
                }, 0L, false);
                throw null;
            } catch (zzbo e) {
                throw new zzael(e, zzvVar);
            }
            if (i2 == 2 || i2 == 10) {
                zzC = zzi.zza;
            }
            zzi zziVar22 = zzC;
            zzdo zzdoVar22 = this.zzf;
            Looper myLooper22 = Looper.myLooper();
            myLooper22.getClass();
            this.zzl = zzdoVar22.zzd(myLooper22, null);
        } catch (zzdv e2) {
            throw new zzael(e2, zzvVar);
        }
    }

    final /* synthetic */ boolean zzj(boolean z) {
        return this.zze.zzh(false);
    }

    final /* synthetic */ void zzk() {
        this.zze.zzi();
    }

    final /* synthetic */ void zzl(long j, long j2) {
        this.zze.zzv(j, j2);
    }

    final /* synthetic */ void zzm(boolean z) {
        if (this.zzo == 1) {
            this.zzn++;
            zzaem zzaemVar = this.zze;
            zzaemVar.zzg(z);
            while (this.zzj.zzc() > 1) {
                this.zzj.zzd();
            }
            if (this.zzj.zzc() == 1) {
                zzadh zzadhVar = (zzadh) this.zzj.zzd();
                zzadhVar.getClass();
                zzaemVar.zzs(1, this.zzk, zzadhVar.zza, zzadhVar.zzb, zzgvz.zzi());
            }
            this.zzp = C.TIME_UNSET;
            if (z) {
                this.zzq = C.TIME_UNSET;
            }
            zzdy zzdyVar = this.zzl;
            zzdyVar.getClass();
            zzdyVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzadd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzadi.this.zzh();
                }
            });
        }
    }

    final /* synthetic */ void zzn(boolean z) {
        this.zze.zzw(z);
    }

    final /* synthetic */ void zzo() {
        this.zze.zzt();
    }

    final /* synthetic */ void zzp(zzadj zzadjVar) {
        this.zze.zzl(zzadjVar);
    }

    final /* synthetic */ void zzq(float f) {
        this.zzi.zzc(f);
        this.zze.zzm(f);
    }

    final /* synthetic */ void zzr(int i) {
        this.zze.zzr(i);
    }

    final /* synthetic */ boolean zzs() {
        int i = this.zzr;
        return i != -1 && i == 0;
    }

    final /* synthetic */ boolean zzt() {
        return this.zzd;
    }

    final /* synthetic */ long zzu() {
        return this.zzh;
    }

    final /* synthetic */ zzadn zzv() {
        return this.zzi;
    }

    final /* synthetic */ zzfg zzw() {
        return this.zzj;
    }

    final /* synthetic */ void zzx(zzfg zzfgVar) {
        this.zzj = zzfgVar;
    }

    final /* synthetic */ long zzy() {
        return this.zzp;
    }

    final /* synthetic */ long zzz() {
        return this.zzq;
    }

    /* synthetic */ zzadi(zzada zzadaVar, byte[] bArr) {
        this.zza = zzadaVar.zze();
        zzbs zzg = zzadaVar.zzg();
        zzg.getClass();
        this.zzb = zzg;
        this.zzc = new SparseArray();
        zzgvz.zzi();
        this.zzd = zzadaVar.zzh();
        zzdo zzi = zzadaVar.zzi();
        this.zzf = zzi;
        this.zzh = -zzadaVar.zzj();
        zzadn zzk = zzadaVar.zzk();
        this.zzi = zzk;
        this.zze = new zzacn(zzadaVar.zzf(), zzk, zzi);
        new zzacz(this);
        this.zzg = new CopyOnWriteArraySet();
        this.zzk = new zzt().zzO();
        this.zzp = C.TIME_UNSET;
        this.zzq = C.TIME_UNSET;
        this.zzr = -1;
        this.zzo = 0;
    }
}
