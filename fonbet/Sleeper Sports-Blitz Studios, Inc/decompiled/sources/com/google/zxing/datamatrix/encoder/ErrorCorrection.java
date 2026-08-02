package com.google.zxing.datamatrix.encoder;

import androidx.media3.extractor.ts.PsExtractor;
import com.facebook.imageutils.JfifUtil;
import com.google.mlkit.common.MlKitException;
import org.objectweb.asm.Opcodes;

/* loaded from: classes8.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, PsExtractor.VIDEO_STREAM_MASK, 92, 254}, new int[]{28, 24, Opcodes.INVOKEINTERFACE, Opcodes.IF_ACMPNE, 223, 248, 116, 255, 110, 61}, new int[]{Opcodes.DRETURN, 138, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 12, Opcodes.MONITORENTER, Opcodes.JSR, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, Opcodes.GETSTATIC, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, Opcodes.INVOKEDYNAMIC, 83, Opcodes.INVOKEINTERFACE}, new int[]{83, Opcodes.MONITOREXIT, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, JfifUtil.MARKER_APP1, 48, 90, 188}, new int[]{15, Opcodes.MONITOREXIT, 244, 9, 233, 71, Opcodes.JSR, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, Opcodes.FRETURN, Opcodes.INVOKEDYNAMIC, 172}, new int[]{52, 190, 88, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 109, 39, Opcodes.ARETURN, 21, 155, Opcodes.MULTIANEWARRAY, 251, 223, 155, 21, 5, 172, 254, 124, 12, Opcodes.PUTFIELD, Opcodes.INVOKESTATIC, 96, 50, Opcodes.INSTANCEOF}, new int[]{211, 231, 43, 97, 71, 96, 103, Opcodes.FRETURN, 37, 151, Opcodes.TABLESWITCH, 53, 75, 34, 249, 121, 17, 138, 110, 213, 141, 136, 120, 151, 233, Opcodes.JSR, 93, 255}, new int[]{245, 127, 242, JfifUtil.MARKER_SOS, 130, 250, Opcodes.IF_ICMPGE, Opcodes.PUTFIELD, 102, 120, 84, Opcodes.PUTSTATIC, 220, 251, 80, Opcodes.INVOKEVIRTUAL, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, Opcodes.DRETURN, Opcodes.INVOKESTATIC, 59, 25, JfifUtil.MARKER_APP1, 98, 81, 112}, new int[]{77, Opcodes.INSTANCEOF, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, Opcodes.DRETURN, 95, 100, 9, Opcodes.GOTO, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, Opcodes.RETURN, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 188, 237, 87, Opcodes.ATHROW, 106, 16, 147, 118, 23, 37, 90, Opcodes.TABLESWITCH, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, 131, 88, 120, 100, 66, 138, Opcodes.INVOKEDYNAMIC, PsExtractor.VIDEO_STREAM_MASK, 82, 44, Opcodes.ARETURN, 87, Opcodes.NEW, 147, 160, Opcodes.DRETURN, 69, 213, 92, 253, JfifUtil.MARKER_APP1, 19}, new int[]{Opcodes.DRETURN, 9, 223, 238, 12, 17, 220, JfifUtil.MARKER_RST0, 100, 29, Opcodes.DRETURN, Opcodes.TABLESWITCH, 230, 192, JfifUtil.MARKER_RST7, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, JfifUtil.MARKER_SOS, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, Opcodes.IF_ICMPLE, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, Opcodes.RET, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, Opcodes.INVOKEINTERFACE, 112, 134, 230, 245, 63, Opcodes.MULTIANEWARRAY, 190, 250, 106, Opcodes.INVOKEINTERFACE, 221, Opcodes.DRETURN, 64, 114, 71, 161, 44, 147, 6, 27, JfifUtil.MARKER_SOS, 51, 63, 87, 10, 40, 130, 188, 17, Opcodes.IF_ICMPGT, 31, Opcodes.ARETURN, Opcodes.TABLESWITCH, 4, 107, 232, 7, 94, Opcodes.IF_ACMPNE, 224, 124, 86, 47, 11, 204}, new int[]{220, 228, Opcodes.LRETURN, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, Opcodes.MULTIANEWARRAY, 158, Opcodes.RETURN, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, Opcodes.INVOKEINTERFACE, 202, Opcodes.GOTO, Opcodes.PUTSTATIC, 25, 220, 232, 96, 210, 231, 136, 223, 239, Opcodes.PUTFIELD, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, Opcodes.INVOKEDYNAMIC}};
    private static final int[] LOG = new int[256];
    private static final int[] ALOG = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            ALOG[i2] = i;
            LOG[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int[] iArr3 = new int[interleavedBlockCount];
            int i = 0;
            while (i < interleavedBlockCount) {
                int i2 = i + 1;
                iArr[i] = symbolInfo.getDataLengthForInterleavedBlock(i2);
                iArr2[i] = symbolInfo.getErrorLengthForInterleavedBlock(i2);
                iArr3[i] = 0;
                if (i > 0) {
                    iArr3[i] = iArr3[i - 1] + iArr[i];
                }
                i = i2;
            }
            for (int i3 = 0; i3 < interleavedBlockCount; i3++) {
                StringBuilder sb2 = new StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < symbolInfo.getDataCapacity(); i4 += interleavedBlockCount) {
                    sb2.append(str.charAt(i4));
                }
                String createECCBlock = createECCBlock(sb2.toString(), iArr2[i3]);
                int i5 = i3;
                int i6 = 0;
                while (i5 < iArr2[i3] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i5, createECCBlock.charAt(i6));
                    i5 += interleavedBlockCount;
                    i6++;
                }
            }
        }
        return sb.toString();
    }

    private static String createECCBlock(CharSequence charSequence, int i) {
        return createECCBlock(charSequence, 0, charSequence.length(), i);
    }

    private static String createECCBlock(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i6 >= iArr.length) {
                i6 = -1;
                break;
            }
            if (iArr[i6] == i3) {
                break;
            }
            i6++;
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i3)));
        }
        int[] iArr2 = FACTORS[i6];
        char[] cArr = new char[i3];
        for (int i7 = 0; i7 < i3; i7++) {
            cArr[i7] = 0;
        }
        for (int i8 = i; i8 < i + i2; i8++) {
            int i9 = i3 - 1;
            int charAt = cArr[i9] ^ charSequence.charAt(i8);
            while (i9 > 0) {
                if (charAt != 0 && (i5 = iArr2[i9]) != 0) {
                    char c = cArr[i9 - 1];
                    int[] iArr3 = ALOG;
                    int[] iArr4 = LOG;
                    cArr[i9] = (char) (iArr3[(iArr4[charAt] + iArr4[i5]) % 255] ^ c);
                } else {
                    cArr[i9] = cArr[i9 - 1];
                }
                i9--;
            }
            if (charAt != 0 && (i4 = iArr2[0]) != 0) {
                int[] iArr5 = ALOG;
                int[] iArr6 = LOG;
                cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[i4]) % 255];
            } else {
                cArr[0] = 0;
            }
        }
        char[] cArr2 = new char[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            cArr2[i10] = cArr[(i3 - i10) - 1];
        }
        return String.valueOf(cArr2);
    }
}
