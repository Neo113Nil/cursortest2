package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.dq70;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzlp {
    private final String zza;
    private final String zzb;
    private final zzln zzc;
    private final String zzd;
    private final String zze;
    private final zzlm zzf;
    private final Long zzg;
    private final Boolean zzh;
    private final Boolean zzi;

    public /* synthetic */ zzlp(zzll zzllVar, zzlo zzloVar) {
        String str;
        zzln zzlnVar;
        String str2;
        zzlm zzlmVar;
        str = zzllVar.zza;
        this.zza = str;
        this.zzb = null;
        zzlnVar = zzllVar.zzb;
        this.zzc = zzlnVar;
        this.zzd = null;
        str2 = zzllVar.zzc;
        this.zze = str2;
        zzlmVar = zzllVar.zzd;
        this.zzf = zzlmVar;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlp)) {
            return false;
        }
        zzlp zzlpVar = (zzlp) obj;
        return dq70.b(this.zza, zzlpVar.zza) && dq70.b(null, null) && dq70.b(this.zzc, zzlpVar.zzc) && dq70.b(null, null) && dq70.b(this.zze, zzlpVar.zze) && dq70.b(this.zzf, zzlpVar.zzf) && dq70.b(null, null) && dq70.b(null, null) && dq70.b(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null});
    }

    @Nullable
    @zzbo(zza = 6)
    public final zzlm zza() {
        return this.zzf;
    }

    @Nullable
    @zzbo(zza = 3)
    public final zzln zzb() {
        return this.zzc;
    }

    @Nullable
    @zzbo(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @Nullable
    @zzbo(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}
