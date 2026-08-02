package com.sofascore.model.newNetwork;

import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/MmaStatisticValues.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/MmaStatisticValues;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/MmaStatisticValues;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class MmaStatisticValues$$serializer implements iw8 {

    @NotNull
    public static final MmaStatisticValues$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MmaStatisticValues$$serializer mmaStatisticValues$$serializer = new MmaStatisticValues$$serializer();
        INSTANCE = mmaStatisticValues$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.MmaStatisticValues", mmaStatisticValues$$serializer, 7);
        uyeVar.j("roundAvg", false);
        uyeVar.j("roundPct", false);
        uyeVar.j("avg15min", false);
        uyeVar.j("pct15min", false);
        uyeVar.j("overall", false);
        uyeVar.j("overallAvg", false);
        uyeVar.j("overallPct", false);
        descriptor = uyeVar;
    }

    private MmaStatisticValues$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        h75 h75Var = h75.a;
        return new KSerializer[]{l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var), l98.W(h75Var)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final MmaStatisticValues deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        Double d4 = null;
        Double d5 = null;
        Double d6 = null;
        Double d7 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    d = (Double) b.i(serialDescriptor, 0, h75.a, d);
                    i |= 1;
                    break;
                case 1:
                    d2 = (Double) b.i(serialDescriptor, 1, h75.a, d2);
                    i |= 2;
                    break;
                case 2:
                    d3 = (Double) b.i(serialDescriptor, 2, h75.a, d3);
                    i |= 4;
                    break;
                case 3:
                    d4 = (Double) b.i(serialDescriptor, 3, h75.a, d4);
                    i |= 8;
                    break;
                case 4:
                    d5 = (Double) b.i(serialDescriptor, 4, h75.a, d5);
                    i |= 16;
                    break;
                case 5:
                    d6 = (Double) b.i(serialDescriptor, 5, h75.a, d6);
                    i |= 32;
                    break;
                case 6:
                    d7 = (Double) b.i(serialDescriptor, 6, h75.a, d7);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MmaStatisticValues(i, d, d2, d3, d4, d5, d6, d7, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MmaStatisticValues value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        MmaStatisticValues.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
