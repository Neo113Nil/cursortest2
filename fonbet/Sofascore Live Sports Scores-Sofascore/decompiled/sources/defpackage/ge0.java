package defpackage;

import com.ironsource.U3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ge0 implements iw8 {
    public static final ge0 a;
    private static final /* synthetic */ uye descriptor;

    static {
        ge0 ge0Var = new ge0();
        a = ge0Var;
        uye uyeVar = new uye("com.adsbynimbus.render.mraid.AppOrientation", ge0Var, 2);
        uyeVar.j(U3.i.n, false);
        uyeVar.j("locked", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uhi.a, gz1.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b.n(uyeVar, 0);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                z2 = b.B(uyeVar, 1);
                i |= 2;
            }
        }
        b.c(uyeVar);
        return new ie0(i, str, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ie0 ie0Var = (ie0) obj;
        encoder.getClass();
        ie0Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.y(uyeVar, 0, ie0Var.a);
        b.x(uyeVar, 1, ie0Var.b);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
