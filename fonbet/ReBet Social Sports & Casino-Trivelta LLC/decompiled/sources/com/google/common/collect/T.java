package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class T extends W implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final T f36740a = new T();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f36740a;
    }

    @Override // com.google.common.collect.W
    public W o() {
        return d0.f36808a;
    }

    @Override // com.google.common.collect.W, java.util.Comparator
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Ra.n.k(comparable);
        Ra.n.k(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
