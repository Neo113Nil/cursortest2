package com.sofascore.model.newNetwork;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.h75;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ@\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u001a¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;", "", "", CampaignEx.JSON_KEY_STAR, "", "goals", "assists", "totalDuelsWon", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "copy", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getRating", "Ljava/lang/Integer;", "getGoals", "getAssists", "getTotalDuelsWon", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FootballPlayerHighlightedStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer assists;

    @Nullable
    private final Integer goals;

    @Nullable
    private final Double rating;

    @Nullable
    private final Integer totalDuelsWon;

    public /* synthetic */ FootballPlayerHighlightedStatistics(int i, Double d, Integer num, Integer num2, Integer num3, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FootballPlayerHighlightedStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rating = d;
        this.goals = num;
        this.assists = num2;
        this.totalDuelsWon = num3;
    }

    public static /* synthetic */ FootballPlayerHighlightedStatistics copy$default(FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics, Double d, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = footballPlayerHighlightedStatistics.rating;
        }
        if ((i & 2) != 0) {
            num = footballPlayerHighlightedStatistics.goals;
        }
        if ((i & 4) != 0) {
            num2 = footballPlayerHighlightedStatistics.assists;
        }
        if ((i & 8) != 0) {
            num3 = footballPlayerHighlightedStatistics.totalDuelsWon;
        }
        return footballPlayerHighlightedStatistics.copy(d, num, num2, num3);
    }

    public static final /* synthetic */ void write$Self$model_release(FootballPlayerHighlightedStatistics self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, h75.a, self.rating);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.goals);
        output.h(serialDesc, 2, a7aVar, self.assists);
        output.h(serialDesc, 3, a7aVar, self.totalDuelsWon);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAssists() {
        return this.assists;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTotalDuelsWon() {
        return this.totalDuelsWon;
    }

    @NotNull
    public final FootballPlayerHighlightedStatistics copy(@Nullable Double rating, @Nullable Integer goals, @Nullable Integer assists, @Nullable Integer totalDuelsWon) {
        return new FootballPlayerHighlightedStatistics(rating, goals, assists, totalDuelsWon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FootballPlayerHighlightedStatistics)) {
            return false;
        }
        FootballPlayerHighlightedStatistics footballPlayerHighlightedStatistics = (FootballPlayerHighlightedStatistics) other;
        return Intrinsics.c(this.rating, footballPlayerHighlightedStatistics.rating) && Intrinsics.c(this.goals, footballPlayerHighlightedStatistics.goals) && Intrinsics.c(this.assists, footballPlayerHighlightedStatistics.assists) && Intrinsics.c(this.totalDuelsWon, footballPlayerHighlightedStatistics.totalDuelsWon);
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
    public final Double getRating() {
        return this.rating;
    }

    @Nullable
    public final Integer getTotalDuelsWon() {
        return this.totalDuelsWon;
    }

    public int hashCode() {
        Double d = this.rating;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.goals;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.assists;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalDuelsWon;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Double d = this.rating;
        Integer num = this.goals;
        Integer num2 = this.assists;
        Integer num3 = this.totalDuelsWon;
        StringBuilder sb = new StringBuilder("FootballPlayerHighlightedStatistics(rating=");
        sb.append(d);
        sb.append(", goals=");
        sb.append(num);
        sb.append(", assists=");
        return fc6.l(num2, num3, ", totalDuelsWon=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/FootballPlayerHighlightedStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FootballPlayerHighlightedStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FootballPlayerHighlightedStatistics(@Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.rating = d;
        this.goals = num;
        this.assists = num2;
        this.totalDuelsWon = num3;
    }
}
