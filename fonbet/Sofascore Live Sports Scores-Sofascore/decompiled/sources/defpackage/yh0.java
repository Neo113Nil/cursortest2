package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yh0 implements iw8 {
    public static final yh0 a;
    private static final /* synthetic */ uye descriptor;

    static {
        yh0 yh0Var = new yh0();
        a = yh0Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Asset", yh0Var, 7);
        uyeVar.j("id", false);
        uyeVar.j("required", false);
        uyeVar.j("ext", true);
        uyeVar.j("title", true);
        uyeVar.j("img", true);
        uyeVar.j("video", true);
        uyeVar.j("data", true);
        descriptor = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a7a.a, qb2.a, l98.W((KSerializer) mi0.h[2].getValue()), l98.W(gi0.a), l98.W(di0.a), l98.W(ji0.a), l98.W(ai0.a)};
    }

    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [ci0, fi0, ii0, li0] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        ?? r1;
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = mi0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        byte b2 = 0;
        Map map = null;
        ii0 ii0Var = null;
        fi0 fi0Var = null;
        li0 li0Var = null;
        ci0 ci0Var = null;
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
                    b2 = b.A(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    map = (Map) b.i(uyeVar, 2, (dy4) joaVarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    ii0Var = (ii0) b.i(uyeVar, 3, gi0.a, ii0Var);
                    i |= 8;
                    break;
                case 4:
                    fi0Var = (fi0) b.i(uyeVar, 4, di0.a, fi0Var);
                    i |= 16;
                    break;
                case 5:
                    li0Var = (li0) b.i(uyeVar, 5, ji0.a, li0Var);
                    i |= 32;
                    break;
                case 6:
                    ci0Var = (ci0) b.i(uyeVar, 6, ai0.a, ci0Var);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b.c(uyeVar);
        if (3 != (i & 3)) {
            oea.z(i, 3, descriptor);
            throw null;
        }
        mi0 mi0Var = new mi0();
        mi0Var.a = i2;
        mi0Var.b = b2;
        if ((i & 4) == 0) {
            r1 = 0;
            mi0Var.c = null;
        } else {
            r1 = 0;
            mi0Var.c = map;
        }
        if ((i & 8) == 0) {
            mi0Var.d = r1;
        } else {
            mi0Var.d = ii0Var;
        }
        if ((i & 16) == 0) {
            mi0Var.e = r1;
        } else {
            mi0Var.e = fi0Var;
        }
        if ((i & 32) == 0) {
            mi0Var.f = r1;
        } else {
            mi0Var.f = li0Var;
        }
        if ((i & 64) == 0) {
            mi0Var.g = r1;
            return mi0Var;
        }
        mi0Var.g = ci0Var;
        return mi0Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mi0 mi0Var = (mi0) obj;
        encoder.getClass();
        mi0Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = mi0.h;
        int i = mi0Var.a;
        ci0 ci0Var = mi0Var.g;
        li0 li0Var = mi0Var.f;
        fi0 fi0Var = mi0Var.e;
        ii0 ii0Var = mi0Var.d;
        Map map = mi0Var.c;
        b.u(0, i, uyeVar);
        b.q(uyeVar, 1, mi0Var.b);
        if (b.o(uyeVar) || map != null) {
            b.h(uyeVar, 2, (KSerializer) joaVarArr[2].getValue(), map);
        }
        if (b.o(uyeVar) || ii0Var != null) {
            b.h(uyeVar, 3, gi0.a, ii0Var);
        }
        if (b.o(uyeVar) || fi0Var != null) {
            b.h(uyeVar, 4, di0.a, fi0Var);
        }
        if (b.o(uyeVar) || li0Var != null) {
            b.h(uyeVar, 5, ji0.a, li0Var);
        }
        if (b.o(uyeVar) || ci0Var != null) {
            b.h(uyeVar, 6, ai0.a, ci0Var);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
