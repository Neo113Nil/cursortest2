package com.vungle.ads.internal.model;

import defpackage.a7a;
import defpackage.iw8;
import defpackage.uf3;
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
public final class r0 implements iw8 {
    public static final r0 a;
    public static final /* synthetic */ uye b;

    static {
        r0 r0Var = new r0();
        a = r0Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", r0Var, 2);
        uyeVar.j("w", false);
        uyeVar.j(com.mbridge.msdk.foundation.same.report.h.b, false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{a7aVar, a7aVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                i2 = b2.l(uyeVar, 0);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                i3 = b2.l(uyeVar, 1);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new t0(i, i2, i3);
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
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        t0.a(t0Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
