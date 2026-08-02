package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AuthGetQrAuthDataSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetQrAuthDataSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetQrAuthDataSettingsDto> CREATOR = new a();

    @pmi0("allowed_query")
    private final List<String> allowedQuery;

    @pmi0("vkui_scheme")
    private final String vkuiScheme;

    /* compiled from: AuthGetQrAuthDataSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetQrAuthDataSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetQrAuthDataSettingsDto createFromParcel(Parcel parcel) {
            return new AuthGetQrAuthDataSettingsDto(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetQrAuthDataSettingsDto[] newArray(int i) {
            return new AuthGetQrAuthDataSettingsDto[i];
        }
    }

    public AuthGetQrAuthDataSettingsDto(String str, List<String> list) {
        this.vkuiScheme = str;
        this.allowedQuery = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetQrAuthDataSettingsDto)) {
            return false;
        }
        AuthGetQrAuthDataSettingsDto authGetQrAuthDataSettingsDto = (AuthGetQrAuthDataSettingsDto) obj;
        return epx.f(this.vkuiScheme, authGetQrAuthDataSettingsDto.vkuiScheme) && epx.f(this.allowedQuery, authGetQrAuthDataSettingsDto.allowedQuery);
    }

    public final int hashCode() {
        return this.allowedQuery.hashCode() + (this.vkuiScheme.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetQrAuthDataSettingsDto(vkuiScheme=");
        sb.append(this.vkuiScheme);
        sb.append(", allowedQuery=");
        return ms9.a(')', sb, this.allowedQuery);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.vkuiScheme);
        parcel.writeStringList(this.allowedQuery);
    }
}
