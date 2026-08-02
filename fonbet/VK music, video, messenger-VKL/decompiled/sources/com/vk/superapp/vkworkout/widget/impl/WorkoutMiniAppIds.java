package com.vk.superapp.vkworkout.widget.impl;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WorkoutMiniAppIds.kt */
/* loaded from: classes6.dex */
public final class WorkoutMiniAppIds {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WorkoutMiniAppIds[] $VALUES;
    public static final WorkoutMiniAppIds APP_ID_WORKOUT;
    public static final WorkoutMiniAppIds APP_ID_WORKOUT_STAGE;
    private final int value;

    static {
        WorkoutMiniAppIds workoutMiniAppIds = new WorkoutMiniAppIds("APP_ID_WORKOUT_STAGE", 0, 51398742);
        APP_ID_WORKOUT_STAGE = workoutMiniAppIds;
        WorkoutMiniAppIds workoutMiniAppIds2 = new WorkoutMiniAppIds("APP_ID_WORKOUT", 1, 8228680);
        APP_ID_WORKOUT = workoutMiniAppIds2;
        WorkoutMiniAppIds[] workoutMiniAppIdsArr = {workoutMiniAppIds, workoutMiniAppIds2};
        $VALUES = workoutMiniAppIdsArr;
        $ENTRIES = new asp(workoutMiniAppIdsArr);
    }

    public WorkoutMiniAppIds(String str, int i, int i2) {
        this.value = i2;
    }

    public static WorkoutMiniAppIds valueOf(String str) {
        return (WorkoutMiniAppIds) Enum.valueOf(WorkoutMiniAppIds.class, str);
    }

    public static WorkoutMiniAppIds[] values() {
        return (WorkoutMiniAppIds[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
