package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsBlockCarouselClickItem {

    @pmi0("category_click")
    private final SchemeStat$TypeClassifiedsCategoryClickItem categoryClick;

    @pmi0("create_product_click")
    private final SchemeStat$TypeClassifiedsCreateProductClickItem createProductClick;

    @pmi0("group_category_click")
    private final SchemeStat$TypeClassifiedsGroupCategoryClickItem groupCategoryClick;

    @pmi0("product_click")
    private final SchemeStat$TypeClassifiedsProductClickItem productClick;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("category_click")
        public static final Type CATEGORY_CLICK;

        @pmi0("create_product_click")
        public static final Type CREATE_PRODUCT_CLICK;

        @pmi0("group_category_click")
        public static final Type GROUP_CATEGORY_CLICK;

        @pmi0("product_click")
        public static final Type PRODUCT_CLICK;

        static {
            Type type = new Type("PRODUCT_CLICK", 0);
            PRODUCT_CLICK = type;
            Type type2 = new Type("CATEGORY_CLICK", 1);
            CATEGORY_CLICK = type2;
            Type type3 = new Type("GROUP_CATEGORY_CLICK", 2);
            GROUP_CATEGORY_CLICK = type3;
            Type type4 = new Type("CREATE_PRODUCT_CLICK", 3);
            CREATE_PRODUCT_CLICK = type4;
            Type[] typeArr = {type, type2, type3, type4};
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

    private SchemeStat$TypeClassifiedsBlockCarouselClickItem(Type type, String str, SchemeStat$TypeClassifiedsProductClickItem schemeStat$TypeClassifiedsProductClickItem, SchemeStat$TypeClassifiedsCategoryClickItem schemeStat$TypeClassifiedsCategoryClickItem, SchemeStat$TypeClassifiedsGroupCategoryClickItem schemeStat$TypeClassifiedsGroupCategoryClickItem, SchemeStat$TypeClassifiedsCreateProductClickItem schemeStat$TypeClassifiedsCreateProductClickItem) {
        this.type = type;
        this.trackCode = str;
        this.productClick = schemeStat$TypeClassifiedsProductClickItem;
        this.categoryClick = schemeStat$TypeClassifiedsCategoryClickItem;
        this.groupCategoryClick = schemeStat$TypeClassifiedsGroupCategoryClickItem;
        this.createProductClick = schemeStat$TypeClassifiedsCreateProductClickItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsBlockCarouselClickItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsBlockCarouselClickItem schemeStat$TypeClassifiedsBlockCarouselClickItem = (SchemeStat$TypeClassifiedsBlockCarouselClickItem) obj;
        return this.type == schemeStat$TypeClassifiedsBlockCarouselClickItem.type && epx.f(this.trackCode, schemeStat$TypeClassifiedsBlockCarouselClickItem.trackCode) && epx.f(this.productClick, schemeStat$TypeClassifiedsBlockCarouselClickItem.productClick) && epx.f(this.categoryClick, schemeStat$TypeClassifiedsBlockCarouselClickItem.categoryClick) && epx.f(this.groupCategoryClick, schemeStat$TypeClassifiedsBlockCarouselClickItem.groupCategoryClick) && epx.f(this.createProductClick, schemeStat$TypeClassifiedsBlockCarouselClickItem.createProductClick);
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.trackCode);
        SchemeStat$TypeClassifiedsProductClickItem schemeStat$TypeClassifiedsProductClickItem = this.productClick;
        int hashCode = (a + (schemeStat$TypeClassifiedsProductClickItem == null ? 0 : schemeStat$TypeClassifiedsProductClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCategoryClickItem schemeStat$TypeClassifiedsCategoryClickItem = this.categoryClick;
        int hashCode2 = (hashCode + (schemeStat$TypeClassifiedsCategoryClickItem == null ? 0 : schemeStat$TypeClassifiedsCategoryClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsGroupCategoryClickItem schemeStat$TypeClassifiedsGroupCategoryClickItem = this.groupCategoryClick;
        int hashCode3 = (hashCode2 + (schemeStat$TypeClassifiedsGroupCategoryClickItem == null ? 0 : schemeStat$TypeClassifiedsGroupCategoryClickItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCreateProductClickItem schemeStat$TypeClassifiedsCreateProductClickItem = this.createProductClick;
        return hashCode3 + (schemeStat$TypeClassifiedsCreateProductClickItem != null ? schemeStat$TypeClassifiedsCreateProductClickItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsBlockCarouselClickItem(type=" + this.type + ", trackCode=" + this.trackCode + ", productClick=" + this.productClick + ", categoryClick=" + this.categoryClick + ", groupCategoryClick=" + this.groupCategoryClick + ", createProductClick=" + this.createProductClick + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsBlockCarouselClickItem(Type type, String str, SchemeStat$TypeClassifiedsProductClickItem schemeStat$TypeClassifiedsProductClickItem, SchemeStat$TypeClassifiedsCategoryClickItem schemeStat$TypeClassifiedsCategoryClickItem, SchemeStat$TypeClassifiedsGroupCategoryClickItem schemeStat$TypeClassifiedsGroupCategoryClickItem, SchemeStat$TypeClassifiedsCreateProductClickItem schemeStat$TypeClassifiedsCreateProductClickItem, int i, zcl zclVar) {
        this(type, str, (i & 4) != 0 ? null : schemeStat$TypeClassifiedsProductClickItem, (i & 8) != 0 ? null : schemeStat$TypeClassifiedsCategoryClickItem, (i & 16) != 0 ? null : schemeStat$TypeClassifiedsGroupCategoryClickItem, (i & 32) != 0 ? null : schemeStat$TypeClassifiedsCreateProductClickItem);
    }
}
