package com.sofascore.model.newNetwork;

import com.ironsource.U3;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sofascore/model/newNetwork/MmaStatisticClass.$serializer", "Liw8;", "Lcom/sofascore/model/newNetwork/MmaStatisticClass;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", U3.i.X, "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sofascore/model/newNetwork/MmaStatisticClass;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sofascore/model/newNetwork/MmaStatisticClass;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@wx4
/* loaded from: classes5.dex */
public final /* synthetic */ class MmaStatisticClass$$serializer implements iw8 {

    @NotNull
    public static final MmaStatisticClass$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MmaStatisticClass$$serializer mmaStatisticClass$$serializer = new MmaStatisticClass$$serializer();
        INSTANCE = mmaStatisticClass$$serializer;
        uye uyeVar = new uye("com.sofascore.model.newNetwork.MmaStatisticClass", mmaStatisticClass$$serializer, 6);
        uyeVar.j("attempted", false);
        uyeVar.j("landed", false);
        uyeVar.j("defended", false);
        uyeVar.j("succeeded", false);
        uyeVar.j("general", false);
        uyeVar.j("control", false);
        descriptor = uyeVar;
    }

    private MmaStatisticClass$$serializer() {
    }

    @Override // defpackage.iw8
    @NotNull
    public final KSerializer[] childSerializers() {
        MmaStatisticValues$$serializer mmaStatisticValues$$serializer = MmaStatisticValues$$serializer.INSTANCE;
        return new KSerializer[]{l98.W(mmaStatisticValues$$serializer), l98.W(mmaStatisticValues$$serializer), l98.W(mmaStatisticValues$$serializer), l98.W(mmaStatisticValues$$serializer), l98.W(mmaStatisticValues$$serializer), l98.W(mmaStatisticValues$$serializer)};
    }

    @Override // defpackage.dy4
    @NotNull
    public final MmaStatisticClass deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        MmaStatisticValues mmaStatisticValues = null;
        MmaStatisticValues mmaStatisticValues2 = null;
        MmaStatisticValues mmaStatisticValues3 = null;
        MmaStatisticValues mmaStatisticValues4 = null;
        MmaStatisticValues mmaStatisticValues5 = null;
        MmaStatisticValues mmaStatisticValues6 = null;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    mmaStatisticValues = (MmaStatisticValues) b.i(serialDescriptor, 0, MmaStatisticValues$$serializer.INSTANCE, mmaStatisticValues);
                    i |= 1;
                    break;
                case 1:
                    mmaStatisticValues2 = (MmaStatisticValues) b.i(serialDescriptor, 1, MmaStatisticValues$$serializer.INSTANCE, mmaStatisticValues2);
                    i |= 2;
                    break;
                case 2:
                    mmaStatisticValues3 = (MmaStatisticValues) b.i(serialDescriptor, 2, MmaStatisticValues$$serializer.INSTANCE, mmaStatisticValues3);
                    i |= 4;
                    break;
                case 3:
                    mmaStatisticValues4 = (MmaStatisticValues) b.i(serialDescriptor, 3, MmaStatisticValues$$serializer.INSTANCE, mmaStatisticValues4);
                    i |= 8;
                    break;
                case 4:
                    mmaStatisticValues5 = (MmaStatisticValues) b.i(serialDescriptor, 4, MmaStatisticValues$$serializer.INSTANCE, mmaStatisticValues5);
                    i |= 16;
                    break;
                case 5:
                    mmaStatisticValues6 = (MmaStatisticValues) b.i(serialDescriptor, 5, MmaStatisticValues$$serializer.INSTANCE, mmaStatisticValues6);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new MmaStatisticClass(i, mmaStatisticValues, mmaStatisticValues2, mmaStatisticValues3, mmaStatisticValues4, mmaStatisticValues5, mmaStatisticValues6, null);
    }

    @Override // defpackage.dy4
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MmaStatisticClass value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        MmaStatisticClass.write$Self$model_release(value, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.iw8
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
