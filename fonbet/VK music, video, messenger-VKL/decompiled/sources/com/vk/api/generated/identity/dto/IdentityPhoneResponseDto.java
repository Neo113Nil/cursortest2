package com.vk.api.generated.identity.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: IdentityPhoneResponseDto.kt */
/* loaded from: classes14.dex */
public final class IdentityPhoneResponseDto implements Parcelable {
    public static final Parcelable.Creator<IdentityPhoneResponseDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("phone")
    private final String phone;

    /* compiled from: IdentityPhoneResponseDto.kt */
    public static final class a implements Parcelable.Creator<IdentityPhoneResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final IdentityPhoneResponseDto createFromParcel(Parcel parcel) {
            return new IdentityPhoneResponseDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IdentityPhoneResponseDto[] newArray(int i) {
            return new IdentityPhoneResponseDto[i];
        }
    }

    public IdentityPhoneResponseDto(int i, String str) {
        this.id = i;
        this.phone = str;
    }

    public final String d() {
        return this.phone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentityPhoneResponseDto)) {
            return false;
        }
        IdentityPhoneResponseDto identityPhoneResponseDto = (IdentityPhoneResponseDto) obj;
        return this.id == identityPhoneResponseDto.id && epx.f(this.phone, identityPhoneResponseDto.phone);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.phone.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IdentityPhoneResponseDto(id=");
        sb.append(this.id);
        sb.append(", phone=");
        return ho8.a(sb, this.phone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.phone);
    }
}
