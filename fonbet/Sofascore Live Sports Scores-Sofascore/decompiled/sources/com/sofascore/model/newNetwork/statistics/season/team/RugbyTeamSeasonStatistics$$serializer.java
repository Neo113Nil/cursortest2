package com.sofascore.model.newNetwork.statistics.season.team;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/team/RugbyTeamSeasonStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RugbyTeamSeasonStatistics$$serializer implements iw8 {

    @NotNull
    public static final RugbyTeamSeasonStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RugbyTeamSeasonStatistics$$serializer rugbyTeamSeasonStatistics$$serializer = new RugbyTeamSeasonStatistics$$serializer();
        INSTANCE = rugbyTeamSeasonStatistics$$serializer;
        uye uyeVar = new uye("RugbyTeamSeasonStatistics", rugbyTeamSeasonStatistics$$serializer, 46);
        uyeVar.j("id", false);
        uyeVar.j("matches", false);
        uyeVar.j("points", false);
        uyeVar.j("tries", false);
        uyeVar.j("penaltyTries", false);
        uyeVar.j("penaltyGoals", false);
        uyeVar.j("penaltyGoalsMissed", false);
        uyeVar.j("conversions", false);
        uyeVar.j("conversionsMissed", false);
        uyeVar.j("dropGoals", false);
        uyeVar.j("passesTotal", false);
        uyeVar.j("passesSuccessful", false);
        uyeVar.j("offloads", false);
        uyeVar.j("carries", false);
        uyeVar.j("cleanBreaks", false);
        uyeVar.j("defendersBeaten", false);
        uyeVar.j("metresMade", false);
        uyeVar.j("handlingError", false);
        uyeVar.j("carriesCrossedGainLine", false);
        uyeVar.j("carriesNotMadeGainLine", false);
        uyeVar.j("postContactMetres", false);
        uyeVar.j("tackles", false);
        uyeVar.j("tacklesTotal", false);
        uyeVar.j("missedTackles", false);
        uyeVar.j("dominantTackles", false);
        uyeVar.j("penDefs", false);
        uyeVar.j("penOffs", false);
        uyeVar.j("scrumsWon", false);
        uyeVar.j("scrumsSuccess", false);
        uyeVar.j("scrumsTotal", false);
        uyeVar.j("lineoutsWon", false);
        uyeVar.j("lineoutsLost", false);
        uyeVar.j("kickMetres", false);
        uyeVar.j("kickFromHand", false);
        uyeVar.j("rucksWon", false);
        uyeVar.j("rucksLost", false);
        uyeVar.j("rucksTotal", false);
        uyeVar.j("ruckArrival", false);
        uyeVar.j("ruckArrivalAttack", false);
        uyeVar.j("ruckArrivalDefence", false);
        uyeVar.j("ruckSpeed03", false);
        uyeVar.j("ruckSpeed36", false);
        uyeVar.j("ruckSpeed6Plus", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        uyeVar.j("penaltyGoalsConceded", false);
        descriptor = uyeVar;
    }

    private RugbyTeamSeasonStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RugbyTeamSeasonStatistics deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        int i;
        Integer num8;
        Integer num9;
        Integer num10;
        int i2;
        Integer num11;
        int i3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        int i4 = 0;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Integer num24 = null;
        boolean z = true;
        int i5 = 0;
        Integer num25 = null;
        Integer num26 = null;
        Integer num27 = null;
        Integer num28 = null;
        Integer num29 = null;
        Integer num30 = null;
        Integer num31 = null;
        Integer num32 = null;
        Integer num33 = null;
        Integer num34 = null;
        Integer num35 = null;
        Integer num36 = null;
        Integer num37 = null;
        int i6 = 0;
        Integer num38 = null;
        Integer num39 = null;
        Integer num40 = null;
        Integer num41 = null;
        Integer num42 = null;
        Integer num43 = null;
        Integer num44 = null;
        Integer num45 = null;
        Integer num46 = null;
        Integer num47 = null;
        Integer num48 = null;
        Integer num49 = null;
        Integer num50 = null;
        Integer num51 = null;
        Integer num52 = null;
        Integer num53 = null;
        Integer num54 = null;
        Integer num55 = null;
        Integer num56 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    Integer num57 = num38;
                    num = num12;
                    num2 = num13;
                    num3 = num14;
                    Unit unit = Unit.a;
                    num31 = num31;
                    num15 = num15;
                    num38 = num57;
                    i6 = i6;
                    z = false;
                    num14 = num3;
                    num13 = num2;
                    num12 = num;
                case 0:
                    Integer num58 = num38;
                    num = num12;
                    num2 = num13;
                    num3 = num14;
                    Integer num59 = num26;
                    i5 = b.l(serialDescriptor, 0);
                    Unit unit2 = Unit.a;
                    num31 = num31;
                    num26 = num59;
                    num15 = num15;
                    num38 = num58;
                    i6 |= 1;
                    num25 = num25;
                    num14 = num3;
                    num13 = num2;
                    num12 = num;
                case 1:
                    Integer num60 = num38;
                    num = num12;
                    num2 = num13;
                    num3 = num14;
                    Integer num61 = (Integer) b.i(serialDescriptor, 1, a7a.a, num25);
                    Unit unit3 = Unit.a;
                    num25 = num61;
                    num31 = num31;
                    num26 = num26;
                    num15 = num15;
                    num38 = num60;
                    i6 |= 2;
                    num14 = num3;
                    num13 = num2;
                    num12 = num;
                case 2:
                    Integer num62 = num38;
                    num4 = num15;
                    num5 = num31;
                    int i7 = i6;
                    num6 = num62;
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    Integer num63 = (Integer) b.i(serialDescriptor, 2, a7a.a, num26);
                    i = i7 | 4;
                    Unit unit4 = Unit.a;
                    num26 = num63;
                    num31 = num5;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 3:
                    Integer num64 = num38;
                    num4 = num15;
                    num5 = num31;
                    int i8 = i6;
                    num6 = num64;
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    Integer num65 = (Integer) b.i(serialDescriptor, 3, a7a.a, num27);
                    i = i8 | 8;
                    Unit unit5 = Unit.a;
                    num27 = num65;
                    num31 = num5;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 4:
                    Integer num66 = num38;
                    num4 = num15;
                    num5 = num31;
                    int i9 = i6;
                    num6 = num66;
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    Integer num67 = (Integer) b.i(serialDescriptor, 4, a7a.a, num28);
                    i = i9 | 16;
                    Unit unit6 = Unit.a;
                    num28 = num67;
                    num31 = num5;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 5:
                    Integer num68 = num38;
                    num4 = num15;
                    num5 = num31;
                    int i10 = i6;
                    num6 = num68;
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    Integer num69 = (Integer) b.i(serialDescriptor, 5, a7a.a, num29);
                    i = i10 | 32;
                    Unit unit7 = Unit.a;
                    num29 = num69;
                    num31 = num5;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 6:
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    int i11 = i6;
                    num6 = num38;
                    num4 = num15;
                    num5 = num31;
                    Integer num70 = (Integer) b.i(serialDescriptor, 6, a7a.a, num30);
                    i = i11 | 64;
                    Unit unit8 = Unit.a;
                    num30 = num70;
                    num31 = num5;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 7:
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    int i12 = i6;
                    num6 = num38;
                    num4 = num15;
                    Integer num71 = (Integer) b.i(serialDescriptor, 7, a7a.a, num31);
                    i = i12 | 128;
                    Unit unit9 = Unit.a;
                    num31 = num71;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 8:
                    num = num12;
                    num2 = num13;
                    num8 = num14;
                    int i13 = i6;
                    num9 = num38;
                    num10 = num15;
                    Integer num72 = (Integer) b.i(serialDescriptor, 8, a7a.a, num32);
                    i2 = i13 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    num32 = num72;
                    num15 = num10;
                    num14 = num8;
                    num38 = num9;
                    i6 = i2;
                    num13 = num2;
                    num12 = num;
                case 9:
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    int i14 = i6;
                    num6 = num38;
                    num4 = num15;
                    Integer num73 = (Integer) b.i(serialDescriptor, 9, a7a.a, num33);
                    i = i14 | 512;
                    Unit unit11 = Unit.a;
                    num33 = num73;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 10:
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    int i15 = i6;
                    num6 = num38;
                    num4 = num15;
                    Integer num74 = (Integer) b.i(serialDescriptor, 10, a7a.a, num34);
                    i = i15 | 1024;
                    Unit unit12 = Unit.a;
                    num34 = num74;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 11:
                    num = num12;
                    num2 = num13;
                    num8 = num14;
                    int i16 = i6;
                    num9 = num38;
                    num10 = num15;
                    Integer num75 = (Integer) b.i(serialDescriptor, 11, a7a.a, num35);
                    i2 = i16 | a.o;
                    Unit unit13 = Unit.a;
                    num35 = num75;
                    num15 = num10;
                    num14 = num8;
                    num38 = num9;
                    i6 = i2;
                    num13 = num2;
                    num12 = num;
                case 12:
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    int i17 = i6;
                    num6 = num38;
                    num4 = num15;
                    Integer num76 = (Integer) b.i(serialDescriptor, 12, a7a.a, num36);
                    i = i17 | 4096;
                    Unit unit14 = Unit.a;
                    num36 = num76;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 13:
                    num = num12;
                    num2 = num13;
                    num7 = num14;
                    int i18 = i6;
                    num6 = num38;
                    num4 = num15;
                    Integer num77 = (Integer) b.i(serialDescriptor, 13, a7a.a, num37);
                    i = i18 | 8192;
                    Unit unit15 = Unit.a;
                    num37 = num77;
                    num15 = num4;
                    num14 = num7;
                    num38 = num6;
                    i6 = i;
                    num13 = num2;
                    num12 = num;
                case 14:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num78 = (Integer) b.i(serialDescriptor, 14, a7a.a, num38);
                    i3 = i6 | 16384;
                    Unit unit16 = Unit.a;
                    num38 = num78;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 15:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num79 = (Integer) b.i(serialDescriptor, 15, a7a.a, num39);
                    i3 = i6 | 32768;
                    Unit unit17 = Unit.a;
                    num39 = num79;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 16:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num80 = (Integer) b.i(serialDescriptor, 16, a7a.a, num40);
                    i3 = i6 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num40 = num80;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 17:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num81 = (Integer) b.i(serialDescriptor, 17, a7a.a, num41);
                    i3 = i6 | 131072;
                    Unit unit19 = Unit.a;
                    num41 = num81;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 18:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num82 = (Integer) b.i(serialDescriptor, 18, a7a.a, num42);
                    i3 = i6 | 262144;
                    Unit unit20 = Unit.a;
                    num42 = num82;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 19:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num83 = (Integer) b.i(serialDescriptor, 19, a7a.a, num43);
                    i3 = i6 | 524288;
                    Unit unit21 = Unit.a;
                    num43 = num83;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 20:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num84 = (Integer) b.i(serialDescriptor, 20, a7a.a, num44);
                    int i19 = i6 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    i6 = i19;
                    num44 = num84;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 21:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num85 = (Integer) b.i(serialDescriptor, 21, a7a.a, num45);
                    Unit unit23 = Unit.a;
                    i6 |= 2097152;
                    num45 = num85;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 22:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num86 = (Integer) b.i(serialDescriptor, 22, a7a.a, num46);
                    i3 = i6 | 4194304;
                    Unit unit24 = Unit.a;
                    num46 = num86;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 23:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num87 = (Integer) b.i(serialDescriptor, 23, a7a.a, num47);
                    i3 = i6 | 8388608;
                    Unit unit25 = Unit.a;
                    num47 = num87;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 24:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num88 = (Integer) b.i(serialDescriptor, 24, a7a.a, num48);
                    i3 = i6 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit26 = Unit.a;
                    num48 = num88;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 25:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num89 = (Integer) b.i(serialDescriptor, 25, a7a.a, num49);
                    i3 = i6 | 33554432;
                    Unit unit27 = Unit.a;
                    num49 = num89;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 26:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num90 = (Integer) b.i(serialDescriptor, 26, a7a.a, num50);
                    i3 = i6 | 67108864;
                    Unit unit28 = Unit.a;
                    num50 = num90;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 27:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num91 = (Integer) b.i(serialDescriptor, 27, a7a.a, num51);
                    i3 = i6 | 134217728;
                    Unit unit29 = Unit.a;
                    num51 = num91;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 28:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num92 = (Integer) b.i(serialDescriptor, 28, a7a.a, num52);
                    i3 = i6 | 268435456;
                    Unit unit30 = Unit.a;
                    num52 = num92;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 29:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num93 = (Integer) b.i(serialDescriptor, 29, a7a.a, num53);
                    i3 = i6 | 536870912;
                    Unit unit31 = Unit.a;
                    num53 = num93;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 30:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num94 = (Integer) b.i(serialDescriptor, 30, a7a.a, num54);
                    i3 = i6 | 1073741824;
                    Unit unit32 = Unit.a;
                    num54 = num94;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 31:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num95 = (Integer) b.i(serialDescriptor, 31, a7a.a, num55);
                    i3 = i6 | Integer.MIN_VALUE;
                    Unit unit33 = Unit.a;
                    num55 = num95;
                    i6 = i3;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 32:
                    num = num12;
                    num2 = num13;
                    num11 = num14;
                    Integer num96 = (Integer) b.i(serialDescriptor, 32, a7a.a, num56);
                    i4 |= 1;
                    Unit unit34 = Unit.a;
                    num56 = num96;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 33:
                    num = num12;
                    num2 = num13;
                    num14 = (Integer) b.i(serialDescriptor, 33, a7a.a, num14);
                    i4 |= 2;
                    Unit unit35 = Unit.a;
                    num13 = num2;
                    num12 = num;
                case 34:
                    num11 = num14;
                    num = num12;
                    Integer num97 = (Integer) b.i(serialDescriptor, 34, a7a.a, num13);
                    i4 |= 4;
                    Unit unit36 = Unit.a;
                    num2 = num97;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 35:
                    num2 = num13;
                    num11 = num14;
                    num12 = (Integer) b.i(serialDescriptor, 35, a7a.a, num12);
                    i4 |= 8;
                    Unit unit37 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 36:
                    num2 = num13;
                    num11 = num14;
                    num15 = (Integer) b.i(serialDescriptor, 36, a7a.a, num15);
                    i4 |= 16;
                    Unit unit372 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 37:
                    num2 = num13;
                    num11 = num14;
                    num18 = (Integer) b.i(serialDescriptor, 37, a7a.a, num18);
                    i4 |= 32;
                    Unit unit3722 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 38:
                    num2 = num13;
                    num11 = num14;
                    num19 = (Integer) b.i(serialDescriptor, 38, a7a.a, num19);
                    i4 |= 64;
                    Unit unit37222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 39:
                    num2 = num13;
                    num11 = num14;
                    num17 = (Integer) b.i(serialDescriptor, 39, a7a.a, num17);
                    i4 |= 128;
                    Unit unit372222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 40:
                    num2 = num13;
                    num11 = num14;
                    num20 = (Integer) b.i(serialDescriptor, 40, a7a.a, num20);
                    i4 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit3722222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 41:
                    num2 = num13;
                    num11 = num14;
                    num21 = (Integer) b.i(serialDescriptor, 41, a7a.a, num21);
                    i4 |= 512;
                    Unit unit37222222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 42:
                    num2 = num13;
                    num11 = num14;
                    num22 = (Integer) b.i(serialDescriptor, 42, a7a.a, num22);
                    i4 |= 1024;
                    Unit unit372222222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 43:
                    num2 = num13;
                    num11 = num14;
                    num23 = (Integer) b.i(serialDescriptor, 43, a7a.a, num23);
                    i4 |= a.o;
                    Unit unit3722222222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 44:
                    num2 = num13;
                    num11 = num14;
                    num24 = (Integer) b.i(serialDescriptor, 44, a7a.a, num24);
                    i4 |= 4096;
                    Unit unit37222222222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                case 45:
                    num11 = num14;
                    num2 = num13;
                    num16 = (Integer) b.i(serialDescriptor, 45, a7a.a, num16);
                    i4 |= 8192;
                    Unit unit372222222222 = Unit.a;
                    num = num12;
                    num14 = num11;
                    num13 = num2;
                    num12 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num98 = num38;
        Integer num99 = num15;
        Integer num100 = num31;
        Integer num101 = num12;
        Integer num102 = num14;
        Integer num103 = num25;
        Integer num104 = num26;
        b.c(serialDescriptor);
        return new RugbyTeamSeasonStatistics(i6, i4, i5, num103, num104, num27, num28, num29, num30, num100, num32, num33, num34, num35, num36, num37, num98, num39, num40, num41, num42, num43, num44, num45, num46, num47, num48, num49, num50, num51, num52, num53, num54, num55, num56, num102, num13, num101, num99, num18, num19, num17, num20, num21, num22, num23, num24, num16, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RugbyTeamSeasonStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RugbyTeamSeasonStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
