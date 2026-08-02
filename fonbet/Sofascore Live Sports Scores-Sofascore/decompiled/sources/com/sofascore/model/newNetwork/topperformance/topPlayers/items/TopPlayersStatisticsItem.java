package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.a7a;
import defpackage.eej;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uye;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 <*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002=<B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00018\u0000\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012JG\u0010\u001d\u001a\u00020\u001a\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'JR\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00028\u00002\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\t\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010%R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "T", "", "", "playedEnough", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "", "teamIds", "<init>", "(ZLcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Object;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IZLcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Object;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Z", "component2", "()Lcom/sofascore/model/mvvm/model/Player;", "component3", "()Lcom/sofascore/model/mvvm/model/Team;", "component4", "()Ljava/lang/Object;", "component5", "()Ljava/util/List;", "copy", "(ZLcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Object;Ljava/util/List;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getPlayedEnough", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Ljava/lang/Object;", "getStatistics", "Ljava/util/List;", "getTeamIds", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TopPlayersStatisticsItem<T> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean playedEnough;

    @NotNull
    private final Player player;
    private final T statistics;

    @Nullable
    private final Team team;

    @Nullable
    private final List<Integer> teamIds;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new eej(10)), null, ypa.a(ysaVar, new eej(11))};
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.TopPlayersStatisticsItem", null, 5);
        uyeVar.j("playedEnough", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("team", false);
        uyeVar.j(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, false);
        uyeVar.j("teamIds", false);
        $cachedDescriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ TopPlayersStatisticsItem(int i, boolean z, Player player, Team team, Object obj, List list, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, $cachedDescriptor);
            throw null;
        }
        this.playedEnough = z;
        this.player = player;
        this.team = team;
        this.statistics = obj;
        this.teamIds = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(a7a.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopPlayersStatisticsItem copy$default(TopPlayersStatisticsItem topPlayersStatisticsItem, boolean z, Player player, Team team, Object obj, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = topPlayersStatisticsItem.playedEnough;
        }
        if ((i & 2) != 0) {
            player = topPlayersStatisticsItem.player;
        }
        if ((i & 4) != 0) {
            team = topPlayersStatisticsItem.team;
        }
        T t = obj;
        if ((i & 8) != 0) {
            t = topPlayersStatisticsItem.statistics;
        }
        if ((i & 16) != 0) {
            list = topPlayersStatisticsItem.teamIds;
        }
        List list2 = list;
        Team team2 = team;
        return topPlayersStatisticsItem.copy(z, player, team2, t, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(TopPlayersStatisticsItem self, wf3 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        joa[] joaVarArr = $childSerializers;
        output.x(serialDesc, 0, self.playedEnough);
        output.f(serialDesc, 1, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.team);
        output.f(serialDesc, 3, typeSerial0, self.statistics);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.teamIds);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getPlayedEnough() {
        return this.playedEnough;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    public final T component4() {
        return this.statistics;
    }

    @Nullable
    public final List<Integer> component5() {
        return this.teamIds;
    }

    @NotNull
    public final TopPlayersStatisticsItem<T> copy(boolean playedEnough, @NotNull Player player, @Nullable Team team, T statistics, @Nullable List<Integer> teamIds) {
        player.getClass();
        return new TopPlayersStatisticsItem<>(playedEnough, player, team, statistics, teamIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopPlayersStatisticsItem)) {
            return false;
        }
        TopPlayersStatisticsItem topPlayersStatisticsItem = (TopPlayersStatisticsItem) other;
        return this.playedEnough == topPlayersStatisticsItem.playedEnough && Intrinsics.c(this.player, topPlayersStatisticsItem.player) && Intrinsics.c(this.team, topPlayersStatisticsItem.team) && Intrinsics.c(this.statistics, topPlayersStatisticsItem.statistics) && Intrinsics.c(this.teamIds, topPlayersStatisticsItem.teamIds);
    }

    public final boolean getPlayedEnough() {
        return this.playedEnough;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public final T getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final List<Integer> getTeamIds() {
        return this.teamIds;
    }

    public int hashCode() {
        int hashCode = (this.player.hashCode() + (Boolean.hashCode(this.playedEnough) * 31)) * 31;
        Team team = this.team;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        T t = this.statistics;
        int hashCode3 = (hashCode2 + (t == null ? 0 : t.hashCode())) * 31;
        List<Integer> list = this.teamIds;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z = this.playedEnough;
        Player player = this.player;
        Team team = this.team;
        T t = this.statistics;
        List<Integer> list = this.teamIds;
        StringBuilder sb = new StringBuilder("TopPlayersStatisticsItem(playedEnough=");
        sb.append(z);
        sb.append(", player=");
        sb.append(player);
        sb.append(", team=");
        sb.append(team);
        sb.append(", statistics=");
        sb.append(t);
        sb.append(", teamIds=");
        return mz1.p(sb, list, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/TopPlayersStatisticsItem;", "T", "typeSerial0", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new TopPlayersStatisticsItem$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    public TopPlayersStatisticsItem(boolean z, @NotNull Player player, @Nullable Team team, T t, @Nullable List<Integer> list) {
        player.getClass();
        this.playedEnough = z;
        this.player = player;
        this.team = team;
        this.statistics = t;
        this.teamIds = list;
    }
}
