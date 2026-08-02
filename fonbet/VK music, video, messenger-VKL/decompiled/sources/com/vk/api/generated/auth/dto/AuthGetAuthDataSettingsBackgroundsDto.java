package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AuthGetAuthDataSettingsBackgroundsDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataSettingsBackgroundsDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataSettingsBackgroundsDto> CREATOR = new a();

    @pmi0("color")
    private final String color;

    @pmi0("lg")
    private final String lg;

    @pmi0("sm")
    private final String sm;

    /* compiled from: AuthGetAuthDataSettingsBackgroundsDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataSettingsBackgroundsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsBackgroundsDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataSettingsBackgroundsDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsBackgroundsDto[] newArray(int i) {
            return new AuthGetAuthDataSettingsBackgroundsDto[i];
        }
    }

    public AuthGetAuthDataSettingsBackgroundsDto(String str, String str2, String str3) {
        this.color = str;
        this.sm = str2;
        this.lg = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataSettingsBackgroundsDto)) {
            return false;
        }
        AuthGetAuthDataSettingsBackgroundsDto authGetAuthDataSettingsBackgroundsDto = (AuthGetAuthDataSettingsBackgroundsDto) obj;
        return epx.f(this.color, authGetAuthDataSettingsBackgroundsDto.color) && epx.f(this.sm, authGetAuthDataSettingsBackgroundsDto.sm) && epx.f(this.lg, authGetAuthDataSettingsBackgroundsDto.lg);
    }

    public final int hashCode() {
        return this.lg.hashCode() + urd0.a(this.color.hashCode() * 31, 31, this.sm);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataSettingsBackgroundsDto(color=");
        sb.append(this.color);
        sb.append(", sm=");
        sb.append(this.sm);
        sb.append(", lg=");
        return ho8.a(sb, this.lg, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.color);
        parcel.writeString(this.sm);
        parcel.writeString(this.lg);
    }
}
