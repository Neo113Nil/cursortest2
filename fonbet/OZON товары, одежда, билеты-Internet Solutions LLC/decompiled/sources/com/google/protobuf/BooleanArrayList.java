package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements Internal.BooleanList, RandomAccess, F {
    private static final boolean[] EMPTY_ARRAY;
    private static final BooleanArrayList EMPTY_LIST;
    private boolean[] array;
    private int size;

    static {
        boolean[] zArr = new boolean[0];
        EMPTY_ARRAY = zArr;
        EMPTY_LIST = new BooleanArrayList(zArr, 0, false);
    }

    BooleanArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    public static BooleanArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        byte[] bArr = Internal.f60126b;
        collection.getClass();
        if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
        int i11 = booleanArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        boolean[] zArr = this.array;
        if (i13 > zArr.length) {
            this.array = Arrays.copyOf(zArr, i13);
        }
        System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public void addBoolean(boolean z11) {
        ensureIsMutable();
        int i11 = this.size;
        boolean[] zArr = this.array;
        if (i11 == zArr.length) {
            boolean[] zArr2 = new boolean[growSize(zArr.length)];
            System.arraycopy(this.array, 0, zArr2, 0, this.size);
            this.array = zArr2;
        }
        boolean[] zArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        zArr3[i12] = z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    void ensureCapacity(int i11) {
        boolean[] zArr = this.array;
        if (i11 <= zArr.length) {
            return;
        }
        if (zArr.length == 0) {
            this.array = new boolean[Math.max(i11, 10)];
            return;
        }
        int length = zArr.length;
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
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (this.array[i11] != zArr[i11]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean getBoolean(int i11) {
        ensureIndexInRange(i11);
        return this.array[i11];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            int i13 = i11 * 31;
            boolean z11 = this.array[i12];
            byte[] bArr = Internal.f60126b;
            i11 = i13 + (z11 ? 1231 : 1237);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == booleanValue) {
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
        boolean[] zArr = this.array;
        System.arraycopy(zArr, i12, zArr, i11, this.size - i12);
        this.size -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public boolean setBoolean(int i11, boolean z11) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        boolean[] zArr = this.array;
        boolean z12 = zArr[i11];
        zArr[i11] = z11;
        return z12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private BooleanArrayList(boolean[] zArr, int i11, boolean z11) {
        super(z11);
        this.array = zArr;
        this.size = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public Boolean get(int i11) {
        return Boolean.valueOf(getBoolean(i11));
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.e
    /* renamed from: mutableCopyWithCapacity */
    public Internal.e<Boolean> mutableCopyWithCapacity2(int i11) {
        if (i11 >= this.size) {
            return new BooleanArrayList(i11 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i11), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean remove(int i11) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        boolean[] zArr = this.array;
        boolean z11 = zArr[i11];
        if (i11 < this.size - 1) {
            System.arraycopy(zArr, i11 + 1, zArr, i11, (r2 - i11) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z11);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Boolean set(int i11, Boolean bool) {
        return Boolean.valueOf(setBoolean(i11, bool.booleanValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i11, Boolean bool) {
        addBoolean(i11, bool.booleanValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    BooleanArrayList(BooleanArrayList booleanArrayList, boolean z11) {
        this(r0 == 0 ? EMPTY_ARRAY : Arrays.copyOf(booleanArrayList.array, r0), booleanArrayList.size, z11);
        int i11 = booleanArrayList.size;
    }

    private void addBoolean(int i11, boolean z11) {
        int i12;
        ensureIsMutable();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            boolean[] zArr = this.array;
            if (i12 < zArr.length) {
                System.arraycopy(zArr, i11, zArr, i11 + 1, i12 - i11);
            } else {
                boolean[] zArr2 = new boolean[growSize(zArr.length)];
                System.arraycopy(this.array, 0, zArr2, 0, i11);
                System.arraycopy(this.array, i11, zArr2, i11 + 1, this.size - i11);
                this.array = zArr2;
            }
            this.array[i11] = z11;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
    }
}
