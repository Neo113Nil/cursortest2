package com.vk.music.stats;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoachMarkAction.kt */
/* loaded from: classes3.dex */
public final class CoachMarkAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CoachMarkAction[] $VALUES;
    public static final CoachMarkAction CLICK_CONTAINER_AREA;
    public static final CoachMarkAction CLICK_CROSS;
    public static final CoachMarkAction CLICK_OUTER_AREA;
    public static final CoachMarkAction CLICK_TARGET_AREA;

    static {
        CoachMarkAction coachMarkAction = new CoachMarkAction("CLICK_TARGET_AREA", 0);
        CLICK_TARGET_AREA = coachMarkAction;
        CoachMarkAction coachMarkAction2 = new CoachMarkAction("CLICK_OUTER_AREA", 1);
        CLICK_OUTER_AREA = coachMarkAction2;
        CoachMarkAction coachMarkAction3 = new CoachMarkAction("CLICK_CROSS", 2);
        CLICK_CROSS = coachMarkAction3;
        CoachMarkAction coachMarkAction4 = new CoachMarkAction("CLICK_CONTAINER_AREA", 3);
        CLICK_CONTAINER_AREA = coachMarkAction4;
        CoachMarkAction[] coachMarkActionArr = {coachMarkAction, coachMarkAction2, coachMarkAction3, coachMarkAction4};
        $VALUES = coachMarkActionArr;
        $ENTRIES = new asp(coachMarkActionArr);
    }

    public CoachMarkAction() {
        throw null;
    }

    public static CoachMarkAction valueOf(String str) {
        return (CoachMarkAction) Enum.valueOf(CoachMarkAction.class, str);
    }

    public static CoachMarkAction[] values() {
        return (CoachMarkAction[]) $VALUES.clone();
    }
}
