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
public final class SchemeStat$TypeAwayItem implements SchemeStat$TypeNavgo.b, SchemeStat$NavigationScreenInfoItem.b {

    @pmi0("type")
    private final Type type;

    @pmi0("type_away_market")
    private final SchemeStat$TypeAwayMarket typeAwayMarket;

    @pmi0("type_marusia_conversation_item")
    private final MobileOfficialAppsMarusiaStat$TypeConversationItem typeMarusiaConversationItem;

    @pmi0("type_share_item")
    private final SchemeStat$TypeShareItem typeShareItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_away_market")
        public static final Type TYPE_AWAY_MARKET;

        @pmi0("type_marusia_conversation_item")
        public static final Type TYPE_MARUSIA_CONVERSATION_ITEM;

        @pmi0("type_share_item")
        public static final Type TYPE_SHARE_ITEM;

        static {
            Type type = new Type("TYPE_AWAY_MARKET", 0);
            TYPE_AWAY_MARKET = type;
            Type type2 = new Type("TYPE_SHARE_ITEM", 1);
            TYPE_SHARE_ITEM = type2;
            Type type3 = new Type("TYPE_MARUSIA_CONVERSATION_ITEM", 2);
            TYPE_MARUSIA_CONVERSATION_ITEM = type3;
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

    private SchemeStat$TypeAwayItem(Type type, SchemeStat$TypeAwayMarket schemeStat$TypeAwayMarket, SchemeStat$TypeShareItem schemeStat$TypeShareItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem) {
        this.type = type;
        this.typeAwayMarket = schemeStat$TypeAwayMarket;
        this.typeShareItem = schemeStat$TypeShareItem;
        this.typeMarusiaConversationItem = mobileOfficialAppsMarusiaStat$TypeConversationItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAwayItem)) {
            return false;
        }
        SchemeStat$TypeAwayItem schemeStat$TypeAwayItem = (SchemeStat$TypeAwayItem) obj;
        return this.type == schemeStat$TypeAwayItem.type && epx.f(this.typeAwayMarket, schemeStat$TypeAwayItem.typeAwayMarket) && epx.f(this.typeShareItem, schemeStat$TypeAwayItem.typeShareItem) && epx.f(this.typeMarusiaConversationItem, schemeStat$TypeAwayItem.typeMarusiaConversationItem);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        SchemeStat$TypeAwayMarket schemeStat$TypeAwayMarket = this.typeAwayMarket;
        int hashCode2 = (hashCode + (schemeStat$TypeAwayMarket == null ? 0 : schemeStat$TypeAwayMarket.hashCode())) * 31;
        SchemeStat$TypeShareItem schemeStat$TypeShareItem = this.typeShareItem;
        int hashCode3 = (hashCode2 + (schemeStat$TypeShareItem == null ? 0 : schemeStat$TypeShareItem.hashCode())) * 31;
        MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem = this.typeMarusiaConversationItem;
        return hashCode3 + (mobileOfficialAppsMarusiaStat$TypeConversationItem != null ? mobileOfficialAppsMarusiaStat$TypeConversationItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAwayItem(type=" + this.type + ", typeAwayMarket=" + this.typeAwayMarket + ", typeShareItem=" + this.typeShareItem + ", typeMarusiaConversationItem=" + this.typeMarusiaConversationItem + ')';
    }

    public /* synthetic */ SchemeStat$TypeAwayItem(Type type, SchemeStat$TypeAwayMarket schemeStat$TypeAwayMarket, SchemeStat$TypeShareItem schemeStat$TypeShareItem, MobileOfficialAppsMarusiaStat$TypeConversationItem mobileOfficialAppsMarusiaStat$TypeConversationItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : schemeStat$TypeAwayMarket, (i & 4) != 0 ? null : schemeStat$TypeShareItem, (i & 8) != 0 ? null : mobileOfficialAppsMarusiaStat$TypeConversationItem);
    }
}
