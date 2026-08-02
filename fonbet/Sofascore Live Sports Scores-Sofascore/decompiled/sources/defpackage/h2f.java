package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h2f implements iw8 {
    public static final h2f a;
    private static final /* synthetic */ uye descriptor;

    static {
        h2f h2fVar = new h2f();
        a = h2fVar;
        uye uyeVar = new uye("com.adsbynimbus.render.mraid.Position", h2fVar, 4);
        uyeVar.j("width", false);
        uyeVar.j("height", false);
        uyeVar.j("x", false);
        uyeVar.j("y", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, a7aVar};
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
        int i4 = 0;
        int i5 = 0;
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
                i4 = b.l(uyeVar, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                i5 = b.l(uyeVar, 3);
                i |= 8;
            }
        }
        b.c(uyeVar);
        return new l2f(i, i2, i3, i4, i5);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l2f l2fVar = (l2f) obj;
        encoder.getClass();
        l2fVar.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.u(0, l2fVar.a, uyeVar);
        b.u(1, l2fVar.b, uyeVar);
        b.u(2, l2fVar.c, uyeVar);
        b.u(3, l2fVar.d, uyeVar);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
