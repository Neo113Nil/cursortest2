package Yi;

import org.spongycastle.crypto.params.z;

/* loaded from: classes5.dex */
public class h {
    private byte[] IV;

    /* renamed from: a, reason: collision with root package name */
    public int f14308a;

    /* renamed from: b, reason: collision with root package name */
    public org.spongycastle.crypto.e f14309b;
    private byte[] cfbOutV;
    private byte[] cfbV;

    public h(org.spongycastle.crypto.e eVar, int i10) {
        this.f14309b = eVar;
        this.f14308a = i10 / 8;
        this.IV = new byte[eVar.getBlockSize()];
        this.cfbV = new byte[eVar.getBlockSize()];
        this.cfbOutV = new byte[eVar.getBlockSize()];
    }

    public String a() {
        return this.f14309b.getAlgorithmName() + "/CFB" + (this.f14308a * 8);
    }

    public int b() {
        return this.f14308a;
    }

    public void c(byte[] bArr) {
        this.f14309b.processBlock(this.cfbV, 0, bArr, 0);
    }

    public void d(org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof z)) {
            f();
            this.f14309b.a(true, jVar);
            return;
        }
        z zVar = (z) jVar;
        byte[] a10 = zVar.a();
        int length = a10.length;
        byte[] bArr = this.IV;
        if (length < bArr.length) {
            System.arraycopy(a10, 0, bArr, bArr.length - a10.length, a10.length);
        } else {
            System.arraycopy(a10, 0, bArr, 0, bArr.length);
        }
        f();
        this.f14309b.a(true, zVar.b());
    }

    public int e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = this.f14308a;
        if (i10 + i12 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.l("output buffer too short");
        }
        this.f14309b.processBlock(this.cfbV, 0, this.cfbOutV, 0);
        int i13 = 0;
        while (true) {
            int i14 = this.f14308a;
            if (i13 >= i14) {
                byte[] bArr3 = this.cfbV;
                System.arraycopy(bArr3, i14, bArr3, 0, bArr3.length - i14);
                byte[] bArr4 = this.cfbV;
                int length = bArr4.length;
                int i15 = this.f14308a;
                System.arraycopy(bArr2, i11, bArr4, length - i15, i15);
                return this.f14308a;
            }
            bArr2[i11 + i13] = (byte) (this.cfbOutV[i13] ^ bArr[i10 + i13]);
            i13++;
        }
    }

    public void f() {
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.cfbV, 0, bArr.length);
        this.f14309b.reset();
    }
}
