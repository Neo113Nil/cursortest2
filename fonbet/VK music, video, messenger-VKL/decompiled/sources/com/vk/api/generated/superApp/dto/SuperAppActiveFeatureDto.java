package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppActiveFeatureDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppActiveFeatureDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppActiveFeatureDto[] $VALUES;

    @pmi0("assistant_without_suggests")
    public static final SuperAppActiveFeatureDto ASSISTANT_WITHOUT_SUGGESTS;

    @pmi0("assistant_with_suggests")
    public static final SuperAppActiveFeatureDto ASSISTANT_WITH_SUGGESTS;

    @pmi0("audios")
    public static final SuperAppActiveFeatureDto AUDIOS;

    @pmi0("clips")
    public static final SuperAppActiveFeatureDto CLIPS;

    @pmi0("clips_viewer")
    public static final SuperAppActiveFeatureDto CLIPS_VIEWER;
    public static final Parcelable.Creator<SuperAppActiveFeatureDto> CREATOR;

    @pmi0("friends")
    public static final SuperAppActiveFeatureDto FRIENDS;

    @pmi0("groups")
    public static final SuperAppActiveFeatureDto GROUPS;

    @pmi0("mini_widgets")
    public static final SuperAppActiveFeatureDto MINI_WIDGETS;

    @pmi0("sa_assistant_mini_widget")
    public static final SuperAppActiveFeatureDto SA_ASSISTANT_MINI_WIDGET;

    @pmi0("sa_half_tiles")
    public static final SuperAppActiveFeatureDto SA_HALF_TILES;

    @pmi0("sa_market_tile")
    public static final SuperAppActiveFeatureDto SA_MARKET_TILE;

    @pmi0("sa_menu_big_icons")
    public static final SuperAppActiveFeatureDto SA_MENU_BIG_ICONS;

    @pmi0("sa_redesign_menu")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_MENU;

    @pmi0("sa_redesign_v2")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V2;

    @pmi0("sa_redesign_v3")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V3;

    @pmi0("sa_redesign_v3_p2")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V3_P2;

    @pmi0("sa_redesign_v3_profile")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V3_PROFILE;

    @pmi0("sa_redesign_v3_second_tab")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V3_SECOND_TAB;

    @pmi0("sa_redesign_v4")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V4;

    @pmi0("sa_redesign_v5")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V5;

    @pmi0("sa_redesign_v6")
    public static final SuperAppActiveFeatureDto SA_REDESIGN_V6;

    @pmi0("sa_tabbar_redesign")
    public static final SuperAppActiveFeatureDto SA_TABBAR_REDESIGN;

    @pmi0("sa_video_banner_section")
    public static final SuperAppActiveFeatureDto SA_VIDEO_BANNER_SECTION;

    @pmi0("sa_widget_compact")
    public static final SuperAppActiveFeatureDto SA_WIDGET_COMPACT;

    @pmi0("sa_widget_settings")
    public static final SuperAppActiveFeatureDto SA_WIDGET_SETTINGS;

    @pmi0("sa_widget_settings_v2")
    public static final SuperAppActiveFeatureDto SA_WIDGET_SETTINGS_V2;

    @pmi0("sa_widget_settings_v2_p2")
    public static final SuperAppActiveFeatureDto SA_WIDGET_SETTINGS_V2_P2;

    @pmi0("sa_widget_settings_v3")
    public static final SuperAppActiveFeatureDto SA_WIDGET_SETTINGS_V3;

    @pmi0("videos")
    public static final SuperAppActiveFeatureDto VIDEOS;
    private final String value;

    /* compiled from: SuperAppActiveFeatureDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppActiveFeatureDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppActiveFeatureDto createFromParcel(Parcel parcel) {
            return SuperAppActiveFeatureDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppActiveFeatureDto[] newArray(int i) {
            return new SuperAppActiveFeatureDto[i];
        }
    }

    static {
        SuperAppActiveFeatureDto superAppActiveFeatureDto = new SuperAppActiveFeatureDto("CLIPS_VIEWER", 0, "clips_viewer");
        CLIPS_VIEWER = superAppActiveFeatureDto;
        SuperAppActiveFeatureDto superAppActiveFeatureDto2 = new SuperAppActiveFeatureDto("ASSISTANT_WITH_SUGGESTS", 1, "assistant_with_suggests");
        ASSISTANT_WITH_SUGGESTS = superAppActiveFeatureDto2;
        SuperAppActiveFeatureDto superAppActiveFeatureDto3 = new SuperAppActiveFeatureDto("ASSISTANT_WITHOUT_SUGGESTS", 2, "assistant_without_suggests");
        ASSISTANT_WITHOUT_SUGGESTS = superAppActiveFeatureDto3;
        SuperAppActiveFeatureDto superAppActiveFeatureDto4 = new SuperAppActiveFeatureDto("SA_REDESIGN_V2", 3, "sa_redesign_v2");
        SA_REDESIGN_V2 = superAppActiveFeatureDto4;
        SuperAppActiveFeatureDto superAppActiveFeatureDto5 = new SuperAppActiveFeatureDto(Privacy.FRIENDS, 4, "friends");
        FRIENDS = superAppActiveFeatureDto5;
        SuperAppActiveFeatureDto superAppActiveFeatureDto6 = new SuperAppActiveFeatureDto("GROUPS", 5, "groups");
        GROUPS = superAppActiveFeatureDto6;
        SuperAppActiveFeatureDto superAppActiveFeatureDto7 = new SuperAppActiveFeatureDto("AUDIOS", 6, "audios");
        AUDIOS = superAppActiveFeatureDto7;
        SuperAppActiveFeatureDto superAppActiveFeatureDto8 = new SuperAppActiveFeatureDto("CLIPS", 7, "clips");
        CLIPS = superAppActiveFeatureDto8;
        SuperAppActiveFeatureDto superAppActiveFeatureDto9 = new SuperAppActiveFeatureDto("VIDEOS", 8, "videos");
        VIDEOS = superAppActiveFeatureDto9;
        SuperAppActiveFeatureDto superAppActiveFeatureDto10 = new SuperAppActiveFeatureDto("MINI_WIDGETS", 9, "mini_widgets");
        MINI_WIDGETS = superAppActiveFeatureDto10;
        SuperAppActiveFeatureDto superAppActiveFeatureDto11 = new SuperAppActiveFeatureDto("SA_REDESIGN_V3", 10, "sa_redesign_v3");
        SA_REDESIGN_V3 = superAppActiveFeatureDto11;
        SuperAppActiveFeatureDto superAppActiveFeatureDto12 = new SuperAppActiveFeatureDto("SA_REDESIGN_V3_P2", 11, "sa_redesign_v3_p2");
        SA_REDESIGN_V3_P2 = superAppActiveFeatureDto12;
        SuperAppActiveFeatureDto superAppActiveFeatureDto13 = new SuperAppActiveFeatureDto("SA_MENU_BIG_ICONS", 12, "sa_menu_big_icons");
        SA_MENU_BIG_ICONS = superAppActiveFeatureDto13;
        SuperAppActiveFeatureDto superAppActiveFeatureDto14 = new SuperAppActiveFeatureDto("SA_WIDGET_COMPACT", 13, "sa_widget_compact");
        SA_WIDGET_COMPACT = superAppActiveFeatureDto14;
        SuperAppActiveFeatureDto superAppActiveFeatureDto15 = new SuperAppActiveFeatureDto("SA_REDESIGN_V3_PROFILE", 14, "sa_redesign_v3_profile");
        SA_REDESIGN_V3_PROFILE = superAppActiveFeatureDto15;
        SuperAppActiveFeatureDto superAppActiveFeatureDto16 = new SuperAppActiveFeatureDto("SA_REDESIGN_V3_SECOND_TAB", 15, "sa_redesign_v3_second_tab");
        SA_REDESIGN_V3_SECOND_TAB = superAppActiveFeatureDto16;
        SuperAppActiveFeatureDto superAppActiveFeatureDto17 = new SuperAppActiveFeatureDto("SA_ASSISTANT_MINI_WIDGET", 16, "sa_assistant_mini_widget");
        SA_ASSISTANT_MINI_WIDGET = superAppActiveFeatureDto17;
        SuperAppActiveFeatureDto superAppActiveFeatureDto18 = new SuperAppActiveFeatureDto("SA_WIDGET_SETTINGS", 17, "sa_widget_settings");
        SA_WIDGET_SETTINGS = superAppActiveFeatureDto18;
        SuperAppActiveFeatureDto superAppActiveFeatureDto19 = new SuperAppActiveFeatureDto("SA_WIDGET_SETTINGS_V2", 18, "sa_widget_settings_v2");
        SA_WIDGET_SETTINGS_V2 = superAppActiveFeatureDto19;
        SuperAppActiveFeatureDto superAppActiveFeatureDto20 = new SuperAppActiveFeatureDto("SA_WIDGET_SETTINGS_V2_P2", 19, "sa_widget_settings_v2_p2");
        SA_WIDGET_SETTINGS_V2_P2 = superAppActiveFeatureDto20;
        SuperAppActiveFeatureDto superAppActiveFeatureDto21 = new SuperAppActiveFeatureDto("SA_WIDGET_SETTINGS_V3", 20, "sa_widget_settings_v3");
        SA_WIDGET_SETTINGS_V3 = superAppActiveFeatureDto21;
        SuperAppActiveFeatureDto superAppActiveFeatureDto22 = new SuperAppActiveFeatureDto("SA_REDESIGN_V4", 21, "sa_redesign_v4");
        SA_REDESIGN_V4 = superAppActiveFeatureDto22;
        SuperAppActiveFeatureDto superAppActiveFeatureDto23 = new SuperAppActiveFeatureDto("SA_REDESIGN_V5", 22, "sa_redesign_v5");
        SA_REDESIGN_V5 = superAppActiveFeatureDto23;
        SuperAppActiveFeatureDto superAppActiveFeatureDto24 = new SuperAppActiveFeatureDto("SA_REDESIGN_MENU", 23, "sa_redesign_menu");
        SA_REDESIGN_MENU = superAppActiveFeatureDto24;
        SuperAppActiveFeatureDto superAppActiveFeatureDto25 = new SuperAppActiveFeatureDto("SA_VIDEO_BANNER_SECTION", 24, "sa_video_banner_section");
        SA_VIDEO_BANNER_SECTION = superAppActiveFeatureDto25;
        SuperAppActiveFeatureDto superAppActiveFeatureDto26 = new SuperAppActiveFeatureDto("SA_TABBAR_REDESIGN", 25, "sa_tabbar_redesign");
        SA_TABBAR_REDESIGN = superAppActiveFeatureDto26;
        SuperAppActiveFeatureDto superAppActiveFeatureDto27 = new SuperAppActiveFeatureDto("SA_REDESIGN_V6", 26, "sa_redesign_v6");
        SA_REDESIGN_V6 = superAppActiveFeatureDto27;
        SuperAppActiveFeatureDto superAppActiveFeatureDto28 = new SuperAppActiveFeatureDto("SA_HALF_TILES", 27, "sa_half_tiles");
        SA_HALF_TILES = superAppActiveFeatureDto28;
        SuperAppActiveFeatureDto superAppActiveFeatureDto29 = new SuperAppActiveFeatureDto("SA_MARKET_TILE", 28, "sa_market_tile");
        SA_MARKET_TILE = superAppActiveFeatureDto29;
        SuperAppActiveFeatureDto[] superAppActiveFeatureDtoArr = {superAppActiveFeatureDto, superAppActiveFeatureDto2, superAppActiveFeatureDto3, superAppActiveFeatureDto4, superAppActiveFeatureDto5, superAppActiveFeatureDto6, superAppActiveFeatureDto7, superAppActiveFeatureDto8, superAppActiveFeatureDto9, superAppActiveFeatureDto10, superAppActiveFeatureDto11, superAppActiveFeatureDto12, superAppActiveFeatureDto13, superAppActiveFeatureDto14, superAppActiveFeatureDto15, superAppActiveFeatureDto16, superAppActiveFeatureDto17, superAppActiveFeatureDto18, superAppActiveFeatureDto19, superAppActiveFeatureDto20, superAppActiveFeatureDto21, superAppActiveFeatureDto22, superAppActiveFeatureDto23, superAppActiveFeatureDto24, superAppActiveFeatureDto25, superAppActiveFeatureDto26, superAppActiveFeatureDto27, superAppActiveFeatureDto28, superAppActiveFeatureDto29};
        $VALUES = superAppActiveFeatureDtoArr;
        $ENTRIES = new asp(superAppActiveFeatureDtoArr);
        CREATOR = new a();
    }

    private SuperAppActiveFeatureDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppActiveFeatureDto valueOf(String str) {
        return (SuperAppActiveFeatureDto) Enum.valueOf(SuperAppActiveFeatureDto.class, str);
    }

    public static SuperAppActiveFeatureDto[] values() {
        return (SuperAppActiveFeatureDto[]) $VALUES.clone();
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
