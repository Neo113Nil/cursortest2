package com.vk.toggle.anonymous;

import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.observable.z0;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import xsna.asp;
import xsna.bvq;
import xsna.c5g;
import xsna.ozl;
import xsna.zrp;

/* compiled from: SakFeatures.kt */
/* loaded from: classes11.dex */
public final class SakFeatures implements bvq {
    public static final a b = new a();
    public static volatile ToggleManager c;
    public static final d<ToggleManager.Sync> d;
    public final ArrayList a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SakFeatures.kt */
    public static final class Type implements b.a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type AUDIO_VIDEO_CARD_TRACK_NOTE;
        public static final Type AUDIO_VIDEO_RELATED_TRACKS;
        public static final Type AUDIO_VIDEO_TRACK_ADD;
        public static final Type CORE_CONTENT_INFO_BOTTOM_SHEET;
        public static final Type CORE_DURING_UPDATE_TOGGLES;
        public static final Type CORE_REMOVE_EXTRA_STICKERS_UPDATE;
        public static final Type CORE_SWITCH_VK_RU_DOMAIN_ANON;
        public static final Type FEATURE_CHOOSE_HOST;
        public static final Type FEATURE_CORE_COMPANION_DEVICE_ID;
        public static final Type FEATURE_CORE_STAT_FLUSH_ON_CLEAR;
        public static final Type FEATURE_IM_FIX_FOLDER_NOT_FOUND;
        public static final Type FEATURE_NETWORK_REPORT_CONFIG;
        public static final Type FEATURE_NFT_AVATAR_ANONYM_BETA;
        public static final Type FEATURE_NFT_AVATAR_ANONYM_DEBUG;
        public static final Type FEATURE_NFT_AVATAR_ANONYM_RELEASE;
        public static final Type FEATURE_SIGN_ANONYMOUS_TOKEN;
        public static final Type FEATURE_STRONG_PASSWORD;
        public static final Type FEATURE_TEST_ANONYMOUS_TOGGLE;
        public static final Type FEATURE_TINKOFF_APP_TO_APP_TOGGLE;
        public static final Type FEATURE_VKC_AVAILABLE_OAUTH_LIST;
        public static final Type FEATURE_VKC_LIBVERIFY_CALLIN_AUTH;
        public static final Type FEATURE_VKC_LIBVERIFY_CALLIN_REG;
        public static final Type FEATURE_VKC_SMARTFLOW_METHODS_CACHE;
        public static final Type FEATURE_VKM_MULTI_ACCOUNT;
        public static final Type FEATURE_VKM_MULTI_ACCOUNT_BETA;
        public static final Type FEATURE_VKM_SESSION_MANAGEMENT;
        public static final Type GET_USER_INFO_CUT_OFF_FROM_AUTH;
        public static final Type INVITE_LINKS;
        public static final Type LOGOUT_DEBOUNCE;
        public static final Type NEW_GEOBLOCK_ERROR;
        public static final Type SAK_COROUTINES_MIGRATION;
        public static final Type SAK_DEF_CLIENT_INSTALL_ANDROID;
        public static final Type SAK_EMAIL_ACTUALIZATION;
        public static final Type SAK_EXTEND_NETWORK_CHECK_TIMEOUT_ANDROID;
        public static final Type SAK_HANDLE_BAN_REASON;
        public static final Type SAK_HELP_BUTTON_ANDROID;
        public static final Type SAK_LIBVERIFY_AB_SUFFIX;
        public static final Type SAK_MAIL_PROMO_MAX;
        public static final Type SAK_MAX_AUTH_CACHE_ANDROID;
        public static final Type SAK_MAX_AUTH_TIMER_ANDROID;
        public static final Type SAK_MESSENGER_SKIP_SMS_ANDROID;
        public static final Type SAK_MIGRATION_ACCOUNT_GET_INFO;

        @ozl
        public static final Type SAK_MIGRATION_GET_PROFILE_SHORT_INFO;
        public static final Type SAK_MIGRATION_USERS_GET_TO_ACC_GET;
        public static final Type SAK_MIGRATION_USERS_GET_TO_ACC_GET_4;
        public static final Type SAK_PASSWORD_AUTO_COMPLETE_ANDROID;
        public static final Type SAK_QR_WITH_CODE;
        public static final Type SAK_SBER_ID_CLOUD;
        public static final Type SAK_SEAMLESS_FLOW;
        public static final Type SA_INIT_DATING_TRACER;
        public static final Type SA_SHOW_PERMISSION_ON_START;
        public static final Type SA_SPINOFF_ONBOARDING_DISABLED;
        public static final Type USERS_STORE_ONLY_CACHE;
        public static final Type VIDEO_FB_INIT_TYPE;
        public static final Type VIDEO_FIX_MINIPLAYER_HEADSET;
        public static final Type VKC_AUTH_COMMON_REFACTOR;
        public static final Type VKC_BACKUP_SENDING;
        public static final Type VKC_CREATE_ACCOUNT;
        public static final Type VKC_HITMAN_CAPTCHA_ANDROID;
        public static final Type VKC_LIBVERIFY_CONF_CHANGE;
        public static final Type VKC_LIBVERIFY_FACTORS_KZ;
        public static final Type VKC_LIBVERIFY_SESSION;
        public static final Type VKC_ONEPASS_PROMO;
        public static final Type VKC_PHONE_HINT_IM;
        public static final Type VKC_PHONE_HINT_INNER;
        public static final Type VKC_PHONE_REUSE_AUTH;
        public static final Type VKC_RESTORE_TO_VK_ID_HOST;
        public static final Type VKC_SDK_SESSION_MANAGEMENT;
        public static final Type VKC_SMARTFLOW_INTERNAL_ANDROID;
        public static final Type VKC_SMARTFLOW_MAIL_ANDROID;
        public static final Type VKC_SMARTFLOW_OK_ANDROID;
        public static final Type VKC_TRACER_PERF_SDK_START;
        public static final Type VKM_MULTIACCOUNT_LIMIT_SCREEN;
        public static final Type VOIP_JOIN_TO_CALL_BY_PASSWORD_ANON;
        private final String key;

        static {
            Type type = new Type("FEATURE_STRONG_PASSWORD", 0, "vkc_strong_password_android");
            FEATURE_STRONG_PASSWORD = type;
            Type type2 = new Type("FEATURE_SIGN_ANONYMOUS_TOKEN", 1, "sak_sign_anonymous_token");
            FEATURE_SIGN_ANONYMOUS_TOKEN = type2;
            Type type3 = new Type("FEATURE_TEST_ANONYMOUS_TOGGLE", 2, "vkc_test_anonymous_toggle");
            FEATURE_TEST_ANONYMOUS_TOGGLE = type3;
            Type type4 = new Type("FEATURE_TINKOFF_APP_TO_APP_TOGGLE", 3, "vkc_tinkoff_app_to_app_android");
            FEATURE_TINKOFF_APP_TO_APP_TOGGLE = type4;
            Type type5 = new Type("FEATURE_CHOOSE_HOST", 4, "sak_vk_ru_v2_android");
            FEATURE_CHOOSE_HOST = type5;
            Type type6 = new Type("FEATURE_VKC_SMARTFLOW_METHODS_CACHE", 5, "vkc_smartflow_methods_cache");
            FEATURE_VKC_SMARTFLOW_METHODS_CACHE = type6;
            Type type7 = new Type("GET_USER_INFO_CUT_OFF_FROM_AUTH", 6, "vkc_get_user_info_cut_off");
            GET_USER_INFO_CUT_OFF_FROM_AUTH = type7;
            Type type8 = new Type("FEATURE_VKC_LIBVERIFY_CALLIN_AUTH", 7, "vkc_callin_auth_android");
            FEATURE_VKC_LIBVERIFY_CALLIN_AUTH = type8;
            Type type9 = new Type("FEATURE_VKC_LIBVERIFY_CALLIN_REG", 8, "vkc_callin_reg_android");
            FEATURE_VKC_LIBVERIFY_CALLIN_REG = type9;
            Type type10 = new Type("FEATURE_VKC_AVAILABLE_OAUTH_LIST", 9, "vkc_available_oauth_list");
            FEATURE_VKC_AVAILABLE_OAUTH_LIST = type10;
            Type type11 = new Type("FEATURE_NFT_AVATAR_ANONYM_DEBUG", 10, "nft_avatar_anonym_debug");
            FEATURE_NFT_AVATAR_ANONYM_DEBUG = type11;
            Type type12 = new Type("FEATURE_NFT_AVATAR_ANONYM_BETA", 11, "nft_avatar_anonym_beta");
            FEATURE_NFT_AVATAR_ANONYM_BETA = type12;
            Type type13 = new Type("FEATURE_NFT_AVATAR_ANONYM_RELEASE", 12, "nft_avatar_anonym_release");
            FEATURE_NFT_AVATAR_ANONYM_RELEASE = type13;
            Type type14 = new Type("FEATURE_IM_FIX_FOLDER_NOT_FOUND", 13, "vkm_fix_folder_not_found");
            FEATURE_IM_FIX_FOLDER_NOT_FOUND = type14;
            Type type15 = new Type("FEATURE_CORE_COMPANION_DEVICE_ID", 14, "core_companion_device_id");
            FEATURE_CORE_COMPANION_DEVICE_ID = type15;
            Type type16 = new Type("FEATURE_CORE_STAT_FLUSH_ON_CLEAR", 15, "core_stat_flush_on_clear");
            FEATURE_CORE_STAT_FLUSH_ON_CLEAR = type16;
            Type type17 = new Type("INVITE_LINKS", 16, "vkc_noob_invite_links");
            INVITE_LINKS = type17;
            Type type18 = new Type("LOGOUT_DEBOUNCE", 17, "vkc_logout_debounce");
            LOGOUT_DEBOUNCE = type18;
            Type type19 = new Type("FEATURE_VKM_SESSION_MANAGEMENT", 18, "vkm_session_management");
            FEATURE_VKM_SESSION_MANAGEMENT = type19;
            Type type20 = new Type("FEATURE_VKM_MULTI_ACCOUNT", 19, "vkm_multi_account");
            FEATURE_VKM_MULTI_ACCOUNT = type20;
            Type type21 = new Type("FEATURE_VKM_MULTI_ACCOUNT_BETA", 20, "vkm_multi_account_beta");
            FEATURE_VKM_MULTI_ACCOUNT_BETA = type21;
            Type type22 = new Type("VKM_MULTIACCOUNT_LIMIT_SCREEN", 21, "vkm_multiaccount_limit_screen");
            VKM_MULTIACCOUNT_LIMIT_SCREEN = type22;
            Type type23 = new Type("VKC_CREATE_ACCOUNT", 22, "vkc_create_account_android");
            VKC_CREATE_ACCOUNT = type23;
            Type type24 = new Type("VKC_BACKUP_SENDING", 23, "vkc_backup_sending");
            VKC_BACKUP_SENDING = type24;
            Type type25 = new Type("VKC_LIBVERIFY_SESSION", 24, "vkc_libverify_session");
            VKC_LIBVERIFY_SESSION = type25;
            Type type26 = new Type("VKC_SMARTFLOW_INTERNAL_ANDROID", 25, "vkc_smartflow_internal_android");
            VKC_SMARTFLOW_INTERNAL_ANDROID = type26;
            Type type27 = new Type("VKC_SMARTFLOW_OK_ANDROID", 26, "vkc_smartflow_ok_android");
            VKC_SMARTFLOW_OK_ANDROID = type27;
            Type type28 = new Type("VKC_LIBVERIFY_FACTORS_KZ", 27, "vkc_libverify_factors_kz");
            VKC_LIBVERIFY_FACTORS_KZ = type28;
            Type type29 = new Type("VKC_PHONE_HINT_IM", 28, "vkc_phone_hint_im");
            VKC_PHONE_HINT_IM = type29;
            Type type30 = new Type("VKC_PHONE_HINT_INNER", 29, "vkc_phone_hint_inner");
            VKC_PHONE_HINT_INNER = type30;
            Type type31 = new Type("VKC_SDK_SESSION_MANAGEMENT", 30, "vkc_sdk_session_management");
            VKC_SDK_SESSION_MANAGEMENT = type31;
            Type type32 = new Type("VKC_LIBVERIFY_CONF_CHANGE", 31, "vkc_libverify_conf_change");
            VKC_LIBVERIFY_CONF_CHANGE = type32;
            Type type33 = new Type("VKC_SMARTFLOW_MAIL_ANDROID", 32, "vkc_smartflow_mail_android");
            VKC_SMARTFLOW_MAIL_ANDROID = type33;
            Type type34 = new Type("VKC_TRACER_PERF_SDK_START", 33, "vkc_tracer_perf_sdk_start");
            VKC_TRACER_PERF_SDK_START = type34;
            Type type35 = new Type("USERS_STORE_ONLY_CACHE", 34, "vkc_usersstore_only_cache_anon");
            USERS_STORE_ONLY_CACHE = type35;
            Type type36 = new Type("VOIP_JOIN_TO_CALL_BY_PASSWORD_ANON", 35, "voip_join_by_password_anon");
            VOIP_JOIN_TO_CALL_BY_PASSWORD_ANON = type36;
            Type type37 = new Type("VKC_HITMAN_CAPTCHA_ANDROID", 36, "vkc_hitman_captcha_android");
            VKC_HITMAN_CAPTCHA_ANDROID = type37;
            Type type38 = new Type("VKC_AUTH_COMMON_REFACTOR", 37, "vkc_auth_common_refactor");
            VKC_AUTH_COMMON_REFACTOR = type38;
            Type type39 = new Type("VKC_PHONE_REUSE_AUTH", 38, "vkc_phonereuse_auth_android");
            VKC_PHONE_REUSE_AUTH = type39;
            Type type40 = new Type("FEATURE_NETWORK_REPORT_CONFIG", 39, "video_network_report_config");
            FEATURE_NETWORK_REPORT_CONFIG = type40;
            Type type41 = new Type("NEW_GEOBLOCK_ERROR", 40, "core_new_geoblock_error");
            NEW_GEOBLOCK_ERROR = type41;
            Type type42 = new Type("VIDEO_FIX_MINIPLAYER_HEADSET", 41, "video_fix_miniplayer_headset");
            VIDEO_FIX_MINIPLAYER_HEADSET = type42;
            Type type43 = new Type("VIDEO_FB_INIT_TYPE", 42, "video_firebase_init_type");
            VIDEO_FB_INIT_TYPE = type43;
            Type type44 = new Type("VKC_RESTORE_TO_VK_ID_HOST", 43, "vkc_restore_to_vk_id_host");
            VKC_RESTORE_TO_VK_ID_HOST = type44;
            Type type45 = new Type("SAK_SEAMLESS_FLOW", 44, "sak_seamless_flow");
            SAK_SEAMLESS_FLOW = type45;
            Type type46 = new Type("AUDIO_VIDEO_TRACK_ADD", 45, "audio_video_track_add");
            AUDIO_VIDEO_TRACK_ADD = type46;
            Type type47 = new Type("AUDIO_VIDEO_RELATED_TRACKS", 46, "audio_video_related_tracks");
            AUDIO_VIDEO_RELATED_TRACKS = type47;
            Type type48 = new Type("AUDIO_VIDEO_CARD_TRACK_NOTE", 47, "audio_video_card_track_note");
            AUDIO_VIDEO_CARD_TRACK_NOTE = type48;
            Type type49 = new Type("SAK_PASSWORD_AUTO_COMPLETE_ANDROID", 48, "sak_pass_autocompete_android");
            SAK_PASSWORD_AUTO_COMPLETE_ANDROID = type49;
            Type type50 = new Type("VKC_ONEPASS_PROMO", 49, "vkc_onepass_promo_android");
            VKC_ONEPASS_PROMO = type50;
            Type type51 = new Type("CORE_DURING_UPDATE_TOGGLES", 50, "core_during_update_toggles");
            CORE_DURING_UPDATE_TOGGLES = type51;
            Type type52 = new Type("CORE_SWITCH_VK_RU_DOMAIN_ANON", 51, "core_switch_vk_ru_domain_anon");
            CORE_SWITCH_VK_RU_DOMAIN_ANON = type52;
            Type type53 = new Type("SAK_COROUTINES_MIGRATION", 52, "sak_coroutines_migration");
            SAK_COROUTINES_MIGRATION = type53;
            Type type54 = new Type("SAK_MAIL_PROMO_MAX", 53, "sak_mail_promo_max_android");
            SAK_MAIL_PROMO_MAX = type54;
            Type type55 = new Type("SAK_SBER_ID_CLOUD", 54, "sak_sber_id_cloud");
            SAK_SBER_ID_CLOUD = type55;
            Type type56 = new Type("SAK_MAX_AUTH_TIMER_ANDROID", 55, "sak_max_auth_timer_android");
            SAK_MAX_AUTH_TIMER_ANDROID = type56;
            Type type57 = new Type("SAK_MAX_AUTH_CACHE_ANDROID", 56, "sak_max_auth_cache_android");
            SAK_MAX_AUTH_CACHE_ANDROID = type57;
            Type type58 = new Type("SAK_LIBVERIFY_AB_SUFFIX", 57, "sak_libverify_ab_suffix");
            SAK_LIBVERIFY_AB_SUFFIX = type58;
            Type type59 = new Type("CORE_CONTENT_INFO_BOTTOM_SHEET", 58, "core_content_info_bottom_sheet");
            CORE_CONTENT_INFO_BOTTOM_SHEET = type59;
            Type type60 = new Type("SAK_HANDLE_BAN_REASON", 59, "sak_handle_ban_reason");
            SAK_HANDLE_BAN_REASON = type60;
            Type type61 = new Type("SAK_MIGRATION_GET_PROFILE_SHORT_INFO", 60, "sak_migr_accountget_android_1");
            SAK_MIGRATION_GET_PROFILE_SHORT_INFO = type61;
            Type type62 = new Type("SAK_MIGRATION_ACCOUNT_GET_INFO", 61, "sak_migr_accountget_android_2");
            SAK_MIGRATION_ACCOUNT_GET_INFO = type62;
            Type type63 = new Type("SAK_MESSENGER_SKIP_SMS_ANDROID", 62, "sak_messenger_skip_sms_android");
            SAK_MESSENGER_SKIP_SMS_ANDROID = type63;
            Type type64 = new Type("SAK_MIGRATION_USERS_GET_TO_ACC_GET", 63, "sak_migr_users_get_android_1");
            SAK_MIGRATION_USERS_GET_TO_ACC_GET = type64;
            Type type65 = new Type("SAK_MIGRATION_USERS_GET_TO_ACC_GET_4", 64, "sak_migr_users_get_android_4");
            SAK_MIGRATION_USERS_GET_TO_ACC_GET_4 = type65;
            Type type66 = new Type("SAK_QR_WITH_CODE", 65, "sak_qr_with_code");
            SAK_QR_WITH_CODE = type66;
            Type type67 = new Type("SAK_EXTEND_NETWORK_CHECK_TIMEOUT_ANDROID", 66, "sak_extend_netcheck_delay_andr");
            SAK_EXTEND_NETWORK_CHECK_TIMEOUT_ANDROID = type67;
            Type type68 = new Type("SAK_DEF_CLIENT_INSTALL_ANDROID", 67, "sak_def_client_install_android");
            SAK_DEF_CLIENT_INSTALL_ANDROID = type68;
            Type type69 = new Type("SAK_HELP_BUTTON_ANDROID", 68, "sak_help_button_android");
            SAK_HELP_BUTTON_ANDROID = type69;
            Type type70 = new Type("SA_INIT_DATING_TRACER", 69, "sa_init_dating_tracer");
            SA_INIT_DATING_TRACER = type70;
            Type type71 = new Type("SA_SHOW_PERMISSION_ON_START", 70, "sa_show_permission_on_start");
            SA_SHOW_PERMISSION_ON_START = type71;
            Type type72 = new Type("SA_SPINOFF_ONBOARDING_DISABLED", 71, "sa_spinoff_onboarding_disabled");
            SA_SPINOFF_ONBOARDING_DISABLED = type72;
            Type type73 = new Type("SAK_EMAIL_ACTUALIZATION", 72, "sak_email_actualization");
            SAK_EMAIL_ACTUALIZATION = type73;
            Type type74 = new Type("CORE_REMOVE_EXTRA_STICKERS_UPDATE", 73, "core_remove_extra_stickers_req");
            CORE_REMOVE_EXTRA_STICKERS_UPDATE = type74;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35, type36, type37, type38, type39, type40, type41, type42, type43, type44, type45, type46, type47, type48, type49, type50, type51, type52, type53, type54, type55, type56, type57, type58, type59, type60, type61, type62, type63, type64, type65, type66, type67, type68, type69, type70, type71, type72, type73, type74};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type(String str, int i, String str2) {
            this.key = str2;
        }

        public static zrp<Type> i() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @Override // com.vk.toggle.b.a
        public final String getKey() {
            return this.key;
        }

        @Override // com.vk.toggle.b.a
        public final boolean h() {
            Object failure;
            try {
                SakFeatures.b.getClass();
                failure = Boolean.valueOf(SakFeatures.c.a(this));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object obj = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            return ((Boolean) failure).booleanValue();
        }
    }

    /* compiled from: SakFeatures.kt */
    public static final class a {
    }

    static {
        d<ToggleManager.Sync> O0 = d.O0(ToggleManager.Sync.NotSynced);
        d = O0;
        new y(new z0(O0), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }

    public SakFeatures(ToggleManager toggleManager) {
        c = toggleManager;
        d.onNext(ToggleManager.Sync.Done);
        zrp<Type> i = Type.i();
        ArrayList arrayList = new ArrayList(c5g.u(i, 10));
        Iterator<E> it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(((Type) it.next()).getKey());
        }
        this.a = arrayList;
    }

    @Override // xsna.bvq
    public final HashMap a() {
        return bvq.a.a(this);
    }

    @Override // xsna.bvq
    public final List<String> getKeys() {
        return this.a;
    }

    @Override // xsna.bvq
    public final ArrayList getSupportedFeatures() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = getKeys().iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList;
    }

    @Override // xsna.bvq
    public final void clear() {
    }
}
