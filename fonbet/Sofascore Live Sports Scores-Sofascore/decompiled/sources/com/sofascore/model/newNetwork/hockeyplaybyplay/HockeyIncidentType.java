package com.sofascore.model.newNetwork.hockeyplaybyplay;

import com.sofascore.model.mvvm.model.IncidentKt;
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
@r5h(with = HockeyIncidentTypeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;", "", "<init>", "(Ljava/lang/String;I)V", "GOAL", "SHOT_MISSED", "SHOT_SAVED", "SHOT_BLOCKED", "FACEOFF", "SUSPENSION", "HIT", "STOPPAGE", "CHALLENGE", "PENALTY_SCORED", "PENALTY_SAVED", "PENALTY_MISSED", "PENALTY_ATTEMPT_FAILED", "POSSESSION_CHANGE", "GOALIE_IN", "GOALIE_OUT", "UNKNOWN", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HockeyIncidentType {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ HockeyIncidentType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("scoreChange")
    public static final HockeyIncidentType GOAL = new HockeyIncidentType("GOAL", 0);

    @q5h("shotOffTarget")
    public static final HockeyIncidentType SHOT_MISSED = new HockeyIncidentType("SHOT_MISSED", 1);

    @q5h("shotSaved")
    public static final HockeyIncidentType SHOT_SAVED = new HockeyIncidentType("SHOT_SAVED", 2);

    @q5h("shotBlocked")
    public static final HockeyIncidentType SHOT_BLOCKED = new HockeyIncidentType("SHOT_BLOCKED", 3);

    @q5h("faceOff")
    public static final HockeyIncidentType FACEOFF = new HockeyIncidentType("FACEOFF", 4);

    @q5h(IncidentKt.TYPE_SUSPENSION)
    public static final HockeyIncidentType SUSPENSION = new HockeyIncidentType("SUSPENSION", 5);

    @q5h("hit")
    public static final HockeyIncidentType HIT = new HockeyIncidentType("HIT", 6);

    @q5h("stoppage")
    public static final HockeyIncidentType STOPPAGE = new HockeyIncidentType("STOPPAGE", 7);

    @q5h("challenge")
    public static final HockeyIncidentType CHALLENGE = new HockeyIncidentType("CHALLENGE", 8);

    @q5h("penaltyScored")
    public static final HockeyIncidentType PENALTY_SCORED = new HockeyIncidentType("PENALTY_SCORED", 9);

    @q5h("penaltySaved")
    public static final HockeyIncidentType PENALTY_SAVED = new HockeyIncidentType("PENALTY_SAVED", 10);

    @q5h("penaltyMissed")
    public static final HockeyIncidentType PENALTY_MISSED = new HockeyIncidentType("PENALTY_MISSED", 11);

    @q5h("penaltyAttemptFailed")
    public static final HockeyIncidentType PENALTY_ATTEMPT_FAILED = new HockeyIncidentType("PENALTY_ATTEMPT_FAILED", 12);

    @q5h("possessionChange")
    public static final HockeyIncidentType POSSESSION_CHANGE = new HockeyIncidentType("POSSESSION_CHANGE", 13);

    @q5h("goalkeeperBack")
    public static final HockeyIncidentType GOALIE_IN = new HockeyIncidentType("GOALIE_IN", 14);

    @q5h("goalkeeperOut")
    public static final HockeyIncidentType GOALIE_OUT = new HockeyIncidentType("GOALIE_OUT", 15);
    public static final HockeyIncidentType UNKNOWN = new HockeyIncidentType("UNKNOWN", 16);

    private static final /* synthetic */ HockeyIncidentType[] $values() {
        return new HockeyIncidentType[]{GOAL, SHOT_MISSED, SHOT_SAVED, SHOT_BLOCKED, FACEOFF, SUSPENSION, HIT, STOPPAGE, CHALLENGE, PENALTY_SCORED, PENALTY_SAVED, PENALTY_MISSED, PENALTY_ATTEMPT_FAILED, POSSESSION_CHANGE, GOALIE_IN, GOALIE_OUT, UNKNOWN};
    }

    static {
        HockeyIncidentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private HockeyIncidentType(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static HockeyIncidentType valueOf(String str) {
        return (HockeyIncidentType) Enum.valueOf(HockeyIncidentType.class, str);
    }

    public static HockeyIncidentType[] values() {
        return (HockeyIncidentType[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/hockeyplaybyplay/HockeyIncidentType;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HockeyIncidentTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
