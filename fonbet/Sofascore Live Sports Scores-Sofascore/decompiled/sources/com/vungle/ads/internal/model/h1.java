package com.vungle.ads.internal.model;

import defpackage.iw8;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import defpackage.z8e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h1 implements iw8 {
    public static final h1 a;
    public static final /* synthetic */ uye b;

    static {
        h1 h1Var = new h1();
        a = h1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.IAB", h1Var, 1);
        uyeVar.j("tcf", false);
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
        return new j1(i, str);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j1 j1Var = (j1) obj;
        encoder.getClass();
        j1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        j1.a(j1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
