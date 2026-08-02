package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes9.dex */
public final class zzoo implements zzjt {
    private final Context zza;
    private final DisplayMetrics zzb = new DisplayMetrics();

    public zzoo(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.gtm.zzjt
    public final zzqw<?> zzd(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(zzqwVarArr != null);
        Preconditions.checkArgument(zzqwVarArr.length == 0);
        ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay().getMetrics(this.zzb);
        return new zzrh(this.zzb.widthPixels + "x" + this.zzb.heightPixels);
    }
}
