package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataSettingsSkinParamsObjectDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataSettingsSkinParamsObjectDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataSettingsSkinParamsObjectDto> CREATOR = new a();

    @pmi0("promo_title")
    private final String promoTitle;

    @pmi0("small_caption")
    private final boolean smallCaption;

    /* compiled from: AuthGetAuthDataSettingsSkinParamsObjectDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataSettingsSkinParamsObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsSkinParamsObjectDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataSettingsSkinParamsObjectDto(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsSkinParamsObjectDto[] newArray(int i) {
            return new AuthGetAuthDataSettingsSkinParamsObjectDto[i];
        }
    }

    public AuthGetAuthDataSettingsSkinParamsObjectDto(String str, boolean z) {
        this.promoTitle = str;
        this.smallCaption = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataSettingsSkinParamsObjectDto)) {
            return false;
        }
        AuthGetAuthDataSettingsSkinParamsObjectDto authGetAuthDataSettingsSkinParamsObjectDto = (AuthGetAuthDataSettingsSkinParamsObjectDto) obj;
        return epx.f(this.promoTitle, authGetAuthDataSettingsSkinParamsObjectDto.promoTitle) && this.smallCaption == authGetAuthDataSettingsSkinParamsObjectDto.smallCaption;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.smallCaption) + (this.promoTitle.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataSettingsSkinParamsObjectDto(promoTitle=");
        sb.append(this.promoTitle);
        sb.append(", smallCaption=");
        return q0.a(sb, this.smallCaption, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.promoTitle);
        parcel.writeInt(this.smallCaption ? 1 : 0);
    }
}
