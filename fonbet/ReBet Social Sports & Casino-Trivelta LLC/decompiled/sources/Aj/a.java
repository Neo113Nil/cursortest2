package Aj;

import com.plaid.internal.EnumC3631g;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: Aj.a$a, reason: collision with other inner class name */
    public static class C0011a implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f482a = 0;
        private final Object[] dataArray;

        public C0011a(Object[] objArr) {
            this.dataArray = objArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f482a < this.dataArray.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f482a;
            Object[] objArr = this.dataArray;
            if (i10 != objArr.length) {
                this.f482a = i10 + 1;
                return objArr[i10];
            }
            throw new NoSuchElementException("Out of elements: " + this.f482a);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != bArr.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(char[] cArr, char[] cArr2) {
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != cArr.length; i10++) {
            if (cArr[i10] != cArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 != iArr.length; i10++) {
            if (iArr[i10] != iArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return d(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    public static char[] f(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static int[] g(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static long[] h(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static long[] i(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return h(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static byte[] j(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr2 != null ? d(bArr2) : d(bArr);
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean k(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    public static byte[] l(byte[] bArr, int i10, int i11) {
        int p10 = p(i10, i11);
        byte[] bArr2 = new byte[p10];
        if (bArr.length - i10 < p10) {
            System.arraycopy(bArr, i10, bArr2, 0, bArr.length - i10);
            return bArr2;
        }
        System.arraycopy(bArr, i10, bArr2, 0, p10);
        return bArr2;
    }

    public static void m(byte[] bArr, byte b10) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr[i10] = b10;
        }
    }

    public static void n(long[] jArr, long j10) {
        for (int i10 = 0; i10 < jArr.length; i10++) {
            jArr[i10] = j10;
        }
    }

    public static void o(short[] sArr, short s10) {
        for (int i10 = 0; i10 < sArr.length; i10++) {
            sArr[i10] = s10;
        }
    }

    public static int p(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0) {
            return i12;
        }
        StringBuffer stringBuffer = new StringBuffer(i10);
        stringBuffer.append(" > ");
        stringBuffer.append(i11);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int q(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ bArr[length];
        }
    }

    public static int r(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ cArr[length];
        }
    }

    public static int s(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 = (i10 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ iArr[length];
        }
    }

    public static int t(int[] iArr, int i10, int i11) {
        if (iArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            i12 = (i12 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ iArr[i10 + i11];
        }
    }

    public static int u(long[] jArr, int i10, int i11) {
        if (jArr == null) {
            return 0;
        }
        int i12 = i11 + 1;
        while (true) {
            i11--;
            if (i11 < 0) {
                return i12;
            }
            long j10 = jArr[i10 + i11];
            i12 = (((i12 * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ ((int) j10)) * EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE) ^ ((int) (j10 >>> 32));
        }
    }
}
