package com.sofascore.model.newNetwork;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.sofascore.model.mvvm.model.CricketSupportStaff;
import com.sofascore.model.mvvm.model.CricketSupportStaff$$serializer;
import defpackage.bxi;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.joa;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.vxd;
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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bo\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u000f\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0086\u0001\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b:\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b;\u0010\u001bR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b<\u0010\u001bR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b=\u0010\u001bR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\b>\u0010\u001b¨\u0006A"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamPlayersResponse;", "Lcom/sofascore/model/newNetwork/NetworkResponse;", "", "Lcom/sofascore/model/newNetwork/PlayerItem;", "players", "foreignPlayers", "nationalPlayers", "Lcom/sofascore/model/mvvm/model/CricketSupportStaff;", "supportStaff", "Lcom/sofascore/model/newNetwork/PlayerWithPreviousTeam;", "playerPreviousTeam", "Lcom/sofascore/model/newNetwork/PlayerWithNationalTeam;", "nationalTeamPlayerStatistics", "Lcom/sofascore/model/newNetwork/PlayerWithDepthAssignment;", "teamDepthAssignments", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lcom/sofascore/model/newNetwork/HeadResponse;", "head", "Lcom/sofascore/model/newNetwork/ErrorResponse;", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/HeadResponse;Lcom/sofascore/model/newNetwork/ErrorResponse;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt5h;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sofascore/model/newNetwork/TeamPlayersResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/TeamPlayersResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/List;", "getPlayers", "getForeignPlayers", "getNationalPlayers", "getSupportStaff", "getPlayerPreviousTeam", "getNationalTeamPlayerStatistics", "getTeamDepthAssignments", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TeamPlayersResponse extends NetworkResponse {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<PlayerItem> foreignPlayers;

    @NotNull
    private final List<PlayerItem> nationalPlayers;

    @Nullable
    private final List<PlayerWithNationalTeam> nationalTeamPlayerStatistics;

    @Nullable
    private final List<PlayerWithPreviousTeam> playerPreviousTeam;

    @NotNull
    private final List<PlayerItem> players;

    @NotNull
    private final List<CricketSupportStaff> supportStaff;

    @Nullable
    private final List<PlayerWithDepthAssignment> teamDepthAssignments;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, null, ypa.a(ysaVar, new bxi(10)), ypa.a(ysaVar, new bxi(11)), ypa.a(ysaVar, new bxi(12)), ypa.a(ysaVar, new bxi(13)), ypa.a(ysaVar, new bxi(14)), ypa.a(ysaVar, new bxi(15)), ypa.a(ysaVar, new bxi(16))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeamPlayersResponse(int i, HeadResponse headResponse, ErrorResponse errorResponse, List list, List list2, List list3, List list4, List list5, List list6, List list7, t5h t5hVar) {
        super(i, headResponse, errorResponse, t5hVar);
        if (508 != (i & IronSourceError.ERROR_CODE_INIT_FAILED)) {
            oea.z(i, IronSourceError.ERROR_CODE_INIT_FAILED, TeamPlayersResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.players = list;
        this.foreignPlayers = list2;
        this.nationalPlayers = list3;
        this.supportStaff = list4;
        this.playerPreviousTeam = list5;
        this.nationalTeamPlayerStatistics = list6;
        this.teamDepthAssignments = list7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(PlayerItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(PlayerItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new xg0(PlayerItem$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$2() {
        return new xg0(CricketSupportStaff$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$3() {
        return new xg0(PlayerWithPreviousTeam$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$4() {
        return new xg0(PlayerWithNationalTeam$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$5() {
        return new xg0(PlayerWithDepthAssignment$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ TeamPlayersResponse copy$default(TeamPlayersResponse teamPlayersResponse, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
        if ((i & 1) != 0) {
            list = teamPlayersResponse.players;
        }
        if ((i & 2) != 0) {
            list2 = teamPlayersResponse.foreignPlayers;
        }
        if ((i & 4) != 0) {
            list3 = teamPlayersResponse.nationalPlayers;
        }
        if ((i & 8) != 0) {
            list4 = teamPlayersResponse.supportStaff;
        }
        if ((i & 16) != 0) {
            list5 = teamPlayersResponse.playerPreviousTeam;
        }
        if ((i & 32) != 0) {
            list6 = teamPlayersResponse.nationalTeamPlayerStatistics;
        }
        if ((i & 64) != 0) {
            list7 = teamPlayersResponse.teamDepthAssignments;
        }
        List list8 = list6;
        List list9 = list7;
        List list10 = list5;
        List list11 = list3;
        return teamPlayersResponse.copy(list, list2, list11, list4, list10, list8, list9);
    }

    public static final /* synthetic */ void write$Self$model_release(TeamPlayersResponse self, wf3 output, SerialDescriptor serialDesc) {
        NetworkResponse.write$Self(self, output, serialDesc);
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.players);
        output.f(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.foreignPlayers);
        output.f(serialDesc, 4, (KSerializer) joaVarArr[4].getValue(), self.nationalPlayers);
        output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.supportStaff);
        output.h(serialDesc, 6, (KSerializer) joaVarArr[6].getValue(), self.playerPreviousTeam);
        output.h(serialDesc, 7, (KSerializer) joaVarArr[7].getValue(), self.nationalTeamPlayerStatistics);
        output.h(serialDesc, 8, (KSerializer) joaVarArr[8].getValue(), self.teamDepthAssignments);
    }

    @NotNull
    public final List<PlayerItem> component1() {
        return this.players;
    }

    @NotNull
    public final List<PlayerItem> component2() {
        return this.foreignPlayers;
    }

    @NotNull
    public final List<PlayerItem> component3() {
        return this.nationalPlayers;
    }

    @NotNull
    public final List<CricketSupportStaff> component4() {
        return this.supportStaff;
    }

    @Nullable
    public final List<PlayerWithPreviousTeam> component5() {
        return this.playerPreviousTeam;
    }

    @Nullable
    public final List<PlayerWithNationalTeam> component6() {
        return this.nationalTeamPlayerStatistics;
    }

    @Nullable
    public final List<PlayerWithDepthAssignment> component7() {
        return this.teamDepthAssignments;
    }

    @NotNull
    public final TeamPlayersResponse copy(@NotNull List<PlayerItem> players, @NotNull List<PlayerItem> foreignPlayers, @NotNull List<PlayerItem> nationalPlayers, @NotNull List<CricketSupportStaff> supportStaff, @Nullable List<PlayerWithPreviousTeam> playerPreviousTeam, @Nullable List<PlayerWithNationalTeam> nationalTeamPlayerStatistics, @Nullable List<PlayerWithDepthAssignment> teamDepthAssignments) {
        players.getClass();
        foreignPlayers.getClass();
        nationalPlayers.getClass();
        supportStaff.getClass();
        return new TeamPlayersResponse(players, foreignPlayers, nationalPlayers, supportStaff, playerPreviousTeam, nationalTeamPlayerStatistics, teamDepthAssignments);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TeamPlayersResponse)) {
            return false;
        }
        TeamPlayersResponse teamPlayersResponse = (TeamPlayersResponse) other;
        return Intrinsics.c(this.players, teamPlayersResponse.players) && Intrinsics.c(this.foreignPlayers, teamPlayersResponse.foreignPlayers) && Intrinsics.c(this.nationalPlayers, teamPlayersResponse.nationalPlayers) && Intrinsics.c(this.supportStaff, teamPlayersResponse.supportStaff) && Intrinsics.c(this.playerPreviousTeam, teamPlayersResponse.playerPreviousTeam) && Intrinsics.c(this.nationalTeamPlayerStatistics, teamPlayersResponse.nationalTeamPlayerStatistics) && Intrinsics.c(this.teamDepthAssignments, teamPlayersResponse.teamDepthAssignments);
    }

    @NotNull
    public final List<PlayerItem> getForeignPlayers() {
        return this.foreignPlayers;
    }

    @NotNull
    public final List<PlayerItem> getNationalPlayers() {
        return this.nationalPlayers;
    }

    @Nullable
    public final List<PlayerWithNationalTeam> getNationalTeamPlayerStatistics() {
        return this.nationalTeamPlayerStatistics;
    }

    @Nullable
    public final List<PlayerWithPreviousTeam> getPlayerPreviousTeam() {
        return this.playerPreviousTeam;
    }

    @NotNull
    public final List<PlayerItem> getPlayers() {
        return this.players;
    }

    @NotNull
    public final List<CricketSupportStaff> getSupportStaff() {
        return this.supportStaff;
    }

    @Nullable
    public final List<PlayerWithDepthAssignment> getTeamDepthAssignments() {
        return this.teamDepthAssignments;
    }

    public int hashCode() {
        int d = dmi.d(dmi.d(dmi.d(this.players.hashCode() * 31, 31, this.foreignPlayers), 31, this.nationalPlayers), 31, this.supportStaff);
        List<PlayerWithPreviousTeam> list = this.playerPreviousTeam;
        int hashCode = (d + (list == null ? 0 : list.hashCode())) * 31;
        List<PlayerWithNationalTeam> list2 = this.nationalTeamPlayerStatistics;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PlayerWithDepthAssignment> list3 = this.teamDepthAssignments;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<PlayerItem> list = this.players;
        List<PlayerItem> list2 = this.foreignPlayers;
        List<PlayerItem> list3 = this.nationalPlayers;
        List<CricketSupportStaff> list4 = this.supportStaff;
        List<PlayerWithPreviousTeam> list5 = this.playerPreviousTeam;
        List<PlayerWithNationalTeam> list6 = this.nationalTeamPlayerStatistics;
        List<PlayerWithDepthAssignment> list7 = this.teamDepthAssignments;
        StringBuilder s = fc6.s("TeamPlayersResponse(players=", ", foreignPlayers=", ", nationalPlayers=", list, list2);
        vxd.w(s, list3, ", supportStaff=", list4, ", playerPreviousTeam=");
        vxd.w(s, list5, ", nationalTeamPlayerStatistics=", list6, ", teamDepthAssignments=");
        return mz1.p(s, list7, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/TeamPlayersResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/TeamPlayersResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TeamPlayersResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TeamPlayersResponse(@NotNull List<PlayerItem> list, @NotNull List<PlayerItem> list2, @NotNull List<PlayerItem> list3, @NotNull List<CricketSupportStaff> list4, @Nullable List<PlayerWithPreviousTeam> list5, @Nullable List<PlayerWithNationalTeam> list6, @Nullable List<PlayerWithDepthAssignment> list7) {
        super((HeadResponse) null, (ErrorResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.players = list;
        this.foreignPlayers = list2;
        this.nationalPlayers = list3;
        this.supportStaff = list4;
        this.playerPreviousTeam = list5;
        this.nationalTeamPlayerStatistics = list6;
        this.teamDepthAssignments = list7;
    }
}
