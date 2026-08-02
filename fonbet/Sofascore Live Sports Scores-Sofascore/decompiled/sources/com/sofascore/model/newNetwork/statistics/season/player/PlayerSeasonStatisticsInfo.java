package com.sofascore.model.newNetwork.statistics.season.player;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import com.sofascore.model.newNetwork.statistics.season.player.AbstractPlayerSeasonStatistics;
import defpackage.a7a;
import defpackage.boe;
import defpackage.joa;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.uye;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0007\u0018\u0000 ?*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0002@?B[\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013Bq\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017JG\u0010\"\u001a\u00020\u001f\"\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u00104R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b8\u00107R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo;", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "T", "", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "previousTeams", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "", "startYear", "endYear", "", "year", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "<init>", "(Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Lcom/sofascore/model/mvvm/model/Team;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/UniqueTournament;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;Lcom/sofascore/model/mvvm/model/Team;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "getStatistics", "()Lcom/sofascore/model/newNetwork/statistics/season/player/AbstractPlayerSeasonStatistics;", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "Ljava/util/List;", "getPreviousTeams", "()Ljava/util/List;", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "()Lcom/sofascore/model/mvvm/model/Season;", "Ljava/lang/Integer;", "getStartYear", "()Ljava/lang/Integer;", "getEndYear", "Ljava/lang/String;", "getYear", "()Ljava/lang/String;", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerSeasonStatisticsInfo<T extends AbstractPlayerSeasonStatistics> {

    @NotNull
    private static final SerialDescriptor $cachedDescriptor;

    @NotNull
    private static final joa[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Integer endYear;

    @Nullable
    private final List<Team> previousTeams;

    @Nullable
    private final Season season;

    @Nullable
    private final Integer startYear;

    @NotNull
    private final T statistics;

    @Nullable
    private final Team team;

    @Nullable
    private final UniqueTournament uniqueTournament;

    @Nullable
    private final String year;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new boe(25)), ypa.a(ysaVar, new boe(26)), null, null, null, null, null};
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.PlayerSeasonStatisticsInfo", null, 8);
        uyeVar.j(TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, false);
        uyeVar.j("team", false);
        uyeVar.j("previousTeams", false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("startYear", false);
        uyeVar.j("endYear", false);
        uyeVar.j("year", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        $cachedDescriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ PlayerSeasonStatisticsInfo(int i, AbstractPlayerSeasonStatistics abstractPlayerSeasonStatistics, Team team, List list, Season season, Integer num, Integer num2, String str, UniqueTournament uniqueTournament, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, $cachedDescriptor);
            throw null;
        }
        this.statistics = abstractPlayerSeasonStatistics;
        this.team = team;
        this.previousTeams = list;
        this.season = season;
        this.startYear = num;
        this.endYear = num2;
        this.year = str;
        this.uniqueTournament = uniqueTournament;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new xg0(Team.INSTANCE.serializer(), 0);
    }

    public static final /* synthetic */ void write$Self$model_release(PlayerSeasonStatisticsInfo self, wf3 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, typeSerial0, self.statistics);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.previousTeams);
        output.h(serialDesc, 3, Season$$serializer.INSTANCE, self.season);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.startYear);
        output.h(serialDesc, 5, a7aVar, self.endYear);
        output.h(serialDesc, 6, uhi.a, self.year);
        output.h(serialDesc, 7, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!PlayerSeasonStatisticsInfo.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        PlayerSeasonStatisticsInfo playerSeasonStatisticsInfo = (PlayerSeasonStatisticsInfo) other;
        return Intrinsics.c(this.statistics, playerSeasonStatisticsInfo.statistics) && Intrinsics.c(this.team, playerSeasonStatisticsInfo.team) && Intrinsics.c(this.season, playerSeasonStatisticsInfo.season);
    }

    @Nullable
    public final Integer getEndYear() {
        return this.endYear;
    }

    @Nullable
    public final List<Team> getPreviousTeams() {
        return this.previousTeams;
    }

    @Nullable
    public final Season getSeason() {
        return this.season;
    }

    @Nullable
    public final Integer getStartYear() {
        return this.startYear;
    }

    @NotNull
    public final T getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        int hashCode = this.statistics.hashCode() * 31;
        Team team = this.team;
        int hashCode2 = (hashCode + (team != null ? team.hashCode() : 0)) * 31;
        Season season = this.season;
        return hashCode2 + (season != null ? season.hashCode() : 0);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerSeasonStatisticsInfo;", "T", "typeSerial0", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> KSerializer serializer(@NotNull KSerializer typeSerial0) {
            typeSerial0.getClass();
            return new PlayerSeasonStatisticsInfo$$serializer(typeSerial0);
        }

        private Companion() {
        }
    }

    public PlayerSeasonStatisticsInfo(@NotNull T t, @Nullable Team team, @Nullable List<Team> list, @Nullable Season season, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable UniqueTournament uniqueTournament) {
        t.getClass();
        this.statistics = t;
        this.team = team;
        this.previousTeams = list;
        this.season = season;
        this.startYear = num;
        this.endYear = num2;
        this.year = str;
        this.uniqueTournament = uniqueTournament;
    }
}
