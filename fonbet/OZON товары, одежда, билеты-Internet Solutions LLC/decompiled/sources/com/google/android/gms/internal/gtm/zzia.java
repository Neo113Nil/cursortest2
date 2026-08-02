package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes9.dex */
public final class zzia {
    private final Context zza;
    private final String zzb;
    private final com.google.android.gms.tagmanager.zzcp zzc;
    private final com.google.android.gms.tagmanager.zzcg zzd;

    public zzia(Context context, com.google.android.gms.tagmanager.zzcp zzcpVar, com.google.android.gms.tagmanager.zzcg zzcgVar, String str) {
        this.zza = context.getApplicationContext();
        this.zzc = zzcpVar;
        this.zzd = zzcgVar;
        this.zzb = str;
    }

    public final zzhz zza(zzqg zzqgVar, zzqp zzqpVar) {
        return new zzhz(this.zza, this.zzb, zzqgVar, zzqpVar, this.zzc, this.zzd);
    }
}
