package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zznn implements zzjt {
    private final Context zza;

    public zznn(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        try {
            PackageManager packageManager = this.zza.getPackageManager();
            return new zzrh(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.zza.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException unused) {
            return new zzrh("");
        }
    }
}
