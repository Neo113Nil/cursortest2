package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pvf implements iw8 {
    public static final pvf a;
    private static final /* synthetic */ uye descriptor;

    static {
        pvf pvfVar = new pvf();
        a = pvfVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Regs", pvfVar, 2);
        uyeVar.j("coppa", true);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qb2.a, rvf.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        byte b2 = 0;
        tvf tvfVar = null;
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
                tvfVar = (tvf) b.w(uyeVar, 1, rvf.a, tvfVar);
                i |= 2;
            }
        }
        b.c(uyeVar);
        uvf uvfVar = new uvf();
        if ((i & 1) == 0) {
            uvfVar.a = (byte) 0;
        } else {
            uvfVar.a = b2;
        }
        if ((i & 2) == 0) {
            uvfVar.b = new tvf();
            return uvfVar;
        }
        uvfVar.b = tvfVar;
        return uvfVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uvf uvfVar = (uvf) obj;
        encoder.getClass();
        uvfVar.getClass();
        tvf tvfVar = uvfVar.b;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        if (b.o(uyeVar) || uvfVar.a != 0) {
            b.q(uyeVar, 0, uvfVar.a);
        }
        if (b.o(uyeVar) || !Intrinsics.c(tvfVar, new tvf())) {
            b.f(uyeVar, 1, rvf.a, tvfVar);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
