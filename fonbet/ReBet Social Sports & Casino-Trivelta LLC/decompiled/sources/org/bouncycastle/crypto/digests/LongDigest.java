package org.bouncycastle.crypto.digests;

import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public abstract class LongDigest implements ExtendedDigest, Memoable, EncodableDigest {
    private static final int BYTE_LENGTH = 128;

    /* renamed from: K, reason: collision with root package name */
    static final long[] f61457K = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: H1, reason: collision with root package name */
    protected long f61458H1;

    /* renamed from: H2, reason: collision with root package name */
    protected long f61459H2;

    /* renamed from: H3, reason: collision with root package name */
    protected long f61460H3;

    /* renamed from: H4, reason: collision with root package name */
    protected long f61461H4;

    /* renamed from: H5, reason: collision with root package name */
    protected long f61462H5;

    /* renamed from: H6, reason: collision with root package name */
    protected long f61463H6;

    /* renamed from: H7, reason: collision with root package name */
    protected long f61464H7;

    /* renamed from: H8, reason: collision with root package name */
    protected long f61465H8;

    /* renamed from: W, reason: collision with root package name */
    private long[] f61466W;
    private long byteCount1;
    private long byteCount2;
    private int wOff;
    private byte[] xBuf;
    private int xBufOff;

    public LongDigest() {
        this.xBuf = new byte[8];
        this.f61466W = new long[80];
        this.xBufOff = 0;
        reset();
    }

    private long Ch(long j10, long j11, long j12) {
        return ((~j10) & j12) ^ (j11 & j10);
    }

    private long Maj(long j10, long j11, long j12) {
        return ((j10 & j12) ^ (j10 & j11)) ^ (j11 & j12);
    }

    private long Sigma0(long j10) {
        return (j10 >>> 7) ^ (((j10 << 63) | (j10 >>> 1)) ^ ((j10 << 56) | (j10 >>> 8)));
    }

    private long Sigma1(long j10) {
        return (j10 >>> 6) ^ (((j10 << 45) | (j10 >>> 19)) ^ ((j10 << 3) | (j10 >>> 61)));
    }

    private long Sum0(long j10) {
        return ((j10 >>> 39) | (j10 << 25)) ^ (((j10 << 36) | (j10 >>> 28)) ^ ((j10 << 30) | (j10 >>> 34)));
    }

    private long Sum1(long j10) {
        return ((j10 >>> 41) | (j10 << 23)) ^ (((j10 << 50) | (j10 >>> 14)) ^ ((j10 << 46) | (j10 >>> 18)));
    }

    private void adjustByteCounts() {
        long j10 = this.byteCount1;
        if (j10 > 2305843009213693951L) {
            this.byteCount2 += j10 >>> 61;
            this.byteCount1 = j10 & 2305843009213693951L;
        }
    }

    public void copyIn(LongDigest longDigest) {
        byte[] bArr = longDigest.xBuf;
        System.arraycopy(bArr, 0, this.xBuf, 0, bArr.length);
        this.xBufOff = longDigest.xBufOff;
        this.byteCount1 = longDigest.byteCount1;
        this.byteCount2 = longDigest.byteCount2;
        this.f61458H1 = longDigest.f61458H1;
        this.f61459H2 = longDigest.f61459H2;
        this.f61460H3 = longDigest.f61460H3;
        this.f61461H4 = longDigest.f61461H4;
        this.f61462H5 = longDigest.f61462H5;
        this.f61463H6 = longDigest.f61463H6;
        this.f61464H7 = longDigest.f61464H7;
        this.f61465H8 = longDigest.f61465H8;
        long[] jArr = longDigest.f61466W;
        System.arraycopy(jArr, 0, this.f61466W, 0, jArr.length);
        this.wOff = longDigest.wOff;
    }

    public void finish() {
        adjustByteCounts();
        long j10 = this.byteCount1 << 3;
        long j11 = this.byteCount2;
        byte b10 = ByteCompanionObject.MIN_VALUE;
        while (true) {
            update(b10);
            if (this.xBufOff == 0) {
                processLength(j10, j11);
                processBlock();
                return;
            }
            b10 = 0;
        }
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 128;
    }

    public int getEncodedStateSize() {
        return (this.wOff * 8) + 96;
    }

    public void populateState(byte[] bArr) {
        System.arraycopy(this.xBuf, 0, bArr, 0, this.xBufOff);
        Pack.intToBigEndian(this.xBufOff, bArr, 8);
        Pack.longToBigEndian(this.byteCount1, bArr, 12);
        Pack.longToBigEndian(this.byteCount2, bArr, 20);
        Pack.longToBigEndian(this.f61458H1, bArr, 28);
        Pack.longToBigEndian(this.f61459H2, bArr, 36);
        Pack.longToBigEndian(this.f61460H3, bArr, 44);
        Pack.longToBigEndian(this.f61461H4, bArr, 52);
        Pack.longToBigEndian(this.f61462H5, bArr, 60);
        Pack.longToBigEndian(this.f61463H6, bArr, 68);
        Pack.longToBigEndian(this.f61464H7, bArr, 76);
        Pack.longToBigEndian(this.f61465H8, bArr, 84);
        Pack.intToBigEndian(this.wOff, bArr, 92);
        for (int i10 = 0; i10 < this.wOff; i10++) {
            Pack.longToBigEndian(this.f61466W[i10], bArr, (i10 * 8) + 96);
        }
    }

    public void processBlock() {
        adjustByteCounts();
        for (int i10 = 16; i10 <= 79; i10++) {
            long[] jArr = this.f61466W;
            long Sigma1 = Sigma1(jArr[i10 - 2]);
            long[] jArr2 = this.f61466W;
            jArr[i10] = Sigma1 + jArr2[i10 - 7] + Sigma0(jArr2[i10 - 15]) + this.f61466W[i10 - 16];
        }
        long j10 = this.f61458H1;
        long j11 = this.f61459H2;
        long j12 = this.f61460H3;
        long j13 = this.f61461H4;
        long j14 = this.f61462H5;
        long j15 = j13;
        long j16 = this.f61463H6;
        int i11 = 0;
        int i12 = 0;
        long j17 = j12;
        long j18 = this.f61464H7;
        long j19 = this.f61465H8;
        long j20 = j10;
        long j21 = j14;
        long j22 = j11;
        while (i11 < 10) {
            long j23 = j16;
            long j24 = j21;
            long j25 = j18;
            long Sum1 = Sum1(j21) + Ch(j21, j23, j18);
            long[] jArr3 = f61457K;
            int i13 = i12 + 1;
            long j26 = j19 + Sum1 + jArr3[i12] + this.f61466W[i12];
            long j27 = j15 + j26;
            long j28 = j20;
            long j29 = j22;
            long j30 = j17;
            long Sum0 = j26 + Sum0(j20) + Maj(j28, j29, j30);
            int i14 = i12 + 2;
            long Sum12 = j25 + Sum1(j27) + Ch(j27, j24, j23) + jArr3[i13] + this.f61466W[i13];
            long j31 = j30 + Sum12;
            long Sum02 = Sum12 + Sum0(Sum0) + Maj(Sum0, j28, j29);
            int i15 = i12 + 3;
            long Sum13 = j23 + Sum1(j31) + Ch(j31, j27, j24) + jArr3[i14] + this.f61466W[i14];
            long j32 = j29 + Sum13;
            long Sum03 = Sum13 + Sum0(Sum02) + Maj(Sum02, Sum0, j28);
            int i16 = i12 + 4;
            long Sum14 = j24 + Sum1(j32) + Ch(j32, j31, j27) + jArr3[i15] + this.f61466W[i15];
            long j33 = j28 + Sum14;
            long Sum04 = Sum14 + Sum0(Sum03) + Maj(Sum03, Sum02, Sum0);
            int i17 = i12 + 5;
            long Sum15 = j27 + Sum1(j33) + Ch(j33, j32, j31) + jArr3[i16] + this.f61466W[i16];
            long j34 = Sum0 + Sum15;
            long Sum05 = Sum15 + Sum0(Sum04) + Maj(Sum04, Sum03, Sum02);
            int i18 = i12 + 6;
            long Sum16 = j31 + Sum1(j34) + Ch(j34, j33, j32) + jArr3[i17] + this.f61466W[i17];
            long j35 = Sum02 + Sum16;
            long Sum06 = Sum16 + Sum0(Sum05) + Maj(Sum05, Sum04, Sum03);
            int i19 = i12 + 7;
            long Sum17 = j32 + Sum1(j35) + Ch(j35, j34, j33) + jArr3[i18] + this.f61466W[i18];
            long j36 = Sum03 + Sum17;
            long Sum07 = Sum17 + Sum0(Sum06) + Maj(Sum06, Sum05, Sum04);
            i12 += 8;
            long Sum18 = j33 + Sum1(j36) + Ch(j36, j35, j34) + jArr3[i19] + this.f61466W[i19];
            long j37 = Sum04 + Sum18;
            j20 = Sum18 + Sum0(Sum07) + Maj(Sum07, Sum06, Sum05);
            i11++;
            j22 = Sum07;
            j21 = j37;
            j17 = Sum06;
            j19 = j34;
            j16 = j36;
            j18 = j35;
            j15 = Sum05;
        }
        this.f61458H1 += j20;
        this.f61459H2 += j22;
        this.f61460H3 += j17;
        this.f61461H4 += j15;
        this.f61462H5 += j21;
        this.f61463H6 += j16;
        this.f61464H7 += j18;
        this.f61465H8 += j19;
        this.wOff = 0;
        for (int i20 = 0; i20 < 16; i20++) {
            this.f61466W[i20] = 0;
        }
    }

    public void processLength(long j10, long j11) {
        if (this.wOff > 14) {
            processBlock();
        }
        long[] jArr = this.f61466W;
        jArr[14] = j11;
        jArr[15] = j10;
    }

    public void processWord(byte[] bArr, int i10) {
        this.f61466W[this.wOff] = Pack.bigEndianToLong(bArr, i10);
        int i11 = this.wOff + 1;
        this.wOff = i11;
        if (i11 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.byteCount1 = 0L;
        this.byteCount2 = 0L;
        int i10 = 0;
        this.xBufOff = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.xBuf;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = 0;
            i11++;
        }
        this.wOff = 0;
        while (true) {
            long[] jArr = this.f61466W;
            if (i10 == jArr.length) {
                return;
            }
            jArr[i10] = 0;
            i10++;
        }
    }

    public void restoreState(byte[] bArr) {
        int bigEndianToInt = Pack.bigEndianToInt(bArr, 8);
        this.xBufOff = bigEndianToInt;
        System.arraycopy(bArr, 0, this.xBuf, 0, bigEndianToInt);
        this.byteCount1 = Pack.bigEndianToLong(bArr, 12);
        this.byteCount2 = Pack.bigEndianToLong(bArr, 20);
        this.f61458H1 = Pack.bigEndianToLong(bArr, 28);
        this.f61459H2 = Pack.bigEndianToLong(bArr, 36);
        this.f61460H3 = Pack.bigEndianToLong(bArr, 44);
        this.f61461H4 = Pack.bigEndianToLong(bArr, 52);
        this.f61462H5 = Pack.bigEndianToLong(bArr, 60);
        this.f61463H6 = Pack.bigEndianToLong(bArr, 68);
        this.f61464H7 = Pack.bigEndianToLong(bArr, 76);
        this.f61465H8 = Pack.bigEndianToLong(bArr, 84);
        this.wOff = Pack.bigEndianToInt(bArr, 92);
        for (int i10 = 0; i10 < this.wOff; i10++) {
            this.f61466W[i10] = Pack.bigEndianToLong(bArr, (i10 * 8) + 96);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        byte[] bArr = this.xBuf;
        int i10 = this.xBufOff;
        int i11 = i10 + 1;
        this.xBufOff = i11;
        bArr[i10] = b10;
        if (i11 == bArr.length) {
            processWord(bArr, 0);
            this.xBufOff = 0;
        }
        this.byteCount1++;
    }

    public LongDigest(LongDigest longDigest) {
        this.xBuf = new byte[8];
        this.f61466W = new long[80];
        copyIn(longDigest);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (this.xBufOff != 0 && i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
        while (i11 > this.xBuf.length) {
            processWord(bArr, i10);
            byte[] bArr2 = this.xBuf;
            i10 += bArr2.length;
            i11 -= bArr2.length;
            this.byteCount1 += bArr2.length;
        }
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
