package com.sofascore.model.network.response;

import defpackage.a7a;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wc4;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\t\b\u0016¢\u0006\u0004\b\f\u0010\u000eB[\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010#JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b7\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010#¨\u0006;"}, d2 = {"Lcom/sofascore/model/network/response/DistributionItem;", "Ljava/io/Serializable;", "", "id", "", "type", "", "Lcom/sofascore/model/network/response/PeriodDistributionItem;", "periods", "matches", "scoredGoals", "concededGoals", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "()V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/DistributionItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Integer;", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/network/response/DistributionItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getPeriods", "Ljava/lang/Integer;", "getMatches", "getScoredGoals", "getConcededGoals", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DistributionItem implements Serializable {

    @Nullable
    private final Integer concededGoals;
    private final int id;

    @Nullable
    private final Integer matches;

    @Nullable
    private final List<PeriodDistributionItem> periods;

    @Nullable
    private final Integer scoredGoals;

    @NotNull
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new wc4(16)), null, null, null};

    public /* synthetic */ DistributionItem(int i, int i2, String str, List list, Integer num, Integer num2, Integer num3, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, DistributionItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.type = str;
        this.periods = list;
        this.matches = num;
        this.scoredGoals = num2;
        this.concededGoals = num3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(PeriodDistributionItem$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ DistributionItem copy$default(DistributionItem distributionItem, int i, String str, List list, Integer num, Integer num2, Integer num3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = distributionItem.id;
        }
        if ((i2 & 2) != 0) {
            str = distributionItem.type;
        }
        if ((i2 & 4) != 0) {
            list = distributionItem.periods;
        }
        if ((i2 & 8) != 0) {
            num = distributionItem.matches;
        }
        if ((i2 & 16) != 0) {
            num2 = distributionItem.scoredGoals;
        }
        if ((i2 & 32) != 0) {
            num3 = distributionItem.concededGoals;
        }
        Integer num4 = num2;
        Integer num5 = num3;
        return distributionItem.copy(i, str, list, num, num4, num5);
    }

    public static final /* synthetic */ void write$Self$model_release(DistributionItem self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.y(serialDesc, 1, self.type);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.periods);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 3, a7aVar, self.matches);
        output.h(serialDesc, 4, a7aVar, self.scoredGoals);
        output.h(serialDesc, 5, a7aVar, self.concededGoals);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final List<PeriodDistributionItem> component3() {
        return this.periods;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getScoredGoals() {
        return this.scoredGoals;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getConcededGoals() {
        return this.concededGoals;
    }

    @NotNull
    public final DistributionItem copy(int id, @NotNull String type, @Nullable List<PeriodDistributionItem> periods, @Nullable Integer matches, @Nullable Integer scoredGoals, @Nullable Integer concededGoals) {
        type.getClass();
        return new DistributionItem(id, type, periods, matches, scoredGoals, concededGoals);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DistributionItem)) {
            return false;
        }
        DistributionItem distributionItem = (DistributionItem) other;
        return this.id == distributionItem.id && Intrinsics.c(this.type, distributionItem.type) && Intrinsics.c(this.periods, distributionItem.periods) && Intrinsics.c(this.matches, distributionItem.matches) && Intrinsics.c(this.scoredGoals, distributionItem.scoredGoals) && Intrinsics.c(this.concededGoals, distributionItem.concededGoals);
    }

    @Nullable
    public final Integer getConcededGoals() {
        return this.concededGoals;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getMatches() {
        return this.matches;
    }

    @Nullable
    public final List<PeriodDistributionItem> getPeriods() {
        return this.periods;
    }

    @Nullable
    public final Integer getScoredGoals() {
        return this.scoredGoals;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int c = dmi.c(Integer.hashCode(this.id) * 31, 31, this.type);
        List<PeriodDistributionItem> list = this.periods;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.matches;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.scoredGoals;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.concededGoals;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        String str = this.type;
        List<PeriodDistributionItem> list = this.periods;
        Integer num = this.matches;
        Integer num2 = this.scoredGoals;
        Integer num3 = this.concededGoals;
        StringBuilder t = dmi.t(i, "DistributionItem(id=", ", type=", str, ", periods=");
        t.append(list);
        t.append(", matches=");
        t.append(num);
        t.append(", scoredGoals=");
        return fc6.l(num2, num3, ", concededGoals=", ")", t);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/DistributionItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/DistributionItem;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DistributionItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DistributionItem(int i, @NotNull String str, @Nullable List<PeriodDistributionItem> list, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        str.getClass();
        this.id = i;
        this.type = str;
        this.periods = list;
        this.matches = num;
        this.scoredGoals = num2;
        this.concededGoals = num3;
    }

    public DistributionItem() {
        this(0, "", new ArrayList(), 0, 0, 0);
    }
}
