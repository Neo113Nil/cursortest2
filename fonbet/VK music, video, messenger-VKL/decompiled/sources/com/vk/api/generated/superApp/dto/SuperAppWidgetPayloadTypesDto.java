package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SuperAppWidgetPayloadTypesDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetPayloadTypesDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SuperAppWidgetPayloadTypesDto[] $VALUES;

    @pmi0("ads_easy_promote")
    public static final SuperAppWidgetPayloadTypesDto ADS_EASY_PROMOTE;

    @pmi0("afisha")
    public static final SuperAppWidgetPayloadTypesDto AFISHA;

    @pmi0("assistant")
    public static final SuperAppWidgetPayloadTypesDto ASSISTANT;

    @pmi0("assistant_v2")
    public static final SuperAppWidgetPayloadTypesDto ASSISTANT_V2;

    @pmi0("birthdays")
    public static final SuperAppWidgetPayloadTypesDto BIRTHDAYS;

    @pmi0("coupon")
    public static final SuperAppWidgetPayloadTypesDto COUPON;

    @pmi0("covid_dynamic")
    public static final SuperAppWidgetPayloadTypesDto COVID_DYNAMIC;
    public static final Parcelable.Creator<SuperAppWidgetPayloadTypesDto> CREATOR;

    @pmi0("delivery_club")
    public static final SuperAppWidgetPayloadTypesDto DELIVERY_CLUB;

    @pmi0("dock_block")
    public static final SuperAppWidgetPayloadTypesDto DOCK_BLOCK;

    @pmi0("exchange_rates")
    public static final SuperAppWidgetPayloadTypesDto EXCHANGE_RATES;

    @pmi0("friends")
    public static final SuperAppWidgetPayloadTypesDto FRIENDS;

    @pmi0("games")
    public static final SuperAppWidgetPayloadTypesDto GAMES;

    @pmi0("greeting")
    public static final SuperAppWidgetPayloadTypesDto GREETING;

    @pmi0("greeting_v2")
    public static final SuperAppWidgetPayloadTypesDto GREETING_V2;

    @pmi0("holiday")
    public static final SuperAppWidgetPayloadTypesDto HOLIDAY;

    @pmi0("horizontal_button_scroll")
    public static final SuperAppWidgetPayloadTypesDto HORIZONTAL_BUTTON_SCROLL;

    @pmi0("informer")
    public static final SuperAppWidgetPayloadTypesDto INFORMER;

    @pmi0("menu")
    public static final SuperAppWidgetPayloadTypesDto MENU;

    @pmi0("miniapps")
    public static final SuperAppWidgetPayloadTypesDto MINIAPPS;

    @pmi0("mini_widgets")
    public static final SuperAppWidgetPayloadTypesDto MINI_WIDGETS;

    @pmi0("music")
    public static final SuperAppWidgetPayloadTypesDto MUSIC;

    @pmi0("onboarding_panel")
    public static final SuperAppWidgetPayloadTypesDto ONBOARDING_PANEL;

    @pmi0(NotificationCompat.CATEGORY_PROMO)
    public static final SuperAppWidgetPayloadTypesDto PROMO;

    @pmi0("showcase_menu")
    public static final SuperAppWidgetPayloadTypesDto SHOWCASE_MENU;

    @pmi0("sport")
    public static final SuperAppWidgetPayloadTypesDto SPORT;

    @pmi0("universal_card")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_CARD;

    @pmi0("universal_counter")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_COUNTER;

    @pmi0("universal_grid")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_GRID;

    @pmi0("universal_informer")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_INFORMER;

    @pmi0("universal_internal")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_INTERNAL;

    @pmi0("universal_placeholder")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_PLACEHOLDER;

    @pmi0("universal_scroll")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_SCROLL;

    @pmi0("universal_table")
    public static final SuperAppWidgetPayloadTypesDto UNIVERSAL_TABLE;

    @pmi0("vkpay_slim")
    public static final SuperAppWidgetPayloadTypesDto VKPAY_SLIM;

    @pmi0("vk_run")
    public static final SuperAppWidgetPayloadTypesDto VK_RUN;

    @pmi0("vk_taxi")
    public static final SuperAppWidgetPayloadTypesDto VK_TAXI;

    @pmi0("weather")
    public static final SuperAppWidgetPayloadTypesDto WEATHER;

    @pmi0("widget_skeleton")
    public static final SuperAppWidgetPayloadTypesDto WIDGET_SKELETON;
    private final String value;

    /* compiled from: SuperAppWidgetPayloadTypesDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetPayloadTypesDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetPayloadTypesDto createFromParcel(Parcel parcel) {
            return SuperAppWidgetPayloadTypesDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetPayloadTypesDto[] newArray(int i) {
            return new SuperAppWidgetPayloadTypesDto[i];
        }
    }

    static {
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto = new SuperAppWidgetPayloadTypesDto("MENU", 0, "menu");
        MENU = superAppWidgetPayloadTypesDto;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto2 = new SuperAppWidgetPayloadTypesDto("SHOWCASE_MENU", 1, "showcase_menu");
        SHOWCASE_MENU = superAppWidgetPayloadTypesDto2;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto3 = new SuperAppWidgetPayloadTypesDto("PROMO", 2, NotificationCompat.CATEGORY_PROMO);
        PROMO = superAppWidgetPayloadTypesDto3;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto4 = new SuperAppWidgetPayloadTypesDto("DOCK_BLOCK", 3, "dock_block");
        DOCK_BLOCK = superAppWidgetPayloadTypesDto4;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto5 = new SuperAppWidgetPayloadTypesDto("GREETING_V2", 4, "greeting_v2");
        GREETING_V2 = superAppWidgetPayloadTypesDto5;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto6 = new SuperAppWidgetPayloadTypesDto("GREETING", 5, "greeting");
        GREETING = superAppWidgetPayloadTypesDto6;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto7 = new SuperAppWidgetPayloadTypesDto("HORIZONTAL_BUTTON_SCROLL", 6, "horizontal_button_scroll");
        HORIZONTAL_BUTTON_SCROLL = superAppWidgetPayloadTypesDto7;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto8 = new SuperAppWidgetPayloadTypesDto("ASSISTANT", 7, "assistant");
        ASSISTANT = superAppWidgetPayloadTypesDto8;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto9 = new SuperAppWidgetPayloadTypesDto("ASSISTANT_V2", 8, "assistant_v2");
        ASSISTANT_V2 = superAppWidgetPayloadTypesDto9;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto10 = new SuperAppWidgetPayloadTypesDto("WEATHER", 9, "weather");
        WEATHER = superAppWidgetPayloadTypesDto10;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto11 = new SuperAppWidgetPayloadTypesDto(Privacy.FRIENDS, 10, "friends");
        FRIENDS = superAppWidgetPayloadTypesDto11;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto12 = new SuperAppWidgetPayloadTypesDto("MUSIC", 11, "music");
        MUSIC = superAppWidgetPayloadTypesDto12;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto13 = new SuperAppWidgetPayloadTypesDto("SPORT", 12, "sport");
        SPORT = superAppWidgetPayloadTypesDto13;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto14 = new SuperAppWidgetPayloadTypesDto("VKPAY_SLIM", 13, "vkpay_slim");
        VKPAY_SLIM = superAppWidgetPayloadTypesDto14;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto15 = new SuperAppWidgetPayloadTypesDto("HOLIDAY", 14, "holiday");
        HOLIDAY = superAppWidgetPayloadTypesDto15;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto16 = new SuperAppWidgetPayloadTypesDto("INFORMER", 15, "informer");
        INFORMER = superAppWidgetPayloadTypesDto16;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto17 = new SuperAppWidgetPayloadTypesDto("AFISHA", 16, "afisha");
        AFISHA = superAppWidgetPayloadTypesDto17;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto18 = new SuperAppWidgetPayloadTypesDto("MINIAPPS", 17, "miniapps");
        MINIAPPS = superAppWidgetPayloadTypesDto18;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto19 = new SuperAppWidgetPayloadTypesDto("GAMES", 18, "games");
        GAMES = superAppWidgetPayloadTypesDto19;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto20 = new SuperAppWidgetPayloadTypesDto("EXCHANGE_RATES", 19, "exchange_rates");
        EXCHANGE_RATES = superAppWidgetPayloadTypesDto20;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto21 = new SuperAppWidgetPayloadTypesDto("BIRTHDAYS", 20, "birthdays");
        BIRTHDAYS = superAppWidgetPayloadTypesDto21;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto22 = new SuperAppWidgetPayloadTypesDto("COVID_DYNAMIC", 21, "covid_dynamic");
        COVID_DYNAMIC = superAppWidgetPayloadTypesDto22;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto23 = new SuperAppWidgetPayloadTypesDto("DELIVERY_CLUB", 22, "delivery_club");
        DELIVERY_CLUB = superAppWidgetPayloadTypesDto23;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto24 = new SuperAppWidgetPayloadTypesDto("VK_TAXI", 23, "vk_taxi");
        VK_TAXI = superAppWidgetPayloadTypesDto24;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto25 = new SuperAppWidgetPayloadTypesDto("ADS_EASY_PROMOTE", 24, "ads_easy_promote");
        ADS_EASY_PROMOTE = superAppWidgetPayloadTypesDto25;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto26 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_CARD", 25, "universal_card");
        UNIVERSAL_CARD = superAppWidgetPayloadTypesDto26;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto27 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_COUNTER", 26, "universal_counter");
        UNIVERSAL_COUNTER = superAppWidgetPayloadTypesDto27;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto28 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_GRID", 27, "universal_grid");
        UNIVERSAL_GRID = superAppWidgetPayloadTypesDto28;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto29 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_INFORMER", 28, "universal_informer");
        UNIVERSAL_INFORMER = superAppWidgetPayloadTypesDto29;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto30 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_INTERNAL", 29, "universal_internal");
        UNIVERSAL_INTERNAL = superAppWidgetPayloadTypesDto30;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto31 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_PLACEHOLDER", 30, "universal_placeholder");
        UNIVERSAL_PLACEHOLDER = superAppWidgetPayloadTypesDto31;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto32 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_SCROLL", 31, "universal_scroll");
        UNIVERSAL_SCROLL = superAppWidgetPayloadTypesDto32;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto33 = new SuperAppWidgetPayloadTypesDto("UNIVERSAL_TABLE", 32, "universal_table");
        UNIVERSAL_TABLE = superAppWidgetPayloadTypesDto33;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto34 = new SuperAppWidgetPayloadTypesDto("COUPON", 33, "coupon");
        COUPON = superAppWidgetPayloadTypesDto34;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto35 = new SuperAppWidgetPayloadTypesDto("VK_RUN", 34, "vk_run");
        VK_RUN = superAppWidgetPayloadTypesDto35;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto36 = new SuperAppWidgetPayloadTypesDto("MINI_WIDGETS", 35, "mini_widgets");
        MINI_WIDGETS = superAppWidgetPayloadTypesDto36;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto37 = new SuperAppWidgetPayloadTypesDto("ONBOARDING_PANEL", 36, "onboarding_panel");
        ONBOARDING_PANEL = superAppWidgetPayloadTypesDto37;
        SuperAppWidgetPayloadTypesDto superAppWidgetPayloadTypesDto38 = new SuperAppWidgetPayloadTypesDto("WIDGET_SKELETON", 37, "widget_skeleton");
        WIDGET_SKELETON = superAppWidgetPayloadTypesDto38;
        SuperAppWidgetPayloadTypesDto[] superAppWidgetPayloadTypesDtoArr = {superAppWidgetPayloadTypesDto, superAppWidgetPayloadTypesDto2, superAppWidgetPayloadTypesDto3, superAppWidgetPayloadTypesDto4, superAppWidgetPayloadTypesDto5, superAppWidgetPayloadTypesDto6, superAppWidgetPayloadTypesDto7, superAppWidgetPayloadTypesDto8, superAppWidgetPayloadTypesDto9, superAppWidgetPayloadTypesDto10, superAppWidgetPayloadTypesDto11, superAppWidgetPayloadTypesDto12, superAppWidgetPayloadTypesDto13, superAppWidgetPayloadTypesDto14, superAppWidgetPayloadTypesDto15, superAppWidgetPayloadTypesDto16, superAppWidgetPayloadTypesDto17, superAppWidgetPayloadTypesDto18, superAppWidgetPayloadTypesDto19, superAppWidgetPayloadTypesDto20, superAppWidgetPayloadTypesDto21, superAppWidgetPayloadTypesDto22, superAppWidgetPayloadTypesDto23, superAppWidgetPayloadTypesDto24, superAppWidgetPayloadTypesDto25, superAppWidgetPayloadTypesDto26, superAppWidgetPayloadTypesDto27, superAppWidgetPayloadTypesDto28, superAppWidgetPayloadTypesDto29, superAppWidgetPayloadTypesDto30, superAppWidgetPayloadTypesDto31, superAppWidgetPayloadTypesDto32, superAppWidgetPayloadTypesDto33, superAppWidgetPayloadTypesDto34, superAppWidgetPayloadTypesDto35, superAppWidgetPayloadTypesDto36, superAppWidgetPayloadTypesDto37, superAppWidgetPayloadTypesDto38};
        $VALUES = superAppWidgetPayloadTypesDtoArr;
        $ENTRIES = new asp(superAppWidgetPayloadTypesDtoArr);
        CREATOR = new a();
    }

    private SuperAppWidgetPayloadTypesDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static SuperAppWidgetPayloadTypesDto valueOf(String str) {
        return (SuperAppWidgetPayloadTypesDto) Enum.valueOf(SuperAppWidgetPayloadTypesDto.class, str);
    }

    public static SuperAppWidgetPayloadTypesDto[] values() {
        return (SuperAppWidgetPayloadTypesDto[]) $VALUES.clone();
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
