package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class d0 extends W implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f36808a = new d0();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return f36808a;
    }

    @Override // com.google.common.collect.W
    public W o() {
        return W.h();
    }

    @Override // com.google.common.collect.W, java.util.Comparator
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        Ra.n.k(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
