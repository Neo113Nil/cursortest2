package Yi;

import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class k implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f14332a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14333b;

    /* renamed from: c, reason: collision with root package name */
    public long f14334c;

    /* renamed from: d, reason: collision with root package name */
    public long f14335d;

    /* renamed from: e, reason: collision with root package name */
    public long f14336e;

    /* renamed from: f, reason: collision with root package name */
    public long f14337f;

    /* renamed from: g, reason: collision with root package name */
    public long f14338g;

    /* renamed from: h, reason: collision with root package name */
    public long f14339h;

    /* renamed from: i, reason: collision with root package name */
    public long f14340i;

    /* renamed from: j, reason: collision with root package name */
    public int f14341j;

    /* renamed from: k, reason: collision with root package name */
    public int f14342k;

    public k() {
        this.f14340i = 0L;
        this.f14341j = 0;
        this.f14342k = 0;
        this.f14332a = 2;
        this.f14333b = 4;
    }

    public static long e(long j10, int i10) {
        return (j10 >>> (-i10)) | (j10 << i10);
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof w)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] a10 = ((w) jVar).a();
        if (a10.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f14334c = Aj.f.l(a10, 0);
        this.f14335d = Aj.f.l(a10, 8);
        reset();
    }

    public void b(int i10) {
        long j10 = this.f14336e;
        long j11 = this.f14337f;
        long j12 = this.f14338g;
        long j13 = this.f14339h;
        for (int i11 = 0; i11 < i10; i11++) {
            long j14 = j10 + j11;
            long j15 = j12 + j13;
            long e10 = e(j11, 13) ^ j14;
            long e11 = e(j13, 16) ^ j15;
            long j16 = j15 + e10;
            j10 = e(j14, 32) + e11;
            j11 = e(e10, 17) ^ j16;
            j13 = e(e11, 21) ^ j10;
            j12 = e(j16, 32);
        }
        this.f14336e = j10;
        this.f14337f = j11;
        this.f14338g = j12;
        this.f14339h = j13;
    }

    public long c() {
        this.f14340i = ((this.f14340i >>> ((7 - this.f14341j) << 3)) >>> 8) | ((((this.f14342k << 3) + r2) & 255) << 56);
        d();
        this.f14338g ^= 255;
        b(this.f14333b);
        long j10 = ((this.f14336e ^ this.f14337f) ^ this.f14338g) ^ this.f14339h;
        reset();
        return j10;
    }

    public void d() {
        this.f14342k++;
        this.f14339h ^= this.f14340i;
        b(this.f14332a);
        this.f14336e ^= this.f14340i;
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        Aj.f.n(c(), bArr, i10);
        return 8;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        return "SipHash-" + this.f14332a + "-" + this.f14333b;
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        long j10 = this.f14334c;
        this.f14336e = 8317987319222330741L ^ j10;
        long j11 = this.f14335d;
        this.f14337f = 7237128888997146477L ^ j11;
        this.f14338g = j10 ^ 7816392313619706465L;
        this.f14339h = 8387220255154660723L ^ j11;
        this.f14340i = 0L;
        this.f14341j = 0;
        this.f14342k = 0;
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        this.f14340i = (this.f14340i >>> 8) | ((b10 & 255) << 56);
        int i10 = this.f14341j + 1;
        this.f14341j = i10;
        if (i10 == 8) {
            d();
            this.f14341j = 0;
        }
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = i11 & (-8);
        int i13 = this.f14341j;
        char c10 = '8';
        long j10 = 255;
        int i14 = 0;
        if (i13 == 0) {
            while (i14 < i12) {
                this.f14340i = Aj.f.l(bArr, i10 + i14);
                d();
                i14 += 8;
            }
            while (i14 < i11) {
                long j11 = this.f14340i >>> 8;
                this.f14340i = j11;
                this.f14340i = j11 | ((bArr[i10 + i14] & 255) << 56);
                i14++;
            }
            this.f14341j = i11 - i12;
            return;
        }
        int i15 = i13 << 3;
        int i16 = 0;
        while (i16 < i12) {
            long l10 = Aj.f.l(bArr, i10 + i16);
            this.f14340i = (this.f14340i >>> (-i15)) | (l10 << i15);
            d();
            this.f14340i = l10;
            i16 += 8;
            c10 = c10;
            j10 = j10;
        }
        char c11 = c10;
        long j12 = j10;
        while (i16 < i11) {
            long j13 = this.f14340i >>> 8;
            this.f14340i = j13;
            this.f14340i = j13 | ((bArr[i10 + i16] & j12) << c11);
            int i17 = this.f14341j + 1;
            this.f14341j = i17;
            if (i17 == 8) {
                d();
                this.f14341j = 0;
            }
            i16++;
        }
    }

    public k(int i10, int i11) {
        this.f14340i = 0L;
        this.f14341j = 0;
        this.f14342k = 0;
        this.f14332a = i10;
        this.f14333b = i11;
    }
}
