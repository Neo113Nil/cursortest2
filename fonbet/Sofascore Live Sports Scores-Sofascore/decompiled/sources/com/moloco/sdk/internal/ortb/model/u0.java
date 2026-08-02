package com.moloco.sdk.internal.ortb.model;

import defpackage.a7a;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class u0 implements iw8 {
    public static final u0 a;
    public static final uye b;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.DECCtaSerializable", u0Var, 7);
        uyeVar.j("vertical_spacing", true);
        uyeVar.j("text", true);
        uyeVar.j("button_width", true);
        uyeVar.j("font_size", true);
        uyeVar.j("border", true);
        uyeVar.j("foreground_color", true);
        uyeVar.j("background_color", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        KSerializer W = l98.W(a7aVar);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, l98.W(uhiVar), l98.W(a7aVar), l98.W(a7aVar), l98.W(s0.a), l98.W(uhiVar), l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        t0 t0Var = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b2.i(uyeVar, 0, a7a.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b2.i(uyeVar, 1, uhi.a, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b2.i(uyeVar, 2, a7a.a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) b2.i(uyeVar, 3, a7a.a, num3);
                    i |= 8;
                    break;
                case 4:
                    t0Var = (t0) b2.i(uyeVar, 4, s0.a, t0Var);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) b2.i(uyeVar, 5, uhi.a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) b2.i(uyeVar, 6, uhi.a, str3);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b2.c(uyeVar);
        return new v0(i, num, str, num2, num3, t0Var, str2, str3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v0 v0Var = (v0) obj;
        encoder.getClass();
        v0Var.getClass();
        String str = v0Var.g;
        String str2 = v0Var.f;
        t0 t0Var = v0Var.e;
        Integer num = v0Var.d;
        Integer num2 = v0Var.c;
        String str3 = v0Var.b;
        Integer num3 = v0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || num3 != null) {
            b2.h(uyeVar, 0, a7a.a, num3);
        }
        if (b2.o(uyeVar) || str3 != null) {
            b2.h(uyeVar, 1, uhi.a, str3);
        }
        if (b2.o(uyeVar) || num2 != null) {
            b2.h(uyeVar, 2, a7a.a, num2);
        }
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 3, a7a.a, num);
        }
        if (b2.o(uyeVar) || t0Var != null) {
            b2.h(uyeVar, 4, s0.a, t0Var);
        }
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 5, uhi.a, str2);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 6, uhi.a, str);
        }
        b2.c(uyeVar);
    }
}
