package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeClick;
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
import xsna.u9y;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeWishlistItem implements SchemeStat$TypeAction.b, SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("ad_campaign_id")
    private final Integer adCampaignId;
    public final transient String b;
    public final transient String c;

    @pmi0("collection_id")
    private final Integer collectionId;
    public final transient String d;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("ad_campaign_source")
    private final FilteredString filteredAdCampaignSource;

    @pmi0("search_text")
    private final FilteredString filteredSearchText;

    @pmi0("vk_platform")
    private final FilteredString filteredVkPlatform;

    @pmi0("wish_item_name")
    private final FilteredString filteredWishItemName;

    @pmi0("idea_id")
    private final Integer ideaId;

    @pmi0("idea_name")
    private final String ideaName;

    @pmi0("link")
    private final String link;

    @pmi0("market_item_id")
    private final Integer marketItemId;

    @pmi0("market_item_owner_id")
    private final Long marketItemOwnerId;

    @pmi0("ref_screen")
    private final MobileOfficialAppsCoreNavStat$EventScreen refScreen;

    @pmi0("screen")
    private final Screen screen;

    @pmi0("shared_to")
    private final SharedTo sharedTo;

    @pmi0("ugc_item_id")
    private final Integer ugcItemId;

    @pmi0("ugc_item_owner_id")
    private final Long ugcItemOwnerId;

    @pmi0("ugc_item_type")
    private final UgcItemType ugcItemType;

    @pmi0("wish_id")
    private final Integer wishId;

    @pmi0("wish_item_id")
    private final Integer wishItemId;

    @pmi0("wish_item_user_id")
    private final Long wishItemUserId;

    @pmi0("wishes_block_type")
    private final WishesBlockType wishesBlockType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_to_bookmark")
        public static final EventType ADD_TO_BOOKMARK;

        @pmi0("add_wish")
        public static final EventType ADD_WISH;

        @pmi0("click_buy")
        public static final EventType CLICK_BUY;

        @pmi0("copy_link")
        public static final EventType COPY_LINK;

        @pmi0("copy_link_ugc")
        public static final EventType COPY_LINK_UGC;

        @pmi0("empty_search")
        public static final EventType EMPTY_SEARCH;

        @pmi0("follow_description_link")
        public static final EventType FOLLOW_DESCRIPTION_LINK;

        @pmi0("open_block")
        public static final EventType OPEN_BLOCK;

        @pmi0("open_collection")
        public static final EventType OPEN_COLLECTION;

        @pmi0("open_friends_list")
        public static final EventType OPEN_FRIENDS_LIST;

        @pmi0("open_friend_wishlist")
        public static final EventType OPEN_FRIEND_WISHLIST;

        @pmi0("open_idea")
        public static final EventType OPEN_IDEA;

        @pmi0("open_ideas")
        public static final EventType OPEN_IDEAS;

        @pmi0("open_item")
        public static final EventType OPEN_ITEM;

        @pmi0("open_my_wishes")
        public static final EventType OPEN_MY_WISHES;

        @pmi0("open_search")
        public static final EventType OPEN_SEARCH;

        @pmi0("open_tinder")
        public static final EventType OPEN_TINDER;

        @pmi0("open_ugc")
        public static final EventType OPEN_UGC;

        @pmi0("participate")
        public static final EventType PARTICIPATE;

        @pmi0("reject_wish")
        public static final EventType REJECT_WISH;

        @pmi0("remove_wish")
        public static final EventType REMOVE_WISH;

        @pmi0("search")
        public static final EventType SEARCH;

        @pmi0("search_recent")
        public static final EventType SEARCH_RECENT;

        @pmi0("search_suggest")
        public static final EventType SEARCH_SUGGEST;

        @pmi0("select_wish")
        public static final EventType SELECT_WISH;

        @pmi0("share_wish")
        public static final EventType SHARE_WISH;

        @pmi0("share_wishlist")
        public static final EventType SHARE_WISHLIST;

        @pmi0("start")
        public static final EventType START;

        @pmi0("start_add_wish")
        public static final EventType START_ADD_WISH;

        @pmi0("start_custom_wish")
        public static final EventType START_CUSTOM_WISH;

        @pmi0("unselect_wish")
        public static final EventType UNSELECT_WISH;

        @pmi0("view_ugc")
        public static final EventType VIEW_UGC;

        @pmi0("view_wish")
        public static final EventType VIEW_WISH;

        static {
            EventType eventType = new EventType("ADD_TO_BOOKMARK", 0);
            ADD_TO_BOOKMARK = eventType;
            EventType eventType2 = new EventType("ADD_WISH", 1);
            ADD_WISH = eventType2;
            EventType eventType3 = new EventType("CLICK_BUY", 2);
            CLICK_BUY = eventType3;
            EventType eventType4 = new EventType("COPY_LINK", 3);
            COPY_LINK = eventType4;
            EventType eventType5 = new EventType("COPY_LINK_UGC", 4);
            COPY_LINK_UGC = eventType5;
            EventType eventType6 = new EventType("EMPTY_SEARCH", 5);
            EMPTY_SEARCH = eventType6;
            EventType eventType7 = new EventType("FOLLOW_DESCRIPTION_LINK", 6);
            FOLLOW_DESCRIPTION_LINK = eventType7;
            EventType eventType8 = new EventType("OPEN_BLOCK", 7);
            OPEN_BLOCK = eventType8;
            EventType eventType9 = new EventType("OPEN_COLLECTION", 8);
            OPEN_COLLECTION = eventType9;
            EventType eventType10 = new EventType("OPEN_FRIEND_WISHLIST", 9);
            OPEN_FRIEND_WISHLIST = eventType10;
            EventType eventType11 = new EventType("OPEN_FRIENDS_LIST", 10);
            OPEN_FRIENDS_LIST = eventType11;
            EventType eventType12 = new EventType("OPEN_IDEA", 11);
            OPEN_IDEA = eventType12;
            EventType eventType13 = new EventType("OPEN_IDEAS", 12);
            OPEN_IDEAS = eventType13;
            EventType eventType14 = new EventType("OPEN_ITEM", 13);
            OPEN_ITEM = eventType14;
            EventType eventType15 = new EventType("OPEN_MY_WISHES", 14);
            OPEN_MY_WISHES = eventType15;
            EventType eventType16 = new EventType("OPEN_SEARCH", 15);
            OPEN_SEARCH = eventType16;
            EventType eventType17 = new EventType("OPEN_TINDER", 16);
            OPEN_TINDER = eventType17;
            EventType eventType18 = new EventType("OPEN_UGC", 17);
            OPEN_UGC = eventType18;
            EventType eventType19 = new EventType("PARTICIPATE", 18);
            PARTICIPATE = eventType19;
            EventType eventType20 = new EventType("REJECT_WISH", 19);
            REJECT_WISH = eventType20;
            EventType eventType21 = new EventType("REMOVE_WISH", 20);
            REMOVE_WISH = eventType21;
            EventType eventType22 = new EventType("SEARCH", 21);
            SEARCH = eventType22;
            EventType eventType23 = new EventType("SEARCH_RECENT", 22);
            SEARCH_RECENT = eventType23;
            EventType eventType24 = new EventType("SEARCH_SUGGEST", 23);
            SEARCH_SUGGEST = eventType24;
            EventType eventType25 = new EventType("SELECT_WISH", 24);
            SELECT_WISH = eventType25;
            EventType eventType26 = new EventType("SHARE_WISH", 25);
            SHARE_WISH = eventType26;
            EventType eventType27 = new EventType("SHARE_WISHLIST", 26);
            SHARE_WISHLIST = eventType27;
            EventType eventType28 = new EventType("START", 27);
            START = eventType28;
            EventType eventType29 = new EventType("START_ADD_WISH", 28);
            START_ADD_WISH = eventType29;
            EventType eventType30 = new EventType("START_CUSTOM_WISH", 29);
            START_CUSTOM_WISH = eventType30;
            EventType eventType31 = new EventType("UNSELECT_WISH", 30);
            UNSELECT_WISH = eventType31;
            EventType eventType32 = new EventType("VIEW_UGC", 31);
            VIEW_UGC = eventType32;
            EventType eventType33 = new EventType("VIEW_WISH", 32);
            VIEW_WISH = eventType33;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* compiled from: SchemeStat.kt */
    public static final class PersistenceSerializer implements uay<SchemeStat$TypeWishlistItem>, a9y<SchemeStat$TypeWishlistItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            EventType eventType = (EventType) dq.f(x9yVar, "event_type", tru.a(), EventType.class);
            Screen screen = (Screen) dq.f(x9yVar, "screen", tru.a(), Screen.class);
            Gson a = tru.a();
            b9y q = x9yVar.q("wishes_block_type");
            WishesBlockType wishesBlockType = (WishesBlockType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), WishesBlockType.class));
            String C = fai.C(x9yVar, "search_text");
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("shared_to");
            SharedTo sharedTo = (SharedTo) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), SharedTo.class));
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("ugc_item_type");
            UgcItemType ugcItemType = (UgcItemType) ((q3 == null || (q3 instanceof u9y)) ? null : a3.fromJson(q3.k(), UgcItemType.class));
            Long B = fai.B(x9yVar, "ugc_item_owner_id");
            Integer A = fai.A(x9yVar, "ugc_item_id");
            Long B2 = fai.B(x9yVar, "wish_item_user_id");
            Integer A2 = fai.A(x9yVar, "wish_item_id");
            Long B3 = fai.B(x9yVar, "market_item_owner_id");
            Integer A3 = fai.A(x9yVar, "market_item_id");
            String C2 = fai.C(x9yVar, "link");
            Integer A4 = fai.A(x9yVar, "collection_id");
            Integer A5 = fai.A(x9yVar, "ad_campaign_id");
            String C3 = fai.C(x9yVar, "ad_campaign_source");
            String C4 = fai.C(x9yVar, "wish_item_name");
            Integer A6 = fai.A(x9yVar, "idea_id");
            String C5 = fai.C(x9yVar, "idea_name");
            Integer A7 = fai.A(x9yVar, "wish_id");
            Gson a4 = tru.a();
            b9y q4 = x9yVar.q("ref_screen");
            return new SchemeStat$TypeWishlistItem(eventType, screen, wishesBlockType, C, sharedTo, ugcItemType, B, A, B2, A2, B3, A3, C2, A4, A5, C3, C4, A6, C5, A7, (MobileOfficialAppsCoreNavStat$EventScreen) ((q4 == null || (q4 instanceof u9y)) ? null : a4.fromJson(q4.k(), MobileOfficialAppsCoreNavStat$EventScreen.class)), fai.C(x9yVar, "vk_platform"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem = (SchemeStat$TypeWishlistItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("event_type", tru.a().toJson(schemeStat$TypeWishlistItem.c()));
            x9yVar.o("screen", tru.a().toJson(schemeStat$TypeWishlistItem.j()));
            x9yVar.o("wishes_block_type", tru.a().toJson(schemeStat$TypeWishlistItem.r()));
            x9yVar.o("search_text", schemeStat$TypeWishlistItem.a);
            x9yVar.o("shared_to", tru.a().toJson(schemeStat$TypeWishlistItem.k()));
            x9yVar.o("ugc_item_type", tru.a().toJson(schemeStat$TypeWishlistItem.n()));
            x9yVar.n("ugc_item_owner_id", schemeStat$TypeWishlistItem.m());
            x9yVar.n("ugc_item_id", schemeStat$TypeWishlistItem.l());
            x9yVar.n("wish_item_user_id", schemeStat$TypeWishlistItem.q());
            x9yVar.n("wish_item_id", schemeStat$TypeWishlistItem.p());
            x9yVar.n("market_item_owner_id", schemeStat$TypeWishlistItem.h());
            x9yVar.n("market_item_id", schemeStat$TypeWishlistItem.g());
            x9yVar.o("link", schemeStat$TypeWishlistItem.f());
            x9yVar.n("collection_id", schemeStat$TypeWishlistItem.b());
            x9yVar.n("ad_campaign_id", schemeStat$TypeWishlistItem.a());
            x9yVar.o("ad_campaign_source", schemeStat$TypeWishlistItem.b);
            x9yVar.o("wish_item_name", schemeStat$TypeWishlistItem.c);
            x9yVar.n("idea_id", schemeStat$TypeWishlistItem.d());
            x9yVar.o("idea_name", schemeStat$TypeWishlistItem.e());
            x9yVar.n("wish_id", schemeStat$TypeWishlistItem.o());
            x9yVar.o("ref_screen", tru.a().toJson(schemeStat$TypeWishlistItem.i()));
            x9yVar.o("vk_platform", schemeStat$TypeWishlistItem.d);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class Screen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Screen[] $VALUES;

        @pmi0("custom")
        public static final Screen CUSTOM;

        @pmi0("friends_list")
        public static final Screen FRIENDS_LIST;

        @pmi0("friend_wishlist")
        public static final Screen FRIEND_WISHLIST;

        @pmi0("ideas")
        public static final Screen IDEAS;

        @pmi0("my_wishes")
        public static final Screen MY_WISHES;

        @pmi0("search")
        public static final Screen SEARCH;

        @pmi0("stickers")
        public static final Screen STICKERS;

        static {
            Screen screen = new Screen("MY_WISHES", 0);
            MY_WISHES = screen;
            Screen screen2 = new Screen("FRIENDS_LIST", 1);
            FRIENDS_LIST = screen2;
            Screen screen3 = new Screen("SEARCH", 2);
            SEARCH = screen3;
            Screen screen4 = new Screen("IDEAS", 3);
            IDEAS = screen4;
            Screen screen5 = new Screen("FRIEND_WISHLIST", 4);
            FRIEND_WISHLIST = screen5;
            Screen screen6 = new Screen("CUSTOM", 5);
            CUSTOM = screen6;
            Screen screen7 = new Screen("STICKERS", 6);
            STICKERS = screen7;
            Screen[] screenArr = {screen, screen2, screen3, screen4, screen5, screen6, screen7};
            $VALUES = screenArr;
            $ENTRIES = new asp(screenArr);
        }

        private Screen(String str, int i) {
        }

        public static Screen valueOf(String str) {
            return (Screen) Enum.valueOf(Screen.class, str);
        }

        public static Screen[] values() {
            return (Screen[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class SharedTo {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SharedTo[] $VALUES;

        @pmi0("message")
        public static final SharedTo MESSAGE;

        @pmi0("wall")
        public static final SharedTo WALL;

        static {
            SharedTo sharedTo = new SharedTo("MESSAGE", 0);
            MESSAGE = sharedTo;
            SharedTo sharedTo2 = new SharedTo("WALL", 1);
            WALL = sharedTo2;
            SharedTo[] sharedToArr = {sharedTo, sharedTo2};
            $VALUES = sharedToArr;
            $ENTRIES = new asp(sharedToArr);
        }

        private SharedTo(String str, int i) {
        }

        public static SharedTo valueOf(String str) {
            return (SharedTo) Enum.valueOf(SharedTo.class, str);
        }

        public static SharedTo[] values() {
            return (SharedTo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class UgcItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UgcItemType[] $VALUES;

        @pmi0("article")
        public static final UgcItemType ARTICLE;

        @pmi0("photo")
        public static final UgcItemType PHOTO;

        @pmi0("story")
        public static final UgcItemType STORY;

        @pmi0("video")
        public static final UgcItemType VIDEO;

        @pmi0("wall")
        public static final UgcItemType WALL;

        static {
            UgcItemType ugcItemType = new UgcItemType("ARTICLE", 0);
            ARTICLE = ugcItemType;
            UgcItemType ugcItemType2 = new UgcItemType("WALL", 1);
            WALL = ugcItemType2;
            UgcItemType ugcItemType3 = new UgcItemType("PHOTO", 2);
            PHOTO = ugcItemType3;
            UgcItemType ugcItemType4 = new UgcItemType(SignalingProtocol.MEDIA_OPTION_VIDEO, 3);
            VIDEO = ugcItemType4;
            UgcItemType ugcItemType5 = new UgcItemType("STORY", 4);
            STORY = ugcItemType5;
            UgcItemType[] ugcItemTypeArr = {ugcItemType, ugcItemType2, ugcItemType3, ugcItemType4, ugcItemType5};
            $VALUES = ugcItemTypeArr;
            $ENTRIES = new asp(ugcItemTypeArr);
        }

        private UgcItemType(String str, int i) {
        }

        public static UgcItemType valueOf(String str) {
            return (UgcItemType) Enum.valueOf(UgcItemType.class, str);
        }

        public static UgcItemType[] values() {
            return (UgcItemType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes5.dex */
    public static final class WishesBlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WishesBlockType[] $VALUES;

        @pmi0("collection")
        public static final WishesBlockType COLLECTION;

        @pmi0("custom")
        public static final WishesBlockType CUSTOM;

        @pmi0("friend")
        public static final WishesBlockType FRIEND;

        @pmi0("recommended")
        public static final WishesBlockType RECOMMENDED;

        @pmi0("search")
        public static final WishesBlockType SEARCH;

        @pmi0("sticker_pack_detailed")
        public static final WishesBlockType STICKER_PACK_DETAILED;

        @pmi0("sticker_store")
        public static final WishesBlockType STICKER_STORE;

        static {
            WishesBlockType wishesBlockType = new WishesBlockType("RECOMMENDED", 0);
            RECOMMENDED = wishesBlockType;
            WishesBlockType wishesBlockType2 = new WishesBlockType("FRIEND", 1);
            FRIEND = wishesBlockType2;
            WishesBlockType wishesBlockType3 = new WishesBlockType("SEARCH", 2);
            SEARCH = wishesBlockType3;
            WishesBlockType wishesBlockType4 = new WishesBlockType("CUSTOM", 3);
            CUSTOM = wishesBlockType4;
            WishesBlockType wishesBlockType5 = new WishesBlockType("COLLECTION", 4);
            COLLECTION = wishesBlockType5;
            WishesBlockType wishesBlockType6 = new WishesBlockType("STICKER_STORE", 5);
            STICKER_STORE = wishesBlockType6;
            WishesBlockType wishesBlockType7 = new WishesBlockType("STICKER_PACK_DETAILED", 6);
            STICKER_PACK_DETAILED = wishesBlockType7;
            WishesBlockType[] wishesBlockTypeArr = {wishesBlockType, wishesBlockType2, wishesBlockType3, wishesBlockType4, wishesBlockType5, wishesBlockType6, wishesBlockType7};
            $VALUES = wishesBlockTypeArr;
            $ENTRIES = new asp(wishesBlockTypeArr);
        }

        private WishesBlockType(String str, int i) {
        }

        public static WishesBlockType valueOf(String str) {
            return (WishesBlockType) Enum.valueOf(WishesBlockType.class, str);
        }

        public static WishesBlockType[] values() {
            return (WishesBlockType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeWishlistItem(EventType eventType, Screen screen, WishesBlockType wishesBlockType, String str, SharedTo sharedTo, UgcItemType ugcItemType, Long l, Integer num, Long l2, Integer num2, Long l3, Integer num3, String str2, Integer num4, Integer num5, String str3, String str4, Integer num6, String str5, Integer num7, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str6) {
        this.eventType = eventType;
        this.screen = screen;
        this.wishesBlockType = wishesBlockType;
        this.a = str;
        this.sharedTo = sharedTo;
        this.ugcItemType = ugcItemType;
        this.ugcItemOwnerId = l;
        this.ugcItemId = num;
        this.wishItemUserId = l2;
        this.wishItemId = num2;
        this.marketItemOwnerId = l3;
        this.marketItemId = num3;
        this.link = str2;
        this.collectionId = num4;
        this.adCampaignId = num5;
        this.b = str3;
        this.c = str4;
        this.ideaId = num6;
        this.ideaName = str5;
        this.wishId = num7;
        this.refScreen = mobileOfficialAppsCoreNavStat$EventScreen;
        this.d = str6;
        FilteredString filteredString = new FilteredString(lhg.b(100));
        this.filteredSearchText = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(50));
        this.filteredAdCampaignSource = filteredString2;
        FilteredString filteredString3 = new FilteredString(lhg.b(255));
        this.filteredWishItemName = filteredString3;
        FilteredString filteredString4 = new FilteredString(lhg.b(20));
        this.filteredVkPlatform = filteredString4;
        filteredString.a(str);
        filteredString2.a(str3);
        filteredString3.a(str4);
        filteredString4.a(str6);
    }

    public final Integer a() {
        return this.adCampaignId;
    }

    public final Integer b() {
        return this.collectionId;
    }

    public final EventType c() {
        return this.eventType;
    }

    public final Integer d() {
        return this.ideaId;
    }

    public final String e() {
        return this.ideaName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeWishlistItem)) {
            return false;
        }
        SchemeStat$TypeWishlistItem schemeStat$TypeWishlistItem = (SchemeStat$TypeWishlistItem) obj;
        return this.eventType == schemeStat$TypeWishlistItem.eventType && this.screen == schemeStat$TypeWishlistItem.screen && this.wishesBlockType == schemeStat$TypeWishlistItem.wishesBlockType && epx.f(this.a, schemeStat$TypeWishlistItem.a) && this.sharedTo == schemeStat$TypeWishlistItem.sharedTo && this.ugcItemType == schemeStat$TypeWishlistItem.ugcItemType && epx.f(this.ugcItemOwnerId, schemeStat$TypeWishlistItem.ugcItemOwnerId) && epx.f(this.ugcItemId, schemeStat$TypeWishlistItem.ugcItemId) && epx.f(this.wishItemUserId, schemeStat$TypeWishlistItem.wishItemUserId) && epx.f(this.wishItemId, schemeStat$TypeWishlistItem.wishItemId) && epx.f(this.marketItemOwnerId, schemeStat$TypeWishlistItem.marketItemOwnerId) && epx.f(this.marketItemId, schemeStat$TypeWishlistItem.marketItemId) && epx.f(this.link, schemeStat$TypeWishlistItem.link) && epx.f(this.collectionId, schemeStat$TypeWishlistItem.collectionId) && epx.f(this.adCampaignId, schemeStat$TypeWishlistItem.adCampaignId) && epx.f(this.b, schemeStat$TypeWishlistItem.b) && epx.f(this.c, schemeStat$TypeWishlistItem.c) && epx.f(this.ideaId, schemeStat$TypeWishlistItem.ideaId) && epx.f(this.ideaName, schemeStat$TypeWishlistItem.ideaName) && epx.f(this.wishId, schemeStat$TypeWishlistItem.wishId) && this.refScreen == schemeStat$TypeWishlistItem.refScreen && epx.f(this.d, schemeStat$TypeWishlistItem.d);
    }

    public final String f() {
        return this.link;
    }

    public final Integer g() {
        return this.marketItemId;
    }

    public final Long h() {
        return this.marketItemOwnerId;
    }

    public final int hashCode() {
        int hashCode = (this.screen.hashCode() + (this.eventType.hashCode() * 31)) * 31;
        WishesBlockType wishesBlockType = this.wishesBlockType;
        int hashCode2 = (hashCode + (wishesBlockType == null ? 0 : wishesBlockType.hashCode())) * 31;
        String str = this.a;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SharedTo sharedTo = this.sharedTo;
        int hashCode4 = (hashCode3 + (sharedTo == null ? 0 : sharedTo.hashCode())) * 31;
        UgcItemType ugcItemType = this.ugcItemType;
        int hashCode5 = (hashCode4 + (ugcItemType == null ? 0 : ugcItemType.hashCode())) * 31;
        Long l = this.ugcItemOwnerId;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.ugcItemId;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.wishItemUserId;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num2 = this.wishItemId;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l3 = this.marketItemOwnerId;
        int hashCode10 = (hashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num3 = this.marketItemId;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.link;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num4 = this.collectionId;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.adCampaignId;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.b;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.c;
        int hashCode16 = (hashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num6 = this.ideaId;
        int hashCode17 = (hashCode16 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str5 = this.ideaName;
        int hashCode18 = (hashCode17 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num7 = this.wishId;
        int hashCode19 = (hashCode18 + (num7 == null ? 0 : num7.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.refScreen;
        int hashCode20 = (hashCode19 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        String str6 = this.d;
        return hashCode20 + (str6 != null ? str6.hashCode() : 0);
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen i() {
        return this.refScreen;
    }

    public final Screen j() {
        return this.screen;
    }

    public final SharedTo k() {
        return this.sharedTo;
    }

    public final Integer l() {
        return this.ugcItemId;
    }

    public final Long m() {
        return this.ugcItemOwnerId;
    }

    public final UgcItemType n() {
        return this.ugcItemType;
    }

    public final Integer o() {
        return this.wishId;
    }

    public final Integer p() {
        return this.wishItemId;
    }

    public final Long q() {
        return this.wishItemUserId;
    }

    public final WishesBlockType r() {
        return this.wishesBlockType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeWishlistItem(eventType=");
        sb.append(this.eventType);
        sb.append(", screen=");
        sb.append(this.screen);
        sb.append(", wishesBlockType=");
        sb.append(this.wishesBlockType);
        sb.append(", searchText=");
        sb.append(this.a);
        sb.append(", sharedTo=");
        sb.append(this.sharedTo);
        sb.append(", ugcItemType=");
        sb.append(this.ugcItemType);
        sb.append(", ugcItemOwnerId=");
        sb.append(this.ugcItemOwnerId);
        sb.append(", ugcItemId=");
        sb.append(this.ugcItemId);
        sb.append(", wishItemUserId=");
        sb.append(this.wishItemUserId);
        sb.append(", wishItemId=");
        sb.append(this.wishItemId);
        sb.append(", marketItemOwnerId=");
        sb.append(this.marketItemOwnerId);
        sb.append(", marketItemId=");
        sb.append(this.marketItemId);
        sb.append(", link=");
        sb.append(this.link);
        sb.append(", collectionId=");
        sb.append(this.collectionId);
        sb.append(", adCampaignId=");
        sb.append(this.adCampaignId);
        sb.append(", adCampaignSource=");
        sb.append(this.b);
        sb.append(", wishItemName=");
        sb.append(this.c);
        sb.append(", ideaId=");
        sb.append(this.ideaId);
        sb.append(", ideaName=");
        sb.append(this.ideaName);
        sb.append(", wishId=");
        sb.append(this.wishId);
        sb.append(", refScreen=");
        sb.append(this.refScreen);
        sb.append(", vkPlatform=");
        return ho8.a(sb, this.d, ')');
    }

    public /* synthetic */ SchemeStat$TypeWishlistItem(EventType eventType, Screen screen, WishesBlockType wishesBlockType, String str, SharedTo sharedTo, UgcItemType ugcItemType, Long l, Integer num, Long l2, Integer num2, Long l3, Integer num3, String str2, Integer num4, Integer num5, String str3, String str4, Integer num6, String str5, Integer num7, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str6, int i, zcl zclVar) {
        this(eventType, screen, (i & 4) != 0 ? null : wishesBlockType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : sharedTo, (i & 32) != 0 ? null : ugcItemType, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : l3, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : str2, (i & 8192) != 0 ? null : num4, (i & 16384) != 0 ? null : num5, (32768 & i) != 0 ? null : str3, (65536 & i) != 0 ? null : str4, (131072 & i) != 0 ? null : num6, (262144 & i) != 0 ? null : str5, (524288 & i) != 0 ? null : num7, (1048576 & i) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 2097152) != 0 ? null : str6);
    }
}
