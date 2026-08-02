package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y0g implements iw8 {
    public static final y0g a;
    private static final /* synthetic */ uye descriptor;

    static {
        y0g y0gVar = new y0g();
        a = y0gVar;
        uye uyeVar = new uye("com.adsbynimbus.render.mraid.ResizeProperties", y0gVar, 5);
        uyeVar.j("width", false);
        uyeVar.j("height", false);
        uyeVar.j("offsetX", false);
        uyeVar.j("offsetY", false);
        uyeVar.j("allowOffscreen", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar, a7aVar, a7aVar, gz1.a};
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
        boolean z2 = false;
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
            } else if (o == 3) {
                i5 = b.l(uyeVar, 3);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                z2 = b.B(uyeVar, 4);
                i |= 16;
            }
        }
        b.c(uyeVar);
        return new a1g(i, i2, i3, i4, i5, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a1g a1gVar = (a1g) obj;
        encoder.getClass();
        a1gVar.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.u(0, a1gVar.a, uyeVar);
        b.u(1, a1gVar.b, uyeVar);
        b.u(2, a1gVar.c, uyeVar);
        b.u(3, a1gVar.d, uyeVar);
        b.x(uyeVar, 4, a1gVar.e);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
