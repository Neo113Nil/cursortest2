package com.vk.stat.sak.scheme;

import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$TypeMultiaccountsItem implements SchemeStatSak$TypeAction.b {

    @pmi0("current_accounts_num")
    private final int currentAccountsNum;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("fields")
    private final List<SchemeStatSak$MultiaccountFieldItem> fields;

    @pmi0("master_user_id")
    private final Long masterUserId;

    @pmi0("master_user_reg_time")
    private final Long masterUserRegTime;

    @pmi0("metadata")
    private final String metadata;

    @pmi0("multiacc_id")
    private final String multiaccId;

    @pmi0("multiacc_reg_time")
    private final long multiaccRegTime;

    @pmi0("prev_user_id")
    private final long prevUserId;

    @pmi0("related_category")
    private final Integer relatedCategory;

    @pmi0("user_id")
    private final long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("add_account")
        public static final EventType ADD_ACCOUNT;

        @pmi0("complete_onboarding")
        public static final EventType COMPLETE_ONBOARDING;

        @pmi0("complete_onboarding_long_tap")
        public static final EventType COMPLETE_ONBOARDING_LONG_TAP;

        @pmi0("create_multiacc")
        public static final EventType CREATE_MULTIACC;

        @pmi0("create_multiacc_silent")
        public static final EventType CREATE_MULTIACC_SILENT;

        @pmi0("drop_account")
        public static final EventType DROP_ACCOUNT;

        @pmi0("switch")
        public static final EventType SWITCH;

        @pmi0("switch_add_auth")
        public static final EventType SWITCH_ADD_AUTH;

        @pmi0("switch_from_push")
        public static final EventType SWITCH_FROM_PUSH;

        @pmi0("switch_from_switcher")
        public static final EventType SWITCH_FROM_SWITCHER;

        @pmi0("switch_from_switcher_lk_vkid")
        public static final EventType SWITCH_FROM_SWITCHER_LK_VKID;

        @pmi0("switch_from_switcher_longtap")
        public static final EventType SWITCH_FROM_SWITCHER_LONGTAP;

        @pmi0("switch_from_switcher_profile")
        public static final EventType SWITCH_FROM_SWITCHER_PROFILE;

        @pmi0("switch_from_switcher_services_menu")
        public static final EventType SWITCH_FROM_SWITCHER_SERVICES_MENU;

        @pmi0("switch_from_switcher_settings")
        public static final EventType SWITCH_FROM_SWITCHER_SETTINGS;

        @pmi0("switch_from_switcher_settings_logout")
        public static final EventType SWITCH_FROM_SWITCHER_SETTINGS_LOGOUT;

        @pmi0("switch_from_switcher_share_external")
        public static final EventType SWITCH_FROM_SWITCHER_SHARE_EXTERNAL;

        @pmi0("switch_from_switcher_web_app")
        public static final EventType SWITCH_FROM_SWITCHER_WEB_APP;

        static {
            EventType eventType = new EventType("CREATE_MULTIACC", 0);
            CREATE_MULTIACC = eventType;
            EventType eventType2 = new EventType("CREATE_MULTIACC_SILENT", 1);
            CREATE_MULTIACC_SILENT = eventType2;
            EventType eventType3 = new EventType("ADD_ACCOUNT", 2);
            ADD_ACCOUNT = eventType3;
            EventType eventType4 = new EventType("DROP_ACCOUNT", 3);
            DROP_ACCOUNT = eventType4;
            EventType eventType5 = new EventType("SWITCH_FROM_SWITCHER", 4);
            SWITCH_FROM_SWITCHER = eventType5;
            EventType eventType6 = new EventType("SWITCH_FROM_PUSH", 5);
            SWITCH_FROM_PUSH = eventType6;
            EventType eventType7 = new EventType("SWITCH", 6);
            SWITCH = eventType7;
            EventType eventType8 = new EventType("COMPLETE_ONBOARDING", 7);
            COMPLETE_ONBOARDING = eventType8;
            EventType eventType9 = new EventType("COMPLETE_ONBOARDING_LONG_TAP", 8);
            COMPLETE_ONBOARDING_LONG_TAP = eventType9;
            EventType eventType10 = new EventType("SWITCH_FROM_SWITCHER_SETTINGS_LOGOUT", 9);
            SWITCH_FROM_SWITCHER_SETTINGS_LOGOUT = eventType10;
            EventType eventType11 = new EventType("SWITCH_FROM_SWITCHER_PROFILE", 10);
            SWITCH_FROM_SWITCHER_PROFILE = eventType11;
            EventType eventType12 = new EventType("SWITCH_FROM_SWITCHER_LK_VKID", 11);
            SWITCH_FROM_SWITCHER_LK_VKID = eventType12;
            EventType eventType13 = new EventType("SWITCH_FROM_SWITCHER_WEB_APP", 12);
            SWITCH_FROM_SWITCHER_WEB_APP = eventType13;
            EventType eventType14 = new EventType("SWITCH_ADD_AUTH", 13);
            SWITCH_ADD_AUTH = eventType14;
            EventType eventType15 = new EventType("SWITCH_FROM_SWITCHER_SERVICES_MENU", 14);
            SWITCH_FROM_SWITCHER_SERVICES_MENU = eventType15;
            EventType eventType16 = new EventType("SWITCH_FROM_SWITCHER_SETTINGS", 15);
            SWITCH_FROM_SWITCHER_SETTINGS = eventType16;
            EventType eventType17 = new EventType("SWITCH_FROM_SWITCHER_LONGTAP", 16);
            SWITCH_FROM_SWITCHER_LONGTAP = eventType17;
            EventType eventType18 = new EventType("SWITCH_FROM_SWITCHER_SHARE_EXTERNAL", 17);
            SWITCH_FROM_SWITCHER_SHARE_EXTERNAL = eventType18;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        private EventType(String str, int i) {
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public SchemeStatSak$TypeMultiaccountsItem(String str, long j, EventType eventType, long j2, long j3, int i, String str2, Long l, Long l2, Integer num, List<SchemeStatSak$MultiaccountFieldItem> list) {
        this.multiaccId = str;
        this.multiaccRegTime = j;
        this.eventType = eventType;
        this.userId = j2;
        this.prevUserId = j3;
        this.currentAccountsNum = i;
        this.metadata = str2;
        this.masterUserId = l;
        this.masterUserRegTime = l2;
        this.relatedCategory = num;
        this.fields = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$TypeMultiaccountsItem)) {
            return false;
        }
        SchemeStatSak$TypeMultiaccountsItem schemeStatSak$TypeMultiaccountsItem = (SchemeStatSak$TypeMultiaccountsItem) obj;
        return epx.f(this.multiaccId, schemeStatSak$TypeMultiaccountsItem.multiaccId) && this.multiaccRegTime == schemeStatSak$TypeMultiaccountsItem.multiaccRegTime && this.eventType == schemeStatSak$TypeMultiaccountsItem.eventType && this.userId == schemeStatSak$TypeMultiaccountsItem.userId && this.prevUserId == schemeStatSak$TypeMultiaccountsItem.prevUserId && this.currentAccountsNum == schemeStatSak$TypeMultiaccountsItem.currentAccountsNum && epx.f(this.metadata, schemeStatSak$TypeMultiaccountsItem.metadata) && epx.f(this.masterUserId, schemeStatSak$TypeMultiaccountsItem.masterUserId) && epx.f(this.masterUserRegTime, schemeStatSak$TypeMultiaccountsItem.masterUserRegTime) && epx.f(this.relatedCategory, schemeStatSak$TypeMultiaccountsItem.relatedCategory) && epx.f(this.fields, schemeStatSak$TypeMultiaccountsItem.fields);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.currentAccountsNum, bh10.a(bh10.a((this.eventType.hashCode() + bh10.a(this.multiaccId.hashCode() * 31, 31, this.multiaccRegTime)) * 31, 31, this.userId), 31, this.prevUserId), 31), 31, this.metadata);
        Long l = this.masterUserId;
        int hashCode = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.masterUserRegTime;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.relatedCategory;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<SchemeStatSak$MultiaccountFieldItem> list = this.fields;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMultiaccountsItem(multiaccId=");
        sb.append(this.multiaccId);
        sb.append(", multiaccRegTime=");
        sb.append(this.multiaccRegTime);
        sb.append(", eventType=");
        sb.append(this.eventType);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", prevUserId=");
        sb.append(this.prevUserId);
        sb.append(", currentAccountsNum=");
        sb.append(this.currentAccountsNum);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", masterUserId=");
        sb.append(this.masterUserId);
        sb.append(", masterUserRegTime=");
        sb.append(this.masterUserRegTime);
        sb.append(", relatedCategory=");
        sb.append(this.relatedCategory);
        sb.append(", fields=");
        return ms9.a(')', sb, this.fields);
    }

    public /* synthetic */ SchemeStatSak$TypeMultiaccountsItem(String str, long j, EventType eventType, long j2, long j3, int i, String str2, Long l, Long l2, Integer num, List list, int i2, zcl zclVar) {
        this(str, j, eventType, j2, j3, i, str2, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : l2, (i2 & 512) != 0 ? null : num, (i2 & 1024) != 0 ? null : list);
    }
}
