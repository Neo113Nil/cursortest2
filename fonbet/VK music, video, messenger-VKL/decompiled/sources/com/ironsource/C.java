package com.ironsource;

import com.ironsource.C4519r0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.epx;
import xsna.n23;
import xsna.shy;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class C {
    private final AbstractC4627x0 a;
    private final NetworkSettings b;
    private final C4450n2 c;
    private final C4288e1 d;
    private C4504q2 e;
    private final int f;
    private final boolean g;
    private final J h;
    private final IronSource.a i;
    private final JSONObject j;
    private final String k;
    private final int l;
    private final String m;
    private final C4504q2 n;
    private final String o;
    private final String p;
    private final int q;
    private final AdData r;

    public C(AbstractC4627x0 abstractC4627x0, NetworkSettings networkSettings, C4450n2 c4450n2, C4288e1 c4288e1, C4504q2 c4504q2, int i, boolean z) {
        this.a = abstractC4627x0;
        this.b = networkSettings;
        this.c = c4450n2;
        this.d = c4288e1;
        this.e = c4504q2;
        this.f = i;
        this.g = z;
        this.h = new J(C4519r0.a.DidntAttemptToLoad);
        IronSource.a a = abstractC4627x0.b().a();
        this.i = a;
        this.j = c4450n2.h();
        this.k = c4450n2.g();
        this.l = c4450n2.i();
        this.m = c4450n2.f();
        this.n = c4450n2.j();
        String f = c4288e1.f();
        this.o = f;
        this.p = String.format("%s %s", Arrays.copyOf(new Object[]{f, Integer.valueOf(hashCode())}, 2));
        this.q = c4288e1.d();
        String k = this.e.k();
        Map<String, Object> a2 = C4369ia.a(this.e.a());
        a2.put("adUnit", a);
        HashMap hashMap = new HashMap();
        hashMap.putAll(C4369ia.a(c4288e1.c()));
        a2.put("userId", abstractC4627x0.r());
        a2.put("adUnitId", abstractC4627x0.b().c());
        a2.put("isMultipleAdUnits", Boolean.TRUE);
        this.r = new AdData(k, hashMap, a2);
    }

    public final AbstractC4627x0 a() {
        return this.a;
    }

    public final NetworkSettings b() {
        return this.b;
    }

    public final C4450n2 c() {
        return this.c;
    }

    public final C4288e1 d() {
        return this.d;
    }

    public final C4504q2 e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return epx.f(this.a, c.a) && epx.f(this.b, c.b) && epx.f(this.c, c.c) && epx.f(this.d, c.d) && epx.f(this.e, c.e) && this.f == c.f && this.g == c.g;
    }

    public final int f() {
        return this.f;
    }

    public final boolean g() {
        return this.g;
    }

    public final AdData h() {
        return this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a = shy.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31);
        boolean z = this.g;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return a + i;
    }

    public final IronSource.a i() {
        return this.i;
    }

    public final AbstractC4627x0 j() {
        return this.a;
    }

    public final C4288e1 k() {
        return this.d;
    }

    public final C4450n2 l() {
        return this.c;
    }

    public final String m() {
        return this.m;
    }

    public final String n() {
        return this.k;
    }

    public final C4504q2 o() {
        return this.e;
    }

    public final int p() {
        return this.l;
    }

    public final C4504q2 q() {
        return this.n;
    }

    public final JSONObject r() {
        return this.j;
    }

    public final String s() {
        return this.o;
    }

    public final int t() {
        return this.q;
    }

    public String toString() {
        AbstractC4627x0 abstractC4627x0 = this.a;
        NetworkSettings networkSettings = this.b;
        C4450n2 c4450n2 = this.c;
        C4288e1 c4288e1 = this.d;
        C4504q2 c4504q2 = this.e;
        int i = this.f;
        boolean z = this.g;
        StringBuilder sb = new StringBuilder("AdInstanceData(adUnitData=");
        sb.append(abstractC4627x0);
        sb.append(", providerSettings=");
        sb.append(networkSettings);
        sb.append(", auctionData=");
        sb.append(c4450n2);
        sb.append(", adapterConfig=");
        sb.append(c4288e1);
        sb.append(", auctionResponseItem=");
        sb.append(c4504q2);
        sb.append(", sessionDepth=");
        sb.append(i);
        sb.append(", isPreloaded=");
        return n23.b(sb, z, ")");
    }

    public final J u() {
        return this.h;
    }

    public final NetworkSettings v() {
        return this.b;
    }

    public final int w() {
        return this.f;
    }

    public final String x() {
        return this.p;
    }

    public final boolean y() {
        return this.g;
    }

    public final C a(AbstractC4627x0 abstractC4627x0, NetworkSettings networkSettings, C4450n2 c4450n2, C4288e1 c4288e1, C4504q2 c4504q2, int i, boolean z) {
        return new C(abstractC4627x0, networkSettings, c4450n2, c4288e1, c4504q2, i, z);
    }

    public static /* synthetic */ C a(C c, AbstractC4627x0 abstractC4627x0, NetworkSettings networkSettings, C4450n2 c4450n2, C4288e1 c4288e1, C4504q2 c4504q2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            abstractC4627x0 = c.a;
        }
        if ((i2 & 2) != 0) {
            networkSettings = c.b;
        }
        if ((i2 & 4) != 0) {
            c4450n2 = c.c;
        }
        if ((i2 & 8) != 0) {
            c4288e1 = c.d;
        }
        if ((i2 & 16) != 0) {
            c4504q2 = c.e;
        }
        if ((i2 & 32) != 0) {
            i = c.f;
        }
        if ((i2 & 64) != 0) {
            z = c.g;
        }
        int i3 = i;
        boolean z2 = z;
        C4504q2 c4504q22 = c4504q2;
        C4450n2 c4450n22 = c4450n2;
        return c.a(abstractC4627x0, networkSettings, c4450n22, c4288e1, c4504q22, i3, z2);
    }

    public final void a(C4504q2 c4504q2) {
        this.e = c4504q2;
    }

    public final void a(C4519r0.a aVar) {
        this.h.b(aVar);
    }

    public /* synthetic */ C(AbstractC4627x0 abstractC4627x0, NetworkSettings networkSettings, C4450n2 c4450n2, C4288e1 c4288e1, C4504q2 c4504q2, int i, boolean z, int i2, zcl zclVar) {
        this(abstractC4627x0, networkSettings, c4450n2, c4288e1, c4504q2, i, (i2 & 64) != 0 ? false : z);
    }
}
