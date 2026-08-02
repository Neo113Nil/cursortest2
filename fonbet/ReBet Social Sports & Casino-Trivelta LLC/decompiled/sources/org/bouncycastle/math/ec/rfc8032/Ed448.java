package org.bouncycastle.math.ec.rfc8032;

import com.plaid.internal.EnumC3631g;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public abstract class Ed448 {
    private static final int C_d = -39081;
    private static final int L4_0 = 43969588;
    private static final int L4_1 = 30366549;
    private static final int L4_2 = 163752818;
    private static final int L4_3 = 258169998;
    private static final int L4_4 = 96434764;
    private static final int L4_5 = 227822194;
    private static final int L4_6 = 149865618;
    private static final int L4_7 = 550336261;
    private static final int L_0 = 78101261;
    private static final int L_1 = 141809365;
    private static final int L_2 = 175155932;
    private static final int L_3 = 64542499;
    private static final int L_4 = 158326419;
    private static final int L_5 = 191173276;
    private static final int L_6 = 104575268;
    private static final int L_7 = 137584065;
    private static final long M26L = 67108863;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, 100, 52, 52, 56};

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f62003P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f62002L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final Object precompLock = new Object();
    private static PointExt[] precompBaseTable = null;
    private static int[] precompBase = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class PointExt {

        /* renamed from: x, reason: collision with root package name */
        int[] f62004x;

        /* renamed from: y, reason: collision with root package name */
        int[] f62005y;

        /* renamed from: z, reason: collision with root package name */
        int[] f62006z;

        private PointExt() {
            this.f62004x = X448Field.create();
            this.f62005y = X448Field.create();
            this.f62006z = X448Field.create();
        }
    }

    public static class PointPrecomp {

        /* renamed from: x, reason: collision with root package name */
        int[] f62007x;

        /* renamed from: y, reason: collision with root package name */
        int[] f62008y;

        private PointPrecomp() {
            this.f62007x = X448Field.create();
            this.f62008y = X448Field.create();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        decodeScalar(bArr3, 0, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i10 = 0; i10 < 28; i10++) {
            encode32(iArr[i10], bArr4, i10 * 4);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create, 39081, create);
        X448Field.subOne(create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & ByteCompanionObject.MAX_VALUE) != 0) {
            return false;
        }
        decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r2, f62003P);
    }

    private static boolean checkScalarVar(byte[] bArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decodeScalar(bArr, 0, new int[14]);
        return !Nat.gte(14, r2, f62002L);
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static int decode16(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | (bArr[i10] & UByte.MAX_VALUE);
    }

    private static int decode24(byte[] bArr, int i10) {
        return ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8);
    }

    private static int decode32(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    private static boolean decodePointVar(byte[] bArr, int i10, boolean z10, PointExt pointExt) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i10 + 57);
        if (!checkPointVar(copyOfRange)) {
            return false;
        }
        byte b10 = copyOfRange[56];
        int i11 = (b10 & ByteCompanionObject.MIN_VALUE) >>> 7;
        copyOfRange[56] = (byte) (b10 & ByteCompanionObject.MAX_VALUE);
        X448Field.decode(copyOfRange, 0, pointExt.f62005y);
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.sqr(pointExt.f62005y, create);
        X448Field.mul(create, 39081, create2);
        X448Field.negate(create, create);
        X448Field.addOne(create);
        X448Field.addOne(create2);
        if (!X448Field.sqrtRatioVar(create, create2, pointExt.f62004x)) {
            return false;
        }
        X448Field.normalize(pointExt.f62004x);
        if (i11 == 1 && X448Field.isZeroVar(pointExt.f62004x)) {
            return false;
        }
        int[] iArr = pointExt.f62004x;
        if (z10 ^ (i11 != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
        }
        pointExtendXY(pointExt);
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i10, int[] iArr) {
        decode32(bArr, i10, iArr, 0, 14);
    }

    private static void dom4(Xof xof, byte b10, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i10 = length + 2;
        int length2 = bArr.length + i10;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b10;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i10, bArr.length);
        xof.update(bArr3, 0, length2);
    }

    private static void encode24(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
    }

    private static void encode32(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >>> 8);
        bArr[i11 + 2] = (byte) (i10 >>> 16);
        bArr[i11 + 3] = (byte) (i10 >>> 24);
    }

    private static void encode56(long j10, byte[] bArr, int i10) {
        encode32((int) j10, bArr, i10);
        encode24((int) (j10 >>> 32), bArr, i10 + 4);
    }

    private static int encodePoint(PointExt pointExt, byte[] bArr, int i10) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        X448Field.inv(pointExt.f62006z, create2);
        X448Field.mul(pointExt.f62004x, create2, create);
        X448Field.mul(pointExt.f62005y, create2, create2);
        X448Field.normalize(create);
        X448Field.normalize(create2);
        int checkPoint = checkPoint(create, create2);
        X448Field.encode(create2, bArr, i10);
        bArr[i10 + 56] = (byte) ((create[0] & 1) << 7);
        return checkPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        Xof createXof = createXof();
        byte[] bArr3 = new byte[114];
        createXof.update(bArr, i10, 57);
        createXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i11);
    }

    private static int getWindow4(int[] iArr, int i10) {
        return (iArr[i10 >>> 3] >>> ((i10 & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i10) {
        int[] iArr2 = new int[28];
        int i11 = 0;
        int i12 = 14;
        int i13 = 28;
        int i14 = 0;
        while (true) {
            i12--;
            if (i12 < 0) {
                break;
            }
            int i15 = iArr[i12];
            iArr2[i13 - 1] = (i14 << 16) | (i15 >>> 16);
            i13 -= 2;
            iArr2[i13] = i15;
            i14 = i15;
        }
        byte[] bArr = new byte[447];
        int i16 = 1 << i10;
        int i17 = i16 - 1;
        int i18 = i16 >>> 1;
        int i19 = 0;
        int i20 = 0;
        while (i11 < 28) {
            int i21 = iArr2[i11];
            while (i19 < 16) {
                int i22 = i21 >>> i19;
                if ((i22 & 1) == i20) {
                    i19++;
                } else {
                    int i23 = (i22 & i17) + i20;
                    int i24 = i23 & i18;
                    int i25 = i23 - (i24 << 1);
                    i20 = i24 >>> (i10 - 1);
                    bArr[(i11 << 4) + i19] = (byte) i25;
                    i19 += i10;
                }
            }
            i11++;
            i19 -= 16;
        }
        return bArr;
    }

    private static void implSign(Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, byte b10, byte[] bArr5, int i11, int i12, byte[] bArr6, int i13) {
        dom4(xof, b10, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i11, i12);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] reduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(reduceScalar, bArr7, 0);
        dom4(xof, b10, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i10, 57);
        xof.update(bArr5, i11, i12);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] calculateS = calculateS(reduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i13, 57);
        System.arraycopy(calculateS, 0, bArr6, i13 + 57, 57);
    }

    private static boolean implVerify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        int i14 = i10 + 57;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i14);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i14, i10 + 114);
        if (!checkPointVar(copyOfRange) || !checkScalarVar(copyOfRange2)) {
            return false;
        }
        PointExt pointExt = new PointExt();
        if (!decodePointVar(bArr2, i11, true, pointExt)) {
            return false;
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(createXof, b10, bArr3);
        createXof.update(copyOfRange, 0, 57);
        createXof.update(bArr2, i11, 57);
        createXof.update(bArr4, i12, i13);
        createXof.doFinal(bArr5, 0, 114);
        byte[] reduceScalar = reduceScalar(bArr5);
        int[] iArr = new int[14];
        decodeScalar(copyOfRange2, 0, iArr);
        int[] iArr2 = new int[14];
        decodeScalar(reduceScalar, 0, iArr2);
        PointExt pointExt2 = new PointExt();
        scalarMultStrausVar(iArr, iArr2, pointExt, pointExt2);
        byte[] bArr6 = new byte[57];
        return encodePoint(pointExt2, bArr6, 0) != 0 && Arrays.areEqual(bArr6, copyOfRange);
    }

    private static void pointAdd(PointExt pointExt, PointExt pointExt2) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        X448Field.mul(pointExt.f62006z, pointExt2.f62006z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointExt.f62004x, pointExt2.f62004x, create3);
        X448Field.mul(pointExt.f62005y, pointExt2.f62005y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, create6);
        X448Field.sub(create2, create5, create7);
        X448Field.add(pointExt.f62004x, pointExt.f62005y, create2);
        X448Field.add(pointExt2.f62004x, pointExt2.f62005y, create5);
        X448Field.mul(create2, create5, create8);
        X448Field.add(create4, create3, create2);
        X448Field.sub(create4, create3, create5);
        X448Field.carry(create2);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointExt2.f62004x);
        X448Field.mul(create5, create7, pointExt2.f62005y);
        X448Field.mul(create6, create7, pointExt2.f62006z);
    }

    private static void pointAddPrecomp(PointPrecomp pointPrecomp, PointExt pointExt) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        X448Field.sqr(pointExt.f62006z, create);
        X448Field.mul(pointPrecomp.f62007x, pointExt.f62004x, create2);
        X448Field.mul(pointPrecomp.f62008y, pointExt.f62005y, create3);
        X448Field.mul(create2, create3, create4);
        X448Field.mul(create4, 39081, create4);
        X448Field.add(create, create4, create5);
        X448Field.sub(create, create4, create6);
        X448Field.add(pointPrecomp.f62007x, pointPrecomp.f62008y, create);
        X448Field.add(pointExt.f62004x, pointExt.f62005y, create4);
        X448Field.mul(create, create4, create7);
        X448Field.add(create3, create2, create);
        X448Field.sub(create3, create2, create4);
        X448Field.carry(create);
        X448Field.sub(create7, create, create7);
        X448Field.mul(create7, pointExt.f62006z, create7);
        X448Field.mul(create4, pointExt.f62006z, create4);
        X448Field.mul(create5, create7, pointExt.f62004x);
        X448Field.mul(create4, create6, pointExt.f62005y);
        X448Field.mul(create5, create6, pointExt.f62006z);
    }

    private static void pointAddVar(boolean z10, PointExt pointExt, PointExt pointExt2) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        int[] create7 = X448Field.create();
        int[] create8 = X448Field.create();
        if (z10) {
            X448Field.sub(pointExt.f62005y, pointExt.f62004x, create8);
            iArr2 = create2;
            iArr = create5;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            X448Field.add(pointExt.f62005y, pointExt.f62004x, create8);
            iArr = create2;
            iArr2 = create5;
            iArr3 = create6;
            iArr4 = create7;
        }
        X448Field.mul(pointExt.f62006z, pointExt2.f62006z, create);
        X448Field.sqr(create, create2);
        X448Field.mul(pointExt.f62004x, pointExt2.f62004x, create3);
        X448Field.mul(pointExt.f62005y, pointExt2.f62005y, create4);
        X448Field.mul(create3, create4, create5);
        X448Field.mul(create5, 39081, create5);
        X448Field.add(create2, create5, iArr3);
        X448Field.sub(create2, create5, iArr4);
        X448Field.add(pointExt2.f62004x, pointExt2.f62005y, create5);
        X448Field.mul(create8, create5, create8);
        X448Field.add(create4, create3, iArr);
        X448Field.sub(create4, create3, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(create8, create2, create8);
        X448Field.mul(create8, create, create8);
        X448Field.mul(create5, create, create5);
        X448Field.mul(create6, create8, pointExt2.f62004x);
        X448Field.mul(create5, create7, pointExt2.f62005y);
        X448Field.mul(create6, create7, pointExt2.f62006z);
    }

    private static PointExt pointCopy(PointExt pointExt) {
        PointExt pointExt2 = new PointExt();
        pointCopy(pointExt, pointExt2);
        return pointExt2;
    }

    private static void pointDouble(PointExt pointExt) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        int[] create5 = X448Field.create();
        int[] create6 = X448Field.create();
        X448Field.add(pointExt.f62004x, pointExt.f62005y, create);
        X448Field.sqr(create, create);
        X448Field.sqr(pointExt.f62004x, create2);
        X448Field.sqr(pointExt.f62005y, create3);
        X448Field.add(create2, create3, create4);
        X448Field.carry(create4);
        X448Field.sqr(pointExt.f62006z, create5);
        X448Field.add(create5, create5, create5);
        X448Field.carry(create5);
        X448Field.sub(create4, create5, create6);
        X448Field.sub(create, create4, create);
        X448Field.sub(create2, create3, create2);
        X448Field.mul(create, create6, pointExt.f62004x);
        X448Field.mul(create4, create2, pointExt.f62005y);
        X448Field.mul(create4, create6, pointExt.f62006z);
    }

    private static void pointExtendXY(PointExt pointExt) {
        X448Field.one(pointExt.f62006z);
    }

    private static void pointLookup(int i10, int i11, PointPrecomp pointPrecomp) {
        int i12 = i10 * 512;
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = ((i13 ^ i11) - 1) >> 31;
            X448Field.cmov(i14, precompBase, i12, pointPrecomp.f62007x, 0);
            X448Field.cmov(i14, precompBase, i12 + 16, pointPrecomp.f62008y, 0);
            i12 += 32;
        }
    }

    private static int[] pointPrecompute(PointExt pointExt, int i10) {
        PointExt pointCopy = pointCopy(pointExt);
        PointExt pointCopy2 = pointCopy(pointCopy);
        pointDouble(pointCopy2);
        int[] createTable = X448Field.createTable(i10 * 3);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            X448Field.copy(pointCopy.f62004x, 0, createTable, i11);
            X448Field.copy(pointCopy.f62005y, 0, createTable, i11 + 16);
            X448Field.copy(pointCopy.f62006z, 0, createTable, i11 + 32);
            i11 += 48;
            i12++;
            if (i12 == i10) {
                return createTable;
            }
            pointAdd(pointCopy2, pointCopy);
        }
    }

    private static PointExt[] pointPrecomputeVar(PointExt pointExt, int i10) {
        PointExt pointCopy = pointCopy(pointExt);
        pointDouble(pointCopy);
        PointExt[] pointExtArr = new PointExt[i10];
        pointExtArr[0] = pointCopy(pointExt);
        for (int i11 = 1; i11 < i10; i11++) {
            PointExt pointCopy2 = pointCopy(pointExtArr[i11 - 1]);
            pointExtArr[i11] = pointCopy2;
            pointAddVar(false, pointCopy, pointCopy2);
        }
        return pointExtArr;
    }

    private static void pointSetNeutral(PointExt pointExt) {
        X448Field.zero(pointExt.f62004x);
        X448Field.one(pointExt.f62005y);
        X448Field.one(pointExt.f62006z);
    }

    public static void precompute() {
        synchronized (precompLock) {
            try {
                if (precompBase == null) {
                    PointExt pointExt = new PointExt();
                    X448Field.copy(B_x, 0, pointExt.f62004x, 0);
                    X448Field.copy(B_y, 0, pointExt.f62005y, 0);
                    pointExtendXY(pointExt);
                    precompBaseTable = pointPrecomputeVar(pointExt, 32);
                    precompBase = X448Field.createTable(EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                    int i10 = 0;
                    for (int i11 = 0; i11 < 5; i11++) {
                        PointExt[] pointExtArr = new PointExt[5];
                        PointExt pointExt2 = new PointExt();
                        pointSetNeutral(pointExt2);
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 5) {
                                break;
                            }
                            pointAddVar(true, pointExt, pointExt2);
                            pointDouble(pointExt);
                            pointExtArr[i12] = pointCopy(pointExt);
                            if (i11 + i12 != 8) {
                                for (int i13 = 1; i13 < 18; i13++) {
                                    pointDouble(pointExt);
                                }
                            }
                            i12++;
                        }
                        PointExt[] pointExtArr2 = new PointExt[16];
                        pointExtArr2[0] = pointExt2;
                        int i14 = 1;
                        for (int i15 = 0; i15 < 4; i15++) {
                            int i16 = 1 << i15;
                            int i17 = 0;
                            while (i17 < i16) {
                                PointExt pointCopy = pointCopy(pointExtArr2[i14 - i16]);
                                pointExtArr2[i14] = pointCopy;
                                pointAddVar(false, pointExtArr[i15], pointCopy);
                                i17++;
                                i14++;
                            }
                        }
                        int[] createTable = X448Field.createTable(16);
                        int[] create = X448Field.create();
                        X448Field.copy(pointExtArr2[0].f62006z, 0, create, 0);
                        X448Field.copy(create, 0, createTable, 0);
                        int i18 = 0;
                        while (true) {
                            int i19 = i18 + 1;
                            if (i19 >= 16) {
                                break;
                            }
                            X448Field.mul(create, pointExtArr2[i19].f62006z, create);
                            X448Field.copy(create, 0, createTable, i19 * 16);
                            i18 = i19;
                        }
                        X448Field.invVar(create, create);
                        int[] create2 = X448Field.create();
                        while (i18 > 0) {
                            int i20 = i18 - 1;
                            X448Field.copy(createTable, i20 * 16, create2, 0);
                            X448Field.mul(create2, create, create2);
                            X448Field.copy(create2, 0, createTable, i18 * 16);
                            X448Field.mul(create, pointExtArr2[i18].f62006z, create);
                            i18 = i20;
                        }
                        X448Field.copy(create, 0, createTable, 0);
                        for (int i21 = 0; i21 < 16; i21++) {
                            PointExt pointExt3 = pointExtArr2[i21];
                            X448Field.copy(createTable, i21 * 16, pointExt3.f62006z, 0);
                            int[] iArr = pointExt3.f62004x;
                            X448Field.mul(iArr, pointExt3.f62006z, iArr);
                            int[] iArr2 = pointExt3.f62005y;
                            X448Field.mul(iArr2, pointExt3.f62006z, iArr2);
                            X448Field.copy(pointExt3.f62004x, 0, precompBase, i10);
                            X448Field.copy(pointExt3.f62005y, 0, precompBase, i10 + 16);
                            i10 += 32;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i10, byte[] bArr2) {
        System.arraycopy(bArr, i10, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | ByteCompanionObject.MIN_VALUE);
        bArr2[56] = 0;
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long decode32 = decode32(bArr, 84);
        long j10 = decode32 & 4294967295L;
        long decode322 = decode32(bArr, 91);
        long j11 = decode322 & 4294967295L;
        long decode323 = decode32(bArr, 98);
        long j12 = decode323 & 4294967295L;
        long decode324 = decode32(bArr, 105);
        long j13 = decode324 & 4294967295L;
        long decode16 = decode16(bArr, 112) & 4294967295L;
        long decode24 = ((decode24(bArr, 109) << 4) & 4294967295L) + (j13 >>> 28);
        long j14 = decode324 & M28L;
        long decode242 = ((decode24(bArr, 74) << 4) & 4294967295L) + (decode16 * 227822194) + (decode24 * 149865618);
        long decode325 = (decode32(bArr, 77) & 4294967295L) + (decode16 * 149865618) + (decode24 * 550336261);
        long decode243 = ((decode24(bArr, 53) << 4) & 4294967295L) + (decode24 * 43969588) + (j14 * 30366549);
        long decode326 = (decode32(bArr, 56) & 4294967295L) + (decode16 * 43969588) + (decode24 * 30366549) + (j14 * 163752818);
        long decode244 = ((decode24(bArr, 60) << 4) & 4294967295L) + (decode16 * 30366549) + (decode24 * 163752818) + (j14 * 258169998);
        long decode327 = (decode32(bArr, 63) & 4294967295L) + (decode16 * 163752818) + (decode24 * 258169998) + (j14 * 96434764);
        long decode245 = ((decode24(bArr, 67) << 4) & 4294967295L) + (decode16 * 258169998) + (decode24 * 96434764) + (j14 * 227822194);
        long decode328 = (decode32(bArr, 70) & 4294967295L) + (decode16 * 96434764) + (decode24 * 227822194) + (j14 * 149865618);
        long decode246 = ((decode24(bArr, 102) << 4) & 4294967295L) + (j12 >>> 28);
        long j15 = decode323 & M28L;
        long j16 = decode245 + (decode246 * 149865618);
        long j17 = decode328 + (decode246 * 550336261);
        long decode247 = ((decode24(bArr, 46) << 4) & 4294967295L) + (decode246 * 43969588) + (j15 * 30366549);
        long decode329 = (decode32(bArr, 49) & 4294967295L) + (j14 * 43969588) + (decode246 * 30366549) + (j15 * 163752818);
        long j18 = decode243 + (decode246 * 163752818) + (j15 * 258169998);
        long j19 = decode326 + (decode246 * 258169998) + (j15 * 96434764);
        long j20 = decode244 + (decode246 * 96434764) + (j15 * 227822194);
        long j21 = decode327 + (decode246 * 227822194) + (j15 * 149865618);
        long decode248 = ((decode24(bArr, 95) << 4) & 4294967295L) + (j11 >>> 28);
        long j22 = decode322 & M28L;
        long j23 = j21 + (decode248 * 550336261);
        long decode249 = ((decode24(bArr, 39) << 4) & 4294967295L) + (decode248 * 43969588) + (j22 * 30366549);
        long decode3210 = (decode32(bArr, 42) & 4294967295L) + (j15 * 43969588) + (decode248 * 30366549) + (j22 * 163752818);
        long j24 = decode247 + (decode248 * 163752818) + (j22 * 258169998);
        long j25 = decode329 + (decode248 * 258169998) + (j22 * 96434764);
        long j26 = j18 + (decode248 * 96434764) + (j22 * 227822194);
        long j27 = j19 + (decode248 * 227822194) + (j22 * 149865618);
        long j28 = j20 + (decode248 * 149865618) + (j22 * 550336261);
        long decode2410 = ((decode24(bArr, 88) << 4) & 4294967295L) + (j10 >>> 28);
        long j29 = decode32 & M28L;
        long j30 = decode242 + (j14 * 550336261) + (j17 >>> 28);
        long j31 = j17 & M28L;
        long j32 = decode325 + (j30 >>> 28);
        long j33 = j30 & M28L;
        long decode2411 = ((decode24(bArr, 81) << 4) & 4294967295L) + (decode16 * 550336261) + (j32 >>> 28);
        long j34 = j32 & M28L;
        long j35 = j29 + (decode2411 >>> 28);
        long j36 = decode2411 & M28L;
        long j37 = j24 + (decode2410 * 96434764) + (j35 * 227822194) + (j36 * 149865618);
        long j38 = j25 + (decode2410 * 227822194) + (j35 * 149865618) + (j36 * 550336261);
        long decode2412 = ((decode24(bArr, 25) << 4) & 4294967295L) + (j36 * 43969588) + (j34 * 30366549);
        long decode3211 = (decode32(bArr, 28) & 4294967295L) + (j35 * 43969588) + (j36 * 30366549) + (j34 * 163752818);
        long decode2413 = ((decode24(bArr, 32) << 4) & 4294967295L) + (decode2410 * 43969588) + (j35 * 30366549) + (j36 * 163752818) + (j34 * 258169998);
        long decode3212 = (decode32(bArr, 35) & 4294967295L) + (j22 * 43969588) + (decode2410 * 30366549) + (j35 * 163752818) + (j36 * 258169998) + (j34 * 96434764);
        long j39 = decode249 + (decode2410 * 163752818) + (j35 * 258169998) + (j36 * 96434764) + (j34 * 227822194);
        long j40 = decode3210 + (decode2410 * 258169998) + (j35 * 96434764) + (j36 * 227822194) + (j34 * 149865618);
        long j41 = j23 + (j28 >>> 28);
        long j42 = j28 & M28L;
        long j43 = j16 + (j15 * 550336261) + (j41 >>> 28);
        long j44 = j41 & M28L;
        long j45 = j31 + (j43 >>> 28);
        long j46 = j43 & M28L;
        long j47 = j33 + (j45 >>> 28);
        long j48 = j45 & M28L;
        long decode2414 = ((decode24(bArr, 11) << 4) & 4294967295L) + (j46 * 43969588);
        long decode3213 = (decode32(bArr, 14) & 4294967295L) + (j48 * 43969588) + (j46 * 30366549);
        long decode2415 = ((decode24(bArr, 18) << 4) & 4294967295L) + (j47 * 43969588) + (j48 * 30366549) + (j46 * 163752818);
        long decode3214 = (decode32(bArr, 21) & 4294967295L) + (j34 * 43969588) + (j47 * 30366549) + (j48 * 163752818) + (j46 * 258169998);
        long j49 = decode2412 + (j47 * 163752818) + (j48 * 258169998) + (j46 * 96434764);
        long j50 = decode3211 + (j47 * 258169998) + (j48 * 96434764) + (j46 * 227822194);
        long j51 = decode2413 + (j47 * 96434764) + (j48 * 227822194) + (j46 * 149865618);
        long j52 = decode3212 + (j47 * 227822194) + (j48 * 149865618) + (j46 * 550336261);
        long j53 = j26 + (decode2410 * 149865618) + (j35 * 550336261) + (j38 >>> 28);
        long j54 = j38 & M28L;
        long j55 = j27 + (decode2410 * 550336261) + (j53 >>> 28);
        long j56 = j53 & M28L;
        long j57 = j42 + (j55 >>> 28);
        long j58 = j55 & M28L;
        long j59 = j44 + (j57 >>> 28);
        long j60 = j57 & M28L;
        long j61 = j53 & M26L;
        long j62 = (j58 * 4) + (j56 >>> 26) + 1;
        long decode3215 = (decode32(bArr, 0) & 4294967295L) + (78101261 * j62);
        long decode3216 = (decode32(bArr, 7) & 4294967295L) + (j59 * 43969588) + (30366549 * j60) + (175155932 * j62);
        long j63 = decode2414 + (j59 * 30366549) + (163752818 * j60) + (64542499 * j62);
        long j64 = decode3213 + (j59 * 163752818) + (258169998 * j60) + (158326419 * j62);
        long j65 = decode2415 + (j59 * 258169998) + (96434764 * j60) + (191173276 * j62);
        long j66 = decode3214 + (j59 * 96434764) + (227822194 * j60) + (104575268 * j62);
        long j67 = j49 + (j59 * 227822194) + (149865618 * j60) + (j62 * 137584065);
        long decode2416 = ((decode24(bArr, 4) << 4) & 4294967295L) + (43969588 * j60) + (141809365 * j62) + (decode3215 >>> 28);
        long j68 = decode3215 & M28L;
        long j69 = decode3216 + (decode2416 >>> 28);
        long j70 = decode2416 & M28L;
        long j71 = j63 + (j69 >>> 28);
        long j72 = j69 & M28L;
        long j73 = j64 + (j71 >>> 28);
        long j74 = j71 & M28L;
        long j75 = j65 + (j73 >>> 28);
        long j76 = j73 & M28L;
        long j77 = j66 + (j75 >>> 28);
        long j78 = j75 & M28L;
        long j79 = j67 + (j77 >>> 28);
        long j80 = j77 & M28L;
        long j81 = j50 + (j59 * 149865618) + (j60 * 550336261) + (j79 >>> 28);
        long j82 = j79 & M28L;
        long j83 = j51 + (j59 * 550336261) + (j81 >>> 28);
        long j84 = j81 & M28L;
        long j85 = j52 + (j83 >>> 28);
        long j86 = j83 & M28L;
        long j87 = j39 + (j47 * 149865618) + (j48 * 550336261) + (j85 >>> 28);
        long j88 = j85 & M28L;
        long j89 = j40 + (j47 * 550336261) + (j87 >>> 28);
        long j90 = j87 & M28L;
        long j91 = j37 + (j34 * 550336261) + (j89 >>> 28);
        long j92 = j89 & M28L;
        long j93 = j54 + (j91 >>> 28);
        long j94 = j91 & M28L;
        long j95 = j61 + (j93 >>> 28);
        long j96 = j93 & M28L;
        long j97 = j95 & M26L;
        long j98 = (j95 >>> 26) - 1;
        long j99 = j68 - (j98 & 78101261);
        long j100 = (j70 - (j98 & 141809365)) + (j99 >> 28);
        long j101 = j99 & M28L;
        long j102 = (j72 - (j98 & 175155932)) + (j100 >> 28);
        long j103 = j100 & M28L;
        long j104 = (j74 - (j98 & 64542499)) + (j102 >> 28);
        long j105 = j102 & M28L;
        long j106 = (j76 - (j98 & 158326419)) + (j104 >> 28);
        long j107 = j104 & M28L;
        long j108 = (j78 - (j98 & 191173276)) + (j106 >> 28);
        long j109 = j106 & M28L;
        long j110 = (j80 - (j98 & 104575268)) + (j108 >> 28);
        long j111 = j108 & M28L;
        long j112 = (j82 - (j98 & 137584065)) + (j110 >> 28);
        long j113 = j110 & M28L;
        long j114 = j84 + (j112 >> 28);
        long j115 = j112 & M28L;
        long j116 = j86 + (j114 >> 28);
        long j117 = j114 & M28L;
        long j118 = j88 + (j116 >> 28);
        long j119 = j116 & M28L;
        long j120 = j90 + (j118 >> 28);
        long j121 = j118 & M28L;
        long j122 = j92 + (j120 >> 28);
        long j123 = j120 & M28L;
        long j124 = j94 + (j122 >> 28);
        long j125 = j122 & M28L;
        long j126 = j96 + (j124 >> 28);
        long j127 = j124 & M28L;
        long j128 = j97 + (j126 >> 28);
        long j129 = j126 & M28L;
        byte[] bArr2 = new byte[57];
        encode56(j101 | (j103 << 28), bArr2, 0);
        encode56(j105 | (j107 << 28), bArr2, 7);
        encode56((j111 << 28) | j109, bArr2, 14);
        encode56((j115 << 28) | j113, bArr2, 21);
        encode56((j119 << 28) | j117, bArr2, 28);
        encode56(j121 | (j123 << 28), bArr2, 35);
        encode56(j125 | (j127 << 28), bArr2, 42);
        encode56(j129 | (j128 << 28), bArr2, 49);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointExt pointExt, PointExt pointExt2) {
        int[] iArr = new int[14];
        decodeScalar(bArr, 0, iArr);
        Nat.shiftDownBits(14, iArr, 2, 0);
        Nat.cadd(14, (~iArr[0]) & 1, iArr, f62002L, iArr);
        Nat.shiftDownBit(14, iArr, 1);
        int[] pointPrecompute = pointPrecompute(pointExt, 8);
        PointExt pointExt3 = new PointExt();
        pointLookup(iArr, 111, pointPrecompute, pointExt2);
        for (int i10 = 110; i10 >= 0; i10--) {
            for (int i11 = 0; i11 < 4; i11++) {
                pointDouble(pointExt2);
            }
            pointLookup(iArr, i10, pointPrecompute, pointExt3);
            pointAdd(pointExt3, pointExt2);
        }
        for (int i12 = 0; i12 < 2; i12++) {
            pointDouble(pointExt2);
        }
    }

    private static void scalarMultBase(byte[] bArr, PointExt pointExt) {
        precompute();
        int[] iArr = new int[15];
        decodeScalar(bArr, 0, iArr);
        iArr[14] = Nat.cadd(14, (~iArr[0]) & 1, iArr, f62002L, iArr) + 4;
        Nat.shiftDownBit(15, iArr, 0);
        PointPrecomp pointPrecomp = new PointPrecomp();
        pointSetNeutral(pointExt);
        int i10 = 17;
        while (true) {
            int i11 = i10;
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = 0;
                for (int i14 = 0; i14 < 5; i14++) {
                    i13 = (i13 & (~(1 << i14))) ^ ((iArr[i11 >>> 5] >>> (i11 & 31)) << i14);
                    i11 += 18;
                }
                int i15 = (i13 >>> 4) & 1;
                pointLookup(i12, ((-i15) ^ i13) & 15, pointPrecomp);
                X448Field.cnegate(i15, pointPrecomp.f62007x);
                pointAddPrecomp(pointPrecomp, pointExt);
            }
            i10--;
            if (i10 < 0) {
                return;
            } else {
                pointDouble(pointExt);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i10) {
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr, pointExt);
        if (encodePoint(pointExt, bArr2, i10) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i10, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i10, bArr2);
        PointExt pointExt = new PointExt();
        scalarMultBase(bArr2, pointExt);
        if (checkPoint(pointExt.f62004x, pointExt.f62005y, pointExt.f62006z) == 0) {
            throw new IllegalStateException();
        }
        X448Field.copy(pointExt.f62004x, 0, iArr, 0);
        X448Field.copy(pointExt.f62005y, 0, iArr2, 0);
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointExt pointExt, PointExt pointExt2) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointExt, 8);
        pointSetNeutral(pointExt2);
        int i10 = 446;
        while (true) {
            byte b10 = wnafVar[i10];
            if (b10 != 0) {
                int i11 = b10 >> 31;
                pointAddVar(i11 != 0, precompBaseTable[(b10 ^ i11) >>> 1], pointExt2);
            }
            byte b11 = wnafVar2[i10];
            if (b11 != 0) {
                int i12 = b11 >> 31;
                pointAddVar(i12 != 0, pointPrecomputeVar[(b11 ^ i12) >>> 1], pointExt2);
            }
            i10--;
            if (i10 < 0) {
                return;
            } else {
                pointDouble(pointExt2);
            }
        }
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Xof xof, byte[] bArr4, int i12) {
        byte[] bArr5 = new byte[64];
        if (64 != xof.doFinal(bArr5, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i12);
    }

    public static boolean verify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13) {
        return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = X448Field.create();
        int[] create2 = X448Field.create();
        int[] create3 = X448Field.create();
        int[] create4 = X448Field.create();
        X448Field.sqr(iArr, create2);
        X448Field.sqr(iArr2, create3);
        X448Field.sqr(iArr3, create4);
        X448Field.mul(create2, create3, create);
        X448Field.add(create2, create3, create2);
        X448Field.mul(create2, create4, create2);
        X448Field.sqr(create4, create4);
        X448Field.mul(create, 39081, create);
        X448Field.sub(create, create4, create);
        X448Field.add(create, create2, create);
        X448Field.normalize(create);
        return X448Field.isZero(create);
    }

    private static void decode32(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = decode32(bArr, (i13 * 4) + i10);
        }
    }

    private static void implSign(byte[] bArr, int i10, byte[] bArr2, byte b10, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof createXof = createXof();
        byte[] bArr5 = new byte[114];
        createXof.update(bArr, i10, 57);
        createXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(createXof, bArr5, bArr6, bArr7, 0, bArr2, b10, bArr3, i11, i12, bArr4, i13);
    }

    private static void pointCopy(PointExt pointExt, PointExt pointExt2) {
        X448Field.copy(pointExt.f62004x, 0, pointExt2.f62004x, 0);
        X448Field.copy(pointExt.f62005y, 0, pointExt2.f62005y, 0);
        X448Field.copy(pointExt.f62006z, 0, pointExt2.f62006z, 0);
    }

    private static void pointLookup(int[] iArr, int i10, int[] iArr2, PointExt pointExt) {
        int window4 = getWindow4(iArr, i10);
        int i11 = (window4 >>> 3) ^ 1;
        int i12 = (window4 ^ (-i11)) & 7;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = ((i14 ^ i12) - 1) >> 31;
            X448Field.cmov(i15, iArr2, i13, pointExt.f62004x, 0);
            X448Field.cmov(i15, iArr2, i13 + 16, pointExt.f62005y, 0);
            X448Field.cmov(i15, iArr2, i13 + 32, pointExt.f62006z, 0);
            i13 += 48;
        }
        X448Field.cnegate(i11, pointExt.f62004x);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        implSign(bArr, i10, bArr2, (byte) 0, bArr3, i11, i12, bArr4, i13);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, byte[] bArr5, int i13) {
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64, bArr5, i13);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12) {
        return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64);
    }

    private static void implSign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof createXof = createXof();
        byte[] bArr6 = new byte[114];
        createXof.update(bArr, i10, 57);
        createXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(createXof, bArr6, bArr7, bArr2, i11, bArr3, b10, bArr4, i12, i13, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, Xof xof, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[64];
        if (64 != xof.doFinal(bArr4, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i10, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i11);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, int i12) {
        implSign(bArr, i10, bArr2, (byte) 1, bArr3, i11, 64, bArr4, i12);
    }
}
