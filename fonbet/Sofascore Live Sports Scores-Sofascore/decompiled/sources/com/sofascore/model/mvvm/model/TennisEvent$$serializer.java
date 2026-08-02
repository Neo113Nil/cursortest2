package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/TennisEvent.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/TennisEvent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/TennisEvent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/TennisEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class TennisEvent$$serializer implements iw8 {

    @NotNull
    public static final TennisEvent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TennisEvent$$serializer tennisEvent$$serializer = new TennisEvent$$serializer();
        INSTANCE = tennisEvent$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.TennisEvent", tennisEvent$$serializer, 59);
        uyeVar.j("tournament", false);
        uyeVar.j("slug", false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("roundInfo", false);
        uyeVar.j("status", false);
        uyeVar.j("winnerCode", false);
        uyeVar.j("aggregatedWinnerCode", false);
        uyeVar.j("attendance", false);
        uyeVar.j("venue", false);
        uyeVar.j(SearchResponseKt.REFEREE_ENTITY, false);
        uyeVar.j("homeTeam", false);
        uyeVar.j("awayTeam", false);
        uyeVar.j("homeScore", false);
        uyeVar.j("awayScore", false);
        uyeVar.j("hasGlobalHighlights", false);
        uyeVar.j("hasEventPlayerStatistics", false);
        uyeVar.j("hasEventPlayerHeatMap", true);
        uyeVar.j("hasXg", false);
        uyeVar.j("customId", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("endTimestamp", false);
        uyeVar.j("id", false);
        uyeVar.j("time", false);
        uyeVar.j("changes", false);
        uyeVar.j("coverage", false);
        uyeVar.j("previousLegEventId", false);
        uyeVar.j("parentEventId", false);
        uyeVar.j("lastPeriod", false);
        uyeVar.j("finalResultOnly", false);
        uyeVar.j("isEditor", false);
        uyeVar.j("isAwarded", true);
        uyeVar.j("manOfMatch", false);
        uyeVar.j("currentPeriodStartTimestamp", false);
        uyeVar.j("periods", false);
        uyeVar.j("defaultPeriodCount", false);
        uyeVar.j("timeouts", false);
        uyeVar.j("hasBet365LiveStream", true);
        uyeVar.j("bet365ExcludedCountryCodes", false);
        uyeVar.j("cupMatchesInRound", true);
        uyeVar.j("statusReason", false);
        uyeVar.j("eventEditorName", false);
        uyeVar.j("eventEditor", false);
        uyeVar.j("eventType", false);
        uyeVar.j("seasonStatisticsType", false);
        uyeVar.j("homeTeamRanking", false);
        uyeVar.j("awayTeamRanking", false);
        uyeVar.j("homeTeamSeasonHistoricalForm", false);
        uyeVar.j("awayTeamSeasonHistoricalForm", false);
        uyeVar.j("crowdsourcingEnabled", true);
        uyeVar.j("crowdsourcingDataDisplayEnabled", true);
        uyeVar.j("crowdsourcingDataDisplayPermanent", true);
        uyeVar.j("streamContentId", false);
        uyeVar.j("streamContentGeoRestrictions", false);
        uyeVar.j("firstToServe", false);
        uyeVar.j("eventFilters", false);
        uyeVar.j("groundType", false);
        uyeVar.j("homeTeamSeed", false);
        uyeVar.j("awayTeamSeed", false);
        uyeVar.j("correctAiInsight", false);
        descriptor = uyeVar;
    }

    private TennisEvent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = TennisEvent.$childSerializers;
        uhi uhiVar = uhi.a;
        a7a a7aVar = a7a.a;
        Score$$serializer score$$serializer = Score$$serializer.INSTANCE;
        gz1 gz1Var = gz1.a;
        lkb lkbVar = lkb.a;
        TeamSeasonForm$$serializer teamSeasonForm$$serializer = TeamSeasonForm$$serializer.INSTANCE;
        return new KSerializer[]{Tournament$$serializer.INSTANCE, uhiVar, l98.W(Season$$serializer.INSTANCE), l98.W(Round$$serializer.INSTANCE), Status$$serializer.INSTANCE, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(Venue$$serializer.INSTANCE), l98.W(Referee$$serializer.INSTANCE), joaVarArr[10].getValue(), joaVarArr[11].getValue(), score$$serializer, score$$serializer, l98.W(gz1Var), l98.W(gz1Var), gz1Var, l98.W(gz1Var), uhiVar, lkbVar, l98.W(lkbVar), a7aVar, l98.W(Time$$serializer.INSTANCE), l98.W(EventChanges$$serializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), gz1Var, l98.W(gz1Var), gz1Var, l98.W(Player$$serializer.INSTANCE), l98.W(lkbVar), l98.W((KSerializer) joaVarArr[33].getValue()), l98.W(a7aVar), l98.W(TimeoutsInfo$$serializer.INSTANCE), gz1Var, l98.W((KSerializer) joaVarArr[37].getValue()), a7aVar, l98.W(uhiVar), l98.W(uhiVar), l98.W(EventEditor$$serializer.INSTANCE), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(teamSeasonForm$$serializer), l98.W(teamSeasonForm$$serializer), gz1Var, gz1Var, gz1Var, l98.W(a7aVar), l98.W((KSerializer) joaVarArr[52].getValue()), l98.W(a7aVar), l98.W((KSerializer) joaVarArr[54].getValue()), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final TennisEvent deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        String str;
        Integer num;
        Boolean bool;
        String str2;
        Integer num2;
        int i;
        String str3;
        Boolean bool2;
        Integer num3;
        int i2;
        String str4;
        Boolean bool3;
        Integer num4;
        int i3;
        int i4;
        int i5;
        String str5;
        String str6;
        Integer num5;
        String str7;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = TennisEvent.$childSerializers;
        long j = 0;
        String str8 = null;
        Boolean bool4 = null;
        String str9 = null;
        String str10 = null;
        Integer num6 = null;
        Map map = null;
        String str11 = null;
        TeamSeasonForm teamSeasonForm = null;
        int i6 = 0;
        TeamSeasonForm teamSeasonForm2 = null;
        Integer num7 = null;
        Integer num8 = null;
        List list = null;
        Integer num9 = null;
        boolean z = true;
        String str12 = null;
        Tournament tournament = null;
        Season season = null;
        Round round = null;
        Status status = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        boolean z2 = false;
        Venue venue = null;
        String str13 = null;
        Referee referee = null;
        int i7 = 0;
        Team team = null;
        Team team2 = null;
        Score score = null;
        Score score2 = null;
        int i8 = 0;
        Boolean bool5 = null;
        boolean z3 = false;
        Boolean bool6 = null;
        boolean z4 = false;
        Boolean bool7 = null;
        Long l = null;
        Time time = null;
        EventChanges eventChanges = null;
        Integer num13 = null;
        boolean z5 = false;
        Integer num14 = null;
        int i9 = 0;
        Integer num15 = null;
        String str14 = null;
        Boolean bool8 = null;
        Player player = null;
        Long l2 = null;
        Map map2 = null;
        Integer num16 = null;
        TimeoutsInfo timeoutsInfo = null;
        List list2 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str15 = null;
        String str16 = null;
        EventEditor eventEditor = null;
        String str17 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    Boolean bool9 = bool4;
                    str = str9;
                    num = num6;
                    Unit unit = Unit.a;
                    z = false;
                    bool4 = bool9;
                    tournament = tournament;
                    i8 = i8;
                    str8 = str8;
                    num6 = num;
                    str9 = str;
                case 0:
                    String str18 = str8;
                    bool = bool4;
                    str = str9;
                    Integer num17 = num6;
                    Tournament tournament2 = (Tournament) b.w(serialDescriptor, 0, Tournament$$serializer.INSTANCE, tournament);
                    Unit unit2 = Unit.a;
                    season = season;
                    num6 = num17;
                    tournament = tournament2;
                    i8 |= 1;
                    str8 = str18;
                    bool4 = bool;
                    str9 = str;
                case 1:
                    Boolean bool10 = bool4;
                    str = str9;
                    num = num6;
                    String n = b.n(serialDescriptor, 1);
                    Unit unit3 = Unit.a;
                    str12 = n;
                    str8 = str8;
                    bool4 = bool10;
                    i8 |= 2;
                    num6 = num;
                    str9 = str;
                case 2:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Season season2 = (Season) b.i(serialDescriptor, 2, Season$$serializer.INSTANCE, season);
                    i = i8 | 4;
                    Unit unit4 = Unit.a;
                    season = season2;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 3:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Round round2 = (Round) b.i(serialDescriptor, 3, Round$$serializer.INSTANCE, round);
                    i = i8 | 8;
                    Unit unit5 = Unit.a;
                    round = round2;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 4:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Status status2 = (Status) b.w(serialDescriptor, 4, Status$$serializer.INSTANCE, status);
                    i = i8 | 16;
                    Unit unit6 = Unit.a;
                    status = status2;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 5:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Integer num18 = (Integer) b.i(serialDescriptor, 5, a7a.a, num10);
                    i = i8 | 32;
                    Unit unit7 = Unit.a;
                    num10 = num18;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 6:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Integer num19 = (Integer) b.i(serialDescriptor, 6, a7a.a, num11);
                    i = i8 | 64;
                    Unit unit8 = Unit.a;
                    num11 = num19;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 7:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Integer num20 = (Integer) b.i(serialDescriptor, 7, a7a.a, num12);
                    i = i8 | 128;
                    Unit unit9 = Unit.a;
                    num12 = num20;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 8:
                    str3 = str8;
                    bool2 = bool4;
                    str = str9;
                    num3 = num6;
                    Venue venue2 = (Venue) b.i(serialDescriptor, 8, Venue$$serializer.INSTANCE, venue);
                    i2 = i8 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    venue = venue2;
                    num6 = num3;
                    bool4 = bool2;
                    i8 = i2;
                    str8 = str3;
                    str9 = str;
                case 9:
                    str3 = str8;
                    bool2 = bool4;
                    str = str9;
                    num3 = num6;
                    Referee referee2 = (Referee) b.i(serialDescriptor, 9, Referee$$serializer.INSTANCE, referee);
                    i2 = i8 | 512;
                    Unit unit11 = Unit.a;
                    referee = referee2;
                    num6 = num3;
                    bool4 = bool2;
                    i8 = i2;
                    str8 = str3;
                    str9 = str;
                case 10:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Team team3 = (Team) b.w(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), team);
                    i = i8 | 1024;
                    Unit unit12 = Unit.a;
                    team = team3;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 11:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Team team4 = (Team) b.w(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), team2);
                    i = i8 | a.o;
                    Unit unit13 = Unit.a;
                    team2 = team4;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 12:
                    str2 = str8;
                    bool = bool4;
                    str = str9;
                    num2 = num6;
                    Score score3 = (Score) b.w(serialDescriptor, 12, Score$$serializer.INSTANCE, score);
                    i = i8 | 4096;
                    Unit unit14 = Unit.a;
                    score = score3;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 13:
                    str2 = str8;
                    bool = bool4;
                    num2 = num6;
                    str = str9;
                    Score score4 = (Score) b.w(serialDescriptor, 13, Score$$serializer.INSTANCE, score2);
                    i = i8 | 8192;
                    Unit unit15 = Unit.a;
                    score2 = score4;
                    bool5 = bool5;
                    str8 = str2;
                    num6 = num2;
                    i8 = i;
                    bool4 = bool;
                    str9 = str;
                case 14:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Boolean bool11 = (Boolean) b.i(serialDescriptor, 14, gz1.a, bool5);
                    i3 = i8 | 16384;
                    Unit unit16 = Unit.a;
                    bool5 = bool11;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 15:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Boolean bool12 = (Boolean) b.i(serialDescriptor, 15, gz1.a, bool6);
                    i3 = i8 | 32768;
                    Unit unit17 = Unit.a;
                    bool6 = bool12;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 16:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    z2 = b.B(serialDescriptor, 16);
                    i4 = i8 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    i8 = i4;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 17:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Boolean bool13 = (Boolean) b.i(serialDescriptor, 17, gz1.a, bool7);
                    i3 = i8 | 131072;
                    Unit unit19 = Unit.a;
                    bool7 = bool13;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 18:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    str13 = b.n(serialDescriptor, 18);
                    i4 = i8 | 262144;
                    Unit unit182 = Unit.a;
                    i8 = i4;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 19:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    j = b.g(serialDescriptor, 19);
                    i4 = i8 | 524288;
                    Unit unit1822 = Unit.a;
                    i8 = i4;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 20:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Long l3 = (Long) b.i(serialDescriptor, 20, lkb.a, l);
                    i3 = i8 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit20 = Unit.a;
                    l = l3;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 21:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    i7 = b.l(serialDescriptor, 21);
                    i4 = i8 | 2097152;
                    Unit unit18222 = Unit.a;
                    i8 = i4;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 22:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Time time2 = (Time) b.i(serialDescriptor, 22, Time$$serializer.INSTANCE, time);
                    i3 = i8 | 4194304;
                    Unit unit21 = Unit.a;
                    time = time2;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 23:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    EventChanges eventChanges2 = (EventChanges) b.i(serialDescriptor, 23, EventChanges$$serializer.INSTANCE, eventChanges);
                    i3 = i8 | 8388608;
                    Unit unit22 = Unit.a;
                    eventChanges = eventChanges2;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 24:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Integer num21 = (Integer) b.i(serialDescriptor, 24, a7a.a, num13);
                    i3 = i8 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit23 = Unit.a;
                    num13 = num21;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 25:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Integer num22 = (Integer) b.i(serialDescriptor, 25, a7a.a, num14);
                    Unit unit24 = Unit.a;
                    i8 |= 33554432;
                    num14 = num22;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 26:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Integer num23 = (Integer) b.i(serialDescriptor, 26, a7a.a, num15);
                    i3 = i8 | 67108864;
                    Unit unit25 = Unit.a;
                    num15 = num23;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 27:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    String str19 = (String) b.i(serialDescriptor, 27, uhi.a, str14);
                    Unit unit26 = Unit.a;
                    i8 |= 134217728;
                    str = str9;
                    str14 = str19;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 28:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    z3 = b.B(serialDescriptor, 28);
                    i5 = 268435456;
                    i4 = i8 | i5;
                    Unit unit182222 = Unit.a;
                    i8 = i4;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 29:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Boolean bool14 = (Boolean) b.i(serialDescriptor, 29, gz1.a, bool8);
                    i3 = i8 | 536870912;
                    Unit unit27 = Unit.a;
                    bool8 = bool14;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 30:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    z4 = b.B(serialDescriptor, 30);
                    i5 = 1073741824;
                    i4 = i8 | i5;
                    Unit unit1822222 = Unit.a;
                    i8 = i4;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 31:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Player player2 = (Player) b.i(serialDescriptor, 31, Player$$serializer.INSTANCE, player);
                    i3 = i8 | Integer.MIN_VALUE;
                    Unit unit28 = Unit.a;
                    player = player2;
                    i8 = i3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 32:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Long l4 = (Long) b.i(serialDescriptor, 32, lkb.a, l2);
                    i6 |= 1;
                    Unit unit29 = Unit.a;
                    l2 = l4;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 33:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Map map3 = (Map) b.i(serialDescriptor, 33, (dy4) joaVarArr[33].getValue(), map2);
                    i6 |= 2;
                    Unit unit30 = Unit.a;
                    map2 = map3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 34:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    Integer num24 = (Integer) b.i(serialDescriptor, 34, a7a.a, num16);
                    i6 |= 4;
                    Unit unit31 = Unit.a;
                    num16 = num24;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 35:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    TimeoutsInfo timeoutsInfo2 = (TimeoutsInfo) b.i(serialDescriptor, 35, TimeoutsInfo$$serializer.INSTANCE, timeoutsInfo);
                    i6 |= 8;
                    Unit unit32 = Unit.a;
                    timeoutsInfo = timeoutsInfo2;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 36:
                    str5 = str8;
                    bool3 = bool4;
                    z5 = b.B(serialDescriptor, 36);
                    i6 |= 16;
                    Unit unit33 = Unit.a;
                    str = str9;
                    str8 = str5;
                    bool4 = bool3;
                    str9 = str;
                case 37:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    List list3 = (List) b.i(serialDescriptor, 37, (dy4) joaVarArr[37].getValue(), list2);
                    i6 |= 32;
                    Unit unit34 = Unit.a;
                    list2 = list3;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 38:
                    str5 = str8;
                    bool3 = bool4;
                    i9 = b.l(serialDescriptor, 38);
                    i6 |= 64;
                    Unit unit332 = Unit.a;
                    str = str9;
                    str8 = str5;
                    bool4 = bool3;
                    str9 = str;
                case 39:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    String str20 = (String) b.i(serialDescriptor, 39, uhi.a, str15);
                    i6 |= 128;
                    Unit unit35 = Unit.a;
                    str15 = str20;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 40:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    String str21 = (String) b.i(serialDescriptor, 40, uhi.a, str16);
                    i6 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit36 = Unit.a;
                    str16 = str21;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 41:
                    str4 = str8;
                    bool3 = bool4;
                    num4 = num6;
                    EventEditor eventEditor2 = (EventEditor) b.i(serialDescriptor, 41, EventEditor$$serializer.INSTANCE, eventEditor);
                    i6 |= 512;
                    Unit unit37 = Unit.a;
                    eventEditor = eventEditor2;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 42:
                    bool3 = bool4;
                    num4 = num6;
                    str4 = str8;
                    String str22 = (String) b.i(serialDescriptor, 42, uhi.a, str17);
                    i6 |= 1024;
                    Unit unit38 = Unit.a;
                    str17 = str22;
                    str = str9;
                    str8 = str4;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 43:
                    bool3 = bool4;
                    num4 = num6;
                    str8 = (String) b.i(serialDescriptor, 43, uhi.a, str8);
                    i6 |= a.o;
                    Unit unit39 = Unit.a;
                    str = str9;
                    num6 = num4;
                    bool4 = bool3;
                    str9 = str;
                case 44:
                    str5 = str8;
                    bool3 = bool4;
                    num6 = (Integer) b.i(serialDescriptor, 44, a7a.a, num6);
                    i6 |= 4096;
                    Unit unit3322 = Unit.a;
                    str = str9;
                    str8 = str5;
                    bool4 = bool3;
                    str9 = str;
                case 45:
                    str6 = str8;
                    num5 = num6;
                    num7 = (Integer) b.i(serialDescriptor, 45, a7a.a, num7);
                    i6 |= 8192;
                    Unit unit40 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 46:
                    str6 = str8;
                    num5 = num6;
                    teamSeasonForm2 = (TeamSeasonForm) b.i(serialDescriptor, 46, TeamSeasonForm$$serializer.INSTANCE, teamSeasonForm2);
                    i6 |= 16384;
                    Unit unit402 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 47:
                    str6 = str8;
                    num5 = num6;
                    teamSeasonForm = (TeamSeasonForm) b.i(serialDescriptor, 47, TeamSeasonForm$$serializer.INSTANCE, teamSeasonForm);
                    i6 |= 32768;
                    Unit unit4022 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 48:
                    str7 = str8;
                    z6 = b.B(serialDescriptor, 48);
                    i6 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit41 = Unit.a;
                    str = str9;
                    str8 = str7;
                    str9 = str;
                case 49:
                    str7 = str8;
                    z7 = b.B(serialDescriptor, 49);
                    i6 |= 131072;
                    Unit unit412 = Unit.a;
                    str = str9;
                    str8 = str7;
                    str9 = str;
                case 50:
                    str7 = str8;
                    z8 = b.B(serialDescriptor, 50);
                    i6 |= 262144;
                    Unit unit4122 = Unit.a;
                    str = str9;
                    str8 = str7;
                    str9 = str;
                case 51:
                    str6 = str8;
                    num5 = num6;
                    num8 = (Integer) b.i(serialDescriptor, 51, a7a.a, num8);
                    i6 |= 524288;
                    Unit unit40222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 52:
                    str6 = str8;
                    num5 = num6;
                    list = (List) b.i(serialDescriptor, 52, (dy4) joaVarArr[52].getValue(), list);
                    i6 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit402222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 53:
                    str6 = str8;
                    num5 = num6;
                    num9 = (Integer) b.i(serialDescriptor, 53, a7a.a, num9);
                    i6 |= 2097152;
                    Unit unit4022222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 54:
                    str6 = str8;
                    num5 = num6;
                    map = (Map) b.i(serialDescriptor, 54, (dy4) joaVarArr[54].getValue(), map);
                    i6 |= 4194304;
                    Unit unit40222222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 55:
                    str6 = str8;
                    num5 = num6;
                    str11 = (String) b.i(serialDescriptor, 55, uhi.a, str11);
                    i6 |= 8388608;
                    Unit unit402222222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 56:
                    str6 = str8;
                    num5 = num6;
                    str10 = (String) b.i(serialDescriptor, 56, uhi.a, str10);
                    i6 |= C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit4022222222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 57:
                    str6 = str8;
                    num5 = num6;
                    str9 = (String) b.i(serialDescriptor, 57, uhi.a, str9);
                    i6 |= 33554432;
                    Unit unit40222222222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                case 58:
                    str6 = str8;
                    num5 = num6;
                    bool4 = (Boolean) b.i(serialDescriptor, 58, gz1.a, bool4);
                    i6 |= 67108864;
                    Unit unit402222222222 = Unit.a;
                    str = str9;
                    str8 = str6;
                    num6 = num5;
                    str9 = str;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str23 = str9;
        Integer num25 = num6;
        Tournament tournament3 = tournament;
        Season season3 = season;
        int i10 = i8;
        Boolean bool15 = bool5;
        b.c(serialDescriptor);
        String str24 = str14;
        String str25 = str16;
        List list4 = list;
        return new TennisEvent(i10, i6, tournament3, str12, season3, round, status, num10, num11, num12, venue, referee, team, team2, score, score2, bool15, bool6, z2, bool7, str13, j, l, i7, time, eventChanges, num13, num14, num15, str24, z3, bool8, z4, player, l2, map2, num16, timeoutsInfo, z5, list2, i9, str15, str25, eventEditor, str17, str8, num25, num7, teamSeasonForm2, teamSeasonForm, z6, z7, z8, num8, list4, num9, map, str11, str10, str23, bool4, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull TennisEvent value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        TennisEvent.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
