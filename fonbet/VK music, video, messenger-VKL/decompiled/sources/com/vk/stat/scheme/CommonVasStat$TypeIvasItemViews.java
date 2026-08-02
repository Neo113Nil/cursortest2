package com.vk.stat.scheme;

import com.google.gson.Gson;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.List;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.fw3;
import xsna.ho8;
import xsna.ing;
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

/* compiled from: CommonVasStat.kt */
/* loaded from: classes11.dex */
public final class CommonVasStat$TypeIvasItemViews implements SchemeStat$TypeView.b {
    public final transient String a;

    @pmi0("block_position_id")
    private final Integer blockPositionId;

    @pmi0("block_type")
    private final BlockType blockType;

    @pmi0("display_location_context")
    private final CommonVasStat$TypeDisplayLocationContext displayLocationContext;

    @pmi0("keyword")
    private final FilteredString filteredKeyword;

    @pmi0("gift_entry_id")
    private final String giftEntryId;

    @pmi0("is_autoscrolled")
    private final Boolean isAutoscrolled;

    @pmi0("item_ids")
    private final List<Integer> itemIds;

    @pmi0("item_type")
    private final ItemType itemType;

    @pmi0("position_offset")
    private final Integer positionOffset;

    @pmi0("ref")
    private final CommonStat$TypeTrackCodeItem ref;

    @pmi0("viewed_user_id")
    private final Long viewedUserId;

    @pmi0("viewed_window_amount")
    private final Integer viewedWindowAmount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVasStat.kt */
    /* loaded from: classes5.dex */
    public static final class BlockType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BlockType[] $VALUES;

        @pmi0("birthday_banner")
        public static final BlockType BIRTHDAY_BANNER;

        @pmi0("block")
        public static final BlockType BLOCK;

        @pmi0("collection")
        public static final BlockType COLLECTION;

        @pmi0("holiday_banner")
        public static final BlockType HOLIDAY_BANNER;

        @pmi0("keyboard")
        public static final BlockType KEYBOARD;

        @pmi0("list")
        public static final BlockType LIST;

        @pmi0("screen")
        public static final BlockType SCREEN;

        @pmi0("send_element")
        public static final BlockType SEND_ELEMENT;

        @pmi0("suggestion")
        public static final BlockType SUGGESTION;

        @pmi0("suggestions_banner")
        public static final BlockType SUGGESTIONS_BANNER;

        @pmi0("welcome_banner")
        public static final BlockType WELCOME_BANNER;

        @pmi0("widget")
        public static final BlockType WIDGET;

        static {
            BlockType blockType = new BlockType("BLOCK", 0);
            BLOCK = blockType;
            BlockType blockType2 = new BlockType("LIST", 1);
            LIST = blockType2;
            BlockType blockType3 = new BlockType("BIRTHDAY_BANNER", 2);
            BIRTHDAY_BANNER = blockType3;
            BlockType blockType4 = new BlockType("HOLIDAY_BANNER", 3);
            HOLIDAY_BANNER = blockType4;
            BlockType blockType5 = new BlockType("SUGGESTIONS_BANNER", 4);
            SUGGESTIONS_BANNER = blockType5;
            BlockType blockType6 = new BlockType("WELCOME_BANNER", 5);
            WELCOME_BANNER = blockType6;
            BlockType blockType7 = new BlockType("SEND_ELEMENT", 6);
            SEND_ELEMENT = blockType7;
            BlockType blockType8 = new BlockType("COLLECTION", 7);
            COLLECTION = blockType8;
            BlockType blockType9 = new BlockType("KEYBOARD", 8);
            KEYBOARD = blockType9;
            BlockType blockType10 = new BlockType("SCREEN", 9);
            SCREEN = blockType10;
            BlockType blockType11 = new BlockType("WIDGET", 10);
            WIDGET = blockType11;
            BlockType blockType12 = new BlockType("SUGGESTION", 11);
            SUGGESTION = blockType12;
            BlockType[] blockTypeArr = {blockType, blockType2, blockType3, blockType4, blockType5, blockType6, blockType7, blockType8, blockType9, blockType10, blockType11, blockType12};
            $VALUES = blockTypeArr;
            $ENTRIES = new asp(blockTypeArr);
        }

        private BlockType(String str, int i) {
        }

        public static BlockType valueOf(String str) {
            return (BlockType) Enum.valueOf(BlockType.class, str);
        }

        public static BlockType[] values() {
            return (BlockType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonVasStat.kt */
    /* loaded from: classes5.dex */
    public static final class ItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;

        @pmi0("emoji_status")
        public static final ItemType EMOJI_STATUS;

        @pmi0("emoji_status_pack")
        public static final ItemType EMOJI_STATUS_PACK;

        @pmi0("entrypoint")
        public static final ItemType ENTRYPOINT;

        @pmi0("gift")
        public static final ItemType GIFT;

        @pmi0("sticker")
        public static final ItemType STICKER;

        @pmi0("sticker_pack")
        public static final ItemType STICKER_PACK;

        @pmi0("sticker_pack_for_choice")
        public static final ItemType STICKER_PACK_FOR_CHOICE;

        @pmi0("vmoji_item")
        public static final ItemType VMOJI_ITEM;

        static {
            ItemType itemType = new ItemType("GIFT", 0);
            GIFT = itemType;
            ItemType itemType2 = new ItemType("STICKER_PACK", 1);
            STICKER_PACK = itemType2;
            ItemType itemType3 = new ItemType("STICKER_PACK_FOR_CHOICE", 2);
            STICKER_PACK_FOR_CHOICE = itemType3;
            ItemType itemType4 = new ItemType("STICKER", 3);
            STICKER = itemType4;
            ItemType itemType5 = new ItemType("VMOJI_ITEM", 4);
            VMOJI_ITEM = itemType5;
            ItemType itemType6 = new ItemType("EMOJI_STATUS_PACK", 5);
            EMOJI_STATUS_PACK = itemType6;
            ItemType itemType7 = new ItemType("EMOJI_STATUS", 6);
            EMOJI_STATUS = itemType7;
            ItemType itemType8 = new ItemType("ENTRYPOINT", 7);
            ENTRYPOINT = itemType8;
            ItemType[] itemTypeArr = {itemType, itemType2, itemType3, itemType4, itemType5, itemType6, itemType7, itemType8};
            $VALUES = itemTypeArr;
            $ENTRIES = new asp(itemTypeArr);
        }

        private ItemType(String str, int i) {
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonVasStat.kt */
    public static final class PersistenceSerializer implements uay<CommonVasStat$TypeIvasItemViews>, a9y<CommonVasStat$TypeIvasItemViews> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            ItemType itemType = (ItemType) dq.f(x9yVar, "item_type", tru.a(), ItemType.class);
            List list = (List) tru.a().fromJson(x9yVar.q("item_ids").k(), new ing().getType());
            Integer A = fai.A(x9yVar, "block_position_id");
            Gson a = tru.a();
            b9y q = x9yVar.q("block_type");
            Object obj = null;
            BlockType blockType = (BlockType) ((q == null || (q instanceof u9y)) ? null : a.fromJson(q.k(), BlockType.class));
            Gson a2 = tru.a();
            b9y q2 = x9yVar.q("display_location_context");
            CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext = (CommonVasStat$TypeDisplayLocationContext) ((q2 == null || (q2 instanceof u9y)) ? null : a2.fromJson(q2.k(), CommonVasStat$TypeDisplayLocationContext.class));
            Integer A2 = fai.A(x9yVar, "position_offset");
            Gson a3 = tru.a();
            b9y q3 = x9yVar.q("ref");
            if (q3 != null && !(q3 instanceof u9y)) {
                obj = a3.fromJson(q3.k(), (Class<Object>) CommonStat$TypeTrackCodeItem.class);
            }
            return new CommonVasStat$TypeIvasItemViews(itemType, list, A, blockType, commonVasStat$TypeDisplayLocationContext, A2, (CommonStat$TypeTrackCodeItem) obj, fai.A(x9yVar, "viewed_window_amount"), fai.B(x9yVar, "viewed_user_id"), fai.y(x9yVar, "is_autoscrolled"), fai.C(x9yVar, "keyword"), fai.C(x9yVar, "gift_entry_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonVasStat$TypeIvasItemViews commonVasStat$TypeIvasItemViews = (CommonVasStat$TypeIvasItemViews) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("item_type", tru.a().toJson(commonVasStat$TypeIvasItemViews.f()));
            x9yVar.o("item_ids", tru.a().toJson(commonVasStat$TypeIvasItemViews.e()));
            x9yVar.n("block_position_id", commonVasStat$TypeIvasItemViews.a());
            x9yVar.o("block_type", tru.a().toJson(commonVasStat$TypeIvasItemViews.b()));
            x9yVar.o("display_location_context", tru.a().toJson(commonVasStat$TypeIvasItemViews.c()));
            x9yVar.n("position_offset", commonVasStat$TypeIvasItemViews.g());
            x9yVar.o("ref", tru.a().toJson(commonVasStat$TypeIvasItemViews.h()));
            x9yVar.n("viewed_window_amount", commonVasStat$TypeIvasItemViews.j());
            x9yVar.n("viewed_user_id", commonVasStat$TypeIvasItemViews.i());
            x9yVar.m(commonVasStat$TypeIvasItemViews.k(), "is_autoscrolled");
            x9yVar.o("keyword", commonVasStat$TypeIvasItemViews.a);
            x9yVar.o("gift_entry_id", commonVasStat$TypeIvasItemViews.d());
            return x9yVar;
        }
    }

    public CommonVasStat$TypeIvasItemViews(ItemType itemType, List<Integer> list, Integer num, BlockType blockType, CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext, Integer num2, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, Integer num3, Long l, Boolean bool, String str, String str2) {
        this.itemType = itemType;
        this.itemIds = list;
        this.blockPositionId = num;
        this.blockType = blockType;
        this.displayLocationContext = commonVasStat$TypeDisplayLocationContext;
        this.positionOffset = num2;
        this.ref = commonStat$TypeTrackCodeItem;
        this.viewedWindowAmount = num3;
        this.viewedUserId = l;
        this.isAutoscrolled = bool;
        this.a = str;
        this.giftEntryId = str2;
        FilteredString filteredString = new FilteredString(lhg.b(32));
        this.filteredKeyword = filteredString;
        filteredString.a(str);
    }

    public final Integer a() {
        return this.blockPositionId;
    }

    public final BlockType b() {
        return this.blockType;
    }

    public final CommonVasStat$TypeDisplayLocationContext c() {
        return this.displayLocationContext;
    }

    public final String d() {
        return this.giftEntryId;
    }

    public final List<Integer> e() {
        return this.itemIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonVasStat$TypeIvasItemViews)) {
            return false;
        }
        CommonVasStat$TypeIvasItemViews commonVasStat$TypeIvasItemViews = (CommonVasStat$TypeIvasItemViews) obj;
        return this.itemType == commonVasStat$TypeIvasItemViews.itemType && epx.f(this.itemIds, commonVasStat$TypeIvasItemViews.itemIds) && epx.f(this.blockPositionId, commonVasStat$TypeIvasItemViews.blockPositionId) && this.blockType == commonVasStat$TypeIvasItemViews.blockType && epx.f(this.displayLocationContext, commonVasStat$TypeIvasItemViews.displayLocationContext) && epx.f(this.positionOffset, commonVasStat$TypeIvasItemViews.positionOffset) && epx.f(this.ref, commonVasStat$TypeIvasItemViews.ref) && epx.f(this.viewedWindowAmount, commonVasStat$TypeIvasItemViews.viewedWindowAmount) && epx.f(this.viewedUserId, commonVasStat$TypeIvasItemViews.viewedUserId) && epx.f(this.isAutoscrolled, commonVasStat$TypeIvasItemViews.isAutoscrolled) && epx.f(this.a, commonVasStat$TypeIvasItemViews.a) && epx.f(this.giftEntryId, commonVasStat$TypeIvasItemViews.giftEntryId);
    }

    public final ItemType f() {
        return this.itemType;
    }

    public final Integer g() {
        return this.positionOffset;
    }

    public final CommonStat$TypeTrackCodeItem h() {
        return this.ref;
    }

    public final int hashCode() {
        int a = fw3.a(this.itemType.hashCode() * 31, 31, this.itemIds);
        Integer num = this.blockPositionId;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        BlockType blockType = this.blockType;
        int hashCode2 = (hashCode + (blockType == null ? 0 : blockType.hashCode())) * 31;
        CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext = this.displayLocationContext;
        int hashCode3 = (hashCode2 + (commonVasStat$TypeDisplayLocationContext == null ? 0 : commonVasStat$TypeDisplayLocationContext.hashCode())) * 31;
        Integer num2 = this.positionOffset;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem = this.ref;
        int hashCode5 = (hashCode4 + (commonStat$TypeTrackCodeItem == null ? 0 : commonStat$TypeTrackCodeItem.a.hashCode())) * 31;
        Integer num3 = this.viewedWindowAmount;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.viewedUserId;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isAutoscrolled;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.a;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.giftEntryId;
        return hashCode9 + (str2 != null ? str2.hashCode() : 0);
    }

    public final Long i() {
        return this.viewedUserId;
    }

    public final Integer j() {
        return this.viewedWindowAmount;
    }

    public final Boolean k() {
        return this.isAutoscrolled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeIvasItemViews(itemType=");
        sb.append(this.itemType);
        sb.append(", itemIds=");
        sb.append(this.itemIds);
        sb.append(", blockPositionId=");
        sb.append(this.blockPositionId);
        sb.append(", blockType=");
        sb.append(this.blockType);
        sb.append(", displayLocationContext=");
        sb.append(this.displayLocationContext);
        sb.append(", positionOffset=");
        sb.append(this.positionOffset);
        sb.append(", ref=");
        sb.append(this.ref);
        sb.append(", viewedWindowAmount=");
        sb.append(this.viewedWindowAmount);
        sb.append(", viewedUserId=");
        sb.append(this.viewedUserId);
        sb.append(", isAutoscrolled=");
        sb.append(this.isAutoscrolled);
        sb.append(", keyword=");
        sb.append(this.a);
        sb.append(", giftEntryId=");
        return ho8.a(sb, this.giftEntryId, ')');
    }

    public /* synthetic */ CommonVasStat$TypeIvasItemViews(ItemType itemType, List list, Integer num, BlockType blockType, CommonVasStat$TypeDisplayLocationContext commonVasStat$TypeDisplayLocationContext, Integer num2, CommonStat$TypeTrackCodeItem commonStat$TypeTrackCodeItem, Integer num3, Long l, Boolean bool, String str, String str2, int i, zcl zclVar) {
        this(itemType, list, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : blockType, (i & 16) != 0 ? null : commonVasStat$TypeDisplayLocationContext, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : commonStat$TypeTrackCodeItem, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : str2);
    }
}
