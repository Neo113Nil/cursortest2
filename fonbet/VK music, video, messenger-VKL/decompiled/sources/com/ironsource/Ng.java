package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.go9;
import xsna.lhg;
import xsna.pzl;
import xsna.zcl;

/* loaded from: classes13.dex */
public abstract class Ng {
    public static final a d = new a(null);
    private final V0 a;
    private final AbstractC4627x0 b;
    private final Vc c = new c();

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final Ng a(V0 v0, AbstractC4627x0 abstractC4627x0) {
            return abstractC4627x0.t() ? new C4557t2(v0, abstractC4627x0) : new Ec(v0, abstractC4627x0);
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class c implements Vc {
    }

    public Ng(V0 v0, AbstractC4627x0 abstractC4627x0) {
        this.a = v0;
        this.b = abstractC4627x0;
    }

    private final InterfaceC4622wd b() {
        int i = b.a[this.b.b().a().ordinal()];
        if (i == 1) {
            return Kb.u.d().B();
        }
        if (i == 2) {
            return Kb.u.d().F();
        }
        IronLog.INTERNAL.warning(C4484p0.a(this.a, "Unable to reset preloaded instance", (String) null, 2, (Object) null));
        return null;
    }

    public Vc a() {
        return this.c;
    }

    public abstract void a(E e, Og og);

    public final void c() {
        InterfaceC4622wd b2 = b();
        if (b2 == null) {
            return;
        }
        b2.a(this.b.b().c(), false);
    }

    public static /* synthetic */ Pg a(Ng ng, List list, Map map, C4450n2 c4450n2, E e, B b2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAdInstanceWaterfall");
        }
        if ((i & 16) != 0) {
            b2 = null;
        }
        return ng.a(list, map, c4450n2, e, b2);
    }

    public final Pg a(List<? extends C4504q2> list, Map<String, I> map, C4450n2 c4450n2, E e, B b2) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.a, lhg.a(list.size(), "waterfall.size() = "), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C4504q2 c4504q2 = list.get(i);
            if (!z && b2 != null && epx.f(b2.p(), c4504q2.c())) {
                b2.a(c4504q2);
                arrayList.add(b2);
                z = true;
            } else {
                B a2 = a(c4504q2, c4450n2, e, map.get(c4504q2.c()));
                if (a2 != null && a2.g() != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (b2 != null && !z) {
            c();
        }
        Pg pg = new Pg(arrayList);
        IronLog.INTERNAL.verbose(C4484p0.a(this.a, go9.b("updateWaterfall() - next waterfall is ", pg.d()), (String) null, 2, (Object) null));
        return pg;
    }

    private final B a(C4504q2 c4504q2, C4450n2 c4450n2, E e, I i) {
        NetworkSettings a2 = this.b.a(c4504q2.c());
        if (a2 == null) {
            a("Could not find matching provider settings for auction response item", c4504q2.c());
            return null;
        }
        if (i == null) {
            a("Could not find matching adInstancePayload for auction response item", c4504q2.c());
            return null;
        }
        com.ironsource.mediationsdk.c.b().b(a2, this.b.b().a(), this.b.b().b());
        int e2 = this.a.e();
        AbstractC4627x0 abstractC4627x0 = this.b;
        return e.a(new C(abstractC4627x0, a2, c4450n2, new C4288e1(a2, abstractC4627x0.b(a2), this.b.b().a()), c4504q2, e2, false, 64, null), i);
    }

    private final void a(String str, String str2) {
        String b2 = pzl.b(str, " - item = ", str2);
        IronLog.INTERNAL.error(C4484p0.a(this.a, b2, (String) null, 2, (Object) null));
        this.a.d().h().i(b2);
    }
}
