package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsBlockCarouselViewItem {

    @pmi0("category_view")
    private final SchemeStat$TypeClassifiedsCategoryViewItem categoryView;

    @pmi0("group_category_view")
    private final SchemeStat$TypeClassifiedsGroupCategoryViewItem groupCategoryView;

    @pmi0("product_view")
    private final SchemeStat$TypeClassifiedsProductViewItem productView;

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

        @pmi0("category_view")
        public static final Type CATEGORY_VIEW;

        @pmi0("group_category_view")
        public static final Type GROUP_CATEGORY_VIEW;

        @pmi0("product_view")
        public static final Type PRODUCT_VIEW;

        static {
            Type type = new Type("PRODUCT_VIEW", 0);
            PRODUCT_VIEW = type;
            Type type2 = new Type("CATEGORY_VIEW", 1);
            CATEGORY_VIEW = type2;
            Type type3 = new Type("GROUP_CATEGORY_VIEW", 2);
            GROUP_CATEGORY_VIEW = type3;
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

    private SchemeStat$TypeClassifiedsBlockCarouselViewItem(Type type, String str, SchemeStat$TypeClassifiedsProductViewItem schemeStat$TypeClassifiedsProductViewItem, SchemeStat$TypeClassifiedsCategoryViewItem schemeStat$TypeClassifiedsCategoryViewItem, SchemeStat$TypeClassifiedsGroupCategoryViewItem schemeStat$TypeClassifiedsGroupCategoryViewItem) {
        this.type = type;
        this.trackCode = str;
        this.productView = schemeStat$TypeClassifiedsProductViewItem;
        this.categoryView = schemeStat$TypeClassifiedsCategoryViewItem;
        this.groupCategoryView = schemeStat$TypeClassifiedsGroupCategoryViewItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsBlockCarouselViewItem)) {
            return false;
        }
        SchemeStat$TypeClassifiedsBlockCarouselViewItem schemeStat$TypeClassifiedsBlockCarouselViewItem = (SchemeStat$TypeClassifiedsBlockCarouselViewItem) obj;
        return this.type == schemeStat$TypeClassifiedsBlockCarouselViewItem.type && epx.f(this.trackCode, schemeStat$TypeClassifiedsBlockCarouselViewItem.trackCode) && epx.f(this.productView, schemeStat$TypeClassifiedsBlockCarouselViewItem.productView) && epx.f(this.categoryView, schemeStat$TypeClassifiedsBlockCarouselViewItem.categoryView) && epx.f(this.groupCategoryView, schemeStat$TypeClassifiedsBlockCarouselViewItem.groupCategoryView);
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.trackCode);
        SchemeStat$TypeClassifiedsProductViewItem schemeStat$TypeClassifiedsProductViewItem = this.productView;
        int hashCode = (a + (schemeStat$TypeClassifiedsProductViewItem == null ? 0 : schemeStat$TypeClassifiedsProductViewItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsCategoryViewItem schemeStat$TypeClassifiedsCategoryViewItem = this.categoryView;
        int hashCode2 = (hashCode + (schemeStat$TypeClassifiedsCategoryViewItem == null ? 0 : schemeStat$TypeClassifiedsCategoryViewItem.hashCode())) * 31;
        SchemeStat$TypeClassifiedsGroupCategoryViewItem schemeStat$TypeClassifiedsGroupCategoryViewItem = this.groupCategoryView;
        return hashCode2 + (schemeStat$TypeClassifiedsGroupCategoryViewItem != null ? schemeStat$TypeClassifiedsGroupCategoryViewItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeClassifiedsBlockCarouselViewItem(type=" + this.type + ", trackCode=" + this.trackCode + ", productView=" + this.productView + ", categoryView=" + this.categoryView + ", groupCategoryView=" + this.groupCategoryView + ')';
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsBlockCarouselViewItem(Type type, String str, SchemeStat$TypeClassifiedsProductViewItem schemeStat$TypeClassifiedsProductViewItem, SchemeStat$TypeClassifiedsCategoryViewItem schemeStat$TypeClassifiedsCategoryViewItem, SchemeStat$TypeClassifiedsGroupCategoryViewItem schemeStat$TypeClassifiedsGroupCategoryViewItem, int i, zcl zclVar) {
        this(type, str, (i & 4) != 0 ? null : schemeStat$TypeClassifiedsProductViewItem, (i & 8) != 0 ? null : schemeStat$TypeClassifiedsCategoryViewItem, (i & 16) != 0 ? null : schemeStat$TypeClassifiedsGroupCategoryViewItem);
    }
}
