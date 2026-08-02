package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uh6 implements iw8 {
    public static final uh6 a;
    private static final /* synthetic */ uye descriptor;

    static {
        uh6 uh6Var = new uh6();
        a = uh6Var;
        uye uyeVar = new uye("com.adsbynimbus.render.mraid.ExpandProperties", uh6Var, 4);
        uyeVar.j("width", false);
        uyeVar.j("height", false);
        uyeVar.j("isModal", true);
        uyeVar.j("useCustomClose", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{a7aVar, a7aVar, gz1Var, gz1Var};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                i3 = b.l(uyeVar, 1);
                i |= 2;
            } else if (o == 2) {
                z2 = b.B(uyeVar, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                z3 = b.B(uyeVar, 3);
                i |= 8;
            }
        }
        b.c(uyeVar);
        return new wh6(i, i2, i3, z2, z3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wh6 wh6Var = (wh6) obj;
        encoder.getClass();
        wh6Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        int i = wh6Var.a;
        boolean z = wh6Var.d;
        boolean z2 = wh6Var.c;
        b.u(0, i, uyeVar);
        b.u(1, wh6Var.b, uyeVar);
        if (b.o(uyeVar) || z2) {
            b.x(uyeVar, 2, z2);
        }
        if (b.o(uyeVar) || z) {
            b.x(uyeVar, 3, z);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
