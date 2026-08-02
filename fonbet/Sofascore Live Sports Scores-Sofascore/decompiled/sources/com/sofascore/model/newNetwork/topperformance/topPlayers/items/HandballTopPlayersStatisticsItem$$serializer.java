package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/HandballTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/HandballTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/HandballTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/HandballTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class HandballTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final HandballTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        HandballTopPlayersStatisticsItem$$serializer handballTopPlayersStatisticsItem$$serializer = new HandballTopPlayersStatisticsItem$$serializer();
        INSTANCE = handballTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.HandballTopPlayersStatisticsItem", handballTopPlayersStatisticsItem$$serializer, 15);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("goals", false);
        uyeVar.j("shootingEfficiencyPercentage", false);
        uyeVar.j("assists", false);
        uyeVar.j("goals7m", false);
        uyeVar.j("shots7m", false);
        uyeVar.j("steals", false);
        uyeVar.j("twoMinutePenalties", false);
        uyeVar.j("saves", false);
        uyeVar.j("goalkeeperEfficiencyPercentage", false);
        uyeVar.j("gk7mSaves", false);
        uyeVar.j("gk7mShots", false);
        descriptor = uyeVar;
    }

    private HandballTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, W, uhi.a, l98.W(h75Var), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final HandballTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Double d;
        Integer num;
        Integer num2;
        Double d2;
        Integer num3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Double d3 = null;
        Integer num7 = null;
        int i = 0;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Double d4 = null;
        Integer num11 = null;
        Double d5 = null;
        Integer num12 = null;
        Integer num13 = null;
        boolean z = true;
        int i2 = 0;
        String str = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    d = d4;
                    z = false;
                    num9 = num9;
                    d4 = d;
                case 0:
                    num2 = num4;
                    d2 = d4;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    num9 = num9;
                    d4 = d2;
                    num4 = num2;
                case 1:
                    num2 = num4;
                    d2 = d4;
                    num9 = (Integer) b.i(serialDescriptor, 1, a7a.a, num9);
                    i |= 2;
                    d4 = d2;
                    num4 = num2;
                case 2:
                    num2 = num4;
                    num3 = num9;
                    str = b.n(serialDescriptor, 2);
                    i |= 4;
                    num9 = num3;
                    num4 = num2;
                case 3:
                    num3 = num9;
                    num2 = num4;
                    d4 = (Double) b.i(serialDescriptor, 3, h75.a, d4);
                    i |= 8;
                    num9 = num3;
                    num4 = num2;
                case 4:
                    num = num9;
                    d = d4;
                    num11 = (Integer) b.i(serialDescriptor, 4, a7a.a, num11);
                    i |= 16;
                    num9 = num;
                    d4 = d;
                case 5:
                    num = num9;
                    d = d4;
                    d5 = (Double) b.i(serialDescriptor, 5, h75.a, d5);
                    i |= 32;
                    num9 = num;
                    d4 = d;
                case 6:
                    num = num9;
                    d = d4;
                    num12 = (Integer) b.i(serialDescriptor, 6, a7a.a, num12);
                    i |= 64;
                    num9 = num;
                    d4 = d;
                case 7:
                    num = num9;
                    d = d4;
                    num13 = (Integer) b.i(serialDescriptor, 7, a7a.a, num13);
                    i |= 128;
                    num9 = num;
                    d4 = d;
                case 8:
                    num = num9;
                    d = d4;
                    num7 = (Integer) b.i(serialDescriptor, 8, a7a.a, num7);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num9 = num;
                    d4 = d;
                case 9:
                    num = num9;
                    d = d4;
                    num6 = (Integer) b.i(serialDescriptor, 9, a7a.a, num6);
                    i |= 512;
                    num9 = num;
                    d4 = d;
                case 10:
                    num = num9;
                    d = d4;
                    num5 = (Integer) b.i(serialDescriptor, 10, a7a.a, num5);
                    i |= 1024;
                    num9 = num;
                    d4 = d;
                case 11:
                    num = num9;
                    d = d4;
                    num4 = (Integer) b.i(serialDescriptor, 11, a7a.a, num4);
                    i |= a.o;
                    num9 = num;
                    d4 = d;
                case 12:
                    num = num9;
                    d = d4;
                    d3 = (Double) b.i(serialDescriptor, 12, h75.a, d3);
                    i |= 4096;
                    num9 = num;
                    d4 = d;
                case 13:
                    num = num9;
                    d = d4;
                    num8 = (Integer) b.i(serialDescriptor, 13, a7a.a, num8);
                    i |= 8192;
                    num9 = num;
                    d4 = d;
                case 14:
                    num = num9;
                    d = d4;
                    num10 = (Integer) b.i(serialDescriptor, 14, a7a.a, num10);
                    i |= 16384;
                    num9 = num;
                    d4 = d;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Double d6 = d4;
        Integer num14 = num9;
        b.c(serialDescriptor);
        return new HandballTopPlayersStatisticsItem(i, i2, num14, str, d6, num11, d5, num12, num13, num7, num6, num5, num4, d3, num8, num10, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull HandballTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        HandballTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
