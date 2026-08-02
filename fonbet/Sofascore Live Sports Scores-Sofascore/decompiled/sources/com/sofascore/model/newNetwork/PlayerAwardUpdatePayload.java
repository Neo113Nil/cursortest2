package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t2e;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "type", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;)Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/newNetwork/UniqueTournamentIndividualAwardType;", "getType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerAwardUpdatePayload {

    @Nullable
    private final Player player;

    @Nullable
    private final Team team;

    @Nullable
    private final UniqueTournamentIndividualAwardType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new t2e(22)), null};

    public /* synthetic */ PlayerAwardUpdatePayload(int i, Player player, Team team, UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, PlayerAwardUpdatePayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.team = team;
        this.type = uniqueTournamentIndividualAwardType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ PlayerAwardUpdatePayload copy$default(PlayerAwardUpdatePayload playerAwardUpdatePayload, Player player, Team team, UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerAwardUpdatePayload.player;
        }
        if ((i & 2) != 0) {
            team = playerAwardUpdatePayload.team;
        }
        if ((i & 4) != 0) {
            uniqueTournamentIndividualAwardType = playerAwardUpdatePayload.type;
        }
        return playerAwardUpdatePayload.copy(player, team, uniqueTournamentIndividualAwardType);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerAwardUpdatePayload self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.h(serialDesc, 2, UniqueTournamentIndividualAwardTypeSerializer.INSTANCE, self.type);
    }

    @Nullable
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
    public final UniqueTournamentIndividualAwardType getType() {
        return this.type;
    }

    @NotNull
    public final PlayerAwardUpdatePayload copy(@Nullable Player player, @Nullable Team team, @Nullable UniqueTournamentIndividualAwardType type) {
        return new PlayerAwardUpdatePayload(player, team, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerAwardUpdatePayload)) {
            return false;
        }
        PlayerAwardUpdatePayload playerAwardUpdatePayload = (PlayerAwardUpdatePayload) other;
        return Intrinsics.c(this.player, playerAwardUpdatePayload.player) && Intrinsics.c(this.team, playerAwardUpdatePayload.team) && this.type == playerAwardUpdatePayload.type;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final UniqueTournamentIndividualAwardType getType() {
        return this.type;
    }

    public int hashCode() {
        Player player = this.player;
        int hashCode = (player == null ? 0 : player.hashCode()) * 31;
        Team team = this.team;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType = this.type;
        return hashCode2 + (uniqueTournamentIndividualAwardType != null ? uniqueTournamentIndividualAwardType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PlayerAwardUpdatePayload(player=" + this.player + ", team=" + this.team + ", type=" + this.type + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerAwardUpdatePayload;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerAwardUpdatePayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerAwardUpdatePayload(@Nullable Player player, @Nullable Team team, @Nullable UniqueTournamentIndividualAwardType uniqueTournamentIndividualAwardType) {
        this.player = player;
        this.team = team;
        this.type = uniqueTournamentIndividualAwardType;
    }
}
