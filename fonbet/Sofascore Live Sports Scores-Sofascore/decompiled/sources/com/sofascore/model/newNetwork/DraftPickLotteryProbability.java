package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.c88;
import defpackage.fc6;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wc4;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001bJT\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001bJ\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b6\u0010!R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b7\u0010\u001b¨\u0006:"}, d2 = {"Lcom/sofascore/model/newNetwork/DraftPickLotteryProbability;", "", "", "pickNumber", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "", "firstPickProbability", "Lcom/sofascore/model/mvvm/model/Team;", "team", "tradedFromTeam", "id", "<init>", "(ILjava/lang/Integer;Ljava/lang/Float;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/Integer;Ljava/lang/Float;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/DraftPickLotteryProbability;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Float;", "component4", "()Lcom/sofascore/model/mvvm/model/Team;", "component5", "component6", "copy", "(ILjava/lang/Integer;Ljava/lang/Float;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;I)Lcom/sofascore/model/newNetwork/DraftPickLotteryProbability;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPickNumber", "Ljava/lang/Integer;", "getRound", "Ljava/lang/Float;", "getFirstPickProbability", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "getTradedFromTeam", "getId", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DraftPickLotteryProbability {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Float firstPickProbability;
    private final int id;
    private final int pickNumber;

    @Nullable
    private final Integer round;

    @Nullable
    private final Team team;

    @Nullable
    private final Team tradedFromTeam;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, null, ypa.a(ysaVar, new wc4(18)), ypa.a(ysaVar, new wc4(19)), null};
    }

    public /* synthetic */ DraftPickLotteryProbability(int i, int i2, Integer num, Float f, Team team, Team team2, int i3, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, DraftPickLotteryProbability$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.pickNumber = i2;
        this.round = num;
        this.firstPickProbability = f;
        this.team = team;
        this.tradedFromTeam = team2;
        this.id = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ DraftPickLotteryProbability copy$default(DraftPickLotteryProbability draftPickLotteryProbability, int i, Integer num, Float f, Team team, Team team2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = draftPickLotteryProbability.pickNumber;
        }
        if ((i3 & 2) != 0) {
            num = draftPickLotteryProbability.round;
        }
        if ((i3 & 4) != 0) {
            f = draftPickLotteryProbability.firstPickProbability;
        }
        if ((i3 & 8) != 0) {
            team = draftPickLotteryProbability.team;
        }
        if ((i3 & 16) != 0) {
            team2 = draftPickLotteryProbability.tradedFromTeam;
        }
        if ((i3 & 32) != 0) {
            i2 = draftPickLotteryProbability.id;
        }
        Team team3 = team2;
        int i4 = i2;
        return draftPickLotteryProbability.copy(i, num, f, team, team3, i4);
    }

    public static final /* synthetic */ void write$Self$model_release(DraftPickLotteryProbability self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.pickNumber, serialDesc);
        output.h(serialDesc, 1, a7a.a, self.round);
        output.h(serialDesc, 2, c88.a, self.firstPickProbability);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.team);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.tradedFromTeam);
        output.u(5, self.id, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPickNumber() {
        return this.pickNumber;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getRound() {
        return this.round;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Float getFirstPickProbability() {
        return this.firstPickProbability;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Team getTradedFromTeam() {
        return this.tradedFromTeam;
    }

    /* renamed from: component6, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    public final DraftPickLotteryProbability copy(int pickNumber, @Nullable Integer round, @Nullable Float firstPickProbability, @Nullable Team team, @Nullable Team tradedFromTeam, int id) {
        return new DraftPickLotteryProbability(pickNumber, round, firstPickProbability, team, tradedFromTeam, id);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DraftPickLotteryProbability)) {
            return false;
        }
        DraftPickLotteryProbability draftPickLotteryProbability = (DraftPickLotteryProbability) other;
        return this.pickNumber == draftPickLotteryProbability.pickNumber && Intrinsics.c(this.round, draftPickLotteryProbability.round) && Intrinsics.c(this.firstPickProbability, draftPickLotteryProbability.firstPickProbability) && Intrinsics.c(this.team, draftPickLotteryProbability.team) && Intrinsics.c(this.tradedFromTeam, draftPickLotteryProbability.tradedFromTeam) && this.id == draftPickLotteryProbability.id;
    }

    @Nullable
    public final Float getFirstPickProbability() {
        return this.firstPickProbability;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPickNumber() {
        return this.pickNumber;
    }

    @Nullable
    public final Integer getRound() {
        return this.round;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final Team getTradedFromTeam() {
        return this.tradedFromTeam;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.pickNumber) * 31;
        Integer num = this.round;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.firstPickProbability;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Team team = this.team;
        int hashCode4 = (hashCode3 + (team == null ? 0 : team.hashCode())) * 31;
        Team team2 = this.tradedFromTeam;
        return Integer.hashCode(this.id) + ((hashCode4 + (team2 != null ? team2.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.pickNumber;
        Integer num = this.round;
        Float f = this.firstPickProbability;
        Team team = this.team;
        Team team2 = this.tradedFromTeam;
        int i2 = this.id;
        StringBuilder r = fc6.r("DraftPickLotteryProbability(pickNumber=", ", round=", ", firstPickProbability=", num, i);
        r.append(f);
        r.append(", team=");
        r.append(team);
        r.append(", tradedFromTeam=");
        r.append(team2);
        r.append(", id=");
        r.append(i2);
        r.append(")");
        return r.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/DraftPickLotteryProbability$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/DraftPickLotteryProbability;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DraftPickLotteryProbability$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public DraftPickLotteryProbability(int i, @Nullable Integer num, @Nullable Float f, @Nullable Team team, @Nullable Team team2, int i2) {
        this.pickNumber = i;
        this.round = num;
        this.firstPickProbability = f;
        this.team = team;
        this.tradedFromTeam = team2;
        this.id = i2;
    }
}
