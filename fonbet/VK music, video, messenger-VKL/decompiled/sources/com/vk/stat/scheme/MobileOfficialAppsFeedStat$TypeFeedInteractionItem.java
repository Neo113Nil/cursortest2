package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
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

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsFeedStat$TypeFeedInteractionItem implements SchemeStat$TypeClick.b {
    public final transient String a;

    @pmi0("feed_item_track_code")
    private final MobileOfficialAppsFeedStat$TypeFeedItemTrackCode feedItemTrackCode;

    @pmi0("ref")
    private final FilteredString filteredRef;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final Item item;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    /* loaded from: classes5.dex */
    public static final class Item {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Item[] $VALUES;

        @pmi0("audio_attachment")
        public static final Item AUDIO_ATTACHMENT;

        @pmi0("donut_paywall_item")
        public static final Item DONUT_PAYWALL_ITEM;

        @pmi0("geo_attachment")
        public static final Item GEO_ATTACHMENT;

        @pmi0("market_link_attachment")
        public static final Item MARKET_LINK_ATTACHMENT;

        @pmi0("message_to_bc_attachment")
        public static final Item MESSAGE_TO_BC_ATTACHMENT;

        @pmi0("online_booking_attachment")
        public static final Item ONLINE_BOOKING_ATTACHMENT;

        @pmi0("report_menu_item")
        public static final Item REPORT_MENU_ITEM;

        @pmi0("video_attachment")
        public static final Item VIDEO_ATTACHMENT;

        @pmi0("wiki_attachment_open_button")
        public static final Item WIKI_ATTACHMENT_OPEN_BUTTON;

        static {
            Item item = new Item("WIKI_ATTACHMENT_OPEN_BUTTON", 0);
            WIKI_ATTACHMENT_OPEN_BUTTON = item;
            Item item2 = new Item("DONUT_PAYWALL_ITEM", 1);
            DONUT_PAYWALL_ITEM = item2;
            Item item3 = new Item("REPORT_MENU_ITEM", 2);
            REPORT_MENU_ITEM = item3;
            Item item4 = new Item("VIDEO_ATTACHMENT", 3);
            VIDEO_ATTACHMENT = item4;
            Item item5 = new Item("AUDIO_ATTACHMENT", 4);
            AUDIO_ATTACHMENT = item5;
            Item item6 = new Item("ONLINE_BOOKING_ATTACHMENT", 5);
            ONLINE_BOOKING_ATTACHMENT = item6;
            Item item7 = new Item("MARKET_LINK_ATTACHMENT", 6);
            MARKET_LINK_ATTACHMENT = item7;
            Item item8 = new Item("MESSAGE_TO_BC_ATTACHMENT", 7);
            MESSAGE_TO_BC_ATTACHMENT = item8;
            Item item9 = new Item("GEO_ATTACHMENT", 8);
            GEO_ATTACHMENT = item9;
            Item[] itemArr = {item, item2, item3, item4, item5, item6, item7, item8, item9};
            $VALUES = itemArr;
            $ENTRIES = new asp(itemArr);
        }

        private Item(String str, int i) {
        }

        public static Item valueOf(String str) {
            return (Item) Enum.valueOf(Item.class, str);
        }

        public static Item[] values() {
            return (Item[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsFeedStat$TypeFeedInteractionItem>, a9y<MobileOfficialAppsFeedStat$TypeFeedInteractionItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            Gson a = tru.a();
            b9y q = x9yVar.q(DatabaseHelper.ITEM_COLUMN_NAME);
            Object obj = null;
            Item item = (Item) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), Item.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("feed_item_track_code");
            if (q2 != null && !(q2 instanceof u9y)) {
                obj = a2.fromJson(q2.k(), (Class<Object>) MobileOfficialAppsFeedStat$TypeFeedItemTrackCode.class);
            }
            return new MobileOfficialAppsFeedStat$TypeFeedInteractionItem(item, (MobileOfficialAppsFeedStat$TypeFeedItemTrackCode) obj, fai.C(x9yVar, "ref"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsFeedStat$TypeFeedInteractionItem mobileOfficialAppsFeedStat$TypeFeedInteractionItem = (MobileOfficialAppsFeedStat$TypeFeedInteractionItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o(DatabaseHelper.ITEM_COLUMN_NAME, tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedInteractionItem.b()));
            x9yVar.o("feed_item_track_code", tru.a().toJson(mobileOfficialAppsFeedStat$TypeFeedInteractionItem.a()));
            x9yVar.o("ref", mobileOfficialAppsFeedStat$TypeFeedInteractionItem.a);
            return x9yVar;
        }
    }

    public MobileOfficialAppsFeedStat$TypeFeedInteractionItem() {
        this(null, null, null, 7, null);
    }

    public final MobileOfficialAppsFeedStat$TypeFeedItemTrackCode a() {
        return this.feedItemTrackCode;
    }

    public final Item b() {
        return this.item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeFeedInteractionItem)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeFeedInteractionItem mobileOfficialAppsFeedStat$TypeFeedInteractionItem = (MobileOfficialAppsFeedStat$TypeFeedInteractionItem) obj;
        return this.item == mobileOfficialAppsFeedStat$TypeFeedInteractionItem.item && epx.f(this.feedItemTrackCode, mobileOfficialAppsFeedStat$TypeFeedInteractionItem.feedItemTrackCode) && epx.f(this.a, mobileOfficialAppsFeedStat$TypeFeedInteractionItem.a);
    }

    public final int hashCode() {
        Item item = this.item;
        int hashCode = (item == null ? 0 : item.hashCode()) * 31;
        MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode = this.feedItemTrackCode;
        int hashCode2 = (hashCode + (mobileOfficialAppsFeedStat$TypeFeedItemTrackCode == null ? 0 : mobileOfficialAppsFeedStat$TypeFeedItemTrackCode.hashCode())) * 31;
        String str = this.a;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedInteractionItem(item=");
        sb.append(this.item);
        sb.append(", feedItemTrackCode=");
        sb.append(this.feedItemTrackCode);
        sb.append(", ref=");
        return ho8.a(sb, this.a, ')');
    }

    public MobileOfficialAppsFeedStat$TypeFeedInteractionItem(Item item, MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode, String str) {
        this.item = item;
        this.feedItemTrackCode = mobileOfficialAppsFeedStat$TypeFeedItemTrackCode;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(64));
        this.filteredRef = filteredString;
        filteredString.a(str);
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeFeedInteractionItem(Item item, MobileOfficialAppsFeedStat$TypeFeedItemTrackCode mobileOfficialAppsFeedStat$TypeFeedItemTrackCode, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : item, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$TypeFeedItemTrackCode, (i & 4) != 0 ? null : str);
    }
}
