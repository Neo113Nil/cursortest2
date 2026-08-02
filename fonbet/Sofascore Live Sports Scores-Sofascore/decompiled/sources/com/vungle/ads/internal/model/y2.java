package com.vungle.ads.internal.model;

import androidx.core.app.NotificationCompat;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import defpackage.a7a;
import defpackage.c88;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
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
public final class y2 implements iw8 {
    public static final y2 a;
    public static final /* synthetic */ uye b;

    static {
        y2 y2Var = new y2();
        a = y2Var;
        uye uyeVar = new uye("com.vungle.ads.internal.model.DeviceNode.VungleExt", y2Var, 23);
        uyeVar.j("is_google_play_services_available", true);
        uyeVar.j("app_set_id", true);
        uyeVar.j("app_set_id_scope", true);
        uyeVar.j("battery_level", true);
        uyeVar.j("battery_state", true);
        uyeVar.j("battery_saver_enabled", true);
        uyeVar.j("connection_type", true);
        uyeVar.j("connection_type_detail", true);
        uyeVar.j("locale", true);
        uyeVar.j("language", true);
        uyeVar.j("time_zone", true);
        uyeVar.j("volume_level", true);
        uyeVar.j("sound_enabled", true);
        uyeVar.j("is_tv", true);
        uyeVar.j("sd_card_available", true);
        uyeVar.j("is_sideload_enabled", true);
        uyeVar.j(L6.X0, true);
        uyeVar.j("amazon_advertising_id", true);
        uyeVar.j("sit", true);
        uyeVar.j("oit", true);
        uyeVar.j("ort", true);
        uyeVar.j("obt", true);
        uyeVar.j("gp_version", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        KSerializer W = l98.W(uhiVar);
        a7a a7aVar = a7a.a;
        KSerializer W2 = l98.W(a7aVar);
        KSerializer W3 = l98.W(uhiVar);
        KSerializer W4 = l98.W(uhiVar);
        KSerializer W5 = l98.W(uhiVar);
        KSerializer W6 = l98.W(uhiVar);
        KSerializer W7 = l98.W(uhiVar);
        KSerializer W8 = l98.W(uhiVar);
        KSerializer W9 = l98.W(uhiVar);
        KSerializer W10 = l98.W(uhiVar);
        lkb lkbVar = lkb.a;
        KSerializer W11 = l98.W(lkbVar);
        KSerializer W12 = l98.W(lkbVar);
        KSerializer W13 = l98.W(lkbVar);
        KSerializer W14 = l98.W(lkbVar);
        KSerializer W15 = l98.W(uhiVar);
        gz1 gz1Var = gz1.a;
        c88 c88Var = c88.a;
        return new KSerializer[]{gz1Var, W, W2, c88Var, W3, a7aVar, W4, W5, W6, W7, W8, c88Var, a7aVar, gz1Var, a7aVar, gz1Var, W9, W10, W11, W12, W13, W14, W15};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        float f = 0.0f;
        float f2 = 0.0f;
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
        Object obj18 = null;
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        Object obj19 = null;
        while (z) {
            int o = b2.o(uyeVar);
            Object obj20 = obj14;
            switch (o) {
                case -1:
                    z = false;
                    obj8 = obj8;
                    obj14 = obj20;
                    obj5 = obj5;
                    obj6 = obj6;
                case 0:
                    obj = obj5;
                    obj2 = obj8;
                    obj3 = obj20;
                    z2 = b2.B(uyeVar, 0);
                    i = 1;
                    obj6 = obj6;
                    obj20 = obj3;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 1:
                    obj = obj5;
                    obj2 = obj8;
                    obj3 = obj20;
                    obj19 = b2.i(uyeVar, 1, uhi.a, obj19);
                    obj6 = obj6;
                    i = 2;
                    obj20 = obj3;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 2:
                    obj = obj5;
                    obj2 = obj8;
                    obj6 = obj6;
                    i = 4;
                    obj20 = b2.i(uyeVar, 2, a7a.a, obj20);
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 3:
                    obj = obj5;
                    obj2 = obj8;
                    i = 8;
                    f = b2.s(uyeVar, 3);
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 4:
                    obj = obj5;
                    obj2 = b2.i(uyeVar, 4, uhi.a, obj8);
                    i = 16;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 5:
                    obj4 = obj8;
                    i2 = 32;
                    i4 = b2.l(uyeVar, 5);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 6:
                    obj4 = obj8;
                    obj5 = b2.i(uyeVar, 6, uhi.a, obj5);
                    i2 = 64;
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 7:
                    obj4 = obj8;
                    obj6 = b2.i(uyeVar, 7, uhi.a, obj6);
                    i2 = 128;
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 8:
                    obj4 = obj8;
                    obj7 = b2.i(uyeVar, 8, uhi.a, obj7);
                    i2 = NotificationCompat.FLAG_LOCAL_ONLY;
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 9:
                    obj4 = obj8;
                    i2 = 512;
                    obj18 = b2.i(uyeVar, 9, uhi.a, obj18);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 10:
                    obj4 = obj8;
                    i2 = 1024;
                    obj17 = b2.i(uyeVar, 10, uhi.a, obj17);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 11:
                    obj4 = obj8;
                    float s = b2.s(uyeVar, 11);
                    i2 = com.ironsource.mediationsdk.metadata.a.o;
                    f2 = s;
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 12:
                    obj4 = obj8;
                    i2 = 4096;
                    i5 = b2.l(uyeVar, 12);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 13:
                    obj4 = obj8;
                    i2 = 8192;
                    z3 = b2.B(uyeVar, 13);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 14:
                    obj4 = obj8;
                    i2 = 16384;
                    i6 = b2.l(uyeVar, 14);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 15:
                    obj4 = obj8;
                    i2 = 32768;
                    z4 = b2.B(uyeVar, 15);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 16:
                    obj4 = obj8;
                    Object i7 = b2.i(uyeVar, 16, uhi.a, obj16);
                    i2 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                    obj16 = i7;
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 17:
                    obj4 = obj8;
                    i2 = 131072;
                    obj15 = b2.i(uyeVar, 17, uhi.a, obj15);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 18:
                    obj4 = obj8;
                    i2 = 262144;
                    obj13 = b2.i(uyeVar, 18, lkb.a, obj13);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 19:
                    obj4 = obj8;
                    i2 = 524288;
                    obj12 = b2.i(uyeVar, 19, lkb.a, obj12);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 20:
                    obj4 = obj8;
                    Object i8 = b2.i(uyeVar, 20, lkb.a, obj11);
                    i2 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    obj11 = i8;
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 21:
                    obj4 = obj8;
                    i2 = 2097152;
                    obj10 = b2.i(uyeVar, 21, lkb.a, obj10);
                    i = i2;
                    obj2 = obj4;
                    obj = obj5;
                    i3 |= i;
                    obj8 = obj2;
                    obj5 = obj;
                    obj14 = obj20;
                case 22:
                    obj9 = b2.i(uyeVar, 22, uhi.a, obj9);
                    i3 |= 4194304;
                    obj8 = obj8;
                    obj14 = obj20;
                default:
                    yhk.e(o);
                    return null;
            }
        }
        Object obj21 = obj6;
        Object obj22 = obj14;
        b2.c(uyeVar);
        return new a3(i3, z2, (String) obj19, (Integer) obj22, f, (String) obj8, i4, (String) obj5, (String) obj21, (String) obj7, (String) obj18, (String) obj17, f2, i5, z3, i6, z4, (String) obj16, (String) obj15, (Long) obj13, (Long) obj12, (Long) obj11, (Long) obj10, (String) obj9);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a3 a3Var = (a3) obj;
        encoder.getClass();
        a3Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        a3.a(a3Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
