package com.vungle.ads.internal.model;

import defpackage.iw8;
import defpackage.lkb;
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
public final class e1 implements iw8 {
    public static final e1 a;
    public static final /* synthetic */ uye b;

    static {
        e1 e1Var = new e1();
        a = e1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.GDPR", e1Var, 4);
        uyeVar.j("consent_status", false);
        uyeVar.j("consent_source", false);
        uyeVar.j("consent_timestamp", false);
        uyeVar.j("consent_message_version", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, uhiVar, lkb.a, uhiVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b2.n(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                str2 = b2.n(uyeVar, 1);
                i |= 2;
            } else if (o == 2) {
                j = b2.g(uyeVar, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                str3 = b2.n(uyeVar, 3);
                i |= 8;
            }
        }
        b2.c(uyeVar);
        return new g1(i, str, str2, j, str3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g1 g1Var = (g1) obj;
        encoder.getClass();
        g1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        g1.a(g1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
