package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new zzn();

    @SafeParcelable.Field(id = 2)
    String zzgc;

    @SafeParcelable.Field(id = 3)
    String zzgd;

    @SafeParcelable.Field(id = 4)
    TimeInterval zzgh;

    @SafeParcelable.Field(id = 5)
    @Deprecated
    UriData zzgi;

    @SafeParcelable.Field(id = 6)
    @Deprecated
    UriData zzgj;

    public final class Builder {
        private Builder() {
        }

        public final WalletObjectMessage build() {
            return WalletObjectMessage.this;
        }

        @Deprecated
        public final Builder setActionUri(UriData uriData) {
            WalletObjectMessage.this.zzgi = uriData;
            return this;
        }

        public final Builder setBody(String str) {
            WalletObjectMessage.this.zzgd = str;
            return this;
        }

        public final Builder setDisplayInterval(TimeInterval timeInterval) {
            WalletObjectMessage.this.zzgh = timeInterval;
            return this;
        }

        public final Builder setHeader(String str) {
            WalletObjectMessage.this.zzgc = str;
            return this;
        }

        @Deprecated
        public final Builder setImageUri(UriData uriData) {
            WalletObjectMessage.this.zzgj = uriData;
            return this;
        }
    }

    @SafeParcelable.Constructor
    WalletObjectMessage(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) TimeInterval timeInterval, @SafeParcelable.Param(id = 5) UriData uriData, @SafeParcelable.Param(id = 6) UriData uriData2) {
        this.zzgc = str;
        this.zzgd = str2;
        this.zzgh = timeInterval;
        this.zzgi = uriData;
        this.zzgj = uriData2;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Deprecated
    public final UriData getActionUri() {
        return this.zzgi;
    }

    public final String getBody() {
        return this.zzgd;
    }

    public final TimeInterval getDisplayInterval() {
        return this.zzgh;
    }

    public final String getHeader() {
        return this.zzgc;
    }

    @Deprecated
    public final UriData getImageUri() {
        return this.zzgj;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzgc, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzgd, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzgh, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zzgi, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzgj, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    WalletObjectMessage() {
    }
}
