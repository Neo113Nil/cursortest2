package defpackage;

import com.mbridge.msdk.foundation.same.report.h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class om8 implements iw8 {
    public static final om8 a;
    private static final /* synthetic */ uye descriptor;

    static {
        om8 om8Var = new om8();
        a = om8Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Format", om8Var, 2);
        uyeVar.j("w", false);
        uyeVar.j(h.b, false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar};
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
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b.l(uyeVar, 0);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                i3 = b.l(uyeVar, 1);
                i |= 2;
            }
        }
        b.c(uyeVar);
        return new tm8(i, i2, i3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tm8 tm8Var = (tm8) obj;
        encoder.getClass();
        tm8Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.u(0, tm8Var.a, uyeVar);
        b.u(1, tm8Var.b, uyeVar);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
