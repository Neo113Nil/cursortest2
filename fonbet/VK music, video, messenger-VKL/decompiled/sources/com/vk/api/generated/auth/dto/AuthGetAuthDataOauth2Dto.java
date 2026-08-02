package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;

/* compiled from: AuthGetAuthDataOauth2Dto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataOauth2Dto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataOauth2Dto> CREATOR = new a();

    @pmi0("authz_client_id")
    private final int authzClientId;

    @pmi0("authz_client_redirect_uri")
    private final String authzClientRedirectUri;

    @pmi0("code_challenge")
    private final String codeChallenge;

    @pmi0("code_challenge_method")
    private final String codeChallengeMethod;

    @pmi0("device_id")
    private final String deviceId;

    @pmi0("enabled")
    private final boolean enabled;

    @pmi0("prompt")
    private final String prompt;

    @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
    private final String scope;

    @pmi0("state")
    private final String state;

    /* compiled from: AuthGetAuthDataOauth2Dto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataOauth2Dto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataOauth2Dto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataOauth2Dto(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataOauth2Dto[] newArray(int i) {
            return new AuthGetAuthDataOauth2Dto[i];
        }
    }

    public AuthGetAuthDataOauth2Dto(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.enabled = z;
        this.scope = str;
        this.codeChallenge = str2;
        this.codeChallengeMethod = str3;
        this.deviceId = str4;
        this.state = str5;
        this.prompt = str6;
        this.authzClientId = i;
        this.authzClientRedirectUri = str7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataOauth2Dto)) {
            return false;
        }
        AuthGetAuthDataOauth2Dto authGetAuthDataOauth2Dto = (AuthGetAuthDataOauth2Dto) obj;
        return this.enabled == authGetAuthDataOauth2Dto.enabled && epx.f(this.scope, authGetAuthDataOauth2Dto.scope) && epx.f(this.codeChallenge, authGetAuthDataOauth2Dto.codeChallenge) && epx.f(this.codeChallengeMethod, authGetAuthDataOauth2Dto.codeChallengeMethod) && epx.f(this.deviceId, authGetAuthDataOauth2Dto.deviceId) && epx.f(this.state, authGetAuthDataOauth2Dto.state) && epx.f(this.prompt, authGetAuthDataOauth2Dto.prompt) && this.authzClientId == authGetAuthDataOauth2Dto.authzClientId && epx.f(this.authzClientRedirectUri, authGetAuthDataOauth2Dto.authzClientRedirectUri);
    }

    public final int hashCode() {
        return this.authzClientRedirectUri.hashCode() + shy.a(this.authzClientId, urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(Boolean.hashCode(this.enabled) * 31, 31, this.scope), 31, this.codeChallenge), 31, this.codeChallengeMethod), 31, this.deviceId), 31, this.state), 31, this.prompt), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataOauth2Dto(enabled=");
        sb.append(this.enabled);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", codeChallenge=");
        sb.append(this.codeChallenge);
        sb.append(", codeChallengeMethod=");
        sb.append(this.codeChallengeMethod);
        sb.append(", deviceId=");
        sb.append(this.deviceId);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", prompt=");
        sb.append(this.prompt);
        sb.append(", authzClientId=");
        sb.append(this.authzClientId);
        sb.append(", authzClientRedirectUri=");
        return ho8.a(sb, this.authzClientRedirectUri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeString(this.scope);
        parcel.writeString(this.codeChallenge);
        parcel.writeString(this.codeChallengeMethod);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.state);
        parcel.writeString(this.prompt);
        parcel.writeInt(this.authzClientId);
        parcel.writeString(this.authzClientRedirectUri);
    }
}
