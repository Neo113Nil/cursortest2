package com.moloco.sdk.internal.ortb.model;

import defpackage.iw8;
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
public final /* synthetic */ class c1 implements iw8 {
    public static final c1 a;
    public static final uye b;

    static {
        c1 c1Var = new c1();
        a = c1Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.GradientColor", c1Var, 1);
        uyeVar.j("color", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uhi.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                str = b2.n(uyeVar, 0);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new d1(i, str);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d1 d1Var = (d1) obj;
        encoder.getClass();
        d1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        b2.y(uyeVar, 0, d1Var.a);
        b2.c(uyeVar);
    }
}
