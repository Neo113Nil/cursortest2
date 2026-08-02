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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ<\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0018J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001b¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueSportStatistics;", "Ljava/io/Serializable;", "", "totalMatches", "goalsScored", "", "homeTeamWinsPercentage", "drawsPercentage", "<init>", "(IILjava/lang/Float;Ljava/lang/Float;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Float;Ljava/lang/Float;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/VenueSportStatistics;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Ljava/lang/Float;", "component4", "copy", "(IILjava/lang/Float;Ljava/lang/Float;)Lcom/sofascore/model/newNetwork/VenueSportStatistics;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTotalMatches", "getGoalsScored", "Ljava/lang/Float;", "getHomeTeamWinsPercentage", "getDrawsPercentage", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VenueSportStatistics implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float drawsPercentage;
    private final int goalsScored;

    @Nullable
    private final Float homeTeamWinsPercentage;
    private final int totalMatches;

    public /* synthetic */ VenueSportStatistics(int i, int i2, int i3, Float f, Float f2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, VenueSportStatistics$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.totalMatches = i2;
        this.goalsScored = i3;
        this.homeTeamWinsPercentage = f;
        this.drawsPercentage = f2;
    }

    public static /* synthetic */ VenueSportStatistics copy$default(VenueSportStatistics venueSportStatistics, int i, int i2, Float f, Float f2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = venueSportStatistics.totalMatches;
        }
        if ((i3 & 2) != 0) {
            i2 = venueSportStatistics.goalsScored;
        }
        if ((i3 & 4) != 0) {
            f = venueSportStatistics.homeTeamWinsPercentage;
        }
        if ((i3 & 8) != 0) {
            f2 = venueSportStatistics.drawsPercentage;
        }
        return venueSportStatistics.copy(i, i2, f, f2);
    }

    public static final /* synthetic */ void write$Self$model_release(VenueSportStatistics self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.totalMatches, serialDesc);
        output.u(1, self.goalsScored, serialDesc);
        c88 c88Var = c88.a;
        output.h(serialDesc, 2, c88Var, self.homeTeamWinsPercentage);
        output.h(serialDesc, 3, c88Var, self.drawsPercentage);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalMatches() {
        return this.totalMatches;
    }

    /* renamed from: component2, reason: from getter */
    public final int getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getHomeTeamWinsPercentage() {
        return this.homeTeamWinsPercentage;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Float getDrawsPercentage() {
        return this.drawsPercentage;
    }

    @NotNull
    public final VenueSportStatistics copy(int totalMatches, int goalsScored, @Nullable Float homeTeamWinsPercentage, @Nullable Float drawsPercentage) {
        return new VenueSportStatistics(totalMatches, goalsScored, homeTeamWinsPercentage, drawsPercentage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VenueSportStatistics)) {
            return false;
        }
        VenueSportStatistics venueSportStatistics = (VenueSportStatistics) other;
        return this.totalMatches == venueSportStatistics.totalMatches && this.goalsScored == venueSportStatistics.goalsScored && Intrinsics.c(this.homeTeamWinsPercentage, venueSportStatistics.homeTeamWinsPercentage) && Intrinsics.c(this.drawsPercentage, venueSportStatistics.drawsPercentage);
    }

    @Nullable
    public final Float getDrawsPercentage() {
        return this.drawsPercentage;
    }

    public final int getGoalsScored() {
        return this.goalsScored;
    }

    @Nullable
    public final Float getHomeTeamWinsPercentage() {
        return this.homeTeamWinsPercentage;
    }

    public final int getTotalMatches() {
        return this.totalMatches;
    }

    public int hashCode() {
        int a = wv8.a(this.goalsScored, Integer.hashCode(this.totalMatches) * 31, 31);
        Float f = this.homeTeamWinsPercentage;
        int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.drawsPercentage;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.totalMatches;
        int i2 = this.goalsScored;
        Float f = this.homeTeamWinsPercentage;
        Float f2 = this.drawsPercentage;
        StringBuilder s = lnb.s(i, i2, "VenueSportStatistics(totalMatches=", ", goalsScored=", ", homeTeamWinsPercentage=");
        s.append(f);
        s.append(", drawsPercentage=");
        s.append(f2);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/VenueSportStatistics$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/VenueSportStatistics;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return VenueSportStatistics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VenueSportStatistics(int i, int i2, @Nullable Float f, @Nullable Float f2) {
        this.totalMatches = i;
        this.goalsScored = i2;
        this.homeTeamWinsPercentage = f;
        this.drawsPercentage = f2;
    }
}
