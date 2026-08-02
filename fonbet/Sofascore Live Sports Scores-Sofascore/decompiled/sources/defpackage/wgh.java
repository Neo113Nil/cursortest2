package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wgh implements iw8 {
    public static final wgh a;
    private static final /* synthetic */ uye descriptor;

    static {
        wgh wghVar = new wgh();
        a = wghVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Signals", wghVar, 1);
        uyeVar.j("session", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h7h.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        boolean z = true;
        boolean z2 = false;
        k7h k7hVar = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                k7hVar = (k7h) b.w(uyeVar, 0, h7h.a, k7hVar);
                z2 = true;
            }
        }
        b.c(uyeVar);
        ygh yghVar = new ygh();
        if (z2) {
            yghVar.a = k7hVar;
            return yghVar;
        }
        yghVar.a = new k7h();
        return yghVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ygh yghVar = (ygh) obj;
        encoder.getClass();
        yghVar.getClass();
        k7h k7hVar = yghVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        if (b.o(uyeVar) || !Intrinsics.c(k7hVar, new k7h())) {
            b.f(uyeVar, 0, h7h.a, k7hVar);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
