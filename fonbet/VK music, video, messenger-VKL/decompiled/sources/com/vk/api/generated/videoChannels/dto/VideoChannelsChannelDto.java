package com.vk.api.generated.videoChannels.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.BuildConfig;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VideoChannelsChannelDto.kt */
/* loaded from: classes15.dex */
public final class VideoChannelsChannelDto implements Parcelable {
    public static final Parcelable.Creator<VideoChannelsChannelDto> CREATOR = new a();

    @pmi0("a_plus_mark")
    private final VideoChannelsAPlusMarkDto aPlusMark;

    @pmi0("access_type")
    private final AccessTypeDto accessType;

    @pmi0("admin_level")
    private final AdminLevelDto adminLevel;

    @pmi0("age_mark")
    private final AgeMarkDto ageMark;

    @pmi0("counters")
    private final VideoChannelsCountersDto counters;

    @pmi0("created_at")
    private final Long createdAt;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final long id;

    @pmi0("is_advertiser")
    private final boolean isAdvertiser;

    @pmi0("member_status")
    private final MemberStatusDto memberStatus;

    @pmi0("name")
    private final String name;

    @pmi0("onboarding")
    private final VideoChannelsOnboardingDto onboarding;

    @pmi0("photos")
    private final VideoChannelsPhotosDto photos;

    @pmi0("screen_name")
    private final String screenName;

    @pmi0("trending")
    private final boolean trending;

    @pmi0("verified")
    private final boolean verified;

    @pmi0("video_cover")
    private final VideoChannelsVideoCoverDto videoCover;

    @pmi0("video_notifications_status")
    private final VideoNotificationsStatusDto videoNotificationsStatus;

    @pmi0("warning_notification")
    private final VideoChannelsWarningNotificationDto warningNotification;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoChannelsChannelDto.kt */
    public static final class AccessTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AccessTypeDto[] $VALUES;

        @pmi0("closed")
        public static final AccessTypeDto CLOSED;
        public static final Parcelable.Creator<AccessTypeDto> CREATOR;

        @pmi0("open")
        public static final AccessTypeDto OPEN;

        @pmi0("private")
        public static final AccessTypeDto PRIVATE;
        private final String value;

        /* compiled from: VideoChannelsChannelDto.kt */
        public static final class a implements Parcelable.Creator<AccessTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final AccessTypeDto createFromParcel(Parcel parcel) {
                return AccessTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AccessTypeDto[] newArray(int i) {
                return new AccessTypeDto[i];
            }
        }

        static {
            AccessTypeDto accessTypeDto = new AccessTypeDto("OPEN", 0, "open");
            OPEN = accessTypeDto;
            AccessTypeDto accessTypeDto2 = new AccessTypeDto("CLOSED", 1, "closed");
            CLOSED = accessTypeDto2;
            AccessTypeDto accessTypeDto3 = new AccessTypeDto("PRIVATE", 2, "private");
            PRIVATE = accessTypeDto3;
            AccessTypeDto[] accessTypeDtoArr = {accessTypeDto, accessTypeDto2, accessTypeDto3};
            $VALUES = accessTypeDtoArr;
            $ENTRIES = new asp(accessTypeDtoArr);
            CREATOR = new a();
        }

        private AccessTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AccessTypeDto valueOf(String str) {
            return (AccessTypeDto) Enum.valueOf(AccessTypeDto.class, str);
        }

        public static AccessTypeDto[] values() {
            return (AccessTypeDto[]) $VALUES.clone();
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
    /* compiled from: VideoChannelsChannelDto.kt */
    public static final class AdminLevelDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AdminLevelDto[] $VALUES;

        @pmi0("administrator")
        public static final AdminLevelDto ADMINISTRATOR;
        public static final Parcelable.Creator<AdminLevelDto> CREATOR;

        @pmi0("editor")
        public static final AdminLevelDto EDITOR;

        @pmi0("moderator")
        public static final AdminLevelDto MODERATOR;

        @pmi0("user")
        public static final AdminLevelDto USER;
        private final String value;

        /* compiled from: VideoChannelsChannelDto.kt */
        public static final class a implements Parcelable.Creator<AdminLevelDto> {
            @Override // android.os.Parcelable.Creator
            public final AdminLevelDto createFromParcel(Parcel parcel) {
                return AdminLevelDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AdminLevelDto[] newArray(int i) {
                return new AdminLevelDto[i];
            }
        }

        static {
            AdminLevelDto adminLevelDto = new AdminLevelDto("USER", 0, "user");
            USER = adminLevelDto;
            AdminLevelDto adminLevelDto2 = new AdminLevelDto("MODERATOR", 1, "moderator");
            MODERATOR = adminLevelDto2;
            AdminLevelDto adminLevelDto3 = new AdminLevelDto("EDITOR", 2, "editor");
            EDITOR = adminLevelDto3;
            AdminLevelDto adminLevelDto4 = new AdminLevelDto("ADMINISTRATOR", 3, "administrator");
            ADMINISTRATOR = adminLevelDto4;
            AdminLevelDto[] adminLevelDtoArr = {adminLevelDto, adminLevelDto2, adminLevelDto3, adminLevelDto4};
            $VALUES = adminLevelDtoArr;
            $ENTRIES = new asp(adminLevelDtoArr);
            CREATOR = new a();
        }

        private AdminLevelDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AdminLevelDto valueOf(String str) {
            return (AdminLevelDto) Enum.valueOf(AdminLevelDto.class, str);
        }

        public static AdminLevelDto[] values() {
            return (AdminLevelDto[]) $VALUES.clone();
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
    /* compiled from: VideoChannelsChannelDto.kt */
    public static final class AgeMarkDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ AgeMarkDto[] $VALUES;
        public static final Parcelable.Creator<AgeMarkDto> CREATOR;

        @pmi0(BuildConfig.FLAVOR)
        public static final AgeMarkDto NO;

        @pmi0("adult")
        public static final AgeMarkDto OVER_16;

        @pmi0("porn")
        public static final AgeMarkDto OVER_18;
        private final String value;

        /* compiled from: VideoChannelsChannelDto.kt */
        public static final class a implements Parcelable.Creator<AgeMarkDto> {
            @Override // android.os.Parcelable.Creator
            public final AgeMarkDto createFromParcel(Parcel parcel) {
                return AgeMarkDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AgeMarkDto[] newArray(int i) {
                return new AgeMarkDto[i];
            }
        }

        static {
            AgeMarkDto ageMarkDto = new AgeMarkDto("NO", 0, BuildConfig.FLAVOR);
            NO = ageMarkDto;
            AgeMarkDto ageMarkDto2 = new AgeMarkDto("OVER_16", 1, "adult");
            OVER_16 = ageMarkDto2;
            AgeMarkDto ageMarkDto3 = new AgeMarkDto("OVER_18", 2, "porn");
            OVER_18 = ageMarkDto3;
            AgeMarkDto[] ageMarkDtoArr = {ageMarkDto, ageMarkDto2, ageMarkDto3};
            $VALUES = ageMarkDtoArr;
            $ENTRIES = new asp(ageMarkDtoArr);
            CREATOR = new a();
        }

        private AgeMarkDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static AgeMarkDto valueOf(String str) {
            return (AgeMarkDto) Enum.valueOf(AgeMarkDto.class, str);
        }

        public static AgeMarkDto[] values() {
            return (AgeMarkDto[]) $VALUES.clone();
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
    /* compiled from: VideoChannelsChannelDto.kt */
    public static final class MemberStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MemberStatusDto[] $VALUES;
        public static final Parcelable.Creator<MemberStatusDto> CREATOR;

        @pmi0("declined")
        public static final MemberStatusDto DECLINED;

        @pmi0("invited")
        public static final MemberStatusDto INVITED;

        @pmi0("member")
        public static final MemberStatusDto MEMBER;

        @pmi0("requested")
        public static final MemberStatusDto REQUESTED;

        @pmi0("unsure")
        public static final MemberStatusDto UNSURE;
        private final String value;

        /* compiled from: VideoChannelsChannelDto.kt */
        public static final class a implements Parcelable.Creator<MemberStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final MemberStatusDto createFromParcel(Parcel parcel) {
                return MemberStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MemberStatusDto[] newArray(int i) {
                return new MemberStatusDto[i];
            }
        }

        static {
            MemberStatusDto memberStatusDto = new MemberStatusDto("MEMBER", 0, "member");
            MEMBER = memberStatusDto;
            MemberStatusDto memberStatusDto2 = new MemberStatusDto("UNSURE", 1, "unsure");
            UNSURE = memberStatusDto2;
            MemberStatusDto memberStatusDto3 = new MemberStatusDto("DECLINED", 2, "declined");
            DECLINED = memberStatusDto3;
            MemberStatusDto memberStatusDto4 = new MemberStatusDto("REQUESTED", 3, "requested");
            REQUESTED = memberStatusDto4;
            MemberStatusDto memberStatusDto5 = new MemberStatusDto("INVITED", 4, "invited");
            INVITED = memberStatusDto5;
            MemberStatusDto[] memberStatusDtoArr = {memberStatusDto, memberStatusDto2, memberStatusDto3, memberStatusDto4, memberStatusDto5};
            $VALUES = memberStatusDtoArr;
            $ENTRIES = new asp(memberStatusDtoArr);
            CREATOR = new a();
        }

        private MemberStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static MemberStatusDto valueOf(String str) {
            return (MemberStatusDto) Enum.valueOf(MemberStatusDto.class, str);
        }

        public static MemberStatusDto[] values() {
            return (MemberStatusDto[]) $VALUES.clone();
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
    /* compiled from: VideoChannelsChannelDto.kt */
    public static final class VideoNotificationsStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VideoNotificationsStatusDto[] $VALUES;

        @pmi0("all")
        public static final VideoNotificationsStatusDto ALL;
        public static final Parcelable.Creator<VideoNotificationsStatusDto> CREATOR;

        @pmi0("none")
        public static final VideoNotificationsStatusDto NONE;

        @pmi0("preferred")
        public static final VideoNotificationsStatusDto PREFERRED;
        private final String value;

        /* compiled from: VideoChannelsChannelDto.kt */
        public static final class a implements Parcelable.Creator<VideoNotificationsStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final VideoNotificationsStatusDto createFromParcel(Parcel parcel) {
                return VideoNotificationsStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VideoNotificationsStatusDto[] newArray(int i) {
                return new VideoNotificationsStatusDto[i];
            }
        }

        static {
            VideoNotificationsStatusDto videoNotificationsStatusDto = new VideoNotificationsStatusDto("NONE", 0, "none");
            NONE = videoNotificationsStatusDto;
            VideoNotificationsStatusDto videoNotificationsStatusDto2 = new VideoNotificationsStatusDto("ALL", 1, "all");
            ALL = videoNotificationsStatusDto2;
            VideoNotificationsStatusDto videoNotificationsStatusDto3 = new VideoNotificationsStatusDto("PREFERRED", 2, "preferred");
            PREFERRED = videoNotificationsStatusDto3;
            VideoNotificationsStatusDto[] videoNotificationsStatusDtoArr = {videoNotificationsStatusDto, videoNotificationsStatusDto2, videoNotificationsStatusDto3};
            $VALUES = videoNotificationsStatusDtoArr;
            $ENTRIES = new asp(videoNotificationsStatusDtoArr);
            CREATOR = new a();
        }

        private VideoNotificationsStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static VideoNotificationsStatusDto valueOf(String str) {
            return (VideoNotificationsStatusDto) Enum.valueOf(VideoNotificationsStatusDto.class, str);
        }

        public static VideoNotificationsStatusDto[] values() {
            return (VideoNotificationsStatusDto[]) $VALUES.clone();
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

    /* compiled from: VideoChannelsChannelDto.kt */
    public static final class a implements Parcelable.Creator<VideoChannelsChannelDto> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.api.generated.videoChannels.dto.VideoChannelsChannelDto createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException
            */

        @Override // android.os.Parcelable.Creator
        public final VideoChannelsChannelDto[] newArray(int i) {
            return new VideoChannelsChannelDto[i];
        }
    }

    public VideoChannelsChannelDto(long j, boolean z, boolean z2, boolean z3, String str, String str2, String str3, Long l, AccessTypeDto accessTypeDto, AdminLevelDto adminLevelDto, AgeMarkDto ageMarkDto, MemberStatusDto memberStatusDto, VideoNotificationsStatusDto videoNotificationsStatusDto, VideoChannelsPhotosDto videoChannelsPhotosDto, VideoChannelsCountersDto videoChannelsCountersDto, VideoChannelsOnboardingDto videoChannelsOnboardingDto, VideoChannelsAPlusMarkDto videoChannelsAPlusMarkDto, VideoChannelsVideoCoverDto videoChannelsVideoCoverDto, VideoChannelsWarningNotificationDto videoChannelsWarningNotificationDto) {
        this.id = j;
        this.isAdvertiser = z;
        this.trending = z2;
        this.verified = z3;
        this.name = str;
        this.description = str2;
        this.screenName = str3;
        this.createdAt = l;
        this.accessType = accessTypeDto;
        this.adminLevel = adminLevelDto;
        this.ageMark = ageMarkDto;
        this.memberStatus = memberStatusDto;
        this.videoNotificationsStatus = videoNotificationsStatusDto;
        this.photos = videoChannelsPhotosDto;
        this.counters = videoChannelsCountersDto;
        this.onboarding = videoChannelsOnboardingDto;
        this.aPlusMark = videoChannelsAPlusMarkDto;
        this.videoCover = videoChannelsVideoCoverDto;
        this.warningNotification = videoChannelsWarningNotificationDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChannelsChannelDto)) {
            return false;
        }
        VideoChannelsChannelDto videoChannelsChannelDto = (VideoChannelsChannelDto) obj;
        return this.id == videoChannelsChannelDto.id && this.isAdvertiser == videoChannelsChannelDto.isAdvertiser && this.trending == videoChannelsChannelDto.trending && this.verified == videoChannelsChannelDto.verified && epx.f(this.name, videoChannelsChannelDto.name) && epx.f(this.description, videoChannelsChannelDto.description) && epx.f(this.screenName, videoChannelsChannelDto.screenName) && epx.f(this.createdAt, videoChannelsChannelDto.createdAt) && this.accessType == videoChannelsChannelDto.accessType && this.adminLevel == videoChannelsChannelDto.adminLevel && this.ageMark == videoChannelsChannelDto.ageMark && this.memberStatus == videoChannelsChannelDto.memberStatus && this.videoNotificationsStatus == videoChannelsChannelDto.videoNotificationsStatus && epx.f(this.photos, videoChannelsChannelDto.photos) && epx.f(this.counters, videoChannelsChannelDto.counters) && epx.f(this.onboarding, videoChannelsChannelDto.onboarding) && epx.f(this.aPlusMark, videoChannelsChannelDto.aPlusMark) && epx.f(this.videoCover, videoChannelsChannelDto.videoCover) && epx.f(this.warningNotification, videoChannelsChannelDto.warningNotification);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(qoy.b(Long.hashCode(this.id) * 31, 31, this.isAdvertiser), 31, this.trending), 31, this.verified);
        String str = this.name;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.screenName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.createdAt;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        AccessTypeDto accessTypeDto = this.accessType;
        int hashCode5 = (hashCode4 + (accessTypeDto == null ? 0 : accessTypeDto.hashCode())) * 31;
        AdminLevelDto adminLevelDto = this.adminLevel;
        int hashCode6 = (hashCode5 + (adminLevelDto == null ? 0 : adminLevelDto.hashCode())) * 31;
        AgeMarkDto ageMarkDto = this.ageMark;
        int hashCode7 = (hashCode6 + (ageMarkDto == null ? 0 : ageMarkDto.hashCode())) * 31;
        MemberStatusDto memberStatusDto = this.memberStatus;
        int hashCode8 = (hashCode7 + (memberStatusDto == null ? 0 : memberStatusDto.hashCode())) * 31;
        VideoNotificationsStatusDto videoNotificationsStatusDto = this.videoNotificationsStatus;
        int hashCode9 = (hashCode8 + (videoNotificationsStatusDto == null ? 0 : videoNotificationsStatusDto.hashCode())) * 31;
        VideoChannelsPhotosDto videoChannelsPhotosDto = this.photos;
        int hashCode10 = (hashCode9 + (videoChannelsPhotosDto == null ? 0 : videoChannelsPhotosDto.hashCode())) * 31;
        VideoChannelsCountersDto videoChannelsCountersDto = this.counters;
        int hashCode11 = (hashCode10 + (videoChannelsCountersDto == null ? 0 : videoChannelsCountersDto.hashCode())) * 31;
        VideoChannelsOnboardingDto videoChannelsOnboardingDto = this.onboarding;
        int hashCode12 = (hashCode11 + (videoChannelsOnboardingDto == null ? 0 : videoChannelsOnboardingDto.hashCode())) * 31;
        VideoChannelsAPlusMarkDto videoChannelsAPlusMarkDto = this.aPlusMark;
        int hashCode13 = (hashCode12 + (videoChannelsAPlusMarkDto == null ? 0 : videoChannelsAPlusMarkDto.hashCode())) * 31;
        VideoChannelsVideoCoverDto videoChannelsVideoCoverDto = this.videoCover;
        int hashCode14 = (hashCode13 + (videoChannelsVideoCoverDto == null ? 0 : videoChannelsVideoCoverDto.hashCode())) * 31;
        VideoChannelsWarningNotificationDto videoChannelsWarningNotificationDto = this.warningNotification;
        return hashCode14 + (videoChannelsWarningNotificationDto != null ? videoChannelsWarningNotificationDto.hashCode() : 0);
    }

    public final String toString() {
        return "VideoChannelsChannelDto(id=" + this.id + ", isAdvertiser=" + this.isAdvertiser + ", trending=" + this.trending + ", verified=" + this.verified + ", name=" + this.name + ", description=" + this.description + ", screenName=" + this.screenName + ", createdAt=" + this.createdAt + ", accessType=" + this.accessType + ", adminLevel=" + this.adminLevel + ", ageMark=" + this.ageMark + ", memberStatus=" + this.memberStatus + ", videoNotificationsStatus=" + this.videoNotificationsStatus + ", photos=" + this.photos + ", counters=" + this.counters + ", onboarding=" + this.onboarding + ", aPlusMark=" + this.aPlusMark + ", videoCover=" + this.videoCover + ", warningNotification=" + this.warningNotification + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        parcel.writeInt(this.isAdvertiser ? 1 : 0);
        parcel.writeInt(this.trending ? 1 : 0);
        parcel.writeInt(this.verified ? 1 : 0);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeString(this.screenName);
        Long l = this.createdAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        AccessTypeDto accessTypeDto = this.accessType;
        if (accessTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accessTypeDto.writeToParcel(parcel, i);
        }
        AdminLevelDto adminLevelDto = this.adminLevel;
        if (adminLevelDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adminLevelDto.writeToParcel(parcel, i);
        }
        AgeMarkDto ageMarkDto = this.ageMark;
        if (ageMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ageMarkDto.writeToParcel(parcel, i);
        }
        MemberStatusDto memberStatusDto = this.memberStatus;
        if (memberStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            memberStatusDto.writeToParcel(parcel, i);
        }
        VideoNotificationsStatusDto videoNotificationsStatusDto = this.videoNotificationsStatus;
        if (videoNotificationsStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoNotificationsStatusDto.writeToParcel(parcel, i);
        }
        VideoChannelsPhotosDto videoChannelsPhotosDto = this.photos;
        if (videoChannelsPhotosDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoChannelsPhotosDto.writeToParcel(parcel, i);
        }
        VideoChannelsCountersDto videoChannelsCountersDto = this.counters;
        if (videoChannelsCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoChannelsCountersDto.writeToParcel(parcel, i);
        }
        VideoChannelsOnboardingDto videoChannelsOnboardingDto = this.onboarding;
        if (videoChannelsOnboardingDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoChannelsOnboardingDto.writeToParcel(parcel, i);
        }
        VideoChannelsAPlusMarkDto videoChannelsAPlusMarkDto = this.aPlusMark;
        if (videoChannelsAPlusMarkDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoChannelsAPlusMarkDto.writeToParcel(parcel, i);
        }
        VideoChannelsVideoCoverDto videoChannelsVideoCoverDto = this.videoCover;
        if (videoChannelsVideoCoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoChannelsVideoCoverDto.writeToParcel(parcel, i);
        }
        VideoChannelsWarningNotificationDto videoChannelsWarningNotificationDto = this.warningNotification;
        if (videoChannelsWarningNotificationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            videoChannelsWarningNotificationDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ VideoChannelsChannelDto(long j, boolean z, boolean z2, boolean z3, String str, String str2, String str3, Long l, AccessTypeDto accessTypeDto, AdminLevelDto adminLevelDto, AgeMarkDto ageMarkDto, MemberStatusDto memberStatusDto, VideoNotificationsStatusDto videoNotificationsStatusDto, VideoChannelsPhotosDto videoChannelsPhotosDto, VideoChannelsCountersDto videoChannelsCountersDto, VideoChannelsOnboardingDto videoChannelsOnboardingDto, VideoChannelsAPlusMarkDto videoChannelsAPlusMarkDto, VideoChannelsVideoCoverDto videoChannelsVideoCoverDto, VideoChannelsWarningNotificationDto videoChannelsWarningNotificationDto, int i, zcl zclVar) {
        this(j, z, z2, z3, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : accessTypeDto, (i & 512) != 0 ? null : adminLevelDto, (i & 1024) != 0 ? null : ageMarkDto, (i & 2048) != 0 ? null : memberStatusDto, (i & 4096) != 0 ? null : videoNotificationsStatusDto, (i & 8192) != 0 ? null : videoChannelsPhotosDto, (i & 16384) != 0 ? null : videoChannelsCountersDto, (32768 & i) != 0 ? null : videoChannelsOnboardingDto, (65536 & i) != 0 ? null : videoChannelsAPlusMarkDto, (131072 & i) != 0 ? null : videoChannelsVideoCoverDto, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : videoChannelsWarningNotificationDto);
    }
}
