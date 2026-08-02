package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l9h implements iw8 {
    public static final l9h a;
    private static final /* synthetic */ uye descriptor;

    static {
        l9h l9hVar = new l9h();
        a = l9hVar;
        uye uyeVar = new uye("ResizeProperties", l9hVar, 1);
        uyeVar.j("data", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{y0g.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        a1g a1gVar = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                a1gVar = (a1g) b.w(uyeVar, 0, y0g.a, a1gVar);
                i = 1;
            }
        }
        b.c(uyeVar);
        return new n9h(i, a1gVar);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n9h n9hVar = (n9h) obj;
        encoder.getClass();
        n9hVar.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.f(uyeVar, 0, y0g.a, n9hVar.b);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
