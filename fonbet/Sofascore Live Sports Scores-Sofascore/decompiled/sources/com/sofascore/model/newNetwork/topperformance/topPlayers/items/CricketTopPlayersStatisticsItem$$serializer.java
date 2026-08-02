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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/CricketTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class CricketTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final CricketTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        CricketTopPlayersStatisticsItem$$serializer cricketTopPlayersStatisticsItem$$serializer = new CricketTopPlayersStatisticsItem$$serializer();
        INSTANCE = cricketTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.CricketTopPlayersStatisticsItem", cricketTopPlayersStatisticsItem$$serializer, 26);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("runsScored", false);
        uyeVar.j("matches", false);
        uyeVar.j("battingInnings", false);
        uyeVar.j("highestScore", false);
        uyeVar.j("highestScoreVsTeamName", false);
        uyeVar.j("highestScoreBattingStrikeRate", false);
        uyeVar.j("highestScoreBattingBalls", false);
        uyeVar.j("battingAverage", false);
        uyeVar.j("battingStrikeRate", false);
        uyeVar.j("hundreds", false);
        uyeVar.j("fifties", false);
        uyeVar.j("sixes", false);
        uyeVar.j("fours", false);
        uyeVar.j("nineties", false);
        uyeVar.j("wickets", false);
        uyeVar.j("fiveWicketsHaul", false);
        uyeVar.j("overs", false);
        uyeVar.j("bowlingAverage", false);
        uyeVar.j("economy", false);
        uyeVar.j("bowlingStrikeRate", false);
        uyeVar.j("bowling", false);
        uyeVar.j("bowlingBestVsTeamName", false);
        descriptor = uyeVar;
    }

    private CricketTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, W, uhiVar, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(uhiVar), l98.W(h75Var), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(uhiVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final CricketTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Integer num;
        int i;
        int i2;
        String str;
        Double d;
        Integer num2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        String str2 = null;
        Double d2 = null;
        Double d3 = null;
        String str3 = null;
        Double d4 = null;
        int i3 = 0;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Double d5 = null;
        boolean z = true;
        int i4 = 0;
        String str4 = null;
        Integer num10 = null;
        Double d6 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        String str5 = null;
        Double d7 = null;
        Integer num15 = null;
        Double d8 = null;
        Double d9 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    z = false;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 0:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    i4 = b.l(serialDescriptor, 0);
                    i3 |= 1;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 1:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    num10 = (Integer) b.i(serialDescriptor, 1, a7a.a, num10);
                    i3 |= 2;
                    d6 = d6;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 2:
                    str = str2;
                    d = d2;
                    str4 = b.n(serialDescriptor, 2);
                    i3 |= 4;
                    str2 = str;
                    d2 = d;
                case 3:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    d6 = (Double) b.i(serialDescriptor, 3, h75.a, d6);
                    i3 |= 8;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 4:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    num11 = (Integer) b.i(serialDescriptor, 4, a7a.a, num11);
                    i3 |= 16;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 5:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    num12 = (Integer) b.i(serialDescriptor, 5, a7a.a, num12);
                    i3 |= 32;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 6:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    num13 = (Integer) b.i(serialDescriptor, 6, a7a.a, num13);
                    i3 |= 64;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 7:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    num14 = (Integer) b.i(serialDescriptor, 7, a7a.a, num14);
                    i3 |= 128;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 8:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    str5 = (String) b.i(serialDescriptor, 8, uhi.a, str5);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 9:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    d7 = (Double) b.i(serialDescriptor, 9, h75.a, d7);
                    i3 |= 512;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 10:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    num15 = (Integer) b.i(serialDescriptor, 10, a7a.a, num15);
                    i3 |= 1024;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 11:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    d8 = (Double) b.i(serialDescriptor, 11, h75.a, d8);
                    i3 |= a.o;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 12:
                    str = str2;
                    d = d2;
                    num2 = num3;
                    d9 = (Double) b.i(serialDescriptor, 12, h75.a, d9);
                    i3 |= 4096;
                    num3 = num2;
                    str2 = str;
                    d2 = d;
                case 13:
                    str = str2;
                    d = d2;
                    num3 = (Integer) b.i(serialDescriptor, 13, a7a.a, num3);
                    i3 |= 8192;
                    str2 = str;
                    d2 = d;
                case 14:
                    num = num3;
                    num5 = (Integer) b.i(serialDescriptor, 14, a7a.a, num5);
                    i3 |= 16384;
                    num3 = num;
                case 15:
                    i = i3;
                    num = num3;
                    num4 = (Integer) b.i(serialDescriptor, 15, a7a.a, num4);
                    i2 = 32768;
                    i3 = i | i2;
                    num3 = num;
                case 16:
                    i = i3;
                    num = num3;
                    num6 = (Integer) b.i(serialDescriptor, 16, a7a.a, num6);
                    i2 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i3 = i | i2;
                    num3 = num;
                case 17:
                    i = i3;
                    num = num3;
                    num7 = (Integer) b.i(serialDescriptor, 17, a7a.a, num7);
                    i2 = 131072;
                    i3 = i | i2;
                    num3 = num;
                case 18:
                    i = i3;
                    num = num3;
                    num8 = (Integer) b.i(serialDescriptor, 18, a7a.a, num8);
                    i2 = 262144;
                    i3 = i | i2;
                    num3 = num;
                case 19:
                    i = i3;
                    num = num3;
                    num9 = (Integer) b.i(serialDescriptor, 19, a7a.a, num9);
                    i2 = 524288;
                    i3 = i | i2;
                    num3 = num;
                case 20:
                    i = i3;
                    num = num3;
                    d5 = (Double) b.i(serialDescriptor, 20, h75.a, d5);
                    i2 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i3 = i | i2;
                    num3 = num;
                case 21:
                    i = i3;
                    num = num3;
                    d4 = (Double) b.i(serialDescriptor, 21, h75.a, d4);
                    i2 = 2097152;
                    i3 = i | i2;
                    num3 = num;
                case 22:
                    i = i3;
                    num = num3;
                    d3 = (Double) b.i(serialDescriptor, 22, h75.a, d3);
                    i2 = 4194304;
                    i3 = i | i2;
                    num3 = num;
                case 23:
                    i = i3;
                    num = num3;
                    d2 = (Double) b.i(serialDescriptor, 23, h75.a, d2);
                    i2 = 8388608;
                    i3 = i | i2;
                    num3 = num;
                case 24:
                    i = i3;
                    num = num3;
                    str2 = (String) b.i(serialDescriptor, 24, uhi.a, str2);
                    i2 = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i3 = i | i2;
                    num3 = num;
                case 25:
                    num = num3;
                    i = i3;
                    str3 = (String) b.i(serialDescriptor, 25, uhi.a, str3);
                    i2 = 33554432;
                    i3 = i | i2;
                    num3 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Double d10 = d2;
        Integer num16 = num3;
        Integer num17 = num10;
        Double d11 = d6;
        b.c(serialDescriptor);
        int i5 = i4;
        Integer num18 = num15;
        Double d12 = d5;
        Integer num19 = num14;
        Integer num20 = num7;
        return new CricketTopPlayersStatisticsItem(i3, i5, num17, str4, d11, num11, num12, num13, num19, str5, d7, num18, d8, d9, num16, num5, num4, num6, num20, num8, num9, d12, d4, d3, d10, str2, str3, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull CricketTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        CricketTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
