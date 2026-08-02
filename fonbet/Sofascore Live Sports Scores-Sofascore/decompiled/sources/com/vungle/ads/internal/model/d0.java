package com.vungle.ads.internal.model;

import defpackage.gz1;
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
public final class d0 implements iw8 {
    public static final d0 a;
    public static final /* synthetic */ uye b;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.AdPayload.WebViewSettings", d0Var, 2);
        uyeVar.j("allow_file_access_from_file_urls", true);
        uyeVar.j("allow_universal_access_from_file_urls", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{l98.W(gz1Var), l98.W(gz1Var)};
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
                obj = b2.i(uyeVar, 1, gz1.a, obj);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new f0(i, (Boolean) obj2, (Boolean) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f0 f0Var = (f0) obj;
        encoder.getClass();
        f0Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        f0.a(f0Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
