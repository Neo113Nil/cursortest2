package com.moloco.sdk.internal.ilrd;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.a7a;
import defpackage.iw8;
import defpackage.lkb;
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
public final /* synthetic */ class f implements iw8 {
    public static final f a;
    public static final uye b;

    static {
        f fVar = new f();
        a = fVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", fVar, 6);
        uyeVar.j("lastEventReceivedTs", false);
        uyeVar.j("banner", false);
        uyeVar.j("mrec", false);
        uyeVar.j(IronSourceConstants.EVENTS_NATIVE, false);
        uyeVar.j("interstitial", false);
        uyeVar.j("rewarded", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        a7a a7aVar = a7a.a;
        return new KSerializer[]{lkb.a, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        long j = 0;
        boolean z = true;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    j = b2.g(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = b2.l(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    i3 = b2.l(uyeVar, 2);
                    i |= 4;
                    break;
                case 3:
                    i4 = b2.l(uyeVar, 3);
                    i |= 8;
                    break;
                case 4:
                    i5 = b2.l(uyeVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i6 = b2.l(uyeVar, 5);
                    i |= 32;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        b2.c(uyeVar);
        return new g(i, j, i2, i3, i4, i5, i6);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        encoder.getClass();
        gVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        b2.E(uyeVar, 0, gVar.a);
        b2.u(1, gVar.b, uyeVar);
        b2.u(2, gVar.c, uyeVar);
        b2.u(3, gVar.d, uyeVar);
        b2.u(4, gVar.e, uyeVar);
        b2.u(5, gVar.f, uyeVar);
        b2.c(uyeVar);
    }
}
