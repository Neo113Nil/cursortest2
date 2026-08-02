package com.vk.stat.scheme;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import ru.ok.android.api.methods.users.changePassword.ChangePasswordApiRequestV1;
import xsna.asp;
import xsna.b9y;
import xsna.epx;
import xsna.hay;
import xsna.ho8;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeVkConnectNavigationItem implements SchemeStat$TypeAction.b {

    @pmi0("auth_app_id")
    private final Integer authAppId;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("flow_service")
    private final String flowService;

    @pmi0("flow_type")
    private final String flowType;

    @pmi0("screen")
    private final String screen;

    @pmi0("screen_prev")
    private final String screenPrev;

    @pmi0("screen_to")
    private final String screenTo;

    @pmi0("unauth_id")
    private final Integer unauthId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    /* loaded from: classes11.dex */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType AWAY;
        public static final EventType BACK;
        public static final EventType CANT_USE_SHORT_NAME;
        public static final EventType CLICK_ENTER_LK;
        public static final EventType CLICK_NEED_PASSWORD;
        public static final EventType CLICK_VK_COMBO;
        public static final EventType CLICK_VK_PAY;
        public static final EventType CLOSE;
        public static final EventType DELETE_ADDITIONAL_ADDRESS;
        public static final EventType DELETE_APP_PASSWORD;
        public static final EventType DELETE_AVATAR;
        public static final EventType DELETE_HOME_ADDRESS;
        public static final EventType DELETE_LINKED_DEVICES;
        public static final EventType DELETE_TRUSTED_DEVICES;
        public static final EventType DELETE_WORK_ADDRESS;
        public static final EventType END_ALL_SESSIONS;
        public static final EventType END_SESSION;
        public static final EventType ENTER_NOTIFY_TOGGLE_OFF;
        public static final EventType ENTER_NOTIFY_TOGGLE_ON;
        public static final EventType ERROR_VK_MAIL;
        public static final EventType ERROR_WRONG_MAIL;
        public static final EventType ERROR_WRONG_PWD;
        public static final EventType EXIT_FROM_DELETED_SERVICE_ACCOUNT;
        public static final EventType FAQ_EXPAND;
        public static final EventType GO;
        public static final EventType HIDE;
        public static final EventType LOGOUT;
        public static final EventType MAIN_OPEN;
        public static final EventType OPEN_VK;
        public static final EventType POPUP_CLOSE;
        public static final EventType POPUP_OPEN;
        public static final EventType PUSH;
        public static final EventType RESTORE_DELETED_SERVICE_ACCOUNT;
        public static final EventType SAFETYNET_DISABLED;
        public static final EventType SAFETYNET_ENABLED;
        public static final EventType SAVE;
        public static final EventType SAVE_ADDITIONAL_ADDRESS;
        public static final EventType SAVE_HOME_ADDRESS;
        public static final EventType SAVE_WORK_ADDRESS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_OFF_CONSULTATIONS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_OFF_PERSONAL_RECOMMENDATIONS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_OFF_POLLS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_OFF_PROMOS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_ON_CONSULTATIONS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_ON_PERSONAL_RECOMMENDATIONS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_ON_POLLS;
        public static final EventType SERVICES_BUSINESS_TOGGLE_ON_PROMOS;
        public static final EventType SERVICE_NAVIGATION_CLICK;
        public static final EventType SERVICE_NAVIGATION_CLOSE;
        public static final EventType SERVICE_NAVIGATION_OPEN;
        public static final EventType SHOW;
        public static final EventType SHOW_BAR_LK;
        public static final EventType START;
        public static final EventType SUCCESS_FIRST_PASSWORD;
        public static final EventType SUCCESS_NEW_PASSWORD;
        private final String value;

        /* compiled from: SchemeStat.kt */
        public static final class Serializer implements uay<EventType> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(((EventType) obj).value);
            }
        }

        static {
            EventType eventType = new EventType("GO", 0, "go");
            GO = eventType;
            EventType eventType2 = new EventType("BACK", 1, "back");
            BACK = eventType2;
            EventType eventType3 = new EventType("HIDE", 2, "hide");
            HIDE = eventType3;
            EventType eventType4 = new EventType("SHOW", 3, "show");
            SHOW = eventType4;
            EventType eventType5 = new EventType("START", 4, "start");
            START = eventType5;
            EventType eventType6 = new EventType("CLOSE", 5, CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            CLOSE = eventType6;
            EventType eventType7 = new EventType("PUSH", 6, "push");
            PUSH = eventType7;
            EventType eventType8 = new EventType("ERROR_VK_MAIL", 7, "error_vk_mail");
            ERROR_VK_MAIL = eventType8;
            EventType eventType9 = new EventType("ERROR_WRONG_PWD", 8, "error_wrong_pwd");
            ERROR_WRONG_PWD = eventType9;
            EventType eventType10 = new EventType("ERROR_WRONG_MAIL", 9, "error_wrong_mail");
            ERROR_WRONG_MAIL = eventType10;
            EventType eventType11 = new EventType("AWAY", 10, "away");
            AWAY = eventType11;
            EventType eventType12 = new EventType("ENTER_NOTIFY_TOGGLE_ON", 11, "enter_notify_toggle_on");
            ENTER_NOTIFY_TOGGLE_ON = eventType12;
            EventType eventType13 = new EventType("ENTER_NOTIFY_TOGGLE_OFF", 12, "enter_notify_toggle_off");
            ENTER_NOTIFY_TOGGLE_OFF = eventType13;
            EventType eventType14 = new EventType("LOGOUT", 13, ChangePasswordApiRequestV1.PARAM_NAME_LOGOUT_ALL);
            LOGOUT = eventType14;
            EventType eventType15 = new EventType("OPEN_VK", 14, "open_vk");
            OPEN_VK = eventType15;
            EventType eventType16 = new EventType("CANT_USE_SHORT_NAME", 15, "cant_use_short_name");
            CANT_USE_SHORT_NAME = eventType16;
            EventType eventType17 = new EventType("SAVE", 16, "save");
            SAVE = eventType17;
            EventType eventType18 = new EventType("END_ALL_SESSIONS", 17, "end_all_sessions");
            END_ALL_SESSIONS = eventType18;
            EventType eventType19 = new EventType("END_SESSION", 18, "end_session");
            END_SESSION = eventType19;
            EventType eventType20 = new EventType("DELETE_TRUSTED_DEVICES", 19, "delete_trusted_devices");
            DELETE_TRUSTED_DEVICES = eventType20;
            EventType eventType21 = new EventType("DELETE_LINKED_DEVICES", 20, "delete_linked_devices");
            DELETE_LINKED_DEVICES = eventType21;
            EventType eventType22 = new EventType("DELETE_APP_PASSWORD", 21, "delete_app-password");
            DELETE_APP_PASSWORD = eventType22;
            EventType eventType23 = new EventType("DELETE_AVATAR", 22, "delete_avatar");
            DELETE_AVATAR = eventType23;
            EventType eventType24 = new EventType("SUCCESS_NEW_PASSWORD", 23, "success_new_password");
            SUCCESS_NEW_PASSWORD = eventType24;
            EventType eventType25 = new EventType("SERVICES_BUSINESS_TOGGLE_ON_PERSONAL_RECOMMENDATIONS", 24, "services_business_toggle_on_personal_recommendations");
            SERVICES_BUSINESS_TOGGLE_ON_PERSONAL_RECOMMENDATIONS = eventType25;
            EventType eventType26 = new EventType("SERVICES_BUSINESS_TOGGLE_OFF_PERSONAL_RECOMMENDATIONS", 25, "services_business_toggle_off_personal_recommendations");
            SERVICES_BUSINESS_TOGGLE_OFF_PERSONAL_RECOMMENDATIONS = eventType26;
            EventType eventType27 = new EventType("SERVICES_BUSINESS_TOGGLE_ON_CONSULTATIONS", 26, "services_business_toggle_on_consultations");
            SERVICES_BUSINESS_TOGGLE_ON_CONSULTATIONS = eventType27;
            EventType eventType28 = new EventType("SERVICES_BUSINESS_TOGGLE_OFF_CONSULTATIONS", 27, "services_business_toggle_off_consultations");
            SERVICES_BUSINESS_TOGGLE_OFF_CONSULTATIONS = eventType28;
            EventType eventType29 = new EventType("SERVICES_BUSINESS_TOGGLE_ON_PROMOS", 28, "services_business_toggle_on_promos");
            SERVICES_BUSINESS_TOGGLE_ON_PROMOS = eventType29;
            EventType eventType30 = new EventType("SERVICES_BUSINESS_TOGGLE_OFF_PROMOS", 29, "services_business_toggle_off_promos");
            SERVICES_BUSINESS_TOGGLE_OFF_PROMOS = eventType30;
            EventType eventType31 = new EventType("SERVICES_BUSINESS_TOGGLE_ON_POLLS", 30, "services_business_toggle_on_polls");
            SERVICES_BUSINESS_TOGGLE_ON_POLLS = eventType31;
            EventType eventType32 = new EventType("SERVICES_BUSINESS_TOGGLE_OFF_POLLS", 31, "services_business_toggle_off_polls");
            SERVICES_BUSINESS_TOGGLE_OFF_POLLS = eventType32;
            EventType eventType33 = new EventType("SHOW_BAR_LK", 32, "show_bar_lk");
            SHOW_BAR_LK = eventType33;
            EventType eventType34 = new EventType("CLICK_ENTER_LK", 33, "click_enter_lk");
            CLICK_ENTER_LK = eventType34;
            EventType eventType35 = new EventType("CLICK_VK_PAY", 34, "click_vk_pay");
            CLICK_VK_PAY = eventType35;
            EventType eventType36 = new EventType("CLICK_VK_COMBO", 35, "click_vk_combo");
            CLICK_VK_COMBO = eventType36;
            EventType eventType37 = new EventType("SERVICE_NAVIGATION_CLICK", 36, "service_navigation_click");
            SERVICE_NAVIGATION_CLICK = eventType37;
            EventType eventType38 = new EventType("SERVICE_NAVIGATION_OPEN", 37, "service_navigation_open");
            SERVICE_NAVIGATION_OPEN = eventType38;
            EventType eventType39 = new EventType("SERVICE_NAVIGATION_CLOSE", 38, "service_navigation_close");
            SERVICE_NAVIGATION_CLOSE = eventType39;
            EventType eventType40 = new EventType("POPUP_OPEN", 39, "popup_open");
            POPUP_OPEN = eventType40;
            EventType eventType41 = new EventType("POPUP_CLOSE", 40, "popup_close");
            POPUP_CLOSE = eventType41;
            EventType eventType42 = new EventType("DELETE_HOME_ADDRESS", 41, "delete_home_address");
            DELETE_HOME_ADDRESS = eventType42;
            EventType eventType43 = new EventType("DELETE_WORK_ADDRESS", 42, "delete_work_address");
            DELETE_WORK_ADDRESS = eventType43;
            EventType eventType44 = new EventType("DELETE_ADDITIONAL_ADDRESS", 43, "delete_additional_address");
            DELETE_ADDITIONAL_ADDRESS = eventType44;
            EventType eventType45 = new EventType("SAVE_HOME_ADDRESS", 44, "save_home_address");
            SAVE_HOME_ADDRESS = eventType45;
            EventType eventType46 = new EventType("SAVE_WORK_ADDRESS", 45, "save_work_address");
            SAVE_WORK_ADDRESS = eventType46;
            EventType eventType47 = new EventType("SAVE_ADDITIONAL_ADDRESS", 46, "save_additional_address");
            SAVE_ADDITIONAL_ADDRESS = eventType47;
            EventType eventType48 = new EventType("MAIN_OPEN", 47, "main_open");
            MAIN_OPEN = eventType48;
            EventType eventType49 = new EventType("FAQ_EXPAND", 48, "faq_expand");
            FAQ_EXPAND = eventType49;
            EventType eventType50 = new EventType("CLICK_NEED_PASSWORD", 49, "click_need_password");
            CLICK_NEED_PASSWORD = eventType50;
            EventType eventType51 = new EventType("SUCCESS_FIRST_PASSWORD", 50, "success_first_password");
            SUCCESS_FIRST_PASSWORD = eventType51;
            EventType eventType52 = new EventType("SAFETYNET_DISABLED", 51, "safetynet_disabled");
            SAFETYNET_DISABLED = eventType52;
            EventType eventType53 = new EventType("SAFETYNET_ENABLED", 52, "safetynet_enabled");
            SAFETYNET_ENABLED = eventType53;
            EventType eventType54 = new EventType("EXIT_FROM_DELETED_SERVICE_ACCOUNT", 53, "exit_from_deleted_service_account");
            EXIT_FROM_DELETED_SERVICE_ACCOUNT = eventType54;
            EventType eventType55 = new EventType("RESTORE_DELETED_SERVICE_ACCOUNT", 54, "restore_deleted_service_account");
            RESTORE_DELETED_SERVICE_ACCOUNT = eventType55;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33, eventType34, eventType35, eventType36, eventType37, eventType38, eventType39, eventType40, eventType41, eventType42, eventType43, eventType44, eventType45, eventType46, eventType47, eventType48, eventType49, eventType50, eventType51, eventType52, eventType53, eventType54, eventType55};
            $VALUES = eventTypeArr;
            $ENTRIES = new asp(eventTypeArr);
        }

        public EventType(String str, int i, String str2) {
            this.value = str2;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeVkConnectNavigationItem(EventType eventType, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5) {
        this.eventType = eventType;
        this.unauthId = num;
        this.authAppId = num2;
        this.flowService = str;
        this.flowType = str2;
        this.screenPrev = str3;
        this.screen = str4;
        this.screenTo = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeVkConnectNavigationItem)) {
            return false;
        }
        SchemeStat$TypeVkConnectNavigationItem schemeStat$TypeVkConnectNavigationItem = (SchemeStat$TypeVkConnectNavigationItem) obj;
        return this.eventType == schemeStat$TypeVkConnectNavigationItem.eventType && epx.f(this.unauthId, schemeStat$TypeVkConnectNavigationItem.unauthId) && epx.f(this.authAppId, schemeStat$TypeVkConnectNavigationItem.authAppId) && epx.f(this.flowService, schemeStat$TypeVkConnectNavigationItem.flowService) && epx.f(this.flowType, schemeStat$TypeVkConnectNavigationItem.flowType) && epx.f(this.screenPrev, schemeStat$TypeVkConnectNavigationItem.screenPrev) && epx.f(this.screen, schemeStat$TypeVkConnectNavigationItem.screen) && epx.f(this.screenTo, schemeStat$TypeVkConnectNavigationItem.screenTo);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        Integer num = this.unauthId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.authAppId;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.flowService;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.flowType;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.screenPrev;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.screen;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.screenTo;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeVkConnectNavigationItem(eventType=");
        sb.append(this.eventType);
        sb.append(", unauthId=");
        sb.append(this.unauthId);
        sb.append(", authAppId=");
        sb.append(this.authAppId);
        sb.append(", flowService=");
        sb.append(this.flowService);
        sb.append(", flowType=");
        sb.append(this.flowType);
        sb.append(", screenPrev=");
        sb.append(this.screenPrev);
        sb.append(", screen=");
        sb.append(this.screen);
        sb.append(", screenTo=");
        return ho8.a(sb, this.screenTo, ')');
    }

    public /* synthetic */ SchemeStat$TypeVkConnectNavigationItem(EventType eventType, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }
}
