package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem {

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("item_click")
        public static final Type ITEM_CLICK;

        @pmi0("show_all_click")
        public static final Type SHOW_ALL_CLICK;

        static {
            Type type = new Type("ITEM_CLICK", 0);
            ITEM_CLICK = type;
            Type type2 = new Type("SHOW_ALL_CLICK", 1);
            SHOW_ALL_CLICK = type2;
            Type[] typeArr = {type, type2};
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

    public MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem(Type type) {
        this.type = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem) && this.type == ((MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem) obj).type;
    }

    public final int hashCode() {
        return this.type.hashCode();
    }

    public final String toString() {
        return "TypeMarketBlockCarouselClickItem(type=" + this.type + ')';
    }
}
