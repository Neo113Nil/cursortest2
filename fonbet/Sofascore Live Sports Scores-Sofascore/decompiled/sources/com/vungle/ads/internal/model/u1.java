package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4238od;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.a7a;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u1 implements iw8 {
    public static final u1 a;
    public static final /* synthetic */ uye b;

    static {
        u1 u1Var = new u1();
        a = u1Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.ConfigPayload", u1Var, 18);
        uyeVar.j("reuse_assets", true);
        uyeVar.j("config", true);
        uyeVar.j("endpoints", true);
        uyeVar.j("log_metrics", true);
        uyeVar.j(C4238od.c, true);
        uyeVar.j("user", true);
        uyeVar.j("config_extension", true);
        uyeVar.j("disable_ad_id", true);
        uyeVar.j("ri_enabled", true);
        uyeVar.j("session_timeout", true);
        uyeVar.j("wait_for_connectivity_for_tpat", true);
        uyeVar.j("sdk_session_timeout", true);
        uyeVar.j("signals_disabled", true);
        uyeVar.j("fpd_enabled", true);
        uyeVar.j("rta_debugging", true);
        uyeVar.j("config_last_validated_ts", true);
        uyeVar.j("auto_redirect", true);
        uyeVar.j("enable_ot", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(y1.a);
        KSerializer W2 = l98.W(c2.a);
        KSerializer W3 = l98.W(f2.a);
        KSerializer W4 = l98.W(p2.a);
        KSerializer W5 = l98.W(new xg0(g3.a, 0));
        KSerializer W6 = l98.W(s2.a);
        KSerializer W7 = l98.W(uhi.a);
        gz1 gz1Var = gz1.a;
        KSerializer W8 = l98.W(gz1Var);
        KSerializer W9 = l98.W(gz1Var);
        a7a a7aVar = a7a.a;
        return new KSerializer[]{W, W2, W3, W4, W5, W6, W7, W8, W9, l98.W(a7aVar), l98.W(gz1Var), l98.W(a7aVar), l98.W(gz1Var), l98.W(gz1Var), l98.W(gz1Var), l98.W(lkb.a), l98.W(v1.a), l98.W(gz1Var)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        int i;
        Object obj3;
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        boolean z = true;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        int i2 = 0;
        while (z) {
            int o = b2.o(uyeVar);
            Object obj22 = obj7;
            switch (o) {
                case -1:
                    z = false;
                    obj6 = obj6;
                    obj4 = obj4;
                    obj19 = obj19;
                    obj7 = obj22;
                case 0:
                    Object obj23 = obj19;
                    obj = obj6;
                    obj21 = b2.i(uyeVar, 0, y1.a, obj21);
                    obj20 = obj20;
                    obj4 = obj4;
                    obj5 = obj5;
                    obj2 = obj23;
                    i = 1;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 1:
                    Object obj24 = obj19;
                    obj = obj6;
                    obj20 = b2.i(uyeVar, 1, c2.a, obj20);
                    obj2 = obj24;
                    obj4 = obj4;
                    obj5 = obj5;
                    i = 2;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 2:
                    obj2 = b2.i(uyeVar, 2, f2.a, obj19);
                    obj = obj6;
                    obj4 = obj4;
                    obj5 = obj5;
                    i = 4;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 3:
                    obj18 = b2.i(uyeVar, 3, p2.a, obj18);
                    obj2 = obj19;
                    obj4 = obj4;
                    obj5 = obj5;
                    i = 8;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 4:
                    obj22 = b2.i(uyeVar, 4, new xg0(g3.a, 0), obj22);
                    obj2 = obj19;
                    obj4 = obj4;
                    obj5 = obj5;
                    i = 16;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 5:
                    i = 32;
                    obj5 = b2.i(uyeVar, 5, s2.a, obj5);
                    obj2 = obj19;
                    obj4 = obj4;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 6:
                    obj3 = obj5;
                    obj4 = b2.i(uyeVar, 6, uhi.a, obj4);
                    i = 64;
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 7:
                    i = 128;
                    obj2 = obj19;
                    obj = b2.i(uyeVar, 7, gz1.a, obj6);
                    obj5 = obj5;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 8:
                    obj3 = obj5;
                    Object i3 = b2.i(uyeVar, 8, gz1.a, obj17);
                    i = NotificationCompat.FLAG_LOCAL_ONLY;
                    obj17 = i3;
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 9:
                    obj3 = obj5;
                    i = 512;
                    obj16 = b2.i(uyeVar, 9, a7a.a, obj16);
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 10:
                    obj3 = obj5;
                    i = 1024;
                    obj15 = b2.i(uyeVar, 10, gz1.a, obj15);
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 11:
                    obj3 = obj5;
                    Object i4 = b2.i(uyeVar, 11, a7a.a, obj14);
                    i = com.ironsource.mediationsdk.metadata.a.o;
                    obj14 = i4;
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 12:
                    obj3 = obj5;
                    i = 4096;
                    obj13 = b2.i(uyeVar, 12, gz1.a, obj13);
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 13:
                    obj3 = obj5;
                    i = 8192;
                    obj12 = b2.i(uyeVar, 13, gz1.a, obj12);
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 14:
                    obj3 = obj5;
                    i = 16384;
                    obj11 = b2.i(uyeVar, 14, gz1.a, obj11);
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 15:
                    obj3 = obj5;
                    i = 32768;
                    obj10 = b2.i(uyeVar, 15, lkb.a, obj10);
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 16:
                    obj3 = obj5;
                    Object i5 = b2.i(uyeVar, 16, v1.a, obj9);
                    i = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    obj9 = i5;
                    obj2 = obj19;
                    obj5 = obj3;
                    obj = obj6;
                    i2 |= i;
                    obj6 = obj;
                    obj7 = obj22;
                    obj19 = obj2;
                case 17:
                    obj8 = b2.i(uyeVar, 17, gz1.a, obj8);
                    i2 |= 131072;
                    obj5 = obj5;
                    obj7 = obj22;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Object obj25 = obj4;
        Object obj26 = obj7;
        Object obj27 = obj19;
        b2.c(uyeVar);
        return new v2(i2, (a2) obj21, (e2) obj20, (h2) obj27, (r2) obj18, (List) obj26, (u2) obj5, (String) obj25, (Boolean) obj6, (Boolean) obj17, (Integer) obj16, (Boolean) obj15, (Integer) obj14, (Boolean) obj13, (Boolean) obj12, (Boolean) obj11, (Long) obj10, (x1) obj9, (Boolean) obj8);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v2 v2Var = (v2) obj;
        encoder.getClass();
        v2Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        v2.a(v2Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
