package com.sofascore.model.newNetwork;

import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.ag5;
import defpackage.dmi;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, d2 = {"Lcom/sofascore/model/newNetwork/EventBestPlayer;", "Ljava/io/Serializable;", "", U3.i.X, "label", "Lcom/sofascore/model/newNetwork/AdditionalStatistics;", "additionalStatistics", "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/AdditionalStatistics;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/AdditionalStatistics;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/EventBestPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/sofascore/model/newNetwork/AdditionalStatistics;", "component4", "()Lcom/sofascore/model/mvvm/model/Player;", "component5", "()Lcom/sofascore/model/mvvm/model/Team;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sofascore/model/newNetwork/AdditionalStatistics;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;)Lcom/sofascore/model/newNetwork/EventBestPlayer;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "getLabel", "Lcom/sofascore/model/newNetwork/AdditionalStatistics;", "getAdditionalStatistics", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EventBestPlayer implements Serializable {

    @Nullable
    private final AdditionalStatistics additionalStatistics;

    @NotNull
    private final String label;

    @NotNull
    private final Player player;

    @Nullable
    private final Team team;

    @NotNull
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, ypa.a(ysa.b, new ag5(27))};

    public /* synthetic */ EventBestPlayer(int i, String str, String str2, AdditionalStatistics additionalStatistics, Player player, Team team, t5h t5hVar) {
        if (31 != (i & 31)) {
            oea.z(i, 31, EventBestPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.value = str;
        this.label = str2;
        this.additionalStatistics = additionalStatistics;
        this.player = player;
        this.team = team;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ EventBestPlayer copy$default(EventBestPlayer eventBestPlayer, String str, String str2, AdditionalStatistics additionalStatistics, Player player, Team team, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventBestPlayer.value;
        }
        if ((i & 2) != 0) {
            str2 = eventBestPlayer.label;
        }
        if ((i & 4) != 0) {
            additionalStatistics = eventBestPlayer.additionalStatistics;
        }
        if ((i & 8) != 0) {
            player = eventBestPlayer.player;
        }
        if ((i & 16) != 0) {
            team = eventBestPlayer.team;
        }
        Team team2 = team;
        AdditionalStatistics additionalStatistics2 = additionalStatistics;
        return eventBestPlayer.copy(str, str2, additionalStatistics2, player, team2);
    }

    public static final /* synthetic */ void write$Self$model_release(EventBestPlayer self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.y(serialDesc, 0, self.value);
        output.y(serialDesc, 1, self.label);
        output.h(serialDesc, 2, AdditionalStatistics$$serializer.INSTANCE, self.additionalStatistics);
        output.f(serialDesc, 3, Player$$serializer.INSTANCE, self.player);
        output.h(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.team);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final AdditionalStatistics getAdditionalStatistics() {
        return this.additionalStatistics;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final EventBestPlayer copy(@NotNull String value, @NotNull String label, @Nullable AdditionalStatistics additionalStatistics, @NotNull Player player, @Nullable Team team) {
        value.getClass();
        label.getClass();
        player.getClass();
        return new EventBestPlayer(value, label, additionalStatistics, player, team);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventBestPlayer)) {
            return false;
        }
        EventBestPlayer eventBestPlayer = (EventBestPlayer) other;
        return Intrinsics.c(this.value, eventBestPlayer.value) && Intrinsics.c(this.label, eventBestPlayer.label) && Intrinsics.c(this.additionalStatistics, eventBestPlayer.additionalStatistics) && Intrinsics.c(this.player, eventBestPlayer.player) && Intrinsics.c(this.team, eventBestPlayer.team);
    }

    @Nullable
    public final AdditionalStatistics getAdditionalStatistics() {
        return this.additionalStatistics;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int c = dmi.c(this.value.hashCode() * 31, 31, this.label);
        AdditionalStatistics additionalStatistics = this.additionalStatistics;
        int hashCode = (this.player.hashCode() + ((c + (additionalStatistics == null ? 0 : additionalStatistics.hashCode())) * 31)) * 31;
        Team team = this.team;
        return hashCode + (team != null ? team.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.label;
        AdditionalStatistics additionalStatistics = this.additionalStatistics;
        Player player = this.player;
        Team team = this.team;
        StringBuilder s = mz1.s("EventBestPlayer(value=", str, ", label=", str2, ", additionalStatistics=");
        s.append(additionalStatistics);
        s.append(", player=");
        s.append(player);
        s.append(", team=");
        s.append(team);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/EventBestPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/EventBestPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return EventBestPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EventBestPlayer(@NotNull String str, @NotNull String str2, @Nullable AdditionalStatistics additionalStatistics, @NotNull Player player, @Nullable Team team) {
        str.getClass();
        str2.getClass();
        player.getClass();
        this.value = str;
        this.label = str2;
        this.additionalStatistics = additionalStatistics;
        this.player = player;
        this.team = team;
    }
}
