package com.google.common.primitives;

import Ra.n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.UByte;

/* loaded from: classes3.dex */
public abstract class f extends g {

    public static class a extends AbstractList implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f36879a;
        final int[] array;

        /* renamed from: b, reason: collision with root package name */
        public final int f36880b;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            n.i(i10, size());
            return Integer.valueOf(this.array[this.f36879a + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            n.i(i10, size());
            int[] iArr = this.array;
            int i11 = this.f36879a;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) n.k(num)).intValue();
            return Integer.valueOf(i12);
        }

        public int[] c() {
            return Arrays.copyOfRange(this.array, this.f36879a, this.f36880b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && f.l(this.array, ((Integer) obj).intValue(), this.f36879a, this.f36880b) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.array[this.f36879a + i10] != aVar.array[aVar.f36879a + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f36879a; i11 < this.f36880b; i11++) {
                i10 = (i10 * 31) + f.j(this.array[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int l10;
            if (!(obj instanceof Integer) || (l10 = f.l(this.array, ((Integer) obj).intValue(), this.f36879a, this.f36880b)) < 0) {
                return -1;
            }
            return l10 - this.f36879a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m10;
            if (!(obj instanceof Integer) || (m10 = f.m(this.array, ((Integer) obj).intValue(), this.f36879a, this.f36880b)) < 0) {
                return -1;
            }
            return m10 - this.f36879a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36880b - this.f36879a;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            n.o(i10, i11, size());
            if (i10 == i11) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = this.array;
            int i12 = this.f36879a;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.array[this.f36879a]);
            int i10 = this.f36879a;
            while (true) {
                i10++;
                if (i10 >= this.f36880b) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.array[i10]);
            }
        }

        public a(int[] iArr, int i10, int i11) {
            this.array = iArr;
            this.f36879a = i10;
            this.f36880b = i11;
        }
    }

    public static List c(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        n.g(j10 == ((long) i10), "the total number of elements (%s) in the arrays must fit in an int", j10);
        return i10;
    }

    public static int e(long j10) {
        int i10 = (int) j10;
        n.g(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int[] f(int[]... iArr) {
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int[] iArr3 = new int[d(j10)];
        int i10 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i10, iArr4.length);
            i10 += iArr4.length;
        }
        return iArr3;
    }

    public static int g(int i10, int i11, int i12) {
        n.f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int h(byte[] bArr) {
        n.f(bArr.length >= 4, "array too small: %s < %s", bArr.length, 4);
        return i(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int i(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & UByte.MAX_VALUE) << 16) | ((b12 & UByte.MAX_VALUE) << 8) | (b13 & UByte.MAX_VALUE);
    }

    public static int j(int i10) {
        return i10;
    }

    public static int k(int[] iArr, int i10) {
        return l(iArr, i10, 0, iArr.length);
    }

    public static int l(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int m(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int n(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    public static int[] o(Collection collection) {
        if (collection instanceof a) {
            return ((a) collection).c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) n.k(array[i10])).intValue();
        }
        return iArr;
    }

    public static Integer p(String str) {
        return q(str, 10);
    }

    public static Integer q(String str, int i10) {
        Long e10 = h.e(str, i10);
        if (e10 == null || e10.longValue() != e10.intValue()) {
            return null;
        }
        return Integer.valueOf(e10.intValue());
    }
}
