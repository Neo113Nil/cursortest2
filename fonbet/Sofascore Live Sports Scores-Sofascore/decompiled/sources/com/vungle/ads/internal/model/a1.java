package com.vungle.ads.internal.model;

import com.google.ads.mediation.moloco.MolocoMediationAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.h75;
import defpackage.iw8;
import defpackage.l98;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.yhk;
import defpackage.z8e;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a1 implements iw8 {
    public static final a1 a;
    public static final /* synthetic */ uye b;

    static {
        a1 a1Var = new a1();
        a = a1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.CommonRequestBody.CSBParam", a1Var, 7);
        uyeVar.j("bidfloor", false);
        uyeVar.j("phase", false);
        uyeVar.j("is_vx_winner", false);
        uyeVar.j("parent_auction_id", false);
        uyeVar.j(CampaignEx.JSON_KEY_CREATIVE_ID, false);
        uyeVar.j(MolocoMediationAdapter.KEY_AD_UNIT_ID, false);
        uyeVar.j("ext", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{h75.a, a7a.a, gz1.a, uhiVar, uhiVar, uhiVar, l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        Object obj = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        double d = 0.0d;
        Object obj2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = true;
        while (z2) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    d = b2.D(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = b2.l(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    z = b2.B(uyeVar, 2);
                    i |= 4;
                    break;
                case 3:
                    str = b2.n(uyeVar, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b2.n(uyeVar, 4);
                    i |= 16;
                    break;
                case 5:
                    str3 = b2.n(uyeVar, 5);
                    i |= 32;
                    break;
                case 6:
                    obj2 = b2.i(uyeVar, 6, uhi.a, obj2);
                    i |= 64;
                    break;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new c1(i, d, i2, z, str, str2, str3, (String) obj2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c1 c1Var = (c1) obj;
        encoder.getClass();
        c1Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        c1.a(c1Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
