package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthTrustedHashIndexedErrorDto.kt */
/* loaded from: classes14.dex */
public final class AuthTrustedHashIndexedErrorDto implements Parcelable {
    public static final Parcelable.Creator<AuthTrustedHashIndexedErrorDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("error")
    private final String error;

    @pmi0("index")
    private final int index;

    /* compiled from: AuthTrustedHashIndexedErrorDto.kt */
    public static final class a implements Parcelable.Creator<AuthTrustedHashIndexedErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthTrustedHashIndexedErrorDto createFromParcel(Parcel parcel) {
            return new AuthTrustedHashIndexedErrorDto(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthTrustedHashIndexedErrorDto[] newArray(int i) {
            return new AuthTrustedHashIndexedErrorDto[i];
        }
    }

    public AuthTrustedHashIndexedErrorDto(int i, String str, String str2) {
        this.index = i;
        this.error = str;
        this.description = str2;
    }

    public final String d() {
        return this.error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.index;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthTrustedHashIndexedErrorDto)) {
            return false;
        }
        AuthTrustedHashIndexedErrorDto authTrustedHashIndexedErrorDto = (AuthTrustedHashIndexedErrorDto) obj;
        return this.index == authTrustedHashIndexedErrorDto.index && epx.f(this.error, authTrustedHashIndexedErrorDto.error) && epx.f(this.description, authTrustedHashIndexedErrorDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.index) * 31, 31, this.error);
        String str = this.description;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthTrustedHashIndexedErrorDto(index=");
        sb.append(this.index);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.error);
        parcel.writeString(this.description);
    }

    public /* synthetic */ AuthTrustedHashIndexedErrorDto(int i, String str, String str2, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : str2);
    }
}
