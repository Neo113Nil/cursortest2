package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "CreatePushProvisionSessionRequestCreator")
/* loaded from: classes9.dex */
public class CreatePushProvisionSessionRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<CreatePushProvisionSessionRequest> CREATOR = new zza();

    @SafeParcelable.Field(id = 1)
    final UserAddress zza;

    @SafeParcelable.Field(id = 2)
    final String zzb;

    @SafeParcelable.Field(id = 3)
    final String zzc;

    @SafeParcelable.Field(defaultValue = "", id = 4)
    final String zzd;

    public static class Builder {
        private UserAddress zza;
        private String zzb;
        private String zzc;
        private String zzd;

        @RecentlyNonNull
        public CreatePushProvisionSessionRequest build() {
            return new CreatePushProvisionSessionRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @RecentlyNonNull
        public Builder setCardDisplayName(@RecentlyNonNull String str) {
            this.zzc = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setClientSessionId(@RecentlyNonNull String str) {
            this.zzb = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setIntegratorId(@RecentlyNonNull String str) {
            this.zzd = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setUserAddress(@RecentlyNonNull UserAddress userAddress) {
            this.zza = userAddress;
            return this;
        }
    }

    @SafeParcelable.Constructor
    CreatePushProvisionSessionRequest(@SafeParcelable.Param(id = 1) UserAddress userAddress, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3) {
        this.zza = userAddress;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i11, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
