package com.vk.api.generated.backoffice.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BackofficeGetPasswordBoxTypeResponseDto.kt */
/* loaded from: classes14.dex */
public final class BackofficeGetPasswordBoxTypeResponseDto implements Parcelable {
    public static final Parcelable.Creator<BackofficeGetPasswordBoxTypeResponseDto> CREATOR = new a();

    @pmi0("badApp")
    private final String badApp;

    @pmi0("badLink")
    private final String badLink;

    @pmi0("hash")
    private final String hash;

    @pmi0("passwordBoxType")
    private final PasswordBoxTypeDto passwordBoxType;

    @pmi0("sex")
    private final Integer sex;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BackofficeGetPasswordBoxTypeResponseDto.kt */
    public static final class PasswordBoxTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PasswordBoxTypeDto[] $VALUES;

        @pmi0("bad_link")
        public static final PasswordBoxTypeDto BAD_LINK;

        @pmi0("compromised")
        public static final PasswordBoxTypeDto COMPROMISED;
        public static final Parcelable.Creator<PasswordBoxTypeDto> CREATOR;

        @pmi0(LoginApiConstants.PARAM_NAME_OLD_PASSWORD)
        public static final PasswordBoxTypeDto OLD_PASSWORD;

        @pmi0("suspicious_login")
        public static final PasswordBoxTypeDto SUSPICIOUS_LOGIN;
        private final String value;

        /* compiled from: BackofficeGetPasswordBoxTypeResponseDto.kt */
        public static final class a implements Parcelable.Creator<PasswordBoxTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final PasswordBoxTypeDto createFromParcel(Parcel parcel) {
                return PasswordBoxTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PasswordBoxTypeDto[] newArray(int i) {
                return new PasswordBoxTypeDto[i];
            }
        }

        static {
            PasswordBoxTypeDto passwordBoxTypeDto = new PasswordBoxTypeDto("BAD_LINK", 0, "bad_link");
            BAD_LINK = passwordBoxTypeDto;
            PasswordBoxTypeDto passwordBoxTypeDto2 = new PasswordBoxTypeDto("COMPROMISED", 1, "compromised");
            COMPROMISED = passwordBoxTypeDto2;
            PasswordBoxTypeDto passwordBoxTypeDto3 = new PasswordBoxTypeDto("OLD_PASSWORD", 2, LoginApiConstants.PARAM_NAME_OLD_PASSWORD);
            OLD_PASSWORD = passwordBoxTypeDto3;
            PasswordBoxTypeDto passwordBoxTypeDto4 = new PasswordBoxTypeDto("SUSPICIOUS_LOGIN", 3, "suspicious_login");
            SUSPICIOUS_LOGIN = passwordBoxTypeDto4;
            PasswordBoxTypeDto[] passwordBoxTypeDtoArr = {passwordBoxTypeDto, passwordBoxTypeDto2, passwordBoxTypeDto3, passwordBoxTypeDto4};
            $VALUES = passwordBoxTypeDtoArr;
            $ENTRIES = new asp(passwordBoxTypeDtoArr);
            CREATOR = new a();
        }

        private PasswordBoxTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static PasswordBoxTypeDto valueOf(String str) {
            return (PasswordBoxTypeDto) Enum.valueOf(PasswordBoxTypeDto.class, str);
        }

        public static PasswordBoxTypeDto[] values() {
            return (PasswordBoxTypeDto[]) $VALUES.clone();
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

    /* compiled from: BackofficeGetPasswordBoxTypeResponseDto.kt */
    public static final class a implements Parcelable.Creator<BackofficeGetPasswordBoxTypeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final BackofficeGetPasswordBoxTypeResponseDto createFromParcel(Parcel parcel) {
            PasswordBoxTypeDto createFromParcel = parcel.readInt() == 0 ? null : PasswordBoxTypeDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer num = null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new BackofficeGetPasswordBoxTypeResponseDto(createFromParcel, readString, readString2, readString3, num);
        }

        @Override // android.os.Parcelable.Creator
        public final BackofficeGetPasswordBoxTypeResponseDto[] newArray(int i) {
            return new BackofficeGetPasswordBoxTypeResponseDto[i];
        }
    }

    public BackofficeGetPasswordBoxTypeResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackofficeGetPasswordBoxTypeResponseDto)) {
            return false;
        }
        BackofficeGetPasswordBoxTypeResponseDto backofficeGetPasswordBoxTypeResponseDto = (BackofficeGetPasswordBoxTypeResponseDto) obj;
        return this.passwordBoxType == backofficeGetPasswordBoxTypeResponseDto.passwordBoxType && epx.f(this.badApp, backofficeGetPasswordBoxTypeResponseDto.badApp) && epx.f(this.badLink, backofficeGetPasswordBoxTypeResponseDto.badLink) && epx.f(this.hash, backofficeGetPasswordBoxTypeResponseDto.hash) && epx.f(this.sex, backofficeGetPasswordBoxTypeResponseDto.sex);
    }

    public final int hashCode() {
        PasswordBoxTypeDto passwordBoxTypeDto = this.passwordBoxType;
        int hashCode = (passwordBoxTypeDto == null ? 0 : passwordBoxTypeDto.hashCode()) * 31;
        String str = this.badApp;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.badLink;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hash;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.sex;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackofficeGetPasswordBoxTypeResponseDto(passwordBoxType=");
        sb.append(this.passwordBoxType);
        sb.append(", badApp=");
        sb.append(this.badApp);
        sb.append(", badLink=");
        sb.append(this.badLink);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", sex=");
        return uqi.b(sb, this.sex, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PasswordBoxTypeDto passwordBoxTypeDto = this.passwordBoxType;
        if (passwordBoxTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passwordBoxTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.badApp);
        parcel.writeString(this.badLink);
        parcel.writeString(this.hash);
        Integer num = this.sex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public BackofficeGetPasswordBoxTypeResponseDto(PasswordBoxTypeDto passwordBoxTypeDto, String str, String str2, String str3, Integer num) {
        this.passwordBoxType = passwordBoxTypeDto;
        this.badApp = str;
        this.badLink = str2;
        this.hash = str3;
        this.sex = num;
    }

    public /* synthetic */ BackofficeGetPasswordBoxTypeResponseDto(PasswordBoxTypeDto passwordBoxTypeDto, String str, String str2, String str3, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : passwordBoxTypeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num);
    }
}
