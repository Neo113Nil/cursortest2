package Zi;

import org.spongycastle.crypto.A;
import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class k extends A {
    private byte[] IV;

    /* renamed from: b, reason: collision with root package name */
    public int f14943b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14944c;

    /* renamed from: d, reason: collision with root package name */
    public final org.spongycastle.crypto.e f14945d;
    private byte[] ofbOutV;
    private byte[] ofbV;

    public k(org.spongycastle.crypto.e eVar, int i10) {
        super(eVar);
        this.f14945d = eVar;
        this.f14944c = i10 / 8;
        this.IV = new byte[eVar.getBlockSize()];
        this.ofbV = new byte[eVar.getBlockSize()];
        this.ofbOutV = new byte[eVar.getBlockSize()];
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof z)) {
            reset();
            if (jVar != null) {
                this.f14945d.a(true, jVar);
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
            this.f14945d.a(true, zVar.b());
        }
    }

    @Override // org.spongycastle.crypto.A
    public byte b(byte b10) {
        if (this.f14943b == 0) {
            this.f14945d.processBlock(this.ofbV, 0, this.ofbOutV, 0);
        }
        byte[] bArr = this.ofbOutV;
        int i10 = this.f14943b;
        int i11 = i10 + 1;
        this.f14943b = i11;
        byte b11 = (byte) (b10 ^ bArr[i10]);
        int i12 = this.f14944c;
        if (i11 == i12) {
            this.f14943b = 0;
            byte[] bArr2 = this.ofbV;
            System.arraycopy(bArr2, i12, bArr2, 0, bArr2.length - i12);
            byte[] bArr3 = this.ofbOutV;
            byte[] bArr4 = this.ofbV;
            int length = bArr4.length;
            int i13 = this.f14944c;
            System.arraycopy(bArr3, 0, bArr4, length - i13, i13);
        }
        return b11;
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return this.f14945d.getAlgorithmName() + "/OFB" + (this.f14944c * 8);
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return this.f14944c;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f14944c, bArr2, i11);
        return this.f14944c;
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.ofbV, 0, bArr.length);
        this.f14943b = 0;
        this.f14945d.reset();
    }
}
