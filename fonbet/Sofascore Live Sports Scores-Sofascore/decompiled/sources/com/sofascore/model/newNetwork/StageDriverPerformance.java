package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.b1i;
import defpackage.dmi;
import defpackage.joa;
import defpackage.km5;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003¢\u0006\u0004\b&\u0010%JZ\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010#J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b8\u0010%¨\u0006;"}, d2 = {"Lcom/sofascore/model/newNetwork/StageDriverPerformance;", "", "", "name", "nameCode", "Lcom/sofascore/model/mvvm/model/Team;", "parentTeam", "", "startNumber", "", "Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceLap;", "laps", "Lcom/sofascore/model/newNetwork/StageDriverPerformanceRaceStage;", "stages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;ILjava/util/List;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;ILjava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/StageDriverPerformance;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "component4", "()I", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/Team;ILjava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/StageDriverPerformance;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getNameCode", "Lcom/sofascore/model/mvvm/model/Team;", "getParentTeam", "I", "getStartNumber", "Ljava/util/List;", "getLaps", "getStages", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StageDriverPerformance {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<StageDriverPerformanceRaceLap> laps;

    @NotNull
    private final String name;

    @NotNull
    private final String nameCode;

    @Nullable
    private final Team parentTeam;

    @NotNull
    private final List<StageDriverPerformanceRaceStage> stages;
    private final int startNumber;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new b1i(4)), null, ypa.a(ysaVar, new b1i(5)), ypa.a(ysaVar, new b1i(6))};
    }

    public StageDriverPerformance(int i, String str, String str2, Team team, int i2, List list, List list2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, StageDriverPerformance$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.nameCode = str2;
        this.parentTeam = team;
        this.startNumber = i2;
        if ((i & 16) == 0) {
            this.laps = km5.a;
        } else {
            this.laps = list;
        }
        if ((i & 32) == 0) {
            this.stages = km5.a;
        } else {
            this.stages = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(StageDriverPerformanceRaceLap$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(StageDriverPerformanceRaceStage$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ StageDriverPerformance copy$default(StageDriverPerformance stageDriverPerformance, String str, String str2, Team team, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stageDriverPerformance.name;
        }
        if ((i2 & 2) != 0) {
            str2 = stageDriverPerformance.nameCode;
        }
        if ((i2 & 4) != 0) {
            team = stageDriverPerformance.parentTeam;
        }
        if ((i2 & 8) != 0) {
            i = stageDriverPerformance.startNumber;
        }
        if ((i2 & 16) != 0) {
            list = stageDriverPerformance.laps;
        }
        if ((i2 & 32) != 0) {
            list2 = stageDriverPerformance.stages;
        }
        List list3 = list;
        List list4 = list2;
        return stageDriverPerformance.copy(str, str2, team, i, list3, list4);
    }

    public static final void write$Self$model_release(StageDriverPerformance self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.name);
        output.y(serialDesc, 1, self.nameCode);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.parentTeam);
        output.u(3, self.startNumber, serialDesc);
        if (output.o(serialDesc) || !Intrinsics.c(self.laps, km5.a)) {
            output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.laps);
        }
        if (!output.o(serialDesc) && Intrinsics.c(self.stages, km5.a)) {
            return;
        }
        output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.stages);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNameCode() {
        return this.nameCode;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStartNumber() {
        return this.startNumber;
    }

    @NotNull
    public final List<StageDriverPerformanceRaceLap> component5() {
        return this.laps;
    }

    @NotNull
    public final List<StageDriverPerformanceRaceStage> component6() {
        return this.stages;
    }

    @NotNull
    public final StageDriverPerformance copy(@NotNull String name, @NotNull String nameCode, @Nullable Team parentTeam, int startNumber, @NotNull List<StageDriverPerformanceRaceLap> laps, @NotNull List<StageDriverPerformanceRaceStage> stages) {
        name.getClass();
        nameCode.getClass();
        laps.getClass();
        stages.getClass();
        return new StageDriverPerformance(name, nameCode, parentTeam, startNumber, laps, stages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StageDriverPerformance)) {
            return false;
        }
        StageDriverPerformance stageDriverPerformance = (StageDriverPerformance) other;
        return Intrinsics.c(this.name, stageDriverPerformance.name) && Intrinsics.c(this.nameCode, stageDriverPerformance.nameCode) && Intrinsics.c(this.parentTeam, stageDriverPerformance.parentTeam) && this.startNumber == stageDriverPerformance.startNumber && Intrinsics.c(this.laps, stageDriverPerformance.laps) && Intrinsics.c(this.stages, stageDriverPerformance.stages);
    }

    @NotNull
    public final List<StageDriverPerformanceRaceLap> getLaps() {
        return this.laps;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNameCode() {
        return this.nameCode;
    }

    @Nullable
    public final Team getParentTeam() {
        return this.parentTeam;
    }

    @NotNull
    public final List<StageDriverPerformanceRaceStage> getStages() {
        return this.stages;
    }

    public final int getStartNumber() {
        return this.startNumber;
    }

    public int hashCode() {
        int c = dmi.c(this.name.hashCode() * 31, 31, this.nameCode);
        Team team = this.parentTeam;
        return this.stages.hashCode() + dmi.d(wv8.a(this.startNumber, (c + (team == null ? 0 : team.hashCode())) * 31, 31), 31, this.laps);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.nameCode;
        Team team = this.parentTeam;
        int i = this.startNumber;
        List<StageDriverPerformanceRaceLap> list = this.laps;
        List<StageDriverPerformanceRaceStage> list2 = this.stages;
        StringBuilder s = mz1.s("StageDriverPerformance(name=", str, ", nameCode=", str2, ", parentTeam=");
        s.append(team);
        s.append(", startNumber=");
        s.append(i);
        s.append(", laps=");
        return me4.j(s, list, ", stages=", list2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/StageDriverPerformance$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/StageDriverPerformance;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StageDriverPerformance$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StageDriverPerformance(@NotNull String str, @NotNull String str2, @Nullable Team team, int i, @NotNull List<StageDriverPerformanceRaceLap> list, @NotNull List<StageDriverPerformanceRaceStage> list2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.name = str;
        this.nameCode = str2;
        this.parentTeam = team;
        this.startNumber = i;
        this.laps = list;
        this.stages = list2;
    }

    public StageDriverPerformance(String str, String str2, Team team, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, team, i, (i2 & 16) != 0 ? km5.a : list, (i2 & 32) != 0 ? km5.a : list2);
    }
}
