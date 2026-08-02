package com.vk.auth.main;

import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;

/* compiled from: PhoneConfirmedStrategy.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[NextStep.values().length];
        try {
            iArr[NextStep.AUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NextStep.REGISTRATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NextStep.SHOW_WITH_PASSWORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NextStep.SHOW_WITHOUT_PASSWORD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[NextStep.PASSWORD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[NextStep.ON_SUCCESS_VALIDATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
