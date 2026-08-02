package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressBlockCarouselClickItem {

    @pmi0("product_click")
    private final SchemeStat$TypeAliexpressProductClickItem productClick;

    @pmi0("promo_click")
    private final SchemeStat$TypeAliexpressPromoClickItem promoClick;

    @pmi0("show_all_click")
    private final SchemeStat$TypeAliexpressShowAllClickItem showAllClick;

    @pmi0("source")
    private final Source source;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;

        @pmi0("product_buy_button")
        public static final Source PRODUCT_BUY_BUTTON;

        @pmi0("product_image")
        public static final Source PRODUCT_IMAGE;

        static {
            Source source = new Source("PRODUCT_IMAGE", 0);
            PRODUCT_IMAGE = source;
            Source source2 = new Source("PRODUCT_BUY_BUTTON", 1);
            PRODUCT_BUY_BUTTON = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
        }

        private Source(String str, int i) {
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("product_click")
        public static final Type PRODUCT_CLICK;

        @pmi0("promo_click")
        public static final Type PROMO_CLICK;

        @pmi0("show_all_click")
        public static final Type SHOW_ALL_CLICK;

        static {
            Type type = new Type("PRODUCT_CLICK", 0);
            PRODUCT_CLICK = type;
            Type type2 = new Type("SHOW_ALL_CLICK", 1);
            SHOW_ALL_CLICK = type2;
            Type type3 = new Type("PROMO_CLICK", 2);
            PROMO_CLICK = type3;
            Type[] typeArr = {type, type2, type3};
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

    private SchemeStat$TypeAliexpressBlockCarouselClickItem(Type type, String str, Source source, SchemeStat$TypeAliexpressProductClickItem schemeStat$TypeAliexpressProductClickItem, SchemeStat$TypeAliexpressShowAllClickItem schemeStat$TypeAliexpressShowAllClickItem, SchemeStat$TypeAliexpressPromoClickItem schemeStat$TypeAliexpressPromoClickItem) {
        this.type = type;
        this.trackCode = str;
        this.source = source;
        this.productClick = schemeStat$TypeAliexpressProductClickItem;
        this.showAllClick = schemeStat$TypeAliexpressShowAllClickItem;
        this.promoClick = schemeStat$TypeAliexpressPromoClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressBlockCarouselClickItem)) {
            return false;
        }
        SchemeStat$TypeAliexpressBlockCarouselClickItem schemeStat$TypeAliexpressBlockCarouselClickItem = (SchemeStat$TypeAliexpressBlockCarouselClickItem) obj;
        return this.type == schemeStat$TypeAliexpressBlockCarouselClickItem.type && epx.f(this.trackCode, schemeStat$TypeAliexpressBlockCarouselClickItem.trackCode) && this.source == schemeStat$TypeAliexpressBlockCarouselClickItem.source && epx.f(this.productClick, schemeStat$TypeAliexpressBlockCarouselClickItem.productClick) && epx.f(this.showAllClick, schemeStat$TypeAliexpressBlockCarouselClickItem.showAllClick) && epx.f(this.promoClick, schemeStat$TypeAliexpressBlockCarouselClickItem.promoClick);
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.trackCode);
        Source source = this.source;
        int hashCode = (a + (source == null ? 0 : source.hashCode())) * 31;
        SchemeStat$TypeAliexpressProductClickItem schemeStat$TypeAliexpressProductClickItem = this.productClick;
        int hashCode2 = (hashCode + (schemeStat$TypeAliexpressProductClickItem == null ? 0 : schemeStat$TypeAliexpressProductClickItem.hashCode())) * 31;
        SchemeStat$TypeAliexpressShowAllClickItem schemeStat$TypeAliexpressShowAllClickItem = this.showAllClick;
        int hashCode3 = (hashCode2 + (schemeStat$TypeAliexpressShowAllClickItem == null ? 0 : schemeStat$TypeAliexpressShowAllClickItem.hashCode())) * 31;
        SchemeStat$TypeAliexpressPromoClickItem schemeStat$TypeAliexpressPromoClickItem = this.promoClick;
        return hashCode3 + (schemeStat$TypeAliexpressPromoClickItem != null ? schemeStat$TypeAliexpressPromoClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAliexpressBlockCarouselClickItem(type=" + this.type + ", trackCode=" + this.trackCode + ", source=" + this.source + ", productClick=" + this.productClick + ", showAllClick=" + this.showAllClick + ", promoClick=" + this.promoClick + ')';
    }

    public /* synthetic */ SchemeStat$TypeAliexpressBlockCarouselClickItem(Type type, String str, Source source, SchemeStat$TypeAliexpressProductClickItem schemeStat$TypeAliexpressProductClickItem, SchemeStat$TypeAliexpressShowAllClickItem schemeStat$TypeAliexpressShowAllClickItem, SchemeStat$TypeAliexpressPromoClickItem schemeStat$TypeAliexpressPromoClickItem, int i, zcl zclVar) {
        this(type, str, (i & 4) != 0 ? null : source, (i & 8) != 0 ? null : schemeStat$TypeAliexpressProductClickItem, (i & 16) != 0 ? null : schemeStat$TypeAliexpressShowAllClickItem, (i & 32) != 0 ? null : schemeStat$TypeAliexpressPromoClickItem);
    }
}
