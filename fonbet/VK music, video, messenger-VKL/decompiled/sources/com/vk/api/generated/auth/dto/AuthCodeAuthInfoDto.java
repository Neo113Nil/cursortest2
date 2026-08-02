package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthCodeAuthInfoDto.kt */
/* loaded from: classes14.dex */
public final class AuthCodeAuthInfoDto implements Parcelable {
    public static final Parcelable.Creator<AuthCodeAuthInfoDto> CREATOR = new a();

    @pmi0("auth_id")
    private final String authId;

    @pmi0("client_info")
    private final AuthCodeAuthClientInfoDto clientInfo;

    @pmi0("device_info")
    private final AuthCodeAuthDeviceInfoDto deviceInfo;

    @pmi0(X3.j.D)
    private final String domain;

    @pmi0(SharedKt.PARAM_EXPIRES_IN)
    private final Integer expiresIn;

    @pmi0("flow_type")
    private final Integer flowType;

    /* compiled from: AuthCodeAuthInfoDto.kt */
    public static final class a implements Parcelable.Creator<AuthCodeAuthInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthInfoDto createFromParcel(Parcel parcel) {
            return new AuthCodeAuthInfoDto(parcel.readInt() == 0 ? null : AuthCodeAuthClientInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuthCodeAuthDeviceInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthCodeAuthInfoDto[] newArray(int i) {
            return new AuthCodeAuthInfoDto[i];
        }
    }

    public AuthCodeAuthInfoDto() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final String d() {
        return this.authId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AuthCodeAuthClientInfoDto e() {
        return this.clientInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCodeAuthInfoDto)) {
            return false;
        }
        AuthCodeAuthInfoDto authCodeAuthInfoDto = (AuthCodeAuthInfoDto) obj;
        return epx.f(this.clientInfo, authCodeAuthInfoDto.clientInfo) && epx.f(this.deviceInfo, authCodeAuthInfoDto.deviceInfo) && epx.f(this.expiresIn, authCodeAuthInfoDto.expiresIn) && epx.f(this.domain, authCodeAuthInfoDto.domain) && epx.f(this.flowType, authCodeAuthInfoDto.flowType) && epx.f(this.authId, authCodeAuthInfoDto.authId);
    }

    public final AuthCodeAuthDeviceInfoDto f() {
        return this.deviceInfo;
    }

    public final String g() {
        return this.domain;
    }

    public final int hashCode() {
        AuthCodeAuthClientInfoDto authCodeAuthClientInfoDto = this.clientInfo;
        int hashCode = (authCodeAuthClientInfoDto == null ? 0 : authCodeAuthClientInfoDto.hashCode()) * 31;
        AuthCodeAuthDeviceInfoDto authCodeAuthDeviceInfoDto = this.deviceInfo;
        int hashCode2 = (hashCode + (authCodeAuthDeviceInfoDto == null ? 0 : authCodeAuthDeviceInfoDto.hashCode())) * 31;
        Integer num = this.expiresIn;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.domain;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.flowType;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.authId;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Integer i() {
        return this.flowType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthCodeAuthInfoDto(clientInfo=");
        sb.append(this.clientInfo);
        sb.append(", deviceInfo=");
        sb.append(this.deviceInfo);
        sb.append(", expiresIn=");
        sb.append(this.expiresIn);
        sb.append(", domain=");
        sb.append(this.domain);
        sb.append(", flowType=");
        sb.append(this.flowType);
        sb.append(", authId=");
        return ho8.a(sb, this.authId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AuthCodeAuthClientInfoDto authCodeAuthClientInfoDto = this.clientInfo;
        if (authCodeAuthClientInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authCodeAuthClientInfoDto.writeToParcel(parcel, i);
        }
        AuthCodeAuthDeviceInfoDto authCodeAuthDeviceInfoDto = this.deviceInfo;
        if (authCodeAuthDeviceInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authCodeAuthDeviceInfoDto.writeToParcel(parcel, i);
        }
        Integer num = this.expiresIn;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.domain);
        Integer num2 = this.flowType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.authId);
    }

    public AuthCodeAuthInfoDto(AuthCodeAuthClientInfoDto authCodeAuthClientInfoDto, AuthCodeAuthDeviceInfoDto authCodeAuthDeviceInfoDto, Integer num, String str, Integer num2, String str2) {
        this.clientInfo = authCodeAuthClientInfoDto;
        this.deviceInfo = authCodeAuthDeviceInfoDto;
        this.expiresIn = num;
        this.domain = str;
        this.flowType = num2;
        this.authId = str2;
    }

    public /* synthetic */ AuthCodeAuthInfoDto(AuthCodeAuthClientInfoDto authCodeAuthClientInfoDto, AuthCodeAuthDeviceInfoDto authCodeAuthDeviceInfoDto, Integer num, String str, Integer num2, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : authCodeAuthClientInfoDto, (i & 2) != 0 ? null : authCodeAuthDeviceInfoDto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str2);
    }
}
