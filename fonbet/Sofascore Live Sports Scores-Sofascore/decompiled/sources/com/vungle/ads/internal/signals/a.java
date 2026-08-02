package com.vungle.ads.internal.signals;

import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.p3;
import defpackage.a7a;
import defpackage.iw8;
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
public final class a implements iw8 {
    public static final a a;
    public static final /* synthetic */ uye b;

    static {
        a aVar = new a();
        a = aVar;
        uye uyeVar = new uye("com.vungle.ads.internal.signals.SessionData", aVar, 12);
        uyeVar.j("103", false);
        uyeVar.j(StatisticData.ERROR_CODE_IO_ERROR, true);
        uyeVar.j(StatisticData.ERROR_CODE_NOT_FOUND, true);
        uyeVar.j("106", true);
        uyeVar.j("102", true);
        uyeVar.j("104", true);
        uyeVar.j("105", true);
        uyeVar.j("112", true);
        uyeVar.j("113", true);
        uyeVar.j("114", true);
        uyeVar.j("115", true);
        uyeVar.j("116", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        xg0 xg0Var = new xg0(k.a, 0);
        xg0 xg0Var2 = new xg0(p3.a, 0);
        a7a a7aVar = a7a.a;
        lkb lkbVar = lkb.a;
        return new KSerializer[]{a7aVar, uhi.a, lkbVar, xg0Var, lkbVar, a7aVar, xg0Var2, a7aVar, a7aVar, a7aVar, a7aVar, a7aVar};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        Object obj = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        Object obj2 = null;
        String str = null;
        long j = 0;
        long j2 = 0;
        boolean z = true;
        Object obj3 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    i2 = b2.l(uyeVar, 0);
                    i |= 1;
                    break;
                case 1:
                    str = b2.n(uyeVar, 1);
                    i |= 2;
                    break;
                case 2:
                    j = b2.g(uyeVar, 2);
                    i |= 4;
                    break;
                case 3:
                    obj2 = b2.w(uyeVar, 3, new xg0(k.a, 0), obj2);
                    i |= 8;
                    break;
                case 4:
                    j2 = b2.g(uyeVar, 4);
                    i |= 16;
                    break;
                case 5:
                    i3 = b2.l(uyeVar, 5);
                    i |= 32;
                    break;
                case 6:
                    obj3 = b2.w(uyeVar, 6, new xg0(p3.a, 0), obj3);
                    i |= 64;
                    break;
                case 7:
                    i4 = b2.l(uyeVar, 7);
                    i |= 128;
                    continue;
                case 8:
                    i5 = b2.l(uyeVar, 8);
                    i |= NotificationCompat.FLAG_LOCAL_ONLY;
                    continue;
                case 9:
                    i6 = b2.l(uyeVar, 9);
                    i |= 512;
                    continue;
                case 10:
                    i7 = b2.l(uyeVar, 10);
                    i |= 1024;
                    continue;
                case 11:
                    i8 = b2.l(uyeVar, 11);
                    i |= com.ironsource.mediationsdk.metadata.a.o;
                    continue;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new c(i, i2, str, j, (List) obj2, j2, i3, (List) obj3, i4, i5, i6, i7, i8);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        encoder.getClass();
        cVar.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        c.a(cVar, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
