package com.vk.superapp.vksteps;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StepsMiniAppIds.kt */
/* loaded from: classes11.dex */
public final class StepsMiniAppIds {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StepsMiniAppIds[] $VALUES;
    public static final StepsMiniAppIds APP_ID_HEALTH;
    public static final StepsMiniAppIds APP_ID_HEALTH_STAGE;
    public static final StepsMiniAppIds APP_ID_INTERNAL_SANDBOX;
    public static final StepsMiniAppIds APP_ID_SANDBOX;
    public static final StepsMiniAppIds APP_ID_SBER_CAT;
    public static final StepsMiniAppIds APP_ID_STEPS;
    public static final StepsMiniAppIds APP_ID_STEPS_STAGE;
    public static final StepsMiniAppIds APP_ID_TEST_TOOL_BETA;
    public static final StepsMiniAppIds APP_ID_WORKOUT;
    public static final StepsMiniAppIds APP_ID_WORKOUT_STAGE;
    private final int value;

    static {
        StepsMiniAppIds stepsMiniAppIds = new StepsMiniAppIds("APP_ID_HEALTH", 0, 7475344);
        APP_ID_HEALTH = stepsMiniAppIds;
        StepsMiniAppIds stepsMiniAppIds2 = new StepsMiniAppIds("APP_ID_HEALTH_STAGE", 1, 7573939);
        APP_ID_HEALTH_STAGE = stepsMiniAppIds2;
        StepsMiniAppIds stepsMiniAppIds3 = new StepsMiniAppIds("APP_ID_SBER_CAT", 2, 52255121);
        APP_ID_SBER_CAT = stepsMiniAppIds3;
        StepsMiniAppIds stepsMiniAppIds4 = new StepsMiniAppIds("APP_ID_STEPS", 3, 7539087);
        APP_ID_STEPS = stepsMiniAppIds4;
        StepsMiniAppIds stepsMiniAppIds5 = new StepsMiniAppIds("APP_ID_STEPS_STAGE", 4, 7544248);
        APP_ID_STEPS_STAGE = stepsMiniAppIds5;
        StepsMiniAppIds stepsMiniAppIds6 = new StepsMiniAppIds("APP_ID_WORKOUT", 5, 8228680);
        APP_ID_WORKOUT = stepsMiniAppIds6;
        StepsMiniAppIds stepsMiniAppIds7 = new StepsMiniAppIds("APP_ID_WORKOUT_STAGE", 6, 51398742);
        APP_ID_WORKOUT_STAGE = stepsMiniAppIds7;
        StepsMiniAppIds stepsMiniAppIds8 = new StepsMiniAppIds("APP_ID_SANDBOX", 7, 6703670);
        APP_ID_SANDBOX = stepsMiniAppIds8;
        StepsMiniAppIds stepsMiniAppIds9 = new StepsMiniAppIds("APP_ID_INTERNAL_SANDBOX", 8, 6722068);
        APP_ID_INTERNAL_SANDBOX = stepsMiniAppIds9;
        StepsMiniAppIds stepsMiniAppIds10 = new StepsMiniAppIds("APP_ID_TEST_TOOL_BETA", 9, 7246237);
        APP_ID_TEST_TOOL_BETA = stepsMiniAppIds10;
        StepsMiniAppIds[] stepsMiniAppIdsArr = {stepsMiniAppIds, stepsMiniAppIds2, stepsMiniAppIds3, stepsMiniAppIds4, stepsMiniAppIds5, stepsMiniAppIds6, stepsMiniAppIds7, stepsMiniAppIds8, stepsMiniAppIds9, stepsMiniAppIds10};
        $VALUES = stepsMiniAppIdsArr;
        $ENTRIES = new asp(stepsMiniAppIdsArr);
    }

    public StepsMiniAppIds(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<StepsMiniAppIds> h() {
        return $ENTRIES;
    }

    public static StepsMiniAppIds valueOf(String str) {
        return (StepsMiniAppIds) Enum.valueOf(StepsMiniAppIds.class, str);
    }

    public static StepsMiniAppIds[] values() {
        return (StepsMiniAppIds[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
