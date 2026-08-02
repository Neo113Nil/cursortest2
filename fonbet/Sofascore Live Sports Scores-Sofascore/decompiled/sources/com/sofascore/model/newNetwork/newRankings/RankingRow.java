package com.sofascore.model.newNetwork.newRankings;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Country$$serializer;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import defpackage.a7a;
import defpackage.fc6;
import defpackage.fn0;
import defpackage.h75;
import defpackage.joa;
import defpackage.lkb;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.s8f;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.wf3;
import defpackage.wv8;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0002mlBÁ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001eBÕ\u0001\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010'J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010'J\u0012\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010'J\u0012\u00109\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b9\u00103J\u0012\u0010:\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b:\u00103J\u0012\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b;\u00103J\u0012\u0010<\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b<\u0010'J\u0012\u0010=\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b=\u0010'J\u0012\u0010>\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b>\u00101Jð\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bA\u00101J\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010$J\u001a\u0010E\u001a\u00020D2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bE\u0010FJ'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001¢\u0006\u0004\bM\u0010NR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010P\u001a\u0004\bR\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010S\u001a\u0004\bT\u0010'R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010U\u001a\u0004\bV\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\bX\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010Y\u001a\u0004\bZ\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010[\u001a\u0004\b\\\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010]\u001a\u0004\b^\u00101R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010_\u001a\u0004\b`\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010S\u001a\u0004\ba\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010S\u001a\u0004\bb\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010c\u001a\u0004\bd\u00107R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\be\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010_\u001a\u0004\bf\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010_\u001a\u0004\bg\u00103R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0019\u0010_\u001a\u0004\bh\u00103R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010S\u001a\u0004\bi\u0010'R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010S\u001a\u0004\bj\u0010'R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010]\u001a\u0004\bk\u00101¨\u0006n"}, d2 = {"Lcom/sofascore/model/newNetwork/newRankings/RankingRow;", "", "", "id", "position", "year", "Lcom/sofascore/model/mvvm/model/Team;", "team", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", SearchResponseKt.LEAGUE_ENTITY, "Lcom/sofascore/model/mvvm/model/Country;", "country", "Lcom/sofascore/model/mvvm/model/Event;", "lastEvent", "", "name", "", "points", "previousPosition", "bestPosition", "", "bestPositionTimestamp", "tournamentsPlayed", "previousPoints", "nextWinPoints", "maxPoints", "playingTeams", "totalTeams", "currentTournamentName", "<init>", "(IILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lt5h;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/sofascore/model/mvvm/model/Team;", "component5", "()Lcom/sofascore/model/mvvm/model/UniqueTournament;", "component6", "()Lcom/sofascore/model/mvvm/model/Country;", "component7", "()Lcom/sofascore/model/mvvm/model/Event;", "component8", "()Ljava/lang/String;", "component9", "()Ljava/lang/Double;", "component10", "component11", "component12", "()Ljava/lang/Long;", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(IILjava/lang/Integer;Lcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/UniqueTournament;Lcom/sofascore/model/mvvm/model/Country;Lcom/sofascore/model/mvvm/model/Event;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/sofascore/model/newNetwork/newRankings/RankingRow;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/newNetwork/newRankings/RankingRow;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getId", "getPosition", "Ljava/lang/Integer;", "getYear", "Lcom/sofascore/model/mvvm/model/Team;", "getTeam", "Lcom/sofascore/model/mvvm/model/UniqueTournament;", "getUniqueTournament", "Lcom/sofascore/model/mvvm/model/Country;", "getCountry", "Lcom/sofascore/model/mvvm/model/Event;", "getLastEvent", "Ljava/lang/String;", "getName", "Ljava/lang/Double;", "getPoints", "getPreviousPosition", "getBestPosition", "Ljava/lang/Long;", "getBestPositionTimestamp", "getTournamentsPlayed", "getPreviousPoints", "getNextWinPoints", "getMaxPoints", "getPlayingTeams", "getTotalTeams", "getCurrentTournamentName", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RankingRow {

    @Nullable
    private final Integer bestPosition;

    @Nullable
    private final Long bestPositionTimestamp;

    @Nullable
    private final Country country;

    @Nullable
    private final String currentTournamentName;
    private final int id;

    @Nullable
    private final Event lastEvent;

    @Nullable
    private final Double maxPoints;

    @Nullable
    private final String name;

    @Nullable
    private final Double nextWinPoints;

    @Nullable
    private final Integer playingTeams;

    @Nullable
    private final Double points;
    private final int position;

    @Nullable
    private final Double previousPoints;

    @Nullable
    private final Integer previousPosition;

    @Nullable
    private final Team team;

    @Nullable
    private final Integer totalTeams;

    @Nullable
    private final Integer tournamentsPlayed;

    @Nullable
    private final UniqueTournament uniqueTournament;

    @Nullable
    private final Integer year;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final joa[] $childSerializers = {null, null, null, ypa.a(ysa.b, new s8f(21)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public /* synthetic */ RankingRow(int i, int i2, int i3, Integer num, Team team, UniqueTournament uniqueTournament, Country country, Event event, String str, Double d, Integer num2, Integer num3, Long l, Integer num4, Double d2, Double d3, Double d4, Integer num5, Integer num6, String str2, t5h t5hVar) {
        if (524287 != (i & 524287)) {
            oea.z(i, 524287, RankingRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.position = i3;
        this.year = num;
        this.team = team;
        this.uniqueTournament = uniqueTournament;
        this.country = country;
        this.lastEvent = event;
        this.name = str;
        this.points = d;
        this.previousPosition = num2;
        this.bestPosition = num3;
        this.bestPositionTimestamp = l;
        this.tournamentsPlayed = num4;
        this.previousPoints = d2;
        this.nextWinPoints = d3;
        this.maxPoints = d4;
        this.playingTeams = num5;
        this.totalTeams = num6;
        this.currentTournamentName = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return Team.INSTANCE.serializer();
    }

    public static /* synthetic */ RankingRow copy$default(RankingRow rankingRow, int i, int i2, Integer num, Team team, UniqueTournament uniqueTournament, Country country, Event event, String str, Double d, Integer num2, Integer num3, Long l, Integer num4, Double d2, Double d3, Double d4, Integer num5, Integer num6, String str2, int i3, Object obj) {
        String str3;
        Integer num7;
        int i4 = (i3 & 1) != 0 ? rankingRow.id : i;
        int i5 = (i3 & 2) != 0 ? rankingRow.position : i2;
        Integer num8 = (i3 & 4) != 0 ? rankingRow.year : num;
        Team team2 = (i3 & 8) != 0 ? rankingRow.team : team;
        UniqueTournament uniqueTournament2 = (i3 & 16) != 0 ? rankingRow.uniqueTournament : uniqueTournament;
        Country country2 = (i3 & 32) != 0 ? rankingRow.country : country;
        Event event2 = (i3 & 64) != 0 ? rankingRow.lastEvent : event;
        String str4 = (i3 & 128) != 0 ? rankingRow.name : str;
        Double d5 = (i3 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? rankingRow.points : d;
        Integer num9 = (i3 & 512) != 0 ? rankingRow.previousPosition : num2;
        Integer num10 = (i3 & 1024) != 0 ? rankingRow.bestPosition : num3;
        Long l2 = (i3 & a.o) != 0 ? rankingRow.bestPositionTimestamp : l;
        Integer num11 = (i3 & 4096) != 0 ? rankingRow.tournamentsPlayed : num4;
        Double d6 = (i3 & 8192) != 0 ? rankingRow.previousPoints : d2;
        int i6 = i4;
        Double d7 = (i3 & 16384) != 0 ? rankingRow.nextWinPoints : d3;
        Double d8 = (i3 & 32768) != 0 ? rankingRow.maxPoints : d4;
        Integer num12 = (i3 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? rankingRow.playingTeams : num5;
        Integer num13 = (i3 & 131072) != 0 ? rankingRow.totalTeams : num6;
        if ((i3 & 262144) != 0) {
            num7 = num13;
            str3 = rankingRow.currentTournamentName;
        } else {
            str3 = str2;
            num7 = num13;
        }
        return rankingRow.copy(i6, i5, num8, team2, uniqueTournament2, country2, event2, str4, d5, num9, num10, l2, num11, d6, d7, d8, num12, num7, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(RankingRow self, wf3 output, SerialDescriptor serialDesc) {
        joa[] joaVarArr = $childSerializers;
        output.u(0, self.id, serialDesc);
        output.u(1, self.position, serialDesc);
        a7a a7aVar = a7a.a;
        output.h(serialDesc, 2, a7aVar, self.year);
        output.h(serialDesc, 3, (KSerializer) joaVarArr[3].getValue(), self.team);
        output.h(serialDesc, 4, UniqueTournament$$serializer.INSTANCE, self.uniqueTournament);
        output.h(serialDesc, 5, Country$$serializer.INSTANCE, self.country);
        output.h(serialDesc, 6, EventSerializer.INSTANCE, self.lastEvent);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 7, uhiVar, self.name);
        h75 h75Var = h75.a;
        output.h(serialDesc, 8, h75Var, self.points);
        output.h(serialDesc, 9, a7aVar, self.previousPosition);
        output.h(serialDesc, 10, a7aVar, self.bestPosition);
        output.h(serialDesc, 11, lkb.a, self.bestPositionTimestamp);
        output.h(serialDesc, 12, a7aVar, self.tournamentsPlayed);
        output.h(serialDesc, 13, h75Var, self.previousPoints);
        output.h(serialDesc, 14, h75Var, self.nextWinPoints);
        output.h(serialDesc, 15, h75Var, self.maxPoints);
        output.h(serialDesc, 16, a7aVar, self.playingTeams);
        output.h(serialDesc, 17, a7aVar, self.totalTeams);
        output.h(serialDesc, 18, uhiVar, self.currentTournamentName);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getPreviousPosition() {
        return this.previousPosition;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Integer getBestPosition() {
        return this.bestPosition;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Long getBestPositionTimestamp() {
        return this.bestPositionTimestamp;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Integer getTournamentsPlayed() {
        return this.tournamentsPlayed;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Double getPreviousPoints() {
        return this.previousPoints;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Double getNextWinPoints() {
        return this.nextWinPoints;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final Double getMaxPoints() {
        return this.maxPoints;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final Integer getPlayingTeams() {
        return this.playingTeams;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final Integer getTotalTeams() {
        return this.totalTeams;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getCurrentTournamentName() {
        return this.currentTournamentName;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getYear() {
        return this.year;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Event getLastEvent() {
        return this.lastEvent;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getPoints() {
        return this.points;
    }

    @NotNull
    public final RankingRow copy(int id, int position, @Nullable Integer year, @Nullable Team team, @Nullable UniqueTournament uniqueTournament, @Nullable Country country, @Nullable Event lastEvent, @Nullable String name, @Nullable Double points, @Nullable Integer previousPosition, @Nullable Integer bestPosition, @Nullable Long bestPositionTimestamp, @Nullable Integer tournamentsPlayed, @Nullable Double previousPoints, @Nullable Double nextWinPoints, @Nullable Double maxPoints, @Nullable Integer playingTeams, @Nullable Integer totalTeams, @Nullable String currentTournamentName) {
        return new RankingRow(id, position, year, team, uniqueTournament, country, lastEvent, name, points, previousPosition, bestPosition, bestPositionTimestamp, tournamentsPlayed, previousPoints, nextWinPoints, maxPoints, playingTeams, totalTeams, currentTournamentName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankingRow)) {
            return false;
        }
        RankingRow rankingRow = (RankingRow) other;
        return this.id == rankingRow.id && this.position == rankingRow.position && Intrinsics.c(this.year, rankingRow.year) && Intrinsics.c(this.team, rankingRow.team) && Intrinsics.c(this.uniqueTournament, rankingRow.uniqueTournament) && Intrinsics.c(this.country, rankingRow.country) && Intrinsics.c(this.lastEvent, rankingRow.lastEvent) && Intrinsics.c(this.name, rankingRow.name) && Intrinsics.c(this.points, rankingRow.points) && Intrinsics.c(this.previousPosition, rankingRow.previousPosition) && Intrinsics.c(this.bestPosition, rankingRow.bestPosition) && Intrinsics.c(this.bestPositionTimestamp, rankingRow.bestPositionTimestamp) && Intrinsics.c(this.tournamentsPlayed, rankingRow.tournamentsPlayed) && Intrinsics.c(this.previousPoints, rankingRow.previousPoints) && Intrinsics.c(this.nextWinPoints, rankingRow.nextWinPoints) && Intrinsics.c(this.maxPoints, rankingRow.maxPoints) && Intrinsics.c(this.playingTeams, rankingRow.playingTeams) && Intrinsics.c(this.totalTeams, rankingRow.totalTeams) && Intrinsics.c(this.currentTournamentName, rankingRow.currentTournamentName);
    }

    @Nullable
    public final Integer getBestPosition() {
        return this.bestPosition;
    }

    @Nullable
    public final Long getBestPositionTimestamp() {
        return this.bestPositionTimestamp;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final String getCurrentTournamentName() {
        return this.currentTournamentName;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Event getLastEvent() {
        return this.lastEvent;
    }

    @Nullable
    public final Double getMaxPoints() {
        return this.maxPoints;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Double getNextWinPoints() {
        return this.nextWinPoints;
    }

    @Nullable
    public final Integer getPlayingTeams() {
        return this.playingTeams;
    }

    @Nullable
    public final Double getPoints() {
        return this.points;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final Double getPreviousPoints() {
        return this.previousPoints;
    }

    @Nullable
    public final Integer getPreviousPosition() {
        return this.previousPosition;
    }

    @Nullable
    public final Team getTeam() {
        return this.team;
    }

    @Nullable
    public final Integer getTotalTeams() {
        return this.totalTeams;
    }

    @Nullable
    public final Integer getTournamentsPlayed() {
        return this.tournamentsPlayed;
    }

    @Nullable
    public final UniqueTournament getUniqueTournament() {
        return this.uniqueTournament;
    }

    @Nullable
    public final Integer getYear() {
        return this.year;
    }

    public int hashCode() {
        int a = wv8.a(this.position, Integer.hashCode(this.id) * 31, 31);
        Integer num = this.year;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Team team = this.team;
        int hashCode2 = (hashCode + (team == null ? 0 : team.hashCode())) * 31;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        int hashCode3 = (hashCode2 + (uniqueTournament == null ? 0 : uniqueTournament.hashCode())) * 31;
        Country country = this.country;
        int hashCode4 = (hashCode3 + (country == null ? 0 : country.hashCode())) * 31;
        Event event = this.lastEvent;
        int hashCode5 = (hashCode4 + (event == null ? 0 : event.hashCode())) * 31;
        String str = this.name;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.points;
        int hashCode7 = (hashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.previousPosition;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.bestPosition;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.bestPositionTimestamp;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.tournamentsPlayed;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d2 = this.previousPoints;
        int hashCode12 = (hashCode11 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.nextWinPoints;
        int hashCode13 = (hashCode12 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.maxPoints;
        int hashCode14 = (hashCode13 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num5 = this.playingTeams;
        int hashCode15 = (hashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.totalTeams;
        int hashCode16 = (hashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.currentTournamentName;
        return hashCode16 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.position;
        Integer num = this.year;
        Team team = this.team;
        UniqueTournament uniqueTournament = this.uniqueTournament;
        Country country = this.country;
        Event event = this.lastEvent;
        String str = this.name;
        Double d = this.points;
        Integer num2 = this.previousPosition;
        Integer num3 = this.bestPosition;
        Long l = this.bestPositionTimestamp;
        Integer num4 = this.tournamentsPlayed;
        Double d2 = this.previousPoints;
        Double d3 = this.nextWinPoints;
        Double d4 = this.maxPoints;
        Integer num5 = this.playingTeams;
        Integer num6 = this.totalTeams;
        String str2 = this.currentTournamentName;
        StringBuilder s = lnb.s(i, i2, "RankingRow(id=", ", position=", ", year=");
        s.append(num);
        s.append(", team=");
        s.append(team);
        s.append(", uniqueTournament=");
        s.append(uniqueTournament);
        s.append(", country=");
        s.append(country);
        s.append(", lastEvent=");
        s.append(event);
        s.append(", name=");
        s.append(str);
        s.append(", points=");
        mz1.x(d, num2, ", previousPosition=", ", bestPosition=", s);
        s.append(num3);
        s.append(", bestPositionTimestamp=");
        s.append(l);
        s.append(", tournamentsPlayed=");
        fn0.v(d2, num4, ", previousPoints=", ", nextWinPoints=", s);
        fc6.A(s, d3, ", maxPoints=", d4, ", playingTeams=");
        vxd.r(num5, num6, ", totalTeams=", ", currentTournamentName=", s);
        return mz1.o(s, str2, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/newNetwork/newRankings/RankingRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/newNetwork/newRankings/RankingRow;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return RankingRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public RankingRow(int i, int i2, @Nullable Integer num, @Nullable Team team, @Nullable UniqueTournament uniqueTournament, @Nullable Country country, @Nullable Event event, @Nullable String str, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Long l, @Nullable Integer num4, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str2) {
        this.id = i;
        this.position = i2;
        this.year = num;
        this.team = team;
        this.uniqueTournament = uniqueTournament;
        this.country = country;
        this.lastEvent = event;
        this.name = str;
        this.points = d;
        this.previousPosition = num2;
        this.bestPosition = num3;
        this.bestPositionTimestamp = l;
        this.tournamentsPlayed = num4;
        this.previousPoints = d2;
        this.nextWinPoints = d3;
        this.maxPoints = d4;
        this.playingTeams = num5;
        this.totalTeams = num6;
        this.currentTournamentName = str2;
    }
}
