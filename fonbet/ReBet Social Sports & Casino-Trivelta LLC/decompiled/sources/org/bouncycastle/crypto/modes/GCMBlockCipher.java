package org.bouncycastle.crypto.modes;

import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.gcm.BasicGCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMExponentiator;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.GCMUtil;
import org.bouncycastle.crypto.modes.gcm.Tables4kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class GCMBlockCipher implements AEADBlockCipher {
    private static final int BLOCK_SIZE = 16;

    /* renamed from: H, reason: collision with root package name */
    private byte[] f61728H;

    /* renamed from: J0, reason: collision with root package name */
    private byte[] f61729J0;

    /* renamed from: S, reason: collision with root package name */
    private byte[] f61730S;
    private byte[] S_at;
    private byte[] S_atPre;
    private byte[] atBlock;
    private int atBlockPos;
    private long atLength;
    private long atLengthPre;
    private int blocksRemaining;
    private byte[] bufBlock;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] counter;
    private GCMExponentiator exp;
    private boolean forEncryption;
    private byte[] initialAssociatedText;
    private boolean initialised;
    private byte[] lastKey;
    private byte[] macBlock;
    private int macSize;
    private GCMMultiplier multiplier;
    private byte[] nonce;
    private long totalLength;

    public GCMBlockCipher(BlockCipher blockCipher) {
        this(blockCipher, null);
    }

    private void checkStatus() {
        if (this.initialised) {
            return;
        }
        if (!this.forEncryption) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    private void gHASH(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11 += 16) {
            gHASHPartial(bArr, bArr2, i11, Math.min(i10 - i11, 16));
        }
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2) {
        GCMUtil.xor(bArr, bArr2);
        this.multiplier.multiplyH(bArr);
    }

    private void gHASHPartial(byte[] bArr, byte[] bArr2, int i10, int i11) {
        GCMUtil.xor(bArr, bArr2, i10, i11);
        this.multiplier.multiplyH(bArr);
    }

    private void getNextCTRBlock(byte[] bArr) {
        int i10 = this.blocksRemaining;
        if (i10 == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.blocksRemaining = i10 - 1;
        byte[] bArr2 = this.counter;
        int i11 = (bArr2[15] & UByte.MAX_VALUE) + 1;
        bArr2[15] = (byte) i11;
        int i12 = (i11 >>> 8) + (bArr2[14] & UByte.MAX_VALUE);
        bArr2[14] = (byte) i12;
        int i13 = (i12 >>> 8) + (bArr2[13] & UByte.MAX_VALUE);
        bArr2[13] = (byte) i13;
        bArr2[12] = (byte) ((i13 >>> 8) + (bArr2[12] & UByte.MAX_VALUE));
        this.cipher.processBlock(bArr2, 0, bArr, 0);
    }

    private void initCipher() {
        if (this.atLength > 0) {
            System.arraycopy(this.S_at, 0, this.S_atPre, 0, 16);
            this.atLengthPre = this.atLength;
        }
        int i10 = this.atBlockPos;
        if (i10 > 0) {
            gHASHPartial(this.S_atPre, this.atBlock, 0, i10);
            this.atLengthPre += this.atBlockPos;
        }
        if (this.atLengthPre > 0) {
            System.arraycopy(this.S_atPre, 0, this.f61730S, 0, 16);
        }
    }

    private void processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (bArr2.length - i11 < 16) {
            throw new OutputLengthException("Output buffer too short");
        }
        if (this.totalLength == 0) {
            initCipher();
        }
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        if (this.forEncryption) {
            GCMUtil.xor(bArr3, bArr, i10);
            gHASHBlock(this.f61730S, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i11, 16);
        } else {
            gHASHBlock(this.f61730S, bArr, i10);
            GCMUtil.xor(bArr3, 0, bArr, i10, bArr2, i11);
        }
        this.totalLength += 16;
    }

    private void processPartial(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        byte[] bArr3 = new byte[16];
        getNextCTRBlock(bArr3);
        if (this.forEncryption) {
            GCMUtil.xor(bArr, i10, bArr3, 0, i11);
            gHASHPartial(this.f61730S, bArr, i10, i11);
        } else {
            gHASHPartial(this.f61730S, bArr, i10, i11);
            GCMUtil.xor(bArr, i10, bArr3, 0, i11);
        }
        System.arraycopy(bArr, i10, bArr2, i12, i11);
        this.totalLength += i11;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int doFinal(byte[] bArr, int i10) {
        GCMBlockCipher gCMBlockCipher;
        byte[] bArr2;
        int i11;
        checkStatus();
        if (this.totalLength == 0) {
            initCipher();
        }
        int i12 = this.bufOff;
        if (!this.forEncryption) {
            int i13 = this.macSize;
            if (i12 < i13) {
                throw new InvalidCipherTextException("data too short");
            }
            i12 -= i13;
            if (bArr.length - i10 < i12) {
                throw new OutputLengthException("Output buffer too short");
            }
        } else if (bArr.length - i10 < this.macSize + i12) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i14 = i12;
        if (i14 > 0) {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i11 = i10;
            gCMBlockCipher.processPartial(this.bufBlock, 0, i14, bArr2, i11);
        } else {
            gCMBlockCipher = this;
            bArr2 = bArr;
            i11 = i10;
        }
        long j10 = gCMBlockCipher.atLength;
        int i15 = gCMBlockCipher.atBlockPos;
        long j11 = j10 + i15;
        gCMBlockCipher.atLength = j11;
        if (j11 > gCMBlockCipher.atLengthPre) {
            if (i15 > 0) {
                gHASHPartial(gCMBlockCipher.S_at, gCMBlockCipher.atBlock, 0, i15);
            }
            if (gCMBlockCipher.atLengthPre > 0) {
                GCMUtil.xor(gCMBlockCipher.S_at, gCMBlockCipher.S_atPre);
            }
            long j12 = ((gCMBlockCipher.totalLength * 8) + 127) >>> 7;
            byte[] bArr3 = new byte[16];
            if (gCMBlockCipher.exp == null) {
                BasicGCMExponentiator basicGCMExponentiator = new BasicGCMExponentiator();
                gCMBlockCipher.exp = basicGCMExponentiator;
                basicGCMExponentiator.init(gCMBlockCipher.f61728H);
            }
            gCMBlockCipher.exp.exponentiateX(j12, bArr3);
            GCMUtil.multiply(gCMBlockCipher.S_at, bArr3);
            GCMUtil.xor(gCMBlockCipher.f61730S, gCMBlockCipher.S_at);
        }
        byte[] bArr4 = new byte[16];
        Pack.longToBigEndian(gCMBlockCipher.atLength * 8, bArr4, 0);
        Pack.longToBigEndian(gCMBlockCipher.totalLength * 8, bArr4, 8);
        gHASHBlock(gCMBlockCipher.f61730S, bArr4);
        byte[] bArr5 = new byte[16];
        gCMBlockCipher.cipher.processBlock(gCMBlockCipher.f61729J0, 0, bArr5, 0);
        GCMUtil.xor(bArr5, gCMBlockCipher.f61730S);
        int i16 = gCMBlockCipher.macSize;
        byte[] bArr6 = new byte[i16];
        gCMBlockCipher.macBlock = bArr6;
        System.arraycopy(bArr5, 0, bArr6, 0, i16);
        if (gCMBlockCipher.forEncryption) {
            System.arraycopy(gCMBlockCipher.macBlock, 0, bArr2, gCMBlockCipher.bufOff + i11, gCMBlockCipher.macSize);
            i14 += gCMBlockCipher.macSize;
        } else {
            int i17 = gCMBlockCipher.macSize;
            byte[] bArr7 = new byte[i17];
            System.arraycopy(gCMBlockCipher.bufBlock, i14, bArr7, 0, i17);
            if (!Arrays.constantTimeAreEqual(gCMBlockCipher.macBlock, bArr7)) {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return i14;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/GCM";
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public byte[] getMac() {
        byte[] bArr = this.macBlock;
        return bArr == null ? new byte[this.macSize] : Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        if (this.forEncryption) {
            return i11 + this.macSize;
        }
        int i12 = this.macSize;
        if (i11 < i12) {
            return 0;
        }
        return i11 - i12;
    }

    @Override // org.bouncycastle.crypto.modes.AEADBlockCipher
    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        if (!this.forEncryption) {
            int i12 = this.macSize;
            if (i11 < i12) {
                return 0;
            }
            i11 -= i12;
        }
        return i11 - (i11 % 16);
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        byte[] iv;
        KeyParameter keyParameter;
        byte[] bArr;
        this.forEncryption = z10;
        this.macBlock = null;
        this.initialised = true;
        if (cipherParameters instanceof AEADParameters) {
            AEADParameters aEADParameters = (AEADParameters) cipherParameters;
            iv = aEADParameters.getNonce();
            this.initialAssociatedText = aEADParameters.getAssociatedText();
            int macSize = aEADParameters.getMacSize();
            if (macSize < 32 || macSize > 128 || macSize % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + macSize);
            }
            this.macSize = macSize / 8;
            keyParameter = aEADParameters.getKey();
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            this.initialAssociatedText = null;
            this.macSize = 16;
            keyParameter = (KeyParameter) parametersWithIV.getParameters();
        }
        this.bufBlock = new byte[z10 ? 16 : this.macSize + 16];
        if (iv == null || iv.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z10 && (bArr = this.nonce) != null && Arrays.areEqual(bArr, iv)) {
            if (keyParameter == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.lastKey;
            if (bArr2 != null && Arrays.areEqual(bArr2, keyParameter.getKey())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.nonce = iv;
        if (keyParameter != null) {
            this.lastKey = keyParameter.getKey();
        }
        if (keyParameter != null) {
            this.cipher.init(true, keyParameter);
            byte[] bArr3 = new byte[16];
            this.f61728H = bArr3;
            this.cipher.processBlock(bArr3, 0, bArr3, 0);
            this.multiplier.init(this.f61728H);
            this.exp = null;
        } else if (this.f61728H == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.f61729J0 = bArr4;
        byte[] bArr5 = this.nonce;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.f61729J0[15] = 1;
        } else {
            gHASH(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            Pack.longToBigEndian(this.nonce.length * 8, bArr6, 8);
            gHASHBlock(this.f61729J0, bArr6);
        }
        this.f61730S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f61729J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr7 = this.initialAssociatedText;
        if (bArr7 != null) {
            processAADBytes(bArr7, 0, bArr7.length);
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADByte(byte b10) {
        checkStatus();
        byte[] bArr = this.atBlock;
        int i10 = this.atBlockPos;
        bArr[i10] = b10;
        int i11 = i10 + 1;
        this.atBlockPos = i11;
        if (i11 == 16) {
            gHASHBlock(this.S_at, bArr);
            this.atBlockPos = 0;
            this.atLength += 16;
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void processAADBytes(byte[] bArr, int i10, int i11) {
        checkStatus();
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.atBlock;
            int i13 = this.atBlockPos;
            bArr2[i13] = bArr[i10 + i12];
            int i14 = i13 + 1;
            this.atBlockPos = i14;
            if (i14 == 16) {
                gHASHBlock(this.S_at, bArr2);
                this.atBlockPos = 0;
                this.atLength += 16;
            }
        }
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processByte(byte b10, byte[] bArr, int i10) {
        checkStatus();
        byte[] bArr2 = this.bufBlock;
        int i11 = this.bufOff;
        bArr2[i11] = b10;
        int i12 = i11 + 1;
        this.bufOff = i12;
        if (i12 != bArr2.length) {
            return 0;
        }
        processBlock(bArr2, 0, bArr, i10);
        if (this.forEncryption) {
            this.bufOff = 0;
        } else {
            byte[] bArr3 = this.bufBlock;
            System.arraycopy(bArr3, 16, bArr3, 0, this.macSize);
            this.bufOff = this.macSize;
        }
        return 16;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        checkStatus();
        if (bArr.length - i10 < i11) {
            throw new DataLengthException("Input buffer too short");
        }
        if (!this.forEncryption) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                byte[] bArr3 = this.bufBlock;
                int i16 = this.bufOff;
                bArr3[i16] = bArr[i10 + i15];
                int i17 = i16 + 1;
                this.bufOff = i17;
                if (i17 == bArr3.length) {
                    processBlock(bArr3, 0, bArr2, i12 + i14);
                    byte[] bArr4 = this.bufBlock;
                    System.arraycopy(bArr4, 16, bArr4, 0, this.macSize);
                    this.bufOff = this.macSize;
                    i14 += 16;
                }
            }
            return i14;
        }
        if (this.bufOff != 0) {
            while (i11 > 0) {
                i11--;
                byte[] bArr5 = this.bufBlock;
                int i18 = this.bufOff;
                int i19 = i10 + 1;
                bArr5[i18] = bArr[i10];
                int i20 = i18 + 1;
                this.bufOff = i20;
                if (i20 == 16) {
                    processBlock(bArr5, 0, bArr2, i12);
                    this.bufOff = 0;
                    i13 = 16;
                    i10 = i19;
                    break;
                }
                i10 = i19;
            }
        }
        i13 = 0;
        while (i11 >= 16) {
            processBlock(bArr, i10, bArr2, i12 + i13);
            i10 += 16;
            i11 -= 16;
            i13 += 16;
        }
        if (i11 > 0) {
            System.arraycopy(bArr, i10, this.bufBlock, 0, i11);
            this.bufOff = i11;
        }
        return i13;
    }

    @Override // org.bouncycastle.crypto.modes.AEADCipher
    public void reset() {
        reset(true);
    }

    public GCMBlockCipher(BlockCipher blockCipher, GCMMultiplier gCMMultiplier) {
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        gCMMultiplier = gCMMultiplier == null ? new Tables4kGCMMultiplier() : gCMMultiplier;
        this.cipher = blockCipher;
        this.multiplier = gCMMultiplier;
    }

    private void gHASHBlock(byte[] bArr, byte[] bArr2, int i10) {
        GCMUtil.xor(bArr, bArr2, i10);
        this.multiplier.multiplyH(bArr);
    }

    private void reset(boolean z10) {
        this.cipher.reset();
        this.f61730S = new byte[16];
        this.S_at = new byte[16];
        this.S_atPre = new byte[16];
        this.atBlock = new byte[16];
        this.atBlockPos = 0;
        this.atLength = 0L;
        this.atLengthPre = 0L;
        this.counter = Arrays.clone(this.f61729J0);
        this.blocksRemaining = -2;
        this.bufOff = 0;
        this.totalLength = 0L;
        byte[] bArr = this.bufBlock;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
        if (z10) {
            this.macBlock = null;
        }
        if (this.forEncryption) {
            this.initialised = false;
            return;
        }
        byte[] bArr2 = this.initialAssociatedText;
        if (bArr2 != null) {
            processAADBytes(bArr2, 0, bArr2.length);
        }
    }
}
