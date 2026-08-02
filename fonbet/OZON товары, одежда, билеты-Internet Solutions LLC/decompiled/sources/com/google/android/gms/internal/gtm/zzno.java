package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzno implements zzjt {
    private final Context zza;

    public zzno(Context context) {
        this.zza = (Context) Preconditions.checkNotNull(context);
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        try {
            return new zzqy(Double.valueOf(this.zza.getPackageManager().getPackageInfo(this.zza.getPackageName(), 0).versionCode));
        } catch (PackageManager.NameNotFoundException e11) {
            String packageName = this.zza.getPackageName();
            String message = e11.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 25 + String.valueOf(message).length());
            sb2.append("Package name ");
            sb2.append(packageName);
            sb2.append(" not found. ");
            sb2.append(message);
            zzhl.zza(sb2.toString());
            return zzra.zze;
        }
    }
}
