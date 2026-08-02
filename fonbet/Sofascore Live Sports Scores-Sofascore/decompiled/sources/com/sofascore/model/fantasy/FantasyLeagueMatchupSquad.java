package com.sofascore.model.fantasy;

import defpackage.au6;
import defpackage.joa;
import defpackage.mz1;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB;\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u001a\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquad;", "", "", "tripleCaptain", "", "transferPenalty", "", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquadPlayer;", "players", "<init>", "(ZILjava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IZILjava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquad;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()I", "component3", "()Ljava/util/List;", "copy", "(ZILjava/util/List;)Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquad;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getTripleCaptain", "I", "getTransferPenalty", "Ljava/util/List;", "getPlayers", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyLeagueMatchupSquad {

    @NotNull
    private final List<FantasyLeagueMatchupSquadPlayer> players;
    private final int transferPenalty;
    private final boolean tripleCaptain;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, ypa.a(ysa.b, new au6(24))};

    public /* synthetic */ FantasyLeagueMatchupSquad(int i, boolean z, int i2, List list, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, FantasyLeagueMatchupSquad$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.tripleCaptain = z;
        this.transferPenalty = i2;
        this.players = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyLeagueMatchupSquadPlayer$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyLeagueMatchupSquad copy$default(FantasyLeagueMatchupSquad fantasyLeagueMatchupSquad, boolean z, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = fantasyLeagueMatchupSquad.tripleCaptain;
        }
        if ((i2 & 2) != 0) {
            i = fantasyLeagueMatchupSquad.transferPenalty;
        }
        if ((i2 & 4) != 0) {
            list = fantasyLeagueMatchupSquad.players;
        }
        return fantasyLeagueMatchupSquad.copy(z, i, list);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyLeagueMatchupSquad self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.x(serialDesc, 0, self.tripleCaptain);
        output.u(1, self.transferPenalty, serialDesc);
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.players);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getTripleCaptain() {
        return this.tripleCaptain;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTransferPenalty() {
        return this.transferPenalty;
    }

    @NotNull
    public final List<FantasyLeagueMatchupSquadPlayer> component3() {
        return this.players;
    }

    @NotNull
    public final FantasyLeagueMatchupSquad copy(boolean tripleCaptain, int transferPenalty, @NotNull List<FantasyLeagueMatchupSquadPlayer> players) {
        players.getClass();
        return new FantasyLeagueMatchupSquad(tripleCaptain, transferPenalty, players);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyLeagueMatchupSquad)) {
            return false;
        }
        FantasyLeagueMatchupSquad fantasyLeagueMatchupSquad = (FantasyLeagueMatchupSquad) other;
        return this.tripleCaptain == fantasyLeagueMatchupSquad.tripleCaptain && this.transferPenalty == fantasyLeagueMatchupSquad.transferPenalty && Intrinsics.c(this.players, fantasyLeagueMatchupSquad.players);
    }

    @NotNull
    public final List<FantasyLeagueMatchupSquadPlayer> getPlayers() {
        return this.players;
    }

    public final int getTransferPenalty() {
        return this.transferPenalty;
    }

    public final boolean getTripleCaptain() {
        return this.tripleCaptain;
    }

    public int hashCode() {
        return this.players.hashCode() + wv8.a(this.transferPenalty, Boolean.hashCode(this.tripleCaptain) * 31, 31);
    }

    @NotNull
    public String toString() {
        boolean z = this.tripleCaptain;
        int i = this.transferPenalty;
        List<FantasyLeagueMatchupSquadPlayer> list = this.players;
        StringBuilder sb = new StringBuilder("FantasyLeagueMatchupSquad(tripleCaptain=");
        sb.append(z);
        sb.append(", transferPenalty=");
        sb.append(i);
        sb.append(", players=");
        return mz1.p(sb, list, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquad$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyLeagueMatchupSquad;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyLeagueMatchupSquad$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyLeagueMatchupSquad(boolean z, int i, @NotNull List<FantasyLeagueMatchupSquadPlayer> list) {
        list.getClass();
        this.tripleCaptain = z;
        this.transferPenalty = i;
        this.players = list;
    }
}
