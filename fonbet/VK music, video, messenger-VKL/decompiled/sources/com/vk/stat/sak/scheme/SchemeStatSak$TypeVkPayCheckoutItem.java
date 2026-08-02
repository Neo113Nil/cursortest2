package com.vk.stat.sak.scheme;

import com.huawei.hms.adapter.internal.CommonCode;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$TypeVkPayCheckoutItem implements SchemeStatSak$TypeAction.b {

    @pmi0("account_id")
    private final Integer accountId;

    @pmi0("account_info")
    private final String accountInfo;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("fail_reason")
    private final String failReason;

    @pmi0("is_failed")
    private final Boolean isFailed;

    @pmi0("order_id")
    private final String orderId;

    @pmi0("parent_app_id")
    private final Integer parentAppId;

    @pmi0("payment_methods")
    private final String paymentMethods;

    @pmi0("payment_methods_count")
    private final Integer paymentMethodsCount;

    @pmi0("session_id")
    private final Long sessionId;

    @pmi0(CommonCode.MapKey.TRANSACTION_ID)
    private final String transactionId;

    @pmi0("transaction_item")
    private final String transactionItem;

    @pmi0("transaction_type")
    private final String transactionType;

    @pmi0("unauth_id")
    private final String unauthId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("access_blocked")
        public static final EventType ACCESS_BLOCKED;

        @pmi0("access_restore")
        public static final EventType ACCESS_RESTORE;

        @pmi0("add_new_ps")
        public static final EventType ADD_NEW_PS;

        @pmi0("charge_money")
        public static final EventType CHARGE_MONEY;

        @pmi0("choose_ps")
        public static final EventType CHOOSE_PS;

        @pmi0("complete_session")
        public static final EventType COMPLETE_SESSION;

        @pmi0("create_vk_pay_wallet")
        public static final EventType CREATE_VK_PAY_WALLET;

        @pmi0("delete_ps")
        public static final EventType DELETE_PS;

        @pmi0("deliver_order")
        public static final EventType DELIVER_ORDER;

        @pmi0("failed")
        public static final EventType FAILED;

        @pmi0("init_transaction")
        public static final EventType INIT_TRANSACTION;

        @pmi0("new_card_accept")
        public static final EventType NEW_CARD_ACCEPT;

        @pmi0("new_pin")
        public static final EventType NEW_PIN;

        @pmi0("new_wallet_accept")
        public static final EventType NEW_WALLET_ACCEPT;

        @pmi0("payment_confirmation")
        public static final EventType PAYMENT_CONFIRMATION;

        @pmi0("show_full_pay_box")
        public static final EventType SHOW_FULL_PAY_BOX;

        @pmi0("show_instant_pay_box")
        public static final EventType SHOW_INSTANT_PAY_BOX;

        @pmi0("sms_send")
        public static final EventType SMS_SEND;

        @pmi0("start_session")
        public static final EventType START_SESSION;

        @pmi0("success")
        public static final EventType SUCCESS;

        static {
            EventType eventType = new EventType("START_SESSION", 0);
            START_SESSION = eventType;
            EventType eventType2 = new EventType("SHOW_INSTANT_PAY_BOX", 1);
            SHOW_INSTANT_PAY_BOX = eventType2;
            EventType eventType3 = new EventType("SHOW_FULL_PAY_BOX", 2);
            SHOW_FULL_PAY_BOX = eventType3;
            EventType eventType4 = new EventType("DELETE_PS", 3);
            DELETE_PS = eventType4;
            EventType eventType5 = new EventType("CREATE_VK_PAY_WALLET", 4);
            CREATE_VK_PAY_WALLET = eventType5;
            EventType eventType6 = new EventType("NEW_WALLET_ACCEPT", 5);
            NEW_WALLET_ACCEPT = eventType6;
            EventType eventType7 = new EventType("ADD_NEW_PS", 6);
            ADD_NEW_PS = eventType7;
            EventType eventType8 = new EventType("NEW_CARD_ACCEPT", 7);
            NEW_CARD_ACCEPT = eventType8;
            EventType eventType9 = new EventType("CHOOSE_PS", 8);
            CHOOSE_PS = eventType9;
            EventType eventType10 = new EventType("PAYMENT_CONFIRMATION", 9);
            PAYMENT_CONFIRMATION = eventType10;
            EventType eventType11 = new EventType("INIT_TRANSACTION", 10);
            INIT_TRANSACTION = eventType11;
            EventType eventType12 = new EventType("ACCESS_BLOCKED", 11);
            ACCESS_BLOCKED = eventType12;
            EventType eventType13 = new EventType("ACCESS_RESTORE", 12);
            ACCESS_RESTORE = eventType13;
            EventType eventType14 = new EventType("SMS_SEND", 13);
            SMS_SEND = eventType14;
            EventType eventType15 = new EventType("NEW_PIN", 14);
            NEW_PIN = eventType15;
            EventType eventType16 = new EventType("CHARGE_MONEY", 15);
            CHARGE_MONEY = eventType16;
            EventType eventType17 = new EventType("DELIVER_ORDER", 16);
            DELIVER_ORDER = eventType17;
            EventType eventType18 = new EventType("COMPLETE_SESSION", 17);
            COMPLETE_SESSION = eventType18;
            EventType eventType19 = new EventType("SUCCESS", 18);
            SUCCESS = eventType19;
            EventType eventType20 = new EventType(SignalingProtocol.HUNGUP_REASON_FAILED, 19);
            FAILED = eventType20;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20};
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

    public SchemeStatSak$TypeVkPayCheckoutItem(EventType eventType, String str, Integer num, String str2, Integer num2, String str3, String str4, Long l, Boolean bool, String str5, String str6, Integer num3, String str7, String str8) {
        this.eventType = eventType;
        this.unauthId = str;
        this.paymentMethodsCount = num;
        this.paymentMethods = str2;
        this.parentAppId = num2;
        this.transactionType = str3;
        this.transactionItem = str4;
        this.sessionId = l;
        this.isFailed = bool;
        this.failReason = str5;
        this.orderId = str6;
        this.accountId = num3;
        this.accountInfo = str7;
        this.transactionId = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$TypeVkPayCheckoutItem)) {
            return false;
        }
        SchemeStatSak$TypeVkPayCheckoutItem schemeStatSak$TypeVkPayCheckoutItem = (SchemeStatSak$TypeVkPayCheckoutItem) obj;
        return this.eventType == schemeStatSak$TypeVkPayCheckoutItem.eventType && epx.f(this.unauthId, schemeStatSak$TypeVkPayCheckoutItem.unauthId) && epx.f(this.paymentMethodsCount, schemeStatSak$TypeVkPayCheckoutItem.paymentMethodsCount) && epx.f(this.paymentMethods, schemeStatSak$TypeVkPayCheckoutItem.paymentMethods) && epx.f(this.parentAppId, schemeStatSak$TypeVkPayCheckoutItem.parentAppId) && epx.f(this.transactionType, schemeStatSak$TypeVkPayCheckoutItem.transactionType) && epx.f(this.transactionItem, schemeStatSak$TypeVkPayCheckoutItem.transactionItem) && epx.f(this.sessionId, schemeStatSak$TypeVkPayCheckoutItem.sessionId) && epx.f(this.isFailed, schemeStatSak$TypeVkPayCheckoutItem.isFailed) && epx.f(this.failReason, schemeStatSak$TypeVkPayCheckoutItem.failReason) && epx.f(this.orderId, schemeStatSak$TypeVkPayCheckoutItem.orderId) && epx.f(this.accountId, schemeStatSak$TypeVkPayCheckoutItem.accountId) && epx.f(this.accountInfo, schemeStatSak$TypeVkPayCheckoutItem.accountInfo) && epx.f(this.transactionId, schemeStatSak$TypeVkPayCheckoutItem.transactionId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.unauthId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.paymentMethodsCount;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.paymentMethods;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.parentAppId;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.transactionType;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.transactionItem;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.sessionId;
        int hashCode8 = (hashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.isFailed;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.failReason;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderId;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.accountId;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.accountInfo;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transactionId;
        return hashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVkPayCheckoutItem(eventType=");
        sb.append(this.eventType);
        sb.append(", unauthId=");
        sb.append(this.unauthId);
        sb.append(", paymentMethodsCount=");
        sb.append(this.paymentMethodsCount);
        sb.append(", paymentMethods=");
        sb.append(this.paymentMethods);
        sb.append(", parentAppId=");
        sb.append(this.parentAppId);
        sb.append(", transactionType=");
        sb.append(this.transactionType);
        sb.append(", transactionItem=");
        sb.append(this.transactionItem);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", isFailed=");
        sb.append(this.isFailed);
        sb.append(", failReason=");
        sb.append(this.failReason);
        sb.append(", orderId=");
        sb.append(this.orderId);
        sb.append(", accountId=");
        sb.append(this.accountId);
        sb.append(", accountInfo=");
        sb.append(this.accountInfo);
        sb.append(", transactionId=");
        return ho8.a(sb, this.transactionId, ')');
    }

    public /* synthetic */ SchemeStatSak$TypeVkPayCheckoutItem(EventType eventType, String str, Integer num, String str2, Integer num2, String str3, String str4, Long l, Boolean bool, String str5, String str6, Integer num3, String str7, String str8, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8);
    }
}
