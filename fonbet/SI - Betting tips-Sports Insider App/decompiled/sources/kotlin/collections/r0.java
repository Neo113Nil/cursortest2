package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r0 extends h {

    /* renamed from: a, reason: collision with root package name */
    public final List f19216a;

    public r0(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19216a = delegate;
    }

    @Override // kotlin.collections.h
    public final int a() {
        return this.f19216a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        this.f19216a.add(a0.u(i5, this), obj);
    }

    @Override // kotlin.collections.h
    public final Object c(int i5) {
        return this.f19216a.remove(a0.t(i5, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f19216a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return this.f19216a.get(a0.t(i5, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new q0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new q0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return this.f19216a.set(a0.t(i5, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i5) {
        return new q0(this, i5);
    }
}
