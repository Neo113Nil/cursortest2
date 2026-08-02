package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsFeedStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsFeedStat$TypeMarketCarouselClick implements SchemeStat$TypeClick.b {

    @pmi0("block_carousel_click")
    private final MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem blockCarouselClick;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsFeedStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("block_carousel_click")
        public static final Type BLOCK_CAROUSEL_CLICK;

        static {
            Type type = new Type("BLOCK_CAROUSEL_CLICK", 0);
            BLOCK_CAROUSEL_CLICK = type;
            Type[] typeArr = {type};
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

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeMarketCarouselClick(Type type, MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem, zcl zclVar) {
        this(type, mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsFeedStat$TypeMarketCarouselClick)) {
            return false;
        }
        MobileOfficialAppsFeedStat$TypeMarketCarouselClick mobileOfficialAppsFeedStat$TypeMarketCarouselClick = (MobileOfficialAppsFeedStat$TypeMarketCarouselClick) obj;
        return this.type == mobileOfficialAppsFeedStat$TypeMarketCarouselClick.type && epx.f(this.blockCarouselClick, mobileOfficialAppsFeedStat$TypeMarketCarouselClick.blockCarouselClick);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem = this.blockCarouselClick;
        return hashCode + (mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem != null ? mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketCarouselClick(type=" + this.type + ", blockCarouselClick=" + this.blockCarouselClick + ')';
    }

    private MobileOfficialAppsFeedStat$TypeMarketCarouselClick(Type type, MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem) {
        this.type = type;
        this.blockCarouselClick = mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem;
    }

    public /* synthetic */ MobileOfficialAppsFeedStat$TypeMarketCarouselClick(Type type, MobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : mobileOfficialAppsFeedStat$TypeMarketBlockCarouselClickItem);
    }
}
