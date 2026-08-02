package defpackage;

import com.ironsource.L6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tw8 implements iw8 {
    public static final tw8 a;
    private static final /* synthetic */ uye descriptor;

    static {
        tw8 tw8Var = new tw8();
        a = tw8Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Geo", tw8Var, 8);
        uyeVar.j(L6.s, true);
        uyeVar.j("lon", true);
        uyeVar.j("type", true);
        uyeVar.j("accuracy", true);
        uyeVar.j("country", true);
        uyeVar.j("city", true);
        uyeVar.j("metro", true);
        uyeVar.j("state", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        c88 c88Var = c88.a;
        KSerializer W = l98.W(c88Var);
        KSerializer W2 = l98.W(c88Var);
        KSerializer W3 = l98.W(qb2.a);
        KSerializer W4 = l98.W(a7a.a);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, W2, W3, W4, l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Byte, java.lang.Float, java.lang.Integer, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        ?? r1;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        Object obj = null;
        boolean z = true;
        int i = 0;
        Float f = null;
        Float f2 = null;
        Byte b2 = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int o = b.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    f = (Float) b.i(uyeVar, 0, c88.a, f);
                    i |= 1;
                    break;
                case 1:
                    f2 = (Float) b.i(uyeVar, 1, c88.a, f2);
                    i |= 2;
                    break;
                case 2:
                    b2 = (Byte) b.i(uyeVar, 2, qb2.a, b2);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b.i(uyeVar, 3, a7a.a, num);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.i(uyeVar, 4, uhi.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b.i(uyeVar, 5, uhi.a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b.i(uyeVar, 6, uhi.a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) b.i(uyeVar, 7, uhi.a, str4);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(uyeVar);
        vw8 vw8Var = new vw8();
        if ((i & 1) == 0) {
            r1 = 0;
            vw8Var.a = null;
        } else {
            r1 = 0;
            vw8Var.a = f;
        }
        if ((i & 2) == 0) {
            vw8Var.b = r1;
        } else {
            vw8Var.b = f2;
        }
        if ((i & 4) == 0) {
            vw8Var.c = r1;
        } else {
            vw8Var.c = b2;
        }
        if ((i & 8) == 0) {
            vw8Var.d = r1;
        } else {
            vw8Var.d = num;
        }
        if ((i & 16) == 0) {
            vw8Var.e = r1;
        } else {
            vw8Var.e = str;
        }
        if ((i & 32) == 0) {
            vw8Var.f = r1;
        } else {
            vw8Var.f = str2;
        }
        if ((i & 64) == 0) {
            vw8Var.g = r1;
        } else {
            vw8Var.g = str3;
        }
        if ((i & 128) == 0) {
            vw8Var.h = r1;
            return vw8Var;
        }
        vw8Var.h = str4;
        return vw8Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vw8 vw8Var = (vw8) obj;
        encoder.getClass();
        vw8Var.getClass();
        String str = vw8Var.h;
        String str2 = vw8Var.g;
        String str3 = vw8Var.f;
        String str4 = vw8Var.e;
        Integer num = vw8Var.d;
        Byte b = vw8Var.c;
        Float f = vw8Var.b;
        Float f2 = vw8Var.a;
        uye uyeVar = descriptor;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || f2 != null) {
            b2.h(uyeVar, 0, c88.a, f2);
        }
        if (b2.o(uyeVar) || f != null) {
            b2.h(uyeVar, 1, c88.a, f);
        }
        if (b2.o(uyeVar) || b != null) {
            b2.h(uyeVar, 2, qb2.a, b);
        }
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 3, a7a.a, num);
        }
        if (b2.o(uyeVar) || str4 != null) {
            b2.h(uyeVar, 4, uhi.a, str4);
        }
        if (b2.o(uyeVar) || str3 != null) {
            b2.h(uyeVar, 5, uhi.a, str3);
        }
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 6, uhi.a, str2);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 7, uhi.a, str);
        }
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
