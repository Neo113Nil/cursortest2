package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzajk extends zzajh {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int[] zzd;
    public final int[] zze;

    public zzajk(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = iArr;
        this.zze = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajk zzajkVar = (zzajk) obj;
            if (this.zza == zzajkVar.zza && this.zzb == zzajkVar.zzb && this.zzc == zzajkVar.zzc && Arrays.equals(this.zzd, zzajkVar.zzd) && Arrays.equals(this.zze, zzajkVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + Arrays.hashCode(this.zzd)) * 31) + Arrays.hashCode(this.zze);
    }
}
