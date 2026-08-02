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
public final /* synthetic */ class q0 implements iw8 {
    public static final q0 a;
    public static final uye b;

    static {
        q0 q0Var = new q0();
        a = q0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.DECAppNameSerializable", q0Var, 2);
        uyeVar.j("text", true);
        uyeVar.j("font_size", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(uhi.a), l98.W(a7a.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = (String) b2.i(uyeVar, 0, uhi.a, str);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                num = (Integer) b2.i(uyeVar, 1, a7a.a, num);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new r0(i, str, num);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r0 r0Var = (r0) obj;
        encoder.getClass();
        r0Var.getClass();
        Integer num = r0Var.b;
        String str = r0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 0, uhi.a, str);
        }
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 1, a7a.a, num);
        }
        b2.c(uyeVar);
    }
}
