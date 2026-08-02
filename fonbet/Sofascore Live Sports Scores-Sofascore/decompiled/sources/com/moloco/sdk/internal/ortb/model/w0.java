package com.moloco.sdk.internal.ortb.model;

import defpackage.a7a;
import defpackage.c88;
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
public final /* synthetic */ class w0 implements iw8 {
    public static final w0 a;
    public static final uye b;

    static {
        w0 w0Var = new w0();
        a = w0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.DECRatingSerializable", w0Var, 5);
        uyeVar.j("rating_value", true);
        uyeVar.j("foreground_color", true);
        uyeVar.j("background_color", true);
        uyeVar.j("rating_size", true);
        uyeVar.j("font_size", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(c88.a);
        uhi uhiVar = uhi.a;
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{W, W2, W3, l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Float f = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                f = (Float) b2.i(uyeVar, 0, c88.a, f);
                i |= 1;
            } else if (o == 1) {
                str = (String) b2.i(uyeVar, 1, uhi.a, str);
                i |= 2;
            } else if (o == 2) {
                str2 = (String) b2.i(uyeVar, 2, uhi.a, str2);
                i |= 4;
            } else if (o == 3) {
                num = (Integer) b2.i(uyeVar, 3, a7a.a, num);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                num2 = (Integer) b2.i(uyeVar, 4, a7a.a, num2);
                i |= 16;
            }
        }
        b2.c(uyeVar);
        return new x0(i, f, str, str2, num, num2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x0 x0Var = (x0) obj;
        encoder.getClass();
        x0Var.getClass();
        Integer num = x0Var.e;
        Integer num2 = x0Var.d;
        String str = x0Var.c;
        String str2 = x0Var.b;
        Float f = x0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || f != null) {
            b2.h(uyeVar, 0, c88.a, f);
        }
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 1, uhi.a, str2);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 2, uhi.a, str);
        }
        if (b2.o(uyeVar) || num2 != null) {
            b2.h(uyeVar, 3, a7a.a, num2);
        }
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 4, a7a.a, num);
        }
        b2.c(uyeVar);
    }
}
