package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.sdk.SharedKt;
import xsna.bh10;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.zcl;

/* compiled from: AuthRefreshTokenDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshTokenDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshTokenDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
    private final AuthRefreshAccessTokenDto accessToken;

    @pmi0("banned")
    private final boolean banned;

    @pmi0("deactivated")
    private final Boolean deactivated;

    @pmi0("index")
    private final int index;

    @pmi0("phone_to_actualize")
    private final String phoneToActualize;

    @pmi0("reactivation_date")
    private final String reactivationDate;

    @pmi0("silent_token")
    private final AuthRefreshSilentTokenDto silentToken;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("user_session")
    private final List<AuthRefreshUserSessionDto> userSession;

    @pmi0("webview_access_token")
    private final AuthRefreshWebviewAccessTokenDto webviewAccessToken;

    @pmi0("webview_refresh_token")
    private final AuthRefreshWebviewRefreshTokenDto webviewRefreshToken;

    /* compiled from: AuthRefreshTokenDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshTokenDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTokenDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            UserId userId = (UserId) parcel.readParcelable(AuthRefreshTokenDto.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            int i = 0;
            Boolean bool = valueOf;
            String readString2 = parcel.readString();
            AuthRefreshAccessTokenDto createFromParcel = parcel.readInt() == 0 ? null : AuthRefreshAccessTokenDto.CREATOR.createFromParcel(parcel);
            AuthRefreshWebviewAccessTokenDto createFromParcel2 = parcel.readInt() == 0 ? null : AuthRefreshWebviewAccessTokenDto.CREATOR.createFromParcel(parcel);
            AuthRefreshWebviewRefreshTokenDto createFromParcel3 = parcel.readInt() == 0 ? null : AuthRefreshWebviewRefreshTokenDto.CREATOR.createFromParcel(parcel);
            AuthRefreshSilentTokenDto createFromParcel4 = parcel.readInt() == 0 ? null : AuthRefreshSilentTokenDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(AuthRefreshUserSessionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new AuthRefreshTokenDto(readInt, userId, z, bool, readString, readString2, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTokenDto[] newArray(int i) {
            return new AuthRefreshTokenDto[i];
        }
    }

    public AuthRefreshTokenDto(int i, UserId userId, boolean z, Boolean bool, String str, String str2, AuthRefreshAccessTokenDto authRefreshAccessTokenDto, AuthRefreshWebviewAccessTokenDto authRefreshWebviewAccessTokenDto, AuthRefreshWebviewRefreshTokenDto authRefreshWebviewRefreshTokenDto, AuthRefreshSilentTokenDto authRefreshSilentTokenDto, List<AuthRefreshUserSessionDto> list) {
        this.index = i;
        this.userId = userId;
        this.banned = z;
        this.deactivated = bool;
        this.reactivationDate = str;
        this.phoneToActualize = str2;
        this.accessToken = authRefreshAccessTokenDto;
        this.webviewAccessToken = authRefreshWebviewAccessTokenDto;
        this.webviewRefreshToken = authRefreshWebviewRefreshTokenDto;
        this.silentToken = authRefreshSilentTokenDto;
        this.userSession = list;
    }

    public final AuthRefreshAccessTokenDto d() {
        return this.accessToken;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.banned;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRefreshTokenDto)) {
            return false;
        }
        AuthRefreshTokenDto authRefreshTokenDto = (AuthRefreshTokenDto) obj;
        return this.index == authRefreshTokenDto.index && epx.f(this.userId, authRefreshTokenDto.userId) && this.banned == authRefreshTokenDto.banned && epx.f(this.deactivated, authRefreshTokenDto.deactivated) && epx.f(this.reactivationDate, authRefreshTokenDto.reactivationDate) && epx.f(this.phoneToActualize, authRefreshTokenDto.phoneToActualize) && epx.f(this.accessToken, authRefreshTokenDto.accessToken) && epx.f(this.webviewAccessToken, authRefreshTokenDto.webviewAccessToken) && epx.f(this.webviewRefreshToken, authRefreshTokenDto.webviewRefreshToken) && epx.f(this.silentToken, authRefreshTokenDto.silentToken) && epx.f(this.userSession, authRefreshTokenDto.userSession);
    }

    public final Boolean f() {
        return this.deactivated;
    }

    public final int g() {
        return this.index;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int b = qoy.b(bh10.a(Integer.hashCode(this.index) * 31, 31, this.userId.b), 31, this.banned);
        Boolean bool = this.deactivated;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.reactivationDate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneToActualize;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AuthRefreshAccessTokenDto authRefreshAccessTokenDto = this.accessToken;
        int hashCode4 = (hashCode3 + (authRefreshAccessTokenDto == null ? 0 : authRefreshAccessTokenDto.hashCode())) * 31;
        AuthRefreshWebviewAccessTokenDto authRefreshWebviewAccessTokenDto = this.webviewAccessToken;
        int hashCode5 = (hashCode4 + (authRefreshWebviewAccessTokenDto == null ? 0 : authRefreshWebviewAccessTokenDto.hashCode())) * 31;
        AuthRefreshWebviewRefreshTokenDto authRefreshWebviewRefreshTokenDto = this.webviewRefreshToken;
        int hashCode6 = (hashCode5 + (authRefreshWebviewRefreshTokenDto == null ? 0 : authRefreshWebviewRefreshTokenDto.hashCode())) * 31;
        AuthRefreshSilentTokenDto authRefreshSilentTokenDto = this.silentToken;
        int hashCode7 = (hashCode6 + (authRefreshSilentTokenDto == null ? 0 : authRefreshSilentTokenDto.hashCode())) * 31;
        List<AuthRefreshUserSessionDto> list = this.userSession;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String i() {
        return this.phoneToActualize;
    }

    public final AuthRefreshSilentTokenDto j() {
        return this.silentToken;
    }

    public final List<AuthRefreshUserSessionDto> k() {
        return this.userSession;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshTokenDto(index=");
        sb.append(this.index);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", banned=");
        sb.append(this.banned);
        sb.append(", deactivated=");
        sb.append(this.deactivated);
        sb.append(", reactivationDate=");
        sb.append(this.reactivationDate);
        sb.append(", phoneToActualize=");
        sb.append(this.phoneToActualize);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", webviewAccessToken=");
        sb.append(this.webviewAccessToken);
        sb.append(", webviewRefreshToken=");
        sb.append(this.webviewRefreshToken);
        sb.append(", silentToken=");
        sb.append(this.silentToken);
        sb.append(", userSession=");
        return ms9.a(')', sb, this.userSession);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeParcelable(this.userId, i);
        parcel.writeInt(this.banned ? 1 : 0);
        Boolean bool = this.deactivated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.reactivationDate);
        parcel.writeString(this.phoneToActualize);
        AuthRefreshAccessTokenDto authRefreshAccessTokenDto = this.accessToken;
        if (authRefreshAccessTokenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authRefreshAccessTokenDto.writeToParcel(parcel, i);
        }
        AuthRefreshWebviewAccessTokenDto authRefreshWebviewAccessTokenDto = this.webviewAccessToken;
        if (authRefreshWebviewAccessTokenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authRefreshWebviewAccessTokenDto.writeToParcel(parcel, i);
        }
        AuthRefreshWebviewRefreshTokenDto authRefreshWebviewRefreshTokenDto = this.webviewRefreshToken;
        if (authRefreshWebviewRefreshTokenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authRefreshWebviewRefreshTokenDto.writeToParcel(parcel, i);
        }
        AuthRefreshSilentTokenDto authRefreshSilentTokenDto = this.silentToken;
        if (authRefreshSilentTokenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authRefreshSilentTokenDto.writeToParcel(parcel, i);
        }
        List<AuthRefreshUserSessionDto> list = this.userSession;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AuthRefreshUserSessionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthRefreshTokenDto(int i, UserId userId, boolean z, Boolean bool, String str, String str2, AuthRefreshAccessTokenDto authRefreshAccessTokenDto, AuthRefreshWebviewAccessTokenDto authRefreshWebviewAccessTokenDto, AuthRefreshWebviewRefreshTokenDto authRefreshWebviewRefreshTokenDto, AuthRefreshSilentTokenDto authRefreshSilentTokenDto, List list, int i2, zcl zclVar) {
        this(i, userId, z, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? null : authRefreshAccessTokenDto, (i2 & 128) != 0 ? null : authRefreshWebviewAccessTokenDto, (i2 & 256) != 0 ? null : authRefreshWebviewRefreshTokenDto, (i2 & 512) != 0 ? null : authRefreshSilentTokenDto, (i2 & 1024) != 0 ? null : list);
    }
}
