package com.vungle.ads.internal.model;

import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m0 implements iw8 {
    public static final m0 a;
    public static final /* synthetic */ uye b;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.BidPayload", m0Var, 4);
        uyeVar.j("version", true);
        uyeVar.j("adunit", true);
        uyeVar.j("impression", true);
        uyeVar.j("ad", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(a7a.a);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, l98.W(uhiVar), l98.W(new xg0(uhiVar, 0)), l98.W(c.a)};
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
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                obj4 = b2.i(uyeVar, 0, a7a.a, obj4);
                i |= 1;
            } else if (o == 1) {
                obj3 = b2.i(uyeVar, 1, uhi.a, obj3);
                i |= 2;
            } else if (o == 2) {
                obj2 = b2.i(uyeVar, 2, new xg0(uhi.a, 0), obj2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 3, c.a, obj);
                i |= 8;
            }
        }
        b2.c(uyeVar);
        return new p0(i, (Integer) obj4, (String) obj3, (List) obj2, (h0) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p0 p0Var = (p0) obj;
        encoder.getClass();
        p0Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        p0.a(p0Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
