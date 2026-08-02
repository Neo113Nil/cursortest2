package com.vungle.ads.internal.model;

import defpackage.a7a;
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
public final class l2 implements iw8 {
    public static final l2 a;
    public static final /* synthetic */ uye b;

    static {
        l2 l2Var = new l2();
        a = l2Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.ConfigPayload.IABSettings", l2Var, 1);
        uyeVar.j("tcf_status", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(a7a.a)};
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
                obj = b2.i(uyeVar, 0, a7a.a, obj);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new o2(i, (Integer) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o2 o2Var = (o2) obj;
        encoder.getClass();
        o2Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        o2.a(o2Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
