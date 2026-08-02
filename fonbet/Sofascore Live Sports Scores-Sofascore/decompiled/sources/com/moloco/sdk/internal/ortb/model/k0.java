package com.moloco.sdk.internal.ortb.model;

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
public final /* synthetic */ class k0 implements iw8 {
    public static final k0 a;
    public static final uye b;

    static {
        k0 k0Var = new k0();
        a = k0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.CreativeRenderingCheckEvent", k0Var, 2);
        uyeVar.j("event_link", true);
        uyeVar.j("config", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(uhi.a), l98.W(i0.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        String str = null;
        j0 j0Var = null;
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
                j0Var = (j0) b2.i(uyeVar, 1, i0.a, j0Var);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new l0(i, str, j0Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0 l0Var = (l0) obj;
        encoder.getClass();
        l0Var.getClass();
        j0 j0Var = l0Var.b;
        String str = l0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 0, uhi.a, str);
        }
        if (b2.o(uyeVar) || j0Var != null) {
            b2.h(uyeVar, 1, i0.a, j0Var);
        }
        b2.c(uyeVar);
    }
}
