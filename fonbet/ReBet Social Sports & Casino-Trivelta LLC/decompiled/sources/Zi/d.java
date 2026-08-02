package Zi;

import org.spongycastle.crypto.A;
import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class d extends A {
    private byte[] IV;

    /* renamed from: b, reason: collision with root package name */
    public int f14897b;

    /* renamed from: c, reason: collision with root package name */
    public org.spongycastle.crypto.e f14898c;
    private byte[] cfbOutV;
    private byte[] cfbV;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14899d;

    /* renamed from: e, reason: collision with root package name */
    public int f14900e;
    private byte[] inBuf;

    public d(org.spongycastle.crypto.e eVar, int i10) {
        super(eVar);
        this.f14898c = eVar;
        this.f14897b = i10 / 8;
        this.IV = new byte[eVar.getBlockSize()];
        this.cfbV = new byte[eVar.getBlockSize()];
        this.cfbOutV = new byte[eVar.getBlockSize()];
        this.inBuf = new byte[this.f14897b];
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        this.f14899d = z10;
        if (!(jVar instanceof z)) {
            reset();
            if (jVar != null) {
                this.f14898c.a(true, jVar);
                return;
            }
            return;
        }
        z zVar = (z) jVar;
        byte[] a10 = zVar.a();
        int length = a10.length;
        byte[] bArr = this.IV;
        if (length < bArr.length) {
            System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
            int i10 = 0;
            while (true) {
                byte[] bArr2 = this.IV;
                if (i10 >= bArr2.length - a10.length) {
                    break;
                }
                bArr2[i10] = 0;
                i10++;
            }
        } else {
            System.arraycopy(a10, 0, bArr, 0, bArr.length);
        }
        reset();
        if (zVar.b() != null) {
            this.f14898c.a(true, zVar.b());
        }
    }

    @Override // org.spongycastle.crypto.A
    public byte b(byte b10) {
        return this.f14899d ? e(b10) : d(b10);
    }

    public final byte d(byte b10) {
        if (this.f14900e == 0) {
            this.f14898c.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.inBuf;
        int i10 = this.f14900e;
        bArr[i10] = b10;
        byte[] bArr2 = this.cfbOutV;
        int i11 = i10 + 1;
        this.f14900e = i11;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        int i12 = this.f14897b;
        if (i11 == i12) {
            this.f14900e = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i12, bArr3, 0, bArr3.length - i12);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i13 = this.f14897b;
            System.arraycopy(bArr4, 0, bArr5, length - i13, i13);
        }
        return b11;
    }

    public final byte e(byte b10) {
        if (this.f14900e == 0) {
            this.f14898c.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        }
        byte[] bArr = this.cfbOutV;
        int i10 = this.f14900e;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        byte[] bArr2 = this.inBuf;
        int i11 = i10 + 1;
        this.f14900e = i11;
        bArr2[i10] = b11;
        int i12 = this.f14897b;
        if (i11 == i12) {
            this.f14900e = 0;
            byte[] bArr3 = this.cfbV;
            System.arraycopy(bArr3, i12, bArr3, 0, bArr3.length - i12);
            byte[] bArr4 = this.inBuf;
            byte[] bArr5 = this.cfbV;
            int length = bArr5.length;
            int i13 = this.f14897b;
            System.arraycopy(bArr4, 0, bArr5, length - i13, i13);
        }
        return b11;
    }

    public byte[] f() {
        return Aj.a.d(this.cfbV);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return this.f14898c.getAlgorithmName() + "/CFB" + (this.f14897b * 8);
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14897b;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f14897b, bArr2, i11);
        return this.f14897b;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        Aj.a.m(this.inBuf, (byte) 0);
        this.f14900e = 0;
        this.f14898c.reset();
    }
}
