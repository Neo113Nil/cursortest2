package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes9.dex */
final class FloatArrayList extends AbstractProtobufList<Float> implements Internal.FloatList, RandomAccess, F {
    private static final float[] EMPTY_ARRAY;
    private static final FloatArrayList EMPTY_LIST;
    private float[] array;
    private int size;

    static {
        float[] fArr = new float[0];
        EMPTY_ARRAY = fArr;
        EMPTY_LIST = new FloatArrayList(fArr, 0, false);
    }

    FloatArrayList() {
        this(EMPTY_ARRAY, 0, true);
    }

    public static FloatArrayList emptyList() {
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
    public boolean addAll(Collection<? extends Float> collection) {
        ensureIsMutable();
        byte[] bArr = Internal.f60126b;
        collection.getClass();
        if (!(collection instanceof FloatArrayList)) {
            return super.addAll(collection);
        }
        FloatArrayList floatArrayList = (FloatArrayList) collection;
        int i11 = floatArrayList.size;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.size;
        if (Integer.MAX_VALUE - i12 < i11) {
            throw new OutOfMemoryError();
        }
        int i13 = i12 + i11;
        float[] fArr = this.array;
        if (i13 > fArr.length) {
            this.array = Arrays.copyOf(fArr, i13);
        }
        System.arraycopy(floatArrayList.array, 0, this.array, this.size, floatArrayList.size);
        this.size = i13;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public void addFloat(float f7) {
        ensureIsMutable();
        int i11 = this.size;
        float[] fArr = this.array;
        if (i11 == fArr.length) {
            float[] fArr2 = new float[growSize(fArr.length)];
            System.arraycopy(this.array, 0, fArr2, 0, this.size);
            this.array = fArr2;
        }
        float[] fArr3 = this.array;
        int i12 = this.size;
        this.size = i12 + 1;
        fArr3[i12] = f7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    void ensureCapacity(int i11) {
        float[] fArr = this.array;
        if (i11 <= fArr.length) {
            return;
        }
        if (fArr.length == 0) {
            this.array = new float[Math.max(i11, 10)];
            return;
        }
        int length = fArr.length;
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
        if (!(obj instanceof FloatArrayList)) {
            return super.equals(obj);
        }
        FloatArrayList floatArrayList = (FloatArrayList) obj;
        if (this.size != floatArrayList.size) {
            return false;
        }
        float[] fArr = floatArrayList.array;
        for (int i11 = 0; i11 < this.size; i11++) {
            if (Float.floatToIntBits(this.array[i11]) != Float.floatToIntBits(fArr[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float getFloat(int i11) {
        ensureIndexInRange(i11);
        return this.array[i11];
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i11 = 1;
        for (int i12 = 0; i12 < this.size; i12++) {
            i11 = (i11 * 31) + Float.floatToIntBits(this.array[i12]);
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.array[i11] == floatValue) {
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
        float[] fArr = this.array;
        System.arraycopy(fArr, i12, fArr, i11, this.size - i12);
        this.size -= i12 - i11;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public float setFloat(int i11, float f7) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        float[] fArr = this.array;
        float f11 = fArr[i11];
        fArr[i11] = f7;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.size;
    }

    private FloatArrayList(float[] fArr, int i11, boolean z11) {
        super(z11);
        this.array = fArr;
        this.size = i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i11) {
        return Float.valueOf(getFloat(i11));
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.e
    /* renamed from: mutableCopyWithCapacity */
    public Internal.e<Float> mutableCopyWithCapacity2(int i11) {
        if (i11 >= this.size) {
            return new FloatArrayList(i11 == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.array, i11), this.size, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float remove(int i11) {
        ensureIsMutable();
        ensureIndexInRange(i11);
        float[] fArr = this.array;
        float f7 = fArr[i11];
        if (i11 < this.size - 1) {
            System.arraycopy(fArr, i11 + 1, fArr, i11, (r2 - i11) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f7);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public Float set(int i11, Float f7) {
        return Float.valueOf(setFloat(i11, f7.floatValue()));
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f7) {
        addFloat(f7.floatValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int i11, Float f7) {
        addFloat(i11, f7.floatValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    FloatArrayList(FloatArrayList floatArrayList, boolean z11) {
        this(r0 == 0 ? EMPTY_ARRAY : Arrays.copyOf(floatArrayList.array, r0), floatArrayList.size, z11);
        int i11 = floatArrayList.size;
    }

    private void addFloat(int i11, float f7) {
        int i12;
        ensureIsMutable();
        if (i11 >= 0 && i11 <= (i12 = this.size)) {
            float[] fArr = this.array;
            if (i12 < fArr.length) {
                System.arraycopy(fArr, i11, fArr, i11 + 1, i12 - i11);
            } else {
                float[] fArr2 = new float[growSize(fArr.length)];
                System.arraycopy(this.array, 0, fArr2, 0, i11);
                System.arraycopy(this.array, i11, fArr2, i11 + 1, this.size - i11);
                this.array = fArr2;
            }
            this.array[i11] = f7;
            this.size++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i11));
    }
}
