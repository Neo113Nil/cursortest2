package com.logrocket.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends b implements i0, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final List f6724b;

    static {
        new h0();
    }

    public h0(ArrayList arrayList) {
        super(true);
        this.f6724b = arrayList;
    }

    @Override // com.logrocket.protobuf.i0
    public final void C(j jVar) {
        a();
        this.f6724b.add(jVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.logrocket.protobuf.i0
    public final List N() {
        return DesugarCollections.unmodifiableList(this.f6724b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        a();
        this.f6724b.add(i5, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f6724b.size(), collection);
    }

    @Override // com.logrocket.protobuf.i0
    public final i0 c0() {
        return this.f6668a ? new s1(this) : this;
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f6724b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        List list = this.f6724b;
        Object obj = list.get(i5);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            String o3 = jVar.size() == 0 ? "" : jVar.o(d0.f6681a);
            if (jVar.i()) {
                list.set(i5, o3);
            }
            return o3;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, d0.f6681a);
        if (a2.f6667a.e(0, bArr, 0, bArr.length) == 0) {
            list.set(i5, str);
        }
        return str;
    }

    @Override // com.logrocket.protobuf.i0
    public final Object k0(int i5) {
        return this.f6724b.get(i5);
    }

    @Override // com.logrocket.protobuf.c0
    public final c0 r(int i5) {
        List list = this.f6724b;
        if (i5 < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i5);
        arrayList.addAll(list);
        return new h0(arrayList);
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        a();
        Object remove = this.f6724b.remove(i5);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof j)) {
            return new String((byte[]) remove, d0.f6681a);
        }
        j jVar = (j) remove;
        return jVar.size() == 0 ? "" : jVar.o(d0.f6681a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        a();
        Object obj2 = this.f6724b.set(i5, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof j)) {
            return new String((byte[]) obj2, d0.f6681a);
        }
        j jVar = (j) obj2;
        return jVar.size() == 0 ? "" : jVar.o(d0.f6681a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6724b.size();
    }

    public h0() {
        super(false);
        this.f6724b = Collections.EMPTY_LIST;
    }

    @Override // com.logrocket.protobuf.b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i5, Collection collection) {
        a();
        if (collection instanceof i0) {
            collection = ((i0) collection).N();
        }
        boolean addAll = this.f6724b.addAll(i5, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    public h0(int i5) {
        this(new ArrayList(i5));
    }
}
