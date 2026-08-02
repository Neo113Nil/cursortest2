package com.moloco.sdk.internal.ortb.model;

import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.r13;
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
public final /* synthetic */ class f1 implements iw8 {
    public static final f1 a;
    public static final uye b;

    static {
        f1 f1Var = new f1();
        a = f1Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.InlineTextButton", f1Var, 7);
        uyeVar.j("text", true);
        uyeVar.j("use_icon", true);
        uyeVar.j("text_position", true);
        uyeVar.j("foreground_color", true);
        uyeVar.j("background_color", true);
        uyeVar.j("font_size", true);
        uyeVar.j("icon_size", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(gz1.a);
        KSerializer W3 = l98.W(uhiVar);
        f0 f0Var = f0.a;
        KSerializer W4 = l98.W(f0Var);
        KSerializer W5 = l98.W(f0Var);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{W, W2, W3, W4, W5, l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        r13 r13Var = null;
        r13 r13Var2 = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b2.i(uyeVar, 0, uhi.a, str);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) b2.i(uyeVar, 1, gz1.a, bool);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b2.i(uyeVar, 2, uhi.a, str2);
                    i |= 4;
                    break;
                case 3:
                    r13Var = (r13) b2.i(uyeVar, 3, f0.a, r13Var);
                    i |= 8;
                    break;
                case 4:
                    r13Var2 = (r13) b2.i(uyeVar, 4, f0.a, r13Var2);
                    i |= 16;
                    break;
                case 5:
                    num = (Integer) b2.i(uyeVar, 5, a7a.a, num);
                    i |= 32;
                    break;
                case 6:
                    num2 = (Integer) b2.i(uyeVar, 6, a7a.a, num2);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b2.c(uyeVar);
        return new g1(i, str, bool, str2, r13Var, r13Var2, num, num2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g1 g1Var = (g1) obj;
        encoder.getClass();
        g1Var.getClass();
        Integer num = g1Var.g;
        Integer num2 = g1Var.f;
        r13 r13Var = g1Var.e;
        r13 r13Var2 = g1Var.d;
        String str = g1Var.c;
        Boolean bool = g1Var.b;
        String str2 = g1Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 0, uhi.a, str2);
        }
        if (b2.o(uyeVar) || bool != null) {
            b2.h(uyeVar, 1, gz1.a, bool);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 2, uhi.a, str);
        }
        if (b2.o(uyeVar) || r13Var2 != null) {
            b2.h(uyeVar, 3, f0.a, r13Var2);
        }
        if (b2.o(uyeVar) || r13Var != null) {
            b2.h(uyeVar, 4, f0.a, r13Var);
        }
        if (b2.o(uyeVar) || num2 != null) {
            b2.h(uyeVar, 5, a7a.a, num2);
        }
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 6, a7a.a, num);
        }
        b2.c(uyeVar);
    }
}
