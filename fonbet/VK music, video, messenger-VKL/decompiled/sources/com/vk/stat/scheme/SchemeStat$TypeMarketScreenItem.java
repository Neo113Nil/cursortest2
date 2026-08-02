package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$NavigationScreenInfoItem;
import com.vk.stat.scheme.SchemeStat$TypeNavgo;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeMarketScreenItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_market_orders_item")
    private final CommonMarketStat$TypeMarketOrdersItem typeMarketOrdersItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_market_orders_item")
        public static final Type TYPE_MARKET_ORDERS_ITEM;

        static {
            Type type = new Type("TYPE_MARKET_ORDERS_ITEM", 0);
            TYPE_MARKET_ORDERS_ITEM = type;
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

    public /* synthetic */ SchemeStat$TypeMarketScreenItem(Type type, CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem, zcl zclVar) {
        this(type, commonMarketStat$TypeMarketOrdersItem);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeMarketScreenItem)) {
            return false;
        }
        SchemeStat$TypeMarketScreenItem schemeStat$TypeMarketScreenItem = (SchemeStat$TypeMarketScreenItem) obj;
        return this.type == schemeStat$TypeMarketScreenItem.type && epx.f(this.typeMarketOrdersItem, schemeStat$TypeMarketScreenItem.typeMarketOrdersItem);
    }

    public final int hashCode() {
        Type type = this.type;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem = this.typeMarketOrdersItem;
        return hashCode + (commonMarketStat$TypeMarketOrdersItem != null ? commonMarketStat$TypeMarketOrdersItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeMarketScreenItem(type=" + this.type + ", typeMarketOrdersItem=" + this.typeMarketOrdersItem + ')';
    }

    private SchemeStat$TypeMarketScreenItem(Type type, CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem) {
        this.type = type;
        this.typeMarketOrdersItem = commonMarketStat$TypeMarketOrdersItem;
    }

    public /* synthetic */ SchemeStat$TypeMarketScreenItem(Type type, CommonMarketStat$TypeMarketOrdersItem commonMarketStat$TypeMarketOrdersItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : type, (i & 2) != 0 ? null : commonMarketStat$TypeMarketOrdersItem);
    }
}
