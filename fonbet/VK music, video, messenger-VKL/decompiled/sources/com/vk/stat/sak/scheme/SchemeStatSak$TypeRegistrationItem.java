package com.vk.stat.sak.scheme;

import com.ironsource.InterfaceC4413l1;
import com.ironsource.O6;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeAction;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import xsna.asp;
import xsna.atv0;
import xsna.e370;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$TypeRegistrationItem implements SchemeStatSak$TypeAction.b {

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
    private final List<SchemeStatSak$RegistrationFieldItem> fields;

    @pmi0("flow_entry_points")
    private final String flowEntryPoints;

    @pmi0("flow_source")
    private final String flowSource;

    @pmi0("multiacc_id")
    private final String multiaccId;

    @pmi0("screen_to")
    private final SchemeStatSak$EventScreen screenTo;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("silent_token")
    private final String silentToken;

    @pmi0("silent_token_uuid")
    private final String silentTokenUuid;

    @pmi0("user_id")
    private final Long userId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStatSak.kt */
    public static final class Error {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Error[] $VALUES;

        @pmi0("access_error")
        public static final Error ACCESS_ERROR;

        @pmi0("accounts_limit_reached_error")
        public static final Error ACCOUNTS_LIMIT_REACHED_ERROR;

        @pmi0("account_not_exist")
        public static final Error ACCOUNT_NOT_EXIST;

        @pmi0("auth_code_missing")
        public static final Error AUTH_CODE_MISSING;

        @pmi0("auth_unknown")
        public static final Error AUTH_UNKNOWN;

        @pmi0("email_already_used")
        public static final Error EMAIL_ALREADY_USED;

        @pmi0("empty_login")
        public static final Error EMPTY_LOGIN;

        @pmi0("empty_password")
        public static final Error EMPTY_PASSWORD;

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

        @pmi0("invalid_email")
        public static final Error INVALID_EMAIL;

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

        @pmi0("login_phone_change")
        public static final Error LOGIN_PHONE_CHANGE;

        @pmi0("missing_params")
        public static final Error MISSING_PARAMS;

        @pmi0("mobile_qr_auth_error")
        public static final Error MOBILE_QR_AUTH_ERROR;

        @pmi0("mobile_qr_video_load_error")
        public static final Error MOBILE_QR_VIDEO_LOAD_ERROR;

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

        @pmi0("user_deleted")
        public static final Error USER_DELETED;

        @pmi0("user_logout_all")
        public static final Error USER_LOGOUT_ALL;

        @pmi0("vkme_accounts_limit_reached_error")
        public static final Error VKME_ACCOUNTS_LIMIT_REACHED_ERROR;

        static {
            Error error = new Error("FLOOD", 0);
            FLOOD = error;
            Error error2 = new Error("ACCESS_ERROR", 1);
            ACCESS_ERROR = error2;
            Error error3 = new Error("AUTH_CODE_MISSING", 2);
            AUTH_CODE_MISSING = error3;
            Error error4 = new Error("AUTH_UNKNOWN", 3);
            AUTH_UNKNOWN = error4;
            Error error5 = new Error("SERVER_ERROR", 4);
            SERVER_ERROR = error5;
            Error error6 = new Error("SMS_RESEND_DELAY", 5);
            SMS_RESEND_DELAY = error6;
            Error error7 = new Error("INVALID_PARAMS", 6);
            INVALID_PARAMS = error7;
            Error error8 = new Error("MISSING_PARAMS", 7);
            MISSING_PARAMS = error8;
            Error error9 = new Error("INVALID_CAPTCHA", 8);
            INVALID_CAPTCHA = error9;
            Error error10 = new Error("INVALID_CODE", 9);
            INVALID_CODE = error10;
            Error error11 = new Error("INVALID_NAME", 10);
            INVALID_NAME = error11;
            Error error12 = new Error("INVALID_SEX", 11);
            INVALID_SEX = error12;
            Error error13 = new Error("INVALID_BIRTHDAY", 12);
            INVALID_BIRTHDAY = error13;
            Error error14 = new Error("INVALID_PASSWORD", 13);
            INVALID_PASSWORD = error14;
            Error error15 = new Error("INVALID_PHONE", 14);
            INVALID_PHONE = error15;
            Error error16 = new Error("INVALID_EMAIL", 15);
            INVALID_EMAIL = error16;
            Error error17 = new Error("PHONE_BANNED", 16);
            PHONE_BANNED = error17;
            Error error18 = new Error("PHONE_HOLDER_BANNED", 17);
            PHONE_HOLDER_BANNED = error18;
            Error error19 = new Error("PHONE_ALREADY_USED", 18);
            PHONE_ALREADY_USED = error19;
            Error error20 = new Error("PHONE_CHANGE_LIMIT", 19);
            PHONE_CHANGE_LIMIT = error20;
            Error error21 = new Error("PHONE_CHECK_CODE_LIMIT", 20);
            PHONE_CHECK_CODE_LIMIT = error21;
            Error error22 = new Error("EXTERNAL_INVALID_PHONE", 21);
            EXTERNAL_INVALID_PHONE = error22;
            Error error23 = new Error("EXTERNAL_PHONE_PROCESSING", 22);
            EXTERNAL_PHONE_PROCESSING = error23;
            Error error24 = new Error("EMAIL_ALREADY_USED", 23);
            EMAIL_ALREADY_USED = error24;
            Error error25 = new Error("MOBILE_QR_VIDEO_LOAD_ERROR", 24);
            MOBILE_QR_VIDEO_LOAD_ERROR = error25;
            Error error26 = new Error("MOBILE_QR_AUTH_ERROR", 25);
            MOBILE_QR_AUTH_ERROR = error26;
            Error error27 = new Error("ACCOUNTS_LIMIT_REACHED_ERROR", 26);
            ACCOUNTS_LIMIT_REACHED_ERROR = error27;
            Error error28 = new Error("VKME_ACCOUNTS_LIMIT_REACHED_ERROR", 27);
            VKME_ACCOUNTS_LIMIT_REACHED_ERROR = error28;
            Error error29 = new Error("USER_DELETED", 28);
            USER_DELETED = error29;
            Error error30 = new Error("USER_LOGOUT_ALL", 29);
            USER_LOGOUT_ALL = error30;
            Error error31 = new Error("EMPTY_LOGIN", 30);
            EMPTY_LOGIN = error31;
            Error error32 = new Error("EMPTY_PASSWORD", 31);
            EMPTY_PASSWORD = error32;
            Error error33 = new Error("LOGIN_PHONE_CHANGE", 32);
            LOGIN_PHONE_CHANGE = error33;
            Error error34 = new Error("ACCOUNT_NOT_EXIST", 33);
            ACCOUNT_NOT_EXIST = error34;
            Error[] errorArr = {error, error2, error3, error4, error5, error6, error7, error8, error9, error10, error11, error12, error13, error14, error15, error16, error17, error18, error19, error20, error21, error22, error23, error24, error25, error26, error27, error28, error29, error30, error31, error32, error33, error34};
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
    /* compiled from: SchemeStatSak.kt */
    public static final class EventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @pmi0("screen_proceed")
        public static final EventType SCREEN_PROCEED = new EventType("SCREEN_PROCEED", 0);

        @pmi0("screen_return")
        public static final EventType SCREEN_RETURN = new EventType("SCREEN_RETURN", 1);

        @pmi0("screen_skip")
        public static final EventType SCREEN_SKIP = new EventType("SCREEN_SKIP", 2);

        @pmi0("screen_blur")
        public static final EventType SCREEN_BLUR = new EventType("SCREEN_BLUR", 3);

        @pmi0("screen_focus")
        public static final EventType SCREEN_FOCUS = new EventType("SCREEN_FOCUS", 4);

        @pmi0("screen_loading_aborted")
        public static final EventType SCREEN_LOADING_ABORTED = new EventType("SCREEN_LOADING_ABORTED", 5);

        @pmi0("screen_loading_failed")
        public static final EventType SCREEN_LOADING_FAILED = new EventType("SCREEN_LOADING_FAILED", 6);

        @pmi0("silent_auth_info_obtain_error")
        public static final EventType SILENT_AUTH_INFO_OBTAIN_ERROR = new EventType("SILENT_AUTH_INFO_OBTAIN_ERROR", 7);

        @pmi0("common_server_error")
        public static final EventType COMMON_SERVER_ERROR = new EventType("COMMON_SERVER_ERROR", 8);

        @pmi0("connect_facebook_failed")
        public static final EventType CONNECT_FACEBOOK_FAILED = new EventType("CONNECT_FACEBOOK_FAILED", 9);

        @pmi0("connect_ok_failed")
        public static final EventType CONNECT_OK_FAILED = new EventType("CONNECT_OK_FAILED", 10);

        @pmi0("connect_twitter_failed")
        public static final EventType CONNECT_TWITTER_FAILED = new EventType("CONNECT_TWITTER_FAILED", 11);

        @pmi0("connect_gmail_failed")
        public static final EventType CONNECT_GMAIL_FAILED = new EventType("CONNECT_GMAIL_FAILED", 12);

        @pmi0("show_import_contacts_confirmation_modal")
        public static final EventType SHOW_IMPORT_CONTACTS_CONFIRMATION_MODAL = new EventType("SHOW_IMPORT_CONTACTS_CONFIRMATION_MODAL", 13);

        @pmi0("resend_sms_code")
        public static final EventType RESEND_SMS_CODE = new EventType("RESEND_SMS_CODE", 14);

        @pmi0("resend_sms_code_failed")
        public static final EventType RESEND_SMS_CODE_FAILED = new EventType("RESEND_SMS_CODE_FAILED", 15);

        @pmi0("send_sms_code_failed")
        public static final EventType SEND_SMS_CODE_FAILED = new EventType("SEND_SMS_CODE_FAILED", 16);

        @pmi0("sms_code_detected")
        public static final EventType SMS_CODE_DETECTED = new EventType("SMS_CODE_DETECTED", 17);

        @pmi0("sex_detected")
        public static final EventType SEX_DETECTED = new EventType("SEX_DETECTED", 18);

        @pmi0("incorrect_sms_code")
        public static final EventType INCORRECT_SMS_CODE = new EventType("INCORRECT_SMS_CODE", 19);

        @pmi0("incorrect_password")
        public static final EventType INCORRECT_PASSWORD = new EventType("INCORRECT_PASSWORD", 20);

        @pmi0("incorrect_name")
        public static final EventType INCORRECT_NAME = new EventType("INCORRECT_NAME", 21);

        @pmi0("incorrect_captcha")
        public static final EventType INCORRECT_CAPTCHA = new EventType("INCORRECT_CAPTCHA", 22);

        @pmi0("incorrect_phone_number")
        public static final EventType INCORRECT_PHONE_NUMBER = new EventType("INCORRECT_PHONE_NUMBER", 23);

        @pmi0("incorrect_password_popup")
        public static final EventType INCORRECT_PASSWORD_POPUP = new EventType("INCORRECT_PASSWORD_POPUP", 24);

        @pmi0("incorrect_email")
        public static final EventType INCORRECT_EMAIL = new EventType("INCORRECT_EMAIL", 25);

        @pmi0("incorrect_email_code")
        public static final EventType INCORRECT_EMAIL_CODE = new EventType("INCORRECT_EMAIL_CODE", 26);

        @pmi0("select_country")
        public static final EventType SELECT_COUNTRY = new EventType("SELECT_COUNTRY", 27);

        @pmi0("select_country_done")
        public static final EventType SELECT_COUNTRY_DONE = new EventType("SELECT_COUNTRY_DONE", 28);

        @pmi0("input_number_interaction")
        public static final EventType INPUT_NUMBER_INTERACTION = new EventType("INPUT_NUMBER_INTERACTION", 29);

        @pmi0("input_code_interaction")
        public static final EventType INPUT_CODE_INTERACTION = new EventType("INPUT_CODE_INTERACTION", 30);

        @pmi0("input_email_code_interaction")
        public static final EventType INPUT_EMAIL_CODE_INTERACTION = new EventType("INPUT_EMAIL_CODE_INTERACTION", 31);

        @pmi0("input_email_interaction")
        public static final EventType INPUT_EMAIL_INTERACTION = new EventType("INPUT_EMAIL_INTERACTION", 32);

        @pmi0("proceed_other_country_code")
        public static final EventType PROCEED_OTHER_COUNTRY_CODE = new EventType("PROCEED_OTHER_COUNTRY_CODE", 33);

        @pmi0("existing_phone_number")
        public static final EventType EXISTING_PHONE_NUMBER = new EventType("EXISTING_PHONE_NUMBER", 34);

        @pmi0("existing_phone_number_tap")
        public static final EventType EXISTING_PHONE_NUMBER_TAP = new EventType("EXISTING_PHONE_NUMBER_TAP", 35);

        @pmi0("import_contacts_failed")
        public static final EventType IMPORT_CONTACTS_FAILED = new EventType("IMPORT_CONTACTS_FAILED", 36);

        @pmi0("photo_uploading_aborted")
        public static final EventType PHOTO_UPLOADING_ABORTED = new EventType("PHOTO_UPLOADING_ABORTED", 37);

        @pmi0("photo_uploading_failed")
        public static final EventType PHOTO_UPLOADING_FAILED = new EventType("PHOTO_UPLOADING_FAILED", 38);

        @pmi0("push_request_allow")
        public static final EventType PUSH_REQUEST_ALLOW = new EventType("PUSH_REQUEST_ALLOW", 39);

        @pmi0("push_request_deny")
        public static final EventType PUSH_REQUEST_DENY = new EventType("PUSH_REQUEST_DENY", 40);

        @pmi0("select_subject")
        public static final EventType SELECT_SUBJECT = new EventType("SELECT_SUBJECT", 41);

        @pmi0("subscribe_community")
        public static final EventType SUBSCRIBE_COMMUNITY = new EventType("SUBSCRIBE_COMMUNITY", 42);

        @pmi0("unsubscribe_community")
        public static final EventType UNSUBSCRIBE_COMMUNITY = new EventType("UNSUBSCRIBE_COMMUNITY", 43);

        @pmi0("see_more")
        public static final EventType SEE_MORE = new EventType("SEE_MORE", 44);

        @pmi0("silent_token_provided")
        public static final EventType SILENT_TOKEN_PROVIDED = new EventType("SILENT_TOKEN_PROVIDED", 45);

        @pmi0("silent_token_provided_authorization")
        public static final EventType SILENT_TOKEN_PROVIDED_AUTHORIZATION = new EventType("SILENT_TOKEN_PROVIDED_AUTHORIZATION", 46);

        @pmi0("silent_token_provided_registration")
        public static final EventType SILENT_TOKEN_PROVIDED_REGISTRATION = new EventType("SILENT_TOKEN_PROVIDED_REGISTRATION", 47);

        @pmi0("auth_by_login")
        public static final EventType AUTH_BY_LOGIN = new EventType("AUTH_BY_LOGIN", 48);

        @pmi0("auth_silent")
        public static final EventType AUTH_SILENT = new EventType("AUTH_SILENT", 49);

        @pmi0("auth_fast_silent")
        public static final EventType AUTH_FAST_SILENT = new EventType("AUTH_FAST_SILENT", 50);

        @pmi0("auth_by_oauth")
        public static final EventType AUTH_BY_OAUTH = new EventType("AUTH_BY_OAUTH", 51);

        @pmi0("registration")
        public static final EventType REGISTRATION = new EventType("REGISTRATION", 52);

        @pmi0("auth_by_unknown")
        public static final EventType AUTH_BY_UNKNOWN = new EventType("AUTH_BY_UNKNOWN", 53);

        @pmi0("auth_by_phone")
        public static final EventType AUTH_BY_PHONE = new EventType("AUTH_BY_PHONE", 54);

        @pmi0("auth_by_button")
        public static final EventType AUTH_BY_BUTTON = new EventType("AUTH_BY_BUTTON", 55);

        @pmi0("auth_by_email")
        public static final EventType AUTH_BY_EMAIL = new EventType("AUTH_BY_EMAIL", 56);

        @pmi0("auth_by_ecosystem_push")
        public static final EventType AUTH_BY_ECOSYSTEM_PUSH = new EventType("AUTH_BY_ECOSYSTEM_PUSH", 57);

        @pmi0("auth_by_autologin")
        public static final EventType AUTH_BY_AUTOLOGIN = new EventType("AUTH_BY_AUTOLOGIN", 58);

        @pmi0("auth_by_qr_code")
        public static final EventType AUTH_BY_QR_CODE = new EventType("AUTH_BY_QR_CODE", 59);

        @pmi0("auth_by_restore")
        public static final EventType AUTH_BY_RESTORE = new EventType("AUTH_BY_RESTORE", 60);

        @pmi0("auth_confirm")
        public static final EventType AUTH_CONFIRM = new EventType("AUTH_CONFIRM", 61);

        @pmi0("choose_another_way")
        public static final EventType CHOOSE_ANOTHER_WAY = new EventType("CHOOSE_ANOTHER_WAY", 62);

        @pmi0("access_token_provided")
        public static final EventType ACCESS_TOKEN_PROVIDED = new EventType("ACCESS_TOKEN_PROVIDED", 63);

        @pmi0("open_account")
        public static final EventType OPEN_ACCOUNT = new EventType("OPEN_ACCOUNT", 64);

        @pmi0("auth_subapp")
        public static final EventType AUTH_SUBAPP = new EventType("AUTH_SUBAPP", 65);

        @pmi0("auth_subapp_success")
        public static final EventType AUTH_SUBAPP_SUCCESS = new EventType("AUTH_SUBAPP_SUCCESS", 66);

        @pmi0("profile_info_retrieved")
        public static final EventType PROFILE_INFO_RETRIEVED = new EventType("PROFILE_INFO_RETRIEVED", 67);

        @pmi0("code_send")
        public static final EventType CODE_SEND = new EventType("CODE_SEND", 68);

        @pmi0("code_call")
        public static final EventType CODE_CALL = new EventType("CODE_CALL", 69);

        @pmi0("success_2fa")
        public static final EventType SUCCESS_2FA = new EventType("SUCCESS_2FA", 70);

        @pmi0("partial_expand_success")
        public static final EventType PARTIAL_EXPAND_SUCCESS = new EventType("PARTIAL_EXPAND_SUCCESS", 71);

        @pmi0("unified_account_all_services")
        public static final EventType UNIFIED_ACCOUNT_ALL_SERVICES = new EventType("UNIFIED_ACCOUNT_ALL_SERVICES", 72);

        @pmi0("fast_silent_token_provided_authorization")
        public static final EventType FAST_SILENT_TOKEN_PROVIDED_AUTHORIZATION = new EventType("FAST_SILENT_TOKEN_PROVIDED_AUTHORIZATION", 73);

        @pmi0("silent_auth_resume_click")
        public static final EventType SILENT_AUTH_RESUME_CLICK = new EventType("SILENT_AUTH_RESUME_CLICK", 74);

        @pmi0("to_vk_client_unsafe_st")
        public static final EventType TO_VK_CLIENT_UNSAFE_ST = new EventType("TO_VK_CLIENT_UNSAFE_ST", 75);

        @pmi0("from_vk_client_full_st")
        public static final EventType FROM_VK_CLIENT_FULL_ST = new EventType("FROM_VK_CLIENT_FULL_ST", 76);

        @pmi0("to_vk_client_without_st")
        public static final EventType TO_VK_CLIENT_WITHOUT_ST = new EventType("TO_VK_CLIENT_WITHOUT_ST", 77);

        @pmi0("from_vk_client_without_st")
        public static final EventType FROM_VK_CLIENT_WITHOUT_ST = new EventType("FROM_VK_CLIENT_WITHOUT_ST", 78);

        @pmi0("loading_silent_auth_existing_account")
        public static final EventType LOADING_SILENT_AUTH_EXISTING_ACCOUNT = new EventType("LOADING_SILENT_AUTH_EXISTING_ACCOUNT", 79);

        @pmi0("service_open_dl")
        public static final EventType SERVICE_OPEN_DL = new EventType("SERVICE_OPEN_DL", 80);

        @pmi0("service_not_open")
        public static final EventType SERVICE_NOT_OPEN = new EventType("SERVICE_NOT_OPEN", 81);

        @pmi0("vk_mail_created")
        public static final EventType VK_MAIL_CREATED = new EventType("VK_MAIL_CREATED", 82);

        @pmi0("vk_mail_selected")
        public static final EventType VK_MAIL_SELECTED = new EventType("VK_MAIL_SELECTED", 83);

        @pmi0("error_vk_mail_created")
        public static final EventType ERROR_VK_MAIL_CREATED = new EventType("ERROR_VK_MAIL_CREATED", 84);

        @pmi0("error_vk_mail_login")
        public static final EventType ERROR_VK_MAIL_LOGIN = new EventType("ERROR_VK_MAIL_LOGIN", 85);

        @pmi0("login_tap")
        public static final EventType LOGIN_TAP = new EventType("LOGIN_TAP", 86);

        @pmi0("passw_tap")
        public static final EventType PASSW_TAP = new EventType("PASSW_TAP", 87);

        @pmi0("email_reg_allowed")
        public static final EventType EMAIL_REG_ALLOWED = new EventType("EMAIL_REG_ALLOWED", 88);

        @pmi0("email_reg_denied")
        public static final EventType EMAIL_REG_DENIED = new EventType("EMAIL_REG_DENIED", 89);

        @pmi0("registration_email_not_found")
        public static final EventType REGISTRATION_EMAIL_NOT_FOUND = new EventType("REGISTRATION_EMAIL_NOT_FOUND", 90);

        @pmi0("registration_password_not_found")
        public static final EventType REGISTRATION_PASSWORD_NOT_FOUND = new EventType("REGISTRATION_PASSWORD_NOT_FOUND", 91);

        @pmi0("error_number_linked")
        public static final EventType ERROR_NUMBER_LINKED = new EventType("ERROR_NUMBER_LINKED", 92);

        @pmi0("one_tap_start_button_show")
        public static final EventType ONE_TAP_START_BUTTON_SHOW = new EventType("ONE_TAP_START_BUTTON_SHOW", 93);

        @pmi0("one_tap_user_button_show")
        public static final EventType ONE_TAP_USER_BUTTON_SHOW = new EventType("ONE_TAP_USER_BUTTON_SHOW", 94);

        @pmi0("one_tap_empty_button_show")
        public static final EventType ONE_TAP_EMPTY_BUTTON_SHOW = new EventType("ONE_TAP_EMPTY_BUTTON_SHOW", 95);

        @pmi0("one_tap_start_button_click")
        public static final EventType ONE_TAP_START_BUTTON_CLICK = new EventType("ONE_TAP_START_BUTTON_CLICK", 96);

        @pmi0("one_tap_user_button_click")
        public static final EventType ONE_TAP_USER_BUTTON_CLICK = new EventType("ONE_TAP_USER_BUTTON_CLICK", 97);

        @pmi0("one_tap_empty_button_click")
        public static final EventType ONE_TAP_EMPTY_BUTTON_CLICK = new EventType("ONE_TAP_EMPTY_BUTTON_CLICK", 98);

        @pmi0("first_authorization")
        public static final EventType FIRST_AUTHORIZATION = new EventType("FIRST_AUTHORIZATION", 99);

        @pmi0("registration_start")
        public static final EventType REGISTRATION_START = new EventType("REGISTRATION_START", 100);

        @pmi0("registration_complete")
        public static final EventType REGISTRATION_COMPLETE = new EventType("REGISTRATION_COMPLETE", 101);

        @pmi0("auth_start")
        public static final EventType AUTH_START = new EventType("AUTH_START", 102);

        @pmi0("no_user_account_tap")
        public static final EventType NO_USER_ACCOUNT_TAP = new EventType("NO_USER_ACCOUNT_TAP", 103);

        @pmi0("input_phone")
        public static final EventType INPUT_PHONE = new EventType("INPUT_PHONE", 104);

        @pmi0("input_email")
        public static final EventType INPUT_EMAIL = new EventType("INPUT_EMAIL", 105);

        @pmi0("input_login")
        public static final EventType INPUT_LOGIN = new EventType("INPUT_LOGIN", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);

        @pmi0("available_auth_without_password")
        public static final EventType AVAILABLE_AUTH_WITHOUT_PASSWORD = new EventType("AVAILABLE_AUTH_WITHOUT_PASSWORD", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);

        @pmi0("select_auth_by_phone")
        public static final EventType SELECT_AUTH_BY_PHONE = new EventType("SELECT_AUTH_BY_PHONE", 108);

        @pmi0("select_auth_by_password")
        public static final EventType SELECT_AUTH_BY_PASSWORD = new EventType("SELECT_AUTH_BY_PASSWORD", 109);

        @pmi0("no_window_opener_error")
        public static final EventType NO_WINDOW_OPENER_ERROR = new EventType("NO_WINDOW_OPENER_ERROR", 110);

        @pmi0("registration_existing_account_without_password")
        public static final EventType REGISTRATION_EXISTING_ACCOUNT_WITHOUT_PASSWORD = new EventType("REGISTRATION_EXISTING_ACCOUNT_WITHOUT_PASSWORD", 111);

        @pmi0("auth_password")
        public static final EventType AUTH_PASSWORD = new EventType("AUTH_PASSWORD", 112);

        @pmi0("external_link_miniapp_open")
        public static final EventType EXTERNAL_LINK_MINIAPP_OPEN = new EventType("EXTERNAL_LINK_MINIAPP_OPEN", 113);

        @pmi0("external_link_miniapp_success_return")
        public static final EventType EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN = new EventType("EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);

        @pmi0("incorrect_call_code")
        public static final EventType INCORRECT_CALL_CODE = new EventType("INCORRECT_CALL_CODE", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);

        @pmi0("call_code_success_verification")
        public static final EventType CALL_CODE_SUCCESS_VERIFICATION = new EventType("CALL_CODE_SUCCESS_VERIFICATION", 116);

        @pmi0("incorrect_authenticator_code")
        public static final EventType INCORRECT_AUTHENTICATOR_CODE = new EventType("INCORRECT_AUTHENTICATOR_CODE", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);

        @pmi0("success_2fa_authenticator_code")
        public static final EventType SUCCESS_2FA_AUTHENTICATOR_CODE = new EventType("SUCCESS_2FA_AUTHENTICATOR_CODE", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);

        @pmi0("token_reload_from_am")
        public static final EventType TOKEN_RELOAD_FROM_AM = new EventType("TOKEN_RELOAD_FROM_AM", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);

        @pmi0("continue_as_username")
        public static final EventType CONTINUE_AS_USERNAME = new EventType("CONTINUE_AS_USERNAME", 120);

        @pmi0("2fa_active")
        public static final EventType TYPE_2FA_ACTIVE = new EventType("TYPE_2FA_ACTIVE", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);

        @pmi0("qr_code_link_open")
        public static final EventType QR_CODE_LINK_OPEN = new EventType("QR_CODE_LINK_OPEN", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);

        @pmi0("qr_code_expired")
        public static final EventType QR_CODE_EXPIRED = new EventType("QR_CODE_EXPIRED", 123);

        @pmi0("entry_link_open")
        public static final EventType ENTRY_LINK_OPEN = new EventType("ENTRY_LINK_OPEN", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);

        @pmi0("entry_by_qr_code_confirm_tap")
        public static final EventType ENTRY_BY_QR_CODE_CONFIRM_TAP = new EventType("ENTRY_BY_QR_CODE_CONFIRM_TAP", 125);

        @pmi0("continue_verification_tap")
        public static final EventType CONTINUE_VERIFICATION_TAP = new EventType("CONTINUE_VERIFICATION_TAP", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);

        @pmi0("verify_by_another_way_tap")
        public static final EventType VERIFY_BY_ANOTHER_WAY_TAP = new EventType("VERIFY_BY_ANOTHER_WAY_TAP", 127);

        @pmi0("verify_again_tap")
        public static final EventType VERIFY_AGAIN_TAP = new EventType("VERIFY_AGAIN_TAP", 128);

        @pmi0("phone_success_verification")
        public static final EventType PHONE_SUCCESS_VERIFICATION = new EventType("PHONE_SUCCESS_VERIFICATION", 129);

        @pmi0("alert_verification_code_error")
        public static final EventType ALERT_VERIFICATION_CODE_ERROR = new EventType("ALERT_VERIFICATION_CODE_ERROR", 130);

        @pmi0("alert_sms_already_send")
        public static final EventType ALERT_SMS_ALREADY_SEND = new EventType("ALERT_SMS_ALREADY_SEND", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);

        @pmi0("alert_no_available_factors")
        public static final EventType ALERT_NO_AVAILABLE_FACTORS = new EventType("ALERT_NO_AVAILABLE_FACTORS", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);

        @pmi0("captcha_success")
        public static final EventType CAPTCHA_SUCCESS = new EventType("CAPTCHA_SUCCESS", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);

        @pmi0("entry_confirm_tap")
        public static final EventType ENTRY_CONFIRM_TAP = new EventType("ENTRY_CONFIRM_TAP", 134);

        @pmi0("alert_unsafe_auth_error")
        public static final EventType ALERT_UNSAFE_AUTH_ERROR = new EventType("ALERT_UNSAFE_AUTH_ERROR", 135);

        @pmi0("alert_refresh_error")
        public static final EventType ALERT_REFRESH_ERROR = new EventType("ALERT_REFRESH_ERROR", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);

        @pmi0("auth_subprofile")
        public static final EventType AUTH_SUBPROFILE = new EventType("AUTH_SUBPROFILE", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);

        @pmi0("smart_lock_use_suggest")
        public static final EventType SMART_LOCK_USE_SUGGEST = new EventType("SMART_LOCK_USE_SUGGEST", 138);

        @pmi0("smart_lock_use_agreed")
        public static final EventType SMART_LOCK_USE_AGREED = new EventType("SMART_LOCK_USE_AGREED", 139);

        @pmi0("smart_lock_use_canceled")
        public static final EventType SMART_LOCK_USE_CANCELED = new EventType("SMART_LOCK_USE_CANCELED", VersionConstants.PRODUCT_MAJOR_VERSION);

        @pmi0("smart_lock_save_suggest")
        public static final EventType SMART_LOCK_SAVE_SUGGEST = new EventType("SMART_LOCK_SAVE_SUGGEST", 141);

        @pmi0("smart_lock_saving_confirmed")
        public static final EventType SMART_LOCK_SAVING_CONFIRMED = new EventType("SMART_LOCK_SAVING_CONFIRMED", 142);

        @pmi0("smart_lock_saving_declined")
        public static final EventType SMART_LOCK_SAVING_DECLINED = new EventType("SMART_LOCK_SAVING_DECLINED", 143);

        @pmi0("google_phone_hint_opened")
        public static final EventType GOOGLE_PHONE_HINT_OPENED = new EventType("GOOGLE_PHONE_HINT_OPENED", 144);

        @pmi0("google_phone_hint_added")
        public static final EventType GOOGLE_PHONE_HINT_ADDED = new EventType("GOOGLE_PHONE_HINT_ADDED", 145);

        @pmi0("google_phone_hint_skip")
        public static final EventType GOOGLE_PHONE_HINT_SKIP = new EventType("GOOGLE_PHONE_HINT_SKIP", 146);

        @pmi0("google_phone_hint_nothing_found")
        public static final EventType GOOGLE_PHONE_HINT_NOTHING_FOUND = new EventType("GOOGLE_PHONE_HINT_NOTHING_FOUND", 147);

        @pmi0("create_subprofile_click")
        public static final EventType CREATE_SUBPROFILE_CLICK = new EventType("CREATE_SUBPROFILE_CLICK", 148);

        @pmi0("oauth_ask_confirmed")
        public static final EventType OAUTH_ASK_CONFIRMED = new EventType("OAUTH_ASK_CONFIRMED", 149);

        @pmi0("yandex_new_number")
        public static final EventType YANDEX_NEW_NUMBER = new EventType("YANDEX_NEW_NUMBER", 150);

        @pmi0("alert_something_went_wrong")
        public static final EventType ALERT_SOMETHING_WENT_WRONG = new EventType("ALERT_SOMETHING_WENT_WRONG", 151);

        @pmi0("tinkoff_new_number")
        public static final EventType TINKOFF_NEW_NUMBER = new EventType("TINKOFF_NEW_NUMBER", 152);

        @pmi0("sber_new_number")
        public static final EventType SBER_NEW_NUMBER = new EventType("SBER_NEW_NUMBER", 153);

        @pmi0("multiacc_add_another_account_tap")
        public static final EventType MULTIACC_ADD_ANOTHER_ACCOUNT_TAP = new EventType("MULTIACC_ADD_ANOTHER_ACCOUNT_TAP", 154);

        @pmi0("multiacc_drop_account_tap")
        public static final EventType MULTIACC_DROP_ACCOUNT_TAP = new EventType("MULTIACC_DROP_ACCOUNT_TAP", 155);

        @pmi0("multiacc_drop_account")
        public static final EventType MULTIACC_DROP_ACCOUNT = new EventType("MULTIACC_DROP_ACCOUNT", 156);

        @pmi0("multi_acc_add_account_tap")
        public static final EventType MULTI_ACC_ADD_ACCOUNT_TAP = new EventType("MULTI_ACC_ADD_ACCOUNT_TAP", 157);

        @pmi0("multi_acc_add_account")
        public static final EventType MULTI_ACC_ADD_ACCOUNT = new EventType("MULTI_ACC_ADD_ACCOUNT", 158);

        @pmi0("account_was_added_to_multiacc_with_auth")
        public static final EventType ACCOUNT_WAS_ADDED_TO_MULTIACC_WITH_AUTH = new EventType("ACCOUNT_WAS_ADDED_TO_MULTIACC_WITH_AUTH", 159);

        @pmi0("select_account_tap")
        public static final EventType SELECT_ACCOUNT_TAP = new EventType("SELECT_ACCOUNT_TAP", 160);

        @pmi0("switch_account_tap")
        public static final EventType SWITCH_ACCOUNT_TAP = new EventType("SWITCH_ACCOUNT_TAP", 161);

        @pmi0("switch_from_account")
        public static final EventType SWITCH_FROM_ACCOUNT = new EventType("SWITCH_FROM_ACCOUNT", 162);

        @pmi0("switch_to_account")
        public static final EventType SWITCH_TO_ACCOUNT = new EventType("SWITCH_TO_ACCOUNT", 163);

        @pmi0("drop_account_tap")
        public static final EventType DROP_ACCOUNT_TAP = new EventType("DROP_ACCOUNT_TAP", 164);

        @pmi0("full_logout")
        public static final EventType FULL_LOGOUT = new EventType("FULL_LOGOUT", 165);

        @pmi0("reauthtorization_start")
        public static final EventType REAUTHTORIZATION_START = new EventType("REAUTHTORIZATION_START", 166);

        @pmi0("reauthtorization_cancelled")
        public static final EventType REAUTHTORIZATION_CANCELLED = new EventType("REAUTHTORIZATION_CANCELLED", 167);

        @pmi0("auth_by_passkey")
        public static final EventType AUTH_BY_PASSKEY = new EventType("AUTH_BY_PASSKEY", 168);

        @pmi0("auth_passkey_only_for_phone_no_start")
        public static final EventType AUTH_PASSKEY_ONLY_FOR_PHONE_NO_START = new EventType("AUTH_PASSKEY_ONLY_FOR_PHONE_NO_START", 169);

        @pmi0("passkey_screen_open")
        public static final EventType PASSKEY_SCREEN_OPEN = new EventType("PASSKEY_SCREEN_OPEN", 170);

        @pmi0("passkey_screen_canceled")
        public static final EventType PASSKEY_SCREEN_CANCELED = new EventType("PASSKEY_SCREEN_CANCELED", 171);

        @pmi0("start_passkey_again_tap")
        public static final EventType START_PASSKEY_AGAIN_TAP = new EventType("START_PASSKEY_AGAIN_TAP", 172);

        @pmi0("google_new_number")
        public static final EventType GOOGLE_NEW_NUMBER = new EventType("GOOGLE_NEW_NUMBER", 173);

        @pmi0("service_logout")
        public static final EventType SERVICE_LOGOUT = new EventType("SERVICE_LOGOUT", 174);

        @pmi0("continue_tap")
        public static final EventType CONTINUE_TAP = new EventType("CONTINUE_TAP", 175);

        @pmi0("choose_another_account_tap")
        public static final EventType CHOOSE_ANOTHER_ACCOUNT_TAP = new EventType("CHOOSE_ANOTHER_ACCOUNT_TAP", 176);

        @pmi0("choose_account_tap")
        public static final EventType CHOOSE_ACCOUNT_TAP = new EventType("CHOOSE_ACCOUNT_TAP", 177);

        @pmi0("its_ok_tap")
        public static final EventType ITS_OK_TAP = new EventType("ITS_OK_TAP", 178);

        @pmi0("captcha_refresh")
        public static final EventType CAPTCHA_REFRESH = new EventType("CAPTCHA_REFRESH", 179);

        @pmi0("refuse_onboarding_passkey")
        public static final EventType REFUSE_ONBOARDING_PASSKEY = new EventType("REFUSE_ONBOARDING_PASSKEY", 180);

        @pmi0("try_again")
        public static final EventType TRY_AGAIN = new EventType("TRY_AGAIN", 181);

        @pmi0("continue_reg_add_tap")
        public static final EventType CONTINUE_REG_ADD_TAP = new EventType("CONTINUE_REG_ADD_TAP", 182);

        @pmi0("registration_add")
        public static final EventType REGISTRATION_ADD = new EventType("REGISTRATION_ADD", 183);

        @pmi0("error_user_is_too_young")
        public static final EventType ERROR_USER_IS_TOO_YOUNG = new EventType("ERROR_USER_IS_TOO_YOUNG", 184);

        @pmi0("choose_passkey")
        public static final EventType CHOOSE_PASSKEY = new EventType("CHOOSE_PASSKEY", 185);

        @pmi0("choose_ecosystem_push")
        public static final EventType CHOOSE_ECOSYSTEM_PUSH = new EventType("CHOOSE_ECOSYSTEM_PUSH", 186);

        @pmi0("choose_sms")
        public static final EventType CHOOSE_SMS = new EventType("CHOOSE_SMS", 187);

        @pmi0("choose_call_reset")
        public static final EventType CHOOSE_CALL_RESET = new EventType("CHOOSE_CALL_RESET", 188);

        @pmi0("choose_email")
        public static final EventType CHOOSE_EMAIL = new EventType("CHOOSE_EMAIL", PsExtractor.PRIVATE_STREAM_1);

        @pmi0("choose_reserve_code")
        public static final EventType CHOOSE_RESERVE_CODE = new EventType("CHOOSE_RESERVE_CODE", 190);

        @pmi0("choose_official_messenger")
        public static final EventType CHOOSE_OFFICIAL_MESSENGER = new EventType("CHOOSE_OFFICIAL_MESSENGER", 191);

        @pmi0("choose_max_messenger")
        public static final EventType CHOOSE_MAX_MESSENGER = new EventType("CHOOSE_MAX_MESSENGER", PsExtractor.AUDIO_STREAM);

        @pmi0("choose_restore")
        public static final EventType CHOOSE_RESTORE = new EventType("CHOOSE_RESTORE", 193);

        @pmi0("choose_app")
        public static final EventType CHOOSE_APP = new EventType("CHOOSE_APP", 194);

        @pmi0("factor_available")
        public static final EventType FACTOR_AVAILABLE = new EventType("FACTOR_AVAILABLE", 195);

        @pmi0("available_factors")
        public static final EventType AVAILABLE_FACTORS = new EventType("AVAILABLE_FACTORS", 196);

        @pmi0("user_not_found")
        public static final EventType USER_NOT_FOUND = new EventType("USER_NOT_FOUND", 197);

        @pmi0("callin_call_tap")
        public static final EventType CALLIN_CALL_TAP = new EventType("CALLIN_CALL_TAP", 198);

        @pmi0("alert_callin_entry_error")
        public static final EventType ALERT_CALLIN_ENTRY_ERROR = new EventType("ALERT_CALLIN_ENTRY_ERROR", 199);

        @pmi0("callin_numbers_are_over")
        public static final EventType CALLIN_NUMBERS_ARE_OVER = new EventType("CALLIN_NUMBERS_ARE_OVER", 200);

        @pmi0("callin_phone_number_changed")
        public static final EventType CALLIN_PHONE_NUMBER_CHANGED = new EventType("CALLIN_PHONE_NUMBER_CHANGED", 201);

        @pmi0("error_invalid_request")
        public static final EventType ERROR_INVALID_REQUEST = new EventType("ERROR_INVALID_REQUEST", 202);

        @pmi0("internal_server_error")
        public static final EventType INTERNAL_SERVER_ERROR = new EventType("INTERNAL_SERVER_ERROR", 203);

        @pmi0("unavailable_auth_by_autologin")
        public static final EventType UNAVAILABLE_AUTH_BY_AUTOLOGIN = new EventType("UNAVAILABLE_AUTH_BY_AUTOLOGIN", 204);

        @pmi0("callin_libverify_started")
        public static final EventType CALLIN_LIBVERIFY_STARTED = new EventType("CALLIN_LIBVERIFY_STARTED", 205);

        @pmi0("create_business_start")
        public static final EventType CREATE_BUSINESS_START = new EventType("CREATE_BUSINESS_START", 206);

        @pmi0("oauth_hidden")
        public static final EventType OAUTH_HIDDEN = new EventType("OAUTH_HIDDEN", 207);

        @pmi0("alfa_new_number")
        public static final EventType ALFA_NEW_NUMBER = new EventType("ALFA_NEW_NUMBER", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);

        @pmi0("used_existing_email")
        public static final EventType USED_EXISTING_EMAIL = new EventType("USED_EXISTING_EMAIL", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE);

        @pmi0("email_skip_tap")
        public static final EventType EMAIL_SKIP_TAP = new EventType("EMAIL_SKIP_TAP", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE);

        @pmi0("email_did_not_send_alert")
        public static final EventType EMAIL_DID_NOT_SEND_ALERT = new EventType("EMAIL_DID_NOT_SEND_ALERT", 211);

        @pmi0("send_again_tap")
        public static final EventType SEND_AGAIN_TAP = new EventType("SEND_AGAIN_TAP", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE);

        @pmi0("birthday_tooltip_tap")
        public static final EventType BIRTHDAY_TOOLTIP_TAP = new EventType("BIRTHDAY_TOOLTIP_TAP", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);

        @pmi0("email_success_verification")
        public static final EventType EMAIL_SUCCESS_VERIFICATION = new EventType("EMAIL_SUCCESS_VERIFICATION", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);

        @pmi0("close_alert")
        public static final EventType CLOSE_ALERT = new EventType("CLOSE_ALERT", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);

        @pmi0("registration_permission_skip_button_tap")
        public static final EventType REGISTRATION_PERMISSION_SKIP_BUTTON_TAP = new EventType("REGISTRATION_PERMISSION_SKIP_BUTTON_TAP", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);

        @pmi0("existing_phone_number_button_tap")
        public static final EventType EXISTING_PHONE_NUMBER_BUTTON_TAP = new EventType("EXISTING_PHONE_NUMBER_BUTTON_TAP", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);

        @pmi0("registration_permission_button_tap")
        public static final EventType REGISTRATION_PERMISSION_BUTTON_TAP = new EventType("REGISTRATION_PERMISSION_BUTTON_TAP", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);

        @pmi0("incorrect_bday")
        public static final EventType INCORRECT_BDAY = new EventType("INCORRECT_BDAY", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);

        @pmi0("backup_restored")
        public static final EventType BACKUP_RESTORED = new EventType("BACKUP_RESTORED", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);

        @pmi0("feed_opened")
        public static final EventType FEED_OPENED = new EventType("FEED_OPENED", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);

        @pmi0("web_registration")
        public static final EventType WEB_REGISTRATION = new EventType("WEB_REGISTRATION", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);

        @pmi0("mini_app_vk_connect_launch_screen_enter")
        public static final EventType MINI_APP_VK_CONNECT_LAUNCH_SCREEN_ENTER = new EventType("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_ENTER", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);

        @pmi0("mini_app_vk_connect_launch_screen_permissions_accepted")
        public static final EventType MINI_APP_VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED = new EventType("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED", 224);

        @pmi0("mini_app_vk_connect_launch_screen_view_permissions")
        public static final EventType MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_PERMISSIONS = new EventType("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_PERMISSIONS", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);

        @pmi0("mini_app_vk_connect_launch_screen_view_connect_policy")
        public static final EventType MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_POLICY = new EventType("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_POLICY", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);

        @pmi0("mini_app_vk_connect_launch_screen_view_connect_terms")
        public static final EventType MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_TERMS = new EventType("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_TERMS", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE);

        @pmi0("mini_app_vk_connect_launch_screen_view_service_policy")
        public static final EventType MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_POLICY = new EventType("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_POLICY", 228);

        @pmi0("mini_app_vk_connect_launch_screen_view_service_terms")
        public static final EventType MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_TERMS = new EventType("MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_TERMS", 229);

        @pmi0("mail_linked_another_account_login")
        public static final EventType MAIL_LINKED_ANOTHER_ACCOUNT_LOGIN = new EventType("MAIL_LINKED_ANOTHER_ACCOUNT_LOGIN", 230);

        @pmi0("ok_new_number")
        public static final EventType OK_NEW_NUMBER = new EventType("OK_NEW_NUMBER", 231);

        @pmi0("registration_phone_continue_tap")
        public static final EventType REGISTRATION_PHONE_CONTINUE_TAP = new EventType("REGISTRATION_PHONE_CONTINUE_TAP", 232);

        @pmi0("change_number_to_verify")
        public static final EventType CHANGE_NUMBER_TO_VERIFY = new EventType("CHANGE_NUMBER_TO_VERIFY", 233);

        @pmi0("mobile_qr_qr_code_button_show")
        public static final EventType MOBILE_QR_QR_CODE_BUTTON_SHOW = new EventType("MOBILE_QR_QR_CODE_BUTTON_SHOW", 234);

        @pmi0("mobile_qr_qr_code_button_tap")
        public static final EventType MOBILE_QR_QR_CODE_BUTTON_TAP = new EventType("MOBILE_QR_QR_CODE_BUTTON_TAP", 235);

        @pmi0("mobile_qr_video_load_success")
        public static final EventType MOBILE_QR_VIDEO_LOAD_SUCCESS = new EventType("MOBILE_QR_VIDEO_LOAD_SUCCESS", 236);

        @pmi0("mobile_qr_scan_qr_code_tap")
        public static final EventType MOBILE_QR_SCAN_QR_CODE_TAP = new EventType("MOBILE_QR_SCAN_QR_CODE_TAP", 237);

        @pmi0("mobile_qr_close_guide_tap")
        public static final EventType MOBILE_QR_CLOSE_GUIDE_TAP = new EventType("MOBILE_QR_CLOSE_GUIDE_TAP", 238);

        @pmi0("mobile_qr_video_loading_failed")
        public static final EventType MOBILE_QR_VIDEO_LOADING_FAILED = new EventType("MOBILE_QR_VIDEO_LOADING_FAILED", 239);

        @pmi0("mobile_qr_try_again_tap")
        public static final EventType MOBILE_QR_TRY_AGAIN_TAP = new EventType("MOBILE_QR_TRY_AGAIN_TAP", PsExtractor.VIDEO_STREAM_MASK);

        @pmi0("mobile_qr_video_loading")
        public static final EventType MOBILE_QR_VIDEO_LOADING = new EventType("MOBILE_QR_VIDEO_LOADING", 241);

        @pmi0("mobile_qr_close_alert_tap")
        public static final EventType MOBILE_QR_CLOSE_ALERT_TAP = new EventType("MOBILE_QR_CLOSE_ALERT_TAP", 242);

        @pmi0("mobile_qr_auth_with_qr_tap")
        public static final EventType MOBILE_QR_AUTH_WITH_QR_TAP = new EventType("MOBILE_QR_AUTH_WITH_QR_TAP", 243);

        @pmi0("mobile_qr_more_info_tap")
        public static final EventType MOBILE_QR_MORE_INFO_TAP = new EventType("MOBILE_QR_MORE_INFO_TAP", 244);

        @pmi0("choose_another_account")
        public static final EventType CHOOSE_ANOTHER_ACCOUNT = new EventType("CHOOSE_ANOTHER_ACCOUNT", 245);

        @pmi0("its_not_my_account")
        public static final EventType ITS_NOT_MY_ACCOUNT = new EventType("ITS_NOT_MY_ACCOUNT", 246);

        @pmi0("forgot_password")
        public static final EventType FORGOT_PASSWORD = new EventType("FORGOT_PASSWORD", 247);

        @pmi0("accounts_limit_reached_error")
        public static final EventType ACCOUNTS_LIMIT_REACHED_ERROR = new EventType("ACCOUNTS_LIMIT_REACHED_ERROR", 248);

        @pmi0("mobile_qr_incorrect_qr_scanned")
        public static final EventType MOBILE_QR_INCORRECT_QR_SCANNED = new EventType("MOBILE_QR_INCORRECT_QR_SCANNED", 249);

        @pmi0("try_verify_again")
        public static final EventType TRY_VERIFY_AGAIN = new EventType("TRY_VERIFY_AGAIN", 250);

        @pmi0("back_to_registration_start")
        public static final EventType BACK_TO_REGISTRATION_START = new EventType("BACK_TO_REGISTRATION_START", 251);

        @pmi0("blockstore_reload")
        public static final EventType BLOCKSTORE_RELOAD = new EventType("BLOCKSTORE_RELOAD", 252);

        @pmi0("input_birthday")
        public static final EventType INPUT_BIRTHDAY = new EventType("INPUT_BIRTHDAY", 253);

        @pmi0("birthday_calendar_icon_tap")
        public static final EventType BIRTHDAY_CALENDAR_ICON_TAP = new EventType("BIRTHDAY_CALENDAR_ICON_TAP", 254);

        @pmi0("pincode_input_interaction")
        public static final EventType PINCODE_INPUT_INTERACTION = new EventType("PINCODE_INPUT_INTERACTION", 255);

        @pmi0("pincode_success_validation")
        public static final EventType PINCODE_SUCCESS_VALIDATION = new EventType("PINCODE_SUCCESS_VALIDATION", 256);

        @pmi0("pincode_incorrect")
        public static final EventType PINCODE_INCORRECT = new EventType("PINCODE_INCORRECT", 257);

        @pmi0("pincode_too_many_attempts_alert")
        public static final EventType PINCODE_TOO_MANY_ATTEMPTS_ALERT = new EventType("PINCODE_TOO_MANY_ATTEMPTS_ALERT", 258);

        @pmi0("pincode_reset_tap")
        public static final EventType PINCODE_RESET_TAP = new EventType("PINCODE_RESET_TAP", 259);

        @pmi0("oauth_button_show")
        public static final EventType OAUTH_BUTTON_SHOW = new EventType("OAUTH_BUTTON_SHOW", 260);

        @pmi0("account_manager_reload")
        public static final EventType ACCOUNT_MANAGER_RELOAD = new EventType("ACCOUNT_MANAGER_RELOAD", 261);

        @pmi0("vkme_drop_account_tap")
        public static final EventType VKME_DROP_ACCOUNT_TAP = new EventType("VKME_DROP_ACCOUNT_TAP", 262);

        @pmi0("vkme_add_another_account_tap")
        public static final EventType VKME_ADD_ANOTHER_ACCOUNT_TAP = new EventType("VKME_ADD_ANOTHER_ACCOUNT_TAP", 263);

        @pmi0("max_account_alert")
        public static final EventType MAX_ACCOUNT_ALERT = new EventType("MAX_ACCOUNT_ALERT", 264);

        @pmi0("auth_qr_code_start")
        public static final EventType AUTH_QR_CODE_START = new EventType("AUTH_QR_CODE_START", 265);

        @pmi0("auth_cancel_tap")
        public static final EventType AUTH_CANCEL_TAP = new EventType("AUTH_CANCEL_TAP", 266);

        @pmi0("incorrect_otp_code")
        public static final EventType INCORRECT_OTP_CODE = new EventType("INCORRECT_OTP_CODE", 267);

        @pmi0("phone_reuse_requested")
        public static final EventType PHONE_REUSE_REQUESTED = new EventType("PHONE_REUSE_REQUESTED", 268);

        @pmi0("password_autofill")
        public static final EventType PASSWORD_AUTOFILL = new EventType("PASSWORD_AUTOFILL", 269);

        @pmi0("input_password_interaction")
        public static final EventType INPUT_PASSWORD_INTERACTION = new EventType("INPUT_PASSWORD_INTERACTION", atv0.b);

        @pmi0("close_alert_tap")
        public static final EventType CLOSE_ALERT_TAP = new EventType("CLOSE_ALERT_TAP", 271);

        @pmi0("email_forwarding_error")
        public static final EventType EMAIL_FORWARDING_ERROR = new EventType("EMAIL_FORWARDING_ERROR", 272);

        @pmi0("email_forwarding_success")
        public static final EventType EMAIL_FORWARDING_SUCCESS = new EventType("EMAIL_FORWARDING_SUCCESS", 273);

        @pmi0("otp_messenger_libverify_started")
        public static final EventType OTP_MESSENGER_LIBVERIFY_STARTED = new EventType("OTP_MESSENGER_LIBVERIFY_STARTED", 274);

        @pmi0("onepass_connect_agree_tap")
        public static final EventType ONEPASS_CONNECT_AGREE_TAP = new EventType("ONEPASS_CONNECT_AGREE_TAP", 275);

        @pmi0("onepass_connect_cancel_tap")
        public static final EventType ONEPASS_CONNECT_CANCEL_TAP = new EventType("ONEPASS_CONNECT_CANCEL_TAP", 276);

        @pmi0("choose_enter_by_mail_pass")
        public static final EventType CHOOSE_ENTER_BY_MAIL_PASS = new EventType("CHOOSE_ENTER_BY_MAIL_PASS", 277);

        @pmi0("alert_delete_profile")
        public static final EventType ALERT_DELETE_PROFILE = new EventType("ALERT_DELETE_PROFILE", 278);

        @pmi0("alert_silent_auth_add_info")
        public static final EventType ALERT_SILENT_AUTH_ADD_INFO = new EventType("ALERT_SILENT_AUTH_ADD_INFO", 279);

        @pmi0("drop_account_from_saved")
        public static final EventType DROP_ACCOUNT_FROM_SAVED = new EventType("DROP_ACCOUNT_FROM_SAVED", 280);

        @pmi0("auth_saved_start")
        public static final EventType AUTH_SAVED_START = new EventType("AUTH_SAVED_START", 281);

        @pmi0("add_account_button_tap")
        public static final EventType ADD_ACCOUNT_BUTTON_TAP = new EventType("ADD_ACCOUNT_BUTTON_TAP", 282);

        @pmi0("add_account_to_saved_start")
        public static final EventType ADD_ACCOUNT_TO_SAVED_START = new EventType("ADD_ACCOUNT_TO_SAVED_START", 283);

        @pmi0("ok_heads_login_error")
        public static final EventType OK_HEADS_LOGIN_ERROR = new EventType("OK_HEADS_LOGIN_ERROR", 284);

        @pmi0("ok_auth_error")
        public static final EventType OK_AUTH_ERROR = new EventType("OK_AUTH_ERROR", 285);

        @pmi0("ok_registration_error")
        public static final EventType OK_REGISTRATION_ERROR = new EventType("OK_REGISTRATION_ERROR", 286);

        @pmi0("alert_delete_profile_canceled")
        public static final EventType ALERT_DELETE_PROFILE_CANCELED = new EventType("ALERT_DELETE_PROFILE_CANCELED", MBSupportMuteAdType.INTERSTITIAL_VIDEO);

        @pmi0("alert_silent_auth_add_info_canceled")
        public static final EventType ALERT_SILENT_AUTH_ADD_INFO_CANCELED = new EventType("ALERT_SILENT_AUTH_ADD_INFO_CANCELED", 288);

        @pmi0("alert_silent_auth_add_info_accept")
        public static final EventType ALERT_SILENT_AUTH_ADD_INFO_ACCEPT = new EventType("ALERT_SILENT_AUTH_ADD_INFO_ACCEPT", 289);

        @pmi0("alert_qr_code_open_scanner")
        public static final EventType ALERT_QR_CODE_OPEN_SCANNER = new EventType("ALERT_QR_CODE_OPEN_SCANNER", 290);

        @pmi0("scanner_tab")
        public static final EventType SCANNER_TAB = new EventType("SCANNER_TAB", 291);

        @pmi0("camera_source_for_qr_code")
        public static final EventType CAMERA_SOURCE_FOR_QR_CODE = new EventType("CAMERA_SOURCE_FOR_QR_CODE", 292);

        @pmi0("create_related_tap")
        public static final EventType CREATE_RELATED_TAP = new EventType("CREATE_RELATED_TAP", 293);

        @pmi0("qr_code_show")
        public static final EventType QR_CODE_SHOW = new EventType("QR_CODE_SHOW", 294);

        @pmi0("login_later_tap")
        public static final EventType LOGIN_LATER_TAP = new EventType("LOGIN_LATER_TAP", 295);

        @pmi0("auth_by_qr_app")
        public static final EventType AUTH_BY_QR_APP = new EventType("AUTH_BY_QR_APP", 296);

        @pmi0("qr_code_refresh_tap")
        public static final EventType QR_CODE_REFRESH_TAP = new EventType("QR_CODE_REFRESH_TAP", 297);

        @pmi0("biometrics_validation_refused")
        public static final EventType BIOMETRICS_VALIDATION_REFUSED = new EventType("BIOMETRICS_VALIDATION_REFUSED", 298);

        @pmi0("input_login_interaction")
        public static final EventType INPUT_LOGIN_INTERACTION = new EventType("INPUT_LOGIN_INTERACTION", 299);

        @pmi0("oauth_button_tap")
        public static final EventType OAUTH_BUTTON_TAP = new EventType("OAUTH_BUTTON_TAP", 300);

        @pmi0("more_info_button_tap")
        public static final EventType MORE_INFO_BUTTON_TAP = new EventType("MORE_INFO_BUTTON_TAP", 301);

        @pmi0("alert_wrong_input")
        public static final EventType ALERT_WRONG_INPUT = new EventType("ALERT_WRONG_INPUT", 302);

        @pmi0("restore_auth_button_tap")
        public static final EventType RESTORE_AUTH_BUTTON_TAP = new EventType("RESTORE_AUTH_BUTTON_TAP", Http.StatusCode.SEE_OTHER);

        @pmi0("restore_auth_button_tap_cancel")
        public static final EventType RESTORE_AUTH_BUTTON_TAP_CANCEL = new EventType("RESTORE_AUTH_BUTTON_TAP_CANCEL", Sdk.SDKError.Reason.AD_EXPIRED_VALUE);

        @pmi0("alert_registration_continue")
        public static final EventType ALERT_REGISTRATION_CONTINUE = new EventType("ALERT_REGISTRATION_CONTINUE", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE);

        @pmi0("alert_registration_continue_exit_button_tap")
        public static final EventType ALERT_REGISTRATION_CONTINUE_EXIT_BUTTON_TAP = new EventType("ALERT_REGISTRATION_CONTINUE_EXIT_BUTTON_TAP", 306);

        @pmi0("restore_auth_start")
        public static final EventType RESTORE_AUTH_START = new EventType("RESTORE_AUTH_START", 307);

        @pmi0("mail_restore_start")
        public static final EventType MAIL_RESTORE_START = new EventType("MAIL_RESTORE_START", Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE);

        @pmi0("redirect_mail_restore")
        public static final EventType REDIRECT_MAIL_RESTORE = new EventType("REDIRECT_MAIL_RESTORE", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);

        @pmi0("email_error")
        public static final EventType EMAIL_ERROR = new EventType("EMAIL_ERROR", Sdk.SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE);

        @pmi0("error_email_already_linked")
        public static final EventType ERROR_EMAIL_ALREADY_LINKED = new EventType("ERROR_EMAIL_ALREADY_LINKED", Sdk.SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE);

        @pmi0("email_need_password_change")
        public static final EventType EMAIL_NEED_PASSWORD_CHANGE = new EventType("EMAIL_NEED_PASSWORD_CHANGE", Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE);

        @pmi0("no_access_to_phone_tap")
        public static final EventType NO_ACCESS_TO_PHONE_TAP = new EventType("NO_ACCESS_TO_PHONE_TAP", Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE);

        @pmi0("go_to_max_tap")
        public static final EventType GO_TO_MAX_TAP = new EventType("GO_TO_MAX_TAP", Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE);

        @pmi0("max_connect_agree_tap")
        public static final EventType MAX_CONNECT_AGREE_TAP = new EventType("MAX_CONNECT_AGREE_TAP", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE);

        @pmi0("max_connect_cancel_tap")
        public static final EventType MAX_CONNECT_CANCEL_TAP = new EventType("MAX_CONNECT_CANCEL_TAP", Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE);

        @pmi0("max_app_opened")
        public static final EventType MAX_APP_OPENED = new EventType("MAX_APP_OPENED", Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE);

        @pmi0("app_market_opened")
        public static final EventType APP_MARKET_OPENED = new EventType("APP_MARKET_OPENED", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE);

        @pmi0("max_app_open_attempt")
        public static final EventType MAX_APP_OPEN_ATTEMPT = new EventType("MAX_APP_OPEN_ATTEMPT", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE);

        @pmi0("open_market_failed")
        public static final EventType OPEN_MARKET_FAILED = new EventType("OPEN_MARKET_FAILED", 320);

        @pmi0("auth_by_max")
        public static final EventType AUTH_BY_MAX = new EventType("AUTH_BY_MAX", Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE);

        @pmi0("auth_by_max_code")
        public static final EventType AUTH_BY_MAX_CODE = new EventType("AUTH_BY_MAX_CODE", Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE);

        @pmi0("bind_accounts_tap")
        public static final EventType BIND_ACCOUNTS_TAP = new EventType("BIND_ACCOUNTS_TAP", 323);

        @pmi0("oauth_to_gray_vkid_bind_close_tap")
        public static final EventType OAUTH_TO_GRAY_VKID_BIND_CLOSE_TAP = new EventType("OAUTH_TO_GRAY_VKID_BIND_CLOSE_TAP", 324);

        @pmi0("success_bind_to_vkid")
        public static final EventType SUCCESS_BIND_TO_VKID = new EventType("SUCCESS_BIND_TO_VKID", 325);

        @pmi0("no_bind_oauth_needed_tap")
        public static final EventType NO_BIND_OAUTH_NEEDED_TAP = new EventType("NO_BIND_OAUTH_NEEDED_TAP", 326);

        @pmi0("gray_vkid_to_oauth_bind_close_tap")
        public static final EventType GRAY_VKID_TO_OAUTH_BIND_CLOSE_TAP = new EventType("GRAY_VKID_TO_OAUTH_BIND_CLOSE_TAP", 327);

        @pmi0("success_bind_gray_vkid")
        public static final EventType SUCCESS_BIND_GRAY_VKID = new EventType("SUCCESS_BIND_GRAY_VKID", 328);

        @pmi0("yes_my_account_tap")
        public static final EventType YES_MY_ACCOUNT_TAP = new EventType("YES_MY_ACCOUNT_TAP", 329);

        @pmi0("alert_verification_by_max_messenger_timeout")
        public static final EventType ALERT_VERIFICATION_BY_MAX_MESSENGER_TIMEOUT = new EventType("ALERT_VERIFICATION_BY_MAX_MESSENGER_TIMEOUT", 330);

        @pmi0("alert_verification_by_max_messenger_cancel")
        public static final EventType ALERT_VERIFICATION_BY_MAX_MESSENGER_CANCEL = new EventType("ALERT_VERIFICATION_BY_MAX_MESSENGER_CANCEL", 331);

        @pmi0("rustore_seamless_install_available")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_AVAILABLE = new EventType("RUSTORE_SEAMLESS_INSTALL_AVAILABLE", 332);

        @pmi0("rustore_seamless_install_started")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_STARTED = new EventType("RUSTORE_SEAMLESS_INSTALL_STARTED", 333);

        @pmi0("rustore_seamless_install_success")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_SUCCESS = new EventType("RUSTORE_SEAMLESS_INSTALL_SUCCESS", 334);

        @pmi0("rustore_seamless_install_max_messenger_not_downloaded_error")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_MAX_MESSENGER_NOT_DOWNLOADED_ERROR = new EventType("RUSTORE_SEAMLESS_INSTALL_MAX_MESSENGER_NOT_DOWNLOADED_ERROR", 335);

        @pmi0("rustore_seamless_install_default_client_not_downloaded_error")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_DEFAULT_CLIENT_NOT_DOWNLOADED_ERROR = new EventType("RUSTORE_SEAMLESS_INSTALL_DEFAULT_CLIENT_NOT_DOWNLOADED_ERROR", 336);

        @pmi0("rustore_seamless_install_cancel")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_CANCEL = new EventType("RUSTORE_SEAMLESS_INSTALL_CANCEL", 337);

        @pmi0("rustore_seamless_install_unknown_error")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_UNKNOWN_ERROR = new EventType("RUSTORE_SEAMLESS_INSTALL_UNKNOWN_ERROR", 338);

        @pmi0("return_from_max_app")
        public static final EventType RETURN_FROM_MAX_APP = new EventType("RETURN_FROM_MAX_APP", 339);

        @pmi0("doubtful_auth_check")
        public static final EventType DOUBTFUL_AUTH_CHECK = new EventType("DOUBTFUL_AUTH_CHECK", 340);

        @pmi0("password_autofill_choose_account_tap")
        public static final EventType PASSWORD_AUTOFILL_CHOOSE_ACCOUNT_TAP = new EventType("PASSWORD_AUTOFILL_CHOOSE_ACCOUNT_TAP", 341);

        @pmi0("password_autofill_close_tap")
        public static final EventType PASSWORD_AUTOFILL_CLOSE_TAP = new EventType("PASSWORD_AUTOFILL_CLOSE_TAP", 342);

        @pmi0("auth_by_vkme")
        public static final EventType AUTH_BY_VKME = new EventType("AUTH_BY_VKME", 343);

        @pmi0("verification_by_max_messenger_cancel")
        public static final EventType VERIFICATION_BY_MAX_MESSENGER_CANCEL = new EventType("VERIFICATION_BY_MAX_MESSENGER_CANCEL", 344);

        @pmi0("rustore_seamless_install_service_connection")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION = new EventType("RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION", 345);

        @pmi0("rustore_seamless_install_service_connection_error")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION_ERROR = new EventType("RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION_ERROR", 346);

        @pmi0("rustore_seamless_install_error")
        public static final EventType RUSTORE_SEAMLESS_INSTALL_ERROR = new EventType("RUSTORE_SEAMLESS_INSTALL_ERROR", 347);

        @pmi0("agree_actual_phone_tap")
        public static final EventType AGREE_ACTUAL_PHONE_TAP = new EventType("AGREE_ACTUAL_PHONE_TAP", 348);

        @pmi0("change_actual_phone_tap")
        public static final EventType CHANGE_ACTUAL_PHONE_TAP = new EventType("CHANGE_ACTUAL_PHONE_TAP", 349);

        @pmi0("confirm_actual_phone_by_user_close_tap")
        public static final EventType CONFIRM_ACTUAL_PHONE_BY_USER_CLOSE_TAP = new EventType("CONFIRM_ACTUAL_PHONE_BY_USER_CLOSE_TAP", 350);

        @pmi0("agree_actual_email_tap")
        public static final EventType AGREE_ACTUAL_EMAIL_TAP = new EventType("AGREE_ACTUAL_EMAIL_TAP", 351);

        @pmi0("change_actual_email_tap")
        public static final EventType CHANGE_ACTUAL_EMAIL_TAP = new EventType("CHANGE_ACTUAL_EMAIL_TAP", 352);

        @pmi0("confirm_actual_email_close_tap")
        public static final EventType CONFIRM_ACTUAL_EMAIL_CLOSE_TAP = new EventType("CONFIRM_ACTUAL_EMAIL_CLOSE_TAP", 353);

        @pmi0("actual_email_confirmation_error")
        public static final EventType ACTUAL_EMAIL_CONFIRMATION_ERROR = new EventType("ACTUAL_EMAIL_CONFIRMATION_ERROR", 354);

        @pmi0("actual_email_confirmation_success")
        public static final EventType ACTUAL_EMAIL_CONFIRMATION_SUCCESS = new EventType("ACTUAL_EMAIL_CONFIRMATION_SUCCESS", 355);

        @pmi0("add_email_tap")
        public static final EventType ADD_EMAIL_TAP = new EventType("ADD_EMAIL_TAP", 356);

        @pmi0("add_email_by_user_close_tap")
        public static final EventType ADD_EMAIL_BY_USER_CLOSE_TAP = new EventType("ADD_EMAIL_BY_USER_CLOSE_TAP", 357);

        @pmi0("mail_login_error")
        public static final EventType MAIL_LOGIN_ERROR = new EventType("MAIL_LOGIN_ERROR", 358);

        @pmi0("choose_registration_tap")
        public static final EventType CHOOSE_REGISTRATION_TAP = new EventType("CHOOSE_REGISTRATION_TAP", 359);

        @pmi0("registration_mail_start")
        public static final EventType REGISTRATION_MAIL_START = new EventType("REGISTRATION_MAIL_START", 360);

        @pmi0("choose_my_account_tap")
        public static final EventType CHOOSE_MY_ACCOUNT_TAP = new EventType("CHOOSE_MY_ACCOUNT_TAP", 361);

        @pmi0("email_blocked_error")
        public static final EventType EMAIL_BLOCKED_ERROR = new EventType("EMAIL_BLOCKED_ERROR", 362);

        @pmi0("email_2fa_error")
        public static final EventType EMAIL_2FA_ERROR = new EventType("EMAIL_2FA_ERROR", 363);

        @pmi0("start_auth_by_gray_link")
        public static final EventType START_AUTH_BY_GRAY_LINK = new EventType("START_AUTH_BY_GRAY_LINK", 364);

        @pmi0("auth_by_mail")
        public static final EventType AUTH_BY_MAIL = new EventType("AUTH_BY_MAIL", 365);

        @pmi0("auth_by_gray_link")
        public static final EventType AUTH_BY_GRAY_LINK = new EventType("AUTH_BY_GRAY_LINK", 366);

        @pmi0("auth_by_gray_link_fail")
        public static final EventType AUTH_BY_GRAY_LINK_FAIL = new EventType("AUTH_BY_GRAY_LINK_FAIL", 367);

        @pmi0("enter_password_mail_limit_error")
        public static final EventType ENTER_PASSWORD_MAIL_LIMIT_ERROR = new EventType("ENTER_PASSWORD_MAIL_LIMIT_ERROR", 368);

        @pmi0("domain_selection_tap")
        public static final EventType DOMAIN_SELECTION_TAP = new EventType("DOMAIN_SELECTION_TAP", 369);

        @pmi0("choose_domain_tap")
        public static final EventType CHOOSE_DOMAIN_TAP = new EventType("CHOOSE_DOMAIN_TAP", 370);

        @pmi0("create_email")
        public static final EventType CREATE_EMAIL = new EventType("CREATE_EMAIL", 371);

        @pmi0("create_child_email")
        public static final EventType CREATE_CHILD_EMAIL = new EventType("CREATE_CHILD_EMAIL", 372);

        @pmi0("migrate_from_gmail")
        public static final EventType MIGRATE_FROM_GMAIL = new EventType("MIGRATE_FROM_GMAIL", 373);

        @pmi0("redirect_to_mail_auth")
        public static final EventType REDIRECT_TO_MAIL_AUTH = new EventType("REDIRECT_TO_MAIL_AUTH", 374);

        @pmi0("verification_by_max_messenger_timeout")
        public static final EventType VERIFICATION_BY_MAX_MESSENGER_TIMEOUT = new EventType("VERIFICATION_BY_MAX_MESSENGER_TIMEOUT", 375);

        @pmi0("keychain_token_backup_success")
        public static final EventType KEYCHAIN_TOKEN_BACKUP_SUCCESS = new EventType("KEYCHAIN_TOKEN_BACKUP_SUCCESS", 376);

        @pmi0("keychain_token_restore_success")
        public static final EventType KEYCHAIN_TOKEN_RESTORE_SUCCESS = new EventType("KEYCHAIN_TOKEN_RESTORE_SUCCESS", 377);

        @pmi0("mail_white_promo_vkid_sdk_start")
        public static final EventType MAIL_WHITE_PROMO_VKID_SDK_START = new EventType("MAIL_WHITE_PROMO_VKID_SDK_START", 378);

        @pmi0("success_auth_mail_white_promo")
        public static final EventType SUCCESS_AUTH_MAIL_WHITE_PROMO = new EventType("SUCCESS_AUTH_MAIL_WHITE_PROMO", 379);

        @pmi0("auth_by_white_link")
        public static final EventType AUTH_BY_WHITE_LINK = new EventType("AUTH_BY_WHITE_LINK", 380);

        @pmi0("auth_by_vkid")
        public static final EventType AUTH_BY_VKID = new EventType("AUTH_BY_VKID", 381);

        @pmi0("send_sms_tap")
        public static final EventType SEND_SMS_TAP = new EventType("SEND_SMS_TAP", 382);

        @pmi0("message_app_open")
        public static final EventType MESSAGE_APP_OPEN = new EventType("MESSAGE_APP_OPEN", 383);

        @pmi0("message_app_open_error")
        public static final EventType MESSAGE_APP_OPEN_ERROR = new EventType("MESSAGE_APP_OPEN_ERROR", 384);

        @pmi0("sms_inbox_fatal_error")
        public static final EventType SMS_INBOX_FATAL_ERROR = new EventType("SMS_INBOX_FATAL_ERROR", 385);

        @pmi0("sms_inbox_timeout_error")
        public static final EventType SMS_INBOX_TIMEOUT_ERROR = new EventType("SMS_INBOX_TIMEOUT_ERROR", 386);

        @pmi0("sms_inbox_send_sms_error")
        public static final EventType SMS_INBOX_SEND_SMS_ERROR = new EventType("SMS_INBOX_SEND_SMS_ERROR", 387);

        @pmi0("sms_inbox_incorrect_phone_error")
        public static final EventType SMS_INBOX_INCORRECT_PHONE_ERROR = new EventType("SMS_INBOX_INCORRECT_PHONE_ERROR", 388);

        @pmi0("sms_inbox_incorrect_text_error")
        public static final EventType SMS_INBOX_INCORRECT_TEXT_ERROR = new EventType("SMS_INBOX_INCORRECT_TEXT_ERROR", 389);

        @pmi0("go_to_max_chat_tap")
        public static final EventType GO_TO_MAX_CHAT_TAP = new EventType("GO_TO_MAX_CHAT_TAP", 390);

        @pmi0("choose_max_code")
        public static final EventType CHOOSE_MAX_CODE = new EventType("CHOOSE_MAX_CODE", 391);

        @pmi0("country_menu_show")
        public static final EventType COUNTRY_MENU_SHOW = new EventType("COUNTRY_MENU_SHOW", 392);

        @pmi0("search_country_tap")
        public static final EventType SEARCH_COUNTRY_TAP = new EventType("SEARCH_COUNTRY_TAP", 393);

        @pmi0("search_country_not_found")
        public static final EventType SEARCH_COUNTRY_NOT_FOUND = new EventType("SEARCH_COUNTRY_NOT_FOUND", 394);

        @pmi0("search_country_interaction")
        public static final EventType SEARCH_COUNTRY_INTERACTION = new EventType("SEARCH_COUNTRY_INTERACTION", 395);

        @pmi0("otp_messenger_libverify_sending")
        public static final EventType OTP_MESSENGER_LIBVERIFY_SENDING = new EventType("OTP_MESSENGER_LIBVERIFY_SENDING", 396);

        @pmi0("messenger_sign_up_promo")
        public static final EventType MESSENGER_SIGN_UP_PROMO = new EventType("MESSENGER_SIGN_UP_PROMO", 397);

        @pmi0("messenger_app_opened")
        public static final EventType MESSENGER_APP_OPENED = new EventType("MESSENGER_APP_OPENED", 398);

        @pmi0("messenger_store_opened")
        public static final EventType MESSENGER_STORE_OPENED = new EventType("MESSENGER_STORE_OPENED", 399);

        @pmi0("qr_code_device_info_tap")
        public static final EventType QR_CODE_DEVICE_INFO_TAP = new EventType("QR_CODE_DEVICE_INFO_TAP", 400);

        @pmi0("qr_code_close_tap")
        public static final EventType QR_CODE_CLOSE_TAP = new EventType("QR_CODE_CLOSE_TAP", 401);

        @pmi0("qr_code_cancel_tap")
        public static final EventType QR_CODE_CANCEL_TAP = new EventType("QR_CODE_CANCEL_TAP", 402);

        @pmi0("incorrect_device_code")
        public static final EventType INCORRECT_DEVICE_CODE = new EventType("INCORRECT_DEVICE_CODE", 403);

        @pmi0("device_code_success")
        public static final EventType DEVICE_CODE_SUCCESS = new EventType("DEVICE_CODE_SUCCESS", 404);

        @pmi0("entry_by_device_code_confirm_tap")
        public static final EventType ENTRY_BY_DEVICE_CODE_CONFIRM_TAP = new EventType("ENTRY_BY_DEVICE_CODE_CONFIRM_TAP", InterfaceC4413l1.a.b.e);

        @pmi0("entry_by_device_code_closer_tap")
        public static final EventType ENTRY_BY_DEVICE_CODE_CLOSER_TAP = new EventType("ENTRY_BY_DEVICE_CODE_CLOSER_TAP", InterfaceC4413l1.a.b.f);

        @pmi0("alert_device_code_connection_error")
        public static final EventType ALERT_DEVICE_CODE_CONNECTION_ERROR = new EventType("ALERT_DEVICE_CODE_CONNECTION_ERROR", InterfaceC4413l1.a.b.g);

        @pmi0("sms_libverify_started")
        public static final EventType SMS_LIBVERIFY_STARTED = new EventType("SMS_LIBVERIFY_STARTED", InterfaceC4413l1.a.b.h);

        @pmi0("call_libverify_started")
        public static final EventType CALL_LIBVERIFY_STARTED = new EventType("CALL_LIBVERIFY_STARTED", InterfaceC4413l1.a.b.i);

        @pmi0("mobileid_libverify_started")
        public static final EventType MOBILEID_LIBVERIFY_STARTED = new EventType("MOBILEID_LIBVERIFY_STARTED", 410);

        @pmi0("push_libverify_started")
        public static final EventType PUSH_LIBVERIFY_STARTED = new EventType("PUSH_LIBVERIFY_STARTED", InterfaceC4413l1.a.b.k);

        @pmi0("already_verified_libverify_started")
        public static final EventType ALREADY_VERIFIED_LIBVERIFY_STARTED = new EventType("ALREADY_VERIFIED_LIBVERIFY_STARTED", 412);

        static {
            EventType[] h = h();
            $VALUES = h;
            $ENTRIES = e370.d(h);
        }

        private EventType(String str, int i) {
        }

        public static final /* synthetic */ EventType[] h() {
            return new EventType[]{SCREEN_PROCEED, SCREEN_RETURN, SCREEN_SKIP, SCREEN_BLUR, SCREEN_FOCUS, SCREEN_LOADING_ABORTED, SCREEN_LOADING_FAILED, SILENT_AUTH_INFO_OBTAIN_ERROR, COMMON_SERVER_ERROR, CONNECT_FACEBOOK_FAILED, CONNECT_OK_FAILED, CONNECT_TWITTER_FAILED, CONNECT_GMAIL_FAILED, SHOW_IMPORT_CONTACTS_CONFIRMATION_MODAL, RESEND_SMS_CODE, RESEND_SMS_CODE_FAILED, SEND_SMS_CODE_FAILED, SMS_CODE_DETECTED, SEX_DETECTED, INCORRECT_SMS_CODE, INCORRECT_PASSWORD, INCORRECT_NAME, INCORRECT_CAPTCHA, INCORRECT_PHONE_NUMBER, INCORRECT_PASSWORD_POPUP, INCORRECT_EMAIL, INCORRECT_EMAIL_CODE, SELECT_COUNTRY, SELECT_COUNTRY_DONE, INPUT_NUMBER_INTERACTION, INPUT_CODE_INTERACTION, INPUT_EMAIL_CODE_INTERACTION, INPUT_EMAIL_INTERACTION, PROCEED_OTHER_COUNTRY_CODE, EXISTING_PHONE_NUMBER, EXISTING_PHONE_NUMBER_TAP, IMPORT_CONTACTS_FAILED, PHOTO_UPLOADING_ABORTED, PHOTO_UPLOADING_FAILED, PUSH_REQUEST_ALLOW, PUSH_REQUEST_DENY, SELECT_SUBJECT, SUBSCRIBE_COMMUNITY, UNSUBSCRIBE_COMMUNITY, SEE_MORE, SILENT_TOKEN_PROVIDED, SILENT_TOKEN_PROVIDED_AUTHORIZATION, SILENT_TOKEN_PROVIDED_REGISTRATION, AUTH_BY_LOGIN, AUTH_SILENT, AUTH_FAST_SILENT, AUTH_BY_OAUTH, REGISTRATION, AUTH_BY_UNKNOWN, AUTH_BY_PHONE, AUTH_BY_BUTTON, AUTH_BY_EMAIL, AUTH_BY_ECOSYSTEM_PUSH, AUTH_BY_AUTOLOGIN, AUTH_BY_QR_CODE, AUTH_BY_RESTORE, AUTH_CONFIRM, CHOOSE_ANOTHER_WAY, ACCESS_TOKEN_PROVIDED, OPEN_ACCOUNT, AUTH_SUBAPP, AUTH_SUBAPP_SUCCESS, PROFILE_INFO_RETRIEVED, CODE_SEND, CODE_CALL, SUCCESS_2FA, PARTIAL_EXPAND_SUCCESS, UNIFIED_ACCOUNT_ALL_SERVICES, FAST_SILENT_TOKEN_PROVIDED_AUTHORIZATION, SILENT_AUTH_RESUME_CLICK, TO_VK_CLIENT_UNSAFE_ST, FROM_VK_CLIENT_FULL_ST, TO_VK_CLIENT_WITHOUT_ST, FROM_VK_CLIENT_WITHOUT_ST, LOADING_SILENT_AUTH_EXISTING_ACCOUNT, SERVICE_OPEN_DL, SERVICE_NOT_OPEN, VK_MAIL_CREATED, VK_MAIL_SELECTED, ERROR_VK_MAIL_CREATED, ERROR_VK_MAIL_LOGIN, LOGIN_TAP, PASSW_TAP, EMAIL_REG_ALLOWED, EMAIL_REG_DENIED, REGISTRATION_EMAIL_NOT_FOUND, REGISTRATION_PASSWORD_NOT_FOUND, ERROR_NUMBER_LINKED, ONE_TAP_START_BUTTON_SHOW, ONE_TAP_USER_BUTTON_SHOW, ONE_TAP_EMPTY_BUTTON_SHOW, ONE_TAP_START_BUTTON_CLICK, ONE_TAP_USER_BUTTON_CLICK, ONE_TAP_EMPTY_BUTTON_CLICK, FIRST_AUTHORIZATION, REGISTRATION_START, REGISTRATION_COMPLETE, AUTH_START, NO_USER_ACCOUNT_TAP, INPUT_PHONE, INPUT_EMAIL, INPUT_LOGIN, AVAILABLE_AUTH_WITHOUT_PASSWORD, SELECT_AUTH_BY_PHONE, SELECT_AUTH_BY_PASSWORD, NO_WINDOW_OPENER_ERROR, REGISTRATION_EXISTING_ACCOUNT_WITHOUT_PASSWORD, AUTH_PASSWORD, EXTERNAL_LINK_MINIAPP_OPEN, EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN, INCORRECT_CALL_CODE, CALL_CODE_SUCCESS_VERIFICATION, INCORRECT_AUTHENTICATOR_CODE, SUCCESS_2FA_AUTHENTICATOR_CODE, TOKEN_RELOAD_FROM_AM, CONTINUE_AS_USERNAME, TYPE_2FA_ACTIVE, QR_CODE_LINK_OPEN, QR_CODE_EXPIRED, ENTRY_LINK_OPEN, ENTRY_BY_QR_CODE_CONFIRM_TAP, CONTINUE_VERIFICATION_TAP, VERIFY_BY_ANOTHER_WAY_TAP, VERIFY_AGAIN_TAP, PHONE_SUCCESS_VERIFICATION, ALERT_VERIFICATION_CODE_ERROR, ALERT_SMS_ALREADY_SEND, ALERT_NO_AVAILABLE_FACTORS, CAPTCHA_SUCCESS, ENTRY_CONFIRM_TAP, ALERT_UNSAFE_AUTH_ERROR, ALERT_REFRESH_ERROR, AUTH_SUBPROFILE, SMART_LOCK_USE_SUGGEST, SMART_LOCK_USE_AGREED, SMART_LOCK_USE_CANCELED, SMART_LOCK_SAVE_SUGGEST, SMART_LOCK_SAVING_CONFIRMED, SMART_LOCK_SAVING_DECLINED, GOOGLE_PHONE_HINT_OPENED, GOOGLE_PHONE_HINT_ADDED, GOOGLE_PHONE_HINT_SKIP, GOOGLE_PHONE_HINT_NOTHING_FOUND, CREATE_SUBPROFILE_CLICK, OAUTH_ASK_CONFIRMED, YANDEX_NEW_NUMBER, ALERT_SOMETHING_WENT_WRONG, TINKOFF_NEW_NUMBER, SBER_NEW_NUMBER, MULTIACC_ADD_ANOTHER_ACCOUNT_TAP, MULTIACC_DROP_ACCOUNT_TAP, MULTIACC_DROP_ACCOUNT, MULTI_ACC_ADD_ACCOUNT_TAP, MULTI_ACC_ADD_ACCOUNT, ACCOUNT_WAS_ADDED_TO_MULTIACC_WITH_AUTH, SELECT_ACCOUNT_TAP, SWITCH_ACCOUNT_TAP, SWITCH_FROM_ACCOUNT, SWITCH_TO_ACCOUNT, DROP_ACCOUNT_TAP, FULL_LOGOUT, REAUTHTORIZATION_START, REAUTHTORIZATION_CANCELLED, AUTH_BY_PASSKEY, AUTH_PASSKEY_ONLY_FOR_PHONE_NO_START, PASSKEY_SCREEN_OPEN, PASSKEY_SCREEN_CANCELED, START_PASSKEY_AGAIN_TAP, GOOGLE_NEW_NUMBER, SERVICE_LOGOUT, CONTINUE_TAP, CHOOSE_ANOTHER_ACCOUNT_TAP, CHOOSE_ACCOUNT_TAP, ITS_OK_TAP, CAPTCHA_REFRESH, REFUSE_ONBOARDING_PASSKEY, TRY_AGAIN, CONTINUE_REG_ADD_TAP, REGISTRATION_ADD, ERROR_USER_IS_TOO_YOUNG, CHOOSE_PASSKEY, CHOOSE_ECOSYSTEM_PUSH, CHOOSE_SMS, CHOOSE_CALL_RESET, CHOOSE_EMAIL, CHOOSE_RESERVE_CODE, CHOOSE_OFFICIAL_MESSENGER, CHOOSE_MAX_MESSENGER, CHOOSE_RESTORE, CHOOSE_APP, FACTOR_AVAILABLE, AVAILABLE_FACTORS, USER_NOT_FOUND, CALLIN_CALL_TAP, ALERT_CALLIN_ENTRY_ERROR, CALLIN_NUMBERS_ARE_OVER, CALLIN_PHONE_NUMBER_CHANGED, ERROR_INVALID_REQUEST, INTERNAL_SERVER_ERROR, UNAVAILABLE_AUTH_BY_AUTOLOGIN, CALLIN_LIBVERIFY_STARTED, CREATE_BUSINESS_START, OAUTH_HIDDEN, ALFA_NEW_NUMBER, USED_EXISTING_EMAIL, EMAIL_SKIP_TAP, EMAIL_DID_NOT_SEND_ALERT, SEND_AGAIN_TAP, BIRTHDAY_TOOLTIP_TAP, EMAIL_SUCCESS_VERIFICATION, CLOSE_ALERT, REGISTRATION_PERMISSION_SKIP_BUTTON_TAP, EXISTING_PHONE_NUMBER_BUTTON_TAP, REGISTRATION_PERMISSION_BUTTON_TAP, INCORRECT_BDAY, BACKUP_RESTORED, FEED_OPENED, WEB_REGISTRATION, MINI_APP_VK_CONNECT_LAUNCH_SCREEN_ENTER, MINI_APP_VK_CONNECT_LAUNCH_SCREEN_PERMISSIONS_ACCEPTED, MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_PERMISSIONS, MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_POLICY, MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_CONNECT_TERMS, MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_POLICY, MINI_APP_VK_CONNECT_LAUNCH_SCREEN_VIEW_SERVICE_TERMS, MAIL_LINKED_ANOTHER_ACCOUNT_LOGIN, OK_NEW_NUMBER, REGISTRATION_PHONE_CONTINUE_TAP, CHANGE_NUMBER_TO_VERIFY, MOBILE_QR_QR_CODE_BUTTON_SHOW, MOBILE_QR_QR_CODE_BUTTON_TAP, MOBILE_QR_VIDEO_LOAD_SUCCESS, MOBILE_QR_SCAN_QR_CODE_TAP, MOBILE_QR_CLOSE_GUIDE_TAP, MOBILE_QR_VIDEO_LOADING_FAILED, MOBILE_QR_TRY_AGAIN_TAP, MOBILE_QR_VIDEO_LOADING, MOBILE_QR_CLOSE_ALERT_TAP, MOBILE_QR_AUTH_WITH_QR_TAP, MOBILE_QR_MORE_INFO_TAP, CHOOSE_ANOTHER_ACCOUNT, ITS_NOT_MY_ACCOUNT, FORGOT_PASSWORD, ACCOUNTS_LIMIT_REACHED_ERROR, MOBILE_QR_INCORRECT_QR_SCANNED, TRY_VERIFY_AGAIN, BACK_TO_REGISTRATION_START, BLOCKSTORE_RELOAD, INPUT_BIRTHDAY, BIRTHDAY_CALENDAR_ICON_TAP, PINCODE_INPUT_INTERACTION, PINCODE_SUCCESS_VALIDATION, PINCODE_INCORRECT, PINCODE_TOO_MANY_ATTEMPTS_ALERT, PINCODE_RESET_TAP, OAUTH_BUTTON_SHOW, ACCOUNT_MANAGER_RELOAD, VKME_DROP_ACCOUNT_TAP, VKME_ADD_ANOTHER_ACCOUNT_TAP, MAX_ACCOUNT_ALERT, AUTH_QR_CODE_START, AUTH_CANCEL_TAP, INCORRECT_OTP_CODE, PHONE_REUSE_REQUESTED, PASSWORD_AUTOFILL, INPUT_PASSWORD_INTERACTION, CLOSE_ALERT_TAP, EMAIL_FORWARDING_ERROR, EMAIL_FORWARDING_SUCCESS, OTP_MESSENGER_LIBVERIFY_STARTED, ONEPASS_CONNECT_AGREE_TAP, ONEPASS_CONNECT_CANCEL_TAP, CHOOSE_ENTER_BY_MAIL_PASS, ALERT_DELETE_PROFILE, ALERT_SILENT_AUTH_ADD_INFO, DROP_ACCOUNT_FROM_SAVED, AUTH_SAVED_START, ADD_ACCOUNT_BUTTON_TAP, ADD_ACCOUNT_TO_SAVED_START, OK_HEADS_LOGIN_ERROR, OK_AUTH_ERROR, OK_REGISTRATION_ERROR, ALERT_DELETE_PROFILE_CANCELED, ALERT_SILENT_AUTH_ADD_INFO_CANCELED, ALERT_SILENT_AUTH_ADD_INFO_ACCEPT, ALERT_QR_CODE_OPEN_SCANNER, SCANNER_TAB, CAMERA_SOURCE_FOR_QR_CODE, CREATE_RELATED_TAP, QR_CODE_SHOW, LOGIN_LATER_TAP, AUTH_BY_QR_APP, QR_CODE_REFRESH_TAP, BIOMETRICS_VALIDATION_REFUSED, INPUT_LOGIN_INTERACTION, OAUTH_BUTTON_TAP, MORE_INFO_BUTTON_TAP, ALERT_WRONG_INPUT, RESTORE_AUTH_BUTTON_TAP, RESTORE_AUTH_BUTTON_TAP_CANCEL, ALERT_REGISTRATION_CONTINUE, ALERT_REGISTRATION_CONTINUE_EXIT_BUTTON_TAP, RESTORE_AUTH_START, MAIL_RESTORE_START, REDIRECT_MAIL_RESTORE, EMAIL_ERROR, ERROR_EMAIL_ALREADY_LINKED, EMAIL_NEED_PASSWORD_CHANGE, NO_ACCESS_TO_PHONE_TAP, GO_TO_MAX_TAP, MAX_CONNECT_AGREE_TAP, MAX_CONNECT_CANCEL_TAP, MAX_APP_OPENED, APP_MARKET_OPENED, MAX_APP_OPEN_ATTEMPT, OPEN_MARKET_FAILED, AUTH_BY_MAX, AUTH_BY_MAX_CODE, BIND_ACCOUNTS_TAP, OAUTH_TO_GRAY_VKID_BIND_CLOSE_TAP, SUCCESS_BIND_TO_VKID, NO_BIND_OAUTH_NEEDED_TAP, GRAY_VKID_TO_OAUTH_BIND_CLOSE_TAP, SUCCESS_BIND_GRAY_VKID, YES_MY_ACCOUNT_TAP, ALERT_VERIFICATION_BY_MAX_MESSENGER_TIMEOUT, ALERT_VERIFICATION_BY_MAX_MESSENGER_CANCEL, RUSTORE_SEAMLESS_INSTALL_AVAILABLE, RUSTORE_SEAMLESS_INSTALL_STARTED, RUSTORE_SEAMLESS_INSTALL_SUCCESS, RUSTORE_SEAMLESS_INSTALL_MAX_MESSENGER_NOT_DOWNLOADED_ERROR, RUSTORE_SEAMLESS_INSTALL_DEFAULT_CLIENT_NOT_DOWNLOADED_ERROR, RUSTORE_SEAMLESS_INSTALL_CANCEL, RUSTORE_SEAMLESS_INSTALL_UNKNOWN_ERROR, RETURN_FROM_MAX_APP, DOUBTFUL_AUTH_CHECK, PASSWORD_AUTOFILL_CHOOSE_ACCOUNT_TAP, PASSWORD_AUTOFILL_CLOSE_TAP, AUTH_BY_VKME, VERIFICATION_BY_MAX_MESSENGER_CANCEL, RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION, RUSTORE_SEAMLESS_INSTALL_SERVICE_CONNECTION_ERROR, RUSTORE_SEAMLESS_INSTALL_ERROR, AGREE_ACTUAL_PHONE_TAP, CHANGE_ACTUAL_PHONE_TAP, CONFIRM_ACTUAL_PHONE_BY_USER_CLOSE_TAP, AGREE_ACTUAL_EMAIL_TAP, CHANGE_ACTUAL_EMAIL_TAP, CONFIRM_ACTUAL_EMAIL_CLOSE_TAP, ACTUAL_EMAIL_CONFIRMATION_ERROR, ACTUAL_EMAIL_CONFIRMATION_SUCCESS, ADD_EMAIL_TAP, ADD_EMAIL_BY_USER_CLOSE_TAP, MAIL_LOGIN_ERROR, CHOOSE_REGISTRATION_TAP, REGISTRATION_MAIL_START, CHOOSE_MY_ACCOUNT_TAP, EMAIL_BLOCKED_ERROR, EMAIL_2FA_ERROR, START_AUTH_BY_GRAY_LINK, AUTH_BY_MAIL, AUTH_BY_GRAY_LINK, AUTH_BY_GRAY_LINK_FAIL, ENTER_PASSWORD_MAIL_LIMIT_ERROR, DOMAIN_SELECTION_TAP, CHOOSE_DOMAIN_TAP, CREATE_EMAIL, CREATE_CHILD_EMAIL, MIGRATE_FROM_GMAIL, REDIRECT_TO_MAIL_AUTH, VERIFICATION_BY_MAX_MESSENGER_TIMEOUT, KEYCHAIN_TOKEN_BACKUP_SUCCESS, KEYCHAIN_TOKEN_RESTORE_SUCCESS, MAIL_WHITE_PROMO_VKID_SDK_START, SUCCESS_AUTH_MAIL_WHITE_PROMO, AUTH_BY_WHITE_LINK, AUTH_BY_VKID, SEND_SMS_TAP, MESSAGE_APP_OPEN, MESSAGE_APP_OPEN_ERROR, SMS_INBOX_FATAL_ERROR, SMS_INBOX_TIMEOUT_ERROR, SMS_INBOX_SEND_SMS_ERROR, SMS_INBOX_INCORRECT_PHONE_ERROR, SMS_INBOX_INCORRECT_TEXT_ERROR, GO_TO_MAX_CHAT_TAP, CHOOSE_MAX_CODE, COUNTRY_MENU_SHOW, SEARCH_COUNTRY_TAP, SEARCH_COUNTRY_NOT_FOUND, SEARCH_COUNTRY_INTERACTION, OTP_MESSENGER_LIBVERIFY_SENDING, MESSENGER_SIGN_UP_PROMO, MESSENGER_APP_OPENED, MESSENGER_STORE_OPENED, QR_CODE_DEVICE_INFO_TAP, QR_CODE_CLOSE_TAP, QR_CODE_CANCEL_TAP, INCORRECT_DEVICE_CODE, DEVICE_CODE_SUCCESS, ENTRY_BY_DEVICE_CODE_CONFIRM_TAP, ENTRY_BY_DEVICE_CODE_CLOSER_TAP, ALERT_DEVICE_CODE_CONNECTION_ERROR, SMS_LIBVERIFY_STARTED, CALL_LIBVERIFY_STARTED, MOBILEID_LIBVERIFY_STARTED, PUSH_LIBVERIFY_STARTED, ALREADY_VERIFIED_LIBVERIFY_STARTED};
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    public SchemeStatSak$TypeRegistrationItem(EventType eventType, String str, Integer num, String str2, String str3, String str4, Long l, List<SchemeStatSak$RegistrationFieldItem> list, SchemeStatSak$EventScreen schemeStatSak$EventScreen, Integer num2, String str5, String str6, Error error, Integer num3, Integer num4, Integer num5) {
        this.eventType = eventType;
        this.sid = str;
        this.clientId = num;
        this.silentToken = str2;
        this.silentTokenUuid = str3;
        this.multiaccId = str4;
        this.userId = l;
        this.fields = list;
        this.screenTo = schemeStatSak$EventScreen;
        this.errorSubcode = num2;
        this.flowSource = str5;
        this.flowEntryPoints = str6;
        this.error = error;
        this.authProviders = num3;
        this.appId = num4;
        this.authAppId = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStatSak$TypeRegistrationItem)) {
            return false;
        }
        SchemeStatSak$TypeRegistrationItem schemeStatSak$TypeRegistrationItem = (SchemeStatSak$TypeRegistrationItem) obj;
        return this.eventType == schemeStatSak$TypeRegistrationItem.eventType && epx.f(this.sid, schemeStatSak$TypeRegistrationItem.sid) && epx.f(this.clientId, schemeStatSak$TypeRegistrationItem.clientId) && epx.f(this.silentToken, schemeStatSak$TypeRegistrationItem.silentToken) && epx.f(this.silentTokenUuid, schemeStatSak$TypeRegistrationItem.silentTokenUuid) && epx.f(this.multiaccId, schemeStatSak$TypeRegistrationItem.multiaccId) && epx.f(this.userId, schemeStatSak$TypeRegistrationItem.userId) && epx.f(this.fields, schemeStatSak$TypeRegistrationItem.fields) && this.screenTo == schemeStatSak$TypeRegistrationItem.screenTo && epx.f(this.errorSubcode, schemeStatSak$TypeRegistrationItem.errorSubcode) && epx.f(this.flowSource, schemeStatSak$TypeRegistrationItem.flowSource) && epx.f(this.flowEntryPoints, schemeStatSak$TypeRegistrationItem.flowEntryPoints) && this.error == schemeStatSak$TypeRegistrationItem.error && epx.f(this.authProviders, schemeStatSak$TypeRegistrationItem.authProviders) && epx.f(this.appId, schemeStatSak$TypeRegistrationItem.appId) && epx.f(this.authAppId, schemeStatSak$TypeRegistrationItem.authAppId);
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
        String str4 = this.multiaccId;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.userId;
        int hashCode7 = (hashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        List<SchemeStatSak$RegistrationFieldItem> list = this.fields;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = this.screenTo;
        int hashCode9 = (hashCode8 + (schemeStatSak$EventScreen == null ? 0 : schemeStatSak$EventScreen.hashCode())) * 31;
        Integer num2 = this.errorSubcode;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.flowSource;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.flowEntryPoints;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Error error = this.error;
        int hashCode13 = (hashCode12 + (error == null ? 0 : error.hashCode())) * 31;
        Integer num3 = this.authProviders;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.appId;
        int hashCode15 = (hashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.authAppId;
        return hashCode15 + (num5 != null ? num5.hashCode() : 0);
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
        sb.append(", multiaccId=");
        sb.append(this.multiaccId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", fields=");
        sb.append(this.fields);
        sb.append(", screenTo=");
        sb.append(this.screenTo);
        sb.append(", errorSubcode=");
        sb.append(this.errorSubcode);
        sb.append(", flowSource=");
        sb.append(this.flowSource);
        sb.append(", flowEntryPoints=");
        sb.append(this.flowEntryPoints);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", authProviders=");
        sb.append(this.authProviders);
        sb.append(", appId=");
        sb.append(this.appId);
        sb.append(", authAppId=");
        return uqi.b(sb, this.authAppId, ')');
    }

    public /* synthetic */ SchemeStatSak$TypeRegistrationItem(EventType eventType, String str, Integer num, String str2, String str3, String str4, Long l, List list, SchemeStatSak$EventScreen schemeStatSak$EventScreen, Integer num2, String str5, String str6, Error error, Integer num3, Integer num4, Integer num5, int i, zcl zclVar) {
        this(eventType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : schemeStatSak$EventScreen, (i & 512) != 0 ? null : num2, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : error, (i & 8192) != 0 ? null : num3, (i & 16384) != 0 ? null : num4, (i & 32768) != 0 ? null : num5);
    }
}
