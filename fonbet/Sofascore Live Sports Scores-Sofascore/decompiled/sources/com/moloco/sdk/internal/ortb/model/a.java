package com.moloco.sdk.internal.ortb.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.c8k;
import defpackage.gz1;
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
public final /* synthetic */ class a implements iw8 {
    public static final a a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return p.a;
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.Mute", aVar, 7);
        uyeVar.j(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
        uyeVar.j("padding", false);
        uyeVar.j("horizontal_alignment", false);
        uyeVar.j("vertical_alignment", false);
        uyeVar.j("foreground_color", false);
        uyeVar.j("control_size", true);
        uyeVar.j("background_color", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = com.moloco.sdk.internal.ortb.model.b.h;
        c8k c8kVar = c8k.a;
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer kSerializer2 = kSerializerArr[3];
        f0 f0Var = f0.a;
        return new KSerializer[]{gz1.a, c8kVar, kSerializer, kSerializer2, f0Var, l98.W(c8kVar), l98.W(f0Var)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        KSerializer[] kSerializerArr = com.moloco.sdk.internal.ortb.model.b.h;
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        y7k y7kVar = null;
        e1 e1Var = null;
        o oVar = null;
        r13 r13Var = null;
        y7k y7kVar2 = null;
        r13 r13Var2 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b2.B(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    y7kVar = (y7k) b2.w(uyeVar, 1, c8k.a, y7kVar);
                    i |= 2;
                    break;
                case 2:
                    e1Var = (e1) b2.w(uyeVar, 2, kSerializerArr[2], e1Var);
                    i |= 4;
                    break;
                case 3:
                    oVar = (o) b2.w(uyeVar, 3, kSerializerArr[3], oVar);
                    i |= 8;
                    break;
                case 4:
                    r13Var = (r13) b2.w(uyeVar, 4, f0.a, r13Var);
                    i |= 16;
                    break;
                case 5:
                    y7kVar2 = (y7k) b2.i(uyeVar, 5, c8k.a, y7kVar2);
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
        return new com.moloco.sdk.internal.ortb.model.b(i, z2, y7kVar, e1Var, oVar, r13Var, y7kVar2, r13Var2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        com.moloco.sdk.internal.ortb.model.b bVar = (com.moloco.sdk.internal.ortb.model.b) obj;
        encoder.getClass();
        bVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        KSerializer[] kSerializerArr = com.moloco.sdk.internal.ortb.model.b.h;
        boolean z = bVar.a;
        r13 r13Var = bVar.g;
        y7k y7kVar = bVar.f;
        b2.x(uyeVar, 0, z);
        c8k c8kVar = c8k.a;
        b2.f(uyeVar, 1, c8kVar, new y7k(bVar.b));
        b2.f(uyeVar, 2, kSerializerArr[2], bVar.c);
        b2.f(uyeVar, 3, kSerializerArr[3], bVar.d);
        f0 f0Var = f0.a;
        b2.f(uyeVar, 4, f0Var, new r13(bVar.e));
        if (b2.o(uyeVar) || y7kVar != null) {
            b2.h(uyeVar, 5, c8kVar, y7kVar);
        }
        if (b2.o(uyeVar) || r13Var != null) {
            b2.h(uyeVar, 6, f0Var, r13Var);
        }
        b2.c(uyeVar);
    }
}
