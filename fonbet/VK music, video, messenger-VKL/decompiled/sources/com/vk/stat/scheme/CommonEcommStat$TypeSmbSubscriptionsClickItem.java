package com.vk.stat.scheme;

import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.asp;
import xsna.bh10;
import xsna.bjg;
import xsna.cjg;
import xsna.djg;
import xsna.ejg;
import xsna.epx;
import xsna.fjg;
import xsna.gjg;
import xsna.hjg;
import xsna.ijg;
import xsna.jjg;
import xsna.kjg;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonEcommStat.kt */
/* loaded from: classes5.dex */
public final class CommonEcommStat$TypeSmbSubscriptionsClickItem {

    @pmi0(MBInterstitialActivity.INTENT_CAMAPIGN)
    private final String campaign;

    @pmi0("community_id")
    private final long communityId;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final String content;

    @pmi0("medium")
    private final String medium;

    @pmi0("price")
    private final Integer price;

    @pmi0("salon_id")
    private final Long salonId;

    @pmi0("source")
    private final String source;

    @pmi0("subscription_end_date")
    private final Integer subscriptionEndDate;

    @pmi0("subscription_id")
    private final String subscriptionId;

    @pmi0("subscription_start_date")
    private final Integer subscriptionStartDate;

    @pmi0("term")
    private final String term;

    @pmi0("type")
    private final Type type;

    @pmi0("type_smb_subscriptions_callback_request_click")
    private final bjg typeSmbSubscriptionsCallbackRequestClick;

    @pmi0("type_smb_subscriptions_cancel_subscription_anyway_click")
    private final cjg typeSmbSubscriptionsCancelSubscriptionAnywayClick;

    @pmi0("type_smb_subscriptions_cancel_subscription_click")
    private final djg typeSmbSubscriptionsCancelSubscriptionClick;

    @pmi0("type_smb_subscriptions_cancel_subscription_gift_approve_click")
    private final ejg typeSmbSubscriptionsCancelSubscriptionGiftApproveClick;

    @pmi0("type_smb_subscriptions_cancel_subscription_gift_popup_show")
    private final fjg typeSmbSubscriptionsCancelSubscriptionGiftPopupShow;

    @pmi0("type_smb_subscriptions_cancel_subscription_reason_select")
    private final CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem typeSmbSubscriptionsCancelSubscriptionReasonSelect;

    @pmi0("type_smb_subscriptions_cancel_subscription_reason_send")
    private final CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem typeSmbSubscriptionsCancelSubscriptionReasonSend;

    @pmi0("type_smb_subscriptions_cancel_subscription_reason_skip_click")
    private final gjg typeSmbSubscriptionsCancelSubscriptionReasonSkipClick;

    @pmi0("type_smb_subscriptions_enable_subscription_click")
    private final hjg typeSmbSubscriptionsEnableSubscriptionClick;

    @pmi0("type_smb_subscriptions_launch_click")
    private final ijg typeSmbSubscriptionsLaunchClick;

    @pmi0("type_smb_subscriptions_promo_button_new_client_click")
    private final jjg typeSmbSubscriptionsPromoButtonNewClientClick;

    @pmi0("type_smb_subscriptions_promo_button_old_client_click")
    private final kjg typeSmbSubscriptionsPromoButtonOldClientClick;

    @pmi0("type_smb_subscriptions_set_feature_setting_click")
    private final CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem typeSmbSubscriptionsSetFeatureSettingClick;

    @pmi0("type_smb_subscriptions_set_subscription_period")
    private final CommonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem typeSmbSubscriptionsSetSubscriptionPeriod;

    @pmi0("type_smb_subscriptions_subscription_bot_click")
    private final CommonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem typeSmbSubscriptionsSubscriptionBotClick;

    @pmi0("type_smb_subscriptions_subscription_offer_click")
    private final CommonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem typeSmbSubscriptionsSubscriptionOfferClick;

    @pmi0("vk_ref")
    private final String vkRef;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonEcommStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("type_smb_subscriptions_callback_request_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CALLBACK_REQUEST_CLICK;

        @pmi0("type_smb_subscriptions_cancel_subscription_anyway_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_ANYWAY_CLICK;

        @pmi0("type_smb_subscriptions_cancel_subscription_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_CLICK;

        @pmi0("type_smb_subscriptions_cancel_subscription_gift_approve_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_GIFT_APPROVE_CLICK;

        @pmi0("type_smb_subscriptions_cancel_subscription_gift_popup_show")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_GIFT_POPUP_SHOW;

        @pmi0("type_smb_subscriptions_cancel_subscription_reason_select")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SELECT;

        @pmi0("type_smb_subscriptions_cancel_subscription_reason_send")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SEND;

        @pmi0("type_smb_subscriptions_cancel_subscription_reason_skip_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SKIP_CLICK;

        @pmi0("type_smb_subscriptions_enable_subscription_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION_CLICK;

        @pmi0("type_smb_subscriptions_launch_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_LAUNCH_CLICK;

        @pmi0("type_smb_subscriptions_promo_button_new_client_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_PROMO_BUTTON_NEW_CLIENT_CLICK;

        @pmi0("type_smb_subscriptions_promo_button_old_client_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_PROMO_BUTTON_OLD_CLIENT_CLICK;

        @pmi0("type_smb_subscriptions_set_feature_setting_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_SET_FEATURE_SETTING_CLICK;

        @pmi0("type_smb_subscriptions_set_subscription_period")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_SET_SUBSCRIPTION_PERIOD;

        @pmi0("type_smb_subscriptions_subscription_bot_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_SUBSCRIPTION_BOT_CLICK;

        @pmi0("type_smb_subscriptions_subscription_offer_click")
        public static final Type TYPE_SMB_SUBSCRIPTIONS_SUBSCRIPTION_OFFER_CLICK;

        static {
            Type type = new Type("TYPE_SMB_SUBSCRIPTIONS_PROMO_BUTTON_NEW_CLIENT_CLICK", 0);
            TYPE_SMB_SUBSCRIPTIONS_PROMO_BUTTON_NEW_CLIENT_CLICK = type;
            Type type2 = new Type("TYPE_SMB_SUBSCRIPTIONS_PROMO_BUTTON_OLD_CLIENT_CLICK", 1);
            TYPE_SMB_SUBSCRIPTIONS_PROMO_BUTTON_OLD_CLIENT_CLICK = type2;
            Type type3 = new Type("TYPE_SMB_SUBSCRIPTIONS_LAUNCH_CLICK", 2);
            TYPE_SMB_SUBSCRIPTIONS_LAUNCH_CLICK = type3;
            Type type4 = new Type("TYPE_SMB_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION_CLICK", 3);
            TYPE_SMB_SUBSCRIPTIONS_ENABLE_SUBSCRIPTION_CLICK = type4;
            Type type5 = new Type("TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_CLICK", 4);
            TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_CLICK = type5;
            Type type6 = new Type("TYPE_SMB_SUBSCRIPTIONS_SUBSCRIPTION_OFFER_CLICK", 5);
            TYPE_SMB_SUBSCRIPTIONS_SUBSCRIPTION_OFFER_CLICK = type6;
            Type type7 = new Type("TYPE_SMB_SUBSCRIPTIONS_SET_SUBSCRIPTION_PERIOD", 6);
            TYPE_SMB_SUBSCRIPTIONS_SET_SUBSCRIPTION_PERIOD = type7;
            Type type8 = new Type("TYPE_SMB_SUBSCRIPTIONS_SUBSCRIPTION_BOT_CLICK", 7);
            TYPE_SMB_SUBSCRIPTIONS_SUBSCRIPTION_BOT_CLICK = type8;
            Type type9 = new Type("TYPE_SMB_SUBSCRIPTIONS_SET_FEATURE_SETTING_CLICK", 8);
            TYPE_SMB_SUBSCRIPTIONS_SET_FEATURE_SETTING_CLICK = type9;
            Type type10 = new Type("TYPE_SMB_SUBSCRIPTIONS_CALLBACK_REQUEST_CLICK", 9);
            TYPE_SMB_SUBSCRIPTIONS_CALLBACK_REQUEST_CLICK = type10;
            Type type11 = new Type("TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_ANYWAY_CLICK", 10);
            TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_ANYWAY_CLICK = type11;
            Type type12 = new Type("TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SELECT", 11);
            TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SELECT = type12;
            Type type13 = new Type("TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SKIP_CLICK", 12);
            TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SKIP_CLICK = type13;
            Type type14 = new Type("TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SEND", 13);
            TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_REASON_SEND = type14;
            Type type15 = new Type("TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_GIFT_POPUP_SHOW", 14);
            TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_GIFT_POPUP_SHOW = type15;
            Type type16 = new Type("TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_GIFT_APPROVE_CLICK", 15);
            TYPE_SMB_SUBSCRIPTIONS_CANCEL_SUBSCRIPTION_GIFT_APPROVE_CLICK = type16;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16};
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

    private CommonEcommStat$TypeSmbSubscriptionsClickItem(Type type, long j, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Integer num, Integer num2, Integer num3, jjg jjgVar, kjg kjgVar, ijg ijgVar, hjg hjgVar, djg djgVar, CommonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem commonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem, CommonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem commonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem, CommonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem commonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem, CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem, bjg bjgVar, cjg cjgVar, CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem, gjg gjgVar, CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem, fjg fjgVar, ejg ejgVar) {
        this.type = type;
        this.communityId = j;
        this.vkRef = str;
        this.source = str2;
        this.medium = str3;
        this.campaign = str4;
        this.term = str5;
        this.content = str6;
        this.salonId = l;
        this.subscriptionId = str7;
        this.price = num;
        this.subscriptionStartDate = num2;
        this.subscriptionEndDate = num3;
        this.typeSmbSubscriptionsSubscriptionOfferClick = commonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem;
        this.typeSmbSubscriptionsSetSubscriptionPeriod = commonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem;
        this.typeSmbSubscriptionsSubscriptionBotClick = commonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem;
        this.typeSmbSubscriptionsSetFeatureSettingClick = commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem;
        this.typeSmbSubscriptionsCancelSubscriptionReasonSelect = commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem;
        this.typeSmbSubscriptionsCancelSubscriptionReasonSend = commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonEcommStat$TypeSmbSubscriptionsClickItem)) {
            return false;
        }
        CommonEcommStat$TypeSmbSubscriptionsClickItem commonEcommStat$TypeSmbSubscriptionsClickItem = (CommonEcommStat$TypeSmbSubscriptionsClickItem) obj;
        return this.type == commonEcommStat$TypeSmbSubscriptionsClickItem.type && this.communityId == commonEcommStat$TypeSmbSubscriptionsClickItem.communityId && epx.f(this.vkRef, commonEcommStat$TypeSmbSubscriptionsClickItem.vkRef) && epx.f(this.source, commonEcommStat$TypeSmbSubscriptionsClickItem.source) && epx.f(this.medium, commonEcommStat$TypeSmbSubscriptionsClickItem.medium) && epx.f(this.campaign, commonEcommStat$TypeSmbSubscriptionsClickItem.campaign) && epx.f(this.term, commonEcommStat$TypeSmbSubscriptionsClickItem.term) && epx.f(this.content, commonEcommStat$TypeSmbSubscriptionsClickItem.content) && epx.f(this.salonId, commonEcommStat$TypeSmbSubscriptionsClickItem.salonId) && epx.f(this.subscriptionId, commonEcommStat$TypeSmbSubscriptionsClickItem.subscriptionId) && epx.f(this.price, commonEcommStat$TypeSmbSubscriptionsClickItem.price) && epx.f(this.subscriptionStartDate, commonEcommStat$TypeSmbSubscriptionsClickItem.subscriptionStartDate) && epx.f(this.subscriptionEndDate, commonEcommStat$TypeSmbSubscriptionsClickItem.subscriptionEndDate) && epx.f(this.typeSmbSubscriptionsSubscriptionOfferClick, commonEcommStat$TypeSmbSubscriptionsClickItem.typeSmbSubscriptionsSubscriptionOfferClick) && epx.f(this.typeSmbSubscriptionsSetSubscriptionPeriod, commonEcommStat$TypeSmbSubscriptionsClickItem.typeSmbSubscriptionsSetSubscriptionPeriod) && epx.f(this.typeSmbSubscriptionsSubscriptionBotClick, commonEcommStat$TypeSmbSubscriptionsClickItem.typeSmbSubscriptionsSubscriptionBotClick) && epx.f(this.typeSmbSubscriptionsSetFeatureSettingClick, commonEcommStat$TypeSmbSubscriptionsClickItem.typeSmbSubscriptionsSetFeatureSettingClick) && epx.f(this.typeSmbSubscriptionsCancelSubscriptionReasonSelect, commonEcommStat$TypeSmbSubscriptionsClickItem.typeSmbSubscriptionsCancelSubscriptionReasonSelect) && epx.f(this.typeSmbSubscriptionsCancelSubscriptionReasonSend, commonEcommStat$TypeSmbSubscriptionsClickItem.typeSmbSubscriptionsCancelSubscriptionReasonSend);
    }

    public final int hashCode() {
        int a = bh10.a(this.type.hashCode() * 31, 31, this.communityId);
        String str = this.vkRef;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.source;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.medium;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.campaign;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.term;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.content;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l = this.salonId;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str7 = this.subscriptionId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.price;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.subscriptionStartDate;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.subscriptionEndDate;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 887503681;
        CommonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem commonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem = this.typeSmbSubscriptionsSubscriptionOfferClick;
        int hashCode12 = (hashCode11 + (commonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem == null ? 0 : commonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem.hashCode())) * 31;
        CommonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem commonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem = this.typeSmbSubscriptionsSetSubscriptionPeriod;
        int hashCode13 = (hashCode12 + (commonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem == null ? 0 : commonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem.hashCode())) * 31;
        CommonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem commonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem = this.typeSmbSubscriptionsSubscriptionBotClick;
        int hashCode14 = (hashCode13 + (commonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem == null ? 0 : commonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem.hashCode())) * 31;
        CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem = this.typeSmbSubscriptionsSetFeatureSettingClick;
        int hashCode15 = (hashCode14 + (commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem == null ? 0 : commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem.hashCode())) * 29791;
        CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem = this.typeSmbSubscriptionsCancelSubscriptionReasonSelect;
        int hashCode16 = (hashCode15 + (commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem == null ? 0 : commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem.hashCode())) * 961;
        CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem = this.typeSmbSubscriptionsCancelSubscriptionReasonSend;
        return (hashCode16 + (commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem != null ? commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem.hashCode() : 0)) * 961;
    }

    public final String toString() {
        return "TypeSmbSubscriptionsClickItem(type=" + this.type + ", communityId=" + this.communityId + ", vkRef=" + this.vkRef + ", source=" + this.source + ", medium=" + this.medium + ", campaign=" + this.campaign + ", term=" + this.term + ", content=" + this.content + ", salonId=" + this.salonId + ", subscriptionId=" + this.subscriptionId + ", price=" + this.price + ", subscriptionStartDate=" + this.subscriptionStartDate + ", subscriptionEndDate=" + this.subscriptionEndDate + ", typeSmbSubscriptionsPromoButtonNewClientClick=null, typeSmbSubscriptionsPromoButtonOldClientClick=null, typeSmbSubscriptionsLaunchClick=null, typeSmbSubscriptionsEnableSubscriptionClick=null, typeSmbSubscriptionsCancelSubscriptionClick=null, typeSmbSubscriptionsSubscriptionOfferClick=" + this.typeSmbSubscriptionsSubscriptionOfferClick + ", typeSmbSubscriptionsSetSubscriptionPeriod=" + this.typeSmbSubscriptionsSetSubscriptionPeriod + ", typeSmbSubscriptionsSubscriptionBotClick=" + this.typeSmbSubscriptionsSubscriptionBotClick + ", typeSmbSubscriptionsSetFeatureSettingClick=" + this.typeSmbSubscriptionsSetFeatureSettingClick + ", typeSmbSubscriptionsCallbackRequestClick=null, typeSmbSubscriptionsCancelSubscriptionAnywayClick=null, typeSmbSubscriptionsCancelSubscriptionReasonSelect=" + this.typeSmbSubscriptionsCancelSubscriptionReasonSelect + ", typeSmbSubscriptionsCancelSubscriptionReasonSkipClick=null, typeSmbSubscriptionsCancelSubscriptionReasonSend=" + this.typeSmbSubscriptionsCancelSubscriptionReasonSend + ", typeSmbSubscriptionsCancelSubscriptionGiftPopupShow=null, typeSmbSubscriptionsCancelSubscriptionGiftApproveClick=null)";
    }

    public /* synthetic */ CommonEcommStat$TypeSmbSubscriptionsClickItem(Type type, long j, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Integer num, Integer num2, Integer num3, jjg jjgVar, kjg kjgVar, ijg ijgVar, hjg hjgVar, djg djgVar, CommonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem commonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem, CommonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem commonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem, CommonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem commonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem, CommonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem, bjg bjgVar, cjg cjgVar, CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem, gjg gjgVar, CommonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem, fjg fjgVar, ejg ejgVar, int i, zcl zclVar) {
        this(type, j, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : num2, (i & 4096) != 0 ? null : num3, (i & 8192) != 0 ? null : jjgVar, (i & 16384) != 0 ? null : kjgVar, (32768 & i) != 0 ? null : ijgVar, (65536 & i) != 0 ? null : hjgVar, (131072 & i) != 0 ? null : djgVar, (262144 & i) != 0 ? null : commonEcommStat$TypeSmbSubscriptionsSubscriptionOfferClickItem, (524288 & i) != 0 ? null : commonEcommStat$TypeSmbSubscriptionsSetSubscriptionPeriodItem, (1048576 & i) != 0 ? null : commonEcommStat$TypeSmbSubscriptionsSubscriptionBotClickItem, (2097152 & i) != 0 ? null : commonEcommStat$TypeSmbSubscriptionsSetFeatureSettingClickItem, (4194304 & i) != 0 ? null : bjgVar, (8388608 & i) != 0 ? null : cjgVar, (16777216 & i) != 0 ? null : commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSelectItem, (33554432 & i) != 0 ? null : gjgVar, (67108864 & i) != 0 ? null : commonEcommStat$TypeSmbSubscriptionsCancelSubscriptionReasonSendItem, (134217728 & i) != 0 ? null : fjgVar, (i & 268435456) != 0 ? null : ejgVar);
    }
}
