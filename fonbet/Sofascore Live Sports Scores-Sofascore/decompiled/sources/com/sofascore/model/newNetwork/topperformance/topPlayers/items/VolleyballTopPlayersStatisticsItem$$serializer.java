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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/VolleyballTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class VolleyballTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final VolleyballTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VolleyballTopPlayersStatisticsItem$$serializer volleyballTopPlayersStatisticsItem$$serializer = new VolleyballTopPlayersStatisticsItem$$serializer();
        INSTANCE = volleyballTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.VolleyballTopPlayersStatisticsItem", volleyballTopPlayersStatisticsItem$$serializer, 14);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("pointsTotal", false);
        uyeVar.j("aces", false);
        uyeVar.j("serveEfficiency", false);
        uyeVar.j("blockPoints", false);
        uyeVar.j("attackPoints", false);
        uyeVar.j("attacksEfficiency", false);
        uyeVar.j("attackErrors", false);
        uyeVar.j("serveErrors", false);
        uyeVar.j("receptionErrors", false);
        uyeVar.j("attacksBlocked", false);
        descriptor = uyeVar;
    }

    private VolleyballTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, W, uhi.a, l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final VolleyballTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        Integer num;
        String str;
        Integer num2;
        String str2;
        Integer num3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num4 = null;
        Integer num5 = null;
        Double d = null;
        Integer num6 = null;
        Integer num7 = null;
        int i = 0;
        Integer num8 = null;
        Integer num9 = null;
        String str3 = null;
        Double d2 = null;
        Integer num10 = null;
        Integer num11 = null;
        Double d3 = null;
        Integer num12 = null;
        boolean z = true;
        int i2 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num2 = num4;
                    str2 = str3;
                    num3 = num9;
                    z = false;
                    num9 = num3;
                    num4 = num2;
                    str3 = str2;
                case 0:
                    num2 = num4;
                    str2 = str3;
                    num3 = num9;
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    num9 = num3;
                    num4 = num2;
                    str3 = str2;
                case 1:
                    str2 = str3;
                    num2 = num4;
                    num9 = (Integer) b.i(serialDescriptor, 1, a7a.a, num9);
                    i |= 2;
                    num4 = num2;
                    str3 = str2;
                case 2:
                    num = num9;
                    str3 = b.n(serialDescriptor, 2);
                    i |= 4;
                    num9 = num;
                case 3:
                    num = num9;
                    str = str3;
                    d2 = (Double) b.i(serialDescriptor, 3, h75.a, d2);
                    i |= 8;
                    str3 = str;
                    num9 = num;
                case 4:
                    num = num9;
                    str = str3;
                    num10 = (Integer) b.i(serialDescriptor, 4, a7a.a, num10);
                    i |= 16;
                    str3 = str;
                    num9 = num;
                case 5:
                    num = num9;
                    str = str3;
                    num11 = (Integer) b.i(serialDescriptor, 5, a7a.a, num11);
                    i |= 32;
                    str3 = str;
                    num9 = num;
                case 6:
                    num = num9;
                    str = str3;
                    d3 = (Double) b.i(serialDescriptor, 6, h75.a, d3);
                    i |= 64;
                    str3 = str;
                    num9 = num;
                case 7:
                    num = num9;
                    str = str3;
                    num12 = (Integer) b.i(serialDescriptor, 7, a7a.a, num12);
                    i |= 128;
                    str3 = str;
                    num9 = num;
                case 8:
                    num = num9;
                    str = str3;
                    num7 = (Integer) b.i(serialDescriptor, 8, a7a.a, num7);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    str3 = str;
                    num9 = num;
                case 9:
                    num = num9;
                    str = str3;
                    d = (Double) b.i(serialDescriptor, 9, h75.a, d);
                    i |= 512;
                    str3 = str;
                    num9 = num;
                case 10:
                    num = num9;
                    str = str3;
                    num5 = (Integer) b.i(serialDescriptor, 10, a7a.a, num5);
                    i |= 1024;
                    str3 = str;
                    num9 = num;
                case 11:
                    num = num9;
                    str = str3;
                    num4 = (Integer) b.i(serialDescriptor, 11, a7a.a, num4);
                    i |= a.o;
                    str3 = str;
                    num9 = num;
                case 12:
                    num = num9;
                    str = str3;
                    num6 = (Integer) b.i(serialDescriptor, 12, a7a.a, num6);
                    i |= 4096;
                    str3 = str;
                    num9 = num;
                case 13:
                    str = str3;
                    num = num9;
                    num8 = (Integer) b.i(serialDescriptor, 13, a7a.a, num8);
                    i |= 8192;
                    str3 = str;
                    num9 = num;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        String str4 = str3;
        Integer num13 = num9;
        b.c(serialDescriptor);
        return new VolleyballTopPlayersStatisticsItem(i, i2, num13, str4, d2, num10, num11, d3, num12, num7, d, num5, num4, num6, num8, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull VolleyballTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        VolleyballTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
