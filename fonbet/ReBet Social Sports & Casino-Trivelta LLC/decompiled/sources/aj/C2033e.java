package aj;

import Aj.f;
import java.lang.reflect.Array;

/* renamed from: aj.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2033e implements InterfaceC2030b {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f16265H;

    /* renamed from: a, reason: collision with root package name */
    public int[][][] f16266a;

    @Override // aj.InterfaceC2030b
    public void init(byte[] bArr) {
        int i10 = 0;
        if (this.f16266a == null) {
            this.f16266a = (int[][][]) Array.newInstance((Class<?>) Integer.TYPE, 32, 16, 4);
        } else if (Aj.a.a(this.f16265H, bArr)) {
            return;
        }
        this.f16265H = Aj.a.d(bArr);
        AbstractC2031c.b(bArr, this.f16266a[1][8]);
        for (int i11 = 4; i11 >= 1; i11 >>= 1) {
            int[][] iArr = this.f16266a[1];
            AbstractC2031c.g(iArr[i11 + i11], iArr[i11]);
        }
        int[][][] iArr2 = this.f16266a;
        AbstractC2031c.g(iArr2[1][1], iArr2[0][8]);
        for (int i12 = 4; i12 >= 1; i12 >>= 1) {
            int[][] iArr3 = this.f16266a[0];
            AbstractC2031c.g(iArr3[i12 + i12], iArr3[i12]);
        }
        while (true) {
            for (int i13 = 2; i13 < 16; i13 += i13) {
                for (int i14 = 1; i14 < i13; i14++) {
                    int[][] iArr4 = this.f16266a[i10];
                    AbstractC2031c.n(iArr4[i13], iArr4[i14], iArr4[i13 + i14]);
                }
            }
            int i15 = i10 + 1;
            if (i15 == 32) {
                return;
            }
            if (i15 > 1) {
                for (int i16 = 8; i16 > 0; i16 >>= 1) {
                    int[][][] iArr5 = this.f16266a;
                    AbstractC2031c.h(iArr5[i10 - 1][i16], iArr5[i15][i16]);
                }
            }
            i10 = i15;
        }
    }

    @Override // aj.InterfaceC2030b
    public void multiplyH(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i10 = 15; i10 >= 0; i10--) {
            int[][][] iArr2 = this.f16266a;
            int i11 = i10 + i10;
            int[][] iArr3 = iArr2[i11];
            byte b10 = bArr[i10];
            int[] iArr4 = iArr3[b10 & 15];
            int i12 = iArr[0] ^ iArr4[0];
            iArr[0] = i12;
            int i13 = iArr[1] ^ iArr4[1];
            iArr[1] = i13;
            int i14 = iArr[2] ^ iArr4[2];
            iArr[2] = i14;
            int i15 = iArr[3] ^ iArr4[3];
            iArr[3] = i15;
            int[] iArr5 = iArr2[i11 + 1][(b10 & 240) >>> 4];
            iArr[0] = iArr5[0] ^ i12;
            iArr[1] = iArr5[1] ^ i13;
            iArr[2] = iArr5[2] ^ i14;
            iArr[3] = iArr5[3] ^ i15;
        }
        f.e(iArr, bArr, 0);
    }
}
