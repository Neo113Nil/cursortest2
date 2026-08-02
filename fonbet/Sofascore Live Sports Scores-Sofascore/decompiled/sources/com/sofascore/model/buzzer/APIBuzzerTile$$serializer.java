package com.sofascore.model.buzzer;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.cuptree.CupTreeRound;
import com.sofascore.model.cuptree.CupTreeRound$$serializer;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Player$$serializer;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.Transfer;
import com.sofascore.model.mvvm.model.Transfer$$serializer;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.model.mvvm.model.UniqueTournament$$serializer;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.model.network.response.serializers.EventSerializer;
import com.sofascore.model.newNetwork.RankingItem;
import com.sofascore.model.newNetwork.RankingItem$$serializer;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.gz1;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/buzzer/APIBuzzerTile.$serializer", "Liw8;", "Lcom/sofascore/model/buzzer/APIBuzzerTile;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/buzzer/APIBuzzerTile;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/buzzer/APIBuzzerTile;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class APIBuzzerTile$$serializer implements iw8 {

    @NotNull
    public static final APIBuzzerTile$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        APIBuzzerTile$$serializer aPIBuzzerTile$$serializer = new APIBuzzerTile$$serializer();
        INSTANCE = aPIBuzzerTile$$serializer;
        uye uyeVar = new uye("com.sofascore.model.buzzer.APIBuzzerTile", aPIBuzzerTile$$serializer, 33);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("event", false);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, false);
        uyeVar.j("team", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("isHome", false);
        uyeVar.j("reason", false);
        uyeVar.j("reasonSuborder", false);
        uyeVar.j("text", false);
        uyeVar.j("label", false);
        uyeVar.j("labelBackground", false);
        uyeVar.j("imageUrl", false);
        uyeVar.j("imageBackground", false);
        uyeVar.j("overlay", false);
        uyeVar.j("action", false);
        uyeVar.j("actionValue", false);
        uyeVar.j("topStatistics", false);
        uyeVar.j("ranking", false);
        uyeVar.j("position", false);
        uyeVar.j(SearchResponseKt.LEAGUE_ENTITY, false);
        uyeVar.j("introText", false);
        uyeVar.j("introImageUrl", false);
        uyeVar.j("invisibleOn", false);
        uyeVar.j("nextCupRound", false);
        uyeVar.j("winningTeam", false);
        uyeVar.j("race", false);
        uyeVar.j("polePositionWinner", false);
        uyeVar.j(BuzzerConfigResponseKt.INTERESTING_STATISTIC, false);
        uyeVar.j(BuzzerConfigResponseKt.TRANSFER, false);
        uyeVar.j("androidMinVersion", false);
        uyeVar.j("androidMaxVersion", false);
        uyeVar.j("teamOfTheWeekRound", false);
        descriptor = uyeVar;
    }

    private APIBuzzerTile$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = APIBuzzerTile.$childSerializers;
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(EventSerializer.INSTANCE);
        KSerializer W2 = l98.W(Player$$serializer.INSTANCE);
        KSerializer W3 = l98.W((KSerializer) joaVarArr[4].getValue());
        KSerializer W4 = l98.W(h75.a);
        KSerializer W5 = l98.W(gz1.a);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{a7aVar, a7aVar, W, W2, W3, W4, W5, l98.W(uhiVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), a7aVar, l98.W(uhiVar), l98.W(BasketballTopStatistics$$serializer.INSTANCE), l98.W(RankingItem$$serializer.INSTANCE), l98.W(a7aVar), l98.W(UniqueTournament$$serializer.INSTANCE), l98.W(uhiVar), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[23].getValue()), l98.W(CupTreeRound$$serializer.INSTANCE), l98.W((KSerializer) joaVarArr[25].getValue()), l98.W(Race$$serializer.INSTANCE), l98.W((KSerializer) joaVarArr[27].getValue()), l98.W(InterestingStatisticsItem$$serializer.INSTANCE), l98.W(Transfer$$serializer.INSTANCE), l98.W(a7aVar), l98.W(a7aVar), l98.W(TeamOfTheWeekRoundBuzzer$$serializer.INSTANCE)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final APIBuzzerTile deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        CupTreeRound cupTreeRound;
        UniqueTournament uniqueTournament;
        Integer num;
        int i;
        Integer num2;
        List list;
        UniqueTournament uniqueTournament2;
        UniqueTournament uniqueTournament3;
        Integer num3;
        List list2;
        int i2;
        int i3;
        int i4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = APIBuzzerTile.$childSerializers;
        CupTreeRound cupTreeRound2 = null;
        List list3 = null;
        String str = null;
        String str2 = null;
        Team team = null;
        UniqueTournament uniqueTournament4 = null;
        InterestingStatisticsItem interestingStatisticsItem = null;
        Race race = null;
        Team team2 = null;
        Transfer transfer = null;
        Integer num4 = null;
        Integer num5 = null;
        TeamOfTheWeekRoundBuzzer teamOfTheWeekRoundBuzzer = null;
        Integer num6 = null;
        boolean z = true;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        Event event = null;
        Player player = null;
        Team team3 = null;
        int i8 = 0;
        Double d = null;
        Boolean bool = null;
        String str3 = null;
        Integer num7 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i9 = 0;
        Integer num8 = null;
        String str9 = null;
        BasketballTopStatistics basketballTopStatistics = null;
        RankingItem rankingItem = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament = uniqueTournament4;
                    num = num6;
                    i = i9;
                    num2 = num8;
                    list = list3;
                    Unit unit = Unit.a;
                    z = false;
                    list3 = list;
                    num8 = num2;
                    i9 = i;
                    uniqueTournament4 = uniqueTournament;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 0:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament = uniqueTournament4;
                    num = num6;
                    int i10 = i9;
                    num2 = num8;
                    list = list3;
                    int l = b.l(serialDescriptor, 0);
                    i = i10 | 1;
                    Unit unit2 = Unit.a;
                    i6 = l;
                    list3 = list;
                    num8 = num2;
                    i9 = i;
                    uniqueTournament4 = uniqueTournament;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 1:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament = uniqueTournament4;
                    num = num6;
                    int i11 = i9;
                    num2 = num8;
                    int l2 = b.l(serialDescriptor, 1);
                    i = i11 | 2;
                    Unit unit3 = Unit.a;
                    i7 = l2;
                    list3 = list3;
                    num8 = num2;
                    i9 = i;
                    uniqueTournament4 = uniqueTournament;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 2:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i12 = i9;
                    Integer num9 = num8;
                    List list4 = list3;
                    Event event2 = (Event) b.i(serialDescriptor, 2, EventSerializer.INSTANCE, event);
                    int i13 = i12 | 4;
                    Unit unit4 = Unit.a;
                    i9 = i13;
                    list3 = list4;
                    num8 = num9;
                    event = event2;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 3:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i14 = i9;
                    Integer num10 = num8;
                    List list5 = list3;
                    Player player2 = (Player) b.i(serialDescriptor, 3, Player$$serializer.INSTANCE, player);
                    int i15 = i14 | 8;
                    Unit unit5 = Unit.a;
                    i9 = i15;
                    list3 = list5;
                    num8 = num10;
                    player = player2;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 4:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i16 = i9;
                    Integer num11 = num8;
                    List list6 = list3;
                    Team team4 = (Team) b.i(serialDescriptor, 4, (dy4) joaVarArr[4].getValue(), team3);
                    int i17 = i16 | 16;
                    Unit unit6 = Unit.a;
                    i9 = i17;
                    list3 = list6;
                    num8 = num11;
                    team3 = team4;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 5:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament3 = uniqueTournament4;
                    num = num6;
                    int i18 = i9;
                    num3 = num8;
                    list2 = list3;
                    Double d2 = (Double) b.i(serialDescriptor, 5, h75.a, d);
                    i2 = i18 | 32;
                    Unit unit7 = Unit.a;
                    d = d2;
                    list3 = list2;
                    uniqueTournament4 = uniqueTournament3;
                    num8 = num3;
                    i9 = i2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 6:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i19 = i9;
                    Integer num12 = num8;
                    List list7 = list3;
                    Boolean bool2 = (Boolean) b.i(serialDescriptor, 6, gz1.a, bool);
                    int i20 = i19 | 64;
                    Unit unit8 = Unit.a;
                    i9 = i20;
                    list3 = list7;
                    num8 = num12;
                    bool = bool2;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 7:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i21 = i9;
                    Integer num13 = num8;
                    List list8 = list3;
                    String str10 = (String) b.i(serialDescriptor, 7, uhi.a, str3);
                    int i22 = i21 | 128;
                    Unit unit9 = Unit.a;
                    i9 = i22;
                    list3 = list8;
                    num8 = num13;
                    str3 = str10;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 8:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i23 = i9;
                    Integer num14 = num8;
                    List list9 = list3;
                    Integer num15 = (Integer) b.i(serialDescriptor, 8, a7a.a, num7);
                    int i24 = i23 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    i9 = i24;
                    list3 = list9;
                    num8 = num14;
                    num7 = num15;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 9:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament3 = uniqueTournament4;
                    num = num6;
                    int i25 = i9;
                    num3 = num8;
                    list2 = list3;
                    String str11 = (String) b.i(serialDescriptor, 9, uhi.a, str4);
                    i2 = i25 | 512;
                    Unit unit11 = Unit.a;
                    str4 = str11;
                    list3 = list2;
                    uniqueTournament4 = uniqueTournament3;
                    num8 = num3;
                    i9 = i2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 10:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i26 = i9;
                    Integer num16 = num8;
                    List list10 = list3;
                    String str12 = (String) b.i(serialDescriptor, 10, uhi.a, str5);
                    int i27 = i26 | 1024;
                    Unit unit12 = Unit.a;
                    i9 = i27;
                    list3 = list10;
                    num8 = num16;
                    str5 = str12;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 11:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i28 = i9;
                    Integer num17 = num8;
                    List list11 = list3;
                    String str13 = (String) b.i(serialDescriptor, 11, uhi.a, str6);
                    int i29 = i28 | a.o;
                    Unit unit13 = Unit.a;
                    i9 = i29;
                    list3 = list11;
                    num8 = num17;
                    str6 = str13;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 12:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    int i30 = i9;
                    Integer num18 = num8;
                    List list12 = list3;
                    String str14 = (String) b.i(serialDescriptor, 12, uhi.a, str7);
                    int i31 = i30 | 4096;
                    Unit unit14 = Unit.a;
                    i9 = i31;
                    list3 = list12;
                    num8 = num18;
                    str7 = str14;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 13:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    Integer num19 = num8;
                    String str15 = (String) b.i(serialDescriptor, 13, uhi.a, str8);
                    Unit unit15 = Unit.a;
                    i9 |= 8192;
                    list3 = list3;
                    num8 = num19;
                    str8 = str15;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 14:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    Integer num20 = (Integer) b.i(serialDescriptor, 14, a7a.a, num8);
                    i3 = i9 | 16384;
                    Unit unit16 = Unit.a;
                    num8 = num20;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 15:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    i8 = b.l(serialDescriptor, 15);
                    i3 = i9 | 32768;
                    Unit unit17 = Unit.a;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 16:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    String str16 = (String) b.i(serialDescriptor, 16, uhi.a, str9);
                    i3 = i9 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    str9 = str16;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 17:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    BasketballTopStatistics basketballTopStatistics2 = (BasketballTopStatistics) b.i(serialDescriptor, 17, BasketballTopStatistics$$serializer.INSTANCE, basketballTopStatistics);
                    i3 = i9 | 131072;
                    Unit unit19 = Unit.a;
                    basketballTopStatistics = basketballTopStatistics2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 18:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    RankingItem rankingItem2 = (RankingItem) b.i(serialDescriptor, 18, RankingItem$$serializer.INSTANCE, rankingItem);
                    i3 = i9 | 262144;
                    Unit unit20 = Unit.a;
                    rankingItem = rankingItem2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 19:
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament2 = uniqueTournament4;
                    Integer num21 = (Integer) b.i(serialDescriptor, 19, a7a.a, num6);
                    Unit unit21 = Unit.a;
                    i9 |= 524288;
                    num = num21;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 20:
                    num = num6;
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament4 = (UniqueTournament) b.i(serialDescriptor, 20, UniqueTournament$$serializer.INSTANCE, uniqueTournament4);
                    int i32 = i9 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    i9 = i32;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 21:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    str2 = (String) b.i(serialDescriptor, 21, uhi.a, str2);
                    i4 = 2097152;
                    i3 = i9 | i4;
                    Unit unit23 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 22:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    str = (String) b.i(serialDescriptor, 22, uhi.a, str);
                    i4 = 4194304;
                    i3 = i9 | i4;
                    Unit unit232 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 23:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    list3 = (List) b.i(serialDescriptor, 23, (dy4) joaVarArr[23].getValue(), list3);
                    i4 = 8388608;
                    i3 = i9 | i4;
                    Unit unit2322 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 24:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    cupTreeRound2 = (CupTreeRound) b.i(serialDescriptor, 24, CupTreeRound$$serializer.INSTANCE, cupTreeRound2);
                    i4 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i3 = i9 | i4;
                    Unit unit23222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 25:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    team = (Team) b.i(serialDescriptor, 25, (dy4) joaVarArr[25].getValue(), team);
                    i4 = 33554432;
                    i3 = i9 | i4;
                    Unit unit232222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 26:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    race = (Race) b.i(serialDescriptor, 26, Race$$serializer.INSTANCE, race);
                    i4 = 67108864;
                    i3 = i9 | i4;
                    Unit unit2322222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 27:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    team2 = (Team) b.i(serialDescriptor, 27, (dy4) joaVarArr[27].getValue(), team2);
                    i4 = 134217728;
                    i3 = i9 | i4;
                    Unit unit23222222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 28:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    interestingStatisticsItem = (InterestingStatisticsItem) b.i(serialDescriptor, 28, InterestingStatisticsItem$$serializer.INSTANCE, interestingStatisticsItem);
                    i4 = 268435456;
                    i3 = i9 | i4;
                    Unit unit232222222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 29:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    transfer = (Transfer) b.i(serialDescriptor, 29, Transfer$$serializer.INSTANCE, transfer);
                    i4 = 536870912;
                    i3 = i9 | i4;
                    Unit unit2322222222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 30:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    num4 = (Integer) b.i(serialDescriptor, 30, a7a.a, num4);
                    i4 = 1073741824;
                    i3 = i9 | i4;
                    Unit unit23222222222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 31:
                    uniqueTournament2 = uniqueTournament4;
                    num = num6;
                    num5 = (Integer) b.i(serialDescriptor, 31, a7a.a, num5);
                    i4 = Integer.MIN_VALUE;
                    i3 = i9 | i4;
                    Unit unit232222222222 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    i9 = i3;
                    uniqueTournament4 = uniqueTournament2;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                case 32:
                    num = num6;
                    UniqueTournament uniqueTournament5 = uniqueTournament4;
                    teamOfTheWeekRoundBuzzer = (TeamOfTheWeekRoundBuzzer) b.i(serialDescriptor, 32, TeamOfTheWeekRoundBuzzer$$serializer.INSTANCE, teamOfTheWeekRoundBuzzer);
                    Unit unit24 = Unit.a;
                    cupTreeRound = cupTreeRound2;
                    uniqueTournament4 = uniqueTournament5;
                    i5 = 1;
                    num6 = num;
                    cupTreeRound2 = cupTreeRound;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        CupTreeRound cupTreeRound3 = cupTreeRound2;
        UniqueTournament uniqueTournament6 = uniqueTournament4;
        int i33 = i9;
        Integer num22 = num8;
        List list13 = list3;
        Event event3 = event;
        b.c(serialDescriptor);
        return new APIBuzzerTile(i33, i5, i6, i7, event3, player, team3, d, bool, str3, num7, str4, str5, str6, str7, str8, num22, i8, str9, basketballTopStatistics, rankingItem, num6, uniqueTournament6, str2, str, list13, cupTreeRound3, team, race, team2, interestingStatisticsItem, transfer, num4, num5, teamOfTheWeekRoundBuzzer, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull APIBuzzerTile value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        APIBuzzerTile.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
