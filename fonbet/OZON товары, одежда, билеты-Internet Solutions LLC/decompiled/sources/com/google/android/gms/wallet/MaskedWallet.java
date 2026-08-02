package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

@SafeParcelable.Class(creator = "MaskedWalletCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new zzq();

    @SafeParcelable.Field(id = 2)
    private String zzbc;

    @SafeParcelable.Field(id = 3)
    private String zzbd;

    @SafeParcelable.Field(id = 5)
    private String zzbf;

    @SafeParcelable.Field(id = 6)
    private zza zzbg;

    @SafeParcelable.Field(id = 7)
    private zza zzbh;

    @SafeParcelable.Field(id = 4)
    private String[] zzbi;

    @SafeParcelable.Field(id = 10)
    private UserAddress zzbj;

    @SafeParcelable.Field(id = 11)
    private UserAddress zzbk;

    @SafeParcelable.Field(id = 12)
    private InstrumentInfo[] zzbl;

    @SafeParcelable.Field(id = 8)
    private LoyaltyWalletObject[] zzda;

    @SafeParcelable.Field(id = 9)
    private OfferWalletObject[] zzdb;

    @SafeParcelable.Constructor
    MaskedWallet(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String[] strArr, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) zza zzaVar, @SafeParcelable.Param(id = 7) zza zzaVar2, @SafeParcelable.Param(id = 8) LoyaltyWalletObject[] loyaltyWalletObjectArr, @SafeParcelable.Param(id = 9) OfferWalletObject[] offerWalletObjectArr, @SafeParcelable.Param(id = 10) UserAddress userAddress, @SafeParcelable.Param(id = 11) UserAddress userAddress2, @SafeParcelable.Param(id = 12) InstrumentInfo[] instrumentInfoArr) {
        this.zzbc = str;
        this.zzbd = str2;
        this.zzbi = strArr;
        this.zzbf = str3;
        this.zzbg = zzaVar;
        this.zzbh = zzaVar2;
        this.zzda = loyaltyWalletObjectArr;
        this.zzdb = offerWalletObjectArr;
        this.zzbj = userAddress;
        this.zzbk = userAddress2;
        this.zzbl = instrumentInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzbc, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzbd, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.zzbi, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzbf, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzbg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzbh, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzda, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.zzdb, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzbj, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzbk, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.zzbl, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private MaskedWallet() {
    }
}
