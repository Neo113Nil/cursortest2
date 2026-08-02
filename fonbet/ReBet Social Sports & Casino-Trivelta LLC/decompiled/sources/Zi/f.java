package Zi;

import org.spongycastle.crypto.params.C5974a;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.v;
import org.spongycastle.crypto.x;

/* loaded from: classes5.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public n f14902a;
    private byte[] associatedTextMac;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14903b;
    private byte[] bufBlock;

    /* renamed from: c, reason: collision with root package name */
    public int f14904c;

    /* renamed from: d, reason: collision with root package name */
    public v f14905d;

    /* renamed from: e, reason: collision with root package name */
    public int f14906e;

    /* renamed from: f, reason: collision with root package name */
    public int f14907f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14908g;
    private byte[] initialAssociatedText;
    private byte[] macBlock;
    private byte[] nonceMac;

    public f(org.spongycastle.crypto.e eVar) {
        this.f14904c = eVar.getBlockSize();
        Yi.c cVar = new Yi.c(eVar);
        this.f14905d = cVar;
        this.macBlock = new byte[this.f14904c];
        this.associatedTextMac = new byte[cVar.getMacSize()];
        this.nonceMac = new byte[this.f14905d.getMacSize()];
        this.f14902a = new n(eVar);
    }

    private void f(boolean z10) {
        this.f14902a.reset();
        this.f14905d.reset();
        this.f14907f = 0;
        Aj.a.m(this.bufBlock, (byte) 0);
        if (z10) {
            Aj.a.m(this.macBlock, (byte) 0);
        }
        int i10 = this.f14904c;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 1;
        this.f14905d.update(bArr, 0, i10);
        this.f14908g = false;
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    @Override // Zi.a
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        byte[] a10;
        org.spongycastle.crypto.j b10;
        this.f14903b = z10;
        if (jVar instanceof C5974a) {
            C5974a c5974a = (C5974a) jVar;
            a10 = c5974a.d();
            this.initialAssociatedText = c5974a.a();
            this.f14906e = c5974a.c() / 8;
            b10 = c5974a.b();
        } else {
            if (!(jVar instanceof z)) {
                throw new IllegalArgumentException("invalid parameters passed to EAX");
            }
            z zVar = (z) jVar;
            a10 = zVar.a();
            this.initialAssociatedText = null;
            this.f14906e = this.f14905d.getMacSize() / 2;
            b10 = zVar.b();
        }
        this.bufBlock = new byte[z10 ? this.f14904c : this.f14904c + this.f14906e];
        byte[] bArr = new byte[this.f14904c];
        this.f14905d.a(b10);
        int i10 = this.f14904c;
        bArr[i10 - 1] = 0;
        this.f14905d.update(bArr, 0, i10);
        this.f14905d.update(a10, 0, a10.length);
        this.f14905d.doFinal(this.nonceMac, 0);
        this.f14902a.a(true, new z(null, this.nonceMac));
        e();
    }

    public final void b() {
        byte[] bArr = new byte[this.f14904c];
        int i10 = 0;
        this.f14905d.doFinal(bArr, 0);
        while (true) {
            byte[] bArr2 = this.macBlock;
            if (i10 >= bArr2.length) {
                return;
            }
            bArr2[i10] = (byte) ((this.nonceMac[i10] ^ this.associatedTextMac[i10]) ^ bArr[i10]);
            i10++;
        }
    }

    public final void c() {
        if (this.f14908g) {
            return;
        }
        this.f14908g = true;
        this.f14905d.doFinal(this.associatedTextMac, 0);
        int i10 = this.f14904c;
        byte[] bArr = new byte[i10];
        bArr[i10 - 1] = 2;
        this.f14905d.update(bArr, 0, i10);
    }

    public final int d(byte b10, byte[] bArr, int i10) {
        int processBlock;
        byte[] bArr2 = this.bufBlock;
        int i11 = this.f14907f;
        int i12 = i11 + 1;
        this.f14907f = i12;
        bArr2[i11] = b10;
        if (i12 != bArr2.length) {
            return 0;
        }
        int length = bArr.length;
        int i13 = this.f14904c;
        if (length < i10 + i13) {
            throw new x("Output buffer is too short");
        }
        if (this.f14903b) {
            processBlock = this.f14902a.processBlock(bArr2, 0, bArr, i10);
            this.f14905d.update(bArr, i10, this.f14904c);
        } else {
            this.f14905d.update(bArr2, 0, i13);
            processBlock = this.f14902a.processBlock(this.bufBlock, 0, bArr, i10);
        }
        this.f14907f = 0;
        if (!this.f14903b) {
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, this.f14904c, bArr3, 0, this.f14906e);
            this.f14907f = this.f14906e;
        }
        return processBlock;
    }

    @Override // Zi.a
    public int doFinal(byte[] bArr, int i10) {
        c();
        int i11 = this.f14907f;
        byte[] bArr2 = this.bufBlock;
        byte[] bArr3 = new byte[bArr2.length];
        this.f14907f = 0;
        if (this.f14903b) {
            int i12 = i10 + i11;
            if (bArr.length < this.f14906e + i12) {
                throw new x("Output buffer too short");
            }
            this.f14902a.processBlock(bArr2, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11);
            this.f14905d.update(bArr3, 0, i11);
            b();
            System.arraycopy(this.macBlock, 0, bArr, i12, this.f14906e);
            f(false);
            return i11 + this.f14906e;
        }
        int i13 = this.f14906e;
        if (i11 < i13) {
            throw new r("data too short");
        }
        if (bArr.length < (i10 + i11) - i13) {
            throw new x("Output buffer too short");
        }
        if (i11 > i13) {
            this.f14905d.update(bArr2, 0, i11 - i13);
            this.f14902a.processBlock(this.bufBlock, 0, bArr3, 0);
            System.arraycopy(bArr3, 0, bArr, i10, i11 - this.f14906e);
        }
        b();
        if (!g(this.bufBlock, i11 - this.f14906e)) {
            throw new r("mac check in EAX failed");
        }
        f(false);
        return i11 - this.f14906e;
    }

    public void e() {
        f(true);
    }

    public final boolean g(byte[] bArr, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14906e; i12++) {
            i11 |= this.macBlock[i12] ^ bArr[i10 + i12];
        }
        return i11 == 0;
    }

    @Override // Zi.a
    public byte[] getMac() {
        int i10 = this.f14906e;
        byte[] bArr = new byte[i10];
        System.arraycopy(this.macBlock, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // Zi.a
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f14907f;
        if (this.f14903b) {
            return i11 + this.f14906e;
        }
        int i12 = this.f14906e;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // Zi.a
    public org.spongycastle.crypto.e getUnderlyingCipher() {
        return this.f14902a.c();
    }

    @Override // Zi.a
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f14907f;
        if (!this.f14903b) {
            int i12 = this.f14906e;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % this.f14904c);
    }

    @Override // Zi.a
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        if (this.f14908g) {
            throw new IllegalStateException("AAD data cannot be added after encryption/decryption processing has begun.");
        }
        this.f14905d.update(bArr, i10, i11);
    }

    @Override // Zi.a
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        c();
        if (bArr.length < i10 + i11) {
            throw new org.spongycastle.crypto.l("Input buffer too short");
        }
        int i13 = 0;
        for (int i14 = 0; i14 != i11; i14++) {
            i13 += d(bArr[i10 + i14], bArr2, i12 + i13);
        }
        return i13;
    }
}
