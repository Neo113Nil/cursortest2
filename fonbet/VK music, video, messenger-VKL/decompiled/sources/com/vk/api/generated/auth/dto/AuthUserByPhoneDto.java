package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthUserByPhoneDto.kt */
/* loaded from: classes14.dex */
public final class AuthUserByPhoneDto implements Parcelable {
    public static final Parcelable.Creator<AuthUserByPhoneDto> CREATOR = new a();

    @pmi0("first_name")
    private final String firstName;

    @pmi0("hash")
    private final String hash;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("photo_200")
    private final String photo200;

    /* compiled from: AuthUserByPhoneDto.kt */
    public static final class a implements Parcelable.Creator<AuthUserByPhoneDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthUserByPhoneDto createFromParcel(Parcel parcel) {
            return new AuthUserByPhoneDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthUserByPhoneDto[] newArray(int i) {
            return new AuthUserByPhoneDto[i];
        }
    }

    public AuthUserByPhoneDto(String str, String str2, String str3, String str4) {
        this.photo200 = str;
        this.firstName = str2;
        this.lastName = str3;
        this.hash = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthUserByPhoneDto)) {
            return false;
        }
        AuthUserByPhoneDto authUserByPhoneDto = (AuthUserByPhoneDto) obj;
        return epx.f(this.photo200, authUserByPhoneDto.photo200) && epx.f(this.firstName, authUserByPhoneDto.firstName) && epx.f(this.lastName, authUserByPhoneDto.lastName) && epx.f(this.hash, authUserByPhoneDto.hash);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.photo200.hashCode() * 31, 31, this.firstName), 31, this.lastName);
        String str = this.hash;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthUserByPhoneDto(photo200=");
        sb.append(this.photo200);
        sb.append(", firstName=");
        sb.append(this.firstName);
        sb.append(", lastName=");
        sb.append(this.lastName);
        sb.append(", hash=");
        return ho8.a(sb, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.photo200);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.hash);
    }

    public /* synthetic */ AuthUserByPhoneDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4);
    }
}
