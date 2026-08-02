package com.vungle.ads.internal.model;

import defpackage.duf;
import defpackage.gz1;
import defpackage.iw8;
import defpackage.l98;
import defpackage.lkb;
import defpackage.q79;
import defpackage.qq3;
import defpackage.uf3;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.xg0;
import defpackage.yhk;
import defpackage.z8e;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c implements iw8 {
    public static final c a;
    public static final /* synthetic */ uye b;

    static {
        c cVar = new c();
        a = cVar;
        uye uyeVar = new uye("com.vungle.ads.internal.model.AdPayload", cVar, 7);
        uyeVar.j(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
        uyeVar.j("config", true);
        uyeVar.j("expiryWindowStart", true);
        uyeVar.j("mraidFiles", true);
        uyeVar.j("incentivizedTextSettings", true);
        uyeVar.j("assetsFullyDownloaded", true);
        uyeVar.j("indexFilePath", true);
        b = uyeVar;
    }

    @Override // defpackage.iw8
    public final KSerializer[] childSerializers() {
        KSerializer W = l98.W(new xg0(q.a, 0));
        KSerializer W2 = l98.W(u1.a);
        KSerializer W3 = l98.W(lkb.a);
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(ConcurrentHashMap.class);
        uhi uhiVar = uhi.a;
        return new KSerializer[]{W, W2, W3, new qq3(orCreateKotlinClass, new KSerializer[]{uhiVar, uhiVar}), new q79(uhiVar, uhiVar, 1), gz1.a, l98.W(uhiVar)};
    }

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        uye uyeVar = b;
        uf3 b2 = decoder.b(uyeVar);
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (z) {
            int o = b2.o(uyeVar);
            switch (o) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    obj7 = b2.i(uyeVar, 0, new xg0(q.a, 0), obj7);
                    i |= 1;
                    break;
                case 1:
                    obj6 = b2.i(uyeVar, 1, u1.a, obj6);
                    i |= 2;
                    break;
                case 2:
                    obj5 = b2.i(uyeVar, 2, lkb.a, obj5);
                    i |= 4;
                    break;
                case 3:
                    KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(ConcurrentHashMap.class);
                    uhi uhiVar = uhi.a;
                    obj4 = b2.w(uyeVar, 3, new qq3(orCreateKotlinClass, new KSerializer[]{uhiVar, uhiVar}), obj4);
                    i |= 8;
                    break;
                case 4:
                    uhi uhiVar2 = uhi.a;
                    obj3 = b2.w(uyeVar, 4, new q79(uhiVar2, uhiVar2, 1), obj3);
                    i |= 16;
                    continue;
                case 5:
                    z2 = b2.B(uyeVar, 5);
                    i |= 32;
                    continue;
                case 6:
                    obj2 = b2.i(uyeVar, 6, uhi.a, obj2);
                    i |= 64;
                    continue;
                default:
                    yhk.e(o);
                    return obj;
            }
            obj = null;
        }
        b2.c(uyeVar);
        return new h0(i, (List) obj7, (v2) obj6, (Long) obj5, (ConcurrentHashMap) obj4, (Map) obj3, z2, (String) obj2);
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h0 h0Var = (h0) obj;
        encoder.getClass();
        h0Var.getClass();
        uye uyeVar = b;
        wf3 b2 = encoder.b(uyeVar);
        h0.a(h0Var, b2, uyeVar);
        b2.c(uyeVar);
    }

    @Override // defpackage.iw8
    public final KSerializer[] typeParametersSerializers() {
        return z8e.e;
    }
}
