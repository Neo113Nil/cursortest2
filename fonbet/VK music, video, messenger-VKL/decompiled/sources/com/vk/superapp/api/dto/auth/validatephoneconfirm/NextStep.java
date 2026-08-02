package com.vk.superapp.api.dto.auth.validatephoneconfirm;

import com.coremedia.iso.boxes.AuthorBox;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthResponseEnums.kt */
/* loaded from: classes6.dex */
public final class NextStep {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NextStep[] $VALUES;
    public static final NextStep AUTH;
    public static final a Companion;
    public static final NextStep ON_SUCCESS_VALIDATION;
    public static final NextStep PASSWORD;
    public static final NextStep REGISTRATION;
    public static final NextStep SHOW_WITHOUT_PASSWORD;
    public static final NextStep SHOW_WITH_PASSWORD;
    private final String step;

    /* compiled from: AuthResponseEnums.kt */
    public static final class a {
        public static NextStep a(String str) {
            for (NextStep nextStep : NextStep.values()) {
                if (epx.f(str, nextStep.h())) {
                    return nextStep;
                }
            }
            return null;
        }
    }

    static {
        NextStep nextStep = new NextStep("AUTH", 0, AuthorBox.TYPE);
        AUTH = nextStep;
        NextStep nextStep2 = new NextStep("REGISTRATION", 1, "registration");
        REGISTRATION = nextStep2;
        NextStep nextStep3 = new NextStep("SHOW_WITH_PASSWORD", 2, "show_with_password");
        SHOW_WITH_PASSWORD = nextStep3;
        NextStep nextStep4 = new NextStep("SHOW_WITHOUT_PASSWORD", 3, "show_without_password");
        SHOW_WITHOUT_PASSWORD = nextStep4;
        NextStep nextStep5 = new NextStep("ON_SUCCESS_VALIDATION", 4, "on_success_validation");
        ON_SUCCESS_VALIDATION = nextStep5;
        NextStep nextStep6 = new NextStep("PASSWORD", 5, null);
        PASSWORD = nextStep6;
        NextStep[] nextStepArr = {nextStep, nextStep2, nextStep3, nextStep4, nextStep5, nextStep6};
        $VALUES = nextStepArr;
        $ENTRIES = new asp(nextStepArr);
        Companion = new a();
    }

    public NextStep(String str, int i, String str2) {
        this.step = str2;
    }

    public static NextStep valueOf(String str) {
        return (NextStep) Enum.valueOf(NextStep.class, str);
    }

    public static NextStep[] values() {
        return (NextStep[]) $VALUES.clone();
    }

    public final String h() {
        return this.step;
    }
}
