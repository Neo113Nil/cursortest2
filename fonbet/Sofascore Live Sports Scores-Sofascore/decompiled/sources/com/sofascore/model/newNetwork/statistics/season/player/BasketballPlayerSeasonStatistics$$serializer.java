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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/player/BasketballPlayerSeasonStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BasketballPlayerSeasonStatistics$$serializer implements iw8 {

    @NotNull
    public static final BasketballPlayerSeasonStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketballPlayerSeasonStatistics$$serializer basketballPlayerSeasonStatistics$$serializer = new BasketballPlayerSeasonStatistics$$serializer();
        INSTANCE = basketballPlayerSeasonStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.BasketballPlayerSeasonStatistics", basketballPlayerSeasonStatistics$$serializer, 39);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("appearances", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("totalRating", false);
        uyeVar.j("countRating", false);
        uyeVar.j("secondsPlayed", false);
        uyeVar.j("points", false);
        uyeVar.j("twoPointsMade", false);
        uyeVar.j("twoPointAttempts", false);
        uyeVar.j("threePointsMade", false);
        uyeVar.j("threePointAttempts", false);
        uyeVar.j("freeThrowsMade", false);
        uyeVar.j("freeThrowAttempts", false);
        uyeVar.j("fieldGoalsMade", false);
        uyeVar.j("fieldGoalAttempts", false);
        uyeVar.j("rebounds", false);
        uyeVar.j("defensiveRebounds", false);
        uyeVar.j("offensiveRebounds", false);
        uyeVar.j("turnovers", false);
        uyeVar.j("blocks", false);
        uyeVar.j("personalFouls", false);
        uyeVar.j("assists", false);
        uyeVar.j("steals", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("pir", false);
        uyeVar.j("fieldGoalsPercentage", false);
        uyeVar.j("freeThrowsPercentage", false);
        uyeVar.j("threePointsPercentage", false);
        uyeVar.j("twoPointsPercentage", false);
        uyeVar.j("doubleDoubles", false);
        uyeVar.j("tripleDoubles", false);
        uyeVar.j("assistTurnoverRatio", false);
        uyeVar.j("trueShootingPercentage", false);
        uyeVar.j("effectiveFieldGoalPercentage", false);
        uyeVar.j("usage", false);
        uyeVar.j("individualOffensiveRating", false);
        uyeVar.j("individualDefensiveRating", false);
        uyeVar.j("playerEfficiencyRating", false);
        descriptor = uyeVar;
    }

    private BasketballPlayerSeasonStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, uhi.a, W, l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BasketballPlayerSeasonStatistics deserialize(@NotNull Decoder decoder) {
        Double d;
        Integer num;
        Double d2;
        int i;
        Integer num2;
        Double d3;
        Integer num3;
        Integer num4;
        Integer num5;
        Double d4;
        int i2;
        int i3;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        Double d10 = null;
        Integer num6 = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Integer num7 = null;
        Integer num8 = null;
        Double d14 = null;
        Double d15 = null;
        boolean z = true;
        int i6 = 0;
        int i7 = 0;
        String str = null;
        Integer num9 = null;
        Double d16 = null;
        Double d17 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        int i8 = 0;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Integer num24 = null;
        Integer num25 = null;
        Integer num26 = null;
        Integer num27 = null;
        Integer num28 = null;
        Integer num29 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    d = d5;
                    num = num6;
                    d2 = d11;
                    i = i8;
                    num2 = num19;
                    d3 = d6;
                    Unit unit = Unit.a;
                    z = false;
                    d6 = d3;
                    num19 = num2;
                    i8 = i;
                    num6 = num;
                    d11 = d2;
                    d5 = d;
                case 0:
                    d = d5;
                    num = num6;
                    d2 = d11;
                    int i9 = i8;
                    num2 = num19;
                    d3 = d6;
                    int l = b.l(serialDescriptor, 0);
                    i = i9 | 1;
                    Unit unit2 = Unit.a;
                    i7 = l;
                    d6 = d3;
                    num19 = num2;
                    i8 = i;
                    num6 = num;
                    d11 = d2;
                    d5 = d;
                case 1:
                    d = d5;
                    num = num6;
                    d2 = d11;
                    int i10 = i8;
                    num2 = num19;
                    String n = b.n(serialDescriptor, 1);
                    i = i10 | 2;
                    Unit unit3 = Unit.a;
                    str = n;
                    d6 = d6;
                    num19 = num2;
                    i8 = i;
                    num6 = num;
                    d11 = d2;
                    d5 = d;
                case 2:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i11 = i8;
                    Integer num30 = num19;
                    Double d18 = d6;
                    Integer num31 = (Integer) b.i(serialDescriptor, 2, a7a.a, num9);
                    int i12 = i11 | 4;
                    Unit unit4 = Unit.a;
                    i8 = i12;
                    d6 = d18;
                    num19 = num30;
                    num9 = num31;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 3:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i13 = i8;
                    Integer num32 = num19;
                    Double d19 = d6;
                    Double d20 = (Double) b.i(serialDescriptor, 3, h75.a, d16);
                    int i14 = i13 | 8;
                    Unit unit5 = Unit.a;
                    i8 = i14;
                    d6 = d19;
                    num19 = num32;
                    d16 = d20;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 4:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i15 = i8;
                    Integer num33 = num19;
                    Double d21 = d6;
                    Double d22 = (Double) b.i(serialDescriptor, 4, h75.a, d17);
                    int i16 = i15 | 16;
                    Unit unit6 = Unit.a;
                    i8 = i16;
                    d6 = d21;
                    num19 = num33;
                    d17 = d22;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 5:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i17 = i8;
                    Integer num34 = num19;
                    Double d23 = d6;
                    Integer num35 = (Integer) b.i(serialDescriptor, 5, a7a.a, num10);
                    int i18 = i17 | 32;
                    Unit unit7 = Unit.a;
                    i8 = i18;
                    d6 = d23;
                    num19 = num34;
                    num10 = num35;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 6:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i19 = i8;
                    Integer num36 = num19;
                    Double d24 = d6;
                    Integer num37 = (Integer) b.i(serialDescriptor, 6, a7a.a, num11);
                    int i20 = i19 | 64;
                    Unit unit8 = Unit.a;
                    i8 = i20;
                    d6 = d24;
                    num19 = num36;
                    num11 = num37;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 7:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i21 = i8;
                    Integer num38 = num19;
                    Double d25 = d6;
                    Integer num39 = (Integer) b.i(serialDescriptor, 7, a7a.a, num12);
                    int i22 = i21 | 128;
                    Unit unit9 = Unit.a;
                    i8 = i22;
                    d6 = d25;
                    num19 = num38;
                    num12 = num39;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 8:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i23 = i8;
                    Integer num40 = num19;
                    Double d26 = d6;
                    Integer num41 = (Integer) b.i(serialDescriptor, 8, a7a.a, num13);
                    int i24 = i23 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    i8 = i24;
                    d6 = d26;
                    num19 = num40;
                    num13 = num41;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 9:
                    d = d5;
                    num4 = num6;
                    d2 = d11;
                    int i25 = i8;
                    num5 = num19;
                    d4 = d6;
                    Integer num42 = (Integer) b.i(serialDescriptor, 9, a7a.a, num14);
                    i2 = i25 | 512;
                    Unit unit11 = Unit.a;
                    num14 = num42;
                    d6 = d4;
                    num6 = num4;
                    num19 = num5;
                    i8 = i2;
                    d11 = d2;
                    d5 = d;
                case 10:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i26 = i8;
                    Integer num43 = num19;
                    Double d27 = d6;
                    Integer num44 = (Integer) b.i(serialDescriptor, 10, a7a.a, num15);
                    int i27 = i26 | 1024;
                    Unit unit12 = Unit.a;
                    i8 = i27;
                    d6 = d27;
                    num19 = num43;
                    num15 = num44;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 11:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i28 = i8;
                    Integer num45 = num19;
                    Double d28 = d6;
                    Integer num46 = (Integer) b.i(serialDescriptor, 11, a7a.a, num16);
                    int i29 = i28 | a.o;
                    Unit unit13 = Unit.a;
                    i8 = i29;
                    d6 = d28;
                    num19 = num45;
                    num16 = num46;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 12:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    int i30 = i8;
                    Integer num47 = num19;
                    Double d29 = d6;
                    Integer num48 = (Integer) b.i(serialDescriptor, 12, a7a.a, num17);
                    int i31 = i30 | 4096;
                    Unit unit14 = Unit.a;
                    i8 = i31;
                    d6 = d29;
                    num19 = num47;
                    num17 = num48;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 13:
                    d = d5;
                    num4 = num6;
                    d2 = d11;
                    int i32 = i8;
                    num5 = num19;
                    d4 = d6;
                    Integer num49 = (Integer) b.i(serialDescriptor, 13, a7a.a, num18);
                    i2 = i32 | 8192;
                    Unit unit15 = Unit.a;
                    num18 = num49;
                    d6 = d4;
                    num6 = num4;
                    num19 = num5;
                    i8 = i2;
                    d11 = d2;
                    d5 = d;
                case 14:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num50 = (Integer) b.i(serialDescriptor, 14, a7a.a, num19);
                    i3 = i8 | 16384;
                    Unit unit16 = Unit.a;
                    num19 = num50;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 15:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num51 = (Integer) b.i(serialDescriptor, 15, a7a.a, num20);
                    i3 = i8 | 32768;
                    Unit unit17 = Unit.a;
                    num20 = num51;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 16:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num52 = (Integer) b.i(serialDescriptor, 16, a7a.a, num21);
                    i3 = i8 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num21 = num52;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 17:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num53 = (Integer) b.i(serialDescriptor, 17, a7a.a, num22);
                    i3 = i8 | 131072;
                    Unit unit19 = Unit.a;
                    num22 = num53;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 18:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num54 = (Integer) b.i(serialDescriptor, 18, a7a.a, num23);
                    i3 = i8 | 262144;
                    Unit unit20 = Unit.a;
                    num23 = num54;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 19:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num55 = (Integer) b.i(serialDescriptor, 19, a7a.a, num24);
                    i3 = i8 | 524288;
                    Unit unit21 = Unit.a;
                    num24 = num55;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 20:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num56 = (Integer) b.i(serialDescriptor, 20, a7a.a, num25);
                    i3 = i8 | ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    Unit unit22 = Unit.a;
                    num25 = num56;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 21:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num57 = (Integer) b.i(serialDescriptor, 21, a7a.a, num26);
                    i3 = i8 | 2097152;
                    Unit unit23 = Unit.a;
                    num26 = num57;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 22:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num58 = (Integer) b.i(serialDescriptor, 22, a7a.a, num27);
                    i3 = i8 | 4194304;
                    Unit unit24 = Unit.a;
                    num27 = num58;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 23:
                    d = d5;
                    num3 = num6;
                    d2 = d11;
                    Integer num59 = (Integer) b.i(serialDescriptor, 23, a7a.a, num28);
                    i3 = i8 | 8388608;
                    Unit unit25 = Unit.a;
                    num28 = num59;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 24:
                    d = d5;
                    d2 = d11;
                    num3 = num6;
                    Integer num60 = (Integer) b.i(serialDescriptor, 24, a7a.a, num29);
                    i3 = i8 | C.DEFAULT_MUXED_BUFFER_SIZE;
                    Unit unit26 = Unit.a;
                    num29 = num60;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 25:
                    d = d5;
                    d2 = d11;
                    num6 = (Integer) b.i(serialDescriptor, 25, a7a.a, num6);
                    Unit unit27 = Unit.a;
                    i8 |= 33554432;
                    d11 = d2;
                    d5 = d;
                case 26:
                    num3 = num6;
                    d = d5;
                    Double d30 = (Double) b.i(serialDescriptor, 26, h75.a, d11);
                    Unit unit28 = Unit.a;
                    i8 |= 67108864;
                    d2 = d30;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 27:
                    num3 = num6;
                    d2 = d11;
                    d10 = (Double) b.i(serialDescriptor, 27, h75.a, d10);
                    i4 = 134217728;
                    i3 = i8 | i4;
                    Unit unit29 = Unit.a;
                    d = d5;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 28:
                    num3 = num6;
                    d2 = d11;
                    d12 = (Double) b.i(serialDescriptor, 28, h75.a, d12);
                    i4 = 268435456;
                    i3 = i8 | i4;
                    Unit unit292 = Unit.a;
                    d = d5;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 29:
                    num3 = num6;
                    d2 = d11;
                    d13 = (Double) b.i(serialDescriptor, 29, h75.a, d13);
                    i4 = 536870912;
                    i3 = i8 | i4;
                    Unit unit2922 = Unit.a;
                    d = d5;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 30:
                    num3 = num6;
                    d2 = d11;
                    num7 = (Integer) b.i(serialDescriptor, 30, a7a.a, num7);
                    i4 = 1073741824;
                    i3 = i8 | i4;
                    Unit unit29222 = Unit.a;
                    d = d5;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 31:
                    num3 = num6;
                    d2 = d11;
                    num8 = (Integer) b.i(serialDescriptor, 31, a7a.a, num8);
                    i4 = Integer.MIN_VALUE;
                    i3 = i8 | i4;
                    Unit unit292222 = Unit.a;
                    d = d5;
                    i8 = i3;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 32:
                    num3 = num6;
                    d2 = d11;
                    d14 = (Double) b.i(serialDescriptor, 32, h75.a, d14);
                    i5 = i6 | 1;
                    Unit unit30 = Unit.a;
                    d = d5;
                    i6 = i5;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 33:
                    num3 = num6;
                    d2 = d11;
                    d15 = (Double) b.i(serialDescriptor, 33, h75.a, d15);
                    i5 = i6 | 2;
                    Unit unit302 = Unit.a;
                    d = d5;
                    i6 = i5;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 34:
                    num3 = num6;
                    d2 = d11;
                    d9 = (Double) b.i(serialDescriptor, 34, h75.a, d9);
                    i5 = i6 | 4;
                    Unit unit3022 = Unit.a;
                    d = d5;
                    i6 = i5;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 35:
                    num3 = num6;
                    d2 = d11;
                    d7 = (Double) b.i(serialDescriptor, 35, h75.a, d7);
                    i5 = i6 | 8;
                    Unit unit30222 = Unit.a;
                    d = d5;
                    i6 = i5;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 36:
                    num3 = num6;
                    d2 = d11;
                    d6 = (Double) b.i(serialDescriptor, 36, h75.a, d6);
                    i5 = i6 | 16;
                    Unit unit302222 = Unit.a;
                    d = d5;
                    i6 = i5;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 37:
                    num3 = num6;
                    d2 = d11;
                    d5 = (Double) b.i(serialDescriptor, 37, h75.a, d5);
                    i5 = i6 | 32;
                    Unit unit3022222 = Unit.a;
                    d = d5;
                    i6 = i5;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                case 38:
                    num3 = num6;
                    d2 = d11;
                    d8 = (Double) b.i(serialDescriptor, 38, h75.a, d8);
                    i5 = i6 | 64;
                    Unit unit30222222 = Unit.a;
                    d = d5;
                    i6 = i5;
                    num6 = num3;
                    d11 = d2;
                    d5 = d;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Double d31 = d5;
        int i33 = i8;
        Integer num61 = num19;
        Double d32 = d6;
        Integer num62 = num9;
        b.c(serialDescriptor);
        Integer num63 = num12;
        Integer num64 = num22;
        Double d33 = d12;
        return new BasketballPlayerSeasonStatistics(i33, i6, i7, str, num62, d16, d17, num10, num11, num63, num13, num14, num15, num16, num17, num18, num61, num20, num21, num64, num23, num24, num25, num26, num27, num28, num29, num6, d11, d10, d33, d13, num7, num8, d14, d15, d9, d7, d32, d31, d8, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketballPlayerSeasonStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BasketballPlayerSeasonStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
