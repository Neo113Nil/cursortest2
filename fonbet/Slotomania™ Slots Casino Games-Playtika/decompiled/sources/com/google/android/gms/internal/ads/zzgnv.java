package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgnv implements zzgnr {
    private final zzgec zza;
    private final zzgec zzb;
    private final zzimc zzc;
    private final zzgoj zzd;
    private final zzgpu zze;
    private final ExecutorService zzf;

    zzgnv(zzgec zzgecVar, zzgec zzgecVar2, zzimc zzimcVar, zzgoj zzgojVar, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzgecVar;
        this.zzb = zzgecVar2;
        this.zzc = zzimcVar;
        this.zzd = zzgojVar;
        this.zze = zzgpuVar;
        this.zzf = executorService;
    }

    private final ListenableFuture zzj(zzgfd zzgfdVar) {
        ListenableFuture zzc = this.zza.zzc(zzgfdVar);
        this.zze.zze(20303, zzc);
        return zzc;
    }

    private final ListenableFuture zzk(byte[] bArr) {
        ListenableFuture zzc = this.zzb.zzc(bArr);
        this.zze.zze(20305, zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zza() {
        return zzhbi.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        this.zze.zze(20302, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzc(final zzgfd zzgfdVar, byte[] bArr, byte[] bArr2) {
        ListenableFuture zzc = ((zzgec) this.zzc.zzb()).zzc(bArr);
        this.zze.zze(20307, zzc);
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzhbi.zzl(zzc, zzk(bArr2))), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgnt
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgnv.this.zzi(zzgfdVar, (List) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzd(final zzgfd zzgfdVar, byte[] bArr) {
        return (zzhba) zzhbi.zzj(zzhba.zzw(zzk(bArr)), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzgns
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgnv.this.zzh(zzgfdVar, (Void) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final ListenableFuture zze() {
        ListenableFuture zzb = this.zzb.zzb();
        this.zze.zze(20304, zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgnr
    public final ListenableFuture zzf() {
        ListenableFuture zzd = zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgnv.this.zzg();
            }
        }, this.zzf);
        this.zze.zze(20312, zzd);
        return zzd;
    }

    final /* synthetic */ byte[] zzg() {
        return zzgdj.zzb(this.zzd.zza(), false);
    }

    final /* synthetic */ ListenableFuture zzh(zzgfd zzgfdVar, Void r2) {
        return zzj(zzgfdVar);
    }

    final /* synthetic */ ListenableFuture zzi(zzgfd zzgfdVar, List list) {
        return zzj(zzgfdVar);
    }
}
