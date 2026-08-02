package com.moloco.sdk.internal.ortb.model;

import defpackage.iw8;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements iw8 {
    public static final b0 a;
    public static final uye b;

    static {
        b0 b0Var = new b0();
        a = b0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.BidResponse", b0Var, 1);
        uyeVar.j("seatbid", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c0.b[0]};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = c0.b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else {
                if (o != 0) {
                    yhk.e(o);
                    return null;
                }
                list = (List) b2.w(uyeVar, 0, kSerializerArr[0], list);
                i = 1;
            }
        }
        b2.c(uyeVar);
        return new c0(i, list);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c0 c0Var = (c0) obj;
        encoder.getClass();
        c0Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        b2.f(uyeVar, 0, c0.b[0], c0Var.a);
        b2.c(uyeVar);
    }
}
