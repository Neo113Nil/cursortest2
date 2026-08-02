package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunLeaderboardMemberUserDto.kt */
/* loaded from: classes15.dex */
public final class VkRunLeaderboardMemberUserDto implements Parcelable {
    public static final Parcelable.Creator<VkRunLeaderboardMemberUserDto> CREATOR = new a();

    @pmi0("app_status")
    private final AppStatusDto appStatus;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("giv_user_status")
    private final GivUserStatusDto givUserStatus;

    @pmi0("id")
    private final UserId id;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("name")
    private final String name;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("season_user_status")
    private final SeasonUserStatusDto seasonUserStatus;

    @pmi0("sex")
    private final BaseSexDto sex;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunLeaderboardMemberUserDto.kt */
    public static final class AppStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AppStatusDto[] $VALUES;

        @pmi0(SignalingProtocol.KEY_ACTIVE)
        public static final AppStatusDto ACTIVE;
        public static final Parcelable.Creator<AppStatusDto> CREATOR;

        @pmi0("hidden_by_privacy")
        public static final AppStatusDto HIDDEN_BY_PRIVACY;

        @pmi0("invited")
        public static final AppStatusDto INVITED;

        @pmi0("not_member")
        public static final AppStatusDto NOT_MEMBER;
        private final String value;

        /* compiled from: VkRunLeaderboardMemberUserDto.kt */
        public static final class a implements Parcelable.Creator<AppStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final AppStatusDto createFromParcel(Parcel parcel) {
                return AppStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AppStatusDto[] newArray(int i) {
                return new AppStatusDto[i];
            }
        }

        static {
            AppStatusDto appStatusDto = new AppStatusDto(SignalingProtocol.STATE_ACTIVE, 0, SignalingProtocol.KEY_ACTIVE);
            ACTIVE = appStatusDto;
            AppStatusDto appStatusDto2 = new AppStatusDto("INVITED", 1, "invited");
            INVITED = appStatusDto2;
            AppStatusDto appStatusDto3 = new AppStatusDto("NOT_MEMBER", 2, "not_member");
            NOT_MEMBER = appStatusDto3;
            AppStatusDto appStatusDto4 = new AppStatusDto("HIDDEN_BY_PRIVACY", 3, "hidden_by_privacy");
            HIDDEN_BY_PRIVACY = appStatusDto4;
            AppStatusDto[] appStatusDtoArr = {appStatusDto, appStatusDto2, appStatusDto3, appStatusDto4};
            $VALUES = appStatusDtoArr;
            $ENTRIES = new asp(appStatusDtoArr);
            CREATOR = new a();
        }

        private AppStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AppStatusDto valueOf(String str) {
            return (AppStatusDto) Enum.valueOf(AppStatusDto.class, str);
        }

        public static AppStatusDto[] values() {
            return (AppStatusDto[]) $VALUES.clone();
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
    /* compiled from: VkRunLeaderboardMemberUserDto.kt */
    public static final class GivUserStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GivUserStatusDto[] $VALUES;
        public static final Parcelable.Creator<GivUserStatusDto> CREATOR;

        @pmi0("invited_by_user")
        public static final GivUserStatusDto INVITED_BY_USER;

        @pmi0("joined")
        public static final GivUserStatusDto JOINED;

        @pmi0("not_joined")
        public static final GivUserStatusDto NOT_JOINED;
        private final String value;

        /* compiled from: VkRunLeaderboardMemberUserDto.kt */
        public static final class a implements Parcelable.Creator<GivUserStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final GivUserStatusDto createFromParcel(Parcel parcel) {
                return GivUserStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GivUserStatusDto[] newArray(int i) {
                return new GivUserStatusDto[i];
            }
        }

        static {
            GivUserStatusDto givUserStatusDto = new GivUserStatusDto("NOT_JOINED", 0, "not_joined");
            NOT_JOINED = givUserStatusDto;
            GivUserStatusDto givUserStatusDto2 = new GivUserStatusDto("JOINED", 1, "joined");
            JOINED = givUserStatusDto2;
            GivUserStatusDto givUserStatusDto3 = new GivUserStatusDto("INVITED_BY_USER", 2, "invited_by_user");
            INVITED_BY_USER = givUserStatusDto3;
            GivUserStatusDto[] givUserStatusDtoArr = {givUserStatusDto, givUserStatusDto2, givUserStatusDto3};
            $VALUES = givUserStatusDtoArr;
            $ENTRIES = new asp(givUserStatusDtoArr);
            CREATOR = new a();
        }

        private GivUserStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static GivUserStatusDto valueOf(String str) {
            return (GivUserStatusDto) Enum.valueOf(GivUserStatusDto.class, str);
        }

        public static GivUserStatusDto[] values() {
            return (GivUserStatusDto[]) $VALUES.clone();
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
    /* compiled from: VkRunLeaderboardMemberUserDto.kt */
    public static final class SeasonUserStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SeasonUserStatusDto[] $VALUES;
        public static final Parcelable.Creator<SeasonUserStatusDto> CREATOR;

        @pmi0("joined")
        public static final SeasonUserStatusDto JOINED;

        @pmi0("not_joined")
        public static final SeasonUserStatusDto NOT_JOINED;

        @pmi0("sent_invitation")
        public static final SeasonUserStatusDto SENT_INVITATION;
        private final String value;

        /* compiled from: VkRunLeaderboardMemberUserDto.kt */
        public static final class a implements Parcelable.Creator<SeasonUserStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final SeasonUserStatusDto createFromParcel(Parcel parcel) {
                return SeasonUserStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SeasonUserStatusDto[] newArray(int i) {
                return new SeasonUserStatusDto[i];
            }
        }

        static {
            SeasonUserStatusDto seasonUserStatusDto = new SeasonUserStatusDto("NOT_JOINED", 0, "not_joined");
            NOT_JOINED = seasonUserStatusDto;
            SeasonUserStatusDto seasonUserStatusDto2 = new SeasonUserStatusDto("JOINED", 1, "joined");
            JOINED = seasonUserStatusDto2;
            SeasonUserStatusDto seasonUserStatusDto3 = new SeasonUserStatusDto("SENT_INVITATION", 2, "sent_invitation");
            SENT_INVITATION = seasonUserStatusDto3;
            SeasonUserStatusDto[] seasonUserStatusDtoArr = {seasonUserStatusDto, seasonUserStatusDto2, seasonUserStatusDto3};
            $VALUES = seasonUserStatusDtoArr;
            $ENTRIES = new asp(seasonUserStatusDtoArr);
            CREATOR = new a();
        }

        private SeasonUserStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SeasonUserStatusDto valueOf(String str) {
            return (SeasonUserStatusDto) Enum.valueOf(SeasonUserStatusDto.class, str);
        }

        public static SeasonUserStatusDto[] values() {
            return (SeasonUserStatusDto[]) $VALUES.clone();
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

    /* compiled from: VkRunLeaderboardMemberUserDto.kt */
    public static final class a implements Parcelable.Creator<VkRunLeaderboardMemberUserDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunLeaderboardMemberUserDto createFromParcel(Parcel parcel) {
            return new VkRunLeaderboardMemberUserDto((UserId) parcel.readParcelable(VkRunLeaderboardMemberUserDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BaseSexDto) parcel.readParcelable(VkRunLeaderboardMemberUserDto.class.getClassLoader()), parcel.readInt() == 0 ? null : AppStatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SeasonUserStatusDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GivUserStatusDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunLeaderboardMemberUserDto[] newArray(int i) {
            return new VkRunLeaderboardMemberUserDto[i];
        }
    }

    public VkRunLeaderboardMemberUserDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, BaseSexDto baseSexDto, AppStatusDto appStatusDto, SeasonUserStatusDto seasonUserStatusDto, GivUserStatusDto givUserStatusDto) {
        this.id = userId;
        this.name = str;
        this.firstName = str2;
        this.lastName = str3;
        this.photo50 = str4;
        this.photo100 = str5;
        this.photo200 = str6;
        this.sex = baseSexDto;
        this.appStatus = appStatusDto;
        this.seasonUserStatus = seasonUserStatusDto;
        this.givUserStatus = givUserStatusDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunLeaderboardMemberUserDto)) {
            return false;
        }
        VkRunLeaderboardMemberUserDto vkRunLeaderboardMemberUserDto = (VkRunLeaderboardMemberUserDto) obj;
        return epx.f(this.id, vkRunLeaderboardMemberUserDto.id) && epx.f(this.name, vkRunLeaderboardMemberUserDto.name) && epx.f(this.firstName, vkRunLeaderboardMemberUserDto.firstName) && epx.f(this.lastName, vkRunLeaderboardMemberUserDto.lastName) && epx.f(this.photo50, vkRunLeaderboardMemberUserDto.photo50) && epx.f(this.photo100, vkRunLeaderboardMemberUserDto.photo100) && epx.f(this.photo200, vkRunLeaderboardMemberUserDto.photo200) && this.sex == vkRunLeaderboardMemberUserDto.sex && this.appStatus == vkRunLeaderboardMemberUserDto.appStatus && this.seasonUserStatus == vkRunLeaderboardMemberUserDto.seasonUserStatus && this.givUserStatus == vkRunLeaderboardMemberUserDto.givUserStatus;
    }

    public final int hashCode() {
        int hashCode = (this.sex.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31, this.firstName), 31, this.lastName), 31, this.photo50), 31, this.photo100), 31, this.photo200)) * 31;
        AppStatusDto appStatusDto = this.appStatus;
        int hashCode2 = (hashCode + (appStatusDto == null ? 0 : appStatusDto.hashCode())) * 31;
        SeasonUserStatusDto seasonUserStatusDto = this.seasonUserStatus;
        int hashCode3 = (hashCode2 + (seasonUserStatusDto == null ? 0 : seasonUserStatusDto.hashCode())) * 31;
        GivUserStatusDto givUserStatusDto = this.givUserStatus;
        return hashCode3 + (givUserStatusDto != null ? givUserStatusDto.hashCode() : 0);
    }

    public final String toString() {
        return "VkRunLeaderboardMemberUserDto(id=" + this.id + ", name=" + this.name + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", photo50=" + this.photo50 + ", photo100=" + this.photo100 + ", photo200=" + this.photo200 + ", sex=" + this.sex + ", appStatus=" + this.appStatus + ", seasonUserStatus=" + this.seasonUserStatus + ", givUserStatus=" + this.givUserStatus + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        parcel.writeString(this.name);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeParcelable(this.sex, i);
        AppStatusDto appStatusDto = this.appStatus;
        if (appStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appStatusDto.writeToParcel(parcel, i);
        }
        SeasonUserStatusDto seasonUserStatusDto = this.seasonUserStatus;
        if (seasonUserStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            seasonUserStatusDto.writeToParcel(parcel, i);
        }
        GivUserStatusDto givUserStatusDto = this.givUserStatus;
        if (givUserStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            givUserStatusDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VkRunLeaderboardMemberUserDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6, BaseSexDto baseSexDto, AppStatusDto appStatusDto, SeasonUserStatusDto seasonUserStatusDto, GivUserStatusDto givUserStatusDto, int i, zcl zclVar) {
        this(userId, str, str2, str3, str4, str5, str6, baseSexDto, (i & 256) != 0 ? null : appStatusDto, (i & 512) != 0 ? null : seasonUserStatusDto, (i & 1024) != 0 ? null : givUserStatusDto);
    }
}
