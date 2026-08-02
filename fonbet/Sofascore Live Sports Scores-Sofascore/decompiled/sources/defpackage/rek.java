package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rek implements iw8 {
    public static final rek a;
    private static final /* synthetic */ uye descriptor;

    static {
        rek rekVar = new rek();
        a = rekVar;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.User", rekVar, 8);
        uyeVar.j("age", true);
        uyeVar.j("buyeruid", true);
        uyeVar.j("yob", true);
        uyeVar.j(InneractiveMediationDefs.KEY_GENDER, true);
        uyeVar.j("keywords", true);
        uyeVar.j("custom_data", true);
        uyeVar.j("data", true);
        uyeVar.j("ext", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = wek.i;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        KSerializer W5 = l98.W((KSerializer) joaVarArr[6].getValue());
        KSerializer W6 = l98.W(tek.a);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, W, a7aVar, W2, W3, W4, W5, W6};
    }

    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String, nd4[], vek] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        ?? r1;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = wek.i;
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        nd4[] nd4VarArr = null;
        vek vekVar = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b.l(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.i(uyeVar, 1, uhi.a, str);
                    i |= 2;
                    break;
                case 2:
                    i3 = b.l(uyeVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.i(uyeVar, 3, uhi.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.i(uyeVar, 4, uhi.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.i(uyeVar, 5, uhi.a, str4);
                    i |= 32;
                    break;
                case 6:
                    nd4VarArr = (nd4[]) b.i(uyeVar, 6, (dy4) joaVarArr[6].getValue(), nd4VarArr);
                    i |= 64;
                    break;
                case 7:
                    vekVar = (vek) b.i(uyeVar, 7, tek.a, vekVar);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(uyeVar);
        wek wekVar = new wek();
        if ((i & 1) == 0) {
            wekVar.a = 0;
        } else {
            wekVar.a = i2;
        }
        if ((i & 2) == 0) {
            wekVar.b = null;
        } else {
            wekVar.b = str;
        }
        if ((i & 4) == 0) {
            wekVar.c = 0;
        } else {
            wekVar.c = i3;
        }
        if ((i & 8) == 0) {
            r1 = 0;
            wekVar.d = null;
        } else {
            r1 = 0;
            wekVar.d = str2;
        }
        if ((i & 16) == 0) {
            wekVar.e = r1;
        } else {
            wekVar.e = str3;
        }
        if ((i & 32) == 0) {
            wekVar.f = r1;
        } else {
            wekVar.f = str4;
        }
        if ((i & 64) == 0) {
            wekVar.g = r1;
        } else {
            wekVar.g = nd4VarArr;
        }
        if ((i & 128) == 0) {
            wekVar.h = r1;
            return wekVar;
        }
        wekVar.h = vekVar;
        return wekVar;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wek wekVar = (wek) obj;
        encoder.getClass();
        wekVar.getClass();
        String str = wekVar.f;
        String str2 = wekVar.e;
        int i = wekVar.c;
        String str3 = wekVar.b;
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = wek.i;
        if (b.o(uyeVar) || wekVar.a != 0) {
            b.u(0, wekVar.a, uyeVar);
        }
        if (b.o(uyeVar) || str3 != null) {
            b.h(uyeVar, 1, uhi.a, str3);
        }
        if (b.o(uyeVar) || i != 0) {
            b.u(2, i, uyeVar);
        }
        if (b.o(uyeVar) || wekVar.d != null) {
            b.h(uyeVar, 3, uhi.a, wekVar.d);
        }
        if (b.o(uyeVar) || str2 != null) {
            b.h(uyeVar, 4, uhi.a, str2);
        }
        if (b.o(uyeVar) || str != null) {
            b.h(uyeVar, 5, uhi.a, str);
        }
        if (b.o(uyeVar) || wekVar.g != null) {
            b.h(uyeVar, 6, (KSerializer) joaVarArr[6].getValue(), wekVar.g);
        }
        if (b.o(uyeVar) || wekVar.h != null) {
            b.h(uyeVar, 7, tek.a, wekVar.h);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
