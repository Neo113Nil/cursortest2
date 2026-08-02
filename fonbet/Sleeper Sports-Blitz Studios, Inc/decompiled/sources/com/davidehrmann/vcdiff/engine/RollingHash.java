package com.davidehrmann.vcdiff.engine;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
class RollingHash {
    private final long[] remove_table;
    private final int window_size;

    public RollingHash(int i) {
        if (i < 2) {
            throw new IllegalArgumentException();
        }
        this.window_size = i;
        this.remove_table = RollingHashUtil.BuildRemoveTable(i);
    }

    public long Hash(byte[] bArr, int i, int i2) {
        long HashFirstTwoBytes = RollingHashUtil.HashFirstTwoBytes(bArr, i);
        for (int i3 = 2; i3 < this.window_size; i3++) {
            HashFirstTwoBytes = RollingHashUtil.HashStep(HashFirstTwoBytes, bArr[i + i3]);
        }
        return HashFirstTwoBytes;
    }

    public long Hash(ByteBuffer byteBuffer) {
        long HashFirstTwoBytes = RollingHashUtil.HashFirstTwoBytes(byteBuffer);
        for (int i = 2; i < this.window_size; i++) {
            HashFirstTwoBytes = RollingHashUtil.HashStep(HashFirstTwoBytes, byteBuffer.get());
        }
        return HashFirstTwoBytes;
    }

    public long UpdateHash(long j, byte b, byte b2) {
        return RollingHashUtil.HashStep(RemoveFirstByteFromHash(j, b), b2);
    }

    protected long RemoveFirstByteFromHash(long j, byte b) {
        return RollingHashUtil.ModBase(j + this.remove_table[b & 255]);
    }

    protected static class RollingHashUtil {
        public static final int kBase = 8388608;
        public static final int kMult = 257;

        public static long ModBase(long j) {
            return j & 8388607;
        }

        protected RollingHashUtil() {
        }

        public static long FindModBaseInverse(long j) {
            return 4294967295L & (4294967296L - ModBase(j));
        }

        public static long HashStep(long j, byte b) {
            return ModBase((j * 257) + (b & 255));
        }

        public static long HashFirstTwoBytes(byte[] bArr, int i) {
            return ((bArr[i] & 255) * 257) + (bArr[i + 1] & 255);
        }

        public static long HashFirstTwoBytes(ByteBuffer byteBuffer) {
            return ((byteBuffer.get() & 255) * 257) + (byteBuffer.get() & 255);
        }

        public static long[] BuildRemoveTable(int i) {
            if (i < 2) {
                throw new IllegalArgumentException();
            }
            long[] jArr = new long[256];
            long j = 1;
            for (int i2 = 0; i2 < i - 1; i2++) {
                j = ModBase(j * 257);
            }
            long j2 = 0;
            for (int i3 = 0; i3 < 256; i3++) {
                jArr[i3] = FindModBaseInverse(j2);
                j2 = ModBase(j2 + j);
            }
            return jArr;
        }
    }
}
