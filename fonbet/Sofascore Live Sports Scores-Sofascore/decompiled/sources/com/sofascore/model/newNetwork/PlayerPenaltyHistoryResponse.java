package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.boe;
import defpackage.dmi;
import defpackage.joa;
import defpackage.me4;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBY\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\n\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J@\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010\"J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010\"¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryData;", "penalties", "", Incident.PenaltyShotIncident.PENALTY_SHOT_SCORED, "attempts", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/util/List;II)V", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Lcom/sofascore/model/mvvm/model/Player;Ljava/util/List;IILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "copy", "(Lcom/sofascore/model/mvvm/model/Player;Ljava/util/List;II)Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Ljava/util/List;", "getPenalties", "I", "getScored", "getAttempts", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PlayerPenaltyHistoryResponse extends NetworkResponse {
    private final int attempts;

    @NotNull
    private final List<PlayerPenaltyHistoryData> penalties;

    @Nullable
    private final Player player;
    private final int scored;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new boe(20)), null, null};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayerPenaltyHistoryResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, Player player, List list, int i2, int i3, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (60 != (i & 60)) {
            oea.z(i, 60, PlayerPenaltyHistoryResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.penalties = list;
        this.scored = i2;
        this.attempts = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(PlayerPenaltyHistoryData$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayerPenaltyHistoryResponse copy$default(PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse, Player player, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            player = playerPenaltyHistoryResponse.player;
        }
        if ((i3 & 2) != 0) {
            list = playerPenaltyHistoryResponse.penalties;
        }
        if ((i3 & 4) != 0) {
            i = playerPenaltyHistoryResponse.scored;
        }
        if ((i3 & 8) != 0) {
            i2 = playerPenaltyHistoryResponse.attempts;
        }
        return playerPenaltyHistoryResponse.copy(player, list, i, i2);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerPenaltyHistoryResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.h(serialDesc, 2, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.penalties);
        output.u(4, self.scored, serialDesc);
        output.u(5, self.attempts, serialDesc);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    public final List<PlayerPenaltyHistoryData> component2() {
        return this.penalties;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScored() {
        return this.scored;
    }

    /* renamed from: component4, reason: from getter */
    public final int getAttempts() {
        return this.attempts;
    }

    @NotNull
    public final PlayerPenaltyHistoryResponse copy(@Nullable Player player, @NotNull List<PlayerPenaltyHistoryData> penalties, int scored, int attempts) {
        penalties.getClass();
        return new PlayerPenaltyHistoryResponse(player, penalties, scored, attempts);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerPenaltyHistoryResponse)) {
            return false;
        }
        PlayerPenaltyHistoryResponse playerPenaltyHistoryResponse = (PlayerPenaltyHistoryResponse) other;
        return Intrinsics.c(this.player, playerPenaltyHistoryResponse.player) && Intrinsics.c(this.penalties, playerPenaltyHistoryResponse.penalties) && this.scored == playerPenaltyHistoryResponse.scored && this.attempts == playerPenaltyHistoryResponse.attempts;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    @NotNull
    public final List<PlayerPenaltyHistoryData> getPenalties() {
        return this.penalties;
    }

    @Nullable
    public final Player getPlayer() {
        return this.player;
    }

    public final int getScored() {
        return this.scored;
    }

    public int hashCode() {
        Player player = this.player;
        return Integer.hashCode(this.attempts) + wv8.a(this.scored, dmi.d((player == null ? 0 : player.hashCode()) * 31, 31, this.penalties), 31);
    }

    @NotNull
    public String toString() {
        Player player = this.player;
        List<PlayerPenaltyHistoryData> list = this.penalties;
        int i = this.scored;
        int i2 = this.attempts;
        StringBuilder sb = new StringBuilder("PlayerPenaltyHistoryResponse(player=");
        sb.append(player);
        sb.append(", penalties=");
        sb.append(list);
        sb.append(", scored=");
        return me4.i(sb, i, ", attempts=", i2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/PlayerPenaltyHistoryResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerPenaltyHistoryResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PlayerPenaltyHistoryResponse(@Nullable Player player, @NotNull List<PlayerPenaltyHistoryData> list, int i, int i2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        this.player = player;
        this.penalties = list;
        this.scored = i;
        this.attempts = i2;
    }
}
