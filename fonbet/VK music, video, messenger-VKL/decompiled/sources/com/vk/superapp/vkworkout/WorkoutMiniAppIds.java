package com.vk.superapp.vkworkout;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WorkoutMiniAppIds.kt */
/* loaded from: classes11.dex */
public final class WorkoutMiniAppIds {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WorkoutMiniAppIds[] $VALUES;
    public static final WorkoutMiniAppIds APP_ID_INTERNAL_SANDBOX;
    public static final WorkoutMiniAppIds APP_ID_SANDBOX;
    public static final WorkoutMiniAppIds APP_ID_WORKOUT;
    public static final WorkoutMiniAppIds APP_ID_WORKOUT_STAGE;
    private final int value;

    static {
        WorkoutMiniAppIds workoutMiniAppIds = new WorkoutMiniAppIds("APP_ID_WORKOUT_STAGE", 0, 51398742);
        APP_ID_WORKOUT_STAGE = workoutMiniAppIds;
        WorkoutMiniAppIds workoutMiniAppIds2 = new WorkoutMiniAppIds("APP_ID_WORKOUT", 1, 8228680);
        APP_ID_WORKOUT = workoutMiniAppIds2;
        WorkoutMiniAppIds workoutMiniAppIds3 = new WorkoutMiniAppIds("APP_ID_SANDBOX", 2, 6703670);
        APP_ID_SANDBOX = workoutMiniAppIds3;
        WorkoutMiniAppIds workoutMiniAppIds4 = new WorkoutMiniAppIds("APP_ID_INTERNAL_SANDBOX", 3, 6722068);
        APP_ID_INTERNAL_SANDBOX = workoutMiniAppIds4;
        WorkoutMiniAppIds[] workoutMiniAppIdsArr = {workoutMiniAppIds, workoutMiniAppIds2, workoutMiniAppIds3, workoutMiniAppIds4};
        $VALUES = workoutMiniAppIdsArr;
        $ENTRIES = new asp(workoutMiniAppIdsArr);
    }

    public WorkoutMiniAppIds(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<WorkoutMiniAppIds> h() {
        return $ENTRIES;
    }

    public static WorkoutMiniAppIds valueOf(String str) {
        return (WorkoutMiniAppIds) Enum.valueOf(WorkoutMiniAppIds.class, str);
    }

    public static WorkoutMiniAppIds[] values() {
        return (WorkoutMiniAppIds[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
