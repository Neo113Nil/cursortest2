package com.vungle.ads.internal.model;

import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import defpackage.iw8;
import defpackage.l98;
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
public final class q1 implements iw8 {
    public static final q1 a;
    public static final /* synthetic */ uye b;

    static {
        q1 q1Var = new q1();
        a = q1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.User", q1Var, 5);
        uyeVar.j(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
        uyeVar.j("ccpa", true);
        uyeVar.j("coppa", true);
        uyeVar.j("fpd", true);
        uyeVar.j("iab", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(e1.a), l98.W(u0.a), l98.W(x0.a), l98.W(FirstPartyData$$serializer.INSTANCE), l98.W(h1.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                obj5 = b2.i(uyeVar, 0, e1.a, obj5);
                i |= 1;
            } else if (o == 1) {
                obj4 = b2.i(uyeVar, 1, u0.a, obj4);
                i |= 2;
            } else if (o == 2) {
                obj3 = b2.i(uyeVar, 2, x0.a, obj3);
                i |= 4;
            } else if (o == 3) {
                obj2 = b2.i(uyeVar, 3, FirstPartyData$$serializer.INSTANCE, obj2);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 4, h1.a, obj);
                i |= 16;
            }
        }
        b2.c(uyeVar);
        return new s1(i, (g1) obj5, (w0) obj4, (z0) obj3, (FirstPartyData) obj2, (j1) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        s1 s1Var = (s1) obj;
        encoder.getClass();
        s1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        s1.a(s1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
