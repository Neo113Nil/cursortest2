package com.moloco.sdk.internal.ortb.model;

import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements iw8 {
    public static final o0 a;
    public static final uye b;

    static {
        o0 o0Var = new o0();
        a = o0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.DECAppIconSerializable", o0Var, 3);
        uyeVar.j("size", true);
        uyeVar.j("app_icon_url", true);
        uyeVar.j("border", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(a7a.a), l98.W(uhi.a), l98.W(s0.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        t0 t0Var = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                num = (Integer) b2.i(uyeVar, 0, a7a.a, num);
                i |= 1;
            } else if (o == 1) {
                str = (String) b2.i(uyeVar, 1, uhi.a, str);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                t0Var = (t0) b2.i(uyeVar, 2, s0.a, t0Var);
                i |= 4;
            }
        }
        b2.c(uyeVar);
        return new p0(i, num, str, t0Var);
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
        t0 t0Var = p0Var.c;
        String str = p0Var.b;
        Integer num = p0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 0, a7a.a, num);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 1, uhi.a, str);
        }
        if (b2.o(uyeVar) || t0Var != null) {
            b2.h(uyeVar, 2, s0.a, t0Var);
        }
        b2.c(uyeVar);
    }
}
