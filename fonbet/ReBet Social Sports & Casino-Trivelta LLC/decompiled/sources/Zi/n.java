package Zi;

import org.spongycastle.crypto.A;
import org.spongycastle.crypto.B;
import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class n extends A implements B {
    private byte[] IV;

    /* renamed from: b, reason: collision with root package name */
    public final org.spongycastle.crypto.e f14955b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14956c;
    private byte[] counter;
    private byte[] counterOut;

    /* renamed from: d, reason: collision with root package name */
    public int f14957d;

    public n(org.spongycastle.crypto.e eVar) {
        super(eVar);
        this.f14955b = eVar;
        int blockSize = eVar.getBlockSize();
        this.f14956c = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.f14957d = 0;
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof z)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        z zVar = (z) jVar;
        byte[] d10 = Aj.a.d(zVar.a());
        this.IV = d10;
        int i10 = this.f14956c;
        if (i10 < d10.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.f14956c + " bytes.");
        }
        int i11 = 8 > i10 / 2 ? i10 / 2 : 8;
        if (i10 - d10.length <= i11) {
            if (zVar.b() != null) {
                this.f14955b.a(true, zVar.b());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.f14956c - i11) + " bytes.");
        }
    }

    @Override // org.spongycastle.crypto.A
    public byte b(byte b10) {
        int i10 = this.f14957d;
        if (i10 == 0) {
            this.f14955b.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i11 = this.f14957d;
            this.f14957d = i11 + 1;
            return (byte) (b10 ^ bArr[i11]);
        }
        byte[] bArr2 = this.counterOut;
        int i12 = i10 + 1;
        this.f14957d = i12;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        if (i12 == this.counter.length) {
            this.f14957d = 0;
            e(0);
            d();
        }
        return b11;
    }

    public final void d() {
        if (this.IV.length >= this.f14956c) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.IV;
            if (i10 == bArr.length) {
                return;
            }
            if (this.counter[i10] != bArr[i10]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
            i10++;
        }
    }

    public final void e(int i10) {
        byte b10;
        int length = this.counter.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
        } while (b10 == 0);
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return this.f14955b.getAlgorithmName() + "/SIC";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14955b.getBlockSize();
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f14956c, bArr2, i11);
        return this.f14956c;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        Aj.a.m(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.f14955b.reset();
        this.f14957d = 0;
    }
}
