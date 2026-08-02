package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "IsTokenizedRequestCreator")
/* loaded from: classes9.dex */
public class IsTokenizedRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<IsTokenizedRequest> CREATOR = new zzb();

    @SafeParcelable.Field(id = 1)
    final String zza;

    @SafeParcelable.Field(id = 2)
    final int zzb;

    @SafeParcelable.Field(id = 3)
    final int zzc;

    @SafeParcelable.Field(id = 4)
    final String zzd;

    public static class Builder {
        private String zza;
        private int zzb;
        private int zzc;
        private String zzd;

        @RecentlyNonNull
        public IsTokenizedRequest build() {
            return new IsTokenizedRequest(this.zza, this.zzb, this.zzc, this.zzd);
        }

        @RecentlyNonNull
        public Builder setIdentifier(@RecentlyNonNull String str) {
            this.zza = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setIssuerName(@RecentlyNonNull String str) {
            this.zzd = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setNetwork(int i11) {
            this.zzb = i11;
            return this;
        }

        @RecentlyNonNull
        public Builder setTokenServiceProvider(int i11) {
            this.zzc = i11;
            return this;
        }
    }

    @SafeParcelable.Constructor
    IsTokenizedRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) String str2) {
        this.zza = str;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
