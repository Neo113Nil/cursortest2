package com.moloco.sdk.internal.ortb.model;

import defpackage.gz1;
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
public final /* synthetic */ class j1 implements iw8 {
    public static final j1 a;
    public static final uye b;

    static {
        j1 j1Var = new j1();
        a = j1Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.MolocoSDKConfigs", j1Var, 2);
        uyeVar.j("server_rendering_enabled", true);
        uyeVar.j("experimental", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(gz1.a), l98.W(a1.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        b1 b1Var = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                bool = (Boolean) b2.i(uyeVar, 0, gz1.a, bool);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                b1Var = (b1) b2.i(uyeVar, 1, a1.a, b1Var);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new k1(i, bool, b1Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k1 k1Var = (k1) obj;
        encoder.getClass();
        k1Var.getClass();
        b1 b1Var = k1Var.b;
        Boolean bool = k1Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || bool != null) {
            b2.h(uyeVar, 0, gz1.a, bool);
        }
        if (b2.o(uyeVar) || b1Var != null) {
            b2.h(uyeVar, 1, a1.a, b1Var);
        }
        b2.c(uyeVar);
    }
}
