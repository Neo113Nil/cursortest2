package com.vk.stat.scheme;

import com.ironsource.O6;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeRegistrationItem implements SchemeStat$TypeAction.b {

    @pmi0("app_id")
    private final Integer appId;

    @pmi0("auth_app_id")
    private final Integer authAppId;

    @pmi0("auth_providers")
    private final Integer authProviders;

    @pmi0("client_id")
    private final Integer clientId;

    @pmi0("error")
    private final Error error;

    @pmi0("error_subcode")
    private final Integer errorSubcode;

    @pmi0("event_type")
    private final EventType eventType;

    @pmi0("fields")
    private final List<SchemeStat$RegistrationFieldItem> fields;

    @pmi0("screen_to")
    private final MobileOfficialAppsCoreNavStat$EventScreen screenTo;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("silent_token")
    private final String silentToken;

    @pmi0("silent_token_uuid")
    private final String silentTokenUuid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Error {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;

        @pmi0("access_error")
        public static final Error ACCESS_ERROR;

        @pmi0("external_invalid_phone")
        public static final Error EXTERNAL_INVALID_PHONE;

        @pmi0("external_phone_processing")
        public static final Error EXTERNAL_PHONE_PROCESSING;

        @pmi0("flood")
        public static final Error FLOOD;

        @pmi0("invalid_birthday")
        public static final Error INVALID_BIRTHDAY;

        @pmi0("invalid_captcha")
        public static final Error INVALID_CAPTCHA;

        @pmi0("invalid_code")
        public static final Error INVALID_CODE;

        @pmi0("invalid_name")
        public static final Error INVALID_NAME;

        @pmi0("invalid_params")
        public static final Error INVALID_PARAMS;

        @pmi0("invalid_password")
        public static final Error INVALID_PASSWORD;

        @pmi0("invalid_phone")
        public static final Error INVALID_PHONE;

        @pmi0("invalid_sex")
        public static final Error INVALID_SEX;

        @pmi0("missing_params")
        public static final Error MISSING_PARAMS;

        @pmi0("phone_already_used")
        public static final Error PHONE_ALREADY_USED;

        @pmi0("phone_banned")
        public static final Error PHONE_BANNED;

        @pmi0("phone_change_limit")
        public static final Error PHONE_CHANGE_LIMIT;

        @pmi0("phone_check_code_limit")
        public static final Error PHONE_CHECK_CODE_LIMIT;

        @pmi0("phone_holder_banned")
        public static final Error PHONE_HOLDER_BANNED;

        @pmi0("server_error")
        public static final Error SERVER_ERROR;

        @pmi0("sms_resend_delay")
        public static final Error SMS_RESEND_DELAY;

        static {
            Error error = new Error("FLOOD", 0);
            FLOOD = error;
            Error error2 = new Error("ACCESS_ERROR", 1);
            ACCESS_ERROR = error2;
            Error error3 = new Error("SERVER_ERROR", 2);
            SERVER_ERROR = error3;
            Error error4 = new Error("SMS_RESEND_DELAY", 3);
            SMS_RESEND_DELAY = error4;
            Error error5 = new Error("INVALID_PARAMS", 4);
            INVALID_PARAMS = error5;
            Error error6 = new Error("MISSING_PARAMS", 5);
            MISSING_PARAMS = error6;
            Error error7 = new Error("INVALID_CAPTCHA", 6);
            INVALID_CAPTCHA = error7;
            Error error8 = new Error("INVALID_CODE", 7);
            INVALID_CODE = error8;
            Error error9 = new Error("INVALID_NAME", 8);
            INVALID_NAME = error9;
            Error error10 = new Error("INVALID_SEX", 9);
            INVALID_SEX = error10;
            Error error11 = new Error("INVALID_BIRTHDAY", 10);
            INVALID_BIRTHDAY = error11;
            Error error12 = new Error("INVALID_PASSWORD", 11);
            INVALID_PASSWORD = error12;
            Error error13 = new Error("INVALID_PHONE", 12);
            INVALID_PHONE = error13;
            Error error14 = new Error("PHONE_BANNED", 13);
            PHONE_BANNED = error14;
            Error error15 = new Error("PHONE_HOLDER_BANNED", 14);
            PHONE_HOLDER_BANNED = error15;
            Error error16 = new Error("PHONE_ALREADY_USED", 15);
            PHONE_ALREADY_USED = error16;
            Error error17 = new Error("PHONE_CHANGE_LIMIT", 16);
            PHONE_CHANGE_LIMIT = error17;
            Error error18 = new Error("PHONE_CHECK_CODE_LIMIT", 17);
            PHONE_CHECK_CODE_LIMIT = error18;
            Error error19 = new Error("EXTERNAL_INVALID_PHONE", 18);
            EXTERNAL_INVALID_PHONE = error19;
            Error error20 = new Error("EXTERNAL_PHONE_PROCESSING", 19);
            EXTERNAL_PHONE_PROCESSING = error20;
            Error[] errorArr = {error, error2, error3, error4, error5, error6, error7, error8, error9, error10, error11, error12, error13, error14, error15, error16, error17, error18, error19, error20};
            $VALUES = errorArr;
            $ENTRIES = new asp(errorArr);
        }

        private Error(String str, int i) {
        }

        public static Error valueOf(String str) {
            return (Error) Enum.valueOf(Error.class, str);
        }

        public static Error[] values() {
            return (Error[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("access_token_provided")
        public static final EventType ACCESS_TOKEN_PROVIDED;

        @pmi0("alert_refresh_error")
        public static final EventType ALERT_REFRESH_ERROR;

        @pmi0("alert_unsafe_auth_error")
        public static final EventType ALERT_UNSAFE_AUTH_ERROR;

        @pmi0("auth_by_login")
        public static final EventType AUTH_BY_LOGIN;

        @pmi0("auth_by_oauth")
        public static final EventType AUTH_BY_OAUTH;

        @pmi0("auth_by_phone")
        public static final EventType AUTH_BY_PHONE;

        @pmi0("auth_by_qr_code")
        public static final EventType AUTH_BY_QR_CODE;

        @pmi0("auth_by_unknown")
        public static final EventType AUTH_BY_UNKNOWN;

        @pmi0("auth_confirm")
        public static final EventType AUTH_CONFIRM;

        @pmi0("auth_fast_silent")
        public static final EventType AUTH_FAST_SILENT;

        @pmi0("auth_password")
        public static final EventType AUTH_PASSWORD;

        @pmi0("auth_qr_code_start")
        public static final EventType AUTH_QR_CODE_START;

        @pmi0("auth_silent")
        public static final EventType AUTH_SILENT;

        @pmi0("auth_start")
        public static final EventType AUTH_START;

        @pmi0("auth_subapp")
        public static final EventType AUTH_SUBAPP;

        @pmi0("auth_subapp_success")
        public static final EventType AUTH_SUBAPP_SUCCESS;

        @pmi0("auth_subprofile")
        public static final EventType AUTH_SUBPROFILE;

        @pmi0("available_auth_without_password")
        public static final EventType AVAILABLE_AUTH_WITHOUT_PASSWORD;

        @pmi0("call_code_success_verification")
        public static final EventType CALL_CODE_SUCCESS_VERIFICATION;

        @pmi0("captcha_success")
        public static final EventType CAPTCHA_SUCCESS;

        @pmi0("choose_another_way")
        public static final EventType CHOOSE_ANOTHER_WAY;

        @pmi0("code_call")
        public static final EventType CODE_CALL;

        @pmi0("code_send")
        public static final EventType CODE_SEND;

        @pmi0("common_server_error")
        public static final EventType COMMON_SERVER_ERROR;

        @pmi0("connect_facebook_failed")
        public static final EventType CONNECT_FACEBOOK_FAILED;

        @pmi0("connect_gmail_failed")
        public static final EventType CONNECT_GMAIL_FAILED;

        @pmi0("connect_ok_failed")
        public static final EventType CONNECT_OK_FAILED;

        @pmi0("connect_twitter_failed")
        public static final EventType CONNECT_TWITTER_FAILED;

        @pmi0("continue_as_username")
        public static final EventType CONTINUE_AS_USERNAME;

        @pmi0("create_business_start")
        public static final EventType CREATE_BUSINESS_START;

        @pmi0("create_subprofile_click")
        public static final EventType CREATE_SUBPROFILE_CLICK;

        @pmi0("email_reg_allowed")
        public static final EventType EMAIL_REG_ALLOWED;

        @pmi0("email_reg_denied")
        public static final EventType EMAIL_REG_DENIED;

        @pmi0("entry_by_qr_code_confirm_tap")
        public static final EventType ENTRY_BY_QR_CODE_CONFIRM_TAP;

        @pmi0("entry_confirm_tap")
        public static final EventType ENTRY_CONFIRM_TAP;

        @pmi0("entry_link_open")
        public static final EventType ENTRY_LINK_OPEN;

        @pmi0("error_number_linked")
        public static final EventType ERROR_NUMBER_LINKED;

        @pmi0("error_vk_mail_created")
        public static final EventType ERROR_VK_MAIL_CREATED;

        @pmi0("error_vk_mail_login")
        public static final EventType ERROR_VK_MAIL_LOGIN;

        @pmi0("existing_phone_number")
        public static final EventType EXISTING_PHONE_NUMBER;

        @pmi0("external_link_miniapp_open")
        public static final EventType EXTERNAL_LINK_MINIAPP_OPEN;

        @pmi0("external_link_miniapp_success_return")
        public static final EventType EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN;

        @pmi0("fast_silent_token_provided_authorization")
        public static final EventType FAST_SILENT_TOKEN_PROVIDED_AUTHORIZATION;

        @pmi0("first_authorization")
        public static final EventType FIRST_AUTHORIZATION;

        @pmi0("first_country")
        public static final EventType FIRST_COUNTRY;

        @pmi0("first_education")
        public static final EventType FIRST_EDUCATION;

        @pmi0("first_email")
        public static final EventType FIRST_EMAIL;

        @pmi0("from_vk_client_full_st")
        public static final EventType FROM_VK_CLIENT_FULL_ST;

        @pmi0("from_vk_client_without_st")
        public static final EventType FROM_VK_CLIENT_WITHOUT_ST;

        @pmi0("import_contacts_failed")
        public static final EventType IMPORT_CONTACTS_FAILED;

        @pmi0("incorrect_authenticator_code")
        public static final EventType INCORRECT_AUTHENTICATOR_CODE;

        @pmi0("incorrect_call_code")
        public static final EventType INCORRECT_CALL_CODE;

        @pmi0("incorrect_captcha")
        public static final EventType INCORRECT_CAPTCHA;

        @pmi0("incorrect_email")
        public static final EventType INCORRECT_EMAIL;

        @pmi0("incorrect_name")
        public static final EventType INCORRECT_NAME;

        @pmi0("incorrect_password")
        public static final EventType INCORRECT_PASSWORD;

        @pmi0("incorrect_phone_number")
        public static final EventType INCORRECT_PHONE_NUMBER;

        @pmi0("incorrect_sms_code")
        public static final EventType INCORRECT_SMS_CODE;

        @pmi0("input_code_interaction")
        public static final EventType INPUT_CODE_INTERACTION;

        @pmi0("input_email")
        public static final EventType INPUT_EMAIL;

        @pmi0("input_number_interaction")
        public static final EventType INPUT_NUMBER_INTERACTION;

        @pmi0("input_phone")
        public static final EventType INPUT_PHONE;

        @pmi0("invite_send_from_import")
        public static final EventType INVITE_SEND_FROM_IMPORT;

        @pmi0("invite_send_share_link")
        public static final EventType INVITE_SEND_SHARE_LINK;

        @pmi0("loading_silent_auth_existing_account")
        public static final EventType LOADING_SILENT_AUTH_EXISTING_ACCOUNT;

        @pmi0("login_tap")
        public static final EventType LOGIN_TAP;

        @pmi0("no_user_account_tap")
        public static final EventType NO_USER_ACCOUNT_TAP;

        @pmi0("no_window_opener_error")
        public static final EventType NO_WINDOW_OPENER_ERROR;

        @pmi0("one_tap_empty_button_click")
        public static final EventType ONE_TAP_EMPTY_BUTTON_CLICK;

        @pmi0("one_tap_empty_button_show")
        public static final EventType ONE_TAP_EMPTY_BUTTON_SHOW;

        @pmi0("one_tap_start_button_click")
        public static final EventType ONE_TAP_START_BUTTON_CLICK;

        @pmi0("one_tap_start_button_show")
        public static final EventType ONE_TAP_START_BUTTON_SHOW;

        @pmi0("one_tap_user_button_click")
        public static final EventType ONE_TAP_USER_BUTTON_CLICK;

        @pmi0("one_tap_user_button_show")
        public static final EventType ONE_TAP_USER_BUTTON_SHOW;

        @pmi0("open_account")
        public static final EventType OPEN_ACCOUNT;

        @pmi0("partial_expand_success")
        public static final EventType PARTIAL_EXPAND_SUCCESS;

        @pmi0("passw_tap")
        public static final EventType PASSW_TAP;

        @pmi0("photo_uploading_aborted")
        public static final EventType PHOTO_UPLOADING_ABORTED;

        @pmi0("photo_uploading_failed")
        public static final EventType PHOTO_UPLOADING_FAILED;

        @pmi0("proceed_other_country_code")
        public static final EventType PROCEED_OTHER_COUNTRY_CODE;

        @pmi0("profile_info_retrieved")
        public static final EventType PROFILE_INFO_RETRIEVED;

        @pmi0("push_request_allow")
        public static final EventType PUSH_REQUEST_ALLOW;

        @pmi0("push_request_deny")
        public static final EventType PUSH_REQUEST_DENY;

        @pmi0("qr_code_expired")
        public static final EventType QR_CODE_EXPIRED;

        @pmi0("qr_code_link_open")
        public static final EventType QR_CODE_LINK_OPEN;

        @pmi0("qr_code_refresh_tap")
        public static final EventType QR_CODE_REFRESH_TAP;

        @pmi0("qr_code_scanned")
        public static final EventType QR_CODE_SCANNED;

        @pmi0("registration")
        public static final EventType REGISTRATION;

        @pmi0("registration_email_not_found")
        public static final EventType REGISTRATION_EMAIL_NOT_FOUND;

        @pmi0("registration_existing_account_without_password")
        public static final EventType REGISTRATION_EXISTING_ACCOUNT_WITHOUT_PASSWORD;

        @pmi0("registration_password_not_found")
        public static final EventType REGISTRATION_PASSWORD_NOT_FOUND;

        @pmi0("registration_start")
        public static final EventType REGISTRATION_START;

        @pmi0("resend_sms_code")
        public static final EventType RESEND_SMS_CODE;

        @pmi0("resend_sms_code_failed")
        public static final EventType RESEND_SMS_CODE_FAILED;

        @pmi0("screen_blur")
        public static final EventType SCREEN_BLUR;

        @pmi0("screen_focus")
        public static final EventType SCREEN_FOCUS;

        @pmi0("screen_loading_aborted")
        public static final EventType SCREEN_LOADING_ABORTED;

        @pmi0("screen_loading_failed")
        public static final EventType SCREEN_LOADING_FAILED;

        @pmi0("screen_proceed")
        public static final EventType SCREEN_PROCEED;

        @pmi0("screen_return")
        public static final EventType SCREEN_RETURN;

        @pmi0("screen_skip")
        public static final EventType SCREEN_SKIP;

        @pmi0("see_more")
        public static final EventType SEE_MORE;

        @pmi0("select_auth_by_password")
        public static final EventType SELECT_AUTH_BY_PASSWORD;

        @pmi0("select_auth_by_phone")
        public static final EventType SELECT_AUTH_BY_PHONE;

        @pmi0("select_country")
        public static final EventType SELECT_COUNTRY;

        @pmi0("select_country_done")
        public static final EventType SELECT_COUNTRY_DONE;

        @pmi0("select_subject")
        public static final EventType SELECT_SUBJECT;

        @pmi0("send_sms_code_failed")
        public static final EventType SEND_SMS_CODE_FAILED;

        @pmi0("service_not_open")
        public static final EventType SERVICE_NOT_OPEN;

        @pmi0("service_open_dl")
        public static final EventType SERVICE_OPEN_DL;

        @pmi0("sex_detected")
        public static final EventType SEX_DETECTED;

        @pmi0("show_import_contacts_confirmation_modal")
        public static final EventType SHOW_IMPORT_CONTACTS_CONFIRMATION_MODAL;

        @pmi0("silent_auth_info_obtain_error")
        public static final EventType SILENT_AUTH_INFO_OBTAIN_ERROR;

        @pmi0("silent_auth_resume_click")
        public static final EventType SILENT_AUTH_RESUME_CLICK;

        @pmi0("silent_token_provided")
        public static final EventType SILENT_TOKEN_PROVIDED;

        @pmi0("silent_token_provided_authorization")
        public static final EventType SILENT_TOKEN_PROVIDED_AUTHORIZATION;

        @pmi0("silent_token_provided_registration")
        public static final EventType SILENT_TOKEN_PROVIDED_REGISTRATION;

        @pmi0("sms_code_detected")
        public static final EventType SMS_CODE_DETECTED;

        @pmi0("subscribe_community")
        public static final EventType SUBSCRIBE_COMMUNITY;

        @pmi0("success_2fa")
        public static final EventType SUCCESS_2FA;

        @pmi0("success_2fa_authenticator_code")
        public static final EventType SUCCESS_2FA_AUTHENTICATOR_CODE;

        @pmi0("to_vk_client_unsafe_st")
        public static final EventType TO_VK_CLIENT_UNSAFE_ST;

        @pmi0("to_vk_client_without_st")
        public static final EventType TO_VK_CLIENT_WITHOUT_ST;

        @pmi0("2fa_active")
        public static final EventType TYPE_2FA_ACTIVE;

        @pmi0("unified_account_all_services")
        public static final EventType UNIFIED_ACCOUNT_ALL_SERVICES;

        @pmi0("unsubscribe_community")
        public static final EventType UNSUBSCRIBE_COMMUNITY;

        @pmi0("vk_mail_created")
        public static final EventType VK_MAIL_CREATED;

        @pmi0("vk_mail_selected")
        public static final EventType VK_MAIL_SELECTED;

        static {
            EventType eventType = new EventType("SCREEN_PROCEED", 0);
            SCREEN_PROCEED = eventType;
            EventType eventType2 = new EventType("SCREEN_RETURN", 1);
            SCREEN_RETURN = eventType2;
            EventType eventType3 = new EventType("SCREEN_SKIP", 2);
            SCREEN_SKIP = eventType3;
            EventType eventType4 = new EventType("SCREEN_BLUR", 3);
            SCREEN_BLUR = eventType4;
            EventType eventType5 = new EventType("SCREEN_FOCUS", 4);
            SCREEN_FOCUS = eventType5;
            EventType eventType6 = new EventType("SCREEN_LOADING_ABORTED", 5);
            SCREEN_LOADING_ABORTED = eventType6;
            EventType eventType7 = new EventType("SCREEN_LOADING_FAILED", 6);
            SCREEN_LOADING_FAILED = eventType7;
            EventType eventType8 = new EventType("SILENT_AUTH_INFO_OBTAIN_ERROR", 7);
            SILENT_AUTH_INFO_OBTAIN_ERROR = eventType8;
            EventType eventType9 = new EventType("COMMON_SERVER_ERROR", 8);
            COMMON_SERVER_ERROR = eventType9;
            EventType eventType10 = new EventType("CONNECT_FACEBOOK_FAILED", 9);
            CONNECT_FACEBOOK_FAILED = eventType10;
            EventType eventType11 = new EventType("CONNECT_OK_FAILED", 10);
            CONNECT_OK_FAILED = eventType11;
            EventType eventType12 = new EventType("CONNECT_TWITTER_FAILED", 11);
            CONNECT_TWITTER_FAILED = eventType12;
            EventType eventType13 = new EventType("CONNECT_GMAIL_FAILED", 12);
            CONNECT_GMAIL_FAILED = eventType13;
            EventType eventType14 = new EventType("SHOW_IMPORT_CONTACTS_CONFIRMATION_MODAL", 13);
            SHOW_IMPORT_CONTACTS_CONFIRMATION_MODAL = eventType14;
            EventType eventType15 = new EventType("RESEND_SMS_CODE", 14);
            RESEND_SMS_CODE = eventType15;
            EventType eventType16 = new EventType("RESEND_SMS_CODE_FAILED", 15);
            RESEND_SMS_CODE_FAILED = eventType16;
            EventType eventType17 = new EventType("SEND_SMS_CODE_FAILED", 16);
            SEND_SMS_CODE_FAILED = eventType17;
            EventType eventType18 = new EventType("SMS_CODE_DETECTED", 17);
            SMS_CODE_DETECTED = eventType18;
            EventType eventType19 = new EventType("SEX_DETECTED", 18);
            SEX_DETECTED = eventType19;
            EventType eventType20 = new EventType("INCORRECT_SMS_CODE", 19);
            INCORRECT_SMS_CODE = eventType20;
            EventType eventType21 = new EventType("INCORRECT_PASSWORD", 20);
            INCORRECT_PASSWORD = eventType21;
            EventType eventType22 = new EventType("INCORRECT_NAME", 21);
            INCORRECT_NAME = eventType22;
            EventType eventType23 = new EventType("INCORRECT_CAPTCHA", 22);
            INCORRECT_CAPTCHA = eventType23;
            EventType eventType24 = new EventType("INCORRECT_PHONE_NUMBER", 23);
            INCORRECT_PHONE_NUMBER = eventType24;
            EventType eventType25 = new EventType("INCORRECT_EMAIL", 24);
            INCORRECT_EMAIL = eventType25;
            EventType eventType26 = new EventType("SELECT_COUNTRY", 25);
            SELECT_COUNTRY = eventType26;
            EventType eventType27 = new EventType("SELECT_COUNTRY_DONE", 26);
            SELECT_COUNTRY_DONE = eventType27;
            EventType eventType28 = new EventType("INPUT_NUMBER_INTERACTION", 27);
            INPUT_NUMBER_INTERACTION = eventType28;
            EventType eventType29 = new EventType("INPUT_CODE_INTERACTION", 28);
            INPUT_CODE_INTERACTION = eventType29;
            EventType eventType30 = new EventType("PROCEED_OTHER_COUNTRY_CODE", 29);
            PROCEED_OTHER_COUNTRY_CODE = eventType30;
            EventType eventType31 = new EventType("FIRST_COUNTRY", 30);
            FIRST_COUNTRY = eventType31;
            EventType eventType32 = new EventType("FIRST_EDUCATION", 31);
            FIRST_EDUCATION = eventType32;
            EventType eventType33 = new EventType("FIRST_EMAIL", 32);
            FIRST_EMAIL = eventType33;
            EventType eventType34 = new EventType("EXISTING_PHONE_NUMBER", 33);
            EXISTING_PHONE_NUMBER = eventType34;
            EventType eventType35 = new EventType("IMPORT_CONTACTS_FAILED", 34);
            IMPORT_CONTACTS_FAILED = eventType35;
            EventType eventType36 = new EventType("INVITE_SEND_FROM_IMPORT", 35);
            INVITE_SEND_FROM_IMPORT = eventType36;
            EventType eventType37 = new EventType("PHOTO_UPLOADING_ABORTED", 36);
            PHOTO_UPLOADING_ABORTED = eventType37;
            EventType eventType38 = new EventType("PHOTO_UPLOADING_FAILED", 37);
            PHOTO_UPLOADING_FAILED = eventType38;
            EventType eventType39 = new EventType("PUSH_REQUEST_ALLOW", 38);
            PUSH_REQUEST_ALLOW = eventType39;
            EventType eventType40 = new EventType("PUSH_REQUEST_DENY", 39);
            PUSH_REQUEST_DENY = eventType40;
            EventType eventType41 = new EventType("SELECT_SUBJECT", 40);
            SELECT_SUBJECT = eventType41;
            EventType eventType42 = new EventType("SUBSCRIBE_COMMUNITY", 41);
            SUBSCRIBE_COMMUNITY = eventType42;
            EventType eventType43 = new EventType("UNSUBSCRIBE_COMMUNITY", 42);
            UNSUBSCRIBE_COMMUNITY = eventType43;
            EventType eventType44 = new EventType("SEE_MORE", 43);
            SEE_MORE = eventType44;
            EventType eventType45 = new EventType("SILENT_TOKEN_PROVIDED", 44);
            SILENT_TOKEN_PROVIDED = eventType45;
            EventType eventType46 = new EventType("SILENT_TOKEN_PROVIDED_AUTHORIZATION", 45);
            SILENT_TOKEN_PROVIDED_AUTHORIZATION = eventType46;
            EventType eventType47 = new EventType("SILENT_TOKEN_PROVIDED_REGISTRATION", 46);
            SILENT_TOKEN_PROVIDED_REGISTRATION = eventType47;
            EventType eventType48 = new EventType("AUTH_BY_LOGIN", 47);
            AUTH_BY_LOGIN = eventType48;
            EventType eventType49 = new EventType("AUTH_SILENT", 48);
            AUTH_SILENT = eventType49;
            EventType eventType50 = new EventType("AUTH_FAST_SILENT", 49);
            AUTH_FAST_SILENT = eventType50;
            EventType eventType51 = new EventType("AUTH_BY_OAUTH", 50);
            AUTH_BY_OAUTH = eventType51;
            EventType eventType52 = new EventType("REGISTRATION", 51);
            REGISTRATION = eventType52;
            EventType eventType53 = new EventType("AUTH_BY_UNKNOWN", 52);
            AUTH_BY_UNKNOWN = eventType53;
            EventType eventType54 = new EventType("AUTH_BY_PHONE", 53);
            AUTH_BY_PHONE = eventType54;
            EventType eventType55 = new EventType("CHOOSE_ANOTHER_WAY", 54);
            CHOOSE_ANOTHER_WAY = eventType55;
            EventType eventType56 = new EventType("ACCESS_TOKEN_PROVIDED", 55);
            ACCESS_TOKEN_PROVIDED = eventType56;
            EventType eventType57 = new EventType("OPEN_ACCOUNT", 56);
            OPEN_ACCOUNT = eventType57;
            EventType eventType58 = new EventType("AUTH_SUBAPP", 57);
            AUTH_SUBAPP = eventType58;
            EventType eventType59 = new EventType("AUTH_SUBAPP_SUCCESS", 58);
            AUTH_SUBAPP_SUCCESS = eventType59;
            EventType eventType60 = new EventType("PROFILE_INFO_RETRIEVED", 59);
            PROFILE_INFO_RETRIEVED = eventType60;
            EventType eventType61 = new EventType("CODE_SEND", 60);
            CODE_SEND = eventType61;
            EventType eventType62 = new EventType("CODE_CALL", 61);
            CODE_CALL = eventType62;
            EventType eventType63 = new EventType("SUCCESS_2FA", 62);
            SUCCESS_2FA = eventType63;
            EventType eventType64 = new EventType("PARTIAL_EXPAND_SUCCESS", 63);
            PARTIAL_EXPAND_SUCCESS = eventType64;
            EventType eventType65 = new EventType("UNIFIED_ACCOUNT_ALL_SERVICES", 64);
            UNIFIED_ACCOUNT_ALL_SERVICES = eventType65;
            EventType eventType66 = new EventType("FAST_SILENT_TOKEN_PROVIDED_AUTHORIZATION", 65);
            FAST_SILENT_TOKEN_PROVIDED_AUTHORIZATION = eventType66;
            EventType eventType67 = new EventType("SILENT_AUTH_RESUME_CLICK", 66);
            SILENT_AUTH_RESUME_CLICK = eventType67;
            EventType eventType68 = new EventType("TO_VK_CLIENT_UNSAFE_ST", 67);
            TO_VK_CLIENT_UNSAFE_ST = eventType68;
            EventType eventType69 = new EventType("FROM_VK_CLIENT_FULL_ST", 68);
            FROM_VK_CLIENT_FULL_ST = eventType69;
            EventType eventType70 = new EventType("TO_VK_CLIENT_WITHOUT_ST", 69);
            TO_VK_CLIENT_WITHOUT_ST = eventType70;
            EventType eventType71 = new EventType("FROM_VK_CLIENT_WITHOUT_ST", 70);
            FROM_VK_CLIENT_WITHOUT_ST = eventType71;
            EventType eventType72 = new EventType("LOADING_SILENT_AUTH_EXISTING_ACCOUNT", 71);
            LOADING_SILENT_AUTH_EXISTING_ACCOUNT = eventType72;
            EventType eventType73 = new EventType("SERVICE_OPEN_DL", 72);
            SERVICE_OPEN_DL = eventType73;
            EventType eventType74 = new EventType("SERVICE_NOT_OPEN", 73);
            SERVICE_NOT_OPEN = eventType74;
            EventType eventType75 = new EventType("VK_MAIL_CREATED", 74);
            VK_MAIL_CREATED = eventType75;
            EventType eventType76 = new EventType("VK_MAIL_SELECTED", 75);
            VK_MAIL_SELECTED = eventType76;
            EventType eventType77 = new EventType("ERROR_VK_MAIL_CREATED", 76);
            ERROR_VK_MAIL_CREATED = eventType77;
            EventType eventType78 = new EventType("ERROR_VK_MAIL_LOGIN", 77);
            ERROR_VK_MAIL_LOGIN = eventType78;
            EventType eventType79 = new EventType("LOGIN_TAP", 78);
            LOGIN_TAP = eventType79;
            EventType eventType80 = new EventType("PASSW_TAP", 79);
            PASSW_TAP = eventType80;
            EventType eventType81 = new EventType("EMAIL_REG_ALLOWED", 80);
            EMAIL_REG_ALLOWED = eventType81;
            EventType eventType82 = new EventType("EMAIL_REG_DENIED", 81);
            EMAIL_REG_DENIED = eventType82;
            EventType eventType83 = new EventType("REGISTRATION_EMAIL_NOT_FOUND", 82);
            REGISTRATION_EMAIL_NOT_FOUND = eventType83;
            EventType eventType84 = new EventType("REGISTRATION_PASSWORD_NOT_FOUND", 83);
            REGISTRATION_PASSWORD_NOT_FOUND = eventType84;
            EventType eventType85 = new EventType("ERROR_NUMBER_LINKED", 84);
            ERROR_NUMBER_LINKED = eventType85;
            EventType eventType86 = new EventType("ONE_TAP_START_BUTTON_SHOW", 85);
            ONE_TAP_START_BUTTON_SHOW = eventType86;
            EventType eventType87 = new EventType("ONE_TAP_USER_BUTTON_SHOW", 86);
            ONE_TAP_USER_BUTTON_SHOW = eventType87;
            EventType eventType88 = new EventType("ONE_TAP_EMPTY_BUTTON_SHOW", 87);
            ONE_TAP_EMPTY_BUTTON_SHOW = eventType88;
            EventType eventType89 = new EventType("ONE_TAP_START_BUTTON_CLICK", 88);
            ONE_TAP_START_BUTTON_CLICK = eventType89;
            EventType eventType90 = new EventType("ONE_TAP_USER_BUTTON_CLICK", 89);
            ONE_TAP_USER_BUTTON_CLICK = eventType90;
            EventType eventType91 = new EventType("ONE_TAP_EMPTY_BUTTON_CLICK", 90);
            ONE_TAP_EMPTY_BUTTON_CLICK = eventType91;
            EventType eventType92 = new EventType("FIRST_AUTHORIZATION", 91);
            FIRST_AUTHORIZATION = eventType92;
            EventType eventType93 = new EventType("REGISTRATION_START", 92);
            REGISTRATION_START = eventType93;
            EventType eventType94 = new EventType("AUTH_START", 93);
            AUTH_START = eventType94;
            EventType eventType95 = new EventType("NO_USER_ACCOUNT_TAP", 94);
            NO_USER_ACCOUNT_TAP = eventType95;
            EventType eventType96 = new EventType("INPUT_PHONE", 95);
            INPUT_PHONE = eventType96;
            EventType eventType97 = new EventType("INPUT_EMAIL", 96);
            INPUT_EMAIL = eventType97;
            EventType eventType98 = new EventType("AVAILABLE_AUTH_WITHOUT_PASSWORD", 97);
            AVAILABLE_AUTH_WITHOUT_PASSWORD = eventType98;
            EventType eventType99 = new EventType("SELECT_AUTH_BY_PHONE", 98);
            SELECT_AUTH_BY_PHONE = eventType99;
            EventType eventType100 = new EventType("SELECT_AUTH_BY_PASSWORD", 99);
            SELECT_AUTH_BY_PASSWORD = eventType100;
            EventType eventType101 = new EventType("AUTH_CONFIRM", 100);
            AUTH_CONFIRM = eventType101;
            EventType eventType102 = new EventType("NO_WINDOW_OPENER_ERROR", 101);
            NO_WINDOW_OPENER_ERROR = eventType102;
            EventType eventType103 = new EventType("REGISTRATION_EXISTING_ACCOUNT_WITHOUT_PASSWORD", 102);
            REGISTRATION_EXISTING_ACCOUNT_WITHOUT_PASSWORD = eventType103;
            EventType eventType104 = new EventType("AUTH_PASSWORD", 103);
            AUTH_PASSWORD = eventType104;
            EventType eventType105 = new EventType("EXTERNAL_LINK_MINIAPP_OPEN", 104);
            EXTERNAL_LINK_MINIAPP_OPEN = eventType105;
            EventType eventType106 = new EventType("EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN", 105);
            EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN = eventType106;
            EventType eventType107 = new EventType("INCORRECT_CALL_CODE", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            INCORRECT_CALL_CODE = eventType107;
            EventType eventType108 = new EventType("CALL_CODE_SUCCESS_VERIFICATION", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
            CALL_CODE_SUCCESS_VERIFICATION = eventType108;
            EventType eventType109 = new EventType("INCORRECT_AUTHENTICATOR_CODE", 108);
            INCORRECT_AUTHENTICATOR_CODE = eventType109;
            EventType eventType110 = new EventType("SUCCESS_2FA_AUTHENTICATOR_CODE", 109);
            SUCCESS_2FA_AUTHENTICATOR_CODE = eventType110;
            EventType eventType111 = new EventType("CONTINUE_AS_USERNAME", 110);
            CONTINUE_AS_USERNAME = eventType111;
            EventType eventType112 = new EventType("TYPE_2FA_ACTIVE", 111);
            TYPE_2FA_ACTIVE = eventType112;
            EventType eventType113 = new EventType("QR_CODE_LINK_OPEN", 112);
            QR_CODE_LINK_OPEN = eventType113;
            EventType eventType114 = new EventType("ENTRY_LINK_OPEN", 113);
            ENTRY_LINK_OPEN = eventType114;
            EventType eventType115 = new EventType("ENTRY_BY_QR_CODE_CONFIRM_TAP", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            ENTRY_BY_QR_CODE_CONFIRM_TAP = eventType115;
            EventType eventType116 = new EventType("AUTH_QR_CODE_START", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
            AUTH_QR_CODE_START = eventType116;
            EventType eventType117 = new EventType("QR_CODE_SCANNED", 116);
            QR_CODE_SCANNED = eventType117;
            EventType eventType118 = new EventType("QR_CODE_REFRESH_TAP", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
            QR_CODE_REFRESH_TAP = eventType118;
            EventType eventType119 = new EventType("QR_CODE_EXPIRED", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            QR_CODE_EXPIRED = eventType119;
            EventType eventType120 = new EventType("AUTH_BY_QR_CODE", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            AUTH_BY_QR_CODE = eventType120;
            EventType eventType121 = new EventType("CAPTCHA_SUCCESS", 120);
            CAPTCHA_SUCCESS = eventType121;
            EventType eventType122 = new EventType("ENTRY_CONFIRM_TAP", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            ENTRY_CONFIRM_TAP = eventType122;
            EventType eventType123 = new EventType("ALERT_UNSAFE_AUTH_ERROR", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
            ALERT_UNSAFE_AUTH_ERROR = eventType123;
            EventType eventType124 = new EventType("ALERT_REFRESH_ERROR", 123);
            ALERT_REFRESH_ERROR = eventType124;
            EventType eventType125 = new EventType("AUTH_SUBPROFILE", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            AUTH_SUBPROFILE = eventType125;
            EventType eventType126 = new EventType("CREATE_SUBPROFILE_CLICK", 125);
            CREATE_SUBPROFILE_CLICK = eventType126;
            EventType eventType127 = new EventType("INVITE_SEND_SHARE_LINK", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            INVITE_SEND_SHARE_LINK = eventType127;
            EventType eventType128 = new EventType("CREATE_BUSINESS_START", 127);
            CREATE_BUSINESS_START = eventType128;
            EventType[] eventTypeArr = {eventType, eventType2, eventType3, eventType4, eventType5, eventType6, eventType7, eventType8, eventType9, eventType10, eventType11, eventType12, eventType13, eventType14, eventType15, eventType16, eventType17, eventType18, eventType19, eventType20, eventType21, eventType22, eventType23, eventType24, eventType25, eventType26, eventType27, eventType28, eventType29, eventType30, eventType31, eventType32, eventType33, eventType34, eventType35, eventType36, eventType37, eventType38, eventType39, eventType40, eventType41, eventType42, eventType43, eventType44, eventType45, eventType46, eventType47, eventType48, eventType49, eventType50, eventType51, eventType52, eventType53, eventType54, eventType55, eventType56, eventType57, eventType58, eventType59, eventType60, eventType61, eventType62, eventType63, eventType64, eventType65, eventType66, eventType67, eventType68, eventType69, eventType70, eventType71, eventType72, eventType73, eventType74, eventType75, eventType76, eventType77, eventType78, eventType79, eventType80, eventType81, eventType82, eventType83, eventType84, eventType85, eventType86, eventType87, eventType88, eventType89, eventType90, eventType91, eventType92, eventType93, eventType94, eventType95, eventType96, eventType97, eventType98, eventType99, eventType100, eventType101, eventType102, eventType103, eventType104, eventType105, eventType106, eventType107, eventType108, eventType109, eventType110, eventType111, eventType112, eventType113, eventType114, eventType115, eventType116, eventType117, eventType118, eventType119, eventType120, eventType121, eventType122, eventType123, eventType124, eventType125, eventType126, eventType127, eventType128};
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

    public SchemeStat$TypeRegistrationItem(EventType eventType, String str, Integer num, String str2, String str3, List<SchemeStat$RegistrationFieldItem> list, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num2, Error error, Integer num3, Integer num4, Integer num5) {
        this.eventType = eventType;
        this.sid = str;
        this.clientId = num;
        this.silentToken = str2;
        this.silentTokenUuid = str3;
        this.fields = list;
        this.screenTo = mobileOfficialAppsCoreNavStat$EventScreen;
        this.errorSubcode = num2;
        this.error = error;
        this.authProviders = num3;
        this.appId = num4;
        this.authAppId = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeRegistrationItem)) {
            return false;
        }
        SchemeStat$TypeRegistrationItem schemeStat$TypeRegistrationItem = (SchemeStat$TypeRegistrationItem) obj;
        return this.eventType == schemeStat$TypeRegistrationItem.eventType && epx.f(this.sid, schemeStat$TypeRegistrationItem.sid) && epx.f(this.clientId, schemeStat$TypeRegistrationItem.clientId) && epx.f(this.silentToken, schemeStat$TypeRegistrationItem.silentToken) && epx.f(this.silentTokenUuid, schemeStat$TypeRegistrationItem.silentTokenUuid) && epx.f(this.fields, schemeStat$TypeRegistrationItem.fields) && this.screenTo == schemeStat$TypeRegistrationItem.screenTo && epx.f(this.errorSubcode, schemeStat$TypeRegistrationItem.errorSubcode) && this.error == schemeStat$TypeRegistrationItem.error && epx.f(this.authProviders, schemeStat$TypeRegistrationItem.authProviders) && epx.f(this.appId, schemeStat$TypeRegistrationItem.appId) && epx.f(this.authAppId, schemeStat$TypeRegistrationItem.authAppId);
    }

    public final int hashCode() {
        int hashCode = this.eventType.hashCode() * 31;
        String str = this.sid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.clientId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.silentToken;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.silentTokenUuid;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SchemeStat$RegistrationFieldItem> list = this.fields;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = this.screenTo;
        int hashCode7 = (hashCode6 + (mobileOfficialAppsCoreNavStat$EventScreen == null ? 0 : mobileOfficialAppsCoreNavStat$EventScreen.hashCode())) * 31;
        Integer num2 = this.errorSubcode;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Error error = this.error;
        int hashCode9 = (hashCode8 + (error == null ? 0 : error.hashCode())) * 31;
        Integer num3 = this.authProviders;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.appId;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.authAppId;
        return hashCode11 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeRegistrationItem(eventType=");
        sb.append(this.eventType);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", silentToken=");
        sb.append(this.silentToken);
        sb.append(", silentTokenUuid=");
        sb.append(this.silentTokenUuid);
        sb.append(", fields=");
        sb.append(this.fields);
        sb.append(", screenTo=");
        sb.append(this.screenTo);
        sb.append(", errorSubcode=");
        sb.append(this.errorSubcode);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", authProviders=");
        sb.append(this.authProviders);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", authAppId=");
        return uqi.b(sb, this.authAppId, ')');
    }

    public /* synthetic */ SchemeStat$TypeRegistrationItem(EventType eventType, String str, Integer num, String str2, String str3, List list, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, Integer num2, Error error, Integer num3, Integer num4, Integer num5, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : mobileOfficialAppsCoreNavStat$EventScreen, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : error, (i & 512) != 0 ? null : num3, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : num5);
    }
}
