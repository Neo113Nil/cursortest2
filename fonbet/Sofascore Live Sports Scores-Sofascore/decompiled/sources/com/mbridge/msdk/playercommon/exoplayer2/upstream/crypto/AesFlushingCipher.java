package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import defpackage.is8;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i, byte[] bArr, long j, long j2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j3 = blockSize;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            cipher.init(i, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j, j4)));
            if (i2 != 0) {
                updateInPlace(new byte[i2], 0, i2);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            is8.h(e);
            throw null;
        }
    }

    private byte[] getInitializationVector(long j, long j2) {
        return ByteBuffer.allocate(16).putLong(j).putLong(j2).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.cipher.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            is8.h(e);
            return 0;
        }
    }

    public void update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        do {
            int i4 = this.pendingXorBytes;
            if (i4 <= 0) {
                int nonFlushingUpdate = nonFlushingUpdate(bArr, i, i2, bArr2, i3);
                if (i2 == nonFlushingUpdate) {
                    return;
                }
                int i5 = i2 - nonFlushingUpdate;
                int i6 = 0;
                Assertions.checkState(i5 < this.blockSize);
                int i7 = i3 + nonFlushingUpdate;
                int i8 = this.blockSize - i5;
                this.pendingXorBytes = i8;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i8, this.flushedBlock, 0) == this.blockSize);
                while (i6 < i5) {
                    bArr2[i7] = this.flushedBlock[i6];
                    i6++;
                    i7++;
                }
                return;
            }
            bArr2[i3] = (byte) (bArr[i] ^ this.flushedBlock[this.blockSize - i4]);
            i3++;
            i++;
            this.pendingXorBytes = i4 - 1;
            i2--;
        } while (i2 != 0);
    }

    public void updateInPlace(byte[] bArr, int i, int i2) {
        update(bArr, i, i2, bArr, i);
    }
}
