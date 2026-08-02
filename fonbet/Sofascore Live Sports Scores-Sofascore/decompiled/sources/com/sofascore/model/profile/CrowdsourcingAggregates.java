package com.sofascore.model.profile;

import defpackage.a7a;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J2\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0019¨\u0006."}, d2 = {"Lcom/sofascore/model/profile/CrowdsourcingAggregates;", "Ljava/io/Serializable;", "", "score", "", "currentRanking", "previousRanking", "<init>", "(FLjava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IFLjava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/CrowdsourcingAggregates;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()F", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(FLjava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/profile/CrowdsourcingAggregates;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getScore", "Ljava/lang/Integer;", "getCurrentRanking", "getPreviousRanking", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CrowdsourcingAggregates implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer currentRanking;

    @Nullable
    private final Integer previousRanking;
    private final float score;

    public /* synthetic */ CrowdsourcingAggregates(int i, float f, Integer num, Integer num2, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, CrowdsourcingAggregates$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.score = f;
        this.currentRanking = num;
        this.previousRanking = num2;
    }

    public static /* synthetic */ CrowdsourcingAggregates copy$default(CrowdsourcingAggregates crowdsourcingAggregates, float f, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = crowdsourcingAggregates.score;
        }
        if ((i & 2) != 0) {
            num = crowdsourcingAggregates.currentRanking;
        }
        if ((i & 4) != 0) {
            num2 = crowdsourcingAggregates.previousRanking;
        }
        return crowdsourcingAggregates.copy(f, num, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(CrowdsourcingAggregates self, wf3 output, SerialDescriptor serialDesc) {
        output.t(serialDesc, 0, self.score);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 1, a7aVar, self.currentRanking);
        output.h(serialDesc, 2, a7aVar, self.previousRanking);
    }

    /* renamed from: component1, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getCurrentRanking() {
        return this.currentRanking;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPreviousRanking() {
        return this.previousRanking;
    }

    @NotNull
    public final CrowdsourcingAggregates copy(float score, @Nullable Integer currentRanking, @Nullable Integer previousRanking) {
        return new CrowdsourcingAggregates(score, currentRanking, previousRanking);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrowdsourcingAggregates)) {
            return false;
        }
        CrowdsourcingAggregates crowdsourcingAggregates = (CrowdsourcingAggregates) other;
        return Float.compare(this.score, crowdsourcingAggregates.score) == 0 && Intrinsics.c(this.currentRanking, crowdsourcingAggregates.currentRanking) && Intrinsics.c(this.previousRanking, crowdsourcingAggregates.previousRanking);
    }

    @Nullable
    public final Integer getCurrentRanking() {
        return this.currentRanking;
    }

    @Nullable
    public final Integer getPreviousRanking() {
        return this.previousRanking;
    }

    public final float getScore() {
        return this.score;
    }

    public int hashCode() {
        int hashCode = Float.hashCode(this.score) * 31;
        Integer num = this.currentRanking;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.previousRanking;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        float f = this.score;
        Integer num = this.currentRanking;
        Integer num2 = this.previousRanking;
        StringBuilder sb = new StringBuilder("CrowdsourcingAggregates(score=");
        sb.append(f);
        sb.append(", currentRanking=");
        sb.append(num);
        sb.append(", previousRanking=");
        return vxd.n(sb, num2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/CrowdsourcingAggregates$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/CrowdsourcingAggregates;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CrowdsourcingAggregates$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CrowdsourcingAggregates(float f, @Nullable Integer num, @Nullable Integer num2) {
        this.score = f;
        this.currentRanking = num;
        this.previousRanking = num2;
    }
}
