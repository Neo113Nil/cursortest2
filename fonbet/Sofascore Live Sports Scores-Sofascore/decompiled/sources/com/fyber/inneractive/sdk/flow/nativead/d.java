package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d extends com.fyber.inneractive.sdk.flow.k {
    public final String m = "Native";
    public f n;

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.c;
        if (xVar != null) {
            ((w0) xVar).destroy();
        }
        f fVar = this.n;
        if (fVar != null) {
            fVar.d.clear();
            fVar.f = null;
            Iterator it = fVar.a.iterator();
            while (it.hasNext()) {
                ((c) it.next()).destroy();
            }
            fVar.a.clear();
            this.n = null;
        }
        this.k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        com.fyber.inneractive.sdk.util.r.b.removeCallbacks(this.l);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return "send_failed_native_creatives";
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void g() {
        com.fyber.inneractive.sdk.response.e eVar = this.b;
        if (eVar == null || ((com.fyber.inneractive.sdk.response.nativead.j) eVar).S.M == null) {
            return;
        }
        com.fyber.inneractive.sdk.config.global.r rVar = this.g;
        InneractiveAdRequest inneractiveAdRequest = this.a;
        com.fyber.inneractive.sdk.response.nativead.j jVar = (com.fyber.inneractive.sdk.response.nativead.j) this.b;
        f fVar = new f(rVar, inneractiveAdRequest, jVar, jVar.S.M, this, this.m);
        this.n = fVar;
        com.fyber.inneractive.sdk.flow.nativead.mainasset.d a = com.fyber.inneractive.sdk.flow.nativead.mainasset.e.a(fVar.i, fVar.k, fVar.h, fVar.c, fVar.j, fVar);
        if (a == null) {
            if (fVar.g.compareAndSet(false, true)) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.NATIVE_AD_FAILED_TO_LOAD, com.fyber.inneractive.sdk.flow.i.NATIVE_AD_EMPTY_CONTENT);
                inneractiveInfrastructureError.setCause(new com.fyber.inneractive.sdk.flow.nativead.mainasset.a("Could not start loading main media"));
                d dVar = fVar.f;
                dVar.getClass();
                com.fyber.inneractive.sdk.util.r.a.execute(new com.fyber.inneractive.sdk.flow.e(new com.fyber.inneractive.sdk.flow.f(dVar.b, dVar.a, "send_failed_native_creatives", dVar.g.b()), inneractiveInfrastructureError));
                dVar.b(inneractiveInfrastructureError);
                return;
            }
            return;
        }
        fVar.a.add(a);
        CopyOnWriteArrayList copyOnWriteArrayList = fVar.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = fVar.c.a;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it = fVar.c.a.iterator();
            while (it.hasNext()) {
                com.fyber.inneractive.sdk.response.nativead.f fVar2 = (com.fyber.inneractive.sdk.response.nativead.f) it.next();
                if (fVar2 != null && fVar2.a != 2 && fVar2.d != null) {
                    arrayList.add(fVar2);
                }
            }
        }
        copyOnWriteArrayList.add(new h(arrayList, fVar.l));
        Iterator it2 = fVar.a.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).b();
        }
    }
}
