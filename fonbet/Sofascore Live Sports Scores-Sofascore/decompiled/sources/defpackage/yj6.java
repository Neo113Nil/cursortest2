package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yj6 implements iw8 {
    public static final yj6 a;
    private static final /* synthetic */ uye descriptor;

    static {
        yj6 yj6Var = new yj6();
        a = yj6Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Extension", yj6Var, 1);
        uyeVar.j("nimbus_native", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(rcd.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        boolean z2 = false;
        tcd tcdVar = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                tcdVar = (tcd) b.i(uyeVar, 0, rcd.a, tcdVar);
                z2 = true;
            }
        }
        b.c(uyeVar);
        ak6 ak6Var = new ak6();
        if (z2) {
            ak6Var.a = tcdVar;
            return ak6Var;
        }
        ak6Var.a = null;
        return ak6Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ak6 ak6Var = (ak6) obj;
        encoder.getClass();
        ak6Var.getClass();
        tcd tcdVar = ak6Var.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        if (b.o(uyeVar) || tcdVar != null) {
            b.h(uyeVar, 0, rcd.a, tcdVar);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
