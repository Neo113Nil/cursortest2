package com.moloco.sdk.internal.ortb.model;

import defpackage.gz1;
import defpackage.iw8;
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
public final /* synthetic */ class p implements iw8 {
    public static final p a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return q0.a;
        }
    }

    static {
        p pVar = new p();
        a = pVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.AndroidInline", pVar, 2);
        uyeVar.j("enabled", false);
        uyeVar.j("url", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{gz1.a, uhi.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                z2 = b2.B(uyeVar, 0);
                i |= 1;
            } else {
                if (o != 1) {
                    yhk.e(o);
                    return null;
                }
                str = b2.n(uyeVar, 1);
                i |= 2;
            }
        }
        b2.c(uyeVar);
        return new q(i, str, z2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q qVar = (q) obj;
        encoder.getClass();
        qVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        b2.x(uyeVar, 0, qVar.a);
        b2.y(uyeVar, 1, qVar.b);
        b2.c(uyeVar);
    }
}
