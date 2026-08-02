package com.sofascore.model.newNetwork.statistics.season.player;

import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.TeamSeasonStatisticsSerializerKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.joa;
import defpackage.lga;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t2e;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.ypa;
import defpackage.ysa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 62\u00020\u0001:\u000276B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bq\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b/\u0010.R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticSeasonRaw;", "", "Lkotlinx/serialization/json/c;", TeamSeasonStatisticsSerializerKt.PROPERTY_STATISTICS, "Lcom/sofascore/model/mvvm/model/Team;", "team", "", "previousTeams", "Lcom/sofascore/model/mvvm/model/Season;", TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, "", "startYear", "endYear", "", "year", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "<init>", "(Lkotlinx/serialization/json/c;Lcom/sofascore/model/mvvm/model/Team;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/UniqueTournament;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/c;Lcom/sofascore/model/mvvm/model/Team;Ljava/util/List;Lcom/sofascore/model/mvvm/model/Season;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticSeasonRaw;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lkotlinx/serialization/json/c;", "getStatistics", "()Lkotlinx/serialization/json/c;", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "Ljava/util/List;", "getPreviousTeams", "()Ljava/util/List;", "Lcom/sofascore/model/mvvm/model/Season;", "getSeason", "()Lcom/sofascore/model/mvvm/model/Season;", "Ljava/lang/Integer;", "getStartYear", "()Ljava/lang/Integer;", "getEndYear", "Ljava/lang/String;", "getYear", "()Ljava/lang/String;", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PlayerCareerStatisticSeasonRaw {

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
    private final c statistics;

    @Nullable
    private final Team team;

    @Nullable
    private final UniqueTournament uniqueTournament;

    @Nullable
    private final String year;

    static {
        ysa ysaVar = ysa.b;
        $childSerializers = new joa[]{null, ypa.a(ysaVar, new t2e(23)), ypa.a(ysaVar, new t2e(24)), null, null, null, null, null};
    }

    public /* synthetic */ PlayerCareerStatisticSeasonRaw(int i, c cVar, Team team, List list, Season season, Integer num, Integer num2, String str, UniqueTournament uniqueTournament, t5h t5hVar) {
        if (255 != (i & 255)) {
            oea.z(i, 255, PlayerCareerStatisticSeasonRaw$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.statistics = cVar;
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

    public static final /* synthetic */ void write$Self$model_release(PlayerCareerStatisticSeasonRaw self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.f(serialDesc, 0, lga.a, self.statistics);
        output.h(serialDesc, 1, (KSerializer) joaVarArr[1].getValue(), self.team);
        output.h(serialDesc, 2, (KSerializer) joaVarArr[2].getValue(), self.previousTeams);
        output.h(serialDesc, 3, Season$$serializer.INSTANCE, self.season);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 4, a7aVar, self.startYear);
        output.h(serialDesc, 5, a7aVar, self.endYear);
        output.h(serialDesc, 6, uhi.a, self.year);
        output.h(serialDesc, 7, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
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
    public final c getStatistics() {
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticSeasonRaw$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/statistics/season/player/PlayerCareerStatisticSeasonRaw;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PlayerCareerStatisticSeasonRaw$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PlayerCareerStatisticSeasonRaw(@NotNull c cVar, @Nullable Team team, @Nullable List<Team> list, @Nullable Season season, @Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable UniqueTournament uniqueTournament) {
        cVar.getClass();
        this.statistics = cVar;
        this.team = team;
        this.previousTeams = list;
        this.season = season;
        this.startYear = num;
        this.endYear = num2;
        this.year = str;
        this.uniqueTournament = uniqueTournament;
    }
}
