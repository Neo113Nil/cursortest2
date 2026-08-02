package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCheckAuthHashUserDto.kt */
/* loaded from: classes14.dex */
public final class AuthCheckAuthHashUserDto implements Parcelable {
    public static final Parcelable.Creator<AuthCheckAuthHashUserDto> CREATOR = new a();

    @pmi0("maskPhone")
    private final String maskPhone;

    @pmi0("name")
    private final String name;

    @pmi0("photo")
    private final String photo;

    /* compiled from: AuthCheckAuthHashUserDto.kt */
    public static final class a implements Parcelable.Creator<AuthCheckAuthHashUserDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthHashUserDto createFromParcel(Parcel parcel) {
            return new AuthCheckAuthHashUserDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthHashUserDto[] newArray(int i) {
            return new AuthCheckAuthHashUserDto[i];
        }
    }

    public AuthCheckAuthHashUserDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCheckAuthHashUserDto)) {
            return false;
        }
        AuthCheckAuthHashUserDto authCheckAuthHashUserDto = (AuthCheckAuthHashUserDto) obj;
        return epx.f(this.name, authCheckAuthHashUserDto.name) && epx.f(this.maskPhone, authCheckAuthHashUserDto.maskPhone) && epx.f(this.photo, authCheckAuthHashUserDto.photo);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maskPhone;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCheckAuthHashUserDto(name=");
        sb.append(this.name);
        sb.append(", maskPhone=");
        sb.append(this.maskPhone);
        sb.append(", photo=");
        return ho8.a(sb, this.photo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.maskPhone);
        parcel.writeString(this.photo);
    }

    public AuthCheckAuthHashUserDto(String str, String str2, String str3) {
        this.name = str;
        this.maskPhone = str2;
        this.photo = str3;
    }

    public /* synthetic */ AuthCheckAuthHashUserDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
