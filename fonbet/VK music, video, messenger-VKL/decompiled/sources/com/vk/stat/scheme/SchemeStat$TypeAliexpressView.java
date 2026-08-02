package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressView implements SchemeStat$TypeView.b {

    @pmi0("block_carousel_view")
    private final SchemeStat$TypeAliexpressBlockCarouselViewItem blockCarouselView;

    @pmi0("type")
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("block_carousel_view")
        public static final Type BLOCK_CAROUSEL_VIEW;

        static {
            Type type = new Type("BLOCK_CAROUSEL_VIEW", 0);
            BLOCK_CAROUSEL_VIEW = type;
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

    public /* synthetic */ SchemeStat$TypeAliexpressView(Type type, SchemeStat$TypeAliexpressBlockCarouselViewItem schemeStat$TypeAliexpressBlockCarouselViewItem, zcl zclVar) {
        this(type, schemeStat$TypeAliexpressBlockCarouselViewItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressView)) {
            return false;
        }
        SchemeStat$TypeAliexpressView schemeStat$TypeAliexpressView = (SchemeStat$TypeAliexpressView) obj;
        return this.type == schemeStat$TypeAliexpressView.type && epx.f(this.blockCarouselView, schemeStat$TypeAliexpressView.blockCarouselView);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        SchemeStat$TypeAliexpressBlockCarouselViewItem schemeStat$TypeAliexpressBlockCarouselViewItem = this.blockCarouselView;
        return hashCode + (schemeStat$TypeAliexpressBlockCarouselViewItem != null ? schemeStat$TypeAliexpressBlockCarouselViewItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAliexpressView(type=" + this.type + ", blockCarouselView=" + this.blockCarouselView + ')';
    }

    private SchemeStat$TypeAliexpressView(Type type, SchemeStat$TypeAliexpressBlockCarouselViewItem schemeStat$TypeAliexpressBlockCarouselViewItem) {
        this.type = type;
        this.blockCarouselView = schemeStat$TypeAliexpressBlockCarouselViewItem;
    }

    public /* synthetic */ SchemeStat$TypeAliexpressView(Type type, SchemeStat$TypeAliexpressBlockCarouselViewItem schemeStat$TypeAliexpressBlockCarouselViewItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : schemeStat$TypeAliexpressBlockCarouselViewItem);
    }
}
