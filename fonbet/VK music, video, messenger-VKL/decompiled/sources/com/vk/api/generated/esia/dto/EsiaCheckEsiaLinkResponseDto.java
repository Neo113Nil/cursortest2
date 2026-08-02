package com.vk.api.generated.esia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: EsiaCheckEsiaLinkResponseDto.kt */
/* loaded from: classes14.dex */
public final class EsiaCheckEsiaLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<EsiaCheckEsiaLinkResponseDto> CREATOR = new a();

    @pmi0("esia_user")
    private final EsiaEsiaUserInfoDto esiaUser;

    @pmi0("flow")
    private final FlowDto flow;

    @pmi0("notice")
    private final String notice;

    @pmi0("user_type")
    private final UserTypeDto userType;

    @pmi0("vk_user_diff")
    private final EsiaEsiaUserInfoDto vkUserDiff;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EsiaCheckEsiaLinkResponseDto.kt */
    public static final class FlowDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FlowDto[] $VALUES;
        public static final Parcelable.Creator<FlowDto> CREATOR;

        @pmi0("login")
        public static final FlowDto LOGIN;

        @pmi0("verify")
        public static final FlowDto VERIFY;
        private final String value;

        /* compiled from: EsiaCheckEsiaLinkResponseDto.kt */
        public static final class a implements Parcelable.Creator<FlowDto> {
            @Override // android.os.Parcelable.Creator
            public final FlowDto createFromParcel(Parcel parcel) {
                return FlowDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FlowDto[] newArray(int i) {
                return new FlowDto[i];
            }
        }

        static {
            FlowDto flowDto = new FlowDto("VERIFY", 0, "verify");
            VERIFY = flowDto;
            FlowDto flowDto2 = new FlowDto("LOGIN", 1, "login");
            LOGIN = flowDto2;
            FlowDto[] flowDtoArr = {flowDto, flowDto2};
            $VALUES = flowDtoArr;
            $ENTRIES = new asp(flowDtoArr);
            CREATOR = new a();
        }

        private FlowDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static FlowDto valueOf(String str) {
            return (FlowDto) Enum.valueOf(FlowDto.class, str);
        }

        public static FlowDto[] values() {
            return (FlowDto[]) $VALUES.clone();
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EsiaCheckEsiaLinkResponseDto.kt */
    public static final class UserTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserTypeDto[] $VALUES;
        public static final Parcelable.Creator<UserTypeDto> CREATOR;

        @pmi0("edu")
        public static final UserTypeDto EDU;

        @pmi0("master")
        public static final UserTypeDto MASTER;
        private final String value;

        /* compiled from: EsiaCheckEsiaLinkResponseDto.kt */
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

    /* compiled from: EsiaCheckEsiaLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<EsiaCheckEsiaLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EsiaCheckEsiaLinkResponseDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<EsiaEsiaUserInfoDto> creator = EsiaEsiaUserInfoDto.CREATOR;
            return new EsiaCheckEsiaLinkResponseDto(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : FlowDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UserTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaCheckEsiaLinkResponseDto[] newArray(int i) {
            return new EsiaCheckEsiaLinkResponseDto[i];
        }
    }

    public EsiaCheckEsiaLinkResponseDto(EsiaEsiaUserInfoDto esiaEsiaUserInfoDto, EsiaEsiaUserInfoDto esiaEsiaUserInfoDto2, String str, FlowDto flowDto, UserTypeDto userTypeDto) {
        this.esiaUser = esiaEsiaUserInfoDto;
        this.vkUserDiff = esiaEsiaUserInfoDto2;
        this.notice = str;
        this.flow = flowDto;
        this.userType = userTypeDto;
    }

    public final EsiaEsiaUserInfoDto d() {
        return this.esiaUser;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final UserTypeDto e() {
        return this.userType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EsiaCheckEsiaLinkResponseDto)) {
            return false;
        }
        EsiaCheckEsiaLinkResponseDto esiaCheckEsiaLinkResponseDto = (EsiaCheckEsiaLinkResponseDto) obj;
        return epx.f(this.esiaUser, esiaCheckEsiaLinkResponseDto.esiaUser) && epx.f(this.vkUserDiff, esiaCheckEsiaLinkResponseDto.vkUserDiff) && epx.f(this.notice, esiaCheckEsiaLinkResponseDto.notice) && this.flow == esiaCheckEsiaLinkResponseDto.flow && this.userType == esiaCheckEsiaLinkResponseDto.userType;
    }

    public final EsiaEsiaUserInfoDto f() {
        return this.vkUserDiff;
    }

    public final int hashCode() {
        int hashCode = (this.vkUserDiff.hashCode() + (this.esiaUser.hashCode() * 31)) * 31;
        String str = this.notice;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        FlowDto flowDto = this.flow;
        int hashCode3 = (hashCode2 + (flowDto == null ? 0 : flowDto.hashCode())) * 31;
        UserTypeDto userTypeDto = this.userType;
        return hashCode3 + (userTypeDto != null ? userTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "EsiaCheckEsiaLinkResponseDto(esiaUser=" + this.esiaUser + ", vkUserDiff=" + this.vkUserDiff + ", notice=" + this.notice + ", flow=" + this.flow + ", userType=" + this.userType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.esiaUser.writeToParcel(parcel, i);
        this.vkUserDiff.writeToParcel(parcel, i);
        parcel.writeString(this.notice);
        FlowDto flowDto = this.flow;
        if (flowDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            flowDto.writeToParcel(parcel, i);
        }
        UserTypeDto userTypeDto = this.userType;
        if (userTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ EsiaCheckEsiaLinkResponseDto(EsiaEsiaUserInfoDto esiaEsiaUserInfoDto, EsiaEsiaUserInfoDto esiaEsiaUserInfoDto2, String str, FlowDto flowDto, UserTypeDto userTypeDto, int i, zcl zclVar) {
        this(esiaEsiaUserInfoDto, esiaEsiaUserInfoDto2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : flowDto, (i & 16) != 0 ? null : userTypeDto);
    }
}
