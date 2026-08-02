package com.logrocket.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s1 extends AbstractList implements i0, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6785a;

    public s1(h0 h0Var) {
        this.f6785a = h0Var;
    }

    @Override // com.logrocket.protobuf.i0
    public final void C(j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.logrocket.protobuf.i0
    public final List N() {
        return DesugarCollections.unmodifiableList(this.f6785a.f6724b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return (String) this.f6785a.get(i5);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        r1 r1Var = new r1();
        r1Var.f6784a = this.f6785a.iterator();
        return r1Var;
    }

    @Override // com.logrocket.protobuf.i0
    public final Object k0(int i5) {
        return this.f6785a.f6724b.get(i5);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        q1 q1Var = new q1();
        q1Var.f6779a = this.f6785a.listIterator(i5);
        return q1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6785a.f6724b.size();
    }

    @Override // com.logrocket.protobuf.i0
    public final i0 c0() {
        return this;
    }
}
