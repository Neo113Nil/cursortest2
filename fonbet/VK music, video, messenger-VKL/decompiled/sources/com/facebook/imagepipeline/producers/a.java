package com.facebook.imagepipeline.producers;

import bolts.ExecutorException;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.producers.DiskCacheDecision;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.abn;
import xsna.e5o0;
import xsna.ecl;
import xsna.fbn;
import xsna.l7j;
import xsna.o4o0;
import xsna.p4o0;
import xsna.rip;
import xsna.thd0;
import xsna.uhd0;
import xsna.vou;
import xsna.wj7;
import xsna.ww8;
import xsna.yhd0;
import xsna.yhn0;
import xsna.ym8;
import xsna.zan;

/* compiled from: DiskCacheReadProducer.java */
/* loaded from: classes12.dex */
public final class a implements thd0<rip> {
    public final yhn0<fbn> a;
    public final ecl b;
    public final b c;

    public a(yhn0 yhn0Var, ecl eclVar, b bVar) {
        this.a = yhn0Var;
        this.b = eclVar;
        this.c = bVar;
    }

    public static Map<String, String> c(yhd0 yhd0Var, uhd0 uhd0Var, boolean z, int i) {
        if (yhd0Var.i(uhd0Var, "DiskCacheProducer")) {
            return z ? ImmutableMap.b("cached_value_found", String.valueOf(z), "encodedImageSize", String.valueOf(i)) : ImmutableMap.a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        boolean z;
        ImageRequest r = uhd0Var.r();
        if (!uhd0Var.r().n(16)) {
            d(l7jVar, uhd0Var);
            return;
        }
        uhd0Var.q().k(uhd0Var, "DiskCacheProducer");
        ww8 d = this.b.d(r, uhd0Var.m());
        fbn fbnVar = this.a.get();
        ym8 a = DiskCacheDecision.a(r, fbnVar.d(), fbnVar.b(), fbnVar.e());
        if (a == null) {
            uhd0Var.q().b(uhd0Var, "DiskCacheProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(r.a.ordinal()).toString()), null);
            d(l7jVar, uhd0Var);
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        e5o0<rip> d2 = a.d(d, atomicBoolean);
        zan zanVar = new zan(this, uhd0Var.q(), uhd0Var, l7jVar);
        d2.getClass();
        wj7.a aVar = e5o0.h;
        vou vouVar = new vou();
        synchronized (d2.a) {
            try {
                synchronized (d2.a) {
                    z = d2.b;
                }
                if (!z) {
                    d2.f.add(new o4o0(vouVar, zanVar, aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            try {
                aVar.execute(new p4o0(vouVar, zanVar, d2));
            } catch (Exception e) {
                vouVar.i(new ExecutorException(e));
            }
        }
        uhd0Var.p(new abn(atomicBoolean));
    }

    public final void d(l7j<rip> l7jVar, uhd0 uhd0Var) {
        if (uhd0Var.w().h() < ImageRequest.RequestLevel.DISK_CACHE.h()) {
            this.c.b(l7jVar, uhd0Var);
        } else {
            uhd0Var.s("disk", "nil-result_read");
            l7jVar.b(1, null);
        }
    }
}
