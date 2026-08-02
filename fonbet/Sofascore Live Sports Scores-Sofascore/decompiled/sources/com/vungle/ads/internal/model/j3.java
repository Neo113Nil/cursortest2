package com.vungle.ads.internal.model;

import defpackage.iw8;
import defpackage.l98;
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
public final class j3 implements iw8 {
    public static final j3 a;
    public static final /* synthetic */ uye b;

    static {
        j3 j3Var = new j3();
        a = j3Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.RtbRequest", j3Var, 1);
        uyeVar.j("sdk_user_agent", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(uhi.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Object obj = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 0, uhi.a, obj);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new l3(i, (String) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l3 l3Var = (l3) obj;
        encoder.getClass();
        l3Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        l3.a(l3Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
