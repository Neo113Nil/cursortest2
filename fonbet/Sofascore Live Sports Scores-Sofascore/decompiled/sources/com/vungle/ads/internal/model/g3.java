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
public final class g3 implements iw8 {
    public static final g3 a;
    public static final /* synthetic */ uye b;

    static {
        g3 g3Var = new g3();
        a = g3Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.Placement", g3Var, 3);
        uyeVar.j("placement_ref_id", false);
        uyeVar.j("is_hb", true);
        uyeVar.j("type", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, gz1.a, l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Object obj = null;
        String str = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b2.n(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                z2 = b2.B(uyeVar, 1);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                obj = b2.i(uyeVar, 2, uhi.a, obj);
                i |= 4;
            }
        }
        b2.c(uyeVar);
        return new i3(i, str, z2, (String) obj);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i3 i3Var = (i3) obj;
        encoder.getClass();
        i3Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        i3.a(i3Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
