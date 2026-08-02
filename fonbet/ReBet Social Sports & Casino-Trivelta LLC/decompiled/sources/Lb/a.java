package Lb;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public int f7106a;
    private int[] bits;

    public a() {
        this.f7106a = 0;
        this.bits = new int[1];
    }

    public static int[] i(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        e(this.f7106a + 1);
        if (z10) {
            int[] iArr = this.bits;
            int i10 = this.f7106a;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f7106a++;
    }

    public void b(a aVar) {
        int i10 = aVar.f7106a;
        e(this.f7106a + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.f(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        e(this.f7106a + i11);
        while (i11 > 0) {
            boolean z10 = true;
            if (((i10 >> (i11 - 1)) & 1) != 1) {
                z10 = false;
            }
            a(z10);
            i11--;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.bits.clone(), this.f7106a);
    }

    public final void e(int i10) {
        if (i10 > (this.bits.length << 5)) {
            int[] i11 = i(i10);
            int[] iArr = this.bits;
            System.arraycopy(iArr, 0, i11, 0, iArr.length);
            this.bits = i11;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7106a == aVar.f7106a && Arrays.equals(this.bits, aVar.bits);
    }

    public boolean f(int i10) {
        return ((1 << (i10 & 31)) & this.bits[i10 / 32]) != 0;
    }

    public int g() {
        return this.f7106a;
    }

    public int h() {
        return (this.f7106a + 7) / 8;
    }

    public int hashCode() {
        return (this.f7106a * 31) + Arrays.hashCode(this.bits);
    }

    public void j(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (f(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void k(a aVar) {
        if (this.f7106a != aVar.f7106a) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.bits;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.bits[i10];
            i10++;
        }
    }

    public String toString() {
        int i10 = this.f7106a;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f7106a; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(f(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public a(int[] iArr, int i10) {
        this.bits = iArr;
        this.f7106a = i10;
    }
}
