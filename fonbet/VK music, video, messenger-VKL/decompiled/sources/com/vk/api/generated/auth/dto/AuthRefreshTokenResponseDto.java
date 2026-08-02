package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthRefreshTokenResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshTokenResponseDto> CREATOR = new a();

    @pmi0("code")
    private final Integer code;

    @pmi0("reason")
    private final String reason;

    @pmi0("secret")
    private final String secret;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("token")
    private final String token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthRefreshTokenResponseDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("already_success")
        public static final StatusDto ALREADY_SUCCESS;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0(X3.g.e)
        public static final StatusDto FAIL;

        @pmi0("success")
        public static final StatusDto SUCCESS;
        private final String value;

        /* compiled from: AuthRefreshTokenResponseDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("FAIL", 0, X3.g.e);
            FAIL = statusDto;
            StatusDto statusDto2 = new StatusDto("SUCCESS", 1, "success");
            SUCCESS = statusDto2;
            StatusDto statusDto3 = new StatusDto("ALREADY_SUCCESS", 2, "already_success");
            ALREADY_SUCCESS = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AuthRefreshTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTokenResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            StatusDto createFromParcel = parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel);
            Integer num = null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AuthRefreshTokenResponseDto(readString, readString2, createFromParcel, readString3, num);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTokenResponseDto[] newArray(int i) {
            return new AuthRefreshTokenResponseDto[i];
        }
    }

    public AuthRefreshTokenResponseDto(String str, String str2, StatusDto statusDto, String str3, Integer num) {
        this.token = str;
        this.secret = str2;
        this.status = statusDto;
        this.reason = str3;
        this.code = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRefreshTokenResponseDto)) {
            return false;
        }
        AuthRefreshTokenResponseDto authRefreshTokenResponseDto = (AuthRefreshTokenResponseDto) obj;
        return epx.f(this.token, authRefreshTokenResponseDto.token) && epx.f(this.secret, authRefreshTokenResponseDto.secret) && this.status == authRefreshTokenResponseDto.status && epx.f(this.reason, authRefreshTokenResponseDto.reason) && epx.f(this.code, authRefreshTokenResponseDto.code);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.secret;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        StatusDto statusDto = this.status;
        int hashCode3 = (hashCode2 + (statusDto == null ? 0 : statusDto.hashCode())) * 31;
        String str2 = this.reason;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.code;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshTokenResponseDto(token=");
        sb.append(this.token);
        sb.append(", secret=");
        sb.append(this.secret);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", code=");
        return uqi.b(sb, this.code, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        parcel.writeString(this.secret);
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.reason);
        Integer num = this.code;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AuthRefreshTokenResponseDto(String str, String str2, StatusDto statusDto, String str3, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : statusDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }
}
