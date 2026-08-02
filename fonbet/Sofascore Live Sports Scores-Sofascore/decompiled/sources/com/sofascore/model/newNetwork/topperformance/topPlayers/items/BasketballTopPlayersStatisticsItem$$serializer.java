package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BasketballTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BasketballTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final BasketballTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketballTopPlayersStatisticsItem$$serializer basketballTopPlayersStatisticsItem$$serializer = new BasketballTopPlayersStatisticsItem$$serializer();
        INSTANCE = basketballTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.BasketballTopPlayersStatisticsItem", basketballTopPlayersStatisticsItem$$serializer, 30);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j("points", false);
        uyeVar.j("rebounds", false);
        uyeVar.j("assists", false);
        uyeVar.j("secondsPlayed", false);
        uyeVar.j("fieldGoalsPercentage", false);
        uyeVar.j("fieldGoalsMade", false);
        uyeVar.j("freeThrowsPercentage", false);
        uyeVar.j("freeThrowsMade", false);
        uyeVar.j("threePointsPercentage", false);
        uyeVar.j("threePointsMade", false);
        uyeVar.j("defensiveRebounds", false);
        uyeVar.j("offensiveRebounds", false);
        uyeVar.j("steals", false);
        uyeVar.j("turnovers", false);
        uyeVar.j("blocks", false);
        uyeVar.j("assistTurnoverRatio", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("pir", false);
        uyeVar.j("doubleDoubles", false);
        uyeVar.j("tripleDoubles", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("trueShootingPercentage", false);
        uyeVar.j("effectiveFieldGoalPercentage", false);
        uyeVar.j("usage", false);
        uyeVar.j("individualOffensiveRating", false);
        uyeVar.j("individualDefensiveRating", false);
        uyeVar.j("playerEfficiencyRating", false);
        descriptor = uyeVar;
    }

    private BasketballTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, W, uhi.a, W2, W3, W4, W5, l98.W(h75Var), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BasketballTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Double d;
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        Double d2;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        int i2;
        Integer num8;
        Integer num9;
        Integer num10;
        int i3;
        Integer num11;
        Integer num12;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Double d3 = null;
        Double d4 = null;
        Integer num13 = null;
        Double d5 = null;
        Integer num14 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        Integer num15 = null;
        Integer num16 = null;
        Double d10 = null;
        Integer num17 = null;
        Integer num18 = null;
        boolean z = true;
        int i6 = 0;
        String str = null;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Double d11 = null;
        Integer num24 = null;
        Double d12 = null;
        Integer num25 = null;
        Double d13 = null;
        Integer num26 = null;
        Integer num27 = null;
        int i7 = 0;
        Integer num28 = null;
        Integer num29 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    d = d3;
                    num = num15;
                    num2 = num16;
                    i = i7;
                    num3 = num28;
                    d2 = d4;
                    Unit unit = Unit.a;
                    z = false;
                    num4 = num3;
                    num16 = num2;
                    i7 = i;
                    num15 = num;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 0:
                    d = d3;
                    num = num15;
                    num2 = num16;
                    Integer num30 = num19;
                    int i8 = i7;
                    num3 = num28;
                    d2 = d4;
                    i6 = b.l(serialDescriptor, 0);
                    i = i8 | 1;
                    Unit unit2 = Unit.a;
                    num19 = num30;
                    num4 = num3;
                    num16 = num2;
                    i7 = i;
                    num15 = num;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 1:
                    d = d3;
                    num = num15;
                    Integer num31 = num16;
                    int i9 = i7;
                    Integer num32 = num28;
                    d2 = d4;
                    Integer num33 = (Integer) b.i(serialDescriptor, 1, a7a.a, num19);
                    i = i9 | 2;
                    Unit unit3 = Unit.a;
                    num19 = num33;
                    num20 = num20;
                    num4 = num32;
                    num16 = num31;
                    i7 = i;
                    num15 = num;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 2:
                    d = d3;
                    num = num15;
                    Integer num34 = num16;
                    int i10 = i7;
                    Integer num35 = num28;
                    d2 = d4;
                    String n = b.n(serialDescriptor, 2);
                    i = i10 | 4;
                    Unit unit4 = Unit.a;
                    str = n;
                    num4 = num35;
                    num16 = num34;
                    i7 = i;
                    num15 = num;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 3:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i11 = i7;
                    num7 = num28;
                    d2 = d4;
                    Integer num36 = (Integer) b.i(serialDescriptor, 3, a7a.a, num20);
                    i2 = i11 | 8;
                    Unit unit5 = Unit.a;
                    num20 = num36;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 4:
                    d = d3;
                    num8 = num15;
                    num9 = num16;
                    int i12 = i7;
                    num10 = num28;
                    d2 = d4;
                    Integer num37 = (Integer) b.i(serialDescriptor, 4, a7a.a, num21);
                    i3 = i12 | 16;
                    Unit unit6 = Unit.a;
                    num21 = num37;
                    num4 = num10;
                    num15 = num8;
                    num16 = num9;
                    i7 = i3;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 5:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i13 = i7;
                    num7 = num28;
                    d2 = d4;
                    Integer num38 = (Integer) b.i(serialDescriptor, 5, a7a.a, num22);
                    i2 = i13 | 32;
                    Unit unit7 = Unit.a;
                    num22 = num38;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 6:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i14 = i7;
                    num7 = num28;
                    d2 = d4;
                    Integer num39 = (Integer) b.i(serialDescriptor, 6, a7a.a, num23);
                    i2 = i14 | 64;
                    Unit unit8 = Unit.a;
                    num23 = num39;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 7:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i15 = i7;
                    num7 = num28;
                    d2 = d4;
                    Double d14 = (Double) b.i(serialDescriptor, 7, h75.a, d11);
                    i2 = i15 | 128;
                    Unit unit9 = Unit.a;
                    d11 = d14;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 8:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i16 = i7;
                    num7 = num28;
                    d2 = d4;
                    Integer num40 = (Integer) b.i(serialDescriptor, 8, a7a.a, num24);
                    i2 = i16 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    num24 = num40;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 9:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i17 = i7;
                    num7 = num28;
                    d2 = d4;
                    Double d15 = (Double) b.i(serialDescriptor, 9, h75.a, d12);
                    i2 = i17 | 512;
                    Unit unit11 = Unit.a;
                    d12 = d15;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 10:
                    d = d3;
                    num8 = num15;
                    num9 = num16;
                    int i18 = i7;
                    num10 = num28;
                    d2 = d4;
                    Integer num41 = (Integer) b.i(serialDescriptor, 10, a7a.a, num25);
                    i3 = i18 | 1024;
                    Unit unit12 = Unit.a;
                    num25 = num41;
                    num4 = num10;
                    num15 = num8;
                    num16 = num9;
                    i7 = i3;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 11:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i19 = i7;
                    num7 = num28;
                    d2 = d4;
                    Double d16 = (Double) b.i(serialDescriptor, 11, h75.a, d13);
                    i2 = i19 | a.o;
                    Unit unit13 = Unit.a;
                    d13 = d16;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 12:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i20 = i7;
                    num7 = num28;
                    d2 = d4;
                    Integer num42 = (Integer) b.i(serialDescriptor, 12, a7a.a, num26);
                    i2 = i20 | 4096;
                    Unit unit14 = Unit.a;
                    num26 = num42;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 13:
                    d = d3;
                    num5 = num15;
                    num6 = num16;
                    int i21 = i7;
                    num7 = num28;
                    d2 = d4;
                    Integer num43 = (Integer) b.i(serialDescriptor, 13, a7a.a, num27);
                    i2 = i21 | 8192;
                    Unit unit15 = Unit.a;
                    num27 = num43;
                    num4 = num7;
                    num15 = num5;
                    num16 = num6;
                    i7 = i2;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 14:
                    d = d3;
                    Integer num44 = num16;
                    Integer num45 = (Integer) b.i(serialDescriptor, 14, a7a.a, num28);
                    Unit unit16 = Unit.a;
                    num4 = num45;
                    d2 = d4;
                    i7 |= 16384;
                    num15 = num15;
                    num16 = num44;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 15:
                    d = d3;
                    num11 = num16;
                    num12 = num15;
                    Integer num46 = (Integer) b.i(serialDescriptor, 15, a7a.a, num29);
                    i4 = i7 | 32768;
                    Unit unit17 = Unit.a;
                    num29 = num46;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 16:
                    d = d3;
                    num11 = num16;
                    num15 = (Integer) b.i(serialDescriptor, 16, a7a.a, num15);
                    int i22 = i7 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    i7 = i22;
                    num4 = num28;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 17:
                    Integer num47 = num15;
                    d = d3;
                    num16 = (Integer) b.i(serialDescriptor, 17, a7a.a, num16);
                    Unit unit19 = Unit.a;
                    i7 |= 131072;
                    num4 = num28;
                    num15 = num47;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 18:
                    num12 = num15;
                    num11 = num16;
                    d10 = (Double) b.i(serialDescriptor, 18, h75.a, d10);
                    i5 = 262144;
                    i4 = i7 | i5;
                    Unit unit20 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 19:
                    num12 = num15;
                    num11 = num16;
                    num17 = (Integer) b.i(serialDescriptor, 19, a7a.a, num17);
                    i5 = 524288;
                    i4 = i7 | i5;
                    Unit unit202 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 20:
                    num12 = num15;
                    num11 = num16;
                    num18 = (Integer) b.i(serialDescriptor, 20, a7a.a, num18);
                    i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i4 = i7 | i5;
                    Unit unit2022 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 21:
                    num12 = num15;
                    num11 = num16;
                    num14 = (Integer) b.i(serialDescriptor, 21, a7a.a, num14);
                    i5 = 2097152;
                    i4 = i7 | i5;
                    Unit unit20222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 22:
                    num12 = num15;
                    num11 = num16;
                    num13 = (Integer) b.i(serialDescriptor, 22, a7a.a, num13);
                    i5 = 4194304;
                    i4 = i7 | i5;
                    Unit unit202222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 23:
                    num12 = num15;
                    num11 = num16;
                    d4 = (Double) b.i(serialDescriptor, 23, h75.a, d4);
                    i5 = 8388608;
                    i4 = i7 | i5;
                    Unit unit2022222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 24:
                    num12 = num15;
                    num11 = num16;
                    d3 = (Double) b.i(serialDescriptor, 24, h75.a, d3);
                    i5 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i4 = i7 | i5;
                    Unit unit20222222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 25:
                    num12 = num15;
                    num11 = num16;
                    d5 = (Double) b.i(serialDescriptor, 25, h75.a, d5);
                    i5 = 33554432;
                    i4 = i7 | i5;
                    Unit unit202222222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 26:
                    num12 = num15;
                    num11 = num16;
                    d7 = (Double) b.i(serialDescriptor, 26, h75.a, d7);
                    i5 = 67108864;
                    i4 = i7 | i5;
                    Unit unit2022222222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 27:
                    num12 = num15;
                    num11 = num16;
                    d6 = (Double) b.i(serialDescriptor, 27, h75.a, d6);
                    i5 = 134217728;
                    i4 = i7 | i5;
                    Unit unit20222222222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 28:
                    num12 = num15;
                    num11 = num16;
                    d9 = (Double) b.i(serialDescriptor, 28, h75.a, d9);
                    i5 = 268435456;
                    i4 = i7 | i5;
                    Unit unit202222222222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                case 29:
                    num12 = num15;
                    num11 = num16;
                    d8 = (Double) b.i(serialDescriptor, 29, h75.a, d8);
                    i5 = 536870912;
                    i4 = i7 | i5;
                    Unit unit2022222222222 = Unit.a;
                    d = d3;
                    i7 = i4;
                    num4 = num28;
                    num15 = num12;
                    num16 = num11;
                    d2 = d4;
                    d4 = d2;
                    d3 = d;
                    num28 = num4;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num48 = num15;
        Integer num49 = num16;
        Integer num50 = num19;
        Integer num51 = num20;
        int i23 = i7;
        Integer num52 = num28;
        Double d17 = d4;
        b.c(serialDescriptor);
        Integer num53 = num24;
        Double d18 = d10;
        Integer num54 = num22;
        Integer num55 = num29;
        Double d19 = d7;
        return new BasketballTopPlayersStatisticsItem(i23, i6, num50, str, num51, num21, num54, num23, d11, num53, d12, num25, d13, num26, num27, num52, num55, num48, num49, d18, num17, num18, num14, num13, d17, d3, d5, d19, d6, d9, d8, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketballTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BasketballTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
