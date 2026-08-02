package bj;

import org.spongycastle.crypto.j;
import org.spongycastle.crypto.l;
import org.spongycastle.crypto.params.A;
import org.spongycastle.crypto.x;

/* loaded from: classes5.dex */
public class e extends org.spongycastle.crypto.g {

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2427a f25235f;

    public e(org.spongycastle.crypto.e eVar, InterfaceC2427a interfaceC2427a) {
        this.f62622c = eVar;
        this.f25235f = interfaceC2427a;
        this.buf = new byte[eVar.getBlockSize()];
        this.f62620a = 0;
    }

    @Override // org.spongycastle.crypto.g
    public int a(byte[] bArr, int i10) {
        int i11;
        int blockSize = this.f62622c.getBlockSize();
        if (this.f62621b) {
            if (this.f62620a != blockSize) {
                i11 = 0;
            } else {
                if ((blockSize * 2) + i10 > bArr.length) {
                    h();
                    throw new x("output buffer too short");
                }
                i11 = this.f62622c.processBlock(this.buf, 0, bArr, i10);
                this.f62620a = 0;
            }
            this.f25235f.addPadding(this.buf, this.f62620a);
            return i11 + this.f62622c.processBlock(this.buf, 0, bArr, i10 + i11);
        }
        if (this.f62620a != blockSize) {
            h();
            throw new l("last block incomplete in decryption");
        }
        org.spongycastle.crypto.e eVar = this.f62622c;
        byte[] bArr2 = this.buf;
        int processBlock = eVar.processBlock(bArr2, 0, bArr2, 0);
        this.f62620a = 0;
        try {
            int padCount = processBlock - this.f25235f.padCount(this.buf);
            System.arraycopy(this.buf, 0, bArr, i10, padCount);
            return padCount;
        } finally {
            h();
        }
    }

    @Override // org.spongycastle.crypto.g
    public int c(int i10) {
        int length;
        int i11 = i10 + this.f62620a;
        byte[] bArr = this.buf;
        int length2 = i11 % bArr.length;
        if (length2 != 0) {
            i11 -= length2;
            length = bArr.length;
        } else {
            if (!this.f62621b) {
                return i11;
            }
            length = bArr.length;
        }
        return i11 + length;
    }

    @Override // org.spongycastle.crypto.g
    public int e(int i10) {
        int i11 = i10 + this.f62620a;
        byte[] bArr = this.buf;
        int length = i11 % bArr.length;
        return length == 0 ? Math.max(0, i11 - bArr.length) : i11 - length;
    }

    @Override // org.spongycastle.crypto.g
    public void f(boolean z10, j jVar) {
        this.f62621b = z10;
        h();
        if (!(jVar instanceof A)) {
            this.f25235f.init(null);
            this.f62622c.a(z10, jVar);
        } else {
            A a10 = (A) jVar;
            this.f25235f.init(a10.b());
            this.f62622c.a(z10, a10.a());
        }
    }

    @Override // org.spongycastle.crypto.g
    public int g(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int b10 = b();
        int e10 = e(i11);
        if (e10 > 0 && e10 + i12 > bArr2.length) {
            throw new x("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i13 = this.f62620a;
        int i14 = length - i13;
        int i15 = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int processBlock = this.f62622c.processBlock(this.buf, 0, bArr2, i12);
            this.f62620a = 0;
            i11 -= i14;
            i10 += i14;
            i15 = processBlock;
            while (i11 > this.buf.length) {
                i15 += this.f62622c.processBlock(bArr, i10, bArr2, i12 + i15);
                i11 -= b10;
                i10 += b10;
            }
        }
        System.arraycopy(bArr, i10, this.buf, this.f62620a, i11);
        this.f62620a += i11;
        return i15;
    }

    public e(org.spongycastle.crypto.e eVar) {
        this(eVar, new d());
    }
}
