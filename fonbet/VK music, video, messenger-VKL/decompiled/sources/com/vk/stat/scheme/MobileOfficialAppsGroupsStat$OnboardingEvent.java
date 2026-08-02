package com.vk.stat.scheme;

import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$TypeGroupsEventItem;
import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsGroupsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsGroupsStat$OnboardingEvent implements MobileOfficialAppsGroupsStat$TypeGroupsEventItem.b {

    @pmi0("onboarding_event_type")
    private final OnboardingEventType onboardingEventType;

    @pmi0("step_number")
    private final int stepNumber;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsGroupsStat.kt */
    public static final class OnboardingEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingEventType[] $VALUES;

        @pmi0("hidden")
        public static final OnboardingEventType HIDDEN;

        @pmi0("shown")
        public static final OnboardingEventType SHOWN;

        @pmi0("switched_step")
        public static final OnboardingEventType SWITCHED_STEP;

        static {
            OnboardingEventType onboardingEventType = new OnboardingEventType("SHOWN", 0);
            SHOWN = onboardingEventType;
            OnboardingEventType onboardingEventType2 = new OnboardingEventType("SWITCHED_STEP", 1);
            SWITCHED_STEP = onboardingEventType2;
            OnboardingEventType onboardingEventType3 = new OnboardingEventType("HIDDEN", 2);
            HIDDEN = onboardingEventType3;
            OnboardingEventType[] onboardingEventTypeArr = {onboardingEventType, onboardingEventType2, onboardingEventType3};
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

    public MobileOfficialAppsGroupsStat$OnboardingEvent(int i, OnboardingEventType onboardingEventType) {
        this.stepNumber = i;
        this.onboardingEventType = onboardingEventType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsGroupsStat$OnboardingEvent)) {
            return false;
        }
        MobileOfficialAppsGroupsStat$OnboardingEvent mobileOfficialAppsGroupsStat$OnboardingEvent = (MobileOfficialAppsGroupsStat$OnboardingEvent) obj;
        return this.stepNumber == mobileOfficialAppsGroupsStat$OnboardingEvent.stepNumber && this.onboardingEventType == mobileOfficialAppsGroupsStat$OnboardingEvent.onboardingEventType;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.stepNumber) * 31;
        OnboardingEventType onboardingEventType = this.onboardingEventType;
        return hashCode + (onboardingEventType == null ? 0 : onboardingEventType.hashCode());
    }

    public final String toString() {
        return "OnboardingEvent(stepNumber=" + this.stepNumber + ", onboardingEventType=" + this.onboardingEventType + ')';
    }

    public /* synthetic */ MobileOfficialAppsGroupsStat$OnboardingEvent(int i, OnboardingEventType onboardingEventType, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : onboardingEventType);
    }
}
