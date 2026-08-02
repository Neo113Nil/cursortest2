package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.C4504q2;
import com.ironsource.D1;
import com.mbridge.msdk.MBridgeConstans;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$EventItem {
    public final transient String a;
    public final transient String b;

    @pmi0("session_uuid")
    private final FilteredString filteredSessionUuid;

    @pmi0("track_code")
    private final FilteredString filteredTrackCode;

    @pmi0("id")
    private final Long id;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0("type")
    private final Type type;

    @pmi0("url")
    private final String url;

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$EventItem>, a9y<SchemeStat$EventItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new SchemeStat$EventItem((Type) dq.f(x9yVar, "type", tru.a(), Type.class), fai.B(x9yVar, "id"), fai.B(x9yVar, "owner_id"), fai.C(x9yVar, "url"), fai.C(x9yVar, "track_code"), fai.C(x9yVar, "session_uuid"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$EventItem schemeStat$EventItem = (SchemeStat$EventItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("type", tru.a().toJson(schemeStat$EventItem.d()));
            x9yVar.n("id", schemeStat$EventItem.b());
            x9yVar.n("owner_id", schemeStat$EventItem.c());
            x9yVar.o("url", schemeStat$EventItem.e());
            x9yVar.o("track_code", schemeStat$EventItem.a);
            x9yVar.o("session_uuid", schemeStat$EventItem.b);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("album")
        public static final Type ALBUM;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final Type APP;

        @pmi0("article")
        public static final Type ARTICLE;

        @pmi0("artist")
        public static final Type ARTIST;

        @pmi0("audio_fullscreen_banner")
        public static final Type AUDIO_FULLSCREEN_BANNER;

        @pmi0("badges")
        public static final Type BADGES;

        @pmi0("banner")
        public static final Type BANNER;

        @pmi0("browser")
        public static final Type BROWSER;

        @pmi0("catalog_banner")
        public static final Type CATALOG_BANNER;

        @pmi0("catalog_item")
        public static final Type CATALOG_ITEM;

        @pmi0("channel")
        public static final Type CHANNEL;

        @pmi0("channel_feed_recom")
        public static final Type CHANNEL_FEED_RECOM;

        @pmi0("chat_screenshot")
        public static final Type CHAT_SCREENSHOT;

        @pmi0("chronicle")
        public static final Type CHRONICLE;

        @pmi0("click_item")
        public static final Type CLICK_ITEM;

        @pmi0("click_long_item")
        public static final Type CLICK_LONG_ITEM;

        @pmi0("click_market_link")
        public static final Type CLICK_MARKET_LINK;

        @pmi0("click_message_to_bc")
        public static final Type CLICK_MESSAGE_TO_BC;

        @pmi0("click_online_booking")
        public static final Type CLICK_ONLINE_BOOKING;

        @pmi0("clip")
        public static final Type CLIP;

        @pmi0("clips_challenge")
        public static final Type CLIPS_CHALLENGE;

        @pmi0("clips_compilation_first")
        public static final Type CLIPS_COMPILATION_FIRST;

        @pmi0("clips_compilation_next")
        public static final Type CLIPS_COMPILATION_NEXT;

        @pmi0("clips_compilation_view")
        public static final Type CLIPS_COMPILATION_VIEW;

        @pmi0("clips_deepfake_celebrity")
        public static final Type CLIPS_DEEPFAKE_CELEBRITY;

        @pmi0("clips_market_online_booking_link")
        public static final Type CLIPS_MARKET_ONLINE_BOOKING_LINK;

        @pmi0("clips_playlist")
        public static final Type CLIPS_PLAYLIST;

        @pmi0("clips_trend_creation")
        public static final Type CLIPS_TREND_CREATION;

        @pmi0("clips_user_link")
        public static final Type CLIPS_USER_LINK;

        @pmi0("comment")
        public static final Type COMMENT;

        @pmi0("community_video_tab")
        public static final Type COMMUNITY_VIDEO_TAB;

        @pmi0("contact")
        public static final Type CONTACT;

        @pmi0(SignalingProtocol.KEY_CONVERSATION)
        public static final Type CONVERSATION;

        @pmi0("discover_category")
        public static final Type DISCOVER_CATEGORY;

        @pmi0("document")
        public static final Type DOCUMENT;

        @pmi0("donut")
        public static final Type DONUT;

        @pmi0("dzen_article_item")
        public static final Type DZEN_ARTICLE_ITEM;

        @pmi0("dzen_story")
        public static final Type DZEN_STORY;

        @pmi0("dzen_story_item")
        public static final Type DZEN_STORY_ITEM;

        @pmi0(NotificationCompat.CATEGORY_EVENT)
        public static final Type EVENT;

        @pmi0(D1.e)
        public static final Type EXTERNAL;

        @pmi0("external_app")
        public static final Type EXTERNAL_APP;

        @pmi0("feed_item")
        public static final Type FEED_ITEM;

        @pmi0("game")
        public static final Type GAME;

        @pmi0("games_catalog_section")
        public static final Type GAMES_CATALOG_SECTION;

        @pmi0("games_unavailable_page")
        public static final Type GAMES_UNAVAILABLE_PAGE;

        @pmi0("graffiti")
        public static final Type GRAFFITI;

        @pmi0("group")
        public static final Type GROUP;

        @pmi0("group_chat")
        public static final Type GROUP_CHAT;

        @pmi0("hint")
        public static final Type HINT;

        @pmi0("image")
        public static final Type IMAGE;

        @pmi0("link")
        public static final Type LINK;

        @pmi0("live")
        public static final Type LIVE;

        @pmi0("market")
        public static final Type MARKET;

        @pmi0("marketplace_search")
        public static final Type MARKETPLACE_SEARCH;

        @pmi0("market_buy_ticket")
        public static final Type MARKET_BUY_TICKET;

        @pmi0("market_item")
        public static final Type MARKET_ITEM;

        @pmi0("market_item_album")
        public static final Type MARKET_ITEM_ALBUM;

        @pmi0("market_order_item")
        public static final Type MARKET_ORDER_ITEM;

        @pmi0("matched_playlist")
        public static final Type MATCHED_PLAYLIST;

        @pmi0("messenger_recommendation")
        public static final Type MESSENGER_RECOMMENDATION;

        @pmi0("mini_app")
        public static final Type MINI_APP;

        @pmi0("mini_app_internal")
        public static final Type MINI_APP_INTERNAL;

        @pmi0("music")
        public static final Type MUSIC;

        @pmi0("music_curator")
        public static final Type MUSIC_CURATOR;

        @pmi0("music_location")
        public static final Type MUSIC_LOCATION;

        @pmi0("narrative")
        public static final Type NARRATIVE;

        @pmi0("nft")
        public static final Type NFT;

        @pmi0("note")
        public static final Type NOTE;

        @pmi0(C4504q2.x)
        public static final Type NOTIFICATIONS;

        @pmi0("onboarding")
        public static final Type ONBOARDING;

        @pmi0("page")
        public static final Type PAGE;

        @pmi0("photo")
        public static final Type PHOTO;

        @pmi0("playlist")
        public static final Type PLAYLIST;

        @pmi0("podcast")
        public static final Type PODCAST;

        @pmi0("poll")
        public static final Type POLL;

        @pmi0("post")
        public static final Type POST;

        @pmi0("postlive")
        public static final Type POSTLIVE;

        @pmi0("product")
        public static final Type PRODUCT;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final Type PROFILE;

        @pmi0("profile_question")
        public static final Type PROFILE_QUESTION;

        @pmi0("profile_video_tab")
        public static final Type PROFILE_VIDEO_TAB;

        @pmi0("promo_link")
        public static final Type PROMO_LINK;

        @pmi0("radio")
        public static final Type RADIO;

        @pmi0("search_author")
        public static final Type SEARCH_AUTHOR;

        @pmi0("search_suggestion")
        public static final Type SEARCH_SUGGESTION;

        @pmi0("session")
        public static final Type SESSION;

        @pmi0("settings")
        public static final Type SETTINGS;

        @pmi0("shopping_center")
        public static final Type SHOPPING_CENTER;

        @pmi0("stickers")
        public static final Type STICKERS;

        @pmi0("story")
        public static final Type STORY;

        @pmi0("superapp_menu")
        public static final Type SUPERAPP_MENU;

        @pmi0("superapp_menu_collapsed")
        public static final Type SUPERAPP_MENU_COLLAPSED;

        @pmi0("superapp_widget")
        public static final Type SUPERAPP_WIDGET;

        @pmi0("tab_bar")
        public static final Type TAB_BAR;

        @pmi0("text")
        public static final Type TEXT;

        @pmi0("user")
        public static final Type USER;

        @pmi0("video")
        public static final Type VIDEO;

        @pmi0("video_ad_pushes")
        public static final Type VIDEO_AD_PUSHES;

        @pmi0("video_ai_assistant")
        public static final Type VIDEO_AI_ASSISTANT;

        @pmi0("video_content_block")
        public static final Type VIDEO_CONTENT_BLOCK;

        @pmi0("video_content_item")
        public static final Type VIDEO_CONTENT_ITEM;

        @pmi0("video_filter_block")
        public static final Type VIDEO_FILTER_BLOCK;

        @pmi0("video_playlist")
        public static final Type VIDEO_PLAYLIST;

        static {
            Type type = new Type("APP", 0);
            APP = type;
            Type type2 = new Type("ARTICLE", 1);
            ARTICLE = type2;
            Type type3 = new Type("ALBUM", 2);
            ALBUM = type3;
            Type type4 = new Type("ARTIST", 3);
            ARTIST = type4;
            Type type5 = new Type("AUDIO_FULLSCREEN_BANNER", 4);
            AUDIO_FULLSCREEN_BANNER = type5;
            Type type6 = new Type("BADGES", 5);
            BADGES = type6;
            Type type7 = new Type("BROWSER", 6);
            BROWSER = type7;
            Type type8 = new Type("CATALOG_ITEM", 7);
            CATALOG_ITEM = type8;
            Type type9 = new Type("CATALOG_BANNER", 8);
            CATALOG_BANNER = type9;
            Type type10 = new Type("CHANNEL", 9);
            CHANNEL = type10;
            Type type11 = new Type("CLICK_ITEM", 10);
            CLICK_ITEM = type11;
            Type type12 = new Type("CLICK_LONG_ITEM", 11);
            CLICK_LONG_ITEM = type12;
            Type type13 = new Type("CLIP", 12);
            CLIP = type13;
            Type type14 = new Type("CLIPS_CHALLENGE", 13);
            CLIPS_CHALLENGE = type14;
            Type type15 = new Type("CLIPS_COMPILATION_FIRST", 14);
            CLIPS_COMPILATION_FIRST = type15;
            Type type16 = new Type("CLIPS_COMPILATION_NEXT", 15);
            CLIPS_COMPILATION_NEXT = type16;
            Type type17 = new Type("CLIPS_COMPILATION_VIEW", 16);
            CLIPS_COMPILATION_VIEW = type17;
            Type type18 = new Type("CLIPS_MARKET_ONLINE_BOOKING_LINK", 17);
            CLIPS_MARKET_ONLINE_BOOKING_LINK = type18;
            Type type19 = new Type("CLIPS_PLAYLIST", 18);
            CLIPS_PLAYLIST = type19;
            Type type20 = new Type("CLIPS_TREND_CREATION", 19);
            CLIPS_TREND_CREATION = type20;
            Type type21 = new Type("CLIPS_USER_LINK", 20);
            CLIPS_USER_LINK = type21;
            Type type22 = new Type("CHRONICLE", 21);
            CHRONICLE = type22;
            Type type23 = new Type("CONTACT", 22);
            CONTACT = type23;
            Type type24 = new Type("COMMENT", 23);
            COMMENT = type24;
            Type type25 = new Type("COMMUNITY_VIDEO_TAB", 24);
            COMMUNITY_VIDEO_TAB = type25;
            Type type26 = new Type("DISCOVER_CATEGORY", 25);
            DISCOVER_CATEGORY = type26;
            Type type27 = new Type("DOCUMENT", 26);
            DOCUMENT = type27;
            Type type28 = new Type("DONUT", 27);
            DONUT = type28;
            Type type29 = new Type("DZEN_STORY", 28);
            DZEN_STORY = type29;
            Type type30 = new Type("DZEN_STORY_ITEM", 29);
            DZEN_STORY_ITEM = type30;
            Type type31 = new Type("DZEN_ARTICLE_ITEM", 30);
            DZEN_ARTICLE_ITEM = type31;
            Type type32 = new Type("EXTERNAL_APP", 31);
            EXTERNAL_APP = type32;
            Type type33 = new Type("EXTERNAL", 32);
            EXTERNAL = type33;
            Type type34 = new Type("EVENT", 33);
            EVENT = type34;
            Type type35 = new Type("FEED_ITEM", 34);
            FEED_ITEM = type35;
            Type type36 = new Type("GAME", 35);
            GAME = type36;
            Type type37 = new Type("GAMES_UNAVAILABLE_PAGE", 36);
            GAMES_UNAVAILABLE_PAGE = type37;
            Type type38 = new Type("GROUP", 37);
            GROUP = type38;
            Type type39 = new Type("GROUP_CHAT", 38);
            GROUP_CHAT = type39;
            Type type40 = new Type("GRAFFITI", 39);
            GRAFFITI = type40;
            Type type41 = new Type("HINT", 40);
            HINT = type41;
            Type type42 = new Type("LINK", 41);
            LINK = type42;
            Type type43 = new Type("NARRATIVE", 42);
            NARRATIVE = type43;
            Type type44 = new Type("MARKET", 43);
            MARKET = type44;
            Type type45 = new Type("MARKET_ITEM", 44);
            MARKET_ITEM = type45;
            Type type46 = new Type("MARKET_ITEM_ALBUM", 45);
            MARKET_ITEM_ALBUM = type46;
            Type type47 = new Type("MARKET_ORDER_ITEM", 46);
            MARKET_ORDER_ITEM = type47;
            Type type48 = new Type("MARKET_BUY_TICKET", 47);
            MARKET_BUY_TICKET = type48;
            Type type49 = new Type("MINI_APP", 48);
            MINI_APP = type49;
            Type type50 = new Type("MINI_APP_INTERNAL", 49);
            MINI_APP_INTERNAL = type50;
            Type type51 = new Type("MUSIC", 50);
            MUSIC = type51;
            Type type52 = new Type("MUSIC_CURATOR", 51);
            MUSIC_CURATOR = type52;
            Type type53 = new Type("MUSIC_LOCATION", 52);
            MUSIC_LOCATION = type53;
            Type type54 = new Type("NOTE", 53);
            NOTE = type54;
            Type type55 = new Type("PLAYLIST", 54);
            PLAYLIST = type55;
            Type type56 = new Type("PHOTO", 55);
            PHOTO = type56;
            Type type57 = new Type("POST", 56);
            POST = type57;
            Type type58 = new Type("PODCAST", 57);
            PODCAST = type58;
            Type type59 = new Type("PROFILE", 58);
            PROFILE = type59;
            Type type60 = new Type("PAGE", 59);
            PAGE = type60;
            Type type61 = new Type("PRODUCT", 60);
            PRODUCT = type61;
            Type type62 = new Type("PROMO_LINK", 61);
            PROMO_LINK = type62;
            Type type63 = new Type("POLL", 62);
            POLL = type63;
            Type type64 = new Type("STORY", 63);
            STORY = type64;
            Type type65 = new Type("SETTINGS", 64);
            SETTINGS = type65;
            Type type66 = new Type("SESSION", 65);
            SESSION = type66;
            Type type67 = new Type("SHOPPING_CENTER", 66);
            SHOPPING_CENTER = type67;
            Type type68 = new Type("STICKERS", 67);
            STICKERS = type68;
            Type type69 = new Type("SUPERAPP_MENU", 68);
            SUPERAPP_MENU = type69;
            Type type70 = new Type("SUPERAPP_MENU_COLLAPSED", 69);
            SUPERAPP_MENU_COLLAPSED = type70;
            Type type71 = new Type("SUPERAPP_WIDGET", 70);
            SUPERAPP_WIDGET = type71;
            Type type72 = new Type("TAB_BAR", 71);
            TAB_BAR = type72;
            Type type73 = new Type("TEXT", 72);
            TEXT = type73;
            Type type74 = new Type(SignalingProtocol.MEDIA_OPTION_VIDEO, 73);
            VIDEO = type74;
            Type type75 = new Type("VIDEO_PLAYLIST", 74);
            VIDEO_PLAYLIST = type75;
            Type type76 = new Type("VIDEO_CONTENT_BLOCK", 75);
            VIDEO_CONTENT_BLOCK = type76;
            Type type77 = new Type("VIDEO_CONTENT_ITEM", 76);
            VIDEO_CONTENT_ITEM = type77;
            Type type78 = new Type("VIDEO_FILTER_BLOCK", 77);
            VIDEO_FILTER_BLOCK = type78;
            Type type79 = new Type("USER", 78);
            USER = type79;
            Type type80 = new Type("PROFILE_QUESTION", 79);
            PROFILE_QUESTION = type80;
            Type type81 = new Type("PROFILE_VIDEO_TAB", 80);
            PROFILE_VIDEO_TAB = type81;
            Type type82 = new Type("GAMES_CATALOG_SECTION", 81);
            GAMES_CATALOG_SECTION = type82;
            Type type83 = new Type("MARKETPLACE_SEARCH", 82);
            MARKETPLACE_SEARCH = type83;
            Type type84 = new Type("CONVERSATION", 83);
            CONVERSATION = type84;
            Type type85 = new Type("CHAT_SCREENSHOT", 84);
            CHAT_SCREENSHOT = type85;
            Type type86 = new Type("SEARCH_SUGGESTION", 85);
            SEARCH_SUGGESTION = type86;
            Type type87 = new Type("MATCHED_PLAYLIST", 86);
            MATCHED_PLAYLIST = type87;
            Type type88 = new Type("SEARCH_AUTHOR", 87);
            SEARCH_AUTHOR = type88;
            Type type89 = new Type("CLIPS_DEEPFAKE_CELEBRITY", 88);
            CLIPS_DEEPFAKE_CELEBRITY = type89;
            Type type90 = new Type("NFT", 89);
            NFT = type90;
            Type type91 = new Type("BANNER", 90);
            BANNER = type91;
            Type type92 = new Type("CLICK_ONLINE_BOOKING", 91);
            CLICK_ONLINE_BOOKING = type92;
            Type type93 = new Type("CLICK_MARKET_LINK", 92);
            CLICK_MARKET_LINK = type93;
            Type type94 = new Type("MESSENGER_RECOMMENDATION", 93);
            MESSENGER_RECOMMENDATION = type94;
            Type type95 = new Type("CHANNEL_FEED_RECOM", 94);
            CHANNEL_FEED_RECOM = type95;
            Type type96 = new Type("VIDEO_AD_PUSHES", 95);
            VIDEO_AD_PUSHES = type96;
            Type type97 = new Type("CLICK_MESSAGE_TO_BC", 96);
            CLICK_MESSAGE_TO_BC = type97;
            Type type98 = new Type("RADIO", 97);
            RADIO = type98;
            Type type99 = new Type("ONBOARDING", 98);
            ONBOARDING = type99;
            Type type100 = new Type("NOTIFICATIONS", 99);
            NOTIFICATIONS = type100;
            Type type101 = new Type("IMAGE", 100);
            IMAGE = type101;
            Type type102 = new Type("LIVE", 101);
            LIVE = type102;
            Type type103 = new Type("POSTLIVE", 102);
            POSTLIVE = type103;
            Type type104 = new Type("VIDEO_AI_ASSISTANT", 103);
            VIDEO_AI_ASSISTANT = type104;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47, type48, type49, type50, type51, type52, type53, type54, type55, type56, type57, type58, type59, type60, type61, type62, type63, type64, type65, type66, type67, type68, type69, type70, type71, type72, type73, type74, type75, type76, type77, type78, type79, type80, type81, type82, type83, type84, type85, type86, type87, type88, type89, type90, type91, type92, type93, type94, type95, type96, type97, type98, type99, type100, type101, type102, type103, type104};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SchemeStat$EventItem(Type type, Long l, Long l2, String str, String str2, String str3) {
        this.type = type;
        this.id = l;
        this.ownerId = l2;
        this.url = str;
        this.a = str2;
        this.b = str3;
        FilteredString filteredString = new FilteredString(lhg.b(512));
        this.filteredTrackCode = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(36));
        this.filteredSessionUuid = filteredString2;
        filteredString.a(str2);
        filteredString2.a(str3);
    }

    public static SchemeStat$EventItem a(SchemeStat$EventItem schemeStat$EventItem, Long l) {
        Type type = schemeStat$EventItem.type;
        Long l2 = schemeStat$EventItem.ownerId;
        String str = schemeStat$EventItem.url;
        String str2 = schemeStat$EventItem.a;
        String str3 = schemeStat$EventItem.b;
        schemeStat$EventItem.getClass();
        return new SchemeStat$EventItem(type, l, l2, str, str2, str3);
    }

    public final Long b() {
        return this.id;
    }

    public final Long c() {
        return this.ownerId;
    }

    public final Type d() {
        return this.type;
    }

    public final String e() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$EventItem)) {
            return false;
        }
        SchemeStat$EventItem schemeStat$EventItem = (SchemeStat$EventItem) obj;
        return this.type == schemeStat$EventItem.type && epx.f(this.id, schemeStat$EventItem.id) && epx.f(this.ownerId, schemeStat$EventItem.ownerId) && epx.f(this.url, schemeStat$EventItem.url) && epx.f(this.a, schemeStat$EventItem.a) && epx.f(this.b, schemeStat$EventItem.b);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Long l = this.id;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.ownerId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.url;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.a;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.b;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventItem(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", trackCode=");
        sb.append(this.a);
        sb.append(", sessionUuid=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ SchemeStat$EventItem(Type type, Long l, Long l2, String str, String str2, String str3, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
