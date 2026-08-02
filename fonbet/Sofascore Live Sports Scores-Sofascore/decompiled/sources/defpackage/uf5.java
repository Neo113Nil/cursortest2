package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uf5 implements iw8 {
    public static final uf5 a;
    private static final /* synthetic */ uye descriptor;

    static {
        uf5 uf5Var = new uf5();
        a = uf5Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.EID", uf5Var, 2);
        uyeVar.j("source", false);
        uyeVar.j("uids", false);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uhi.a, wf5.c[1].getValue()};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = wf5.c;
        boolean z = true;
        int i = 0;
        String str = null;
        Set set = null;
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
                set = (Set) b.w(uyeVar, 1, (dy4) joaVarArr[1].getValue(), set);
                i |= 2;
            }
        }
        b.c(uyeVar);
        return new wf5(i, str, set);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wf5 wf5Var = (wf5) obj;
        encoder.getClass();
        wf5Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = wf5.c;
        b.y(uyeVar, 0, wf5Var.a);
        b.f(uyeVar, 1, (KSerializer) joaVarArr[1].getValue(), wf5Var.b);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
