package com.sofascore.model.newNetwork;

import com.vungle.ads.internal.protos.Sdk;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBa\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJd\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001b¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "", "", "roundAvg", "roundPct", "avg15min", "pct15min", "overall", "overallAvg", "overallPct", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/MmaStatisticValues;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Double;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getRoundAvg", "getRoundPct", "getAvg15min", "getPct15min", "getOverall", "getOverallAvg", "getOverallPct", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MmaStatisticValues {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Double avg15min;

    @Nullable
    private final Double overall;

    @Nullable
    private final Double overallAvg;

    @Nullable
    private final Double overallPct;

    @Nullable
    private final Double pct15min;

    @Nullable
    private final Double roundAvg;

    @Nullable
    private final Double roundPct;

    public /* synthetic */ MmaStatisticValues(int i, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, MmaStatisticValues$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.roundAvg = d;
        this.roundPct = d2;
        this.avg15min = d3;
        this.pct15min = d4;
        this.overall = d5;
        this.overallAvg = d6;
        this.overallPct = d7;
    }

    public static /* synthetic */ MmaStatisticValues copy$default(MmaStatisticValues mmaStatisticValues, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, int i, Object obj) {
        if ((i & 1) != 0) {
            d = mmaStatisticValues.roundAvg;
        }
        if ((i & 2) != 0) {
            d2 = mmaStatisticValues.roundPct;
        }
        if ((i & 4) != 0) {
            d3 = mmaStatisticValues.avg15min;
        }
        if ((i & 8) != 0) {
            d4 = mmaStatisticValues.pct15min;
        }
        if ((i & 16) != 0) {
            d5 = mmaStatisticValues.overall;
        }
        if ((i & 32) != 0) {
            d6 = mmaStatisticValues.overallAvg;
        }
        if ((i & 64) != 0) {
            d7 = mmaStatisticValues.overallPct;
        }
        Double d8 = d6;
        Double d9 = d7;
        Double d10 = d5;
        Double d11 = d3;
        return mmaStatisticValues.copy(d, d2, d11, d4, d10, d8, d9);
    }

    public static final /* synthetic */ void write$Self$model_release(MmaStatisticValues self, wf3 output, SerialDescriptor serialDesc) {
        h75 h75Var = h75.a;
        output.h(serialDesc, 0, h75Var, self.roundAvg);
        output.h(serialDesc, 1, h75Var, self.roundPct);
        output.h(serialDesc, 2, h75Var, self.avg15min);
        output.h(serialDesc, 3, h75Var, self.pct15min);
        output.h(serialDesc, 4, h75Var, self.overall);
        output.h(serialDesc, 5, h75Var, self.overallAvg);
        output.h(serialDesc, 6, h75Var, self.overallPct);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Double getRoundAvg() {
        return this.roundAvg;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Double getRoundPct() {
        return this.roundPct;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Double getAvg15min() {
        return this.avg15min;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Double getPct15min() {
        return this.pct15min;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Double getOverall() {
        return this.overall;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getOverallAvg() {
        return this.overallAvg;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getOverallPct() {
        return this.overallPct;
    }

    @NotNull
    public final MmaStatisticValues copy(@Nullable Double roundAvg, @Nullable Double roundPct, @Nullable Double avg15min, @Nullable Double pct15min, @Nullable Double overall, @Nullable Double overallAvg, @Nullable Double overallPct) {
        return new MmaStatisticValues(roundAvg, roundPct, avg15min, pct15min, overall, overallAvg, overallPct);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MmaStatisticValues)) {
            return false;
        }
        MmaStatisticValues mmaStatisticValues = (MmaStatisticValues) other;
        return Intrinsics.c(this.roundAvg, mmaStatisticValues.roundAvg) && Intrinsics.c(this.roundPct, mmaStatisticValues.roundPct) && Intrinsics.c(this.avg15min, mmaStatisticValues.avg15min) && Intrinsics.c(this.pct15min, mmaStatisticValues.pct15min) && Intrinsics.c(this.overall, mmaStatisticValues.overall) && Intrinsics.c(this.overallAvg, mmaStatisticValues.overallAvg) && Intrinsics.c(this.overallPct, mmaStatisticValues.overallPct);
    }

    @Nullable
    public final Double getAvg15min() {
        return this.avg15min;
    }

    @Nullable
    public final Double getOverall() {
        return this.overall;
    }

    @Nullable
    public final Double getOverallAvg() {
        return this.overallAvg;
    }

    @Nullable
    public final Double getOverallPct() {
        return this.overallPct;
    }

    @Nullable
    public final Double getPct15min() {
        return this.pct15min;
    }

    @Nullable
    public final Double getRoundAvg() {
        return this.roundAvg;
    }

    @Nullable
    public final Double getRoundPct() {
        return this.roundPct;
    }

    public int hashCode() {
        Double d = this.roundAvg;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.roundPct;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.avg15min;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.pct15min;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.overall;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.overallAvg;
        int hashCode6 = (hashCode5 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.overallPct;
        return hashCode6 + (d7 != null ? d7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Double d = this.roundAvg;
        Double d2 = this.roundPct;
        Double d3 = this.avg15min;
        Double d4 = this.pct15min;
        Double d5 = this.overall;
        Double d6 = this.overallAvg;
        Double d7 = this.overallPct;
        StringBuilder sb = new StringBuilder("MmaStatisticValues(roundAvg=");
        sb.append(d);
        sb.append(", roundPct=");
        sb.append(d2);
        sb.append(", avg15min=");
        fc6.A(sb, d3, ", pct15min=", d4, ", overall=");
        fc6.A(sb, d5, ", overallAvg=", d6, ", overallPct=");
        sb.append(d7);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/MmaStatisticValues$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return MmaStatisticValues$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public MmaStatisticValues(@Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Double d5, @Nullable Double d6, @Nullable Double d7) {
        this.roundAvg = d;
        this.roundPct = d2;
        this.avg15min = d3;
        this.pct15min = d4;
        this.overall = d5;
        this.overallAvg = d6;
        this.overallPct = d7;
    }
}
