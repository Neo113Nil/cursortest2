package com.vungle.ads.internal.network;

import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.q79;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import defpackage.z8e;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b implements iw8 {
    public static final b a;
    public static final /* synthetic */ uye b;

    static {
        b bVar = new b();
        a = bVar;
        uye uyeVar = new uye("com.vungle.ads.internal.network.FailedTpat", bVar, 6);
        uyeVar.j("method", true);
        uyeVar.j("headers", true);
        uyeVar.j("body", true);
        uyeVar.j("retryAttempt", true);
        uyeVar.j("retryCount", false);
        uyeVar.j("tpatKey", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(new q79(uhiVar, uhiVar, 1));
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{e.a, W, W2, a7aVar, a7aVar, W3};
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
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj4 = b2.w(uyeVar, 0, e.a, obj4);
                    i |= 1;
                    break;
                case 1:
                    uhi uhiVar = uhi.a;
                    obj3 = b2.i(uyeVar, 1, new q79(uhiVar, uhiVar, 1), obj3);
                    i |= 2;
                    break;
                case 2:
                    obj2 = b2.i(uyeVar, 2, uhi.a, obj2);
                    i |= 4;
                    break;
                case 3:
                    i2 = b2.l(uyeVar, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = b2.l(uyeVar, 4);
                    i |= 16;
                    break;
                case 5:
                    obj = b2.i(uyeVar, 5, uhi.a, obj);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b2.c(uyeVar);
        return new d(i, (g) obj4, (Map) obj3, (String) obj2, i2, i3, (String) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        encoder.getClass();
        dVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        d.a(dVar, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
