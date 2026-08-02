package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class gt1 implements iw8 {
    public static final gt1 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        gt1 gt1Var = new gt1();
        a = gt1Var;
        uye uyeVar = new uye("com.sofascore.results.event.scorecard.adapter.BatsmanExtraRow", gt1Var, 7);
        uyeVar.j("extra", false);
        uyeVar.j("wide", false);
        uyeVar.j("noBall", false);
        uyeVar.j("bye", false);
        uyeVar.j("legBye", false);
        uyeVar.j("penalty", false);
        uyeVar.j("isLastItemInGroup", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar, gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z2 = false;
        while (z) {
            int o = b.o(serialDescriptor);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = b.l(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = b.l(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i4 = b.l(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i5 = b.l(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i6 = b.l(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i7 = b.l(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.B(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new it1(i, i2, i3, i4, i5, i6, i7, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        it1 it1Var = (it1) obj;
        encoder.getClass();
        it1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, it1Var.a, serialDescriptor);
        b.u(1, it1Var.b, serialDescriptor);
        b.u(2, it1Var.c, serialDescriptor);
        b.u(3, it1Var.d, serialDescriptor);
        b.u(4, it1Var.e, serialDescriptor);
        b.u(5, it1Var.f, serialDescriptor);
        if (b.o(serialDescriptor) || it1Var.g) {
            b.x(serialDescriptor, 6, it1Var.g);
        }
        b.c(serialDescriptor);
    }
}
