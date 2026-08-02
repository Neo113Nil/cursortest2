package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsl> CREATOR = new zzte();

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;
    private final int zzc;

    public zzsl(@Nullable String str, @Nullable String str2, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.zza, false);
        ozg0.q(parcel, 2, this.zzb, false);
        int i2 = this.zzc;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }

    public final int zza() {
        return this.zzc;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }

    @Nullable
    public final String zzc() {
        return this.zza;
    }
}
