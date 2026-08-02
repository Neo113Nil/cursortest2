package com.moloco.sdk.internal.ortb.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements iw8 {
    public static final c a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return t.a;
        }
    }

    static {
        c cVar = new c();
        a = cVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.Player", cVar, 13);
        uyeVar.j("skip", true);
        uyeVar.j(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, false);
        uyeVar.j("progress_bar", true);
        uyeVar.j(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
        uyeVar.j(U3.i.G0, true);
        uyeVar.j("is_all_area_clickable", false);
        uyeVar.j("auto_store", true);
        uyeVar.j("vast_privacy_icon", true);
        uyeVar.j("dec", true);
        uyeVar.j("countdown_timer", true);
        uyeVar.j("android_inline", true);
        uyeVar.j("auto_inline", true);
        uyeVar.j("inline_button", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        k kVar = k.a;
        return new KSerializer[]{l98.W(kVar), kVar, l98.W(e.a), a.a, l98.W(d0.a), gz1.a, l98.W(t.a), l98.W(m.a), l98.W(m0.a), l98.W(g0.a), l98.W(p.a), l98.W(r.a), l98.W(f1.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        l lVar;
        boolean z;
        s sVar;
        boolean z2;
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        s sVar2 = null;
        q qVar = null;
        h0 h0Var = null;
        g1 g1Var = null;
        n0 n0Var = null;
        int i = 0;
        l lVar2 = null;
        l lVar3 = null;
        f fVar = null;
        com.moloco.sdk.internal.ortb.model.b bVar = null;
        e0 e0Var = null;
        boolean z3 = false;
        u uVar = null;
        n nVar = null;
        boolean z4 = true;
        while (z4) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    sVar = sVar2;
                    z2 = z3;
                    z4 = false;
                    z3 = z2;
                    sVar2 = sVar;
                case 0:
                    z2 = z3;
                    sVar = sVar2;
                    lVar2 = (l) b2.i(uyeVar, 0, k.a, lVar2);
                    i |= 1;
                    z3 = z2;
                    sVar2 = sVar;
                case 1:
                    lVar = lVar2;
                    z = z3;
                    lVar3 = (l) b2.w(uyeVar, 1, k.a, lVar3);
                    i |= 2;
                    z3 = z;
                    lVar2 = lVar;
                case 2:
                    lVar = lVar2;
                    z = z3;
                    fVar = (f) b2.i(uyeVar, 2, e.a, fVar);
                    i |= 4;
                    z3 = z;
                    lVar2 = lVar;
                case 3:
                    lVar = lVar2;
                    z = z3;
                    bVar = (com.moloco.sdk.internal.ortb.model.b) b2.w(uyeVar, 3, a.a, bVar);
                    i |= 8;
                    z3 = z;
                    lVar2 = lVar;
                case 4:
                    lVar = lVar2;
                    z = z3;
                    e0Var = (e0) b2.i(uyeVar, 4, d0.a, e0Var);
                    i |= 16;
                    z3 = z;
                    lVar2 = lVar;
                case 5:
                    lVar = lVar2;
                    z3 = b2.B(uyeVar, 5);
                    i |= 32;
                    lVar2 = lVar;
                case 6:
                    lVar = lVar2;
                    z = z3;
                    uVar = (u) b2.i(uyeVar, 6, t.a, uVar);
                    i |= 64;
                    z3 = z;
                    lVar2 = lVar;
                case 7:
                    lVar = lVar2;
                    z = z3;
                    nVar = (n) b2.i(uyeVar, 7, m.a, nVar);
                    i |= 128;
                    z3 = z;
                    lVar2 = lVar;
                case 8:
                    lVar = lVar2;
                    z = z3;
                    n0Var = (n0) b2.i(uyeVar, 8, m0.a, n0Var);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    z3 = z;
                    lVar2 = lVar;
                case 9:
                    lVar = lVar2;
                    z = z3;
                    h0Var = (h0) b2.i(uyeVar, 9, g0.a, h0Var);
                    i |= 512;
                    z3 = z;
                    lVar2 = lVar;
                case 10:
                    lVar = lVar2;
                    z = z3;
                    qVar = (q) b2.i(uyeVar, 10, p.a, qVar);
                    i |= 1024;
                    z3 = z;
                    lVar2 = lVar;
                case 11:
                    lVar = lVar2;
                    z = z3;
                    sVar2 = (s) b2.i(uyeVar, 11, r.a, sVar2);
                    i |= com.ironsource.mediationsdk.metadata.a.o;
                    z3 = z;
                    lVar2 = lVar;
                case 12:
                    z = z3;
                    lVar = lVar2;
                    g1Var = (g1) b2.i(uyeVar, 12, f1.a, g1Var);
                    i |= 4096;
                    z3 = z;
                    lVar2 = lVar;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        boolean z5 = z3;
        b2.c(uyeVar);
        return new d(i, lVar2, lVar3, fVar, bVar, e0Var, z5, uVar, nVar, n0Var, h0Var, qVar, sVar2, g1Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        encoder.getClass();
        dVar.getClass();
        l lVar = dVar.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || lVar != null) {
            b2.h(uyeVar, 0, k.a, lVar);
        }
        k kVar = k.a;
        l lVar2 = dVar.b;
        g1 g1Var = dVar.m;
        s sVar = dVar.l;
        q qVar = dVar.k;
        h0 h0Var = dVar.j;
        n0 n0Var = dVar.i;
        n nVar = dVar.h;
        u uVar = dVar.g;
        e0 e0Var = dVar.e;
        f fVar = dVar.c;
        b2.f(uyeVar, 1, kVar, lVar2);
        if (b2.o(uyeVar) || fVar != null) {
            b2.h(uyeVar, 2, e.a, fVar);
        }
        b2.f(uyeVar, 3, a.a, dVar.d);
        if (b2.o(uyeVar) || e0Var != null) {
            b2.h(uyeVar, 4, d0.a, e0Var);
        }
        b2.x(uyeVar, 5, dVar.f);
        if (b2.o(uyeVar) || uVar != null) {
            b2.h(uyeVar, 6, t.a, uVar);
        }
        if (b2.o(uyeVar) || nVar != null) {
            b2.h(uyeVar, 7, m.a, nVar);
        }
        if (b2.o(uyeVar) || n0Var != null) {
            b2.h(uyeVar, 8, m0.a, n0Var);
        }
        if (b2.o(uyeVar) || h0Var != null) {
            b2.h(uyeVar, 9, g0.a, h0Var);
        }
        if (b2.o(uyeVar) || qVar != null) {
            b2.h(uyeVar, 10, p.a, qVar);
        }
        if (b2.o(uyeVar) || sVar != null) {
            b2.h(uyeVar, 11, r.a, sVar);
        }
        if (b2.o(uyeVar) || g1Var != null) {
            b2.h(uyeVar, 12, f1.a, g1Var);
        }
        b2.c(uyeVar);
    }
}
