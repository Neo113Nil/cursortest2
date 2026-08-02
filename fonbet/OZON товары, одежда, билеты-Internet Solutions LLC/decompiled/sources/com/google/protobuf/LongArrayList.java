package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class LongArrayList extends AbstractProtobufList<Long> implements Internal.LongList, RandomAccess, F {
    private static final long[] EMPTY_ARRAY;
    private static final LongArrayList EMPTY_LIST;
    private long[] array;
    private int size;

    static {
        long[] jArr = new long[0];
        EMPTY_ARRAY = jArr;
        EMPTY_LIST = new LongArrayList(jArr, 0, false);
    }

    LongArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    public static LongArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i11) {
        if (i11 < 0 || i11 >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
        }
    }

    private static int growSize(int i11) {
        return Ep.a.a(i11, 3, 2, 1, 10);
    }

    private String makeOutOfBoundsExceptionMessage(int i11) {
        StringBuilder f7 = P4.f.f(i11, "Index:", ", Size:");
        f7.append(this.size);
        return f7.toString();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        ensureIsMutable();
        byte[] bArr = Internal.f60126b;
        collection.getClass();
        if (!(collection instanceof LongArrayList)) {
            return super.addAll(collection);
        }
        LongArrayList longArrayList = (LongArrayList) collection;
        int i11 = longArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        long[] jArr = this.array;
        if (i13 > jArr.length) {
            this.array = Arrays.copyOf(jArr, i13);
        }
        System.arraycopy(longArrayList.array, 0, this.array, this.size, longArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public void addLong(long j11) {
        ensureIsMutable();
        int i11 = this.size;
        long[] jArr = this.array;
        if (i11 == jArr.length) {
            long[] jArr2 = new long[growSize(jArr.length)];
            System.arraycopy(this.array, 0, jArr2, 0, this.size);
            this.array = jArr2;
        }
        long[] jArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        jArr3[i12] = j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    void ensureCapacity(int i11) {
        long[] jArr = this.array;
        if (i11 <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.array = new long[Math.max(i11, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i11) {
            length = growSize(length);
        }
        this.array = Arrays.copyOf(this.array, length);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LongArrayList)) {
            return super.equals(obj);
        }
        LongArrayList longArrayList = (LongArrayList) obj;
        if (this.size != longArrayList.size) {
            return false;
        }
        long[] jArr = longArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.array[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long getLong(int i11) {
        ensureIndexInRange(i11);
        return this.array[i11];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + Internal.b(this.array[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == longValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i11, int i12) {
        ensureIsMutable();
        if (i12 < i11) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.array;
        System.arraycopy(jArr, i12, jArr, i11, this.size - i12);
        this.size -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.LongList
    public long setLong(int i11, long j11) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        long[] jArr = this.array;
        long j12 = jArr[i11];
        jArr[i11] = j11;
        return j12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private LongArrayList(long[] jArr, int i11, boolean z11) {
        super(z11);
        this.array = jArr;
        this.size = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public Long get(int i11) {
        return Long.valueOf(getLong(i11));
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.e
    /* renamed from: mutableCopyWithCapacity */
    public Internal.e<Long> mutableCopyWithCapacity2(int i11) {
        if (i11 >= this.size) {
            return new LongArrayList(i11 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i11), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long remove(int i11) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        long[] jArr = this.array;
        long j11 = jArr[i11];
        if (i11 < this.size - 1) {
            System.arraycopy(jArr, i11 + 1, jArr, i11, (r3 - i11) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j11);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Long set(int i11, Long l11) {
        return Long.valueOf(setLong(i11, l11.longValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Long l11) {
        addLong(l11.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i11, Long l11) {
        addLong(i11, l11.longValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    LongArrayList(LongArrayList longArrayList, boolean z11) {
        this(r0 == 0 ? EMPTY_ARRAY : Arrays.copyOf(longArrayList.array, r0), longArrayList.size, z11);
        int i11 = longArrayList.size;
    }

    private void addLong(int i11, long j11) {
        int i12;
        ensureIsMutable();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            long[] jArr = this.array;
            if (i12 < jArr.length) {
                System.arraycopy(jArr, i11, jArr, i11 + 1, i12 - i11);
            } else {
                long[] jArr2 = new long[growSize(jArr.length)];
                System.arraycopy(this.array, 0, jArr2, 0, i11);
                System.arraycopy(this.array, i11, jArr2, i11 + 1, this.size - i11);
                this.array = jArr2;
            }
            this.array[i11] = j11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
    }
}
