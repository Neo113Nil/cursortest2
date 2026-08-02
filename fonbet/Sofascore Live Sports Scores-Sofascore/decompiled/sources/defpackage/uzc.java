package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uzc extends p6a {
    public int f;

    public uzc(int i) {
        this.a = qrg.a;
        this.b = b7a.a;
        this.c = kik.k;
        if (i >= 0) {
            f(qrg.d(i));
        } else {
            a70.p("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != qrg.a) {
            mh0.o(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        mh0.m(0, this.d, null, this.c);
        this.f = qrg.a(this.d) - this.e;
    }

    public final int d(int i) {
        long j;
        long j2;
        int i2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i3;
        int i4 = -862048943;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j4 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j5 = i7;
            int i14 = i10;
            int i15 = 0;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                int i16 = i4;
                int i17 = i15;
                if (this.b[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i4 = i16;
                i15 = i17;
            }
            int i18 = i4;
            int i19 = i15;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int e = e(i6);
                long j8 = 255;
                if (this.f != 0 || ((this.a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    j3 = 128;
                } else {
                    int i20 = this.d;
                    if (i20 > 8) {
                        j3 = 128;
                        long j9 = this.e;
                        d8k d8kVar = e8k.b;
                        if (Long.compareUnsigned(j9 * 32, i20 * 25) <= 0) {
                            long[] jArr4 = this.a;
                            int i21 = this.d;
                            int[] iArr2 = this.b;
                            Object[] objArr2 = this.c;
                            int i22 = (i21 + 7) >> 3;
                            int i23 = i19;
                            while (i23 < i22) {
                                long j10 = j8;
                                long j11 = jArr4[i23] & (-9187201950435737472L);
                                jArr4[i23] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i23++;
                                j5 = j5;
                                j8 = j10;
                            }
                            j = j8;
                            j2 = j5;
                            int C = ph0.C(jArr4);
                            int i24 = C - 1;
                            long j12 = 72057594037927935L;
                            jArr4[i24] = (jArr4[i24] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[C] = jArr4[i19];
                            int i25 = i19;
                            while (i25 != i21) {
                                int i26 = i25 >> 3;
                                int i27 = (i25 & 7) << 3;
                                long j13 = (jArr4[i26] >> i27) & j;
                                if (j13 != 128 && j13 == 254) {
                                    int hashCode2 = Integer.hashCode(iArr2[i25]) * i18;
                                    int i28 = hashCode2 ^ (hashCode2 << 16);
                                    int i29 = i28 >>> 7;
                                    int e2 = e(i29);
                                    int i30 = i29 & i21;
                                    if (((e2 - i30) & i21) / 8 == ((i25 - i30) & i21) / 8) {
                                        long j14 = j12;
                                        jArr4[i26] = ((i28 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) << i27) | ((~(j << i27)) & jArr4[i26]);
                                        jArr4[jArr4.length - i13] = (jArr4[i19] & j14) | Long.MIN_VALUE;
                                        i25++;
                                        j12 = j14;
                                    } else {
                                        long j15 = j12;
                                        int i31 = e2 >> 3;
                                        long j16 = jArr4[i31];
                                        int i32 = (e2 & 7) << 3;
                                        if (((j16 >> i32) & j) == 128) {
                                            i3 = i13;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i31] = ((~(j << i32)) & j16) | ((i28 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) << i32);
                                            jArr4[i26] = (jArr4[i26] & (~(j << i27))) | (128 << i27);
                                            iArr[e2] = iArr[i25];
                                            iArr[i25] = i19;
                                            objArr[e2] = objArr[i25];
                                            objArr[i25] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i3 = i13;
                                            jArr4[i31] = ((i28 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) << i32) | ((~(j << i32)) & j16);
                                            int i33 = iArr[e2];
                                            iArr[e2] = iArr[i25];
                                            iArr[i25] = i33;
                                            Object obj = objArr[e2];
                                            objArr[e2] = objArr[i25];
                                            objArr[i25] = obj;
                                            i25--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i19] & j15) | Long.MIN_VALUE;
                                        i25++;
                                        j12 = j15;
                                        i13 = i3;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i25++;
                                }
                            }
                            i2 = i13;
                            this.f = qrg.a(this.d) - this.e;
                            e = e(i6);
                        }
                    } else {
                        j3 = 128;
                    }
                    j = 255;
                    j2 = j5;
                    i2 = 1;
                    int b = qrg.b(this.d);
                    long[] jArr5 = this.a;
                    int[] iArr3 = this.b;
                    Object[] objArr3 = this.c;
                    int i34 = this.d;
                    f(b);
                    long[] jArr6 = this.a;
                    int[] iArr4 = this.b;
                    Object[] objArr4 = this.c;
                    int i35 = this.d;
                    int i36 = i19;
                    while (i36 < i34) {
                        if (((jArr5[i36 >> 3] >> ((i36 & 7) << 3)) & 255) < j3) {
                            int i37 = iArr3[i36];
                            int hashCode3 = Integer.hashCode(i37) * i18;
                            int i38 = hashCode3 ^ (hashCode3 << 16);
                            int e3 = e(i38 >>> 7);
                            long j17 = i38 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                            int i39 = e3 >> 3;
                            int i40 = (e3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j18 = (jArr6[i39] & (~(255 << i40))) | (j17 << i40);
                            jArr[i39] = j18;
                            jArr[(((e3 - 7) & i35) + (i35 & 7)) >> 3] = j18;
                            iArr4[e3] = i37;
                            objArr4[e3] = objArr3[i36];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i36++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    e = e(i6);
                }
                this.e++;
                int i41 = this.f;
                long[] jArr7 = this.a;
                int i42 = e >> 3;
                long j19 = jArr7[i42];
                int i43 = (e & 7) << 3;
                if (((j19 >> i43) & j) != j3) {
                    i2 = i19;
                }
                this.f = i41 - i2;
                int i44 = this.d;
                long j20 = (j19 & (~(j << i43))) | (j2 << i43);
                jArr7[i42] = j20;
                jArr7[(((e - 7) & i44) + (i44 & 7)) >> 3] = j20;
                return e;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i18;
        }
    }

    public final int e(int i) {
        int i2 = this.d;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void f(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, qrg.c(i)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = qrg.a;
        } else {
            int i2 = ((max + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.f = qrg.a(this.d) - this.e;
        this.b = new int[max];
        this.c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i5 = this.d;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.b[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            return h(i2);
        }
        return null;
    }

    public final Object h(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void i(int i, Object obj) {
        int d = d(i);
        this.b[d] = i;
        this.c[d] = obj;
    }

    public /* synthetic */ uzc() {
        this(6);
    }
}
