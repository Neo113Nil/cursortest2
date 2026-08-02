package com.sofascore.model.network.response;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import defpackage.dtg;
import defpackage.gz1;
import defpackage.joa;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ^\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b\t\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b\n\u0010\"R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b4\u0010\u001d¨\u00067"}, d2 = {"Lcom/sofascore/model/network/response/SeasonPlayersData;", "", "", "Lcom/sofascore/model/network/response/PlayerOrTeam;", "players", "", "openCount", "profileViewCount", "", "isTopOneFan", "isTopOnePercentFan", "Lcom/sofascore/model/mvvm/model/Player;", "lineupPlayers", "<init>", "(Ljava/util/List;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILjava/util/List;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/SeasonPlayersData;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()I", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "copy", "(Ljava/util/List;IILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/sofascore/model/network/response/SeasonPlayersData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPlayers", "I", "getOpenCount", "getProfileViewCount", "Ljava/lang/Boolean;", "getLineupPlayers", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SeasonPlayersData {

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean isTopOneFan;

    @Nullable
    private final Boolean isTopOnePercentFan;

    @Nullable
    private final List<Player> lineupPlayers;
    private final int openCount;

    @NotNull
    private final List<PlayerOrTeam> players;
    private final int profileViewCount;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{ypa.a(ysaVar, new dtg(20)), null, null, null, null, ypa.a(ysaVar, new dtg(21))};
    }

    public /* synthetic */ SeasonPlayersData(int i, List list, int i2, int i3, Boolean bool, Boolean bool2, List list2, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, SeasonPlayersData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.players = list;
        this.openCount = i2;
        this.profileViewCount = i3;
        this.isTopOneFan = bool;
        this.isTopOnePercentFan = bool2;
        this.lineupPlayers = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new xg0(PlayerOrTeam$$serializer.INSTANCE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Player$$serializer.INSTANCE, 0);
    }

    public static /* synthetic */ SeasonPlayersData copy$default(SeasonPlayersData seasonPlayersData, List list, int i, int i2, Boolean bool, Boolean bool2, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = seasonPlayersData.players;
        }
        if ((i3 & 2) != 0) {
            i = seasonPlayersData.openCount;
        }
        if ((i3 & 4) != 0) {
            i2 = seasonPlayersData.profileViewCount;
        }
        if ((i3 & 8) != 0) {
            bool = seasonPlayersData.isTopOneFan;
        }
        if ((i3 & 16) != 0) {
            bool2 = seasonPlayersData.isTopOnePercentFan;
        }
        if ((i3 & 32) != 0) {
            list2 = seasonPlayersData.lineupPlayers;
        }
        Boolean bool3 = bool2;
        List list3 = list2;
        return seasonPlayersData.copy(list, i, i2, bool, bool3, list3);
    }

    public static final /* synthetic */ void write$Self$model_release(SeasonPlayersData self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, (KSerializer) joaVarArr[0].getValue(), self.players);
        output.u(1, self.openCount, serialDesc);
        output.u(2, self.profileViewCount, serialDesc);
        gz1 gz1Var = gz1.a;
        output.h(serialDesc, 3, gz1Var, self.isTopOneFan);
        output.h(serialDesc, 4, gz1Var, self.isTopOnePercentFan);
        output.h(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.lineupPlayers);
    }

    @NotNull
    public final List<PlayerOrTeam> component1() {
        return this.players;
    }

    /* renamed from: component2, reason: from getter */
    public final int getOpenCount() {
        return this.openCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProfileViewCount() {
        return this.profileViewCount;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsTopOneFan() {
        return this.isTopOneFan;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsTopOnePercentFan() {
        return this.isTopOnePercentFan;
    }

    @Nullable
    public final List<Player> component6() {
        return this.lineupPlayers;
    }

    @NotNull
    public final SeasonPlayersData copy(@NotNull List<PlayerOrTeam> players, int openCount, int profileViewCount, @Nullable Boolean isTopOneFan, @Nullable Boolean isTopOnePercentFan, @Nullable List<Player> lineupPlayers) {
        players.getClass();
        return new SeasonPlayersData(players, openCount, profileViewCount, isTopOneFan, isTopOnePercentFan, lineupPlayers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonPlayersData)) {
            return false;
        }
        SeasonPlayersData seasonPlayersData = (SeasonPlayersData) other;
        return Intrinsics.c(this.players, seasonPlayersData.players) && this.openCount == seasonPlayersData.openCount && this.profileViewCount == seasonPlayersData.profileViewCount && Intrinsics.c(this.isTopOneFan, seasonPlayersData.isTopOneFan) && Intrinsics.c(this.isTopOnePercentFan, seasonPlayersData.isTopOnePercentFan) && Intrinsics.c(this.lineupPlayers, seasonPlayersData.lineupPlayers);
    }

    @Nullable
    public final List<Player> getLineupPlayers() {
        return this.lineupPlayers;
    }

    public final int getOpenCount() {
        return this.openCount;
    }

    @NotNull
    public final List<PlayerOrTeam> getPlayers() {
        return this.players;
    }

    public final int getProfileViewCount() {
        return this.profileViewCount;
    }

    public int hashCode() {
        int a = wv8.a(this.profileViewCount, wv8.a(this.openCount, this.players.hashCode() * 31, 31), 31);
        Boolean bool = this.isTopOneFan;
        int hashCode = (a + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isTopOnePercentFan;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<Player> list = this.lineupPlayers;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTopOneFan() {
        return this.isTopOneFan;
    }

    @Nullable
    public final Boolean isTopOnePercentFan() {
        return this.isTopOnePercentFan;
    }

    @NotNull
    public String toString() {
        return "SeasonPlayersData(players=" + this.players + ", openCount=" + this.openCount + ", profileViewCount=" + this.profileViewCount + ", isTopOneFan=" + this.isTopOneFan + ", isTopOnePercentFan=" + this.isTopOnePercentFan + ", lineupPlayers=" + this.lineupPlayers + ")";
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/SeasonPlayersData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/SeasonPlayersData;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SeasonPlayersData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SeasonPlayersData(@NotNull List<PlayerOrTeam> list, int i, int i2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable List<Player> list2) {
        list.getClass();
        this.players = list;
        this.openCount = i;
        this.profileViewCount = i2;
        this.isTopOneFan = bool;
        this.isTopOnePercentFan = bool2;
        this.lineupPlayers = list2;
    }
}
