package com.vk.stat.scheme;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$SuperappMenuItem {

    @pmi0("id")
    private final Id id;

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

        @pmi0("ads_easy_promote")
        public static final Id ADS_EASY_PROMOTE;

        @pmi0("afisha")
        public static final Id AFISHA;

        @pmi0("aliexpress")
        public static final Id ALIEXPRESS;

        @pmi0("assistant")
        public static final Id ASSISTANT;

        @pmi0("audios")
        public static final Id AUDIOS;

        @pmi0("bookmarks")
        public static final Id BOOKMARKS;

        @pmi0("checkback")
        public static final Id CHECKBACK;

        @pmi0("classifieds")
        public static final Id CLASSIFIEDS;

        @pmi0("clips")
        public static final Id CLIPS;

        @pmi0("compass")
        public static final Id COMPASS;

        @pmi0("coupons")
        public static final Id COUPONS;

        @pmi0("dating")
        public static final Id DATING;

        @pmi0("delivery_club")
        public static final Id DELIVERY_CLUB;

        @pmi0("documents")
        public static final Id DOCUMENTS;

        @pmi0("events")
        public static final Id EVENTS;

        @pmi0("friends")
        public static final Id FRIENDS;

        @pmi0("games")
        public static final Id GAMES;

        @pmi0("gifts")
        public static final Id GIFTS;

        @pmi0("groups")
        public static final Id GROUPS;

        @pmi0("health")
        public static final Id HEALTH;

        @pmi0("likes")
        public static final Id LIKES;

        @pmi0("lives")
        public static final Id LIVES;

        @pmi0("masks")
        public static final Id MASKS;

        @pmi0("mini_apps")
        public static final Id MINI_APPS;

        @pmi0("more")
        public static final Id MORE;

        @pmi0("news")
        public static final Id NEWS;

        @pmi0("payments")
        public static final Id PAYMENTS;

        @pmi0("photos")
        public static final Id PHOTOS;

        @pmi0("podcasts")
        public static final Id PODCASTS;

        @pmi0("recommendations")
        public static final Id RECOMMENDATIONS;

        @pmi0("settings")
        public static final Id SETTINGS;

        @pmi0("shopping")
        public static final Id SHOPPING;

        @pmi0("stickers")
        public static final Id STICKERS;

        @pmi0("videos")
        public static final Id VIDEOS;

        @pmi0("vkcom_email")
        public static final Id VKCOM_EMAIL;

        @pmi0("vk_calls")
        public static final Id VK_CALLS;

        @pmi0("vk_dating")
        public static final Id VK_DATING;

        @pmi0("vk_party")
        public static final Id VK_PARTY;

        @pmi0("vk_pay")
        public static final Id VK_PAY;

        @pmi0("vk_taxi")
        public static final Id VK_TAXI;

        @pmi0("wheel_of_fortune")
        public static final Id WHEEL_OF_FORTUNE;

        @pmi0("work")
        public static final Id WORK;

        static {
            Id id = new Id("GROUPS", 0);
            GROUPS = id;
            Id id2 = new Id("AUDIOS", 1);
            AUDIOS = id2;
            Id id3 = new Id("VIDEOS", 2);
            VIDEOS = id3;
            Id id4 = new Id("MINI_APPS", 3);
            MINI_APPS = id4;
            Id id5 = new Id("GAMES", 4);
            GAMES = id5;
            Id id6 = new Id("LIVES", 5);
            LIVES = id6;
            Id id7 = new Id("PODCASTS", 6);
            PODCASTS = id7;
            Id id8 = new Id("EVENTS", 7);
            EVENTS = id8;
            Id id9 = new Id("STICKERS", 8);
            STICKERS = id9;
            Id id10 = new Id("SHOPPING", 9);
            SHOPPING = id10;
            Id id11 = new Id("VK_PAY", 10);
            VK_PAY = id11;
            Id id12 = new Id("AFISHA", 11);
            AFISHA = id12;
            Id id13 = new Id(Privacy.FRIENDS, 12);
            FRIENDS = id13;
            Id id14 = new Id("VK_CALLS", 13);
            VK_CALLS = id14;
            Id id15 = new Id("ADS_EASY_PROMOTE", 14);
            ADS_EASY_PROMOTE = id15;
            Id id16 = new Id("COUPONS", 15);
            COUPONS = id16;
            Id id17 = new Id("WHEEL_OF_FORTUNE", 16);
            WHEEL_OF_FORTUNE = id17;
            Id id18 = new Id("HEALTH", 17);
            HEALTH = id18;
            Id id19 = new Id("CLASSIFIEDS", 18);
            CLASSIFIEDS = id19;
            Id id20 = new Id("VK_TAXI", 19);
            VK_TAXI = id20;
            Id id21 = new Id("DELIVERY_CLUB", 20);
            DELIVERY_CLUB = id21;
            Id id22 = new Id("ALIEXPRESS", 21);
            ALIEXPRESS = id22;
            Id id23 = new Id("CHECKBACK", 22);
            CHECKBACK = id23;
            Id id24 = new Id("WORK", 23);
            WORK = id24;
            Id id25 = new Id("DATING", 24);
            DATING = id25;
            Id id26 = new Id("VKCOM_EMAIL", 25);
            VKCOM_EMAIL = id26;
            Id id27 = new Id("VK_DATING", 26);
            VK_DATING = id27;
            Id id28 = new Id("VK_PARTY", 27);
            VK_PARTY = id28;
            Id id29 = new Id("CLIPS", 28);
            CLIPS = id29;
            Id id30 = new Id("MORE", 29);
            MORE = id30;
            Id id31 = new Id("MASKS", 30);
            MASKS = id31;
            Id id32 = new Id("ASSISTANT", 31);
            ASSISTANT = id32;
            Id id33 = new Id("RECOMMENDATIONS", 32);
            RECOMMENDATIONS = id33;
            Id id34 = new Id("BOOKMARKS", 33);
            BOOKMARKS = id34;
            Id id35 = new Id("DOCUMENTS", 34);
            DOCUMENTS = id35;
            Id id36 = new Id("LIKES", 35);
            LIKES = id36;
            Id id37 = new Id("PHOTOS", 36);
            PHOTOS = id37;
            Id id38 = new Id("COMPASS", 37);
            COMPASS = id38;
            Id id39 = new Id("NEWS", 38);
            NEWS = id39;
            Id id40 = new Id("SETTINGS", 39);
            SETTINGS = id40;
            Id id41 = new Id("GIFTS", 40);
            GIFTS = id41;
            Id id42 = new Id("PAYMENTS", 41);
            PAYMENTS = id42;
            Id[] idArr = {id, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12, id13, id14, id15, id16, id17, id18, id19, id20, id21, id22, id23, id24, id25, id26, id27, id28, id29, id30, id31, id32, id33, id34, id35, id36, id37, id38, id39, id40, id41, id42};
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

    public SchemeStat$SuperappMenuItem() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$SuperappMenuItem)) {
            return false;
        }
        SchemeStat$SuperappMenuItem schemeStat$SuperappMenuItem = (SchemeStat$SuperappMenuItem) obj;
        return this.id == schemeStat$SuperappMenuItem.id && epx.f(this.uid, schemeStat$SuperappMenuItem.uid) && epx.f(this.superappItem, schemeStat$SuperappMenuItem.superappItem);
    }

    public final int hashCode() {
        Id id = this.id;
        int hashCode = (id == null ? 0 : id.hashCode()) * 31;
        String str = this.uid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SchemeStat$SuperappItem schemeStat$SuperappItem = this.superappItem;
        return hashCode2 + (schemeStat$SuperappItem != null ? schemeStat$SuperappItem.hashCode() : 0);
    }

    public final String toString() {
        return "SuperappMenuItem(id=" + this.id + ", uid=" + this.uid + ", superappItem=" + this.superappItem + ')';
    }

    public SchemeStat$SuperappMenuItem(Id id, String str, SchemeStat$SuperappItem schemeStat$SuperappItem) {
        this.id = id;
        this.uid = str;
        this.superappItem = schemeStat$SuperappItem;
    }

    public /* synthetic */ SchemeStat$SuperappMenuItem(Id id, String str, SchemeStat$SuperappItem schemeStat$SuperappItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : id, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : schemeStat$SuperappItem);
    }
}
