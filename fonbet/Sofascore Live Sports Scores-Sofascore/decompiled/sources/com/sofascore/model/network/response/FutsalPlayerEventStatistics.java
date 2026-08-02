package com.sofascore.model.network.response;

import defpackage.a7a;
import defpackage.fc6;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJp\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b3\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001b¨\u0006:"}, d2 = {"Lcom/sofascore/model/network/response/FutsalPlayerEventStatistics;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "", "goals", "assists", "yellowCards", "redCards", "penaltyGoals", "penaltyAttempts", "accumulatedPenaltyGoals", "ownGoals", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/FutsalPlayerEventStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/FutsalPlayerEventStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getGoals", "getAssists", "getYellowCards", "getRedCards", "getPenaltyGoals", "getPenaltyAttempts", "getAccumulatedPenaltyGoals", "getOwnGoals", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FutsalPlayerEventStatistics implements PlayerEventStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer accumulatedPenaltyGoals;

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Integer ownGoals;

    @Nullable
    private final Integer penaltyAttempts;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer redCards;

    @Nullable
    private final Integer yellowCards;

    public /* synthetic */ FutsalPlayerEventStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, FutsalPlayerEventStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.goals = num;
        this.assists = num2;
        this.yellowCards = num3;
        this.redCards = num4;
        this.penaltyGoals = num5;
        this.penaltyAttempts = num6;
        this.accumulatedPenaltyGoals = num7;
        this.ownGoals = num8;
    }

    public static /* synthetic */ FutsalPlayerEventStatistics copy$default(FutsalPlayerEventStatistics futsalPlayerEventStatistics, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, int i, Object obj) {
        if ((i & 1) != 0) {
            num = futsalPlayerEventStatistics.goals;
        }
        if ((i & 2) != 0) {
            num2 = futsalPlayerEventStatistics.assists;
        }
        if ((i & 4) != 0) {
            num3 = futsalPlayerEventStatistics.yellowCards;
        }
        if ((i & 8) != 0) {
            num4 = futsalPlayerEventStatistics.redCards;
        }
        if ((i & 16) != 0) {
            num5 = futsalPlayerEventStatistics.penaltyGoals;
        }
        if ((i & 32) != 0) {
            num6 = futsalPlayerEventStatistics.penaltyAttempts;
        }
        if ((i & 64) != 0) {
            num7 = futsalPlayerEventStatistics.accumulatedPenaltyGoals;
        }
        if ((i & 128) != 0) {
            num8 = futsalPlayerEventStatistics.ownGoals;
        }
        Integer num9 = num7;
        Integer num10 = num8;
        Integer num11 = num5;
        Integer num12 = num6;
        return futsalPlayerEventStatistics.copy(num, num2, num3, num4, num11, num12, num9, num10);
    }

    public static final /* synthetic */ void write$Self$model_release(FutsalPlayerEventStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.goals);
        output.h(serialDesc, 1, a7aVar, self.assists);
        output.h(serialDesc, 2, a7aVar, self.yellowCards);
        output.h(serialDesc, 3, a7aVar, self.redCards);
        output.h(serialDesc, 4, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 5, a7aVar, self.penaltyAttempts);
        output.h(serialDesc, 6, a7aVar, self.accumulatedPenaltyGoals);
        output.h(serialDesc, 7, a7aVar, self.ownGoals);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
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
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getPenaltyAttempts() {
        return this.penaltyAttempts;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getOwnGoals() {
        return this.ownGoals;
    }

    @NotNull
    public final FutsalPlayerEventStatistics copy(@Nullable Integer goals, @Nullable Integer assists, @Nullable Integer yellowCards, @Nullable Integer redCards, @Nullable Integer penaltyGoals, @Nullable Integer penaltyAttempts, @Nullable Integer accumulatedPenaltyGoals, @Nullable Integer ownGoals) {
        return new FutsalPlayerEventStatistics(goals, assists, yellowCards, redCards, penaltyGoals, penaltyAttempts, accumulatedPenaltyGoals, ownGoals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutsalPlayerEventStatistics)) {
            return false;
        }
        FutsalPlayerEventStatistics futsalPlayerEventStatistics = (FutsalPlayerEventStatistics) other;
        return Intrinsics.c(this.goals, futsalPlayerEventStatistics.goals) && Intrinsics.c(this.assists, futsalPlayerEventStatistics.assists) && Intrinsics.c(this.yellowCards, futsalPlayerEventStatistics.yellowCards) && Intrinsics.c(this.redCards, futsalPlayerEventStatistics.redCards) && Intrinsics.c(this.penaltyGoals, futsalPlayerEventStatistics.penaltyGoals) && Intrinsics.c(this.penaltyAttempts, futsalPlayerEventStatistics.penaltyAttempts) && Intrinsics.c(this.accumulatedPenaltyGoals, futsalPlayerEventStatistics.accumulatedPenaltyGoals) && Intrinsics.c(this.ownGoals, futsalPlayerEventStatistics.ownGoals);
    }

    @Nullable
    public final Integer getAccumulatedPenaltyGoals() {
        return this.accumulatedPenaltyGoals;
    }

    @Nullable
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    public final Integer getOwnGoals() {
        return this.ownGoals;
    }

    @Nullable
    public final Integer getPenaltyAttempts() {
        return this.penaltyAttempts;
    }

    @Nullable
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Override // com.sofascore.model.network.response.PlayerEventStatistics
    @Nullable
    public /* bridge */ Double getRating() {
        return super.getRating();
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
        Integer num = this.goals;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.assists;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.yellowCards;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.redCards;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.penaltyGoals;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.penaltyAttempts;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.accumulatedPenaltyGoals;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.ownGoals;
        return hashCode7 + (num8 != null ? num8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.goals;
        Integer num2 = this.assists;
        Integer num3 = this.yellowCards;
        Integer num4 = this.redCards;
        Integer num5 = this.penaltyGoals;
        Integer num6 = this.penaltyAttempts;
        Integer num7 = this.accumulatedPenaltyGoals;
        Integer num8 = this.ownGoals;
        StringBuilder k = wv8.k(num, "FutsalPlayerEventStatistics(goals=", ", assists=", ", yellowCards=", num2);
        vxd.r(num3, num4, ", redCards=", ", penaltyGoals=", k);
        vxd.r(num5, num6, ", penaltyAttempts=", ", accumulatedPenaltyGoals=", k);
        return fc6.l(num7, num8, ", ownGoals=", ")", k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/FutsalPlayerEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/FutsalPlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FutsalPlayerEventStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FutsalPlayerEventStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8) {
        this.goals = num;
        this.assists = num2;
        this.yellowCards = num3;
        this.redCards = num4;
        this.penaltyGoals = num5;
        this.penaltyAttempts = num6;
        this.accumulatedPenaltyGoals = num7;
        this.ownGoals = num8;
    }
}
