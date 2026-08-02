package com.sofascore.model.newNetwork.statistics.season.team;

import defpackage.a7a;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b-\b\u0007\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0002^]BÏ\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010%\u001a\u00020\u0003¢\u0006\u0004\b&\u0010'Bë\u0002\b\u0010\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b&\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u00108R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u00108R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u00108R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b<\u00108R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b=\u00108R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b>\u00108R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u00108R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\bA\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bB\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bC\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\bD\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u00106\u001a\u0004\bE\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\bF\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\bG\u00108R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u00106\u001a\u0004\bH\u00108R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u00106\u001a\u0004\bI\u00108R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\bJ\u00108R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010K\u001a\u0004\bN\u0010MR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010K\u001a\u0004\bO\u0010MR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001b\u0010K\u001a\u0004\bP\u0010MR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\bQ\u00108R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001d\u0010K\u001a\u0004\bR\u0010MR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001e\u0010K\u001a\u0004\bS\u0010MR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\bT\u0010MR\u0019\u0010 \u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b \u0010K\u001a\u0004\bU\u0010MR\u0019\u0010!\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\bV\u00108R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\"\u00106\u001a\u0004\bW\u00108R\u0019\u0010#\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b#\u00106\u001a\u0004\bX\u00108R\u0019\u0010$\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\bY\u00108R\u0017\u0010%\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010Z\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballTeamSeasonStatistics;", "Lcom/sofascore/model/newNetwork/statistics/season/team/TeamSeasonStatistics;", "Ljava/io/Serializable;", "", "points", "plusMinus", "threePointsMade", "threePointAttempts", "freeThrowsMade", "freeThrowAttempts", "fieldGoalsMade", "fieldGoalAttempts", "rebounds", "defensiveRebounds", "offensiveRebounds", "turnovers", "blocks", "personalFouls", "flagrantFouls", "offensiveFoulsAgainst", "technicalFouls", "assists", "steals", "", "fieldGoalsPercentage", "freeThrowsPercentage", "threePointsPercentage", "assistTurnoverRatio", "pointsAgainst", "threePointsPercentageAgainst", "effectiveFieldGoalPercentage", "trueShootingPercentage", "trueShootingPercentageAgainst", "benchPoints", "pointsInPaint", "secondChancePoints", "matches", "awardedMatches", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "seen0", "seen1", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballTeamSeasonStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getPoints", "()Ljava/lang/Integer;", "getPlusMinus", "getThreePointsMade", "getThreePointAttempts", "getFreeThrowsMade", "getFreeThrowAttempts", "getFieldGoalsMade", "getFieldGoalAttempts", "getRebounds", "getDefensiveRebounds", "getOffensiveRebounds", "getTurnovers", "getBlocks", "getPersonalFouls", "getFlagrantFouls", "getOffensiveFoulsAgainst", "getTechnicalFouls", "getAssists", "getSteals", "Ljava/lang/Double;", "getFieldGoalsPercentage", "()Ljava/lang/Double;", "getFreeThrowsPercentage", "getThreePointsPercentage", "getAssistTurnoverRatio", "getPointsAgainst", "getThreePointsPercentageAgainst", "getEffectiveFieldGoalPercentage", "getTrueShootingPercentage", "getTrueShootingPercentageAgainst", "getBenchPoints", "getPointsInPaint", "getSecondChancePoints", "getMatches", "I", "getAwardedMatches", "()I", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BasketballTeamSeasonStatistics implements TeamSeasonStatistics, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double assistTurnoverRatio;

    @Nullable
    private final Integer assists;
    private final int awardedMatches;

    @Nullable
    private final Integer benchPoints;

    @Nullable
    private final Integer blocks;

    @Nullable
    private final Integer defensiveRebounds;

    @Nullable
    private final Double effectiveFieldGoalPercentage;

    @Nullable
    private final Integer fieldGoalAttempts;

    @Nullable
    private final Integer fieldGoalsMade;

    @Nullable
    private final Double fieldGoalsPercentage;

    @Nullable
    private final Integer flagrantFouls;

    @Nullable
    private final Integer freeThrowAttempts;

    @Nullable
    private final Integer freeThrowsMade;

    @Nullable
    private final Double freeThrowsPercentage;

    @Nullable
    private final Integer matches;

    @Nullable
    private final Integer offensiveFoulsAgainst;

    @Nullable
    private final Integer offensiveRebounds;

    @Nullable
    private final Integer personalFouls;

    @Nullable
    private final Integer plusMinus;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer pointsAgainst;

    @Nullable
    private final Integer pointsInPaint;

    @Nullable
    private final Integer rebounds;

    @Nullable
    private final Integer secondChancePoints;

    @Nullable
    private final Integer steals;

    @Nullable
    private final Integer technicalFouls;

    @Nullable
    private final Integer threePointAttempts;

    @Nullable
    private final Integer threePointsMade;

    @Nullable
    private final Double threePointsPercentage;

    @Nullable
    private final Double threePointsPercentageAgainst;

    @Nullable
    private final Double trueShootingPercentage;

    @Nullable
    private final Double trueShootingPercentageAgainst;

    @Nullable
    private final Integer turnovers;

    public /* synthetic */ BasketballTeamSeasonStatistics(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Double d, Double d2, Double d3, Double d4, Integer num20, Double d5, Double d6, Double d7, Double d8, Integer num21, Integer num22, Integer num23, Integer num24, int i3, t5h t5hVar) {
        if ((1 != (i2 & 1)) || (-1 != i)) {
            oea.y(new int[]{i, i2}, new int[]{-1, 1}, BasketballTeamSeasonStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = num;
        this.plusMinus = num2;
        this.threePointsMade = num3;
        this.threePointAttempts = num4;
        this.freeThrowsMade = num5;
        this.freeThrowAttempts = num6;
        this.fieldGoalsMade = num7;
        this.fieldGoalAttempts = num8;
        this.rebounds = num9;
        this.defensiveRebounds = num10;
        this.offensiveRebounds = num11;
        this.turnovers = num12;
        this.blocks = num13;
        this.personalFouls = num14;
        this.flagrantFouls = num15;
        this.offensiveFoulsAgainst = num16;
        this.technicalFouls = num17;
        this.assists = num18;
        this.steals = num19;
        this.fieldGoalsPercentage = d;
        this.freeThrowsPercentage = d2;
        this.threePointsPercentage = d3;
        this.assistTurnoverRatio = d4;
        this.pointsAgainst = num20;
        this.threePointsPercentageAgainst = d5;
        this.effectiveFieldGoalPercentage = d6;
        this.trueShootingPercentage = d7;
        this.trueShootingPercentageAgainst = d8;
        this.benchPoints = num21;
        this.pointsInPaint = num22;
        this.secondChancePoints = num23;
        this.matches = num24;
        this.awardedMatches = i3;
    }

    public static final /* synthetic */ void write$Self$model_release(BasketballTeamSeasonStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.points);
        output.h(serialDesc, 1, a7aVar, self.plusMinus);
        output.h(serialDesc, 2, a7aVar, self.threePointsMade);
        output.h(serialDesc, 3, a7aVar, self.threePointAttempts);
        output.h(serialDesc, 4, a7aVar, self.freeThrowsMade);
        output.h(serialDesc, 5, a7aVar, self.freeThrowAttempts);
        output.h(serialDesc, 6, a7aVar, self.fieldGoalsMade);
        output.h(serialDesc, 7, a7aVar, self.fieldGoalAttempts);
        output.h(serialDesc, 8, a7aVar, self.rebounds);
        output.h(serialDesc, 9, a7aVar, self.defensiveRebounds);
        output.h(serialDesc, 10, a7aVar, self.offensiveRebounds);
        output.h(serialDesc, 11, a7aVar, self.turnovers);
        output.h(serialDesc, 12, a7aVar, self.blocks);
        output.h(serialDesc, 13, a7aVar, self.personalFouls);
        output.h(serialDesc, 14, a7aVar, self.flagrantFouls);
        output.h(serialDesc, 15, a7aVar, self.offensiveFoulsAgainst);
        output.h(serialDesc, 16, a7aVar, self.technicalFouls);
        output.h(serialDesc, 17, a7aVar, self.assists);
        output.h(serialDesc, 18, a7aVar, self.steals);
        h75 h75Var = h75.a;
        output.h(serialDesc, 19, h75Var, self.fieldGoalsPercentage);
        output.h(serialDesc, 20, h75Var, self.freeThrowsPercentage);
        output.h(serialDesc, 21, h75Var, self.threePointsPercentage);
        output.h(serialDesc, 22, h75Var, self.assistTurnoverRatio);
        output.h(serialDesc, 23, a7aVar, self.pointsAgainst);
        output.h(serialDesc, 24, h75Var, self.threePointsPercentageAgainst);
        output.h(serialDesc, 25, h75Var, self.effectiveFieldGoalPercentage);
        output.h(serialDesc, 26, h75Var, self.trueShootingPercentage);
        output.h(serialDesc, 27, h75Var, self.trueShootingPercentageAgainst);
        output.h(serialDesc, 28, a7aVar, self.benchPoints);
        output.h(serialDesc, 29, a7aVar, self.pointsInPaint);
        output.h(serialDesc, 30, a7aVar, self.secondChancePoints);
        output.h(serialDesc, 31, a7aVar, self.matches);
        output.u(32, self.awardedMatches, serialDesc);
    }

    @Nullable
    public final Double getAssistTurnoverRatio() {
        return this.assistTurnoverRatio;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    public final int getAwardedMatches() {
        return this.awardedMatches;
    }

    @Nullable
    public final Integer getBenchPoints() {
        return this.benchPoints;
    }

    @Nullable
    public final Integer getBlocks() {
        return this.blocks;
    }

    @Nullable
    public final Integer getDefensiveRebounds() {
        return this.defensiveRebounds;
    }

    @Nullable
    public final Double getEffectiveFieldGoalPercentage() {
        return this.effectiveFieldGoalPercentage;
    }

    @Nullable
    public final Integer getFieldGoalAttempts() {
        return this.fieldGoalAttempts;
    }

    @Nullable
    public final Integer getFieldGoalsMade() {
        return this.fieldGoalsMade;
    }

    @Nullable
    public final Double getFieldGoalsPercentage() {
        return this.fieldGoalsPercentage;
    }

    @Nullable
    public final Integer getFlagrantFouls() {
        return this.flagrantFouls;
    }

    @Nullable
    public final Integer getFreeThrowAttempts() {
        return this.freeThrowAttempts;
    }

    @Nullable
    public final Integer getFreeThrowsMade() {
        return this.freeThrowsMade;
    }

    @Nullable
    public final Double getFreeThrowsPercentage() {
        return this.freeThrowsPercentage;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final Integer getOffensiveFoulsAgainst() {
        return this.offensiveFoulsAgainst;
    }

    @Nullable
    public final Integer getOffensiveRebounds() {
        return this.offensiveRebounds;
    }

    @Nullable
    public final Integer getPersonalFouls() {
        return this.personalFouls;
    }

    @Nullable
    public final Integer getPlusMinus() {
        return this.plusMinus;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    public final Integer getPointsAgainst() {
        return this.pointsAgainst;
    }

    @Nullable
    public final Integer getPointsInPaint() {
        return this.pointsInPaint;
    }

    @Nullable
    public final Integer getRebounds() {
        return this.rebounds;
    }

    @Nullable
    public final Integer getSecondChancePoints() {
        return this.secondChancePoints;
    }

    @Nullable
    public final Integer getSteals() {
        return this.steals;
    }

    @Nullable
    public final Integer getTechnicalFouls() {
        return this.technicalFouls;
    }

    @Nullable
    public final Integer getThreePointAttempts() {
        return this.threePointAttempts;
    }

    @Nullable
    public final Integer getThreePointsMade() {
        return this.threePointsMade;
    }

    @Nullable
    public final Double getThreePointsPercentage() {
        return this.threePointsPercentage;
    }

    @Nullable
    public final Double getThreePointsPercentageAgainst() {
        return this.threePointsPercentageAgainst;
    }

    @Nullable
    public final Double getTrueShootingPercentage() {
        return this.trueShootingPercentage;
    }

    @Nullable
    public final Double getTrueShootingPercentageAgainst() {
        return this.trueShootingPercentageAgainst;
    }

    @Nullable
    public final Integer getTurnovers() {
        return this.turnovers;
    }

    public BasketballTeamSeasonStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14, @Nullable Integer num15, @Nullable Integer num16, @Nullable Integer num17, @Nullable Integer num18, @Nullable Integer num19, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Integer num20, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7, @Nullable Double d8, @Nullable Integer num21, @Nullable Integer num22, @Nullable Integer num23, @Nullable Integer num24, int i) {
        this.points = num;
        this.plusMinus = num2;
        this.threePointsMade = num3;
        this.threePointAttempts = num4;
        this.freeThrowsMade = num5;
        this.freeThrowAttempts = num6;
        this.fieldGoalsMade = num7;
        this.fieldGoalAttempts = num8;
        this.rebounds = num9;
        this.defensiveRebounds = num10;
        this.offensiveRebounds = num11;
        this.turnovers = num12;
        this.blocks = num13;
        this.personalFouls = num14;
        this.flagrantFouls = num15;
        this.offensiveFoulsAgainst = num16;
        this.technicalFouls = num17;
        this.assists = num18;
        this.steals = num19;
        this.fieldGoalsPercentage = d;
        this.freeThrowsPercentage = d2;
        this.threePointsPercentage = d3;
        this.assistTurnoverRatio = d4;
        this.pointsAgainst = num20;
        this.threePointsPercentageAgainst = d5;
        this.effectiveFieldGoalPercentage = d6;
        this.trueShootingPercentage = d7;
        this.trueShootingPercentageAgainst = d8;
        this.benchPoints = num21;
        this.pointsInPaint = num22;
        this.secondChancePoints = num23;
        this.matches = num24;
        this.awardedMatches = i;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballTeamSeasonStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/team/BasketballTeamSeasonStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketballTeamSeasonStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
