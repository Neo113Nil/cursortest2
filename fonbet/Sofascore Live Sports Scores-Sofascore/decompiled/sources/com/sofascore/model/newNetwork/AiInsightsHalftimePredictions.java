package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import defpackage.c0;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!JH\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010!J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b4\u0010!¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsHalftimePredictions;", "", "Lcom/sofascore/model/mvvm/model/Team;", "nextTeamToScore", "Lcom/sofascore/model/mvvm/model/Player;", "playerToScore", "", "secondHalfOverOneAndAHalfGoals", "", "homeNormaltimeScore", "awayNormaltimeScore", "<init>", "(Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Boolean;II)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Boolean;IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/AiInsightsHalftimePredictions;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Team;", "component2", "()Lcom/sofascore/model/mvvm/model/Player;", "component3", "()Ljava/lang/Boolean;", "component4", "()I", "component5", "copy", "(Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Player;Ljava/lang/Boolean;II)Lcom/sofascore/model/newNetwork/AiInsightsHalftimePredictions;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Team;", "getNextTeamToScore", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayerToScore", "Ljava/lang/Boolean;", "getSecondHalfOverOneAndAHalfGoals", "I", "getHomeNormaltimeScore", "getAwayNormaltimeScore", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiInsightsHalftimePredictions {
    private final int awayNormaltimeScore;
    private final int homeNormaltimeScore;

    @Nullable
    private final Team nextTeamToScore;

    @Nullable
    private final Player playerToScore;

    @Nullable
    private final Boolean secondHalfOverOneAndAHalfGoals;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new c0(20)), null, null, null, null};

    public /* synthetic */ AiInsightsHalftimePredictions(int i, Team team, Player player, Boolean bool, int i2, int i3, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, AiInsightsHalftimePredictions$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.nextTeamToScore = team;
        this.playerToScore = player;
        this.secondHalfOverOneAndAHalfGoals = bool;
        this.homeNormaltimeScore = i2;
        this.awayNormaltimeScore = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ AiInsightsHalftimePredictions copy$default(AiInsightsHalftimePredictions aiInsightsHalftimePredictions, Team team, Player player, Boolean bool, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            team = aiInsightsHalftimePredictions.nextTeamToScore;
        }
        if ((i3 & 2) != 0) {
            player = aiInsightsHalftimePredictions.playerToScore;
        }
        if ((i3 & 4) != 0) {
            bool = aiInsightsHalftimePredictions.secondHalfOverOneAndAHalfGoals;
        }
        if ((i3 & 8) != 0) {
            i = aiInsightsHalftimePredictions.homeNormaltimeScore;
        }
        if ((i3 & 16) != 0) {
            i2 = aiInsightsHalftimePredictions.awayNormaltimeScore;
        }
        int i4 = i2;
        Boolean bool2 = bool;
        return aiInsightsHalftimePredictions.copy(team, player, bool2, i, i4);
    }

    public static final /* synthetic */ void write$Self$model_release(AiInsightsHalftimePredictions self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.nextTeamToScore);
        output.h(serialDesc, 1, Player$$serializer.INSTANCE, self.playerToScore);
        output.h(serialDesc, 2, gz1.a, self.secondHalfOverOneAndAHalfGoals);
        output.u(3, self.homeNormaltimeScore, serialDesc);
        output.u(4, self.awayNormaltimeScore, serialDesc);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Team getNextTeamToScore() {
        return this.nextTeamToScore;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Player getPlayerToScore() {
        return this.playerToScore;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getSecondHalfOverOneAndAHalfGoals() {
        return this.secondHalfOverOneAndAHalfGoals;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHomeNormaltimeScore() {
        return this.homeNormaltimeScore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAwayNormaltimeScore() {
        return this.awayNormaltimeScore;
    }

    @NotNull
    public final AiInsightsHalftimePredictions copy(@Nullable Team nextTeamToScore, @Nullable Player playerToScore, @Nullable Boolean secondHalfOverOneAndAHalfGoals, int homeNormaltimeScore, int awayNormaltimeScore) {
        return new AiInsightsHalftimePredictions(nextTeamToScore, playerToScore, secondHalfOverOneAndAHalfGoals, homeNormaltimeScore, awayNormaltimeScore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiInsightsHalftimePredictions)) {
            return false;
        }
        AiInsightsHalftimePredictions aiInsightsHalftimePredictions = (AiInsightsHalftimePredictions) other;
        return Intrinsics.c(this.nextTeamToScore, aiInsightsHalftimePredictions.nextTeamToScore) && Intrinsics.c(this.playerToScore, aiInsightsHalftimePredictions.playerToScore) && Intrinsics.c(this.secondHalfOverOneAndAHalfGoals, aiInsightsHalftimePredictions.secondHalfOverOneAndAHalfGoals) && this.homeNormaltimeScore == aiInsightsHalftimePredictions.homeNormaltimeScore && this.awayNormaltimeScore == aiInsightsHalftimePredictions.awayNormaltimeScore;
    }

    public final int getAwayNormaltimeScore() {
        return this.awayNormaltimeScore;
    }

    public final int getHomeNormaltimeScore() {
        return this.homeNormaltimeScore;
    }

    @Nullable
    public final Team getNextTeamToScore() {
        return this.nextTeamToScore;
    }

    @Nullable
    public final Player getPlayerToScore() {
        return this.playerToScore;
    }

    @Nullable
    public final Boolean getSecondHalfOverOneAndAHalfGoals() {
        return this.secondHalfOverOneAndAHalfGoals;
    }

    public int hashCode() {
        Team team = this.nextTeamToScore;
        int hashCode = (team == null ? 0 : team.hashCode()) * 31;
        Player player = this.playerToScore;
        int hashCode2 = (hashCode + (player == null ? 0 : player.hashCode())) * 31;
        Boolean bool = this.secondHalfOverOneAndAHalfGoals;
        return Integer.hashCode(this.awayNormaltimeScore) + wv8.a(this.homeNormaltimeScore, (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        Team team = this.nextTeamToScore;
        Player player = this.playerToScore;
        Boolean bool = this.secondHalfOverOneAndAHalfGoals;
        int i = this.homeNormaltimeScore;
        int i2 = this.awayNormaltimeScore;
        StringBuilder sb = new StringBuilder("AiInsightsHalftimePredictions(nextTeamToScore=");
        sb.append(team);
        sb.append(", playerToScore=");
        sb.append(player);
        sb.append(", secondHalfOverOneAndAHalfGoals=");
        sb.append(bool);
        sb.append(", homeNormaltimeScore=");
        sb.append(i);
        sb.append(", awayNormaltimeScore=");
        return fc6.h(i2, ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/AiInsightsHalftimePredictions$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/AiInsightsHalftimePredictions;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AiInsightsHalftimePredictions$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiInsightsHalftimePredictions(@Nullable Team team, @Nullable Player player, @Nullable Boolean bool, int i, int i2) {
        this.nextTeamToScore = team;
        this.playerToScore = player;
        this.secondHalfOverOneAndAHalfGoals = bool;
        this.homeNormaltimeScore = i;
        this.awayNormaltimeScore = i2;
    }
}
