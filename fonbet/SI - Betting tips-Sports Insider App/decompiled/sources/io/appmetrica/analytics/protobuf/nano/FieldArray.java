package io.appmetrica.analytics.protobuf.nano;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class FieldArray implements Cloneable {
    private static final FieldData DELETED = new FieldData();
    private FieldData[] mData;
    private int[] mFieldNumbers;
    private boolean mGarbage;
    private int mSize;

    public FieldArray() {
        this(10);
    }

    private boolean arrayEquals(int[] iArr, int[] iArr2, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    private int binarySearch(int i5) {
        int i10 = this.mSize - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = this.mFieldNumbers[i12];
            if (i13 < i5) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i5) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return ~i11;
    }

    private void gc() {
        int i5 = this.mSize;
        int[] iArr = this.mFieldNumbers;
        FieldData[] fieldDataArr = this.mData;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            FieldData fieldData = fieldDataArr[i11];
            if (fieldData != DELETED) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    fieldDataArr[i10] = fieldData;
                    fieldDataArr[i11] = null;
                }
                i10++;
            }
        }
        this.mGarbage = false;
        this.mSize = i10;
    }

    private int idealByteArraySize(int i5) {
        for (int i10 = 4; i10 < 32; i10++) {
            int i11 = (1 << i10) - 12;
            if (i5 <= i11) {
                return i11;
            }
        }
        return i5;
    }

    private int idealIntArraySize(int i5) {
        return idealByteArraySize(i5 * 4) / 4;
    }

    public FieldData dataAt(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return this.mData[i5];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldArray)) {
            return false;
        }
        FieldArray fieldArray = (FieldArray) obj;
        return size() == fieldArray.size() && arrayEquals(this.mFieldNumbers, fieldArray.mFieldNumbers, this.mSize) && arrayEquals(this.mData, fieldArray.mData, this.mSize);
    }

    public FieldData get(int i5) {
        FieldData fieldData;
        int binarySearch = binarySearch(i5);
        if (binarySearch < 0 || (fieldData = this.mData[binarySearch]) == DELETED) {
            return null;
        }
        return fieldData;
    }

    public int hashCode() {
        if (this.mGarbage) {
            gc();
        }
        int i5 = 17;
        for (int i10 = 0; i10 < this.mSize; i10++) {
            i5 = (((i5 * 31) + this.mFieldNumbers[i10]) * 31) + this.mData[i10].hashCode();
        }
        return i5;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void put(int i5, FieldData fieldData) {
        int binarySearch = binarySearch(i5);
        if (binarySearch >= 0) {
            this.mData[binarySearch] = fieldData;
            return;
        }
        int i10 = ~binarySearch;
        int i11 = this.mSize;
        if (i10 < i11) {
            FieldData[] fieldDataArr = this.mData;
            if (fieldDataArr[i10] == DELETED) {
                this.mFieldNumbers[i10] = i5;
                fieldDataArr[i10] = fieldData;
                return;
            }
        }
        if (this.mGarbage && i11 >= this.mFieldNumbers.length) {
            gc();
            i10 = ~binarySearch(i5);
        }
        int i12 = this.mSize;
        if (i12 >= this.mFieldNumbers.length) {
            int idealIntArraySize = idealIntArraySize(i12 + 1);
            int[] iArr = new int[idealIntArraySize];
            FieldData[] fieldDataArr2 = new FieldData[idealIntArraySize];
            int[] iArr2 = this.mFieldNumbers;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            FieldData[] fieldDataArr3 = this.mData;
            System.arraycopy(fieldDataArr3, 0, fieldDataArr2, 0, fieldDataArr3.length);
            this.mFieldNumbers = iArr;
            this.mData = fieldDataArr2;
        }
        int i13 = this.mSize - i10;
        if (i13 != 0) {
            int[] iArr3 = this.mFieldNumbers;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13);
            FieldData[] fieldDataArr4 = this.mData;
            System.arraycopy(fieldDataArr4, i10, fieldDataArr4, i14, this.mSize - i10);
        }
        this.mFieldNumbers[i10] = i5;
        this.mData[i10] = fieldData;
        this.mSize++;
    }

    public void remove(int i5) {
        int binarySearch = binarySearch(i5);
        if (binarySearch >= 0) {
            FieldData[] fieldDataArr = this.mData;
            FieldData fieldData = fieldDataArr[binarySearch];
            FieldData fieldData2 = DELETED;
            if (fieldData != fieldData2) {
                fieldDataArr[binarySearch] = fieldData2;
                this.mGarbage = true;
            }
        }
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public FieldArray(int i5) {
        this.mGarbage = false;
        int idealIntArraySize = idealIntArraySize(i5);
        this.mFieldNumbers = new int[idealIntArraySize];
        this.mData = new FieldData[idealIntArraySize];
        this.mSize = 0;
    }

    private boolean arrayEquals(FieldData[] fieldDataArr, FieldData[] fieldDataArr2, int i5) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (!fieldDataArr[i10].equals(fieldDataArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final FieldArray m101clone() {
        int size = size();
        FieldArray fieldArray = new FieldArray(size);
        System.arraycopy(this.mFieldNumbers, 0, fieldArray.mFieldNumbers, 0, size);
        for (int i5 = 0; i5 < size; i5++) {
            FieldData fieldData = this.mData[i5];
            if (fieldData != null) {
                fieldArray.mData[i5] = fieldData.m102clone();
            }
        }
        fieldArray.mSize = size;
        return fieldArray;
    }
}
