package com.sofascore.model.wc26;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.fn0;
import defpackage.ljg;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJV\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001b¨\u00067"}, d2 = {"Lcom/sofascore/model/wc26/WorldCupTimeline;", "", "", "myTeamCollapsable", "midPhaseStart", "liveTournamentPhaseStart", "liveTournament2PhaseStart", "liveTournament3PhaseStart", "afterFinalPhaseStart", "endPhaseStart", "<init>", "(JJJJJJJ)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(IJJJJJJJLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/wc26/WorldCupTimeline;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()J", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JJJJJJJ)Lcom/sofascore/model/wc26/WorldCupTimeline;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getMyTeamCollapsable", "getMidPhaseStart", "getLiveTournamentPhaseStart", "getLiveTournament2PhaseStart", "getLiveTournament3PhaseStart", "getAfterFinalPhaseStart", "getEndPhaseStart", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WorldCupTimeline {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long afterFinalPhaseStart;
    private final long endPhaseStart;
    private final long liveTournament2PhaseStart;
    private final long liveTournament3PhaseStart;
    private final long liveTournamentPhaseStart;
    private final long midPhaseStart;
    private final long myTeamCollapsable;

    public /* synthetic */ WorldCupTimeline(int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, WorldCupTimeline$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.myTeamCollapsable = j;
        this.midPhaseStart = j2;
        this.liveTournamentPhaseStart = j3;
        this.liveTournament2PhaseStart = j4;
        this.liveTournament3PhaseStart = j5;
        this.afterFinalPhaseStart = j6;
        this.endPhaseStart = j7;
    }

    public static final /* synthetic */ void write$Self$model_release(WorldCupTimeline self, wf3 output, SerialDescriptor serialDesc) {
        output.E(serialDesc, 0, self.myTeamCollapsable);
        output.E(serialDesc, 1, self.midPhaseStart);
        output.E(serialDesc, 2, self.liveTournamentPhaseStart);
        output.E(serialDesc, 3, self.liveTournament2PhaseStart);
        output.E(serialDesc, 4, self.liveTournament3PhaseStart);
        output.E(serialDesc, 5, self.afterFinalPhaseStart);
        output.E(serialDesc, 6, self.endPhaseStart);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMyTeamCollapsable() {
        return this.myTeamCollapsable;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMidPhaseStart() {
        return this.midPhaseStart;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLiveTournamentPhaseStart() {
        return this.liveTournamentPhaseStart;
    }

    /* renamed from: component4, reason: from getter */
    public final long getLiveTournament2PhaseStart() {
        return this.liveTournament2PhaseStart;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLiveTournament3PhaseStart() {
        return this.liveTournament3PhaseStart;
    }

    /* renamed from: component6, reason: from getter */
    public final long getAfterFinalPhaseStart() {
        return this.afterFinalPhaseStart;
    }

    /* renamed from: component7, reason: from getter */
    public final long getEndPhaseStart() {
        return this.endPhaseStart;
    }

    @NotNull
    public final WorldCupTimeline copy(long myTeamCollapsable, long midPhaseStart, long liveTournamentPhaseStart, long liveTournament2PhaseStart, long liveTournament3PhaseStart, long afterFinalPhaseStart, long endPhaseStart) {
        return new WorldCupTimeline(myTeamCollapsable, midPhaseStart, liveTournamentPhaseStart, liveTournament2PhaseStart, liveTournament3PhaseStart, afterFinalPhaseStart, endPhaseStart);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCupTimeline)) {
            return false;
        }
        WorldCupTimeline worldCupTimeline = (WorldCupTimeline) other;
        return this.myTeamCollapsable == worldCupTimeline.myTeamCollapsable && this.midPhaseStart == worldCupTimeline.midPhaseStart && this.liveTournamentPhaseStart == worldCupTimeline.liveTournamentPhaseStart && this.liveTournament2PhaseStart == worldCupTimeline.liveTournament2PhaseStart && this.liveTournament3PhaseStart == worldCupTimeline.liveTournament3PhaseStart && this.afterFinalPhaseStart == worldCupTimeline.afterFinalPhaseStart && this.endPhaseStart == worldCupTimeline.endPhaseStart;
    }

    public final long getAfterFinalPhaseStart() {
        return this.afterFinalPhaseStart;
    }

    public final long getEndPhaseStart() {
        return this.endPhaseStart;
    }

    public final long getLiveTournament2PhaseStart() {
        return this.liveTournament2PhaseStart;
    }

    public final long getLiveTournament3PhaseStart() {
        return this.liveTournament3PhaseStart;
    }

    public final long getLiveTournamentPhaseStart() {
        return this.liveTournamentPhaseStart;
    }

    public final long getMidPhaseStart() {
        return this.midPhaseStart;
    }

    public final long getMyTeamCollapsable() {
        return this.myTeamCollapsable;
    }

    public int hashCode() {
        return Long.hashCode(this.endPhaseStart) + ljg.c(ljg.c(ljg.c(ljg.c(ljg.c(Long.hashCode(this.myTeamCollapsable) * 31, 31, this.midPhaseStart), 31, this.liveTournamentPhaseStart), 31, this.liveTournament2PhaseStart), 31, this.liveTournament3PhaseStart), 31, this.afterFinalPhaseStart);
    }

    @NotNull
    public String toString() {
        long j = this.myTeamCollapsable;
        long j2 = this.midPhaseStart;
        long j3 = this.liveTournamentPhaseStart;
        long j4 = this.liveTournament2PhaseStart;
        long j5 = this.liveTournament3PhaseStart;
        long j6 = this.afterFinalPhaseStart;
        long j7 = this.endPhaseStart;
        StringBuilder o = ljg.o("WorldCupTimeline(myTeamCollapsable=", j, ", midPhaseStart=");
        o.append(j2);
        fn0.t(j3, ", liveTournamentPhaseStart=", ", liveTournament2PhaseStart=", o);
        o.append(j4);
        fn0.t(j5, ", liveTournament3PhaseStart=", ", afterFinalPhaseStart=", o);
        o.append(j6);
        return fn0.l(j7, ", endPhaseStart=", ")", o);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/wc26/WorldCupTimeline$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/wc26/WorldCupTimeline;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WorldCupTimeline$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WorldCupTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.myTeamCollapsable = j;
        this.midPhaseStart = j2;
        this.liveTournamentPhaseStart = j3;
        this.liveTournament2PhaseStart = j4;
        this.liveTournament3PhaseStart = j5;
        this.afterFinalPhaseStart = j6;
        this.endPhaseStart = j7;
    }
}
