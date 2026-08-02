package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetQrAuthDataResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetQrAuthDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetQrAuthDataResponseDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AuthGetAuthDataAppDto f71app;

    @pmi0("code_auth_verification_hash")
    private final String codeAuthVerificationHash;

    @pmi0("config")
    private final AuthAppConfigDto config;

    @pmi0("outer")
    private final AuthGetAuthDataOuterDto outer;

    @pmi0("settings")
    private final AuthGetQrAuthDataSettingsDto settings;

    /* compiled from: AuthGetQrAuthDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetQrAuthDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetQrAuthDataResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetQrAuthDataResponseDto(AuthAppConfigDto.CREATOR.createFromParcel(parcel), AuthGetAuthDataOuterDto.CREATOR.createFromParcel(parcel), AuthGetAuthDataAppDto.CREATOR.createFromParcel(parcel), AuthGetQrAuthDataSettingsDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetQrAuthDataResponseDto[] newArray(int i) {
            return new AuthGetQrAuthDataResponseDto[i];
        }
    }

    public AuthGetQrAuthDataResponseDto(AuthAppConfigDto authAppConfigDto, AuthGetAuthDataOuterDto authGetAuthDataOuterDto, AuthGetAuthDataAppDto authGetAuthDataAppDto, AuthGetQrAuthDataSettingsDto authGetQrAuthDataSettingsDto, String str) {
        this.config = authAppConfigDto;
        this.outer = authGetAuthDataOuterDto;
        this.f71app = authGetAuthDataAppDto;
        this.settings = authGetQrAuthDataSettingsDto;
        this.codeAuthVerificationHash = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetQrAuthDataResponseDto)) {
            return false;
        }
        AuthGetQrAuthDataResponseDto authGetQrAuthDataResponseDto = (AuthGetQrAuthDataResponseDto) obj;
        return epx.f(this.config, authGetQrAuthDataResponseDto.config) && epx.f(this.outer, authGetQrAuthDataResponseDto.outer) && epx.f(this.f71app, authGetQrAuthDataResponseDto.f71app) && epx.f(this.settings, authGetQrAuthDataResponseDto.settings) && epx.f(this.codeAuthVerificationHash, authGetQrAuthDataResponseDto.codeAuthVerificationHash);
    }

    public final int hashCode() {
        return this.codeAuthVerificationHash.hashCode() + ((this.settings.hashCode() + ((this.f71app.hashCode() + ((this.outer.hashCode() + (this.config.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetQrAuthDataResponseDto(config=");
        sb.append(this.config);
        sb.append(", outer=");
        sb.append(this.outer);
        sb.append(", app=");
        sb.append(this.f71app);
        sb.append(", settings=");
        sb.append(this.settings);
        sb.append(", codeAuthVerificationHash=");
        return ho8.a(sb, this.codeAuthVerificationHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.config.writeToParcel(parcel, i);
        this.outer.writeToParcel(parcel, i);
        this.f71app.writeToParcel(parcel, i);
        this.settings.writeToParcel(parcel, i);
        parcel.writeString(this.codeAuthVerificationHash);
    }
}
