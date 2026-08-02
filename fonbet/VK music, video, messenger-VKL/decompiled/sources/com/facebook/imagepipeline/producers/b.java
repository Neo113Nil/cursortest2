package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.DiskCacheDecision;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.concurrent.Executor;
import xsna.ac6;
import xsna.ahq;
import xsna.ecl;
import xsna.fbn;
import xsna.l7j;
import xsna.lhs;
import xsna.rip;
import xsna.s3q0;
import xsna.siw;
import xsna.thd0;
import xsna.uhd0;
import xsna.uok0;
import xsna.wm8;
import xsna.wtl;
import xsna.ww8;
import xsna.yhn0;
import xsna.ym8;

/* compiled from: DiskCacheWriteProducer.java */
/* loaded from: classes12.dex */
public final class b implements thd0<rip> {
    public final yhn0<fbn> a;
    public final ecl b;
    public final thd0<rip> c;

    /* compiled from: DiskCacheWriteProducer.java */
    public static class a extends wtl<rip, rip> {
        public final uhd0 c;
        public final yhn0<fbn> d;
        public final ecl e;

        public a(l7j l7jVar, uhd0 uhd0Var, yhn0 yhn0Var, ecl eclVar) {
            super(l7jVar);
            this.c = uhd0Var;
            this.d = yhn0Var;
            this.e = eclVar;
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            rip ripVar = (rip) obj;
            uhd0 uhd0Var = this.c;
            uhd0Var.q().k(uhd0Var, "DiskCacheWriteProducer");
            boolean e = ac6.e(i);
            l7j<O> l7jVar = this.b;
            if (!e && ripVar != null && (i & 10) == 0) {
                ripVar.y();
                if (ripVar.c != siw.c) {
                    ImageRequest r = uhd0Var.r();
                    ww8 d = this.e.d(r, uhd0Var.m());
                    fbn fbnVar = this.d.get();
                    ym8 a = DiskCacheDecision.a(r, fbnVar.d(), fbnVar.b(), fbnVar.e());
                    if (a == null) {
                        uhd0Var.q().b(uhd0Var, "DiskCacheWriteProducer", new DiskCacheDecision.DiskCacheDecisionNoDiskCacheChosenException("Got no disk cache for CacheChoice: " + Integer.valueOf(r.a.ordinal()).toString()), null);
                        l7jVar.b(i, ripVar);
                        return;
                    }
                    Executor executor = a.e;
                    uok0 uok0Var = a.g;
                    int i2 = 0;
                    if (lhs.d()) {
                        lhs.a("BufferedDiskCache#put");
                        try {
                            if (!rip.x(ripVar)) {
                                throw new IllegalStateException("Check failed.");
                            }
                            uok0Var.d(d, ripVar);
                            rip b = rip.b(ripVar);
                            try {
                                executor.execute(new wm8(a, d, b, i2));
                            } catch (Exception e2) {
                                ahq.k(e2, "Failed to schedule disk-cache write for %s", d.a());
                                uok0Var.e(d, ripVar);
                                rip.c(b);
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } finally {
                            lhs.b();
                        }
                    } else {
                        if (!rip.x(ripVar)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        uok0Var.d(d, ripVar);
                        rip b2 = rip.b(ripVar);
                        try {
                            executor.execute(new wm8(a, d, b2, i2));
                        } catch (Exception e3) {
                            ahq.k(e3, "Failed to schedule disk-cache write for %s", d.a());
                            uok0Var.e(d, ripVar);
                            rip.c(b2);
                        }
                    }
                    uhd0Var.q().f(uhd0Var, "DiskCacheWriteProducer", null);
                    l7jVar.b(i, ripVar);
                    return;
                }
            }
            uhd0Var.q().f(uhd0Var, "DiskCacheWriteProducer", null);
            l7jVar.b(i, ripVar);
        }
    }

    public b(yhn0<fbn> yhn0Var, ecl eclVar, thd0<rip> thd0Var) {
        this.a = yhn0Var;
        this.b = eclVar;
        this.c = thd0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        if (uhd0Var.w().h() >= ImageRequest.RequestLevel.DISK_CACHE.h()) {
            uhd0Var.s("disk", "nil-result_write");
            l7jVar.b(1, null);
        } else {
            if (uhd0Var.r().n(32)) {
                l7jVar = new a(l7jVar, uhd0Var, this.a, this.b);
            }
            this.c.b(l7jVar, uhd0Var);
        }
    }
}
