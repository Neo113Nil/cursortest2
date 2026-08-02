package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SipHash implements Mac {

    /* renamed from: c, reason: collision with root package name */
    protected final int f61700c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f61701d;

    /* renamed from: k0, reason: collision with root package name */
    protected long f61702k0;

    /* renamed from: k1, reason: collision with root package name */
    protected long f61703k1;

    /* renamed from: m, reason: collision with root package name */
    protected long f61704m;

    /* renamed from: v0, reason: collision with root package name */
    protected long f61705v0;

    /* renamed from: v1, reason: collision with root package name */
    protected long f61706v1;

    /* renamed from: v2, reason: collision with root package name */
    protected long f61707v2;

    /* renamed from: v3, reason: collision with root package name */
    protected long f61708v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f61704m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f61700c = 2;
        this.f61701d = 4;
    }

    public static long rotateLeft(long j10, int i10) {
        return (j10 >>> (-i10)) | (j10 << i10);
    }

    public void applySipRounds(int i10) {
        long j10 = this.f61705v0;
        long j11 = this.f61706v1;
        long j12 = this.f61707v2;
        long j13 = this.f61708v3;
        for (int i11 = 0; i11 < i10; i11++) {
            long j14 = j10 + j11;
            long j15 = j12 + j13;
            long rotateLeft = rotateLeft(j11, 13) ^ j14;
            long rotateLeft2 = rotateLeft(j13, 16) ^ j15;
            long j16 = j15 + rotateLeft;
            j10 = rotateLeft(j14, 32) + rotateLeft2;
            j11 = rotateLeft(rotateLeft, 17) ^ j16;
            j13 = rotateLeft(rotateLeft2, 21) ^ j10;
            j12 = rotateLeft(j16, 32);
        }
        this.f61705v0 = j10;
        this.f61706v1 = j11;
        this.f61707v2 = j12;
        this.f61708v3 = j13;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        Pack.longToLittleEndian(doFinal(), bArr, i10);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f61700c + "-" + this.f61701d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        this.f61702k0 = Pack.littleEndianToLong(key, 0);
        this.f61703k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.f61708v3 ^= this.f61704m;
        applySipRounds(this.f61700c);
        this.f61705v0 ^= this.f61704m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j10 = this.f61702k0;
        this.f61705v0 = 8317987319222330741L ^ j10;
        long j11 = this.f61703k1;
        this.f61706v1 = 7237128888997146477L ^ j11;
        this.f61707v2 = j10 ^ 7816392313619706465L;
        this.f61708v3 = 8387220255154660723L ^ j11;
        this.f61704m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        this.f61704m = (this.f61704m >>> 8) | ((b10 & 255) << 56);
        int i10 = this.wordPos + 1;
        this.wordPos = i10;
        if (i10 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i10, int i11) {
        this.f61704m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f61700c = i10;
        this.f61701d = i11;
    }

    public long doFinal() {
        this.f61704m = ((this.f61704m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.f61707v2 ^= 255;
        applySipRounds(this.f61701d);
        long j10 = ((this.f61705v0 ^ this.f61706v1) ^ this.f61707v2) ^ this.f61708v3;
        reset();
        return j10;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = i11 & (-8);
        int i13 = this.wordPos;
        char c10 = '8';
        long j10 = 255;
        int i14 = 0;
        if (i13 == 0) {
            while (i14 < i12) {
                this.f61704m = Pack.littleEndianToLong(bArr, i10 + i14);
                processMessageWord();
                i14 += 8;
            }
            while (i14 < i11) {
                long j11 = this.f61704m >>> 8;
                this.f61704m = j11;
                this.f61704m = j11 | ((bArr[i10 + i14] & 255) << 56);
                i14++;
            }
            this.wordPos = i11 - i12;
            return;
        }
        int i15 = i13 << 3;
        int i16 = 0;
        while (i16 < i12) {
            long littleEndianToLong = Pack.littleEndianToLong(bArr, i10 + i16);
            this.f61704m = (this.f61704m >>> (-i15)) | (littleEndianToLong << i15);
            processMessageWord();
            this.f61704m = littleEndianToLong;
            i16 += 8;
            c10 = c10;
            j10 = j10;
        }
        char c11 = c10;
        long j12 = j10;
        while (i16 < i11) {
            long j13 = this.f61704m >>> 8;
            this.f61704m = j13;
            this.f61704m = j13 | ((bArr[i10 + i16] & j12) << c11);
            int i17 = this.wordPos + 1;
            this.wordPos = i17;
            if (i17 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i16++;
        }
    }
}
