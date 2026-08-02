package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.L6;
import defpackage.a7a;
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
public final class w2 implements iw8 {
    public static final w2 a;
    public static final /* synthetic */ uye b;

    static {
        w2 w2Var = new w2();
        a = w2Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.DeviceNode", w2Var, 11);
        uyeVar.j(L6.t, false);
        uyeVar.j(L6.B, false);
        uyeVar.j(L6.G, false);
        uyeVar.j(L6.R0, true);
        uyeVar.j(L6.F, false);
        uyeVar.j("w", false);
        uyeVar.j(com.mbridge.msdk.foundation.same.report.h.b, false);
        uyeVar.j(L6.d0, true);
        uyeVar.j("ifa", true);
        uyeVar.j("lmt", true);
        uyeVar.j("ext", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{uhiVar, uhiVar, uhiVar, W, uhiVar, a7aVar, a7aVar, l98.W(uhiVar), l98.W(uhiVar), l98.W(a7aVar), l98.W(y2.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
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
                    str2 = b2.n(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b2.n(uyeVar, 2);
                    i |= 4;
                    break;
                case 3:
                    obj6 = b2.i(uyeVar, 3, uhi.a, obj6);
                    i |= 8;
                    break;
                case 4:
                    str4 = b2.n(uyeVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i2 = b2.l(uyeVar, 5);
                    i |= 32;
                    break;
                case 6:
                    i3 = b2.l(uyeVar, 6);
                    i |= 64;
                    break;
                case 7:
                    obj5 = b2.i(uyeVar, 7, uhi.a, obj5);
                    i |= 128;
                    break;
                case 8:
                    obj4 = b2.i(uyeVar, 8, uhi.a, obj4);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    obj3 = b2.i(uyeVar, 9, a7a.a, obj3);
                    i |= 512;
                    break;
                case 10:
                    obj2 = b2.i(uyeVar, 10, y2.a, obj2);
                    i |= 1024;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new b3(i, str, str2, str3, (String) obj6, str4, i2, i3, (String) obj5, (String) obj4, (Integer) obj3, (a3) obj2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b3 b3Var = (b3) obj;
        encoder.getClass();
        b3Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        b3.a(b3Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
