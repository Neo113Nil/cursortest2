package com.vk.stat.sak.scheme;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$TypeAction {

    @pmi0("type")
    private final Type type;

    @pmi0("type_debug_stats_item")
    private final SchemeStatSak$TypeDebugStatsItem typeDebugStatsItem;

    @pmi0("type_error_shown_item")
    private final SchemeStatSak$TypeErrorShownItem typeErrorShownItem;

    @pmi0("type_multiaccounts_item")
    private final SchemeStatSak$TypeMultiaccountsItem typeMultiaccountsItem;

    @pmi0("type_registration_item")
    private final SchemeStatSak$TypeRegistrationItem typeRegistrationItem;

    @pmi0("type_sak_sessions_event_item")
    private final SchemeStatSak$TypeSakSessionsEventItem typeSakSessionsEventItem;

    @pmi0("type_vk_connect_navigation_item")
    private final SchemeStatSak$TypeVkConnectNavigationItem typeVkConnectNavigationItem;

    @pmi0("type_vk_pay_checkout_item")
    private final SchemeStatSak$TypeVkPayCheckoutItem typeVkPayCheckoutItem;

    @pmi0("type_vkid_ecosystem_navigation_item")
    private final SchemeStatSak$TypeVkidEcosystemNavigationItem typeVkidEcosystemNavigationItem;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_debug_stats_item")
        public static final Type TYPE_DEBUG_STATS_ITEM;

        @pmi0("type_error_shown_item")
        public static final Type TYPE_ERROR_SHOWN_ITEM;

        @pmi0("type_multiaccounts_item")
        public static final Type TYPE_MULTIACCOUNTS_ITEM;

        @pmi0("type_registration_item")
        public static final Type TYPE_REGISTRATION_ITEM;

        @pmi0("type_sak_sessions_event_item")
        public static final Type TYPE_SAK_SESSIONS_EVENT_ITEM;

        @pmi0("type_vkid_ecosystem_navigation_item")
        public static final Type TYPE_VKID_ECOSYSTEM_NAVIGATION_ITEM;

        @pmi0("type_vk_connect_navigation_item")
        public static final Type TYPE_VK_CONNECT_NAVIGATION_ITEM;

        @pmi0("type_vk_pay_checkout_item")
        public static final Type TYPE_VK_PAY_CHECKOUT_ITEM;

        static {
            Type type = new Type("TYPE_REGISTRATION_ITEM", 0);
            TYPE_REGISTRATION_ITEM = type;
            Type type2 = new Type("TYPE_VK_CONNECT_NAVIGATION_ITEM", 1);
            TYPE_VK_CONNECT_NAVIGATION_ITEM = type2;
            Type type3 = new Type("TYPE_SAK_SESSIONS_EVENT_ITEM", 2);
            TYPE_SAK_SESSIONS_EVENT_ITEM = type3;
            Type type4 = new Type("TYPE_DEBUG_STATS_ITEM", 3);
            TYPE_DEBUG_STATS_ITEM = type4;
            Type type5 = new Type("TYPE_VK_PAY_CHECKOUT_ITEM", 4);
            TYPE_VK_PAY_CHECKOUT_ITEM = type5;
            Type type6 = new Type("TYPE_MULTIACCOUNTS_ITEM", 5);
            TYPE_MULTIACCOUNTS_ITEM = type6;
            Type type7 = new Type("TYPE_ERROR_SHOWN_ITEM", 6);
            TYPE_ERROR_SHOWN_ITEM = type7;
            Type type8 = new Type("TYPE_VKID_ECOSYSTEM_NAVIGATION_ITEM", 7);
            TYPE_VKID_ECOSYSTEM_NAVIGATION_ITEM = type8;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8};
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

    /* compiled from: SchemeStatSak.kt */
    public static final class a {
        public static SchemeStatSak$TypeAction a(b bVar) {
            if (bVar instanceof SchemeStatSak$TypeRegistrationItem) {
                return new SchemeStatSak$TypeAction(Type.TYPE_REGISTRATION_ITEM, (SchemeStatSak$TypeRegistrationItem) bVar, null, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED, null);
            }
            if (bVar instanceof SchemeStatSak$TypeVkConnectNavigationItem) {
                return new SchemeStatSak$TypeAction(Type.TYPE_VK_CONNECT_NAVIGATION_ITEM, null, (SchemeStatSak$TypeVkConnectNavigationItem) bVar, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE, null);
            }
            if (bVar instanceof SchemeStatSak$TypeSakSessionsEventItem) {
                return new SchemeStatSak$TypeAction(Type.TYPE_SAK_SESSIONS_EVENT_ITEM, null, null, (SchemeStatSak$TypeSakSessionsEventItem) bVar, null, null, null, null, null, 502, null);
            }
            if (bVar instanceof SchemeStatSak$TypeDebugStatsItem) {
                return new SchemeStatSak$TypeAction(Type.TYPE_DEBUG_STATS_ITEM, null, null, null, (SchemeStatSak$TypeDebugStatsItem) bVar, null, null, null, null, 494, null);
            }
            if (bVar instanceof SchemeStatSak$TypeVkPayCheckoutItem) {
                return new SchemeStatSak$TypeAction(Type.TYPE_VK_PAY_CHECKOUT_ITEM, null, null, null, null, (SchemeStatSak$TypeVkPayCheckoutItem) bVar, null, null, null, 478, null);
            }
            if (bVar instanceof SchemeStatSak$TypeMultiaccountsItem) {
                return new SchemeStatSak$TypeAction(Type.TYPE_MULTIACCOUNTS_ITEM, null, null, null, null, null, (SchemeStatSak$TypeMultiaccountsItem) bVar, null, null, 446, null);
            }
            if (bVar instanceof SchemeStatSak$TypeErrorShownItem) {
                return new SchemeStatSak$TypeAction(Type.TYPE_ERROR_SHOWN_ITEM, null, null, null, null, null, null, (SchemeStatSak$TypeErrorShownItem) bVar, null, 382, null);
            }
            if (!(bVar instanceof SchemeStatSak$TypeVkidEcosystemNavigationItem)) {
                throw new IllegalArgumentException("payload must be one of(TypeRegistrationItem, TypeVkConnectNavigationItem, TypeSakSessionsEventItem, TypeDebugStatsItem, TypeVkPayCheckoutItem, TypeMultiaccountsItem, TypeErrorShownItem, TypeVkidEcosystemNavigationItem)");
            }
            return new SchemeStatSak$TypeAction(Type.TYPE_VKID_ECOSYSTEM_NAVIGATION_ITEM, null, null, null, null, null, null, null, (SchemeStatSak$TypeVkidEcosystemNavigationItem) bVar, 254, null);
        }
    }

    /* compiled from: SchemeStatSak.kt */
    public interface b {
    }

    private SchemeStatSak$TypeAction(Type type, SchemeStatSak$TypeRegistrationItem schemeStatSak$TypeRegistrationItem, SchemeStatSak$TypeVkConnectNavigationItem schemeStatSak$TypeVkConnectNavigationItem, SchemeStatSak$TypeSakSessionsEventItem schemeStatSak$TypeSakSessionsEventItem, SchemeStatSak$TypeDebugStatsItem schemeStatSak$TypeDebugStatsItem, SchemeStatSak$TypeVkPayCheckoutItem schemeStatSak$TypeVkPayCheckoutItem, SchemeStatSak$TypeMultiaccountsItem schemeStatSak$TypeMultiaccountsItem, SchemeStatSak$TypeErrorShownItem schemeStatSak$TypeErrorShownItem, SchemeStatSak$TypeVkidEcosystemNavigationItem schemeStatSak$TypeVkidEcosystemNavigationItem) {
        this.type = type;
        this.typeRegistrationItem = schemeStatSak$TypeRegistrationItem;
        this.typeVkConnectNavigationItem = schemeStatSak$TypeVkConnectNavigationItem;
        this.typeSakSessionsEventItem = schemeStatSak$TypeSakSessionsEventItem;
        this.typeDebugStatsItem = schemeStatSak$TypeDebugStatsItem;
        this.typeVkPayCheckoutItem = schemeStatSak$TypeVkPayCheckoutItem;
        this.typeMultiaccountsItem = schemeStatSak$TypeMultiaccountsItem;
        this.typeErrorShownItem = schemeStatSak$TypeErrorShownItem;
        this.typeVkidEcosystemNavigationItem = schemeStatSak$TypeVkidEcosystemNavigationItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$TypeAction)) {
            return false;
        }
        SchemeStatSak$TypeAction schemeStatSak$TypeAction = (SchemeStatSak$TypeAction) obj;
        return this.type == schemeStatSak$TypeAction.type && epx.f(this.typeRegistrationItem, schemeStatSak$TypeAction.typeRegistrationItem) && epx.f(this.typeVkConnectNavigationItem, schemeStatSak$TypeAction.typeVkConnectNavigationItem) && epx.f(this.typeSakSessionsEventItem, schemeStatSak$TypeAction.typeSakSessionsEventItem) && epx.f(this.typeDebugStatsItem, schemeStatSak$TypeAction.typeDebugStatsItem) && epx.f(this.typeVkPayCheckoutItem, schemeStatSak$TypeAction.typeVkPayCheckoutItem) && epx.f(this.typeMultiaccountsItem, schemeStatSak$TypeAction.typeMultiaccountsItem) && epx.f(this.typeErrorShownItem, schemeStatSak$TypeAction.typeErrorShownItem) && epx.f(this.typeVkidEcosystemNavigationItem, schemeStatSak$TypeAction.typeVkidEcosystemNavigationItem);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        SchemeStatSak$TypeRegistrationItem schemeStatSak$TypeRegistrationItem = this.typeRegistrationItem;
        int hashCode2 = (hashCode + (schemeStatSak$TypeRegistrationItem == null ? 0 : schemeStatSak$TypeRegistrationItem.hashCode())) * 31;
        SchemeStatSak$TypeVkConnectNavigationItem schemeStatSak$TypeVkConnectNavigationItem = this.typeVkConnectNavigationItem;
        int hashCode3 = (hashCode2 + (schemeStatSak$TypeVkConnectNavigationItem == null ? 0 : schemeStatSak$TypeVkConnectNavigationItem.hashCode())) * 31;
        SchemeStatSak$TypeSakSessionsEventItem schemeStatSak$TypeSakSessionsEventItem = this.typeSakSessionsEventItem;
        int hashCode4 = (hashCode3 + (schemeStatSak$TypeSakSessionsEventItem == null ? 0 : schemeStatSak$TypeSakSessionsEventItem.hashCode())) * 31;
        SchemeStatSak$TypeDebugStatsItem schemeStatSak$TypeDebugStatsItem = this.typeDebugStatsItem;
        int hashCode5 = (hashCode4 + (schemeStatSak$TypeDebugStatsItem == null ? 0 : schemeStatSak$TypeDebugStatsItem.hashCode())) * 31;
        SchemeStatSak$TypeVkPayCheckoutItem schemeStatSak$TypeVkPayCheckoutItem = this.typeVkPayCheckoutItem;
        int hashCode6 = (hashCode5 + (schemeStatSak$TypeVkPayCheckoutItem == null ? 0 : schemeStatSak$TypeVkPayCheckoutItem.hashCode())) * 31;
        SchemeStatSak$TypeMultiaccountsItem schemeStatSak$TypeMultiaccountsItem = this.typeMultiaccountsItem;
        int hashCode7 = (hashCode6 + (schemeStatSak$TypeMultiaccountsItem == null ? 0 : schemeStatSak$TypeMultiaccountsItem.hashCode())) * 31;
        SchemeStatSak$TypeErrorShownItem schemeStatSak$TypeErrorShownItem = this.typeErrorShownItem;
        int hashCode8 = (hashCode7 + (schemeStatSak$TypeErrorShownItem == null ? 0 : schemeStatSak$TypeErrorShownItem.hashCode())) * 31;
        SchemeStatSak$TypeVkidEcosystemNavigationItem schemeStatSak$TypeVkidEcosystemNavigationItem = this.typeVkidEcosystemNavigationItem;
        return hashCode8 + (schemeStatSak$TypeVkidEcosystemNavigationItem != null ? schemeStatSak$TypeVkidEcosystemNavigationItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAction(type=" + this.type + ", typeRegistrationItem=" + this.typeRegistrationItem + ", typeVkConnectNavigationItem=" + this.typeVkConnectNavigationItem + ", typeSakSessionsEventItem=" + this.typeSakSessionsEventItem + ", typeDebugStatsItem=" + this.typeDebugStatsItem + ", typeVkPayCheckoutItem=" + this.typeVkPayCheckoutItem + ", typeMultiaccountsItem=" + this.typeMultiaccountsItem + ", typeErrorShownItem=" + this.typeErrorShownItem + ", typeVkidEcosystemNavigationItem=" + this.typeVkidEcosystemNavigationItem + ')';
    }

    public /* synthetic */ SchemeStatSak$TypeAction(Type type, SchemeStatSak$TypeRegistrationItem schemeStatSak$TypeRegistrationItem, SchemeStatSak$TypeVkConnectNavigationItem schemeStatSak$TypeVkConnectNavigationItem, SchemeStatSak$TypeSakSessionsEventItem schemeStatSak$TypeSakSessionsEventItem, SchemeStatSak$TypeDebugStatsItem schemeStatSak$TypeDebugStatsItem, SchemeStatSak$TypeVkPayCheckoutItem schemeStatSak$TypeVkPayCheckoutItem, SchemeStatSak$TypeMultiaccountsItem schemeStatSak$TypeMultiaccountsItem, SchemeStatSak$TypeErrorShownItem schemeStatSak$TypeErrorShownItem, SchemeStatSak$TypeVkidEcosystemNavigationItem schemeStatSak$TypeVkidEcosystemNavigationItem, int i, zcl zclVar) {
        this(type, (i & 2) != 0 ? null : schemeStatSak$TypeRegistrationItem, (i & 4) != 0 ? null : schemeStatSak$TypeVkConnectNavigationItem, (i & 8) != 0 ? null : schemeStatSak$TypeSakSessionsEventItem, (i & 16) != 0 ? null : schemeStatSak$TypeDebugStatsItem, (i & 32) != 0 ? null : schemeStatSak$TypeVkPayCheckoutItem, (i & 64) != 0 ? null : schemeStatSak$TypeMultiaccountsItem, (i & 128) != 0 ? null : schemeStatSak$TypeErrorShownItem, (i & 256) != 0 ? null : schemeStatSak$TypeVkidEcosystemNavigationItem);
    }
}
