package com.vk.stat.scheme;

import com.ironsource.X3;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.pmi0;
import xsna.vu5;
import xsna.zrp;

/* compiled from: MobileOfficialAppsStickersStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsStickersStat$TypeStickersClickItem implements SchemeStat$TypeClick.b {

    @pmi0("click_type")
    private final ClickType clickType;

    @pmi0(X3.i.L)
    private final int position;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsStickersStat.kt */
    public static final class ClickType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ClickType[] $VALUES;

        @pmi0("keyboard_long_tap")
        public static final ClickType KEYBOARD_LONG_TAP;

        @pmi0("keyboard_suggest")
        public static final ClickType KEYBOARD_SUGGEST;

        @pmi0("layer_long_tap")
        public static final ClickType LAYER_LONG_TAP;

        static {
            ClickType clickType = new ClickType("KEYBOARD_LONG_TAP", 0);
            KEYBOARD_LONG_TAP = clickType;
            ClickType clickType2 = new ClickType("KEYBOARD_SUGGEST", 1);
            KEYBOARD_SUGGEST = clickType2;
            ClickType clickType3 = new ClickType("LAYER_LONG_TAP", 2);
            LAYER_LONG_TAP = clickType3;
            ClickType[] clickTypeArr = {clickType, clickType2, clickType3};
            $VALUES = clickTypeArr;
            $ENTRIES = new asp(clickTypeArr);
        }

        private ClickType(String str, int i) {
        }

        public static ClickType valueOf(String str) {
            return (ClickType) Enum.valueOf(ClickType.class, str);
        }

        public static ClickType[] values() {
            return (ClickType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsStickersStat$TypeStickersClickItem(ClickType clickType, int i) {
        this.clickType = clickType;
        this.position = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsStickersStat$TypeStickersClickItem)) {
            return false;
        }
        MobileOfficialAppsStickersStat$TypeStickersClickItem mobileOfficialAppsStickersStat$TypeStickersClickItem = (MobileOfficialAppsStickersStat$TypeStickersClickItem) obj;
        return this.clickType == mobileOfficialAppsStickersStat$TypeStickersClickItem.clickType && this.position == mobileOfficialAppsStickersStat$TypeStickersClickItem.position;
    }

    public final int hashCode() {
        return Integer.hashCode(this.position) + (this.clickType.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeStickersClickItem(clickType=");
        sb.append(this.clickType);
        sb.append(", position=");
        return vu5.b(sb, this.position, ')');
    }
}
