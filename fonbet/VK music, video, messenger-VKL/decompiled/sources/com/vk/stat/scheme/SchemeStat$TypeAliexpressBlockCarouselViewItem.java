package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressBlockCarouselViewItem {

    @pmi0("product_view")
    private final SchemeStat$TypeAliexpressProductViewItem productView;

    @pmi0("promo_view")
    private final SchemeStat$TypeAliexpressPromoViewItem promoView;

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

        @pmi0("product_view")
        public static final Type PRODUCT_VIEW;

        @pmi0("promo_view")
        public static final Type PROMO_VIEW;

        static {
            Type type = new Type("PRODUCT_VIEW", 0);
            PRODUCT_VIEW = type;
            Type type2 = new Type("PROMO_VIEW", 1);
            PROMO_VIEW = type2;
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

    private SchemeStat$TypeAliexpressBlockCarouselViewItem(Type type, String str, SchemeStat$TypeAliexpressProductViewItem schemeStat$TypeAliexpressProductViewItem, SchemeStat$TypeAliexpressPromoViewItem schemeStat$TypeAliexpressPromoViewItem) {
        this.type = type;
        this.trackCode = str;
        this.productView = schemeStat$TypeAliexpressProductViewItem;
        this.promoView = schemeStat$TypeAliexpressPromoViewItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressBlockCarouselViewItem)) {
            return false;
        }
        SchemeStat$TypeAliexpressBlockCarouselViewItem schemeStat$TypeAliexpressBlockCarouselViewItem = (SchemeStat$TypeAliexpressBlockCarouselViewItem) obj;
        return this.type == schemeStat$TypeAliexpressBlockCarouselViewItem.type && epx.f(this.trackCode, schemeStat$TypeAliexpressBlockCarouselViewItem.trackCode) && epx.f(this.productView, schemeStat$TypeAliexpressBlockCarouselViewItem.productView) && epx.f(this.promoView, schemeStat$TypeAliexpressBlockCarouselViewItem.promoView);
    }

    public final int hashCode() {
        int a = urd0.a(this.type.hashCode() * 31, 31, this.trackCode);
        SchemeStat$TypeAliexpressProductViewItem schemeStat$TypeAliexpressProductViewItem = this.productView;
        int hashCode = (a + (schemeStat$TypeAliexpressProductViewItem == null ? 0 : schemeStat$TypeAliexpressProductViewItem.hashCode())) * 31;
        SchemeStat$TypeAliexpressPromoViewItem schemeStat$TypeAliexpressPromoViewItem = this.promoView;
        return hashCode + (schemeStat$TypeAliexpressPromoViewItem != null ? schemeStat$TypeAliexpressPromoViewItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAliexpressBlockCarouselViewItem(type=" + this.type + ", trackCode=" + this.trackCode + ", productView=" + this.productView + ", promoView=" + this.promoView + ')';
    }

    public /* synthetic */ SchemeStat$TypeAliexpressBlockCarouselViewItem(Type type, String str, SchemeStat$TypeAliexpressProductViewItem schemeStat$TypeAliexpressProductViewItem, SchemeStat$TypeAliexpressPromoViewItem schemeStat$TypeAliexpressPromoViewItem, int i, zcl zclVar) {
        this(type, str, (i & 4) != 0 ? null : schemeStat$TypeAliexpressProductViewItem, (i & 8) != 0 ? null : schemeStat$TypeAliexpressPromoViewItem);
    }
}
