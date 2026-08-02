package com.vungle.ads.internal.model;

import defpackage.gz1;
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
public final class i2 implements iw8 {
    public static final i2 a;
    public static final /* synthetic */ uye b;

    static {
        i2 i2Var = new i2();
        a = i2Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", i2Var, 6);
        uyeVar.j("is_country_data_protected", true);
        uyeVar.j("consent_title", true);
        uyeVar.j("consent_message", true);
        uyeVar.j("consent_message_version", true);
        uyeVar.j("button_accept", true);
        uyeVar.j("button_deny", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(gz1.a);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar)};
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
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj6 = b2.i(uyeVar, 0, gz1.a, obj6);
                    i |= 1;
                    break;
                case 1:
                    obj5 = b2.i(uyeVar, 1, uhi.a, obj5);
                    i |= 2;
                    break;
                case 2:
                    obj4 = b2.i(uyeVar, 2, uhi.a, obj4);
                    i |= 4;
                    break;
                case 3:
                    obj3 = b2.i(uyeVar, 3, uhi.a, obj3);
                    i |= 8;
                    break;
                case 4:
                    obj2 = b2.i(uyeVar, 4, uhi.a, obj2);
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
        return new k2(i, (Boolean) obj6, (String) obj5, (String) obj4, (String) obj3, (String) obj2, (String) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k2 k2Var = (k2) obj;
        encoder.getClass();
        k2Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        k2.a(k2Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
