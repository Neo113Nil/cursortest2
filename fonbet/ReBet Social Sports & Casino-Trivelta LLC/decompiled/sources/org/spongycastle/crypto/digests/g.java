package org.spongycastle.crypto.digests;

import kotlin.jvm.internal.ByteCompanionObject;

/* loaded from: classes5.dex */
public abstract class g implements org.spongycastle.crypto.q, Aj.d {

    /* renamed from: K, reason: collision with root package name */
    static final long[] f62324K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: W, reason: collision with root package name */
    private long[] f62325W;

    /* renamed from: a, reason: collision with root package name */
    public int f62326a;

    /* renamed from: b, reason: collision with root package name */
    public long f62327b;

    /* renamed from: c, reason: collision with root package name */
    public long f62328c;

    /* renamed from: d, reason: collision with root package name */
    public long f62329d;

    /* renamed from: e, reason: collision with root package name */
    public long f62330e;

    /* renamed from: f, reason: collision with root package name */
    public long f62331f;

    /* renamed from: g, reason: collision with root package name */
    public long f62332g;

    /* renamed from: h, reason: collision with root package name */
    public long f62333h;

    /* renamed from: i, reason: collision with root package name */
    public long f62334i;

    /* renamed from: j, reason: collision with root package name */
    public long f62335j;

    /* renamed from: k, reason: collision with root package name */
    public long f62336k;

    /* renamed from: l, reason: collision with root package name */
    public int f62337l;
    private byte[] xBuf;

    public g() {
        this.xBuf = new byte[8];
        this.f62325W = new long[80];
        this.f62326a = 0;
        reset();
    }

    public final long b(long j10, long j11, long j12) {
        return ((~j10) & j12) ^ (j11 & j10);
    }

    public final long c(long j10, long j11, long j12) {
        return ((j10 & j12) ^ (j10 & j11)) ^ (j11 & j12);
    }

    public final long d(long j10) {
        return (j10 >>> 7) ^ (((j10 << 63) | (j10 >>> 1)) ^ ((j10 << 56) | (j10 >>> 8)));
    }

    public final long e(long j10) {
        return (j10 >>> 6) ^ (((j10 << 45) | (j10 >>> 19)) ^ ((j10 << 3) | (j10 >>> 61)));
    }

    public final long f(long j10) {
        return ((j10 >>> 39) | (j10 << 25)) ^ (((j10 << 36) | (j10 >>> 28)) ^ ((j10 << 30) | (j10 >>> 34)));
    }

    public final long g(long j10) {
        return ((j10 >>> 41) | (j10 << 23)) ^ (((j10 << 50) | (j10 >>> 14)) ^ ((j10 << 46) | (j10 >>> 18)));
    }

    @Override // org.spongycastle.crypto.q
    public int getByteLength() {
        return 128;
    }

    public final void h() {
        long j10 = this.f62327b;
        if (j10 > 2305843009213693951L) {
            this.f62328c += j10 >>> 61;
            this.f62327b = j10 & 2305843009213693951L;
        }
    }

    public void i(g gVar) {
        byte[] bArr = gVar.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.f62326a = gVar.f62326a;
        this.f62327b = gVar.f62327b;
        this.f62328c = gVar.f62328c;
        this.f62329d = gVar.f62329d;
        this.f62330e = gVar.f62330e;
        this.f62331f = gVar.f62331f;
        this.f62332g = gVar.f62332g;
        this.f62333h = gVar.f62333h;
        this.f62334i = gVar.f62334i;
        this.f62335j = gVar.f62335j;
        this.f62336k = gVar.f62336k;
        long[] jArr = gVar.f62325W;
        System.arraycopy(jArr, 0, this.f62325W, 0, jArr.length);
        this.f62337l = gVar.f62337l;
    }

    public void j() {
        h();
        long j10 = this.f62327b << 3;
        long j11 = this.f62328c;
        update(ByteCompanionObject.MIN_VALUE);
        while (this.f62326a != 0) {
            update((byte) 0);
        }
        l(j10, j11);
        k();
    }

    public void k() {
        h();
        for (int i10 = 16; i10 <= 79; i10++) {
            long[] jArr = this.f62325W;
            long e10 = e(jArr[i10 - 2]);
            long[] jArr2 = this.f62325W;
            jArr[i10] = e10 + jArr2[i10 - 7] + d(jArr2[i10 - 15]) + this.f62325W[i10 - 16];
        }
        long j10 = this.f62329d;
        long j11 = this.f62330e;
        long j12 = this.f62331f;
        long j13 = this.f62332g;
        long j14 = this.f62333h;
        long j15 = j13;
        long j16 = this.f62334i;
        int i11 = 0;
        int i12 = 0;
        long j17 = j12;
        long j18 = this.f62335j;
        long j19 = this.f62336k;
        long j20 = j10;
        long j21 = j14;
        long j22 = j11;
        while (i11 < 10) {
            long j23 = j16;
            long j24 = j21;
            long j25 = j18;
            long g10 = g(j21) + b(j21, j23, j18);
            long[] jArr3 = f62324K;
            int i13 = i12 + 1;
            long j26 = j19 + g10 + jArr3[i12] + this.f62325W[i12];
            long j27 = j15 + j26;
            long j28 = j20;
            long j29 = j22;
            long j30 = j17;
            long f10 = j26 + f(j20) + c(j28, j29, j30);
            int i14 = i12 + 2;
            long g11 = j25 + g(j27) + b(j27, j24, j23) + jArr3[i13] + this.f62325W[i13];
            long j31 = j30 + g11;
            long f11 = g11 + f(f10) + c(f10, j28, j29);
            int i15 = i12 + 3;
            long g12 = j23 + g(j31) + b(j31, j27, j24) + jArr3[i14] + this.f62325W[i14];
            long j32 = j29 + g12;
            long f12 = g12 + f(f11) + c(f11, f10, j28);
            int i16 = i12 + 4;
            long g13 = j24 + g(j32) + b(j32, j31, j27) + jArr3[i15] + this.f62325W[i15];
            long j33 = j28 + g13;
            long f13 = g13 + f(f12) + c(f12, f11, f10);
            int i17 = i12 + 5;
            long g14 = j27 + g(j33) + b(j33, j32, j31) + jArr3[i16] + this.f62325W[i16];
            long j34 = f10 + g14;
            long f14 = g14 + f(f13) + c(f13, f12, f11);
            int i18 = i12 + 6;
            long g15 = j31 + g(j34) + b(j34, j33, j32) + jArr3[i17] + this.f62325W[i17];
            long j35 = f11 + g15;
            long f15 = g15 + f(f14) + c(f14, f13, f12);
            int i19 = i12 + 7;
            long g16 = j32 + g(j35) + b(j35, j34, j33) + jArr3[i18] + this.f62325W[i18];
            long j36 = f12 + g16;
            long f16 = g16 + f(f15) + c(f15, f14, f13);
            i12 += 8;
            long g17 = j33 + g(j36) + b(j36, j35, j34) + jArr3[i19] + this.f62325W[i19];
            long j37 = f13 + g17;
            j20 = g17 + f(f16) + c(f16, f15, f14);
            i11++;
            j22 = f16;
            j21 = j37;
            j17 = f15;
            j19 = j34;
            j16 = j36;
            j18 = j35;
            j15 = f14;
        }
        this.f62329d += j20;
        this.f62330e += j22;
        this.f62331f += j17;
        this.f62332g += j15;
        this.f62333h += j21;
        this.f62334i += j16;
        this.f62335j += j18;
        this.f62336k += j19;
        this.f62337l = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.f62325W[i20] = 0;
        }
    }

    public void l(long j10, long j11) {
        if (this.f62337l > 14) {
            k();
        }
        long[] jArr = this.f62325W;
        jArr[14] = j11;
        jArr[15] = j10;
    }

    public void m(byte[] bArr, int i10) {
        this.f62325W[this.f62337l] = Aj.f.c(bArr, i10);
        int i11 = this.f62337l + 1;
        this.f62337l = i11;
        if (i11 == 16) {
            k();
        }
    }

    @Override // org.spongycastle.crypto.o
    public void reset() {
        this.f62327b = 0L;
        this.f62328c = 0L;
        int i10 = 0;
        this.f62326a = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.f62337l = 0;
        while (true) {
            long[] jArr = this.f62325W;
            if (i10 == jArr.length) {
                return;
            }
            jArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte b10) {
        byte[] bArr = this.xBuf;
        int i10 = this.f62326a;
        int i11 = i10 + 1;
        this.f62326a = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            m(bArr, 0);
            this.f62326a = 0;
        }
        this.f62327b++;
    }

    public g(g gVar) {
        this.xBuf = new byte[8];
        this.f62325W = new long[80];
        i(gVar);
    }

    @Override // org.spongycastle.crypto.o
    public void update(byte[] bArr, int i10, int i11) {
        while (this.f62326a != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > this.xBuf.length) {
            m(bArr, i10);
            byte[] bArr2 = this.xBuf;
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.f62327b += bArr2.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
