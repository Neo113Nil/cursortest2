package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeClick;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressClick implements SchemeStat$TypeClick.b {

    @pmi0("block_carousel_click")
    private final SchemeStat$TypeAliexpressBlockCarouselClickItem blockCarouselClick;

    @pmi0("type")
    private final Type type;

    @pmi0("type_aliexpress_product_hide")
    private final CommonEcommStat$TypeAliexpressProductHideItem typeAliexpressProductHide;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("block_carousel_click")
        public static final Type BLOCK_CAROUSEL_CLICK;

        @pmi0("type_aliexpress_product_hide")
        public static final Type TYPE_ALIEXPRESS_PRODUCT_HIDE;

        static {
            Type type = new Type("BLOCK_CAROUSEL_CLICK", 0);
            BLOCK_CAROUSEL_CLICK = type;
            Type type2 = new Type("TYPE_ALIEXPRESS_PRODUCT_HIDE", 1);
            TYPE_ALIEXPRESS_PRODUCT_HIDE = type2;
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

    private SchemeStat$TypeAliexpressClick(Type type, SchemeStat$TypeAliexpressBlockCarouselClickItem schemeStat$TypeAliexpressBlockCarouselClickItem, CommonEcommStat$TypeAliexpressProductHideItem commonEcommStat$TypeAliexpressProductHideItem) {
        this.type = type;
        this.blockCarouselClick = schemeStat$TypeAliexpressBlockCarouselClickItem;
        this.typeAliexpressProductHide = commonEcommStat$TypeAliexpressProductHideItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressClick)) {
            return false;
        }
        SchemeStat$TypeAliexpressClick schemeStat$TypeAliexpressClick = (SchemeStat$TypeAliexpressClick) obj;
        return this.type == schemeStat$TypeAliexpressClick.type && epx.f(this.blockCarouselClick, schemeStat$TypeAliexpressClick.blockCarouselClick) && epx.f(this.typeAliexpressProductHide, schemeStat$TypeAliexpressClick.typeAliexpressProductHide);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        SchemeStat$TypeAliexpressBlockCarouselClickItem schemeStat$TypeAliexpressBlockCarouselClickItem = this.blockCarouselClick;
        int hashCode2 = (hashCode + (schemeStat$TypeAliexpressBlockCarouselClickItem == null ? 0 : schemeStat$TypeAliexpressBlockCarouselClickItem.hashCode())) * 31;
        CommonEcommStat$TypeAliexpressProductHideItem commonEcommStat$TypeAliexpressProductHideItem = this.typeAliexpressProductHide;
        return hashCode2 + (commonEcommStat$TypeAliexpressProductHideItem != null ? commonEcommStat$TypeAliexpressProductHideItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAliexpressClick(type=" + this.type + ", blockCarouselClick=" + this.blockCarouselClick + ", typeAliexpressProductHide=" + this.typeAliexpressProductHide + ')';
    }

    public /* synthetic */ SchemeStat$TypeAliexpressClick(Type type, SchemeStat$TypeAliexpressBlockCarouselClickItem schemeStat$TypeAliexpressBlockCarouselClickItem, CommonEcommStat$TypeAliexpressProductHideItem commonEcommStat$TypeAliexpressProductHideItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : schemeStat$TypeAliexpressBlockCarouselClickItem, (i & 4) != 0 ? null : commonEcommStat$TypeAliexpressProductHideItem);
    }
}
