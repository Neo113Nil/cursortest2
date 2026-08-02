package com.sofascore.model.newNetwork.hockeyplaybyplay;

import com.sofascore.model.mvvm.model.Incident;
import defpackage.fga;
import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = HockeyGoalTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "EMPTY_NET", "OWN_GOAL", "AWARDED_GOAL", "PENALTY_GOAL", "SHOOTOUT_GOAL", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HockeyGoalType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ HockeyGoalType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("goal")
    public static final HockeyGoalType REGULAR = new HockeyGoalType("REGULAR", 0);

    @q5h("emptyNetGoal")
    public static final HockeyGoalType EMPTY_NET = new HockeyGoalType("EMPTY_NET", 1);

    @q5h(Incident.GoalIncident.TYPE_OWN_GOAL)
    public static final HockeyGoalType OWN_GOAL = new HockeyGoalType("OWN_GOAL", 2);

    @fga(names = {"awardedGoal", "awardedEmptyNetGoal"})
    public static final HockeyGoalType AWARDED_GOAL = new HockeyGoalType("AWARDED_GOAL", 3);

    @q5h("penaltyGoal")
    public static final HockeyGoalType PENALTY_GOAL = new HockeyGoalType("PENALTY_GOAL", 4);

    @q5h("shootoutGoal")
    public static final HockeyGoalType SHOOTOUT_GOAL = new HockeyGoalType("SHOOTOUT_GOAL", 5);

    private static final /* synthetic */ HockeyGoalType[] $values() {
        return new HockeyGoalType[]{REGULAR, EMPTY_NET, OWN_GOAL, AWARDED_GOAL, PENALTY_GOAL, SHOOTOUT_GOAL};
    }

    static {
        HockeyGoalType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private HockeyGoalType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static HockeyGoalType valueOf(String str) {
        return (HockeyGoalType) Enum.valueOf(HockeyGoalType.class, str);
    }

    public static HockeyGoalType[] values() {
        return (HockeyGoalType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyGoalType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HockeyGoalTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
