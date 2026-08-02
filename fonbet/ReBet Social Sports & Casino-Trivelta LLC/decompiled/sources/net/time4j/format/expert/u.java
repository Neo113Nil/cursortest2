package net.time4j.format.expert;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class u extends t {

    /* renamed from: b, reason: collision with root package name */
    public Map f58050b = null;

    /* renamed from: a, reason: collision with root package name */
    public Object f58049a = null;

    @Override // net.time4j.format.expert.t
    public Object A() {
        return this.f58049a;
    }

    @Override // net.time4j.format.expert.t
    public void B(oi.p pVar, int i10) {
        pVar.getClass();
        Map map = this.f58050b;
        if (map == null) {
            map = new HashMap();
            this.f58050b = map;
        }
        map.put(pVar, Integer.valueOf(i10));
    }

    @Override // net.time4j.format.expert.t
    public void C(oi.p pVar, Object obj) {
        pVar.getClass();
        if (obj != null) {
            Map map = this.f58050b;
            if (map == null) {
                map = new HashMap();
                this.f58050b = map;
            }
            map.put(pVar, obj);
            return;
        }
        Map map2 = this.f58050b;
        if (map2 != null) {
            map2.remove(pVar);
            if (this.f58050b.isEmpty()) {
                this.f58050b = null;
            }
        }
    }

    @Override // net.time4j.format.expert.t
    public void D(Object obj) {
        this.f58049a = obj;
    }

    @Override // oi.q, oi.o
    public int e(oi.p pVar) {
        pVar.getClass();
        Map map = this.f58050b;
        if (map == null || !map.containsKey(pVar)) {
            return Integer.MIN_VALUE;
        }
        return ((Integer) pVar.getType().cast(map.get(pVar))).intValue();
    }

    @Override // oi.q, oi.o
    public boolean f(oi.p pVar) {
        Map map;
        if (pVar == null || (map = this.f58050b) == null) {
            return false;
        }
        return map.containsKey(pVar);
    }

    @Override // oi.q, oi.o
    public Object j(oi.p pVar) {
        pVar.getClass();
        Map map = this.f58050b;
        if (map != null && map.containsKey(pVar)) {
            return pVar.getType().cast(map.get(pVar));
        }
        throw new oi.r("No value found for: " + pVar.name());
    }

    @Override // oi.q
    public Set u() {
        Map map = this.f58050b;
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }
}
