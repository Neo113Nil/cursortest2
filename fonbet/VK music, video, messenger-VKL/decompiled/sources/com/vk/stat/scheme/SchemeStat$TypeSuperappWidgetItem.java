package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeView;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeSuperappWidgetItem implements SchemeStat$TypeView.b {

    @pmi0("id")
    private final Id id;

    @pmi0("is_shevron")
    private final Boolean isShevron;

    @pmi0("superapp_item")
    private final SchemeStat$SuperappItem superappItem;

    @pmi0("uid")
    private final String uid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Id {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Id[] $VALUES;

        @pmi0("action_tile")
        public static final Id ACTION_TILE;

        @pmi0("ads_easy_promote")
        public static final Id ADS_EASY_PROMOTE;

        @pmi0("afisha")
        public static final Id AFISHA;

        @pmi0("assistant")
        public static final Id ASSISTANT;

        @pmi0("assistant_v2")
        public static final Id ASSISTANT_V2;

        @pmi0("birthdays")
        public static final Id BIRTHDAYS;

        @pmi0("coupon")
        public static final Id COUPON;

        @pmi0("covid_dynamic")
        public static final Id COVID_DYNAMIC;

        @pmi0("delivery_club")
        public static final Id DELIVERY_CLUB;

        @pmi0(NotificationCompat.CATEGORY_EVENT)
        public static final Id EVENT;

        @pmi0("exchange_rates")
        public static final Id EXCHANGE_RATES;

        @pmi0("food")
        public static final Id FOOD;

        @pmi0("games")
        public static final Id GAMES;

        @pmi0("greeting")
        public static final Id GREETING;

        @pmi0("half_tile")
        public static final Id HALF_TILE;

        @pmi0("hb_ads_easy_promote")
        public static final Id HB_ADS_EASY_PROMOTE;

        @pmi0("hb_combo")
        public static final Id HB_COMBO;

        @pmi0("hb_coupons")
        public static final Id HB_COUPONS;

        @pmi0("hb_kz_egovrnment")
        public static final Id HB_KZ_EGOVRNMENT;

        @pmi0("hb_mini_apps")
        public static final Id HB_MINI_APPS;

        @pmi0("hb_vk_pay")
        public static final Id HB_VK_PAY;

        @pmi0("holiday")
        public static final Id HOLIDAY;

        @pmi0("horizontal_button_scroll")
        public static final Id HORIZONTAL_BUTTON_SCROLL;

        @pmi0("informer")
        public static final Id INFORMER;

        @pmi0("market_tile")
        public static final Id MARKET_TILE;

        @pmi0("miniapps")
        public static final Id MINIAPPS;

        @pmi0("mini_widgets")
        public static final Id MINI_WIDGETS;

        @pmi0("mini_widget_menu")
        public static final Id MINI_WIDGET_MENU;

        @pmi0("music")
        public static final Id MUSIC;

        @pmi0("onboarding_panel")
        public static final Id ONBOARDING_PANEL;

        @pmi0(NotificationCompat.CATEGORY_PROMO)
        public static final Id PROMO;

        @pmi0("scroll")
        public static final Id SCROLL;

        @pmi0("section_grid")
        public static final Id SECTION_GRID;

        @pmi0("section_poster")
        public static final Id SECTION_POSTER;

        @pmi0("section_scroll")
        public static final Id SECTION_SCROLL;

        @pmi0("section_video_banner")
        public static final Id SECTION_VIDEO_BANNER;

        @pmi0("showcase_menu")
        public static final Id SHOWCASE_MENU;

        @pmi0("sport")
        public static final Id SPORT;

        @pmi0("subscribe_tile")
        public static final Id SUBSCRIBE_TILE;

        @pmi0("taxi")
        public static final Id TAXI;

        @pmi0("tile")
        public static final Id TILE;

        @pmi0("universal_full_width")
        public static final Id UNIVERSAL_FULL_WIDTH;

        @pmi0("universal_widget")
        public static final Id UNIVERSAL_WIDGET;

        @pmi0("video")
        public static final Id VIDEO;

        @pmi0("vkpay_slim")
        public static final Id VKPAY_SLIM;

        @pmi0("vk_run")
        public static final Id VK_RUN;

        @pmi0("vk_taxi")
        public static final Id VK_TAXI;

        @pmi0("vk_taxi_order_status")
        public static final Id VK_TAXI_ORDER_STATUS;

        @pmi0("weather")
        public static final Id WEATHER;

        static {
            Id id = new Id("AFISHA", 0);
            AFISHA = id;
            Id id2 = new Id("MINIAPPS", 1);
            MINIAPPS = id2;
            Id id3 = new Id("GAMES", 2);
            GAMES = id3;
            Id id4 = new Id("ASSISTANT", 3);
            ASSISTANT = id4;
            Id id5 = new Id("ASSISTANT_V2", 4);
            ASSISTANT_V2 = id5;
            Id id6 = new Id("GREETING", 5);
            GREETING = id6;
            Id id7 = new Id(SignalingProtocol.MEDIA_OPTION_VIDEO, 6);
            VIDEO = id7;
            Id id8 = new Id("BIRTHDAYS", 7);
            BIRTHDAYS = id8;
            Id id9 = new Id("EVENT", 8);
            EVENT = id9;
            Id id10 = new Id("EXCHANGE_RATES", 9);
            EXCHANGE_RATES = id10;
            Id id11 = new Id("MUSIC", 10);
            MUSIC = id11;
            Id id12 = new Id("WEATHER", 11);
            WEATHER = id12;
            Id id13 = new Id("SPORT", 12);
            SPORT = id13;
            Id id14 = new Id("TAXI", 13);
            TAXI = id14;
            Id id15 = new Id("FOOD", 14);
            FOOD = id15;
            Id id16 = new Id("VK_RUN", 15);
            VK_RUN = id16;
            Id id17 = new Id("HOLIDAY", 16);
            HOLIDAY = id17;
            Id id18 = new Id("VKPAY_SLIM", 17);
            VKPAY_SLIM = id18;
            Id id19 = new Id("INFORMER", 18);
            INFORMER = id19;
            Id id20 = new Id("COVID_DYNAMIC", 19);
            COVID_DYNAMIC = id20;
            Id id21 = new Id("DELIVERY_CLUB", 20);
            DELIVERY_CLUB = id21;
            Id id22 = new Id("VK_TAXI", 21);
            VK_TAXI = id22;
            Id id23 = new Id("ADS_EASY_PROMOTE", 22);
            ADS_EASY_PROMOTE = id23;
            Id id24 = new Id("VK_TAXI_ORDER_STATUS", 23);
            VK_TAXI_ORDER_STATUS = id24;
            Id id25 = new Id("UNIVERSAL_WIDGET", 24);
            UNIVERSAL_WIDGET = id25;
            Id id26 = new Id("COUPON", 25);
            COUPON = id26;
            Id id27 = new Id("HORIZONTAL_BUTTON_SCROLL", 26);
            HORIZONTAL_BUTTON_SCROLL = id27;
            Id id28 = new Id("HB_MINI_APPS", 27);
            HB_MINI_APPS = id28;
            Id id29 = new Id("HB_VK_PAY", 28);
            HB_VK_PAY = id29;
            Id id30 = new Id("HB_COUPONS", 29);
            HB_COUPONS = id30;
            Id id31 = new Id("HB_ADS_EASY_PROMOTE", 30);
            HB_ADS_EASY_PROMOTE = id31;
            Id id32 = new Id("HB_KZ_EGOVRNMENT", 31);
            HB_KZ_EGOVRNMENT = id32;
            Id id33 = new Id("HB_COMBO", 32);
            HB_COMBO = id33;
            Id id34 = new Id("MINI_WIDGETS", 33);
            MINI_WIDGETS = id34;
            Id id35 = new Id("ONBOARDING_PANEL", 34);
            ONBOARDING_PANEL = id35;
            Id id36 = new Id("SCROLL", 35);
            SCROLL = id36;
            Id id37 = new Id("PROMO", 36);
            PROMO = id37;
            Id id38 = new Id("TILE", 37);
            TILE = id38;
            Id id39 = new Id("HALF_TILE", 38);
            HALF_TILE = id39;
            Id id40 = new Id("UNIVERSAL_FULL_WIDTH", 39);
            UNIVERSAL_FULL_WIDTH = id40;
            Id id41 = new Id("SHOWCASE_MENU", 40);
            SHOWCASE_MENU = id41;
            Id id42 = new Id("MINI_WIDGET_MENU", 41);
            MINI_WIDGET_MENU = id42;
            Id id43 = new Id("SECTION_GRID", 42);
            SECTION_GRID = id43;
            Id id44 = new Id("SECTION_SCROLL", 43);
            SECTION_SCROLL = id44;
            Id id45 = new Id("SECTION_POSTER", 44);
            SECTION_POSTER = id45;
            Id id46 = new Id("SUBSCRIBE_TILE", 45);
            SUBSCRIBE_TILE = id46;
            Id id47 = new Id("SECTION_VIDEO_BANNER", 46);
            SECTION_VIDEO_BANNER = id47;
            Id id48 = new Id("MARKET_TILE", 47);
            MARKET_TILE = id48;
            Id id49 = new Id("ACTION_TILE", 48);
            ACTION_TILE = id49;
            Id[] idArr = {id, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13, id14, id15, id16, id17, id18, id19, id20, id21, id22, id23, id24, id25, id26, id27, id28, id29, id30, id31, id32, id33, id34, id35, id36, id37, id38, id39, id40, id41, id42, id43, id44, id45, id46, id47, id48, id49};
            $VALUES = idArr;
            $ENTRIES = new asp(idArr);
        }

        private Id(String str, int i) {
        }

        public static Id valueOf(String str) {
            return (Id) Enum.valueOf(Id.class, str);
        }

        public static Id[] values() {
            return (Id[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeSuperappWidgetItem() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSuperappWidgetItem)) {
            return false;
        }
        SchemeStat$TypeSuperappWidgetItem schemeStat$TypeSuperappWidgetItem = (SchemeStat$TypeSuperappWidgetItem) obj;
        return this.id == schemeStat$TypeSuperappWidgetItem.id && epx.f(this.uid, schemeStat$TypeSuperappWidgetItem.uid) && epx.f(this.superappItem, schemeStat$TypeSuperappWidgetItem.superappItem) && epx.f(this.isShevron, schemeStat$TypeSuperappWidgetItem.isShevron);
    }

    public final int hashCode() {
        Id id = this.id;
        int hashCode = (id == null ? 0 : id.hashCode()) * 31;
        String str = this.uid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SchemeStat$SuperappItem schemeStat$SuperappItem = this.superappItem;
        int hashCode3 = (hashCode2 + (schemeStat$SuperappItem == null ? 0 : schemeStat$SuperappItem.hashCode())) * 31;
        Boolean bool = this.isShevron;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSuperappWidgetItem(id=");
        sb.append(this.id);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", superappItem=");
        sb.append(this.superappItem);
        sb.append(", isShevron=");
        return tn.a(sb, this.isShevron, ')');
    }

    public SchemeStat$TypeSuperappWidgetItem(Id id, String str, SchemeStat$SuperappItem schemeStat$SuperappItem, Boolean bool) {
        this.id = id;
        this.uid = str;
        this.superappItem = schemeStat$SuperappItem;
        this.isShevron = bool;
    }

    public /* synthetic */ SchemeStat$TypeSuperappWidgetItem(Id id, String str, SchemeStat$SuperappItem schemeStat$SuperappItem, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : id, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : schemeStat$SuperappItem, (i & 8) != 0 ? null : bool);
    }
}
