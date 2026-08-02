package defpackage;

import com.ironsource.U3;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ugf implements iw8 {
    public static final ugf a;
    private static final /* synthetic */ uye descriptor;

    static {
        ugf ugfVar = new ugf();
        a = ugfVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Publisher", ugfVar, 3);
        uyeVar.j("name", true);
        uyeVar.j(U3.j.D, true);
        uyeVar.j("cat", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = ygf.d;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar), l98.W((KSerializer) joaVarArr[2].getValue())};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = ygf.d;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String[] strArr = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = (String) b.i(uyeVar, 0, uhi.a, str);
                i |= 1;
            } else if (o == 1) {
                str2 = (String) b.i(uyeVar, 1, uhi.a, str2);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                strArr = (String[]) b.i(uyeVar, 2, (dy4) joaVarArr[2].getValue(), strArr);
                i |= 4;
            }
        }
        b.c(uyeVar);
        ygf ygfVar = new ygf();
        if ((i & 1) == 0) {
            ygfVar.a = null;
        } else {
            ygfVar.a = str;
        }
        if ((i & 2) == 0) {
            ygfVar.b = null;
        } else {
            ygfVar.b = str2;
        }
        if ((i & 4) == 0) {
            ygfVar.c = null;
            return ygfVar;
        }
        ygfVar.c = strArr;
        return ygfVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ygf ygfVar = (ygf) obj;
        encoder.getClass();
        ygfVar.getClass();
        String[] strArr = ygfVar.c;
        String str = ygfVar.b;
        String str2 = ygfVar.a;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = ygf.d;
        if (b.o(uyeVar) || str2 != null) {
            b.h(uyeVar, 0, uhi.a, str2);
        }
        if (b.o(uyeVar) || str != null) {
            b.h(uyeVar, 1, uhi.a, str);
        }
        if (b.o(uyeVar) || strArr != null) {
            b.h(uyeVar, 2, (KSerializer) joaVarArr[2].getValue(), strArr);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
