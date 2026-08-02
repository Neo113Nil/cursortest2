package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics;
import com.sofascore.model.network.response.BaseballPlayerEventStatistics$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.i91;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J:\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/BaseballTopPerformer;", "", "Lcom/sofascore/model/newNetwork/BaseballTopPerformerRole;", "role", "Lcom/sofascore/model/network/response/BaseballPlayerEventStatistics;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "<init>", "(Lcom/sofascore/model/newNetwork/BaseballTopPerformerRole;Lcom/sofascore/model/network/response/BaseballPlayerEventStatistics;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/BaseballTopPerformerRole;Lcom/sofascore/model/network/response/BaseballPlayerEventStatistics;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/BaseballTopPerformer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/BaseballTopPerformerRole;", "component2", "()Lcom/sofascore/model/network/response/BaseballPlayerEventStatistics;", "component3", "()Lcom/sofascore/model/mvvm/model/Player;", "component4", "()Lcom/sofascore/model/mvvm/model/Team;", "copy", "(Lcom/sofascore/model/newNetwork/BaseballTopPerformerRole;Lcom/sofascore/model/network/response/BaseballPlayerEventStatistics;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;)Lcom/sofascore/model/newNetwork/BaseballTopPerformer;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/BaseballTopPerformerRole;", "getRole", "Lcom/sofascore/model/network/response/BaseballPlayerEventStatistics;", "getStatistics", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BaseballTopPerformer {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Player player;

    @Nullable
    private final BaseballTopPerformerRole role;

    @NotNull
    private final BaseballPlayerEventStatistics statistics;

    @NotNull
    private final Team team;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new i91(7)), null, null, ypa.a(ysaVar, new i91(8))};
    }

    public /* synthetic */ BaseballTopPerformer(int i, BaseballTopPerformerRole baseballTopPerformerRole, BaseballPlayerEventStatistics baseballPlayerEventStatistics, Player player, Team team, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, BaseballTopPerformer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.role = baseballTopPerformerRole;
        this.statistics = baseballPlayerEventStatistics;
        this.player = player;
        this.team = team;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return BaseballTopPerformerRole.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ BaseballTopPerformer copy$default(BaseballTopPerformer baseballTopPerformer, BaseballTopPerformerRole baseballTopPerformerRole, BaseballPlayerEventStatistics baseballPlayerEventStatistics, Player player, Team team, int i, Object obj) {
        if ((i & 1) != 0) {
            baseballTopPerformerRole = baseballTopPerformer.role;
        }
        if ((i & 2) != 0) {
            baseballPlayerEventStatistics = baseballTopPerformer.statistics;
        }
        if ((i & 4) != 0) {
            player = baseballTopPerformer.player;
        }
        if ((i & 8) != 0) {
            team = baseballTopPerformer.team;
        }
        return baseballTopPerformer.copy(baseballTopPerformerRole, baseballPlayerEventStatistics, player, team);
    }

    public static final /* synthetic */ void write$Self$model_release(BaseballTopPerformer self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.role);
        output.f(serialDesc, 1, BaseballPlayerEventStatistics$$serializer.INSTANCE, self.statistics);
        output.f(serialDesc, 2, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.team);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BaseballTopPerformerRole getRole() {
        return this.role;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BaseballPlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final BaseballTopPerformer copy(@Nullable BaseballTopPerformerRole role, @NotNull BaseballPlayerEventStatistics statistics, @NotNull Player player, @NotNull Team team) {
        statistics.getClass();
        player.getClass();
        team.getClass();
        return new BaseballTopPerformer(role, statistics, player, team);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseballTopPerformer)) {
            return false;
        }
        BaseballTopPerformer baseballTopPerformer = (BaseballTopPerformer) other;
        return this.role == baseballTopPerformer.role && Intrinsics.c(this.statistics, baseballTopPerformer.statistics) && Intrinsics.c(this.player, baseballTopPerformer.player) && Intrinsics.c(this.team, baseballTopPerformer.team);
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final BaseballTopPerformerRole getRole() {
        return this.role;
    }

    @NotNull
    public final BaseballPlayerEventStatistics getStatistics() {
        return this.statistics;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        BaseballTopPerformerRole baseballTopPerformerRole = this.role;
        return this.team.hashCode() + ((this.player.hashCode() + ((this.statistics.hashCode() + ((baseballTopPerformerRole == null ? 0 : baseballTopPerformerRole.hashCode()) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "BaseballTopPerformer(role=" + this.role + ", statistics=" + this.statistics + ", player=" + this.player + ", team=" + this.team + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/BaseballTopPerformer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/BaseballTopPerformer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BaseballTopPerformer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BaseballTopPerformer(@Nullable BaseballTopPerformerRole baseballTopPerformerRole, @NotNull BaseballPlayerEventStatistics baseballPlayerEventStatistics, @NotNull Player player, @NotNull Team team) {
        baseballPlayerEventStatistics.getClass();
        player.getClass();
        team.getClass();
        this.role = baseballTopPerformerRole;
        this.statistics = baseballPlayerEventStatistics;
        this.player = player;
        this.team = team;
    }
}
