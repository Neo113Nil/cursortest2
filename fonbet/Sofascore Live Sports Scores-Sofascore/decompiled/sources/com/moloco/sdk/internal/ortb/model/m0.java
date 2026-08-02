package com.moloco.sdk.internal.ortb.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class m0 implements iw8 {
    public static final m0 a;
    public static final uye b;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.DEC", m0Var, 9);
        uyeVar.j("imp_link", true);
        uyeVar.j("click_through", true);
        uyeVar.j("click_tracking", true);
        uyeVar.j("skip_event", true);
        uyeVar.j(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, true);
        uyeVar.j(U3.i.G0, true);
        uyeVar.j("app_icon", true);
        uyeVar.j(CampaignEx.JSON_KEY_STAR, true);
        uyeVar.j("app_name", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(y0.a), l98.W(u0.a), l98.W(o0.a), l98.W(w0.a), l98.W(q0.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        Object obj = null;
        boolean z = true;
        r0 r0Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        z0 z0Var = null;
        v0 v0Var = null;
        p0 p0Var = null;
        x0 x0Var = null;
        int i = 0;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b2.i(uyeVar, 0, uhi.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b2.i(uyeVar, 1, uhi.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b2.i(uyeVar, 2, uhi.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) b2.i(uyeVar, 3, uhi.a, str4);
                    i |= 8;
                    break;
                case 4:
                    z0Var = (z0) b2.i(uyeVar, 4, y0.a, z0Var);
                    i |= 16;
                    break;
                case 5:
                    v0Var = (v0) b2.i(uyeVar, 5, u0.a, v0Var);
                    i |= 32;
                    break;
                case 6:
                    p0Var = (p0) b2.i(uyeVar, 6, o0.a, p0Var);
                    i |= 64;
                    break;
                case 7:
                    x0Var = (x0) b2.i(uyeVar, 7, w0.a, x0Var);
                    i |= 128;
                    break;
                case 8:
                    r0Var = (r0) b2.i(uyeVar, 8, q0.a, r0Var);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new n0(i, str, str2, str3, str4, z0Var, v0Var, p0Var, x0Var, r0Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n0 n0Var = (n0) obj;
        encoder.getClass();
        n0Var.getClass();
        r0 r0Var = n0Var.i;
        x0 x0Var = n0Var.h;
        p0 p0Var = n0Var.g;
        v0 v0Var = n0Var.f;
        z0 z0Var = n0Var.e;
        String str = n0Var.d;
        String str2 = n0Var.c;
        String str3 = n0Var.b;
        String str4 = n0Var.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || str4 != null) {
            b2.h(uyeVar, 0, uhi.a, str4);
        }
        if (b2.o(uyeVar) || str3 != null) {
            b2.h(uyeVar, 1, uhi.a, str3);
        }
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 2, uhi.a, str2);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 3, uhi.a, str);
        }
        if (b2.o(uyeVar) || z0Var != null) {
            b2.h(uyeVar, 4, y0.a, z0Var);
        }
        if (b2.o(uyeVar) || v0Var != null) {
            b2.h(uyeVar, 5, u0.a, v0Var);
        }
        if (b2.o(uyeVar) || p0Var != null) {
            b2.h(uyeVar, 6, o0.a, p0Var);
        }
        if (b2.o(uyeVar) || x0Var != null) {
            b2.h(uyeVar, 7, w0.a, x0Var);
        }
        if (b2.o(uyeVar) || r0Var != null) {
            b2.h(uyeVar, 8, q0.a, r0Var);
        }
        b2.c(uyeVar);
    }
}
