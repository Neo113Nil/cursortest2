package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes9.dex */
public final class zzng extends zzjv {
    private final int zza;
    private final zzib zzb;

    public zzng(int i11, zzib zzibVar) {
        this.zza = i11;
        this.zzb = zzibVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzjv
    public final zzqw<?> zza(zzib zzibVar, zzqw<?>... zzqwVarArr) {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(zzqwVarArr.length == 1);
        Preconditions.checkArgument(zzqwVarArr[0] instanceof zzrh);
        try {
            zzjs zza = zzpg.zza(new JSONArray(((zzrh) zzqwVarArr[0]).zzk()).getJSONArray(0));
            zza.zzc(this.zzb);
            return this.zza == 0 ? zzra.zze : zza.zzd(zzibVar, new zzqw[0]);
        } catch (JSONException e11) {
            zzhl.zzb("Unable to convert Custom Pixie to instruction", e11);
            return zzra.zze;
        }
    }
}
