package com.vk.api.generated.topshelf.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.vk.api.generated.shortVideo.dto.ShortVideoShortVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TopshelfTopshelfItemDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfItemDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfItemDto> CREATOR = new a();

    @pmi0("action")
    private final ActionDto action;

    @pmi0("category")
    private final String category;

    @pmi0("id")
    private final int id;

    @pmi0("is_subscribed")
    private final Boolean isSubscribed;

    @pmi0("logo_image")
    private final TopshelfTopshelfLogoImageDto logoImage;

    @pmi0("logo_image_old")
    private final TopshelfTopshelfLogoImageDto logoImageOld;

    @pmi0("target_link")
    private final String targetLink;

    @pmi0("target_short_video")
    private final ShortVideoShortVideoFullDto targetShortVideo;

    @pmi0("target_video")
    private final VideoVideoFullDto targetVideo;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    @pmi0("topshelf_image")
    private final TopshelfTopshelfImageDto topshelfImage;

    @pmi0("topshelf_live")
    private final TopshelfTopshelfLiveDto topshelfLive;

    @pmi0("topshelf_meta")
    private final TopshelfTopshelfMetaDto topshelfMeta;

    @pmi0("topshelf_track_codes")
    private final TopshelfTopshelfTrackCodesDto topshelfTrackCodes;

    @pmi0("topshelf_trailer")
    private final TopshelfTopshelfTrailerDto topshelfTrailer;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("videos_in_playlist")
    private final Integer videosInPlaylist;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TopshelfTopshelfItemDto.kt */
    public static final class ActionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActionDto[] $VALUES;

        @pmi0("create_child_profile")
        public static final ActionDto CREATE_CHILD_PROFILE;
        public static final Parcelable.Creator<ActionDto> CREATOR;

        @pmi0("login_child_profile")
        public static final ActionDto LOGIN_CHILD_PROFILE;
        private final String value;

        /* compiled from: TopshelfTopshelfItemDto.kt */
        public static final class a implements Parcelable.Creator<ActionDto> {
            @Override // android.os.Parcelable.Creator
            public final ActionDto createFromParcel(Parcel parcel) {
                return ActionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActionDto[] newArray(int i) {
                return new ActionDto[i];
            }
        }

        static {
            ActionDto actionDto = new ActionDto("LOGIN_CHILD_PROFILE", 0, "login_child_profile");
            LOGIN_CHILD_PROFILE = actionDto;
            ActionDto actionDto2 = new ActionDto("CREATE_CHILD_PROFILE", 1, "create_child_profile");
            CREATE_CHILD_PROFILE = actionDto2;
            ActionDto[] actionDtoArr = {actionDto, actionDto2};
            $VALUES = actionDtoArr;
            $ENTRIES = new asp(actionDtoArr);
            CREATOR = new a();
        }

        private ActionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActionDto valueOf(String str) {
            return (ActionDto) Enum.valueOf(ActionDto.class, str);
        }

        public static ActionDto[] values() {
            return (ActionDto[]) $VALUES.clone();
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
    /* compiled from: TopshelfTopshelfItemDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("child_profile")
        public static final TypeDto CHILD_PROFILE;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("live")
        public static final TypeDto LIVE;

        @pmi0("monotheme_news")
        public static final TypeDto MONOTHEME_NEWS;

        @pmi0(NotificationCompat.CATEGORY_NAVIGATION)
        public static final TypeDto NAVIGATION;

        @pmi0("playlist")
        public static final TypeDto PLAYLIST;

        @pmi0("video")
        public static final TypeDto VIDEO;
        private final String value;

        /* compiled from: TopshelfTopshelfItemDto.kt */
        public static final class a implements Parcelable.Creator<TypeDto> {
            @Override // android.os.Parcelable.Creator
            public final TypeDto createFromParcel(Parcel parcel) {
                return TypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TypeDto[] newArray(int i) {
                return new TypeDto[i];
            }
        }

        static {
            TypeDto typeDto = new TypeDto(SignalingProtocol.MEDIA_OPTION_VIDEO, 0, "video");
            VIDEO = typeDto;
            TypeDto typeDto2 = new TypeDto("PLAYLIST", 1, "playlist");
            PLAYLIST = typeDto2;
            TypeDto typeDto3 = new TypeDto("LIVE", 2, "live");
            LIVE = typeDto3;
            TypeDto typeDto4 = new TypeDto("NAVIGATION", 3, NotificationCompat.CATEGORY_NAVIGATION);
            NAVIGATION = typeDto4;
            TypeDto typeDto5 = new TypeDto("CHILD_PROFILE", 4, "child_profile");
            CHILD_PROFILE = typeDto5;
            TypeDto typeDto6 = new TypeDto("MONOTHEME_NEWS", 5, "monotheme_news");
            MONOTHEME_NEWS = typeDto6;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
            CREATOR = new a();
        }

        private TypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static TypeDto valueOf(String str) {
            return (TypeDto) Enum.valueOf(TypeDto.class, str);
        }

        public static TypeDto[] values() {
            return (TypeDto[]) $VALUES.clone();
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

    /* compiled from: TopshelfTopshelfItemDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfItemDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfItemDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int i;
            TopshelfTopshelfMetaDto createFromParcel;
            int readInt = parcel.readInt();
            TypeDto createFromParcel2 = TypeDto.CREATOR.createFromParcel(parcel);
            TopshelfTopshelfImageDto createFromParcel3 = TopshelfTopshelfImageDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ActionDto createFromParcel4 = parcel.readInt() == 0 ? null : ActionDto.CREATOR.createFromParcel(parcel);
            ShortVideoShortVideoFullDto shortVideoShortVideoFullDto = (ShortVideoShortVideoFullDto) parcel.readParcelable(TopshelfTopshelfItemDto.class.getClassLoader());
            VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) parcel.readParcelable(TopshelfTopshelfItemDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            TopshelfTopshelfLiveDto createFromParcel5 = parcel.readInt() == 0 ? null : TopshelfTopshelfLiveDto.CREATOR.createFromParcel(parcel);
            TopshelfTopshelfLogoImageDto createFromParcel6 = parcel.readInt() == 0 ? null : TopshelfTopshelfLogoImageDto.CREATOR.createFromParcel(parcel);
            TopshelfTopshelfLogoImageDto createFromParcel7 = parcel.readInt() == 0 ? null : TopshelfTopshelfLogoImageDto.CREATOR.createFromParcel(parcel);
            TopshelfTopshelfTrailerDto createFromParcel8 = parcel.readInt() == 0 ? null : TopshelfTopshelfTrailerDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                i = readInt;
                createFromParcel = null;
            } else {
                i = readInt;
                createFromParcel = TopshelfTopshelfMetaDto.CREATOR.createFromParcel(parcel);
            }
            return new TopshelfTopshelfItemDto(i, createFromParcel2, createFromParcel3, readString, readString2, createFromParcel4, shortVideoShortVideoFullDto, videoVideoFullDto, valueOf, valueOf2, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel, parcel.readInt() == 0 ? null : TopshelfTopshelfTrackCodesDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfItemDto[] newArray(int i) {
            return new TopshelfTopshelfItemDto[i];
        }
    }

    public TopshelfTopshelfItemDto(int i, TypeDto typeDto, TopshelfTopshelfImageDto topshelfTopshelfImageDto, String str, String str2, ActionDto actionDto, ShortVideoShortVideoFullDto shortVideoShortVideoFullDto, VideoVideoFullDto videoVideoFullDto, Boolean bool, Integer num, TopshelfTopshelfLiveDto topshelfTopshelfLiveDto, TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto, TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto2, TopshelfTopshelfTrailerDto topshelfTopshelfTrailerDto, TopshelfTopshelfMetaDto topshelfTopshelfMetaDto, TopshelfTopshelfTrackCodesDto topshelfTopshelfTrackCodesDto, String str3, String str4) {
        this.id = i;
        this.type = typeDto;
        this.topshelfImage = topshelfTopshelfImageDto;
        this.text = str;
        this.title = str2;
        this.action = actionDto;
        this.targetShortVideo = shortVideoShortVideoFullDto;
        this.targetVideo = videoVideoFullDto;
        this.isSubscribed = bool;
        this.videosInPlaylist = num;
        this.topshelfLive = topshelfTopshelfLiveDto;
        this.logoImageOld = topshelfTopshelfLogoImageDto;
        this.logoImage = topshelfTopshelfLogoImageDto2;
        this.topshelfTrailer = topshelfTopshelfTrailerDto;
        this.topshelfMeta = topshelfTopshelfMetaDto;
        this.topshelfTrackCodes = topshelfTopshelfTrackCodesDto;
        this.targetLink = str3;
        this.category = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopshelfTopshelfItemDto)) {
            return false;
        }
        TopshelfTopshelfItemDto topshelfTopshelfItemDto = (TopshelfTopshelfItemDto) obj;
        return this.id == topshelfTopshelfItemDto.id && this.type == topshelfTopshelfItemDto.type && epx.f(this.topshelfImage, topshelfTopshelfItemDto.topshelfImage) && epx.f(this.text, topshelfTopshelfItemDto.text) && epx.f(this.title, topshelfTopshelfItemDto.title) && this.action == topshelfTopshelfItemDto.action && epx.f(this.targetShortVideo, topshelfTopshelfItemDto.targetShortVideo) && epx.f(this.targetVideo, topshelfTopshelfItemDto.targetVideo) && epx.f(this.isSubscribed, topshelfTopshelfItemDto.isSubscribed) && epx.f(this.videosInPlaylist, topshelfTopshelfItemDto.videosInPlaylist) && epx.f(this.topshelfLive, topshelfTopshelfItemDto.topshelfLive) && epx.f(this.logoImageOld, topshelfTopshelfItemDto.logoImageOld) && epx.f(this.logoImage, topshelfTopshelfItemDto.logoImage) && epx.f(this.topshelfTrailer, topshelfTopshelfItemDto.topshelfTrailer) && epx.f(this.topshelfMeta, topshelfTopshelfItemDto.topshelfMeta) && epx.f(this.topshelfTrackCodes, topshelfTopshelfItemDto.topshelfTrackCodes) && epx.f(this.targetLink, topshelfTopshelfItemDto.targetLink) && epx.f(this.category, topshelfTopshelfItemDto.category);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a((this.topshelfImage.hashCode() + ((this.type.hashCode() + (Integer.hashCode(this.id) * 31)) * 31)) * 31, 31, this.text), 31, this.title);
        ActionDto actionDto = this.action;
        int hashCode = (a2 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
        ShortVideoShortVideoFullDto shortVideoShortVideoFullDto = this.targetShortVideo;
        int hashCode2 = (hashCode + (shortVideoShortVideoFullDto == null ? 0 : shortVideoShortVideoFullDto.hashCode())) * 31;
        VideoVideoFullDto videoVideoFullDto = this.targetVideo;
        int hashCode3 = (hashCode2 + (videoVideoFullDto == null ? 0 : videoVideoFullDto.hashCode())) * 31;
        Boolean bool = this.isSubscribed;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.videosInPlaylist;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        TopshelfTopshelfLiveDto topshelfTopshelfLiveDto = this.topshelfLive;
        int hashCode6 = (hashCode5 + (topshelfTopshelfLiveDto == null ? 0 : topshelfTopshelfLiveDto.hashCode())) * 31;
        TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto = this.logoImageOld;
        int hashCode7 = (hashCode6 + (topshelfTopshelfLogoImageDto == null ? 0 : topshelfTopshelfLogoImageDto.hashCode())) * 31;
        TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto2 = this.logoImage;
        int hashCode8 = (hashCode7 + (topshelfTopshelfLogoImageDto2 == null ? 0 : topshelfTopshelfLogoImageDto2.hashCode())) * 31;
        TopshelfTopshelfTrailerDto topshelfTopshelfTrailerDto = this.topshelfTrailer;
        int hashCode9 = (hashCode8 + (topshelfTopshelfTrailerDto == null ? 0 : topshelfTopshelfTrailerDto.hashCode())) * 31;
        TopshelfTopshelfMetaDto topshelfTopshelfMetaDto = this.topshelfMeta;
        int hashCode10 = (hashCode9 + (topshelfTopshelfMetaDto == null ? 0 : topshelfTopshelfMetaDto.hashCode())) * 31;
        TopshelfTopshelfTrackCodesDto topshelfTopshelfTrackCodesDto = this.topshelfTrackCodes;
        int hashCode11 = (hashCode10 + (topshelfTopshelfTrackCodesDto == null ? 0 : topshelfTopshelfTrackCodesDto.hashCode())) * 31;
        String str = this.targetLink;
        int hashCode12 = (hashCode11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        return hashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfTopshelfItemDto(id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", topshelfImage=");
        sb.append(this.topshelfImage);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", targetShortVideo=");
        sb.append(this.targetShortVideo);
        sb.append(", targetVideo=");
        sb.append(this.targetVideo);
        sb.append(", isSubscribed=");
        sb.append(this.isSubscribed);
        sb.append(", videosInPlaylist=");
        sb.append(this.videosInPlaylist);
        sb.append(", topshelfLive=");
        sb.append(this.topshelfLive);
        sb.append(", logoImageOld=");
        sb.append(this.logoImageOld);
        sb.append(", logoImage=");
        sb.append(this.logoImage);
        sb.append(", topshelfTrailer=");
        sb.append(this.topshelfTrailer);
        sb.append(", topshelfMeta=");
        sb.append(this.topshelfMeta);
        sb.append(", topshelfTrackCodes=");
        sb.append(this.topshelfTrackCodes);
        sb.append(", targetLink=");
        sb.append(this.targetLink);
        sb.append(", category=");
        return ho8.a(sb, this.category, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        this.type.writeToParcel(parcel, i);
        this.topshelfImage.writeToParcel(parcel, i);
        parcel.writeString(this.text);
        parcel.writeString(this.title);
        ActionDto actionDto = this.action;
        if (actionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.targetShortVideo, i);
        parcel.writeParcelable(this.targetVideo, i);
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.videosInPlaylist;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        TopshelfTopshelfLiveDto topshelfTopshelfLiveDto = this.topshelfLive;
        if (topshelfTopshelfLiveDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topshelfTopshelfLiveDto.writeToParcel(parcel, i);
        }
        TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto = this.logoImageOld;
        if (topshelfTopshelfLogoImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topshelfTopshelfLogoImageDto.writeToParcel(parcel, i);
        }
        TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto2 = this.logoImage;
        if (topshelfTopshelfLogoImageDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topshelfTopshelfLogoImageDto2.writeToParcel(parcel, i);
        }
        TopshelfTopshelfTrailerDto topshelfTopshelfTrailerDto = this.topshelfTrailer;
        if (topshelfTopshelfTrailerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topshelfTopshelfTrailerDto.writeToParcel(parcel, i);
        }
        TopshelfTopshelfMetaDto topshelfTopshelfMetaDto = this.topshelfMeta;
        if (topshelfTopshelfMetaDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topshelfTopshelfMetaDto.writeToParcel(parcel, i);
        }
        TopshelfTopshelfTrackCodesDto topshelfTopshelfTrackCodesDto = this.topshelfTrackCodes;
        if (topshelfTopshelfTrackCodesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            topshelfTopshelfTrackCodesDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.targetLink);
        parcel.writeString(this.category);
    }

    public /* synthetic */ TopshelfTopshelfItemDto(int i, TypeDto typeDto, TopshelfTopshelfImageDto topshelfTopshelfImageDto, String str, String str2, ActionDto actionDto, ShortVideoShortVideoFullDto shortVideoShortVideoFullDto, VideoVideoFullDto videoVideoFullDto, Boolean bool, Integer num, TopshelfTopshelfLiveDto topshelfTopshelfLiveDto, TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto, TopshelfTopshelfLogoImageDto topshelfTopshelfLogoImageDto2, TopshelfTopshelfTrailerDto topshelfTopshelfTrailerDto, TopshelfTopshelfMetaDto topshelfTopshelfMetaDto, TopshelfTopshelfTrackCodesDto topshelfTopshelfTrackCodesDto, String str3, String str4, int i2, zcl zclVar) {
        this(i, typeDto, topshelfTopshelfImageDto, str, str2, (i2 & 32) != 0 ? null : actionDto, (i2 & 64) != 0 ? null : shortVideoShortVideoFullDto, (i2 & 128) != 0 ? null : videoVideoFullDto, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : topshelfTopshelfLiveDto, (i2 & 2048) != 0 ? null : topshelfTopshelfLogoImageDto, (i2 & 4096) != 0 ? null : topshelfTopshelfLogoImageDto2, (i2 & 8192) != 0 ? null : topshelfTopshelfTrailerDto, (i2 & 16384) != 0 ? null : topshelfTopshelfMetaDto, (32768 & i2) != 0 ? null : topshelfTopshelfTrackCodesDto, (65536 & i2) != 0 ? null : str3, (i2 & 131072) != 0 ? null : str4);
    }
}
