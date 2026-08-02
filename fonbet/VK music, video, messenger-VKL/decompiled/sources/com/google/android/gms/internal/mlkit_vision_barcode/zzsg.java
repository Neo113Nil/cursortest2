package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new zzsv();
    private final double zza;
    private final double zzb;

    public zzsg(double d, double d2) {
        this.zza = d;
        this.zzb = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        double d = this.zza;
        ozg0.v(parcel, 1, 8);
        parcel.writeDouble(d);
        double d2 = this.zzb;
        ozg0.v(parcel, 2, 8);
        parcel.writeDouble(d2);
        ozg0.x(w, parcel);
    }

    public final double zza() {
        return this.zza;
    }

    public final double zzb() {
        return this.zzb;
    }
}
