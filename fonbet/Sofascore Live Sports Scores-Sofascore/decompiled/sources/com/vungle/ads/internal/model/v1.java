package com.vungle.ads.internal.model;

import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
public final class v1 implements iw8 {
    public static final v1 a;
    public static final /* synthetic */ uye b;

    static {
        v1 v1Var = new v1();
        a = v1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.ConfigPayload.AutoRedirect", v1Var, 2);
        uyeVar.j("allow_auto_redirect", true);
        uyeVar.j("after_click_ms", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(gz1.a), l98.W(lkb.a)};
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
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                obj2 = b2.i(uyeVar, 0, gz1.a, obj2);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 1, lkb.a, obj);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new x1(i, (Boolean) obj2, (Long) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x1 x1Var = (x1) obj;
        encoder.getClass();
        x1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        x1.a(x1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
