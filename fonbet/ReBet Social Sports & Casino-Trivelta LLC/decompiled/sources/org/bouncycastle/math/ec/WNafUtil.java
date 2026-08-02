package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public abstract class WNafUtil {
    private static final int[] DEFAULT_WINDOW_SIZE_CUTOFFS = {13, 41, 121, 337, 897, 2305};
    private static final byte[] EMPTY_BYTES = new byte[0];
    private static final int[] EMPTY_INTS = new int[0];
    private static final ECPoint[] EMPTY_POINTS = new ECPoint[0];
    private static final int MAX_WIDTH = 16;
    public static final String PRECOMP_NAME = "bc_wnaf";

    public static void configureBasepoint(ECPoint eCPoint) {
        ECCurve curve = eCPoint.getCurve();
        if (curve == null) {
            return;
        }
        BigInteger order = curve.getOrder();
        final int min = Math.min(16, getWindowSize(order == null ? curve.getFieldSize() + 1 : order.bitLength()) + 3);
        curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                if (wNafPreCompInfo != null && wNafPreCompInfo.getConfWidth() == min) {
                    wNafPreCompInfo.setPromotionCountdown(0);
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                wNafPreCompInfo2.setPromotionCountdown(0);
                wNafPreCompInfo2.setConfWidth(min);
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPreComp(wNafPreCompInfo.getPreComp());
                    wNafPreCompInfo2.setPreCompNeg(wNafPreCompInfo.getPreCompNeg());
                    wNafPreCompInfo2.setTwice(wNafPreCompInfo.getTwice());
                    wNafPreCompInfo2.setWidth(wNafPreCompInfo.getWidth());
                }
                return wNafPreCompInfo2;
            }
        });
    }

    public static int[] generateCompactNaf(BigInteger bigInteger) {
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i10 = bitLength >> 1;
        int[] iArr = new int[i10];
        BigInteger xor = add.xor(bigInteger);
        int i11 = bitLength - 1;
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        while (i13 < i11) {
            if (xor.testBit(i13)) {
                iArr[i12] = i14 | ((bigInteger.testBit(i13) ? -1 : 1) << 16);
                i13++;
                i14 = 1;
                i12++;
            } else {
                i14++;
            }
            i13++;
        }
        int i15 = i12 + 1;
        iArr[i12] = 65536 | i14;
        return i10 > i15 ? trim(iArr, i15) : iArr;
    }

    public static int[] generateCompactWindowNaf(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return generateCompactNaf(bigInteger);
        }
        if (i10 < 2 || i10 > 16) {
            throw new IllegalArgumentException("'width' must be in the range [2, 16]");
        }
        if ((bigInteger.bitLength() >>> 16) != 0) {
            throw new IllegalArgumentException("'k' must have bitlength < 2^16");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_INTS;
        }
        int bitLength = (bigInteger.bitLength() / i10) + 1;
        int[] iArr = new int[bitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int intValue = bigInteger.intValue() & i12;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i13) != 0;
                if (z10) {
                    intValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                iArr[i15] = i14 | (intValue << 16);
                i14 = i10;
                i15++;
            }
        }
        return bitLength > i15 ? trim(iArr, i15) : iArr;
    }

    public static byte[] generateJSF(BigInteger bigInteger, BigInteger bigInteger2) {
        int max = Math.max(bigInteger.bitLength(), bigInteger2.bitLength()) + 1;
        byte[] bArr = new byte[max];
        BigInteger bigInteger3 = bigInteger;
        BigInteger bigInteger4 = bigInteger2;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if ((i10 | i11) == 0 && bigInteger3.bitLength() <= i12 && bigInteger4.bitLength() <= i12) {
                break;
            }
            int intValue = (bigInteger3.intValue() >>> i12) + i10;
            int i14 = intValue & 7;
            int intValue2 = (bigInteger4.intValue() >>> i12) + i11;
            int i15 = intValue2 & 7;
            int i16 = intValue & 1;
            if (i16 != 0) {
                i16 -= intValue & 2;
                if (i14 + i16 == 4 && (intValue2 & 3) == 2) {
                    i16 = -i16;
                }
            }
            int i17 = intValue2 & 1;
            if (i17 != 0) {
                i17 -= intValue2 & 2;
                if (i15 + i17 == 4 && (intValue & 3) == 2) {
                    i17 = -i17;
                }
            }
            if ((i10 << 1) == i16 + 1) {
                i10 ^= 1;
            }
            if ((i11 << 1) == i17 + 1) {
                i11 ^= 1;
            }
            i12++;
            if (i12 == 30) {
                bigInteger3 = bigInteger3.shiftRight(30);
                bigInteger4 = bigInteger4.shiftRight(30);
                i12 = 0;
            }
            bArr[i13] = (byte) ((i17 & 15) | (i16 << 4));
            i13++;
        }
        return max > i13 ? trim(bArr, i13) : bArr;
    }

    public static byte[] generateNaf(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        BigInteger add = bigInteger.shiftLeft(1).add(bigInteger);
        int bitLength = add.bitLength();
        int i10 = bitLength - 1;
        byte[] bArr = new byte[i10];
        BigInteger xor = add.xor(bigInteger);
        int i11 = 1;
        while (i11 < i10) {
            if (xor.testBit(i11)) {
                bArr[i11 - 1] = (byte) (bigInteger.testBit(i11) ? -1 : 1);
                i11++;
            }
            i11++;
        }
        bArr[bitLength - 2] = 1;
        return bArr;
    }

    public static byte[] generateWindowNaf(int i10, BigInteger bigInteger) {
        if (i10 == 2) {
            return generateNaf(bigInteger);
        }
        if (i10 < 2 || i10 > 8) {
            throw new IllegalArgumentException("'width' must be in the range [2, 8]");
        }
        if (bigInteger.signum() == 0) {
            return EMPTY_BYTES;
        }
        int bitLength = bigInteger.bitLength() + 1;
        byte[] bArr = new byte[bitLength];
        int i11 = 1 << i10;
        int i12 = i11 - 1;
        int i13 = i11 >>> 1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (i14 <= bigInteger.bitLength()) {
            if (bigInteger.testBit(i14) == z10) {
                i14++;
            } else {
                bigInteger = bigInteger.shiftRight(i14);
                int intValue = bigInteger.intValue() & i12;
                if (z10) {
                    intValue++;
                }
                z10 = (intValue & i13) != 0;
                if (z10) {
                    intValue -= i11;
                }
                if (i15 > 0) {
                    i14--;
                }
                int i16 = i15 + i14;
                bArr[i16] = (byte) intValue;
                i15 = i16 + 1;
                i14 = i10;
            }
        }
        return bitLength > i15 ? trim(bArr, i15) : bArr;
    }

    public static int getNafWeight(BigInteger bigInteger) {
        if (bigInteger.signum() == 0) {
            return 0;
        }
        return bigInteger.shiftLeft(1).add(bigInteger).xor(bigInteger).bitCount();
    }

    public static WNafPreCompInfo getWNafPreCompInfo(ECPoint eCPoint) {
        return getWNafPreCompInfo(eCPoint.getCurve().getPreCompInfo(eCPoint, PRECOMP_NAME));
    }

    public static int getWindowSize(int i10) {
        return getWindowSize(i10, DEFAULT_WINDOW_SIZE_CUTOFFS, 16);
    }

    public static WNafPreCompInfo precompute(final ECPoint eCPoint, final int i10, final boolean z10) {
        final ECCurve curve = eCPoint.getCurve();
        return (WNafPreCompInfo) curve.precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.2
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo, int i11, int i12, boolean z11) {
                if (wNafPreCompInfo == null || wNafPreCompInfo.getWidth() < Math.max(wNafPreCompInfo.getConfWidth(), i11) || !checkTable(wNafPreCompInfo.getPreComp(), i12)) {
                    return false;
                }
                return !z11 || checkTable(wNafPreCompInfo.getPreCompNeg(), i12);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i11) {
                return eCPointArr != null && eCPointArr.length >= i11;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x00f2 A[LOOP:0: B:42:0x00f0->B:43:0x00f2, LOOP_END] */
            @Override // org.bouncycastle.math.ec.PreCompCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                ECPoint eCPoint2;
                ECPoint[] eCPointArr;
                ECPoint[] eCPointArr2;
                int length;
                int i11;
                ECPoint eCPoint3;
                int coordinateSystem;
                ECFieldElement eCFieldElement = null;
                WNafPreCompInfo wNafPreCompInfo = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int max = Math.max(2, Math.min(16, i10));
                if (checkExisting(wNafPreCompInfo, max, 1 << (max - 2), z10)) {
                    wNafPreCompInfo.decrementPromotionCountdown();
                    return wNafPreCompInfo;
                }
                WNafPreCompInfo wNafPreCompInfo2 = new WNafPreCompInfo();
                if (wNafPreCompInfo != null) {
                    wNafPreCompInfo2.setPromotionCountdown(wNafPreCompInfo.decrementPromotionCountdown());
                    wNafPreCompInfo2.setConfWidth(wNafPreCompInfo.getConfWidth());
                    eCPointArr = wNafPreCompInfo.getPreComp();
                    eCPointArr2 = wNafPreCompInfo.getPreCompNeg();
                    eCPoint2 = wNafPreCompInfo.getTwice();
                } else {
                    eCPoint2 = null;
                    eCPointArr = null;
                    eCPointArr2 = null;
                }
                int min = Math.min(16, Math.max(wNafPreCompInfo2.getConfWidth(), max));
                int i12 = 1 << (min - 2);
                int i13 = 0;
                if (eCPointArr == null) {
                    eCPointArr = WNafUtil.EMPTY_POINTS;
                    length = 0;
                } else {
                    length = eCPointArr.length;
                }
                if (length < i12) {
                    eCPointArr = WNafUtil.resizeTable(eCPointArr, i12);
                    if (i12 == 1) {
                        eCPointArr[0] = eCPoint.normalize();
                    } else {
                        if (length == 0) {
                            eCPointArr[0] = eCPoint;
                            i11 = 1;
                        } else {
                            i11 = length;
                        }
                        if (i12 == 2) {
                            eCPointArr[1] = eCPoint.threeTimes();
                        } else {
                            ECPoint eCPoint4 = eCPointArr[i11 - 1];
                            if (eCPoint2 == null) {
                                eCPoint2 = eCPointArr[0].twice();
                                if (!eCPoint2.isInfinity() && ECAlgorithms.isFpCurve(curve) && curve.getFieldSize() >= 64 && ((coordinateSystem = curve.getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) {
                                    eCFieldElement = eCPoint2.getZCoord(0);
                                    eCPoint3 = curve.createPoint(eCPoint2.getXCoord().toBigInteger(), eCPoint2.getYCoord().toBigInteger());
                                    ECFieldElement square = eCFieldElement.square();
                                    eCPoint4 = eCPoint4.scaleX(square).scaleY(square.multiply(eCFieldElement));
                                    if (length == 0) {
                                        eCPointArr[0] = eCPoint4;
                                    }
                                    while (i11 < i12) {
                                        eCPoint4 = eCPoint4.add(eCPoint3);
                                        eCPointArr[i11] = eCPoint4;
                                        i11++;
                                    }
                                }
                            }
                            eCPoint3 = eCPoint2;
                            while (i11 < i12) {
                            }
                        }
                        curve.normalizeAll(eCPointArr, length, i12 - length, eCFieldElement);
                    }
                }
                if (z10) {
                    if (eCPointArr2 == null) {
                        eCPointArr2 = new ECPoint[i12];
                    } else {
                        i13 = eCPointArr2.length;
                        if (i13 < i12) {
                            eCPointArr2 = WNafUtil.resizeTable(eCPointArr2, i12);
                        }
                    }
                    while (i13 < i12) {
                        eCPointArr2[i13] = eCPointArr[i13].negate();
                        i13++;
                    }
                }
                wNafPreCompInfo2.setPreComp(eCPointArr);
                wNafPreCompInfo2.setPreCompNeg(eCPointArr2);
                wNafPreCompInfo2.setTwice(eCPoint2);
                wNafPreCompInfo2.setWidth(min);
                return wNafPreCompInfo2;
            }
        });
    }

    public static WNafPreCompInfo precomputeWithPointMap(ECPoint eCPoint, final ECPointMap eCPointMap, final WNafPreCompInfo wNafPreCompInfo, final boolean z10) {
        return (WNafPreCompInfo) eCPoint.getCurve().precompute(eCPoint, PRECOMP_NAME, new PreCompCallback() { // from class: org.bouncycastle.math.ec.WNafUtil.3
            private boolean checkExisting(WNafPreCompInfo wNafPreCompInfo2, int i10, int i11, boolean z11) {
                if (wNafPreCompInfo2 == null || wNafPreCompInfo2.getWidth() < i10 || !checkTable(wNafPreCompInfo2.getPreComp(), i11)) {
                    return false;
                }
                return !z11 || checkTable(wNafPreCompInfo2.getPreCompNeg(), i11);
            }

            private boolean checkTable(ECPoint[] eCPointArr, int i10) {
                return eCPointArr != null && eCPointArr.length >= i10;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                WNafPreCompInfo wNafPreCompInfo2 = preCompInfo instanceof WNafPreCompInfo ? (WNafPreCompInfo) preCompInfo : null;
                int width = WNafPreCompInfo.this.getWidth();
                if (checkExisting(wNafPreCompInfo2, width, WNafPreCompInfo.this.getPreComp().length, z10)) {
                    wNafPreCompInfo2.decrementPromotionCountdown();
                    return wNafPreCompInfo2;
                }
                WNafPreCompInfo wNafPreCompInfo3 = new WNafPreCompInfo();
                wNafPreCompInfo3.setPromotionCountdown(WNafPreCompInfo.this.getPromotionCountdown());
                ECPoint twice = WNafPreCompInfo.this.getTwice();
                if (twice != null) {
                    wNafPreCompInfo3.setTwice(eCPointMap.map(twice));
                }
                ECPoint[] preComp = WNafPreCompInfo.this.getPreComp();
                int length = preComp.length;
                ECPoint[] eCPointArr = new ECPoint[length];
                for (int i10 = 0; i10 < preComp.length; i10++) {
                    eCPointArr[i10] = eCPointMap.map(preComp[i10]);
                }
                wNafPreCompInfo3.setPreComp(eCPointArr);
                wNafPreCompInfo3.setWidth(width);
                if (z10) {
                    ECPoint[] eCPointArr2 = new ECPoint[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        eCPointArr2[i11] = eCPointArr[i11].negate();
                    }
                    wNafPreCompInfo3.setPreCompNeg(eCPointArr2);
                }
                return wNafPreCompInfo3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECPoint[] resizeTable(ECPoint[] eCPointArr, int i10) {
        ECPoint[] eCPointArr2 = new ECPoint[i10];
        System.arraycopy(eCPointArr, 0, eCPointArr2, 0, eCPointArr.length);
        return eCPointArr2;
    }

    private static byte[] trim(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public static WNafPreCompInfo getWNafPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof WNafPreCompInfo) {
            return (WNafPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static int getWindowSize(int i10, int i11) {
        return getWindowSize(i10, DEFAULT_WINDOW_SIZE_CUTOFFS, i11);
    }

    private static int[] trim(int[] iArr, int i10) {
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public static int getWindowSize(int i10, int[] iArr) {
        return getWindowSize(i10, iArr, 16);
    }

    public static int getWindowSize(int i10, int[] iArr, int i11) {
        int i12 = 0;
        while (i12 < iArr.length && i10 >= iArr[i12]) {
            i12++;
        }
        return Math.max(2, Math.min(i11, i12 + 2));
    }
}
