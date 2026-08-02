package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d3p extends AbstractMap implements Serializable, Map {
    public final h3p a;
    public transient e3p b;

    public d3p(h3p h3pVar) {
        this.a = h3pVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        e3p e3pVar = this.b;
        if (e3pVar != null) {
            return e3pVar;
        }
        e3p e3pVar2 = new e3p(this.a, 1);
        this.b = e3pVar2;
        return e3pVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        h3p h3pVar = this.a;
        h3pVar.getClass();
        int a = h3pVar.a(bea.T(obj), obj);
        if (a == -1) {
            return null;
        }
        return h3pVar.a[a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        h3p h3pVar = this.a;
        b3p b3pVar = h3pVar.n;
        if (b3pVar != null) {
            return b3pVar;
        }
        b3p b3pVar2 = new b3p(h3pVar, 2);
        h3pVar.n = b3pVar2;
        return b3pVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.l(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h3p h3pVar = this.a;
        h3pVar.getClass();
        int T = bea.T(obj);
        int a = h3pVar.a(T, obj);
        if (a == -1) {
            return null;
        }
        Object obj2 = h3pVar.a[a];
        h3pVar.j(a, bea.T(obj2), T);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
