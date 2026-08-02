package com.sofascore.model.network.response.playerOfTheSeason;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0018¨\u0006)"}, d2 = {"Lcom/sofascore/model/network/response/playerOfTheSeason/POTSMostAwardsNetworkPlayer;", "", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "", "totalAwards", "<init>", "(Lcom/sofascore/model/mvvm/model/Player;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/mvvm/model/Player;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/playerOfTheSeason/POTSMostAwardsNetworkPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/mvvm/model/Player;", "component2", "()I", "copy", "(Lcom/sofascore/model/mvvm/model/Player;I)Lcom/sofascore/model/network/response/playerOfTheSeason/POTSMostAwardsNetworkPlayer;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "I", "getTotalAwards", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class POTSMostAwardsNetworkPlayer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Player player;
    private final int totalAwards;

    public /* synthetic */ POTSMostAwardsNetworkPlayer(int i, Player player, int i2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, POTSMostAwardsNetworkPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = player;
        this.totalAwards = i2;
    }

    public static /* synthetic */ POTSMostAwardsNetworkPlayer copy$default(POTSMostAwardsNetworkPlayer pOTSMostAwardsNetworkPlayer, Player player, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            player = pOTSMostAwardsNetworkPlayer.player;
        }
        if ((i2 & 2) != 0) {
            i = pOTSMostAwardsNetworkPlayer.totalAwards;
        }
        return pOTSMostAwardsNetworkPlayer.copy(player, i);
    }

    public static final /* synthetic */ void write$Self$model_release(POTSMostAwardsNetworkPlayer self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, Player$$serializer.INSTANCE, self.player);
        output.u(1, self.totalAwards, serialDesc);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalAwards() {
        return this.totalAwards;
    }

    @NotNull
    public final POTSMostAwardsNetworkPlayer copy(@NotNull Player player, int totalAwards) {
        player.getClass();
        return new POTSMostAwardsNetworkPlayer(player, totalAwards);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof POTSMostAwardsNetworkPlayer)) {
            return false;
        }
        POTSMostAwardsNetworkPlayer pOTSMostAwardsNetworkPlayer = (POTSMostAwardsNetworkPlayer) other;
        return Intrinsics.c(this.player, pOTSMostAwardsNetworkPlayer.player) && this.totalAwards == pOTSMostAwardsNetworkPlayer.totalAwards;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public final int getTotalAwards() {
        return this.totalAwards;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalAwards) + (this.player.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "POTSMostAwardsNetworkPlayer(player=" + this.player + ", totalAwards=" + this.totalAwards + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/playerOfTheSeason/POTSMostAwardsNetworkPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSMostAwardsNetworkPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return POTSMostAwardsNetworkPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public POTSMostAwardsNetworkPlayer(@NotNull Player player, int i) {
        player.getClass();
        this.player = player;
        this.totalAwards = i;
    }
}
