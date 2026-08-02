package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: IdentityAddressResponseDto.kt */
/* loaded from: classes14.dex */
public final class IdentityAddressResponseDto implements Parcelable {
    public static final Parcelable.Creator<IdentityAddressResponseDto> CREATOR = new a();

    @pmi0("full_address")
    private final String fullAddress;

    @pmi0("id")
    private final int id;

    /* compiled from: IdentityAddressResponseDto.kt */
    public static final class a implements Parcelable.Creator<IdentityAddressResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityAddressResponseDto createFromParcel(Parcel parcel) {
            return new IdentityAddressResponseDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityAddressResponseDto[] newArray(int i) {
            return new IdentityAddressResponseDto[i];
        }
    }

    public IdentityAddressResponseDto(int i, String str) {
        this.id = i;
        this.fullAddress = str;
    }

    public final String d() {
        return this.fullAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityAddressResponseDto)) {
            return false;
        }
        IdentityAddressResponseDto identityAddressResponseDto = (IdentityAddressResponseDto) obj;
        return this.id == identityAddressResponseDto.id && epx.f(this.fullAddress, identityAddressResponseDto.fullAddress);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.fullAddress.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityAddressResponseDto(id=");
        sb.append(this.id);
        sb.append(", fullAddress=");
        return ho8.a(sb, this.fullAddress, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.fullAddress);
    }
}
