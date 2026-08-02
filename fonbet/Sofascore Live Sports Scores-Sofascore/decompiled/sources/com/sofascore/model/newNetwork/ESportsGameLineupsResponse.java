package com.sofascore.model.newNetwork;

import com.sofascore.model.mvvm.model.TeamSides;
import defpackage.ag5;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010\"J0\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGameLineupsResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/ESportsGamePlayerStatistics;", "homeTeamPlayers", "awayTeamPlayers", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "", "shouldReverseTeams", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/List;ZLt5h;)V", "component1", "()Ljava/util/List;", "component2", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/ESportsGameLineupsResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/sofascore/model/mvvm/model/TeamSides;", "side", "getHomePlayers", "(Lcom/sofascore/model/mvvm/model/TeamSides;)Ljava/util/List;", "getAwayPlayers", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/ESportsGameLineupsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "Z", "getShouldReverseTeams", "()Z", "setShouldReverseTeams", "(Z)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ESportsGameLineupsResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<ESportsGamePlayerStatistics> awayTeamPlayers;

    @NotNull
    private final List<ESportsGamePlayerStatistics> homeTeamPlayers;
    private boolean shouldReverseTeams;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new ag5(7)), ypa.a(ysaVar, new ag5(8)), null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ESportsGameLineupsResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, List list2, boolean z, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (12 != (i & 12)) {
            oea.z(i, 12, ESportsGameLineupsResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.homeTeamPlayers = list;
        this.awayTeamPlayers = list2;
        if ((i & 16) == 0) {
            this.shouldReverseTeams = false;
        } else {
            this.shouldReverseTeams = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(ESportsGamePlayerStatistics$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(ESportsGamePlayerStatistics$$serializer.INSTANCE, 0);
    }

    private final List<ESportsGamePlayerStatistics> component1() {
        return this.homeTeamPlayers;
    }

    private final List<ESportsGamePlayerStatistics> component2() {
        return this.awayTeamPlayers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ESportsGameLineupsResponse copy$default(ESportsGameLineupsResponse eSportsGameLineupsResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eSportsGameLineupsResponse.homeTeamPlayers;
        }
        if ((i & 2) != 0) {
            list2 = eSportsGameLineupsResponse.awayTeamPlayers;
        }
        return eSportsGameLineupsResponse.copy(list, list2);
    }

    public static /* synthetic */ List getAwayPlayers$default(ESportsGameLineupsResponse eSportsGameLineupsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eSportsGameLineupsResponse.getAwayPlayers(teamSides);
    }

    public static /* synthetic */ List getHomePlayers$default(ESportsGameLineupsResponse eSportsGameLineupsResponse, TeamSides teamSides, int i, Object obj) {
        if ((i & 1) != 0) {
            teamSides = TeamSides.REVERSIBLE;
        }
        return eSportsGameLineupsResponse.getHomePlayers(teamSides);
    }

    public static final /* synthetic */ void write$Self$model_release(ESportsGameLineupsResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.homeTeamPlayers);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.awayTeamPlayers);
        if (output.o(serialDesc) || self.shouldReverseTeams) {
            output.x(serialDesc, 4, self.shouldReverseTeams);
        }
    }

    @NotNull
    public final ESportsGameLineupsResponse copy(@NotNull List<ESportsGamePlayerStatistics> homeTeamPlayers, @NotNull List<ESportsGamePlayerStatistics> awayTeamPlayers) {
        homeTeamPlayers.getClass();
        awayTeamPlayers.getClass();
        return new ESportsGameLineupsResponse(homeTeamPlayers, awayTeamPlayers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESportsGameLineupsResponse)) {
            return false;
        }
        ESportsGameLineupsResponse eSportsGameLineupsResponse = (ESportsGameLineupsResponse) other;
        return Intrinsics.c(this.homeTeamPlayers, eSportsGameLineupsResponse.homeTeamPlayers) && Intrinsics.c(this.awayTeamPlayers, eSportsGameLineupsResponse.awayTeamPlayers);
    }

    @NotNull
    public final List<ESportsGamePlayerStatistics> getAwayPlayers(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.homeTeamPlayers : this.awayTeamPlayers;
    }

    @NotNull
    public final List<ESportsGamePlayerStatistics> getHomePlayers(@NotNull TeamSides side) {
        side.getClass();
        return (side == TeamSides.REVERSIBLE && this.shouldReverseTeams) ? this.awayTeamPlayers : this.homeTeamPlayers;
    }

    public final boolean getShouldReverseTeams() {
        return this.shouldReverseTeams;
    }

    public int hashCode() {
        return this.awayTeamPlayers.hashCode() + (this.homeTeamPlayers.hashCode() * 31);
    }

    public final void setShouldReverseTeams(boolean z) {
        this.shouldReverseTeams = z;
    }

    @NotNull
    public String toString() {
        return "ESportsGameLineupsResponse(homeTeamPlayers=" + this.homeTeamPlayers + ", awayTeamPlayers=" + this.awayTeamPlayers + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/ESportsGameLineupsResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/ESportsGameLineupsResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ESportsGameLineupsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ESportsGameLineupsResponse(@NotNull List<ESportsGamePlayerStatistics> list, @NotNull List<ESportsGamePlayerStatistics> list2) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        list2.getClass();
        this.homeTeamPlayers = list;
        this.awayTeamPlayers = list2;
    }
}
