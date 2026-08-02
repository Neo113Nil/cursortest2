package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.bxe;
import defpackage.joa;
import defpackage.lkb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b4\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\"¨\u00069"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerWithNationalTeam;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "appearances", "goals", "", "debutTimestamp", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerWithNationalTeam;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "()Ljava/lang/Long;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/sofascore/model/newNetwork/PlayerWithNationalTeam;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Ljava/lang/Integer;", "getAppearances", "getGoals", "Ljava/lang/Long;", "getDebutTimestamp", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerWithNationalTeam {

    @Nullable
    private final Integer appearances;

    @Nullable
    private final Long debutTimestamp;

    @Nullable
    private final Integer goals;

    @NotNull
    private final Player player;

    @Nullable
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new bxe(8)), null, null, null};

    public /* synthetic */ PlayerWithNationalTeam(int i, Player player, Team team, Integer num, Integer num2, Long l, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, PlayerWithNationalTeam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.team = team;
        this.appearances = num;
        this.goals = num2;
        this.debutTimestamp = l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ PlayerWithNationalTeam copy$default(PlayerWithNationalTeam playerWithNationalTeam, Player player, Team team, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerWithNationalTeam.player;
        }
        if ((i & 2) != 0) {
            team = playerWithNationalTeam.team;
        }
        if ((i & 4) != 0) {
            num = playerWithNationalTeam.appearances;
        }
        if ((i & 8) != 0) {
            num2 = playerWithNationalTeam.goals;
        }
        if ((i & 16) != 0) {
            l = playerWithNationalTeam.debutTimestamp;
        }
        Long l2 = l;
        Integer num3 = num;
        return playerWithNationalTeam.copy(player, team, num3, num2, l2);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerWithNationalTeam self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.appearances);
        output.h(serialDesc, 3, a7aVar, self.goals);
        output.h(serialDesc, 4, lkb.a, self.debutTimestamp);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getGoals() {
        return this.goals;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Long getDebutTimestamp() {
        return this.debutTimestamp;
    }

    @NotNull
    public final PlayerWithNationalTeam copy(@NotNull Player player, @Nullable Team team, @Nullable Integer appearances, @Nullable Integer goals, @Nullable Long debutTimestamp) {
        player.getClass();
        return new PlayerWithNationalTeam(player, team, appearances, goals, debutTimestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerWithNationalTeam)) {
            return false;
        }
        PlayerWithNationalTeam playerWithNationalTeam = (PlayerWithNationalTeam) other;
        return Intrinsics.c(this.player, playerWithNationalTeam.player) && Intrinsics.c(this.team, playerWithNationalTeam.team) && Intrinsics.c(this.appearances, playerWithNationalTeam.appearances) && Intrinsics.c(this.goals, playerWithNationalTeam.goals) && Intrinsics.c(this.debutTimestamp, playerWithNationalTeam.debutTimestamp);
    }

    @Nullable
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    public final Long getDebutTimestamp() {
        return this.debutTimestamp;
    }

    @Nullable
    public final Integer getGoals() {
        return this.goals;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        Team team = this.team;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Integer num = this.appearances;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.goals;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.debutTimestamp;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        Team team = this.team;
        Integer num = this.appearances;
        Integer num2 = this.goals;
        Long l = this.debutTimestamp;
        StringBuilder sb = new StringBuilder("PlayerWithNationalTeam(player=");
        sb.append(player);
        sb.append(", team=");
        sb.append(team);
        sb.append(", appearances=");
        vxd.r(num, num2, ", goals=", ", debutTimestamp=", sb);
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerWithNationalTeam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerWithNationalTeam;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerWithNationalTeam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerWithNationalTeam(@NotNull Player player, @Nullable Team team, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l) {
        player.getClass();
        this.player = player;
        this.team = team;
        this.appearances = num;
        this.goals = num2;
        this.debutTimestamp = l;
    }
}
