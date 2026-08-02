package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.h;
import java.util.Map;

/* compiled from: RegularImmutableBiMap.java */
/* loaded from: classes13.dex */
public final class f<K, V> extends ImmutableBiMap<K, V> {
    public static final f<Object, Object> j = new f<>();
    public final transient Object e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;
    public final transient f<V, K> i;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this.e = null;
        this.f = new Object[0];
        this.g = 0;
        this.h = 0;
        this.i = this;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<Map.Entry<K, V>> d() {
        return new h.a(this, this.f, this.g, this.h);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<K> g() {
        return new h.b(this, new h.c(this.f, this.g, this.h));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final V get(Object obj) {
        V v = (V) h.o(this.e, this.f, this.h, this.g, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean j() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableBiMap
    public final f m() {
        return this.i;
    }

    @Override // java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // com.google.common.collect.ImmutableBiMap, com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }

    public f(Object[] objArr, int i) {
        this.f = objArr;
        this.h = i;
        this.g = 0;
        int l = i >= 2 ? ImmutableSet.l(i) : 0;
        Object n = h.n(objArr, i, l, 0);
        if (!(n instanceof Object[])) {
            this.e = n;
            Object n2 = h.n(objArr, i, l, 1);
            if (!(n2 instanceof Object[])) {
                this.i = new f<>(n2, objArr, i, this);
                return;
            }
            throw ((ImmutableMap.a.C0129a) ((Object[]) n2)[2]).a();
        }
        throw ((ImmutableMap.a.C0129a) ((Object[]) n)[2]).a();
    }

    public f(Object obj, Object[] objArr, int i, f<V, K> fVar) {
        this.e = obj;
        this.f = objArr;
        this.g = 1;
        this.h = i;
        this.i = fVar;
    }
}
