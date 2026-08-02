package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.a7a;
import defpackage.bxe;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u001f¨\u00064"}, d2 = {"Lcom/sofascore/model/newNetwork/PowerRanking;", "", "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "rank", "points", "id", "rankDiff", "<init>", "(Lcom/sofascore/model/mvvm/model/Team;IIILjava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Team;IIILjava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PowerRanking;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Team;", "component2", "()I", "component3", "component4", "component5", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/mvvm/model/Team;IIILjava/lang/Integer;)Lcom/sofascore/model/newNetwork/PowerRanking;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "I", "getRank", "getPoints", "getId", "Ljava/lang/Integer;", "getRankDiff", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PowerRanking {
    private final int id;
    private final int points;
    private final int rank;

    @Nullable
    private final Integer rankDiff;

    @NotNull
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new bxe(19)), null, null, null, null};

    public /* synthetic */ PowerRanking(int i, Team team, int i2, int i3, int i4, Integer num, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, PowerRanking$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.team = team;
        this.rank = i2;
        this.points = i3;
        this.id = i4;
        this.rankDiff = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ PowerRanking copy$default(PowerRanking powerRanking, Team team, int i, int i2, int i3, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            team = powerRanking.team;
        }
        if ((i4 & 2) != 0) {
            i = powerRanking.rank;
        }
        if ((i4 & 4) != 0) {
            i2 = powerRanking.points;
        }
        if ((i4 & 8) != 0) {
            i3 = powerRanking.id;
        }
        if ((i4 & 16) != 0) {
            num = powerRanking.rankDiff;
        }
        Integer num2 = num;
        int i5 = i2;
        return powerRanking.copy(team, i, i5, i3, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(PowerRanking self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.team);
        output.u(1, self.rank, serialDesc);
        output.u(2, self.points, serialDesc);
        output.u(3, self.id, serialDesc);
        output.h(serialDesc, 4, a7a.a, self.rankDiff);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getRankDiff() {
        return this.rankDiff;
    }

    @NotNull
    public final PowerRanking copy(@NotNull Team team, int rank, int points, int id, @Nullable Integer rankDiff) {
        team.getClass();
        return new PowerRanking(team, rank, points, id, rankDiff);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PowerRanking)) {
            return false;
        }
        PowerRanking powerRanking = (PowerRanking) other;
        return Intrinsics.c(this.team, powerRanking.team) && this.rank == powerRanking.rank && this.points == powerRanking.points && this.id == powerRanking.id && Intrinsics.c(this.rankDiff, powerRanking.rankDiff);
    }

    public final int getId() {
        return this.id;
    }

    public final int getPoints() {
        return this.points;
    }

    public final int getRank() {
        return this.rank;
    }

    @Nullable
    public final Integer getRankDiff() {
        return this.rankDiff;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int a = wv8.a(this.id, wv8.a(this.points, wv8.a(this.rank, this.team.hashCode() * 31, 31), 31), 31);
        Integer num = this.rankDiff;
        return a + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        Team team = this.team;
        int i = this.rank;
        int i2 = this.points;
        int i3 = this.id;
        Integer num = this.rankDiff;
        StringBuilder sb = new StringBuilder("PowerRanking(team=");
        sb.append(team);
        sb.append(", rank=");
        sb.append(i);
        sb.append(", points=");
        me4.q(sb, i2, ", id=", i3, ", rankDiff=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PowerRanking$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PowerRanking;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PowerRanking$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PowerRanking(@NotNull Team team, int i, int i2, int i3, @Nullable Integer num) {
        team.getClass();
        this.team = team;
        this.rank = i;
        this.points = i2;
        this.id = i3;
        this.rankDiff = num;
    }
}
