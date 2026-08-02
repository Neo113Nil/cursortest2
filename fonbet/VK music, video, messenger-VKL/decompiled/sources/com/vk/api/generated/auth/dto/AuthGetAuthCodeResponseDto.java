package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthGetAuthCodeResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthCodeResponseDto> CREATOR = new a();

    @pmi0("auth_code")
    private final String authCode;

    @pmi0("auth_hash")
    private final String authHash;

    @pmi0("auth_hash_token")
    private final String authHashToken;

    @pmi0("auth_id")
    private final String authId;

    @pmi0("auth_url")
    private final String authUrl;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("qr_code_url")
    private final String qrCodeUrl;

    /* compiled from: AuthGetAuthCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthCodeResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthCodeResponseDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthCodeResponseDto[] newArray(int i) {
            return new AuthGetAuthCodeResponseDto[i];
        }
    }

    public AuthGetAuthCodeResponseDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthCodeResponseDto)) {
            return false;
        }
        AuthGetAuthCodeResponseDto authGetAuthCodeResponseDto = (AuthGetAuthCodeResponseDto) obj;
        return epx.f(this.authCode, authGetAuthCodeResponseDto.authCode) && epx.f(this.authHash, authGetAuthCodeResponseDto.authHash) && epx.f(this.authHashToken, authGetAuthCodeResponseDto.authHashToken) && epx.f(this.authId, authGetAuthCodeResponseDto.authId) && epx.f(this.expiresIn, authGetAuthCodeResponseDto.expiresIn) && epx.f(this.authUrl, authGetAuthCodeResponseDto.authUrl) && epx.f(this.qrCodeUrl, authGetAuthCodeResponseDto.qrCodeUrl);
    }

    public final int hashCode() {
        String str = this.authCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authHash;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authHashToken;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.authId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.expiresIn;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.authUrl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.qrCodeUrl;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthCodeResponseDto(authCode=");
        sb.append(this.authCode);
        sb.append(", authHash=");
        sb.append(this.authHash);
        sb.append(", authHashToken=");
        sb.append(this.authHashToken);
        sb.append(", authId=");
        sb.append(this.authId);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", authUrl=");
        sb.append(this.authUrl);
        sb.append(", qrCodeUrl=");
        return ho8.a(sb, this.qrCodeUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authCode);
        parcel.writeString(this.authHash);
        parcel.writeString(this.authHashToken);
        parcel.writeString(this.authId);
        Integer num = this.expiresIn;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.authUrl);
        parcel.writeString(this.qrCodeUrl);
    }

    public AuthGetAuthCodeResponseDto(String str, String str2, String str3, String str4, Integer num, String str5, String str6) {
        this.authCode = str;
        this.authHash = str2;
        this.authHashToken = str3;
        this.authId = str4;
        this.expiresIn = num;
        this.authUrl = str5;
        this.qrCodeUrl = str6;
    }

    public /* synthetic */ AuthGetAuthCodeResponseDto(String str, String str2, String str3, String str4, Integer num, String str5, String str6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }
}
