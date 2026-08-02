package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.Team;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J0\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006*"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentDraftPicksResponse;", "", "", "Lcom/sofascore/model/newNetwork/LeagueDraftPickItem;", "picks", "Lcom/sofascore/model/mvvm/model/Team;", "teamsWithoutRoundPick", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/UniqueTournamentDraftPicksResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/UniqueTournamentDraftPicksResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPicks", "getTeamsWithoutRoundPick", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UniqueTournamentDraftPicksResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<LeagueDraftPickItem> picks;

    @NotNull
    private final List<Team> teamsWithoutRoundPick;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new uzj(27)), ypa.a(ysaVar, new uzj(28))};
    }

    public /* synthetic */ UniqueTournamentDraftPicksResponse(int i, List list, List list2, t5h t5hVar) {
        if (3 != (i & 3)) {
            oea.z(i, 3, UniqueTournamentDraftPicksResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.picks = list;
        this.teamsWithoutRoundPick = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(LeagueDraftPickItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniqueTournamentDraftPicksResponse copy$default(UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = uniqueTournamentDraftPicksResponse.picks;
        }
        if ((i & 2) != 0) {
            list2 = uniqueTournamentDraftPicksResponse.teamsWithoutRoundPick;
        }
        return uniqueTournamentDraftPicksResponse.copy(list, list2);
    }

    public static final /* synthetic */ void write$Self$model_release(UniqueTournamentDraftPicksResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.picks);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.teamsWithoutRoundPick);
    }

    @NotNull
    public final List<LeagueDraftPickItem> component1() {
        return this.picks;
    }

    @NotNull
    public final List<Team> component2() {
        return this.teamsWithoutRoundPick;
    }

    @NotNull
    public final UniqueTournamentDraftPicksResponse copy(@NotNull List<LeagueDraftPickItem> picks, @NotNull List<Team> teamsWithoutRoundPick) {
        picks.getClass();
        teamsWithoutRoundPick.getClass();
        return new UniqueTournamentDraftPicksResponse(picks, teamsWithoutRoundPick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniqueTournamentDraftPicksResponse)) {
            return false;
        }
        UniqueTournamentDraftPicksResponse uniqueTournamentDraftPicksResponse = (UniqueTournamentDraftPicksResponse) other;
        return Intrinsics.c(this.picks, uniqueTournamentDraftPicksResponse.picks) && Intrinsics.c(this.teamsWithoutRoundPick, uniqueTournamentDraftPicksResponse.teamsWithoutRoundPick);
    }

    @NotNull
    public final List<LeagueDraftPickItem> getPicks() {
        return this.picks;
    }

    @NotNull
    public final List<Team> getTeamsWithoutRoundPick() {
        return this.teamsWithoutRoundPick;
    }

    public int hashCode() {
        return this.teamsWithoutRoundPick.hashCode() + (this.picks.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "UniqueTournamentDraftPicksResponse(picks=" + this.picks + ", teamsWithoutRoundPick=" + this.teamsWithoutRoundPick + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/UniqueTournamentDraftPicksResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/UniqueTournamentDraftPicksResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UniqueTournamentDraftPicksResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UniqueTournamentDraftPicksResponse(@NotNull List<LeagueDraftPickItem> list, @NotNull List<Team> list2) {
        list.getClass();
        list2.getClass();
        this.picks = list;
        this.teamsWithoutRoundPick = list2;
    }
}
