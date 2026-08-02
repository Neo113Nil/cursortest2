package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.h75;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/player/RugbyPlayerSeasonStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class RugbyPlayerSeasonStatistics$$serializer implements iw8 {

    @NotNull
    public static final RugbyPlayerSeasonStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RugbyPlayerSeasonStatistics$$serializer rugbyPlayerSeasonStatistics$$serializer = new RugbyPlayerSeasonStatistics$$serializer();
        INSTANCE = rugbyPlayerSeasonStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.RugbyPlayerSeasonStatistics", rugbyPlayerSeasonStatistics$$serializer, 39);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("appearances", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("points", false);
        uyeVar.j("tries", false);
        uyeVar.j("carries", false);
        uyeVar.j("minutesPlayed", false);
        uyeVar.j("penaltyGoals", false);
        uyeVar.j("penaltyGoalsMissed", false);
        uyeVar.j("conversions", false);
        uyeVar.j("conversionMissed", false);
        uyeVar.j("dropGoals", false);
        uyeVar.j("passesTotal", false);
        uyeVar.j("passesSuccessful", false);
        uyeVar.j("offloads", false);
        uyeVar.j("cleanBreaks", false);
        uyeVar.j("defendersBeaten", false);
        uyeVar.j("metresMade", false);
        uyeVar.j("handlingError", false);
        uyeVar.j("carriesCrossedGainLine", false);
        uyeVar.j("carriesNotMadeGainLine", false);
        uyeVar.j("postContactMetres", false);
        uyeVar.j("tryAssist", false);
        uyeVar.j("tackles", false);
        uyeVar.j("tacklesTotal", false);
        uyeVar.j("dominantTackles", false);
        uyeVar.j("penDefs", false);
        uyeVar.j("penOffs", false);
        uyeVar.j("lineoutsToOwnPlayer", false);
        uyeVar.j("lineoutsWon", false);
        uyeVar.j("lineoutWonSteal", false);
        uyeVar.j("kickMetres", false);
        uyeVar.j("kicksFromHand", false);
        uyeVar.j("ruckArrival", false);
        uyeVar.j("ruckArrivalAttack", false);
        uyeVar.j("ruckArrivalDefence", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        descriptor = uyeVar;
    }

    private RugbyPlayerSeasonStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, uhi.a, l98.W(a7aVar), l98.W(h75.a), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final RugbyPlayerSeasonStatistics deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        int i;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        int i2;
        int i3;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num10 = null;
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
        boolean z = true;
        int i6 = 0;
        int i7 = 0;
        String str = null;
        Integer num24 = null;
        Double d = null;
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
        int i8 = 0;
        Integer num35 = null;
        Integer num36 = null;
        Integer num37 = null;
        Integer num38 = null;
        Integer num39 = null;
        Integer num40 = null;
        Integer num41 = null;
        Integer num42 = null;
        Integer num43 = null;
        Integer num44 = null;
        Integer num45 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num10;
                    num2 = num16;
                    num3 = num17;
                    i = i8;
                    num4 = num35;
                    num5 = num11;
                    Unit unit = Unit.a;
                    z = false;
                    num11 = num5;
                    num35 = num4;
                    i8 = i;
                    num16 = num2;
                    num17 = num3;
                    num10 = num;
                case 0:
                    num = num10;
                    num2 = num16;
                    num3 = num17;
                    int i9 = i8;
                    num4 = num35;
                    num5 = num11;
                    int l = b.l(serialDescriptor, 0);
                    i = i9 | 1;
                    Unit unit2 = Unit.a;
                    i7 = l;
                    num11 = num5;
                    num35 = num4;
                    i8 = i;
                    num16 = num2;
                    num17 = num3;
                    num10 = num;
                case 1:
                    num = num10;
                    num2 = num16;
                    num3 = num17;
                    int i10 = i8;
                    num4 = num35;
                    String n = b.n(serialDescriptor, 1);
                    i = i10 | 2;
                    Unit unit3 = Unit.a;
                    str = n;
                    num11 = num11;
                    num35 = num4;
                    i8 = i;
                    num16 = num2;
                    num17 = num3;
                    num10 = num;
                case 2:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i11 = i8;
                    Integer num46 = num35;
                    Integer num47 = num11;
                    Integer num48 = (Integer) b.i(serialDescriptor, 2, a7a.a, num24);
                    int i12 = i11 | 4;
                    Unit unit4 = Unit.a;
                    i8 = i12;
                    num11 = num47;
                    num35 = num46;
                    num24 = num48;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 3:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i13 = i8;
                    Integer num49 = num35;
                    Integer num50 = num11;
                    Double d2 = (Double) b.i(serialDescriptor, 3, h75.a, d);
                    int i14 = i13 | 8;
                    Unit unit5 = Unit.a;
                    i8 = i14;
                    num11 = num50;
                    num35 = num49;
                    d = d2;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 4:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i15 = i8;
                    Integer num51 = num35;
                    Integer num52 = num11;
                    Integer num53 = (Integer) b.i(serialDescriptor, 4, a7a.a, num25);
                    int i16 = i15 | 16;
                    Unit unit6 = Unit.a;
                    i8 = i16;
                    num11 = num52;
                    num35 = num51;
                    num25 = num53;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 5:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i17 = i8;
                    Integer num54 = num35;
                    Integer num55 = num11;
                    Integer num56 = (Integer) b.i(serialDescriptor, 5, a7a.a, num26);
                    int i18 = i17 | 32;
                    Unit unit7 = Unit.a;
                    i8 = i18;
                    num11 = num55;
                    num35 = num54;
                    num26 = num56;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 6:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i19 = i8;
                    Integer num57 = num35;
                    Integer num58 = num11;
                    Integer num59 = (Integer) b.i(serialDescriptor, 6, a7a.a, num27);
                    int i20 = i19 | 64;
                    Unit unit8 = Unit.a;
                    i8 = i20;
                    num11 = num58;
                    num35 = num57;
                    num27 = num59;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 7:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i21 = i8;
                    Integer num60 = num35;
                    Integer num61 = num11;
                    Integer num62 = (Integer) b.i(serialDescriptor, 7, a7a.a, num28);
                    int i22 = i21 | 128;
                    Unit unit9 = Unit.a;
                    i8 = i22;
                    num11 = num61;
                    num35 = num60;
                    num28 = num62;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 8:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i23 = i8;
                    Integer num63 = num35;
                    Integer num64 = num11;
                    Integer num65 = (Integer) b.i(serialDescriptor, 8, a7a.a, num29);
                    int i24 = i23 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    i8 = i24;
                    num11 = num64;
                    num35 = num63;
                    num29 = num65;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 9:
                    num = num10;
                    num7 = num16;
                    num3 = num17;
                    int i25 = i8;
                    num8 = num35;
                    num9 = num11;
                    Integer num66 = (Integer) b.i(serialDescriptor, 9, a7a.a, num30);
                    i2 = i25 | 512;
                    Unit unit11 = Unit.a;
                    num30 = num66;
                    num11 = num9;
                    num16 = num7;
                    num35 = num8;
                    i8 = i2;
                    num17 = num3;
                    num10 = num;
                case 10:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i26 = i8;
                    Integer num67 = num35;
                    Integer num68 = num11;
                    Integer num69 = (Integer) b.i(serialDescriptor, 10, a7a.a, num31);
                    int i27 = i26 | 1024;
                    Unit unit12 = Unit.a;
                    i8 = i27;
                    num11 = num68;
                    num35 = num67;
                    num31 = num69;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 11:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i28 = i8;
                    Integer num70 = num35;
                    Integer num71 = num11;
                    Integer num72 = (Integer) b.i(serialDescriptor, 11, a7a.a, num32);
                    int i29 = i28 | a.o;
                    Unit unit13 = Unit.a;
                    i8 = i29;
                    num11 = num71;
                    num35 = num70;
                    num32 = num72;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 12:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    int i30 = i8;
                    Integer num73 = num35;
                    Integer num74 = num11;
                    Integer num75 = (Integer) b.i(serialDescriptor, 12, a7a.a, num33);
                    int i31 = i30 | 4096;
                    Unit unit14 = Unit.a;
                    i8 = i31;
                    num11 = num74;
                    num35 = num73;
                    num33 = num75;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 13:
                    num = num10;
                    num7 = num16;
                    num3 = num17;
                    int i32 = i8;
                    num8 = num35;
                    num9 = num11;
                    Integer num76 = (Integer) b.i(serialDescriptor, 13, a7a.a, num34);
                    i2 = i32 | 8192;
                    Unit unit15 = Unit.a;
                    num34 = num76;
                    num11 = num9;
                    num16 = num7;
                    num35 = num8;
                    i8 = i2;
                    num17 = num3;
                    num10 = num;
                case 14:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num77 = (Integer) b.i(serialDescriptor, 14, a7a.a, num35);
                    i3 = i8 | 16384;
                    Unit unit16 = Unit.a;
                    num35 = num77;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 15:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num78 = (Integer) b.i(serialDescriptor, 15, a7a.a, num36);
                    i3 = i8 | 32768;
                    Unit unit17 = Unit.a;
                    num36 = num78;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 16:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num79 = (Integer) b.i(serialDescriptor, 16, a7a.a, num37);
                    i3 = i8 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num37 = num79;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 17:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num80 = (Integer) b.i(serialDescriptor, 17, a7a.a, num38);
                    i3 = i8 | 131072;
                    Unit unit19 = Unit.a;
                    num38 = num80;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 18:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num81 = (Integer) b.i(serialDescriptor, 18, a7a.a, num39);
                    i3 = i8 | 262144;
                    Unit unit20 = Unit.a;
                    num39 = num81;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 19:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num82 = (Integer) b.i(serialDescriptor, 19, a7a.a, num40);
                    i3 = i8 | 524288;
                    Unit unit21 = Unit.a;
                    num40 = num82;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 20:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num83 = (Integer) b.i(serialDescriptor, 20, a7a.a, num41);
                    i3 = i8 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    num41 = num83;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 21:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num84 = (Integer) b.i(serialDescriptor, 21, a7a.a, num42);
                    i3 = i8 | 2097152;
                    Unit unit23 = Unit.a;
                    num42 = num84;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 22:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num85 = (Integer) b.i(serialDescriptor, 22, a7a.a, num43);
                    i3 = i8 | 4194304;
                    Unit unit24 = Unit.a;
                    num43 = num85;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 23:
                    num = num10;
                    num6 = num16;
                    num3 = num17;
                    Integer num86 = (Integer) b.i(serialDescriptor, 23, a7a.a, num44);
                    i3 = i8 | 8388608;
                    Unit unit25 = Unit.a;
                    num44 = num86;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 24:
                    num = num10;
                    num3 = num17;
                    num6 = num16;
                    Integer num87 = (Integer) b.i(serialDescriptor, 24, a7a.a, num45);
                    i3 = i8 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit26 = Unit.a;
                    num45 = num87;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 25:
                    num = num10;
                    num3 = num17;
                    num16 = (Integer) b.i(serialDescriptor, 25, a7a.a, num16);
                    Unit unit27 = Unit.a;
                    i8 |= 33554432;
                    num17 = num3;
                    num10 = num;
                case 26:
                    num6 = num16;
                    num = num10;
                    Integer num88 = (Integer) b.i(serialDescriptor, 26, a7a.a, num17);
                    Unit unit28 = Unit.a;
                    i8 |= 67108864;
                    num3 = num88;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 27:
                    num6 = num16;
                    num3 = num17;
                    num15 = (Integer) b.i(serialDescriptor, 27, a7a.a, num15);
                    i4 = 134217728;
                    i3 = i8 | i4;
                    Unit unit29 = Unit.a;
                    num = num10;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 28:
                    num6 = num16;
                    num3 = num17;
                    num18 = (Integer) b.i(serialDescriptor, 28, a7a.a, num18);
                    i4 = 268435456;
                    i3 = i8 | i4;
                    Unit unit292 = Unit.a;
                    num = num10;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 29:
                    num6 = num16;
                    num3 = num17;
                    num19 = (Integer) b.i(serialDescriptor, 29, a7a.a, num19);
                    i4 = 536870912;
                    i3 = i8 | i4;
                    Unit unit2922 = Unit.a;
                    num = num10;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 30:
                    num6 = num16;
                    num3 = num17;
                    num20 = (Integer) b.i(serialDescriptor, 30, a7a.a, num20);
                    i4 = 1073741824;
                    i3 = i8 | i4;
                    Unit unit29222 = Unit.a;
                    num = num10;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 31:
                    num6 = num16;
                    num3 = num17;
                    num21 = (Integer) b.i(serialDescriptor, 31, a7a.a, num21);
                    i4 = Integer.MIN_VALUE;
                    i3 = i8 | i4;
                    Unit unit292222 = Unit.a;
                    num = num10;
                    i8 = i3;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 32:
                    num6 = num16;
                    num3 = num17;
                    num22 = (Integer) b.i(serialDescriptor, 32, a7a.a, num22);
                    i5 = i6 | 1;
                    Unit unit30 = Unit.a;
                    num = num10;
                    i6 = i5;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 33:
                    num6 = num16;
                    num3 = num17;
                    num23 = (Integer) b.i(serialDescriptor, 33, a7a.a, num23);
                    i5 = i6 | 2;
                    Unit unit302 = Unit.a;
                    num = num10;
                    i6 = i5;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 34:
                    num6 = num16;
                    num3 = num17;
                    num14 = (Integer) b.i(serialDescriptor, 34, a7a.a, num14);
                    i5 = i6 | 4;
                    Unit unit3022 = Unit.a;
                    num = num10;
                    i6 = i5;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 35:
                    num6 = num16;
                    num3 = num17;
                    num12 = (Integer) b.i(serialDescriptor, 35, a7a.a, num12);
                    i5 = i6 | 8;
                    Unit unit30222 = Unit.a;
                    num = num10;
                    i6 = i5;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 36:
                    num6 = num16;
                    num3 = num17;
                    num11 = (Integer) b.i(serialDescriptor, 36, a7a.a, num11);
                    i5 = i6 | 16;
                    Unit unit302222 = Unit.a;
                    num = num10;
                    i6 = i5;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 37:
                    num6 = num16;
                    num3 = num17;
                    num10 = (Integer) b.i(serialDescriptor, 37, a7a.a, num10);
                    i5 = i6 | 32;
                    Unit unit3022222 = Unit.a;
                    num = num10;
                    i6 = i5;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                case 38:
                    num6 = num16;
                    num3 = num17;
                    num13 = (Integer) b.i(serialDescriptor, 38, a7a.a, num13);
                    i5 = i6 | 64;
                    Unit unit30222222 = Unit.a;
                    num = num10;
                    i6 = i5;
                    num16 = num6;
                    num17 = num3;
                    num10 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num89 = num10;
        int i33 = i8;
        Integer num90 = num35;
        Integer num91 = num11;
        Integer num92 = num24;
        b.c(serialDescriptor);
        Integer num93 = num28;
        Integer num94 = num38;
        Integer num95 = num18;
        return new RugbyPlayerSeasonStatistics(i33, i6, i7, str, num92, d, num25, num26, num27, num93, num29, num30, num31, num32, num33, num34, num90, num36, num37, num94, num39, num40, num41, num42, num43, num44, num45, num16, num17, num15, num95, num19, num20, num21, num22, num23, num14, num12, num91, num89, num13, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RugbyPlayerSeasonStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        RugbyPlayerSeasonStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
