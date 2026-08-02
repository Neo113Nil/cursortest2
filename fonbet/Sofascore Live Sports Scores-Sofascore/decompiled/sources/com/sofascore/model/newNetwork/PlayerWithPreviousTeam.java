package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.bxe;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerWithPreviousTeam;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "previousTeam", "", "transferDate", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerWithPreviousTeam;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/PlayerWithPreviousTeam;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getPreviousTeam", "Ljava/lang/String;", "getTransferDate", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerWithPreviousTeam {

    @NotNull
    private final Player player;

    @Nullable
    private final Team previousTeam;

    @Nullable
    private final String transferDate;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new bxe(9)), null};

    public /* synthetic */ PlayerWithPreviousTeam(int i, Player player, Team team, String str, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, PlayerWithPreviousTeam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.previousTeam = team;
        this.transferDate = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ PlayerWithPreviousTeam copy$default(PlayerWithPreviousTeam playerWithPreviousTeam, Player player, Team team, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerWithPreviousTeam.player;
        }
        if ((i & 2) != 0) {
            team = playerWithPreviousTeam.previousTeam;
        }
        if ((i & 4) != 0) {
            str = playerWithPreviousTeam.transferDate;
        }
        return playerWithPreviousTeam.copy(player, team, str);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerWithPreviousTeam self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.previousTeam);
        output.h(serialDesc, 2, uhi.a, self.transferDate);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getPreviousTeam() {
        return this.previousTeam;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTransferDate() {
        return this.transferDate;
    }

    @NotNull
    public final PlayerWithPreviousTeam copy(@NotNull Player player, @Nullable Team previousTeam, @Nullable String transferDate) {
        player.getClass();
        return new PlayerWithPreviousTeam(player, previousTeam, transferDate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerWithPreviousTeam)) {
            return false;
        }
        PlayerWithPreviousTeam playerWithPreviousTeam = (PlayerWithPreviousTeam) other;
        return Intrinsics.c(this.player, playerWithPreviousTeam.player) && Intrinsics.c(this.previousTeam, playerWithPreviousTeam.previousTeam) && Intrinsics.c(this.transferDate, playerWithPreviousTeam.transferDate);
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Team getPreviousTeam() {
        return this.previousTeam;
    }

    @Nullable
    public final String getTransferDate() {
        return this.transferDate;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        Team team = this.previousTeam;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        String str = this.transferDate;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        Team team = this.previousTeam;
        String str = this.transferDate;
        StringBuilder sb = new StringBuilder("PlayerWithPreviousTeam(player=");
        sb.append(player);
        sb.append(", previousTeam=");
        sb.append(team);
        sb.append(", transferDate=");
        return mz1.o(sb, str, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerWithPreviousTeam$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerWithPreviousTeam;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerWithPreviousTeam$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerWithPreviousTeam(@NotNull Player player, @Nullable Team team, @Nullable String str) {
        player.getClass();
        this.player = player;
        this.previousTeam = team;
        this.transferDate = str;
    }
}
