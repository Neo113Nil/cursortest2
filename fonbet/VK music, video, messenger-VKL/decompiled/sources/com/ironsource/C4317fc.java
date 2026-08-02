package com.ironsource;

import com.ironsource.AbstractC4627x0;
import com.ironsource.O0;
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

/* renamed from: com.ironsource.fc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4317fc extends AbstractC4627x0 {
    public static final a y = new a(null);
    private final C4341h0 t;
    private final C4609w0 u;
    private final Qb v;
    private final String w;
    private final String x;

    /* renamed from: com.ironsource.fc$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final C4317fc a(C4341h0 c4341h0, Va va) {
            List<C4657yc> list;
            Ve d;
            AbstractC4627x0.a aVar = AbstractC4627x0.r;
            N3 c = (va == null || (d = va.d()) == null) ? null : d.c();
            Qb e = c != null ? c.e() : null;
            if (e == null) {
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
            return new C4317fc(c4341h0, new C4609w0(f, arrayList, C4440ma.b()), e);
        }

        private a() {
        }
    }

    public C4317fc(C4341h0 c4341h0, C4609w0 c4609w0, Qb qb) {
        super(c4341h0, true, c4609w0.f(), c4609w0.d(), c4609w0.e(), qb.d(), qb.b(), (int) (qb.c() / 1000), qb.a(), qb.f(), -1, new O0(O0.a.MANUAL, qb.d().j(), qb.d().b(), -1L), qb.h(), qb.i(), qb.k(), qb.j(), false, 65536, null);
        this.t = c4341h0;
        this.u = c4609w0;
        this.v = qb;
        this.w = "NA";
        this.x = Wa.e;
    }

    public final Qb A() {
        return this.v;
    }

    public final C4317fc a(C4341h0 c4341h0, C4609w0 c4609w0, Qb qb) {
        return new C4317fc(c4341h0, c4609w0, qb);
    }

    @Override // com.ironsource.AbstractC4627x0
    public C4341h0 b() {
        return this.t;
    }

    @Override // com.ironsource.AbstractC4627x0
    public String c() {
        return this.w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4317fc)) {
            return false;
        }
        C4317fc c4317fc = (C4317fc) obj;
        return epx.f(this.t, c4317fc.t) && epx.f(this.u, c4317fc.u) && epx.f(this.v, c4317fc.v);
    }

    public int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + (this.t.hashCode() * 31)) * 31);
    }

    @Override // com.ironsource.AbstractC4627x0
    public String j() {
        return this.x;
    }

    public String toString() {
        return "NativeAdUnitData(adProperties=" + this.t + ", adUnitCommonData=" + this.u + ", configs=" + this.v + ")";
    }

    public final C4341h0 w() {
        return this.t;
    }

    public final C4609w0 x() {
        return this.u;
    }

    public final Qb y() {
        return this.v;
    }

    public final C4609w0 z() {
        return this.u;
    }

    public static /* synthetic */ C4317fc a(C4317fc c4317fc, C4341h0 c4341h0, C4609w0 c4609w0, Qb qb, int i, Object obj) {
        if ((i & 1) != 0) {
            c4341h0 = c4317fc.t;
        }
        if ((i & 2) != 0) {
            c4609w0 = c4317fc.u;
        }
        if ((i & 4) != 0) {
            qb = c4317fc.v;
        }
        return c4317fc.a(c4341h0, c4609w0, qb);
    }

    @Override // com.ironsource.AbstractC4627x0
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getNativeAdSettings();
    }
}
