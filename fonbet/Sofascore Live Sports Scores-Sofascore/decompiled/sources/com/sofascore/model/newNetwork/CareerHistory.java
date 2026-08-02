package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vs1;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ@\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001d¨\u00064"}, d2 = {"Lcom/sofascore/model/newNetwork/CareerHistory;", "Ljava/io/Serializable;", "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/newNetwork/ManagerPerformance;", "performance", "", "startTimestamp", "endTimestamp", "<init>", "(Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/ManagerPerformance;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/ManagerPerformance;Ljava/lang/Integer;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/CareerHistory;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Team;", "component2", "()Lcom/sofascore/model/newNetwork/ManagerPerformance;", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/ManagerPerformance;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/CareerHistory;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/newNetwork/ManagerPerformance;", "getPerformance", "Ljava/lang/Integer;", "getStartTimestamp", "getEndTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CareerHistory implements Serializable {

    @Nullable
    private final Integer endTimestamp;

    @Nullable
    private final ManagerPerformance performance;

    @Nullable
    private final Integer startTimestamp;

    @Nullable
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new vs1(28)), null, null, null};

    public /* synthetic */ CareerHistory(int i, Team team, ManagerPerformance managerPerformance, Integer num, Integer num2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, CareerHistory$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.team = team;
        this.performance = managerPerformance;
        this.startTimestamp = num;
        this.endTimestamp = num2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ CareerHistory copy$default(CareerHistory careerHistory, Team team, ManagerPerformance managerPerformance, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            team = careerHistory.team;
        }
        if ((i & 2) != 0) {
            managerPerformance = careerHistory.performance;
        }
        if ((i & 4) != 0) {
            num = careerHistory.startTimestamp;
        }
        if ((i & 8) != 0) {
            num2 = careerHistory.endTimestamp;
        }
        return careerHistory.copy(team, managerPerformance, num, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(CareerHistory self, wf3 output, SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.team);
        output.h(serialDesc, 1, ManagerPerformance$$serializer.INSTANCE, self.performance);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.startTimestamp);
        output.h(serialDesc, 3, a7aVar, self.endTimestamp);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ManagerPerformance getPerformance() {
        return this.performance;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getEndTimestamp() {
        return this.endTimestamp;
    }

    @NotNull
    public final CareerHistory copy(@Nullable Team team, @Nullable ManagerPerformance performance, @Nullable Integer startTimestamp, @Nullable Integer endTimestamp) {
        return new CareerHistory(team, performance, startTimestamp, endTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CareerHistory)) {
            return false;
        }
        CareerHistory careerHistory = (CareerHistory) other;
        return Intrinsics.c(this.team, careerHistory.team) && Intrinsics.c(this.performance, careerHistory.performance) && Intrinsics.c(this.startTimestamp, careerHistory.startTimestamp) && Intrinsics.c(this.endTimestamp, careerHistory.endTimestamp);
    }

    @Nullable
    public final Integer getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final ManagerPerformance getPerformance() {
        return this.performance;
    }

    @Nullable
    public final Integer getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        Team team = this.team;
        int hashCode = (team == null ? 0 : team.hashCode()) * 31;
        ManagerPerformance managerPerformance = this.performance;
        int hashCode2 = (hashCode + (managerPerformance == null ? 0 : managerPerformance.hashCode())) * 31;
        Integer num = this.startTimestamp;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endTimestamp;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Team team = this.team;
        ManagerPerformance managerPerformance = this.performance;
        Integer num = this.startTimestamp;
        Integer num2 = this.endTimestamp;
        StringBuilder sb = new StringBuilder("CareerHistory(team=");
        sb.append(team);
        sb.append(", performance=");
        sb.append(managerPerformance);
        sb.append(", startTimestamp=");
        return fc6.l(num, num2, ", endTimestamp=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/CareerHistory$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/CareerHistory;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return CareerHistory$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CareerHistory(@Nullable Team team, @Nullable ManagerPerformance managerPerformance, @Nullable Integer num, @Nullable Integer num2) {
        this.team = team;
        this.performance = managerPerformance;
        this.startTimestamp = num;
        this.endTimestamp = num2;
    }
}
