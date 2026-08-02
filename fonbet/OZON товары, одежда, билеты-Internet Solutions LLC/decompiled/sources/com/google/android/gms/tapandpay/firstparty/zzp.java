package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "GetAllCardsResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    @SafeParcelable.Field(id = 2)
    final CardInfo[] zza;

    @SafeParcelable.Field(id = 3)
    final AccountInfo zzb;

    @SafeParcelable.Field(id = 4)
    final String zzc;

    @SafeParcelable.Field(id = 5)
    final String zzd;

    @SafeParcelable.Field(id = 6)
    final SparseArray<String> zze;

    @SafeParcelable.Field(id = 7)
    final byte[] zzf;

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(id = 2) CardInfo[] cardInfoArr, @SafeParcelable.Param(id = 3) AccountInfo accountInfo, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) SparseArray<String> sparseArray, @SafeParcelable.Param(id = 7) byte[] bArr) {
        this.zza = cardInfoArr;
        this.zzb = accountInfo;
        this.zzc = str;
        this.zzd = str2;
        this.zze = sparseArray;
        this.zzf = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.zza, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i11, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeStringSparseArray(parcel, 6, this.zze, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
