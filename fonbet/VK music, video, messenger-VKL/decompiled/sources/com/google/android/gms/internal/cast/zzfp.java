package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzfp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfp> CREATOR = new zzfq();
    private final boolean zza;
    private final int zzb;

    public zzfp(boolean z, int i) {
        this.zza = z;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        boolean z = this.zza;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        int i2 = this.zzb;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }
}
