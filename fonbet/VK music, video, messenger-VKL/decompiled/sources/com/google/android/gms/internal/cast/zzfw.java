package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzfw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzfx();
    private final boolean zza;
    private final boolean zzb;
    private final int zzc;

    public zzfw(boolean z, boolean z2, int i) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        boolean z = this.zza;
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzb;
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.zzc;
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }
}
