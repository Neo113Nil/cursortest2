package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gi0 implements iw8 {
    public static final gi0 a;
    private static final /* synthetic */ uye descriptor;

    static {
        gi0 gi0Var = new gi0();
        a = gi0Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Asset.TitleObject", gi0Var, 1);
        uyeVar.j("len", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a7a.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                i2 = b.l(uyeVar, 0);
                i = 1;
            }
        }
        b.c(uyeVar);
        if (1 != i) {
            oea.z(i, 1, descriptor);
            throw null;
        }
        ii0 ii0Var = new ii0();
        ii0Var.a = i2;
        return ii0Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ii0 ii0Var = (ii0) obj;
        encoder.getClass();
        ii0Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.u(0, ii0Var.a, uyeVar);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
