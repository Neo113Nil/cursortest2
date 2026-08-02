package com.vungle.ads.internal.model;

import defpackage.iw8;
import defpackage.l98;
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
public final class k1 implements iw8 {
    public static final k1 a;
    public static final /* synthetic */ uye b;

    static {
        k1 k1Var = new k1();
        a = k1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.RequestExt", k1Var, 3);
        uyeVar.j("config_extension", true);
        uyeVar.j("signals", true);
        uyeVar.j("config_last_validated_ts", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar), l98.W(lkb.a)};
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
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                obj3 = b2.i(uyeVar, 0, uhi.a, obj3);
                i |= 1;
            } else if (o == 1) {
                obj2 = b2.i(uyeVar, 1, uhi.a, obj2);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 2, lkb.a, obj);
                i |= 4;
            }
        }
        b2.c(uyeVar);
        return new m1(i, (String) obj3, (String) obj2, (Long) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m1 m1Var = (m1) obj;
        encoder.getClass();
        m1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        m1.a(m1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
