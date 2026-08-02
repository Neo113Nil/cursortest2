package com.moloco.sdk.internal.ortb.model;

import defpackage.c8k;
import defpackage.iw8;
import defpackage.uf3;
import defpackage.uye;
import defpackage.wf3;
import defpackage.y7k;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements iw8 {
    public static final m a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return k0.a;
        }
    }

    static {
        m mVar = new m();
        a = mVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.VastPrivacyIcon", mVar, 3);
        uyeVar.j("padding", false);
        uyeVar.j("horizontal_alignment", false);
        uyeVar.j("vertical_alignment", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = n.d;
        return new KSerializer[]{c8k.a, kSerializerArr[1], kSerializerArr[2]};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = n.d;
        boolean z = true;
        int i = 0;
        y7k y7kVar = null;
        e1 e1Var = null;
        o oVar = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                y7kVar = (y7k) b2.w(uyeVar, 0, c8k.a, y7kVar);
                i |= 1;
            } else if (o == 1) {
                e1Var = (e1) b2.w(uyeVar, 1, kSerializerArr[1], e1Var);
                i |= 2;
            } else {
                if (o != 2) {
                    yhk.e(o);
                    return null;
                }
                oVar = (o) b2.w(uyeVar, 2, kSerializerArr[2], oVar);
                i |= 4;
            }
        }
        b2.c(uyeVar);
        return new n(i, y7kVar, e1Var, oVar);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        encoder.getClass();
        nVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        KSerializer[] kSerializerArr = n.d;
        b2.f(uyeVar, 0, c8k.a, new y7k(nVar.a));
        b2.f(uyeVar, 1, kSerializerArr[1], nVar.b);
        b2.f(uyeVar, 2, kSerializerArr[2], nVar.c);
        b2.c(uyeVar);
    }
}
