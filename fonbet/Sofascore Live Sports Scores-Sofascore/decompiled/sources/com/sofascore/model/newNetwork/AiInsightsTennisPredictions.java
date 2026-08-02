package com.sofascore.model.newNetwork;

import com.appsflyer.internal.i;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.a7a;
import defpackage.c0;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0002YXB¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018B¹\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010 J\u0012\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b+\u0010 J\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u0010$J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b0\u0010$JÊ\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b6\u00107J\u001a\u00109\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:J'\u0010C\u001a\u00020@2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>H\u0001¢\u0006\u0004\bA\u0010BR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010D\u001a\u0004\bE\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010F\u001a\u0004\bG\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010H\u001a\u0004\bI\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\bK\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bL\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010F\u001a\u0004\bM\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010(R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010N\u001a\u0004\bP\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bQ\u0010 R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bR\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bS\u0010\"R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010T\u001a\u0004\bU\u0010.R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010J\u001a\u0004\bV\u0010$R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bW\u0010$¨\u0006Z"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "", "Lcom/sofascore/model/mvvm/model/Player;", "firstSetWinner", "", "firstSetWinnerProbability", "", "firstSetGamesCount", "", "Lcom/sofascore/model/newNetwork/AiInsightsTennisPossibleResult;", "possibleFirstSetResults", "secondSetWinner", "secondSetWinnerProbability", "", "homeWinsASet", "awayWinsASet", "homeTotalGames", "awayTotalGames", "totalGamesCount", "Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;", "winningProbability", "possibleHomeResults", "possibleAwayResults", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;Ljava/util/List;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Double;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "component11", "component12", "()Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;", "component13", "component14", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/Player;", "getFirstSetWinner", "Ljava/lang/Integer;", "getFirstSetWinnerProbability", "Ljava/lang/Double;", "getFirstSetGamesCount", "Ljava/util/List;", "getPossibleFirstSetResults", "getSecondSetWinner", "getSecondSetWinnerProbability", "Ljava/lang/Boolean;", "getHomeWinsASet", "getAwayWinsASet", "getHomeTotalGames", "getAwayTotalGames", "getTotalGamesCount", "Lcom/sofascore/model/newNetwork/AiInsightsTennisWinningProbability;", "getWinningProbability", "getPossibleHomeResults", "getPossibleAwayResults", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiInsightsTennisPredictions {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer awayTotalGames;

    @Nullable
    private final Boolean awayWinsASet;

    @Nullable
    private final Double firstSetGamesCount;

    @Nullable
    private final Player firstSetWinner;

    @Nullable
    private final Integer firstSetWinnerProbability;

    @Nullable
    private final Integer homeTotalGames;

    @Nullable
    private final Boolean homeWinsASet;

    @Nullable
    private final List<AiInsightsTennisPossibleResult> possibleAwayResults;

    @Nullable
    private final List<AiInsightsTennisPossibleResult> possibleFirstSetResults;

    @Nullable
    private final List<AiInsightsTennisPossibleResult> possibleHomeResults;

    @Nullable
    private final Player secondSetWinner;

    @Nullable
    private final Integer secondSetWinnerProbability;

    @Nullable
    private final Double totalGamesCount;

    @Nullable
    private final AiInsightsTennisWinningProbability winningProbability;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new c0(23)), null, null, null, null, null, null, null, null, ypa.a(ysaVar, new c0(24)), ypa.a(ysaVar, new c0(25))};
    }

    public /* synthetic */ AiInsightsTennisPredictions(int i, Player player, Integer num, Double d, List list, Player player2, Integer num2, Boolean bool, Boolean bool2, Integer num3, Integer num4, Double d2, AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability, List list2, List list3, t5h t5hVar) {
        if (16383 != (i & 16383)) {
            oea.z(i, 16383, AiInsightsTennisPredictions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.firstSetWinner = player;
        this.firstSetWinnerProbability = num;
        this.firstSetGamesCount = d;
        this.possibleFirstSetResults = list;
        this.secondSetWinner = player2;
        this.secondSetWinnerProbability = num2;
        this.homeWinsASet = bool;
        this.awayWinsASet = bool2;
        this.homeTotalGames = num3;
        this.awayTotalGames = num4;
        this.totalGamesCount = d2;
        this.winningProbability = aiInsightsTennisWinningProbability;
        this.possibleHomeResults = list2;
        this.possibleAwayResults = list3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(AiInsightsTennisPossibleResult$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(AiInsightsTennisPossibleResult$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(AiInsightsTennisPossibleResult$$serializer.INSTANCE, 0);
    }

    public static final /* synthetic */ void write$Self$model_release(AiInsightsTennisPredictions self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        Player$$serializer player$$serializer = Player$$serializer.INSTANCE;
        output.h(serialDesc, 0, player$$serializer, self.firstSetWinner);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.firstSetWinnerProbability);
        h75 h75Var = h75.a;
        output.h(serialDesc, 2, h75Var, self.firstSetGamesCount);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.possibleFirstSetResults);
        output.h(serialDesc, 4, player$$serializer, self.secondSetWinner);
        output.h(serialDesc, 5, a7aVar, self.secondSetWinnerProbability);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 6, gz1Var, self.homeWinsASet);
        output.h(serialDesc, 7, gz1Var, self.awayWinsASet);
        output.h(serialDesc, 8, a7aVar, self.homeTotalGames);
        output.h(serialDesc, 9, a7aVar, self.awayTotalGames);
        output.h(serialDesc, 10, h75Var, self.totalGamesCount);
        output.h(serialDesc, 11, AiInsightsTennisWinningProbability$$serializer.INSTANCE, self.winningProbability);
        output.h(serialDesc, 12, (KSerializer) joaVarArr[12].getValue(), self.possibleHomeResults);
        output.h(serialDesc, 13, (KSerializer) joaVarArr[13].getValue(), self.possibleAwayResults);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Player getFirstSetWinner() {
        return this.firstSetWinner;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getAwayTotalGames() {
        return this.awayTotalGames;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Double getTotalGamesCount() {
        return this.totalGamesCount;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final AiInsightsTennisWinningProbability getWinningProbability() {
        return this.winningProbability;
    }

    @Nullable
    public final List<AiInsightsTennisPossibleResult> component13() {
        return this.possibleHomeResults;
    }

    @Nullable
    public final List<AiInsightsTennisPossibleResult> component14() {
        return this.possibleAwayResults;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getFirstSetWinnerProbability() {
        return this.firstSetWinnerProbability;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getFirstSetGamesCount() {
        return this.firstSetGamesCount;
    }

    @Nullable
    public final List<AiInsightsTennisPossibleResult> component4() {
        return this.possibleFirstSetResults;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Player getSecondSetWinner() {
        return this.secondSetWinner;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getSecondSetWinnerProbability() {
        return this.secondSetWinnerProbability;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Boolean getHomeWinsASet() {
        return this.homeWinsASet;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getAwayWinsASet() {
        return this.awayWinsASet;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getHomeTotalGames() {
        return this.homeTotalGames;
    }

    @NotNull
    public final AiInsightsTennisPredictions copy(@Nullable Player firstSetWinner, @Nullable Integer firstSetWinnerProbability, @Nullable Double firstSetGamesCount, @Nullable List<AiInsightsTennisPossibleResult> possibleFirstSetResults, @Nullable Player secondSetWinner, @Nullable Integer secondSetWinnerProbability, @Nullable Boolean homeWinsASet, @Nullable Boolean awayWinsASet, @Nullable Integer homeTotalGames, @Nullable Integer awayTotalGames, @Nullable Double totalGamesCount, @Nullable AiInsightsTennisWinningProbability winningProbability, @Nullable List<AiInsightsTennisPossibleResult> possibleHomeResults, @Nullable List<AiInsightsTennisPossibleResult> possibleAwayResults) {
        return new AiInsightsTennisPredictions(firstSetWinner, firstSetWinnerProbability, firstSetGamesCount, possibleFirstSetResults, secondSetWinner, secondSetWinnerProbability, homeWinsASet, awayWinsASet, homeTotalGames, awayTotalGames, totalGamesCount, winningProbability, possibleHomeResults, possibleAwayResults);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInsightsTennisPredictions)) {
            return false;
        }
        AiInsightsTennisPredictions aiInsightsTennisPredictions = (AiInsightsTennisPredictions) other;
        return Intrinsics.c(this.firstSetWinner, aiInsightsTennisPredictions.firstSetWinner) && Intrinsics.c(this.firstSetWinnerProbability, aiInsightsTennisPredictions.firstSetWinnerProbability) && Intrinsics.c(this.firstSetGamesCount, aiInsightsTennisPredictions.firstSetGamesCount) && Intrinsics.c(this.possibleFirstSetResults, aiInsightsTennisPredictions.possibleFirstSetResults) && Intrinsics.c(this.secondSetWinner, aiInsightsTennisPredictions.secondSetWinner) && Intrinsics.c(this.secondSetWinnerProbability, aiInsightsTennisPredictions.secondSetWinnerProbability) && Intrinsics.c(this.homeWinsASet, aiInsightsTennisPredictions.homeWinsASet) && Intrinsics.c(this.awayWinsASet, aiInsightsTennisPredictions.awayWinsASet) && Intrinsics.c(this.homeTotalGames, aiInsightsTennisPredictions.homeTotalGames) && Intrinsics.c(this.awayTotalGames, aiInsightsTennisPredictions.awayTotalGames) && Intrinsics.c(this.totalGamesCount, aiInsightsTennisPredictions.totalGamesCount) && Intrinsics.c(this.winningProbability, aiInsightsTennisPredictions.winningProbability) && Intrinsics.c(this.possibleHomeResults, aiInsightsTennisPredictions.possibleHomeResults) && Intrinsics.c(this.possibleAwayResults, aiInsightsTennisPredictions.possibleAwayResults);
    }

    @Nullable
    public final Integer getAwayTotalGames() {
        return this.awayTotalGames;
    }

    @Nullable
    public final Boolean getAwayWinsASet() {
        return this.awayWinsASet;
    }

    @Nullable
    public final Double getFirstSetGamesCount() {
        return this.firstSetGamesCount;
    }

    @Nullable
    public final Player getFirstSetWinner() {
        return this.firstSetWinner;
    }

    @Nullable
    public final Integer getFirstSetWinnerProbability() {
        return this.firstSetWinnerProbability;
    }

    @Nullable
    public final Integer getHomeTotalGames() {
        return this.homeTotalGames;
    }

    @Nullable
    public final Boolean getHomeWinsASet() {
        return this.homeWinsASet;
    }

    @Nullable
    public final List<AiInsightsTennisPossibleResult> getPossibleAwayResults() {
        return this.possibleAwayResults;
    }

    @Nullable
    public final List<AiInsightsTennisPossibleResult> getPossibleFirstSetResults() {
        return this.possibleFirstSetResults;
    }

    @Nullable
    public final List<AiInsightsTennisPossibleResult> getPossibleHomeResults() {
        return this.possibleHomeResults;
    }

    @Nullable
    public final Player getSecondSetWinner() {
        return this.secondSetWinner;
    }

    @Nullable
    public final Integer getSecondSetWinnerProbability() {
        return this.secondSetWinnerProbability;
    }

    @Nullable
    public final Double getTotalGamesCount() {
        return this.totalGamesCount;
    }

    @Nullable
    public final AiInsightsTennisWinningProbability getWinningProbability() {
        return this.winningProbability;
    }

    public int hashCode() {
        Player player = this.firstSetWinner;
        int hashCode = (player == null ? 0 : player.hashCode()) * 31;
        Integer num = this.firstSetWinnerProbability;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.firstSetGamesCount;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        List<AiInsightsTennisPossibleResult> list = this.possibleFirstSetResults;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Player player2 = this.secondSetWinner;
        int hashCode5 = (hashCode4 + (player2 == null ? 0 : player2.hashCode())) * 31;
        Integer num2 = this.secondSetWinnerProbability;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.homeWinsASet;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.awayWinsASet;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.homeTotalGames;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.awayTotalGames;
        int hashCode10 = (hashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d2 = this.totalGamesCount;
        int hashCode11 = (hashCode10 + (d2 == null ? 0 : d2.hashCode())) * 31;
        AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability = this.winningProbability;
        int hashCode12 = (hashCode11 + (aiInsightsTennisWinningProbability == null ? 0 : aiInsightsTennisWinningProbability.hashCode())) * 31;
        List<AiInsightsTennisPossibleResult> list2 = this.possibleHomeResults;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AiInsightsTennisPossibleResult> list3 = this.possibleAwayResults;
        return hashCode13 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Player player = this.firstSetWinner;
        Integer num = this.firstSetWinnerProbability;
        Double d = this.firstSetGamesCount;
        List<AiInsightsTennisPossibleResult> list = this.possibleFirstSetResults;
        Player player2 = this.secondSetWinner;
        Integer num2 = this.secondSetWinnerProbability;
        Boolean bool = this.homeWinsASet;
        Boolean bool2 = this.awayWinsASet;
        Integer num3 = this.homeTotalGames;
        Integer num4 = this.awayTotalGames;
        Double d2 = this.totalGamesCount;
        AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability = this.winningProbability;
        List<AiInsightsTennisPossibleResult> list2 = this.possibleHomeResults;
        List<AiInsightsTennisPossibleResult> list3 = this.possibleAwayResults;
        StringBuilder sb = new StringBuilder("AiInsightsTennisPredictions(firstSetWinner=");
        sb.append(player);
        sb.append(", firstSetWinnerProbability=");
        sb.append(num);
        sb.append(", firstSetGamesCount=");
        sb.append(d);
        sb.append(", possibleFirstSetResults=");
        sb.append(list);
        sb.append(", secondSetWinner=");
        sb.append(player2);
        sb.append(", secondSetWinnerProbability=");
        sb.append(num2);
        sb.append(", homeWinsASet=");
        i.q(sb, bool, ", awayWinsASet=", bool2, ", homeTotalGames=");
        vxd.r(num3, num4, ", awayTotalGames=", ", totalGamesCount=", sb);
        sb.append(d2);
        sb.append(", winningProbability=");
        sb.append(aiInsightsTennisWinningProbability);
        sb.append(", possibleHomeResults=");
        return me4.j(sb, list2, ", possibleAwayResults=", list3, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AiInsightsTennisPredictions;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AiInsightsTennisPredictions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiInsightsTennisPredictions(@Nullable Player player, @Nullable Integer num, @Nullable Double d, @Nullable List<AiInsightsTennisPossibleResult> list, @Nullable Player player2, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Double d2, @Nullable AiInsightsTennisWinningProbability aiInsightsTennisWinningProbability, @Nullable List<AiInsightsTennisPossibleResult> list2, @Nullable List<AiInsightsTennisPossibleResult> list3) {
        this.firstSetWinner = player;
        this.firstSetWinnerProbability = num;
        this.firstSetGamesCount = d;
        this.possibleFirstSetResults = list;
        this.secondSetWinner = player2;
        this.secondSetWinnerProbability = num2;
        this.homeWinsASet = bool;
        this.awayWinsASet = bool2;
        this.homeTotalGames = num3;
        this.awayTotalGames = num4;
        this.totalGamesCount = d2;
        this.winningProbability = aiInsightsTennisWinningProbability;
        this.possibleHomeResults = list2;
        this.possibleAwayResults = list3;
    }
}
