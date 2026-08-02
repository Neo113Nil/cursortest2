package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class k79 extends AbstractMap implements Map, Serializable {
    public final o79 a;
    public transient l79 b;

    public k79(o79 o79Var) {
        this.a = o79Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a.p = this;
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
        l79 l79Var = this.b;
        if (l79Var != null) {
            return l79Var;
        }
        l79 l79Var2 = new l79(this.a, 0);
        this.b = l79Var2;
        return l79Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int B = tol.B(obj);
        o79 o79Var = this.a;
        int j = o79Var.j(B, obj);
        if (j == -1) {
            return null;
        }
        return o79Var.a[j];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        o79 o79Var = this.a;
        j79 j79Var = o79Var.n;
        if (j79Var != null) {
            return j79Var;
        }
        j79 j79Var2 = new j79(o79Var, 2);
        o79Var.n = j79Var2;
        return j79Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.a.o(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int B = tol.B(obj);
        o79 o79Var = this.a;
        int j = o79Var.j(B, obj);
        if (j == -1) {
            return null;
        }
        Object obj2 = o79Var.a[j];
        o79Var.r(j, B);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return this.a.keySet();
    }
}
