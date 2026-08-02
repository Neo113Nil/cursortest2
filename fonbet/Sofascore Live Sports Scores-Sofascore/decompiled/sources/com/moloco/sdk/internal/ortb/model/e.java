package com.moloco.sdk.internal.ortb.model;

import defpackage.c8k;
import defpackage.iw8;
import defpackage.r13;
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
public final /* synthetic */ class e implements iw8 {
    public static final e a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return x.a;
        }
    }

    static {
        e eVar = new e();
        a = eVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.ProgressBar", eVar, 4);
        uyeVar.j("padding", false);
        uyeVar.j("horizontal_alignment", false);
        uyeVar.j("vertical_alignment", false);
        uyeVar.j("foreground_color", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = f.e;
        return new KSerializer[]{c8k.a, kSerializerArr[1], kSerializerArr[2], f0.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = f.e;
        boolean z = true;
        int i = 0;
        y7k y7kVar = null;
        e1 e1Var = null;
        o oVar = null;
        r13 r13Var = null;
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
            } else if (o == 2) {
                oVar = (o) b2.w(uyeVar, 2, kSerializerArr[2], oVar);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                r13Var = (r13) b2.w(uyeVar, 3, f0.a, r13Var);
                i |= 8;
            }
        }
        b2.c(uyeVar);
        return new f(i, y7kVar, e1Var, oVar, r13Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        encoder.getClass();
        fVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        KSerializer[] kSerializerArr = f.e;
        b2.f(uyeVar, 0, c8k.a, new y7k(fVar.a));
        b2.f(uyeVar, 1, kSerializerArr[1], fVar.b);
        b2.f(uyeVar, 2, kSerializerArr[2], fVar.c);
        b2.f(uyeVar, 3, f0.a, new r13(fVar.d));
        b2.c(uyeVar);
    }
}
