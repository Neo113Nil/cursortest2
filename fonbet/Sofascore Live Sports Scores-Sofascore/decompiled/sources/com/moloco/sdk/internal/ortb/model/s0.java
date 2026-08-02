package com.moloco.sdk.internal.ortb.model;

import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s0 implements iw8 {
    public static final s0 a;
    public static final uye b;

    static {
        s0 s0Var = new s0();
        a = s0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.DECBorderSerializable", s0Var, 2);
        uyeVar.j("border_width", true);
        uyeVar.j("gradient", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(a7a.a), l98.W(t0.c[1])};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = t0.c;
        boolean z = true;
        int i = 0;
        Integer num = null;
        List list = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                num = (Integer) b2.i(uyeVar, 0, a7a.a, num);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                list = (List) b2.i(uyeVar, 1, kSerializerArr[1], list);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new t0(i, num, list);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        t0 t0Var = (t0) obj;
        encoder.getClass();
        t0Var.getClass();
        List list = t0Var.b;
        Integer num = t0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        KSerializer[] kSerializerArr = t0.c;
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 0, a7a.a, num);
        }
        if (b2.o(uyeVar) || list != null) {
            b2.h(uyeVar, 1, kSerializerArr[1], list);
        }
        b2.c(uyeVar);
    }
}
