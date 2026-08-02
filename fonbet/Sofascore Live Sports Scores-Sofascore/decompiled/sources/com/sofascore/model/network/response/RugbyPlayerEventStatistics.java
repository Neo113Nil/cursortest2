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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KJB\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012B§\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J¸\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b@\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\bA\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\bB\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bC\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bD\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bE\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bF\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bG\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\bH\u0010\u0018R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010;\u001a\u0004\bI\u0010\u0018¨\u0006L"}, d2 = {"Lcom/sofascore/model/network/response/RugbyPlayerEventStatistics;", "Lcom/sofascore/model/network/response/PlayerEventStatistics;", "", "points", "tries", "tackles", "penaltyGoals", "passes", "carries", "cleanBreaks", "dropGoals", "metersRun", "offloads", "tacklesMissed", "tryAssists", "turnoversWon", "penaltiesScored", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/RugbyPlayerEventStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/RugbyPlayerEventStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getPoints", "getTries", "getTackles", "getPenaltyGoals", "getPasses", "getCarries", "getCleanBreaks", "getDropGoals", "getMetersRun", "getOffloads", "getTacklesMissed", "getTryAssists", "getTurnoversWon", "getPenaltiesScored", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RugbyPlayerEventStatistics implements PlayerEventStatistics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer carries;

    @Nullable
    private final Integer cleanBreaks;

    @Nullable
    private final Integer dropGoals;

    @Nullable
    private final Integer metersRun;

    @Nullable
    private final Integer offloads;

    @Nullable
    private final Integer passes;

    @Nullable
    private final Integer penaltiesScored;

    @Nullable
    private final Integer penaltyGoals;

    @Nullable
    private final Integer points;

    @Nullable
    private final Integer tackles;

    @Nullable
    private final Integer tacklesMissed;

    @Nullable
    private final Integer tries;

    @Nullable
    private final Integer tryAssists;

    @Nullable
    private final Integer turnoversWon;

    public /* synthetic */ RugbyPlayerEventStatistics(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, t5h t5hVar) {
        if (16383 != (i & 16383)) {
            oea.z(i, 16383, RugbyPlayerEventStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.points = num;
        this.tries = num2;
        this.tackles = num3;
        this.penaltyGoals = num4;
        this.passes = num5;
        this.carries = num6;
        this.cleanBreaks = num7;
        this.dropGoals = num8;
        this.metersRun = num9;
        this.offloads = num10;
        this.tacklesMissed = num11;
        this.tryAssists = num12;
        this.turnoversWon = num13;
        this.penaltiesScored = num14;
    }

    public static final /* synthetic */ void write$Self$model_release(RugbyPlayerEventStatistics self, wf3 output, SerialDescriptor serialDesc) {
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 0, a7aVar, self.points);
        output.h(serialDesc, 1, a7aVar, self.tries);
        output.h(serialDesc, 2, a7aVar, self.tackles);
        output.h(serialDesc, 3, a7aVar, self.penaltyGoals);
        output.h(serialDesc, 4, a7aVar, self.passes);
        output.h(serialDesc, 5, a7aVar, self.carries);
        output.h(serialDesc, 6, a7aVar, self.cleanBreaks);
        output.h(serialDesc, 7, a7aVar, self.dropGoals);
        output.h(serialDesc, 8, a7aVar, self.metersRun);
        output.h(serialDesc, 9, a7aVar, self.offloads);
        output.h(serialDesc, 10, a7aVar, self.tacklesMissed);
        output.h(serialDesc, 11, a7aVar, self.tryAssists);
        output.h(serialDesc, 12, a7aVar, self.turnoversWon);
        output.h(serialDesc, 13, a7aVar, self.penaltiesScored);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getPoints() {
        return this.points;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getOffloads() {
        return this.offloads;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getTacklesMissed() {
        return this.tacklesMissed;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Integer getTryAssists() {
        return this.tryAssists;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getTurnoversWon() {
        return this.turnoversWon;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getPenaltiesScored() {
        return this.penaltiesScored;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getTries() {
        return this.tries;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getPasses() {
        return this.passes;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getCarries() {
        return this.carries;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getMetersRun() {
        return this.metersRun;
    }

    @NotNull
    public final RugbyPlayerEventStatistics copy(@Nullable Integer points, @Nullable Integer tries, @Nullable Integer tackles, @Nullable Integer penaltyGoals, @Nullable Integer passes, @Nullable Integer carries, @Nullable Integer cleanBreaks, @Nullable Integer dropGoals, @Nullable Integer metersRun, @Nullable Integer offloads, @Nullable Integer tacklesMissed, @Nullable Integer tryAssists, @Nullable Integer turnoversWon, @Nullable Integer penaltiesScored) {
        return new RugbyPlayerEventStatistics(points, tries, tackles, penaltyGoals, passes, carries, cleanBreaks, dropGoals, metersRun, offloads, tacklesMissed, tryAssists, turnoversWon, penaltiesScored);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RugbyPlayerEventStatistics)) {
            return false;
        }
        RugbyPlayerEventStatistics rugbyPlayerEventStatistics = (RugbyPlayerEventStatistics) other;
        return Intrinsics.c(this.points, rugbyPlayerEventStatistics.points) && Intrinsics.c(this.tries, rugbyPlayerEventStatistics.tries) && Intrinsics.c(this.tackles, rugbyPlayerEventStatistics.tackles) && Intrinsics.c(this.penaltyGoals, rugbyPlayerEventStatistics.penaltyGoals) && Intrinsics.c(this.passes, rugbyPlayerEventStatistics.passes) && Intrinsics.c(this.carries, rugbyPlayerEventStatistics.carries) && Intrinsics.c(this.cleanBreaks, rugbyPlayerEventStatistics.cleanBreaks) && Intrinsics.c(this.dropGoals, rugbyPlayerEventStatistics.dropGoals) && Intrinsics.c(this.metersRun, rugbyPlayerEventStatistics.metersRun) && Intrinsics.c(this.offloads, rugbyPlayerEventStatistics.offloads) && Intrinsics.c(this.tacklesMissed, rugbyPlayerEventStatistics.tacklesMissed) && Intrinsics.c(this.tryAssists, rugbyPlayerEventStatistics.tryAssists) && Intrinsics.c(this.turnoversWon, rugbyPlayerEventStatistics.turnoversWon) && Intrinsics.c(this.penaltiesScored, rugbyPlayerEventStatistics.penaltiesScored);
    }

    @Nullable
    public final Integer getCarries() {
        return this.carries;
    }

    @Nullable
    public final Integer getCleanBreaks() {
        return this.cleanBreaks;
    }

    @Nullable
    public final Integer getDropGoals() {
        return this.dropGoals;
    }

    @Nullable
    public final Integer getMetersRun() {
        return this.metersRun;
    }

    @Nullable
    public final Integer getOffloads() {
        return this.offloads;
    }

    @Nullable
    public final Integer getPasses() {
        return this.passes;
    }

    @Nullable
    public final Integer getPenaltiesScored() {
        return this.penaltiesScored;
    }

    @Nullable
    public final Integer getPenaltyGoals() {
        return this.penaltyGoals;
    }

    @Nullable
    public final Integer getPoints() {
        return this.points;
    }

    @Override // com.sofascore.model.network.response.PlayerEventStatistics
    @Nullable
    public /* bridge */ Double getRating() {
        return super.getRating();
    }

    @Nullable
    public final Integer getTackles() {
        return this.tackles;
    }

    @Nullable
    public final Integer getTacklesMissed() {
        return this.tacklesMissed;
    }

    @Nullable
    public final Integer getTries() {
        return this.tries;
    }

    @Nullable
    public final Integer getTryAssists() {
        return this.tryAssists;
    }

    @Nullable
    public final Integer getTurnoversWon() {
        return this.turnoversWon;
    }

    public int hashCode() {
        Integer num = this.points;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.tries;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tackles;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.penaltyGoals;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.passes;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.carries;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.cleanBreaks;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.dropGoals;
        int hashCode8 = (hashCode7 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.metersRun;
        int hashCode9 = (hashCode8 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.offloads;
        int hashCode10 = (hashCode9 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.tacklesMissed;
        int hashCode11 = (hashCode10 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.tryAssists;
        int hashCode12 = (hashCode11 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.turnoversWon;
        int hashCode13 = (hashCode12 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Integer num14 = this.penaltiesScored;
        return hashCode13 + (num14 != null ? num14.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.points;
        Integer num2 = this.tries;
        Integer num3 = this.tackles;
        Integer num4 = this.penaltyGoals;
        Integer num5 = this.passes;
        Integer num6 = this.carries;
        Integer num7 = this.cleanBreaks;
        Integer num8 = this.dropGoals;
        Integer num9 = this.metersRun;
        Integer num10 = this.offloads;
        Integer num11 = this.tacklesMissed;
        Integer num12 = this.tryAssists;
        Integer num13 = this.turnoversWon;
        Integer num14 = this.penaltiesScored;
        StringBuilder k = wv8.k(num, "RugbyPlayerEventStatistics(points=", ", tries=", ", tackles=", num2);
        vxd.r(num3, num4, ", penaltyGoals=", ", passes=", k);
        vxd.r(num5, num6, ", carries=", ", cleanBreaks=", k);
        vxd.r(num7, num8, ", dropGoals=", ", metersRun=", k);
        vxd.r(num9, num10, ", offloads=", ", tacklesMissed=", k);
        vxd.r(num11, num12, ", tryAssists=", ", turnoversWon=", k);
        return fc6.l(num13, num14, ", penaltiesScored=", ")", k);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/RugbyPlayerEventStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/RugbyPlayerEventStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RugbyPlayerEventStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RugbyPlayerEventStatistics(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Integer num9, @Nullable Integer num10, @Nullable Integer num11, @Nullable Integer num12, @Nullable Integer num13, @Nullable Integer num14) {
        this.points = num;
        this.tries = num2;
        this.tackles = num3;
        this.penaltyGoals = num4;
        this.passes = num5;
        this.carries = num6;
        this.cleanBreaks = num7;
        this.dropGoals = num8;
        this.metersRun = num9;
        this.offloads = num10;
        this.tacklesMissed = num11;
        this.tryAssists = num12;
        this.turnoversWon = num13;
        this.penaltiesScored = num14;
    }
}
