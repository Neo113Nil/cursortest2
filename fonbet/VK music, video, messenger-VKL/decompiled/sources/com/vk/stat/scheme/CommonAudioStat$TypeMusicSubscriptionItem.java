package com.vk.stat.scheme;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import io.appmetrica.analytics.impl.L2;
import xsna.asp;
import xsna.b9y;
import xsna.hay;
import xsna.pmi0;
import xsna.tay;
import xsna.uay;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes5.dex */
public final class CommonAudioStat$TypeMusicSubscriptionItem implements SchemeStat$TypeAction.b {

    @pmi0("element")
    private final Element element;

    @pmi0("entry_point")
    private final EntryPoint entryPoint;

    @pmi0("subject")
    private final Subject subject;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes11.dex */
    public static final class Element {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Element[] $VALUES;
        public static final Element CARD_PAYMENTS;
        public static final Element CORE_USER;
        public static final Element ERR_ANY;
        public static final Element ERR_NOT_ENOUGH_MONEY;
        public static final Element IP_RU;
        public static final Element MODAL_CHECKOUT;
        public static final Element MODAL_SUBSCRIPTION_BENEFITS_NOTRIAL;
        public static final Element MODAL_SUBSCRIPTION_BENEFITS_NOTRIAL_BUTTON;
        public static final Element MODAL_SUBSCRIPTION_BENEFITS_TRIAL;
        public static final Element MODAL_SUBSCRIPTION_BENEFITS_TRIAL_BUTTON;
        public static final Element NOTRIAL;
        public static final Element PAYWALL_PAUSE;
        public static final Element PUSH;
        public static final Element REVIEWER;
        public static final Element REVIEW_IN_PROGRESS;
        public static final Element STORE_RU;
        public static final Element TRIAL;
        public static final Element UNKNOWN;
        private final String value;

        /* compiled from: CommonAudioStat.kt */
        public static final class Serializer implements uay<Element> {
            @Override // xsna.uay
            public final b9y b(Object obj, tay tayVar) {
                return new hay(((Element) obj).value);
            }
        }

        static {
            Element element = new Element("PUSH", 0, "push");
            PUSH = element;
            Element element2 = new Element("MODAL_SUBSCRIPTION_BENEFITS_TRIAL", 1, "modal_subscription_benefits_trial");
            MODAL_SUBSCRIPTION_BENEFITS_TRIAL = element2;
            Element element3 = new Element("MODAL_SUBSCRIPTION_BENEFITS_TRIAL_BUTTON", 2, "modal_subscription_benefits_trial-button");
            MODAL_SUBSCRIPTION_BENEFITS_TRIAL_BUTTON = element3;
            Element element4 = new Element("MODAL_SUBSCRIPTION_BENEFITS_NOTRIAL", 3, "modal_subscription_benefits_notrial");
            MODAL_SUBSCRIPTION_BENEFITS_NOTRIAL = element4;
            Element element5 = new Element("MODAL_SUBSCRIPTION_BENEFITS_NOTRIAL_BUTTON", 4, "modal_subscription_benefits_notrial-button");
            MODAL_SUBSCRIPTION_BENEFITS_NOTRIAL_BUTTON = element5;
            Element element6 = new Element("MODAL_CHECKOUT", 5, "modal_checkout");
            MODAL_CHECKOUT = element6;
            Element element7 = new Element("PAYWALL_PAUSE", 6, "paywall_pause");
            PAYWALL_PAUSE = element7;
            Element element8 = new Element("TRIAL", 7, "trial");
            TRIAL = element8;
            Element element9 = new Element("NOTRIAL", 8, "notrial");
            NOTRIAL = element9;
            Element element10 = new Element("ERR_NOT_ENOUGH_MONEY", 9, "err_not_enough_money");
            ERR_NOT_ENOUGH_MONEY = element10;
            Element element11 = new Element("ERR_ANY", 10, "err_any");
            ERR_ANY = element11;
            Element element12 = new Element("CARD_PAYMENTS", 11, "card_payments");
            CARD_PAYMENTS = element12;
            Element element13 = new Element("REVIEWER", 12, "reviewer");
            REVIEWER = element13;
            Element element14 = new Element("REVIEW_IN_PROGRESS", 13, "review_in_progress");
            REVIEW_IN_PROGRESS = element14;
            Element element15 = new Element("STORE_RU", 14, "store_ru");
            STORE_RU = element15;
            Element element16 = new Element("CORE_USER", 15, "core_user");
            CORE_USER = element16;
            Element element17 = new Element("IP_RU", 16, "ip_ru");
            IP_RU = element17;
            Element element18 = new Element(GrsBaseInfo.CountryCodeSource.UNKNOWN, 17, "unknown");
            UNKNOWN = element18;
            Element[] elementArr = {element, element2, element3, element4, element5, element6, element7, element8, element9, element10, element11, element12, element13, element14, element15, element16, element17, element18};
            $VALUES = elementArr;
            $ENTRIES = new asp(elementArr);
        }

        public Element(String str, int i, String str2) {
            this.value = str2;
        }

        public static Element valueOf(String str) {
            return (Element) Enum.valueOf(Element.class, str);
        }

        public static Element[] values() {
            return (Element[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class EntryPoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @pmi0(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
        public static final EntryPoint ADS;

        @pmi0("audiobook")
        public static final EntryPoint AUDIOBOOK;

        @pmi0("audio_download_library")
        public static final EntryPoint AUDIO_DOWNLOAD_LIBRARY;

        @pmi0("audio_kids")
        public static final EntryPoint AUDIO_KIDS;

        @pmi0(L2.g)
        public static final EntryPoint BACKGROUND;

        @pmi0("banner")
        public static final EntryPoint BANNER;

        @pmi0("download")
        public static final EntryPoint DOWNLOAD;

        @pmi0("kids_subscription")
        public static final EntryPoint KIDS_SUBSCRIPTION;

        @pmi0("link")
        public static final EntryPoint LINK;

        @pmi0("main_banner")
        public static final EntryPoint MAIN_BANNER;

        @pmi0("mini_app")
        public static final EntryPoint MINI_APP;

        @pmi0("mm_banner")
        public static final EntryPoint MM_BANNER;

        @pmi0("my_music")
        public static final EntryPoint MY_MUSIC;

        @pmi0("none")
        public static final EntryPoint NONE;

        @pmi0("no_subscription")
        public static final EntryPoint NO_SUBSCRIPTION;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final EntryPoint PROFILE;

        @pmi0("push")
        public static final EntryPoint PUSH;

        @pmi0("settings")
        public static final EntryPoint SETTINGS;

        @pmi0("track_menu")
        public static final EntryPoint TRACK_MENU;

        static {
            EntryPoint entryPoint = new EntryPoint("BACKGROUND", 0);
            BACKGROUND = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("DOWNLOAD", 1);
            DOWNLOAD = entryPoint2;
            EntryPoint entryPoint3 = new EntryPoint("AUDIOBOOK", 2);
            AUDIOBOOK = entryPoint3;
            EntryPoint entryPoint4 = new EntryPoint("AUDIO_DOWNLOAD_LIBRARY", 3);
            AUDIO_DOWNLOAD_LIBRARY = entryPoint4;
            EntryPoint entryPoint5 = new EntryPoint("ADS", 4);
            ADS = entryPoint5;
            EntryPoint entryPoint6 = new EntryPoint("LINK", 5);
            LINK = entryPoint6;
            EntryPoint entryPoint7 = new EntryPoint("BANNER", 6);
            BANNER = entryPoint7;
            EntryPoint entryPoint8 = new EntryPoint("MINI_APP", 7);
            MINI_APP = entryPoint8;
            EntryPoint entryPoint9 = new EntryPoint("SETTINGS", 8);
            SETTINGS = entryPoint9;
            EntryPoint entryPoint10 = new EntryPoint("NO_SUBSCRIPTION", 9);
            NO_SUBSCRIPTION = entryPoint10;
            EntryPoint entryPoint11 = new EntryPoint("PUSH", 10);
            PUSH = entryPoint11;
            EntryPoint entryPoint12 = new EntryPoint("NONE", 11);
            NONE = entryPoint12;
            EntryPoint entryPoint13 = new EntryPoint("MY_MUSIC", 12);
            MY_MUSIC = entryPoint13;
            EntryPoint entryPoint14 = new EntryPoint("AUDIO_KIDS", 13);
            AUDIO_KIDS = entryPoint14;
            EntryPoint entryPoint15 = new EntryPoint("TRACK_MENU", 14);
            TRACK_MENU = entryPoint15;
            EntryPoint entryPoint16 = new EntryPoint("MAIN_BANNER", 15);
            MAIN_BANNER = entryPoint16;
            EntryPoint entryPoint17 = new EntryPoint("MM_BANNER", 16);
            MM_BANNER = entryPoint17;
            EntryPoint entryPoint18 = new EntryPoint("KIDS_SUBSCRIPTION", 17);
            KIDS_SUBSCRIPTION = entryPoint18;
            EntryPoint entryPoint19 = new EntryPoint("PROFILE", 18);
            PROFILE = entryPoint19;
            EntryPoint[] entryPointArr = {entryPoint, entryPoint2, entryPoint3, entryPoint4, entryPoint5, entryPoint6, entryPoint7, entryPoint8, entryPoint9, entryPoint10, entryPoint11, entryPoint12, entryPoint13, entryPoint14, entryPoint15, entryPoint16, entryPoint17, entryPoint18, entryPoint19};
            $VALUES = entryPointArr;
            $ENTRIES = new asp(entryPointArr);
        }

        private EntryPoint(String str, int i) {
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    public static final class Subject {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Subject[] $VALUES;

        @pmi0("click")
        public static final Subject CLICK;

        @pmi0(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)
        public static final Subject CLOSE;

        @pmi0("payment_failed")
        public static final Subject PAYMENT_FAILED;

        @pmi0("payment_succeeded")
        public static final Subject PAYMENT_SUCCEEDED;

        @pmi0("paywall_block")
        public static final Subject PAYWALL_BLOCK;

        @pmi0("paywall_select")
        public static final Subject PAYWALL_SELECT;

        @pmi0("sent")
        public static final Subject SENT;

        @pmi0("show")
        public static final Subject SHOW;

        @pmi0("swipe_close")
        public static final Subject SWIPE_CLOSE;

        static {
            Subject subject = new Subject("SENT", 0);
            SENT = subject;
            Subject subject2 = new Subject("SHOW", 1);
            SHOW = subject2;
            Subject subject3 = new Subject("CLOSE", 2);
            CLOSE = subject3;
            Subject subject4 = new Subject("SWIPE_CLOSE", 3);
            SWIPE_CLOSE = subject4;
            Subject subject5 = new Subject("CLICK", 4);
            CLICK = subject5;
            Subject subject6 = new Subject("PAYWALL_BLOCK", 5);
            PAYWALL_BLOCK = subject6;
            Subject subject7 = new Subject("PAYMENT_SUCCEEDED", 6);
            PAYMENT_SUCCEEDED = subject7;
            Subject subject8 = new Subject("PAYMENT_FAILED", 7);
            PAYMENT_FAILED = subject8;
            Subject subject9 = new Subject("PAYWALL_SELECT", 8);
            PAYWALL_SELECT = subject9;
            Subject[] subjectArr = {subject, subject2, subject3, subject4, subject5, subject6, subject7, subject8, subject9};
            $VALUES = subjectArr;
            $ENTRIES = new asp(subjectArr);
        }

        private Subject(String str, int i) {
        }

        public static Subject valueOf(String str) {
            return (Subject) Enum.valueOf(Subject.class, str);
        }

        public static Subject[] values() {
            return (Subject[]) $VALUES.clone();
        }
    }

    public CommonAudioStat$TypeMusicSubscriptionItem(EntryPoint entryPoint, Subject subject, Element element) {
        this.entryPoint = entryPoint;
        this.subject = subject;
        this.element = element;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeMusicSubscriptionItem)) {
            return false;
        }
        CommonAudioStat$TypeMusicSubscriptionItem commonAudioStat$TypeMusicSubscriptionItem = (CommonAudioStat$TypeMusicSubscriptionItem) obj;
        return this.entryPoint == commonAudioStat$TypeMusicSubscriptionItem.entryPoint && this.subject == commonAudioStat$TypeMusicSubscriptionItem.subject && this.element == commonAudioStat$TypeMusicSubscriptionItem.element;
    }

    public final int hashCode() {
        return this.element.hashCode() + ((this.subject.hashCode() + (this.entryPoint.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeMusicSubscriptionItem(entryPoint=" + this.entryPoint + ", subject=" + this.subject + ", element=" + this.element + ')';
    }
}
