package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.privacy.MolocoPrivacy;
import defpackage.duf;
import defpackage.fuf;
import defpackage.k13;
import defpackage.sub;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class l implements j {
    public final List a;

    public l(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        List<j> list = this.a;
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (j jVar : list) {
            boolean b = jVar.b();
            if (b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ClientBidTokenSignalProviderImpl", "[CBT] Signal provider " + jVar.c() + " needs refresh", null, false, 12, null);
            }
            if (b) {
                return true;
            }
        }
        return false;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "ClientBidTokenSignalProviderImpl";
    }

    public final Object d() {
        List list = this.a;
        int c = sub.c(k13.r(list, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (Object obj : list) {
            linkedHashMap.put(duf.a.getOrCreateKotlinClass(((j) obj).getClass()), obj);
        }
        fuf fufVar = duf.a;
        Object obj2 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(v.class));
        obj2.getClass();
        boolean z = ((v) obj2).a;
        Object obj3 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(u.class));
        obj3.getClass();
        MolocoPrivacy.PrivacySettings privacySettings = ((u) obj3).b;
        Object obj4 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(r.class));
        obj4.getClass();
        q qVar = ((r) obj4).b;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] lm: " + qVar.a + ", t: " + qVar.b + ", tm: " + qVar.c, false, 4, null);
        Object obj5 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(e.class));
        obj5.getClass();
        d dVar = ((e) obj5).b;
        StringBuilder sb = new StringBuilder("[CBT] ADI providing ");
        sb.append(dVar.a);
        MolocoLogger.debugBuildLog$default(molocoLogger, "ADISignalProvider", sb.toString(), false, 4, null);
        Object obj6 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(t.class));
        obj6.getClass();
        s sVar = ((t) obj6).b;
        Object obj7 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(i.class));
        obj7.getClass();
        h hVar = ((i) obj7).b;
        Object obj8 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(c.class));
        obj8.getClass();
        com.facebook.appevents.j d = ((c) obj8).d();
        Object obj9 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(n.class));
        obj9.getClass();
        m mVar = ((n) obj9).c;
        Object obj10 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(g.class));
        obj10.getClass();
        f fVar = ((g) obj10).b;
        Object obj11 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(b.class));
        obj11.getClass();
        a aVar = ((b) obj11).b;
        Object obj12 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(p.class));
        obj12.getClass();
        o oVar = ((p) obj12).b;
        Object obj13 = linkedHashMap.get(fufVar.getOrCreateKotlinClass(x.class));
        obj13.getClass();
        w wVar = ((x) obj13).d;
        MolocoLogger.debugBuildLog$default(molocoLogger, "TCSignalProvider", "[CBT] TCS providing: " + wVar.a, false, 4, null);
        return new k(z, privacySettings, qVar, dVar, sVar, hVar, d, mVar, fVar, aVar, oVar, wVar);
    }
}
