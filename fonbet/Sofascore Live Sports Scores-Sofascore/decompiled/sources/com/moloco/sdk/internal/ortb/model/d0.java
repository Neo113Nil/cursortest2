package com.moloco.sdk.internal.ortb.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.c8k;
import defpackage.iw8;
import defpackage.l98;
import defpackage.r13;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.y7k;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements iw8 {
    public static final d0 a;
    public static final uye b;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.CTA", d0Var, 7);
        uyeVar.j("text", false);
        uyeVar.j(CampaignEx.JSON_KEY_IMAGE_URL, true);
        uyeVar.j("padding", false);
        uyeVar.j("horizontal_alignment", false);
        uyeVar.j("vertical_alignment", false);
        uyeVar.j("foreground_color", false);
        uyeVar.j("background_color", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = e0.h;
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[4];
        f0 f0Var = f0.a;
        return new KSerializer[]{uhiVar, W, c8k.a, kSerializer, kSerializer2, f0Var, l98.W(f0Var)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = e0.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        y7k y7kVar = null;
        e1 e1Var = null;
        o oVar = null;
        r13 r13Var = null;
        r13 r13Var2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b2.n(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b2.i(uyeVar, 1, uhi.a, str2);
                    i |= 2;
                    break;
                case 2:
                    y7kVar = (y7k) b2.w(uyeVar, 2, c8k.a, y7kVar);
                    i |= 4;
                    break;
                case 3:
                    e1Var = (e1) b2.w(uyeVar, 3, kSerializerArr[3], e1Var);
                    i |= 8;
                    break;
                case 4:
                    oVar = (o) b2.w(uyeVar, 4, kSerializerArr[4], oVar);
                    i |= 16;
                    break;
                case 5:
                    r13Var = (r13) b2.w(uyeVar, 5, f0.a, r13Var);
                    i |= 32;
                    break;
                case 6:
                    r13Var2 = (r13) b2.i(uyeVar, 6, f0.a, r13Var2);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new e0(i, str, str2, y7kVar, e1Var, oVar, r13Var, r13Var2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e0 e0Var = (e0) obj;
        encoder.getClass();
        e0Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        KSerializer[] kSerializerArr = e0.h;
        String str = e0Var.a;
        r13 r13Var = e0Var.g;
        String str2 = e0Var.b;
        b2.y(uyeVar, 0, str);
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 1, uhi.a, str2);
        }
        b2.f(uyeVar, 2, c8k.a, new y7k(e0Var.c));
        b2.f(uyeVar, 3, kSerializerArr[3], e0Var.d);
        b2.f(uyeVar, 4, kSerializerArr[4], e0Var.e);
        f0 f0Var = f0.a;
        b2.f(uyeVar, 5, f0Var, new r13(e0Var.f));
        if (b2.o(uyeVar) || r13Var != null) {
            b2.h(uyeVar, 6, f0Var, r13Var);
        }
        b2.c(uyeVar);
    }
}
