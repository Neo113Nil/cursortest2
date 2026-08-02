package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TokenStatusCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class TokenStatus extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zze();

    @SafeParcelable.Field(id = 2)
    String zza;

    @SafeParcelable.Field(id = 3)
    int zzb;

    @SafeParcelable.Field(id = 4)
    boolean zzc;

    @SafeParcelable.Constructor
    public TokenStatus(@RecentlyNonNull @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) boolean z11) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = z11;
    }

    public int getTokenState() {
        return this.zzb;
    }

    public boolean isSelected() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
