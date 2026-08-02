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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/topperformance/topTeams/items/TennisTopTeamsStatisticsItem.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TennisTopTeamsStatisticsItem;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TennisTopTeamsStatisticsItem;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/topperformance/topTeams/items/TennisTopTeamsStatisticsItem;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class TennisTopTeamsStatisticsItem$$serializer implements iw8 {

    @NotNull
    public static final TennisTopTeamsStatisticsItem$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        TennisTopTeamsStatisticsItem$$serializer tennisTopTeamsStatisticsItem$$serializer = new TennisTopTeamsStatisticsItem$$serializer();
        INSTANCE = tennisTopTeamsStatisticsItem$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.topperformance.topTeams.items.TennisTopTeamsStatisticsItem", tennisTopTeamsStatisticsItem$$serializer, 14);
        uyeVar.j("id", false);
        uyeVar.j("matches", false);
        uyeVar.j("firstServePercentage", false);
        uyeVar.j("firstServePointsWonPercentage", false);
        uyeVar.j("secondServePercentage", false);
        uyeVar.j("secondServePointsWonPercentage", false);
        uyeVar.j("avgAces", false);
        uyeVar.j("avgDoubleFaults", false);
        uyeVar.j("breakPointsScored", false);
        uyeVar.j("breakPointsTotal", false);
        uyeVar.j("opponentBreakPointsScored", false);
        uyeVar.j("opponentBreakPointsTotal", false);
        uyeVar.j("tiebreakLosses", false);
        uyeVar.j("tiebreaksWon", false);
        descriptor = uyeVar;
    }

    private TennisTopTeamsStatisticsItem$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        h75 h75Var = h75.a;
        return new KSerializer[]{a7aVar, a7aVar, l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final TennisTopTeamsStatisticsItem deserialize(@NotNull Decoder decoder) {
        int i;
        Double d;
        Integer num;
        Double d2;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i3 = 0;
        Integer num7 = null;
        int i4 = 0;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        Double d8 = null;
        boolean z = true;
        int i5 = 0;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num = num2;
                    d2 = d3;
                    z = false;
                    d3 = d2;
                    num2 = num;
                case 0:
                    num = num2;
                    i2 = i4;
                    i5 = b.l(serialDescriptor, 0);
                    i3 |= 1;
                    d3 = d3;
                    i4 = i2;
                    num2 = num;
                case 1:
                    num = num2;
                    d2 = d3;
                    i3 |= 2;
                    i4 = b.l(serialDescriptor, 1);
                    d3 = d2;
                    num2 = num;
                case 2:
                    i2 = i4;
                    num = num2;
                    d3 = (Double) b.i(serialDescriptor, 2, h75.a, d3);
                    i3 |= 4;
                    i4 = i2;
                    num2 = num;
                case 3:
                    i = i4;
                    d = d3;
                    d4 = (Double) b.i(serialDescriptor, 3, h75.a, d4);
                    i3 |= 8;
                    i4 = i;
                    d3 = d;
                case 4:
                    i = i4;
                    d = d3;
                    d5 = (Double) b.i(serialDescriptor, 4, h75.a, d5);
                    i3 |= 16;
                    i4 = i;
                    d3 = d;
                case 5:
                    i = i4;
                    d = d3;
                    d6 = (Double) b.i(serialDescriptor, 5, h75.a, d6);
                    i3 |= 32;
                    i4 = i;
                    d3 = d;
                case 6:
                    i = i4;
                    d = d3;
                    d7 = (Double) b.i(serialDescriptor, 6, h75.a, d7);
                    i3 |= 64;
                    i4 = i;
                    d3 = d;
                case 7:
                    i = i4;
                    d = d3;
                    d8 = (Double) b.i(serialDescriptor, 7, h75.a, d8);
                    i3 |= 128;
                    i4 = i;
                    d3 = d;
                case 8:
                    i = i4;
                    d = d3;
                    num6 = (Integer) b.i(serialDescriptor, 8, a7a.a, num6);
                    i3 |= NotificationCompat.FLAG_LOCAL_ONLY;
                    i4 = i;
                    d3 = d;
                case 9:
                    i = i4;
                    d = d3;
                    num4 = (Integer) b.i(serialDescriptor, 9, a7a.a, num4);
                    i3 |= 512;
                    i4 = i;
                    d3 = d;
                case 10:
                    i = i4;
                    d = d3;
                    num3 = (Integer) b.i(serialDescriptor, 10, a7a.a, num3);
                    i3 |= 1024;
                    i4 = i;
                    d3 = d;
                case 11:
                    i = i4;
                    d = d3;
                    num2 = (Integer) b.i(serialDescriptor, 11, a7a.a, num2);
                    i3 |= a.o;
                    i4 = i;
                    d3 = d;
                case 12:
                    i = i4;
                    d = d3;
                    num5 = (Integer) b.i(serialDescriptor, 12, a7a.a, num5);
                    i3 |= 4096;
                    i4 = i;
                    d3 = d;
                case 13:
                    i = i4;
                    d = d3;
                    num7 = (Integer) b.i(serialDescriptor, 13, a7a.a, num7);
                    i3 |= 8192;
                    i4 = i;
                    d3 = d;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new TennisTopTeamsStatisticsItem(i3, i5, i4, d3, d4, d5, d6, d7, d8, num6, num4, num3, num2, num5, num7, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull TennisTopTeamsStatisticsItem value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        TennisTopTeamsStatisticsItem.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
