package com.vungle.ads.internal.model;

import defpackage.iw8;
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
public final class j0 implements iw8 {
    public static final j0 a;
    public static final /* synthetic */ uye b;

    static {
        j0 j0Var = new j0();
        a = j0Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.AppNode", j0Var, 3);
        uyeVar.j("bundle", false);
        uyeVar.j("ver", false);
        uyeVar.j("id", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{uhiVar, uhiVar, uhiVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                str = b2.n(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                str2 = b2.n(uyeVar, 1);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                str3 = b2.n(uyeVar, 2);
                i |= 4;
            }
        }
        b2.c(uyeVar);
        return new l0(i, str, str2, str3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0 l0Var = (l0) obj;
        encoder.getClass();
        l0Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        l0.a(l0Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
