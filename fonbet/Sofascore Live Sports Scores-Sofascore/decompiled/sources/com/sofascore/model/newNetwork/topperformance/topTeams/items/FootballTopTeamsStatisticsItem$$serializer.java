package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import defpackage.a7a;
import defpackage.dy4;
import defpackage.h75;
import defpackage.iw8;
import defpackage.joa;
import defpackage.l98;
import defpackage.t5h;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wx4;
import defpackage.yhk;
import defpackage.z8e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/FootballTopTeamsStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FootballTopTeamsStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final FootballTopTeamsStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FootballTopTeamsStatisticsItem$$serializer footballTopTeamsStatisticsItem$$serializer = new FootballTopTeamsStatisticsItem$$serializer();
        INSTANCE = footballTopTeamsStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem", footballTopTeamsStatisticsItem$$serializer, 35);
        uyeVar.j("id", false);
        uyeVar.j("matches", false);
        uyeVar.j("avgRatingVersion", true);
        uyeVar.j("avgRating", false);
        uyeVar.j("goalsScored", false);
        uyeVar.j("goalsConceded", false);
        uyeVar.j("bigChances", false);
        uyeVar.j("bigChancesMissed", false);
        uyeVar.j("hitWoodwork", false);
        uyeVar.j("expectedGoals", false);
        uyeVar.j("expectedGoalsOnTarget", false);
        uyeVar.j("expectedAssists", false);
        uyeVar.j("goalsPrevented", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        uyeVar.j("averageBallPossession", false);
        uyeVar.j("accuratePasses", false);
        uyeVar.j("accurateLongBalls", false);
        uyeVar.j("accurateCrosses", false);
        uyeVar.j("shots", false);
        uyeVar.j("shotsOnTarget", false);
        uyeVar.j("successfulDribbles", false);
        uyeVar.j("tackles", false);
        uyeVar.j("interceptions", false);
        uyeVar.j("clearances", false);
        uyeVar.j("corners", false);
        uyeVar.j("fouls", false);
        uyeVar.j("penaltyGoals", false);
        uyeVar.j("penaltiesTaken", false);
        uyeVar.j("penaltyGoalsConceded", false);
        uyeVar.j("penaltiesCommited", false);
        uyeVar.j("cleanSheets", false);
        uyeVar.j("kilometersCovered", false);
        uyeVar.j("numberOfSprints", false);
        uyeVar.j("titlesWon", false);
        descriptor = uyeVar;
    }

    private FootballTopTeamsStatisticsItem$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr;
        joaVarArr = FootballTopTeamsStatisticsItem.$childSerializers;
        a7a a7aVar = a7a.a;
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, a7aVar, joaVarArr[2].getValue(), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FootballTopTeamsStatisticsItem deserialize(@NotNull Decoder decoder) {
        joa[] joaVarArr;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        int i;
        Integer num7;
        Integer num8;
        Integer num9;
        int i2;
        Integer num10;
        int i3;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        joaVarArr = FootballTopTeamsStatisticsItem.$childSerializers;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Double d = null;
        boolean z = true;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        TeamAverageRatingVersion teamAverageRatingVersion = null;
        Double d2 = null;
        Integer num24 = null;
        Integer num25 = null;
        Integer num26 = null;
        Integer num27 = null;
        Integer num28 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        Integer num29 = null;
        int i9 = 0;
        Integer num30 = null;
        Double d7 = null;
        Integer num31 = null;
        Integer num32 = null;
        Integer num33 = null;
        Integer num34 = null;
        Integer num35 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    Integer num36 = num30;
                    num = num11;
                    num2 = num12;
                    Unit unit = Unit.a;
                    num27 = num27;
                    num14 = num14;
                    num30 = num36;
                    i9 = i9;
                    z = false;
                    num13 = num13;
                    num12 = num2;
                    num11 = num;
                case 0:
                    Integer num37 = num30;
                    num = num11;
                    num2 = num12;
                    Integer num38 = num13;
                    TeamAverageRatingVersion teamAverageRatingVersion2 = teamAverageRatingVersion;
                    int l = b.l(serialDescriptor, 0);
                    Unit unit2 = Unit.a;
                    teamAverageRatingVersion = teamAverageRatingVersion2;
                    num27 = num27;
                    num14 = num14;
                    num13 = num38;
                    num30 = num37;
                    i9 |= 1;
                    i7 = l;
                    num12 = num2;
                    num11 = num;
                case 1:
                    Integer num39 = num30;
                    num = num11;
                    num2 = num12;
                    int l2 = b.l(serialDescriptor, 1);
                    Unit unit3 = Unit.a;
                    i8 = l2;
                    num27 = num27;
                    num14 = num14;
                    num13 = num13;
                    num30 = num39;
                    i9 |= 2;
                    num12 = num2;
                    num11 = num;
                case 2:
                    Integer num40 = num30;
                    num3 = num14;
                    num4 = num27;
                    int i10 = i9;
                    num5 = num40;
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    TeamAverageRatingVersion teamAverageRatingVersion3 = (TeamAverageRatingVersion) b.w(serialDescriptor, 2, (dy4) joaVarArr[2].getValue(), teamAverageRatingVersion);
                    i = i10 | 4;
                    Unit unit4 = Unit.a;
                    teamAverageRatingVersion = teamAverageRatingVersion3;
                    num27 = num4;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 3:
                    Integer num41 = num30;
                    num3 = num14;
                    num4 = num27;
                    int i11 = i9;
                    num5 = num41;
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    Double d8 = (Double) b.i(serialDescriptor, 3, h75.a, d2);
                    i = i11 | 8;
                    Unit unit5 = Unit.a;
                    d2 = d8;
                    num27 = num4;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 4:
                    Integer num42 = num30;
                    num3 = num14;
                    num4 = num27;
                    int i12 = i9;
                    num5 = num42;
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    Integer num43 = (Integer) b.i(serialDescriptor, 4, a7a.a, num24);
                    i = i12 | 16;
                    Unit unit6 = Unit.a;
                    num24 = num43;
                    num27 = num4;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 5:
                    Integer num44 = num30;
                    num3 = num14;
                    num4 = num27;
                    int i13 = i9;
                    num5 = num44;
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    Integer num45 = (Integer) b.i(serialDescriptor, 5, a7a.a, num25);
                    i = i13 | 32;
                    Unit unit7 = Unit.a;
                    num25 = num45;
                    num27 = num4;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 6:
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    int i14 = i9;
                    num5 = num30;
                    num3 = num14;
                    num4 = num27;
                    Integer num46 = (Integer) b.i(serialDescriptor, 6, a7a.a, num26);
                    i = i14 | 64;
                    Unit unit8 = Unit.a;
                    num26 = num46;
                    num27 = num4;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 7:
                    num = num11;
                    num2 = num12;
                    num7 = num13;
                    int i15 = i9;
                    num8 = num30;
                    num9 = num14;
                    Integer num47 = (Integer) b.i(serialDescriptor, 7, a7a.a, num27);
                    i2 = i15 | 128;
                    Unit unit9 = Unit.a;
                    num27 = num47;
                    num14 = num9;
                    num13 = num7;
                    num30 = num8;
                    i9 = i2;
                    num12 = num2;
                    num11 = num;
                case 8:
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    int i16 = i9;
                    num5 = num30;
                    num3 = num14;
                    Integer num48 = (Integer) b.i(serialDescriptor, 8, a7a.a, num28);
                    i = i16 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    num28 = num48;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 9:
                    num = num11;
                    num2 = num12;
                    num7 = num13;
                    int i17 = i9;
                    num8 = num30;
                    num9 = num14;
                    Double d9 = (Double) b.i(serialDescriptor, 9, h75.a, d3);
                    i2 = i17 | 512;
                    Unit unit11 = Unit.a;
                    d3 = d9;
                    num14 = num9;
                    num13 = num7;
                    num30 = num8;
                    i9 = i2;
                    num12 = num2;
                    num11 = num;
                case 10:
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    int i18 = i9;
                    num5 = num30;
                    num3 = num14;
                    Double d10 = (Double) b.i(serialDescriptor, 10, h75.a, d4);
                    i = i18 | 1024;
                    Unit unit12 = Unit.a;
                    d4 = d10;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 11:
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    int i19 = i9;
                    num5 = num30;
                    num3 = num14;
                    Double d11 = (Double) b.i(serialDescriptor, 11, h75.a, d5);
                    i = i19 | a.o;
                    Unit unit13 = Unit.a;
                    d5 = d11;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 12:
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    int i20 = i9;
                    num5 = num30;
                    num3 = num14;
                    Double d12 = (Double) b.i(serialDescriptor, 12, h75.a, d6);
                    i = i20 | 4096;
                    Unit unit14 = Unit.a;
                    d6 = d12;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 13:
                    num = num11;
                    num2 = num12;
                    num6 = num13;
                    int i21 = i9;
                    num5 = num30;
                    num3 = num14;
                    Integer num49 = (Integer) b.i(serialDescriptor, 13, a7a.a, num29);
                    i = i21 | 8192;
                    Unit unit15 = Unit.a;
                    num29 = num49;
                    num14 = num3;
                    num13 = num6;
                    num30 = num5;
                    i9 = i;
                    num12 = num2;
                    num11 = num;
                case 14:
                    num = num11;
                    num2 = num12;
                    num10 = num13;
                    Integer num50 = (Integer) b.i(serialDescriptor, 14, a7a.a, num30);
                    i3 = i9 | 16384;
                    Unit unit16 = Unit.a;
                    num30 = num50;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 15:
                    num = num11;
                    num2 = num12;
                    num10 = num13;
                    Double d13 = (Double) b.i(serialDescriptor, 15, h75.a, d7);
                    i3 = i9 | 32768;
                    Unit unit17 = Unit.a;
                    d7 = d13;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 16:
                    num = num11;
                    num2 = num12;
                    num10 = num13;
                    Integer num51 = (Integer) b.i(serialDescriptor, 16, a7a.a, num31);
                    i3 = i9 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num31 = num51;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 17:
                    num = num11;
                    num2 = num12;
                    num10 = num13;
                    Integer num52 = (Integer) b.i(serialDescriptor, 17, a7a.a, num32);
                    i3 = i9 | 131072;
                    Unit unit19 = Unit.a;
                    num32 = num52;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 18:
                    num = num11;
                    num2 = num12;
                    num10 = num13;
                    Integer num53 = (Integer) b.i(serialDescriptor, 18, a7a.a, num33);
                    i3 = i9 | 262144;
                    Unit unit20 = Unit.a;
                    num33 = num53;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 19:
                    num = num11;
                    num2 = num12;
                    num10 = num13;
                    Integer num54 = (Integer) b.i(serialDescriptor, 19, a7a.a, num34);
                    i3 = i9 | 524288;
                    Unit unit21 = Unit.a;
                    num34 = num54;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 20:
                    num = num11;
                    num2 = num12;
                    num10 = num13;
                    Integer num55 = (Integer) b.i(serialDescriptor, 20, a7a.a, num35);
                    i3 = i9 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    num35 = num55;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 21:
                    num = num11;
                    num2 = num12;
                    num13 = (Integer) b.i(serialDescriptor, 21, a7a.a, num13);
                    Unit unit23 = Unit.a;
                    i9 |= 2097152;
                    num12 = num2;
                    num11 = num;
                case 22:
                    num10 = num13;
                    num = num11;
                    Integer num56 = (Integer) b.i(serialDescriptor, 22, a7a.a, num12);
                    Unit unit24 = Unit.a;
                    i9 |= 4194304;
                    num2 = num56;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 23:
                    num2 = num12;
                    num10 = num13;
                    num11 = (Integer) b.i(serialDescriptor, 23, a7a.a, num11);
                    i4 = 8388608;
                    i3 = i9 | i4;
                    Unit unit25 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 24:
                    num2 = num12;
                    num10 = num13;
                    num15 = (Integer) b.i(serialDescriptor, 24, a7a.a, num15);
                    i4 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i3 = i9 | i4;
                    Unit unit252 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 25:
                    num2 = num12;
                    num10 = num13;
                    num18 = (Integer) b.i(serialDescriptor, 25, a7a.a, num18);
                    i4 = 33554432;
                    i3 = i9 | i4;
                    Unit unit2522 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 26:
                    num2 = num12;
                    num10 = num13;
                    num19 = (Integer) b.i(serialDescriptor, 26, a7a.a, num19);
                    i4 = 67108864;
                    i3 = i9 | i4;
                    Unit unit25222 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 27:
                    num2 = num12;
                    num10 = num13;
                    num17 = (Integer) b.i(serialDescriptor, 27, a7a.a, num17);
                    i4 = 134217728;
                    i3 = i9 | i4;
                    Unit unit252222 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 28:
                    num2 = num12;
                    num10 = num13;
                    num20 = (Integer) b.i(serialDescriptor, 28, a7a.a, num20);
                    i4 = 268435456;
                    i3 = i9 | i4;
                    Unit unit2522222 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 29:
                    num2 = num12;
                    num10 = num13;
                    num21 = (Integer) b.i(serialDescriptor, 29, a7a.a, num21);
                    i4 = 536870912;
                    i3 = i9 | i4;
                    Unit unit25222222 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 30:
                    num2 = num12;
                    num10 = num13;
                    num22 = (Integer) b.i(serialDescriptor, 30, a7a.a, num22);
                    i4 = 1073741824;
                    i3 = i9 | i4;
                    Unit unit252222222 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 31:
                    num2 = num12;
                    num10 = num13;
                    num23 = (Integer) b.i(serialDescriptor, 31, a7a.a, num23);
                    i4 = Integer.MIN_VALUE;
                    i3 = i9 | i4;
                    Unit unit2522222222 = Unit.a;
                    num = num11;
                    i9 = i3;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 32:
                    num2 = num12;
                    num10 = num13;
                    d = (Double) b.i(serialDescriptor, 32, h75.a, d);
                    i5 = i6 | 1;
                    Unit unit26 = Unit.a;
                    num = num11;
                    i6 = i5;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 33:
                    num2 = num12;
                    num10 = num13;
                    num16 = (Integer) b.i(serialDescriptor, 33, a7a.a, num16);
                    i5 = i6 | 2;
                    Unit unit262 = Unit.a;
                    num = num11;
                    i6 = i5;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                case 34:
                    num10 = num13;
                    num2 = num12;
                    num14 = (Integer) b.i(serialDescriptor, 34, a7a.a, num14);
                    i5 = i6 | 4;
                    Unit unit2622 = Unit.a;
                    num = num11;
                    i6 = i5;
                    num13 = num10;
                    num12 = num2;
                    num11 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num57 = num30;
        Integer num58 = num14;
        Integer num59 = num27;
        Integer num60 = num12;
        Integer num61 = num13;
        TeamAverageRatingVersion teamAverageRatingVersion4 = teamAverageRatingVersion;
        b.c(serialDescriptor);
        Integer num62 = num18;
        Double d14 = d;
        Integer num63 = num25;
        Double d15 = d7;
        Integer num64 = num19;
        return new FootballTopTeamsStatisticsItem(i9, i6, i7, i8, teamAverageRatingVersion4, d2, num24, num63, num26, num59, num28, d3, d4, d5, d6, num29, num57, d15, num31, num32, num33, num34, num35, num61, num60, num11, num15, num62, num64, num17, num20, num21, num22, num23, d14, num16, num58, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FootballTopTeamsStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FootballTopTeamsStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
