package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AddressCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes9.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    @SafeParcelable.Field(id = 2)
    private String name;

    @SafeParcelable.Field(id = 3)
    private String zzk;

    @SafeParcelable.Field(id = 4)
    private String zzl;

    @SafeParcelable.Field(id = 5)
    private String zzm;

    @SafeParcelable.Field(id = 6)
    private String zzn;

    @SafeParcelable.Field(id = 7)
    private String zzo;

    @SafeParcelable.Field(id = 8)
    private String zzp;

    @SafeParcelable.Field(id = 9)
    private String zzq;

    @SafeParcelable.Field(id = 10)
    private String zzr;

    @SafeParcelable.Field(id = 11)
    private boolean zzs;

    @SafeParcelable.Field(id = 12)
    private String zzt;

    zza() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.name, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzk, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzl, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzo, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzp, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzq, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzr, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzs);
        SafeParcelWriter.writeString(parcel, 12, this.zzt, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    zza(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) boolean z11, @SafeParcelable.Param(id = 12) String str10) {
        this.name = str;
        this.zzk = str2;
        this.zzl = str3;
        this.zzm = str4;
        this.zzn = str5;
        this.zzo = str6;
        this.zzp = str7;
        this.zzq = str8;
        this.zzr = str9;
        this.zzs = z11;
        this.zzt = str10;
    }
}
