package com.vk.api.generated.tinkoff.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TinkoffGetTinkoffUserInfoResponseDto.kt */
/* loaded from: classes15.dex */
public final class TinkoffGetTinkoffUserInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<TinkoffGetTinkoffUserInfoResponseDto> CREATOR = new a();

    @pmi0("tinkoff_user")
    private final TinkoffTinkoffUserInfoDto tinkoffUser;

    @pmi0("user_type")
    private final UserTypeDto userType;

    @pmi0("vk_user_diff")
    private final TinkoffTinkoffUserInfoDto vkUserDiff;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TinkoffGetTinkoffUserInfoResponseDto.kt */
    public static final class UserTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserTypeDto[] $VALUES;
        public static final Parcelable.Creator<UserTypeDto> CREATOR;

        @pmi0("edu")
        public static final UserTypeDto EDU;

        @pmi0("master")
        public static final UserTypeDto MASTER;
        private final String value;

        /* compiled from: TinkoffGetTinkoffUserInfoResponseDto.kt */
        public static final class a implements Parcelable.Creator<UserTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final UserTypeDto createFromParcel(Parcel parcel) {
                return UserTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UserTypeDto[] newArray(int i) {
                return new UserTypeDto[i];
            }
        }

        static {
            UserTypeDto userTypeDto = new UserTypeDto("EDU", 0, "edu");
            EDU = userTypeDto;
            UserTypeDto userTypeDto2 = new UserTypeDto("MASTER", 1, "master");
            MASTER = userTypeDto2;
            UserTypeDto[] userTypeDtoArr = {userTypeDto, userTypeDto2};
            $VALUES = userTypeDtoArr;
            $ENTRIES = new asp(userTypeDtoArr);
            CREATOR = new a();
        }

        private UserTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static UserTypeDto valueOf(String str) {
            return (UserTypeDto) Enum.valueOf(UserTypeDto.class, str);
        }

        public static UserTypeDto[] values() {
            return (UserTypeDto[]) $VALUES.clone();
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

    /* compiled from: TinkoffGetTinkoffUserInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<TinkoffGetTinkoffUserInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final TinkoffGetTinkoffUserInfoResponseDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<TinkoffTinkoffUserInfoDto> creator = TinkoffTinkoffUserInfoDto.CREATOR;
            return new TinkoffGetTinkoffUserInfoResponseDto(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? UserTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final TinkoffGetTinkoffUserInfoResponseDto[] newArray(int i) {
            return new TinkoffGetTinkoffUserInfoResponseDto[i];
        }
    }

    public TinkoffGetTinkoffUserInfoResponseDto(TinkoffTinkoffUserInfoDto tinkoffTinkoffUserInfoDto, TinkoffTinkoffUserInfoDto tinkoffTinkoffUserInfoDto2, UserTypeDto userTypeDto) {
        this.tinkoffUser = tinkoffTinkoffUserInfoDto;
        this.vkUserDiff = tinkoffTinkoffUserInfoDto2;
        this.userType = userTypeDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TinkoffGetTinkoffUserInfoResponseDto)) {
            return false;
        }
        TinkoffGetTinkoffUserInfoResponseDto tinkoffGetTinkoffUserInfoResponseDto = (TinkoffGetTinkoffUserInfoResponseDto) obj;
        return epx.f(this.tinkoffUser, tinkoffGetTinkoffUserInfoResponseDto.tinkoffUser) && epx.f(this.vkUserDiff, tinkoffGetTinkoffUserInfoResponseDto.vkUserDiff) && this.userType == tinkoffGetTinkoffUserInfoResponseDto.userType;
    }

    public final int hashCode() {
        int hashCode = this.tinkoffUser.hashCode() * 31;
        TinkoffTinkoffUserInfoDto tinkoffTinkoffUserInfoDto = this.vkUserDiff;
        int hashCode2 = (hashCode + (tinkoffTinkoffUserInfoDto == null ? 0 : tinkoffTinkoffUserInfoDto.hashCode())) * 31;
        UserTypeDto userTypeDto = this.userType;
        return hashCode2 + (userTypeDto != null ? userTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "TinkoffGetTinkoffUserInfoResponseDto(tinkoffUser=" + this.tinkoffUser + ", vkUserDiff=" + this.vkUserDiff + ", userType=" + this.userType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.tinkoffUser.writeToParcel(parcel, i);
        TinkoffTinkoffUserInfoDto tinkoffTinkoffUserInfoDto = this.vkUserDiff;
        if (tinkoffTinkoffUserInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tinkoffTinkoffUserInfoDto.writeToParcel(parcel, i);
        }
        UserTypeDto userTypeDto = this.userType;
        if (userTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ TinkoffGetTinkoffUserInfoResponseDto(TinkoffTinkoffUserInfoDto tinkoffTinkoffUserInfoDto, TinkoffTinkoffUserInfoDto tinkoffTinkoffUserInfoDto2, UserTypeDto userTypeDto, int i, zcl zclVar) {
        this(tinkoffTinkoffUserInfoDto, (i & 2) != 0 ? null : tinkoffTinkoffUserInfoDto2, (i & 4) != 0 ? null : userTypeDto);
    }
}
