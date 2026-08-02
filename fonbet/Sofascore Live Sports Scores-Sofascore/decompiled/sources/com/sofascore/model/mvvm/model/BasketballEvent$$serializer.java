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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/BasketballEvent.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/BasketballEvent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/BasketballEvent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/BasketballEvent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BasketballEvent$$serializer implements iw8 {

    @NotNull
    public static final BasketballEvent$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketballEvent$$serializer basketballEvent$$serializer = new BasketballEvent$$serializer();
        INSTANCE = basketballEvent$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.BasketballEvent", basketballEvent$$serializer, 57);
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
        uyeVar.j("eventFilters", false);
        uyeVar.j("bonusInfo", false);
        uyeVar.j("homeTeamSeed", true);
        uyeVar.j("awayTeamSeed", true);
        descriptor = uyeVar;
    }

    private BasketballEvent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = BasketballEvent.$childSerializers;
        uhi uhiVar = uhi.a;
        a7a a7aVar = a7a.a;
        Score$$serializer score$$serializer = Score$$serializer.INSTANCE;
        gz1 gz1Var = gz1.a;
        lkb lkbVar = lkb.a;
        TeamSeasonForm$$serializer teamSeasonForm$$serializer = TeamSeasonForm$$serializer.INSTANCE;
        return new KSerializer[]{Tournament$$serializer.INSTANCE, uhiVar, l98.W(Season$$serializer.INSTANCE), l98.W(Round$$serializer.INSTANCE), Status$$serializer.INSTANCE, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(Venue$$serializer.INSTANCE), l98.W(Referee$$serializer.INSTANCE), joaVarArr[10].getValue(), joaVarArr[11].getValue(), score$$serializer, score$$serializer, l98.W(gz1Var), l98.W(gz1Var), gz1Var, l98.W(gz1Var), uhiVar, lkbVar, l98.W(lkbVar), a7aVar, l98.W(Time$$serializer.INSTANCE), l98.W(EventChanges$$serializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), gz1Var, l98.W(gz1Var), gz1Var, l98.W(Player$$serializer.INSTANCE), l98.W(lkbVar), l98.W((KSerializer) joaVarArr[33].getValue()), l98.W(a7aVar), l98.W(TimeoutsInfo$$serializer.INSTANCE), gz1Var, l98.W((KSerializer) joaVarArr[37].getValue()), a7aVar, l98.W(uhiVar), l98.W(uhiVar), l98.W(EventEditor$$serializer.INSTANCE), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(teamSeasonForm$$serializer), l98.W(teamSeasonForm$$serializer), gz1Var, gz1Var, gz1Var, l98.W(a7aVar), l98.W((KSerializer) joaVarArr[52].getValue()), l98.W((KSerializer) joaVarArr[53].getValue()), l98.W(BonusInfo$$serializer.INSTANCE), l98.W(uhiVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BasketballEvent deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        EventEditor eventEditor;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        int i;
        String str5;
        String str6;
        int i2;
        String str7;
        String str8;
        int i3;
        String str9;
        int i4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = BasketballEvent.$childSerializers;
        long j = 0;
        String str10 = null;
        String str11 = null;
        EventEditor eventEditor2 = null;
        String str12 = null;
        Integer num2 = null;
        BonusInfo bonusInfo = null;
        String str13 = null;
        TeamSeasonForm teamSeasonForm = null;
        int i5 = 0;
        TeamSeasonForm teamSeasonForm2 = null;
        Integer num3 = null;
        Integer num4 = null;
        List list = null;
        Map map = null;
        boolean z = true;
        String str14 = null;
        Tournament tournament = null;
        Season season = null;
        Round round = null;
        Status status = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        boolean z2 = false;
        Venue venue = null;
        String str15 = null;
        Referee referee = null;
        int i6 = 0;
        Team team = null;
        Team team2 = null;
        Score score = null;
        Score score2 = null;
        int i7 = 0;
        Boolean bool = null;
        boolean z3 = false;
        Boolean bool2 = null;
        boolean z4 = false;
        Boolean bool3 = null;
        Long l = null;
        Time time = null;
        EventChanges eventChanges = null;
        Integer num8 = null;
        boolean z5 = false;
        Integer num9 = null;
        int i8 = 0;
        Integer num10 = null;
        String str16 = null;
        Boolean bool4 = null;
        Player player = null;
        Long l2 = null;
        Map map2 = null;
        Integer num11 = null;
        TimeoutsInfo timeoutsInfo = null;
        List list2 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str17 = null;
        String str18 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    String str19 = str11;
                    eventEditor = eventEditor2;
                    Unit unit = Unit.a;
                    z = false;
                    str11 = str19;
                    tournament = tournament;
                    i7 = i7;
                    str10 = str10;
                    num7 = num7;
                    str12 = str12;
                    eventEditor2 = eventEditor;
                case 0:
                    str = str10;
                    eventEditor = eventEditor2;
                    Season season2 = season;
                    Tournament tournament2 = (Tournament) b.w(serialDescriptor, 0, Tournament$$serializer.INSTANCE, tournament);
                    Unit unit2 = Unit.a;
                    num7 = num7;
                    season = season2;
                    str12 = str12;
                    tournament = tournament2;
                    i7 |= 1;
                    str11 = str11;
                    str10 = str;
                    eventEditor2 = eventEditor;
                case 1:
                    String str20 = str11;
                    eventEditor = eventEditor2;
                    String n = b.n(serialDescriptor, 1);
                    Unit unit3 = Unit.a;
                    str14 = n;
                    num7 = num7;
                    str12 = str12;
                    str11 = str20;
                    str10 = str10;
                    i7 |= 2;
                    eventEditor2 = eventEditor;
                case 2:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    num = num7;
                    Season season3 = (Season) b.i(serialDescriptor, 2, Season$$serializer.INSTANCE, season);
                    i = i7 | 4;
                    Unit unit4 = Unit.a;
                    season = season3;
                    num7 = num;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 3:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    num = num7;
                    Round round2 = (Round) b.i(serialDescriptor, 3, Round$$serializer.INSTANCE, round);
                    i = i7 | 8;
                    Unit unit5 = Unit.a;
                    round = round2;
                    num7 = num;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 4:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    num = num7;
                    Status status2 = (Status) b.w(serialDescriptor, 4, Status$$serializer.INSTANCE, status);
                    i = i7 | 16;
                    Unit unit6 = Unit.a;
                    status = status2;
                    num7 = num;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 5:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    num = num7;
                    Integer num12 = (Integer) b.i(serialDescriptor, 5, a7a.a, num5);
                    i = i7 | 32;
                    Unit unit7 = Unit.a;
                    num5 = num12;
                    num7 = num;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 6:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    num = num7;
                    Integer num13 = (Integer) b.i(serialDescriptor, 6, a7a.a, num6);
                    i = i7 | 64;
                    Unit unit8 = Unit.a;
                    num6 = num13;
                    num7 = num;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 7:
                    str = str10;
                    str5 = str11;
                    eventEditor = eventEditor2;
                    str6 = str12;
                    Integer num14 = (Integer) b.i(serialDescriptor, 7, a7a.a, num7);
                    i2 = i7 | 128;
                    Unit unit9 = Unit.a;
                    num7 = num14;
                    str12 = str6;
                    str11 = str5;
                    i7 = i2;
                    str10 = str;
                    eventEditor2 = eventEditor;
                case 8:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    Venue venue2 = (Venue) b.i(serialDescriptor, 8, Venue$$serializer.INSTANCE, venue);
                    i = i7 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    venue = venue2;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 9:
                    str = str10;
                    str5 = str11;
                    eventEditor = eventEditor2;
                    str6 = str12;
                    Referee referee2 = (Referee) b.i(serialDescriptor, 9, Referee$$serializer.INSTANCE, referee);
                    i2 = i7 | 512;
                    Unit unit11 = Unit.a;
                    referee = referee2;
                    str12 = str6;
                    str11 = str5;
                    i7 = i2;
                    str10 = str;
                    eventEditor2 = eventEditor;
                case 10:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    Team team3 = (Team) b.w(serialDescriptor, 10, (dy4) joaVarArr[10].getValue(), team);
                    i = i7 | 1024;
                    Unit unit12 = Unit.a;
                    team = team3;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 11:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    Team team4 = (Team) b.w(serialDescriptor, 11, (dy4) joaVarArr[11].getValue(), team2);
                    i = i7 | a.o;
                    Unit unit13 = Unit.a;
                    team2 = team4;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 12:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    Score score3 = (Score) b.w(serialDescriptor, 12, Score$$serializer.INSTANCE, score);
                    i = i7 | 4096;
                    Unit unit14 = Unit.a;
                    score = score3;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 13:
                    str2 = str10;
                    str3 = str11;
                    eventEditor = eventEditor2;
                    str4 = str12;
                    Score score4 = (Score) b.w(serialDescriptor, 13, Score$$serializer.INSTANCE, score2);
                    i = i7 | 8192;
                    Unit unit15 = Unit.a;
                    score2 = score4;
                    bool = bool;
                    str12 = str4;
                    str10 = str2;
                    i7 = i;
                    str11 = str3;
                    eventEditor2 = eventEditor;
                case 14:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Boolean bool5 = (Boolean) b.i(serialDescriptor, 14, gz1.a, bool);
                    i3 = i7 | 16384;
                    Unit unit16 = Unit.a;
                    bool = bool5;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 15:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Boolean bool6 = (Boolean) b.i(serialDescriptor, 15, gz1.a, bool2);
                    i3 = i7 | 32768;
                    Unit unit17 = Unit.a;
                    bool2 = bool6;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 16:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    z2 = b.B(serialDescriptor, 16);
                    i3 = i7 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 17:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Boolean bool7 = (Boolean) b.i(serialDescriptor, 17, gz1.a, bool3);
                    i3 = i7 | 131072;
                    Unit unit19 = Unit.a;
                    bool3 = bool7;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 18:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    str15 = b.n(serialDescriptor, 18);
                    i3 = i7 | 262144;
                    Unit unit182 = Unit.a;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 19:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    long g = b.g(serialDescriptor, 19);
                    Unit unit20 = Unit.a;
                    i7 |= 524288;
                    str10 = str10;
                    j = g;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 20:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Long l3 = (Long) b.i(serialDescriptor, 20, lkb.a, l);
                    i3 = i7 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit21 = Unit.a;
                    l = l3;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 21:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    i6 = b.l(serialDescriptor, 21);
                    i3 = i7 | 2097152;
                    Unit unit1822 = Unit.a;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 22:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Time time2 = (Time) b.i(serialDescriptor, 22, Time$$serializer.INSTANCE, time);
                    i3 = i7 | 4194304;
                    Unit unit22 = Unit.a;
                    time = time2;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 23:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    EventChanges eventChanges2 = (EventChanges) b.i(serialDescriptor, 23, EventChanges$$serializer.INSTANCE, eventChanges);
                    i3 = i7 | 8388608;
                    Unit unit23 = Unit.a;
                    eventChanges = eventChanges2;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 24:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Integer num15 = (Integer) b.i(serialDescriptor, 24, a7a.a, num8);
                    int i9 = i7 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit24 = Unit.a;
                    i7 = i9;
                    num8 = num15;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 25:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Integer num16 = (Integer) b.i(serialDescriptor, 25, a7a.a, num9);
                    Unit unit25 = Unit.a;
                    i7 |= 33554432;
                    num9 = num16;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 26:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Integer num17 = (Integer) b.i(serialDescriptor, 26, a7a.a, num10);
                    i3 = i7 | 67108864;
                    Unit unit26 = Unit.a;
                    num10 = num17;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 27:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    String str21 = (String) b.i(serialDescriptor, 27, uhi.a, str16);
                    i3 = i7 | 134217728;
                    Unit unit27 = Unit.a;
                    str16 = str21;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 28:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    z3 = b.B(serialDescriptor, 28);
                    i4 = 268435456;
                    i3 = i7 | i4;
                    Unit unit18222 = Unit.a;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 29:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Boolean bool8 = (Boolean) b.i(serialDescriptor, 29, gz1.a, bool4);
                    i3 = i7 | 536870912;
                    Unit unit28 = Unit.a;
                    bool4 = bool8;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 30:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    z4 = b.B(serialDescriptor, 30);
                    i4 = 1073741824;
                    i3 = i7 | i4;
                    Unit unit182222 = Unit.a;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 31:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Player player2 = (Player) b.i(serialDescriptor, 31, Player$$serializer.INSTANCE, player);
                    i3 = i7 | Integer.MIN_VALUE;
                    Unit unit29 = Unit.a;
                    player = player2;
                    i7 = i3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 32:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Long l4 = (Long) b.i(serialDescriptor, 32, lkb.a, l2);
                    i5 |= 1;
                    Unit unit30 = Unit.a;
                    l2 = l4;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 33:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Map map3 = (Map) b.i(serialDescriptor, 33, (dy4) joaVarArr[33].getValue(), map2);
                    i5 |= 2;
                    Unit unit31 = Unit.a;
                    map2 = map3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 34:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    Integer num18 = (Integer) b.i(serialDescriptor, 34, a7a.a, num11);
                    i5 |= 4;
                    Unit unit32 = Unit.a;
                    num11 = num18;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 35:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    TimeoutsInfo timeoutsInfo2 = (TimeoutsInfo) b.i(serialDescriptor, 35, TimeoutsInfo$$serializer.INSTANCE, timeoutsInfo);
                    i5 |= 8;
                    Unit unit33 = Unit.a;
                    timeoutsInfo = timeoutsInfo2;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 36:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    z5 = b.B(serialDescriptor, 36);
                    i5 |= 16;
                    Unit unit34 = Unit.a;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 37:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    List list3 = (List) b.i(serialDescriptor, 37, (dy4) joaVarArr[37].getValue(), list2);
                    i5 |= 32;
                    Unit unit35 = Unit.a;
                    list2 = list3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 38:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    i8 = b.l(serialDescriptor, 38);
                    i5 |= 64;
                    Unit unit342 = Unit.a;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 39:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    String str22 = (String) b.i(serialDescriptor, 39, uhi.a, str17);
                    i5 |= 128;
                    Unit unit36 = Unit.a;
                    str17 = str22;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 40:
                    str7 = str10;
                    str8 = str11;
                    eventEditor = eventEditor2;
                    String str23 = (String) b.i(serialDescriptor, 40, uhi.a, str18);
                    i5 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit37 = Unit.a;
                    str18 = str23;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 41:
                    str7 = str10;
                    str8 = str11;
                    EventEditor eventEditor3 = (EventEditor) b.i(serialDescriptor, 41, EventEditor$$serializer.INSTANCE, eventEditor2);
                    i5 |= 512;
                    Unit unit38 = Unit.a;
                    eventEditor = eventEditor3;
                    str11 = str8;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 42:
                    eventEditor = eventEditor2;
                    str7 = str10;
                    str11 = (String) b.i(serialDescriptor, 42, uhi.a, str11);
                    i5 |= 1024;
                    Unit unit39 = Unit.a;
                    str10 = str7;
                    eventEditor2 = eventEditor;
                case 43:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    str10 = (String) b.i(serialDescriptor, 43, uhi.a, str10);
                    i5 |= a.o;
                    Unit unit40 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 44:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    num2 = (Integer) b.i(serialDescriptor, 44, a7a.a, num2);
                    i5 |= 4096;
                    Unit unit402 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 45:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    num3 = (Integer) b.i(serialDescriptor, 45, a7a.a, num3);
                    i5 |= 8192;
                    Unit unit4022 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 46:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    teamSeasonForm2 = (TeamSeasonForm) b.i(serialDescriptor, 46, TeamSeasonForm$$serializer.INSTANCE, teamSeasonForm2);
                    i5 |= 16384;
                    Unit unit40222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 47:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    teamSeasonForm = (TeamSeasonForm) b.i(serialDescriptor, 47, TeamSeasonForm$$serializer.INSTANCE, teamSeasonForm);
                    i5 |= 32768;
                    Unit unit402222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 48:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    z6 = b.B(serialDescriptor, 48);
                    i5 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit4022222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 49:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    z7 = b.B(serialDescriptor, 49);
                    i5 |= 131072;
                    Unit unit40222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 50:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    z8 = b.B(serialDescriptor, 50);
                    i5 |= 262144;
                    Unit unit402222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 51:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    num4 = (Integer) b.i(serialDescriptor, 51, a7a.a, num4);
                    i5 |= 524288;
                    Unit unit4022222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 52:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    list = (List) b.i(serialDescriptor, 52, (dy4) joaVarArr[52].getValue(), list);
                    i5 |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit40222222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 53:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    map = (Map) b.i(serialDescriptor, 53, (dy4) joaVarArr[53].getValue(), map);
                    i5 |= 2097152;
                    Unit unit402222222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 54:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    bonusInfo = (BonusInfo) b.i(serialDescriptor, 54, BonusInfo$$serializer.INSTANCE, bonusInfo);
                    i5 |= 4194304;
                    Unit unit4022222222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 55:
                    str9 = str11;
                    eventEditor = eventEditor2;
                    str13 = (String) b.i(serialDescriptor, 55, uhi.a, str13);
                    i5 |= 8388608;
                    Unit unit40222222222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                case 56:
                    eventEditor = eventEditor2;
                    str9 = str11;
                    str12 = (String) b.i(serialDescriptor, 56, uhi.a, str12);
                    i5 |= C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit402222222222222 = Unit.a;
                    str11 = str9;
                    eventEditor2 = eventEditor;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str24 = str10;
        EventEditor eventEditor4 = eventEditor2;
        String str25 = str12;
        Tournament tournament3 = tournament;
        Season season4 = season;
        Integer num19 = num7;
        int i10 = i7;
        Boolean bool9 = bool;
        b.c(serialDescriptor);
        String str26 = str16;
        String str27 = str18;
        List list4 = list;
        return new BasketballEvent(i10, i5, tournament3, str14, season4, round, status, num5, num6, num19, venue, referee, team, team2, score, score2, bool9, bool2, z2, bool3, str15, j, l, i6, time, eventChanges, num8, num9, num10, str26, z3, bool4, z4, player, l2, map2, num11, timeoutsInfo, z5, list2, i8, str17, str27, eventEditor4, str11, str24, num2, num3, teamSeasonForm2, teamSeasonForm, z6, z7, z8, num4, list4, map, bonusInfo, str13, str25, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketballEvent value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BasketballEvent.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
