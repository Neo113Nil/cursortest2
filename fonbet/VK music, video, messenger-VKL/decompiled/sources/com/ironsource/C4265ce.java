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

/* renamed from: com.ironsource.ce, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4265ce extends AbstractC4627x0 {
    public static final a z = new a(null);
    private final C4341h0 t;
    private final boolean u;
    private final C4609w0 v;
    private final C4301ee w;
    private final String x;
    private final String y;

    /* renamed from: com.ironsource.ce$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final C4265ce a(C4341h0 c4341h0, Va va, boolean z) {
            List<C4657yc> list;
            Ve d;
            AbstractC4627x0.a aVar = AbstractC4627x0.r;
            N3 c = (va == null || (d = va.d()) == null) ? null : d.c();
            C4301ee f = c != null ? c.f() : null;
            if (f == null) {
                throw new IllegalStateException("Error getting " + c4341h0.a() + " configurations");
            }
            if (va == null || (list = va.d(c4341h0.e(), c4341h0.c())) == null) {
                list = EmptyList.b;
            }
            String f2 = IronSourceUtils.f();
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4657yc) it.next()).f());
            }
            return new C4265ce(c4341h0, z, new C4609w0(f2, arrayList, C4440ma.b()), f);
        }

        private a() {
        }
    }

    public C4265ce(C4341h0 c4341h0, boolean z2, C4609w0 c4609w0, C4301ee c4301ee) {
        super(c4341h0, z2, c4609w0.f(), c4609w0.d(), c4609w0.e(), c4301ee.k(), c4301ee.g(), c4301ee.h(), c4301ee.j(), c4301ee.b(), c4301ee.c(), new O0(O0.a.MANUAL, c4301ee.k().j(), c4301ee.k().b(), -1L), c4301ee.l(), c4301ee.f(), c4301ee.o(), c4301ee.n(), false, 65536, null);
        this.t = c4341h0;
        this.u = z2;
        this.v = c4609w0;
        this.w = c4301ee;
        this.x = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
        this.y = Wa.b;
    }

    public final C4609w0 A() {
        return this.v;
    }

    public final C4301ee B() {
        return this.w;
    }

    public final C4265ce a(C4341h0 c4341h0, boolean z2, C4609w0 c4609w0, C4301ee c4301ee) {
        return new C4265ce(c4341h0, z2, c4609w0, c4301ee);
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
        if (!(obj instanceof C4265ce)) {
            return false;
        }
        C4265ce c4265ce = (C4265ce) obj;
        return epx.f(this.t, c4265ce.t) && this.u == c4265ce.u && epx.f(this.v, c4265ce.v) && epx.f(this.w, c4265ce.w);
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
        return "RewardedAdUnitData(adProperties=" + this.t + ", isPublisherLoad=" + this.u + ", adUnitCommonData=" + this.v + ", configs=" + this.w + ")";
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

    public final C4301ee z() {
        return this.w;
    }

    public static /* synthetic */ C4265ce a(C4265ce c4265ce, C4341h0 c4341h0, boolean z2, C4609w0 c4609w0, C4301ee c4301ee, int i, Object obj) {
        if ((i & 1) != 0) {
            c4341h0 = c4265ce.t;
        }
        if ((i & 2) != 0) {
            z2 = c4265ce.u;
        }
        if ((i & 4) != 0) {
            c4609w0 = c4265ce.v;
        }
        if ((i & 8) != 0) {
            c4301ee = c4265ce.w;
        }
        return c4265ce.a(c4341h0, z2, c4609w0, c4301ee);
    }

    @Override // com.ironsource.AbstractC4627x0
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }
}
