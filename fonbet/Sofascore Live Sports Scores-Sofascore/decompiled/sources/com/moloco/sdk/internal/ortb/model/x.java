package com.moloco.sdk.internal.ortb.model;

import com.ironsource.C4227o2;
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
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements iw8 {
    public static final x a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return f1.a;
        }
    }

    static {
        x xVar = new x();
        a = xVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.Bid", xVar, 8);
        uyeVar.j("adm", false);
        uyeVar.j("price", false);
        uyeVar.j(C4227o2.y, true);
        uyeVar.j("ext", false);
        uyeVar.j("crid", true);
        uyeVar.j("bundle", true);
        uyeVar.j("w", true);
        uyeVar.j(com.mbridge.msdk.foundation.same.report.h.b, true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        KSerializer W2 = l98.W(uhiVar);
        KSerializer W3 = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, c88.a, W, z.a, W2, W3, l98.W(a7aVar), l98.W(a7aVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        Object obj = null;
        int i = 0;
        String str = null;
        String str2 = null;
        a0 a0Var = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        Integer num2 = null;
        float f = 0.0f;
        boolean z = true;
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
                    f = b2.s(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) b2.i(uyeVar, 2, uhi.a, str2);
                    i |= 4;
                    break;
                case 3:
                    a0Var = (a0) b2.w(uyeVar, 3, z.a, a0Var);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b2.i(uyeVar, 4, uhi.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b2.i(uyeVar, 5, uhi.a, str4);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) b2.i(uyeVar, 6, a7a.a, num);
                    i |= 64;
                    break;
                case 7:
                    num2 = (Integer) b2.i(uyeVar, 7, a7a.a, num2);
                    i |= 128;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new y(i, str, f, str2, a0Var, str3, str4, num, num2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y yVar = (y) obj;
        encoder.getClass();
        yVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        String str = yVar.a;
        Integer num = yVar.h;
        Integer num2 = yVar.g;
        String str2 = yVar.f;
        String str3 = yVar.e;
        String str4 = yVar.c;
        b2.y(uyeVar, 0, str);
        b2.t(uyeVar, 1, yVar.b);
        if (b2.o(uyeVar) || str4 != null) {
            b2.h(uyeVar, 2, uhi.a, str4);
        }
        b2.f(uyeVar, 3, z.a, yVar.d);
        if (b2.o(uyeVar) || str3 != null) {
            b2.h(uyeVar, 4, uhi.a, str3);
        }
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 5, uhi.a, str2);
        }
        if (b2.o(uyeVar) || num2 != null) {
            b2.h(uyeVar, 6, a7a.a, num2);
        }
        if (b2.o(uyeVar) || num != null) {
            b2.h(uyeVar, 7, a7a.a, num);
        }
        b2.c(uyeVar);
    }
}
