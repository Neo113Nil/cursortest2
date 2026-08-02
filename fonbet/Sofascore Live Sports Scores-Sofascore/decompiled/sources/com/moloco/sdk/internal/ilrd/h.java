package com.moloco.sdk.internal.ilrd;

import defpackage.gz1;
import defpackage.iw8;
import defpackage.lkb;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements iw8 {
    public static final h a;
    public static final uye b;

    static {
        h hVar = new h();
        a = hVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", hVar, 4);
        uyeVar.j("sessionId", false);
        uyeVar.j("impressionCounts", false);
        uyeVar.j("isExpired", false);
        uyeVar.j("sessionStartTs", false);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uhi.a, f.a, gz1.a, lkb.a};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        int i = 0;
        boolean z = false;
        String str = null;
        g gVar = null;
        long j = 0;
        boolean z2 = true;
        while (z2) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z2 = false;
            } else if (o == 0) {
                str = b2.n(uyeVar, 0);
                i |= 1;
            } else if (o == 1) {
                gVar = (g) b2.w(uyeVar, 1, f.a, gVar);
                i |= 2;
            } else if (o == 2) {
                z = b2.B(uyeVar, 2);
                i |= 4;
            } else {
                if (o != 3) {
                    yhk.e(o);
                    return null;
                }
                j = b2.g(uyeVar, 3);
                i |= 8;
            }
        }
        b2.c(uyeVar);
        return new i(i, str, gVar, z, j);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        encoder.getClass();
        iVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        b2.y(uyeVar, 0, iVar.a);
        b2.f(uyeVar, 1, f.a, iVar.b);
        b2.x(uyeVar, 2, iVar.c);
        b2.E(uyeVar, 3, iVar.d);
        b2.c(uyeVar);
    }
}
