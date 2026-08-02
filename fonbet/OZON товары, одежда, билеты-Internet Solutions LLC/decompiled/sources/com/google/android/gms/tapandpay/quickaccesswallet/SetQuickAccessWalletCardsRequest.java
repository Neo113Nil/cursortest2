package com.google.android.gms.tapandpay.quickaccesswallet;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@ShowFirstParty
@SafeParcelable.Class(creator = "SetQuickAccessWalletCardsRequestCreator")
/* loaded from: classes9.dex */
public final class SetQuickAccessWalletCardsRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<SetQuickAccessWalletCardsRequest> CREATOR = new zzj();

    @SafeParcelable.Field(getter = "getSource", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private Account zzb;

    @SafeParcelable.Field(getter = "getCards", id = 3)
    private QuickAccessWalletCard[] zzc;

    @ShowFirstParty
    public static final class Builder {
        private final SetQuickAccessWalletCardsRequest zza;

        public Builder() {
            this.zza = new SetQuickAccessWalletCardsRequest(null);
        }

        @RecentlyNonNull
        public SetQuickAccessWalletCardsRequest build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setAccount(@RecentlyNonNull Account account) {
            this.zza.zzb = account;
            return this;
        }

        @RecentlyNonNull
        public Builder setCards(@RecentlyNonNull QuickAccessWalletCard[] quickAccessWalletCardArr) {
            this.zza.zzc = quickAccessWalletCardArr;
            return this;
        }

        @RecentlyNonNull
        public Builder setSource(int i11) {
            this.zza.zza = i11;
            return this;
        }

        public Builder(@RecentlyNonNull SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest2 = new SetQuickAccessWalletCardsRequest(null);
            this.zza = setQuickAccessWalletCardsRequest2;
            setQuickAccessWalletCardsRequest2.zza = setQuickAccessWalletCardsRequest.zza;
            setQuickAccessWalletCardsRequest2.zzb = setQuickAccessWalletCardsRequest.zzb;
            setQuickAccessWalletCardsRequest2.zzc = setQuickAccessWalletCardsRequest.zzc;
        }
    }

    private SetQuickAccessWalletCardsRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetQuickAccessWalletCardsRequest) {
            SetQuickAccessWalletCardsRequest setQuickAccessWalletCardsRequest = (SetQuickAccessWalletCardsRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(setQuickAccessWalletCardsRequest.zza)) && Objects.equal(this.zzb, setQuickAccessWalletCardsRequest.zzb) && Arrays.equals(this.zzc, setQuickAccessWalletCardsRequest.zzc)) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public Account getAccount() {
        return this.zzb;
    }

    @RecentlyNonNull
    public QuickAccessWalletCard[] getCards() {
        return this.zzc;
    }

    public int getSource() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb, Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 3, getCards(), i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    SetQuickAccessWalletCardsRequest(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) Account account, @SafeParcelable.Param(id = 3) QuickAccessWalletCard[] quickAccessWalletCardArr) {
        this.zza = i11;
        this.zzb = account;
        this.zzc = quickAccessWalletCardArr;
    }

    /* synthetic */ SetQuickAccessWalletCardsRequest(zzi zziVar) {
    }
}
