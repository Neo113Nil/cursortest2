package com.sofascore.model.newNetwork.commentary;

import com.sofascore.model.newNetwork.FootballShotmapItem;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/commentary/AnimatedGoalType;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "OWN_GOAL", "PENALTY", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnimatedGoalType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ AnimatedGoalType[] $VALUES;

    @q5h("regular")
    public static final AnimatedGoalType REGULAR = new AnimatedGoalType("REGULAR", 0);

    @q5h(FootballShotmapItem.GOAL_TYPE_OWN)
    public static final AnimatedGoalType OWN_GOAL = new AnimatedGoalType("OWN_GOAL", 1);

    @q5h("penalty")
    public static final AnimatedGoalType PENALTY = new AnimatedGoalType("PENALTY", 2);

    private static final /* synthetic */ AnimatedGoalType[] $values() {
        return new AnimatedGoalType[]{REGULAR, OWN_GOAL, PENALTY};
    }

    static {
        AnimatedGoalType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private AnimatedGoalType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static AnimatedGoalType valueOf(String str) {
        return (AnimatedGoalType) Enum.valueOf(AnimatedGoalType.class, str);
    }

    public static AnimatedGoalType[] values() {
        return (AnimatedGoalType[]) $VALUES.clone();
    }
}
