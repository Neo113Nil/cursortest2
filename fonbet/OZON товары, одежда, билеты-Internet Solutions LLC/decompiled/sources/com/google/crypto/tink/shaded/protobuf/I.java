package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class I extends AbstractC5897c<Long> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f59311d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f59312b;

    /* renamed from: c, reason: collision with root package name */
    private int f59313c;

    static {
        long[] jArr = new long[0];
        f59311d = jArr;
        new I(jArr, 0, false);
    }

    I() {
        this(f59311d, 0, true);
    }

    private void c(int i11) {
        if (i11 < 0 || i11 >= this.f59313c) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59313c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        long longValue = ((Long) obj).longValue();
        a();
        if (i11 < 0 || i11 > (i12 = this.f59313c)) {
            StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
            f7.append(this.f59313c);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        long[] jArr = this.f59312b;
        if (i12 < jArr.length) {
            System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
        } else {
            long[] jArr2 = new long[Ep.a.a(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59312b, 0, jArr2, 0, i11);
            System.arraycopy(this.f59312b, i11, jArr2, i11 + 1, this.f59313c - i11);
            this.f59312b = jArr2;
        }
        this.f59312b[i11] = longValue;
        this.f59313c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        byte[] bArr = C5919z.f59481b;
        collection.getClass();
        if (!(collection instanceof I)) {
            return super.addAll(collection);
        }
        I i11 = (I) collection;
        int i12 = i11.f59313c;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.f59313c;
        if (Integer.MAX_VALUE - i13 < i12) {
            throw new OutOfMemoryError();
        }
        int i14 = i13 + i12;
        long[] jArr = this.f59312b;
        if (i14 > jArr.length) {
            this.f59312b = Arrays.copyOf(jArr, i14);
        }
        System.arraycopy(i11.f59312b, 0, this.f59312b, this.f59313c, i11.f59313c);
        this.f59313c = i14;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void addLong(long j11) {
        a();
        int i11 = this.f59313c;
        long[] jArr = this.f59312b;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[Ep.a.a(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f59312b, 0, jArr2, 0, this.f59313c);
            this.f59312b = jArr2;
        }
        long[] jArr3 = this.f59312b;
        int i12 = this.f59313c;
        this.f59313c = i12 + 1;
        jArr3[i12] = j11;
    }

    final void b(int i11) {
        long[] jArr = this.f59312b;
        if (i11 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f59312b = new long[Math.max(i11, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i11) {
            length = Ep.a.a(length, 3, 2, 1, 10);
        }
        this.f59312b = Arrays.copyOf(this.f59312b, length);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return super.equals(obj);
        }
        I i11 = (I) obj;
        if (this.f59313c != i11.f59313c) {
            return false;
        }
        long[] jArr = i11.f59312b;
        for (int i12 = 0; i12 < this.f59313c; i12++) {
            if (this.f59312b[i12] != jArr[i12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i11) {
        return Long.valueOf(getLong(i11));
    }

    public final long getLong(int i11) {
        c(i11);
        return this.f59312b[i11];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.f59313c; i12++) {
            i11 = (i11 * 31) + C5919z.b(this.f59312b[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i11 = this.f59313c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f59312b[i12] == longValue) {
                return i12;
            }
        }
        return -1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5919z.d
    public final C5919z.d mutableCopyWithCapacity(int i11) {
        if (i11 >= this.f59313c) {
            return new I(i11 == 0 ? f59311d : Arrays.copyOf(this.f59312b, i11), this.f59313c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5897c, java.util.AbstractList, java.util.List
    public final Object remove(int i11) {
        a();
        c(i11);
        long[] jArr = this.f59312b;
        long j11 = jArr[i11];
        if (i11 < this.f59313c - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.f59313c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i11, int i12) {
        a();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f59312b;
        System.arraycopy(jArr, i12, jArr, i11, this.f59313c - i12);
        this.f59313c -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i11, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        c(i11);
        long[] jArr = this.f59312b;
        long j11 = jArr[i11];
        jArr[i11] = longValue;
        return Long.valueOf(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f59313c;
    }

    private I(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.f59312b = jArr;
        this.f59313c = i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
