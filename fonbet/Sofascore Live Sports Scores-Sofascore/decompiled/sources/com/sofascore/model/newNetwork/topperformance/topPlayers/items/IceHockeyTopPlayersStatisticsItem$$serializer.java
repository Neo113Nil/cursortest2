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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/IceHockeyTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/IceHockeyTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/IceHockeyTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/IceHockeyTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class IceHockeyTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final IceHockeyTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        IceHockeyTopPlayersStatisticsItem$$serializer iceHockeyTopPlayersStatisticsItem$$serializer = new IceHockeyTopPlayersStatisticsItem$$serializer();
        INSTANCE = iceHockeyTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.IceHockeyTopPlayersStatisticsItem", iceHockeyTopPlayersStatisticsItem$$serializer, 25);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("points", false);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("powerPlayGoals", false);
        uyeVar.j("shortHandedGoals", false);
        uyeVar.j("powerPlayAssists", false);
        uyeVar.j("shortHandedAssists", false);
        uyeVar.j("shotPercentage", false);
        uyeVar.j("faceOffPercentage", false);
        uyeVar.j("plusMinus", false);
        uyeVar.j("timeOnIce", false);
        uyeVar.j("blocked", false);
        uyeVar.j("hits", false);
        uyeVar.j("penaltyMinutes", false);
        uyeVar.j("goalsAgainstAverage", false);
        uyeVar.j("savePercentage", false);
        uyeVar.j("shutouts", false);
        uyeVar.j("evenSavePercentage", false);
        uyeVar.j("powerPlaySavePercentage", false);
        uyeVar.j("shortHandedSavePercentage", false);
        uyeVar.j("wins", false);
        descriptor = uyeVar;
    }

    private IceHockeyTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, W, uhi.a, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final IceHockeyTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Double d;
        Integer num;
        int i;
        Integer num2;
        Double d2;
        Integer num3;
        Double d3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num4 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        int i2 = 0;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Double d8 = null;
        Double d9 = null;
        Integer num10 = null;
        boolean z = true;
        int i3 = 0;
        String str = null;
        Integer num11 = null;
        Double d10 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        Double d11 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    z = false;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 0:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    i3 = b.l(serialDescriptor, 0);
                    i2 |= 1;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 1:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num11 = (Integer) b.i(serialDescriptor, 1, a7a.a, num11);
                    i2 |= 2;
                    d10 = d10;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 2:
                    num2 = num4;
                    d3 = d6;
                    str = b.n(serialDescriptor, 2);
                    i2 |= 4;
                    d6 = d3;
                    num4 = num2;
                case 3:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    d10 = (Double) b.i(serialDescriptor, 3, h75.a, d10);
                    i2 |= 8;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 4:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num12 = (Integer) b.i(serialDescriptor, 4, a7a.a, num12);
                    i2 |= 16;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 5:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num13 = (Integer) b.i(serialDescriptor, 5, a7a.a, num13);
                    i2 |= 32;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 6:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num14 = (Integer) b.i(serialDescriptor, 6, a7a.a, num14);
                    i2 |= 64;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 7:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num15 = (Integer) b.i(serialDescriptor, 7, a7a.a, num15);
                    i2 |= 128;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 8:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num16 = (Integer) b.i(serialDescriptor, 8, a7a.a, num16);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 9:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num17 = (Integer) b.i(serialDescriptor, 9, a7a.a, num17);
                    i2 |= 512;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 10:
                    num2 = num4;
                    d2 = d6;
                    num3 = num5;
                    num18 = (Integer) b.i(serialDescriptor, 10, a7a.a, num18);
                    i2 |= 1024;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 11:
                    num2 = num4;
                    num3 = num5;
                    d2 = d6;
                    d11 = (Double) b.i(serialDescriptor, 11, h75.a, d11);
                    i2 |= a.o;
                    d6 = d2;
                    num5 = num3;
                    num4 = num2;
                case 12:
                    num2 = num4;
                    num3 = num5;
                    d6 = (Double) b.i(serialDescriptor, 12, h75.a, d6);
                    i2 |= 4096;
                    num5 = num3;
                    num4 = num2;
                case 13:
                    d3 = d6;
                    num2 = num4;
                    num5 = (Integer) b.i(serialDescriptor, 13, a7a.a, num5);
                    i2 |= 8192;
                    d6 = d3;
                    num4 = num2;
                case 14:
                    d = d6;
                    num = num5;
                    num7 = (Integer) b.i(serialDescriptor, 14, a7a.a, num7);
                    i2 |= 16384;
                    d6 = d;
                    num5 = num;
                case 15:
                    d = d6;
                    num = num5;
                    num6 = (Integer) b.i(serialDescriptor, 15, a7a.a, num6);
                    i = 32768;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 16:
                    d = d6;
                    num = num5;
                    num8 = (Integer) b.i(serialDescriptor, 16, a7a.a, num8);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 17:
                    d = d6;
                    num = num5;
                    num9 = (Integer) b.i(serialDescriptor, 17, a7a.a, num9);
                    i = 131072;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 18:
                    d = d6;
                    num = num5;
                    d8 = (Double) b.i(serialDescriptor, 18, h75.a, d8);
                    i = 262144;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 19:
                    d = d6;
                    num = num5;
                    d9 = (Double) b.i(serialDescriptor, 19, h75.a, d9);
                    i = 524288;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 20:
                    d = d6;
                    num = num5;
                    num10 = (Integer) b.i(serialDescriptor, 20, a7a.a, num10);
                    i = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 21:
                    d = d6;
                    num = num5;
                    d7 = (Double) b.i(serialDescriptor, 21, h75.a, d7);
                    i = 2097152;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 22:
                    d = d6;
                    num = num5;
                    d5 = (Double) b.i(serialDescriptor, 22, h75.a, d5);
                    i = 4194304;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 23:
                    d = d6;
                    num = num5;
                    d4 = (Double) b.i(serialDescriptor, 23, h75.a, d4);
                    i = 8388608;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                case 24:
                    d = d6;
                    num = num5;
                    num4 = (Integer) b.i(serialDescriptor, 24, a7a.a, num4);
                    i = C.DEFAULT_MUXED_BUFFER_SIZE;
                    i2 |= i;
                    d6 = d;
                    num5 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num19 = num4;
        Integer num20 = num5;
        Integer num21 = num11;
        Double d12 = d10;
        b.c(serialDescriptor);
        int i4 = i3;
        Integer num22 = num18;
        Integer num23 = num10;
        Integer num24 = num15;
        Integer num25 = num9;
        return new IceHockeyTopPlayersStatisticsItem(i2, i4, num21, str, d12, num12, num13, num14, num24, num16, num17, num22, d11, d6, num20, num7, num6, num8, num25, d8, d9, num23, d7, d5, d4, num19, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull IceHockeyTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        IceHockeyTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
