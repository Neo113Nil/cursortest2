package com.sofascore.model.network.response;

import defpackage.a7a;
import defpackage.lnb;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBG\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010\u001c¨\u00062"}, d2 = {"Lcom/sofascore/model/network/response/PeriodDistributionItem;", "Ljava/io/Serializable;", "", "id", "periodStart", "periodEnd", "scoredGoals", "concededGoals", "<init>", "(IIILjava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIIILjava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/PeriodDistributionItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(IIILjava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/PeriodDistributionItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getPeriodStart", "getPeriodEnd", "Ljava/lang/Integer;", "getScoredGoals", "getConcededGoals", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PeriodDistributionItem implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer concededGoals;
    private final int id;
    private final int periodEnd;
    private final int periodStart;

    @Nullable
    private final Integer scoredGoals;

    public /* synthetic */ PeriodDistributionItem(int i, int i2, int i3, int i4, Integer num, Integer num2, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, PeriodDistributionItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.periodStart = i3;
        this.periodEnd = i4;
        this.scoredGoals = num;
        this.concededGoals = num2;
    }

    public static /* synthetic */ PeriodDistributionItem copy$default(PeriodDistributionItem periodDistributionItem, int i, int i2, int i3, Integer num, Integer num2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = periodDistributionItem.id;
        }
        if ((i4 & 2) != 0) {
            i2 = periodDistributionItem.periodStart;
        }
        if ((i4 & 4) != 0) {
            i3 = periodDistributionItem.periodEnd;
        }
        if ((i4 & 8) != 0) {
            num = periodDistributionItem.scoredGoals;
        }
        if ((i4 & 16) != 0) {
            num2 = periodDistributionItem.concededGoals;
        }
        Integer num3 = num2;
        int i5 = i3;
        return periodDistributionItem.copy(i, i2, i5, num, num3);
    }

    public static final /* synthetic */ void write$Self$model_release(PeriodDistributionItem self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.u(1, self.periodStart, serialDesc);
        output.u(2, self.periodEnd, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.scoredGoals);
        output.h(serialDesc, 4, a7aVar, self.concededGoals);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPeriodStart() {
        return this.periodStart;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPeriodEnd() {
        return this.periodEnd;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getScoredGoals() {
        return this.scoredGoals;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getConcededGoals() {
        return this.concededGoals;
    }

    @NotNull
    public final PeriodDistributionItem copy(int id, int periodStart, int periodEnd, @Nullable Integer scoredGoals, @Nullable Integer concededGoals) {
        return new PeriodDistributionItem(id, periodStart, periodEnd, scoredGoals, concededGoals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeriodDistributionItem)) {
            return false;
        }
        PeriodDistributionItem periodDistributionItem = (PeriodDistributionItem) other;
        return this.id == periodDistributionItem.id && this.periodStart == periodDistributionItem.periodStart && this.periodEnd == periodDistributionItem.periodEnd && Intrinsics.c(this.scoredGoals, periodDistributionItem.scoredGoals) && Intrinsics.c(this.concededGoals, periodDistributionItem.concededGoals);
    }

    @Nullable
    public final Integer getConcededGoals() {
        return this.concededGoals;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPeriodEnd() {
        return this.periodEnd;
    }

    public final int getPeriodStart() {
        return this.periodStart;
    }

    @Nullable
    public final Integer getScoredGoals() {
        return this.scoredGoals;
    }

    public int hashCode() {
        int a = wv8.a(this.periodEnd, wv8.a(this.periodStart, Integer.hashCode(this.id) * 31, 31), 31);
        Integer num = this.scoredGoals;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.concededGoals;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.periodStart;
        int i3 = this.periodEnd;
        Integer num = this.scoredGoals;
        Integer num2 = this.concededGoals;
        StringBuilder s = lnb.s(i, i2, "PeriodDistributionItem(id=", ", periodStart=", ", periodEnd=");
        s.append(i3);
        s.append(", scoredGoals=");
        s.append(num);
        s.append(", concededGoals=");
        return vxd.n(s, num2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/PeriodDistributionItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/PeriodDistributionItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PeriodDistributionItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PeriodDistributionItem(int i, int i2, int i3, @Nullable Integer num, @Nullable Integer num2) {
        this.id = i;
        this.periodStart = i2;
        this.periodEnd = i3;
        this.scoredGoals = num;
        this.concededGoals = num2;
    }
}
