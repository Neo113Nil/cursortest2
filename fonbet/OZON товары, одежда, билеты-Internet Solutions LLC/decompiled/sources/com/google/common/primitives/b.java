package com.google.common.primitives;

import Bl0.k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends c {

    private static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: a, reason: collision with root package name */
        final int[] f59163a;

        /* renamed from: b, reason: collision with root package name */
        final int f59164b;

        /* renamed from: c, reason: collision with root package name */
        final int f59165c;

        a(int i11, int i12, int[] iArr) {
            this.f59163a = iArr;
            this.f59164b = i11;
            this.f59165c = i12;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return (obj instanceof Integer) && b.a(((Integer) obj).intValue(), this.f59164b, this.f59165c, this.f59163a) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
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
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f59163a[this.f59164b + i11] != aVar.f59163a[aVar.f59164b + i11]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i11) {
            k0.f(i11, size());
            return Integer.valueOf(this.f59163a[this.f59164b + i11]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i11 = 1;
            for (int i12 = this.f59164b; i12 < this.f59165c; i12++) {
                i11 = (i11 * 31) + this.f59163a[i12];
            }
            return i11;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof Integer)) {
                return -1;
            }
            int intValue = ((Integer) obj).intValue();
            int i11 = this.f59165c;
            int[] iArr = this.f59163a;
            int i12 = this.f59164b;
            int a11 = b.a(intValue, i12, i11, iArr);
            if (a11 >= 0) {
                return a11 - i12;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i11;
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i12 = this.f59165c;
                while (true) {
                    i12--;
                    i11 = this.f59164b;
                    if (i12 < i11) {
                        i12 = -1;
                        break;
                    }
                    if (this.f59163a[i12] == intValue) {
                        break;
                    }
                }
                if (i12 >= 0) {
                    return i12 - i11;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i11, Object obj) {
            Integer num = (Integer) obj;
            k0.f(i11, size());
            int i12 = this.f59164b + i11;
            int[] iArr = this.f59163a;
            int i13 = iArr[i12];
            num.getClass();
            iArr[i12] = num.intValue();
            return Integer.valueOf(i13);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f59165c - this.f59164b;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i11, int i12) {
            k0.i(i11, i12, size());
            if (i11 == i12) {
                return Collections.EMPTY_LIST;
            }
            int i13 = this.f59164b;
            return new a(i11 + i13, i13 + i12, this.f59163a);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            int[] iArr = this.f59163a;
            int i11 = this.f59164b;
            sb2.append(iArr[i11]);
            while (true) {
                i11++;
                if (i11 >= this.f59165c) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(iArr[i11]);
            }
        }
    }

    static int a(int i11, int i12, int i13, int[] iArr) {
        while (i12 < i13) {
            if (iArr[i12] == i11) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public static List<Integer> b(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new a(0, iArr.length, iArr);
    }

    public static int c(long j11) {
        int i11 = (int) j11;
        k0.c(j11, "Out of range: %s", ((long) i11) == j11);
        return i11;
    }

    public static int d(byte b11, byte b12, byte b13, byte b14) {
        return (b11 << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    public static int e(long j11) {
        if (j11 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j11 < -2147483648L ? LinearLayoutManager.INVALID_OFFSET : (int) j11;
    }

    public static int[] f(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            a aVar = (a) collection;
            return Arrays.copyOfRange(aVar.f59163a, aVar.f59164b, aVar.f59165c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = array[i11];
            obj.getClass();
            iArr[i11] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Integer g(String str) {
        Long d11 = d.d(str);
        if (d11 == null || d11.longValue() != d11.intValue()) {
            return null;
        }
        return Integer.valueOf(d11.intValue());
    }
}
