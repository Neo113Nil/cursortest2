package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzoi implements zzjt {
    private final Context zza;

    public zzoi(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        String string = Settings.Secure.getString(this.zza.getContentResolver(), "android_id");
        return string != null ? new zzrh(string) : zzra.zze;
    }
}
