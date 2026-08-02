package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfdd implements zzfby {
    private final Executor zza;
    private final String zzb;

    public zzfdd(zzcej zzcejVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        ListenableFuture zza = zzhbi.zza(this.zzb);
        zzfdc zzfdcVar = zzfdc.zza;
        Executor executor = this.zza;
        return zzhbi.zzh(zzhbi.zzk(zza, zzfdcVar, executor), Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzfdb
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzfdd.this.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 41;
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        return zzhbi.zza(new zzfde(this.zzb));
    }
}
