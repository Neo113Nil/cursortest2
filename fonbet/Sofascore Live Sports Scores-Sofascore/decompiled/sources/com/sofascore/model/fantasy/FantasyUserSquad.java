package com.sofascore.model.fantasy;

import defpackage.go7;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserSquad;", "", "", "Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "players", "", "remainingBudget", "<init>", "(Ljava/util/List;D)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;DLt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyUserSquad;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()D", "copy", "(Ljava/util/List;D)Lcom/sofascore/model/fantasy/FantasyUserSquad;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlayers", "D", "getRemainingBudget", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyUserSquad {

    @NotNull
    private final List<FantasyRoundPlayer> players;
    private final double remainingBudget;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {ypa.a(ysa.b, new go7(3)), null};

    public /* synthetic */ FantasyUserSquad(int i, List list, double d, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, FantasyUserSquad$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.players = list;
        this.remainingBudget = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyRoundPlayer$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyUserSquad copy$default(FantasyUserSquad fantasyUserSquad, List list, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fantasyUserSquad.players;
        }
        if ((i & 2) != 0) {
            d = fantasyUserSquad.remainingBudget;
        }
        return fantasyUserSquad.copy(list, d);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyUserSquad self, wf3 output, SerialDescriptor serialDesc) {
        output.f(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.players);
        output.D(serialDesc, 1, self.remainingBudget);
    }

    @NotNull
    public final List<FantasyRoundPlayer> component1() {
        return this.players;
    }

    /* renamed from: component2, reason: from getter */
    public final double getRemainingBudget() {
        return this.remainingBudget;
    }

    @NotNull
    public final FantasyUserSquad copy(@NotNull List<FantasyRoundPlayer> players, double remainingBudget) {
        players.getClass();
        return new FantasyUserSquad(players, remainingBudget);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyUserSquad)) {
            return false;
        }
        FantasyUserSquad fantasyUserSquad = (FantasyUserSquad) other;
        return Intrinsics.c(this.players, fantasyUserSquad.players) && Double.compare(this.remainingBudget, fantasyUserSquad.remainingBudget) == 0;
    }

    @NotNull
    public final List<FantasyRoundPlayer> getPlayers() {
        return this.players;
    }

    public final double getRemainingBudget() {
        return this.remainingBudget;
    }

    public int hashCode() {
        return Double.hashCode(this.remainingBudget) + (this.players.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "FantasyUserSquad(players=" + this.players + ", remainingBudget=" + this.remainingBudget + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyUserSquad$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyUserSquad;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyUserSquad$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyUserSquad(@NotNull List<FantasyRoundPlayer> list, double d) {
        list.getClass();
        this.players = list;
        this.remainingBudget = d;
    }
}
