package zj;

import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class d extends m {

    /* renamed from: v, reason: collision with root package name */
    private int[] f69224v;

    public d(int i10) {
        if (i10 < 0) {
            throw new ArithmeticException("Negative length.");
        }
        this.f69230a = i10;
        this.f69224v = new int[(i10 + 31) >> 5];
    }

    public static d b(int i10, byte[] bArr) {
        if (i10 < 0) {
            throw new ArithmeticException("negative length");
        }
        if (bArr.length <= ((i10 + 7) >> 3)) {
            return new d(i10, h.f(bArr));
        }
        throw new ArithmeticException("length mismatch");
    }

    public byte[] c() {
        return h.e(this.f69224v, (this.f69230a + 7) >> 3);
    }

    public int d() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f69224v;
            if (i10 >= iArr.length) {
                return i11;
            }
            int i12 = iArr[i10];
            for (int i13 = 0; i13 < 32; i13++) {
                if ((i12 & 1) != 0) {
                    i11++;
                }
                i12 >>>= 1;
            }
            i10++;
        }
    }

    public int[] e() {
        return this.f69224v;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f69230a == dVar.f69230a && f.b(this.f69224v, dVar.f69224v);
    }

    public void f(int i10) {
        if (i10 >= this.f69230a) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f69224v;
        int i11 = i10 >> 5;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public int hashCode() {
        return (this.f69230a * 31) + this.f69224v.hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.f69230a; i10++) {
            if (i10 != 0 && (i10 & 31) == 0) {
                stringBuffer.append(' ');
            }
            if ((this.f69224v[i10 >> 5] & (1 << (i10 & 31))) == 0) {
                stringBuffer.append('0');
            } else {
                stringBuffer.append('1');
            }
        }
        return stringBuffer.toString();
    }

    public d(int i10, SecureRandom secureRandom) {
        this.f69230a = i10;
        int i11 = (i10 + 31) >> 5;
        this.f69224v = new int[i11];
        int i12 = i11 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            this.f69224v[i13] = secureRandom.nextInt();
        }
        int i14 = i10 & 31;
        if (i14 != 0) {
            int[] iArr = this.f69224v;
            iArr[i12] = ((1 << i14) - 1) & iArr[i12];
        }
    }

    public d(int i10, int i11, SecureRandom secureRandom) {
        if (i11 <= i10) {
            this.f69230a = i10;
            this.f69224v = new int[(i10 + 31) >> 5];
            int[] iArr = new int[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
            for (int i13 = 0; i13 < i11; i13++) {
                int a10 = l.a(secureRandom, i10);
                f(iArr[a10]);
                i10--;
                iArr[a10] = iArr[i10];
            }
            return;
        }
        throw new ArithmeticException("The hamming weight is greater than the length of vector.");
    }

    public d(int i10, int[] iArr) {
        if (i10 >= 0) {
            this.f69230a = i10;
            int i11 = (i10 + 31) >> 5;
            if (iArr.length == i11) {
                int[] a10 = f.a(iArr);
                this.f69224v = a10;
                int i12 = i10 & 31;
                if (i12 != 0) {
                    int i13 = i11 - 1;
                    a10[i13] = ((1 << i12) - 1) & a10[i13];
                    return;
                }
                return;
            }
            throw new ArithmeticException("length mismatch");
        }
        throw new ArithmeticException("negative length");
    }
}
