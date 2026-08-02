package Yi;

import io.agora.rtc2.internal.AudioRoutingController;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.spongycastle.crypto.params.w;
import org.spongycastle.crypto.params.z;
import org.spongycastle.crypto.v;

/* loaded from: classes5.dex */
public class j implements v {

    /* renamed from: a, reason: collision with root package name */
    public final org.spongycastle.crypto.e f14312a;

    /* renamed from: b, reason: collision with root package name */
    public int f14313b;

    /* renamed from: c, reason: collision with root package name */
    public int f14314c;
    private final byte[] currentBlock;

    /* renamed from: d, reason: collision with root package name */
    public int f14315d;

    /* renamed from: e, reason: collision with root package name */
    public int f14316e;

    /* renamed from: f, reason: collision with root package name */
    public int f14317f;

    /* renamed from: g, reason: collision with root package name */
    public int f14318g;

    /* renamed from: h, reason: collision with root package name */
    public int f14319h;

    /* renamed from: i, reason: collision with root package name */
    public int f14320i;

    /* renamed from: j, reason: collision with root package name */
    public int f14321j;

    /* renamed from: k, reason: collision with root package name */
    public int f14322k;

    /* renamed from: l, reason: collision with root package name */
    public int f14323l;

    /* renamed from: m, reason: collision with root package name */
    public int f14324m;

    /* renamed from: n, reason: collision with root package name */
    public int f14325n;

    /* renamed from: o, reason: collision with root package name */
    public int f14326o;

    /* renamed from: p, reason: collision with root package name */
    public int f14327p;

    /* renamed from: q, reason: collision with root package name */
    public int f14328q;

    /* renamed from: r, reason: collision with root package name */
    public int f14329r;

    /* renamed from: s, reason: collision with root package name */
    public int f14330s;
    private final byte[] singleByte;

    /* renamed from: t, reason: collision with root package name */
    public int f14331t;

    public j() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.f14326o = 0;
        this.f14312a = null;
    }

    public static final long b(int i10, int i11) {
        return (i10 & BodyPartID.bodyIdMax) * i11;
    }

    @Override // org.spongycastle.crypto.v
    public void a(org.spongycastle.crypto.j jVar) {
        byte[] bArr;
        if (this.f14312a == null) {
            bArr = null;
        } else {
            if (!(jVar instanceof z)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            z zVar = (z) jVar;
            bArr = zVar.a();
            jVar = zVar.b();
        }
        if (!(jVar instanceof w)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        d(((w) jVar).a(), bArr);
        reset();
    }

    public final void c() {
        int i10 = this.f14326o;
        if (i10 < 16) {
            this.currentBlock[i10] = 1;
            for (int i11 = i10 + 1; i11 < 16; i11++) {
                this.currentBlock[i11] = 0;
            }
        }
        long i12 = Aj.f.i(this.currentBlock, 0);
        long j10 = i12 & BodyPartID.bodyIdMax;
        long i13 = Aj.f.i(this.currentBlock, 4) & BodyPartID.bodyIdMax;
        long i14 = Aj.f.i(this.currentBlock, 8) & BodyPartID.bodyIdMax;
        long i15 = BodyPartID.bodyIdMax & Aj.f.i(this.currentBlock, 12);
        int i16 = (int) (this.f14327p + (i12 & 67108863));
        this.f14327p = i16;
        this.f14328q = (int) (this.f14328q + ((((i13 << 32) | j10) >>> 26) & 67108863));
        this.f14329r = (int) (this.f14329r + (((i13 | (i14 << 32)) >>> 20) & 67108863));
        this.f14330s = (int) (this.f14330s + ((((i15 << 32) | i14) >>> 14) & 67108863));
        int i17 = (int) (this.f14331t + (i15 >>> 8));
        this.f14331t = i17;
        if (this.f14326o == 16) {
            this.f14331t = i17 + 16777216;
        }
        long b10 = b(i16, this.f14313b) + b(this.f14328q, this.f14321j) + b(this.f14329r, this.f14320i) + b(this.f14330s, this.f14319h) + b(this.f14331t, this.f14318g);
        long b11 = b(this.f14327p, this.f14314c) + b(this.f14328q, this.f14313b) + b(this.f14329r, this.f14321j) + b(this.f14330s, this.f14320i) + b(this.f14331t, this.f14319h);
        long b12 = b(this.f14327p, this.f14315d) + b(this.f14328q, this.f14314c) + b(this.f14329r, this.f14313b) + b(this.f14330s, this.f14321j) + b(this.f14331t, this.f14320i);
        long b13 = b(this.f14327p, this.f14316e) + b(this.f14328q, this.f14315d) + b(this.f14329r, this.f14314c) + b(this.f14330s, this.f14313b) + b(this.f14331t, this.f14321j);
        long b14 = b(this.f14327p, this.f14317f) + b(this.f14328q, this.f14316e) + b(this.f14329r, this.f14315d) + b(this.f14330s, this.f14314c) + b(this.f14331t, this.f14313b);
        long j11 = b11 + (b10 >>> 26);
        long j12 = b12 + (j11 >>> 26);
        this.f14329r = ((int) j12) & 67108863;
        long j13 = b13 + (j12 >>> 26);
        this.f14330s = ((int) j13) & 67108863;
        long j14 = b14 + (j13 >>> 26);
        this.f14331t = ((int) j14) & 67108863;
        int i18 = (((int) b10) & 67108863) + (((int) (j14 >>> 26)) * 5);
        this.f14328q = (((int) j11) & 67108863) + (i18 >>> 26);
        this.f14327p = i18 & 67108863;
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i10 = 16;
        if (this.f14312a != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int i11 = Aj.f.i(bArr, 0);
        int i12 = Aj.f.i(bArr, 4);
        int i13 = Aj.f.i(bArr, 8);
        int i14 = Aj.f.i(bArr, 12);
        this.f14313b = 67108863 & i11;
        int i15 = ((i11 >>> 26) | (i12 << 6)) & 67108611;
        this.f14314c = i15;
        int i16 = ((i12 >>> 20) | (i13 << 12)) & 67092735;
        this.f14315d = i16;
        int i17 = ((i13 >>> 14) | (i14 << 18)) & 66076671;
        this.f14316e = i17;
        int i18 = (i14 >>> 8) & 1048575;
        this.f14317f = i18;
        this.f14318g = i15 * 5;
        this.f14319h = i16 * 5;
        this.f14320i = i17 * 5;
        this.f14321j = i18 * 5;
        org.spongycastle.crypto.e eVar = this.f14312a;
        if (eVar != null) {
            byte[] bArr3 = new byte[16];
            eVar.a(true, new w(bArr, 16, 16));
            this.f14312a.processBlock(bArr2, 0, bArr3, 0);
            i10 = 0;
            bArr = bArr3;
        }
        this.f14322k = Aj.f.i(bArr, i10);
        this.f14323l = Aj.f.i(bArr, i10 + 4);
        this.f14324m = Aj.f.i(bArr, i10 + 8);
        this.f14325n = Aj.f.i(bArr, i10 + 12);
    }

    @Override // org.spongycastle.crypto.v
    public int doFinal(byte[] bArr, int i10) {
        if (i10 + 16 > bArr.length) {
            throw new org.spongycastle.crypto.l("Output buffer is too short.");
        }
        if (this.f14326o > 0) {
            c();
        }
        int i11 = this.f14328q;
        int i12 = this.f14327p;
        int i13 = i11 + (i12 >>> 26);
        int i14 = this.f14329r + (i13 >>> 26);
        int i15 = this.f14330s + (i14 >>> 26);
        int i16 = i14 & 67108863;
        int i17 = this.f14331t + (i15 >>> 26);
        int i18 = i15 & 67108863;
        int i19 = (i12 & 67108863) + ((i17 >>> 26) * 5);
        int i20 = i17 & 67108863;
        int i21 = (i13 & 67108863) + (i19 >>> 26);
        int i22 = i19 & 67108863;
        int i23 = i22 + 5;
        int i24 = (i23 >>> 26) + i21;
        int i25 = (i24 >>> 26) + i16;
        int i26 = (i25 >>> 26) + i18;
        int i27 = 67108863 & i26;
        int i28 = ((i26 >>> 26) + i20) - AudioRoutingController.DEVICE_OUT_USB_HEADSET;
        int i29 = (i28 >>> 31) - 1;
        int i30 = ~i29;
        this.f14327p = (i22 & i30) | (i23 & 67108863 & i29);
        this.f14328q = (i21 & i30) | (i24 & 67108863 & i29);
        this.f14329r = (i16 & i30) | (i25 & 67108863 & i29);
        this.f14330s = (i27 & i29) | (i18 & i30);
        this.f14331t = (i20 & i30) | (i28 & i29);
        long j10 = ((r1 | (r0 << 26)) & BodyPartID.bodyIdMax) + (this.f14322k & BodyPartID.bodyIdMax);
        long j11 = (((r0 >>> 6) | (r3 << 20)) & BodyPartID.bodyIdMax) + (this.f14323l & BodyPartID.bodyIdMax);
        long j12 = (((r3 >>> 12) | (r2 << 14)) & BodyPartID.bodyIdMax) + (this.f14324m & BodyPartID.bodyIdMax);
        long j13 = (((r2 >>> 18) | (r4 << 8)) & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & this.f14325n);
        Aj.f.g((int) j10, bArr, i10);
        long j14 = j11 + (j10 >>> 32);
        Aj.f.g((int) j14, bArr, i10 + 4);
        long j15 = j12 + (j14 >>> 32);
        Aj.f.g((int) j15, bArr, i10 + 8);
        Aj.f.g((int) (j13 + (j15 >>> 32)), bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.spongycastle.crypto.v
    public String getAlgorithmName() {
        if (this.f14312a == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.f14312a.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.v
    public int getMacSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.v
    public void reset() {
        this.f14326o = 0;
        this.f14331t = 0;
        this.f14330s = 0;
        this.f14329r = 0;
        this.f14328q = 0;
        this.f14327p = 0;
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte b10) {
        byte[] bArr = this.singleByte;
        bArr[0] = b10;
        update(bArr, 0, 1);
    }

    @Override // org.spongycastle.crypto.v
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i11 > i12) {
            if (this.f14326o == 16) {
                c();
                this.f14326o = 0;
            }
            int min = Math.min(i11 - i12, 16 - this.f14326o);
            System.arraycopy(bArr, i12 + i10, this.currentBlock, this.f14326o, min);
            i12 += min;
            this.f14326o += min;
        }
    }

    public j(org.spongycastle.crypto.e eVar) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.f14326o = 0;
        if (eVar.getBlockSize() == 16) {
            this.f14312a = eVar;
            return;
        }
        throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
    }
}
