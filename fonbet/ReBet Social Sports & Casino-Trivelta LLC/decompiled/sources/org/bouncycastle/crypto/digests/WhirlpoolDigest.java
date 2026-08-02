package org.bouncycastle.crypto.digests;

import com.plaid.internal.EnumC3631g;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Memoable;

/* loaded from: classes5.dex */
public final class WhirlpoolDigest implements ExtendedDigest, Memoable {
    private static final int BITCOUNT_ARRAY_SIZE = 32;
    private static final int BYTE_LENGTH = 64;
    private static final int DIGEST_LENGTH_BYTES = 64;
    private static final short[] EIGHT;
    private static final int REDUCTION_POLYNOMIAL = 285;
    private static final int ROUNDS = 10;
    private long[] _K;
    private long[] _L;
    private short[] _bitCount;
    private long[] _block;
    private byte[] _buffer;
    private int _bufferPos;
    private long[] _hash;
    private final long[] _rc;
    private long[] _state;
    private static final int[] SBOX = {24, 35, EnumC3631g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 1, 79, 54, EnumC3631g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 121, 111, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 82, 96, 188, 155, EnumC3631g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 12, 123, 53, 29, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, 215, EnumC3631g.SDK_ASSET_ICON_EXTERNAL_VALUE, 46, 75, 254, 87, 21, 119, 55, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 74, 218, 88, 201, 41, 10, EnumC3631g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 107, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 93, 16, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 203, 62, 5, 103, EnumC3631g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 39, 65, EnumC3631g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 167, 125, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 216, 251, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 102, EnumC3631g.SDK_ASSET_ICON_SUBMIT_VALUE, 23, 71, EnumC3631g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 202, 45, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 7, EnumC3631g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 90, 131, 51, 99, 2, EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 113, 200, 25, 73, 217, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 91, 136, EnumC3631g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 38, 50, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 15, EnumC3631g.SDK_ASSET_ICON_PAUSE_VALUE, 128, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 205, 52, 72, 255, 122, 144, 95, 32, 104, 26, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 180, 84, 147, 34, 100, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 115, 18, 64, 8, EnumC3631g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC3631g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 61, 151, 0, EnumC3631g.SDK_ASSET_ICON_COMMENT_VALUE, 43, 118, 130, EnumC3631g.SDK_ASSET_ICON_PIN_VALUE, 27, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 106, 80, 69, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 48, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 63, 85, EnumC3631g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 101, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 47, 192, EnumC3631g.SDK_ASSET_ICON_SUBTRACT_VALUE, 28, 253, 77, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 117, 6, EnumC3631g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 14, 31, 98, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, 37, 89, EnumC3631g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 114, 57, 76, 94, 120, 56, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, EnumC3631g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 165, EnumC3631g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, 97, EnumC3631g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, 33, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, 30, 67, EnumC3631g.SDK_ASSET_ICON_CANCEL_VALUE, 252, 4, 81, EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, 109, 13, 250, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 126, 36, 59, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 206, 17, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 78, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 60, EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, 19, 44, 211, EnumC3631g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 110, EnumC3631g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 3, 86, 68, 127, EnumC3631g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 42, EnumC3631g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 83, EnumC3631g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 11, 157, 108, 49, 116, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 70, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 20, 225, 22, 58, 105, 9, 112, EnumC3631g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 208, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 204, 66, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 40, 92, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 134};

    /* renamed from: C0, reason: collision with root package name */
    private static final long[] f61553C0 = new long[256];

    /* renamed from: C1, reason: collision with root package name */
    private static final long[] f61554C1 = new long[256];

    /* renamed from: C2, reason: collision with root package name */
    private static final long[] f61555C2 = new long[256];

    /* renamed from: C3, reason: collision with root package name */
    private static final long[] f61556C3 = new long[256];

    /* renamed from: C4, reason: collision with root package name */
    private static final long[] f61557C4 = new long[256];

    /* renamed from: C5, reason: collision with root package name */
    private static final long[] f61558C5 = new long[256];

    /* renamed from: C6, reason: collision with root package name */
    private static final long[] f61559C6 = new long[256];

    /* renamed from: C7, reason: collision with root package name */
    private static final long[] f61560C7 = new long[256];

    static {
        short[] sArr = new short[32];
        EIGHT = sArr;
        sArr[31] = 8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, org.bouncycastle.crypto.digests.WhirlpoolDigest] */
    public WhirlpoolDigest() {
        ?? obj = new Object();
        obj._rc = new long[11];
        obj._buffer = new byte[64];
        obj._bufferPos = 0;
        obj._bitCount = new short[32];
        obj._hash = new long[8];
        obj._K = new long[8];
        obj._L = new long[8];
        obj._block = new long[8];
        obj._state = new long[8];
        int i10 = 0;
        WhirlpoolDigest whirlpoolDigest = obj;
        while (i10 < 256) {
            int i11 = SBOX[i10];
            int maskWithReductionPolynomial = whirlpoolDigest.maskWithReductionPolynomial(i11 << 1);
            int maskWithReductionPolynomial2 = whirlpoolDigest.maskWithReductionPolynomial(maskWithReductionPolynomial << 1);
            int i12 = maskWithReductionPolynomial2 ^ i11;
            int maskWithReductionPolynomial3 = whirlpoolDigest.maskWithReductionPolynomial(maskWithReductionPolynomial2 << 1);
            int i13 = maskWithReductionPolynomial3 ^ i11;
            f61553C0[i10] = whirlpoolDigest.packIntoLong(i11, i11, maskWithReductionPolynomial2, i11, maskWithReductionPolynomial3, i12, maskWithReductionPolynomial, i13);
            f61554C1[i10] = packIntoLong(i13, i11, i11, maskWithReductionPolynomial2, i11, maskWithReductionPolynomial3, i12, maskWithReductionPolynomial);
            f61555C2[i10] = packIntoLong(maskWithReductionPolynomial, i13, i11, i11, maskWithReductionPolynomial2, i11, maskWithReductionPolynomial3, i12);
            f61556C3[i10] = packIntoLong(i12, maskWithReductionPolynomial, i13, i11, i11, maskWithReductionPolynomial2, i11, maskWithReductionPolynomial3);
            f61557C4[i10] = packIntoLong(maskWithReductionPolynomial3, i12, maskWithReductionPolynomial, i13, i11, i11, maskWithReductionPolynomial2, i11);
            f61558C5[i10] = packIntoLong(i11, maskWithReductionPolynomial3, i12, maskWithReductionPolynomial, i13, i11, i11, maskWithReductionPolynomial2);
            f61559C6[i10] = packIntoLong(maskWithReductionPolynomial2, i11, maskWithReductionPolynomial3, i12, maskWithReductionPolynomial, i13, i11, i11);
            WhirlpoolDigest whirlpoolDigest2 = this;
            f61560C7[i10] = whirlpoolDigest2.packIntoLong(i11, maskWithReductionPolynomial2, i11, maskWithReductionPolynomial3, i12, maskWithReductionPolynomial, i13, i11);
            i10++;
            whirlpoolDigest = whirlpoolDigest2;
        }
        whirlpoolDigest._rc[0] = 0;
        for (int i14 = 1; i14 <= 10; i14++) {
            int i15 = (i14 - 1) * 8;
            whirlpoolDigest._rc[i14] = (((((((f61553C0[i15] & (-72057594037927936L)) ^ (f61554C1[i15 + 1] & 71776119061217280L)) ^ (f61555C2[i15 + 2] & 280375465082880L)) ^ (f61556C3[i15 + 3] & 1095216660480L)) ^ (f61557C4[i15 + 4] & 4278190080L)) ^ (f61558C5[i15 + 5] & 16711680)) ^ (f61559C6[i15 + 6] & 65280)) ^ (f61560C7[i15 + 7] & 255);
        }
    }

    private long bytesToLongFromBuffer(byte[] bArr, int i10) {
        return (bArr[i10 + 7] & 255) | ((bArr[i10] & 255) << 56) | ((bArr[i10 + 1] & 255) << 48) | ((bArr[i10 + 2] & 255) << 40) | ((bArr[i10 + 3] & 255) << 32) | ((bArr[i10 + 4] & 255) << 24) | ((bArr[i10 + 5] & 255) << 16) | ((bArr[i10 + 6] & 255) << 8);
    }

    private void convertLongToByteArray(long j10, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr[i10 + i11] = (byte) ((j10 >> (56 - (i11 * 8))) & 255);
        }
    }

    private byte[] copyBitLength() {
        byte[] bArr = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = (byte) (this._bitCount[i10] & 255);
        }
        return bArr;
    }

    private void finish() {
        byte[] copyBitLength = copyBitLength();
        byte[] bArr = this._buffer;
        int i10 = this._bufferPos;
        int i11 = i10 + 1;
        this._bufferPos = i11;
        bArr[i10] = (byte) (bArr[i10] | ByteCompanionObject.MIN_VALUE);
        if (i11 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        if (this._bufferPos > 32) {
            while (this._bufferPos != 0) {
                update((byte) 0);
            }
        }
        while (this._bufferPos <= 32) {
            update((byte) 0);
        }
        System.arraycopy(copyBitLength, 0, this._buffer, 32, copyBitLength.length);
        processFilledBuffer(this._buffer, 0);
    }

    private void increment() {
        int i10 = 0;
        for (int length = this._bitCount.length - 1; length >= 0; length--) {
            short[] sArr = this._bitCount;
            int i11 = (sArr[length] & 255) + EIGHT[length] + i10;
            i10 = i11 >>> 8;
            sArr[length] = (short) (i11 & 255);
        }
    }

    private int maskWithReductionPolynomial(int i10) {
        return ((long) i10) >= 256 ? i10 ^ 285 : i10;
    }

    private long packIntoLong(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return (((((((i11 << 48) ^ (i10 << 56)) ^ (i12 << 40)) ^ (i13 << 32)) ^ (i14 << 24)) ^ (i15 << 16)) ^ (i16 << 8)) ^ i17;
    }

    private void processFilledBuffer(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this._state.length; i11++) {
            this._block[i11] = bytesToLongFromBuffer(this._buffer, i11 * 8);
        }
        processBlock();
        this._bufferPos = 0;
        Arrays.fill(this._buffer, (byte) 0);
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new WhirlpoolDigest(this);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) {
        finish();
        for (int i11 = 0; i11 < 8; i11++) {
            convertLongToByteArray(this._hash[i11], bArr, (i11 * 8) + i10);
        }
        reset();
        return getDigestSize();
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "Whirlpool";
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 64;
    }

    public void processBlock() {
        char c10;
        char c11;
        for (int i10 = 0; i10 < 8; i10++) {
            long[] jArr = this._state;
            long j10 = this._block[i10];
            long[] jArr2 = this._K;
            long j11 = this._hash[i10];
            jArr2[i10] = j11;
            jArr[i10] = j10 ^ j11;
        }
        for (int i11 = 1; i11 <= 10; i11++) {
            int i12 = 0;
            while (true) {
                c10 = ' ';
                c11 = '(';
                if (i12 >= 8) {
                    break;
                }
                long[] jArr3 = this._L;
                jArr3[i12] = 0;
                long[] jArr4 = f61553C0;
                long[] jArr5 = this._K;
                long j12 = jArr4[((int) (jArr5[i12 & 7] >>> 56)) & 255];
                jArr3[i12] = j12;
                long j13 = f61554C1[((int) (jArr5[(i12 - 1) & 7] >>> 48)) & 255] ^ j12;
                jArr3[i12] = j13;
                long j14 = j13 ^ f61555C2[((int) (jArr5[(i12 - 2) & 7] >>> 40)) & 255];
                jArr3[i12] = j14;
                long j15 = j14 ^ f61556C3[((int) (jArr5[(i12 - 3) & 7] >>> 32)) & 255];
                jArr3[i12] = j15;
                long j16 = j15 ^ f61557C4[((int) (jArr5[(i12 - 4) & 7] >>> 24)) & 255];
                jArr3[i12] = j16;
                long j17 = j16 ^ f61558C5[((int) (jArr5[(i12 - 5) & 7] >>> 16)) & 255];
                jArr3[i12] = j17;
                long j18 = j17 ^ f61559C6[((int) (jArr5[(i12 - 6) & 7] >>> 8)) & 255];
                jArr3[i12] = j18;
                jArr3[i12] = j18 ^ f61560C7[((int) jArr5[(i12 - 7) & 7]) & 255];
                i12++;
            }
            long[] jArr6 = this._L;
            long[] jArr7 = this._K;
            System.arraycopy(jArr6, 0, jArr7, 0, jArr7.length);
            long[] jArr8 = this._K;
            jArr8[0] = jArr8[0] ^ this._rc[i11];
            int i13 = 0;
            while (i13 < 8) {
                long[] jArr9 = this._L;
                long j19 = this._K[i13];
                jArr9[i13] = j19;
                long[] jArr10 = f61553C0;
                long[] jArr11 = this._state;
                char c12 = c10;
                char c13 = c11;
                long j20 = j19 ^ jArr10[((int) (jArr11[i13 & 7] >>> 56)) & 255];
                jArr9[i13] = j20;
                long j21 = j20 ^ f61554C1[((int) (jArr11[(i13 - 1) & 7] >>> 48)) & 255];
                jArr9[i13] = j21;
                long j22 = j21 ^ f61555C2[((int) (jArr11[(i13 - 2) & 7] >>> c13)) & 255];
                jArr9[i13] = j22;
                long j23 = j22 ^ f61556C3[((int) (jArr11[(i13 - 3) & 7] >>> c12)) & 255];
                jArr9[i13] = j23;
                long j24 = j23 ^ f61557C4[((int) (jArr11[(i13 - 4) & 7] >>> 24)) & 255];
                jArr9[i13] = j24;
                long j25 = j24 ^ f61558C5[((int) (jArr11[(i13 - 5) & 7] >>> 16)) & 255];
                jArr9[i13] = j25;
                long j26 = j25 ^ f61559C6[((int) (jArr11[(i13 - 6) & 7] >>> 8)) & 255];
                jArr9[i13] = j26;
                jArr9[i13] = j26 ^ f61560C7[((int) jArr11[(i13 - 7) & 7]) & 255];
                i13++;
                c11 = c13;
                c10 = c12;
            }
            long[] jArr12 = this._L;
            long[] jArr13 = this._state;
            System.arraycopy(jArr12, 0, jArr13, 0, jArr13.length);
        }
        for (int i14 = 0; i14 < 8; i14++) {
            long[] jArr14 = this._hash;
            jArr14[i14] = jArr14[i14] ^ (this._state[i14] ^ this._block[i14]);
        }
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this._bufferPos = 0;
        Arrays.fill(this._bitCount, (short) 0);
        Arrays.fill(this._buffer, (byte) 0);
        Arrays.fill(this._hash, 0L);
        Arrays.fill(this._K, 0L);
        Arrays.fill(this._L, 0L);
        Arrays.fill(this._block, 0L);
        Arrays.fill(this._state, 0L);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) {
        byte[] bArr = this._buffer;
        int i10 = this._bufferPos;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this._bufferPos = i11;
        if (i11 == bArr.length) {
            processFilledBuffer(bArr, 0);
        }
        increment();
    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpoolDigest) {
        this._rc = new long[11];
        this._buffer = new byte[64];
        this._bufferPos = 0;
        this._bitCount = new short[32];
        this._hash = new long[8];
        this._K = new long[8];
        this._L = new long[8];
        this._block = new long[8];
        this._state = new long[8];
        reset(whirlpoolDigest);
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        WhirlpoolDigest whirlpoolDigest = (WhirlpoolDigest) memoable;
        long[] jArr = whirlpoolDigest._rc;
        long[] jArr2 = this._rc;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        byte[] bArr = whirlpoolDigest._buffer;
        byte[] bArr2 = this._buffer;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this._bufferPos = whirlpoolDigest._bufferPos;
        short[] sArr = whirlpoolDigest._bitCount;
        short[] sArr2 = this._bitCount;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        long[] jArr3 = whirlpoolDigest._hash;
        long[] jArr4 = this._hash;
        System.arraycopy(jArr3, 0, jArr4, 0, jArr4.length);
        long[] jArr5 = whirlpoolDigest._K;
        long[] jArr6 = this._K;
        System.arraycopy(jArr5, 0, jArr6, 0, jArr6.length);
        long[] jArr7 = whirlpoolDigest._L;
        long[] jArr8 = this._L;
        System.arraycopy(jArr7, 0, jArr8, 0, jArr8.length);
        long[] jArr9 = whirlpoolDigest._block;
        long[] jArr10 = this._block;
        System.arraycopy(jArr9, 0, jArr10, 0, jArr10.length);
        long[] jArr11 = whirlpoolDigest._state;
        long[] jArr12 = this._state;
        System.arraycopy(jArr11, 0, jArr12, 0, jArr12.length);
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            update(bArr[i10]);
            i10++;
            i11--;
        }
    }
}
