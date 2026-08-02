package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ProxyCardCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes9.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new zzad();

    @SafeParcelable.Field(id = 2)
    private String zzdy;

    @SafeParcelable.Field(id = 3)
    private String zzdz;

    @SafeParcelable.Field(id = 4)
    private int zzea;

    @SafeParcelable.Field(id = 5)
    private int zzeb;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) int i12) {
        this.zzdy = str;
        this.zzdz = str2;
        this.zzea = i11;
        this.zzeb = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzdy, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzdz, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzea);
        SafeParcelWriter.writeInt(parcel, 5, this.zzeb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
