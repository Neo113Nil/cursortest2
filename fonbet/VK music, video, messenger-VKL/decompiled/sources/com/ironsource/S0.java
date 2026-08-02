package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.c5g;
import xsna.on00;

/* loaded from: classes13.dex */
public final class S0 extends C4235b2 {
    private final Map<String, L> e;

    public S0(List<? extends NetworkSettings> list, int i) {
        super(list, i);
        int e = on00.e(c5g.u(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = new Pair(((NetworkSettings) it.next()).getProviderName(), new L(i));
            linkedHashMap.put(pair.i(), pair.j());
        }
        this.e = linkedHashMap;
    }

    public final void a(Pg pg) {
        List<B> b = pg.b();
        int e = on00.e(c5g.u(b, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (B b2 : b) {
            Pair pair = new Pair(b2.p(), b2.t());
            linkedHashMap.put(pair.i(), pair.j());
        }
        a(linkedHashMap);
    }

    @Override // com.ironsource.C4235b2
    public String a(String str) {
        String d;
        L l = this.e.get(str);
        return (l == null || (d = l.d()) == null) ? "" : d;
    }

    private final void a(Map<String, J> map) {
        for (Map.Entry<String, L> entry : this.e.entrySet()) {
            entry.getValue().a(map.get(entry.getKey()));
        }
    }
}
