package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgly implements zzglr {
    private final Context zza;
    private final zzimc zzb;
    private final zzgmi zzc;
    private final zzgpu zzd;
    private final ExecutorService zze;
    private final zzgkn zzf;
    private final zzfwq zzg;

    zzgly(Context context, zzimc zzimcVar, zzgmi zzgmiVar, zzgpu zzgpuVar, ExecutorService executorService, zzgkn zzgknVar, zzfwq zzfwqVar) {
        this.zza = context;
        this.zzb = zzimcVar;
        this.zzc = zzgmiVar;
        this.zzd = zzgpuVar;
        this.zze = executorService;
        this.zzf = zzgknVar;
        this.zzg = zzfwqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgfb zzf(int i) {
        zzgfa zzd = zzgfb.zzd();
        zzd.zzd(i);
        return (zzgfb) zzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzglr
    public final ListenableFuture zza() {
        final zzimc zzimcVar = this.zzb;
        Objects.requireNonNull(zzimcVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzglt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzimc.this.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzhba zzhbaVar = (zzhba) zzhbi.zzg((zzhba) zzhbi.zzk((zzhba) zzhbi.zzj((zzhba) zzhbi.zzk(zzhba.zzw(zzhbi.zzd(callable, executorService)), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglx
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzgly.this.zzb((zzbdh) obj);
                return new Integer(0);
            }
        }, zzhbz.zza()), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzglu
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgly.this.zzc((Integer) obj);
            }
        }, zzhbz.zza()), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglv
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzgly.this.zzd((zzgfd) obj);
            }
        }, executorService), zzgls.class, zzglw.zza, zzhbz.zza());
        this.zzd.zze(15202, zzhbaVar);
        return zzhbaVar;
    }

    final /* synthetic */ int zzb(zzbdh zzbdhVar) {
        if (zzfxn.zza(zzbdhVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbdhVar.name());
        throw new zzgls(null);
    }

    final /* synthetic */ ListenableFuture zzc(Integer num) {
        return this.zzc.zzb();
    }

    final /* synthetic */ zzgfb zzd(zzgfd zzgfdVar) {
        String zza = zzgfdVar.zza().zza();
        String zzb = zzgfdVar.zza().zzb();
        zzgps zza2 = this.zzd.zza(15203);
        try {
            zza2.zza();
            zzfye zza3 = zzfwz.zza(this.zza, 1, (zzbdh) this.zzb.zzb(), zza, zzb, "1", this.zzg);
            zza2.zzc();
            int i = 2;
            if (zza3.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zza3.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(IronSourceConstants.errorCode_destroy);
                return zzf(8);
            }
            try {
                zzbdj zze = zzbdj.zze(bArr, zzidb.zzb());
                if (zze.zza().zza().isEmpty() || zze.zza().zzb().isEmpty() || zze.zzc().zzA().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzgfdVar.equals(zzgfd.zzg()) || !TextUtils.equals(zzgfdVar.zza().zza(), zze.zza().zza()) || !TextUtils.equals(zzgfdVar.zza().zzb(), zze.zza().zzb())) {
                        int i2 = zza3.zzc;
                        if (i2 == 4) {
                            if (!this.zzf.zza(zze.zzb().zzA())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i2 = 4;
                        }
                        zzgfa zzd = zzgfb.zzd();
                        if (i2 == 2) {
                            i = 4;
                        } else if (i2 != 3) {
                            i = i2 != 4 ? i2 != 6 ? 1 : 5 : 3;
                        }
                        zzd.zzd(i);
                        zzgfc zze2 = zzgfd.zze();
                        zze2.zza(zze.zza());
                        zze2.zzc((zzbdh) this.zzb.zzb());
                        zzd.zza((zzgfd) zze2.zzbu());
                        zzd.zzc(zze.zzb());
                        zzd.zzb(zze.zzc());
                        return (zzgfb) zzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzieg e) {
                this.zzd.zzd(15205, e);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (Throwable th) {
            try {
                zza2.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zza2.zzc();
                throw th2;
            }
        }
    }
}
