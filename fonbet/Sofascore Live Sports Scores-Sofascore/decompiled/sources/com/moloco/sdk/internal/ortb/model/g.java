package com.moloco.sdk.internal.ortb.model;

import androidx.core.app.NotificationCompat;
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
public final /* synthetic */ class g implements iw8 {
    public static final g a;
    public static final uye b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return b0.a;
        }
    }

    static {
        g gVar = new g();
        a = gVar;
        uye uyeVar = new uye("com.moloco.sdk.internal.ortb.model.SdkEvents", gVar, 11);
        uyeVar.j("on_ad_load_start", true);
        uyeVar.j("on_ad_load_failed", true);
        uyeVar.j("on_ad_load_success", true);
        uyeVar.j("on_ad_show_failed", true);
        uyeVar.j("on_ad_show_success", true);
        uyeVar.j("on_ad_clicked", true);
        uyeVar.j("on_ad_hidden", true);
        uyeVar.j("on_user_rewarded", true);
        uyeVar.j("on_rewarded_video_started", true);
        uyeVar.j("on_rewarded_video_completed", true);
        uyeVar.j("on_creative_rendering_check", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        uhi uhiVar = uhi.a;
        return new KSerializer[]{l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(uhiVar), l98.W(k0.a)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        boolean z;
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        l0 l0Var = null;
        String str = null;
        boolean z2 = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (z2) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    str3 = (String) b2.i(uyeVar, 0, uhi.a, str3);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    str4 = (String) b2.i(uyeVar, 1, uhi.a, str4);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    str5 = (String) b2.i(uyeVar, 2, uhi.a, str5);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    str6 = (String) b2.i(uyeVar, 3, uhi.a, str6);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    str7 = (String) b2.i(uyeVar, 4, uhi.a, str7);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    str8 = (String) b2.i(uyeVar, 5, uhi.a, str8);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    str9 = (String) b2.i(uyeVar, 6, uhi.a, str9);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    str10 = (String) b2.i(uyeVar, 7, uhi.a, str10);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    str2 = (String) b2.i(uyeVar, 8, uhi.a, str2);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    break;
                case 9:
                    z = z2;
                    str = (String) b2.i(uyeVar, 9, uhi.a, str);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    l0Var = (l0) b2.i(uyeVar, 10, k0.a, l0Var);
                    i |= 1024;
                    break;
                default:
                    yhk.e(o);
                    return null;
            }
            z2 = z;
        }
        b2.c(uyeVar);
        return new h(i, str3, str4, str5, str6, str7, str8, str9, str10, str2, str, l0Var);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h hVar = (h) obj;
        encoder.getClass();
        hVar.getClass();
        l0 l0Var = hVar.k;
        String str = hVar.j;
        String str2 = hVar.i;
        String str3 = hVar.h;
        String str4 = hVar.g;
        String str5 = hVar.f;
        String str6 = hVar.e;
        String str7 = hVar.d;
        String str8 = hVar.c;
        String str9 = hVar.b;
        String str10 = hVar.a;
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        if (b2.o(uyeVar) || str10 != null) {
            b2.h(uyeVar, 0, uhi.a, str10);
        }
        if (b2.o(uyeVar) || str9 != null) {
            b2.h(uyeVar, 1, uhi.a, str9);
        }
        if (b2.o(uyeVar) || str8 != null) {
            b2.h(uyeVar, 2, uhi.a, str8);
        }
        if (b2.o(uyeVar) || str7 != null) {
            b2.h(uyeVar, 3, uhi.a, str7);
        }
        if (b2.o(uyeVar) || str6 != null) {
            b2.h(uyeVar, 4, uhi.a, str6);
        }
        if (b2.o(uyeVar) || str5 != null) {
            b2.h(uyeVar, 5, uhi.a, str5);
        }
        if (b2.o(uyeVar) || str4 != null) {
            b2.h(uyeVar, 6, uhi.a, str4);
        }
        if (b2.o(uyeVar) || str3 != null) {
            b2.h(uyeVar, 7, uhi.a, str3);
        }
        if (b2.o(uyeVar) || str2 != null) {
            b2.h(uyeVar, 8, uhi.a, str2);
        }
        if (b2.o(uyeVar) || str != null) {
            b2.h(uyeVar, 9, uhi.a, str);
        }
        if (b2.o(uyeVar) || l0Var != null) {
            b2.h(uyeVar, 10, k0.a, l0Var);
        }
        b2.c(uyeVar);
    }
}
