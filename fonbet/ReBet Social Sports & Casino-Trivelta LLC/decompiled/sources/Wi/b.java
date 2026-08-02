package Wi;

import java.security.SecureRandom;
import org.spongycastle.crypto.InterfaceC5948a;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.l;
import org.spongycastle.crypto.o;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.r;

/* loaded from: classes5.dex */
public class b implements InterfaceC5948a {

    /* renamed from: a, reason: collision with root package name */
    public o f13320a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC5948a f13321b;

    /* renamed from: c, reason: collision with root package name */
    public SecureRandom f13322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13323d;
    private byte[] defHash;

    public b(InterfaceC5948a interfaceC5948a, o oVar, byte[] bArr) {
        this(interfaceC5948a, oVar, oVar, bArr);
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public void a(boolean z10, j jVar) {
        if (jVar instanceof A) {
            this.f13322c = ((A) jVar).b();
        } else {
            this.f13322c = new SecureRandom();
        }
        this.f13321b.a(z10, jVar);
        this.f13323d = z10;
    }

    public final void b(int i10, byte[] bArr) {
        bArr[0] = (byte) (i10 >>> 24);
        bArr[1] = (byte) (i10 >>> 16);
        bArr[2] = (byte) (i10 >>> 8);
        bArr[3] = (byte) i10;
    }

    public byte[] c(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] processBlock = this.f13321b.processBlock(bArr, i10, i11);
        int outputBlockSize = this.f13321b.getOutputBlockSize();
        byte[] bArr4 = new byte[outputBlockSize];
        System.arraycopy(processBlock, 0, bArr4, outputBlockSize - processBlock.length, processBlock.length);
        byte[] bArr5 = this.defHash;
        boolean z10 = outputBlockSize < (bArr5.length * 2) + 1;
        byte[] e10 = e(bArr4, bArr5.length, outputBlockSize - bArr5.length, bArr5.length);
        int i12 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i12 == bArr2.length) {
                break;
            }
            bArr4[i12] = (byte) (bArr4[i12] ^ e10[i12]);
            i12++;
        }
        byte[] e11 = e(bArr4, 0, bArr2.length, outputBlockSize - bArr2.length);
        for (int length = this.defHash.length; length != outputBlockSize; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ e11[length - this.defHash.length]);
        }
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            bArr3 = this.defHash;
            if (i13 == bArr3.length) {
                break;
            }
            if (bArr3[i13] != bArr4[bArr3.length + i13]) {
                z11 = true;
            }
            i13++;
        }
        int i14 = outputBlockSize;
        for (int length2 = bArr3.length * 2; length2 != outputBlockSize; length2++) {
            if ((bArr4[length2] != 0) & (i14 == outputBlockSize)) {
                i14 = length2;
            }
        }
        boolean z12 = i14 > outputBlockSize + (-1);
        boolean z13 = bArr4[i14] != 1;
        int i15 = i14 + 1;
        if ((z12 | z13) || (z10 | z11)) {
            Aj.a.m(bArr4, (byte) 0);
            throw new r("data wrong");
        }
        int i16 = outputBlockSize - i15;
        byte[] bArr6 = new byte[i16];
        System.arraycopy(bArr4, i15, bArr6, 0, i16);
        return bArr6;
    }

    public byte[] d(byte[] bArr, int i10, int i11) {
        if (i11 > getInputBlockSize()) {
            throw new l("input data too long");
        }
        int inputBlockSize = getInputBlockSize() + 1 + (this.defHash.length * 2);
        byte[] bArr2 = new byte[inputBlockSize];
        int i12 = inputBlockSize - i11;
        System.arraycopy(bArr, i10, bArr2, i12, i11);
        bArr2[i12 - 1] = 1;
        byte[] bArr3 = this.defHash;
        System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
        int length = this.defHash.length;
        byte[] bArr4 = new byte[length];
        this.f13322c.nextBytes(bArr4);
        byte[] e10 = e(bArr4, 0, length, inputBlockSize - this.defHash.length);
        for (int length2 = this.defHash.length; length2 != inputBlockSize; length2++) {
            bArr2[length2] = (byte) (bArr2[length2] ^ e10[length2 - this.defHash.length]);
        }
        System.arraycopy(bArr4, 0, bArr2, 0, this.defHash.length);
        byte[] bArr5 = this.defHash;
        byte[] e11 = e(bArr2, bArr5.length, inputBlockSize - bArr5.length, bArr5.length);
        for (int i13 = 0; i13 != this.defHash.length; i13++) {
            bArr2[i13] = (byte) (bArr2[i13] ^ e11[i13]);
        }
        return this.f13321b.processBlock(bArr2, 0, inputBlockSize);
    }

    public final byte[] e(byte[] bArr, int i10, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        int digestSize = this.f13320a.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.f13320a.reset();
        int i13 = 0;
        while (i13 < i12 / digestSize) {
            b(i13, bArr4);
            this.f13320a.update(bArr, i10, i11);
            this.f13320a.update(bArr4, 0, 4);
            this.f13320a.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i13 * digestSize, digestSize);
            i13++;
        }
        int i14 = digestSize * i13;
        if (i14 < i12) {
            b(i13, bArr4);
            this.f13320a.update(bArr, i10, i11);
            this.f13320a.update(bArr4, 0, 4);
            this.f13320a.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i14, i12 - i14);
        }
        return bArr2;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getInputBlockSize() {
        int inputBlockSize = this.f13321b.getInputBlockSize();
        return this.f13323d ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public int getOutputBlockSize() {
        int outputBlockSize = this.f13321b.getOutputBlockSize();
        return this.f13323d ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    @Override // org.spongycastle.crypto.InterfaceC5948a
    public byte[] processBlock(byte[] bArr, int i10, int i11) {
        return this.f13323d ? d(bArr, i10, i11) : c(bArr, i10, i11);
    }

    public b(InterfaceC5948a interfaceC5948a, o oVar, o oVar2, byte[] bArr) {
        this.f13321b = interfaceC5948a;
        this.f13320a = oVar2;
        this.defHash = new byte[oVar.getDigestSize()];
        oVar.reset();
        if (bArr != null) {
            oVar.update(bArr, 0, bArr.length);
        }
        oVar.doFinal(this.defHash, 0);
    }
}
