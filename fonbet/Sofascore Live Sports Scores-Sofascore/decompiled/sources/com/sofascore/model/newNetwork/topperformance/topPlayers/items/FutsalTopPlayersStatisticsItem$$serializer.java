package com.sofascore.model.newNetwork.topperformance.topPlayers.items;

import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topPlayers/items/FutsalTopPlayersStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FutsalTopPlayersStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FutsalTopPlayersStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topPlayers/items/FutsalTopPlayersStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class FutsalTopPlayersStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final FutsalTopPlayersStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        FutsalTopPlayersStatisticsItem$$serializer futsalTopPlayersStatisticsItem$$serializer = new FutsalTopPlayersStatisticsItem$$serializer();
        INSTANCE = futsalTopPlayersStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topPlayers.items.FutsalTopPlayersStatisticsItem", futsalTopPlayersStatisticsItem$$serializer, 8);
        uyeVar.j("id", false);
        uyeVar.j("appearances", false);
        uyeVar.j("type", false);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("goals", false);
        uyeVar.j("assists", false);
        uyeVar.j("yellowCards", false);
        uyeVar.j("redCards", false);
        descriptor = uyeVar;
    }

    private FutsalTopPlayersStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, l98.W(a7aVar), uhi.a, l98.W(h75.a), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final FutsalTopPlayersStatisticsItem deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        FutsalTopPlayersStatisticsItem futsalTopPlayersStatisticsItem = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Integer num = null;
        String str = null;
        Double d = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) b.i(serialDescriptor, 1, a7a.a, num);
                    i |= 2;
                    break;
                case 2:
                    str = b.n(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) b.i(serialDescriptor, 3, h75.a, d);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) b.i(serialDescriptor, 4, a7a.a, num2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) b.i(serialDescriptor, 5, a7a.a, num3);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) b.i(serialDescriptor, 6, a7a.a, num4);
                    i |= 64;
                    break;
                case 7:
                    num5 = (Integer) b.i(serialDescriptor, 7, a7a.a, num5);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return futsalTopPlayersStatisticsItem;
            }
            futsalTopPlayersStatisticsItem = null;
        }
        b.c(serialDescriptor);
        return new FutsalTopPlayersStatisticsItem(i, i2, num, str, d, num2, num3, num4, num5, (t5h) null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull FutsalTopPlayersStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        FutsalTopPlayersStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
