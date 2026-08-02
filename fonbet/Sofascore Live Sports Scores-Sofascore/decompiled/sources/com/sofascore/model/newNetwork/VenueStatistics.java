package com.sofascore.model.newNetwork;

import defpackage.c88;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rBe\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010 Jj\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b7\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b8\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b9\u0010 ¨\u0006<"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueStatistics;", "Ljava/io/Serializable;", "", "totalMatches", "homeTeamGoalsScored", "awayTeamGoalsScored", "", "avgRedCardsPerGame", "avgCornerKicksPerGame", "homeTeamWinsPercentage", "awayTeamWinsPercentage", "drawsPercentage", "<init>", "(IIILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/VenueStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Float;", "component5", "component6", "component7", "component8", "copy", "(IIILjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/sofascore/model/newNetwork/VenueStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalMatches", "getHomeTeamGoalsScored", "getAwayTeamGoalsScored", "Ljava/lang/Float;", "getAvgRedCardsPerGame", "getAvgCornerKicksPerGame", "getHomeTeamWinsPercentage", "getAwayTeamWinsPercentage", "getDrawsPercentage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VenueStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float avgCornerKicksPerGame;

    @Nullable
    private final Float avgRedCardsPerGame;
    private final int awayTeamGoalsScored;

    @Nullable
    private final Float awayTeamWinsPercentage;

    @Nullable
    private final Float drawsPercentage;
    private final int homeTeamGoalsScored;

    @Nullable
    private final Float homeTeamWinsPercentage;
    private final int totalMatches;

    public /* synthetic */ VenueStatistics(int i, int i2, int i3, int i4, Float f, Float f2, Float f3, Float f4, Float f5, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, VenueStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.totalMatches = i2;
        this.homeTeamGoalsScored = i3;
        this.awayTeamGoalsScored = i4;
        this.avgRedCardsPerGame = f;
        this.avgCornerKicksPerGame = f2;
        this.homeTeamWinsPercentage = f3;
        this.awayTeamWinsPercentage = f4;
        this.drawsPercentage = f5;
    }

    public static /* synthetic */ VenueStatistics copy$default(VenueStatistics venueStatistics, int i, int i2, int i3, Float f, Float f2, Float f3, Float f4, Float f5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = venueStatistics.totalMatches;
        }
        if ((i4 & 2) != 0) {
            i2 = venueStatistics.homeTeamGoalsScored;
        }
        if ((i4 & 4) != 0) {
            i3 = venueStatistics.awayTeamGoalsScored;
        }
        if ((i4 & 8) != 0) {
            f = venueStatistics.avgRedCardsPerGame;
        }
        if ((i4 & 16) != 0) {
            f2 = venueStatistics.avgCornerKicksPerGame;
        }
        if ((i4 & 32) != 0) {
            f3 = venueStatistics.homeTeamWinsPercentage;
        }
        if ((i4 & 64) != 0) {
            f4 = venueStatistics.awayTeamWinsPercentage;
        }
        if ((i4 & 128) != 0) {
            f5 = venueStatistics.drawsPercentage;
        }
        Float f6 = f4;
        Float f7 = f5;
        Float f8 = f2;
        Float f9 = f3;
        return venueStatistics.copy(i, i2, i3, f, f8, f9, f6, f7);
    }

    public static final /* synthetic */ void write$Self$model_release(VenueStatistics self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.totalMatches, serialDesc);
        output.u(1, self.homeTeamGoalsScored, serialDesc);
        output.u(2, self.awayTeamGoalsScored, serialDesc);
        c88 c88Var = c88.a;
        output.h(serialDesc, 3, c88Var, self.avgRedCardsPerGame);
        output.h(serialDesc, 4, c88Var, self.avgCornerKicksPerGame);
        output.h(serialDesc, 5, c88Var, self.homeTeamWinsPercentage);
        output.h(serialDesc, 6, c88Var, self.awayTeamWinsPercentage);
        output.h(serialDesc, 7, c88Var, self.drawsPercentage);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalMatches() {
        return this.totalMatches;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHomeTeamGoalsScored() {
        return this.homeTeamGoalsScored;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAwayTeamGoalsScored() {
        return this.awayTeamGoalsScored;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getAvgRedCardsPerGame() {
        return this.avgRedCardsPerGame;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Float getAvgCornerKicksPerGame() {
        return this.avgCornerKicksPerGame;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Float getHomeTeamWinsPercentage() {
        return this.homeTeamWinsPercentage;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getAwayTeamWinsPercentage() {
        return this.awayTeamWinsPercentage;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Float getDrawsPercentage() {
        return this.drawsPercentage;
    }

    @NotNull
    public final VenueStatistics copy(int totalMatches, int homeTeamGoalsScored, int awayTeamGoalsScored, @Nullable Float avgRedCardsPerGame, @Nullable Float avgCornerKicksPerGame, @Nullable Float homeTeamWinsPercentage, @Nullable Float awayTeamWinsPercentage, @Nullable Float drawsPercentage) {
        return new VenueStatistics(totalMatches, homeTeamGoalsScored, awayTeamGoalsScored, avgRedCardsPerGame, avgCornerKicksPerGame, homeTeamWinsPercentage, awayTeamWinsPercentage, drawsPercentage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VenueStatistics)) {
            return false;
        }
        VenueStatistics venueStatistics = (VenueStatistics) other;
        return this.totalMatches == venueStatistics.totalMatches && this.homeTeamGoalsScored == venueStatistics.homeTeamGoalsScored && this.awayTeamGoalsScored == venueStatistics.awayTeamGoalsScored && Intrinsics.c(this.avgRedCardsPerGame, venueStatistics.avgRedCardsPerGame) && Intrinsics.c(this.avgCornerKicksPerGame, venueStatistics.avgCornerKicksPerGame) && Intrinsics.c(this.homeTeamWinsPercentage, venueStatistics.homeTeamWinsPercentage) && Intrinsics.c(this.awayTeamWinsPercentage, venueStatistics.awayTeamWinsPercentage) && Intrinsics.c(this.drawsPercentage, venueStatistics.drawsPercentage);
    }

    @Nullable
    public final Float getAvgCornerKicksPerGame() {
        return this.avgCornerKicksPerGame;
    }

    @Nullable
    public final Float getAvgRedCardsPerGame() {
        return this.avgRedCardsPerGame;
    }

    public final int getAwayTeamGoalsScored() {
        return this.awayTeamGoalsScored;
    }

    @Nullable
    public final Float getAwayTeamWinsPercentage() {
        return this.awayTeamWinsPercentage;
    }

    @Nullable
    public final Float getDrawsPercentage() {
        return this.drawsPercentage;
    }

    public final int getHomeTeamGoalsScored() {
        return this.homeTeamGoalsScored;
    }

    @Nullable
    public final Float getHomeTeamWinsPercentage() {
        return this.homeTeamWinsPercentage;
    }

    public final int getTotalMatches() {
        return this.totalMatches;
    }

    public int hashCode() {
        int a = wv8.a(this.awayTeamGoalsScored, wv8.a(this.homeTeamGoalsScored, Integer.hashCode(this.totalMatches) * 31, 31), 31);
        Float f = this.avgRedCardsPerGame;
        int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.avgCornerKicksPerGame;
        int hashCode2 = (hashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.homeTeamWinsPercentage;
        int hashCode3 = (hashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.awayTeamWinsPercentage;
        int hashCode4 = (hashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.drawsPercentage;
        return hashCode4 + (f5 != null ? f5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.totalMatches;
        int i2 = this.homeTeamGoalsScored;
        int i3 = this.awayTeamGoalsScored;
        Float f = this.avgRedCardsPerGame;
        Float f2 = this.avgCornerKicksPerGame;
        Float f3 = this.homeTeamWinsPercentage;
        Float f4 = this.awayTeamWinsPercentage;
        Float f5 = this.drawsPercentage;
        StringBuilder s = lnb.s(i, i2, "VenueStatistics(totalMatches=", ", homeTeamGoalsScored=", ", awayTeamGoalsScored=");
        s.append(i3);
        s.append(", avgRedCardsPerGame=");
        s.append(f);
        s.append(", avgCornerKicksPerGame=");
        s.append(f2);
        s.append(", homeTeamWinsPercentage=");
        s.append(f3);
        s.append(", awayTeamWinsPercentage=");
        s.append(f4);
        s.append(", drawsPercentage=");
        s.append(f5);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/VenueStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VenueStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VenueStatistics(int i, int i2, int i3, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, @Nullable Float f4, @Nullable Float f5) {
        this.totalMatches = i;
        this.homeTeamGoalsScored = i2;
        this.awayTeamGoalsScored = i3;
        this.avgRedCardsPerGame = f;
        this.avgCornerKicksPerGame = f2;
        this.homeTeamWinsPercentage = f3;
        this.awayTeamWinsPercentage = f4;
        this.drawsPercentage = f5;
    }
}
