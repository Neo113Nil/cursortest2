package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.fc6;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.wv8;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000fJ.\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u000fJ\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/sofascore/model/network/response/Duel;", "Ljava/io/Serializable;", "", "homeWins", "awayWins", "draws", "<init>", "(III)V", "seen0", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(IIIIZLt5h;)V", "component1", "()I", "component2", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/Duel;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomeWins", "(Lcom/sofascore/model/mvvm/model/TeamSides;)I", "getAwayWins", "component3", "copy", "(III)Lcom/sofascore/model/network/response/Duel;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getDraws", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Duel implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int awayWins;
    private final int draws;
    private final int homeWins;
    private boolean shouldReverseTeams;

    public /* synthetic */ Duel(int i, int i2, int i3, int i4, boolean z, t5h t5hVar) {
        if (7 != (i & 7)) {
            oea.z(i, 7, Duel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeWins = i2;
        this.awayWins = i3;
        this.draws = i4;
        if ((i & 8) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final int getHomeWins() {
        return this.homeWins;
    }

    /* renamed from: component2, reason: from getter */
    private final int getAwayWins() {
        return this.awayWins;
    }

    public static /* synthetic */ Duel copy$default(Duel duel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = duel.homeWins;
        }
        if ((i4 & 2) != 0) {
            i2 = duel.awayWins;
        }
        if ((i4 & 4) != 0) {
            i3 = duel.draws;
        }
        return duel.copy(i, i2, i3);
    }

    public static /* synthetic */ int getAwayWins$default(Duel duel, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return duel.getAwayWins(teamSides);
    }

    public static /* synthetic */ int getHomeWins$default(Duel duel, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return duel.getHomeWins(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(Duel self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.homeWins, serialDesc);
        output.u(1, self.awayWins, serialDesc);
        output.u(2, self.draws, serialDesc);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 3, self.shouldReverseTeams);
        }
    }

    /* renamed from: component3, reason: from getter */
    public final int getDraws() {
        return this.draws;
    }

    @NotNull
    public final Duel copy(int homeWins, int awayWins, int draws) {
        return new Duel(homeWins, awayWins, draws);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Duel)) {
            return false;
        }
        Duel duel = (Duel) other;
        return this.homeWins == duel.homeWins && this.awayWins == duel.awayWins && this.draws == duel.draws;
    }

    public final int getAwayWins(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeWins : this.awayWins;
    }

    public final int getDraws() {
        return this.draws;
    }

    public final int getHomeWins(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayWins : this.homeWins;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        return Integer.hashCode(this.draws) + wv8.a(this.awayWins, Integer.hashCode(this.homeWins) * 31, 31);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        return fc6.h(this.draws, ")", lnb.s(this.homeWins, this.awayWins, "Duel(homeWins=", ", awayWins=", ", draws="));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/Duel$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/Duel;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Duel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Duel(int i, int i2, int i3) {
        this.homeWins = i;
        this.awayWins = i2;
        this.draws = i3;
    }
}
