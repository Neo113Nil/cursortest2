package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import xsna.ayy;
import xsna.t4q0;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes13.dex */
public final class s extends c<String> implements ayy, RandomAccess {
    public final ArrayList c;

    static {
        new s(10).b = false;
    }

    public s(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        c();
        this.c.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(this.c.size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.c;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof ByteString)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, q.a);
            if (h0.a.c(0, bArr.length, bArr)) {
                arrayList.set(i, str);
            }
            return str;
        }
        ByteString byteString = (ByteString) obj;
        byteString.getClass();
        String n = byteString.size() == 0 ? "" : byteString.n(q.a);
        if (byteString.h()) {
            arrayList.set(i, n);
        }
        return n;
    }

    @Override // xsna.ayy
    public final Object getRaw(int i) {
        return this.c.get(i);
    }

    @Override // xsna.ayy
    public final List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.c);
    }

    @Override // xsna.ayy
    public final ayy getUnmodifiableView() {
        return this.b ? new t4q0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q.d
    public final q.d mutableCopyWithCapacity(int i) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new s((ArrayList<Object>) arrayList2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        Object remove = this.c.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof ByteString)) {
            return new String((byte[]) remove, q.a);
        }
        ByteString byteString = (ByteString) remove;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.n(q.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.c.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof ByteString)) {
            return new String((byte[]) obj2, q.a);
        }
        ByteString byteString = (ByteString) obj2;
        byteString.getClass();
        return byteString.size() == 0 ? "" : byteString.n(q.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // xsna.ayy
    public final void w3(ByteString byteString) {
        c();
        this.c.add(byteString);
        ((AbstractList) this).modCount++;
    }

    public s(ArrayList<Object> arrayList) {
        this.c = arrayList;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof ayy) {
            collection = ((ayy) collection).getUnderlyingElements();
        }
        boolean addAll = this.c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
