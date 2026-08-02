package com.sofascore.model.network.response;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.gz1;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/network/response/BasketballPlayerEventStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/network/response/BasketballPlayerEventStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class BasketballPlayerEventStatistics$$serializer implements iw8 {

    @NotNull
    public static final BasketballPlayerEventStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        BasketballPlayerEventStatistics$$serializer basketballPlayerEventStatistics$$serializer = new BasketballPlayerEventStatistics$$serializer();
        INSTANCE = basketballPlayerEventStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.network.response.BasketballPlayerEventStatistics", basketballPlayerEventStatistics$$serializer, 23);
        uyeVar.j("points", false);
        uyeVar.j("freeThrowsMade", false);
        uyeVar.j("twoPointsMade", false);
        uyeVar.j("threePointsMade", false);
        uyeVar.j("fieldGoalsMade", false);
        uyeVar.j("freeThrowAttempts", false);
        uyeVar.j("twoPointAttempts", false);
        uyeVar.j("threePointAttempts", false);
        uyeVar.j("fieldGoalAttempts", false);
        uyeVar.j("fieldGoalPct", false);
        uyeVar.j("rebounds", false);
        uyeVar.j("defensiveRebounds", false);
        uyeVar.j("offensiveRebounds", false);
        uyeVar.j("secondsPlayed", false);
        uyeVar.j("assists", false);
        uyeVar.j("steals", false);
        uyeVar.j("turnovers", false);
        uyeVar.j("blocks", false);
        uyeVar.j("personalFouls", false);
        uyeVar.j("pir", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("winningTeam", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        descriptor = uyeVar;
    }

    private BasketballPlayerEventStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(gz1.a), l98.W(h75.a)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final BasketballPlayerEventStatistics deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        int i;
        Double d;
        Integer num3;
        Integer num4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num5 = null;
        Integer num6 = null;
        Double d2 = null;
        Integer num7 = null;
        Boolean bool = null;
        int i2 = 0;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        boolean z = true;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        Integer num22 = null;
        Integer num23 = null;
        Integer num24 = null;
        Integer num25 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    d = d2;
                    z = false;
                    num6 = num6;
                    num16 = num16;
                    d2 = d;
                case 0:
                    num = num5;
                    i2 |= 1;
                    num17 = num17;
                    num6 = num6;
                    d2 = d2;
                    num16 = (Integer) b.i(serialDescriptor, 0, a7a.a, num16);
                    num5 = num;
                case 1:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num17 = (Integer) b.i(serialDescriptor, 1, a7a.a, num17);
                    i2 |= 2;
                    num18 = num18;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 2:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num18 = (Integer) b.i(serialDescriptor, 2, a7a.a, num18);
                    i2 |= 4;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 3:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num19 = (Integer) b.i(serialDescriptor, 3, a7a.a, num19);
                    i2 |= 8;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 4:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num20 = (Integer) b.i(serialDescriptor, 4, a7a.a, num20);
                    i2 |= 16;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 5:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num21 = (Integer) b.i(serialDescriptor, 5, a7a.a, num21);
                    i2 |= 32;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 6:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num22 = (Integer) b.i(serialDescriptor, 6, a7a.a, num22);
                    i2 |= 64;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 7:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num23 = (Integer) b.i(serialDescriptor, 7, a7a.a, num23);
                    i2 |= 128;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 8:
                    num3 = num5;
                    num4 = num6;
                    d = d2;
                    num24 = (Integer) b.i(serialDescriptor, 8, a7a.a, num24);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 9:
                    num3 = num5;
                    d = d2;
                    num4 = num6;
                    num25 = (Integer) b.i(serialDescriptor, 9, a7a.a, num25);
                    i2 |= 512;
                    num6 = num4;
                    num5 = num3;
                    d2 = d;
                case 10:
                    d = d2;
                    num3 = num5;
                    num6 = (Integer) b.i(serialDescriptor, 10, a7a.a, num6);
                    i2 |= 1024;
                    num5 = num3;
                    d2 = d;
                case 11:
                    d = d2;
                    num5 = (Integer) b.i(serialDescriptor, 11, a7a.a, num5);
                    i2 |= a.o;
                    num6 = num6;
                    d2 = d;
                case 12:
                    num = num5;
                    num2 = num6;
                    num7 = (Integer) b.i(serialDescriptor, 12, a7a.a, num7);
                    i2 |= 4096;
                    num6 = num2;
                    num5 = num;
                case 13:
                    num = num5;
                    num2 = num6;
                    num8 = (Integer) b.i(serialDescriptor, 13, a7a.a, num8);
                    i2 |= 8192;
                    num6 = num2;
                    num5 = num;
                case 14:
                    num = num5;
                    num2 = num6;
                    num9 = (Integer) b.i(serialDescriptor, 14, a7a.a, num9);
                    i2 |= 16384;
                    num6 = num2;
                    num5 = num;
                case 15:
                    num = num5;
                    num2 = num6;
                    num10 = (Integer) b.i(serialDescriptor, 15, a7a.a, num10);
                    i = 32768;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 16:
                    num = num5;
                    num2 = num6;
                    num11 = (Integer) b.i(serialDescriptor, 16, a7a.a, num11);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 17:
                    num = num5;
                    num2 = num6;
                    num12 = (Integer) b.i(serialDescriptor, 17, a7a.a, num12);
                    i = 131072;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 18:
                    num = num5;
                    num2 = num6;
                    num13 = (Integer) b.i(serialDescriptor, 18, a7a.a, num13);
                    i = 262144;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 19:
                    num = num5;
                    num2 = num6;
                    num14 = (Integer) b.i(serialDescriptor, 19, a7a.a, num14);
                    i = 524288;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 20:
                    num = num5;
                    num2 = num6;
                    num15 = (Integer) b.i(serialDescriptor, 20, a7a.a, num15);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 21:
                    num = num5;
                    num2 = num6;
                    bool = (Boolean) b.i(serialDescriptor, 21, gz1.a, bool);
                    i = 2097152;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                case 22:
                    num2 = num6;
                    num = num5;
                    d2 = (Double) b.i(serialDescriptor, 22, h75.a, d2);
                    i = 4194304;
                    i2 |= i;
                    num6 = num2;
                    num5 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num26 = num6;
        Double d3 = d2;
        Integer num27 = num16;
        Integer num28 = num17;
        Integer num29 = num18;
        b.c(serialDescriptor);
        Integer num30 = num25;
        Integer num31 = num14;
        return new BasketballPlayerEventStatistics(i2, num27, num28, num29, num19, num20, num21, num22, num23, num24, num30, num26, num5, num7, num8, num9, num10, num11, num12, num13, num31, num15, bool, d3, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull BasketballPlayerEventStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        BasketballPlayerEventStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
