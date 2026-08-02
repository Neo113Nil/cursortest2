package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgmo implements zzgmj {
    private final zzgec zza;
    private final zzgec zzb;
    private final zzgec zzc;
    private final zzgec zzd;
    private final zzimc zze;
    private final zzimc zzf;
    private final File zzg;
    private final ExecutorService zzh;
    private final zzgpu zzi;

    zzgmo(zzgec zzgecVar, zzgec zzgecVar2, zzimc zzimcVar, zzgec zzgecVar3, zzgec zzgecVar4, zzimc zzimcVar2, File file, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzgecVar;
        this.zzc = zzgecVar2;
        this.zze = zzimcVar;
        this.zzb = zzgecVar3;
        this.zzd = zzgecVar4;
        this.zzf = zzimcVar2;
        this.zzg = file;
        this.zzh = executorService;
        this.zzi = zzgpuVar;
    }

    private final ListenableFuture zzj(byte[] bArr) {
        ListenableFuture zzc = this.zzd.zzc(bArr);
        this.zzi.zze(15305, zzc);
        return zzc;
    }

    private final ListenableFuture zzk(zzgfd zzgfdVar) {
        ListenableFuture zzc = this.zzb.zzc(zzgfdVar);
        this.zzi.zze(15303, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zza() {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new Boolean(zzgmo.this.zzf());
            }
        }, this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        this.zzi.zze(15302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzc(final zzgfd zzgfdVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture zzc = ((zzgec) this.zzf.zzb()).zzc(bArr);
        this.zzi.zze(15307, zzc);
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzhbi.zzl(zzc, zzj(bArr2))), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgmm
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgmo.this.zzi(zzgfdVar, (List) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzd(final zzgfd zzgfdVar, byte[] bArr) {
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzj(bArr)), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgml
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgmo.this.zzh(zzgfdVar, (Void) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final ListenableFuture zze() {
        zzhba zzhbaVar = (zzhba) zzhbi.zzk(zzhba.zzw(this.zza.zzb()), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzgmk
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzgmo.this.zzg((zzgfd) obj);
            }
        }, zzhbz.zza());
        this.zzi.zze(15314, zzhbaVar);
        return zzhbaVar;
    }

    final /* synthetic */ boolean zzf() {
        zzgec zzgecVar;
        try {
            zzgec zzgecVar2 = this.zzb;
            File zza = zzgecVar2.zza();
            if (!zza.exists()) {
                zzgecVar2.zza().delete();
                ((zzgec) this.zzf.zzb()).zza().delete();
                this.zzd.zza().delete();
                return false;
            }
            File zza2 = ((zzgec) this.zzf.zzb()).zza();
            File zza3 = ((zzgec) this.zze.zzb()).zza();
            try {
                if (zza2.exists()) {
                    File parentFile = zza3.getParentFile();
                    if (parentFile != null) {
                        zzfyb.zze(parentFile);
                    }
                    zzgzg.zzb(zza3);
                    zzgzg.zzc(zza2, zza3);
                }
                File zza4 = this.zzd.zza();
                File zza5 = this.zzc.zza();
                try {
                    if (zza4.exists()) {
                        zzgzg.zzb(zza5);
                        zzgzg.zzc(zza4, zza5);
                    }
                    File zza6 = this.zza.zza();
                    try {
                        if (zza.exists()) {
                            zzgzg.zzb(zza6);
                            zzgzg.zzc(zza, zza6);
                        }
                        this.zzb.zza().delete();
                        ((zzgec) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return true;
                    } catch (IOException | SecurityException e) {
                        this.zzi.zzd(15313, e);
                        zzgecVar = this.zzb;
                        zzgecVar.zza().delete();
                        ((zzgec) this.zzf.zzb()).zza().delete();
                        this.zzd.zza().delete();
                        return false;
                    }
                } catch (IOException | SecurityException e2) {
                    this.zzi.zzd(15312, e2);
                    zzgecVar = this.zzb;
                }
            } catch (IOException | SecurityException e3) {
                this.zzi.zzd(15311, e3);
                zzgecVar = this.zzb;
            }
        } catch (Throwable th) {
            this.zzb.zza().delete();
            ((zzgec) this.zzf.zzb()).zza().delete();
            this.zzd.zza().delete();
            throw th;
        }
    }

    final /* synthetic */ zzfxz zzg(zzgfd zzgfdVar) {
        if (zzgfdVar == null || zzgfdVar.equals(zzgfd.zzg())) {
            return null;
        }
        zzbdp zza = zzgfdVar.zza();
        File zza2 = ((zzgec) this.zze.zzb()).zza();
        zzgec zzgecVar = this.zzc;
        return new zzfxz(zza, zza2, zzgecVar.zza(), this.zzg);
    }

    final /* synthetic */ ListenableFuture zzh(zzgfd zzgfdVar, Void r2) {
        return zzk(zzgfdVar);
    }

    final /* synthetic */ ListenableFuture zzi(zzgfd zzgfdVar, List list) {
        return zzk(zzgfdVar);
    }
}
