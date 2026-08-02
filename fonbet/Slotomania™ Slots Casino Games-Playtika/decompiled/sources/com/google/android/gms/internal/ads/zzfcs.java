package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfcs implements zzfby {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzhbs zzc;
    private final ScheduledExecutorService zzd;
    private final zzele zze;
    private final zzfkm zzf;
    private final VersionInfoParcel zzg;

    zzfcs(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzhbs zzhbsVar, ScheduledExecutorService scheduledExecutorService, zzele zzeleVar, zzfkm zzfkmVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzhbsVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzeleVar;
        this.zzf = zzfkmVar;
        this.zzg = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r5.zzf.zzd.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzfby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ListenableFuture zza() {
        ListenableFuture zzc;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlN)).booleanValue() && this.zza.zzz()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlR)).booleanValue()) {
            }
            if (this.zzg.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlL)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlM)).intValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlJ)).booleanValue()) {
                        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlK);
                        if (!TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        zzc = zzhbi.zzi(this.zze.zza(false), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlP)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                    } catch (Exception e) {
                        zzc = zzhbi.zzc(e);
                    }
                    zzhbs zzhbsVar = this.zzc;
                    return zzhbi.zzi((zzhba) zzhbi.zzh((zzhba) zzhbi.zzj(zzhba.zzw(zzc), zzfcr.zza, zzhbsVar), Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfcp
                        @Override // com.google.android.gms.internal.ads.zzhaq
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzfcs.this.zzc((Throwable) obj);
                        }
                    }, zzhbsVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlP)).intValue(), TimeUnit.MILLISECONDS, this.zzd);
                }
            }
        }
        return zzhbi.zza(new zzfct("", -1, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 56;
    }

    final /* synthetic */ ListenableFuture zzc(final Throwable th) {
        this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlO)).booleanValue();
                Throwable th2 = th;
                if (booleanValue) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return zzhbi.zza(th instanceof SecurityException ? new zzfct("", 2, null) : th instanceof IllegalStateException ? new zzfct("", 3, null) : th instanceof IllegalArgumentException ? new zzfct("", 4, null) : th instanceof TimeoutException ? new zzfct("", 5, null) : new zzfct("", 0, null));
    }
}
