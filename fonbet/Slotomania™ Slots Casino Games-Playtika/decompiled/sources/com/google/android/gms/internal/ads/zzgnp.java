package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgnp implements zzgmj {
    private final zzgkm zza;
    private final ExecutorService zzb;
    private final zzgpu zzc;

    zzgnp(zzgkm zzgkmVar, ExecutorService executorService, zzgpu zzgpuVar) {
        this.zza = zzgkmVar;
        this.zzb = executorService;
        this.zzc = zzgpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zza() {
        return zzhbi.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzb() {
        ListenableFuture zzd = zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgno
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgnp.this.zzf();
            }
        }, this.zzb);
        this.zzc.zze(15302, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzc(final zzgfd zzgfdVar, final byte[] bArr, final byte[] bArr2) {
        ListenableFuture zzd = zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgnp.this.zzi(zzgfdVar, bArr, bArr2);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15321, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgmi
    public final ListenableFuture zzd(final zzgfd zzgfdVar, final byte[] bArr) {
        ListenableFuture zzd = zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzgnp.this.zzh(zzgfdVar, bArr);
                return null;
            }
        }, this.zzb);
        this.zzc.zze(15305, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgmj
    public final ListenableFuture zze() {
        ListenableFuture zzd = zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgnl
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgnp.this.zzg();
            }
        }, this.zzb);
        this.zzc.zze(15314, zzd);
        return zzd;
    }

    final /* synthetic */ zzgfd zzf() {
        zzgfd zzc = this.zza.zzc(1);
        return zzc == null ? zzgfd.zzg() : zzc;
    }

    final /* synthetic */ zzfxz zzg() {
        return this.zza.zzb(1);
    }

    final /* synthetic */ Void zzh(zzgfd zzgfdVar, byte[] bArr) {
        this.zza.zza(zzgfdVar, null, bArr);
        return null;
    }

    final /* synthetic */ Void zzi(zzgfd zzgfdVar, byte[] bArr, byte[] bArr2) {
        this.zza.zza(zzgfdVar, bArr, bArr2);
        return null;
    }
}
