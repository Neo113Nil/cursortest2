package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthCheckAuthCodeResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthCheckAuthCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthCheckAuthCodeResponseDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
    private final String accessToken;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("is_partial")
    private final Boolean isPartial;

    @pmi0("need_password")
    private final Boolean needPassword;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("provider_app_id")
    private final Integer providerAppId;

    @pmi0("silent_token")
    private final String silentToken;

    @pmi0("silent_token_ttl")
    private final Integer silentTokenTtl;

    @pmi0("status")
    private final Integer status;

    @pmi0("super_app_token")
    private final String superAppToken;

    @pmi0("user_id")
    private final UserId userId;

    @pmi0("uuid")
    private final String uuid;

    /* compiled from: AuthCheckAuthCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthCheckAuthCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthCodeResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(AuthCheckAuthCodeResponseDto.class.getClassLoader());
            Integer num = valueOf4;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num2 = null;
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString4 = parcel.readString();
            boolean z = false;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                valueOf2 = Boolean.valueOf(z);
            }
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            return new AuthCheckAuthCodeResponseDto(valueOf3, num, userId, readString, readString2, readString3, valueOf, readString4, readString5, readString6, valueOf5, valueOf2, num2);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCheckAuthCodeResponseDto[] newArray(int i) {
            return new AuthCheckAuthCodeResponseDto[i];
        }
    }

    public AuthCheckAuthCodeResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCheckAuthCodeResponseDto)) {
            return false;
        }
        AuthCheckAuthCodeResponseDto authCheckAuthCodeResponseDto = (AuthCheckAuthCodeResponseDto) obj;
        return epx.f(this.status, authCheckAuthCodeResponseDto.status) && epx.f(this.expiresIn, authCheckAuthCodeResponseDto.expiresIn) && epx.f(this.userId, authCheckAuthCodeResponseDto.userId) && epx.f(this.phone, authCheckAuthCodeResponseDto.phone) && epx.f(this.photo200, authCheckAuthCodeResponseDto.photo200) && epx.f(this.superAppToken, authCheckAuthCodeResponseDto.superAppToken) && epx.f(this.needPassword, authCheckAuthCodeResponseDto.needPassword) && epx.f(this.accessToken, authCheckAuthCodeResponseDto.accessToken) && epx.f(this.silentToken, authCheckAuthCodeResponseDto.silentToken) && epx.f(this.uuid, authCheckAuthCodeResponseDto.uuid) && epx.f(this.silentTokenTtl, authCheckAuthCodeResponseDto.silentTokenTtl) && epx.f(this.isPartial, authCheckAuthCodeResponseDto.isPartial) && epx.f(this.providerAppId, authCheckAuthCodeResponseDto.providerAppId);
    }

    public final int hashCode() {
        Integer num = this.status;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expiresIn;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str = this.phone;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo200;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.superAppToken;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.needPassword;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.accessToken;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.silentToken;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.uuid;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.silentTokenTtl;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool2 = this.isPartial;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.providerAppId;
        return hashCode12 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCheckAuthCodeResponseDto(status=");
        sb.append(this.status);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", superAppToken=");
        sb.append(this.superAppToken);
        sb.append(", needPassword=");
        sb.append(this.needPassword);
        sb.append(", accessToken=");
        sb.append(this.accessToken);
        sb.append(", silentToken=");
        sb.append(this.silentToken);
        sb.append(", uuid=");
        sb.append(this.uuid);
        sb.append(", silentTokenTtl=");
        sb.append(this.silentTokenTtl);
        sb.append(", isPartial=");
        sb.append(this.isPartial);
        sb.append(", providerAppId=");
        return uqi.b(sb, this.providerAppId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.status;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.expiresIn;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.phone);
        parcel.writeString(this.photo200);
        parcel.writeString(this.superAppToken);
        Boolean bool = this.needPassword;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.accessToken);
        parcel.writeString(this.silentToken);
        parcel.writeString(this.uuid);
        Integer num3 = this.silentTokenTtl;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Boolean bool2 = this.isPartial;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        Integer num4 = this.providerAppId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public AuthCheckAuthCodeResponseDto(Integer num, Integer num2, UserId userId, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, Integer num3, Boolean bool2, Integer num4) {
        this.status = num;
        this.expiresIn = num2;
        this.userId = userId;
        this.phone = str;
        this.photo200 = str2;
        this.superAppToken = str3;
        this.needPassword = bool;
        this.accessToken = str4;
        this.silentToken = str5;
        this.uuid = str6;
        this.silentTokenTtl = num3;
        this.isPartial = bool2;
        this.providerAppId = num4;
    }

    public /* synthetic */ AuthCheckAuthCodeResponseDto(Integer num, Integer num2, UserId userId, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, Integer num3, Boolean bool2, Integer num4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : num4);
    }
}
