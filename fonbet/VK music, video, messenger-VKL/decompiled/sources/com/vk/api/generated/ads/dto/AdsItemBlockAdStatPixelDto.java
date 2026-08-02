package com.vk.api.generated.ads.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdStatPixelDto.kt */
/* loaded from: classes14.dex */
public final class AdsItemBlockAdStatPixelDto implements Parcelable {
    public static final Parcelable.Creator<AdsItemBlockAdStatPixelDto> CREATOR = new a();

    @pmi0("duration")
    private final Integer duration;

    @pmi0("ovv")
    private final Boolean ovv;

    @pmi0("pvalue")
    private final Integer pvalue;

    @pmi0("target")
    private final String target;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    @pmi0("value")
    private final Integer value;

    @pmi0("viewable_percent")
    private final Integer viewablePercent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdStatPixelDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;

        @pmi0("audio_click")
        public static final TypeDto AUDIO_CLICK;

        @pmi0("click")
        public static final TypeDto CLICK;

        @pmi0("click_deeplink")
        public static final TypeDto CLICK_DEEPLINK;

        @pmi0("click_post_link")
        public static final TypeDto CLICK_POST_LINK;

        @pmi0("click_post_link_internal")
        public static final TypeDto CLICK_POST_LINK_INTERNAL;

        @pmi0("click_post_owner")
        public static final TypeDto CLICK_POST_OWNER;

        @pmi0("click_pretty_card")
        public static final TypeDto CLICK_PRETTY_CARD;

        @pmi0("clip_author_click")
        public static final TypeDto CLIP_AUTHOR_CLICK;

        @pmi0("clip_bookmark")
        public static final TypeDto CLIP_BOOKMARK;

        @pmi0("clip_comment")
        public static final TypeDto CLIP_COMMENT;

        @pmi0("clip_like")
        public static final TypeDto CLIP_LIKE;

        @pmi0("clip_share")
        public static final TypeDto CLIP_SHARE;

        @pmi0("clip_subscribe")
        public static final TypeDto CLIP_SUBSCRIBE;

        @pmi0("closed_by_user")
        public static final TypeDto CLOSED_BY_USER;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("cta_click")
        public static final TypeDto CTA_CLICK;

        @pmi0("error")
        public static final TypeDto ERROR;

        @pmi0("hide")
        public static final TypeDto HIDE;

        @pmi0("impression")
        public static final TypeDto IMPRESSION;

        @pmi0("impression_pretty_card")
        public static final TypeDto IMPRESSION_PRETTY_CARD;

        @pmi0("like_post")
        public static final TypeDto LIKE_POST;

        @pmi0("load")
        public static final TypeDto LOAD;

        @pmi0("playback_completed")
        public static final TypeDto PLAYBACK_COMPLETED;

        @pmi0("playback_paused")
        public static final TypeDto PLAYBACK_PAUSED;

        @pmi0("playback_resumed")
        public static final TypeDto PLAYBACK_RESUMED;

        @pmi0("playback_started")
        public static final TypeDto PLAYBACK_STARTED;

        @pmi0("playhead_reached_value")
        public static final TypeDto PLAYHEAD_REACHED_VALUE;

        @pmi0("playhead_viewability_value")
        public static final TypeDto PLAYHEAD_VIEWABILITY_VALUE;

        @pmi0("play_video_volume_off")
        public static final TypeDto PLAY_VIDEO_VOLUME_OFF;

        @pmi0("play_video_volume_on")
        public static final TypeDto PLAY_VIDEO_VOLUME_ON;

        @pmi0("render")
        public static final TypeDto RENDER;

        @pmi0("share_post")
        public static final TypeDto SHARE_POST;

        @pmi0("show_off")
        public static final TypeDto SHOW_OFF;

        @pmi0("stories_impression")
        public static final TypeDto STORIES_IMPRESSION;

        @pmi0("video_fullscreen_off")
        public static final TypeDto VIDEO_FULLSCREEN_OFF;

        @pmi0("video_fullscreen_on")
        public static final TypeDto VIDEO_FULLSCREEN_ON;

        @pmi0("video_pause")
        public static final TypeDto VIDEO_PAUSE;

        @pmi0("video_play")
        public static final TypeDto VIDEO_PLAY;

        @pmi0("video_play_100")
        public static final TypeDto VIDEO_PLAY_100;

        @pmi0("video_play_10s")
        public static final TypeDto VIDEO_PLAY_10S;

        @pmi0("video_play_1s")
        public static final TypeDto VIDEO_PLAY_1S;

        @pmi0("video_play_25")
        public static final TypeDto VIDEO_PLAY_25;

        @pmi0("video_play_3s")
        public static final TypeDto VIDEO_PLAY_3S;

        @pmi0("video_play_50")
        public static final TypeDto VIDEO_PLAY_50;

        @pmi0("video_play_75")
        public static final TypeDto VIDEO_PLAY_75;

        @pmi0("video_play_95")
        public static final TypeDto VIDEO_PLAY_95;

        @pmi0("video_resume")
        public static final TypeDto VIDEO_RESUME;

        @pmi0("video_start")
        public static final TypeDto VIDEO_START;

        @pmi0("video_volume_off")
        public static final TypeDto VIDEO_VOLUME_OFF;

        @pmi0("video_volume_on")
        public static final TypeDto VIDEO_VOLUME_ON;

        @pmi0("viewability_duration")
        public static final TypeDto VIEWABILITY_DURATION;

        @pmi0("viewability_measurable")
        public static final TypeDto VIEWABILITY_MEASURABLE;

        @pmi0("viewability_unmeasurable")
        public static final TypeDto VIEWABILITY_UNMEASURABLE;

        @pmi0("viewin")
        public static final TypeDto VIEWIN;

        @pmi0("volume_off")
        public static final TypeDto VOLUME_OFF;

        @pmi0("volume_on")
        public static final TypeDto VOLUME_ON;
        private final String value;

        /* compiled from: AdsItemBlockAdStatPixelDto.kt */
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
            TypeDto typeDto = new TypeDto("LOAD", 0, "load");
            LOAD = typeDto;
            TypeDto typeDto2 = new TypeDto("IMPRESSION", 1, "impression");
            IMPRESSION = typeDto2;
            TypeDto typeDto3 = new TypeDto("CLICK", 2, "click");
            CLICK = typeDto3;
            TypeDto typeDto4 = new TypeDto("HIDE", 3, "hide");
            HIDE = typeDto4;
            TypeDto typeDto5 = new TypeDto("CLICK_DEEPLINK", 4, "click_deeplink");
            CLICK_DEEPLINK = typeDto5;
            TypeDto typeDto6 = new TypeDto("CLICK_POST_OWNER", 5, "click_post_owner");
            CLICK_POST_OWNER = typeDto6;
            TypeDto typeDto7 = new TypeDto("LIKE_POST", 6, "like_post");
            LIKE_POST = typeDto7;
            TypeDto typeDto8 = new TypeDto("CLICK_POST_LINK", 7, "click_post_link");
            CLICK_POST_LINK = typeDto8;
            TypeDto typeDto9 = new TypeDto("CLICK_POST_LINK_INTERNAL", 8, "click_post_link_internal");
            CLICK_POST_LINK_INTERNAL = typeDto9;
            TypeDto typeDto10 = new TypeDto("SHARE_POST", 9, "share_post");
            SHARE_POST = typeDto10;
            TypeDto typeDto11 = new TypeDto("VIDEO_START", 10, "video_start");
            VIDEO_START = typeDto11;
            TypeDto typeDto12 = new TypeDto("VIDEO_PAUSE", 11, "video_pause");
            VIDEO_PAUSE = typeDto12;
            TypeDto typeDto13 = new TypeDto("VIDEO_RESUME", 12, "video_resume");
            VIDEO_RESUME = typeDto13;
            TypeDto typeDto14 = new TypeDto("VIDEO_PLAY", 13, "video_play");
            VIDEO_PLAY = typeDto14;
            TypeDto typeDto15 = new TypeDto("VIDEO_PLAY_3S", 14, "video_play_3s");
            VIDEO_PLAY_3S = typeDto15;
            TypeDto typeDto16 = new TypeDto("VIDEO_PLAY_10S", 15, "video_play_10s");
            VIDEO_PLAY_10S = typeDto16;
            TypeDto typeDto17 = new TypeDto("VIDEO_PLAY_25", 16, "video_play_25");
            VIDEO_PLAY_25 = typeDto17;
            TypeDto typeDto18 = new TypeDto("VIDEO_PLAY_50", 17, "video_play_50");
            VIDEO_PLAY_50 = typeDto18;
            TypeDto typeDto19 = new TypeDto("VIDEO_PLAY_75", 18, "video_play_75");
            VIDEO_PLAY_75 = typeDto19;
            TypeDto typeDto20 = new TypeDto("VIDEO_PLAY_95", 19, "video_play_95");
            VIDEO_PLAY_95 = typeDto20;
            TypeDto typeDto21 = new TypeDto("VIDEO_PLAY_100", 20, "video_play_100");
            VIDEO_PLAY_100 = typeDto21;
            TypeDto typeDto22 = new TypeDto("VIDEO_VOLUME_ON", 21, "video_volume_on");
            VIDEO_VOLUME_ON = typeDto22;
            TypeDto typeDto23 = new TypeDto("VIDEO_VOLUME_OFF", 22, "video_volume_off");
            VIDEO_VOLUME_OFF = typeDto23;
            TypeDto typeDto24 = new TypeDto("VIDEO_FULLSCREEN_ON", 23, "video_fullscreen_on");
            VIDEO_FULLSCREEN_ON = typeDto24;
            TypeDto typeDto25 = new TypeDto("VIDEO_FULLSCREEN_OFF", 24, "video_fullscreen_off");
            VIDEO_FULLSCREEN_OFF = typeDto25;
            TypeDto typeDto26 = new TypeDto("IMPRESSION_PRETTY_CARD", 25, "impression_pretty_card");
            IMPRESSION_PRETTY_CARD = typeDto26;
            TypeDto typeDto27 = new TypeDto("AUDIO_CLICK", 26, "audio_click");
            AUDIO_CLICK = typeDto27;
            TypeDto typeDto28 = new TypeDto("CLICK_PRETTY_CARD", 27, "click_pretty_card");
            CLICK_PRETTY_CARD = typeDto28;
            TypeDto typeDto29 = new TypeDto("SHOW_OFF", 28, "show_off");
            SHOW_OFF = typeDto29;
            TypeDto typeDto30 = new TypeDto("STORIES_IMPRESSION", 29, "stories_impression");
            STORIES_IMPRESSION = typeDto30;
            TypeDto typeDto31 = new TypeDto("RENDER", 30, "render");
            RENDER = typeDto31;
            TypeDto typeDto32 = new TypeDto("VIDEO_PLAY_1S", 31, "video_play_1s");
            VIDEO_PLAY_1S = typeDto32;
            TypeDto typeDto33 = new TypeDto("VIEWIN", 32, "viewin");
            VIEWIN = typeDto33;
            TypeDto typeDto34 = new TypeDto("VIEWABILITY_MEASURABLE", 33, "viewability_measurable");
            VIEWABILITY_MEASURABLE = typeDto34;
            TypeDto typeDto35 = new TypeDto("VIEWABILITY_UNMEASURABLE", 34, "viewability_unmeasurable");
            VIEWABILITY_UNMEASURABLE = typeDto35;
            TypeDto typeDto36 = new TypeDto("VIEWABILITY_DURATION", 35, "viewability_duration");
            VIEWABILITY_DURATION = typeDto36;
            TypeDto typeDto37 = new TypeDto("PLAYHEAD_VIEWABILITY_VALUE", 36, "playhead_viewability_value");
            PLAYHEAD_VIEWABILITY_VALUE = typeDto37;
            TypeDto typeDto38 = new TypeDto("VOLUME_ON", 37, "volume_on");
            VOLUME_ON = typeDto38;
            TypeDto typeDto39 = new TypeDto("VOLUME_OFF", 38, "volume_off");
            VOLUME_OFF = typeDto39;
            TypeDto typeDto40 = new TypeDto("CLOSED_BY_USER", 39, "closed_by_user");
            CLOSED_BY_USER = typeDto40;
            TypeDto typeDto41 = new TypeDto("PLAYBACK_STARTED", 40, "playback_started");
            PLAYBACK_STARTED = typeDto41;
            TypeDto typeDto42 = new TypeDto("PLAYBACK_COMPLETED", 41, "playback_completed");
            PLAYBACK_COMPLETED = typeDto42;
            TypeDto typeDto43 = new TypeDto("PLAYBACK_RESUMED", 42, "playback_resumed");
            PLAYBACK_RESUMED = typeDto43;
            TypeDto typeDto44 = new TypeDto("PLAYBACK_PAUSED", 43, "playback_paused");
            PLAYBACK_PAUSED = typeDto44;
            TypeDto typeDto45 = new TypeDto("PLAYHEAD_REACHED_VALUE", 44, "playhead_reached_value");
            PLAYHEAD_REACHED_VALUE = typeDto45;
            TypeDto typeDto46 = new TypeDto("ERROR", 45, "error");
            ERROR = typeDto46;
            TypeDto typeDto47 = new TypeDto("CLIP_LIKE", 46, "clip_like");
            CLIP_LIKE = typeDto47;
            TypeDto typeDto48 = new TypeDto("CLIP_SUBSCRIBE", 47, "clip_subscribe");
            CLIP_SUBSCRIBE = typeDto48;
            TypeDto typeDto49 = new TypeDto("CLIP_COMMENT", 48, "clip_comment");
            CLIP_COMMENT = typeDto49;
            TypeDto typeDto50 = new TypeDto("CLIP_SHARE", 49, "clip_share");
            CLIP_SHARE = typeDto50;
            TypeDto typeDto51 = new TypeDto("CLIP_BOOKMARK", 50, "clip_bookmark");
            CLIP_BOOKMARK = typeDto51;
            TypeDto typeDto52 = new TypeDto("CLIP_AUTHOR_CLICK", 51, "clip_author_click");
            CLIP_AUTHOR_CLICK = typeDto52;
            TypeDto typeDto53 = new TypeDto("PLAY_VIDEO_VOLUME_OFF", 52, "play_video_volume_off");
            PLAY_VIDEO_VOLUME_OFF = typeDto53;
            TypeDto typeDto54 = new TypeDto("PLAY_VIDEO_VOLUME_ON", 53, "play_video_volume_on");
            PLAY_VIDEO_VOLUME_ON = typeDto54;
            TypeDto typeDto55 = new TypeDto("CTA_CLICK", 54, "cta_click");
            CTA_CLICK = typeDto55;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21, typeDto22, typeDto23, typeDto24, typeDto25, typeDto26, typeDto27, typeDto28, typeDto29, typeDto30, typeDto31, typeDto32, typeDto33, typeDto34, typeDto35, typeDto36, typeDto37, typeDto38, typeDto39, typeDto40, typeDto41, typeDto42, typeDto43, typeDto44, typeDto45, typeDto46, typeDto47, typeDto48, typeDto49, typeDto50, typeDto51, typeDto52, typeDto53, typeDto54, typeDto55};
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

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AdsItemBlockAdStatPixelDto.kt */
    public static final class a implements Parcelable.Creator<AdsItemBlockAdStatPixelDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdStatPixelDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            TypeDto createFromParcel = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            Integer num = null;
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AdsItemBlockAdStatPixelDto(createFromParcel, readString, valueOf2, valueOf3, valueOf, valueOf4, num, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsItemBlockAdStatPixelDto[] newArray(int i) {
            return new AdsItemBlockAdStatPixelDto[i];
        }
    }

    public AdsItemBlockAdStatPixelDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final Integer d() {
        return this.duration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.ovv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdStatPixelDto)) {
            return false;
        }
        AdsItemBlockAdStatPixelDto adsItemBlockAdStatPixelDto = (AdsItemBlockAdStatPixelDto) obj;
        return this.type == adsItemBlockAdStatPixelDto.type && epx.f(this.url, adsItemBlockAdStatPixelDto.url) && epx.f(this.value, adsItemBlockAdStatPixelDto.value) && epx.f(this.pvalue, adsItemBlockAdStatPixelDto.pvalue) && epx.f(this.ovv, adsItemBlockAdStatPixelDto.ovv) && epx.f(this.duration, adsItemBlockAdStatPixelDto.duration) && epx.f(this.viewablePercent, adsItemBlockAdStatPixelDto.viewablePercent) && epx.f(this.target, adsItemBlockAdStatPixelDto.target);
    }

    public final Integer f() {
        return this.pvalue;
    }

    public final String g() {
        return this.target;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.value;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pvalue;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.ovv;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.duration;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.viewablePercent;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.target;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final TypeDto i() {
        return this.type;
    }

    public final Integer j() {
        return this.value;
    }

    public final Integer k() {
        return this.viewablePercent;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsItemBlockAdStatPixelDto(type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", pvalue=");
        sb.append(this.pvalue);
        sb.append(", ovv=");
        sb.append(this.ovv);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", viewablePercent=");
        sb.append(this.viewablePercent);
        sb.append(", target=");
        return ho8.a(sb, this.target, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.pvalue;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool = this.ovv;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num3 = this.duration;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.viewablePercent;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        parcel.writeString(this.target);
    }

    public AdsItemBlockAdStatPixelDto(TypeDto typeDto, String str, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, String str2) {
        this.type = typeDto;
        this.url = str;
        this.value = num;
        this.pvalue = num2;
        this.ovv = bool;
        this.duration = num3;
        this.viewablePercent = num4;
        this.target = str2;
    }

    public /* synthetic */ AdsItemBlockAdStatPixelDto(TypeDto typeDto, String str, Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str2);
    }
}
