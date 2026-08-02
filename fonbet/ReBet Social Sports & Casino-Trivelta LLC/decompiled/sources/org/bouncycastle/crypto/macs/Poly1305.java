package org.bouncycastle.crypto.macs;

import io.agora.rtc2.internal.AudioRoutingController;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;

    /* renamed from: h0, reason: collision with root package name */
    private int f61682h0;

    /* renamed from: h1, reason: collision with root package name */
    private int f61683h1;

    /* renamed from: h2, reason: collision with root package name */
    private int f61684h2;

    /* renamed from: h3, reason: collision with root package name */
    private int f61685h3;

    /* renamed from: h4, reason: collision with root package name */
    private int f61686h4;

    /* renamed from: k0, reason: collision with root package name */
    private int f61687k0;

    /* renamed from: k1, reason: collision with root package name */
    private int f61688k1;

    /* renamed from: k2, reason: collision with root package name */
    private int f61689k2;

    /* renamed from: k3, reason: collision with root package name */
    private int f61690k3;

    /* renamed from: r0, reason: collision with root package name */
    private int f61691r0;

    /* renamed from: r1, reason: collision with root package name */
    private int f61692r1;

    /* renamed from: r2, reason: collision with root package name */
    private int f61693r2;

    /* renamed from: r3, reason: collision with root package name */
    private int f61694r3;

    /* renamed from: r4, reason: collision with root package name */
    private int f61695r4;

    /* renamed from: s1, reason: collision with root package name */
    private int f61696s1;

    /* renamed from: s2, reason: collision with root package name */
    private int f61697s2;

    /* renamed from: s3, reason: collision with root package name */
    private int f61698s3;

    /* renamed from: s4, reason: collision with root package name */
    private int f61699s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i10, int i11) {
        return (i10 & BodyPartID.bodyIdMax) * i11;
    }

    private void processBlock() {
        int i10 = this.currentBlockOffset;
        if (i10 < 16) {
            this.currentBlock[i10] = 1;
            for (int i11 = i10 + 1; i11 < 16; i11++) {
                this.currentBlock[i11] = 0;
            }
        }
        long littleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j10 = littleEndianToInt & BodyPartID.bodyIdMax;
        long littleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & BodyPartID.bodyIdMax;
        long littleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & BodyPartID.bodyIdMax;
        long littleEndianToInt4 = BodyPartID.bodyIdMax & Pack.littleEndianToInt(this.currentBlock, 12);
        int i12 = (int) (this.f61682h0 + (littleEndianToInt & 67108863));
        this.f61682h0 = i12;
        this.f61683h1 = (int) (this.f61683h1 + ((((littleEndianToInt2 << 32) | j10) >>> 26) & 67108863));
        this.f61684h2 = (int) (this.f61684h2 + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f61685h3 = (int) (this.f61685h3 + ((((littleEndianToInt4 << 32) | littleEndianToInt3) >>> 14) & 67108863));
        int i13 = (int) (this.f61686h4 + (littleEndianToInt4 >>> 8));
        this.f61686h4 = i13;
        if (this.currentBlockOffset == 16) {
            this.f61686h4 = i13 + 16777216;
        }
        long mul32x32_64 = mul32x32_64(i12, this.f61691r0) + mul32x32_64(this.f61683h1, this.f61699s4) + mul32x32_64(this.f61684h2, this.f61698s3) + mul32x32_64(this.f61685h3, this.f61697s2) + mul32x32_64(this.f61686h4, this.f61696s1);
        long mul32x32_642 = mul32x32_64(this.f61682h0, this.f61692r1) + mul32x32_64(this.f61683h1, this.f61691r0) + mul32x32_64(this.f61684h2, this.f61699s4) + mul32x32_64(this.f61685h3, this.f61698s3) + mul32x32_64(this.f61686h4, this.f61697s2);
        long mul32x32_643 = mul32x32_64(this.f61682h0, this.f61693r2) + mul32x32_64(this.f61683h1, this.f61692r1) + mul32x32_64(this.f61684h2, this.f61691r0) + mul32x32_64(this.f61685h3, this.f61699s4) + mul32x32_64(this.f61686h4, this.f61698s3);
        long mul32x32_644 = mul32x32_64(this.f61682h0, this.f61694r3) + mul32x32_64(this.f61683h1, this.f61693r2) + mul32x32_64(this.f61684h2, this.f61692r1) + mul32x32_64(this.f61685h3, this.f61691r0) + mul32x32_64(this.f61686h4, this.f61699s4);
        long mul32x32_645 = mul32x32_64(this.f61682h0, this.f61695r4) + mul32x32_64(this.f61683h1, this.f61694r3) + mul32x32_64(this.f61684h2, this.f61693r2) + mul32x32_64(this.f61685h3, this.f61692r1) + mul32x32_64(this.f61686h4, this.f61691r0);
        long j11 = mul32x32_642 + (mul32x32_64 >>> 26);
        long j12 = mul32x32_643 + (j11 >>> 26);
        this.f61684h2 = ((int) j12) & 67108863;
        long j13 = mul32x32_644 + (j12 >>> 26);
        this.f61685h3 = ((int) j13) & 67108863;
        long j14 = mul32x32_645 + (j13 >>> 26);
        this.f61686h4 = ((int) j14) & 67108863;
        int i14 = (((int) mul32x32_64) & 67108863) + (((int) (j14 >>> 26)) * 5);
        this.f61683h1 = (((int) j11) & 67108863) + (i14 >>> 26);
        this.f61682h0 = i14 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i10 = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f61691r0 = 67108863 & littleEndianToInt;
        int i11 = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
        this.f61692r1 = i11;
        int i12 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
        this.f61693r2 = i12;
        int i13 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
        this.f61694r3 = i13;
        int i14 = (littleEndianToInt4 >>> 8) & 1048575;
        this.f61695r4 = i14;
        this.f61696s1 = i11 * 5;
        this.f61697s2 = i12 * 5;
        this.f61698s3 = i13 * 5;
        this.f61699s4 = i14 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i10 = 0;
            bArr = bArr3;
        }
        this.f61687k0 = Pack.littleEndianToInt(bArr, i10);
        this.f61688k1 = Pack.littleEndianToInt(bArr, i10 + 4);
        this.f61689k2 = Pack.littleEndianToInt(bArr, i10 + 8);
        this.f61690k3 = Pack.littleEndianToInt(bArr, i10 + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i10) {
        if (i10 + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i11 = this.f61683h1;
        int i12 = this.f61682h0;
        int i13 = i11 + (i12 >>> 26);
        int i14 = this.f61684h2 + (i13 >>> 26);
        int i15 = this.f61685h3 + (i14 >>> 26);
        int i16 = i14 & 67108863;
        int i17 = this.f61686h4 + (i15 >>> 26);
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
        this.f61682h0 = (i22 & i30) | (i23 & 67108863 & i29);
        this.f61683h1 = (i21 & i30) | (i24 & 67108863 & i29);
        this.f61684h2 = (i16 & i30) | (i25 & 67108863 & i29);
        this.f61685h3 = (i27 & i29) | (i18 & i30);
        this.f61686h4 = (i20 & i30) | (i28 & i29);
        long j10 = ((r1 | (r0 << 26)) & BodyPartID.bodyIdMax) + (this.f61687k0 & BodyPartID.bodyIdMax);
        long j11 = (((r0 >>> 6) | (r3 << 20)) & BodyPartID.bodyIdMax) + (this.f61688k1 & BodyPartID.bodyIdMax);
        long j12 = (((r3 >>> 12) | (r2 << 14)) & BodyPartID.bodyIdMax) + (this.f61689k2 & BodyPartID.bodyIdMax);
        long j13 = (((r2 >>> 18) | (r4 << 8)) & BodyPartID.bodyIdMax) + (BodyPartID.bodyIdMax & this.f61690k3);
        Pack.intToLittleEndian((int) j10, bArr, i10);
        long j14 = j11 + (j10 >>> 32);
        Pack.intToLittleEndian((int) j14, bArr, i10 + 4);
        long j15 = j12 + (j14 >>> 32);
        Pack.intToLittleEndian((int) j15, bArr, i10 + 8);
        Pack.intToLittleEndian((int) (j13 + (j15 >>> 32)), bArr, i10 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        byte[] bArr;
        if (this.cipher == null) {
            bArr = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), bArr);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.f61686h4 = 0;
        this.f61685h3 = 0;
        this.f61684h2 = 0;
        this.f61683h1 = 0;
        this.f61682h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b10) {
        byte[] bArr = this.singleByte;
        bArr[0] = b10;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i11 > i12) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int min = Math.min(i11 - i12, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i12 + i10, this.currentBlock, this.currentBlockOffset, min);
            i12 += min;
            this.currentBlockOffset += min;
        }
    }
}
