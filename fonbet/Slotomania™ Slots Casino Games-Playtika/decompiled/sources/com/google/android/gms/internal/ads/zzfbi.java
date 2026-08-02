package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfbi implements zzfby {
    private final zzcdn zza;
    private final zzhbs zzb;
    private final Context zzc;

    public zzfbi(zzcdn zzcdnVar, zzhbs zzhbsVar, Context context) {
        this.zza = zzcdnVar;
        this.zzb = zzhbsVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfbi.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfby
    public final int zzb() {
        return 34;
    }

    final /* synthetic */ zzfbj zzc() {
        zzcdn zzcdnVar = this.zza;
        Context context = this.zzc;
        if (!zzcdnVar.zza(context)) {
            return new zzfbj(null, null, null, null, null);
        }
        String zzh = zzcdnVar.zzh(context);
        String str = zzh == null ? "" : zzh;
        String zzi = zzcdnVar.zzi(context);
        String str2 = zzi == null ? "" : zzi;
        String zzj = zzcdnVar.zzj(context);
        String str3 = zzj == null ? "" : zzj;
        String str4 = true != zzcdnVar.zza(context) ? null : "fa";
        return new zzfbj(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaW) : null);
    }
}
