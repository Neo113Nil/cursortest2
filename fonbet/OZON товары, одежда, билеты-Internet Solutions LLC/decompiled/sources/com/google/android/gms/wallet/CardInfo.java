package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "CardInfoCreator")
/* loaded from: classes9.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zzc();

    @SafeParcelable.Field(id = 1)
    private String zzaj;

    @SafeParcelable.Field(id = 2)
    private String zzak;

    @SafeParcelable.Field(id = 3)
    private String zzal;

    @SafeParcelable.Field(id = 4)
    private int zzam;

    @SafeParcelable.Field(id = 5)
    private UserAddress zzan;

    @SafeParcelable.Constructor
    CardInfo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) int i11, @SafeParcelable.Param(id = 5) UserAddress userAddress) {
        this.zzaj = str;
        this.zzak = str2;
        this.zzal = str3;
        this.zzam = i11;
        this.zzan = userAddress;
    }

    public final UserAddress getBillingAddress() {
        return this.zzan;
    }

    public final int getCardClass() {
        int i11 = this.zzam;
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return i11;
        }
        return 0;
    }

    public final String getCardDescription() {
        return this.zzaj;
    }

    public final String getCardDetails() {
        return this.zzal;
    }

    public final String getCardNetwork() {
        return this.zzak;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzaj, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzak, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzal, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzam);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzan, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private CardInfo() {
    }
}
