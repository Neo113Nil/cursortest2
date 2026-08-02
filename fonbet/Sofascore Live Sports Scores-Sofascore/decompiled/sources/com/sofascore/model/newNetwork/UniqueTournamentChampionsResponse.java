package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uzj;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J@\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010 ¨\u00065"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;", "", "Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;", "winner", "runnerUp", "Lcom/sofascore/model/mvvm/model/Player;", "mvp", "", "Lcom/sofascore/model/newNetwork/ConferenceChampion;", "conferenceChampions", "<init>", "(Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;Lcom/sofascore/model/mvvm/model/Player;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/ChampionsTeamStanding;Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;Lcom/sofascore/model/mvvm/model/Player;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;", "component2", "component3", "()Lcom/sofascore/model/mvvm/model/Player;", "component4", "()Ljava/util/List;", "copy", "(Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;Lcom/sofascore/model/mvvm/model/Player;Ljava/util/List;)Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sofascore/model/newNetwork/ChampionsTeamStanding;", "getWinner", "getRunnerUp", "Lcom/sofascore/model/mvvm/model/Player;", "getMvp", "Ljava/util/List;", "getConferenceChampions", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentChampionsResponse {

    @NotNull
    private final List<ConferenceChampion> conferenceChampions;

    @Nullable
    private final Player mvp;

    @NotNull
    private final ChampionsTeamStanding runnerUp;

    @NotNull
    private final ChampionsTeamStanding winner;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new uzj(19))};

    public /* synthetic */ UniqueTournamentChampionsResponse(int i, ChampionsTeamStanding championsTeamStanding, ChampionsTeamStanding championsTeamStanding2, Player player, List list, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, UniqueTournamentChampionsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.winner = championsTeamStanding;
        this.runnerUp = championsTeamStanding2;
        this.mvp = player;
        this.conferenceChampions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(ConferenceChampion$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniqueTournamentChampionsResponse copy$default(UniqueTournamentChampionsResponse uniqueTournamentChampionsResponse, ChampionsTeamStanding championsTeamStanding, ChampionsTeamStanding championsTeamStanding2, Player player, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            championsTeamStanding = uniqueTournamentChampionsResponse.winner;
        }
        if ((i & 2) != 0) {
            championsTeamStanding2 = uniqueTournamentChampionsResponse.runnerUp;
        }
        if ((i & 4) != 0) {
            player = uniqueTournamentChampionsResponse.mvp;
        }
        if ((i & 8) != 0) {
            list = uniqueTournamentChampionsResponse.conferenceChampions;
        }
        return uniqueTournamentChampionsResponse.copy(championsTeamStanding, championsTeamStanding2, player, list);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentChampionsResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        ChampionsTeamStanding$$serializer championsTeamStanding$$serializer = ChampionsTeamStanding$$serializer.INSTANCE;
        output.f(serialDesc, 0, championsTeamStanding$$serializer, self.winner);
        output.f(serialDesc, 1, championsTeamStanding$$serializer, self.runnerUp);
        output.h(serialDesc, 2, Player$$serializer.INSTANCE, self.mvp);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.conferenceChampions);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ChampionsTeamStanding getWinner() {
        return this.winner;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ChampionsTeamStanding getRunnerUp() {
        return this.runnerUp;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Player getMvp() {
        return this.mvp;
    }

    @NotNull
    public final List<ConferenceChampion> component4() {
        return this.conferenceChampions;
    }

    @NotNull
    public final UniqueTournamentChampionsResponse copy(@NotNull ChampionsTeamStanding winner, @NotNull ChampionsTeamStanding runnerUp, @Nullable Player mvp, @NotNull List<ConferenceChampion> conferenceChampions) {
        winner.getClass();
        runnerUp.getClass();
        conferenceChampions.getClass();
        return new UniqueTournamentChampionsResponse(winner, runnerUp, mvp, conferenceChampions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentChampionsResponse)) {
            return false;
        }
        UniqueTournamentChampionsResponse uniqueTournamentChampionsResponse = (UniqueTournamentChampionsResponse) other;
        return Intrinsics.c(this.winner, uniqueTournamentChampionsResponse.winner) && Intrinsics.c(this.runnerUp, uniqueTournamentChampionsResponse.runnerUp) && Intrinsics.c(this.mvp, uniqueTournamentChampionsResponse.mvp) && Intrinsics.c(this.conferenceChampions, uniqueTournamentChampionsResponse.conferenceChampions);
    }

    @NotNull
    public final List<ConferenceChampion> getConferenceChampions() {
        return this.conferenceChampions;
    }

    @Nullable
    public final Player getMvp() {
        return this.mvp;
    }

    @NotNull
    public final ChampionsTeamStanding getRunnerUp() {
        return this.runnerUp;
    }

    @NotNull
    public final ChampionsTeamStanding getWinner() {
        return this.winner;
    }

    public int hashCode() {
        int hashCode = (this.runnerUp.hashCode() + (this.winner.hashCode() * 31)) * 31;
        Player player = this.mvp;
        return this.conferenceChampions.hashCode() + ((hashCode + (player == null ? 0 : player.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "UniqueTournamentChampionsResponse(winner=" + this.winner + ", runnerUp=" + this.runnerUp + ", mvp=" + this.mvp + ", conferenceChampions=" + this.conferenceChampions + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentChampionsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentChampionsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentChampionsResponse(@NotNull ChampionsTeamStanding championsTeamStanding, @NotNull ChampionsTeamStanding championsTeamStanding2, @Nullable Player player, @NotNull List<ConferenceChampion> list) {
        championsTeamStanding.getClass();
        championsTeamStanding2.getClass();
        list.getClass();
        this.winner = championsTeamStanding;
        this.runnerUp = championsTeamStanding2;
        this.mvp = player;
        this.conferenceChampions = list;
    }
}
