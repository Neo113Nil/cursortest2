package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import defpackage.dmi;
import defpackage.lga;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001d¨\u00060"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatisticsRaw;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lkotlinx/serialization/json/c;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "", "playedEnough", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lkotlinx/serialization/json/c;Z)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lkotlinx/serialization/json/c;ZLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatisticsRaw;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lkotlinx/serialization/json/c;", "component3", "()Z", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lkotlinx/serialization/json/c;Z)Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatisticsRaw;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lkotlinx/serialization/json/c;", "getStatistics", "Z", "getPlayedEnough", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamPlayerSeasonStatisticsRaw {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean playedEnough;

    @NotNull
    private final Player player;

    @NotNull
    private final c statistics;

    public /* synthetic */ TeamPlayerSeasonStatisticsRaw(int i, Player player, c cVar, boolean z, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, TeamPlayerSeasonStatisticsRaw$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.statistics = cVar;
        this.playedEnough = z;
    }

    public static /* synthetic */ TeamPlayerSeasonStatisticsRaw copy$default(TeamPlayerSeasonStatisticsRaw teamPlayerSeasonStatisticsRaw, Player player, c cVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            player = teamPlayerSeasonStatisticsRaw.player;
        }
        if ((i & 2) != 0) {
            cVar = teamPlayerSeasonStatisticsRaw.statistics;
        }
        if ((i & 4) != 0) {
            z = teamPlayerSeasonStatisticsRaw.playedEnough;
        }
        return teamPlayerSeasonStatisticsRaw.copy(player, cVar, z);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamPlayerSeasonStatisticsRaw self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 1, lga.a, self.statistics);
        output.x(serialDesc, 2, self.playedEnough);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final c getStatistics() {
        return this.statistics;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPlayedEnough() {
        return this.playedEnough;
    }

    @NotNull
    public final TeamPlayerSeasonStatisticsRaw copy(@NotNull Player player, @NotNull c statistics, boolean playedEnough) {
        player.getClass();
        statistics.getClass();
        return new TeamPlayerSeasonStatisticsRaw(player, statistics, playedEnough);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamPlayerSeasonStatisticsRaw)) {
            return false;
        }
        TeamPlayerSeasonStatisticsRaw teamPlayerSeasonStatisticsRaw = (TeamPlayerSeasonStatisticsRaw) other;
        return Intrinsics.c(this.player, teamPlayerSeasonStatisticsRaw.player) && Intrinsics.c(this.statistics, teamPlayerSeasonStatisticsRaw.statistics) && this.playedEnough == teamPlayerSeasonStatisticsRaw.playedEnough;
    }

    public final boolean getPlayedEnough() {
        return this.playedEnough;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final c getStatistics() {
        return this.statistics;
    }

    public int hashCode() {
        return Boolean.hashCode(this.playedEnough) + dmi.g(this.statistics.a, this.player.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        c cVar = this.statistics;
        boolean z = this.playedEnough;
        StringBuilder sb = new StringBuilder("TeamPlayerSeasonStatisticsRaw(player=");
        sb.append(player);
        sb.append(", statistics=");
        sb.append(cVar);
        sb.append(", playedEnough=");
        return wt3.p(sb, z, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatisticsRaw$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamPlayerSeasonStatisticsRaw;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamPlayerSeasonStatisticsRaw$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public TeamPlayerSeasonStatisticsRaw(@NotNull Player player, @NotNull c cVar, boolean z) {
        player.getClass();
        cVar.getClass();
        this.player = player;
        this.statistics = cVar;
        this.playedEnough = z;
    }
}
