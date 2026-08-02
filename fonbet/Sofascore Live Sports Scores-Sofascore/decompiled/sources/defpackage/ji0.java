package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ji0 implements iw8 {
    public static final ji0 a;
    private static final /* synthetic */ uye descriptor;

    static {
        ji0 ji0Var = new ji0();
        a = ji0Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Asset.VideoObject", ji0Var, 4);
        uyeVar.j("mimes", true);
        uyeVar.j("minduration", true);
        uyeVar.j("maxduration", true);
        uyeVar.j("protocols", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W((KSerializer) li0.e[0].getValue());
        KSerializer W2 = l98.W(w92.c);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{W, a7aVar, a7aVar, W2};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = li0.e;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String[] strArr = null;
        byte[] bArr = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                strArr = (String[]) b.i(uyeVar, 0, (dy4) joaVarArr[0].getValue(), strArr);
                i |= 1;
            } else if (o == 1) {
                i2 = b.l(uyeVar, 1);
                i |= 2;
            } else if (o == 2) {
                i3 = b.l(uyeVar, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                bArr = (byte[]) b.i(uyeVar, 3, w92.c, bArr);
                i |= 8;
            }
        }
        b.c(uyeVar);
        li0 li0Var = new li0();
        if ((i & 1) == 0) {
            li0Var.a = null;
        } else {
            li0Var.a = strArr;
        }
        if ((i & 2) == 0) {
            li0Var.b = 0;
        } else {
            li0Var.b = i2;
        }
        if ((i & 4) == 0) {
            li0Var.c = 60;
        } else {
            li0Var.c = i3;
        }
        if ((i & 8) == 0) {
            li0Var.d = null;
            return li0Var;
        }
        li0Var.d = bArr;
        return li0Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        li0 li0Var = (li0) obj;
        encoder.getClass();
        li0Var.getClass();
        int i = li0Var.c;
        int i2 = li0Var.b;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = li0.e;
        if (b.o(uyeVar) || li0Var.a != null) {
            b.h(uyeVar, 0, (KSerializer) joaVarArr[0].getValue(), li0Var.a);
        }
        if (b.o(uyeVar) || i2 != 0) {
            b.u(1, i2, uyeVar);
        }
        if (b.o(uyeVar) || i != 60) {
            b.u(2, i, uyeVar);
        }
        if (b.o(uyeVar) || li0Var.d != null) {
            b.h(uyeVar, 3, w92.c, li0Var.d);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
