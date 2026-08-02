package com.moloco.sdk.internal.ortb.model;

import com.sofascore.model.network.response.SearchResponseKt;
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
public final /* synthetic */ class z implements iw8 {
    public static final z a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return j1.a;
        }
    }

    static {
        z zVar = new z();
        a = zVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.BidExt", zVar, 5);
        uyeVar.j(SearchResponseKt.PLAYER_ENTITY, true);
        uyeVar.j("mtid", true);
        uyeVar.j("moloco_sdk_configs", true);
        uyeVar.j("moloco_sdk_events", true);
        uyeVar.j("moloco_sdk_click_metadata", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l98.W(c.a), l98.W(uhi.a), l98.W(j1.a), l98.W(g.a), l98.W(h1.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        boolean z = true;
        int i = 0;
        d dVar = null;
        String str = null;
        k1 k1Var = null;
        h hVar = null;
        i1 i1Var = null;
        while (z) {
            int o = b2.o(uyeVar);
            if (o == -1) {
                z = false;
            } else if (o == 0) {
                dVar = (d) b2.i(uyeVar, 0, c.a, dVar);
                i |= 1;
            } else if (o == 1) {
                str = (String) b2.i(uyeVar, 1, uhi.a, str);
                i |= 2;
            } else if (o == 2) {
                k1Var = (k1) b2.i(uyeVar, 2, j1.a, k1Var);
                i |= 4;
            } else if (o == 3) {
                hVar = (h) b2.i(uyeVar, 3, g.a, hVar);
                i |= 8;
            } else {
                if (o != 4) {
                    yhk.e(o);
                    return null;
                }
                i1Var = (i1) b2.i(uyeVar, 4, h1.a, i1Var);
                i |= 16;
            }
        }
        b2.c(uyeVar);
        return new a0(i, dVar, str, k1Var, hVar, i1Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a0 a0Var = (a0) obj;
        encoder.getClass();
        a0Var.getClass();
        i1 i1Var = a0Var.e;
        h hVar = a0Var.d;
        k1 k1Var = a0Var.c;
        String str = a0Var.b;
        d dVar = a0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || dVar != null) {
            b2.h(uyeVar, 0, c.a, dVar);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 1, uhi.a, str);
        }
        if (b2.o(uyeVar) || k1Var != null) {
            b2.h(uyeVar, 2, j1.a, k1Var);
        }
        if (b2.o(uyeVar) || hVar != null) {
            b2.h(uyeVar, 3, g.a, hVar);
        }
        if (b2.o(uyeVar) || i1Var != null) {
            b2.h(uyeVar, 4, h1.a, i1Var);
        }
        b2.c(uyeVar);
    }
}
