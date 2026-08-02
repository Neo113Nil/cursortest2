package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class IntArrayList extends AbstractProtobufList<Integer> implements Internal.IntList, RandomAccess, F {
    private static final int[] EMPTY_ARRAY;
    private static final IntArrayList EMPTY_LIST;
    private int[] array;
    private int size;

    static {
        int[] iArr = new int[0];
        EMPTY_ARRAY = iArr;
        EMPTY_LIST = new IntArrayList(iArr, 0, false);
    }

    IntArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    public static IntArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Integer> collection) {
        ensureIsMutable();
        byte[] bArr = Internal.f60126b;
        collection.getClass();
        if (!(collection instanceof IntArrayList)) {
            return super.addAll(collection);
        }
        IntArrayList intArrayList = (IntArrayList) collection;
        int i11 = intArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        int[] iArr = this.array;
        if (i13 > iArr.length) {
            this.array = Arrays.copyOf(iArr, i13);
        }
        System.arraycopy(intArrayList.array, 0, this.array, this.size, intArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public void addInt(int i11) {
        ensureIsMutable();
        int i12 = this.size;
        int[] iArr = this.array;
        if (i12 == iArr.length) {
            int[] iArr2 = new int[growSize(iArr.length)];
            System.arraycopy(this.array, 0, iArr2, 0, this.size);
            this.array = iArr2;
        }
        int[] iArr3 = this.array;
        int i13 = this.size;
        this.size = i13 + 1;
        iArr3[i13] = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    void ensureCapacity(int i11) {
        int[] iArr = this.array;
        if (i11 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.array = new int[Math.max(i11, 10)];
            return;
        }
        int length = iArr.length;
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
        if (!(obj instanceof IntArrayList)) {
            return super.equals(obj);
        }
        IntArrayList intArrayList = (IntArrayList) obj;
        if (this.size != intArrayList.size) {
            return false;
        }
        int[] iArr = intArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.array[i11] != iArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int getInt(int i11) {
        ensureIndexInRange(i11);
        return this.array[i11];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + this.array[i12];
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == intValue) {
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
        int[] iArr = this.array;
        System.arraycopy(iArr, i12, iArr, i11, this.size - i12);
        this.size -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.IntList
    public int setInt(int i11, int i12) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        int[] iArr = this.array;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private IntArrayList(int[] iArr, int i11, boolean z11) {
        super(z11);
        this.array = iArr;
        this.size = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i11) {
        return Integer.valueOf(getInt(i11));
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.e
    /* renamed from: mutableCopyWithCapacity */
    public Internal.e<Integer> mutableCopyWithCapacity2(int i11) {
        if (i11 >= this.size) {
            return new IntArrayList(i11 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i11), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer remove(int i11) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        int[] iArr = this.array;
        int i12 = iArr[i11];
        if (i11 < this.size - 1) {
            System.arraycopy(iArr, i11 + 1, iArr, i11, (r2 - i11) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i12);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Integer set(int i11, Integer num) {
        return Integer.valueOf(setInt(i11, num.intValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i11, Integer num) {
        addInt(i11, num.intValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    IntArrayList(IntArrayList intArrayList, boolean z11) {
        this(r0 == 0 ? EMPTY_ARRAY : Arrays.copyOf(intArrayList.array, r0), intArrayList.size, z11);
        int i11 = intArrayList.size;
    }

    private void addInt(int i11, int i12) {
        int i13;
        ensureIsMutable();
        if (i11 >= 0 && i11 <= (i13 = this.size)) {
            int[] iArr = this.array;
            if (i13 < iArr.length) {
                System.arraycopy(iArr, i11, iArr, i11 + 1, i13 - i11);
            } else {
                int[] iArr2 = new int[growSize(iArr.length)];
                System.arraycopy(this.array, 0, iArr2, 0, i11);
                System.arraycopy(this.array, i11, iArr2, i11 + 1, this.size - i11);
                this.array = iArr2;
            }
            this.array[i11] = i12;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
    }
}
