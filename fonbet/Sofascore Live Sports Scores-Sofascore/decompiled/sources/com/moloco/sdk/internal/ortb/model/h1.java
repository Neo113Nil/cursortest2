package com.moloco.sdk.internal.ortb.model;

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
public final /* synthetic */ class h1 implements iw8 {
    public static final h1 a;
    public static final uye b;

    static {
        h1 h1Var = new h1();
        a = h1Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.MolocoSDKClickMetaData", h1Var, 1);
        uyeVar.j("banner", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(v.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        w wVar = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                wVar = (w) b2.i(uyeVar, 0, v.a, wVar);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new i1(i, wVar);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i1 i1Var = (i1) obj;
        encoder.getClass();
        i1Var.getClass();
        w wVar = i1Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || wVar != null) {
            b2.h(uyeVar, 0, v.a, wVar);
        }
        b2.c(uyeVar);
    }
}
