package com.vk.stat.sak.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.B5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$RegistrationFieldItem {

    @pmi0("end_interaction_time")
    private final String endInteractionTime;

    @pmi0("name")
    private final Name name;

    @pmi0("start_interaction_time")
    private final String startInteractionTime;

    @pmi0("value")
    private final String value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Name {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;

        @pmi0("accounts_cnt")
        public static final Name ACCOUNTS_CNT;

        @pmi0("accounts_ids")
        public static final Name ACCOUNTS_IDS;

        @pmi0("account_found_by_number")
        public static final Name ACCOUNT_FOUND_BY_NUMBER;

        @pmi0("account_found_seamlessly")
        public static final Name ACCOUNT_FOUND_SEAMLESSLY;

        @pmi0("account_ids")
        public static final Name ACCOUNT_IDS;

        @pmi0("alert")
        public static final Name ALERT;

        @pmi0("alfa")
        public static final Name ALFA;

        @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
        public static final Name APP;

        @pmi0("apple_id")
        public static final Name APPLE_ID;

        @pmi0("app_id")
        public static final Name APP_ID;

        @pmi0("app_market_name")
        public static final Name APP_MARKET_NAME;

        @pmi0("auth_code_id")
        public static final Name AUTH_CODE_ID;

        @pmi0("auth_existing_account_open")
        public static final Name AUTH_EXISTING_ACCOUNT_OPEN;

        @pmi0("auth_flow_source")
        public static final Name AUTH_FLOW_SOURCE;

        @pmi0("autologin_id")
        public static final Name AUTOLOGIN_ID;

        @pmi0("available_multiacc_selector")
        public static final Name AVAILABLE_MULTIACC_SELECTOR;

        @pmi0("available_reg")
        public static final Name AVAILABLE_REG;

        @pmi0("backup")
        public static final Name BACKUP;

        @pmi0("bday")
        public static final Name BDAY;

        @pmi0("block_reason")
        public static final Name BLOCK_REASON;

        @pmi0("callin_error_text")
        public static final Name CALLIN_ERROR_TEXT;

        @pmi0("call_list")
        public static final Name CALL_LIST;

        @pmi0("call_reset")
        public static final Name CALL_RESET;

        @pmi0("can_enter_by_mail_pass")
        public static final Name CAN_ENTER_BY_MAIL_PASS;

        @pmi0("can_skip")
        public static final Name CAN_SKIP;

        @pmi0("can_skip_auth")
        public static final Name CAN_SKIP_AUTH;

        @pmi0("captcha")
        public static final Name CAPTCHA;

        @pmi0("choosen_domain")
        public static final Name CHOOSEN_DOMAIN;

        @pmi0("close_tab")
        public static final Name CLOSE_TAB;

        @pmi0("coarse_location")
        public static final Name COARSE_LOCATION;

        @pmi0("contents_auths")
        public static final Name CONTENTS_AUTHS;

        @pmi0("count")
        public static final Name COUNT;

        @pmi0("country")
        public static final Name COUNTRY;

        @pmi0("deeplink")
        public static final Name DEEPLINK;

        @pmi0("ecosystem_push")
        public static final Name ECOSYSTEM_PUSH;

        @pmi0("email")
        public static final Name EMAIL;

        @pmi0("entry_point")
        public static final Name ENTRY_POINT;

        @pmi0(B5.o)
        public static final Name ENV;

        @pmi0("error_code")
        public static final Name ERROR_CODE;

        @pmi0("error_description")
        public static final Name ERROR_DESCRIPTION;

        @pmi0("esia")
        public static final Name ESIA;

        @pmi0("esia_away")
        public static final Name ESIA_AWAY;

        @pmi0("esia_synchronized_data")
        public static final Name ESIA_SYNCHRONIZED_DATA;

        @pmi0("event_duration")
        public static final Name EVENT_DURATION;

        @pmi0("external_accounts_showing")
        public static final Name EXTERNAL_ACCOUNTS_SHOWING;

        @pmi0("first_name")
        public static final Name FIRST_NAME;

        @pmi0("friend_ask")
        public static final Name FRIEND_ASK;

        @pmi0("from")
        public static final Name FROM;

        @pmi0("from_popup")
        public static final Name FROM_POPUP;

        @pmi0("from_profile_type")
        public static final Name FROM_PROFILE_TYPE;

        @pmi0("full_name")
        public static final Name FULL_NAME;

        @pmi0(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE)
        public static final Name GOOGLE;

        @pmi0("gray_oauth")
        public static final Name GRAY_OAUTH;

        @pmi0("group_id")
        public static final Name GROUP_ID;

        @pmi0("has_access_token")
        public static final Name HAS_ACCESS_TOKEN;

        @pmi0("installed_apps")
        public static final Name INSTALLED_APPS;

        @pmi0("is_active_profile")
        public static final Name IS_ACTIVE_PROFILE;

        @pmi0("is_active_session")
        public static final Name IS_ACTIVE_SESSION;

        @pmi0("is_input_skipped_by_email")
        public static final Name IS_INPUT_SKIPPED_BY_EMAIL;

        @pmi0("is_net_error")
        public static final Name IS_NET_ERROR;

        @pmi0("is_not_my_vkid_enable")
        public static final Name IS_NOT_MY_VKID_ENABLE;

        @pmi0("is_old_service_number")
        public static final Name IS_OLD_SERVICE_NUMBER;

        @pmi0("is_phone_linked")
        public static final Name IS_PHONE_LINKED;

        @pmi0("last_name")
        public static final Name LAST_NAME;

        @pmi0("leave_unchanged")
        public static final Name LEAVE_UNCHANGED;

        @pmi0(CampaignEx.JSON_KEY_LINK_TYPE)
        public static final Name LINK_TYPE;

        @pmi0("location")
        public static final Name LOCATION;

        @pmi0("logout_reason")
        public static final Name LOGOUT_REASON;

        @pmi0("mail_device_id")
        public static final Name MAIL_DEVICE_ID;

        @pmi0("mail_ru")
        public static final Name MAIL_RU;

        @pmi0("mail_screen_type")
        public static final Name MAIL_SCREEN_TYPE;

        @pmi0("main_screen_type")
        public static final Name MAIN_SCREEN_TYPE;

        @pmi0("max_code")
        public static final Name MAX_CODE;

        @pmi0("max_messenger")
        public static final Name MAX_MESSENGER;

        @pmi0("method_name")
        public static final Name METHOD_NAME;

        @pmi0("mini_app_id")
        public static final Name MINI_APP_ID;

        @pmi0("mini_app_type")
        public static final Name MINI_APP_TYPE;

        @pmi0("oauth_apple")
        public static final Name OAUTH_APPLE;

        @pmi0("oauth_esia")
        public static final Name OAUTH_ESIA;

        @pmi0("oauth_google")
        public static final Name OAUTH_GOOGLE;

        @pmi0("oauth_name")
        public static final Name OAUTH_NAME;

        @pmi0("oauth_sber")
        public static final Name OAUTH_SBER;

        @pmi0("oauth_service")
        public static final Name OAUTH_SERVICE;

        @pmi0("oauth_vkid")
        public static final Name OAUTH_VKID;

        @pmi0("oauth_yandex")
        public static final Name OAUTH_YANDEX;

        @pmi0("official_messenger")
        public static final Name OFFICIAL_MESSENGER;

        @pmi0("ok_ru")
        public static final Name OK_RU;

        @pmi0("onboarded")
        public static final Name ONBOARDED;

        @pmi0("onboarding_type")
        public static final Name ONBOARDING_TYPE;

        @pmi0("passkey")
        public static final Name PASSKEY;

        @pmi0(LoginApiConstants.PARAM_NAME_PASSWORD)
        public static final Name PASSWORD;

        @pmi0("password_autofill")
        public static final Name PASSWORD_AUTOFILL;

        @pmi0("password_verify")
        public static final Name PASSWORD_VERIFY;

        @pmi0("phone_book")
        public static final Name PHONE_BOOK;

        @pmi0("phone_country")
        public static final Name PHONE_COUNTRY;

        @pmi0("phone_country_code")
        public static final Name PHONE_COUNTRY_CODE;

        @pmi0("phone_number")
        public static final Name PHONE_NUMBER;

        @pmi0("phone_state")
        public static final Name PHONE_STATE;

        @pmi0("photo")
        public static final Name PHOTO;

        @pmi0("profile_type")
        public static final Name PROFILE_TYPE;

        @pmi0("promo_auth_flag")
        public static final Name PROMO_AUTH_FLAG;

        @pmi0("push")
        public static final Name PUSH;

        @pmi0("qr_code_id")
        public static final Name QR_CODE_ID;

        @pmi0("qr_code_source")
        public static final Name QR_CODE_SOURCE;

        @pmi0("reason")
        public static final Name REASON;

        @pmi0("redirect_reason")
        public static final Name REDIRECT_REASON;

        @pmi0("reg_add_type")
        public static final Name REG_ADD_TYPE;

        @pmi0("reg_flow")
        public static final Name REG_FLOW;

        @pmi0("reg_source")
        public static final Name REG_SOURCE;

        @pmi0("reserve_code")
        public static final Name RESERVE_CODE;

        @pmi0("restore_reason")
        public static final Name RESTORE_REASON;

        @pmi0("restore_type")
        public static final Name RESTORE_TYPE;

        @pmi0("rules_accept")
        public static final Name RULES_ACCEPT;

        @pmi0("sber")
        public static final Name SBER;

        @pmi0("screen_type")
        public static final Name SCREEN_TYPE;

        @pmi0("select_country_name")
        public static final Name SELECT_COUNTRY_NAME;

        @pmi0("sex")
        public static final Name SEX;

        @pmi0("sms")
        public static final Name SMS;

        @pmi0("sms_code")
        public static final Name SMS_CODE;

        @pmi0("source")
        public static final Name SOURCE;

        @pmi0("tinkoff")
        public static final Name TINKOFF;

        @pmi0("to_profile_type")
        public static final Name TO_PROFILE_TYPE;

        @pmi0("to_switcher_from")
        public static final Name TO_SWITCHER_FROM;

        @pmi0("type_carousel")
        public static final Name TYPE_CAROUSEL;

        @pmi0("unique_session_id")
        public static final Name UNIQUE_SESSION_ID;

        @pmi0("usecase")
        public static final Name USECASE;

        @pmi0("usecase_explanation")
        public static final Name USECASE_EXPLANATION;

        @pmi0("validation_factor_flow")
        public static final Name VALIDATION_FACTOR_FLOW;

        @pmi0("verification_factor_number")
        public static final Name VERIFICATION_FACTOR_NUMBER;

        @pmi0("verification_flow")
        public static final Name VERIFICATION_FLOW;

        @pmi0("verification_oauth")
        public static final Name VERIFICATION_OAUTH;

        @pmi0("verification_status")
        public static final Name VERIFICATION_STATUS;

        @pmi0("verification_type")
        public static final Name VERIFICATION_TYPE;

        @pmi0("vkme_flow_type")
        public static final Name VKME_FLOW_TYPE;

        @pmi0("webview_unauth_id")
        public static final Name WEBVIEW_UNAUTH_ID;

        @pmi0("write_contacts")
        public static final Name WRITE_CONTACTS;

        @pmi0("yandex")
        public static final Name YANDEX;

        static {
            Name name = new Name("PHONE_STATE", 0);
            PHONE_STATE = name;
            Name name2 = new Name("WRITE_CONTACTS", 1);
            WRITE_CONTACTS = name2;
            Name name3 = new Name("COARSE_LOCATION", 2);
            COARSE_LOCATION = name3;
            Name name4 = new Name("PHONE_NUMBER", 3);
            PHONE_NUMBER = name4;
            Name name5 = new Name("CALL_LIST", 4);
            CALL_LIST = name5;
            Name name6 = new Name("PHONE_BOOK", 5);
            PHONE_BOOK = name6;
            Name name7 = new Name("LOCATION", 6);
            LOCATION = name7;
            Name name8 = new Name("PUSH", 7);
            PUSH = name8;
            Name name9 = new Name("SMS_CODE", 8);
            SMS_CODE = name9;
            Name name10 = new Name("COUNTRY", 9);
            COUNTRY = name10;
            Name name11 = new Name("PHONE_COUNTRY", 10);
            PHONE_COUNTRY = name11;
            Name name12 = new Name("RULES_ACCEPT", 11);
            RULES_ACCEPT = name12;
            Name name13 = new Name("CAPTCHA", 12);
            CAPTCHA = name13;
            Name name14 = new Name("FIRST_NAME", 13);
            FIRST_NAME = name14;
            Name name15 = new Name("LAST_NAME", 14);
            LAST_NAME = name15;
            Name name16 = new Name("FULL_NAME", 15);
            FULL_NAME = name16;
            Name name17 = new Name("SEX", 16);
            SEX = name17;
            Name name18 = new Name("BDAY", 17);
            BDAY = name18;
            Name name19 = new Name("PASSWORD", 18);
            PASSWORD = name19;
            Name name20 = new Name("PASSWORD_VERIFY", 19);
            PASSWORD_VERIFY = name20;
            Name name21 = new Name("PHOTO", 20);
            PHOTO = name21;
            Name name22 = new Name("FRIEND_ASK", 21);
            FRIEND_ASK = name22;
            Name name23 = new Name("AUTH_EXISTING_ACCOUNT_OPEN", 22);
            AUTH_EXISTING_ACCOUNT_OPEN = name23;
            Name name24 = new Name("VERIFICATION_TYPE", 23);
            VERIFICATION_TYPE = name24;
            Name name25 = new Name("AUTH_FLOW_SOURCE", 24);
            AUTH_FLOW_SOURCE = name25;
            Name name26 = new Name("PROMO_AUTH_FLAG", 25);
            PROMO_AUTH_FLAG = name26;
            Name name27 = new Name("EXTERNAL_ACCOUNTS_SHOWING", 26);
            EXTERNAL_ACCOUNTS_SHOWING = name27;
            Name name28 = new Name(CommonConstant.RETKEY.EMAIL, 27);
            EMAIL = name28;
            Name name29 = new Name("SELECT_COUNTRY_NAME", 28);
            SELECT_COUNTRY_NAME = name29;
            Name name30 = new Name("IS_OLD_SERVICE_NUMBER", 29);
            IS_OLD_SERVICE_NUMBER = name30;
            Name name31 = new Name("ACCOUNT_FOUND_BY_NUMBER", 30);
            ACCOUNT_FOUND_BY_NUMBER = name31;
            Name name32 = new Name("ACCOUNT_FOUND_SEAMLESSLY", 31);
            ACCOUNT_FOUND_SEAMLESSLY = name32;
            Name name33 = new Name("IS_NET_ERROR", 32);
            IS_NET_ERROR = name33;
            Name name34 = new Name("CONTENTS_AUTHS", 33);
            CONTENTS_AUTHS = name34;
            Name name35 = new Name("QR_CODE_ID", 34);
            QR_CODE_ID = name35;
            Name name36 = new Name("QR_CODE_SOURCE", 35);
            QR_CODE_SOURCE = name36;
            Name name37 = new Name("APP_ID", 36);
            APP_ID = name37;
            Name name38 = new Name("AUTH_CODE_ID", 37);
            AUTH_CODE_ID = name38;
            Name name39 = new Name("VERIFICATION_FACTOR_NUMBER", 38);
            VERIFICATION_FACTOR_NUMBER = name39;
            Name name40 = new Name("VERIFICATION_FLOW", 39);
            VERIFICATION_FLOW = name40;
            Name name41 = new Name("ACCOUNTS_CNT", 40);
            ACCOUNTS_CNT = name41;
            Name name42 = new Name("ACCOUNTS_IDS", 41);
            ACCOUNTS_IDS = name42;
            Name name43 = new Name("LINK_TYPE", 42);
            LINK_TYPE = name43;
            Name name44 = new Name("OAUTH_SERVICE", 43);
            OAUTH_SERVICE = name44;
            Name name45 = new Name("ESIA_AWAY", 44);
            ESIA_AWAY = name45;
            Name name46 = new Name("VERIFICATION_STATUS", 45);
            VERIFICATION_STATUS = name46;
            Name name47 = new Name("LEAVE_UNCHANGED", 46);
            LEAVE_UNCHANGED = name47;
            Name name48 = new Name("ESIA_SYNCHRONIZED_DATA", 47);
            ESIA_SYNCHRONIZED_DATA = name48;
            Name name49 = new Name("CLOSE_TAB", 48);
            CLOSE_TAB = name49;
            Name name50 = new Name("CAN_SKIP", 49);
            CAN_SKIP = name50;
            Name name51 = new Name("FROM_POPUP", 50);
            FROM_POPUP = name51;
            Name name52 = new Name("VERIFICATION_OAUTH", 51);
            VERIFICATION_OAUTH = name52;
            Name name53 = new Name("TO_SWITCHER_FROM", 52);
            TO_SWITCHER_FROM = name53;
            Name name54 = new Name("LOGOUT_REASON", 53);
            LOGOUT_REASON = name54;
            Name name55 = new Name("ONBOARDING_TYPE", 54);
            ONBOARDING_TYPE = name55;
            Name name56 = new Name("ONBOARDED", 55);
            ONBOARDED = name56;
            Name name57 = new Name("SOURCE", 56);
            SOURCE = name57;
            Name name58 = new Name("DEEPLINK", 57);
            DEEPLINK = name58;
            Name name59 = new Name("USECASE", 58);
            USECASE = name59;
            Name name60 = new Name("USECASE_EXPLANATION", 59);
            USECASE_EXPLANATION = name60;
            Name name61 = new Name("REG_ADD_TYPE", 60);
            REG_ADD_TYPE = name61;
            Name name62 = new Name("PASSKEY", 61);
            PASSKEY = name62;
            Name name63 = new Name("ECOSYSTEM_PUSH", 62);
            ECOSYSTEM_PUSH = name63;
            Name name64 = new Name("SMS", 63);
            SMS = name64;
            Name name65 = new Name("CALL_RESET", 64);
            CALL_RESET = name65;
            Name name66 = new Name("APP", 65);
            APP = name66;
            Name name67 = new Name("RESERVE_CODE", 66);
            RESERVE_CODE = name67;
            Name name68 = new Name("OFFICIAL_MESSENGER", 67);
            OFFICIAL_MESSENGER = name68;
            Name name69 = new Name("VALIDATION_FACTOR_FLOW", 68);
            VALIDATION_FACTOR_FLOW = name69;
            Name name70 = new Name("CALLIN_ERROR_TEXT", 69);
            CALLIN_ERROR_TEXT = name70;
            Name name71 = new Name("REASON", 70);
            REASON = name71;
            Name name72 = new Name("EVENT_DURATION", 71);
            EVENT_DURATION = name72;
            Name name73 = new Name("AUTOLOGIN_ID", 72);
            AUTOLOGIN_ID = name73;
            Name name74 = new Name("AVAILABLE_MULTIACC_SELECTOR", 73);
            AVAILABLE_MULTIACC_SELECTOR = name74;
            Name name75 = new Name("OAUTH_NAME", 74);
            OAUTH_NAME = name75;
            Name name76 = new Name("REG_FLOW", 75);
            REG_FLOW = name76;
            Name name77 = new Name("ALERT", 76);
            ALERT = name77;
            Name name78 = new Name("UNIQUE_SESSION_ID", 77);
            UNIQUE_SESSION_ID = name78;
            Name name79 = new Name("FROM", 78);
            FROM = name79;
            Name name80 = new Name("ENV", 79);
            ENV = name80;
            Name name81 = new Name("MINI_APP_ID", 80);
            MINI_APP_ID = name81;
            Name name82 = new Name("MINI_APP_TYPE", 81);
            MINI_APP_TYPE = name82;
            Name name83 = new Name("METHOD_NAME", 82);
            METHOD_NAME = name83;
            Name name84 = new Name("AVAILABLE_REG", 83);
            AVAILABLE_REG = name84;
            Name name85 = new Name("TYPE_CAROUSEL", 84);
            TYPE_CAROUSEL = name85;
            Name name86 = new Name("VKME_FLOW_TYPE", 85);
            VKME_FLOW_TYPE = name86;
            Name name87 = new Name("BACKUP", 86);
            BACKUP = name87;
            Name name88 = new Name("COUNT", 87);
            COUNT = name88;
            Name name89 = new Name("MAIL_RU", 88);
            MAIL_RU = name89;
            Name name90 = new Name("OK_RU", 89);
            OK_RU = name90;
            Name name91 = new Name("YANDEX", 90);
            YANDEX = name91;
            Name name92 = new Name("ESIA", 91);
            ESIA = name92;
            Name name93 = new Name("TINKOFF", 92);
            TINKOFF = name93;
            Name name94 = new Name("SBER", 93);
            SBER = name94;
            Name name95 = new Name("ALFA", 94);
            ALFA = name95;
            Name name96 = new Name("GOOGLE", 95);
            GOOGLE = name96;
            Name name97 = new Name("APPLE_ID", 96);
            APPLE_ID = name97;
            Name name98 = new Name("IS_ACTIVE_PROFILE", 97);
            IS_ACTIVE_PROFILE = name98;
            Name name99 = new Name("CAN_SKIP_AUTH", 98);
            CAN_SKIP_AUTH = name99;
            Name name100 = new Name("IS_INPUT_SKIPPED_BY_EMAIL", 99);
            IS_INPUT_SKIPPED_BY_EMAIL = name100;
            Name name101 = new Name("CAN_ENTER_BY_MAIL_PASS", 100);
            CAN_ENTER_BY_MAIL_PASS = name101;
            Name name102 = new Name("GROUP_ID", 101);
            GROUP_ID = name102;
            Name name103 = new Name("PROFILE_TYPE", 102);
            PROFILE_TYPE = name103;
            Name name104 = new Name("TO_PROFILE_TYPE", 103);
            TO_PROFILE_TYPE = name104;
            Name name105 = new Name("FROM_PROFILE_TYPE", 104);
            FROM_PROFILE_TYPE = name105;
            Name name106 = new Name("HAS_ACCESS_TOKEN", 105);
            HAS_ACCESS_TOKEN = name106;
            Name name107 = new Name("ENTRY_POINT", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            ENTRY_POINT = name107;
            Name name108 = new Name("RESTORE_TYPE", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            RESTORE_TYPE = name108;
            Name name109 = new Name("IS_ACTIVE_SESSION", 108);
            IS_ACTIVE_SESSION = name109;
            Name name110 = new Name("WEBVIEW_UNAUTH_ID", 109);
            WEBVIEW_UNAUTH_ID = name110;
            Name name111 = new Name("IS_NOT_MY_VKID_ENABLE", 110);
            IS_NOT_MY_VKID_ENABLE = name111;
            Name name112 = new Name("ERROR_DESCRIPTION", 111);
            ERROR_DESCRIPTION = name112;
            Name name113 = new Name("IS_PHONE_LINKED", 112);
            IS_PHONE_LINKED = name113;
            Name name114 = new Name("RESTORE_REASON", 113);
            RESTORE_REASON = name114;
            Name name115 = new Name("PASSWORD_AUTOFILL", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            PASSWORD_AUTOFILL = name115;
            Name name116 = new Name("APP_MARKET_NAME", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            APP_MARKET_NAME = name116;
            Name name117 = new Name("GRAY_OAUTH", 116);
            GRAY_OAUTH = name117;
            Name name118 = new Name("MAX_MESSENGER", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            MAX_MESSENGER = name118;
            Name name119 = new Name("INSTALLED_APPS", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            INSTALLED_APPS = name119;
            Name name120 = new Name("ERROR_CODE", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            ERROR_CODE = name120;
            Name name121 = new Name("MAIL_SCREEN_TYPE", 120);
            MAIL_SCREEN_TYPE = name121;
            Name name122 = new Name("REG_SOURCE", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            REG_SOURCE = name122;
            Name name123 = new Name("BLOCK_REASON", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            BLOCK_REASON = name123;
            Name name124 = new Name("MAIN_SCREEN_TYPE", 123);
            MAIN_SCREEN_TYPE = name124;
            Name name125 = new Name("OAUTH_VKID", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            OAUTH_VKID = name125;
            Name name126 = new Name("OAUTH_ESIA", 125);
            OAUTH_ESIA = name126;
            Name name127 = new Name("OAUTH_GOOGLE", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            OAUTH_GOOGLE = name127;
            Name name128 = new Name("OAUTH_YANDEX", 127);
            OAUTH_YANDEX = name128;
            Name name129 = new Name("OAUTH_APPLE", 128);
            OAUTH_APPLE = name129;
            Name name130 = new Name("OAUTH_SBER", 129);
            OAUTH_SBER = name130;
            Name name131 = new Name("CHOOSEN_DOMAIN", 130);
            CHOOSEN_DOMAIN = name131;
            Name name132 = new Name("ACCOUNT_IDS", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            ACCOUNT_IDS = name132;
            Name name133 = new Name("REDIRECT_REASON", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            REDIRECT_REASON = name133;
            Name name134 = new Name("SCREEN_TYPE", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            SCREEN_TYPE = name134;
            Name name135 = new Name("MAX_CODE", 134);
            MAX_CODE = name135;
            Name name136 = new Name("PHONE_COUNTRY_CODE", 135);
            PHONE_COUNTRY_CODE = name136;
            Name name137 = new Name("MAIL_DEVICE_ID", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            MAIL_DEVICE_ID = name137;
            Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15, name16, name17, name18, name19, name20, name21, name22, name23, name24, name25, name26, name27, name28, name29, name30, name31, name32, name33, name34, name35, name36, name37, name38, name39, name40, name41, name42, name43, name44, name45, name46, name47, name48, name49, name50, name51, name52, name53, name54, name55, name56, name57, name58, name59, name60, name61, name62, name63, name64, name65, name66, name67, name68, name69, name70, name71, name72, name73, name74, name75, name76, name77, name78, name79, name80, name81, name82, name83, name84, name85, name86, name87, name88, name89, name90, name91, name92, name93, name94, name95, name96, name97, name98, name99, name100, name101, name102, name103, name104, name105, name106, name107, name108, name109, name110, name111, name112, name113, name114, name115, name116, name117, name118, name119, name120, name121, name122, name123, name124, name125, name126, name127, name128, name129, name130, name131, name132, name133, name134, name135, name136, name137};
            $VALUES = nameArr;
            $ENTRIES = new asp(nameArr);
        }

        private Name(String str, int i) {
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    public SchemeStatSak$RegistrationFieldItem(Name name, String str, String str2, String str3) {
        this.name = name;
        this.startInteractionTime = str;
        this.endInteractionTime = str2;
        this.value = str3;
    }

    public final Name a() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$RegistrationFieldItem)) {
            return false;
        }
        SchemeStatSak$RegistrationFieldItem schemeStatSak$RegistrationFieldItem = (SchemeStatSak$RegistrationFieldItem) obj;
        return this.name == schemeStatSak$RegistrationFieldItem.name && epx.f(this.startInteractionTime, schemeStatSak$RegistrationFieldItem.startInteractionTime) && epx.f(this.endInteractionTime, schemeStatSak$RegistrationFieldItem.endInteractionTime) && epx.f(this.value, schemeStatSak$RegistrationFieldItem.value);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.name.hashCode() * 31, 31, this.startInteractionTime), 31, this.endInteractionTime);
        String str = this.value;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RegistrationFieldItem(name=");
        sb.append(this.name);
        sb.append(", startInteractionTime=");
        sb.append(this.startInteractionTime);
        sb.append(", endInteractionTime=");
        sb.append(this.endInteractionTime);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    public /* synthetic */ SchemeStatSak$RegistrationFieldItem(Name name, String str, String str2, String str3, int i, zcl zclVar) {
        this(name, str, str2, (i & 8) != 0 ? null : str3);
    }
}
