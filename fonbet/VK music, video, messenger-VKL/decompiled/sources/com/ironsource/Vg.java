package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import xsna.fo8;
import xsna.zcl;

/* loaded from: classes13.dex */
public abstract class Vg {
    public static final a c = new a(null);
    private final C4484p0 a;
    private final Vc b;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final Vg a(V0 v0, AbstractC4627x0 abstractC4627x0, Vc vc, Pg pg, H h) {
            return abstractC4627x0.q() ? new C4660yf(v0, vc, pg, h) : new J4(v0, vc, pg);
        }

        private a() {
        }
    }

    public Vg(C4484p0 c4484p0, Vc vc) {
        this.a = c4484p0;
        this.b = vc;
    }

    private final void b(B b, List<? extends B> list) {
        for (B b2 : list) {
            if (b2 == b) {
                b.a(true);
                return;
            } else {
                b2.a(false);
                IronLog.INTERNAL.verbose(C4484p0.a(this.a, fo8.a(b2.q(), " - not ready to show"), (String) null, 2, (Object) null));
            }
        }
    }

    public abstract void a();

    public abstract void a(B b);

    public final void a(B b, List<? extends B> list) {
        b(b, list);
        c(b);
    }

    public abstract void b(B b);

    public abstract void c(B b);

    public final void a(B b, String str, C4440ma c4440ma) {
        this.b.a(b, str, c4440ma);
    }
}
