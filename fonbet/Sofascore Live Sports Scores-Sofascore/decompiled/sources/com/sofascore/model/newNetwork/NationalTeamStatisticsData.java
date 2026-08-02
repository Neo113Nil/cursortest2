package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
import defpackage.ivc;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b-\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, d2 = {"Lcom/sofascore/model/newNetwork/NationalTeamStatisticsData;", "", "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "appearances", "goals", "", "debutTimestamp", "<init>", "(Lcom/sofascore/model/mvvm/model/Team;IILjava/lang/Long;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Team;IILjava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/NationalTeamStatisticsData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Team;", "component2", "()I", "component3", "component4", "()Ljava/lang/Long;", "copy", "(Lcom/sofascore/model/mvvm/model/Team;IILjava/lang/Long;)Lcom/sofascore/model/newNetwork/NationalTeamStatisticsData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "I", "getAppearances", "getGoals", "Ljava/lang/Long;", "getDebutTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NationalTeamStatisticsData {
    private final int appearances;

    @Nullable
    private final Long debutTimestamp;
    private final int goals;

    @NotNull
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new ivc(3)), null, null, null};

    public /* synthetic */ NationalTeamStatisticsData(int i, Team team, int i2, int i3, Long l, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, NationalTeamStatisticsData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.team = team;
        this.appearances = i2;
        this.goals = i3;
        if ((i & 8) == 0) {
            this.debutTimestamp = 0L;
        } else {
            this.debutTimestamp = l;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ NationalTeamStatisticsData copy$default(NationalTeamStatisticsData nationalTeamStatisticsData, Team team, int i, int i2, Long l, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            team = nationalTeamStatisticsData.team;
        }
        if ((i3 & 2) != 0) {
            i = nationalTeamStatisticsData.appearances;
        }
        if ((i3 & 4) != 0) {
            i2 = nationalTeamStatisticsData.goals;
        }
        if ((i3 & 8) != 0) {
            l = nationalTeamStatisticsData.debutTimestamp;
        }
        return nationalTeamStatisticsData.copy(team, i, i2, l);
    }

    public static final /* synthetic */ void write$Self$model_release(NationalTeamStatisticsData self, wf3 output, SerialDescriptor serialDesc) {
        Long l;
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.team);
        output.u(1, self.appearances, serialDesc);
        output.u(2, self.goals, serialDesc);
        if (output.o(serialDesc) || (l = self.debutTimestamp) == null || l.longValue() != 0) {
            output.h(serialDesc, 3, lkb.a, self.debutTimestamp);
        }
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAppearances() {
        return this.appearances;
    }

    /* renamed from: component3, reason: from getter */
    public final int getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getDebutTimestamp() {
        return this.debutTimestamp;
    }

    @NotNull
    public final NationalTeamStatisticsData copy(@NotNull Team team, int appearances, int goals, @Nullable Long debutTimestamp) {
        team.getClass();
        return new NationalTeamStatisticsData(team, appearances, goals, debutTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NationalTeamStatisticsData)) {
            return false;
        }
        NationalTeamStatisticsData nationalTeamStatisticsData = (NationalTeamStatisticsData) other;
        return Intrinsics.c(this.team, nationalTeamStatisticsData.team) && this.appearances == nationalTeamStatisticsData.appearances && this.goals == nationalTeamStatisticsData.goals && Intrinsics.c(this.debutTimestamp, nationalTeamStatisticsData.debutTimestamp);
    }

    public final int getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Long getDebutTimestamp() {
        return this.debutTimestamp;
    }

    public final int getGoals() {
        return this.goals;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int a = wv8.a(this.goals, wv8.a(this.appearances, this.team.hashCode() * 31, 31), 31);
        Long l = this.debutTimestamp;
        return a + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "NationalTeamStatisticsData(team=" + this.team + ", appearances=" + this.appearances + ", goals=" + this.goals + ", debutTimestamp=" + this.debutTimestamp + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/NationalTeamStatisticsData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/NationalTeamStatisticsData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return NationalTeamStatisticsData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public NationalTeamStatisticsData(@NotNull Team team, int i, int i2, @Nullable Long l) {
        team.getClass();
        this.team = team;
        this.appearances = i;
        this.goals = i2;
        this.debutTimestamp = l;
    }

    public /* synthetic */ NationalTeamStatisticsData(Team team, int i, int i2, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(team, i, i2, (i3 & 8) != 0 ? 0L : l);
    }
}
