package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.h75;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/BasketballTopTeamsStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BasketballTopTeamsStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final BasketballTopTeamsStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketballTopTeamsStatisticsItem$$serializer basketballTopTeamsStatisticsItem$$serializer = new BasketballTopTeamsStatisticsItem$$serializer();
        INSTANCE = basketballTopTeamsStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem", basketballTopTeamsStatisticsItem$$serializer, 25);
        uyeVar.j("id", false);
        uyeVar.j("matches", false);
        uyeVar.j("points", false);
        uyeVar.j("pointsAgainst", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("fieldGoalsPercentage", false);
        uyeVar.j("fieldGoalsPercentageAgainst", false);
        uyeVar.j("freeThrowsPercentage", false);
        uyeVar.j("threePointsPercentage", false);
        uyeVar.j("threePointsPercentageAgainst", false);
        uyeVar.j("threePointsMade", false);
        uyeVar.j("trueShootingPercentage", false);
        uyeVar.j("effectiveFieldGoalPercentage", false);
        uyeVar.j("pace", false);
        uyeVar.j("offensiveRating", false);
        uyeVar.j("defensiveRating", false);
        uyeVar.j("netRating", false);
        uyeVar.j("assists", false);
        uyeVar.j("rebounds", false);
        uyeVar.j("defensiveRebounds", false);
        uyeVar.j("offensiveRebounds", false);
        uyeVar.j("steals", false);
        uyeVar.j("turnovers", false);
        uyeVar.j("blocks", false);
        uyeVar.j("fastbreakPoints", false);
        descriptor = uyeVar;
    }

    private BasketballTopTeamsStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, a7aVar, W, W2, W3, l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BasketballTopTeamsStatisticsItem deserialize(@NotNull Decoder decoder) {
        Double d;
        Double d2;
        int i;
        Integer num;
        Double d3;
        Double d4;
        Double d5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Double d6 = null;
        Integer num5 = null;
        int i2 = 0;
        Double d7 = null;
        Double d8 = null;
        Double d9 = null;
        Double d10 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Double d11 = null;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Integer num13 = null;
        Double d16 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num2;
                    d3 = d7;
                    z = false;
                    d7 = d3;
                    num2 = num;
                case 0:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 1:
                    num = num2;
                    d5 = d6;
                    i4 = b.l(serialDescriptor, 1);
                    i2 |= 2;
                    d6 = d5;
                    num2 = num;
                case 2:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    num10 = (Integer) b.i(serialDescriptor, 2, a7a.a, num10);
                    i2 |= 4;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 3:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    num11 = (Integer) b.i(serialDescriptor, 3, a7a.a, num11);
                    i2 |= 8;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 4:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    num12 = (Integer) b.i(serialDescriptor, 4, a7a.a, num12);
                    i2 |= 16;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 5:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    d11 = (Double) b.i(serialDescriptor, 5, h75.a, d11);
                    i2 |= 32;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 6:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    d12 = (Double) b.i(serialDescriptor, 6, h75.a, d12);
                    i2 |= 64;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 7:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    d13 = (Double) b.i(serialDescriptor, 7, h75.a, d13);
                    i2 |= 128;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 8:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    d14 = (Double) b.i(serialDescriptor, 8, h75.a, d14);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 9:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    d15 = (Double) b.i(serialDescriptor, 9, h75.a, d15);
                    i2 |= 512;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 10:
                    num = num2;
                    d4 = d6;
                    d3 = d7;
                    num13 = (Integer) b.i(serialDescriptor, 10, a7a.a, num13);
                    i2 |= 1024;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 11:
                    num = num2;
                    d3 = d7;
                    d4 = d6;
                    d16 = (Double) b.i(serialDescriptor, 11, h75.a, d16);
                    i2 |= a.o;
                    d6 = d4;
                    d7 = d3;
                    num2 = num;
                case 12:
                    num = num2;
                    d3 = d7;
                    d6 = (Double) b.i(serialDescriptor, 12, h75.a, d6);
                    i2 |= 4096;
                    d7 = d3;
                    num2 = num;
                case 13:
                    d5 = d6;
                    num = num2;
                    d7 = (Double) b.i(serialDescriptor, 13, h75.a, d7);
                    i2 |= 8192;
                    d6 = d5;
                    num2 = num;
                case 14:
                    d = d6;
                    d2 = d7;
                    d8 = (Double) b.i(serialDescriptor, 14, h75.a, d8);
                    i2 |= 16384;
                    d6 = d;
                    d7 = d2;
                case 15:
                    d = d6;
                    d2 = d7;
                    d9 = (Double) b.i(serialDescriptor, 15, h75.a, d9);
                    i = 32768;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 16:
                    d = d6;
                    d2 = d7;
                    d10 = (Double) b.i(serialDescriptor, 16, h75.a, d10);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 17:
                    d = d6;
                    d2 = d7;
                    num6 = (Integer) b.i(serialDescriptor, 17, a7a.a, num6);
                    i = 131072;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 18:
                    d = d6;
                    d2 = d7;
                    num7 = (Integer) b.i(serialDescriptor, 18, a7a.a, num7);
                    i = 262144;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 19:
                    d = d6;
                    d2 = d7;
                    num8 = (Integer) b.i(serialDescriptor, 19, a7a.a, num8);
                    i = 524288;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 20:
                    d = d6;
                    d2 = d7;
                    num9 = (Integer) b.i(serialDescriptor, 20, a7a.a, num9);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 21:
                    d = d6;
                    d2 = d7;
                    num5 = (Integer) b.i(serialDescriptor, 21, a7a.a, num5);
                    i = 2097152;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 22:
                    d = d6;
                    d2 = d7;
                    num4 = (Integer) b.i(serialDescriptor, 22, a7a.a, num4);
                    i = 4194304;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 23:
                    d = d6;
                    d2 = d7;
                    num3 = (Integer) b.i(serialDescriptor, 23, a7a.a, num3);
                    i = 8388608;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                case 24:
                    d = d6;
                    d2 = d7;
                    num2 = (Integer) b.i(serialDescriptor, 24, a7a.a, num2);
                    i = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i2 |= i;
                    d6 = d;
                    d7 = d2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num14 = num2;
        Double d17 = d7;
        Integer num15 = num10;
        b.c(serialDescriptor);
        int i5 = i3;
        Integer num16 = num13;
        Integer num17 = num9;
        Double d18 = d13;
        Integer num18 = num6;
        Double d19 = d15;
        Integer num19 = num8;
        return new BasketballTopTeamsStatisticsItem(i2, i5, i4, num15, num11, num12, d11, d12, d18, d14, d19, num16, d16, d6, d17, d8, d9, d10, num18, num7, num19, num17, num5, num4, num3, num14, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketballTopTeamsStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BasketballTopTeamsStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
