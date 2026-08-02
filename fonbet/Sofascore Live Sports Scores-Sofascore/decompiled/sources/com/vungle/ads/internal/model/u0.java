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
public final class u0 implements iw8 {
    public static final u0 a;
    public static final /* synthetic */ uye b;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.CCPA", u0Var, 1);
        uyeVar.j("status", false);
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
        return new w0(i, str);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        w0 w0Var = (w0) obj;
        encoder.getClass();
        w0Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        w0.a(w0Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
