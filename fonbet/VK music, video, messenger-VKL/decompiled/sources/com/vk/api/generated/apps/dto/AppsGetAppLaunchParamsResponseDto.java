package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAppLaunchParamsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAppLaunchParamsResponseDto> CREATOR = new a();

    @pmi0("app_hash")
    private final String appHash;

    @pmi0("sign")
    private final String sign;

    @pmi0("vk_access_token_settings")
    private final String vkAccessTokenSettings;

    @pmi0("vk_app_id")
    private final Integer vkAppId;

    @pmi0("vk_are_notifications_enabled")
    private final VkAreNotificationsEnabledDto vkAreNotificationsEnabled;

    @pmi0("vk_client")
    private final String vkClient;

    @pmi0("vk_experiment")
    private final String vkExperiment;

    @pmi0("vk_group_id")
    private final UserId vkGroupId;

    @pmi0("vk_h3")
    private final VkH3Dto vkH3;

    @pmi0("vk_has_profile_button")
    private final VkHasProfileButtonDto vkHasProfileButton;

    @pmi0("vk_is_app_user")
    private final Integer vkIsAppUser;

    @pmi0("vk_is_employee")
    private final VkIsEmployeeDto vkIsEmployee;

    @pmi0("vk_is_favorite")
    private final Integer vkIsFavorite;

    @pmi0("vk_is_play_machine")
    private final VkIsPlayMachineDto vkIsPlayMachine;

    @pmi0("vk_is_recommended")
    private final VkIsRecommendedDto vkIsRecommended;

    @pmi0("vk_is_unauth")
    private final Boolean vkIsUnauth;

    @pmi0("vk_is_widescreen")
    private final VkIsWidescreenDto vkIsWidescreen;

    @pmi0("vk_language")
    private final String vkLanguage;

    @pmi0("vk_mode")
    private final String vkMode;

    @pmi0("vk_ok_user_id")
    private final String vkOkUserId;

    @pmi0("vk_platform")
    private final String vkPlatform;

    @pmi0("vk_profile_id")
    private final Integer vkProfileId;

    @pmi0("vk_ref")
    private final String vkRef;

    @pmi0("vk_request_id")
    private final Integer vkRequestId;

    @pmi0("vk_request_key")
    private final String vkRequestKey;

    @pmi0("vk_restrictions")
    private final String vkRestrictions;

    @pmi0("vk_seg")
    private final Integer vkSeg;

    @pmi0("vk_testing_group_id")
    private final Integer vkTestingGroupId;

    @pmi0("vk_ts")
    private final Integer vkTs;

    @pmi0("vk_user_id")
    private final UserId vkUserId;

    @pmi0("vk_viewer_group_role")
    private final String vkViewerGroupRole;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class VkAreNotificationsEnabledDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkAreNotificationsEnabledDto[] $VALUES;
        public static final Parcelable.Creator<VkAreNotificationsEnabledDto> CREATOR;

        @pmi0("0")
        public static final VkAreNotificationsEnabledDto TYPE_0;

        @pmi0("1")
        public static final VkAreNotificationsEnabledDto TYPE_1;
        private final int value;

        /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
        public static final class a implements Parcelable.Creator<VkAreNotificationsEnabledDto> {
            @Override // android.os.Parcelable.Creator
            public final VkAreNotificationsEnabledDto createFromParcel(Parcel parcel) {
                return VkAreNotificationsEnabledDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkAreNotificationsEnabledDto[] newArray(int i) {
                return new VkAreNotificationsEnabledDto[i];
            }
        }

        static {
            VkAreNotificationsEnabledDto vkAreNotificationsEnabledDto = new VkAreNotificationsEnabledDto("TYPE_0", 0, 0);
            TYPE_0 = vkAreNotificationsEnabledDto;
            VkAreNotificationsEnabledDto vkAreNotificationsEnabledDto2 = new VkAreNotificationsEnabledDto("TYPE_1", 1, 1);
            TYPE_1 = vkAreNotificationsEnabledDto2;
            VkAreNotificationsEnabledDto[] vkAreNotificationsEnabledDtoArr = {vkAreNotificationsEnabledDto, vkAreNotificationsEnabledDto2};
            $VALUES = vkAreNotificationsEnabledDtoArr;
            $ENTRIES = new asp(vkAreNotificationsEnabledDtoArr);
            CREATOR = new a();
        }

        private VkAreNotificationsEnabledDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkAreNotificationsEnabledDto valueOf(String str) {
            return (VkAreNotificationsEnabledDto) Enum.valueOf(VkAreNotificationsEnabledDto.class, str);
        }

        public static VkAreNotificationsEnabledDto[] values() {
            return (VkAreNotificationsEnabledDto[]) $VALUES.clone();
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
    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class VkH3Dto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkH3Dto[] $VALUES;
        public static final Parcelable.Creator<VkH3Dto> CREATOR;

        @pmi0("0")
        public static final VkH3Dto TYPE_0;

        @pmi0("1")
        public static final VkH3Dto TYPE_1;
        private final int value;

        /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
        public static final class a implements Parcelable.Creator<VkH3Dto> {
            @Override // android.os.Parcelable.Creator
            public final VkH3Dto createFromParcel(Parcel parcel) {
                return VkH3Dto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkH3Dto[] newArray(int i) {
                return new VkH3Dto[i];
            }
        }

        static {
            VkH3Dto vkH3Dto = new VkH3Dto("TYPE_0", 0, 0);
            TYPE_0 = vkH3Dto;
            VkH3Dto vkH3Dto2 = new VkH3Dto("TYPE_1", 1, 1);
            TYPE_1 = vkH3Dto2;
            VkH3Dto[] vkH3DtoArr = {vkH3Dto, vkH3Dto2};
            $VALUES = vkH3DtoArr;
            $ENTRIES = new asp(vkH3DtoArr);
            CREATOR = new a();
        }

        private VkH3Dto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkH3Dto valueOf(String str) {
            return (VkH3Dto) Enum.valueOf(VkH3Dto.class, str);
        }

        public static VkH3Dto[] values() {
            return (VkH3Dto[]) $VALUES.clone();
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
    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class VkHasProfileButtonDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkHasProfileButtonDto[] $VALUES;
        public static final Parcelable.Creator<VkHasProfileButtonDto> CREATOR;

        @pmi0("1")
        public static final VkHasProfileButtonDto TYPE_1;
        private final int value;

        /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
        public static final class a implements Parcelable.Creator<VkHasProfileButtonDto> {
            @Override // android.os.Parcelable.Creator
            public final VkHasProfileButtonDto createFromParcel(Parcel parcel) {
                return VkHasProfileButtonDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkHasProfileButtonDto[] newArray(int i) {
                return new VkHasProfileButtonDto[i];
            }
        }

        static {
            VkHasProfileButtonDto vkHasProfileButtonDto = new VkHasProfileButtonDto("TYPE_1", 0, 1);
            TYPE_1 = vkHasProfileButtonDto;
            VkHasProfileButtonDto[] vkHasProfileButtonDtoArr = {vkHasProfileButtonDto};
            $VALUES = vkHasProfileButtonDtoArr;
            $ENTRIES = new asp(vkHasProfileButtonDtoArr);
            CREATOR = new a();
        }

        private VkHasProfileButtonDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkHasProfileButtonDto valueOf(String str) {
            return (VkHasProfileButtonDto) Enum.valueOf(VkHasProfileButtonDto.class, str);
        }

        public static VkHasProfileButtonDto[] values() {
            return (VkHasProfileButtonDto[]) $VALUES.clone();
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
    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class VkIsEmployeeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkIsEmployeeDto[] $VALUES;
        public static final Parcelable.Creator<VkIsEmployeeDto> CREATOR;

        @pmi0("0")
        public static final VkIsEmployeeDto TYPE_0;

        @pmi0("1")
        public static final VkIsEmployeeDto TYPE_1;
        private final int value;

        /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
        public static final class a implements Parcelable.Creator<VkIsEmployeeDto> {
            @Override // android.os.Parcelable.Creator
            public final VkIsEmployeeDto createFromParcel(Parcel parcel) {
                return VkIsEmployeeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkIsEmployeeDto[] newArray(int i) {
                return new VkIsEmployeeDto[i];
            }
        }

        static {
            VkIsEmployeeDto vkIsEmployeeDto = new VkIsEmployeeDto("TYPE_0", 0, 0);
            TYPE_0 = vkIsEmployeeDto;
            VkIsEmployeeDto vkIsEmployeeDto2 = new VkIsEmployeeDto("TYPE_1", 1, 1);
            TYPE_1 = vkIsEmployeeDto2;
            VkIsEmployeeDto[] vkIsEmployeeDtoArr = {vkIsEmployeeDto, vkIsEmployeeDto2};
            $VALUES = vkIsEmployeeDtoArr;
            $ENTRIES = new asp(vkIsEmployeeDtoArr);
            CREATOR = new a();
        }

        private VkIsEmployeeDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkIsEmployeeDto valueOf(String str) {
            return (VkIsEmployeeDto) Enum.valueOf(VkIsEmployeeDto.class, str);
        }

        public static VkIsEmployeeDto[] values() {
            return (VkIsEmployeeDto[]) $VALUES.clone();
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
    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class VkIsPlayMachineDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkIsPlayMachineDto[] $VALUES;
        public static final Parcelable.Creator<VkIsPlayMachineDto> CREATOR;

        @pmi0("0")
        public static final VkIsPlayMachineDto TYPE_0;

        @pmi0("1")
        public static final VkIsPlayMachineDto TYPE_1;
        private final int value;

        /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
        public static final class a implements Parcelable.Creator<VkIsPlayMachineDto> {
            @Override // android.os.Parcelable.Creator
            public final VkIsPlayMachineDto createFromParcel(Parcel parcel) {
                return VkIsPlayMachineDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkIsPlayMachineDto[] newArray(int i) {
                return new VkIsPlayMachineDto[i];
            }
        }

        static {
            VkIsPlayMachineDto vkIsPlayMachineDto = new VkIsPlayMachineDto("TYPE_0", 0, 0);
            TYPE_0 = vkIsPlayMachineDto;
            VkIsPlayMachineDto vkIsPlayMachineDto2 = new VkIsPlayMachineDto("TYPE_1", 1, 1);
            TYPE_1 = vkIsPlayMachineDto2;
            VkIsPlayMachineDto[] vkIsPlayMachineDtoArr = {vkIsPlayMachineDto, vkIsPlayMachineDto2};
            $VALUES = vkIsPlayMachineDtoArr;
            $ENTRIES = new asp(vkIsPlayMachineDtoArr);
            CREATOR = new a();
        }

        private VkIsPlayMachineDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkIsPlayMachineDto valueOf(String str) {
            return (VkIsPlayMachineDto) Enum.valueOf(VkIsPlayMachineDto.class, str);
        }

        public static VkIsPlayMachineDto[] values() {
            return (VkIsPlayMachineDto[]) $VALUES.clone();
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
    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class VkIsRecommendedDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkIsRecommendedDto[] $VALUES;
        public static final Parcelable.Creator<VkIsRecommendedDto> CREATOR;

        @pmi0("1")
        public static final VkIsRecommendedDto TYPE_1;
        private final int value;

        /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
        public static final class a implements Parcelable.Creator<VkIsRecommendedDto> {
            @Override // android.os.Parcelable.Creator
            public final VkIsRecommendedDto createFromParcel(Parcel parcel) {
                return VkIsRecommendedDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkIsRecommendedDto[] newArray(int i) {
                return new VkIsRecommendedDto[i];
            }
        }

        static {
            VkIsRecommendedDto vkIsRecommendedDto = new VkIsRecommendedDto("TYPE_1", 0, 1);
            TYPE_1 = vkIsRecommendedDto;
            VkIsRecommendedDto[] vkIsRecommendedDtoArr = {vkIsRecommendedDto};
            $VALUES = vkIsRecommendedDtoArr;
            $ENTRIES = new asp(vkIsRecommendedDtoArr);
            CREATOR = new a();
        }

        private VkIsRecommendedDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkIsRecommendedDto valueOf(String str) {
            return (VkIsRecommendedDto) Enum.valueOf(VkIsRecommendedDto.class, str);
        }

        public static VkIsRecommendedDto[] values() {
            return (VkIsRecommendedDto[]) $VALUES.clone();
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
    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class VkIsWidescreenDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VkIsWidescreenDto[] $VALUES;
        public static final Parcelable.Creator<VkIsWidescreenDto> CREATOR;

        @pmi0("0")
        public static final VkIsWidescreenDto TYPE_0;

        @pmi0("1")
        public static final VkIsWidescreenDto TYPE_1;
        private final int value;

        /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
        public static final class a implements Parcelable.Creator<VkIsWidescreenDto> {
            @Override // android.os.Parcelable.Creator
            public final VkIsWidescreenDto createFromParcel(Parcel parcel) {
                return VkIsWidescreenDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkIsWidescreenDto[] newArray(int i) {
                return new VkIsWidescreenDto[i];
            }
        }

        static {
            VkIsWidescreenDto vkIsWidescreenDto = new VkIsWidescreenDto("TYPE_0", 0, 0);
            TYPE_0 = vkIsWidescreenDto;
            VkIsWidescreenDto vkIsWidescreenDto2 = new VkIsWidescreenDto("TYPE_1", 1, 1);
            TYPE_1 = vkIsWidescreenDto2;
            VkIsWidescreenDto[] vkIsWidescreenDtoArr = {vkIsWidescreenDto, vkIsWidescreenDto2};
            $VALUES = vkIsWidescreenDtoArr;
            $ENTRIES = new asp(vkIsWidescreenDtoArr);
            CREATOR = new a();
        }

        private VkIsWidescreenDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static VkIsWidescreenDto valueOf(String str) {
            return (VkIsWidescreenDto) Enum.valueOf(VkIsWidescreenDto.class, str);
        }

        public static VkIsWidescreenDto[] values() {
            return (VkIsWidescreenDto[]) $VALUES.clone();
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

    /* compiled from: AppsGetAppLaunchParamsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAppLaunchParamsResponseDto> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final AppsGetAppLaunchParamsResponseDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            VkHasProfileButtonDto vkHasProfileButtonDto;
            String str;
            VkIsRecommendedDto createFromParcel;
            VkIsRecommendedDto vkIsRecommendedDto;
            VkIsEmployeeDto createFromParcel2;
            String str2;
            VkH3Dto createFromParcel3;
            String str3;
            VkIsWidescreenDto createFromParcel4;
            String str4;
            VkIsPlayMachineDto createFromParcel5;
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            VkAreNotificationsEnabledDto createFromParcel6 = parcel.readInt() == 0 ? null : VkAreNotificationsEnabledDto.CREATOR.createFromParcel(parcel);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
                vkHasProfileButtonDto = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                vkHasProfileButtonDto = null;
            }
            Integer num = valueOf3;
            String readString2 = parcel.readString();
            Integer num2 = valueOf2;
            Integer num3 = valueOf;
            String readString3 = parcel.readString();
            VkHasProfileButtonDto vkHasProfileButtonDto2 = vkHasProfileButtonDto;
            String readString4 = parcel.readString();
            Object valueOf4 = parcel.readInt() == 0 ? vkHasProfileButtonDto2 : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(AppsGetAppLaunchParamsResponseDto.class.getClassLoader());
            Integer num4 = valueOf4;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            UserId userId2 = (UserId) parcel.readParcelable(AppsGetAppLaunchParamsResponseDto.class.getClassLoader());
            String readString7 = parcel.readString();
            if (parcel.readInt() != 0) {
                vkHasProfileButtonDto2 = VkHasProfileButtonDto.CREATOR.createFromParcel(parcel);
            }
            VkHasProfileButtonDto vkHasProfileButtonDto3 = vkHasProfileButtonDto2;
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                str = readString;
                createFromParcel = null;
            } else {
                str = readString;
                createFromParcel = VkIsRecommendedDto.CREATOR.createFromParcel(parcel);
            }
            VkIsRecommendedDto vkIsRecommendedDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                vkIsRecommendedDto = vkIsRecommendedDto2;
                createFromParcel2 = null;
            } else {
                vkIsRecommendedDto = vkIsRecommendedDto2;
                createFromParcel2 = VkIsEmployeeDto.CREATOR.createFromParcel(parcel);
            }
            VkIsEmployeeDto vkIsEmployeeDto = createFromParcel2;
            Integer num5 = valueOf5;
            String str5 = str;
            String readString8 = parcel.readString();
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                str2 = str5;
                createFromParcel3 = null;
            } else {
                str2 = str5;
                createFromParcel3 = VkH3Dto.CREATOR.createFromParcel(parcel);
            }
            VkH3Dto vkH3Dto = createFromParcel3;
            VkIsRecommendedDto vkIsRecommendedDto3 = vkIsRecommendedDto;
            Integer num6 = valueOf6;
            Boolean bool = null;
            String readString9 = parcel.readString();
            String str6 = str2;
            String readString10 = parcel.readString();
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                str3 = str6;
                createFromParcel4 = null;
            } else {
                str3 = str6;
                createFromParcel4 = VkIsWidescreenDto.CREATOR.createFromParcel(parcel);
            }
            VkIsWidescreenDto vkIsWidescreenDto = createFromParcel4;
            Integer valueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String str7 = str3;
            String readString11 = parcel.readString();
            if (parcel.readInt() == 0) {
                str4 = str7;
                createFromParcel5 = null;
            } else {
                str4 = str7;
                createFromParcel5 = VkIsPlayMachineDto.CREATOR.createFromParcel(parcel);
            }
            VkIsPlayMachineDto vkIsPlayMachineDto = createFromParcel5;
            String readString12 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AppsGetAppLaunchParamsResponseDto(str4, num2, createFromParcel6, num, num3, readString2, readString3, readString4, num4, userId, readString5, readString6, userId2, readString7, vkHasProfileButtonDto3, num5, vkIsRecommendedDto3, vkIsEmployeeDto, readString8, num6, vkH3Dto, readString9, readString10, valueOf7, vkIsWidescreenDto, valueOf8, readString11, vkIsPlayMachineDto, readString12, bool, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAppLaunchParamsResponseDto[] newArray(int i) {
            return new AppsGetAppLaunchParamsResponseDto[i];
        }
    }

    public AppsGetAppLaunchParamsResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAppLaunchParamsResponseDto)) {
            return false;
        }
        AppsGetAppLaunchParamsResponseDto appsGetAppLaunchParamsResponseDto = (AppsGetAppLaunchParamsResponseDto) obj;
        return epx.f(this.vkAccessTokenSettings, appsGetAppLaunchParamsResponseDto.vkAccessTokenSettings) && epx.f(this.vkAppId, appsGetAppLaunchParamsResponseDto.vkAppId) && this.vkAreNotificationsEnabled == appsGetAppLaunchParamsResponseDto.vkAreNotificationsEnabled && epx.f(this.vkIsAppUser, appsGetAppLaunchParamsResponseDto.vkIsAppUser) && epx.f(this.vkIsFavorite, appsGetAppLaunchParamsResponseDto.vkIsFavorite) && epx.f(this.vkLanguage, appsGetAppLaunchParamsResponseDto.vkLanguage) && epx.f(this.vkPlatform, appsGetAppLaunchParamsResponseDto.vkPlatform) && epx.f(this.vkRef, appsGetAppLaunchParamsResponseDto.vkRef) && epx.f(this.vkTs, appsGetAppLaunchParamsResponseDto.vkTs) && epx.f(this.vkUserId, appsGetAppLaunchParamsResponseDto.vkUserId) && epx.f(this.sign, appsGetAppLaunchParamsResponseDto.sign) && epx.f(this.vkViewerGroupRole, appsGetAppLaunchParamsResponseDto.vkViewerGroupRole) && epx.f(this.vkGroupId, appsGetAppLaunchParamsResponseDto.vkGroupId) && epx.f(this.vkExperiment, appsGetAppLaunchParamsResponseDto.vkExperiment) && this.vkHasProfileButton == appsGetAppLaunchParamsResponseDto.vkHasProfileButton && epx.f(this.vkProfileId, appsGetAppLaunchParamsResponseDto.vkProfileId) && this.vkIsRecommended == appsGetAppLaunchParamsResponseDto.vkIsRecommended && this.vkIsEmployee == appsGetAppLaunchParamsResponseDto.vkIsEmployee && epx.f(this.vkMode, appsGetAppLaunchParamsResponseDto.vkMode) && epx.f(this.vkSeg, appsGetAppLaunchParamsResponseDto.vkSeg) && this.vkH3 == appsGetAppLaunchParamsResponseDto.vkH3 && epx.f(this.vkClient, appsGetAppLaunchParamsResponseDto.vkClient) && epx.f(this.vkRestrictions, appsGetAppLaunchParamsResponseDto.vkRestrictions) && epx.f(this.vkTestingGroupId, appsGetAppLaunchParamsResponseDto.vkTestingGroupId) && this.vkIsWidescreen == appsGetAppLaunchParamsResponseDto.vkIsWidescreen && epx.f(this.vkRequestId, appsGetAppLaunchParamsResponseDto.vkRequestId) && epx.f(this.vkRequestKey, appsGetAppLaunchParamsResponseDto.vkRequestKey) && this.vkIsPlayMachine == appsGetAppLaunchParamsResponseDto.vkIsPlayMachine && epx.f(this.appHash, appsGetAppLaunchParamsResponseDto.appHash) && epx.f(this.vkIsUnauth, appsGetAppLaunchParamsResponseDto.vkIsUnauth) && epx.f(this.vkOkUserId, appsGetAppLaunchParamsResponseDto.vkOkUserId);
    }

    public final int hashCode() {
        String str = this.vkAccessTokenSettings;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.vkAppId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        VkAreNotificationsEnabledDto vkAreNotificationsEnabledDto = this.vkAreNotificationsEnabled;
        int hashCode3 = (hashCode2 + (vkAreNotificationsEnabledDto == null ? 0 : vkAreNotificationsEnabledDto.hashCode())) * 31;
        Integer num2 = this.vkIsAppUser;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.vkIsFavorite;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.vkLanguage;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vkPlatform;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.vkRef;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.vkTs;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        UserId userId = this.vkUserId;
        int hashCode10 = (hashCode9 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str5 = this.sign;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.vkViewerGroupRole;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        UserId userId2 = this.vkGroupId;
        int hashCode13 = (hashCode12 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        String str7 = this.vkExperiment;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        VkHasProfileButtonDto vkHasProfileButtonDto = this.vkHasProfileButton;
        int hashCode15 = (hashCode14 + (vkHasProfileButtonDto == null ? 0 : vkHasProfileButtonDto.hashCode())) * 31;
        Integer num5 = this.vkProfileId;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        VkIsRecommendedDto vkIsRecommendedDto = this.vkIsRecommended;
        int hashCode17 = (hashCode16 + (vkIsRecommendedDto == null ? 0 : vkIsRecommendedDto.hashCode())) * 31;
        VkIsEmployeeDto vkIsEmployeeDto = this.vkIsEmployee;
        int hashCode18 = (hashCode17 + (vkIsEmployeeDto == null ? 0 : vkIsEmployeeDto.hashCode())) * 31;
        String str8 = this.vkMode;
        int hashCode19 = (hashCode18 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num6 = this.vkSeg;
        int hashCode20 = (hashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        VkH3Dto vkH3Dto = this.vkH3;
        int hashCode21 = (hashCode20 + (vkH3Dto == null ? 0 : vkH3Dto.hashCode())) * 31;
        String str9 = this.vkClient;
        int hashCode22 = (hashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.vkRestrictions;
        int hashCode23 = (hashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num7 = this.vkTestingGroupId;
        int hashCode24 = (hashCode23 + (num7 == null ? 0 : num7.hashCode())) * 31;
        VkIsWidescreenDto vkIsWidescreenDto = this.vkIsWidescreen;
        int hashCode25 = (hashCode24 + (vkIsWidescreenDto == null ? 0 : vkIsWidescreenDto.hashCode())) * 31;
        Integer num8 = this.vkRequestId;
        int hashCode26 = (hashCode25 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str11 = this.vkRequestKey;
        int hashCode27 = (hashCode26 + (str11 == null ? 0 : str11.hashCode())) * 31;
        VkIsPlayMachineDto vkIsPlayMachineDto = this.vkIsPlayMachine;
        int hashCode28 = (hashCode27 + (vkIsPlayMachineDto == null ? 0 : vkIsPlayMachineDto.hashCode())) * 31;
        String str12 = this.appHash;
        int hashCode29 = (hashCode28 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool = this.vkIsUnauth;
        int hashCode30 = (hashCode29 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str13 = this.vkOkUserId;
        return hashCode30 + (str13 != null ? str13.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetAppLaunchParamsResponseDto(vkAccessTokenSettings=");
        sb.append(this.vkAccessTokenSettings);
        sb.append(", vkAppId=");
        sb.append(this.vkAppId);
        sb.append(", vkAreNotificationsEnabled=");
        sb.append(this.vkAreNotificationsEnabled);
        sb.append(", vkIsAppUser=");
        sb.append(this.vkIsAppUser);
        sb.append(", vkIsFavorite=");
        sb.append(this.vkIsFavorite);
        sb.append(", vkLanguage=");
        sb.append(this.vkLanguage);
        sb.append(", vkPlatform=");
        sb.append(this.vkPlatform);
        sb.append(", vkRef=");
        sb.append(this.vkRef);
        sb.append(", vkTs=");
        sb.append(this.vkTs);
        sb.append(", vkUserId=");
        sb.append(this.vkUserId);
        sb.append(", sign=");
        sb.append(this.sign);
        sb.append(", vkViewerGroupRole=");
        sb.append(this.vkViewerGroupRole);
        sb.append(", vkGroupId=");
        sb.append(this.vkGroupId);
        sb.append(", vkExperiment=");
        sb.append(this.vkExperiment);
        sb.append(", vkHasProfileButton=");
        sb.append(this.vkHasProfileButton);
        sb.append(", vkProfileId=");
        sb.append(this.vkProfileId);
        sb.append(", vkIsRecommended=");
        sb.append(this.vkIsRecommended);
        sb.append(", vkIsEmployee=");
        sb.append(this.vkIsEmployee);
        sb.append(", vkMode=");
        sb.append(this.vkMode);
        sb.append(", vkSeg=");
        sb.append(this.vkSeg);
        sb.append(", vkH3=");
        sb.append(this.vkH3);
        sb.append(", vkClient=");
        sb.append(this.vkClient);
        sb.append(", vkRestrictions=");
        sb.append(this.vkRestrictions);
        sb.append(", vkTestingGroupId=");
        sb.append(this.vkTestingGroupId);
        sb.append(", vkIsWidescreen=");
        sb.append(this.vkIsWidescreen);
        sb.append(", vkRequestId=");
        sb.append(this.vkRequestId);
        sb.append(", vkRequestKey=");
        sb.append(this.vkRequestKey);
        sb.append(", vkIsPlayMachine=");
        sb.append(this.vkIsPlayMachine);
        sb.append(", appHash=");
        sb.append(this.appHash);
        sb.append(", vkIsUnauth=");
        sb.append(this.vkIsUnauth);
        sb.append(", vkOkUserId=");
        return ho8.a(sb, this.vkOkUserId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.vkAccessTokenSettings);
        Integer num = this.vkAppId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        VkAreNotificationsEnabledDto vkAreNotificationsEnabledDto = this.vkAreNotificationsEnabled;
        if (vkAreNotificationsEnabledDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkAreNotificationsEnabledDto.writeToParcel(parcel, i);
        }
        Integer num2 = this.vkIsAppUser;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.vkIsFavorite;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.vkLanguage);
        parcel.writeString(this.vkPlatform);
        parcel.writeString(this.vkRef);
        Integer num4 = this.vkTs;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeParcelable(this.vkUserId, i);
        parcel.writeString(this.sign);
        parcel.writeString(this.vkViewerGroupRole);
        parcel.writeParcelable(this.vkGroupId, i);
        parcel.writeString(this.vkExperiment);
        VkHasProfileButtonDto vkHasProfileButtonDto = this.vkHasProfileButton;
        if (vkHasProfileButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkHasProfileButtonDto.writeToParcel(parcel, i);
        }
        Integer num5 = this.vkProfileId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        VkIsRecommendedDto vkIsRecommendedDto = this.vkIsRecommended;
        if (vkIsRecommendedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkIsRecommendedDto.writeToParcel(parcel, i);
        }
        VkIsEmployeeDto vkIsEmployeeDto = this.vkIsEmployee;
        if (vkIsEmployeeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkIsEmployeeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.vkMode);
        Integer num6 = this.vkSeg;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        VkH3Dto vkH3Dto = this.vkH3;
        if (vkH3Dto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkH3Dto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.vkClient);
        parcel.writeString(this.vkRestrictions);
        Integer num7 = this.vkTestingGroupId;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        VkIsWidescreenDto vkIsWidescreenDto = this.vkIsWidescreen;
        if (vkIsWidescreenDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkIsWidescreenDto.writeToParcel(parcel, i);
        }
        Integer num8 = this.vkRequestId;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        parcel.writeString(this.vkRequestKey);
        VkIsPlayMachineDto vkIsPlayMachineDto = this.vkIsPlayMachine;
        if (vkIsPlayMachineDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vkIsPlayMachineDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.appHash);
        Boolean bool = this.vkIsUnauth;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeString(this.vkOkUserId);
    }

    public AppsGetAppLaunchParamsResponseDto(String str, Integer num, VkAreNotificationsEnabledDto vkAreNotificationsEnabledDto, Integer num2, Integer num3, String str2, String str3, String str4, Integer num4, UserId userId, String str5, String str6, UserId userId2, String str7, VkHasProfileButtonDto vkHasProfileButtonDto, Integer num5, VkIsRecommendedDto vkIsRecommendedDto, VkIsEmployeeDto vkIsEmployeeDto, String str8, Integer num6, VkH3Dto vkH3Dto, String str9, String str10, Integer num7, VkIsWidescreenDto vkIsWidescreenDto, Integer num8, String str11, VkIsPlayMachineDto vkIsPlayMachineDto, String str12, Boolean bool, String str13) {
        this.vkAccessTokenSettings = str;
        this.vkAppId = num;
        this.vkAreNotificationsEnabled = vkAreNotificationsEnabledDto;
        this.vkIsAppUser = num2;
        this.vkIsFavorite = num3;
        this.vkLanguage = str2;
        this.vkPlatform = str3;
        this.vkRef = str4;
        this.vkTs = num4;
        this.vkUserId = userId;
        this.sign = str5;
        this.vkViewerGroupRole = str6;
        this.vkGroupId = userId2;
        this.vkExperiment = str7;
        this.vkHasProfileButton = vkHasProfileButtonDto;
        this.vkProfileId = num5;
        this.vkIsRecommended = vkIsRecommendedDto;
        this.vkIsEmployee = vkIsEmployeeDto;
        this.vkMode = str8;
        this.vkSeg = num6;
        this.vkH3 = vkH3Dto;
        this.vkClient = str9;
        this.vkRestrictions = str10;
        this.vkTestingGroupId = num7;
        this.vkIsWidescreen = vkIsWidescreenDto;
        this.vkRequestId = num8;
        this.vkRequestKey = str11;
        this.vkIsPlayMachine = vkIsPlayMachineDto;
        this.appHash = str12;
        this.vkIsUnauth = bool;
        this.vkOkUserId = str13;
    }

    public /* synthetic */ AppsGetAppLaunchParamsResponseDto(String str, Integer num, VkAreNotificationsEnabledDto vkAreNotificationsEnabledDto, Integer num2, Integer num3, String str2, String str3, String str4, Integer num4, UserId userId, String str5, String str6, UserId userId2, String str7, VkHasProfileButtonDto vkHasProfileButtonDto, Integer num5, VkIsRecommendedDto vkIsRecommendedDto, VkIsEmployeeDto vkIsEmployeeDto, String str8, Integer num6, VkH3Dto vkH3Dto, String str9, String str10, Integer num7, VkIsWidescreenDto vkIsWidescreenDto, Integer num8, String str11, VkIsPlayMachineDto vkIsPlayMachineDto, String str12, Boolean bool, String str13, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : vkAreNotificationsEnabledDto, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : num3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : userId, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : userId2, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : vkHasProfileButtonDto, (i & 32768) != 0 ? null : num5, (i & 65536) != 0 ? null : vkIsRecommendedDto, (i & 131072) != 0 ? null : vkIsEmployeeDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str8, (i & 524288) != 0 ? null : num6, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : vkH3Dto, (i & 2097152) != 0 ? null : str9, (i & 4194304) != 0 ? null : str10, (i & 8388608) != 0 ? null : num7, (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? null : vkIsWidescreenDto, (i & 33554432) != 0 ? null : num8, (i & 67108864) != 0 ? null : str11, (i & 134217728) != 0 ? null : vkIsPlayMachineDto, (i & 268435456) != 0 ? null : str12, (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool, (i & 1073741824) != 0 ? null : str13);
    }
}
