package com.vungle.ads.internal.signals;

import defpackage.a7a;
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
public final class k implements iw8 {
    public static final k a;
    public static final /* synthetic */ uye b;

    static {
        k kVar = new k();
        a = kVar;
        uye uyeVar = new uye("com.vungle.ads.internal.signals.SignaledAd", kVar, 5);
        uyeVar.j("500", true);
        uyeVar.j("109", false);
        uyeVar.j("107", true);
        uyeVar.j("110", true);
        uyeVar.j("108", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        lkb lkbVar = lkb.a;
        return new KSerializer[]{W, lkbVar, W2, lkbVar, a7a.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        int i = 0;
        int i2 = 0;
        Object obj = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        Object obj2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                obj = b2.i(uyeVar, 0, uhi.a, obj);
                i |= 1;
            } else if (o == 1) {
                j = b2.g(uyeVar, 1);
                i |= 2;
            } else if (o == 2) {
                obj2 = b2.i(uyeVar, 2, uhi.a, obj2);
                i |= 4;
            } else if (o == 3) {
                j2 = b2.g(uyeVar, 3);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                i2 = b2.l(uyeVar, 4);
                i |= 16;
            }
        }
        b2.c(uyeVar);
        return new m(i, (String) obj, j, (String) obj2, j2, i2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m mVar = (m) obj;
        encoder.getClass();
        mVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        m.a(mVar, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
