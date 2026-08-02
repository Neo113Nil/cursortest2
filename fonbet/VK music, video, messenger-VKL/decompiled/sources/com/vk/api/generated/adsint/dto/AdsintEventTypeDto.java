package com.vk.api.generated.adsint.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsintEventTypeDto.kt */
/* loaded from: classes14.dex */
public final class AdsintEventTypeDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsintEventTypeDto[] $VALUES;

    @pmi0("click_button")
    public static final AdsintEventTypeDto CLICK_BUTTON;

    @pmi0("click_footer")
    public static final AdsintEventTypeDto CLICK_FOOTER;

    @pmi0("click_header")
    public static final AdsintEventTypeDto CLICK_HEADER;

    @pmi0("click_image")
    public static final AdsintEventTypeDto CLICK_IMAGE;

    @pmi0("click_install_app")
    public static final AdsintEventTypeDto CLICK_INSTALL_APP;

    @pmi0("click_open_app")
    public static final AdsintEventTypeDto CLICK_OPEN_APP;

    @pmi0("click_open_link_url")
    public static final AdsintEventTypeDto CLICK_OPEN_LINK_URL;

    @pmi0("click_pretty_card")
    public static final AdsintEventTypeDto CLICK_PRETTY_CARD;

    @pmi0("click_text")
    public static final AdsintEventTypeDto CLICK_TEXT;
    public static final Parcelable.Creator<AdsintEventTypeDto> CREATOR;

    @pmi0("expand")
    public static final AdsintEventTypeDto EXPAND;

    @pmi0("html5_app_launched")
    public static final AdsintEventTypeDto HTML5_APP_LAUNCHED;

    @pmi0("html5_browser_active")
    public static final AdsintEventTypeDto HTML5_BROWSER_ACTIVE;

    @pmi0("html5_browser_paused")
    public static final AdsintEventTypeDto HTML5_BROWSER_PAUSED;

    @pmi0("html5_browser_resumed")
    public static final AdsintEventTypeDto HTML5_BROWSER_RESUMED;

    @pmi0("html5_inapp_action")
    public static final AdsintEventTypeDto HTML5_INAPP_ACTION;

    @pmi0("html5_inapp_track_event")
    public static final AdsintEventTypeDto HTML5_INAPP_TRACK_EVENT;

    @pmi0("html5_onerror")
    public static final AdsintEventTypeDto HTML5_ONERROR;

    @pmi0("html5_onload")
    public static final AdsintEventTypeDto HTML5_ONLOAD;

    @pmi0("impression")
    public static final AdsintEventTypeDto IMPRESSION;

    @pmi0("impression_pretty_card")
    public static final AdsintEventTypeDto IMPRESSION_PRETTY_CARD;

    @pmi0("install")
    public static final AdsintEventTypeDto INSTALL;

    @pmi0("like")
    public static final AdsintEventTypeDto LIKE;

    @pmi0("motion_kit")
    public static final AdsintEventTypeDto MOTION_KIT;

    @pmi0("mrc_click")
    public static final AdsintEventTypeDto MRC_CLICK;

    @pmi0("mrc_click_header")
    public static final AdsintEventTypeDto MRC_CLICK_HEADER;

    @pmi0("mrc_click_install_app")
    public static final AdsintEventTypeDto MRC_CLICK_INSTALL_APP;

    @pmi0("mrc_click_open_app")
    public static final AdsintEventTypeDto MRC_CLICK_OPEN_APP;

    @pmi0("mrc_click_open_link_url")
    public static final AdsintEventTypeDto MRC_CLICK_OPEN_LINK_URL;

    @pmi0("mrc_click_post_link")
    public static final AdsintEventTypeDto MRC_CLICK_POST_LINK;

    @pmi0("mrc_click_pretty_card")
    public static final AdsintEventTypeDto MRC_CLICK_PRETTY_CARD;

    @pmi0("mrc_impression")
    public static final AdsintEventTypeDto MRC_IMPRESSION;

    @pmi0("mrc_impression_pretty_card")
    public static final AdsintEventTypeDto MRC_IMPRESSION_PRETTY_CARD;

    @pmi0("mrc_view_post_time")
    public static final AdsintEventTypeDto MRC_VIEW_POST_TIME;

    @pmi0("music_pause")
    public static final AdsintEventTypeDto MUSIC_PAUSE;

    @pmi0("music_play")
    public static final AdsintEventTypeDto MUSIC_PLAY;

    @pmi0("music_playlist_share")
    public static final AdsintEventTypeDto MUSIC_PLAYLIST_SHARE;

    @pmi0("music_playlist_share_to_story")
    public static final AdsintEventTypeDto MUSIC_PLAYLIST_SHARE_TO_STORY;

    @pmi0("music_playlist_to_profile")
    public static final AdsintEventTypeDto MUSIC_PLAYLIST_TO_PROFILE;

    @pmi0("music_play_30s")
    public static final AdsintEventTypeDto MUSIC_PLAY_30S;

    @pmi0("music_track_share")
    public static final AdsintEventTypeDto MUSIC_TRACK_SHARE;

    @pmi0("music_track_share_to_story")
    public static final AdsintEventTypeDto MUSIC_TRACK_SHARE_TO_STORY;

    @pmi0("music_track_to_profile")
    public static final AdsintEventTypeDto MUSIC_TRACK_TO_PROFILE;

    @pmi0("pixel_request_error")
    public static final AdsintEventTypeDto PIXEL_REQUEST_ERROR;

    @pmi0("share")
    public static final AdsintEventTypeDto SHARE;

    @pmi0("unlike")
    public static final AdsintEventTypeDto UNLIKE;

    @pmi0("url_parse_failed")
    public static final AdsintEventTypeDto URL_PARSE_FAILED;
    private final String value;

    /* compiled from: AdsintEventTypeDto.kt */
    public static final class a implements Parcelable.Creator<AdsintEventTypeDto> {
        @Override // android.os.Parcelable.Creator
        public final AdsintEventTypeDto createFromParcel(Parcel parcel) {
            return AdsintEventTypeDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdsintEventTypeDto[] newArray(int i) {
            return new AdsintEventTypeDto[i];
        }
    }

    static {
        AdsintEventTypeDto adsintEventTypeDto = new AdsintEventTypeDto("IMPRESSION", 0, "impression");
        IMPRESSION = adsintEventTypeDto;
        AdsintEventTypeDto adsintEventTypeDto2 = new AdsintEventTypeDto("CLICK_HEADER", 1, "click_header");
        CLICK_HEADER = adsintEventTypeDto2;
        AdsintEventTypeDto adsintEventTypeDto3 = new AdsintEventTypeDto("CLICK_TEXT", 2, "click_text");
        CLICK_TEXT = adsintEventTypeDto3;
        AdsintEventTypeDto adsintEventTypeDto4 = new AdsintEventTypeDto("CLICK_IMAGE", 3, "click_image");
        CLICK_IMAGE = adsintEventTypeDto4;
        AdsintEventTypeDto adsintEventTypeDto5 = new AdsintEventTypeDto("CLICK_FOOTER", 4, "click_footer");
        CLICK_FOOTER = adsintEventTypeDto5;
        AdsintEventTypeDto adsintEventTypeDto6 = new AdsintEventTypeDto("CLICK_BUTTON", 5, "click_button");
        CLICK_BUTTON = adsintEventTypeDto6;
        AdsintEventTypeDto adsintEventTypeDto7 = new AdsintEventTypeDto("CLICK_OPEN_APP", 6, "click_open_app");
        CLICK_OPEN_APP = adsintEventTypeDto7;
        AdsintEventTypeDto adsintEventTypeDto8 = new AdsintEventTypeDto("CLICK_INSTALL_APP", 7, "click_install_app");
        CLICK_INSTALL_APP = adsintEventTypeDto8;
        AdsintEventTypeDto adsintEventTypeDto9 = new AdsintEventTypeDto("CLICK_OPEN_LINK_URL", 8, "click_open_link_url");
        CLICK_OPEN_LINK_URL = adsintEventTypeDto9;
        AdsintEventTypeDto adsintEventTypeDto10 = new AdsintEventTypeDto("INSTALL", 9, "install");
        INSTALL = adsintEventTypeDto10;
        AdsintEventTypeDto adsintEventTypeDto11 = new AdsintEventTypeDto("IMPRESSION_PRETTY_CARD", 10, "impression_pretty_card");
        IMPRESSION_PRETTY_CARD = adsintEventTypeDto11;
        AdsintEventTypeDto adsintEventTypeDto12 = new AdsintEventTypeDto("CLICK_PRETTY_CARD", 11, "click_pretty_card");
        CLICK_PRETTY_CARD = adsintEventTypeDto12;
        AdsintEventTypeDto adsintEventTypeDto13 = new AdsintEventTypeDto("HTML5_BROWSER_ACTIVE", 12, "html5_browser_active");
        HTML5_BROWSER_ACTIVE = adsintEventTypeDto13;
        AdsintEventTypeDto adsintEventTypeDto14 = new AdsintEventTypeDto("HTML5_BROWSER_PAUSED", 13, "html5_browser_paused");
        HTML5_BROWSER_PAUSED = adsintEventTypeDto14;
        AdsintEventTypeDto adsintEventTypeDto15 = new AdsintEventTypeDto("HTML5_BROWSER_RESUMED", 14, "html5_browser_resumed");
        HTML5_BROWSER_RESUMED = adsintEventTypeDto15;
        AdsintEventTypeDto adsintEventTypeDto16 = new AdsintEventTypeDto("HTML5_ONLOAD", 15, "html5_onload");
        HTML5_ONLOAD = adsintEventTypeDto16;
        AdsintEventTypeDto adsintEventTypeDto17 = new AdsintEventTypeDto("HTML5_ONERROR", 16, "html5_onerror");
        HTML5_ONERROR = adsintEventTypeDto17;
        AdsintEventTypeDto adsintEventTypeDto18 = new AdsintEventTypeDto("HTML5_APP_LAUNCHED", 17, "html5_app_launched");
        HTML5_APP_LAUNCHED = adsintEventTypeDto18;
        AdsintEventTypeDto adsintEventTypeDto19 = new AdsintEventTypeDto("HTML5_INAPP_ACTION", 18, "html5_inapp_action");
        HTML5_INAPP_ACTION = adsintEventTypeDto19;
        AdsintEventTypeDto adsintEventTypeDto20 = new AdsintEventTypeDto("HTML5_INAPP_TRACK_EVENT", 19, "html5_inapp_track_event");
        HTML5_INAPP_TRACK_EVENT = adsintEventTypeDto20;
        AdsintEventTypeDto adsintEventTypeDto21 = new AdsintEventTypeDto("EXPAND", 20, "expand");
        EXPAND = adsintEventTypeDto21;
        AdsintEventTypeDto adsintEventTypeDto22 = new AdsintEventTypeDto("MRC_IMPRESSION", 21, "mrc_impression");
        MRC_IMPRESSION = adsintEventTypeDto22;
        AdsintEventTypeDto adsintEventTypeDto23 = new AdsintEventTypeDto("MRC_IMPRESSION_PRETTY_CARD", 22, "mrc_impression_pretty_card");
        MRC_IMPRESSION_PRETTY_CARD = adsintEventTypeDto23;
        AdsintEventTypeDto adsintEventTypeDto24 = new AdsintEventTypeDto("MRC_CLICK", 23, "mrc_click");
        MRC_CLICK = adsintEventTypeDto24;
        AdsintEventTypeDto adsintEventTypeDto25 = new AdsintEventTypeDto("MRC_CLICK_HEADER", 24, "mrc_click_header");
        MRC_CLICK_HEADER = adsintEventTypeDto25;
        AdsintEventTypeDto adsintEventTypeDto26 = new AdsintEventTypeDto("MRC_CLICK_OPEN_LINK_URL", 25, "mrc_click_open_link_url");
        MRC_CLICK_OPEN_LINK_URL = adsintEventTypeDto26;
        AdsintEventTypeDto adsintEventTypeDto27 = new AdsintEventTypeDto("MRC_CLICK_INSTALL_APP", 26, "mrc_click_install_app");
        MRC_CLICK_INSTALL_APP = adsintEventTypeDto27;
        AdsintEventTypeDto adsintEventTypeDto28 = new AdsintEventTypeDto("MRC_CLICK_OPEN_APP", 27, "mrc_click_open_app");
        MRC_CLICK_OPEN_APP = adsintEventTypeDto28;
        AdsintEventTypeDto adsintEventTypeDto29 = new AdsintEventTypeDto("MRC_CLICK_POST_LINK", 28, "mrc_click_post_link");
        MRC_CLICK_POST_LINK = adsintEventTypeDto29;
        AdsintEventTypeDto adsintEventTypeDto30 = new AdsintEventTypeDto("MRC_CLICK_PRETTY_CARD", 29, "mrc_click_pretty_card");
        MRC_CLICK_PRETTY_CARD = adsintEventTypeDto30;
        AdsintEventTypeDto adsintEventTypeDto31 = new AdsintEventTypeDto("MRC_VIEW_POST_TIME", 30, "mrc_view_post_time");
        MRC_VIEW_POST_TIME = adsintEventTypeDto31;
        AdsintEventTypeDto adsintEventTypeDto32 = new AdsintEventTypeDto("MUSIC_PAUSE", 31, "music_pause");
        MUSIC_PAUSE = adsintEventTypeDto32;
        AdsintEventTypeDto adsintEventTypeDto33 = new AdsintEventTypeDto("MUSIC_PLAY", 32, "music_play");
        MUSIC_PLAY = adsintEventTypeDto33;
        AdsintEventTypeDto adsintEventTypeDto34 = new AdsintEventTypeDto("MUSIC_TRACK_TO_PROFILE", 33, "music_track_to_profile");
        MUSIC_TRACK_TO_PROFILE = adsintEventTypeDto34;
        AdsintEventTypeDto adsintEventTypeDto35 = new AdsintEventTypeDto("MUSIC_PLAYLIST_TO_PROFILE", 34, "music_playlist_to_profile");
        MUSIC_PLAYLIST_TO_PROFILE = adsintEventTypeDto35;
        AdsintEventTypeDto adsintEventTypeDto36 = new AdsintEventTypeDto("MUSIC_TRACK_SHARE", 35, "music_track_share");
        MUSIC_TRACK_SHARE = adsintEventTypeDto36;
        AdsintEventTypeDto adsintEventTypeDto37 = new AdsintEventTypeDto("MUSIC_PLAYLIST_SHARE", 36, "music_playlist_share");
        MUSIC_PLAYLIST_SHARE = adsintEventTypeDto37;
        AdsintEventTypeDto adsintEventTypeDto38 = new AdsintEventTypeDto("MUSIC_TRACK_SHARE_TO_STORY", 37, "music_track_share_to_story");
        MUSIC_TRACK_SHARE_TO_STORY = adsintEventTypeDto38;
        AdsintEventTypeDto adsintEventTypeDto39 = new AdsintEventTypeDto("MUSIC_PLAYLIST_SHARE_TO_STORY", 38, "music_playlist_share_to_story");
        MUSIC_PLAYLIST_SHARE_TO_STORY = adsintEventTypeDto39;
        AdsintEventTypeDto adsintEventTypeDto40 = new AdsintEventTypeDto("MUSIC_PLAY_30S", 39, "music_play_30s");
        MUSIC_PLAY_30S = adsintEventTypeDto40;
        AdsintEventTypeDto adsintEventTypeDto41 = new AdsintEventTypeDto("LIKE", 40, "like");
        LIKE = adsintEventTypeDto41;
        AdsintEventTypeDto adsintEventTypeDto42 = new AdsintEventTypeDto("UNLIKE", 41, "unlike");
        UNLIKE = adsintEventTypeDto42;
        AdsintEventTypeDto adsintEventTypeDto43 = new AdsintEventTypeDto("SHARE", 42, "share");
        SHARE = adsintEventTypeDto43;
        AdsintEventTypeDto adsintEventTypeDto44 = new AdsintEventTypeDto("URL_PARSE_FAILED", 43, "url_parse_failed");
        URL_PARSE_FAILED = adsintEventTypeDto44;
        AdsintEventTypeDto adsintEventTypeDto45 = new AdsintEventTypeDto("PIXEL_REQUEST_ERROR", 44, "pixel_request_error");
        PIXEL_REQUEST_ERROR = adsintEventTypeDto45;
        AdsintEventTypeDto adsintEventTypeDto46 = new AdsintEventTypeDto("MOTION_KIT", 45, "motion_kit");
        MOTION_KIT = adsintEventTypeDto46;
        AdsintEventTypeDto[] adsintEventTypeDtoArr = {adsintEventTypeDto, adsintEventTypeDto2, adsintEventTypeDto3, adsintEventTypeDto4, adsintEventTypeDto5, adsintEventTypeDto6, adsintEventTypeDto7, adsintEventTypeDto8, adsintEventTypeDto9, adsintEventTypeDto10, adsintEventTypeDto11, adsintEventTypeDto12, adsintEventTypeDto13, adsintEventTypeDto14, adsintEventTypeDto15, adsintEventTypeDto16, adsintEventTypeDto17, adsintEventTypeDto18, adsintEventTypeDto19, adsintEventTypeDto20, adsintEventTypeDto21, adsintEventTypeDto22, adsintEventTypeDto23, adsintEventTypeDto24, adsintEventTypeDto25, adsintEventTypeDto26, adsintEventTypeDto27, adsintEventTypeDto28, adsintEventTypeDto29, adsintEventTypeDto30, adsintEventTypeDto31, adsintEventTypeDto32, adsintEventTypeDto33, adsintEventTypeDto34, adsintEventTypeDto35, adsintEventTypeDto36, adsintEventTypeDto37, adsintEventTypeDto38, adsintEventTypeDto39, adsintEventTypeDto40, adsintEventTypeDto41, adsintEventTypeDto42, adsintEventTypeDto43, adsintEventTypeDto44, adsintEventTypeDto45, adsintEventTypeDto46};
        $VALUES = adsintEventTypeDtoArr;
        $ENTRIES = new asp(adsintEventTypeDtoArr);
        CREATOR = new a();
    }

    private AdsintEventTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsintEventTypeDto valueOf(String str) {
        return (AdsintEventTypeDto) Enum.valueOf(AdsintEventTypeDto.class, str);
    }

    public static AdsintEventTypeDto[] values() {
        return (AdsintEventTypeDto[]) $VALUES.clone();
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
