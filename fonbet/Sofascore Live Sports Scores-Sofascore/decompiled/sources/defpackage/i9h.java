package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i9h implements iw8 {
    public static final i9h a;
    private static final /* synthetic */ uye descriptor;

    static {
        i9h i9hVar = new i9h();
        a = i9hVar;
        uye uyeVar = new uye("OrientationProperties", i9hVar, 1);
        uyeVar.j("data", false);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{kwd.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        mwd mwdVar = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                mwdVar = (mwd) b.w(uyeVar, 0, kwd.a, mwdVar);
                i = 1;
            }
        }
        b.c(uyeVar);
        return new k9h(i, mwdVar);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k9h k9hVar = (k9h) obj;
        encoder.getClass();
        k9hVar.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        b.f(uyeVar, 0, kwd.a, k9hVar.b);
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
