package com.vk.stat.sak.scheme;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SchemeStatSak.kt */
/* loaded from: classes11.dex */
public final class SchemeStatSak$EventScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SchemeStatSak$EventScreen[] $VALUES;
    private final String value;
    public static final SchemeStatSak$EventScreen ACCOUNT_CONFIRM_PASSWORD = new SchemeStatSak$EventScreen("ACCOUNT_CONFIRM_PASSWORD", 0, "account_confirm_password");
    public static final SchemeStatSak$EventScreen ACCOUNT_CONFIRM_VERIFY = new SchemeStatSak$EventScreen("ACCOUNT_CONFIRM_VERIFY", 1, "account_confirm_verify");
    public static final SchemeStatSak$EventScreen AUTH_QR_CODE = new SchemeStatSak$EventScreen("AUTH_QR_CODE", 2, "auth_qr_code");
    public static final SchemeStatSak$EventScreen BANNED_ACCOUNT = new SchemeStatSak$EventScreen("BANNED_ACCOUNT", 3, "banned_account");
    public static final SchemeStatSak$EventScreen CAPTCHA = new SchemeStatSak$EventScreen("CAPTCHA", 4, "captcha");
    public static final SchemeStatSak$EventScreen CONTACTS_APPS_ADD_PHONE = new SchemeStatSak$EventScreen("CONTACTS_APPS_ADD_PHONE", 5, "contacts_apps_add_phone");
    public static final SchemeStatSak$EventScreen CONTACTS_APPS_ADD_EMAIL = new SchemeStatSak$EventScreen("CONTACTS_APPS_ADD_EMAIL", 6, "contacts_apps_add_email");
    public static final SchemeStatSak$EventScreen CONTACTS_APPS_ADD_ADDRESS = new SchemeStatSak$EventScreen("CONTACTS_APPS_ADD_ADDRESS", 7, "contacts_apps_add_address");
    public static final SchemeStatSak$EventScreen CONTACTS_APPS_EDIT_PHONE = new SchemeStatSak$EventScreen("CONTACTS_APPS_EDIT_PHONE", 8, "contacts_apps_edit_phone");
    public static final SchemeStatSak$EventScreen CONTACTS_APPS_EDIT_EMAIL = new SchemeStatSak$EventScreen("CONTACTS_APPS_EDIT_EMAIL", 9, "contacts_apps_edit_email");
    public static final SchemeStatSak$EventScreen CONTACTS_APPS_EDIT_ADDRESS = new SchemeStatSak$EventScreen("CONTACTS_APPS_EDIT_ADDRESS", 10, "contacts_apps_edit_address");
    public static final SchemeStatSak$EventScreen CONSENT_SCREEN = new SchemeStatSak$EventScreen("CONSENT_SCREEN", 11, "consent_screen");
    public static final SchemeStatSak$EventScreen NOWHERE_DIALOG = new SchemeStatSak$EventScreen("NOWHERE_DIALOG", 12, "nowhere_dialog");
    public static final SchemeStatSak$EventScreen FAST_SILENT_AUTH_EXISTING_ACCOUNT = new SchemeStatSak$EventScreen("FAST_SILENT_AUTH_EXISTING_ACCOUNT", 13, "fast_silent_auth_existing_account");
    public static final SchemeStatSak$EventScreen FAST_SILENT_AUTH_AS_USER = new SchemeStatSak$EventScreen("FAST_SILENT_AUTH_AS_USER", 14, "fast_silent_auth_as_user");
    public static final SchemeStatSak$EventScreen FAST_SILENT_AUTH_DOWNLOAD = new SchemeStatSak$EventScreen("FAST_SILENT_AUTH_DOWNLOAD", 15, "fast_silent_auth_download");
    public static final SchemeStatSak$EventScreen FAST_SILENT_AUTH_SUCCESS = new SchemeStatSak$EventScreen("FAST_SILENT_AUTH_SUCCESS", 16, "fast_silent_auth_success");
    public static final SchemeStatSak$EventScreen FAST_SILENT_AUTH_ERROR = new SchemeStatSak$EventScreen("FAST_SILENT_AUTH_ERROR", 17, "fast_silent_auth_error");
    public static final SchemeStatSak$EventScreen GAME = new SchemeStatSak$EventScreen("GAME", 18, "game");
    public static final SchemeStatSak$EventScreen MINI_APP = new SchemeStatSak$EventScreen("MINI_APP", 19, "mini_app");
    public static final SchemeStatSak$EventScreen NOWHERE = new SchemeStatSak$EventScreen("NOWHERE", 20, "nowhere");
    public static final SchemeStatSak$EventScreen PASSPORT_RESTORE = new SchemeStatSak$EventScreen("PASSPORT_RESTORE", 21, "passport_restore");
    public static final SchemeStatSak$EventScreen REGISTRATION_PHONE = new SchemeStatSak$EventScreen("REGISTRATION_PHONE", 22, "registration_phone");
    public static final SchemeStatSak$EventScreen PROMO_MAX = new SchemeStatSak$EventScreen("PROMO_MAX", 23, "promo_max");
    public static final SchemeStatSak$EventScreen REGISTRATION_PERMISSION = new SchemeStatSak$EventScreen("REGISTRATION_PERMISSION", 24, "registration_permission");
    public static final SchemeStatSak$EventScreen REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD_OK = new SchemeStatSak$EventScreen("REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD_OK", 25, "registration_existent_account_no_password_ok");
    public static final SchemeStatSak$EventScreen REGISTRATION_EXISTENT_ACCOUNT_PASSWORDLESS = new SchemeStatSak$EventScreen("REGISTRATION_EXISTENT_ACCOUNT_PASSWORDLESS", 26, "registration_existent_account_passwordless");
    public static final SchemeStatSak$EventScreen REGISTRATION_CONNECT_GMAIL = new SchemeStatSak$EventScreen("REGISTRATION_CONNECT_GMAIL", 27, "registration_connect_gmail");
    public static final SchemeStatSak$EventScreen REGISTRATION_PHONE_VERIFY = new SchemeStatSak$EventScreen("REGISTRATION_PHONE_VERIFY", 28, "registration_phone_verify");
    public static final SchemeStatSak$EventScreen REGISTRATION_PHONE_VERIFY_LIB = new SchemeStatSak$EventScreen("REGISTRATION_PHONE_VERIFY_LIB", 29, "registration_phone_verify_lib");
    public static final SchemeStatSak$EventScreen REGISTRATION_NAME = new SchemeStatSak$EventScreen("REGISTRATION_NAME", 30, "registration_name");
    public static final SchemeStatSak$EventScreen REGISTRATION_NAME_ADD = new SchemeStatSak$EventScreen("REGISTRATION_NAME_ADD", 31, "registration_name_add");
    public static final SchemeStatSak$EventScreen REGISTRATION_INFO_ABOUT_YOURSELF = new SchemeStatSak$EventScreen("REGISTRATION_INFO_ABOUT_YOURSELF", 32, "registration_info_about_yourself");
    public static final SchemeStatSak$EventScreen REGISTRATION_INFO_ABOUT_YOURSELF_ADD = new SchemeStatSak$EventScreen("REGISTRATION_INFO_ABOUT_YOURSELF_ADD", 33, "registration_info_about_yourself_add");
    public static final SchemeStatSak$EventScreen REGISTRATION_EXISTENT_ACCOUNT = new SchemeStatSak$EventScreen("REGISTRATION_EXISTENT_ACCOUNT", 34, "registration_existent_account");
    public static final SchemeStatSak$EventScreen REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD = new SchemeStatSak$EventScreen("REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD", 35, "registration_existent_account_no_password");
    public static final SchemeStatSak$EventScreen REGISTRATION_BDAY = new SchemeStatSak$EventScreen("REGISTRATION_BDAY", 36, "registration_bday");
    public static final SchemeStatSak$EventScreen REGISTRATION_BDAY_ADD = new SchemeStatSak$EventScreen("REGISTRATION_BDAY_ADD", 37, "registration_bday_add");
    public static final SchemeStatSak$EventScreen REGISTRATION_PASSWORD = new SchemeStatSak$EventScreen("REGISTRATION_PASSWORD", 38, "registration_password");
    public static final SchemeStatSak$EventScreen REGISTRATION_PASSWORD_ADD = new SchemeStatSak$EventScreen("REGISTRATION_PASSWORD_ADD", 39, "registration_password_add");
    public static final SchemeStatSak$EventScreen REGISTRATION_IMPORT_CONTACTS = new SchemeStatSak$EventScreen("REGISTRATION_IMPORT_CONTACTS", 40, "registration_import_contacts");
    public static final SchemeStatSak$EventScreen REGISTRATION_CONNECT_FACEBOOK = new SchemeStatSak$EventScreen("REGISTRATION_CONNECT_FACEBOOK", 41, "registration_connect_facebook");
    public static final SchemeStatSak$EventScreen REGISTRATION_CONNECT_OK = new SchemeStatSak$EventScreen("REGISTRATION_CONNECT_OK", 42, "registration_connect_ok");
    public static final SchemeStatSak$EventScreen REGISTRATION_CONNECT_TWITTER = new SchemeStatSak$EventScreen("REGISTRATION_CONNECT_TWITTER", 43, "registration_connect_twitter");
    public static final SchemeStatSak$EventScreen REGISTRATION_PHOTO = new SchemeStatSak$EventScreen("REGISTRATION_PHOTO", 44, "registration_photo");
    public static final SchemeStatSak$EventScreen REGISTRATION_CHOOSE_PHOTO = new SchemeStatSak$EventScreen("REGISTRATION_CHOOSE_PHOTO", 45, "registration_choose_photo");
    public static final SchemeStatSak$EventScreen REGISTRATION_TAKE_PHOTO = new SchemeStatSak$EventScreen("REGISTRATION_TAKE_PHOTO", 46, "registration_take_photo");
    public static final SchemeStatSak$EventScreen REGISTRATION_STYLE_PHOTO = new SchemeStatSak$EventScreen("REGISTRATION_STYLE_PHOTO", 47, "registration_style_photo");
    public static final SchemeStatSak$EventScreen REGISTRATION_CROP_PHOTO = new SchemeStatSak$EventScreen("REGISTRATION_CROP_PHOTO", 48, "registration_crop_photo");
    public static final SchemeStatSak$EventScreen REGISTRATION_LIST_ADDRESS_BOOK = new SchemeStatSak$EventScreen("REGISTRATION_LIST_ADDRESS_BOOK", 49, "registration_list_address_book");
    public static final SchemeStatSak$EventScreen REGISTRATION_LIST_FRIENDS_FACEBOOK = new SchemeStatSak$EventScreen("REGISTRATION_LIST_FRIENDS_FACEBOOK", 50, "registration_list_friends_facebook");
    public static final SchemeStatSak$EventScreen REGISTRATION_LIST_FRIENDS_OK = new SchemeStatSak$EventScreen("REGISTRATION_LIST_FRIENDS_OK", 51, "registration_list_friends_ok");
    public static final SchemeStatSak$EventScreen REGISTRATION_LIST_FRIENDS_TWITTER = new SchemeStatSak$EventScreen("REGISTRATION_LIST_FRIENDS_TWITTER", 52, "registration_list_friends_twitter");
    public static final SchemeStatSak$EventScreen REGISTRATION_LIST_CONTACTS_GMAIL = new SchemeStatSak$EventScreen("REGISTRATION_LIST_CONTACTS_GMAIL", 53, "registration_list_contacts_gmail");
    public static final SchemeStatSak$EventScreen REGISTRATION_PUSH = new SchemeStatSak$EventScreen("REGISTRATION_PUSH", 54, "registration_push");
    public static final SchemeStatSak$EventScreen REGISTRATION_GEO = new SchemeStatSak$EventScreen("REGISTRATION_GEO", 55, "registration_geo");
    public static final SchemeStatSak$EventScreen REGISTRATION_PUSH_REQUEST = new SchemeStatSak$EventScreen("REGISTRATION_PUSH_REQUEST", 56, "registration_push_request");
    public static final SchemeStatSak$EventScreen REGISTRATION_SUBJECTS = new SchemeStatSak$EventScreen("REGISTRATION_SUBJECTS", 57, "registration_subjects");
    public static final SchemeStatSak$EventScreen REGISTRATION_EMAIL_VERIFY = new SchemeStatSak$EventScreen("REGISTRATION_EMAIL_VERIFY", 58, "registration_email_verify");
    public static final SchemeStatSak$EventScreen REGISTRATION_EMAIL_PASSWORD = new SchemeStatSak$EventScreen("REGISTRATION_EMAIL_PASSWORD", 59, "registration_email_password");
    public static final SchemeStatSak$EventScreen REGISTRATION_EMAIL = new SchemeStatSak$EventScreen("REGISTRATION_EMAIL", 60, "registration_email");
    public static final SchemeStatSak$EventScreen REGISTRATION_EMAIL_EXPLANATION = new SchemeStatSak$EventScreen("REGISTRATION_EMAIL_EXPLANATION", 61, "registration_email_explanation");
    public static final SchemeStatSak$EventScreen REGISTRATION_NEW_ACCOUNT = new SchemeStatSak$EventScreen("REGISTRATION_NEW_ACCOUNT", 62, "registration_new_account");
    public static final SchemeStatSak$EventScreen REGISTRATION_EXISTENT_ACCOUNT_RESTORE = new SchemeStatSak$EventScreen("REGISTRATION_EXISTENT_ACCOUNT_RESTORE", 63, "registration_existent_account_restore");
    public static final SchemeStatSak$EventScreen LK_PASSWORD = new SchemeStatSak$EventScreen("LK_PASSWORD", 64, "lk_password");
    public static final SchemeStatSak$EventScreen RESTORE_ACCOUNT = new SchemeStatSak$EventScreen("RESTORE_ACCOUNT", 65, "restore_account");
    public static final SchemeStatSak$EventScreen HAVE_ACCOUNT_QUESTION = new SchemeStatSak$EventScreen("HAVE_ACCOUNT_QUESTION", 66, "have_account_question");
    public static final SchemeStatSak$EventScreen HAVE_ACCOUNT_CREDENTIALS = new SchemeStatSak$EventScreen("HAVE_ACCOUNT_CREDENTIALS", 67, "have_account_credentials");
    public static final SchemeStatSak$EventScreen HAVE_ACCOUNT_SUPPORT = new SchemeStatSak$EventScreen("HAVE_ACCOUNT_SUPPORT", 68, "have_account_support");
    public static final SchemeStatSak$EventScreen CONTACTING_SUPPORT = new SchemeStatSak$EventScreen("CONTACTING_SUPPORT", 69, "contacting_support");
    public static final SchemeStatSak$EventScreen VERIFICATION_ASK_NUMBER = new SchemeStatSak$EventScreen("VERIFICATION_ASK_NUMBER", 70, "verification_ask_number");
    public static final SchemeStatSak$EventScreen VERIFICATION_ENTER_NUMBER = new SchemeStatSak$EventScreen("VERIFICATION_ENTER_NUMBER", 71, "verification_enter_number");
    public static final SchemeStatSak$EventScreen VERIFICATION_PHONE_VERIFY = new SchemeStatSak$EventScreen("VERIFICATION_PHONE_VERIFY", 72, "verification_phone_verify");
    public static final SchemeStatSak$EventScreen VERIFICATION_BUSY_NUMBER = new SchemeStatSak$EventScreen("VERIFICATION_BUSY_NUMBER", 73, "verification_busy_number");
    public static final SchemeStatSak$EventScreen VERIFICATION_LOADING = new SchemeStatSak$EventScreen("VERIFICATION_LOADING", 74, "verification_loading");
    public static final SchemeStatSak$EventScreen VK_MAIL_CREATE = new SchemeStatSak$EventScreen("VK_MAIL_CREATE", 75, "vk_mail_create");
    public static final SchemeStatSak$EventScreen PHONE_2FA_VERIFY = new SchemeStatSak$EventScreen("PHONE_2FA_VERIFY", 76, "phone_2fa_verify");
    public static final SchemeStatSak$EventScreen PHONE_2FA_VERIFY_SMS = new SchemeStatSak$EventScreen("PHONE_2FA_VERIFY_SMS", 77, "phone_2fa_verify_sms");
    public static final SchemeStatSak$EventScreen PHONE_2FA_VERIFY_APP = new SchemeStatSak$EventScreen("PHONE_2FA_VERIFY_APP", 78, "phone_2fa_verify_app");
    public static final SchemeStatSak$EventScreen PHONE_2FA_VERIFY_CALL = new SchemeStatSak$EventScreen("PHONE_2FA_VERIFY_CALL", 79, "phone_2fa_verify_call");
    public static final SchemeStatSak$EventScreen PHONE_2FA_VERIFY_LIB = new SchemeStatSak$EventScreen("PHONE_2FA_VERIFY_LIB", 80, "phone_2fa_verify_lib");
    public static final SchemeStatSak$EventScreen PARTIAL_EXPAND_ENTER_PASSWORD = new SchemeStatSak$EventScreen("PARTIAL_EXPAND_ENTER_PASSWORD", 81, "partial_expand_enter_password");
    public static final SchemeStatSak$EventScreen PARTIAL_EXPAND_HAVE_ACCOUNT = new SchemeStatSak$EventScreen("PARTIAL_EXPAND_HAVE_ACCOUNT", 82, "partial_expand_have_account");
    public static final SchemeStatSak$EventScreen PARTIAL_SILENT_EXPAND_PASSWORD = new SchemeStatSak$EventScreen("PARTIAL_SILENT_EXPAND_PASSWORD", 83, "partial_silent_expand_password");
    public static final SchemeStatSak$EventScreen OAUTH_EXISTING_ACCOUNT = new SchemeStatSak$EventScreen("OAUTH_EXISTING_ACCOUNT", 84, "oauth_existing_account");
    public static final SchemeStatSak$EventScreen OAUTH_REGISTRATION_PHONE = new SchemeStatSak$EventScreen("OAUTH_REGISTRATION_PHONE", 85, "oauth_registration_phone");
    public static final SchemeStatSak$EventScreen OAUTH_APPLE = new SchemeStatSak$EventScreen("OAUTH_APPLE", 86, "oauth_apple");
    public static final SchemeStatSak$EventScreen OAUTH_MAIL = new SchemeStatSak$EventScreen("OAUTH_MAIL", 87, "oauth_mail");
    public static final SchemeStatSak$EventScreen OAUTH_OK = new SchemeStatSak$EventScreen("OAUTH_OK", 88, "oauth_ok");
    public static final SchemeStatSak$EventScreen OAUTH_SBER = new SchemeStatSak$EventScreen("OAUTH_SBER", 89, "oauth_sber");
    public static final SchemeStatSak$EventScreen OAUTH_ESIA = new SchemeStatSak$EventScreen("OAUTH_ESIA", 90, "oauth_esia");
    public static final SchemeStatSak$EventScreen OTHER = new SchemeStatSak$EventScreen(NativeAdContent.ViewTag.OTHER, 91, "other");
    public static final SchemeStatSak$EventScreen START = new SchemeStatSak$EventScreen("START", 92, "start");
    public static final SchemeStatSak$EventScreen START_PROCEED_AS = new SchemeStatSak$EventScreen("START_PROCEED_AS", 93, "start_proceed_as");
    public static final SchemeStatSak$EventScreen START_PROCEED_AS_MASTER_ACCOUNT = new SchemeStatSak$EventScreen("START_PROCEED_AS_MASTER_ACCOUNT", 94, "start_proceed_as_master_account");
    public static final SchemeStatSak$EventScreen START_WITH_PHONE = new SchemeStatSak$EventScreen("START_WITH_PHONE", 95, "start_with_phone");
    public static final SchemeStatSak$EventScreen SUGGEST_VK_ID_VALUE = new SchemeStatSak$EventScreen("SUGGEST_VK_ID_VALUE", 96, "suggest_vk_id_value");
    public static final SchemeStatSak$EventScreen SILENT_AUTH = new SchemeStatSak$EventScreen("SILENT_AUTH", 97, "silent_auth");
    public static final SchemeStatSak$EventScreen SILENT_AUTH_LOADING = new SchemeStatSak$EventScreen("SILENT_AUTH_LOADING", 98, "silent_auth_loading");
    public static final SchemeStatSak$EventScreen SILENT_AUTH_EXISTING_ACCOUNT = new SchemeStatSak$EventScreen("SILENT_AUTH_EXISTING_ACCOUNT", 99, "silent_auth_existing_account");
    public static final SchemeStatSak$EventScreen SILENT_AUTH_PROVIDED_PHONE = new SchemeStatSak$EventScreen("SILENT_AUTH_PROVIDED_PHONE", 100, "silent_auth_provided_phone");
    public static final SchemeStatSak$EventScreen SILENT_AUTH_MIGRATION = new SchemeStatSak$EventScreen("SILENT_AUTH_MIGRATION", 101, "silent_auth_migration");
    public static final SchemeStatSak$EventScreen SILENT_AUTH_EMAIL = new SchemeStatSak$EventScreen("SILENT_AUTH_EMAIL", 102, "silent_auth_email");
    public static final SchemeStatSak$EventScreen VERIFICATION_AUTHENTICATOR_CODE = new SchemeStatSak$EventScreen("VERIFICATION_AUTHENTICATOR_CODE", 103, "verification_authenticator_code");
    public static final SchemeStatSak$EventScreen VKC_ACCOUNT_LINK_LOADING = new SchemeStatSak$EventScreen("VKC_ACCOUNT_LINK_LOADING", 104, "vkc_account_link_loading");
    public static final SchemeStatSak$EventScreen VKC_ACCOUNT_NOT_FOUND = new SchemeStatSak$EventScreen("VKC_ACCOUNT_NOT_FOUND", 105, "vkc_account_not_found");
    public static final SchemeStatSak$EventScreen VKC_ACCOUNT_FOUND = new SchemeStatSak$EventScreen("VKC_ACCOUNT_FOUND", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, "vkc_account_found");
    public static final SchemeStatSak$EventScreen VKC_ACCOUNT_ALREADY_LINKED = new SchemeStatSak$EventScreen("VKC_ACCOUNT_ALREADY_LINKED", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, "vkc_account_already_linked");
    public static final SchemeStatSak$EventScreen VKC_ACCOUNT_LINK_TOKEN_ERROR = new SchemeStatSak$EventScreen("VKC_ACCOUNT_LINK_TOKEN_ERROR", 108, "vkc_account_link_token_error");
    public static final SchemeStatSak$EventScreen VKC_ACCOUNT_LINK_PASSWORD = new SchemeStatSak$EventScreen("VKC_ACCOUNT_LINK_PASSWORD", 109, "vkc_account_link_password");
    public static final SchemeStatSak$EventScreen VKC_ACCOINT_MANY_CHOICES = new SchemeStatSak$EventScreen("VKC_ACCOINT_MANY_CHOICES", 110, "vkc_accoint_many_choices");
    public static final SchemeStatSak$EventScreen VKC_DATA_PERMISSION = new SchemeStatSak$EventScreen("VKC_DATA_PERMISSION", 111, "vkc_data_permission");
    public static final SchemeStatSak$EventScreen AUTH_PASSWORD = new SchemeStatSak$EventScreen("AUTH_PASSWORD", 112, "auth_password");
    public static final SchemeStatSak$EventScreen AUTH_START_LOADING = new SchemeStatSak$EventScreen("AUTH_START_LOADING", 113, "auth_start_loading");
    public static final SchemeStatSak$EventScreen VKID_USER_CONFIRMATION = new SchemeStatSak$EventScreen("VKID_USER_CONFIRMATION", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, "vkid_user_confirmation");
    public static final SchemeStatSak$EventScreen VERIFICATION_CALL_CODE = new SchemeStatSak$EventScreen("VERIFICATION_CALL_CODE", Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, "verification_call_code");
    public static final SchemeStatSak$EventScreen CONSENT_SCREEN_AGREEMENT = new SchemeStatSak$EventScreen("CONSENT_SCREEN_AGREEMENT", 116, "consent_screen_agreement");
    public static final SchemeStatSak$EventScreen QR_CODE_ASK_CONFIRM = new SchemeStatSak$EventScreen("QR_CODE_ASK_CONFIRM", Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, "qr_code_ask_confirm");
    public static final SchemeStatSak$EventScreen QR_CODE_MAP = new SchemeStatSak$EventScreen("QR_CODE_MAP", Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "qr_code_map");
    public static final SchemeStatSak$EventScreen ALERT_QR_CODE_IRRELEVANT = new SchemeStatSak$EventScreen("ALERT_QR_CODE_IRRELEVANT", Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, "alert_qr_code_irrelevant");
    public static final SchemeStatSak$EventScreen ALERT_AUTH_UNKNOWN_ERROR = new SchemeStatSak$EventScreen("ALERT_AUTH_UNKNOWN_ERROR", 120, "alert_auth_unknown_error");
    public static final SchemeStatSak$EventScreen ALERT_AUTH_NETWORK_ERROR = new SchemeStatSak$EventScreen("ALERT_AUTH_NETWORK_ERROR", Sdk.SDKError.Reason.TPAT_ERROR_VALUE, "alert_auth_network_error");
    public static final SchemeStatSak$EventScreen ALERT_AUTH_FLOOD_CONTROL_ERROR = new SchemeStatSak$EventScreen("ALERT_AUTH_FLOOD_CONTROL_ERROR", Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, "alert_auth_flood_control_error");
    public static final SchemeStatSak$EventScreen VK_PAY_CHECKOUT = new SchemeStatSak$EventScreen("VK_PAY_CHECKOUT", 123, "vk_pay_checkout");
    public static final SchemeStatSak$EventScreen ENTRY_ASK_CONFIRM = new SchemeStatSak$EventScreen("ENTRY_ASK_CONFIRM", Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, "entry_ask_confirm");
    public static final SchemeStatSak$EventScreen ENTRY_MAP = new SchemeStatSak$EventScreen("ENTRY_MAP", 125, "entry_map");
    public static final SchemeStatSak$EventScreen ALERT_AUTH_SUCCESS = new SchemeStatSak$EventScreen("ALERT_AUTH_SUCCESS", Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, "alert_auth_success");
    public static final SchemeStatSak$EventScreen UXPOLL_MODAL = new SchemeStatSak$EventScreen("UXPOLL_MODAL", 127, "uxpoll_modal");
    public static final SchemeStatSak$EventScreen PROCEED_AS_WITH_SUBPROFILE = new SchemeStatSak$EventScreen("PROCEED_AS_WITH_SUBPROFILE", 128, "proceed_as_with_subprofile");
    public static final SchemeStatSak$EventScreen MULTI_ACC_ADD_ACCOUNT = new SchemeStatSak$EventScreen("MULTI_ACC_ADD_ACCOUNT", 129, "multi_acc_add_account");
    public static final SchemeStatSak$EventScreen MULTI_ACC_SWITCHER = new SchemeStatSak$EventScreen("MULTI_ACC_SWITCHER", 130, "multi_acc_switcher");
    public static final SchemeStatSak$EventScreen MULTIACC_SELECTOR = new SchemeStatSak$EventScreen("MULTIACC_SELECTOR", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, "multiacc_selector");
    public static final SchemeStatSak$EventScreen ONBOARDING_MULTIACCOUNT = new SchemeStatSak$EventScreen("ONBOARDING_MULTIACCOUNT", Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, "onboarding_multiaccount");
    public static final SchemeStatSak$EventScreen ONBOARDING_LONGTAP_MULTIACCOUNT = new SchemeStatSak$EventScreen("ONBOARDING_LONGTAP_MULTIACCOUNT", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "onboarding_longtap_multiaccount");
    public static final SchemeStatSak$EventScreen ALERT_AUTH_PHONE = new SchemeStatSak$EventScreen("ALERT_AUTH_PHONE", 134, "alert_auth_phone");
    public static final SchemeStatSak$EventScreen OAUTH_YANDEX = new SchemeStatSak$EventScreen("OAUTH_YANDEX", 135, "oauth_yandex");
    public static final SchemeStatSak$EventScreen ONBOARDING_ESIA = new SchemeStatSak$EventScreen("ONBOARDING_ESIA", Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, "onboarding_esia");
    public static final SchemeStatSak$EventScreen ERROR_CONNECTION_TO_ESIA = new SchemeStatSak$EventScreen("ERROR_CONNECTION_TO_ESIA", Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "error_connection_to_esia");
    public static final SchemeStatSak$EventScreen CONNECT_ACCOUNTS_VKID_ESIA_START = new SchemeStatSak$EventScreen("CONNECT_ACCOUNTS_VKID_ESIA_START", 138, "connect_accounts_vkid_esia_start");
    public static final SchemeStatSak$EventScreen ESIA_LINKED_TO_ANOTHER_VKID = new SchemeStatSak$EventScreen("ESIA_LINKED_TO_ANOTHER_VKID", 139, "esia_linked_to_another_vkid");
    public static final SchemeStatSak$EventScreen ESIA_NOT_VERIFIED = new SchemeStatSak$EventScreen("ESIA_NOT_VERIFIED", VersionConstants.PRODUCT_MAJOR_VERSION, "esia_not_verified");
    public static final SchemeStatSak$EventScreen REQUEST_SYNCHRONIZE_DATA_VKID_ESIA = new SchemeStatSak$EventScreen("REQUEST_SYNCHRONIZE_DATA_VKID_ESIA", 141, "request_synchronize_data_vkid_esia");
    public static final SchemeStatSak$EventScreen CONNECT_ACCOUNTS_VKID_ESIA_SUCCESS = new SchemeStatSak$EventScreen("CONNECT_ACCOUNTS_VKID_ESIA_SUCCESS", 142, "connect_accounts_vkid_esia_success");
    public static final SchemeStatSak$EventScreen ESIA_AUTH_ACTIVATED_SUCCESS = new SchemeStatSak$EventScreen("ESIA_AUTH_ACTIVATED_SUCCESS", 143, "esia_auth_activated_success");
    public static final SchemeStatSak$EventScreen PHONE_CHANGE_ACCOUNT = new SchemeStatSak$EventScreen("PHONE_CHANGE_ACCOUNT", 144, "phone_change_account");
    public static final SchemeStatSak$EventScreen EXTERNAL_INVALID_PROFILE = new SchemeStatSak$EventScreen("EXTERNAL_INVALID_PROFILE", 145, "external_invalid_profile");
    public static final SchemeStatSak$EventScreen ALERT_UNLINK_PHONE_NUMBER = new SchemeStatSak$EventScreen("ALERT_UNLINK_PHONE_NUMBER", 146, "alert_unlink_phone_number");
    public static final SchemeStatSak$EventScreen ALERT_PHONE_SUCCESS_VERIFICATION = new SchemeStatSak$EventScreen("ALERT_PHONE_SUCCESS_VERIFICATION", 147, "alert_phone_success_verification");
    public static final SchemeStatSak$EventScreen ALERT_SUCCESS_UNLINK_PHONE_NUMBER = new SchemeStatSak$EventScreen("ALERT_SUCCESS_UNLINK_PHONE_NUMBER", 148, "alert_success_unlink_phone_number");
    public static final SchemeStatSak$EventScreen PROFILE = new SchemeStatSak$EventScreen("PROFILE", 149, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
    public static final SchemeStatSak$EventScreen ESIA_TRUSTED_PROFILE = new SchemeStatSak$EventScreen("ESIA_TRUSTED_PROFILE", 150, "esia_trusted_profile");
    public static final SchemeStatSak$EventScreen CELEBRITY_PROFILE = new SchemeStatSak$EventScreen("CELEBRITY_PROFILE", 151, "celebrity_profile");
    public static final SchemeStatSak$EventScreen CELEBRITY_VERIFICATION_FAQ = new SchemeStatSak$EventScreen("CELEBRITY_VERIFICATION_FAQ", 152, "celebrity_verification_faq");
    public static final SchemeStatSak$EventScreen ESIA_FAQ = new SchemeStatSak$EventScreen("ESIA_FAQ", 153, "esia_faq");
    public static final SchemeStatSak$EventScreen OAUTH_TINKOFF = new SchemeStatSak$EventScreen("OAUTH_TINKOFF", 154, "oauth_tinkoff");
    public static final SchemeStatSak$EventScreen ONBOARDING_VERIFICATION = new SchemeStatSak$EventScreen("ONBOARDING_VERIFICATION", 155, "onboarding_verification");
    public static final SchemeStatSak$EventScreen VERIFICATION_ERROR_CONNECTION = new SchemeStatSak$EventScreen("VERIFICATION_ERROR_CONNECTION", 156, "verification_error_connection");
    public static final SchemeStatSak$EventScreen CONNECT_ACCOUNTS_VKID_OAUTH_START = new SchemeStatSak$EventScreen("CONNECT_ACCOUNTS_VKID_OAUTH_START", 157, "connect_accounts_vkid_oauth_start");
    public static final SchemeStatSak$EventScreen OAUTH_LINKED_TO_ANOTHER_VKID = new SchemeStatSak$EventScreen("OAUTH_LINKED_TO_ANOTHER_VKID", 158, "oauth_linked_to_another_vkid");
    public static final SchemeStatSak$EventScreen OAUTH_NOT_VERIFIED = new SchemeStatSak$EventScreen("OAUTH_NOT_VERIFIED", 159, "oauth_not_verified");
    public static final SchemeStatSak$EventScreen REQUEST_SYNCHRONIZE_DATA_VKID_OAUTH = new SchemeStatSak$EventScreen("REQUEST_SYNCHRONIZE_DATA_VKID_OAUTH", 160, "request_synchronize_data_vkid_oauth");
    public static final SchemeStatSak$EventScreen OAUTH_ACTIVATED_SUCCESS = new SchemeStatSak$EventScreen("OAUTH_ACTIVATED_SUCCESS", 161, "oauth_activated_success");
    public static final SchemeStatSak$EventScreen PASSWORD_CUA = new SchemeStatSak$EventScreen("PASSWORD_CUA", 162, "password-cua");
    public static final SchemeStatSak$EventScreen SMS_PROCESS_CUA = new SchemeStatSak$EventScreen("SMS_PROCESS_CUA", 163, "sms-process-cua");
    public static final SchemeStatSak$EventScreen CALLRESET_PROCESS_CUA = new SchemeStatSak$EventScreen("CALLRESET_PROCESS_CUA", 164, "callreset-process-cua");
    public static final SchemeStatSak$EventScreen VERIFICATIONS = new SchemeStatSak$EventScreen("VERIFICATIONS", 165, "verifications");
    public static final SchemeStatSak$EventScreen CONNECT_ACCOUNTS_VKID_OAUTH_SUCCESS = new SchemeStatSak$EventScreen("CONNECT_ACCOUNTS_VKID_OAUTH_SUCCESS", 166, "connect_accounts_vkid_oauth_success");
    public static final SchemeStatSak$EventScreen VERIFICATION_PASSKEY = new SchemeStatSak$EventScreen("VERIFICATION_PASSKEY", 167, "verification_passkey");
    public static final SchemeStatSak$EventScreen CONFIRM_AUTH_FAILED = new SchemeStatSak$EventScreen("CONFIRM_AUTH_FAILED", 168, "confirm_auth_failed");
    public static final SchemeStatSak$EventScreen EXTENDED_RESTORE = new SchemeStatSak$EventScreen("EXTENDED_RESTORE", 169, "extended_restore");
    public static final SchemeStatSak$EventScreen ALERT_KEYS_NOT_SUPPORTED = new SchemeStatSak$EventScreen("ALERT_KEYS_NOT_SUPPORTED", 170, "alert_keys_not_supported");
    public static final SchemeStatSak$EventScreen SETTINGS_LOGOUT = new SchemeStatSak$EventScreen("SETTINGS_LOGOUT", 171, "settings-logout");
    public static final SchemeStatSak$EventScreen SETTINGS = new SchemeStatSak$EventScreen("SETTINGS", 172, "settings");
    public static final SchemeStatSak$EventScreen OAUTH_GOOGLE = new SchemeStatSak$EventScreen("OAUTH_GOOGLE", 173, "oauth_google");
    public static final SchemeStatSak$EventScreen REGISTRATION_USECASE = new SchemeStatSak$EventScreen("REGISTRATION_USECASE", 174, "registration_usecase");
    public static final SchemeStatSak$EventScreen REGISTRATION_IS_FIRST_ACCOUNT = new SchemeStatSak$EventScreen("REGISTRATION_IS_FIRST_ACCOUNT", 175, "registration_is_first_account");
    public static final SchemeStatSak$EventScreen ONBOARDING_USECASE = new SchemeStatSak$EventScreen("ONBOARDING_USECASE", 176, "onboarding_usecase");
    public static final SchemeStatSak$EventScreen MEET_PASSKEY = new SchemeStatSak$EventScreen("MEET_PASSKEY", 177, "meet_passkey");
    public static final SchemeStatSak$EventScreen CONNECT_PASSKEY = new SchemeStatSak$EventScreen("CONNECT_PASSKEY", 178, "connect_passkey");
    public static final SchemeStatSak$EventScreen CONNECTED_KEYS = new SchemeStatSak$EventScreen("CONNECTED_KEYS", 179, "connected_keys");
    public static final SchemeStatSak$EventScreen REGISTRATION_SERVICE_USER_ADD = new SchemeStatSak$EventScreen("REGISTRATION_SERVICE_USER_ADD", 180, "registration_service_user_add");
    public static final SchemeStatSak$EventScreen PRIMARY_FACTOR_CHOICE = new SchemeStatSak$EventScreen("PRIMARY_FACTOR_CHOICE", 181, "primary_factor_choice");
    public static final SchemeStatSak$EventScreen LINK_AVAILABLE_MAIL = new SchemeStatSak$EventScreen("LINK_AVAILABLE_MAIL", 182, "link_available_mail");
    public static final SchemeStatSak$EventScreen SERVICE_MENU = new SchemeStatSak$EventScreen("SERVICE_MENU", 183, "service_menu");
    public static final SchemeStatSak$EventScreen ALERT_USER_BLOCKED = new SchemeStatSak$EventScreen("ALERT_USER_BLOCKED", 184, "alert_user_blocked");
    public static final SchemeStatSak$EventScreen ALERT_USER_DELETED = new SchemeStatSak$EventScreen("ALERT_USER_DELETED", 185, "alert_user_deleted");
    public static final SchemeStatSak$EventScreen ALERT_TRY_AGAIN = new SchemeStatSak$EventScreen("ALERT_TRY_AGAIN", 186, "alert_try_again");
    public static final SchemeStatSak$EventScreen OAUTH_ALFA = new SchemeStatSak$EventScreen("OAUTH_ALFA", 187, "oauth_alfa");
    public static final SchemeStatSak$EventScreen EMAIL_VERIFICATION = new SchemeStatSak$EventScreen("EMAIL_VERIFICATION", 188, "email_verification");
    public static final SchemeStatSak$EventScreen MAIL_LINKED_ANOTHER_ACCOUNT = new SchemeStatSak$EventScreen("MAIL_LINKED_ANOTHER_ACCOUNT", PsExtractor.PRIVATE_STREAM_1, "mail_linked_another_account");
    public static final SchemeStatSak$EventScreen ECOSYSTEM_NAVIGATION = new SchemeStatSak$EventScreen("ECOSYSTEM_NAVIGATION", 190, "ecosystem_navigation");
    public static final SchemeStatSak$EventScreen ECOSYSTEM_NAVIGATION_PROFILE = new SchemeStatSak$EventScreen("ECOSYSTEM_NAVIGATION_PROFILE", 191, "ecosystem_navigation_profile");
    public static final SchemeStatSak$EventScreen ECOSYSTEM_NAVIGATION_ACCOUNT_VIEW = new SchemeStatSak$EventScreen("ECOSYSTEM_NAVIGATION_ACCOUNT_VIEW", PsExtractor.AUDIO_STREAM, "ecosystem_navigation_account_view");
    public static final SchemeStatSak$EventScreen UNBLOCK_PROTECT_ACCOUNT = new SchemeStatSak$EventScreen("UNBLOCK_PROTECT_ACCOUNT", 193, "unblock_protect_account");
    public static final SchemeStatSak$EventScreen CALLRESET_WARNING = new SchemeStatSak$EventScreen("CALLRESET_WARNING", 194, "callreset_warning");
    public static final SchemeStatSak$EventScreen START_VKME = new SchemeStatSak$EventScreen("START_VKME", 195, "start_vkme");
    public static final SchemeStatSak$EventScreen MOBILE_QR_AUTH_CODE_GUIDE = new SchemeStatSak$EventScreen("MOBILE_QR_AUTH_CODE_GUIDE", 196, "mobile_qr_auth_code_guide");
    public static final SchemeStatSak$EventScreen MOBILE_QR_ALERT_AUTH_ERROR = new SchemeStatSak$EventScreen("MOBILE_QR_ALERT_AUTH_ERROR", 197, "mobile_qr_alert_auth_error");
    public static final SchemeStatSak$EventScreen QR_SCANNER = new SchemeStatSak$EventScreen("QR_SCANNER", 198, "qr_scanner");
    public static final SchemeStatSak$EventScreen QR_CODE_CONFIRM_WAITING = new SchemeStatSak$EventScreen("QR_CODE_CONFIRM_WAITING", 199, "qr_code_confirm_waiting");
    public static final SchemeStatSak$EventScreen ALERT_ACCOUNTS_LIMIT_REACHED = new SchemeStatSak$EventScreen("ALERT_ACCOUNTS_LIMIT_REACHED", 200, "alert_accounts_limit_reached");
    public static final SchemeStatSak$EventScreen MOBILE_QR_ALERT_INCORRECT_QR_SCANNED = new SchemeStatSak$EventScreen("MOBILE_QR_ALERT_INCORRECT_QR_SCANNED", 201, "mobile_qr_alert_incorrect_qr_scanned");
    public static final SchemeStatSak$EventScreen PINCODE_VALIDATION_ENTER = new SchemeStatSak$EventScreen("PINCODE_VALIDATION_ENTER", 202, "pincode_validation_enter");
    public static final SchemeStatSak$EventScreen PINCODE_TOO_MANY_ATTEMPTS_ALERT = new SchemeStatSak$EventScreen("PINCODE_TOO_MANY_ATTEMPTS_ALERT", 203, "pincode_too_many_attempts_alert");
    public static final SchemeStatSak$EventScreen PINCODE_CHANGE_NEW_PINCODE = new SchemeStatSak$EventScreen("PINCODE_CHANGE_NEW_PINCODE", 204, "pincode_change_new_pincode");
    public static final SchemeStatSak$EventScreen VKME_ADD_ACCOUNT = new SchemeStatSak$EventScreen("VKME_ADD_ACCOUNT", 205, "vkme_add_account");
    public static final SchemeStatSak$EventScreen AUTHORIZATION_PHONE = new SchemeStatSak$EventScreen("AUTHORIZATION_PHONE", 206, "authorization_phone");
    public static final SchemeStatSak$EventScreen PROMO_ONEPASS = new SchemeStatSak$EventScreen("PROMO_ONEPASS", 207, "promo_onepass");
    public static final SchemeStatSak$EventScreen ONBOARDING_RELATED = new SchemeStatSak$EventScreen("ONBOARDING_RELATED", Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, "onboarding_related");
    public static final SchemeStatSak$EventScreen AUTH_MOBILE_QR_CODE_APP = new SchemeStatSak$EventScreen("AUTH_MOBILE_QR_CODE_APP", Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, "auth_mobile_qr_code_app");
    public static final SchemeStatSak$EventScreen RESTORE_AUTH_MAIL = new SchemeStatSak$EventScreen("RESTORE_AUTH_MAIL", Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, "restore_auth_mail");
    public static final SchemeStatSak$EventScreen RESTORE_EMAIL_MAIL = new SchemeStatSak$EventScreen("RESTORE_EMAIL_MAIL", 211, "restore_email_mail");
    public static final SchemeStatSak$EventScreen SWITCH_VKID_MODAL_WINDOW = new SchemeStatSak$EventScreen("SWITCH_VKID_MODAL_WINDOW", Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, "switch_vkid_modal_window");
    public static final SchemeStatSak$EventScreen BLOCKED_EMAIL = new SchemeStatSak$EventScreen("BLOCKED_EMAIL", Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, "blocked_email");
    public static final SchemeStatSak$EventScreen OAUTH_TO_GRAY_VKID_BIND = new SchemeStatSak$EventScreen("OAUTH_TO_GRAY_VKID_BIND", Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, "oauth_to_gray_vkid_bind");
    public static final SchemeStatSak$EventScreen GRAY_VKID_TO_OAUTH_BIND = new SchemeStatSak$EventScreen("GRAY_VKID_TO_OAUTH_BIND", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, "gray_vkid_to_oauth_bind");
    public static final SchemeStatSak$EventScreen DOUBTFUL_AUTH = new SchemeStatSak$EventScreen("DOUBTFUL_AUTH", Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, "doubtful_auth");
    public static final SchemeStatSak$EventScreen CONFIRM_ACTUAL_PHONE_BY_USER = new SchemeStatSak$EventScreen("CONFIRM_ACTUAL_PHONE_BY_USER", Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, "confirm_actual_phone_by_user");
    public static final SchemeStatSak$EventScreen CONFIRM_ACTUAL_EMAIL_BY_USER = new SchemeStatSak$EventScreen("CONFIRM_ACTUAL_EMAIL_BY_USER", Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, "confirm_actual_email_by_user");
    public static final SchemeStatSak$EventScreen ADD_EMAIL_BY_USER = new SchemeStatSak$EventScreen("ADD_EMAIL_BY_USER", Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, "add_email_by_user");
    public static final SchemeStatSak$EventScreen START_MAIL = new SchemeStatSak$EventScreen("START_MAIL", Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, "start_mail");
    public static final SchemeStatSak$EventScreen SILENT_AUTH_MAIL = new SchemeStatSak$EventScreen("SILENT_AUTH_MAIL", Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, "silent_auth_mail");
    public static final SchemeStatSak$EventScreen CONTINUE_AUTH_CHOICE_BAR = new SchemeStatSak$EventScreen("CONTINUE_AUTH_CHOICE_BAR", Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, "continue_auth_choice_bar");
    public static final SchemeStatSak$EventScreen EMAIL_CHOICE_BAR = new SchemeStatSak$EventScreen("EMAIL_CHOICE_BAR", Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, "email_choice_bar");
    public static final SchemeStatSak$EventScreen PASSWORDLESS_AUTH_CHOICE = new SchemeStatSak$EventScreen("PASSWORDLESS_AUTH_CHOICE", 224, "passwordless_auth_choice");
    public static final SchemeStatSak$EventScreen PASSWORDLESS_AUTH_PROMO = new SchemeStatSak$EventScreen("PASSWORDLESS_AUTH_PROMO", Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, "passwordless_auth_promo");
    public static final SchemeStatSak$EventScreen GRAY_LINK_MAIL_PASSWORD = new SchemeStatSak$EventScreen("GRAY_LINK_MAIL_PASSWORD", Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, "gray_link_mail_password");
    public static final SchemeStatSak$EventScreen SMS_INBOX_ERROR = new SchemeStatSak$EventScreen("SMS_INBOX_ERROR", Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, "sms_inbox_error");
    public static final SchemeStatSak$EventScreen SMS_INBOX_CHECKING = new SchemeStatSak$EventScreen("SMS_INBOX_CHECKING", 228, "sms_inbox_checking");
    public static final SchemeStatSak$EventScreen QR_CODE_DISPLAY_CODE = new SchemeStatSak$EventScreen("QR_CODE_DISPLAY_CODE", 229, "qr_code_display_code");
    public static final SchemeStatSak$EventScreen QR_CODE_DEVICE_INFO = new SchemeStatSak$EventScreen("QR_CODE_DEVICE_INFO", 230, "qr_code_device_info");
    public static final SchemeStatSak$EventScreen VKID_FAQ = new SchemeStatSak$EventScreen("VKID_FAQ", 231, "vkid_faq");
    public static final SchemeStatSak$EventScreen DEVICE_CODE_INPUT = new SchemeStatSak$EventScreen("DEVICE_CODE_INPUT", 232, "device_code_input");
    public static final SchemeStatSak$EventScreen DEVICE_CODE_ASK_CONFIRM = new SchemeStatSak$EventScreen("DEVICE_CODE_ASK_CONFIRM", 233, "device_code_ask_confirm");
    public static final SchemeStatSak$EventScreen DEVICE_CODE_DISPLAY = new SchemeStatSak$EventScreen("DEVICE_CODE_DISPLAY", 234, "device_code_display");

    /* compiled from: SchemeStatSak.kt */
    public static final class Serializer implements uay<SchemeStatSak$EventScreen> {
        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            return new hay(((SchemeStatSak$EventScreen) obj).value);
        }
    }

    static {
        SchemeStatSak$EventScreen[] h = h();
        $VALUES = h;
        $ENTRIES = new asp(h);
    }

    public SchemeStatSak$EventScreen(String str, int i, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ SchemeStatSak$EventScreen[] h() {
        return new SchemeStatSak$EventScreen[]{ACCOUNT_CONFIRM_PASSWORD, ACCOUNT_CONFIRM_VERIFY, AUTH_QR_CODE, BANNED_ACCOUNT, CAPTCHA, CONTACTS_APPS_ADD_PHONE, CONTACTS_APPS_ADD_EMAIL, CONTACTS_APPS_ADD_ADDRESS, CONTACTS_APPS_EDIT_PHONE, CONTACTS_APPS_EDIT_EMAIL, CONTACTS_APPS_EDIT_ADDRESS, CONSENT_SCREEN, NOWHERE_DIALOG, FAST_SILENT_AUTH_EXISTING_ACCOUNT, FAST_SILENT_AUTH_AS_USER, FAST_SILENT_AUTH_DOWNLOAD, FAST_SILENT_AUTH_SUCCESS, FAST_SILENT_AUTH_ERROR, GAME, MINI_APP, NOWHERE, PASSPORT_RESTORE, REGISTRATION_PHONE, PROMO_MAX, REGISTRATION_PERMISSION, REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD_OK, REGISTRATION_EXISTENT_ACCOUNT_PASSWORDLESS, REGISTRATION_CONNECT_GMAIL, REGISTRATION_PHONE_VERIFY, REGISTRATION_PHONE_VERIFY_LIB, REGISTRATION_NAME, REGISTRATION_NAME_ADD, REGISTRATION_INFO_ABOUT_YOURSELF, REGISTRATION_INFO_ABOUT_YOURSELF_ADD, REGISTRATION_EXISTENT_ACCOUNT, REGISTRATION_EXISTENT_ACCOUNT_NO_PASSWORD, REGISTRATION_BDAY, REGISTRATION_BDAY_ADD, REGISTRATION_PASSWORD, REGISTRATION_PASSWORD_ADD, REGISTRATION_IMPORT_CONTACTS, REGISTRATION_CONNECT_FACEBOOK, REGISTRATION_CONNECT_OK, REGISTRATION_CONNECT_TWITTER, REGISTRATION_PHOTO, REGISTRATION_CHOOSE_PHOTO, REGISTRATION_TAKE_PHOTO, REGISTRATION_STYLE_PHOTO, REGISTRATION_CROP_PHOTO, REGISTRATION_LIST_ADDRESS_BOOK, REGISTRATION_LIST_FRIENDS_FACEBOOK, REGISTRATION_LIST_FRIENDS_OK, REGISTRATION_LIST_FRIENDS_TWITTER, REGISTRATION_LIST_CONTACTS_GMAIL, REGISTRATION_PUSH, REGISTRATION_GEO, REGISTRATION_PUSH_REQUEST, REGISTRATION_SUBJECTS, REGISTRATION_EMAIL_VERIFY, REGISTRATION_EMAIL_PASSWORD, REGISTRATION_EMAIL, REGISTRATION_EMAIL_EXPLANATION, REGISTRATION_NEW_ACCOUNT, REGISTRATION_EXISTENT_ACCOUNT_RESTORE, LK_PASSWORD, RESTORE_ACCOUNT, HAVE_ACCOUNT_QUESTION, HAVE_ACCOUNT_CREDENTIALS, HAVE_ACCOUNT_SUPPORT, CONTACTING_SUPPORT, VERIFICATION_ASK_NUMBER, VERIFICATION_ENTER_NUMBER, VERIFICATION_PHONE_VERIFY, VERIFICATION_BUSY_NUMBER, VERIFICATION_LOADING, VK_MAIL_CREATE, PHONE_2FA_VERIFY, PHONE_2FA_VERIFY_SMS, PHONE_2FA_VERIFY_APP, PHONE_2FA_VERIFY_CALL, PHONE_2FA_VERIFY_LIB, PARTIAL_EXPAND_ENTER_PASSWORD, PARTIAL_EXPAND_HAVE_ACCOUNT, PARTIAL_SILENT_EXPAND_PASSWORD, OAUTH_EXISTING_ACCOUNT, OAUTH_REGISTRATION_PHONE, OAUTH_APPLE, OAUTH_MAIL, OAUTH_OK, OAUTH_SBER, OAUTH_ESIA, OTHER, START, START_PROCEED_AS, START_PROCEED_AS_MASTER_ACCOUNT, START_WITH_PHONE, SUGGEST_VK_ID_VALUE, SILENT_AUTH, SILENT_AUTH_LOADING, SILENT_AUTH_EXISTING_ACCOUNT, SILENT_AUTH_PROVIDED_PHONE, SILENT_AUTH_MIGRATION, SILENT_AUTH_EMAIL, VERIFICATION_AUTHENTICATOR_CODE, VKC_ACCOUNT_LINK_LOADING, VKC_ACCOUNT_NOT_FOUND, VKC_ACCOUNT_FOUND, VKC_ACCOUNT_ALREADY_LINKED, VKC_ACCOUNT_LINK_TOKEN_ERROR, VKC_ACCOUNT_LINK_PASSWORD, VKC_ACCOINT_MANY_CHOICES, VKC_DATA_PERMISSION, AUTH_PASSWORD, AUTH_START_LOADING, VKID_USER_CONFIRMATION, VERIFICATION_CALL_CODE, CONSENT_SCREEN_AGREEMENT, QR_CODE_ASK_CONFIRM, QR_CODE_MAP, ALERT_QR_CODE_IRRELEVANT, ALERT_AUTH_UNKNOWN_ERROR, ALERT_AUTH_NETWORK_ERROR, ALERT_AUTH_FLOOD_CONTROL_ERROR, VK_PAY_CHECKOUT, ENTRY_ASK_CONFIRM, ENTRY_MAP, ALERT_AUTH_SUCCESS, UXPOLL_MODAL, PROCEED_AS_WITH_SUBPROFILE, MULTI_ACC_ADD_ACCOUNT, MULTI_ACC_SWITCHER, MULTIACC_SELECTOR, ONBOARDING_MULTIACCOUNT, ONBOARDING_LONGTAP_MULTIACCOUNT, ALERT_AUTH_PHONE, OAUTH_YANDEX, ONBOARDING_ESIA, ERROR_CONNECTION_TO_ESIA, CONNECT_ACCOUNTS_VKID_ESIA_START, ESIA_LINKED_TO_ANOTHER_VKID, ESIA_NOT_VERIFIED, REQUEST_SYNCHRONIZE_DATA_VKID_ESIA, CONNECT_ACCOUNTS_VKID_ESIA_SUCCESS, ESIA_AUTH_ACTIVATED_SUCCESS, PHONE_CHANGE_ACCOUNT, EXTERNAL_INVALID_PROFILE, ALERT_UNLINK_PHONE_NUMBER, ALERT_PHONE_SUCCESS_VERIFICATION, ALERT_SUCCESS_UNLINK_PHONE_NUMBER, PROFILE, ESIA_TRUSTED_PROFILE, CELEBRITY_PROFILE, CELEBRITY_VERIFICATION_FAQ, ESIA_FAQ, OAUTH_TINKOFF, ONBOARDING_VERIFICATION, VERIFICATION_ERROR_CONNECTION, CONNECT_ACCOUNTS_VKID_OAUTH_START, OAUTH_LINKED_TO_ANOTHER_VKID, OAUTH_NOT_VERIFIED, REQUEST_SYNCHRONIZE_DATA_VKID_OAUTH, OAUTH_ACTIVATED_SUCCESS, PASSWORD_CUA, SMS_PROCESS_CUA, CALLRESET_PROCESS_CUA, VERIFICATIONS, CONNECT_ACCOUNTS_VKID_OAUTH_SUCCESS, VERIFICATION_PASSKEY, CONFIRM_AUTH_FAILED, EXTENDED_RESTORE, ALERT_KEYS_NOT_SUPPORTED, SETTINGS_LOGOUT, SETTINGS, OAUTH_GOOGLE, REGISTRATION_USECASE, REGISTRATION_IS_FIRST_ACCOUNT, ONBOARDING_USECASE, MEET_PASSKEY, CONNECT_PASSKEY, CONNECTED_KEYS, REGISTRATION_SERVICE_USER_ADD, PRIMARY_FACTOR_CHOICE, LINK_AVAILABLE_MAIL, SERVICE_MENU, ALERT_USER_BLOCKED, ALERT_USER_DELETED, ALERT_TRY_AGAIN, OAUTH_ALFA, EMAIL_VERIFICATION, MAIL_LINKED_ANOTHER_ACCOUNT, ECOSYSTEM_NAVIGATION, ECOSYSTEM_NAVIGATION_PROFILE, ECOSYSTEM_NAVIGATION_ACCOUNT_VIEW, UNBLOCK_PROTECT_ACCOUNT, CALLRESET_WARNING, START_VKME, MOBILE_QR_AUTH_CODE_GUIDE, MOBILE_QR_ALERT_AUTH_ERROR, QR_SCANNER, QR_CODE_CONFIRM_WAITING, ALERT_ACCOUNTS_LIMIT_REACHED, MOBILE_QR_ALERT_INCORRECT_QR_SCANNED, PINCODE_VALIDATION_ENTER, PINCODE_TOO_MANY_ATTEMPTS_ALERT, PINCODE_CHANGE_NEW_PINCODE, VKME_ADD_ACCOUNT, AUTHORIZATION_PHONE, PROMO_ONEPASS, ONBOARDING_RELATED, AUTH_MOBILE_QR_CODE_APP, RESTORE_AUTH_MAIL, RESTORE_EMAIL_MAIL, SWITCH_VKID_MODAL_WINDOW, BLOCKED_EMAIL, OAUTH_TO_GRAY_VKID_BIND, GRAY_VKID_TO_OAUTH_BIND, DOUBTFUL_AUTH, CONFIRM_ACTUAL_PHONE_BY_USER, CONFIRM_ACTUAL_EMAIL_BY_USER, ADD_EMAIL_BY_USER, START_MAIL, SILENT_AUTH_MAIL, CONTINUE_AUTH_CHOICE_BAR, EMAIL_CHOICE_BAR, PASSWORDLESS_AUTH_CHOICE, PASSWORDLESS_AUTH_PROMO, GRAY_LINK_MAIL_PASSWORD, SMS_INBOX_ERROR, SMS_INBOX_CHECKING, QR_CODE_DISPLAY_CODE, QR_CODE_DEVICE_INFO, VKID_FAQ, DEVICE_CODE_INPUT, DEVICE_CODE_ASK_CONFIRM, DEVICE_CODE_DISPLAY};
    }

    public static zrp<SchemeStatSak$EventScreen> j() {
        return $ENTRIES;
    }

    public static SchemeStatSak$EventScreen valueOf(String str) {
        return (SchemeStatSak$EventScreen) Enum.valueOf(SchemeStatSak$EventScreen.class, str);
    }

    public static SchemeStatSak$EventScreen[] values() {
        return (SchemeStatSak$EventScreen[]) $VALUES.clone();
    }
}
