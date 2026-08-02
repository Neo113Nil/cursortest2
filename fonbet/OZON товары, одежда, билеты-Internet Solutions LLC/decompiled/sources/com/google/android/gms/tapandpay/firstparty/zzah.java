package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ShowFirstParty
@SafeParcelable.Class(creator = "InStoreCvmConfigCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    @SafeParcelable.Field(id = 2)
    final boolean zza;

    @SafeParcelable.Field(id = 3)
    final int zzb;

    @SafeParcelable.Field(id = 4)
    final int zzc;

    @SafeParcelable.Field(id = 5)
    final int zzd;

    @SafeParcelable.Constructor
    zzah(@SafeParcelable.Param(id = 2) boolean z11, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12, @SafeParcelable.Param(id = 5) int i13) {
        this.zza = z11;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzah) {
            zzah zzahVar = (zzah) obj;
            if (this.zza == zzahVar.zza && this.zzb == zzahVar.zzb && this.zzd == zzahVar.zzd && this.zzc == zzahVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzd), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("requireCdcvmPassing", Boolean.valueOf(this.zza)).add("cdcvmExpirtaionInSecs", Integer.valueOf(this.zzb)).add("unlockedTapLimit", Integer.valueOf(this.zzc)).add("cdcvmTapLimit", Integer.valueOf(this.zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zza);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
