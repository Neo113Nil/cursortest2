package com.sofascore.model.newNetwork.statistics.season.team;

import defpackage.a7a;
import defpackage.fc6;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q5h("FutsalTeamSeasonStatistics")
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKB\u0093\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013B§\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J¸\u0001\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b?\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b@\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bA\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bB\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bC\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bD\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bE\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bF\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010<\u001a\u0004\bG\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bH\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bI\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\bJ\u0010\u0019¨\u0006M"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/FutsalTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "Ljava/io/Serializable;", "", "matches", "awardedMatches", "yellowCards", "redCards", "goals", "ownGoals", "penaltyGoals", "penaltyMisses", "accumulatedPenaltyMisses", "accumulatedPenaltyGoals", "goalsScored", "goalsConceded", "cleanSheets", "accumulatedFouls", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/statistics/season/team/FutsalTeamSeasonStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/team/FutsalTeamSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getMatches", "getAwardedMatches", "getYellowCards", "getRedCards", "getGoals", "getOwnGoals", "getPenaltyGoals", "getPenaltyMisses", "getAccumulatedPenaltyMisses", "getAccumulatedPenaltyGoals", "getGoalsScored", "getGoalsConceded", "getCleanSheets", "getAccumulatedFouls", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FutsalTeamSeasonStatistics implements TeamSeasonStatistics, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer accumulatedFouls;

    @Nullable
    private final Integer accumulatedPenaltyGoals;

    @Nullable
    private final Integer accumulatedPenaltyMisses;

    @Nullable
    private final Integer awardedMatches;

    @Nullable
    private final Integer cleanSheets;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer goalsConceded;

    @Nullable
    private final Integer goalsScored;

    @Nullable
    private final Integer matches;

    @Nullable
    private final Integer ownGoals;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer penaltyMisses;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer yellowCards;

    public /* synthetic */ FutsalTeamSeasonStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, t5h t5hVar) {
        if (16383 != (i & 16383)) {
            oea.z(i, 16383, FutsalTeamSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.matches = num;
        this.awardedMatches = num2;
        this.yellowCards = num3;
        this.redCards = num4;
        this.goals = num5;
        this.ownGoals = num6;
        this.penaltyGoals = num7;
        this.penaltyMisses = num8;
        this.accumulatedPenaltyMisses = num9;
        this.accumulatedPenaltyGoals = num10;
        this.goalsScored = num11;
        this.goalsConceded = num12;
        this.cleanSheets = num13;
        this.accumulatedFouls = num14;
    }

    public static final /* synthetic */ void write$Self$model_release(FutsalTeamSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.matches);
        output.h(serialDesc, 1, a7aVar, self.awardedMatches);
        output.h(serialDesc, 2, a7aVar, self.yellowCards);
        output.h(serialDesc, 3, a7aVar, self.redCards);
        output.h(serialDesc, 4, a7aVar, self.goals);
        output.h(serialDesc, 5, a7aVar, self.ownGoals);
        output.h(serialDesc, 6, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 7, a7aVar, self.penaltyMisses);
        output.h(serialDesc, 8, a7aVar, self.accumulatedPenaltyMisses);
        output.h(serialDesc, 9, a7aVar, self.accumulatedPenaltyGoals);
        output.h(serialDesc, 10, a7aVar, self.goalsScored);
        output.h(serialDesc, 11, a7aVar, self.goalsConceded);
        output.h(serialDesc, 12, a7aVar, self.cleanSheets);
        output.h(serialDesc, 13, a7aVar, self.accumulatedFouls);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getCleanSheets() {
        return this.cleanSheets;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getAccumulatedFouls() {
        return this.accumulatedFouls;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAwardedMatches() {
        return this.awardedMatches;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getOwnGoals() {
        return this.ownGoals;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getPenaltyMisses() {
        return this.penaltyMisses;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getAccumulatedPenaltyMisses() {
        return this.accumulatedPenaltyMisses;
    }

    @NotNull
    public final FutsalTeamSeasonStatistics copy(@Nullable Integer matches, @Nullable Integer awardedMatches, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Integer goals, @Nullable Integer ownGoals, @Nullable Integer penaltyGoals, @Nullable Integer penaltyMisses, @Nullable Integer accumulatedPenaltyMisses, @Nullable Integer accumulatedPenaltyGoals, @Nullable Integer goalsScored, @Nullable Integer goalsConceded, @Nullable Integer cleanSheets, @Nullable Integer accumulatedFouls) {
        return new FutsalTeamSeasonStatistics(matches, awardedMatches, yellowCards, redCards, goals, ownGoals, penaltyGoals, penaltyMisses, accumulatedPenaltyMisses, accumulatedPenaltyGoals, goalsScored, goalsConceded, cleanSheets, accumulatedFouls);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutsalTeamSeasonStatistics)) {
            return false;
        }
        FutsalTeamSeasonStatistics futsalTeamSeasonStatistics = (FutsalTeamSeasonStatistics) other;
        return Intrinsics.c(this.matches, futsalTeamSeasonStatistics.matches) && Intrinsics.c(this.awardedMatches, futsalTeamSeasonStatistics.awardedMatches) && Intrinsics.c(this.yellowCards, futsalTeamSeasonStatistics.yellowCards) && Intrinsics.c(this.redCards, futsalTeamSeasonStatistics.redCards) && Intrinsics.c(this.goals, futsalTeamSeasonStatistics.goals) && Intrinsics.c(this.ownGoals, futsalTeamSeasonStatistics.ownGoals) && Intrinsics.c(this.penaltyGoals, futsalTeamSeasonStatistics.penaltyGoals) && Intrinsics.c(this.penaltyMisses, futsalTeamSeasonStatistics.penaltyMisses) && Intrinsics.c(this.accumulatedPenaltyMisses, futsalTeamSeasonStatistics.accumulatedPenaltyMisses) && Intrinsics.c(this.accumulatedPenaltyGoals, futsalTeamSeasonStatistics.accumulatedPenaltyGoals) && Intrinsics.c(this.goalsScored, futsalTeamSeasonStatistics.goalsScored) && Intrinsics.c(this.goalsConceded, futsalTeamSeasonStatistics.goalsConceded) && Intrinsics.c(this.cleanSheets, futsalTeamSeasonStatistics.cleanSheets) && Intrinsics.c(this.accumulatedFouls, futsalTeamSeasonStatistics.accumulatedFouls);
    }

    @Nullable
    public final Integer getAccumulatedFouls() {
        return this.accumulatedFouls;
    }

    @Nullable
    public final Integer getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Nullable
    public final Integer getAccumulatedPenaltyMisses() {
        return this.accumulatedPenaltyMisses;
    }

    @Nullable
    public final Integer getAwardedMatches() {
        return this.awardedMatches;
    }

    @Nullable
    public final Integer getCleanSheets() {
        return this.cleanSheets;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    public final Integer getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final Integer getOwnGoals() {
        return this.ownGoals;
    }

    @Nullable
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final Integer getPenaltyMisses() {
        return this.penaltyMisses;
    }

    @Nullable
    public final Integer getRedCards() {
        return this.redCards;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        Integer num = this.matches;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.awardedMatches;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.yellowCards;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.redCards;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.goals;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.ownGoals;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.penaltyGoals;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.penaltyMisses;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.accumulatedPenaltyMisses;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.accumulatedPenaltyGoals;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.goalsScored;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.goalsConceded;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.cleanSheets;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.accumulatedFouls;
        return hashCode13 + (num14 != null ? num14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.matches;
        Integer num2 = this.awardedMatches;
        Integer num3 = this.yellowCards;
        Integer num4 = this.redCards;
        Integer num5 = this.goals;
        Integer num6 = this.ownGoals;
        Integer num7 = this.penaltyGoals;
        Integer num8 = this.penaltyMisses;
        Integer num9 = this.accumulatedPenaltyMisses;
        Integer num10 = this.accumulatedPenaltyGoals;
        Integer num11 = this.goalsScored;
        Integer num12 = this.goalsConceded;
        Integer num13 = this.cleanSheets;
        Integer num14 = this.accumulatedFouls;
        StringBuilder k = wv8.k(num, "FutsalTeamSeasonStatistics(matches=", ", awardedMatches=", ", yellowCards=", num2);
        vxd.r(num3, num4, ", redCards=", ", goals=", k);
        vxd.r(num5, num6, ", ownGoals=", ", penaltyGoals=", k);
        vxd.r(num7, num8, ", penaltyMisses=", ", accumulatedPenaltyMisses=", k);
        vxd.r(num9, num10, ", accumulatedPenaltyGoals=", ", goalsScored=", k);
        vxd.r(num11, num12, ", goalsConceded=", ", cleanSheets=", k);
        return fc6.l(num13, num14, ", accumulatedFouls=", ")", k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/FutsalTeamSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/FutsalTeamSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FutsalTeamSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FutsalTeamSeasonStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14) {
        this.matches = num;
        this.awardedMatches = num2;
        this.yellowCards = num3;
        this.redCards = num4;
        this.goals = num5;
        this.ownGoals = num6;
        this.penaltyGoals = num7;
        this.penaltyMisses = num8;
        this.accumulatedPenaltyMisses = num9;
        this.accumulatedPenaltyGoals = num10;
        this.goalsScored = num11;
        this.goalsConceded = num12;
        this.cleanSheets = num13;
        this.accumulatedFouls = num14;
    }
}
