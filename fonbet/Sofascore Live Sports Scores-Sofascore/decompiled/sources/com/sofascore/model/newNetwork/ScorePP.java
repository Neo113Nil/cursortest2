package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.a7a;
import defpackage.oea;
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
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBU\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b$\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b%\u0010\"J\u0019\u0010&\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b&\u0010\"JL\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00102R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/sofascore/model/newNetwork/ScorePP;", "Ljava/io/Serializable;", "", "homeScore", "awayScore", "serving", "scoring", "throwing", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ScorePP;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomeScore", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "getAwayScore", "getScoring", "getServing", "getThrowing", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/ScorePP;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScorePP implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer awayScore;

    @Nullable
    private final Integer homeScore;

    @Nullable
    private final Integer scoring;

    @Nullable
    private final Integer serving;
    private boolean shouldReverseTeams;

    @Nullable
    private final Integer throwing;

    public /* synthetic */ ScorePP(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, ScorePP$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeScore = num;
        this.awayScore = num2;
        this.serving = num3;
        this.scoring = num4;
        this.throwing = num5;
        if ((i & 32) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Integer getHomeScore() {
        return this.homeScore;
    }

    /* renamed from: component2, reason: from getter */
    private final Integer getAwayScore() {
        return this.awayScore;
    }

    /* renamed from: component3, reason: from getter */
    private final Integer getServing() {
        return this.serving;
    }

    /* renamed from: component4, reason: from getter */
    private final Integer getScoring() {
        return this.scoring;
    }

    /* renamed from: component5, reason: from getter */
    private final Integer getThrowing() {
        return this.throwing;
    }

    public static /* synthetic */ ScorePP copy$default(ScorePP scorePP, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, Object obj) {
        if ((i & 1) != 0) {
            num = scorePP.homeScore;
        }
        if ((i & 2) != 0) {
            num2 = scorePP.awayScore;
        }
        if ((i & 4) != 0) {
            num3 = scorePP.serving;
        }
        if ((i & 8) != 0) {
            num4 = scorePP.scoring;
        }
        if ((i & 16) != 0) {
            num5 = scorePP.throwing;
        }
        Integer num6 = num5;
        Integer num7 = num3;
        return scorePP.copy(num, num2, num7, num4, num6);
    }

    public static /* synthetic */ Integer getAwayScore$default(ScorePP scorePP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return scorePP.getAwayScore(teamSides);
    }

    public static /* synthetic */ Integer getHomeScore$default(ScorePP scorePP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return scorePP.getHomeScore(teamSides);
    }

    public static /* synthetic */ Integer getScoring$default(ScorePP scorePP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return scorePP.getScoring(teamSides);
    }

    public static /* synthetic */ Integer getServing$default(ScorePP scorePP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return scorePP.getServing(teamSides);
    }

    public static /* synthetic */ Integer getThrowing$default(ScorePP scorePP, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return scorePP.getThrowing(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(ScorePP self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.homeScore);
        output.h(serialDesc, 1, a7aVar, self.awayScore);
        output.h(serialDesc, 2, a7aVar, self.serving);
        output.h(serialDesc, 3, a7aVar, self.scoring);
        output.h(serialDesc, 4, a7aVar, self.throwing);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 5, self.shouldReverseTeams);
        }
    }

    @NotNull
    public final ScorePP copy(@Nullable Integer homeScore, @Nullable Integer awayScore, @Nullable Integer serving, @Nullable Integer scoring, @Nullable Integer throwing) {
        return new ScorePP(homeScore, awayScore, serving, scoring, throwing);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScorePP)) {
            return false;
        }
        ScorePP scorePP = (ScorePP) other;
        return Intrinsics.c(this.homeScore, scorePP.homeScore) && Intrinsics.c(this.awayScore, scorePP.awayScore) && Intrinsics.c(this.serving, scorePP.serving) && Intrinsics.c(this.scoring, scorePP.scoring) && Intrinsics.c(this.throwing, scorePP.throwing);
    }

    @Nullable
    public final Integer getAwayScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeScore : this.awayScore;
    }

    @Nullable
    public final Integer getHomeScore(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayScore : this.homeScore;
    }

    @Nullable
    public final Integer getScoring(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.scoring;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.scoring;
        }
        num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    @Nullable
    public final Integer getServing(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.serving;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.serving;
        }
        num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    @Nullable
    public final Integer getThrowing(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.throwing;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.throwing;
        }
        num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public int hashCode() {
        Integer num = this.homeScore;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.awayScore;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.serving;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.scoring;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.throwing;
        return hashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        Integer num = this.homeScore;
        Integer num2 = this.awayScore;
        Integer num3 = this.serving;
        Integer num4 = this.scoring;
        Integer num5 = this.throwing;
        StringBuilder k = wv8.k(num, "ScorePP(homeScore=", ", awayScore=", ", serving=", num2);
        vxd.r(num3, num4, ", scoring=", ", throwing=", k);
        return vxd.n(k, num5, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ScorePP$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ScorePP;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ScorePP$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ScorePP(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5) {
        this.homeScore = num;
        this.awayScore = num2;
        this.serving = num3;
        this.scoring = num4;
        this.throwing = num5;
    }
}
