package com.ironsource;

import com.ironsource.AbstractC4627x0;
import com.ironsource.O0;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class M2 extends AbstractC4627x0 {
    public static final a z = new a(null);
    private final J2 t;
    private final boolean u;
    private final C4609w0 v;
    private final U2 w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final M2 a(J2 j2, Va va, boolean z) {
            List<C4657yc> list;
            Ve d;
            AbstractC4627x0.a aVar = AbstractC4627x0.r;
            N3 c = (va == null || (d = va.d()) == null) ? null : d.c();
            U2 c2 = c != null ? c.c() : null;
            if (c2 == null) {
                throw new IllegalStateException("Error getting " + j2.a() + " configurations");
            }
            if (va == null || (list = va.d(j2.e(), j2.c())) == null) {
                list = EmptyList.b;
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4657yc) it.next()).f());
            }
            return new M2(j2, z, new C4609w0(f, arrayList, C4440ma.b()), c2);
        }

        private a() {
        }
    }

    public M2(J2 j2, boolean z2, C4609w0 c4609w0, U2 u2) {
        super(j2, z2, c4609w0.f(), c4609w0.d(), c4609w0.e(), u2.d(), u2.a(), (int) (u2.b() / 1000), u2.c(), u2.f(), -1, new O0(O0.a.MANUAL_WITH_AUTOMATIC_RELOAD, u2.d().j(), u2.d().b(), 1000 * u2.h()), u2.e(), u2.l(), u2.n(), u2.m(), false, 65536, null);
        this.t = j2;
        this.u = z2;
        this.v = c4609w0;
        this.w = u2;
        this.x = "BN";
        this.y = Wa.d;
    }

    @Override // com.ironsource.AbstractC4627x0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public J2 b() {
        return this.t;
    }

    public final C4609w0 B() {
        return this.v;
    }

    public final U2 C() {
        return this.w;
    }

    public final M2 a(J2 j2, boolean z2, C4609w0 c4609w0, U2 u2) {
        return new M2(j2, z2, c4609w0, u2);
    }

    @Override // com.ironsource.AbstractC4627x0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M2)) {
            return false;
        }
        M2 m2 = (M2) obj;
        return epx.f(this.t, m2.t) && this.u == m2.u && epx.f(this.v, m2.v) && epx.f(this.w, m2.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.t.hashCode() * 31;
        boolean z2 = this.u;
        int i = z2;
        if (z2 != 0) {
            i = 1;
        }
        return this.w.hashCode() + ((this.v.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC4627x0
    public String j() {
        return this.y;
    }

    public String toString() {
        return "BannerAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC4627x0
    public boolean u() {
        return this.u;
    }

    public final J2 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C4609w0 y() {
        return this.v;
    }

    public final U2 z() {
        return this.w;
    }

    public static /* synthetic */ M2 a(M2 m2, J2 j2, boolean z2, C4609w0 c4609w0, U2 u2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = m2.t;
        }
        if ((i & 2) != 0) {
            z2 = m2.u;
        }
        if ((i & 4) != 0) {
            c4609w0 = m2.v;
        }
        if ((i & 8) != 0) {
            u2 = m2.w;
        }
        return m2.a(j2, z2, c4609w0, u2);
    }

    @Override // com.ironsource.AbstractC4627x0
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getBannerSettings();
    }

    @Override // com.ironsource.AbstractC4627x0
    public AdData a(NetworkSettings networkSettings) {
        return AdData.createAdDataForNetworkAdapter(b(networkSettings), b().a(), r(), new com.ironsource.mediationsdk.o(ContextProvider.getInstance().getApplicationContext(), new C4430m0().b(b().i())));
    }
}
