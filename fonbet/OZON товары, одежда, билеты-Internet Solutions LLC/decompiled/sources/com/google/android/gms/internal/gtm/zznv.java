package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznv implements zzjt {
    private final Context zza;

    public zznv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        String string = Settings.Secure.getString(this.zza.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new zzrh(string);
    }
}
