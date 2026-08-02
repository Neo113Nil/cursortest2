package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "LineBoxParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class zbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbf> CREATOR = new zbg();

    @SafeParcelable.Field(id = 2)
    public final zbj[] zba;

    @SafeParcelable.Field(id = 3)
    public final zbd zbb;

    @SafeParcelable.Field(id = 4)
    public final zbd zbc;

    @SafeParcelable.Field(id = 5)
    public final zbd zbd;

    @SafeParcelable.Field(id = 6)
    public final String zbe;

    @SafeParcelable.Field(id = 7)
    public final float zbf;

    @SafeParcelable.Field(id = 8)
    public final String zbg;

    @SafeParcelable.Field(id = 9)
    public final int zbh;

    @SafeParcelable.Field(id = 10)
    public final boolean zbi;

    @SafeParcelable.Field(id = 11)
    public final int zbj;

    @SafeParcelable.Field(id = 12)
    public final int zbk;

    @SafeParcelable.Constructor
    public zbf(@SafeParcelable.Param(id = 2) zbj[] zbjVarArr, @SafeParcelable.Param(id = 3) zbd zbdVar, @SafeParcelable.Param(id = 4) zbd zbdVar2, @SafeParcelable.Param(id = 5) zbd zbdVar3, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) float f7, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) int i11, @SafeParcelable.Param(id = 10) boolean z11, @SafeParcelable.Param(id = 11) int i12, @SafeParcelable.Param(id = 12) int i13) {
        this.zba = zbjVarArr;
        this.zbb = zbdVar;
        this.zbc = zbdVar2;
        this.zbd = zbdVar3;
        this.zbe = str;
        this.zbf = f7;
        this.zbg = str2;
        this.zbh = i11;
        this.zbi = z11;
        this.zbj = i12;
        this.zbk = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        zbj[] zbjVarArr = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, zbjVarArr, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zbb, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zbc, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zbd, i11, false);
        SafeParcelWriter.writeString(parcel, 6, this.zbe, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.zbf);
        SafeParcelWriter.writeString(parcel, 8, this.zbg, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zbh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zbi);
        SafeParcelWriter.writeInt(parcel, 11, this.zbj);
        SafeParcelWriter.writeInt(parcel, 12, this.zbk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
