package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC4502q0;
import com.ironsource.F0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import xsna.yi2;

/* loaded from: classes13.dex */
public class L2 extends AbstractC4502q0 {
    private final WeakReference<O2> i;
    private final a j;
    private final M2 k;

    public L2(C4484p0 c4484p0, M2 m2, O2 o2) {
        super(c4484p0, m2, o2);
        String format;
        int b;
        this.i = new WeakReference<>(o2);
        this.j = new a();
        this.k = m2;
        C4336gd g = g();
        IronLog.INTERNAL.verbose("placement = " + g);
        if (g == null || TextUtils.isEmpty(g.c())) {
            format = String.format("can't load banner - %s", Arrays.copyOf(new Object[]{g == null ? "placement is null" : "placement name is empty"}, 1));
            b = B0.b(m2.b().a());
        } else {
            format = null;
            b = 510;
        }
        if (format != null) {
            IronLog.API.error(a(format));
            a(b, format);
        }
    }

    @Override // com.ironsource.AbstractC4502q0
    public C4537s0 b() {
        return new S2(this.k.b(), a(l()));
    }

    public final class a extends AbstractC4502q0.a implements D2 {
        public a() {
            super();
        }

        @Override // com.ironsource.D2
        public void a(B2 b2) {
            IronLog.INTERNAL.verbose(L2.this.a(b2.q()));
            O2 o2 = (O2) L2.this.i.get();
            if (o2 != null) {
                o2.g();
            }
        }

        @Override // com.ironsource.AbstractC4502q0.a, com.ironsource.F
        public void b(B b) {
            super.b(b);
            InterfaceC4663z0 i = L2.this.i();
            if (i != null) {
                i.a(b.e());
            }
        }

        @Override // com.ironsource.D2
        public void c(B2 b2) {
            IronLog.INTERNAL.verbose(L2.this.a(b2.q()));
            O2 o2 = (O2) L2.this.i.get();
            if (o2 != null) {
                o2.h();
            }
        }

        @Override // com.ironsource.D2
        public void b(B2 b2) {
            IronLog.INTERNAL.verbose(L2.this.a(b2.q()));
            O2 o2 = (O2) L2.this.i.get();
            if (o2 != null) {
                o2.j();
            }
        }
    }

    private final ISBannerSize l() {
        return f().a(this.k.b().i());
    }

    public final void a(Eg eg, InterfaceC4663z0 interfaceC4663z0) {
        if (eg != null) {
            a(new F2(eg), interfaceC4663z0);
        }
    }

    @Override // com.ironsource.AbstractC4502q0
    public E a() {
        return new yi2(this, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(L2 l2, C c, I i) {
        return new B2(new V0(l2.f(), F0.b.PROVIDER), c, i, l2.j);
    }

    private final ISBannerSize a(ISBannerSize iSBannerSize) {
        if (!iSBannerSize.isSmart()) {
            return iSBannerSize;
        }
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            return com.ironsource.mediationsdk.j.a();
        }
        return ISBannerSize.BANNER;
    }
}
