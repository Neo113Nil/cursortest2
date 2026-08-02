package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AuthInitPasswordCheckResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthInitPasswordCheckResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthInitPasswordCheckResponseDto> CREATOR = new a();

    @pmi0("access_factor")
    private final AccessFactorDto accessFactor;

    @pmi0("access_factor2")
    private final AccessFactor2Dto accessFactor2;

    @pmi0("code_length")
    private final Integer codeLength;

    @pmi0("phone")
    private final String phone;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthInitPasswordCheckResponseDto.kt */
    public static final class AccessFactor2Dto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AccessFactor2Dto[] $VALUES;
        public static final Parcelable.Creator<AccessFactor2Dto> CREATOR;

        @pmi0("sms_code")
        public static final AccessFactor2Dto SMS_CODE;
        private final String value;

        /* compiled from: AuthInitPasswordCheckResponseDto.kt */
        public static final class a implements Parcelable.Creator<AccessFactor2Dto> {
            @Override // android.os.Parcelable.Creator
            public final AccessFactor2Dto createFromParcel(Parcel parcel) {
                return AccessFactor2Dto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AccessFactor2Dto[] newArray(int i) {
                return new AccessFactor2Dto[i];
            }
        }

        static {
            AccessFactor2Dto accessFactor2Dto = new AccessFactor2Dto("SMS_CODE", 0, "sms_code");
            SMS_CODE = accessFactor2Dto;
            AccessFactor2Dto[] accessFactor2DtoArr = {accessFactor2Dto};
            $VALUES = accessFactor2DtoArr;
            $ENTRIES = new asp(accessFactor2DtoArr);
            CREATOR = new a();
        }

        private AccessFactor2Dto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AccessFactor2Dto valueOf(String str) {
            return (AccessFactor2Dto) Enum.valueOf(AccessFactor2Dto.class, str);
        }

        public static AccessFactor2Dto[] values() {
            return (AccessFactor2Dto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthInitPasswordCheckResponseDto.kt */
    public static final class AccessFactorDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AccessFactorDto[] $VALUES;
        public static final Parcelable.Creator<AccessFactorDto> CREATOR;

        @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
        public static final AccessFactorDto PASSWORD;

        @pmi0("sms_code")
        public static final AccessFactorDto SMS_CODE;
        private final String value;

        /* compiled from: AuthInitPasswordCheckResponseDto.kt */
        public static final class a implements Parcelable.Creator<AccessFactorDto> {
            @Override // android.os.Parcelable.Creator
            public final AccessFactorDto createFromParcel(Parcel parcel) {
                return AccessFactorDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AccessFactorDto[] newArray(int i) {
                return new AccessFactorDto[i];
            }
        }

        static {
            AccessFactorDto accessFactorDto = new AccessFactorDto("PASSWORD", 0, LoginApiConstants.PARAM_NAME_PASSWORD);
            PASSWORD = accessFactorDto;
            AccessFactorDto accessFactorDto2 = new AccessFactorDto("SMS_CODE", 1, "sms_code");
            SMS_CODE = accessFactorDto2;
            AccessFactorDto[] accessFactorDtoArr = {accessFactorDto, accessFactorDto2};
            $VALUES = accessFactorDtoArr;
            $ENTRIES = new asp(accessFactorDtoArr);
            CREATOR = new a();
        }

        private AccessFactorDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AccessFactorDto valueOf(String str) {
            return (AccessFactorDto) Enum.valueOf(AccessFactorDto.class, str);
        }

        public static AccessFactorDto[] values() {
            return (AccessFactorDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AuthInitPasswordCheckResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthInitPasswordCheckResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthInitPasswordCheckResponseDto createFromParcel(Parcel parcel) {
            return new AuthInitPasswordCheckResponseDto(AccessFactorDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccessFactor2Dto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthInitPasswordCheckResponseDto[] newArray(int i) {
            return new AuthInitPasswordCheckResponseDto[i];
        }
    }

    public AuthInitPasswordCheckResponseDto(AccessFactorDto accessFactorDto, AccessFactor2Dto accessFactor2Dto, Integer num, String str) {
        this.accessFactor = accessFactorDto;
        this.accessFactor2 = accessFactor2Dto;
        this.codeLength = num;
        this.phone = str;
    }

    public final AccessFactorDto d() {
        return this.accessFactor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AccessFactor2Dto e() {
        return this.accessFactor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthInitPasswordCheckResponseDto)) {
            return false;
        }
        AuthInitPasswordCheckResponseDto authInitPasswordCheckResponseDto = (AuthInitPasswordCheckResponseDto) obj;
        return this.accessFactor == authInitPasswordCheckResponseDto.accessFactor && this.accessFactor2 == authInitPasswordCheckResponseDto.accessFactor2 && epx.f(this.codeLength, authInitPasswordCheckResponseDto.codeLength) && epx.f(this.phone, authInitPasswordCheckResponseDto.phone);
    }

    public final int hashCode() {
        int hashCode = this.accessFactor.hashCode() * 31;
        AccessFactor2Dto accessFactor2Dto = this.accessFactor2;
        int hashCode2 = (hashCode + (accessFactor2Dto == null ? 0 : accessFactor2Dto.hashCode())) * 31;
        Integer num = this.codeLength;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.phone;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthInitPasswordCheckResponseDto(accessFactor=");
        sb.append(this.accessFactor);
        sb.append(", accessFactor2=");
        sb.append(this.accessFactor2);
        sb.append(", codeLength=");
        sb.append(this.codeLength);
        sb.append(", phone=");
        return ho8.a(sb, this.phone, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.accessFactor.writeToParcel(parcel, i);
        AccessFactor2Dto accessFactor2Dto = this.accessFactor2;
        if (accessFactor2Dto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accessFactor2Dto.writeToParcel(parcel, i);
        }
        Integer num = this.codeLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.phone);
    }

    public /* synthetic */ AuthInitPasswordCheckResponseDto(AccessFactorDto accessFactorDto, AccessFactor2Dto accessFactor2Dto, Integer num, String str, int i, zcl zclVar) {
        this(accessFactorDto, (i & 2) != 0 ? null : accessFactor2Dto, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }
}
