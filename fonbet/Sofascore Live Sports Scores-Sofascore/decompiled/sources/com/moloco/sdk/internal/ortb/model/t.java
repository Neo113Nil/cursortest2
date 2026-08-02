package com.moloco.sdk.internal.ortb.model;

import defpackage.gz1;
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
public final /* synthetic */ class t implements iw8 {
    public static final t a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return y0.a;
        }
    }

    static {
        t tVar = new t();
        a = tVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.AutoStore", tVar, 3);
        uyeVar.j("enabled", false);
        uyeVar.j("on_skip", true);
        uyeVar.j("event_link", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(uhi.a);
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{gz1Var, gz1Var, W};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                z2 = b2.B(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                z3 = b2.B(uyeVar, 1);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                str = (String) b2.i(uyeVar, 2, uhi.a, str);
                i |= 4;
            }
        }
        b2.c(uyeVar);
        return new u(i, str, z2, z3);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u uVar = (u) obj;
        encoder.getClass();
        uVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        boolean z = uVar.a;
        String str = uVar.c;
        boolean z2 = uVar.b;
        b2.x(uyeVar, 0, z);
        if (b2.o(uyeVar) || !z2) {
            b2.x(uyeVar, 1, z2);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 2, uhi.a, str);
        }
        b2.c(uyeVar);
    }
}
