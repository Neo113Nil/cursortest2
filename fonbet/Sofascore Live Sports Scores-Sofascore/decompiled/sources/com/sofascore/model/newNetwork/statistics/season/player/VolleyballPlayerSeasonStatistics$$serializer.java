package com.sofascore.model.newNetwork.statistics.season.player;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/statistics/season/player/VolleyballPlayerSeasonStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class VolleyballPlayerSeasonStatistics$$serializer implements iw8 {

    @NotNull
    public static final VolleyballPlayerSeasonStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VolleyballPlayerSeasonStatistics$$serializer volleyballPlayerSeasonStatistics$$serializer = new VolleyballPlayerSeasonStatistics$$serializer();
        INSTANCE = volleyballPlayerSeasonStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.statistics.season.player.VolleyballPlayerSeasonStatistics", volleyballPlayerSeasonStatistics$$serializer, 19);
        uyeVar.j("id", false);
        uyeVar.j("type", false);
        uyeVar.j("appearances", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, false);
        uyeVar.j("sets", false);
        uyeVar.j("pointsTotal", false);
        uyeVar.j("breakPoints", false);
        uyeVar.j("blockPoints", false);
        uyeVar.j("serves", false);
        uyeVar.j("serveErrors", false);
        uyeVar.j("aces", false);
        uyeVar.j("receptionsTotal", false);
        uyeVar.j("receptionErrors", false);
        uyeVar.j("receptionWin", false);
        uyeVar.j("receptionPerf", false);
        uyeVar.j("attacksTotal", false);
        uyeVar.j("attackErrors", false);
        uyeVar.j("attacksBlocked", false);
        uyeVar.j("attackPoints", false);
        descriptor = uyeVar;
    }

    private VolleyballPlayerSeasonStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, uhi.a, W, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final VolleyballPlayerSeasonStatistics deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        int i;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        int i2 = 0;
        Integer num12 = null;
        Double d = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        boolean z = true;
        int i3 = 0;
        String str = null;
        Integer num19 = null;
        Double d2 = null;
        Integer num20 = null;
        Integer num21 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num3 = num7;
                    num4 = num18;
                    z = false;
                    num18 = num4;
                    num7 = num3;
                case 0:
                    num3 = num7;
                    num5 = num17;
                    num4 = num18;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    num17 = num5;
                    num18 = num4;
                    num7 = num3;
                case 1:
                    num3 = num7;
                    num6 = num17;
                    str = b.n(serialDescriptor, 1);
                    i2 |= 2;
                    num17 = num6;
                    num7 = num3;
                case 2:
                    num3 = num7;
                    num5 = num17;
                    num4 = num18;
                    num19 = (Integer) b.i(serialDescriptor, 2, a7a.a, num19);
                    i2 |= 4;
                    num17 = num5;
                    num18 = num4;
                    num7 = num3;
                case 3:
                    num3 = num7;
                    num5 = num17;
                    num4 = num18;
                    d2 = (Double) b.i(serialDescriptor, 3, h75.a, d2);
                    i2 |= 8;
                    num17 = num5;
                    num18 = num4;
                    num7 = num3;
                case 4:
                    num3 = num7;
                    num5 = num17;
                    num4 = num18;
                    num20 = (Integer) b.i(serialDescriptor, 4, a7a.a, num20);
                    i2 |= 16;
                    num17 = num5;
                    num18 = num4;
                    num7 = num3;
                case 5:
                    num3 = num7;
                    num4 = num18;
                    num5 = num17;
                    num21 = (Integer) b.i(serialDescriptor, 5, a7a.a, num21);
                    i2 |= 32;
                    num17 = num5;
                    num18 = num4;
                    num7 = num3;
                case 6:
                    num3 = num7;
                    num4 = num18;
                    num17 = (Integer) b.i(serialDescriptor, 6, a7a.a, num17);
                    i2 |= 64;
                    num18 = num4;
                    num7 = num3;
                case 7:
                    num6 = num17;
                    num3 = num7;
                    num18 = (Integer) b.i(serialDescriptor, 7, a7a.a, num18);
                    i2 |= 128;
                    num17 = num6;
                    num7 = num3;
                case 8:
                    num = num17;
                    num2 = num18;
                    num11 = (Integer) b.i(serialDescriptor, 8, a7a.a, num11);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num17 = num;
                    num18 = num2;
                case 9:
                    num = num17;
                    num2 = num18;
                    num9 = (Integer) b.i(serialDescriptor, 9, a7a.a, num9);
                    i2 |= 512;
                    num17 = num;
                    num18 = num2;
                case 10:
                    num = num17;
                    num2 = num18;
                    num8 = (Integer) b.i(serialDescriptor, 10, a7a.a, num8);
                    i2 |= 1024;
                    num17 = num;
                    num18 = num2;
                case 11:
                    num = num17;
                    num2 = num18;
                    num7 = (Integer) b.i(serialDescriptor, 11, a7a.a, num7);
                    i2 |= a.o;
                    num17 = num;
                    num18 = num2;
                case 12:
                    num = num17;
                    num2 = num18;
                    num10 = (Integer) b.i(serialDescriptor, 12, a7a.a, num10);
                    i2 |= 4096;
                    num17 = num;
                    num18 = num2;
                case 13:
                    num = num17;
                    num2 = num18;
                    num12 = (Integer) b.i(serialDescriptor, 13, a7a.a, num12);
                    i2 |= 8192;
                    num17 = num;
                    num18 = num2;
                case 14:
                    num = num17;
                    num2 = num18;
                    d = (Double) b.i(serialDescriptor, 14, h75.a, d);
                    i2 |= 16384;
                    num17 = num;
                    num18 = num2;
                case 15:
                    num = num17;
                    num2 = num18;
                    num13 = (Integer) b.i(serialDescriptor, 15, a7a.a, num13);
                    i = 32768;
                    i2 |= i;
                    num17 = num;
                    num18 = num2;
                case 16:
                    num = num17;
                    num2 = num18;
                    num14 = (Integer) b.i(serialDescriptor, 16, a7a.a, num14);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num17 = num;
                    num18 = num2;
                case 17:
                    num = num17;
                    num2 = num18;
                    num15 = (Integer) b.i(serialDescriptor, 17, a7a.a, num15);
                    i = 131072;
                    i2 |= i;
                    num17 = num;
                    num18 = num2;
                case 18:
                    num = num17;
                    num2 = num18;
                    num16 = (Integer) b.i(serialDescriptor, 18, a7a.a, num16);
                    i = 262144;
                    i2 |= i;
                    num17 = num;
                    num18 = num2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num22 = num7;
        b.c(serialDescriptor);
        Integer num23 = num14;
        Integer num24 = num15;
        return new VolleyballPlayerSeasonStatistics(i2, i3, str, num19, d2, num20, num21, num17, num18, num11, num9, num8, num22, num10, num12, d, num13, num23, num24, num16, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull VolleyballPlayerSeasonStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        VolleyballPlayerSeasonStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
