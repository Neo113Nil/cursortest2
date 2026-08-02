package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.vul0;

/* compiled from: AuthGetAuthDataOauthDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataOauthDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataOauthDto> CREATOR = new a();

    @pmi0("code_challenge")
    private final String codeChallenge;

    @pmi0("code_challenge_method")
    private final String codeChallengeMethod;

    @pmi0("enabled")
    private final Object enabled;

    @pmi0("force_hash")
    private final boolean forceHash;

    @pmi0("hashes")
    private final Object hashes;

    @pmi0(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE)
    private final String responseType;

    @pmi0(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL)
    private final int scope;

    @pmi0("show_oauth_notification")
    private final boolean showOauthNotification;

    @pmi0("state")
    private final String state;

    /* compiled from: AuthGetAuthDataOauthDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataOauthDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataOauthDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            Object obj;
            Object obj2;
            Object readValue = parcel.readValue(AuthGetAuthDataOauthDto.class.getClassLoader());
            Object readValue2 = parcel.readValue(AuthGetAuthDataOauthDto.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z3 = z2;
            String readString3 = parcel.readString();
            boolean z4 = true;
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() != 0) {
                obj = readValue2;
                obj2 = readValue;
            } else {
                obj = readValue2;
                obj2 = readValue;
                z4 = z3;
            }
            return new AuthGetAuthDataOauthDto(obj2, obj, z, readString, readString2, readString3, readString4, readInt, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataOauthDto[] newArray(int i) {
            return new AuthGetAuthDataOauthDto[i];
        }
    }

    public AuthGetAuthDataOauthDto(Object obj, Object obj2, boolean z, String str, String str2, String str3, String str4, int i, boolean z2) {
        this.enabled = obj;
        this.hashes = obj2;
        this.showOauthNotification = z;
        this.state = str;
        this.responseType = str2;
        this.codeChallenge = str3;
        this.codeChallengeMethod = str4;
        this.scope = i;
        this.forceHash = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataOauthDto)) {
            return false;
        }
        AuthGetAuthDataOauthDto authGetAuthDataOauthDto = (AuthGetAuthDataOauthDto) obj;
        return epx.f(this.enabled, authGetAuthDataOauthDto.enabled) && epx.f(this.hashes, authGetAuthDataOauthDto.hashes) && this.showOauthNotification == authGetAuthDataOauthDto.showOauthNotification && epx.f(this.state, authGetAuthDataOauthDto.state) && epx.f(this.responseType, authGetAuthDataOauthDto.responseType) && epx.f(this.codeChallenge, authGetAuthDataOauthDto.codeChallenge) && epx.f(this.codeChallengeMethod, authGetAuthDataOauthDto.codeChallengeMethod) && this.scope == authGetAuthDataOauthDto.scope && this.forceHash == authGetAuthDataOauthDto.forceHash;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.forceHash) + shy.a(this.scope, urd0.a(urd0.a(urd0.a(urd0.a(qoy.b(vul0.a(this.enabled.hashCode() * 31, 31, this.hashes), 31, this.showOauthNotification), 31, this.state), 31, this.responseType), 31, this.codeChallenge), 31, this.codeChallengeMethod), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataOauthDto(enabled=");
        sb.append(this.enabled);
        sb.append(", hashes=");
        sb.append(this.hashes);
        sb.append(", showOauthNotification=");
        sb.append(this.showOauthNotification);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", responseType=");
        sb.append(this.responseType);
        sb.append(", codeChallenge=");
        sb.append(this.codeChallenge);
        sb.append(", codeChallengeMethod=");
        sb.append(this.codeChallengeMethod);
        sb.append(", scope=");
        sb.append(this.scope);
        sb.append(", forceHash=");
        return q0.a(sb, this.forceHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.enabled);
        parcel.writeValue(this.hashes);
        parcel.writeInt(this.showOauthNotification ? 1 : 0);
        parcel.writeString(this.state);
        parcel.writeString(this.responseType);
        parcel.writeString(this.codeChallenge);
        parcel.writeString(this.codeChallengeMethod);
        parcel.writeInt(this.scope);
        parcel.writeInt(this.forceHash ? 1 : 0);
    }
}
