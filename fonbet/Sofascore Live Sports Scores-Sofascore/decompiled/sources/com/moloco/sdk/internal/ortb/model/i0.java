package com.moloco.sdk.internal.ortb.model;

import defpackage.c88;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements iw8 {
    public static final i0 a;
    public static final uye b;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.CreativeRenderingCheckConfig", i0Var, 1);
        uyeVar.j("opacity_rate", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(c88.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Float f = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                f = (Float) b2.i(uyeVar, 0, c88.a, f);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new j0(i, f);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j0 j0Var = (j0) obj;
        encoder.getClass();
        j0Var.getClass();
        Float f = j0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || f != null) {
            b2.h(uyeVar, 0, c88.a, f);
        }
        b2.c(uyeVar);
    }
}
