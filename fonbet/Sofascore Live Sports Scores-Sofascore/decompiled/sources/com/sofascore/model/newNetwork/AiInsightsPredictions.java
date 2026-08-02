package com.sofascore.model.newNetwork;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.c0;
import defpackage.gz1;
import defpackage.h75;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(Jl\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010#J\u001a\u00100\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b9\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R%\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010(¨\u0006@"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsPredictions;", "", "", "yellowCards", "corners", "", "bothTeamsToScore", "homeNormaltimeScore", "awayNormaltimeScore", "Lcom/sofascore/model/newNetwork/AiInsightsWinningProbability;", "winningProbability", "", "", "possibleResultsMatrix", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;IILcom/sofascore/model/newNetwork/AiInsightsWinningProbability;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;IILcom/sofascore/model/newNetwork/AiInsightsWinningProbability;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AiInsightsPredictions;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()I", "component5", "component6", "()Lcom/sofascore/model/newNetwork/AiInsightsWinningProbability;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;IILcom/sofascore/model/newNetwork/AiInsightsWinningProbability;Ljava/util/List;)Lcom/sofascore/model/newNetwork/AiInsightsPredictions;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getYellowCards", "getCorners", "Ljava/lang/Boolean;", "getBothTeamsToScore", "I", "getHomeNormaltimeScore", "getAwayNormaltimeScore", "Lcom/sofascore/model/newNetwork/AiInsightsWinningProbability;", "getWinningProbability", "Ljava/util/List;", "getPossibleResultsMatrix", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiInsightsPredictions {
    private final int awayNormaltimeScore;

    @Nullable
    private final Boolean bothTeamsToScore;

    @Nullable
    private final Integer corners;
    private final int homeNormaltimeScore;

    @Nullable
    private final List<List<Double>> possibleResultsMatrix;

    @Nullable
    private final AiInsightsWinningProbability winningProbability;

    @Nullable
    private final Integer yellowCards;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, null, ypa.a(ysa.b, new c0(22))};

    public /* synthetic */ AiInsightsPredictions(int i, Integer num, Integer num2, Boolean bool, int i2, int i3, AiInsightsWinningProbability aiInsightsWinningProbability, List list, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, AiInsightsPredictions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.yellowCards = num;
        this.corners = num2;
        this.bothTeamsToScore = bool;
        this.homeNormaltimeScore = i2;
        this.awayNormaltimeScore = i3;
        this.winningProbability = aiInsightsWinningProbability;
        this.possibleResultsMatrix = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(new xg0(h75.a, 0), 0);
    }

    public static /* synthetic */ AiInsightsPredictions copy$default(AiInsightsPredictions aiInsightsPredictions, Integer num, Integer num2, Boolean bool, int i, int i2, AiInsightsWinningProbability aiInsightsWinningProbability, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            num = aiInsightsPredictions.yellowCards;
        }
        if ((i3 & 2) != 0) {
            num2 = aiInsightsPredictions.corners;
        }
        if ((i3 & 4) != 0) {
            bool = aiInsightsPredictions.bothTeamsToScore;
        }
        if ((i3 & 8) != 0) {
            i = aiInsightsPredictions.homeNormaltimeScore;
        }
        if ((i3 & 16) != 0) {
            i2 = aiInsightsPredictions.awayNormaltimeScore;
        }
        if ((i3 & 32) != 0) {
            aiInsightsWinningProbability = aiInsightsPredictions.winningProbability;
        }
        if ((i3 & 64) != 0) {
            list = aiInsightsPredictions.possibleResultsMatrix;
        }
        AiInsightsWinningProbability aiInsightsWinningProbability2 = aiInsightsWinningProbability;
        List list2 = list;
        int i4 = i2;
        Boolean bool2 = bool;
        return aiInsightsPredictions.copy(num, num2, bool2, i, i4, aiInsightsWinningProbability2, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(AiInsightsPredictions self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.yellowCards);
        output.h(serialDesc, 1, a7aVar, self.corners);
        output.h(serialDesc, 2, gz1.a, self.bothTeamsToScore);
        output.u(3, self.homeNormaltimeScore, serialDesc);
        output.u(4, self.awayNormaltimeScore, serialDesc);
        output.h(serialDesc, 5, AiInsightsWinningProbability$$serializer.INSTANCE, self.winningProbability);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.possibleResultsMatrix);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCorners() {
        return this.corners;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getBothTeamsToScore() {
        return this.bothTeamsToScore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHomeNormaltimeScore() {
        return this.homeNormaltimeScore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAwayNormaltimeScore() {
        return this.awayNormaltimeScore;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final AiInsightsWinningProbability getWinningProbability() {
        return this.winningProbability;
    }

    @Nullable
    public final List<List<Double>> component7() {
        return this.possibleResultsMatrix;
    }

    @NotNull
    public final AiInsightsPredictions copy(@Nullable Integer yellowCards, @Nullable Integer corners, @Nullable Boolean bothTeamsToScore, int homeNormaltimeScore, int awayNormaltimeScore, @Nullable AiInsightsWinningProbability winningProbability, @Nullable List<? extends List<Double>> possibleResultsMatrix) {
        return new AiInsightsPredictions(yellowCards, corners, bothTeamsToScore, homeNormaltimeScore, awayNormaltimeScore, winningProbability, possibleResultsMatrix);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInsightsPredictions)) {
            return false;
        }
        AiInsightsPredictions aiInsightsPredictions = (AiInsightsPredictions) other;
        return Intrinsics.c(this.yellowCards, aiInsightsPredictions.yellowCards) && Intrinsics.c(this.corners, aiInsightsPredictions.corners) && Intrinsics.c(this.bothTeamsToScore, aiInsightsPredictions.bothTeamsToScore) && this.homeNormaltimeScore == aiInsightsPredictions.homeNormaltimeScore && this.awayNormaltimeScore == aiInsightsPredictions.awayNormaltimeScore && Intrinsics.c(this.winningProbability, aiInsightsPredictions.winningProbability) && Intrinsics.c(this.possibleResultsMatrix, aiInsightsPredictions.possibleResultsMatrix);
    }

    public final int getAwayNormaltimeScore() {
        return this.awayNormaltimeScore;
    }

    @Nullable
    public final Boolean getBothTeamsToScore() {
        return this.bothTeamsToScore;
    }

    @Nullable
    public final Integer getCorners() {
        return this.corners;
    }

    public final int getHomeNormaltimeScore() {
        return this.homeNormaltimeScore;
    }

    @Nullable
    public final List<List<Double>> getPossibleResultsMatrix() {
        return this.possibleResultsMatrix;
    }

    @Nullable
    public final AiInsightsWinningProbability getWinningProbability() {
        return this.winningProbability;
    }

    @Nullable
    public final Integer getYellowCards() {
        return this.yellowCards;
    }

    public int hashCode() {
        Integer num = this.yellowCards;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.corners;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.bothTeamsToScore;
        int a = wv8.a(this.awayNormaltimeScore, wv8.a(this.homeNormaltimeScore, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31);
        AiInsightsWinningProbability aiInsightsWinningProbability = this.winningProbability;
        int hashCode3 = (a + (aiInsightsWinningProbability == null ? 0 : aiInsightsWinningProbability.hashCode())) * 31;
        List<List<Double>> list = this.possibleResultsMatrix;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.yellowCards;
        Integer num2 = this.corners;
        Boolean bool = this.bothTeamsToScore;
        int i = this.homeNormaltimeScore;
        int i2 = this.awayNormaltimeScore;
        AiInsightsWinningProbability aiInsightsWinningProbability = this.winningProbability;
        List<List<Double>> list = this.possibleResultsMatrix;
        StringBuilder k = wv8.k(num, "AiInsightsPredictions(yellowCards=", ", corners=", ", bothTeamsToScore=", num2);
        k.append(bool);
        k.append(", homeNormaltimeScore=");
        k.append(i);
        k.append(", awayNormaltimeScore=");
        k.append(i2);
        k.append(", winningProbability=");
        k.append(aiInsightsWinningProbability);
        k.append(", possibleResultsMatrix=");
        return mz1.p(k, list, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsPredictions$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AiInsightsPredictions;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AiInsightsPredictions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiInsightsPredictions(@Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, int i, int i2, @Nullable AiInsightsWinningProbability aiInsightsWinningProbability, @Nullable List<? extends List<Double>> list) {
        this.yellowCards = num;
        this.corners = num2;
        this.bothTeamsToScore = bool;
        this.homeNormaltimeScore = i;
        this.awayNormaltimeScore = i2;
        this.winningProbability = aiInsightsWinningProbability;
        this.possibleResultsMatrix = list;
    }
}
