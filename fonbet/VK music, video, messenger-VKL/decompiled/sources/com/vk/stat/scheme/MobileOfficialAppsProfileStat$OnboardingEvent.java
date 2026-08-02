package com.vk.stat.scheme;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$OnboardingEvent {

    @pmi0("card_id")
    private final Integer cardId;

    @pmi0("cards_seen")
    private final List<Integer> cardsSeen;

    @pmi0("onboarding_event_type")
    private final OnboardingEventType onboardingEventType;

    @pmi0("step_number")
    private final Integer stepNumber;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class OnboardingEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingEventType[] $VALUES;

        @pmi0("click_to_new_profile")
        public static final OnboardingEventType CLICK_TO_NEW_PROFILE;

        @pmi0("hide_new_profile")
        public static final OnboardingEventType HIDE_NEW_PROFILE;

        @pmi0("onboarding_cards_seen")
        public static final OnboardingEventType ONBOARDING_CARDS_SEEN;

        @pmi0("onboarding_card_click")
        public static final OnboardingEventType ONBOARDING_CARD_CLICK;

        @pmi0("onboarding_community")
        public static final OnboardingEventType ONBOARDING_COMMUNITY;

        @pmi0("onboarding_cover")
        public static final OnboardingEventType ONBOARDING_COVER;

        @pmi0("onboarding_education")
        public static final OnboardingEventType ONBOARDING_EDUCATION;

        @pmi0("onboarding_import_contacts")
        public static final OnboardingEventType ONBOARDING_IMPORT_CONTACTS;

        @pmi0("onboarding_short_adress")
        public static final OnboardingEventType ONBOARDING_SHORT_ADRESS;

        @pmi0("popup_hide")
        public static final OnboardingEventType POPUP_HIDE;

        @pmi0("popup_next")
        public static final OnboardingEventType POPUP_NEXT;

        @pmi0("popup_show_auto")
        public static final OnboardingEventType POPUP_SHOW_AUTO;

        @pmi0("popup_show_by_user")
        public static final OnboardingEventType POPUP_SHOW_BY_USER;

        static {
            OnboardingEventType onboardingEventType = new OnboardingEventType("ONBOARDING_COVER", 0);
            ONBOARDING_COVER = onboardingEventType;
            OnboardingEventType onboardingEventType2 = new OnboardingEventType("ONBOARDING_EDUCATION", 1);
            ONBOARDING_EDUCATION = onboardingEventType2;
            OnboardingEventType onboardingEventType3 = new OnboardingEventType("ONBOARDING_COMMUNITY", 2);
            ONBOARDING_COMMUNITY = onboardingEventType3;
            OnboardingEventType onboardingEventType4 = new OnboardingEventType("ONBOARDING_SHORT_ADRESS", 3);
            ONBOARDING_SHORT_ADRESS = onboardingEventType4;
            OnboardingEventType onboardingEventType5 = new OnboardingEventType("ONBOARDING_IMPORT_CONTACTS", 4);
            ONBOARDING_IMPORT_CONTACTS = onboardingEventType5;
            OnboardingEventType onboardingEventType6 = new OnboardingEventType("ONBOARDING_CARDS_SEEN", 5);
            ONBOARDING_CARDS_SEEN = onboardingEventType6;
            OnboardingEventType onboardingEventType7 = new OnboardingEventType("ONBOARDING_CARD_CLICK", 6);
            ONBOARDING_CARD_CLICK = onboardingEventType7;
            OnboardingEventType onboardingEventType8 = new OnboardingEventType("CLICK_TO_NEW_PROFILE", 7);
            CLICK_TO_NEW_PROFILE = onboardingEventType8;
            OnboardingEventType onboardingEventType9 = new OnboardingEventType("HIDE_NEW_PROFILE", 8);
            HIDE_NEW_PROFILE = onboardingEventType9;
            OnboardingEventType onboardingEventType10 = new OnboardingEventType("POPUP_SHOW_BY_USER", 9);
            POPUP_SHOW_BY_USER = onboardingEventType10;
            OnboardingEventType onboardingEventType11 = new OnboardingEventType("POPUP_SHOW_AUTO", 10);
            POPUP_SHOW_AUTO = onboardingEventType11;
            OnboardingEventType onboardingEventType12 = new OnboardingEventType("POPUP_NEXT", 11);
            POPUP_NEXT = onboardingEventType12;
            OnboardingEventType onboardingEventType13 = new OnboardingEventType("POPUP_HIDE", 12);
            POPUP_HIDE = onboardingEventType13;
            OnboardingEventType[] onboardingEventTypeArr = {onboardingEventType, onboardingEventType2, onboardingEventType3, onboardingEventType4, onboardingEventType5, onboardingEventType6, onboardingEventType7, onboardingEventType8, onboardingEventType9, onboardingEventType10, onboardingEventType11, onboardingEventType12, onboardingEventType13};
            $VALUES = onboardingEventTypeArr;
            $ENTRIES = new asp(onboardingEventTypeArr);
        }

        private OnboardingEventType(String str, int i) {
        }

        public static OnboardingEventType valueOf(String str) {
            return (OnboardingEventType) Enum.valueOf(OnboardingEventType.class, str);
        }

        public static OnboardingEventType[] values() {
            return (OnboardingEventType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsProfileStat$OnboardingEvent() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$OnboardingEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$OnboardingEvent mobileOfficialAppsProfileStat$OnboardingEvent = (MobileOfficialAppsProfileStat$OnboardingEvent) obj;
        return this.onboardingEventType == mobileOfficialAppsProfileStat$OnboardingEvent.onboardingEventType && epx.f(this.cardId, mobileOfficialAppsProfileStat$OnboardingEvent.cardId) && epx.f(this.stepNumber, mobileOfficialAppsProfileStat$OnboardingEvent.stepNumber) && epx.f(this.cardsSeen, mobileOfficialAppsProfileStat$OnboardingEvent.cardsSeen);
    }

    public final int hashCode() {
        OnboardingEventType onboardingEventType = this.onboardingEventType;
        int hashCode = (onboardingEventType == null ? 0 : onboardingEventType.hashCode()) * 31;
        Integer num = this.cardId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stepNumber;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list = this.cardsSeen;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingEvent(onboardingEventType=");
        sb.append(this.onboardingEventType);
        sb.append(", cardId=");
        sb.append(this.cardId);
        sb.append(", stepNumber=");
        sb.append(this.stepNumber);
        sb.append(", cardsSeen=");
        return ms9.a(')', sb, this.cardsSeen);
    }

    public MobileOfficialAppsProfileStat$OnboardingEvent(OnboardingEventType onboardingEventType, Integer num, Integer num2, List<Integer> list) {
        this.onboardingEventType = onboardingEventType;
        this.cardId = num;
        this.stepNumber = num2;
        this.cardsSeen = list;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$OnboardingEvent(OnboardingEventType onboardingEventType, Integer num, Integer num2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : onboardingEventType, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : list);
    }
}
