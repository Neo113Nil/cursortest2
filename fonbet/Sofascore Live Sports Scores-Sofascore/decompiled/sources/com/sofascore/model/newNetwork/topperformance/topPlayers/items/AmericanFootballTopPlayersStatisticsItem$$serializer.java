package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/AmericanFootballTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class AmericanFootballTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final AmericanFootballTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AmericanFootballTopPlayersStatisticsItem$$serializer americanFootballTopPlayersStatisticsItem$$serializer = new AmericanFootballTopPlayersStatisticsItem$$serializer();
        INSTANCE = americanFootballTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.AmericanFootballTopPlayersStatisticsItem", americanFootballTopPlayersStatisticsItem$$serializer, 17);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("passingTouchdowns", false);
        uyeVar.j("rushingTouchdowns", false);
        uyeVar.j("receivingTouchdowns", false);
        uyeVar.j("passingCompletionPercentage", false);
        uyeVar.j("passingCompletions", false);
        uyeVar.j("passingTouchdownInterceptionRatio", false);
        uyeVar.j("rushingYardsPerAttempt", false);
        uyeVar.j("receivingYardsPerReception", false);
        uyeVar.j("defensiveInterceptions", false);
        uyeVar.j("defensiveTotalTackles", false);
        uyeVar.j("defensiveSacks", false);
        uyeVar.j("kickingFgMade", false);
        uyeVar.j("kickingFgAttempts", false);
        descriptor = uyeVar;
    }

    private AmericanFootballTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, W, uhi.a, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final AmericanFootballTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        int i;
        Double d;
        Integer num3;
        Integer num4;
        Integer num5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Integer num6 = null;
        Integer num7 = null;
        int i2 = 0;
        Integer num8 = null;
        Integer num9 = null;
        Double d5 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Double d6 = null;
        boolean z = true;
        int i3 = 0;
        String str = null;
        Integer num14 = null;
        Double d7 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    d = d2;
                    num3 = num11;
                    num4 = num12;
                    z = false;
                    num11 = num3;
                    num12 = num4;
                    d2 = d;
                case 0:
                    d = d2;
                    num3 = num11;
                    num4 = num12;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    num11 = num3;
                    num12 = num4;
                    d2 = d;
                case 1:
                    d = d2;
                    num3 = num11;
                    num4 = num12;
                    num14 = (Integer) b.i(serialDescriptor, 1, a7a.a, num14);
                    i2 |= 2;
                    d7 = d7;
                    num11 = num3;
                    num12 = num4;
                    d2 = d;
                case 2:
                    d = d2;
                    num5 = num11;
                    str = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    num11 = num5;
                    d2 = d;
                case 3:
                    d = d2;
                    num4 = num12;
                    num3 = num11;
                    d7 = (Double) b.i(serialDescriptor, 3, h75.a, d7);
                    i2 |= 8;
                    num11 = num3;
                    num12 = num4;
                    d2 = d;
                case 4:
                    d = d2;
                    num4 = num12;
                    num11 = (Integer) b.i(serialDescriptor, 4, a7a.a, num11);
                    i2 |= 16;
                    num12 = num4;
                    d2 = d;
                case 5:
                    num5 = num11;
                    d = d2;
                    num12 = (Integer) b.i(serialDescriptor, 5, a7a.a, num12);
                    i2 |= 32;
                    num11 = num5;
                    d2 = d;
                case 6:
                    num = num11;
                    num2 = num12;
                    num13 = (Integer) b.i(serialDescriptor, 6, a7a.a, num13);
                    i2 |= 64;
                    num11 = num;
                    num12 = num2;
                case 7:
                    num = num11;
                    num2 = num12;
                    d6 = (Double) b.i(serialDescriptor, 7, h75.a, d6);
                    i2 |= 128;
                    num11 = num;
                    num12 = num2;
                case 8:
                    num = num11;
                    num2 = num12;
                    num7 = (Integer) b.i(serialDescriptor, 8, a7a.a, num7);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num11 = num;
                    num12 = num2;
                case 9:
                    num = num11;
                    num2 = num12;
                    d4 = (Double) b.i(serialDescriptor, 9, h75.a, d4);
                    i2 |= 512;
                    num11 = num;
                    num12 = num2;
                case 10:
                    num = num11;
                    num2 = num12;
                    d3 = (Double) b.i(serialDescriptor, 10, h75.a, d3);
                    i2 |= 1024;
                    num11 = num;
                    num12 = num2;
                case 11:
                    num = num11;
                    num2 = num12;
                    d2 = (Double) b.i(serialDescriptor, 11, h75.a, d2);
                    i2 |= a.o;
                    num11 = num;
                    num12 = num2;
                case 12:
                    num = num11;
                    num2 = num12;
                    num6 = (Integer) b.i(serialDescriptor, 12, a7a.a, num6);
                    i2 |= 4096;
                    num11 = num;
                    num12 = num2;
                case 13:
                    num = num11;
                    num2 = num12;
                    num8 = (Integer) b.i(serialDescriptor, 13, a7a.a, num8);
                    i2 |= 8192;
                    num11 = num;
                    num12 = num2;
                case 14:
                    num = num11;
                    num2 = num12;
                    d5 = (Double) b.i(serialDescriptor, 14, h75.a, d5);
                    i2 |= 16384;
                    num11 = num;
                    num12 = num2;
                case 15:
                    num = num11;
                    num2 = num12;
                    num9 = (Integer) b.i(serialDescriptor, 15, a7a.a, num9);
                    i = 32768;
                    i2 |= i;
                    num11 = num;
                    num12 = num2;
                case 16:
                    num = num11;
                    num2 = num12;
                    num10 = (Integer) b.i(serialDescriptor, 16, a7a.a, num10);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    num11 = num;
                    num12 = num2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num15 = num11;
        Integer num16 = num12;
        Integer num17 = num14;
        Double d8 = d7;
        b.c(serialDescriptor);
        return new AmericanFootballTopPlayersStatisticsItem(i2, i3, num17, str, d8, num15, num16, num13, d6, num7, d4, d3, d2, num6, num8, d5, num9, num10, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AmericanFootballTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        AmericanFootballTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
