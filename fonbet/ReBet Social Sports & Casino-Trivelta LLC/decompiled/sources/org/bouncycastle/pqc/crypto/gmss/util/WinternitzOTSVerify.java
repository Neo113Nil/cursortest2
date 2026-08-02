package org.bouncycastle.pqc.crypto.gmss.util;

import kotlin.UByte;
import org.bouncycastle.crypto.Digest;

/* loaded from: classes5.dex */
public class WinternitzOTSVerify {
    private int mdsize;
    private Digest messDigestOTS;

    /* renamed from: w, reason: collision with root package name */
    private int f62045w;

    public WinternitzOTSVerify(Digest digest, int i10) {
        this.f62045w = i10;
        this.messDigestOTS = digest;
        this.mdsize = digest.getDigestSize();
    }

    private void hashSignatureBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 < 1) {
            System.arraycopy(bArr, i10, bArr2, i12, this.mdsize);
            return;
        }
        this.messDigestOTS.update(bArr, i10, this.mdsize);
        while (true) {
            this.messDigestOTS.doFinal(bArr2, i12);
            i11--;
            if (i11 <= 0) {
                return;
            } else {
                this.messDigestOTS.update(bArr2, i12, this.mdsize);
            }
        }
    }

    public byte[] Verify(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = this.mdsize;
        byte[] bArr3 = new byte[i14];
        int i15 = 0;
        this.messDigestOTS.update(bArr, 0, bArr.length);
        this.messDigestOTS.doFinal(bArr3, 0);
        int i16 = this.mdsize << 3;
        int i17 = this.f62045w;
        int i18 = (i16 + (i17 - 1)) / i17;
        boolean z10 = true;
        int log = getLog((i18 << i17) + 1);
        int i19 = this.f62045w;
        int i20 = this.mdsize;
        int i21 = i20 * ((((log + i19) - 1) / i19) + i18);
        if (i21 != bArr2.length) {
            return null;
        }
        byte[] bArr4 = new byte[i21];
        char c10 = '\b';
        if (8 % i19 == 0) {
            int i22 = 8 / i19;
            int i23 = (1 << i19) - 1;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < i14) {
                int i27 = i25;
                int i28 = 0;
                while (i28 < i22) {
                    int i29 = bArr3[i26] & i23;
                    int i30 = i24 + i29;
                    int i31 = this.mdsize;
                    hashSignatureBlock(bArr2, i27 * i31, i23 - i29, bArr4, i31 * i27);
                    bArr3[i26] = (byte) (bArr3[i26] >>> this.f62045w);
                    i27++;
                    i28++;
                    i24 = i30;
                }
                i26++;
                i25 = i27;
            }
            int i32 = (i18 << this.f62045w) - i24;
            int i33 = i25;
            int i34 = 0;
            while (i34 < log) {
                int i35 = this.mdsize;
                hashSignatureBlock(bArr2, i33 * i35, i23 - (i32 & i23), bArr4, i33 * i35);
                int i36 = this.f62045w;
                i32 >>>= i36;
                i33++;
                i34 += i36;
            }
        } else if (i19 < 8) {
            int i37 = i20 / i19;
            int i38 = (1 << i19) - 1;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            while (i39 < i37) {
                int i43 = i40;
                boolean z11 = z10;
                long j10 = 0;
                for (int i44 = 0; i44 < this.f62045w; i44++) {
                    j10 ^= (bArr3[i43] & UByte.MAX_VALUE) << (i44 << 3);
                    i43++;
                }
                int i45 = 0;
                while (i45 < 8) {
                    int i46 = (int) (j10 & i38);
                    int i47 = i41 + i46;
                    int i48 = this.mdsize;
                    hashSignatureBlock(bArr2, i42 * i48, i38 - i46, bArr4, i48 * i42);
                    j10 >>>= this.f62045w;
                    i42++;
                    i45++;
                    i41 = i47;
                    i38 = i38;
                    i39 = i39;
                }
                i39++;
                z10 = z11;
                i40 = i43;
            }
            int i49 = i38;
            int i50 = this.mdsize % this.f62045w;
            long j11 = 0;
            for (int i51 = 0; i51 < i50; i51++) {
                j11 ^= (bArr3[i40] & UByte.MAX_VALUE) << (i51 << 3);
                i40++;
            }
            int i52 = i50 << 3;
            int i53 = 0;
            while (i53 < i52) {
                int i54 = (int) (j11 & i49);
                int i55 = i41 + i54;
                int i56 = this.mdsize;
                hashSignatureBlock(bArr2, i42 * i56, i49 - i54, bArr4, i42 * i56);
                int i57 = this.f62045w;
                j11 >>>= i57;
                i42++;
                i53 += i57;
                i41 = i55;
            }
            int i58 = (i18 << this.f62045w) - i41;
            int i59 = 0;
            while (i59 < log) {
                int i60 = this.mdsize;
                hashSignatureBlock(bArr2, i42 * i60, i49 - (i58 & i49), bArr4, i42 * i60);
                int i61 = this.f62045w;
                i58 >>>= i61;
                i42++;
                i59 += i61;
            }
        } else if (i19 < 57) {
            int i62 = (i20 << 3) - i19;
            int i63 = (1 << i19) - 1;
            byte[] bArr5 = new byte[i20];
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            while (i64 <= i62) {
                int i67 = i64 >>> 3;
                int i68 = i64 % 8;
                char c11 = c10;
                i64 += this.f62045w;
                int i69 = i15;
                int i70 = i67;
                long j12 = 0;
                while (true) {
                    i13 = i62;
                    if (i70 >= ((i64 + 7) >>> 3)) {
                        break;
                    }
                    j12 ^= (bArr3[i70] & UByte.MAX_VALUE) << (i69 << 3);
                    i69++;
                    i70++;
                    i62 = i13;
                    bArr3 = bArr3;
                }
                byte[] bArr6 = bArr3;
                long j13 = i63;
                long j14 = (j12 >>> i68) & j13;
                i65 = (int) (i65 + j14);
                int i71 = this.mdsize;
                System.arraycopy(bArr2, i66 * i71, bArr5, 0, i71);
                while (j14 < j13) {
                    this.messDigestOTS.update(bArr5, 0, i20);
                    this.messDigestOTS.doFinal(bArr5, 0);
                    j14++;
                }
                int i72 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr4, i66 * i72, i72);
                i66++;
                c10 = c11;
                i62 = i13;
                bArr3 = bArr6;
                i15 = 0;
            }
            byte[] bArr7 = bArr3;
            int i73 = i64 >>> 3;
            if (i73 < this.mdsize) {
                int i74 = i64 % 8;
                int i75 = 0;
                long j15 = 0;
                while (true) {
                    i12 = this.mdsize;
                    if (i73 >= i12) {
                        break;
                    }
                    j15 ^= (bArr7[i73] & UByte.MAX_VALUE) << (i75 << 3);
                    i75++;
                    i73++;
                }
                i10 = i18;
                long j16 = i63;
                long j17 = (j15 >>> i74) & j16;
                i65 = (int) (i65 + j17);
                System.arraycopy(bArr2, i66 * i12, bArr5, 0, i12);
                while (j17 < j16) {
                    this.messDigestOTS.update(bArr5, 0, i20);
                    this.messDigestOTS.doFinal(bArr5, 0);
                    j17++;
                }
                int i76 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr4, i66 * i76, i76);
                i66++;
            } else {
                i10 = i18;
            }
            int i77 = (i10 << this.f62045w) - i65;
            int i78 = 0;
            while (i78 < log) {
                int i79 = this.mdsize;
                System.arraycopy(bArr2, i66 * i79, bArr5, 0, i79);
                int i80 = i66;
                for (long j18 = i77 & i63; j18 < i63; j18++) {
                    this.messDigestOTS.update(bArr5, 0, i20);
                    this.messDigestOTS.doFinal(bArr5, 0);
                }
                int i81 = this.mdsize;
                System.arraycopy(bArr5, 0, bArr4, i80 * i81, i81);
                int i82 = this.f62045w;
                i77 >>>= i82;
                i66 = i80 + 1;
                i78 += i82;
            }
            i11 = 0;
            this.messDigestOTS.update(bArr4, i11, i21);
            byte[] bArr8 = new byte[this.mdsize];
            this.messDigestOTS.doFinal(bArr8, i11);
            return bArr8;
        }
        i11 = 0;
        this.messDigestOTS.update(bArr4, i11, i21);
        byte[] bArr82 = new byte[this.mdsize];
        this.messDigestOTS.doFinal(bArr82, i11);
        return bArr82;
    }

    public int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    public int getSignatureLength() {
        int digestSize = this.messDigestOTS.getDigestSize();
        int i10 = this.f62045w;
        int i11 = ((digestSize << 3) + (i10 - 1)) / i10;
        int log = getLog((i11 << i10) + 1);
        return digestSize * (i11 + (((log + r3) - 1) / this.f62045w));
    }
}
