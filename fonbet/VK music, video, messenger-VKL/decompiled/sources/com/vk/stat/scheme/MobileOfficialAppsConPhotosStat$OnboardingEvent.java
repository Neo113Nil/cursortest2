package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPhotosStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPhotosStat$OnboardingEvent {

    @pmi0("onboarding_event_type")
    private final OnboardingEventType onboardingEventType;

    @pmi0("string_value_param")
    private final MobileOfficialAppsConPhotosStat$StringValueParam stringValueParam;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPhotosStat.kt */
    public static final class OnboardingEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingEventType[] $VALUES;

        @pmi0("click_to_onboarding")
        public static final OnboardingEventType CLICK_TO_ONBOARDING;

        @pmi0("click_to_question")
        public static final OnboardingEventType CLICK_TO_QUESTION;

        @pmi0("hide_onboarding")
        public static final OnboardingEventType HIDE_ONBOARDING;

        @pmi0("next_card")
        public static final OnboardingEventType NEXT_CARD;

        @pmi0("open_card")
        public static final OnboardingEventType OPEN_CARD;

        static {
            OnboardingEventType onboardingEventType = new OnboardingEventType("CLICK_TO_ONBOARDING", 0);
            CLICK_TO_ONBOARDING = onboardingEventType;
            OnboardingEventType onboardingEventType2 = new OnboardingEventType("HIDE_ONBOARDING", 1);
            HIDE_ONBOARDING = onboardingEventType2;
            OnboardingEventType onboardingEventType3 = new OnboardingEventType("CLICK_TO_QUESTION", 2);
            CLICK_TO_QUESTION = onboardingEventType3;
            OnboardingEventType onboardingEventType4 = new OnboardingEventType("OPEN_CARD", 3);
            OPEN_CARD = onboardingEventType4;
            OnboardingEventType onboardingEventType5 = new OnboardingEventType("NEXT_CARD", 4);
            NEXT_CARD = onboardingEventType5;
            OnboardingEventType[] onboardingEventTypeArr = {onboardingEventType, onboardingEventType2, onboardingEventType3, onboardingEventType4, onboardingEventType5};
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

    public MobileOfficialAppsConPhotosStat$OnboardingEvent(OnboardingEventType onboardingEventType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam) {
        this.onboardingEventType = onboardingEventType;
        this.stringValueParam = mobileOfficialAppsConPhotosStat$StringValueParam;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPhotosStat$OnboardingEvent)) {
            return false;
        }
        MobileOfficialAppsConPhotosStat$OnboardingEvent mobileOfficialAppsConPhotosStat$OnboardingEvent = (MobileOfficialAppsConPhotosStat$OnboardingEvent) obj;
        return this.onboardingEventType == mobileOfficialAppsConPhotosStat$OnboardingEvent.onboardingEventType && epx.f(this.stringValueParam, mobileOfficialAppsConPhotosStat$OnboardingEvent.stringValueParam);
    }

    public final int hashCode() {
        int hashCode = this.onboardingEventType.hashCode() * 31;
        MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam = this.stringValueParam;
        return hashCode + (mobileOfficialAppsConPhotosStat$StringValueParam == null ? 0 : mobileOfficialAppsConPhotosStat$StringValueParam.hashCode());
    }

    public final String toString() {
        return "OnboardingEvent(onboardingEventType=" + this.onboardingEventType + ", stringValueParam=" + this.stringValueParam + ')';
    }

    public /* synthetic */ MobileOfficialAppsConPhotosStat$OnboardingEvent(OnboardingEventType onboardingEventType, MobileOfficialAppsConPhotosStat$StringValueParam mobileOfficialAppsConPhotosStat$StringValueParam, int i, zcl zclVar) {
        this(onboardingEventType, (i & 2) != 0 ? null : mobileOfficialAppsConPhotosStat$StringValueParam);
    }
}
