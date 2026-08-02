package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.bxe;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JJ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "transferTo", "transferFrom", "", "fromTeamName", "", "type", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/Integer;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Lcom/sofascore/model/mvvm/model/Team;", "component3", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Integer;", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTransferTo", "getTransferFrom", "Ljava/lang/String;", "getFromTeamName", "Ljava/lang/Integer;", "getType", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerTransferUpdatePayload {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String fromTeamName;

    @NotNull
    private final Player player;

    @Nullable
    private final Team transferFrom;

    @Nullable
    private final Team transferTo;

    @Nullable
    private final Integer type;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new bxe(4)), ypa.a(ysaVar, new bxe(5)), null, null};
    }

    public /* synthetic */ PlayerTransferUpdatePayload(int i, Player player, Team team, Team team2, String str, Integer num, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, PlayerTransferUpdatePayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.transferTo = team;
        this.transferFrom = team2;
        this.fromTeamName = str;
        this.type = num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ PlayerTransferUpdatePayload copy$default(PlayerTransferUpdatePayload playerTransferUpdatePayload, Player player, Team team, Team team2, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            player = playerTransferUpdatePayload.player;
        }
        if ((i & 2) != 0) {
            team = playerTransferUpdatePayload.transferTo;
        }
        if ((i & 4) != 0) {
            team2 = playerTransferUpdatePayload.transferFrom;
        }
        if ((i & 8) != 0) {
            str = playerTransferUpdatePayload.fromTeamName;
        }
        if ((i & 16) != 0) {
            num = playerTransferUpdatePayload.type;
        }
        Integer num2 = num;
        Team team3 = team2;
        return playerTransferUpdatePayload.copy(player, team, team3, str, num2);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerTransferUpdatePayload self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.transferTo);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.transferFrom);
        output.h(serialDesc, 3, uhi.a, self.fromTeamName);
        output.h(serialDesc, 4, a7a.a, self.type);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Team getTransferTo() {
        return this.transferTo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Team getTransferFrom() {
        return this.transferFrom;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFromTeamName() {
        return this.fromTeamName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final PlayerTransferUpdatePayload copy(@NotNull Player player, @Nullable Team transferTo, @Nullable Team transferFrom, @Nullable String fromTeamName, @Nullable Integer type) {
        player.getClass();
        return new PlayerTransferUpdatePayload(player, transferTo, transferFrom, fromTeamName, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerTransferUpdatePayload)) {
            return false;
        }
        PlayerTransferUpdatePayload playerTransferUpdatePayload = (PlayerTransferUpdatePayload) other;
        return Intrinsics.c(this.player, playerTransferUpdatePayload.player) && Intrinsics.c(this.transferTo, playerTransferUpdatePayload.transferTo) && Intrinsics.c(this.transferFrom, playerTransferUpdatePayload.transferFrom) && Intrinsics.c(this.fromTeamName, playerTransferUpdatePayload.fromTeamName) && Intrinsics.c(this.type, playerTransferUpdatePayload.type);
    }

    @Nullable
    public final String getFromTeamName() {
        return this.fromTeamName;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Team getTransferFrom() {
        return this.transferFrom;
    }

    @Nullable
    public final Team getTransferTo() {
        return this.transferTo;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        Team team = this.transferTo;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        Team team2 = this.transferFrom;
        int hashCode3 = (hashCode2 + (team2 == null ? 0 : team2.hashCode())) * 31;
        String str = this.fromTeamName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.type;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        Team team = this.transferTo;
        Team team2 = this.transferFrom;
        String str = this.fromTeamName;
        Integer num = this.type;
        StringBuilder sb = new StringBuilder("PlayerTransferUpdatePayload(player=");
        sb.append(player);
        sb.append(", transferTo=");
        sb.append(team);
        sb.append(", transferFrom=");
        sb.append(team2);
        sb.append(", fromTeamName=");
        sb.append(str);
        sb.append(", type=");
        return vxd.n(sb, num, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerTransferUpdatePayload;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerTransferUpdatePayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerTransferUpdatePayload(@NotNull Player player, @Nullable Team team, @Nullable Team team2, @Nullable String str, @Nullable Integer num) {
        player.getClass();
        this.player = player;
        this.transferTo = team;
        this.transferFrom = team2;
        this.fromTeamName = str;
        this.type = num;
    }
}
