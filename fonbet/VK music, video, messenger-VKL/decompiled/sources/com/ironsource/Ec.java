package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.c5g;
import xsna.on00;

/* loaded from: classes13.dex */
public final class Ec extends Ng {
    private final V0 e;
    private final AbstractC4627x0 f;

    public Ec(V0 v0, AbstractC4627x0 abstractC4627x0) {
        super(v0, abstractC4627x0);
        this.e = v0;
        this.f = abstractC4627x0;
    }

    private final C4450n2 d() {
        return new C4450n2("", new JSONObject(), null, 0, "");
    }

    private final Map<String, I> e() {
        Tf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            NetworkSettings networkSettings2 = (NetworkSettings) it.next();
            Pair pair = new Pair(networkSettings2.getProviderInstanceName(), new I(this.e, this.f, networkSettings2));
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }

    private final List<C4504q2> f() {
        Tf g = this.f.b().g();
        List<NetworkSettings> m = this.f.m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (g == null || g.a(networkSettings, this.f.b().a())) {
                if (!networkSettings.isBidder(this.f.b().a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C4504q2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.Ng
    public void a(E e, Og og) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.e, "auction disabled", (String) null, 2, (Object) null));
        a(og, d(), e);
    }

    public final void a(Og og, int i, String str, String str2, E e) {
        a(og, new C4450n2(str2, new JSONObject(), null, i, str), e);
    }

    private final void a(Og og, C4450n2 c4450n2, E e) {
        IronLog.INTERNAL.verbose(C4484p0.a(this.e, (String) null, (String) null, 3, (Object) null));
        og.a(Ng.a(this, f(), e(), c4450n2, e, null, 16, null));
    }
}
