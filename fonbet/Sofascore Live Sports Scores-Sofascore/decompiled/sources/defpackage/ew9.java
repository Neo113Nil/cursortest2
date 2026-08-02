package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ew9 implements iw8 {
    public static final ew9 a;
    private static final /* synthetic */ uye descriptor;

    static {
        ew9 ew9Var = new ew9();
        a = ew9Var;
        uye uyeVar = new uye("com.adsbynimbus.openrtb.request.Impression.Extension", ew9Var, 5);
        uyeVar.j("position", false);
        uyeVar.j("aps", true);
        uyeVar.j("adunit", true);
        uyeVar.j("facebook_app_id", true);
        uyeVar.j("facebook_test_ad_type", true);
        descriptor = uyeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        joa[] joaVarArr = gw9.f;
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, joaVarArr[1].getValue(), qb2.a, l98.W(uhiVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = descriptor;
        uf3 b = decoder.b(uyeVar);
        joa[] joaVarArr = gw9.f;
        boolean z = true;
        int i = 0;
        byte b2 = 0;
        String str = null;
        Set set = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int o = b.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b.n(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                set = (Set) b.w(uyeVar, 1, (dy4) joaVarArr[1].getValue(), set);
                i |= 2;
            } else if (o == 2) {
                b2 = b.A(uyeVar, 2);
                i |= 4;
            } else if (o == 3) {
                str2 = (String) b.i(uyeVar, 3, uhi.a, str2);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                str3 = (String) b.i(uyeVar, 4, uhi.a, str3);
                i |= 16;
            }
        }
        b.c(uyeVar);
        if (1 != (i & 1)) {
            oea.z(i, 1, descriptor);
            throw null;
        }
        gw9 gw9Var = new gw9();
        gw9Var.a = str;
        if ((i & 2) == 0) {
            gw9Var.b = rm5.a;
        } else {
            gw9Var.b = set;
        }
        if ((i & 4) == 0) {
            gw9Var.c = (byte) 0;
        } else {
            gw9Var.c = b2;
        }
        if ((i & 8) == 0) {
            gw9Var.d = null;
        } else {
            gw9Var.d = str2;
        }
        if ((i & 16) == 0) {
            gw9Var.e = null;
            return gw9Var;
        }
        gw9Var.e = str3;
        return gw9Var;
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gw9 gw9Var = (gw9) obj;
        encoder.getClass();
        gw9Var.getClass();
        uye uyeVar = descriptor;
        wf3 b = encoder.b(uyeVar);
        joa[] joaVarArr = gw9.f;
        b.y(uyeVar, 0, gw9Var.a);
        if (b.o(uyeVar) || !Intrinsics.c(gw9Var.b, rm5.a)) {
            b.f(uyeVar, 1, (KSerializer) joaVarArr[1].getValue(), gw9Var.b);
        }
        if (b.o(uyeVar) || gw9Var.c != 0) {
            b.q(uyeVar, 2, gw9Var.c);
        }
        if (b.o(uyeVar) || gw9Var.d != null) {
            b.h(uyeVar, 3, uhi.a, gw9Var.d);
        }
        if (b.o(uyeVar) || gw9Var.e != null) {
            b.h(uyeVar, 4, uhi.a, gw9Var.e);
        }
        b.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
