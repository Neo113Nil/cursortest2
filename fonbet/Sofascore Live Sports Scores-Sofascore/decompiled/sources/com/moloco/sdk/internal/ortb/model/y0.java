package com.moloco.sdk.internal.ortb.model;

import defpackage.c8k;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.y7k;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements iw8 {
    public static final y0 a;
    public static final uye b;

    static {
        y0 y0Var = new y0();
        a = y0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.DECSkipClose", y0Var, 1);
        uyeVar.j("delay_seconds", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(c8k.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        y7k y7kVar = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                y7kVar = (y7k) b2.i(uyeVar, 0, c8k.a, y7kVar);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new z0(i, y7kVar);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        z0 z0Var = (z0) obj;
        encoder.getClass();
        z0Var.getClass();
        y7k y7kVar = z0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || y7kVar != null) {
            b2.h(uyeVar, 0, c8k.a, y7kVar);
        }
        b2.c(uyeVar);
    }
}
