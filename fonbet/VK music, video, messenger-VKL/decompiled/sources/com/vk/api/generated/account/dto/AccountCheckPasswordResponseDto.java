package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountCheckPasswordResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountCheckPasswordResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountCheckPasswordResponseDto> CREATOR = new a();

    @pmi0("security_level")
    private final SecurityLevelDto securityLevel;

    @pmi0("security_message")
    private final String securityMessage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountCheckPasswordResponseDto.kt */
    public static final class SecurityLevelDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SecurityLevelDto[] $VALUES;
        public static final Parcelable.Creator<SecurityLevelDto> CREATOR;

        @pmi0("2")
        public static final SecurityLevelDto HIGH;

        @pmi0(C4217a2.f)
        public static final SecurityLevelDto INCORRECT;

        @pmi0("0")
        public static final SecurityLevelDto INSECURE;

        @pmi0("1")
        public static final SecurityLevelDto STANDARD;
        private final int value;

        /* compiled from: AccountCheckPasswordResponseDto.kt */
        public static final class a implements Parcelable.Creator<SecurityLevelDto> {
            @Override // android.os.Parcelable.Creator
            public final SecurityLevelDto createFromParcel(Parcel parcel) {
                return SecurityLevelDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SecurityLevelDto[] newArray(int i) {
                return new SecurityLevelDto[i];
            }
        }

        static {
            SecurityLevelDto securityLevelDto = new SecurityLevelDto("INCORRECT", 0, -1);
            INCORRECT = securityLevelDto;
            SecurityLevelDto securityLevelDto2 = new SecurityLevelDto("INSECURE", 1, 0);
            INSECURE = securityLevelDto2;
            SecurityLevelDto securityLevelDto3 = new SecurityLevelDto("STANDARD", 2, 1);
            STANDARD = securityLevelDto3;
            SecurityLevelDto securityLevelDto4 = new SecurityLevelDto("HIGH", 3, 2);
            HIGH = securityLevelDto4;
            SecurityLevelDto[] securityLevelDtoArr = {securityLevelDto, securityLevelDto2, securityLevelDto3, securityLevelDto4};
            $VALUES = securityLevelDtoArr;
            $ENTRIES = new asp(securityLevelDtoArr);
            CREATOR = new a();
        }

        private SecurityLevelDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static SecurityLevelDto valueOf(String str) {
            return (SecurityLevelDto) Enum.valueOf(SecurityLevelDto.class, str);
        }

        public static SecurityLevelDto[] values() {
            return (SecurityLevelDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AccountCheckPasswordResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountCheckPasswordResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountCheckPasswordResponseDto createFromParcel(Parcel parcel) {
            return new AccountCheckPasswordResponseDto(SecurityLevelDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountCheckPasswordResponseDto[] newArray(int i) {
            return new AccountCheckPasswordResponseDto[i];
        }
    }

    public AccountCheckPasswordResponseDto(SecurityLevelDto securityLevelDto, String str) {
        this.securityLevel = securityLevelDto;
        this.securityMessage = str;
    }

    public final SecurityLevelDto d() {
        return this.securityLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.securityMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCheckPasswordResponseDto)) {
            return false;
        }
        AccountCheckPasswordResponseDto accountCheckPasswordResponseDto = (AccountCheckPasswordResponseDto) obj;
        return this.securityLevel == accountCheckPasswordResponseDto.securityLevel && epx.f(this.securityMessage, accountCheckPasswordResponseDto.securityMessage);
    }

    public final int hashCode() {
        int hashCode = this.securityLevel.hashCode() * 31;
        String str = this.securityMessage;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountCheckPasswordResponseDto(securityLevel=");
        sb.append(this.securityLevel);
        sb.append(", securityMessage=");
        return ho8.a(sb, this.securityMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.securityLevel.writeToParcel(parcel, i);
        parcel.writeString(this.securityMessage);
    }

    public /* synthetic */ AccountCheckPasswordResponseDto(SecurityLevelDto securityLevelDto, String str, int i, zcl zclVar) {
        this(securityLevelDto, (i & 2) != 0 ? null : str);
    }
}
