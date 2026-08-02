package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class n0 extends AbstractList implements D, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final D f37339a;

    public class a implements ListIterator {

        /* renamed from: a, reason: collision with root package name */
        public ListIterator f37340a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37341b;

        public a(int i10) {
            this.f37341b = i10;
            this.f37340a = n0.this.f37339a.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f37340a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f37340a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f37340a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f37340a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f37340a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f37340a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public Iterator f37343a;

        public b() {
            this.f37343a = n0.this.f37339a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f37343a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37343a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n0(D d10) {
        this.f37339a = d10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public Object getRaw(int i10) {
        return this.f37339a.getRaw(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public List getUnderlyingElements() {
        return this.f37339a.getUnderlyingElements();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public D getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37339a.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public void z0(AbstractC3476h abstractC3476h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        return (String) this.f37339a.get(i10);
    }
}
