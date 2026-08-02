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
import defpackage.t5h;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/BaseballTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BaseballTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final BaseballTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BaseballTopPlayersStatisticsItem$$serializer baseballTopPlayersStatisticsItem$$serializer = new BaseballTopPlayersStatisticsItem$$serializer();
        INSTANCE = baseballTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.BaseballTopPlayersStatisticsItem", baseballTopPlayersStatisticsItem$$serializer, 31);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("battingAtBats", false);
        uyeVar.j("battingHits", false);
        uyeVar.j("battingHomeRuns", false);
        uyeVar.j("battingAvg", false);
        uyeVar.j("battingRuns", false);
        uyeVar.j("battingRbi", false);
        uyeVar.j("battingStolenBases", false);
        uyeVar.j("battingOnBasePercentage", false);
        uyeVar.j("battingSluggingPercentage", false);
        uyeVar.j("war", false);
        uyeVar.j("pitchingGamesPlayed", false);
        uyeVar.j("pitchingWins", false);
        uyeVar.j("pitchingLosses", false);
        uyeVar.j("pitchingSaves", false);
        uyeVar.j("pitchingInningsPitched", false);
        uyeVar.j("pitchingEarnedRunsAverage", false);
        uyeVar.j("pitchingStrikeOuts", false);
        uyeVar.j("pitchingQualityStarts", false);
        uyeVar.j("pitchingWhip", false);
        uyeVar.j("pitchingWar", false);
        uyeVar.j("pitchingFieldingIndependentPitching", false);
        uyeVar.j("pitchingOpponentBattingAvg", false);
        uyeVar.j("fieldingPutOuts", false);
        uyeVar.j("fieldingAssists", false);
        uyeVar.j("fieldingTotalErrors", false);
        uyeVar.j("fieldingChances", false);
        uyeVar.j("fieldingDoublePlays", false);
        descriptor = uyeVar;
    }

    private BaseballTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, W, uhi.a, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BaseballTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Double d;
        Integer num;
        Double d2;
        int i;
        Integer num2;
        Double d3;
        Integer num3;
        Integer num4;
        Double d4;
        Integer num5;
        int i2;
        Integer num6;
        Double d5;
        Integer num7;
        int i3;
        Integer num8;
        Double d6;
        int i4;
        int i5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        Double d10 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Double d11 = null;
        Double d12 = null;
        Integer num16 = null;
        boolean z = true;
        int i6 = 0;
        String str = null;
        Integer num17 = null;
        Double d13 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Double d14 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Double d15 = null;
        Double d16 = null;
        Double d17 = null;
        int i7 = 0;
        Integer num24 = null;
        Integer num25 = null;
        Integer num26 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    d = d7;
                    num = num15;
                    d2 = d11;
                    i = i7;
                    num2 = num24;
                    d3 = d8;
                    Unit unit = Unit.a;
                    z = false;
                    num3 = num2;
                    d11 = d2;
                    i7 = i;
                    num15 = num;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 0:
                    d = d7;
                    num = num15;
                    d2 = d11;
                    Integer num27 = num17;
                    int i8 = i7;
                    num2 = num24;
                    d3 = d8;
                    i6 = b.l(serialDescriptor, 0);
                    i = i8 | 1;
                    Unit unit2 = Unit.a;
                    num17 = num27;
                    num3 = num2;
                    d11 = d2;
                    i7 = i;
                    num15 = num;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 1:
                    d = d7;
                    num = num15;
                    Double d18 = d11;
                    int i9 = i7;
                    Integer num28 = num24;
                    d3 = d8;
                    Integer num29 = (Integer) b.i(serialDescriptor, 1, a7a.a, num17);
                    i = i9 | 2;
                    Unit unit3 = Unit.a;
                    num17 = num29;
                    d13 = d13;
                    num3 = num28;
                    d11 = d18;
                    i7 = i;
                    num15 = num;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 2:
                    d = d7;
                    num = num15;
                    Double d19 = d11;
                    int i10 = i7;
                    Integer num30 = num24;
                    d3 = d8;
                    String n = b.n(serialDescriptor, 2);
                    i = i10 | 4;
                    Unit unit4 = Unit.a;
                    str = n;
                    num3 = num30;
                    d11 = d19;
                    i7 = i;
                    num15 = num;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 3:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i11 = i7;
                    num5 = num24;
                    d3 = d8;
                    Double d20 = (Double) b.i(serialDescriptor, 3, h75.a, d13);
                    i2 = i11 | 8;
                    Unit unit5 = Unit.a;
                    d13 = d20;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 4:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i12 = i7;
                    num5 = num24;
                    d3 = d8;
                    Integer num31 = (Integer) b.i(serialDescriptor, 4, a7a.a, num18);
                    i2 = i12 | 16;
                    Unit unit6 = Unit.a;
                    num18 = num31;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 5:
                    d = d7;
                    num6 = num15;
                    d5 = d11;
                    int i13 = i7;
                    num7 = num24;
                    d3 = d8;
                    Integer num32 = (Integer) b.i(serialDescriptor, 5, a7a.a, num19);
                    i3 = i13 | 32;
                    Unit unit7 = Unit.a;
                    num19 = num32;
                    num3 = num7;
                    num15 = num6;
                    d11 = d5;
                    i7 = i3;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 6:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i14 = i7;
                    num5 = num24;
                    d3 = d8;
                    Integer num33 = (Integer) b.i(serialDescriptor, 6, a7a.a, num20);
                    i2 = i14 | 64;
                    Unit unit8 = Unit.a;
                    num20 = num33;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 7:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i15 = i7;
                    num5 = num24;
                    d3 = d8;
                    Double d21 = (Double) b.i(serialDescriptor, 7, h75.a, d14);
                    i2 = i15 | 128;
                    Unit unit9 = Unit.a;
                    d14 = d21;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 8:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i16 = i7;
                    num5 = num24;
                    d3 = d8;
                    Integer num34 = (Integer) b.i(serialDescriptor, 8, a7a.a, num21);
                    i2 = i16 | NotificationCompat.FLAG_LOCAL_ONLY;
                    Unit unit10 = Unit.a;
                    num21 = num34;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 9:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i17 = i7;
                    num5 = num24;
                    d3 = d8;
                    Integer num35 = (Integer) b.i(serialDescriptor, 9, a7a.a, num22);
                    i2 = i17 | 512;
                    Unit unit11 = Unit.a;
                    num22 = num35;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 10:
                    d = d7;
                    num6 = num15;
                    d5 = d11;
                    int i18 = i7;
                    num7 = num24;
                    d3 = d8;
                    Integer num36 = (Integer) b.i(serialDescriptor, 10, a7a.a, num23);
                    i3 = i18 | 1024;
                    Unit unit12 = Unit.a;
                    num23 = num36;
                    num3 = num7;
                    num15 = num6;
                    d11 = d5;
                    i7 = i3;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 11:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i19 = i7;
                    num5 = num24;
                    d3 = d8;
                    Double d22 = (Double) b.i(serialDescriptor, 11, h75.a, d15);
                    i2 = i19 | a.o;
                    Unit unit13 = Unit.a;
                    d15 = d22;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 12:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i20 = i7;
                    num5 = num24;
                    d3 = d8;
                    Double d23 = (Double) b.i(serialDescriptor, 12, h75.a, d16);
                    i2 = i20 | 4096;
                    Unit unit14 = Unit.a;
                    d16 = d23;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 13:
                    d = d7;
                    num4 = num15;
                    d4 = d11;
                    int i21 = i7;
                    num5 = num24;
                    d3 = d8;
                    Double d24 = (Double) b.i(serialDescriptor, 13, h75.a, d17);
                    i2 = i21 | 8192;
                    Unit unit15 = Unit.a;
                    d17 = d24;
                    num3 = num5;
                    num15 = num4;
                    d11 = d4;
                    i7 = i2;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 14:
                    d = d7;
                    Double d25 = d11;
                    Integer num37 = (Integer) b.i(serialDescriptor, 14, a7a.a, num24);
                    Unit unit16 = Unit.a;
                    num3 = num37;
                    d3 = d8;
                    i7 |= 16384;
                    num15 = num15;
                    d11 = d25;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 15:
                    d = d7;
                    num8 = num15;
                    d6 = d11;
                    Integer num38 = (Integer) b.i(serialDescriptor, 15, a7a.a, num25);
                    i4 = i7 | 32768;
                    Unit unit17 = Unit.a;
                    num25 = num38;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 16:
                    d = d7;
                    d6 = d11;
                    num8 = num15;
                    Integer num39 = (Integer) b.i(serialDescriptor, 16, a7a.a, num26);
                    i4 = i7 | C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    Unit unit18 = Unit.a;
                    num26 = num39;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 17:
                    d = d7;
                    d6 = d11;
                    num15 = (Integer) b.i(serialDescriptor, 17, a7a.a, num15);
                    Unit unit19 = Unit.a;
                    i7 |= 131072;
                    num3 = num24;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 18:
                    Integer num40 = num15;
                    d = d7;
                    d11 = (Double) b.i(serialDescriptor, 18, h75.a, d11);
                    Unit unit20 = Unit.a;
                    i7 |= 262144;
                    num3 = num24;
                    num15 = num40;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 19:
                    num8 = num15;
                    d6 = d11;
                    d12 = (Double) b.i(serialDescriptor, 19, h75.a, d12);
                    i5 = 524288;
                    i4 = i7 | i5;
                    Unit unit21 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 20:
                    num8 = num15;
                    d6 = d11;
                    num16 = (Integer) b.i(serialDescriptor, 20, a7a.a, num16);
                    i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i4 = i7 | i5;
                    Unit unit212 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 21:
                    num8 = num15;
                    d6 = d11;
                    num9 = (Integer) b.i(serialDescriptor, 21, a7a.a, num9);
                    i5 = 2097152;
                    i4 = i7 | i5;
                    Unit unit2122 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 22:
                    num8 = num15;
                    d6 = d11;
                    d9 = (Double) b.i(serialDescriptor, 22, h75.a, d9);
                    i5 = 4194304;
                    i4 = i7 | i5;
                    Unit unit21222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 23:
                    num8 = num15;
                    d6 = d11;
                    d8 = (Double) b.i(serialDescriptor, 23, h75.a, d8);
                    i5 = 8388608;
                    i4 = i7 | i5;
                    Unit unit212222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 24:
                    num8 = num15;
                    d6 = d11;
                    d7 = (Double) b.i(serialDescriptor, 24, h75.a, d7);
                    i5 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i4 = i7 | i5;
                    Unit unit2122222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 25:
                    num8 = num15;
                    d6 = d11;
                    d10 = (Double) b.i(serialDescriptor, 25, h75.a, d10);
                    i5 = 33554432;
                    i4 = i7 | i5;
                    Unit unit21222222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 26:
                    num8 = num15;
                    d6 = d11;
                    num11 = (Integer) b.i(serialDescriptor, 26, a7a.a, num11);
                    i5 = 67108864;
                    i4 = i7 | i5;
                    Unit unit212222222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 27:
                    num8 = num15;
                    d6 = d11;
                    num10 = (Integer) b.i(serialDescriptor, 27, a7a.a, num10);
                    i5 = 134217728;
                    i4 = i7 | i5;
                    Unit unit2122222222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 28:
                    num8 = num15;
                    d6 = d11;
                    num13 = (Integer) b.i(serialDescriptor, 28, a7a.a, num13);
                    i5 = 268435456;
                    i4 = i7 | i5;
                    Unit unit21222222222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 29:
                    num8 = num15;
                    d6 = d11;
                    num12 = (Integer) b.i(serialDescriptor, 29, a7a.a, num12);
                    i5 = 536870912;
                    i4 = i7 | i5;
                    Unit unit212222222222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                case 30:
                    num8 = num15;
                    d6 = d11;
                    num14 = (Integer) b.i(serialDescriptor, 30, a7a.a, num14);
                    i5 = 1073741824;
                    i4 = i7 | i5;
                    Unit unit2122222222222 = Unit.a;
                    d = d7;
                    i7 = i4;
                    num3 = num24;
                    num15 = num8;
                    d11 = d6;
                    d3 = d8;
                    d8 = d3;
                    d7 = d;
                    num24 = num3;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num41 = num15;
        Double d26 = d11;
        Integer num42 = num17;
        Double d27 = d13;
        int i22 = i7;
        Integer num43 = num24;
        Double d28 = d8;
        b.c(serialDescriptor);
        Integer num44 = num19;
        Integer num45 = num25;
        Integer num46 = num11;
        return new BaseballTopPlayersStatisticsItem(i22, i6, num42, str, d27, num18, num44, num20, d14, num21, num22, num23, d15, d16, d17, num43, num45, num26, num41, d26, d12, num16, num9, d9, d28, d7, d10, num46, num10, num13, num12, num14, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BaseballTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BaseballTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
