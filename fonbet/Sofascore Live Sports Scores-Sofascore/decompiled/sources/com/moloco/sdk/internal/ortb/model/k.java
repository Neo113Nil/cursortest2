package com.moloco.sdk.internal.ortb.model;

import defpackage.c8k;
import defpackage.iw8;
import defpackage.l98;
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
public final /* synthetic */ class k implements iw8 {
    public static final k a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return g0.a;
        }
    }

    static {
        k kVar = new k();
        a = kVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.SkipClose", kVar, 7);
        uyeVar.j("delay_seconds", false);
        uyeVar.j("padding", false);
        uyeVar.j("control_size", false);
        uyeVar.j("horizontal_alignment", false);
        uyeVar.j("vertical_alignment", false);
        uyeVar.j("foreground_color", false);
        uyeVar.j("background_color", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = l.h;
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[4];
        f0 f0Var = f0.a;
        KSerializer W = l98.W(f0Var);
        c8k c8kVar = c8k.a;
        return new KSerializer[]{c8kVar, c8kVar, c8kVar, kSerializer, kSerializer2, f0Var, W};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = l.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        y7k y7kVar = null;
        y7k y7kVar2 = null;
        y7k y7kVar3 = null;
        e1 e1Var = null;
        o oVar = null;
        r13 r13Var = null;
        r13 r13Var2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    y7kVar = (y7k) b2.w(uyeVar, 0, c8k.a, y7kVar);
                    i |= 1;
                    break;
                case 1:
                    y7kVar2 = (y7k) b2.w(uyeVar, 1, c8k.a, y7kVar2);
                    i |= 2;
                    break;
                case 2:
                    y7kVar3 = (y7k) b2.w(uyeVar, 2, c8k.a, y7kVar3);
                    i |= 4;
                    break;
                case 3:
                    e1Var = (e1) b2.w(uyeVar, 3, kSerializerArr[3], e1Var);
                    i |= 8;
                    break;
                case 4:
                    oVar = (o) b2.w(uyeVar, 4, kSerializerArr[4], oVar);
                    i |= 16;
                    break;
                case 5:
                    r13Var = (r13) b2.w(uyeVar, 5, f0.a, r13Var);
                    i |= 32;
                    break;
                case 6:
                    r13Var2 = (r13) b2.i(uyeVar, 6, f0.a, r13Var2);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new l(i, y7kVar, y7kVar2, y7kVar3, e1Var, oVar, r13Var, r13Var2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        encoder.getClass();
        lVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        KSerializer[] kSerializerArr = l.h;
        c8k c8kVar = c8k.a;
        int i = lVar.a;
        r13 r13Var = lVar.g;
        b2.f(uyeVar, 0, c8kVar, new y7k(i));
        b2.f(uyeVar, 1, c8kVar, new y7k(lVar.b));
        b2.f(uyeVar, 2, c8kVar, new y7k(lVar.c));
        b2.f(uyeVar, 3, kSerializerArr[3], lVar.d);
        b2.f(uyeVar, 4, kSerializerArr[4], lVar.e);
        f0 f0Var = f0.a;
        b2.f(uyeVar, 5, f0Var, new r13(lVar.f));
        if (b2.o(uyeVar) || r13Var != null) {
            b2.h(uyeVar, 6, f0Var, r13Var);
        }
        b2.c(uyeVar);
    }
}
