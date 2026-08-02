package com.sofascore.model.fantasy;

import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006+"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTopPlayerRoundWrapper;", "", "Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/fantasy/FantasyRound;", TeamOfTheWeekRoundsResponseKt.TOTW_ROUND, "<init>", "(Lcom/sofascore/model/fantasy/FantasyRoundPlayer;Lcom/sofascore/model/fantasy/FantasyRound;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/fantasy/FantasyRoundPlayer;Lcom/sofascore/model/fantasy/FantasyRound;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyTopPlayerRoundWrapper;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "component2", "()Lcom/sofascore/model/fantasy/FantasyRound;", "copy", "(Lcom/sofascore/model/fantasy/FantasyRoundPlayer;Lcom/sofascore/model/fantasy/FantasyRound;)Lcom/sofascore/model/fantasy/FantasyTopPlayerRoundWrapper;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "getPlayer", "Lcom/sofascore/model/fantasy/FantasyRound;", "getRound", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyTopPlayerRoundWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final FantasyRoundPlayer player;

    @NotNull
    private final FantasyRound round;

    public /* synthetic */ FantasyTopPlayerRoundWrapper(int i, FantasyRoundPlayer fantasyRoundPlayer, FantasyRound fantasyRound, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyTopPlayerRoundWrapper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.player = fantasyRoundPlayer;
        this.round = fantasyRound;
    }

    public static /* synthetic */ FantasyTopPlayerRoundWrapper copy$default(FantasyTopPlayerRoundWrapper fantasyTopPlayerRoundWrapper, FantasyRoundPlayer fantasyRoundPlayer, FantasyRound fantasyRound, int i, Object obj) {
        if ((i & 1) != 0) {
            fantasyRoundPlayer = fantasyTopPlayerRoundWrapper.player;
        }
        if ((i & 2) != 0) {
            fantasyRound = fantasyTopPlayerRoundWrapper.round;
        }
        return fantasyTopPlayerRoundWrapper.copy(fantasyRoundPlayer, fantasyRound);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyTopPlayerRoundWrapper self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, FantasyRoundPlayer$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 1, FantasyRound$$serializer.INSTANCE, self.round);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FantasyRoundPlayer getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FantasyRound getRound() {
        return this.round;
    }

    @NotNull
    public final FantasyTopPlayerRoundWrapper copy(@NotNull FantasyRoundPlayer player, @NotNull FantasyRound round) {
        player.getClass();
        round.getClass();
        return new FantasyTopPlayerRoundWrapper(player, round);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyTopPlayerRoundWrapper)) {
            return false;
        }
        FantasyTopPlayerRoundWrapper fantasyTopPlayerRoundWrapper = (FantasyTopPlayerRoundWrapper) other;
        return Intrinsics.c(this.player, fantasyTopPlayerRoundWrapper.player) && Intrinsics.c(this.round, fantasyTopPlayerRoundWrapper.round);
    }

    @NotNull
    public final FantasyRoundPlayer getPlayer() {
        return this.player;
    }

    @NotNull
    public final FantasyRound getRound() {
        return this.round;
    }

    public int hashCode() {
        return this.round.hashCode() + (this.player.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FantasyTopPlayerRoundWrapper(player=" + this.player + ", round=" + this.round + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTopPlayerRoundWrapper$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyTopPlayerRoundWrapper;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyTopPlayerRoundWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyTopPlayerRoundWrapper(@NotNull FantasyRoundPlayer fantasyRoundPlayer, @NotNull FantasyRound fantasyRound) {
        fantasyRoundPlayer.getClass();
        fantasyRound.getClass();
        this.player = fantasyRoundPlayer;
        this.round = fantasyRound;
    }
}
