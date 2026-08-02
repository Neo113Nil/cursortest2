package com.google.common.collect;

/* loaded from: classes3.dex */
public final class h0 extends E {

    /* renamed from: b, reason: collision with root package name */
    public final transient Object f36827b;

    public h0(Object obj) {
        this.f36827b = Ra.n.k(obj);
    }

    @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
    public AbstractC3445z a() {
        return AbstractC3445z.u(this.f36827b);
    }

    @Override // com.google.common.collect.AbstractC3443x
    public int b(Object[] objArr, int i10) {
        objArr[i10] = this.f36827b;
        return i10 + 1;
    }

    @Override // com.google.common.collect.AbstractC3443x, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f36827b.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC3443x
    public boolean g() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: h */
    public m0 iterator() {
        return J.t(this.f36827b);
    }

    @Override // com.google.common.collect.E, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f36827b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f36827b.toString() + ']';
    }

    @Override // com.google.common.collect.E, com.google.common.collect.AbstractC3443x
    public Object writeReplace() {
        return super.writeReplace();
    }
}
