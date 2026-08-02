package Zi;

import org.spongycastle.crypto.A;

/* loaded from: classes5.dex */
public class e extends org.spongycastle.crypto.g {

    /* renamed from: f, reason: collision with root package name */
    public int f14901f;

    public e(org.spongycastle.crypto.e eVar) {
        if (eVar instanceof A) {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        }
        this.f62622c = eVar;
        int blockSize = eVar.getBlockSize();
        this.f14901f = blockSize;
        this.buf = new byte[blockSize * 2];
        this.f62620a = 0;
    }

    @Override // org.spongycastle.crypto.g
    public int a(byte[] bArr, int i10) {
        if (this.f62620a + i10 > bArr.length) {
            throw new org.spongycastle.crypto.l("output buffer to small in doFinal");
        }
        int blockSize = this.f62622c.getBlockSize();
        int i11 = this.f62620a;
        int i12 = i11 - blockSize;
        byte[] bArr2 = new byte[blockSize];
        if (this.f62621b) {
            if (i11 < blockSize) {
                throw new org.spongycastle.crypto.l("need at least one block of input for CTS");
            }
            this.f62622c.processBlock(this.buf, 0, bArr2, 0);
            int i13 = this.f62620a;
            if (i13 > blockSize) {
                while (true) {
                    byte[] bArr3 = this.buf;
                    if (i13 == bArr3.length) {
                        break;
                    }
                    bArr3[i13] = bArr2[i13 - blockSize];
                    i13++;
                }
                for (int i14 = blockSize; i14 != this.f62620a; i14++) {
                    byte[] bArr4 = this.buf;
                    bArr4[i14] = (byte) (bArr4[i14] ^ bArr2[i14 - blockSize]);
                }
                org.spongycastle.crypto.e eVar = this.f62622c;
                if (eVar instanceof b) {
                    ((b) eVar).d().processBlock(this.buf, blockSize, bArr, i10);
                } else {
                    eVar.processBlock(this.buf, blockSize, bArr, i10);
                }
                System.arraycopy(bArr2, 0, bArr, i10 + blockSize, i12);
            } else {
                System.arraycopy(bArr2, 0, bArr, i10, blockSize);
            }
        } else {
            if (i11 < blockSize) {
                throw new org.spongycastle.crypto.l("need at least one block of input for CTS");
            }
            byte[] bArr5 = new byte[blockSize];
            if (i11 > blockSize) {
                org.spongycastle.crypto.e eVar2 = this.f62622c;
                if (eVar2 instanceof b) {
                    ((b) eVar2).d().processBlock(this.buf, 0, bArr2, 0);
                } else {
                    eVar2.processBlock(this.buf, 0, bArr2, 0);
                }
                for (int i15 = blockSize; i15 != this.f62620a; i15++) {
                    int i16 = i15 - blockSize;
                    bArr5[i16] = (byte) (bArr2[i16] ^ this.buf[i15]);
                }
                System.arraycopy(this.buf, blockSize, bArr2, 0, i12);
                this.f62622c.processBlock(bArr2, 0, bArr, i10);
                System.arraycopy(bArr5, 0, bArr, i10 + blockSize, i12);
            } else {
                this.f62622c.processBlock(this.buf, 0, bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i10, blockSize);
            }
        }
        int i17 = this.f62620a;
        h();
        return i17;
    }

    @Override // org.spongycastle.crypto.g
    public int c(int i10) {
        return i10 + this.f62620a;
    }

    @Override // org.spongycastle.crypto.g
    public int e(int i10) {
        int i11 = i10 + this.f62620a;
        byte[] bArr = this.buf;
        int length = i11 % bArr.length;
        return length == 0 ? i11 - bArr.length : i11 - length;
    }

    @Override // org.spongycastle.crypto.g
    public int g(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int b10 = b();
        int e10 = e(i11);
        if (e10 > 0 && e10 + i12 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i13 = this.f62620a;
        int i14 = length - i13;
        int i15 = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int processBlock = this.f62622c.processBlock(this.buf, 0, bArr2, i12);
            byte[] bArr4 = this.buf;
            System.arraycopy(bArr4, b10, bArr4, 0, b10);
            this.f62620a = b10;
            i11 -= i14;
            i10 += i14;
            while (i11 > b10) {
                System.arraycopy(bArr, i10, this.buf, this.f62620a, b10);
                processBlock += this.f62622c.processBlock(this.buf, 0, bArr2, i12 + processBlock);
                byte[] bArr5 = this.buf;
                System.arraycopy(bArr5, b10, bArr5, 0, b10);
                i11 -= b10;
                i10 += b10;
            }
            i15 = processBlock;
        }
        System.arraycopy(bArr, i10, this.buf, this.f62620a, i11);
        this.f62620a += i11;
        return i15;
    }
}
