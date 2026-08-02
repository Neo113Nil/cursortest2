package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataResponseDto> CREATOR = new a();

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AuthGetAuthDataAppDto f70app;

    @pmi0(LoginApiConstants.RESULT_NAME_AUTH_TOKEN)
    private final String authToken;

    @pmi0("config")
    private final AuthAppConfigDto config;

    @pmi0("domains")
    private final List<String> domains;

    @pmi0("hash")
    private final AuthGetAuthDataHashDto hash;

    @pmi0("oauth")
    private final AuthGetAuthDataOauthDto oauth;

    @pmi0("oauth2")
    private final AuthGetAuthDataOauth2Dto oauth2;

    @pmi0("outer")
    private final AuthGetAuthDataOuterDto outer;

    @pmi0("settings")
    private final AuthGetAuthDataSettingsDto settings;

    @pmi0("stats")
    private final AuthGetAuthDataStatsDto stats;

    /* compiled from: AuthGetAuthDataResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataResponseDto(AuthAppConfigDto.CREATOR.createFromParcel(parcel), AuthGetAuthDataOuterDto.CREATOR.createFromParcel(parcel), AuthGetAuthDataAppDto.CREATOR.createFromParcel(parcel), AuthGetAuthDataOauthDto.CREATOR.createFromParcel(parcel), AuthGetAuthDataHashDto.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), AuthGetAuthDataSettingsDto.CREATOR.createFromParcel(parcel), AuthGetAuthDataOauth2Dto.CREATOR.createFromParcel(parcel), AuthGetAuthDataStatsDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataResponseDto[] newArray(int i) {
            return new AuthGetAuthDataResponseDto[i];
        }
    }

    public AuthGetAuthDataResponseDto(AuthAppConfigDto authAppConfigDto, AuthGetAuthDataOuterDto authGetAuthDataOuterDto, AuthGetAuthDataAppDto authGetAuthDataAppDto, AuthGetAuthDataOauthDto authGetAuthDataOauthDto, AuthGetAuthDataHashDto authGetAuthDataHashDto, List<String> list, AuthGetAuthDataSettingsDto authGetAuthDataSettingsDto, AuthGetAuthDataOauth2Dto authGetAuthDataOauth2Dto, AuthGetAuthDataStatsDto authGetAuthDataStatsDto, String str) {
        this.config = authAppConfigDto;
        this.outer = authGetAuthDataOuterDto;
        this.f70app = authGetAuthDataAppDto;
        this.oauth = authGetAuthDataOauthDto;
        this.hash = authGetAuthDataHashDto;
        this.domains = list;
        this.settings = authGetAuthDataSettingsDto;
        this.oauth2 = authGetAuthDataOauth2Dto;
        this.stats = authGetAuthDataStatsDto;
        this.authToken = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataResponseDto)) {
            return false;
        }
        AuthGetAuthDataResponseDto authGetAuthDataResponseDto = (AuthGetAuthDataResponseDto) obj;
        return epx.f(this.config, authGetAuthDataResponseDto.config) && epx.f(this.outer, authGetAuthDataResponseDto.outer) && epx.f(this.f70app, authGetAuthDataResponseDto.f70app) && epx.f(this.oauth, authGetAuthDataResponseDto.oauth) && epx.f(this.hash, authGetAuthDataResponseDto.hash) && epx.f(this.domains, authGetAuthDataResponseDto.domains) && epx.f(this.settings, authGetAuthDataResponseDto.settings) && epx.f(this.oauth2, authGetAuthDataResponseDto.oauth2) && epx.f(this.stats, authGetAuthDataResponseDto.stats) && epx.f(this.authToken, authGetAuthDataResponseDto.authToken);
    }

    public final int hashCode() {
        return this.authToken.hashCode() + ((this.stats.hashCode() + ((this.oauth2.hashCode() + ((this.settings.hashCode() + fw3.a((this.hash.hashCode() + ((this.oauth.hashCode() + ((this.f70app.hashCode() + ((this.outer.hashCode() + (this.config.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.domains)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataResponseDto(config=");
        sb.append(this.config);
        sb.append(", outer=");
        sb.append(this.outer);
        sb.append(", app=");
        sb.append(this.f70app);
        sb.append(", oauth=");
        sb.append(this.oauth);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", domains=");
        sb.append(this.domains);
        sb.append(", settings=");
        sb.append(this.settings);
        sb.append(", oauth2=");
        sb.append(this.oauth2);
        sb.append(", stats=");
        sb.append(this.stats);
        sb.append(", authToken=");
        return ho8.a(sb, this.authToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.config.writeToParcel(parcel, i);
        this.outer.writeToParcel(parcel, i);
        this.f70app.writeToParcel(parcel, i);
        this.oauth.writeToParcel(parcel, i);
        this.hash.writeToParcel(parcel, i);
        parcel.writeStringList(this.domains);
        this.settings.writeToParcel(parcel, i);
        this.oauth2.writeToParcel(parcel, i);
        this.stats.writeToParcel(parcel, i);
        parcel.writeString(this.authToken);
    }
}
