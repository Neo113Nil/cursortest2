package com.sofascore.model.fantasy;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Category$$serializer;
import com.sofascore.model.mvvm.model.Season;
import com.sofascore.model.mvvm.model.Season$$serializer;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.newNetwork.TeamOfTheWeekRoundsResponseKt;
import defpackage.a7a;
import defpackage.c88;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/fantasy/FantasyCompetition.$serializer", "Liw8;", "Lcom/sofascore/model/fantasy/FantasyCompetition;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/fantasy/FantasyCompetition;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/fantasy/FantasyCompetition;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FantasyCompetition$$serializer implements iw8 {

    @NotNull
    public static final FantasyCompetition$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FantasyCompetition$$serializer fantasyCompetition$$serializer = new FantasyCompetition$$serializer();
        INSTANCE = fantasyCompetition$$serializer;
        uye uyeVar = new uye("com.sofascore.model.fantasy.FantasyCompetition", fantasyCompetition$$serializer, 33);
        uyeVar.j("id", false);
        uyeVar.j("type", true);
        uyeVar.j("name", false);
        uyeVar.j("scoreUpdatedAtTimestamp", false);
        uyeVar.j("sponsor", false);
        uyeVar.j("prize", false);
        uyeVar.j("rules", false);
        uyeVar.j("currentRound", false);
        uyeVar.j("nextRound", false);
        uyeVar.j("previousRound", false);
        uyeVar.j("totalPlayers", false);
        uyeVar.j("roundCount", false);
        uyeVar.j("currentRoundSequence", false);
        uyeVar.j("averageScore", false);
        uyeVar.j(StatusKt.STATUS_FINISHED, false);
        uyeVar.j("isAlpha", false);
        uyeVar.j("countries", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        uyeVar.j("category", false);
        uyeVar.j("official", false);
        uyeVar.j("officialPartnerName", false);
        uyeVar.j("officialAssetsRestricted", false);
        uyeVar.j("globalLeagueId", false);
        uyeVar.j(TeamOfTheWeekRoundsResponseKt.TOTW_SEASON, false);
        uyeVar.j("tripleCaptainAllowed", false);
        uyeVar.j("tripleCaptainRenewalSequence", false);
        uyeVar.j("wildcardAllowed", false);
        uyeVar.j("wildcardRenewalSequence", false);
        uyeVar.j("freeHitAllowed", false);
        uyeVar.j("freeHitRenewalSequence", false);
        uyeVar.j("startTimestamp", false);
        uyeVar.j("endTimestamp", false);
        uyeVar.j("competitionColor", false);
        descriptor = uyeVar;
    }

    private FantasyCompetition$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FantasyCompetition.$childSerializers;
        a7a a7aVar = a7a.a;
        uhi uhiVar = uhi.a;
        lkb lkbVar = lkb.a;
        FantasyRound$$serializer fantasyRound$$serializer = FantasyRound$$serializer.INSTANCE;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, joaVarArr[1].getValue(), uhiVar, l98.W(lkbVar), l98.W(uhiVar), uhiVar, uhiVar, fantasyRound$$serializer, l98.W(fantasyRound$$serializer), l98.W(fantasyRound$$serializer), lkbVar, a7aVar, a7aVar, l98.W(c88.a), l98.W(gz1Var), gz1Var, l98.W((KSerializer) joaVarArr[16].getValue()), l98.W(UniqueTournament$$serializer.INSTANCE), Category$$serializer.INSTANCE, gz1Var, l98.W(uhiVar), gz1Var, l98.W(a7aVar), l98.W(Season$$serializer.INSTANCE), gz1Var, l98.W(a7aVar), gz1Var, l98.W(a7aVar), gz1Var, l98.W(a7aVar), lkbVar, lkbVar, l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FantasyCompetition deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        List list;
        Float f;
        FantasyRound fantasyRound;
        int i;
        FantasyRound fantasyRound2;
        Float f2;
        int i2;
        int i3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FantasyCompetition.$childSerializers;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        List list2 = null;
        Boolean bool = null;
        Float f3 = null;
        FantasyRound fantasyRound3 = null;
        UniqueTournament uniqueTournament = null;
        Integer num = null;
        String str = null;
        int i4 = 0;
        Category category = null;
        String str2 = null;
        Season season = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str3 = null;
        String str4 = null;
        int i5 = 1;
        boolean z = true;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z2 = false;
        String str5 = null;
        FantasyCompetitionType fantasyCompetitionType = null;
        Long l = null;
        boolean z3 = false;
        String str6 = null;
        boolean z4 = false;
        FantasyRound fantasyRound4 = null;
        FantasyRound fantasyRound5 = null;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    list = list2;
                    f = f3;
                    fantasyRound = fantasyRound3;
                    i = i5;
                    Unit unit = Unit.a;
                    z = false;
                    fantasyRound3 = fantasyRound;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 0:
                    list = list2;
                    f = f3;
                    fantasyRound = fantasyRound3;
                    i = i5;
                    FantasyCompetitionType fantasyCompetitionType2 = fantasyCompetitionType;
                    i9 = b.l(serialDescriptor, 0);
                    i4 |= 1;
                    Unit unit2 = Unit.a;
                    fantasyCompetitionType = fantasyCompetitionType2;
                    fantasyRound3 = fantasyRound;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 1:
                    list = list2;
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    dy4 dy4Var = (dy4) joaVarArr[i5].getValue();
                    i = i5;
                    FantasyCompetitionType fantasyCompetitionType3 = (FantasyCompetitionType) b.w(serialDescriptor, i, dy4Var, fantasyCompetitionType);
                    i4 |= 2;
                    Unit unit3 = Unit.a;
                    fantasyCompetitionType = fantasyCompetitionType3;
                    l = l;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 2:
                    list = list2;
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    String n = b.n(serialDescriptor, 2);
                    i4 |= 4;
                    Unit unit4 = Unit.a;
                    str5 = n;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 3:
                    list = list2;
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    Long l2 = (Long) b.i(serialDescriptor, 3, lkb.a, l);
                    i4 |= 8;
                    Unit unit5 = Unit.a;
                    l = l2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 4:
                    list = list2;
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    String str7 = (String) b.i(serialDescriptor, 4, uhi.a, str6);
                    i4 |= 16;
                    Unit unit6 = Unit.a;
                    str6 = str7;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 5:
                    list = list2;
                    f = f3;
                    str3 = b.n(serialDescriptor, 5);
                    i4 |= 32;
                    Unit unit7 = Unit.a;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 6:
                    list = list2;
                    f = f3;
                    str4 = b.n(serialDescriptor, 6);
                    i4 |= 64;
                    Unit unit72 = Unit.a;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 7:
                    list = list2;
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    FantasyRound fantasyRound6 = (FantasyRound) b.w(serialDescriptor, 7, FantasyRound$$serializer.INSTANCE, fantasyRound4);
                    i4 |= 128;
                    Unit unit8 = Unit.a;
                    fantasyRound4 = fantasyRound6;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 8:
                    list = list2;
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    FantasyRound fantasyRound7 = (FantasyRound) b.i(serialDescriptor, 8, FantasyRound$$serializer.INSTANCE, fantasyRound5);
                    i4 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit9 = Unit.a;
                    fantasyRound5 = fantasyRound7;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 9:
                    list = list2;
                    f = f3;
                    fantasyRound3 = (FantasyRound) b.i(serialDescriptor, 9, FantasyRound$$serializer.INSTANCE, fantasyRound3);
                    i4 |= 512;
                    Unit unit10 = Unit.a;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 10:
                    list = list2;
                    Float f4 = f3;
                    fantasyRound2 = fantasyRound3;
                    long g = b.g(serialDescriptor, 10);
                    i4 |= 1024;
                    Unit unit11 = Unit.a;
                    f = f4;
                    j = g;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 11:
                    list = list2;
                    f2 = f3;
                    i6 = b.l(serialDescriptor, 11);
                    i4 |= a.o;
                    Unit unit12 = Unit.a;
                    f = f2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 12:
                    list = list2;
                    f2 = f3;
                    i7 = b.l(serialDescriptor, 12);
                    i4 |= 4096;
                    Unit unit122 = Unit.a;
                    f = f2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 13:
                    fantasyRound2 = fantasyRound3;
                    list = list2;
                    Float f5 = (Float) b.i(serialDescriptor, 13, c88.a, f3);
                    i4 |= 8192;
                    Unit unit13 = Unit.a;
                    f = f5;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 14:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    bool = (Boolean) b.i(serialDescriptor, 14, gz1.a, bool);
                    i4 |= 16384;
                    Unit unit14 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 15:
                    f = f3;
                    z2 = b.B(serialDescriptor, 15);
                    i2 = 32768;
                    i4 |= i2;
                    Unit unit15 = Unit.a;
                    list = list2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 16:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    list2 = (List) b.i(serialDescriptor, 16, (dy4) joaVarArr[16].getValue(), list2);
                    i3 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i4 |= i3;
                    Unit unit142 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 17:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    uniqueTournament = (UniqueTournament) b.i(serialDescriptor, 17, UniqueTournament$$serializer.INSTANCE, uniqueTournament);
                    i3 = 131072;
                    i4 |= i3;
                    Unit unit1422 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 18:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    category = (Category) b.w(serialDescriptor, 18, Category$$serializer.INSTANCE, category);
                    i3 = 262144;
                    i4 |= i3;
                    Unit unit14222 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 19:
                    f = f3;
                    z3 = b.B(serialDescriptor, 19);
                    i2 = 524288;
                    i4 |= i2;
                    Unit unit152 = Unit.a;
                    list = list2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 20:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    str2 = (String) b.i(serialDescriptor, 20, uhi.a, str2);
                    i3 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i4 |= i3;
                    Unit unit142222 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 21:
                    f = f3;
                    z4 = b.B(serialDescriptor, 21);
                    i2 = 2097152;
                    i4 |= i2;
                    Unit unit1522 = Unit.a;
                    list = list2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 22:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    num2 = (Integer) b.i(serialDescriptor, 22, a7a.a, num2);
                    i3 = 4194304;
                    i4 |= i3;
                    Unit unit1422222 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 23:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    season = (Season) b.i(serialDescriptor, 23, Season$$serializer.INSTANCE, season);
                    i3 = 8388608;
                    i4 |= i3;
                    Unit unit14222222 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 24:
                    f = f3;
                    z5 = b.B(serialDescriptor, 24);
                    i2 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i4 |= i2;
                    Unit unit15222 = Unit.a;
                    list = list2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 25:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    num3 = (Integer) b.i(serialDescriptor, 25, a7a.a, num3);
                    i3 = 33554432;
                    i4 |= i3;
                    Unit unit142222222 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 26:
                    f = f3;
                    z6 = b.B(serialDescriptor, 26);
                    i2 = 67108864;
                    i4 |= i2;
                    Unit unit152222 = Unit.a;
                    list = list2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 27:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    num4 = (Integer) b.i(serialDescriptor, 27, a7a.a, num4);
                    i3 = 134217728;
                    i4 |= i3;
                    Unit unit1422222222 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 28:
                    f = f3;
                    z7 = b.B(serialDescriptor, 28);
                    i2 = 268435456;
                    i4 |= i2;
                    Unit unit1522222 = Unit.a;
                    list = list2;
                    i = i5;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 29:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    num = (Integer) b.i(serialDescriptor, 29, a7a.a, num);
                    i3 = 536870912;
                    i4 |= i3;
                    Unit unit14222222222 = Unit.a;
                    list = list2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 30:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    long g2 = b.g(serialDescriptor, 30);
                    i4 |= 1073741824;
                    Unit unit16 = Unit.a;
                    list = list2;
                    j2 = g2;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 31:
                    f = f3;
                    fantasyRound2 = fantasyRound3;
                    long g3 = b.g(serialDescriptor, 31);
                    i4 |= Integer.MIN_VALUE;
                    Unit unit17 = Unit.a;
                    list = list2;
                    j3 = g3;
                    i = i5;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                case 32:
                    fantasyRound2 = fantasyRound3;
                    f = f3;
                    str = (String) b.i(serialDescriptor, 32, uhi.a, str);
                    Unit unit18 = Unit.a;
                    list = list2;
                    i = i5;
                    i8 = i;
                    fantasyRound3 = fantasyRound2;
                    i5 = i;
                    f3 = f;
                    list2 = list;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Float f6 = f3;
        FantasyRound fantasyRound8 = fantasyRound3;
        FantasyCompetitionType fantasyCompetitionType4 = fantasyCompetitionType;
        Long l3 = l;
        b.c(serialDescriptor);
        Integer num5 = num4;
        return new FantasyCompetition(i4, i8, i9, fantasyCompetitionType4, str5, l3, str6, str3, str4, fantasyRound4, fantasyRound5, fantasyRound8, j, i6, i7, f6, bool, z2, list2, uniqueTournament, category, z3, str2, z4, num2, season, z5, num3, z6, num5, z7, num, j2, j3, str, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FantasyCompetition value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FantasyCompetition.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
