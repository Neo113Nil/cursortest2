package com.sofascore.model.newNetwork;

import defpackage.a7a;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJL\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b0\u0010\u001b¨\u00063"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;", "", "", "avgRating", "", "matches", "goalsScored", "goalsConceded", "bigChancesMissed", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "copy", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getAvgRating", "Ljava/lang/Integer;", "getMatches", "getGoalsScored", "getGoalsConceded", "getBigChancesMissed", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballTeamHighlightedStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double avgRating;

    @Nullable
    private final Integer bigChancesMissed;

    @Nullable
    private final Integer goalsConceded;

    @Nullable
    private final Integer goalsScored;

    @Nullable
    private final Integer matches;

    public /* synthetic */ FootballTeamHighlightedStatistics(int i, Double d, Integer num, Integer num2, Integer num3, Integer num4, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, FootballTeamHighlightedStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.avgRating = d;
        this.matches = num;
        this.goalsScored = num2;
        this.goalsConceded = num3;
        this.bigChancesMissed = num4;
    }

    public static /* synthetic */ FootballTeamHighlightedStatistics copy$default(FootballTeamHighlightedStatistics footballTeamHighlightedStatistics, Double d, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            d = footballTeamHighlightedStatistics.avgRating;
        }
        if ((i & 2) != 0) {
            num = footballTeamHighlightedStatistics.matches;
        }
        if ((i & 4) != 0) {
            num2 = footballTeamHighlightedStatistics.goalsScored;
        }
        if ((i & 8) != 0) {
            num3 = footballTeamHighlightedStatistics.goalsConceded;
        }
        if ((i & 16) != 0) {
            num4 = footballTeamHighlightedStatistics.bigChancesMissed;
        }
        Integer num5 = num4;
        Integer num6 = num2;
        return footballTeamHighlightedStatistics.copy(d, num, num6, num3, num5);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballTeamHighlightedStatistics self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, h75.a, self.avgRating);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.matches);
        output.h(serialDesc, 2, a7aVar, self.goalsScored);
        output.h(serialDesc, 3, a7aVar, self.goalsConceded);
        output.h(serialDesc, 4, a7aVar, self.bigChancesMissed);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getAvgRating() {
        return this.avgRating;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getGoalsConceded() {
        return this.goalsConceded;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getBigChancesMissed() {
        return this.bigChancesMissed;
    }

    @NotNull
    public final FootballTeamHighlightedStatistics copy(@Nullable Double avgRating, @Nullable Integer matches, @Nullable Integer goalsScored, @Nullable Integer goalsConceded, @Nullable Integer bigChancesMissed) {
        return new FootballTeamHighlightedStatistics(avgRating, matches, goalsScored, goalsConceded, bigChancesMissed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballTeamHighlightedStatistics)) {
            return false;
        }
        FootballTeamHighlightedStatistics footballTeamHighlightedStatistics = (FootballTeamHighlightedStatistics) other;
        return Intrinsics.c(this.avgRating, footballTeamHighlightedStatistics.avgRating) && Intrinsics.c(this.matches, footballTeamHighlightedStatistics.matches) && Intrinsics.c(this.goalsScored, footballTeamHighlightedStatistics.goalsScored) && Intrinsics.c(this.goalsConceded, footballTeamHighlightedStatistics.goalsConceded) && Intrinsics.c(this.bigChancesMissed, footballTeamHighlightedStatistics.bigChancesMissed);
    }

    @Nullable
    public final Double getAvgRating() {
        return this.avgRating;
    }

    @Nullable
    public final Integer getBigChancesMissed() {
        return this.bigChancesMissed;
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

    public int hashCode() {
        Double d = this.avgRating;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.matches;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.goalsScored;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.goalsConceded;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bigChancesMissed;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Double d = this.avgRating;
        Integer num = this.matches;
        Integer num2 = this.goalsScored;
        Integer num3 = this.goalsConceded;
        Integer num4 = this.bigChancesMissed;
        StringBuilder sb = new StringBuilder("FootballTeamHighlightedStatistics(avgRating=");
        sb.append(d);
        sb.append(", matches=");
        sb.append(num);
        sb.append(", goalsScored=");
        vxd.r(num2, num3, ", goalsConceded=", ", bigChancesMissed=", sb);
        return vxd.n(sb, num4, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FootballTeamHighlightedStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballTeamHighlightedStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballTeamHighlightedStatistics(@Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.avgRating = d;
        this.matches = num;
        this.goalsScored = num2;
        this.goalsConceded = num3;
        this.bigChancesMissed = num4;
    }
}
