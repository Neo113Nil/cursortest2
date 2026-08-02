package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthExternalFlowOutResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthExternalFlowOutResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthExternalFlowOutResponseDto> CREATOR = new a();

    @pmi0("redirect_url")
    private final String redirectUrl;

    @pmi0("super_app_token")
    private final String superAppToken;

    /* compiled from: AuthExternalFlowOutResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthExternalFlowOutResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthExternalFlowOutResponseDto createFromParcel(Parcel parcel) {
            return new AuthExternalFlowOutResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthExternalFlowOutResponseDto[] newArray(int i) {
            return new AuthExternalFlowOutResponseDto[i];
        }
    }

    public AuthExternalFlowOutResponseDto(String str, String str2) {
        this.superAppToken = str;
        this.redirectUrl = str2;
    }

    public final String d() {
        return this.superAppToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthExternalFlowOutResponseDto)) {
            return false;
        }
        AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
        return epx.f(this.superAppToken, authExternalFlowOutResponseDto.superAppToken) && epx.f(this.redirectUrl, authExternalFlowOutResponseDto.redirectUrl);
    }

    public final int hashCode() {
        int hashCode = this.superAppToken.hashCode() * 31;
        String str = this.redirectUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthExternalFlowOutResponseDto(superAppToken=");
        sb.append(this.superAppToken);
        sb.append(", redirectUrl=");
        return ho8.a(sb, this.redirectUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.superAppToken);
        parcel.writeString(this.redirectUrl);
    }

    public /* synthetic */ AuthExternalFlowOutResponseDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
