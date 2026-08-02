package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BoundingBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class zbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbd> CREATOR = new zbe();

    @SafeParcelable.Field(id = 2)
    public final int zba;

    @SafeParcelable.Field(id = 3)
    public final int zbb;

    @SafeParcelable.Field(id = 4)
    public final int zbc;

    @SafeParcelable.Field(id = 5)
    public final int zbd;

    @SafeParcelable.Field(id = 6)
    public final float zbe;

    @SafeParcelable.Constructor
    public zbd(@SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) int i14, @SafeParcelable.Param(id = 6) float f7) {
        this.zba = i11;
        this.zbb = i12;
        this.zbc = i13;
        this.zbd = i14;
        this.zbe = f7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int i12 = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i12);
        SafeParcelWriter.writeInt(parcel, 3, this.zbb);
        SafeParcelWriter.writeInt(parcel, 4, this.zbc);
        SafeParcelWriter.writeInt(parcel, 5, this.zbd);
        SafeParcelWriter.writeFloat(parcel, 6, this.zbe);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
