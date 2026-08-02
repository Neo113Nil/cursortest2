package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.boe;
import defpackage.dmi;
import defpackage.fc6;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ<\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001e¨\u00062"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "status", "reason", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Ljava/lang/String;", "getStatus", "getReason", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerInjuryUpdatePayload {

    @Nullable
    private final Player player;

    @NotNull
    private final String reason;

    @NotNull
    private final String status;

    @Nullable
    private final Team team;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new boe(16)), null, null};

    public /* synthetic */ PlayerInjuryUpdatePayload(int i, Player player, Team team, String str, String str2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, PlayerInjuryUpdatePayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.team = team;
        this.status = str;
        this.reason = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ PlayerInjuryUpdatePayload copy$default(PlayerInjuryUpdatePayload playerInjuryUpdatePayload, Player player, Team team, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerInjuryUpdatePayload.player;
        }
        if ((i & 2) != 0) {
            team = playerInjuryUpdatePayload.team;
        }
        if ((i & 4) != 0) {
            str = playerInjuryUpdatePayload.status;
        }
        if ((i & 8) != 0) {
            str2 = playerInjuryUpdatePayload.reason;
        }
        return playerInjuryUpdatePayload.copy(player, team, str, str2);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerInjuryUpdatePayload self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.y(serialDesc, 2, self.status);
        output.y(serialDesc, 3, self.reason);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final PlayerInjuryUpdatePayload copy(@Nullable Player player, @Nullable Team team, @NotNull String status, @NotNull String reason) {
        status.getClass();
        reason.getClass();
        return new PlayerInjuryUpdatePayload(player, team, status, reason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerInjuryUpdatePayload)) {
            return false;
        }
        PlayerInjuryUpdatePayload playerInjuryUpdatePayload = (PlayerInjuryUpdatePayload) other;
        return Intrinsics.c(this.player, playerInjuryUpdatePayload.player) && Intrinsics.c(this.team, playerInjuryUpdatePayload.team) && Intrinsics.c(this.status, playerInjuryUpdatePayload.status) && Intrinsics.c(this.reason, playerInjuryUpdatePayload.reason);
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    public int hashCode() {
        Player player = this.player;
        int hashCode = (player == null ? 0 : player.hashCode()) * 31;
        Team team = this.team;
        return this.reason.hashCode() + dmi.c((hashCode + (team != null ? team.hashCode() : 0)) * 31, 31, this.status);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        Team team = this.team;
        String str = this.status;
        String str2 = this.reason;
        StringBuilder sb = new StringBuilder("PlayerInjuryUpdatePayload(player=");
        sb.append(player);
        sb.append(", team=");
        sb.append(team);
        sb.append(", status=");
        return fc6.o(sb, str, ", reason=", str2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerInjuryUpdatePayload;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerInjuryUpdatePayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerInjuryUpdatePayload(@Nullable Player player, @Nullable Team team, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.player = player;
        this.team = team;
        this.status = str;
        this.reason = str2;
    }
}
