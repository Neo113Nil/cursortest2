package com.vk.stat.scheme;

import androidx.core.app.NotificationCompat;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsMiniappsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount implements SchemeStat$TypeAction.b {

    @pmi0("discount_type")
    private final DiscountType discountType;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final Event event;

    @pmi0("hide_type")
    private final String hideType;

    @pmi0("mini_app_id")
    private final Integer miniAppId;

    @pmi0("promo_id")
    private final Integer promoId;

    @pmi0("session_duration")
    private final Integer sessionDuration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class DiscountType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DiscountType[] $VALUES;

        @pmi0("bonus_votes")
        public static final DiscountType BONUS_VOTES;

        @pmi0("free_votes")
        public static final DiscountType FREE_VOTES;

        @pmi0("percent_discount")
        public static final DiscountType PERCENT_DISCOUNT;

        static {
            DiscountType discountType = new DiscountType("BONUS_VOTES", 0);
            BONUS_VOTES = discountType;
            DiscountType discountType2 = new DiscountType("FREE_VOTES", 1);
            FREE_VOTES = discountType2;
            DiscountType discountType3 = new DiscountType("PERCENT_DISCOUNT", 2);
            PERCENT_DISCOUNT = discountType3;
            DiscountType[] discountTypeArr = {discountType, discountType2, discountType3};
            $VALUES = discountTypeArr;
            $ENTRIES = new asp(discountTypeArr);
        }

        private DiscountType(String str, int i) {
        }

        public static DiscountType valueOf(String str) {
            return (DiscountType) Enum.valueOf(DiscountType.class, str);
        }

        public static DiscountType[] values() {
            return (DiscountType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsMiniappsStat.kt */
    public static final class Event {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @pmi0("click_buy_votes_button")
        public static final Event CLICK_BUY_VOTES_BUTTON;

        @pmi0("click_rules_button")
        public static final Event CLICK_RULES_BUTTON;

        @pmi0("hide_promo_modal")
        public static final Event HIDE_PROMO_MODAL;

        @pmi0("modal_session")
        public static final Event MODAL_SESSION;

        @pmi0("open_snack_bar_promo")
        public static final Event OPEN_SNACK_BAR_PROMO;

        @pmi0("open_tab_menu_purchase")
        public static final Event OPEN_TAB_MENU_PURCHASE;

        @pmi0("open_tab_modal_purchase")
        public static final Event OPEN_TAB_MODAL_PURCHASE;

        @pmi0("open_tab_profile_purchase")
        public static final Event OPEN_TAB_PROFILE_PURCHASE;

        @pmi0("show_instruction_promo")
        public static final Event SHOW_INSTRUCTION_PROMO;

        @pmi0("show_tooltip_promo")
        public static final Event SHOW_TOOLTIP_PROMO;

        @pmi0("view_promo_modal")
        public static final Event VIEW_PROMO_MODAL;

        static {
            Event event = new Event("OPEN_SNACK_BAR_PROMO", 0);
            OPEN_SNACK_BAR_PROMO = event;
            Event event2 = new Event("VIEW_PROMO_MODAL", 1);
            VIEW_PROMO_MODAL = event2;
            Event event3 = new Event("HIDE_PROMO_MODAL", 2);
            HIDE_PROMO_MODAL = event3;
            Event event4 = new Event("OPEN_TAB_MODAL_PURCHASE", 3);
            OPEN_TAB_MODAL_PURCHASE = event4;
            Event event5 = new Event("OPEN_TAB_MENU_PURCHASE", 4);
            OPEN_TAB_MENU_PURCHASE = event5;
            Event event6 = new Event("OPEN_TAB_PROFILE_PURCHASE", 5);
            OPEN_TAB_PROFILE_PURCHASE = event6;
            Event event7 = new Event("SHOW_TOOLTIP_PROMO", 6);
            SHOW_TOOLTIP_PROMO = event7;
            Event event8 = new Event("SHOW_INSTRUCTION_PROMO", 7);
            SHOW_INSTRUCTION_PROMO = event8;
            Event event9 = new Event("CLICK_BUY_VOTES_BUTTON", 8);
            CLICK_BUY_VOTES_BUTTON = event9;
            Event event10 = new Event("CLICK_RULES_BUTTON", 9);
            CLICK_RULES_BUTTON = event10;
            Event event11 = new Event("MODAL_SESSION", 10);
            MODAL_SESSION = event11;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11};
            $VALUES = eventArr;
            $ENTRIES = new asp(eventArr);
        }

        private Event(String str, int i) {
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount)) {
            return false;
        }
        MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount = (MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount) obj;
        return this.event == mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.event && this.discountType == mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.discountType && epx.f(this.miniAppId, mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.miniAppId) && epx.f(this.promoId, mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.promoId) && epx.f(this.hideType, mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.hideType) && epx.f(this.sessionDuration, mobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount.sessionDuration);
    }

    public final int hashCode() {
        Event event = this.event;
        int hashCode = (event == null ? 0 : event.hashCode()) * 31;
        DiscountType discountType = this.discountType;
        int hashCode2 = (hashCode + (discountType == null ? 0 : discountType.hashCode())) * 31;
        Integer num = this.miniAppId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.promoId;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.hideType;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.sessionDuration;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeMiniAppsPersonalDiscount(event=");
        sb.append(this.event);
        sb.append(", discountType=");
        sb.append(this.discountType);
        sb.append(", miniAppId=");
        sb.append(this.miniAppId);
        sb.append(", promoId=");
        sb.append(this.promoId);
        sb.append(", hideType=");
        sb.append(this.hideType);
        sb.append(", sessionDuration=");
        return uqi.b(sb, this.sessionDuration, ')');
    }

    public MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount(Event event, DiscountType discountType, Integer num, Integer num2, String str, Integer num3) {
        this.event = event;
        this.discountType = discountType;
        this.miniAppId = num;
        this.promoId = num2;
        this.hideType = str;
        this.sessionDuration = num3;
    }

    public /* synthetic */ MobileOfficialAppsMiniappsStat$TypeMiniAppsPersonalDiscount(Event event, DiscountType discountType, Integer num, Integer num2, String str, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : event, (i & 2) != 0 ? null : discountType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num3);
    }
}
