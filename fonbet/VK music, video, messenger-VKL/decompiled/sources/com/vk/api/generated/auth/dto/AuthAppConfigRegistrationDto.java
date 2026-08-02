package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthAppConfigRegistrationDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigRegistrationDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigRegistrationDto> CREATOR = new a();

    @pmi0("confirm_subtitle")
    private final String confirmSubtitle;

    @pmi0("confirm_title")
    private final String confirmTitle;

    /* compiled from: AuthAppConfigRegistrationDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigRegistrationDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigRegistrationDto createFromParcel(Parcel parcel) {
            return new AuthAppConfigRegistrationDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigRegistrationDto[] newArray(int i) {
            return new AuthAppConfigRegistrationDto[i];
        }
    }

    public AuthAppConfigRegistrationDto(String str, String str2) {
        this.confirmTitle = str;
        this.confirmSubtitle = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthAppConfigRegistrationDto)) {
            return false;
        }
        AuthAppConfigRegistrationDto authAppConfigRegistrationDto = (AuthAppConfigRegistrationDto) obj;
        return epx.f(this.confirmTitle, authAppConfigRegistrationDto.confirmTitle) && epx.f(this.confirmSubtitle, authAppConfigRegistrationDto.confirmSubtitle);
    }

    public final int hashCode() {
        return this.confirmSubtitle.hashCode() + (this.confirmTitle.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthAppConfigRegistrationDto(confirmTitle=");
        sb.append(this.confirmTitle);
        sb.append(", confirmSubtitle=");
        return ho8.a(sb, this.confirmSubtitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.confirmTitle);
        parcel.writeString(this.confirmSubtitle);
    }
}
