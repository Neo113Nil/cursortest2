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

@ShowFirstParty
@SafeParcelable.Class(creator = "GetQuickAccessWalletConfigRequestCreator")
/* loaded from: classes9.dex */
public final class GetQuickAccessWalletConfigRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<GetQuickAccessWalletConfigRequest> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getSource", id = 1)
    private int zza;

    @SafeParcelable.Field(getter = "getAccount", id = 2)
    private Account zzb;

    @ShowFirstParty
    public static final class Builder {
        private final GetQuickAccessWalletConfigRequest zza;

        public Builder() {
            this.zza = new GetQuickAccessWalletConfigRequest(null);
        }

        @RecentlyNonNull
        public GetQuickAccessWalletConfigRequest build() {
            return this.zza;
        }

        @RecentlyNonNull
        public Builder setAccount(@RecentlyNonNull Account account) {
            this.zza.zzb = account;
            return this;
        }

        @RecentlyNonNull
        public Builder setSource(int i11) {
            this.zza.zza = i11;
            return this;
        }

        public Builder(@RecentlyNonNull GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest2 = new GetQuickAccessWalletConfigRequest(null);
            this.zza = getQuickAccessWalletConfigRequest2;
            getQuickAccessWalletConfigRequest2.zza = getQuickAccessWalletConfigRequest.zza;
            getQuickAccessWalletConfigRequest2.zzb = getQuickAccessWalletConfigRequest.zzb;
        }
    }

    private GetQuickAccessWalletConfigRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetQuickAccessWalletConfigRequest) {
            GetQuickAccessWalletConfigRequest getQuickAccessWalletConfigRequest = (GetQuickAccessWalletConfigRequest) obj;
            if (Objects.equal(Integer.valueOf(this.zza), Integer.valueOf(getQuickAccessWalletConfigRequest.zza)) && Objects.equal(this.zzb, getQuickAccessWalletConfigRequest.zzb)) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public Account getAccount() {
        return this.zzb;
    }

    public int getSource() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), this.zzb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSource());
        SafeParcelWriter.writeParcelable(parcel, 2, getAccount(), i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    GetQuickAccessWalletConfigRequest(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) Account account) {
        this.zza = i11;
        this.zzb = account;
    }

    /* synthetic */ GetQuickAccessWalletConfigRequest(zzc zzcVar) {
    }
}
