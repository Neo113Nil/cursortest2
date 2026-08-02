package com.sofascore.model.mvvm.model;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.U3;
import com.ironsource.Y1;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.SearchResponseKt;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.lkb;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/mvvm/model/Team.$serializer", "Liw8;", "Lcom/sofascore/model/mvvm/model/Team;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/mvvm/model/Team;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/mvvm/model/Team;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class Team$$serializer implements iw8 {

    @NotNull
    public static final Team$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Team$$serializer team$$serializer = new Team$$serializer();
        INSTANCE = team$$serializer;
        uye uyeVar = new uye("com.sofascore.model.mvvm.model.Team", team$$serializer, 40);
        uyeVar.j("id", false);
        uyeVar.j("name", false);
        uyeVar.j("slug", false);
        uyeVar.j("userCount", false);
        uyeVar.j("type", true);
        uyeVar.j("teamColors", true);
        uyeVar.j("nameCode", false);
        uyeVar.j("shortName", false);
        uyeVar.j("subTeam1", false);
        uyeVar.j("subTeam2", false);
        uyeVar.j(InneractiveMediationDefs.KEY_GENDER, false);
        uyeVar.j(SearchResponseKt.SPORT_ENTITY, false);
        uyeVar.j("category", false);
        uyeVar.j("primaryUniqueTournament", false);
        uyeVar.j(SearchResponseKt.MANAGER_ENTITY, false);
        uyeVar.j("playerTeamInfo", false);
        uyeVar.j("motorsportTeamInfo", false);
        uyeVar.j("sportVariant", false);
        uyeVar.j("venue", false);
        uyeVar.j("ranking", false);
        uyeVar.j(Y1.e, true);
        uyeVar.j("national", true);
        uyeVar.j("parentTeam", false);
        uyeVar.j("country", false);
        uyeVar.j("foundationDateTimestamp", false);
        uyeVar.j("championshipsWon", false);
        uyeVar.j("tournament", false);
        uyeVar.j("wdlRecord", false);
        uyeVar.j("teamRankings", false);
        uyeVar.j("capMaximum", false);
        uyeVar.j("luxuryTaxThreshold", false);
        uyeVar.j("signedPlayers", false);
        uyeVar.j("activeCap", false);
        uyeVar.j("totalCap", false);
        uyeVar.j("capSpace", false);
        uyeVar.j("fieldTranslations", false);
        uyeVar.j("timeActive", false);
        uyeVar.j("teamLinks", true);
        uyeVar.j("isRecent", true);
        uyeVar.j("webUrl", true);
        descriptor = uyeVar;
    }

    private Team$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = Team.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        lkb lkbVar = lkb.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        SubTeam$$serializer subTeam$$serializer = SubTeam$$serializer.INSTANCE;
        KSerializer W3 = l98.W(subTeam$$serializer);
        KSerializer W4 = l98.W(subTeam$$serializer);
        KSerializer W5 = l98.W(GenderSerializer.INSTANCE);
        KSerializer W6 = l98.W(Sport$$serializer.INSTANCE);
        KSerializer W7 = l98.W(Category$$serializer.INSTANCE);
        KSerializer W8 = l98.W(UniqueTournament$$serializer.INSTANCE);
        KSerializer W9 = l98.W(Manager$$serializer.INSTANCE);
        KSerializer W10 = l98.W(PlayerTeamInfo$$serializer.INSTANCE);
        KSerializer W11 = l98.W(MotorsportTeamInfo$$serializer.INSTANCE);
        KSerializer W12 = l98.W(a7aVar);
        KSerializer W13 = l98.W(Venue$$serializer.INSTANCE);
        KSerializer W14 = l98.W(a7aVar);
        KSerializer W15 = l98.W((KSerializer) joaVarArr[22].getValue());
        KSerializer W16 = l98.W(Country$$serializer.INSTANCE);
        KSerializer W17 = l98.W(lkbVar);
        KSerializer W18 = l98.W(a7aVar);
        KSerializer W19 = l98.W(Tournament$$serializer.INSTANCE);
        KSerializer W20 = l98.W(Record$$serializer.INSTANCE);
        KSerializer W21 = l98.W((KSerializer) joaVarArr[28].getValue());
        KSerializer W22 = l98.W(a7aVar);
        KSerializer W23 = l98.W(a7aVar);
        KSerializer W24 = l98.W(a7aVar);
        KSerializer W25 = l98.W(a7aVar);
        KSerializer W26 = l98.W(a7aVar);
        KSerializer W27 = l98.W(a7aVar);
        KSerializer W28 = l98.W(FieldTranslations$$serializer.INSTANCE);
        KSerializer W29 = l98.W((KSerializer) joaVarArr[36].getValue());
        KSerializer W30 = l98.W((KSerializer) joaVarArr[37].getValue());
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, uhiVar, uhiVar, lkbVar, a7aVar, TeamColors$$serializer.INSTANCE, W, W2, W3, W4, W5, W6, W7, W8, W9, W10, W11, W12, W13, W14, gz1Var, gz1Var, W15, W16, W17, W18, W19, W20, W21, W22, W23, W24, W25, W26, W27, W28, W29, W30, gz1Var, uhiVar};
    }

    @Override // defpackage.dy4
    @NotNull
    public final Team deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        List list;
        Integer num;
        int i;
        int i2;
        Manager manager;
        List list2;
        Integer num2;
        Manager manager2;
        List list3;
        int i3;
        Integer num3;
        int i4;
        int i5;
        int i6;
        int i7;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = Team.$childSerializers;
        long j = 0;
        List list4 = null;
        List list5 = null;
        FieldTranslations fieldTranslations = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        List list6 = null;
        int i8 = 0;
        Tournament tournament = null;
        Record record = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        int i9 = 0;
        boolean z = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        TeamColors teamColors = null;
        String str3 = null;
        String str4 = null;
        SubTeam subTeam = null;
        SubTeam subTeam2 = null;
        Gender gender = null;
        Sport sport = null;
        boolean z2 = false;
        boolean z3 = false;
        Category category = null;
        UniqueTournament uniqueTournament = null;
        int i11 = 0;
        Manager manager3 = null;
        PlayerTeamInfo playerTeamInfo = null;
        MotorsportTeamInfo motorsportTeamInfo = null;
        Integer num11 = null;
        Venue venue = null;
        Integer num12 = null;
        Team team = null;
        Country country = null;
        Long l = null;
        boolean z4 = false;
        String str5 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    list = list4;
                    num = num5;
                    i = i8;
                    i2 = i11;
                    manager = manager3;
                    list2 = list5;
                    Unit unit = Unit.a;
                    z = false;
                    list5 = list2;
                    manager3 = manager;
                    i11 = i2;
                    num5 = num;
                    i8 = i;
                    list4 = list;
                case 0:
                    list = list4;
                    num = num5;
                    i = i8;
                    int i12 = i11;
                    manager = manager3;
                    list2 = list5;
                    int l2 = b.l(serialDescriptor, 0);
                    i2 = i12 | 1;
                    Unit unit2 = Unit.a;
                    i10 = l2;
                    list5 = list2;
                    manager3 = manager;
                    i11 = i2;
                    num5 = num;
                    i8 = i;
                    list4 = list;
                case 1:
                    list = list4;
                    num = num5;
                    i = i8;
                    int i13 = i11;
                    manager = manager3;
                    String n = b.n(serialDescriptor, 1);
                    i2 = i13 | 2;
                    Unit unit3 = Unit.a;
                    str = n;
                    list5 = list5;
                    manager3 = manager;
                    i11 = i2;
                    num5 = num;
                    i8 = i;
                    list4 = list;
                case 2:
                    list = list4;
                    num = num5;
                    i = i8;
                    int i14 = i11;
                    manager = manager3;
                    String n2 = b.n(serialDescriptor, 2);
                    i2 = i14 | 4;
                    Unit unit4 = Unit.a;
                    str2 = n2;
                    list5 = list5;
                    manager3 = manager;
                    i11 = i2;
                    num5 = num;
                    i8 = i;
                    list4 = list;
                case 3:
                    list = list4;
                    num2 = num5;
                    i = i8;
                    int i15 = i11;
                    manager2 = manager3;
                    list3 = list5;
                    j = b.g(serialDescriptor, 3);
                    i3 = i15 | 8;
                    Unit unit5 = Unit.a;
                    list5 = list3;
                    num5 = num2;
                    manager3 = manager2;
                    i11 = i3;
                    i8 = i;
                    list4 = list;
                case 4:
                    list = list4;
                    num2 = num5;
                    i = i8;
                    int i16 = i11;
                    manager2 = manager3;
                    list3 = list5;
                    i9 = b.l(serialDescriptor, 4);
                    i3 = i16 | 16;
                    Unit unit52 = Unit.a;
                    list5 = list3;
                    num5 = num2;
                    manager3 = manager2;
                    i11 = i3;
                    i8 = i;
                    list4 = list;
                case 5:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    int i17 = i11;
                    Manager manager4 = manager3;
                    List list7 = list5;
                    TeamColors teamColors2 = (TeamColors) b.w(serialDescriptor, 5, TeamColors$$serializer.INSTANCE, teamColors);
                    int i18 = i17 | 32;
                    Unit unit6 = Unit.a;
                    i11 = i18;
                    list5 = list7;
                    manager3 = manager4;
                    teamColors = teamColors2;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 6:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    int i19 = i11;
                    Manager manager5 = manager3;
                    List list8 = list5;
                    String str6 = (String) b.i(serialDescriptor, 6, uhi.a, str3);
                    int i20 = i19 | 64;
                    Unit unit7 = Unit.a;
                    i11 = i20;
                    list5 = list8;
                    manager3 = manager5;
                    str3 = str6;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 7:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    int i21 = i11;
                    Manager manager6 = manager3;
                    List list9 = list5;
                    String str7 = (String) b.i(serialDescriptor, 7, uhi.a, str4);
                    int i22 = i21 | 128;
                    Unit unit8 = Unit.a;
                    i11 = i22;
                    list5 = list9;
                    manager3 = manager6;
                    str4 = str7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 8:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    int i23 = i11;
                    Manager manager7 = manager3;
                    List list10 = list5;
                    SubTeam subTeam3 = (SubTeam) b.i(serialDescriptor, 8, SubTeam$$serializer.INSTANCE, subTeam);
                    int i24 = i23 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit9 = Unit.a;
                    i11 = i24;
                    list5 = list10;
                    manager3 = manager7;
                    subTeam = subTeam3;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 9:
                    list = list4;
                    num2 = num5;
                    i = i8;
                    int i25 = i11;
                    manager2 = manager3;
                    list3 = list5;
                    SubTeam subTeam4 = (SubTeam) b.i(serialDescriptor, 9, SubTeam$$serializer.INSTANCE, subTeam2);
                    i3 = i25 | 512;
                    Unit unit10 = Unit.a;
                    subTeam2 = subTeam4;
                    list5 = list3;
                    num5 = num2;
                    manager3 = manager2;
                    i11 = i3;
                    i8 = i;
                    list4 = list;
                case 10:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    int i26 = i11;
                    Manager manager8 = manager3;
                    List list11 = list5;
                    Gender gender2 = (Gender) b.i(serialDescriptor, 10, GenderSerializer.INSTANCE, gender);
                    int i27 = i26 | 1024;
                    Unit unit11 = Unit.a;
                    i11 = i27;
                    list5 = list11;
                    manager3 = manager8;
                    gender = gender2;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 11:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    int i28 = i11;
                    Manager manager9 = manager3;
                    List list12 = list5;
                    Sport sport2 = (Sport) b.i(serialDescriptor, 11, Sport$$serializer.INSTANCE, sport);
                    int i29 = i28 | a.o;
                    Unit unit12 = Unit.a;
                    i11 = i29;
                    list5 = list12;
                    manager3 = manager9;
                    sport = sport2;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 12:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    int i30 = i11;
                    Manager manager10 = manager3;
                    List list13 = list5;
                    Category category2 = (Category) b.i(serialDescriptor, 12, Category$$serializer.INSTANCE, category);
                    int i31 = i30 | 4096;
                    Unit unit13 = Unit.a;
                    i11 = i31;
                    list5 = list13;
                    manager3 = manager10;
                    category = category2;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 13:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    Manager manager11 = manager3;
                    UniqueTournament uniqueTournament2 = (UniqueTournament) b.i(serialDescriptor, 13, UniqueTournament$$serializer.INSTANCE, uniqueTournament);
                    Unit unit14 = Unit.a;
                    i11 |= 8192;
                    list5 = list5;
                    manager3 = manager11;
                    uniqueTournament = uniqueTournament2;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 14:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    Manager manager12 = (Manager) b.i(serialDescriptor, 14, Manager$$serializer.INSTANCE, manager3);
                    i4 = i11 | 16384;
                    Unit unit15 = Unit.a;
                    manager3 = manager12;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 15:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    PlayerTeamInfo playerTeamInfo2 = (PlayerTeamInfo) b.i(serialDescriptor, 15, PlayerTeamInfo$$serializer.INSTANCE, playerTeamInfo);
                    i4 = i11 | 32768;
                    Unit unit16 = Unit.a;
                    playerTeamInfo = playerTeamInfo2;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 16:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    MotorsportTeamInfo motorsportTeamInfo2 = (MotorsportTeamInfo) b.i(serialDescriptor, 16, MotorsportTeamInfo$$serializer.INSTANCE, motorsportTeamInfo);
                    i4 = i11 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit17 = Unit.a;
                    motorsportTeamInfo = motorsportTeamInfo2;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 17:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    Integer num13 = (Integer) b.i(serialDescriptor, 17, a7a.a, num11);
                    i4 = i11 | 131072;
                    Unit unit18 = Unit.a;
                    num11 = num13;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 18:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    Venue venue2 = (Venue) b.i(serialDescriptor, 18, Venue$$serializer.INSTANCE, venue);
                    i4 = i11 | 262144;
                    Unit unit19 = Unit.a;
                    venue = venue2;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 19:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    Integer num14 = (Integer) b.i(serialDescriptor, 19, a7a.a, num12);
                    i4 = i11 | 524288;
                    Unit unit20 = Unit.a;
                    num12 = num14;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 20:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    z2 = b.B(serialDescriptor, 20);
                    i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i4 = i11 | i5;
                    Unit unit21 = Unit.a;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 21:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    z3 = b.B(serialDescriptor, 21);
                    i5 = 2097152;
                    i4 = i11 | i5;
                    Unit unit212 = Unit.a;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 22:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    Team team2 = (Team) b.i(serialDescriptor, 22, (dy4) joaVarArr[22].getValue(), team);
                    i4 = i11 | 4194304;
                    Unit unit22 = Unit.a;
                    team = team2;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 23:
                    list = list4;
                    num3 = num5;
                    i = i8;
                    Country country2 = (Country) b.i(serialDescriptor, 23, Country$$serializer.INSTANCE, country);
                    i4 = i11 | 8388608;
                    Unit unit23 = Unit.a;
                    country = country2;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 24:
                    list = list4;
                    i = i8;
                    num3 = num5;
                    Long l3 = (Long) b.i(serialDescriptor, 24, lkb.a, l);
                    i4 = i11 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit24 = Unit.a;
                    l = l3;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 25:
                    i = i8;
                    list = list4;
                    num5 = (Integer) b.i(serialDescriptor, 25, a7a.a, num5);
                    Unit unit25 = Unit.a;
                    i11 |= 33554432;
                    i8 = i;
                    list4 = list;
                case 26:
                    num3 = num5;
                    i = i8;
                    tournament = (Tournament) b.i(serialDescriptor, 26, Tournament$$serializer.INSTANCE, tournament);
                    i6 = 67108864;
                    i4 = i11 | i6;
                    Unit unit26 = Unit.a;
                    list = list4;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 27:
                    num3 = num5;
                    i = i8;
                    record = (Record) b.i(serialDescriptor, 27, Record$$serializer.INSTANCE, record);
                    i6 = 134217728;
                    i4 = i11 | i6;
                    Unit unit262 = Unit.a;
                    list = list4;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 28:
                    num3 = num5;
                    i = i8;
                    list6 = (List) b.i(serialDescriptor, 28, (dy4) joaVarArr[28].getValue(), list6);
                    i6 = 268435456;
                    i4 = i11 | i6;
                    Unit unit2622 = Unit.a;
                    list = list4;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 29:
                    num3 = num5;
                    i = i8;
                    num8 = (Integer) b.i(serialDescriptor, 29, a7a.a, num8);
                    i6 = 536870912;
                    i4 = i11 | i6;
                    Unit unit26222 = Unit.a;
                    list = list4;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 30:
                    num3 = num5;
                    i = i8;
                    num9 = (Integer) b.i(serialDescriptor, 30, a7a.a, num9);
                    i6 = 1073741824;
                    i4 = i11 | i6;
                    Unit unit262222 = Unit.a;
                    list = list4;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 31:
                    num3 = num5;
                    i = i8;
                    num10 = (Integer) b.i(serialDescriptor, 31, a7a.a, num10);
                    i6 = Integer.MIN_VALUE;
                    i4 = i11 | i6;
                    Unit unit2622222 = Unit.a;
                    list = list4;
                    i11 = i4;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 32:
                    num3 = num5;
                    num6 = (Integer) b.i(serialDescriptor, 32, a7a.a, num6);
                    i7 = i8 | 1;
                    Unit unit27 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 33:
                    num3 = num5;
                    num7 = (Integer) b.i(serialDescriptor, 33, a7a.a, num7);
                    i7 = i8 | 2;
                    Unit unit272 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 34:
                    num3 = num5;
                    num4 = (Integer) b.i(serialDescriptor, 34, a7a.a, num4);
                    i7 = i8 | 4;
                    Unit unit2722 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 35:
                    num3 = num5;
                    fieldTranslations = (FieldTranslations) b.i(serialDescriptor, 35, FieldTranslations$$serializer.INSTANCE, fieldTranslations);
                    i7 = i8 | 8;
                    Unit unit27222 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 36:
                    num3 = num5;
                    list5 = (List) b.i(serialDescriptor, 36, (dy4) joaVarArr[36].getValue(), list5);
                    i7 = i8 | 16;
                    Unit unit272222 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 37:
                    num3 = num5;
                    list4 = (List) b.i(serialDescriptor, 37, (dy4) joaVarArr[37].getValue(), list4);
                    i7 = i8 | 32;
                    Unit unit2722222 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 38:
                    num3 = num5;
                    z4 = b.B(serialDescriptor, 38);
                    i7 = i8 | 64;
                    Unit unit27222222 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                case 39:
                    num3 = num5;
                    str5 = b.n(serialDescriptor, 39);
                    i7 = i8 | 128;
                    Unit unit272222222 = Unit.a;
                    list = list4;
                    i = i7;
                    num5 = num3;
                    i8 = i;
                    list4 = list;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        List list14 = list4;
        Integer num15 = num5;
        int i32 = i11;
        Manager manager13 = manager3;
        List list15 = list5;
        b.c(serialDescriptor);
        String str8 = str4;
        PlayerTeamInfo playerTeamInfo3 = playerTeamInfo;
        Tournament tournament2 = tournament;
        return new Team(i32, i8, i10, str, str2, j, i9, teamColors, str3, str8, subTeam, subTeam2, gender, sport, category, uniqueTournament, manager13, playerTeamInfo3, motorsportTeamInfo, num11, venue, num12, z2, z3, team, country, l, num15, tournament2, record, list6, num8, num9, num10, num6, num7, num4, fieldTranslations, list15, list14, z4, str5, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Team value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        Team.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
