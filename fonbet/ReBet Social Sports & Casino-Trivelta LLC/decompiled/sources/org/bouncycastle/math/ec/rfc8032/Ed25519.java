package org.bouncycastle.math.ec.rfc8032;

import com.plaid.internal.EnumC3631g;
import java.security.SecureRandom;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc7748.X25519Field;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.Arrays;

/* loaded from: classes5.dex */
public abstract class Ed25519 {

    /* renamed from: L0, reason: collision with root package name */
    private static final int f61985L0 = -50998291;

    /* renamed from: L1, reason: collision with root package name */
    private static final int f61986L1 = 19280294;

    /* renamed from: L2, reason: collision with root package name */
    private static final int f61987L2 = 127719000;

    /* renamed from: L3, reason: collision with root package name */
    private static final int f61988L3 = -6428113;

    /* renamed from: L4, reason: collision with root package name */
    private static final int f61989L4 = 5343;
    private static final long M08L = 255;
    private static final long M28L = 268435455;
    private static final long M32L = 4294967295L;
    private static final int POINT_BYTES = 32;
    private static final int PRECOMP_BLOCKS = 8;
    private static final int PRECOMP_MASK = 7;
    private static final int PRECOMP_POINTS = 8;
    private static final int PRECOMP_SPACING = 8;
    private static final int PRECOMP_TEETH = 4;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 32;
    private static final int SCALAR_BYTES = 32;
    private static final int SCALAR_INTS = 8;
    public static final int SECRET_KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM2_PREFIX = {83, 105, 103, 69, 100, 50, 53, 53, 49, 57, 32, 110, 111, 32, 69, 100, 50, 53, 53, 49, 57, 32, 99, 111, 108, 108, 105, 115, 105, 111, 110, 115};

    /* renamed from: P, reason: collision with root package name */
    private static final int[] f61990P = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: L, reason: collision with root package name */
    private static final int[] f61984L = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, 268435456};
    private static final int[] B_x = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    private static final int[] B_y = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    private static final int[] C_d = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    private static final int[] C_d2 = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    private static final int[] C_d4 = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    private static final Object precompLock = new Object();
    private static PointExt[] precompBaseTable = null;
    private static int[] precompBase = null;

    public static final class Algorithm {
        public static final int Ed25519 = 0;
        public static final int Ed25519ctx = 1;
        public static final int Ed25519ph = 2;
    }

    public static class F extends X25519Field {
        private F() {
        }
    }

    public static class PointAccum {

        /* renamed from: u, reason: collision with root package name */
        int[] f61991u;

        /* renamed from: v, reason: collision with root package name */
        int[] f61992v;

        /* renamed from: x, reason: collision with root package name */
        int[] f61993x;

        /* renamed from: y, reason: collision with root package name */
        int[] f61994y;

        /* renamed from: z, reason: collision with root package name */
        int[] f61995z;

        private PointAccum() {
            this.f61993x = X25519Field.create();
            this.f61994y = X25519Field.create();
            this.f61995z = X25519Field.create();
            this.f61991u = X25519Field.create();
            this.f61992v = X25519Field.create();
        }
    }

    public static class PointAffine {

        /* renamed from: x, reason: collision with root package name */
        int[] f61996x;

        /* renamed from: y, reason: collision with root package name */
        int[] f61997y;

        private PointAffine() {
            this.f61996x = X25519Field.create();
            this.f61997y = X25519Field.create();
        }
    }

    public static class PointExt {

        /* renamed from: t, reason: collision with root package name */
        int[] f61998t;

        /* renamed from: x, reason: collision with root package name */
        int[] f61999x;

        /* renamed from: y, reason: collision with root package name */
        int[] f62000y;

        /* renamed from: z, reason: collision with root package name */
        int[] f62001z;

        private PointExt() {
            this.f61999x = X25519Field.create();
            this.f62000y = X25519Field.create();
            this.f62001z = X25519Field.create();
            this.f61998t = X25519Field.create();
        }
    }

    public static class PointPrecomp {
        int[] xyd;
        int[] ymx_h;
        int[] ypx_h;

        private PointPrecomp() {
            this.ypx_h = X25519Field.create();
            this.ymx_h = X25519Field.create();
            this.xyd = X25519Field.create();
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        decodeScalar(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        decodeScalar(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        decodeScalar(bArr3, 0, iArr3);
        Nat256.mulAddTo(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i10 = 0; i10 < 16; i10++) {
            encode32(iArr[i10], bArr4, i10 * 4);
        }
        return reduceScalar(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr, byte b10) {
        if (bArr == null && b10 == 0) {
            return true;
        }
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(int[] iArr, int[] iArr2) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        X25519Field.sqr(iArr, create2);
        X25519Field.sqr(iArr2, create3);
        X25519Field.mul(create2, create3, create);
        X25519Field.sub(create3, create2, create3);
        X25519Field.mul(create, C_d, create);
        X25519Field.addOne(create);
        X25519Field.sub(create, create3, create);
        X25519Field.normalize(create);
        return X25519Field.isZero(create);
    }

    private static boolean checkPointVar(byte[] bArr) {
        int[] iArr = new int[8];
        decode32(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !Nat256.gte(iArr, f61990P);
    }

    private static boolean checkScalarVar(byte[] bArr) {
        decodeScalar(bArr, 0, new int[8]);
        return !Nat256.gte(r0, f61984L);
    }

    private static Digest createDigest() {
        return new SHA512Digest();
    }

    public static Digest createPrehash() {
        return createDigest();
    }

    private static int decode24(byte[] bArr, int i10) {
        return ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8);
    }

    private static int decode32(byte[] bArr, int i10) {
        return (bArr[i10 + 3] << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    private static boolean decodePointVar(byte[] bArr, int i10, boolean z10, PointAffine pointAffine) {
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i10 + 32);
        if (!checkPointVar(copyOfRange)) {
            return false;
        }
        byte b10 = copyOfRange[31];
        int i11 = (b10 & ByteCompanionObject.MIN_VALUE) >>> 7;
        copyOfRange[31] = (byte) (b10 & ByteCompanionObject.MAX_VALUE);
        X25519Field.decode(copyOfRange, 0, pointAffine.f61997y);
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        X25519Field.sqr(pointAffine.f61997y, create);
        X25519Field.mul(C_d, create, create2);
        X25519Field.subOne(create);
        X25519Field.addOne(create2);
        if (!X25519Field.sqrtRatioVar(create, create2, pointAffine.f61996x)) {
            return false;
        }
        X25519Field.normalize(pointAffine.f61996x);
        if (i11 == 1 && X25519Field.isZeroVar(pointAffine.f61996x)) {
            return false;
        }
        int[] iArr = pointAffine.f61996x;
        if (z10 ^ (i11 != (iArr[0] & 1))) {
            X25519Field.negate(iArr, iArr);
        }
        return true;
    }

    private static void decodeScalar(byte[] bArr, int i10, int[] iArr) {
        decode32(bArr, i10, iArr, 0, 8);
    }

    private static void dom2(Digest digest, byte b10, byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = DOM2_PREFIX;
            int length = bArr2.length;
            int i10 = length + 2;
            int length2 = bArr.length + i10;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, length);
            bArr3[length] = b10;
            bArr3[length + 1] = (byte) bArr.length;
            System.arraycopy(bArr, 0, bArr3, i10, bArr.length);
            digest.update(bArr3, 0, length2);
        }
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

    private static int encodePoint(PointAccum pointAccum, byte[] bArr, int i10) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        X25519Field.inv(pointAccum.f61995z, create2);
        X25519Field.mul(pointAccum.f61993x, create2, create);
        X25519Field.mul(pointAccum.f61994y, create2, create2);
        X25519Field.normalize(create);
        X25519Field.normalize(create2);
        int checkPoint = checkPoint(create, create2);
        X25519Field.encode(create2, bArr, i10);
        int i11 = i10 + 31;
        bArr[i11] = (byte) (((create[0] & 1) << 7) | bArr[i11]);
        return checkPoint;
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        secureRandom.nextBytes(bArr);
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        Digest createDigest = createDigest();
        byte[] bArr3 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i10, 32);
        createDigest.doFinal(bArr3, 0);
        byte[] bArr4 = new byte[32];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i11);
    }

    private static int getWindow4(int[] iArr, int i10) {
        return (iArr[i10 >>> 3] >>> ((i10 & 7) << 2)) & 15;
    }

    private static byte[] getWnafVar(int[] iArr, int i10) {
        int[] iArr2 = new int[16];
        int i11 = 0;
        int i12 = 8;
        int i13 = 16;
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
        byte[] bArr = new byte[253];
        int i16 = 1 << i10;
        int i17 = i16 - 1;
        int i18 = i16 >>> 1;
        int i19 = 0;
        int i20 = 0;
        while (i11 < 16) {
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

    private static void implSign(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, byte b10, byte[] bArr5, int i11, int i12, byte[] bArr6, int i13) {
        dom2(digest, b10, bArr4);
        digest.update(bArr, 32, 32);
        digest.update(bArr5, i11, i12);
        digest.doFinal(bArr, 0);
        byte[] reduceScalar = reduceScalar(bArr);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(reduceScalar, bArr7, 0);
        dom2(digest, b10, bArr4);
        digest.update(bArr7, 0, 32);
        digest.update(bArr3, i10, 32);
        digest.update(bArr5, i11, i12);
        digest.doFinal(bArr, 0);
        byte[] calculateS = calculateS(reduceScalar, reduceScalar(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i13, 32);
        System.arraycopy(calculateS, 0, bArr6, i13 + 32, 32);
    }

    private static boolean implVerify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13) {
        if (!checkContextVar(bArr3, b10)) {
            throw new IllegalArgumentException("ctx");
        }
        int i14 = i10 + 32;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i14);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i14, i10 + 64);
        if (!checkPointVar(copyOfRange) || !checkScalarVar(copyOfRange2)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArr2, i11, true, pointAffine)) {
            return false;
        }
        Digest createDigest = createDigest();
        byte[] bArr5 = new byte[createDigest.getDigestSize()];
        dom2(createDigest, b10, bArr3);
        createDigest.update(copyOfRange, 0, 32);
        createDigest.update(bArr2, i11, 32);
        createDigest.update(bArr4, i12, i13);
        createDigest.doFinal(bArr5, 0);
        byte[] reduceScalar = reduceScalar(bArr5);
        int[] iArr = new int[8];
        decodeScalar(copyOfRange2, 0, iArr);
        int[] iArr2 = new int[8];
        decodeScalar(reduceScalar, 0, iArr2);
        PointAccum pointAccum = new PointAccum();
        scalarMultStrausVar(iArr, iArr2, pointAffine, pointAccum);
        byte[] bArr6 = new byte[32];
        return encodePoint(pointAccum, bArr6, 0) != 0 && Arrays.areEqual(bArr6, copyOfRange);
    }

    private static void pointAdd(PointExt pointExt, PointAccum pointAccum) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] iArr = pointAccum.f61991u;
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] iArr2 = pointAccum.f61992v;
        X25519Field.apm(pointAccum.f61994y, pointAccum.f61993x, create2, create);
        X25519Field.apm(pointExt.f62000y, pointExt.f61999x, create4, create3);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointAccum.f61991u, pointAccum.f61992v, create3);
        X25519Field.mul(create3, pointExt.f61998t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointAccum.f61995z, pointExt.f62001z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, iArr2, iArr);
        X25519Field.apm(create4, create3, create6, create5);
        X25519Field.carry(create6);
        X25519Field.mul(iArr, create5, pointAccum.f61993x);
        X25519Field.mul(create6, iArr2, pointAccum.f61994y);
        X25519Field.mul(create5, create6, pointAccum.f61995z);
    }

    private static void pointAddPrecomp(PointPrecomp pointPrecomp, PointAccum pointAccum) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] iArr = pointAccum.f61991u;
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] iArr2 = pointAccum.f61992v;
        X25519Field.apm(pointAccum.f61994y, pointAccum.f61993x, create2, create);
        X25519Field.mul(create, pointPrecomp.ymx_h, create);
        X25519Field.mul(create2, pointPrecomp.ypx_h, create2);
        X25519Field.mul(pointAccum.f61991u, pointAccum.f61992v, create3);
        X25519Field.mul(create3, pointPrecomp.xyd, create3);
        X25519Field.apm(create2, create, iArr2, iArr);
        X25519Field.apm(pointAccum.f61995z, create3, create5, create4);
        X25519Field.carry(create5);
        X25519Field.mul(iArr, create4, pointAccum.f61993x);
        X25519Field.mul(create5, iArr2, pointAccum.f61994y);
        X25519Field.mul(create4, create5, pointAccum.f61995z);
    }

    private static void pointAddVar(boolean z10, PointExt pointExt, PointAccum pointAccum) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] iArr5 = pointAccum.f61991u;
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] iArr6 = pointAccum.f61992v;
        if (z10) {
            iArr2 = create3;
            iArr = create4;
            iArr4 = create5;
            iArr3 = create6;
        } else {
            iArr = create3;
            iArr2 = create4;
            iArr3 = create5;
            iArr4 = create6;
        }
        X25519Field.apm(pointAccum.f61994y, pointAccum.f61993x, create2, create);
        X25519Field.apm(pointExt.f62000y, pointExt.f61999x, iArr2, iArr);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointAccum.f61991u, pointAccum.f61992v, create3);
        X25519Field.mul(create3, pointExt.f61998t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointAccum.f61995z, pointExt.f62001z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, iArr6, iArr5);
        X25519Field.apm(create4, create3, iArr4, iArr3);
        X25519Field.carry(iArr4);
        X25519Field.mul(iArr5, create5, pointAccum.f61993x);
        X25519Field.mul(create6, iArr6, pointAccum.f61994y);
        X25519Field.mul(create5, create6, pointAccum.f61995z);
    }

    private static PointExt pointCopy(PointAccum pointAccum) {
        PointExt pointExt = new PointExt();
        X25519Field.copy(pointAccum.f61993x, 0, pointExt.f61999x, 0);
        X25519Field.copy(pointAccum.f61994y, 0, pointExt.f62000y, 0);
        X25519Field.copy(pointAccum.f61995z, 0, pointExt.f62001z, 0);
        X25519Field.mul(pointAccum.f61991u, pointAccum.f61992v, pointExt.f61998t);
        return pointExt;
    }

    private static void pointDouble(PointAccum pointAccum) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] iArr = pointAccum.f61991u;
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] iArr2 = pointAccum.f61992v;
        X25519Field.sqr(pointAccum.f61993x, create);
        X25519Field.sqr(pointAccum.f61994y, create2);
        X25519Field.sqr(pointAccum.f61995z, create3);
        X25519Field.add(create3, create3, create3);
        X25519Field.apm(create, create2, iArr2, create5);
        X25519Field.add(pointAccum.f61993x, pointAccum.f61994y, iArr);
        X25519Field.sqr(iArr, iArr);
        X25519Field.sub(iArr2, iArr, iArr);
        X25519Field.add(create3, create5, create4);
        X25519Field.carry(create4);
        X25519Field.mul(iArr, create4, pointAccum.f61993x);
        X25519Field.mul(create5, iArr2, pointAccum.f61994y);
        X25519Field.mul(create4, create5, pointAccum.f61995z);
    }

    private static void pointExtendXY(PointAccum pointAccum) {
        X25519Field.one(pointAccum.f61995z);
        X25519Field.copy(pointAccum.f61993x, 0, pointAccum.f61991u, 0);
        X25519Field.copy(pointAccum.f61994y, 0, pointAccum.f61992v, 0);
    }

    private static void pointLookup(int i10, int i11, PointPrecomp pointPrecomp) {
        int i12 = i10 * EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = ((i13 ^ i11) - 1) >> 31;
            X25519Field.cmov(i14, precompBase, i12, pointPrecomp.ypx_h, 0);
            X25519Field.cmov(i14, precompBase, i12 + 10, pointPrecomp.ymx_h, 0);
            X25519Field.cmov(i14, precompBase, i12 + 20, pointPrecomp.xyd, 0);
            i12 += 30;
        }
    }

    private static int[] pointPrecompute(PointAffine pointAffine, int i10) {
        PointExt pointCopy = pointCopy(pointAffine);
        PointExt pointCopy2 = pointCopy(pointCopy);
        pointAdd(pointCopy, pointCopy2);
        int[] createTable = X25519Field.createTable(i10 * 4);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            X25519Field.copy(pointCopy.f61999x, 0, createTable, i11);
            X25519Field.copy(pointCopy.f62000y, 0, createTable, i11 + 10);
            X25519Field.copy(pointCopy.f62001z, 0, createTable, i11 + 20);
            X25519Field.copy(pointCopy.f61998t, 0, createTable, i11 + 30);
            i11 += 40;
            i12++;
            if (i12 == i10) {
                return createTable;
            }
            pointAdd(pointCopy2, pointCopy);
        }
    }

    private static PointExt[] pointPrecomputeVar(PointExt pointExt, int i10) {
        PointExt pointExt2 = new PointExt();
        pointAddVar(false, pointExt, pointExt, pointExt2);
        PointExt[] pointExtArr = new PointExt[i10];
        pointExtArr[0] = pointCopy(pointExt);
        for (int i11 = 1; i11 < i10; i11++) {
            PointExt pointExt3 = pointExtArr[i11 - 1];
            PointExt pointExt4 = new PointExt();
            pointExtArr[i11] = pointExt4;
            pointAddVar(false, pointExt3, pointExt2, pointExt4);
        }
        return pointExtArr;
    }

    private static void pointSetNeutral(PointAccum pointAccum) {
        X25519Field.zero(pointAccum.f61993x);
        X25519Field.one(pointAccum.f61994y);
        X25519Field.one(pointAccum.f61995z);
        X25519Field.zero(pointAccum.f61991u);
        X25519Field.one(pointAccum.f61992v);
    }

    public static void precompute() {
        int i10;
        synchronized (precompLock) {
            try {
                if (precompBase == null) {
                    PointExt pointExt = new PointExt();
                    int[] iArr = B_x;
                    X25519Field.copy(iArr, 0, pointExt.f61999x, 0);
                    int[] iArr2 = B_y;
                    X25519Field.copy(iArr2, 0, pointExt.f62000y, 0);
                    pointExtendXY(pointExt);
                    precompBaseTable = pointPrecomputeVar(pointExt, 32);
                    PointAccum pointAccum = new PointAccum();
                    X25519Field.copy(iArr, 0, pointAccum.f61993x, 0);
                    X25519Field.copy(iArr2, 0, pointAccum.f61994y, 0);
                    pointExtendXY(pointAccum);
                    precompBase = X25519Field.createTable(192);
                    int i11 = 0;
                    for (int i12 = 0; i12 < 8; i12++) {
                        PointExt[] pointExtArr = new PointExt[4];
                        PointExt pointExt2 = new PointExt();
                        pointSetNeutral(pointExt2);
                        int i13 = 0;
                        while (true) {
                            i10 = 1;
                            if (i13 >= 4) {
                                break;
                            }
                            pointAddVar(true, pointExt2, pointCopy(pointAccum), pointExt2);
                            pointDouble(pointAccum);
                            pointExtArr[i13] = pointCopy(pointAccum);
                            if (i12 + i13 != 10) {
                                while (i10 < 8) {
                                    pointDouble(pointAccum);
                                    i10++;
                                }
                            }
                            i13++;
                        }
                        PointExt[] pointExtArr2 = new PointExt[8];
                        pointExtArr2[0] = pointExt2;
                        int i14 = 0;
                        int i15 = 1;
                        while (i14 < 3) {
                            int i16 = i10 << i14;
                            int i17 = 0;
                            while (i17 < i16) {
                                PointExt pointExt3 = pointExtArr2[i15 - i16];
                                PointExt pointExt4 = pointExtArr[i14];
                                PointExt pointExt5 = new PointExt();
                                pointExtArr2[i15] = pointExt5;
                                pointAddVar(false, pointExt3, pointExt4, pointExt5);
                                i17++;
                                i15++;
                            }
                            i14++;
                            i10 = 1;
                        }
                        int[] createTable = X25519Field.createTable(8);
                        int[] create = X25519Field.create();
                        X25519Field.copy(pointExtArr2[0].f62001z, 0, create, 0);
                        X25519Field.copy(create, 0, createTable, 0);
                        int i18 = 0;
                        while (true) {
                            int i19 = i18 + 1;
                            if (i19 >= 8) {
                                break;
                            }
                            X25519Field.mul(create, pointExtArr2[i19].f62001z, create);
                            X25519Field.copy(create, 0, createTable, i19 * 10);
                            i18 = i19;
                        }
                        X25519Field.add(create, create, create);
                        X25519Field.invVar(create, create);
                        int[] create2 = X25519Field.create();
                        while (i18 > 0) {
                            int i20 = i18 - 1;
                            X25519Field.copy(createTable, i20 * 10, create2, 0);
                            X25519Field.mul(create2, create, create2);
                            X25519Field.copy(create2, 0, createTable, i18 * 10);
                            X25519Field.mul(create, pointExtArr2[i18].f62001z, create);
                            i18 = i20;
                        }
                        X25519Field.copy(create, 0, createTable, 0);
                        for (int i21 = 0; i21 < 8; i21++) {
                            PointExt pointExt6 = pointExtArr2[i21];
                            int[] create3 = X25519Field.create();
                            int[] create4 = X25519Field.create();
                            X25519Field.copy(createTable, i21 * 10, create4, 0);
                            X25519Field.mul(pointExt6.f61999x, create4, create3);
                            X25519Field.mul(pointExt6.f62000y, create4, create4);
                            PointPrecomp pointPrecomp = new PointPrecomp();
                            X25519Field.apm(create4, create3, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
                            X25519Field.mul(create3, create4, pointPrecomp.xyd);
                            int[] iArr3 = pointPrecomp.xyd;
                            X25519Field.mul(iArr3, C_d4, iArr3);
                            X25519Field.normalize(pointPrecomp.ypx_h);
                            X25519Field.normalize(pointPrecomp.ymx_h);
                            X25519Field.copy(pointPrecomp.ypx_h, 0, precompBase, i11);
                            X25519Field.copy(pointPrecomp.ymx_h, 0, precompBase, i11 + 10);
                            X25519Field.copy(pointPrecomp.xyd, 0, precompBase, i11 + 20);
                            i11 += 30;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i10, byte[] bArr2) {
        System.arraycopy(bArr, i10, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        byte b10 = (byte) (bArr2[31] & ByteCompanionObject.MAX_VALUE);
        bArr2[31] = b10;
        bArr2[31] = (byte) (b10 | 64);
    }

    private static byte[] reduceScalar(byte[] bArr) {
        long decode32 = decode32(bArr, 49);
        long j10 = decode32 & 4294967295L;
        long decode322 = decode32(bArr, 56);
        long j11 = bArr[63] & M08L;
        long decode24 = ((decode24(bArr, 60) << 4) & 4294967295L) + ((decode322 & 4294967295L) >> 28);
        long j12 = decode322 & M28L;
        long decode323 = ((decode32(bArr, 42) & 4294967295L) - (j11 * (-6428113))) - (decode24 * 5343);
        long decode324 = ((decode32(bArr, 28) & 4294967295L) - (decode24 * (-50998291))) - (j12 * 19280294);
        long decode242 = ((((decode24(bArr, 32) << 4) & 4294967295L) - (j11 * (-50998291))) - (decode24 * 19280294)) - (j12 * 127719000);
        long decode325 = (((decode32(bArr, 35) & 4294967295L) - (j11 * 19280294)) - (decode24 * 127719000)) - (j12 * (-6428113));
        long decode243 = ((((decode24(bArr, 39) << 4) & 4294967295L) - (j11 * 127719000)) - (decode24 * (-6428113))) - (j12 * 5343);
        long decode244 = ((decode24(bArr, 53) << 4) & 4294967295L) + (j10 >> 28);
        long j13 = decode32 & M28L;
        long j14 = decode325 - (decode244 * 5343);
        long j15 = (decode242 - (decode244 * (-6428113))) - (j13 * 5343);
        long decode245 = (((decode24(bArr, 46) << 4) & 4294967295L) - (j11 * 5343)) + (decode323 >> 28);
        long decode326 = (((decode32(bArr, 21) & 4294967295L) - (decode244 * (-50998291))) - (j13 * 19280294)) - (decode245 * 127719000);
        long decode246 = (((((decode24(bArr, 25) << 4) & 4294967295L) - (j12 * (-50998291))) - (decode244 * 19280294)) - (j13 * 127719000)) - (decode245 * (-6428113));
        long j16 = ((decode324 - (decode244 * 127719000)) - (j13 * (-6428113))) - (decode245 * 5343);
        long j17 = (decode323 & M28L) + (decode243 >> 28);
        long decode327 = ((decode32(bArr, 14) & 4294967295L) - (decode245 * (-50998291))) - (j17 * 19280294);
        long decode247 = ((((decode24(bArr, 18) << 4) & 4294967295L) - (j13 * (-50998291))) - (decode245 * 19280294)) - (j17 * 127719000);
        long j18 = decode246 - (j17 * 5343);
        long j19 = (decode243 & M28L) + (j14 >> 28);
        long decode328 = (decode32(bArr, 7) & 4294967295L) - (j19 * (-50998291));
        long decode248 = (((decode24(bArr, 11) << 4) & 4294967295L) - (j17 * (-50998291))) - (j19 * 19280294);
        long j20 = decode327 - (j19 * 127719000);
        long j21 = decode247 - (j19 * (-6428113));
        long j22 = (decode326 - (j17 * (-6428113))) - (j19 * 5343);
        long j23 = (j14 & M28L) + (j15 >> 28);
        long j24 = j15 & M28L;
        long decode249 = ((decode24(bArr, 4) << 4) & 4294967295L) - (j23 * (-50998291));
        long j25 = decode328 - (j23 * 19280294);
        long j26 = decode248 - (j23 * 127719000);
        long j27 = j20 - (j23 * (-6428113));
        long j28 = j21 - (j23 * 5343);
        long j29 = j16 + (j18 >> 28);
        long j30 = j18 & M28L;
        long j31 = j24 + (j29 >> 28);
        long j32 = j29 & M28L;
        long j33 = j32 >>> 27;
        long j34 = j31 + j33;
        long decode329 = (decode32(bArr, 0) & 4294967295L) - (j34 * (-50998291));
        long j35 = j25 - (j34 * 127719000);
        long j36 = j26 - (j34 * (-6428113));
        long j37 = j27 - (j34 * 5343);
        long j38 = (decode249 - (j34 * 19280294)) + (decode329 >> 28);
        long j39 = decode329 & M28L;
        long j40 = j35 + (j38 >> 28);
        long j41 = j38 & M28L;
        long j42 = j36 + (j40 >> 28);
        long j43 = j40 & M28L;
        long j44 = j37 + (j42 >> 28);
        long j45 = j42 & M28L;
        long j46 = j28 + (j44 >> 28);
        long j47 = j44 & M28L;
        long j48 = j22 + (j46 >> 28);
        long j49 = j46 & M28L;
        long j50 = j30 + (j48 >> 28);
        long j51 = j48 & M28L;
        long j52 = j32 + (j50 >> 28);
        long j53 = j50 & M28L;
        long j54 = j52 >> 28;
        long j55 = j52 & M28L;
        long j56 = j54 - j33;
        long j57 = j39 + (j56 & (-50998291));
        long j58 = j41 + (j56 & 19280294) + (j57 >> 28);
        long j59 = j57 & M28L;
        long j60 = j43 + (j56 & 127719000) + (j58 >> 28);
        long j61 = j58 & M28L;
        long j62 = j45 + (j56 & (-6428113)) + (j60 >> 28);
        long j63 = j60 & M28L;
        long j64 = j47 + (j56 & 5343) + (j62 >> 28);
        long j65 = j62 & M28L;
        long j66 = j49 + (j64 >> 28);
        long j67 = j64 & M28L;
        long j68 = j51 + (j66 >> 28);
        long j69 = j66 & M28L;
        long j70 = j53 + (j68 >> 28);
        long j71 = j68 & M28L;
        long j72 = j55 + (j70 >> 28);
        long j73 = j70 & M28L;
        byte[] bArr2 = new byte[32];
        encode56(j59 | (j61 << 28), bArr2, 0);
        encode56(j63 | (j65 << 28), bArr2, 7);
        encode56((j69 << 28) | j67, bArr2, 14);
        encode56((j73 << 28) | j71, bArr2, 21);
        encode32((int) j72, bArr2, 28);
        return bArr2;
    }

    private static void scalarMult(byte[] bArr, PointAffine pointAffine, PointAccum pointAccum) {
        int[] iArr = new int[8];
        decodeScalar(bArr, 0, iArr);
        Nat.shiftDownBits(8, iArr, 3, 1);
        Nat.cadd(8, (~iArr[0]) & 1, iArr, f61984L, iArr);
        Nat.shiftDownBit(8, iArr, 0);
        int[] pointPrecompute = pointPrecompute(pointAffine, 8);
        PointExt pointExt = new PointExt();
        pointCopy(pointAffine, pointAccum);
        pointLookup(pointPrecompute, 7, pointExt);
        pointAdd(pointExt, pointAccum);
        int i10 = 62;
        while (true) {
            pointLookup(iArr, i10, pointPrecompute, pointExt);
            pointAdd(pointExt, pointAccum);
            pointDouble(pointAccum);
            pointDouble(pointAccum);
            pointDouble(pointAccum);
            i10--;
            if (i10 < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointAccum pointAccum) {
        precompute();
        int[] iArr = new int[8];
        decodeScalar(bArr, 0, iArr);
        Nat.cadd(8, (~iArr[0]) & 1, iArr, f61984L, iArr);
        Nat.shiftDownBit(8, iArr, 1);
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = Interleave.shuffle2(iArr[i10]);
        }
        PointPrecomp pointPrecomp = new PointPrecomp();
        pointSetNeutral(pointAccum);
        int i11 = 28;
        while (true) {
            for (int i12 = 0; i12 < 8; i12++) {
                int i13 = iArr[i12] >>> i11;
                int i14 = (i13 >>> 3) & 1;
                pointLookup(i12, (i13 ^ (-i14)) & 7, pointPrecomp);
                X25519Field.cswap(i14, pointPrecomp.ypx_h, pointPrecomp.ymx_h);
                X25519Field.cnegate(i14, pointPrecomp.xyd);
                pointAddPrecomp(pointPrecomp, pointAccum);
            }
            i11 -= 4;
            if (i11 < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i10) {
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr, pointAccum);
        if (encodePoint(pointAccum, bArr2, i10) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseYZ(X25519.Friend friend, byte[] bArr, int i10, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X25519");
        }
        byte[] bArr2 = new byte[32];
        pruneScalar(bArr, i10, bArr2);
        PointAccum pointAccum = new PointAccum();
        scalarMultBase(bArr2, pointAccum);
        if (checkPoint(pointAccum.f61993x, pointAccum.f61994y, pointAccum.f61995z) == 0) {
            throw new IllegalStateException();
        }
        X25519Field.copy(pointAccum.f61994y, 0, iArr, 0);
        X25519Field.copy(pointAccum.f61995z, 0, iArr2, 0);
    }

    private static void scalarMultStrausVar(int[] iArr, int[] iArr2, PointAffine pointAffine, PointAccum pointAccum) {
        precompute();
        byte[] wnafVar = getWnafVar(iArr, 7);
        byte[] wnafVar2 = getWnafVar(iArr2, 5);
        PointExt[] pointPrecomputeVar = pointPrecomputeVar(pointCopy(pointAffine), 8);
        pointSetNeutral(pointAccum);
        int i10 = 252;
        while (true) {
            byte b10 = wnafVar[i10];
            if (b10 != 0) {
                int i11 = b10 >> 31;
                pointAddVar(i11 != 0, precompBaseTable[(b10 ^ i11) >>> 1], pointAccum);
            }
            byte b11 = wnafVar2[i10];
            if (b11 != 0) {
                int i12 = b11 >> 31;
                pointAddVar(i12 != 0, pointPrecomputeVar[(b11 ^ i12) >>> 1], pointAccum);
            }
            i10--;
            if (i10 < 0) {
                return;
            } else {
                pointDouble(pointAccum);
            }
        }
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        implSign(bArr, i10, null, (byte) 0, bArr2, i11, i12, bArr3, i13);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Digest digest, byte[] bArr4, int i12) {
        byte[] bArr5 = new byte[64];
        if (64 != digest.doFinal(bArr5, 0)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i12);
    }

    public static boolean verify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13) {
        return implVerify(bArr, i10, bArr2, i11, null, (byte) 0, bArr3, i12, i13);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Digest digest) {
        byte[] bArr4 = new byte[64];
        if (64 == digest.doFinal(bArr4, 0)) {
            return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    private static int checkPoint(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        X25519Field.sqr(iArr, create2);
        X25519Field.sqr(iArr2, create3);
        X25519Field.sqr(iArr3, create4);
        X25519Field.mul(create2, create3, create);
        X25519Field.sub(create3, create2, create3);
        X25519Field.mul(create3, create4, create3);
        X25519Field.sqr(create4, create4);
        X25519Field.mul(create, C_d, create);
        X25519Field.add(create, create4, create);
        X25519Field.sub(create, create3, create);
        X25519Field.normalize(create);
        return X25519Field.isZero(create);
    }

    private static void decode32(byte[] bArr, int i10, int[] iArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            iArr[i11 + i13] = decode32(bArr, (i13 * 4) + i10);
        }
    }

    private static void implSign(byte[] bArr, int i10, byte[] bArr2, byte b10, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        if (!checkContextVar(bArr2, b10)) {
            throw new IllegalArgumentException("ctx");
        }
        Digest createDigest = createDigest();
        byte[] bArr5 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i10, 32);
        createDigest.doFinal(bArr5, 0);
        byte[] bArr6 = new byte[32];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[32];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(createDigest, bArr5, bArr6, bArr7, 0, bArr2, b10, bArr3, i11, i12, bArr4, i13);
    }

    private static void pointAdd(PointExt pointExt, PointExt pointExt2) {
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] create7 = X25519Field.create();
        int[] create8 = X25519Field.create();
        X25519Field.apm(pointExt.f62000y, pointExt.f61999x, create2, create);
        X25519Field.apm(pointExt2.f62000y, pointExt2.f61999x, create4, create3);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointExt.f61998t, pointExt2.f61998t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointExt.f62001z, pointExt2.f62001z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, create8, create5);
        X25519Field.apm(create4, create3, create7, create6);
        X25519Field.carry(create7);
        X25519Field.mul(create5, create6, pointExt2.f61999x);
        X25519Field.mul(create7, create8, pointExt2.f62000y);
        X25519Field.mul(create6, create7, pointExt2.f62001z);
        X25519Field.mul(create5, create8, pointExt2.f61998t);
    }

    private static void pointAddVar(boolean z10, PointExt pointExt, PointExt pointExt2, PointExt pointExt3) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] create = X25519Field.create();
        int[] create2 = X25519Field.create();
        int[] create3 = X25519Field.create();
        int[] create4 = X25519Field.create();
        int[] create5 = X25519Field.create();
        int[] create6 = X25519Field.create();
        int[] create7 = X25519Field.create();
        int[] create8 = X25519Field.create();
        if (z10) {
            iArr2 = create3;
            iArr = create4;
            iArr4 = create6;
            iArr3 = create7;
        } else {
            iArr = create3;
            iArr2 = create4;
            iArr3 = create6;
            iArr4 = create7;
        }
        X25519Field.apm(pointExt.f62000y, pointExt.f61999x, create2, create);
        X25519Field.apm(pointExt2.f62000y, pointExt2.f61999x, iArr2, iArr);
        X25519Field.mul(create, create3, create);
        X25519Field.mul(create2, create4, create2);
        X25519Field.mul(pointExt.f61998t, pointExt2.f61998t, create3);
        X25519Field.mul(create3, C_d2, create3);
        X25519Field.mul(pointExt.f62001z, pointExt2.f62001z, create4);
        X25519Field.add(create4, create4, create4);
        X25519Field.apm(create2, create, create8, create5);
        X25519Field.apm(create4, create3, iArr4, iArr3);
        X25519Field.carry(iArr4);
        X25519Field.mul(create5, create6, pointExt3.f61999x);
        X25519Field.mul(create7, create8, pointExt3.f62000y);
        X25519Field.mul(create6, create7, pointExt3.f62001z);
        X25519Field.mul(create5, create8, pointExt3.f61998t);
    }

    private static PointExt pointCopy(PointAffine pointAffine) {
        PointExt pointExt = new PointExt();
        X25519Field.copy(pointAffine.f61996x, 0, pointExt.f61999x, 0);
        X25519Field.copy(pointAffine.f61997y, 0, pointExt.f62000y, 0);
        pointExtendXY(pointExt);
        return pointExt;
    }

    private static void pointExtendXY(PointExt pointExt) {
        X25519Field.one(pointExt.f62001z);
        X25519Field.mul(pointExt.f61999x, pointExt.f62000y, pointExt.f61998t);
    }

    private static void pointLookup(int[] iArr, int i10, PointExt pointExt) {
        int i11 = i10 * 40;
        X25519Field.copy(iArr, i11, pointExt.f61999x, 0);
        X25519Field.copy(iArr, i11 + 10, pointExt.f62000y, 0);
        X25519Field.copy(iArr, i11 + 20, pointExt.f62001z, 0);
        X25519Field.copy(iArr, i11 + 30, pointExt.f61998t, 0);
    }

    private static void pointSetNeutral(PointExt pointExt) {
        X25519Field.zero(pointExt.f61999x);
        X25519Field.one(pointExt.f62000y);
        X25519Field.one(pointExt.f62001z);
        X25519Field.zero(pointExt.f61998t);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12, int i13, byte[] bArr4, int i14) {
        implSign(bArr, i10, bArr2, i11, null, (byte) 0, bArr3, i12, i13, bArr4, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, byte[] bArr5, int i13) {
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64, bArr5, i13);
    }

    public static boolean verify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13) {
        return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12) {
        return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64);
    }

    private static void implSign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        if (!checkContextVar(bArr3, b10)) {
            throw new IllegalArgumentException("ctx");
        }
        Digest createDigest = createDigest();
        byte[] bArr6 = new byte[createDigest.getDigestSize()];
        createDigest.update(bArr, i10, 32);
        createDigest.doFinal(bArr6, 0);
        byte[] bArr7 = new byte[32];
        pruneScalar(bArr6, 0, bArr7);
        implSign(createDigest, bArr6, bArr7, bArr2, i11, bArr3, b10, bArr4, i12, i13, bArr5, i14);
    }

    private static PointExt pointCopy(PointExt pointExt) {
        PointExt pointExt2 = new PointExt();
        pointCopy(pointExt, pointExt2);
        return pointExt2;
    }

    private static void pointLookup(int[] iArr, int i10, int[] iArr2, PointExt pointExt) {
        int window4 = getWindow4(iArr, i10);
        int i11 = (window4 >>> 3) ^ 1;
        int i12 = (window4 ^ (-i11)) & 7;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = ((i14 ^ i12) - 1) >> 31;
            X25519Field.cmov(i15, iArr2, i13, pointExt.f61999x, 0);
            X25519Field.cmov(i15, iArr2, i13 + 10, pointExt.f62000y, 0);
            X25519Field.cmov(i15, iArr2, i13 + 20, pointExt.f62001z, 0);
            X25519Field.cmov(i15, iArr2, i13 + 30, pointExt.f61998t, 0);
            i13 += 40;
        }
        X25519Field.cnegate(i11, pointExt.f61999x);
        X25519Field.cnegate(i11, pointExt.f61998t);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, Digest digest, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[64];
        if (64 != digest.doFinal(bArr4, 0)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i10, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i11);
    }

    private static void pointCopy(PointAffine pointAffine, PointAccum pointAccum) {
        X25519Field.copy(pointAffine.f61996x, 0, pointAccum.f61993x, 0);
        X25519Field.copy(pointAffine.f61997y, 0, pointAccum.f61994y, 0);
        pointExtendXY(pointAccum);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        implSign(bArr, i10, bArr2, (byte) 0, bArr3, i11, i12, bArr4, i13);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, int i12) {
        implSign(bArr, i10, bArr2, (byte) 1, bArr3, i11, 64, bArr4, i12);
    }

    private static void pointCopy(PointExt pointExt, PointExt pointExt2) {
        X25519Field.copy(pointExt.f61999x, 0, pointExt2.f61999x, 0);
        X25519Field.copy(pointExt.f62000y, 0, pointExt2.f62000y, 0);
        X25519Field.copy(pointExt.f62001z, 0, pointExt2.f62001z, 0);
        X25519Field.copy(pointExt.f61998t, 0, pointExt2.f61998t, 0);
    }
}
