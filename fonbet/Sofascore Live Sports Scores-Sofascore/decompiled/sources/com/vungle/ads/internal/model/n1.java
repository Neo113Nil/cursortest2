package com.vungle.ads.internal.model;

import com.ironsource.C4238od;
import com.mbridge.msdk.MBridgeConstans;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
public final class n1 implements iw8 {
    public static final n1 a;
    public static final /* synthetic */ uye b;

    static {
        n1 n1Var = new n1();
        a = n1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", n1Var, 7);
        uyeVar.j(C4238od.c, true);
        uyeVar.j("ad_size", true);
        uyeVar.j("ad_start_time", true);
        uyeVar.j(MBridgeConstans.APP_ID, true);
        uyeVar.j("placement_reference_id", true);
        uyeVar.j("user", true);
        uyeVar.j("csb", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(new xg0(uhiVar, 0)), l98.W(r0.a), l98.W(lkb.a), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(a1.a)};
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
        Object obj7 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    obj7 = b2.i(uyeVar, 0, new xg0(uhi.a, 0), obj7);
                    i |= 1;
                    break;
                case 1:
                    obj6 = b2.i(uyeVar, 1, r0.a, obj6);
                    i |= 2;
                    break;
                case 2:
                    obj5 = b2.i(uyeVar, 2, lkb.a, obj5);
                    i |= 4;
                    break;
                case 3:
                    obj4 = b2.i(uyeVar, 3, uhi.a, obj4);
                    i |= 8;
                    break;
                case 4:
                    obj3 = b2.i(uyeVar, 4, uhi.a, obj3);
                    i |= 16;
                    break;
                case 5:
                    obj2 = b2.i(uyeVar, 5, uhi.a, obj2);
                    i |= 32;
                    break;
                case 6:
                    obj = b2.i(uyeVar, 6, a1.a, obj);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b2.c(uyeVar);
        return new p1(i, (List) obj7, (t0) obj6, (Long) obj5, (String) obj4, (String) obj3, (String) obj2, (c1) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p1 p1Var = (p1) obj;
        encoder.getClass();
        p1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        p1.a(p1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
