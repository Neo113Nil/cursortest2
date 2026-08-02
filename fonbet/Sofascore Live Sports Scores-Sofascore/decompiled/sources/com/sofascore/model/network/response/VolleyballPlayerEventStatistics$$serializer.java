package com.sofascore.model.network.response;

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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/network/response/VolleyballPlayerEventStatistics.$serializer", "Liw8;", "Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/network/response/VolleyballPlayerEventStatistics;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class VolleyballPlayerEventStatistics$$serializer implements iw8 {

    @NotNull
    public static final VolleyballPlayerEventStatistics$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        VolleyballPlayerEventStatistics$$serializer volleyballPlayerEventStatistics$$serializer = new VolleyballPlayerEventStatistics$$serializer();
        INSTANCE = volleyballPlayerEventStatistics$$serializer;
        uye uyeVar = new uye("com.sofascore.model.network.response.VolleyballPlayerEventStatistics", volleyballPlayerEventStatistics$$serializer, 15);
        uyeVar.j("pointsTotal", false);
        uyeVar.j("breakPoints", false);
        uyeVar.j("winLoss", false);
        uyeVar.j("blockPoints", false);
        uyeVar.j("serves", false);
        uyeVar.j("serveErrors", false);
        uyeVar.j("aces", false);
        uyeVar.j("receptionsTotal", false);
        uyeVar.j("receptionErrors", false);
        uyeVar.j("receptionPositivity", false);
        uyeVar.j("receptionPerf", false);
        uyeVar.j("attacksTotal", false);
        uyeVar.j("attackErrors", false);
        uyeVar.j("attacksBlocked", false);
        uyeVar.j("attackPoints", false);
        descriptor = uyeVar;
    }

    private VolleyballPlayerEventStatistics$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(a7aVar);
        KSerializer W4 = l98.W(a7aVar);
        KSerializer W5 = l98.W(a7aVar);
        KSerializer W6 = l98.W(a7aVar);
        KSerializer W7 = l98.W(a7aVar);
        KSerializer W8 = l98.W(a7aVar);
        KSerializer W9 = l98.W(a7aVar);
        h75 h75Var = h75.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, W7, W8, W9, l98.W(h75Var), l98.W(h75Var), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final VolleyballPlayerEventStatistics deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        Integer num7 = null;
        Double d = null;
        Double d2 = null;
        Integer num8 = null;
        Integer num9 = null;
        int i = 0;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        boolean z = true;
        Integer num18 = null;
        Integer num19 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    num3 = num7;
                    num4 = num13;
                    num5 = num18;
                    z = false;
                    d = d;
                    num13 = num4;
                    num18 = num5;
                    num7 = num3;
                case 0:
                    num3 = num7;
                    num4 = num13;
                    num5 = (Integer) b.i(serialDescriptor, 0, a7a.a, num18);
                    i |= 1;
                    d = d;
                    num12 = num12;
                    num13 = num4;
                    num18 = num5;
                    num7 = num3;
                case 1:
                    num3 = num7;
                    num6 = num13;
                    num19 = (Integer) b.i(serialDescriptor, 1, a7a.a, num19);
                    i |= 2;
                    num12 = num12;
                    num13 = num6;
                    num7 = num3;
                case 2:
                    num3 = num7;
                    num6 = num13;
                    num12 = (Integer) b.i(serialDescriptor, 2, a7a.a, num12);
                    i |= 4;
                    num13 = num6;
                    num7 = num3;
                case 3:
                    num3 = num7;
                    num13 = (Integer) b.i(serialDescriptor, 3, a7a.a, num13);
                    i |= 8;
                    num12 = num12;
                    num7 = num3;
                case 4:
                    num = num12;
                    num2 = num13;
                    num14 = (Integer) b.i(serialDescriptor, 4, a7a.a, num14);
                    i |= 16;
                    num12 = num;
                    num13 = num2;
                case 5:
                    num = num12;
                    num2 = num13;
                    num15 = (Integer) b.i(serialDescriptor, 5, a7a.a, num15);
                    i |= 32;
                    num12 = num;
                    num13 = num2;
                case 6:
                    num = num12;
                    num2 = num13;
                    num16 = (Integer) b.i(serialDescriptor, 6, a7a.a, num16);
                    i |= 64;
                    num12 = num;
                    num13 = num2;
                case 7:
                    num = num12;
                    num2 = num13;
                    num17 = (Integer) b.i(serialDescriptor, 7, a7a.a, num17);
                    i |= 128;
                    num12 = num;
                    num13 = num2;
                case 8:
                    num = num12;
                    num2 = num13;
                    num9 = (Integer) b.i(serialDescriptor, 8, a7a.a, num9);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    num12 = num;
                    num13 = num2;
                case 9:
                    num = num12;
                    num2 = num13;
                    d2 = (Double) b.i(serialDescriptor, 9, h75.a, d2);
                    i |= 512;
                    num12 = num;
                    num13 = num2;
                case 10:
                    num = num12;
                    num2 = num13;
                    d = (Double) b.i(serialDescriptor, 10, h75.a, d);
                    i |= 1024;
                    num12 = num;
                    num13 = num2;
                case 11:
                    num = num12;
                    num2 = num13;
                    num7 = (Integer) b.i(serialDescriptor, 11, a7a.a, num7);
                    i |= a.o;
                    num12 = num;
                    num13 = num2;
                case 12:
                    num = num12;
                    num2 = num13;
                    num8 = (Integer) b.i(serialDescriptor, 12, a7a.a, num8);
                    i |= 4096;
                    num12 = num;
                    num13 = num2;
                case 13:
                    num = num12;
                    num2 = num13;
                    num10 = (Integer) b.i(serialDescriptor, 13, a7a.a, num10);
                    i |= 8192;
                    num12 = num;
                    num13 = num2;
                case 14:
                    num = num12;
                    num2 = num13;
                    num11 = (Integer) b.i(serialDescriptor, 14, a7a.a, num11);
                    i |= 16384;
                    num12 = num;
                    num13 = num2;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Integer num20 = num7;
        Integer num21 = num13;
        b.c(serialDescriptor);
        return new VolleyballPlayerEventStatistics(i, num18, num19, num12, num21, num14, num15, num16, num17, num9, d2, d, num20, num8, num10, num11, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull VolleyballPlayerEventStatistics value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        VolleyballPlayerEventStatistics.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
