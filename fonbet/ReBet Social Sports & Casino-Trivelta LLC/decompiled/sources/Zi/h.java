package Zi;

import aj.AbstractC2031c;
import aj.C2032d;
import aj.C2033e;
import aj.InterfaceC2029a;
import aj.InterfaceC2030b;
import kotlin.UByte;
import org.spongycastle.crypto.params.C5974a;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.x;

/* loaded from: classes5.dex */
public class h implements a {

    /* renamed from: H, reason: collision with root package name */
    private byte[] f14914H;

    /* renamed from: J0, reason: collision with root package name */
    private byte[] f14915J0;

    /* renamed from: S, reason: collision with root package name */
    private byte[] f14916S;
    private byte[] S_at;
    private byte[] S_atPre;

    /* renamed from: a, reason: collision with root package name */
    public org.spongycastle.crypto.e f14917a;
    private byte[] atBlock;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2030b f14918b;
    private byte[] bufBlock;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2029a f14919c;
    private byte[] counter;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14920d;

    /* renamed from: e, reason: collision with root package name */
    public int f14921e;

    /* renamed from: f, reason: collision with root package name */
    public int f14922f;

    /* renamed from: g, reason: collision with root package name */
    public int f14923g;

    /* renamed from: h, reason: collision with root package name */
    public long f14924h;

    /* renamed from: i, reason: collision with root package name */
    public int f14925i;
    private byte[] initialAssociatedText;

    /* renamed from: j, reason: collision with root package name */
    public long f14926j;

    /* renamed from: k, reason: collision with root package name */
    public long f14927k;
    private byte[] lastKey;
    private byte[] macBlock;
    private byte[] nonce;

    public h(org.spongycastle.crypto.e eVar) {
        this(eVar, null);
    }

    private void h() {
        if (this.f14926j > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.f14927k = this.f14926j;
        }
        int i10 = this.f14925i;
        if (i10 > 0) {
            f(this.S_atPre, this.atBlock, 0, i10);
            this.f14927k += this.f14925i;
        }
        if (this.f14927k > 0) {
            System.arraycopy(this.S_atPre, 0, this.f14916S, 0, 16);
        }
    }

    private void l(boolean z10) {
        this.f14917a.reset();
        this.f14916S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.f14925i = 0;
        this.f14926j = 0L;
        this.f14927k = 0L;
        this.counter = Aj.a.d(this.f14915J0);
        this.f14922f = -2;
        this.f14923g = 0;
        this.f14924h = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Aj.a.m(bArr, (byte) 0);
        }
        if (z10) {
            this.macBlock = null;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }

    @Override // Zi.a
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        byte[] a10;
        w wVar;
        byte[] bArr;
        this.f14920d = z10;
        this.macBlock = null;
        if (jVar instanceof C5974a) {
            C5974a c5974a = (C5974a) jVar;
            a10 = c5974a.d();
            this.initialAssociatedText = c5974a.a();
            int c10 = c5974a.c();
            if (c10 < 32 || c10 > 128 || c10 % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c10);
            }
            this.f14921e = c10 / 8;
            wVar = c5974a.b();
        } else {
            if (!(jVar instanceof z)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            z zVar = (z) jVar;
            a10 = zVar.a();
            this.initialAssociatedText = null;
            this.f14921e = 16;
            wVar = (w) zVar.b();
        }
        this.bufBlock = new byte[z10 ? 16 : this.f14921e + 16];
        if (a10 == null || a10.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z10 && (bArr = this.nonce) != null && Aj.a.a(bArr, a10)) {
            if (wVar == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.lastKey;
            if (bArr2 != null && Aj.a.a(bArr2, wVar.a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.nonce = a10;
        if (wVar != null) {
            this.lastKey = wVar.a();
        }
        if (wVar != null) {
            this.f14917a.a(true, wVar);
            byte[] bArr3 = new byte[16];
            this.f14914H = bArr3;
            this.f14917a.processBlock(bArr3, 0, bArr3, 0);
            this.f14918b.init(this.f14914H);
            this.f14919c = null;
        } else if (this.f14914H == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.f14915J0 = bArr4;
        byte[] bArr5 = this.nonce;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f14915J0[15] = 1;
        } else {
            d(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            Aj.f.m(this.nonce.length * 8, bArr6, 8);
            e(this.f14915J0, bArr6);
        }
        this.f14916S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.f14925i = 0;
        this.f14926j = 0L;
        this.f14927k = 0L;
        this.counter = Aj.a.d(this.f14915J0);
        this.f14922f = -2;
        this.f14923g = 0;
        this.f14924h = 0L;
        byte[] bArr7 = this.initialAssociatedText;
        if (bArr7 != null) {
            processAADBytes(bArr7, 0, bArr7.length);
        }
    }

    public final void b(byte[] bArr, byte[] bArr2, int i10) {
        byte[] g10 = g();
        AbstractC2031c.l(g10, bArr);
        System.arraycopy(g10, 0, bArr2, i10, 16);
        byte[] bArr3 = this.f14916S;
        if (this.f14920d) {
            bArr = g10;
        }
        e(bArr3, bArr);
        this.f14924h += 16;
    }

    public final void c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] g10 = g();
        AbstractC2031c.m(g10, bArr, i10, i11);
        System.arraycopy(g10, 0, bArr2, i12, i11);
        byte[] bArr3 = this.f14916S;
        if (this.f14920d) {
            bArr = g10;
        }
        f(bArr3, bArr, 0, i11);
        this.f14924h += i11;
    }

    public final void d(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 16) {
            f(bArr, bArr2, i11, Math.min(i10 - i11, 16));
        }
    }

    @Override // Zi.a
    public int doFinal(byte[] bArr, int i10) {
        h hVar;
        byte[] bArr2;
        int i11;
        if (this.f14924h == 0) {
            h();
        }
        int i12 = this.f14923g;
        if (!this.f14920d) {
            int i13 = this.f14921e;
            if (i12 < i13) {
                throw new r("data too short");
            }
            i12 -= i13;
            if (bArr.length < i10 + i12) {
                throw new x("Output buffer too short");
            }
        } else if (bArr.length < i10 + i12 + this.f14921e) {
            throw new x("Output buffer too short");
        }
        int i14 = i12;
        if (i14 > 0) {
            hVar = this;
            bArr2 = bArr;
            i11 = i10;
            hVar.c(this.bufBlock, 0, i14, bArr2, i11);
        } else {
            hVar = this;
            bArr2 = bArr;
            i11 = i10;
        }
        long j10 = hVar.f14926j;
        int i15 = hVar.f14925i;
        long j11 = j10 + i15;
        hVar.f14926j = j11;
        if (j11 > hVar.f14927k) {
            if (i15 > 0) {
                f(hVar.S_at, hVar.atBlock, 0, i15);
            }
            if (hVar.f14927k > 0) {
                AbstractC2031c.l(hVar.S_at, hVar.S_atPre);
            }
            long j12 = ((hVar.f14924h * 8) + 127) >>> 7;
            byte[] bArr3 = new byte[16];
            if (hVar.f14919c == null) {
                C2032d c2032d = new C2032d();
                hVar.f14919c = c2032d;
                c2032d.init(hVar.f14914H);
            }
            hVar.f14919c.exponentiateX(j12, bArr3);
            AbstractC2031c.e(hVar.S_at, bArr3);
            AbstractC2031c.l(hVar.f14916S, hVar.S_at);
        }
        byte[] bArr4 = new byte[16];
        Aj.f.m(hVar.f14926j * 8, bArr4, 0);
        Aj.f.m(hVar.f14924h * 8, bArr4, 8);
        e(hVar.f14916S, bArr4);
        byte[] bArr5 = new byte[16];
        hVar.f14917a.processBlock(hVar.f14915J0, 0, bArr5, 0);
        AbstractC2031c.l(bArr5, hVar.f14916S);
        int i16 = hVar.f14921e;
        byte[] bArr6 = new byte[i16];
        hVar.macBlock = bArr6;
        System.arraycopy(bArr5, 0, bArr6, 0, i16);
        if (hVar.f14920d) {
            System.arraycopy(hVar.macBlock, 0, bArr2, hVar.f14923g + i11, hVar.f14921e);
            i14 += hVar.f14921e;
        } else {
            int i17 = hVar.f14921e;
            byte[] bArr7 = new byte[i17];
            System.arraycopy(hVar.bufBlock, i14, bArr7, 0, i17);
            if (!Aj.a.k(hVar.macBlock, bArr7)) {
                throw new r("mac check in GCM failed");
            }
        }
        l(false);
        return i14;
    }

    public final void e(byte[] bArr, byte[] bArr2) {
        AbstractC2031c.l(bArr, bArr2);
        this.f14918b.multiplyH(bArr);
    }

    public final void f(byte[] bArr, byte[] bArr2, int i10, int i11) {
        AbstractC2031c.m(bArr, bArr2, i10, i11);
        this.f14918b.multiplyH(bArr);
    }

    public final byte[] g() {
        int i10 = this.f14922f;
        if (i10 == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.f14922f = i10 - 1;
        byte[] bArr = this.counter;
        int i11 = (bArr[15] & UByte.MAX_VALUE) + 1;
        bArr[15] = (byte) i11;
        int i12 = (i11 >>> 8) + (bArr[14] & UByte.MAX_VALUE);
        bArr[14] = (byte) i12;
        int i13 = (i12 >>> 8) + (bArr[13] & UByte.MAX_VALUE);
        bArr[13] = (byte) i13;
        bArr[12] = (byte) ((i13 >>> 8) + (bArr[12] & UByte.MAX_VALUE));
        byte[] bArr2 = new byte[16];
        this.f14917a.processBlock(bArr, 0, bArr2, 0);
        return bArr2;
    }

    @Override // Zi.a
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.f14921e] : Aj.a.d(bArr);
    }

    @Override // Zi.a
    public int getOutputSize(int i10) {
        int i11 = i10 + this.f14923g;
        if (this.f14920d) {
            return i11 + this.f14921e;
        }
        int i12 = this.f14921e;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // Zi.a
    public org.spongycastle.crypto.e getUnderlyingCipher() {
        return this.f14917a;
    }

    @Override // Zi.a
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.f14923g;
        if (!this.f14920d) {
            int i12 = this.f14921e;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    public final void i(byte[] bArr, int i10) {
        if (bArr.length < i10 + 16) {
            throw new x("Output buffer too short");
        }
        if (this.f14924h == 0) {
            h();
        }
        b(this.bufBlock, bArr, i10);
        if (this.f14920d) {
            this.f14923g = 0;
            return;
        }
        byte[] bArr2 = this.bufBlock;
        System.arraycopy(bArr2, 16, bArr2, 0, this.f14921e);
        this.f14923g = this.f14921e;
    }

    public void j(byte b10) {
        byte[] bArr = this.atBlock;
        int i10 = this.f14925i;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.f14925i = i11;
        if (i11 == 16) {
            e(this.S_at, bArr);
            this.f14925i = 0;
            this.f14926j += 16;
        }
    }

    public void k() {
        l(true);
    }

    @Override // Zi.a
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.atBlock;
            int i13 = this.f14925i;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.f14925i = i14;
            if (i14 == 16) {
                e(this.S_at, bArr2);
                this.f14925i = 0;
                this.f14926j += 16;
            }
        }
    }

    @Override // Zi.a
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (bArr.length < i10 + i11) {
            throw new org.spongycastle.crypto.l("Input buffer too short");
        }
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            byte[] bArr3 = this.bufBlock;
            int i15 = this.f14923g;
            bArr3[i15] = bArr[i10 + i14];
            int i16 = i15 + 1;
            this.f14923g = i16;
            if (i16 == bArr3.length) {
                i(bArr2, i12 + i13);
                i13 += 16;
            }
        }
        return i13;
    }

    public h(org.spongycastle.crypto.e eVar, InterfaceC2030b interfaceC2030b) {
        if (eVar.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        interfaceC2030b = interfaceC2030b == null ? new C2033e() : interfaceC2030b;
        this.f14917a = eVar;
        this.f14918b = interfaceC2030b;
    }
}
