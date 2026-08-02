package com.google.android.gms.internal.play_billing;

import j$.util.SortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k0 extends j0 implements NavigableSet, b1, SortedSet {

    /* renamed from: c, reason: collision with root package name */
    public final transient Comparator f5491c;

    /* renamed from: d, reason: collision with root package name */
    public transient k0 f5492d;

    public k0(Comparator comparator) {
        this.f5491c = comparator;
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f5491c;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        k0 k0Var = this.f5492d;
        if (k0Var == null) {
            z0 z0Var = (z0) this;
            Comparator reverseOrder = Collections.reverseOrder(z0Var.f5491c);
            if (!z0Var.isEmpty()) {
                k0Var = new z0(z0Var.f5659e.g(), reverseOrder);
            } else if (o0.f5525b.equals(reverseOrder)) {
                k0Var = z0.f5658f;
            } else {
                a0 a0Var = d0.f5420b;
                k0Var = new z0(s0.f5567e, reverseOrder);
            }
            this.f5492d = k0Var;
            k0Var.f5492d = this;
        }
        return k0Var;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet headSet(Object obj) {
        obj.getClass();
        z0 z0Var = (z0) this;
        return z0Var.m(0, z0Var.j(obj, false));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z5, Object obj2, boolean z7) {
        obj.getClass();
        obj2.getClass();
        if (this.f5491c.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        z0 z0Var = (z0) this;
        z0 m6 = z0Var.m(z0Var.l(obj, z5), z0Var.f5659e.size());
        return m6.m(0, m6.j(obj2, z7));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet tailSet(Object obj) {
        obj.getClass();
        z0 z0Var = (z0) this;
        return z0Var.m(z0Var.l(obj, true), z0Var.f5659e.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z5) {
        obj.getClass();
        z0 z0Var = (z0) this;
        return z0Var.m(0, z0Var.j(obj, z5));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z5) {
        obj.getClass();
        z0 z0Var = (z0) this;
        return z0Var.m(z0Var.l(obj, z5), z0Var.f5659e.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final java.util.SortedSet subSet(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        if (this.f5491c.compare(obj, obj2) <= 0) {
            z0 z0Var = (z0) this;
            z0 m6 = z0Var.m(z0Var.l(obj, true), z0Var.f5659e.size());
            return m6.m(0, m6.j(obj2, false));
        }
        throw new IllegalArgumentException();
    }
}
