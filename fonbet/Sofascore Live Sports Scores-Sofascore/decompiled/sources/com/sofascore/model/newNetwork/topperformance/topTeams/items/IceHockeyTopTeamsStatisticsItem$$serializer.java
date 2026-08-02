package com.sofascore.model.newNetwork.topperformance.topTeams.items;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topTeams/items/IceHockeyTopTeamsStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/IceHockeyTopTeamsStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/IceHockeyTopTeamsStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/IceHockeyTopTeamsStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class IceHockeyTopTeamsStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final IceHockeyTopTeamsStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        IceHockeyTopTeamsStatisticsItem$$serializer iceHockeyTopTeamsStatisticsItem$$serializer = new IceHockeyTopTeamsStatisticsItem$$serializer();
        INSTANCE = iceHockeyTopTeamsStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topTeams.items.IceHockeyTopTeamsStatisticsItem", iceHockeyTopTeamsStatisticsItem$$serializer, 12);
        uyeVar.j("id", false);
        uyeVar.j("matches", false);
        uyeVar.j("powerPlayPercentage", false);
        uyeVar.j("penaltyKillPercentage", false);
        uyeVar.j("goals", false);
        uyeVar.j("goalsAgainst", false);
        uyeVar.j("shots", false);
        uyeVar.j("shotsAgainst", false);
        uyeVar.j("hits", false);
        uyeVar.j("blocks", false);
        uyeVar.j("faceOffPercentage", false);
        uyeVar.j("penaltyMinutes", false);
        descriptor = uyeVar;
    }

    private IceHockeyTopTeamsStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, a7aVar, l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(h75Var), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final IceHockeyTopTeamsStatisticsItem deserialize(@NotNull Decoder decoder) {
        int i;
        boolean z;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num = null;
        Double d = null;
        Integer num2 = null;
        boolean z3 = true;
        Integer num3 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        Double d2 = null;
        Double d3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        while (z3) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    i = i3;
                    z3 = false;
                    i3 = i;
                case 0:
                    z2 = z3;
                    i2 |= 1;
                    i3 = b.l(serialDescriptor, 0);
                    z3 = z2;
                case 1:
                    z2 = z3;
                    i4 = b.l(serialDescriptor, 1);
                    i2 |= 2;
                    z3 = z2;
                case 2:
                    z = z3;
                    i = i3;
                    d2 = (Double) b.i(serialDescriptor, 2, h75.a, d2);
                    i2 |= 4;
                    z3 = z;
                    i3 = i;
                case 3:
                    z = z3;
                    i = i3;
                    d3 = (Double) b.i(serialDescriptor, 3, h75.a, d3);
                    i2 |= 8;
                    z3 = z;
                    i3 = i;
                case 4:
                    z = z3;
                    i = i3;
                    num4 = (Integer) b.i(serialDescriptor, 4, a7a.a, num4);
                    i2 |= 16;
                    z3 = z;
                    i3 = i;
                case 5:
                    z = z3;
                    i = i3;
                    num5 = (Integer) b.i(serialDescriptor, 5, a7a.a, num5);
                    i2 |= 32;
                    z3 = z;
                    i3 = i;
                case 6:
                    z = z3;
                    i = i3;
                    num6 = (Integer) b.i(serialDescriptor, 6, a7a.a, num6);
                    i2 |= 64;
                    z3 = z;
                    i3 = i;
                case 7:
                    z = z3;
                    i = i3;
                    num7 = (Integer) b.i(serialDescriptor, 7, a7a.a, num7);
                    i2 |= 128;
                    z3 = z;
                    i3 = i;
                case 8:
                    z = z3;
                    i = i3;
                    num3 = (Integer) b.i(serialDescriptor, 8, a7a.a, num3);
                    i2 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z;
                    i3 = i;
                case 9:
                    z = z3;
                    i = i3;
                    num2 = (Integer) b.i(serialDescriptor, 9, a7a.a, num2);
                    i2 |= 512;
                    z3 = z;
                    i3 = i;
                case 10:
                    z = z3;
                    i = i3;
                    d = (Double) b.i(serialDescriptor, 10, h75.a, d);
                    i2 |= 1024;
                    z3 = z;
                    i3 = i;
                case 11:
                    z = z3;
                    i = i3;
                    num = (Integer) b.i(serialDescriptor, 11, a7a.a, num);
                    i2 |= a.o;
                    z3 = z;
                    i3 = i;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new IceHockeyTopTeamsStatisticsItem(i2, i3, i4, d2, d3, num4, num5, num6, num7, num3, num2, d, num, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull IceHockeyTopTeamsStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        IceHockeyTopTeamsStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
