package com.vungle.ads.internal.model;

import com.ironsource.U3;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import defpackage.z8e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class q0 implements iw8 {
    public static final q0 a;
    public static final /* synthetic */ uye b;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody", q0Var, 5);
        uyeVar.j(U3.i.G, false);
        uyeVar.j("app", true);
        uyeVar.j("user", true);
        uyeVar.j("ext", true);
        uyeVar.j("request", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.a, l98.W(j0.a), l98.W(q1.a), l98.W(k1.a), l98.W(n1.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                obj5 = b2.w(uyeVar, 0, w2.a, obj5);
                i |= 1;
            } else if (o == 1) {
                obj4 = b2.i(uyeVar, 1, j0.a, obj4);
                i |= 2;
            } else if (o == 2) {
                obj3 = b2.i(uyeVar, 2, q1.a, obj3);
                i |= 4;
            } else if (o == 3) {
                obj2 = b2.i(uyeVar, 3, k1.a, obj2);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 4, n1.a, obj);
                i |= 16;
            }
        }
        b2.c(uyeVar);
        return new t1(i, (b3) obj5, (l0) obj4, (s1) obj3, (m1) obj2, (p1) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t1 t1Var = (t1) obj;
        encoder.getClass();
        t1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        t1.a(t1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
