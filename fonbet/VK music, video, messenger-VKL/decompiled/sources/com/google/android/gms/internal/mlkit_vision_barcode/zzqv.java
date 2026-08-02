package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.dq70;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzqv {
    private final zzcd zza;

    public /* synthetic */ zzqv(zzqt zzqtVar, zzqu zzquVar) {
        zzcd zzcdVar;
        zzcdVar = zzqtVar.zza;
        this.zza = zzcdVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzqv) {
            return dq70.b(this.zza, ((zzqv) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    @Nullable
    @zzdk(zza = 1)
    public final zzcd zza() {
        return this.zza;
    }
}
