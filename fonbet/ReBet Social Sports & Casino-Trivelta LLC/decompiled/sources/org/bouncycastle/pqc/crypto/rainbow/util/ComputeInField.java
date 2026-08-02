package org.bouncycastle.pqc.crypto.rainbow.util;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class ComputeInField {

    /* renamed from: A, reason: collision with root package name */
    private short[][] f62123A;

    /* renamed from: x, reason: collision with root package name */
    short[] f62124x;

    private void computeZerosAbove() {
        for (int length = this.f62123A.length - 1; length > 0; length--) {
            for (int i10 = length - 1; i10 >= 0; i10--) {
                short[][] sArr = this.f62123A;
                short s10 = sArr[i10][length];
                short invElem = GF2Field.invElem(sArr[length][length]);
                if (invElem == 0) {
                    throw new RuntimeException("The matrix is not invertible");
                }
                int i11 = length;
                while (true) {
                    short[][] sArr2 = this.f62123A;
                    if (i11 < sArr2.length * 2) {
                        short multElem = GF2Field.multElem(s10, GF2Field.multElem(sArr2[length][i11], invElem));
                        short[] sArr3 = this.f62123A[i10];
                        sArr3[i11] = GF2Field.addElem(sArr3[i11], multElem);
                        i11++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r0 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void computeZerosUnder(boolean z10) {
        int length = z10 ? this.f62123A.length * 2 : this.f62123A.length + 1;
        int i10 = 0;
        while (i10 < this.f62123A.length - 1) {
            int i11 = i10 + 1;
            int i12 = i11;
            while (true) {
                short[][] sArr = this.f62123A;
                if (i12 < sArr.length) {
                    short s10 = sArr[i12][i10];
                    short invElem = GF2Field.invElem(sArr[i10][i10]);
                    if (invElem == 0) {
                        throw new IllegalStateException("Matrix not invertible! We have to choose another one!");
                    }
                    for (int i13 = i10; i13 < length; i13++) {
                        short multElem = GF2Field.multElem(s10, GF2Field.multElem(this.f62123A[i10][i13], invElem));
                        short[] sArr2 = this.f62123A[i12];
                        sArr2[i13] = GF2Field.addElem(sArr2[i13], multElem);
                    }
                    i12++;
                }
            }
        }
    }

    private void substitute() {
        short invElem = GF2Field.invElem(this.f62123A[r0.length - 1][r0.length - 1]);
        if (invElem == 0) {
            throw new IllegalStateException("The equation system is not solvable");
        }
        short[] sArr = this.f62124x;
        short[][] sArr2 = this.f62123A;
        sArr[sArr2.length - 1] = GF2Field.multElem(sArr2[sArr2.length - 1][sArr2.length], invElem);
        for (int length = this.f62123A.length - 2; length >= 0; length--) {
            short[][] sArr3 = this.f62123A;
            short s10 = sArr3[length][sArr3.length];
            for (int length2 = sArr3.length - 1; length2 > length; length2--) {
                s10 = GF2Field.addElem(s10, GF2Field.multElem(this.f62123A[length][length2], this.f62124x[length2]));
            }
            short invElem2 = GF2Field.invElem(this.f62123A[length][length]);
            if (invElem2 == 0) {
                throw new IllegalStateException("Not solvable equation system");
            }
            this.f62124x[length] = GF2Field.multElem(s10, invElem2);
        }
    }

    public short[][] addSquareMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length || sArr[0].length != sArr2[0].length) {
            throw new RuntimeException("Addition is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.addElem(sArr[i10][i11], sArr2[i10][i11]);
            }
        }
        return sArr3;
    }

    public short[] addVect(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        int length = sArr.length;
        short[] sArr3 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr3[i10] = GF2Field.addElem(sArr[i10], sArr2[i10]);
        }
        return sArr3;
    }

    public short[][] inverse(short[][] sArr) {
        Class cls = Short.TYPE;
        try {
            int i10 = 0;
            this.f62123A = (short[][]) Array.newInstance((Class<?>) cls, sArr.length, sArr.length * 2);
            if (sArr.length != sArr[0].length) {
                throw new RuntimeException("The matrix is not invertible. Please choose another one!");
            }
            for (int i11 = 0; i11 < sArr.length; i11++) {
                for (int i12 = 0; i12 < sArr.length; i12++) {
                    this.f62123A[i11][i12] = sArr[i11][i12];
                }
                for (int length = sArr.length; length < sArr.length * 2; length++) {
                    this.f62123A[i11][length] = 0;
                }
                short[][] sArr2 = this.f62123A;
                sArr2[i11][sArr2.length + i11] = 1;
            }
            computeZerosUnder(true);
            int i13 = 0;
            while (true) {
                short[][] sArr3 = this.f62123A;
                if (i13 >= sArr3.length) {
                    break;
                }
                short invElem = GF2Field.invElem(sArr3[i13][i13]);
                int i14 = i13;
                while (true) {
                    short[][] sArr4 = this.f62123A;
                    if (i14 < sArr4.length * 2) {
                        short[] sArr5 = sArr4[i13];
                        sArr5[i14] = GF2Field.multElem(sArr5[i14], invElem);
                        i14++;
                    }
                }
                i13++;
            }
            computeZerosAbove();
            short[][] sArr6 = this.f62123A;
            short[][] sArr7 = (short[][]) Array.newInstance((Class<?>) cls, sArr6.length, sArr6.length);
            while (true) {
                short[][] sArr8 = this.f62123A;
                if (i10 >= sArr8.length) {
                    return sArr7;
                }
                int length2 = sArr8.length;
                while (true) {
                    short[][] sArr9 = this.f62123A;
                    if (length2 < sArr9.length * 2) {
                        sArr7[i10][length2 - sArr9.length] = sArr9[i10][length2];
                        length2++;
                    }
                }
                i10++;
            }
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multMatrix(short s10, short[][] sArr) {
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr[0].length; i11++) {
                sArr2[i10][i11] = GF2Field.multElem(s10, sArr[i10][i11]);
            }
        }
        return sArr2;
    }

    public short[] multVect(short s10, short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        for (int i10 = 0; i10 < length; i10++) {
            sArr2[i10] = GF2Field.multElem(s10, sArr[i10]);
        }
        return sArr2;
    }

    public short[][] multVects(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2.length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10][i11] = GF2Field.multElem(sArr[i10], sArr2[i11]);
            }
        }
        return sArr3;
    }

    public short[] multiplyMatrix(short[][] sArr, short[] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        short[] sArr3 = new short[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                sArr3[i10] = GF2Field.addElem(sArr3[i10], GF2Field.multElem(sArr[i10][i11], sArr2[i11]));
            }
        }
        return sArr3;
    }

    public short[] solveEquation(short[][] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return null;
        }
        try {
            this.f62123A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr.length + 1);
            this.f62124x = new short[sArr.length];
            for (int i10 = 0; i10 < sArr.length; i10++) {
                for (int i11 = 0; i11 < sArr[0].length; i11++) {
                    this.f62123A[i10][i11] = sArr[i10][i11];
                }
            }
            for (int i12 = 0; i12 < sArr2.length; i12++) {
                short[] sArr3 = this.f62123A[i12];
                sArr3[sArr2.length] = GF2Field.addElem(sArr2[i12], sArr3[sArr2.length]);
            }
            computeZerosUnder(false);
            substitute();
            return this.f62124x;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public short[][] multiplyMatrix(short[][] sArr, short[][] sArr2) {
        if (sArr[0].length != sArr2.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        this.f62123A = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr.length, sArr2[0].length);
        for (int i10 = 0; i10 < sArr.length; i10++) {
            for (int i11 = 0; i11 < sArr2.length; i11++) {
                for (int i12 = 0; i12 < sArr2[0].length; i12++) {
                    short multElem = GF2Field.multElem(sArr[i10][i11], sArr2[i11][i12]);
                    short[] sArr3 = this.f62123A[i10];
                    sArr3[i12] = GF2Field.addElem(sArr3[i12], multElem);
                }
            }
        }
        return this.f62123A;
    }
}
