package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000fJ4\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportRound;", "", "", "outcome", "winnerCode", "homeTeamSide", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLt5h;)V", "component2", "()Ljava/lang/Integer;", "component3", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ESportRound;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getWinnerCode", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/lang/Integer;", "getHomeTeamSide", "component1", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/ESportRound;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getOutcome", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ESportRound {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer homeTeamSide;

    @Nullable
    private final Integer outcome;
    private boolean shouldReverseTeams;

    @Nullable
    private final Integer winnerCode;

    public /* synthetic */ ESportRound(int i, Integer num, Integer num2, Integer num3, boolean z, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, ESportRound$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.outcome = num;
        this.winnerCode = num2;
        this.homeTeamSide = num3;
        if ((i & 8) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* renamed from: component2, reason: from getter */
    private final Integer getWinnerCode() {
        return this.winnerCode;
    }

    /* renamed from: component3, reason: from getter */
    private final Integer getHomeTeamSide() {
        return this.homeTeamSide;
    }

    public static /* synthetic */ ESportRound copy$default(ESportRound eSportRound, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = eSportRound.outcome;
        }
        if ((i & 2) != 0) {
            num2 = eSportRound.winnerCode;
        }
        if ((i & 4) != 0) {
            num3 = eSportRound.homeTeamSide;
        }
        return eSportRound.copy(num, num2, num3);
    }

    public static /* synthetic */ Integer getHomeTeamSide$default(ESportRound eSportRound, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eSportRound.getHomeTeamSide(teamSides);
    }

    public static /* synthetic */ Integer getWinnerCode$default(ESportRound eSportRound, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eSportRound.getWinnerCode(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(ESportRound self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.outcome);
        output.h(serialDesc, 1, a7aVar, self.winnerCode);
        output.h(serialDesc, 2, a7aVar, self.homeTeamSide);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 3, self.shouldReverseTeams);
        }
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getOutcome() {
        return this.outcome;
    }

    @NotNull
    public final ESportRound copy(@Nullable Integer outcome, @Nullable Integer winnerCode, @Nullable Integer homeTeamSide) {
        return new ESportRound(outcome, winnerCode, homeTeamSide);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESportRound)) {
            return false;
        }
        ESportRound eSportRound = (ESportRound) other;
        return Intrinsics.c(this.outcome, eSportRound.outcome) && Intrinsics.c(this.winnerCode, eSportRound.winnerCode) && Intrinsics.c(this.homeTeamSide, eSportRound.homeTeamSide);
    }

    @Nullable
    public final Integer getHomeTeamSide(@NotNull TeamSides side) {
        side.getClass();
        Integer num = this.homeTeamSide;
        if (num != null) {
            return Integer.valueOf(EsportsGameKt.reverseESportsSide(num.intValue(), side == TeamSides.REVERSIBLE && this.shouldReverseTeams));
        }
        return null;
    }

    @Nullable
    public final Integer getOutcome() {
        return this.outcome;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    @Nullable
    public final Integer getWinnerCode(@NotNull TeamSides side) {
        Integer num;
        side.getClass();
        Integer num2 = this.winnerCode;
        if (num2 != null && num2.intValue() == 1) {
            num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 1;
            return Integer.valueOf(num != null ? num.intValue() : 2);
        }
        if (num2 == null || num2.intValue() != 2) {
            return this.winnerCode;
        }
        num = (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? null : 2;
        return Integer.valueOf(num != null ? num.intValue() : 1);
    }

    public int hashCode() {
        Integer num = this.outcome;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.winnerCode;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.homeTeamSide;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        Integer num = this.outcome;
        Integer num2 = this.winnerCode;
        return vxd.n(wv8.k(num, "ESportRound(outcome=", ", winnerCode=", ", homeTeamSide=", num2), this.homeTeamSide, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportRound$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ESportRound;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ESportRound$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ESportRound(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.outcome = num;
        this.winnerCode = num2;
        this.homeTeamSide = num3;
    }
}
