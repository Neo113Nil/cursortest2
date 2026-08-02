package com.vungle.ads.internal.model;

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
public final class t implements iw8 {
    public static final t a;
    public static final /* synthetic */ uye b;

    static {
        t tVar = new t();
        a = tVar;
        uye uyeVar = new uye("com.vungle.ads.internal.model.AdPayload.TemplateSettings", tVar, 2);
        uyeVar.j("normal_replacements", true);
        uyeVar.j("cacheable_replacements", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(new q79(uhiVar, uhiVar, 1)), l98.W(new q79(uhiVar, m.a, 1))};
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
                uhi uhiVar = uhi.a;
                obj2 = b2.i(uyeVar, 0, new q79(uhiVar, uhiVar, 1), obj2);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 1, new q79(uhi.a, m.a, 1), obj);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new v(i, (Map) obj2, (Map) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v vVar = (v) obj;
        encoder.getClass();
        vVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        v.a(vVar, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
