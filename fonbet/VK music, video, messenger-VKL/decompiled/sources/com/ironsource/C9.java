package com.ironsource;

import com.ironsource.AbstractC4627x0;
import com.ironsource.O0;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
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
public final class C9 extends AbstractC4627x0 {
    public static final a z = new a(null);
    private final C4341h0 t;
    private final boolean u;
    private final C4609w0 v;
    private final E9 w;
    private final String x;
    private final String y;

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final C9 a(C4341h0 c4341h0, Va va, boolean z) {
            List<C4657yc> list;
            Ve d;
            AbstractC4627x0.a aVar = AbstractC4627x0.r;
            N3 c = (va == null || (d = va.d()) == null) ? null : d.c();
            E9 d2 = c != null ? c.d() : null;
            if (d2 == null) {
                throw new IllegalStateException("Error getting " + c4341h0.a() + " configurations");
            }
            if (va == null || (list = va.d(c4341h0.e(), c4341h0.c())) == null) {
                list = EmptyList.b;
            }
            String f = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4657yc) it.next()).f());
            }
            return new C9(c4341h0, z, new C4609w0(f, arrayList, C4440ma.b()), d2);
        }

        private a() {
        }
    }

    public C9(C4341h0 c4341h0, boolean z2, C4609w0 c4609w0, E9 e9) {
        super(c4341h0, z2, c4609w0.f(), c4609w0.d(), c4609w0.e(), e9.g(), e9.c(), e9.d(), e9.f(), e9.b(), -1, new O0(O0.a.MANUAL, e9.g().j(), e9.g().b(), -1L), e9.h(), e9.k(), e9.m(), e9.l(), false, 65536, null);
        this.t = c4341h0;
        this.u = z2;
        this.v = c4609w0;
        this.w = e9;
        this.x = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
        this.y = Wa.c;
    }

    public final C4609w0 A() {
        return this.v;
    }

    public final E9 B() {
        return this.w;
    }

    public final C9 a(C4341h0 c4341h0, boolean z2, C4609w0 c4609w0, E9 e9) {
        return new C9(c4341h0, z2, c4609w0, e9);
    }

    @Override // com.ironsource.AbstractC4627x0
    public C4341h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC4627x0
    public String c() {
        return this.x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9)) {
            return false;
        }
        C9 c9 = (C9) obj;
        return epx.f(this.t, c9.t) && this.u == c9.u && epx.f(this.v, c9.v) && epx.f(this.w, c9.w);
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
        return "InterstitialAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
    }

    @Override // com.ironsource.AbstractC4627x0
    public boolean u() {
        return this.u;
    }

    public final C4341h0 w() {
        return this.t;
    }

    public final boolean x() {
        return this.u;
    }

    public final C4609w0 y() {
        return this.v;
    }

    public final E9 z() {
        return this.w;
    }

    public static /* synthetic */ C9 a(C9 c9, C4341h0 c4341h0, boolean z2, C4609w0 c4609w0, E9 e9, int i, Object obj) {
        if ((i & 1) != 0) {
            c4341h0 = c9.t;
        }
        if ((i & 2) != 0) {
            z2 = c9.u;
        }
        if ((i & 4) != 0) {
            c4609w0 = c9.v;
        }
        if ((i & 8) != 0) {
            e9 = c9.w;
        }
        return c9.a(c4341h0, z2, c4609w0, e9);
    }

    @Override // com.ironsource.AbstractC4627x0
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}
