package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.common.collect.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3435o extends W implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f36853a;

    public C3435o(Comparator comparator) {
        this.f36853a = (Comparator) Ra.n.k(comparator);
    }

    @Override // com.google.common.collect.W, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f36853a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3435o) {
            return this.f36853a.equals(((C3435o) obj).f36853a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36853a.hashCode();
    }

    public String toString() {
        return this.f36853a.toString();
    }
}
