package com.sofascore.model.network.response.playerOfTheSeason;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.ild;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010B]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+JZ\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u0010+J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010>\u001a\u0004\b?\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010)R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010+¨\u0006F"}, d2 = {"Lcom/sofascore/model/network/response/playerOfTheSeason/POTSNetworkPlayer;", "", "", CampaignEx.JSON_KEY_STAR, "", "appearances", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "Lcom/sofascore/model/mvvm/model/Player;", SearchResponseKt.PLAYER_ENTITY, "Lcom/sofascore/model/mvvm/model/Team;", "team", "year", "<init>", "(DLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;I)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IDLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;ILt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/playerOfTheSeason/POTSNetworkPlayer;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()D", "component2", "()Ljava/lang/Integer;", "component3", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component4", "()Lcom/sofascore/model/mvvm/model/Season;", "component5", "()Lcom/sofascore/model/mvvm/model/Player;", "component6", "()Lcom/sofascore/model/mvvm/model/Team;", "component7", "()I", "copy", "(DLjava/lang/Integer;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Season;Lcom/sofascore/model/mvvm/model/Player;Lcom/sofascore/model/mvvm/model/Team;I)Lcom/sofascore/model/network/response/playerOfTheSeason/POTSNetworkPlayer;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getRating", "Ljava/lang/Integer;", "getAppearances", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "Lcom/sofascore/model/mvvm/model/Player;", "getPlayer", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "I", "getYear", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class POTSNetworkPlayer {

    @Nullable
    private final Integer appearances;

    @NotNull
    private final Player player;
    private final double rating;

    @NotNull
    private final Season season;

    @NotNull
    private final Team team;

    @Nullable
    private final UniqueTournament uniqueTournament;
    private final int year;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, null, null, ypa.a(ysa.b, new ild(27)), null};

    public /* synthetic */ POTSNetworkPlayer(int i, double d, Integer num, UniqueTournament uniqueTournament, Season season, Player player, Team team, int i2, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, POTSNetworkPlayer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.rating = d;
        this.appearances = num;
        this.uniqueTournament = uniqueTournament;
        this.season = season;
        this.player = player;
        this.team = team;
        this.year = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ POTSNetworkPlayer copy$default(POTSNetworkPlayer pOTSNetworkPlayer, double d, Integer num, UniqueTournament uniqueTournament, Season season, Player player, Team team, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = pOTSNetworkPlayer.rating;
        }
        double d2 = d;
        if ((i2 & 2) != 0) {
            num = pOTSNetworkPlayer.appearances;
        }
        Integer num2 = num;
        if ((i2 & 4) != 0) {
            uniqueTournament = pOTSNetworkPlayer.uniqueTournament;
        }
        UniqueTournament uniqueTournament2 = uniqueTournament;
        if ((i2 & 8) != 0) {
            season = pOTSNetworkPlayer.season;
        }
        Season season2 = season;
        if ((i2 & 16) != 0) {
            player = pOTSNetworkPlayer.player;
        }
        return pOTSNetworkPlayer.copy(d2, num2, uniqueTournament2, season2, player, (i2 & 32) != 0 ? pOTSNetworkPlayer.team : team, (i2 & 64) != 0 ? pOTSNetworkPlayer.year : i);
    }

    public static final /* synthetic */ void write$Self$model_release(POTSNetworkPlayer self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.D(serialDesc, 0, self.rating);
        output.h(serialDesc, 1, a7a.a, self.appearances);
        output.h(serialDesc, 2, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.f(serialDesc, 3, Season$$serializer.INSTANCE, self.season);
        output.f(serialDesc, 4, Player$$serializer.INSTANCE, self.player);
        output.f(serialDesc, 5, (KSerializer) joaVarArr[5].getValue(), self.team);
        output.u(6, self.year, serialDesc);
    }

    /* renamed from: component1, reason: from getter */
    public final double getRating() {
        return this.rating;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getAppearances() {
        return this.appearances;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Season getSeason() {
        return this.season;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    /* renamed from: component7, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    public final POTSNetworkPlayer copy(double rating, @Nullable Integer appearances, @Nullable UniqueTournament uniqueTournament, @NotNull Season season, @NotNull Player player, @NotNull Team team, int year) {
        season.getClass();
        player.getClass();
        team.getClass();
        return new POTSNetworkPlayer(rating, appearances, uniqueTournament, season, player, team, year);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof POTSNetworkPlayer)) {
            return false;
        }
        POTSNetworkPlayer pOTSNetworkPlayer = (POTSNetworkPlayer) other;
        return Double.compare(this.rating, pOTSNetworkPlayer.rating) == 0 && Intrinsics.c(this.appearances, pOTSNetworkPlayer.appearances) && Intrinsics.c(this.uniqueTournament, pOTSNetworkPlayer.uniqueTournament) && Intrinsics.c(this.season, pOTSNetworkPlayer.season) && Intrinsics.c(this.player, pOTSNetworkPlayer.player) && Intrinsics.c(this.team, pOTSNetworkPlayer.team) && this.year == pOTSNetworkPlayer.year;
    }

    @Nullable
    public final Integer getAppearances() {
        return this.appearances;
    }

    @NotNull
    public final Player getPlayer() {
        return this.player;
    }

    public final double getRating() {
        return this.rating;
    }

    @NotNull
    public final Season getSeason() {
        return this.season;
    }

    @NotNull
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.rating) * 31;
        Integer num = this.appearances;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        return Integer.hashCode(this.year) + fc6.b((this.player.hashCode() + ((this.season.hashCode() + ((hashCode2 + (uniqueTournament != null ? uniqueTournament.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.team);
    }

    @NotNull
    public String toString() {
        double d = this.rating;
        Integer num = this.appearances;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        Season season = this.season;
        Player player = this.player;
        Team team = this.team;
        int i = this.year;
        StringBuilder sb = new StringBuilder("POTSNetworkPlayer(rating=");
        sb.append(d);
        sb.append(", appearances=");
        sb.append(num);
        sb.append(", uniqueTournament=");
        sb.append(uniqueTournament);
        sb.append(", season=");
        sb.append(season);
        sb.append(", player=");
        sb.append(player);
        sb.append(", team=");
        sb.append(team);
        return fn0.k(i, ", year=", ")", sb);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/playerOfTheSeason/POTSNetworkPlayer$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/playerOfTheSeason/POTSNetworkPlayer;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return POTSNetworkPlayer$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public POTSNetworkPlayer(double d, @Nullable Integer num, @Nullable UniqueTournament uniqueTournament, @NotNull Season season, @NotNull Player player, @NotNull Team team, int i) {
        season.getClass();
        player.getClass();
        team.getClass();
        this.rating = d;
        this.appearances = num;
        this.uniqueTournament = uniqueTournament;
        this.season = season;
        this.player = player;
        this.team = team;
        this.year = i;
    }
}
