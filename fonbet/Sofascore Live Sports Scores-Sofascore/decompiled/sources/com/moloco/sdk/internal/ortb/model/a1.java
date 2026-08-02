package com.moloco.sdk.internal.ortb.model;

import defpackage.c88;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements iw8 {
    public static final a1 a;
    public static final uye b;

    static {
        a1 a1Var = new a1();
        a = a1Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.ExperimentalConfigs", a1Var, 4);
        uyeVar.j("server_rendering_ignore_net_err_failed", true);
        uyeVar.j("compose_removal_enabled", true);
        uyeVar.j("adaptive_banner_blur_bg_enabled", true);
        uyeVar.j("adaptive_banner_blur_gap_threshold", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        gz1 gz1Var = gz1.a;
        return new KSerializer[]{l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(c88.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Float f = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                bool = (Boolean) b2.i(uyeVar, 0, gz1.a, bool);
                i |= 1;
            } else if (o == 1) {
                bool2 = (Boolean) b2.i(uyeVar, 1, gz1.a, bool2);
                i |= 2;
            } else if (o == 2) {
                bool3 = (Boolean) b2.i(uyeVar, 2, gz1.a, bool3);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                f = (Float) b2.i(uyeVar, 3, c88.a, f);
                i |= 8;
            }
        }
        b2.c(uyeVar);
        return new b1(i, bool, bool2, bool3, f);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b1 b1Var = (b1) obj;
        encoder.getClass();
        b1Var.getClass();
        Float f = b1Var.d;
        Boolean bool = b1Var.c;
        Boolean bool2 = b1Var.b;
        Boolean bool3 = b1Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || bool3 != null) {
            b2.h(uyeVar, 0, gz1.a, bool3);
        }
        if (b2.o(uyeVar) || bool2 != null) {
            b2.h(uyeVar, 1, gz1.a, bool2);
        }
        if (b2.o(uyeVar) || bool != null) {
            b2.h(uyeVar, 2, gz1.a, bool);
        }
        if (b2.o(uyeVar) || f != null) {
            b2.h(uyeVar, 3, c88.a, f);
        }
        b2.c(uyeVar);
    }
}
