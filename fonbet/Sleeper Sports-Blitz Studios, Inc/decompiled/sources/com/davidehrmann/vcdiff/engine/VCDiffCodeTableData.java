package com.davidehrmann.vcdiff.engine;

import io.sentry.metrics.MetricsUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes6.dex */
class VCDiffCodeTableData implements Cloneable {
    private static final byte A = 1;
    private static final byte C = 3;
    private static final Logger LOGGER = LoggerFactory.getLogger((Class<?>) VCDiffCodeTableData.class);
    private static final byte N = 0;
    private static final byte R = 2;
    public static final int SERIALIZED_BYTE_SIZE;
    public static final byte VCD_ADD = 1;
    public static final byte VCD_COPY = 3;
    public static final byte VCD_INSTRUCTION_END_OF_DATA = 5;
    protected static final byte VCD_LAST_INSTRUCTION_TYPE = 3;
    public static final byte VCD_NOOP = 0;
    public static final byte VCD_RUN = 2;
    public static final int kCodeTableSize = 256;
    public static final VCDiffCodeTableData kDefaultCodeTableData;
    protected static final short kNoOpcode = 256;
    private volatile byte[] bytes;
    public final byte[] inst1;
    public final byte[] inst2;
    public final byte[] mode1;
    public final byte[] mode2;
    public final byte[] size1;
    public final byte[] size2;

    static {
        VCDiffCodeTableData vCDiffCodeTableData = new VCDiffCodeTableData(new byte[]{2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 0, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 5, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        kDefaultCodeTableData = vCDiffCodeTableData;
        SERIALIZED_BYTE_SIZE = vCDiffCodeTableData.getBytes().length;
    }

    public VCDiffCodeTableData() {
        this.inst1 = new byte[256];
        this.inst2 = new byte[256];
        this.size1 = new byte[256];
        this.size2 = new byte[256];
        this.mode1 = new byte[256];
        this.mode2 = new byte[256];
        this.bytes = null;
    }

    public VCDiffCodeTableData(byte[] bArr) {
        byte[] bArr2 = new byte[256];
        this.inst1 = bArr2;
        byte[] bArr3 = new byte[256];
        this.inst2 = bArr3;
        byte[] bArr4 = new byte[256];
        this.size1 = bArr4;
        byte[] bArr5 = new byte[256];
        this.size2 = bArr5;
        byte[] bArr6 = new byte[256];
        this.mode1 = bArr6;
        byte[] bArr7 = new byte[256];
        this.mode2 = bArr7;
        this.bytes = null;
        if (bArr.length != bArr2.length + bArr3.length + bArr4.length + bArr5.length + bArr6.length + bArr7.length) {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        int length = bArr2.length;
        System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
        int length2 = length + bArr3.length;
        System.arraycopy(bArr, length2, bArr4, 0, bArr4.length);
        int length3 = length2 + bArr4.length;
        System.arraycopy(bArr, length3, bArr5, 0, bArr5.length);
        int length4 = length3 + bArr5.length;
        System.arraycopy(bArr, length4, bArr6, 0, bArr6.length);
        System.arraycopy(bArr, length4 + bArr6.length, bArr7, 0, bArr7.length);
    }

    public VCDiffCodeTableData(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        byte[] bArr7 = new byte[256];
        this.inst1 = bArr7;
        byte[] bArr8 = new byte[256];
        this.inst2 = bArr8;
        byte[] bArr9 = new byte[256];
        this.size1 = bArr9;
        byte[] bArr10 = new byte[256];
        this.size2 = bArr10;
        byte[] bArr11 = new byte[256];
        this.mode1 = bArr11;
        byte[] bArr12 = new byte[256];
        this.mode2 = bArr12;
        this.bytes = null;
        if (bArr.length != 256 || bArr2.length != 256 || bArr3.length != 256 || bArr4.length != 256 || bArr5.length != 256 || bArr6.length != 256) {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArr, 0, bArr7, 0, 256);
        System.arraycopy(bArr2, 0, bArr8, 0, 256);
        System.arraycopy(bArr3, 0, bArr9, 0, 256);
        System.arraycopy(bArr4, 0, bArr10, 0, 256);
        System.arraycopy(bArr5, 0, bArr11, 0, 256);
        System.arraycopy(bArr6, 0, bArr12, 0, 256);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public VCDiffCodeTableData m10648clone() {
        return new VCDiffCodeTableData(this.inst1, this.inst2, this.size1, this.size2, this.mode1, this.mode2);
    }

    public static String VCDiffInstructionName(int i) {
        if (i == 0) {
            return "NOOP";
        }
        if (i == 1) {
            return "ADD";
        }
        if (i == 2) {
            return "RUN";
        }
        if (i == 3) {
            return "COPY";
        }
        return "";
    }

    protected static boolean ValidateOpcode(int i, short s, short s2, short s3, short s4, String str) {
        boolean z;
        if (s > 3 || s < 0) {
            LOGGER.warn("VCDiff: Bad code table; opcode {} has invalid {} instruction type {}", Integer.valueOf(i), str, Short.valueOf(s));
            z = false;
        } else {
            z = true;
        }
        if (s3 > s4 || s3 < 0) {
            LOGGER.warn("VCDiff: Bad code table; opcode {} has invalid {} mode {}", Integer.valueOf(i), str, Short.valueOf(s3));
            z = false;
        }
        if (s == 0 && s2 != 0) {
            LOGGER.warn("VCDiff: Bad code table; opcode {} has {} instruction NOOP with nonzero size {}", Integer.valueOf(i), str, Short.valueOf(s2));
            z = false;
        }
        if (s2 < 0) {
            LOGGER.warn("VCDiff: Bad code table; opcode {} has {} instruction with size less than zero {}", Integer.valueOf(i), str, Short.valueOf(s2));
            z = false;
        }
        if (s == 3 || s3 == 0) {
            return z;
        }
        LOGGER.warn("VCDiff: Bad code table; opcode {} has non-COPY {} instruction with nonzero mode {}", Integer.valueOf(i), str, Short.valueOf(s3));
        return false;
    }

    protected boolean Validate(short s) {
        int i = s + 4;
        boolean[] zArr = new boolean[259];
        for (int i2 = 0; i2 < i; i2++) {
            zArr[i2] = false;
        }
        int i3 = 0;
        boolean z = true;
        while (i3 < 256) {
            short s2 = s;
            z = ValidateOpcode(i3, (short) (this.inst2[i3] & 255), (short) (this.size2[i3] & 255), (short) (this.mode2[i3] & 255), s2, MetricsUnit.Duration.SECOND) && (ValidateOpcode(i3, (short) (this.inst1[i3] & 255), (short) (this.size1[i3] & 255), (short) (this.mode1[i3] & 255), s2, "first") && z);
            if (this.size1[i3] == 0 && this.inst2[i3] == 0) {
                byte b = this.inst1[i3];
                byte b2 = this.mode1[i3];
                if ((b & 255) + (b2 & 255) < i) {
                    zArr[(b & 255) + (b2 & 255)] = true;
                }
            }
            i3++;
            s = s2;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (i4 != 0 && !zArr[i4]) {
                if (i4 >= 3) {
                    LOGGER.warn("VCDiff: Bad code table; there is no opcode for inst COPY, size 0, mode {}", Integer.valueOf(i4 - 3));
                } else {
                    LOGGER.warn("VCDiff: Bad code table; there is no opcode for inst {}, size -,  mode 0", VCDiffInstructionName(i4));
                }
                z = false;
            }
        }
        return z;
    }

    public byte[] getBytes() {
        if (this.bytes == null) {
            synchronized (this) {
                if (this.bytes == null) {
                    this.bytes = new byte[this.inst1.length + this.inst2.length + this.size1.length + this.size2.length + this.mode1.length + this.mode2.length];
                    System.arraycopy(this.inst1, 0, this.bytes, 0, this.inst1.length);
                    int length = this.inst1.length;
                    System.arraycopy(this.inst2, 0, this.bytes, length, this.inst2.length);
                    int length2 = length + this.inst2.length;
                    System.arraycopy(this.size1, 0, this.bytes, length2, this.size1.length);
                    int length3 = length2 + this.size1.length;
                    System.arraycopy(this.size2, 0, this.bytes, length3, this.size2.length);
                    int length4 = length3 + this.size2.length;
                    System.arraycopy(this.mode1, 0, this.bytes, length4, this.mode1.length);
                    System.arraycopy(this.mode2, 0, this.bytes, length4 + this.mode1.length, this.mode2.length);
                    int length5 = this.mode2.length;
                }
            }
        }
        return this.bytes;
    }

    protected boolean Validate() {
        return Validate(VCDiffAddressCache.DefaultLastMode());
    }
}
