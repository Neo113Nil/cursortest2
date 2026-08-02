package com.sofascore.model.fantasy;

import defpackage.dmi;
import defpackage.jf7;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001e¨\u00063"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTeamOfTheRoundResponse;", "", "", "score", "", "Lcom/sofascore/model/fantasy/FantasyRoundPlayer;", "players", "Lcom/sofascore/model/fantasy/FantasyRoundTeam;", "maxScoreTeam", "minScoreTeam", "<init>", "(ILjava/util/List;Lcom/sofascore/model/fantasy/FantasyRoundTeam;Lcom/sofascore/model/fantasy/FantasyRoundTeam;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/util/List;Lcom/sofascore/model/fantasy/FantasyRoundTeam;Lcom/sofascore/model/fantasy/FantasyRoundTeam;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/fantasy/FantasyTeamOfTheRoundResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Lcom/sofascore/model/fantasy/FantasyRoundTeam;", "component4", "copy", "(ILjava/util/List;Lcom/sofascore/model/fantasy/FantasyRoundTeam;Lcom/sofascore/model/fantasy/FantasyRoundTeam;)Lcom/sofascore/model/fantasy/FantasyTeamOfTheRoundResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getScore", "Ljava/util/List;", "getPlayers", "Lcom/sofascore/model/fantasy/FantasyRoundTeam;", "getMaxScoreTeam", "getMinScoreTeam", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FantasyTeamOfTheRoundResponse {

    @NotNull
    private final FantasyRoundTeam maxScoreTeam;

    @NotNull
    private final FantasyRoundTeam minScoreTeam;

    @NotNull
    private final List<FantasyRoundPlayer> players;
    private final int score;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, ypa.a(ysa.b, new jf7(19)), null, null};

    public /* synthetic */ FantasyTeamOfTheRoundResponse(int i, int i2, List list, FantasyRoundTeam fantasyRoundTeam, FantasyRoundTeam fantasyRoundTeam2, t5h t5hVar) {
        if (15 != (i & 15)) {
            oea.z(i, 15, FantasyTeamOfTheRoundResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.score = i2;
        this.players = list;
        this.maxScoreTeam = fantasyRoundTeam;
        this.minScoreTeam = fantasyRoundTeam2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(FantasyRoundPlayer$$serializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FantasyTeamOfTheRoundResponse copy$default(FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse, int i, List list, FantasyRoundTeam fantasyRoundTeam, FantasyRoundTeam fantasyRoundTeam2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyTeamOfTheRoundResponse.score;
        }
        if ((i2 & 2) != 0) {
            list = fantasyTeamOfTheRoundResponse.players;
        }
        if ((i2 & 4) != 0) {
            fantasyRoundTeam = fantasyTeamOfTheRoundResponse.maxScoreTeam;
        }
        if ((i2 & 8) != 0) {
            fantasyRoundTeam2 = fantasyTeamOfTheRoundResponse.minScoreTeam;
        }
        return fantasyTeamOfTheRoundResponse.copy(i, list, fantasyRoundTeam, fantasyRoundTeam2);
    }

    public static final /* synthetic */ void write$Self$model_release(FantasyTeamOfTheRoundResponse self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.score, serialDesc);
        output.f(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.players);
        FantasyRoundTeam$$serializer fantasyRoundTeam$$serializer = FantasyRoundTeam$$serializer.INSTANCE;
        output.f(serialDesc, 2, fantasyRoundTeam$$serializer, self.maxScoreTeam);
        output.f(serialDesc, 3, fantasyRoundTeam$$serializer, self.minScoreTeam);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final List<FantasyRoundPlayer> component2() {
        return this.players;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FantasyRoundTeam getMaxScoreTeam() {
        return this.maxScoreTeam;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FantasyRoundTeam getMinScoreTeam() {
        return this.minScoreTeam;
    }

    @NotNull
    public final FantasyTeamOfTheRoundResponse copy(int score, @NotNull List<FantasyRoundPlayer> players, @NotNull FantasyRoundTeam maxScoreTeam, @NotNull FantasyRoundTeam minScoreTeam) {
        players.getClass();
        maxScoreTeam.getClass();
        minScoreTeam.getClass();
        return new FantasyTeamOfTheRoundResponse(score, players, maxScoreTeam, minScoreTeam);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FantasyTeamOfTheRoundResponse)) {
            return false;
        }
        FantasyTeamOfTheRoundResponse fantasyTeamOfTheRoundResponse = (FantasyTeamOfTheRoundResponse) other;
        return this.score == fantasyTeamOfTheRoundResponse.score && Intrinsics.c(this.players, fantasyTeamOfTheRoundResponse.players) && Intrinsics.c(this.maxScoreTeam, fantasyTeamOfTheRoundResponse.maxScoreTeam) && Intrinsics.c(this.minScoreTeam, fantasyTeamOfTheRoundResponse.minScoreTeam);
    }

    @NotNull
    public final FantasyRoundTeam getMaxScoreTeam() {
        return this.maxScoreTeam;
    }

    @NotNull
    public final FantasyRoundTeam getMinScoreTeam() {
        return this.minScoreTeam;
    }

    @NotNull
    public final List<FantasyRoundPlayer> getPlayers() {
        return this.players;
    }

    public final int getScore() {
        return this.score;
    }

    public int hashCode() {
        return this.minScoreTeam.hashCode() + ((this.maxScoreTeam.hashCode() + dmi.d(Integer.hashCode(this.score) * 31, 31, this.players)) * 31);
    }

    @NotNull
    public String toString() {
        return "FantasyTeamOfTheRoundResponse(score=" + this.score + ", players=" + this.players + ", maxScoreTeam=" + this.maxScoreTeam + ", minScoreTeam=" + this.minScoreTeam + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/fantasy/FantasyTeamOfTheRoundResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/fantasy/FantasyTeamOfTheRoundResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FantasyTeamOfTheRoundResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public FantasyTeamOfTheRoundResponse(int i, @NotNull List<FantasyRoundPlayer> list, @NotNull FantasyRoundTeam fantasyRoundTeam, @NotNull FantasyRoundTeam fantasyRoundTeam2) {
        list.getClass();
        fantasyRoundTeam.getClass();
        fantasyRoundTeam2.getClass();
        this.score = i;
        this.players = list;
        this.maxScoreTeam = fantasyRoundTeam;
        this.minScoreTeam = fantasyRoundTeam2;
    }
}
