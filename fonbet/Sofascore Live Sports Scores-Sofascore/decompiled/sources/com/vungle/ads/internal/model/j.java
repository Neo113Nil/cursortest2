package com.vungle.ads.internal.model;

import defpackage.h75;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j implements iw8 {
    public static final j a;
    public static final /* synthetic */ uye b;

    static {
        j jVar = new j();
        a = jVar;
        uye uyeVar = new uye("com.vungle.ads.internal.model.AdPayload.CSBResponse", jVar, 3);
        uyeVar.j("price", true);
        uyeVar.j("nurls", true);
        uyeVar.j("lurls", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(h75.a);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, l98.W(new xg0(uhiVar, 0)), l98.W(new xg0(uhiVar, 0))};
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
                obj3 = b2.i(uyeVar, 0, h75.a, obj3);
                i |= 1;
            } else if (o == 1) {
                obj2 = b2.i(uyeVar, 1, new xg0(uhi.a, 0), obj2);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 2, new xg0(uhi.a, 0), obj);
                i |= 4;
            }
        }
        b2.c(uyeVar);
        return new l(i, (Double) obj3, (List) obj2, (List) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        encoder.getClass();
        lVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        l.a(lVar, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
