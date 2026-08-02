package com.vk.superapp.navigation.api;

import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import com.vk.superapp.navigation.api.data.AppShareType;
import org.json.JSONObject;
import xsna.asp;
import xsna.cnk;
import xsna.h16;
import xsna.s31;
import xsna.zrp;

/* compiled from: VkBridgeAnalytics.kt */
/* loaded from: classes6.dex */
public interface VkBridgeAnalytics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBridgeAnalytics.kt */
    public static final class BannerAdEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BannerAdEvent[] $VALUES;
        public static final BannerAdEvent HIDE_BY_BRIDGE;
        public static final BannerAdEvent HIDE_BY_USER;
        public static final BannerAdEvent SHOW_AUTO_UPDATE;
        public static final BannerAdEvent SHOW_BY_BRIDGE;
        public static final BannerAdEvent TAPPED_BY_USER;

        static {
            BannerAdEvent bannerAdEvent = new BannerAdEvent("HIDE_BY_USER", 0);
            HIDE_BY_USER = bannerAdEvent;
            BannerAdEvent bannerAdEvent2 = new BannerAdEvent("HIDE_BY_BRIDGE", 1);
            HIDE_BY_BRIDGE = bannerAdEvent2;
            BannerAdEvent bannerAdEvent3 = new BannerAdEvent("SHOW_BY_BRIDGE", 2);
            SHOW_BY_BRIDGE = bannerAdEvent3;
            BannerAdEvent bannerAdEvent4 = new BannerAdEvent("SHOW_AUTO_UPDATE", 3);
            SHOW_AUTO_UPDATE = bannerAdEvent4;
            BannerAdEvent bannerAdEvent5 = new BannerAdEvent("TAPPED_BY_USER", 4);
            TAPPED_BY_USER = bannerAdEvent5;
            BannerAdEvent[] bannerAdEventArr = {bannerAdEvent, bannerAdEvent2, bannerAdEvent3, bannerAdEvent4, bannerAdEvent5};
            $VALUES = bannerAdEventArr;
            $ENTRIES = new asp(bannerAdEventArr);
        }

        public BannerAdEvent() {
            throw null;
        }

        public static zrp<BannerAdEvent> h() {
            return $ENTRIES;
        }

        public static BannerAdEvent valueOf(String str) {
            return (BannerAdEvent) Enum.valueOf(BannerAdEvent.class, str);
        }

        public static BannerAdEvent[] values() {
            return (BannerAdEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBridgeAnalytics.kt */
    public static final class ExitGameAlertEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ExitGameAlertEvent[] $VALUES;
        public static final ExitGameAlertEvent EXIT_FROM_GAME;
        public static final ExitGameAlertEvent RECOMMENDATION_APP_VIEW;
        public static final ExitGameAlertEvent SHOW_ALERT;
        public static final ExitGameAlertEvent SHOW_GAMES_RECOMMENDATIONS;
        public static final ExitGameAlertEvent STAY_IN_GAME;

        static {
            ExitGameAlertEvent exitGameAlertEvent = new ExitGameAlertEvent("SHOW_ALERT", 0);
            SHOW_ALERT = exitGameAlertEvent;
            ExitGameAlertEvent exitGameAlertEvent2 = new ExitGameAlertEvent("EXIT_FROM_GAME", 1);
            EXIT_FROM_GAME = exitGameAlertEvent2;
            ExitGameAlertEvent exitGameAlertEvent3 = new ExitGameAlertEvent("STAY_IN_GAME", 2);
            STAY_IN_GAME = exitGameAlertEvent3;
            ExitGameAlertEvent exitGameAlertEvent4 = new ExitGameAlertEvent("SHOW_GAMES_RECOMMENDATIONS", 3);
            SHOW_GAMES_RECOMMENDATIONS = exitGameAlertEvent4;
            ExitGameAlertEvent exitGameAlertEvent5 = new ExitGameAlertEvent("RECOMMENDATION_APP_VIEW", 4);
            RECOMMENDATION_APP_VIEW = exitGameAlertEvent5;
            ExitGameAlertEvent[] exitGameAlertEventArr = {exitGameAlertEvent, exitGameAlertEvent2, exitGameAlertEvent3, exitGameAlertEvent4, exitGameAlertEvent5};
            $VALUES = exitGameAlertEventArr;
            $ENTRIES = new asp(exitGameAlertEventArr);
        }

        public ExitGameAlertEvent() {
            throw null;
        }

        public static ExitGameAlertEvent valueOf(String str) {
            return (ExitGameAlertEvent) Enum.valueOf(ExitGameAlertEvent.class, str);
        }

        public static ExitGameAlertEvent[] values() {
            return (ExitGameAlertEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBridgeAnalytics.kt */
    public static final class InstallScreenEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InstallScreenEvent[] $VALUES;
        public static final InstallScreenEvent CLOSE;
        public static final InstallScreenEvent LAUNCH_APP;
        public static final InstallScreenEvent OPEN;

        static {
            InstallScreenEvent installScreenEvent = new InstallScreenEvent("OPEN", 0);
            OPEN = installScreenEvent;
            InstallScreenEvent installScreenEvent2 = new InstallScreenEvent("CLOSE", 1);
            CLOSE = installScreenEvent2;
            InstallScreenEvent installScreenEvent3 = new InstallScreenEvent("LAUNCH_APP", 2);
            LAUNCH_APP = installScreenEvent3;
            InstallScreenEvent[] installScreenEventArr = {installScreenEvent, installScreenEvent2, installScreenEvent3};
            $VALUES = installScreenEventArr;
            $ENTRIES = new asp(installScreenEventArr);
        }

        public InstallScreenEvent() {
            throw null;
        }

        public static InstallScreenEvent valueOf(String str) {
            return (InstallScreenEvent) Enum.valueOf(InstallScreenEvent.class, str);
        }

        public static InstallScreenEvent[] values() {
            return (InstallScreenEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBridgeAnalytics.kt */
    public static final class NativeAdEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NativeAdEventType[] $VALUES;
        public static final NativeAdEventType CLICK_AD;
        public static final NativeAdEventType HIDE_BY_USER;
        public static final NativeAdEventType SHOW_AD;
        public static final NativeAdEventType SHOW_AD_FAILED;

        static {
            NativeAdEventType nativeAdEventType = new NativeAdEventType("SHOW_AD", 0);
            SHOW_AD = nativeAdEventType;
            NativeAdEventType nativeAdEventType2 = new NativeAdEventType("CLICK_AD", 1);
            CLICK_AD = nativeAdEventType2;
            NativeAdEventType nativeAdEventType3 = new NativeAdEventType("HIDE_BY_USER", 2);
            HIDE_BY_USER = nativeAdEventType3;
            NativeAdEventType nativeAdEventType4 = new NativeAdEventType("SHOW_AD_FAILED", 3);
            SHOW_AD_FAILED = nativeAdEventType4;
            NativeAdEventType[] nativeAdEventTypeArr = {nativeAdEventType, nativeAdEventType2, nativeAdEventType3, nativeAdEventType4};
            $VALUES = nativeAdEventTypeArr;
            $ENTRIES = new asp(nativeAdEventTypeArr);
        }

        public NativeAdEventType() {
            throw null;
        }

        public static NativeAdEventType valueOf(String str) {
            return (NativeAdEventType) Enum.valueOf(NativeAdEventType.class, str);
        }

        public static NativeAdEventType[] values() {
            return (NativeAdEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBridgeAnalytics.kt */
    public static final class PersonalDiscountEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PersonalDiscountEvent[] $VALUES;
        public static final PersonalDiscountEvent CLICK_RULES_BUTTON;
        public static final PersonalDiscountEvent HIDE_PROMO_MODAL;
        public static final PersonalDiscountEvent OPEN_SNACK_BAR_PROMO;
        public static final PersonalDiscountEvent OPEN_TAB_MENU_PURCHASE;
        public static final PersonalDiscountEvent OPEN_TAB_MODAL_PURCHASE;
        public static final PersonalDiscountEvent OPEN_TAB_PROFILE_PURCHASE;
        public static final PersonalDiscountEvent VIEW_PROMO_MODAL;

        static {
            PersonalDiscountEvent personalDiscountEvent = new PersonalDiscountEvent("OPEN_SNACK_BAR_PROMO", 0);
            OPEN_SNACK_BAR_PROMO = personalDiscountEvent;
            PersonalDiscountEvent personalDiscountEvent2 = new PersonalDiscountEvent("VIEW_PROMO_MODAL", 1);
            VIEW_PROMO_MODAL = personalDiscountEvent2;
            PersonalDiscountEvent personalDiscountEvent3 = new PersonalDiscountEvent("HIDE_PROMO_MODAL", 2);
            HIDE_PROMO_MODAL = personalDiscountEvent3;
            PersonalDiscountEvent personalDiscountEvent4 = new PersonalDiscountEvent("OPEN_TAB_MODAL_PURCHASE", 3);
            OPEN_TAB_MODAL_PURCHASE = personalDiscountEvent4;
            PersonalDiscountEvent personalDiscountEvent5 = new PersonalDiscountEvent("OPEN_TAB_MENU_PURCHASE", 4);
            OPEN_TAB_MENU_PURCHASE = personalDiscountEvent5;
            PersonalDiscountEvent personalDiscountEvent6 = new PersonalDiscountEvent("OPEN_TAB_PROFILE_PURCHASE", 5);
            OPEN_TAB_PROFILE_PURCHASE = personalDiscountEvent6;
            PersonalDiscountEvent personalDiscountEvent7 = new PersonalDiscountEvent("CLICK_RULES_BUTTON", 6);
            CLICK_RULES_BUTTON = personalDiscountEvent7;
            PersonalDiscountEvent[] personalDiscountEventArr = {personalDiscountEvent, personalDiscountEvent2, personalDiscountEvent3, personalDiscountEvent4, personalDiscountEvent5, personalDiscountEvent6, personalDiscountEvent7};
            $VALUES = personalDiscountEventArr;
            $ENTRIES = new asp(personalDiscountEventArr);
        }

        public PersonalDiscountEvent() {
            throw null;
        }

        public static PersonalDiscountEvent valueOf(String str) {
            return (PersonalDiscountEvent) Enum.valueOf(PersonalDiscountEvent.class, str);
        }

        public static PersonalDiscountEvent[] values() {
            return (PersonalDiscountEvent[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBridgeAnalytics.kt */
    public static final class PersonalDiscountExitReason {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PersonalDiscountExitReason[] $VALUES;
        public static final PersonalDiscountExitReason ACTION_BUTTON;
        public static final PersonalDiscountExitReason CLOSE_ICON;
        public static final PersonalDiscountExitReason POSITIVE_BUTTON;
        public static final PersonalDiscountExitReason SWIPE_DOWN;
        private final String hideName;

        static {
            PersonalDiscountExitReason personalDiscountExitReason = new PersonalDiscountExitReason("POSITIVE_BUTTON", 0, "positive_button");
            POSITIVE_BUTTON = personalDiscountExitReason;
            PersonalDiscountExitReason personalDiscountExitReason2 = new PersonalDiscountExitReason("ACTION_BUTTON", 1, "action_button");
            ACTION_BUTTON = personalDiscountExitReason2;
            PersonalDiscountExitReason personalDiscountExitReason3 = new PersonalDiscountExitReason("CLOSE_ICON", 2, "close_button");
            CLOSE_ICON = personalDiscountExitReason3;
            PersonalDiscountExitReason personalDiscountExitReason4 = new PersonalDiscountExitReason("SWIPE_DOWN", 3, "swipe_down");
            SWIPE_DOWN = personalDiscountExitReason4;
            PersonalDiscountExitReason[] personalDiscountExitReasonArr = {personalDiscountExitReason, personalDiscountExitReason2, personalDiscountExitReason3, personalDiscountExitReason4};
            $VALUES = personalDiscountExitReasonArr;
            $ENTRIES = new asp(personalDiscountExitReasonArr);
        }

        public PersonalDiscountExitReason(String str, int i, String str2) {
            this.hideName = str2;
        }

        public static PersonalDiscountExitReason valueOf(String str) {
            return (PersonalDiscountExitReason) Enum.valueOf(PersonalDiscountExitReason.class, str);
        }

        public static PersonalDiscountExitReason[] values() {
            return (PersonalDiscountExitReason[]) $VALUES.clone();
        }

        public final String h() {
            return this.hideName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkBridgeAnalytics.kt */
    public static final class RegistrationEvent {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RegistrationEvent[] $VALUES;
        public static final RegistrationEvent EXTERNAL_LINK_MINIAPP_OPEN;
        public static final RegistrationEvent EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN;

        static {
            RegistrationEvent registrationEvent = new RegistrationEvent("EXTERNAL_LINK_MINIAPP_OPEN", 0);
            EXTERNAL_LINK_MINIAPP_OPEN = registrationEvent;
            RegistrationEvent registrationEvent2 = new RegistrationEvent("EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN", 1);
            EXTERNAL_LINK_MINIAPP_SUCCESS_RETURN = registrationEvent2;
            RegistrationEvent[] registrationEventArr = {registrationEvent, registrationEvent2};
            $VALUES = registrationEventArr;
            $ENTRIES = new asp(registrationEventArr);
        }

        public RegistrationEvent() {
            throw null;
        }

        public static RegistrationEvent valueOf(String str) {
            return (RegistrationEvent) Enum.valueOf(RegistrationEvent.class, str);
        }

        public static RegistrationEvent[] values() {
            return (RegistrationEvent[]) $VALUES.clone();
        }
    }

    void a(BannerAdEvent bannerAdEvent, boolean z, h16 h16Var, BannerParamsSnapshot bannerParamsSnapshot, String str);

    void b(AdRequestEvent adRequestEvent);

    void c(cnk cnkVar);

    void d(PersonalDiscountExitReason personalDiscountExitReason, int i, Integer num, BannerType bannerType);

    void e(boolean z, s31 s31Var, NativeAdEventType nativeAdEventType);

    void f(String str, boolean z, s31 s31Var, NativeAdEventType nativeAdEventType, String str2);

    void g(RegistrationEvent registrationEvent);

    void h(ExitGameAlertEvent exitGameAlertEvent, Integer num, String[] strArr, Integer num2);

    void i(String str, String str2, JSONObject jSONObject);

    void j(InstallScreenEvent installScreenEvent);

    void k(String str, AppShareType appShareType);

    void l(PersonalDiscountEvent personalDiscountEvent, BannerType bannerType);

    void m(ExitGameAlertEvent exitGameAlertEvent, Integer num);
}
