package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nt1 implements iw8 {
    public static final nt1 a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        nt1 nt1Var = new nt1();
        a = nt1Var;
        uye uyeVar = new uye("com.sofascore.results.event.scorecard.adapter.BatsmanTotalRow", nt1Var, 4);
        uyeVar.j("score", false);
        uyeVar.j("wickets", false);
        uyeVar.j("overs", false);
        uyeVar.j("isLastItemInGroup", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, h75.a, gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        uf3 b = decoder.b(serialDescriptor);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        double d = 0.0d;
        boolean z2 = true;
        while (z2) {
            int o = b.o(serialDescriptor);
            if (o == -1) {
                z2 = false;
            } else if (o == 0) {
                i2 = b.l(serialDescriptor, 0);
                i |= 1;
            } else if (o == 1) {
                i3 = b.l(serialDescriptor, 1);
                i |= 2;
            } else if (o == 2) {
                d = b.D(serialDescriptor, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                z = b.B(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new pt1(i, i2, i3, d, z);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pt1 pt1Var = (pt1) obj;
        encoder.getClass();
        pt1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        wf3 b = encoder.b(serialDescriptor);
        b.u(0, pt1Var.a, serialDescriptor);
        b.u(1, pt1Var.b, serialDescriptor);
        b.D(serialDescriptor, 2, pt1Var.c);
        if (b.o(serialDescriptor) || pt1Var.d) {
            b.x(serialDescriptor, 3, pt1Var.d);
        }
        b.c(serialDescriptor);
    }
}
