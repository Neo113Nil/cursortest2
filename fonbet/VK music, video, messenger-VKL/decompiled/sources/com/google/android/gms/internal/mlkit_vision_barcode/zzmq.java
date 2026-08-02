package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.dq70;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzmq {
    private final zzmo zza;
    private final Integer zzb;
    private final Integer zzc;
    private final Boolean zzd;

    public /* synthetic */ zzmq(zzmn zzmnVar, zzmp zzmpVar) {
        zzmo zzmoVar;
        Integer num;
        zzmoVar = zzmnVar.zza;
        this.zza = zzmoVar;
        num = zzmnVar.zzb;
        this.zzb = num;
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzmq)) {
            return false;
        }
        zzmq zzmqVar = (zzmq) obj;
        return dq70.b(this.zza, zzmqVar.zza) && dq70.b(this.zzb, zzmqVar.zzb) && dq70.b(null, null) && dq70.b(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, null, null});
    }

    @Nullable
    @zzdk(zza = 1)
    public final zzmo zza() {
        return this.zza;
    }

    @Nullable
    @zzdk(zza = 2)
    public final Integer zzb() {
        return this.zzb;
    }
}
