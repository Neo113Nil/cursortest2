package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ai0 implements iw8 {
    public static final ai0 a;
    private static final /* synthetic */ uye descriptor;

    static {
        ai0 ai0Var = new ai0();
        a = ai0Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Asset.DataObject", ai0Var, 2);
        uyeVar.j("type", false);
        uyeVar.j("len", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qb2.a, a7a.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        byte b2 = 0;
        int i2 = 0;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                b2 = b.A(uyeVar, 0);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                i2 = b.l(uyeVar, 1);
                i |= 2;
            }
        }
        b.c(uyeVar);
        if (3 != (i & 3)) {
            oea.z(i, 3, descriptor);
            throw null;
        }
        ci0 ci0Var = new ci0();
        ci0Var.a = b2;
        ci0Var.b = i2;
        return ci0Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ci0 ci0Var = (ci0) obj;
        encoder.getClass();
        ci0Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.q(uyeVar, 0, ci0Var.a);
        b.u(1, ci0Var.b, uyeVar);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
