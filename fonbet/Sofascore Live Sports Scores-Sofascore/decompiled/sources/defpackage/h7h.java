package defpackage;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h7h implements iw8 {
    public static final h7h a;
    private static final /* synthetic */ uye descriptor;

    static {
        h7h h7hVar = new h7h();
        a = h7hVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Session", h7hVar, 2);
        uyeVar.j("depth", true);
        uyeVar.j(IronSourceConstants.EVENTS_DURATION, true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a7a.a, lkb.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        long j = 0;
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
                j = b.g(uyeVar, 1);
                i |= 2;
            }
        }
        b.c(uyeVar);
        k7h k7hVar = new k7h();
        if ((i & 1) == 0) {
            k7hVar.a = 0;
        } else {
            k7hVar.a = i2;
        }
        if ((i & 2) == 0) {
            k7hVar.b = 0L;
            return k7hVar;
        }
        k7hVar.b = j;
        return k7hVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k7h k7hVar = (k7h) obj;
        encoder.getClass();
        k7hVar.getClass();
        long j = k7hVar.b;
        int i = k7hVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        if (b.o(uyeVar) || i != 0) {
            b.u(0, i, uyeVar);
        }
        if (b.o(uyeVar) || j != 0) {
            b.E(uyeVar, 1, j);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
