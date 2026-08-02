package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kwd implements iw8 {
    public static final kwd a;
    private static final /* synthetic */ uye descriptor;

    static {
        kwd kwdVar = new kwd();
        a = kwdVar;
        uye uyeVar = new uye("com.adsbynimbus.render.mraid.OrientationProperties", kwdVar, 2);
        uyeVar.j("allowOrientationChange", true);
        uyeVar.j("forceOrientation", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{gz1.a, uhi.a};
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
                z2 = b.B(uyeVar, 0);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                str = b.n(uyeVar, 1);
                i |= 2;
            }
        }
        b.c(uyeVar);
        return new mwd(i, str, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mwd mwdVar = (mwd) obj;
        encoder.getClass();
        mwdVar.getClass();
        String str = mwdVar.b;
        boolean z = mwdVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        if (b.o(uyeVar) || !z) {
            b.x(uyeVar, 0, z);
        }
        if (b.o(uyeVar) || !Intrinsics.c(str, "none")) {
            b.y(uyeVar, 1, str);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
