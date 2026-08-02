package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class C extends AbstractC3471c implements D, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final C f37234c;

    /* renamed from: d, reason: collision with root package name */
    public static final D f37235d;

    /* renamed from: b, reason: collision with root package name */
    public final List f37236b;

    static {
        C c10 = new C();
        f37234c = c10;
        c10.makeImmutable();
        f37235d = c10;
    }

    public C() {
        this(10);
    }

    public static String c(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC3476h ? ((AbstractC3476h) obj).v() : AbstractC3493z.i((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        a();
        this.f37236b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f37236b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3493z.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C mutableCopyWithCapacity(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f37236b);
        return new C(arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        a();
        Object remove = this.f37236b.remove(i10);
        ((AbstractList) this).modCount++;
        return c(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        a();
        return c(this.f37236b.set(i10, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public Object getRaw(int i10) {
        return this.f37236b.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f37236b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public D getUnmodifiableView() {
        return isModifiable() ? new n0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, com.google.crypto.tink.shaded.protobuf.AbstractC3493z.d
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37236b.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public void z0(AbstractC3476h abstractC3476h) {
        a();
        this.f37236b.add(abstractC3476h);
        ((AbstractList) this).modCount++;
    }

    public C(int i10) {
        this(new ArrayList(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof D) {
            collection = ((D) collection).getUnderlyingElements();
        }
        boolean addAll = this.f37236b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i10) {
        Object obj = this.f37236b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3476h) {
            AbstractC3476h abstractC3476h = (AbstractC3476h) obj;
            String v10 = abstractC3476h.v();
            if (abstractC3476h.k()) {
                this.f37236b.set(i10, v10);
            }
            return v10;
        }
        byte[] bArr = (byte[]) obj;
        String i11 = AbstractC3493z.i(bArr);
        if (AbstractC3493z.g(bArr)) {
            this.f37236b.set(i10, i11);
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC3471c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C(ArrayList arrayList) {
        this.f37236b = arrayList;
    }
}
