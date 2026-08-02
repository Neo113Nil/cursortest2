package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfcx implements zzfby {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcej zzg;

    zzfcx(zzcej zzcejVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzcejVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        zzhba zzw = zzhba.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgsn zzgsnVar = new zzgsn() { // from class: com.google.android.gms.internal.ads.zzfcw
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzfcx.this.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzhba) zzhbi.zzg((zzhba) zzhbi.zzi((zzhba) zzhbi.zzk(zzw, zzgsnVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzbH)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgsn() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                return zzfcx.this.zzd((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 40;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzec)).booleanValue() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbie.zzeb)).booleanValue() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfcy zzc(AdvertisingIdClient.Info info) {
        zzgbq zzgbqVar = new zzgbq();
        if (this.zze) {
        }
        try {
            Context context = this.zza;
            zzgbqVar = zzgbu.zzh(context).zzj((String) Objects.requireNonNull(((AdvertisingIdClient.Info) Objects.requireNonNull(info)).getId()), context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeh)).longValue(), this.zzf);
        } catch (IOException | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdIdInfoSignalSource.getPaidV1");
            zzgbqVar = new zzgbq();
        }
        return new zzfcy(info, null, zzgbqVar);
    }

    final /* synthetic */ zzfcy zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzay.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzfcy(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgbq());
    }
}
