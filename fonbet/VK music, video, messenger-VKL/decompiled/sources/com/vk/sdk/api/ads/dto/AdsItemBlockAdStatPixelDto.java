package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AdsItemBlockAdStatPixelDto.kt */
/* loaded from: classes5.dex */
public final class AdsItemBlockAdStatPixelDto {

    @pmi0("type")
    private final TypeDto type;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AdsItemBlockAdStatPixelDto.kt */
    public static final class TypeDto {
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

        @pmi0("click_post_owner")
        public static final TypeDto CLICK_POST_OWNER;

        @pmi0("click_pretty_card")
        public static final TypeDto CLICK_PRETTY_CARD;

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

        @pmi0("share_post")
        public static final TypeDto SHARE_POST;

        @pmi0("show_off")
        public static final TypeDto SHOW_OFF;

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
        private final String value;

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
            TypeDto typeDto9 = new TypeDto("SHARE_POST", 8, "share_post");
            SHARE_POST = typeDto9;
            TypeDto typeDto10 = new TypeDto("VIDEO_START", 9, "video_start");
            VIDEO_START = typeDto10;
            TypeDto typeDto11 = new TypeDto("VIDEO_PAUSE", 10, "video_pause");
            VIDEO_PAUSE = typeDto11;
            TypeDto typeDto12 = new TypeDto("VIDEO_RESUME", 11, "video_resume");
            VIDEO_RESUME = typeDto12;
            TypeDto typeDto13 = new TypeDto("VIDEO_PLAY", 12, "video_play");
            VIDEO_PLAY = typeDto13;
            TypeDto typeDto14 = new TypeDto("VIDEO_PLAY_3S", 13, "video_play_3s");
            VIDEO_PLAY_3S = typeDto14;
            TypeDto typeDto15 = new TypeDto("VIDEO_PLAY_10S", 14, "video_play_10s");
            VIDEO_PLAY_10S = typeDto15;
            TypeDto typeDto16 = new TypeDto("VIDEO_PLAY_25", 15, "video_play_25");
            VIDEO_PLAY_25 = typeDto16;
            TypeDto typeDto17 = new TypeDto("VIDEO_PLAY_50", 16, "video_play_50");
            VIDEO_PLAY_50 = typeDto17;
            TypeDto typeDto18 = new TypeDto("VIDEO_PLAY_75", 17, "video_play_75");
            VIDEO_PLAY_75 = typeDto18;
            TypeDto typeDto19 = new TypeDto("VIDEO_PLAY_95", 18, "video_play_95");
            VIDEO_PLAY_95 = typeDto19;
            TypeDto typeDto20 = new TypeDto("VIDEO_PLAY_100", 19, "video_play_100");
            VIDEO_PLAY_100 = typeDto20;
            TypeDto typeDto21 = new TypeDto("VIDEO_VOLUME_ON", 20, "video_volume_on");
            VIDEO_VOLUME_ON = typeDto21;
            TypeDto typeDto22 = new TypeDto("VIDEO_VOLUME_OFF", 21, "video_volume_off");
            VIDEO_VOLUME_OFF = typeDto22;
            TypeDto typeDto23 = new TypeDto("VIDEO_FULLSCREEN_ON", 22, "video_fullscreen_on");
            VIDEO_FULLSCREEN_ON = typeDto23;
            TypeDto typeDto24 = new TypeDto("VIDEO_FULLSCREEN_OFF", 23, "video_fullscreen_off");
            VIDEO_FULLSCREEN_OFF = typeDto24;
            TypeDto typeDto25 = new TypeDto("IMPRESSION_PRETTY_CARD", 24, "impression_pretty_card");
            IMPRESSION_PRETTY_CARD = typeDto25;
            TypeDto typeDto26 = new TypeDto("AUDIO_CLICK", 25, "audio_click");
            AUDIO_CLICK = typeDto26;
            TypeDto typeDto27 = new TypeDto("CLICK_PRETTY_CARD", 26, "click_pretty_card");
            CLICK_PRETTY_CARD = typeDto27;
            TypeDto typeDto28 = new TypeDto("SHOW_OFF", 27, "show_off");
            SHOW_OFF = typeDto28;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4, typeDto5, typeDto6, typeDto7, typeDto8, typeDto9, typeDto10, typeDto11, typeDto12, typeDto13, typeDto14, typeDto15, typeDto16, typeDto17, typeDto18, typeDto19, typeDto20, typeDto21, typeDto22, typeDto23, typeDto24, typeDto25, typeDto26, typeDto27, typeDto28};
            $VALUES = typeDtoArr;
            $ENTRIES = new asp(typeDtoArr);
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdsItemBlockAdStatPixelDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsItemBlockAdStatPixelDto)) {
            return false;
        }
        AdsItemBlockAdStatPixelDto adsItemBlockAdStatPixelDto = (AdsItemBlockAdStatPixelDto) obj;
        return this.type == adsItemBlockAdStatPixelDto.type && epx.f(this.url, adsItemBlockAdStatPixelDto.url);
    }

    public final int hashCode() {
        TypeDto typeDto = this.type;
        int hashCode = (typeDto == null ? 0 : typeDto.hashCode()) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdsItemBlockAdStatPixelDto(type=" + this.type + ", url=" + this.url + ")";
    }

    public AdsItemBlockAdStatPixelDto(TypeDto typeDto, String str) {
        this.type = typeDto;
        this.url = str;
    }

    public /* synthetic */ AdsItemBlockAdStatPixelDto(TypeDto typeDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : typeDto, (i & 2) != 0 ? null : str);
    }
}
