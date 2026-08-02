package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.dq70;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzlt {
    private final zzlp zza;
    private final zzlr zzb;
    private final zzlr zzc;
    private final Boolean zzd;

    public /* synthetic */ zzlt(zzlq zzlqVar, zzls zzlsVar) {
        zzlp zzlpVar;
        zzlpVar = zzlqVar.zza;
        this.zza = zzlpVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzlt) && dq70.b(this.zza, ((zzlt) obj).zza) && dq70.b(null, null) && dq70.b(null, null) && dq70.b(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, null, null, null});
    }

    @Nullable
    @zzbo(zza = 1)
    public final zzlp zza() {
        return this.zza;
    }
}
