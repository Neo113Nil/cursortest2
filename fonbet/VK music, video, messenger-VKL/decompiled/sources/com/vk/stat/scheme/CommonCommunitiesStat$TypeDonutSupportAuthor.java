package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: CommonCommunitiesStat.kt */
/* loaded from: classes5.dex */
public final class CommonCommunitiesStat$TypeDonutSupportAuthor implements SchemeStat$TypeClick.b {

    @pmi0("item_type")
    private final ItemType itemType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonCommunitiesStat.kt */
    public static final class ItemType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;

        @pmi0("donut_video_blur")
        public static final ItemType DONUT_VIDEO_BLUR;

        @pmi0("teaser_post")
        public static final ItemType TEASER_POST;

        static {
            ItemType itemType = new ItemType("TEASER_POST", 0);
            TEASER_POST = itemType;
            ItemType itemType2 = new ItemType("DONUT_VIDEO_BLUR", 1);
            DONUT_VIDEO_BLUR = itemType2;
            ItemType[] itemTypeArr = {itemType, itemType2};
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

    public CommonCommunitiesStat$TypeDonutSupportAuthor(ItemType itemType) {
        this.itemType = itemType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonCommunitiesStat$TypeDonutSupportAuthor) && this.itemType == ((CommonCommunitiesStat$TypeDonutSupportAuthor) obj).itemType;
    }

    public final int hashCode() {
        return this.itemType.hashCode();
    }

    public final String toString() {
        return "TypeDonutSupportAuthor(itemType=" + this.itemType + ')';
    }
}
