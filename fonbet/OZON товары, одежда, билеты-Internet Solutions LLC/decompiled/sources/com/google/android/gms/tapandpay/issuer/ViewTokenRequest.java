package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "ViewTokenRequestCreator")
/* loaded from: classes9.dex */
public class ViewTokenRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<ViewTokenRequest> CREATOR = new zzg();

    @SafeParcelable.Field(id = 1)
    final String zza;

    @SafeParcelable.Field(id = 2)
    final int zzb;

    public static class Builder {
        private String zza;
        private int zzb;

        @RecentlyNonNull
        public ViewTokenRequest build() {
            return new ViewTokenRequest(this.zza, this.zzb);
        }

        @RecentlyNonNull
        public Builder setIssuerTokenId(@RecentlyNonNull String str) {
            this.zza = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTokenServiceProvider(int i11) {
            this.zzb = i11;
            return this;
        }
    }

    @SafeParcelable.Constructor
    ViewTokenRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i11) {
        this.zza = str;
        this.zzb = i11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
