package l1;

import Bl0.C2656q;
import Sc.C;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import m1.AbstractC8032c;
import m1.C8031b;
import m1.C8034e;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7811b0 {
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long a(float f7, float f11, float f12, float f13, @NotNull AbstractC8032c abstractC8032c) {
        int i11;
        int i12;
        int i13;
        float e11;
        float d11;
        int i14;
        int i15;
        int i16;
        int i17;
        float e12;
        float d12;
        int i18;
        int i19;
        int i21 = 31;
        if (abstractC8032c.h()) {
            float f14 = f13 < 0.0f ? 0.0f : f13;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            int i22 = ((int) ((f14 * 255.0f) + 0.5f)) << 24;
            float f15 = f7 < 0.0f ? 0.0f : f7;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            int i23 = i22 | (((int) ((f15 * 255.0f) + 0.5f)) << 16);
            float f16 = f11 < 0.0f ? 0.0f : f11;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i24 = i23 | (((int) ((f16 * 255.0f) + 0.5f)) << 8);
            float f17 = f12 >= 0.0f ? f12 : 0.0f;
            float f18 = f17 <= 1.0f ? f17 : 1.0f;
            C.Companion companion = Sc.C.INSTANCE;
            long j11 = (i24 | ((int) ((f18 * 255.0f) + 0.5f))) << 32;
            int i25 = C7807Z.f72260n;
            return j11;
        }
        if (abstractC8032c.b() != 3) {
            C7833m0.a("Color only works with ColorSpaces with 3 components");
            throw null;
        }
        int c11 = abstractC8032c.c();
        if (c11 == -1) {
            C7833m0.a("Unknown color space, please use a color space in ColorSpaces");
            throw null;
        }
        int i26 = 0;
        float e13 = abstractC8032c.e(0);
        float d13 = abstractC8032c.d(0);
        if (f7 >= e13) {
            e13 = f7;
        }
        if (e13 <= d13) {
            d13 = e13;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(d13);
        int i27 = floatToRawIntBits >>> 31;
        int i28 = (floatToRawIntBits >>> 23) & 255;
        int i29 = floatToRawIntBits & 8388607;
        if (i28 == 255) {
            i12 = i29 != 0 ? 512 : 0;
            i11 = 31;
        } else {
            i11 = i28 - 112;
            if (i11 >= 31) {
                i12 = 0;
                i11 = 49;
            } else if (i11 > 0) {
                int i31 = i29 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i13 = (((i11 << 10) | i31) + 1) | (i27 << 15);
                    short s11 = (short) i13;
                    e11 = abstractC8032c.e(1);
                    d11 = abstractC8032c.d(1);
                    if (f11 >= e11) {
                        e11 = f11;
                    }
                    if (e11 <= d11) {
                        d11 = e11;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(d11);
                    int i32 = floatToRawIntBits2 >>> 31;
                    i14 = (floatToRawIntBits2 >>> 23) & 255;
                    int i33 = floatToRawIntBits2 & 8388607;
                    if (i14 != 255) {
                        i16 = i33 != 0 ? 512 : 0;
                        i15 = 31;
                    } else {
                        i15 = i14 - 112;
                        if (i15 >= 31) {
                            i16 = 0;
                            i15 = 49;
                        } else if (i15 > 0) {
                            int i34 = i33 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i17 = (((i15 << 10) | i34) + 1) | (i32 << 15);
                                short s12 = (short) i17;
                                e12 = abstractC8032c.e(2);
                                d12 = abstractC8032c.d(2);
                                if (f12 >= e12) {
                                    e12 = f12;
                                }
                                if (e12 <= d12) {
                                    d12 = e12;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(d12);
                                int i35 = floatToRawIntBits3 >>> 31;
                                i18 = (floatToRawIntBits3 >>> 23) & 255;
                                int i36 = 8388607 & floatToRawIntBits3;
                                if (i18 != 255) {
                                    int i37 = i18 - 112;
                                    if (i37 >= 31) {
                                        i21 = 49;
                                    } else if (i37 > 0) {
                                        i26 = i36 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i19 = (((i37 << 10) | i26) + 1) | (i35 << 15);
                                            short s13 = (short) i19;
                                            long j12 = ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((65535 & s13) << 16) | ((s11 & 65535) << 48) | ((s12 & 65535) << 32) | (c11 & 63);
                                            C.Companion companion2 = Sc.C.INSTANCE;
                                            int i38 = C7807Z.f72260n;
                                            return j12;
                                        }
                                        i21 = i37;
                                    } else if (i37 >= -10) {
                                        int i39 = (i36 | 8388608) >> (1 - i37);
                                        if ((i39 & 4096) != 0) {
                                            i39 += 8192;
                                        }
                                        i21 = 0;
                                        i26 = i39 >> 13;
                                    } else {
                                        i21 = 0;
                                    }
                                } else if (i36 != 0) {
                                    i26 = 512;
                                }
                                i19 = (i35 << 15) | (i21 << 10) | i26;
                                short s132 = (short) i19;
                                if (f13 >= 0.0f) {
                                }
                                long j122 = ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((65535 & s132) << 16) | ((s11 & 65535) << 48) | ((s12 & 65535) << 32) | (c11 & 63);
                                C.Companion companion22 = Sc.C.INSTANCE;
                                int i382 = C7807Z.f72260n;
                                return j122;
                            }
                            i16 = i34;
                        } else if (i15 >= -10) {
                            int i41 = (i33 | 8388608) >> (1 - i15);
                            if ((i41 & 4096) != 0) {
                                i41 += 8192;
                            }
                            i16 = i41 >> 13;
                            i15 = 0;
                        } else {
                            i16 = 0;
                            i15 = 0;
                        }
                    }
                    i17 = i16 | (i32 << 15) | (i15 << 10);
                    short s122 = (short) i17;
                    e12 = abstractC8032c.e(2);
                    d12 = abstractC8032c.d(2);
                    if (f12 >= e12) {
                    }
                    if (e12 <= d12) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(d12);
                    int i352 = floatToRawIntBits32 >>> 31;
                    i18 = (floatToRawIntBits32 >>> 23) & 255;
                    int i362 = 8388607 & floatToRawIntBits32;
                    if (i18 != 255) {
                    }
                    i19 = (i352 << 15) | (i21 << 10) | i26;
                    short s1322 = (short) i19;
                    if (f13 >= 0.0f) {
                    }
                    long j1222 = ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((65535 & s1322) << 16) | ((s11 & 65535) << 48) | ((s122 & 65535) << 32) | (c11 & 63);
                    C.Companion companion222 = Sc.C.INSTANCE;
                    int i3822 = C7807Z.f72260n;
                    return j1222;
                }
                i12 = i31;
            } else if (i11 >= -10) {
                int i42 = (i29 | 8388608) >> (1 - i11);
                if ((i42 & 4096) != 0) {
                    i42 += 8192;
                }
                i12 = i42 >> 13;
                i11 = 0;
            } else {
                i12 = 0;
                i11 = 0;
            }
        }
        i13 = i12 | (i27 << 15) | (i11 << 10);
        short s112 = (short) i13;
        e11 = abstractC8032c.e(1);
        d11 = abstractC8032c.d(1);
        if (f11 >= e11) {
        }
        if (e11 <= d11) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(d11);
        int i322 = floatToRawIntBits22 >>> 31;
        i14 = (floatToRawIntBits22 >>> 23) & 255;
        int i332 = floatToRawIntBits22 & 8388607;
        if (i14 != 255) {
        }
        i17 = i16 | (i322 << 15) | (i15 << 10);
        short s1222 = (short) i17;
        e12 = abstractC8032c.e(2);
        d12 = abstractC8032c.d(2);
        if (f12 >= e12) {
        }
        if (e12 <= d12) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(d12);
        int i3522 = floatToRawIntBits322 >>> 31;
        i18 = (floatToRawIntBits322 >>> 23) & 255;
        int i3622 = 8388607 & floatToRawIntBits322;
        if (i18 != 255) {
        }
        i19 = (i3522 << 15) | (i21 << 10) | i26;
        short s13222 = (short) i19;
        if (f13 >= 0.0f) {
        }
        long j12222 = ((((int) ((((f13 >= 0.0f ? f13 : 0.0f) <= 1.0f ? r8 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6) | ((65535 & s13222) << 16) | ((s112 & 65535) << 48) | ((s1222 & 65535) << 32) | (c11 & 63);
        C.Companion companion2222 = Sc.C.INSTANCE;
        int i38222 = C7807Z.f72260n;
        return j12222;
    }

    public static final long b(int i11) {
        long j11 = i11;
        C.Companion companion = Sc.C.INSTANCE;
        long j12 = j11 << 32;
        int i12 = C7807Z.f72260n;
        return j12;
    }

    public static final long c(long j11) {
        long j12 = j11 << 32;
        C.Companion companion = Sc.C.INSTANCE;
        int i11 = C7807Z.f72260n;
        return j12;
    }

    public static long d(int i11, int i12, int i13) {
        return b(((i11 & 255) << 16) | (-16777216) | ((i12 & 255) << 8) | (i13 & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long e(float f7, float f11, float f12, float f13, @NotNull AbstractC8032c abstractC8032c) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21 = 31;
        if (abstractC8032c.h()) {
            C.Companion companion = Sc.C.INSTANCE;
            long j11 = ((((((int) ((f13 * 255.0f) + 0.5f)) << 24) | (((int) ((f7 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f))) << 32;
            int i22 = C7807Z.f72260n;
            return j11;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f7);
        int i23 = floatToRawIntBits >>> 31;
        int i24 = (floatToRawIntBits >>> 23) & 255;
        int i25 = floatToRawIntBits & 8388607;
        int i26 = UserVerificationMethods.USER_VERIFY_NONE;
        int i27 = 0;
        if (i24 == 255) {
            i12 = i25 != 0 ? 512 : 0;
            i11 = 31;
        } else {
            i11 = i24 - 112;
            if (i11 >= 31) {
                i11 = 49;
                i12 = 0;
            } else if (i11 > 0) {
                int i28 = i25 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i13 = (((i11 << 10) | i28) + 1) | (i23 << 15);
                    short s11 = (short) i13;
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f11);
                    int i29 = floatToRawIntBits2 >>> 31;
                    i14 = (floatToRawIntBits2 >>> 23) & 255;
                    int i31 = floatToRawIntBits2 & 8388607;
                    if (i14 != 255) {
                        i16 = i31 != 0 ? 512 : 0;
                        i15 = 31;
                    } else {
                        i15 = i14 - 112;
                        if (i15 >= 31) {
                            i15 = 49;
                            i16 = 0;
                        } else if (i15 > 0) {
                            int i32 = i31 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i17 = (((i15 << 10) | i32) + 1) | (i29 << 15);
                                short s12 = (short) i17;
                                int floatToRawIntBits3 = Float.floatToRawIntBits(f12);
                                int i33 = floatToRawIntBits3 >>> 31;
                                i18 = (floatToRawIntBits3 >>> 23) & 255;
                                int i34 = 8388607 & floatToRawIntBits3;
                                if (i18 == 255) {
                                    if (i34 == 0) {
                                        i26 = 0;
                                    }
                                    i27 = i26;
                                } else {
                                    int i35 = i18 - 112;
                                    if (i35 >= 31) {
                                        i21 = 49;
                                    } else if (i35 > 0) {
                                        i27 = i34 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i19 = (((i35 << 10) | i27) + 1) | (i33 << 15);
                                            long max = ((((short) i19) & 65535) << 16) | ((s12 & 65535) << 32) | ((s11 & 65535) << 48) | ((((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC8032c.c() & 63);
                                            C.Companion companion2 = Sc.C.INSTANCE;
                                            int i36 = C7807Z.f72260n;
                                            return max;
                                        }
                                        i21 = i35;
                                    } else if (i35 >= -10) {
                                        int i37 = (i34 | 8388608) >> (1 - i35);
                                        if ((i37 & 4096) != 0) {
                                            i37 += 8192;
                                        }
                                        i27 = i37 >> 13;
                                        i21 = 0;
                                    } else {
                                        i21 = 0;
                                    }
                                }
                                i19 = (i21 << 10) | (i33 << 15) | i27;
                                long max2 = ((((short) i19) & 65535) << 16) | ((s12 & 65535) << 32) | ((s11 & 65535) << 48) | ((((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC8032c.c() & 63);
                                C.Companion companion22 = Sc.C.INSTANCE;
                                int i362 = C7807Z.f72260n;
                                return max2;
                            }
                            i16 = i32;
                        } else if (i15 >= -10) {
                            int i38 = (i31 | 8388608) >> (1 - i15);
                            if ((i38 & 4096) != 0) {
                                i38 += 8192;
                            }
                            i16 = i38 >> 13;
                            i15 = 0;
                        } else {
                            i16 = 0;
                            i15 = 0;
                        }
                    }
                    i17 = i16 | (i29 << 15) | (i15 << 10);
                    short s122 = (short) i17;
                    int floatToRawIntBits32 = Float.floatToRawIntBits(f12);
                    int i332 = floatToRawIntBits32 >>> 31;
                    i18 = (floatToRawIntBits32 >>> 23) & 255;
                    int i342 = 8388607 & floatToRawIntBits32;
                    if (i18 == 255) {
                    }
                    i19 = (i21 << 10) | (i332 << 15) | i27;
                    long max22 = ((((short) i19) & 65535) << 16) | ((s122 & 65535) << 32) | ((s11 & 65535) << 48) | ((((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC8032c.c() & 63);
                    C.Companion companion222 = Sc.C.INSTANCE;
                    int i3622 = C7807Z.f72260n;
                    return max22;
                }
                i12 = i28;
            } else if (i11 >= -10) {
                int i39 = (i25 | 8388608) >> (1 - i11);
                if ((i39 & 4096) != 0) {
                    i39 += 8192;
                }
                i12 = i39 >> 13;
                i11 = 0;
            } else {
                i12 = 0;
                i11 = 0;
            }
        }
        i13 = i12 | (i23 << 15) | (i11 << 10);
        short s112 = (short) i13;
        int floatToRawIntBits22 = Float.floatToRawIntBits(f11);
        int i292 = floatToRawIntBits22 >>> 31;
        i14 = (floatToRawIntBits22 >>> 23) & 255;
        int i312 = floatToRawIntBits22 & 8388607;
        if (i14 != 255) {
        }
        i17 = i16 | (i292 << 15) | (i15 << 10);
        short s1222 = (short) i17;
        int floatToRawIntBits322 = Float.floatToRawIntBits(f12);
        int i3322 = floatToRawIntBits322 >>> 31;
        i18 = (floatToRawIntBits322 >>> 23) & 255;
        int i3422 = 8388607 & floatToRawIntBits322;
        if (i18 == 255) {
        }
        i19 = (i21 << 10) | (i3322 << 15) | i27;
        long max222 = ((((short) i19) & 65535) << 16) | ((s1222 & 65535) << 32) | ((s112 & 65535) << 48) | ((((int) ((Math.max(0.0f, Math.min(f13, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (abstractC8032c.c() & 63);
        C.Companion companion2222 = Sc.C.INSTANCE;
        int i36222 = C7807Z.f72260n;
        return max222;
    }

    public static final long f(long j11, long j12) {
        float f7;
        float f11;
        long n11 = C7807Z.n(j11, C7807Z.s(j12));
        float q11 = C7807Z.q(j12);
        float q12 = C7807Z.q(n11);
        float f12 = 1.0f - q12;
        float f13 = (q11 * f12) + q12;
        float u11 = C7807Z.u(n11);
        float u12 = C7807Z.u(j12);
        float f14 = 0.0f;
        if (f13 == 0.0f) {
            f7 = 0.0f;
        } else {
            f7 = (((u12 * q11) * f12) + (u11 * q12)) / f13;
        }
        float t2 = C7807Z.t(n11);
        float t11 = C7807Z.t(j12);
        if (f13 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (((t11 * q11) * f12) + (t2 * q12)) / f13;
        }
        float r11 = C7807Z.r(n11);
        float r12 = C7807Z.r(j12);
        if (f13 != 0.0f) {
            f14 = (((r12 * q11) * f12) + (r11 * q12)) / f13;
        }
        return e(f7, f11, f14, f13, C7807Z.s(j12));
    }

    public static final long g(long j11, long j12, float f7) {
        m1.l p11 = C8034e.p();
        long n11 = C7807Z.n(j11, p11);
        long n12 = C7807Z.n(j12, p11);
        float q11 = C7807Z.q(n11);
        float u11 = C7807Z.u(n11);
        float t2 = C7807Z.t(n11);
        float r11 = C7807Z.r(n11);
        float q12 = C7807Z.q(n12);
        float u12 = C7807Z.u(n12);
        float t11 = C7807Z.t(n12);
        float r12 = C7807Z.r(n12);
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        return C7807Z.n(e(C2656q.b(u11, u12, f7), C2656q.b(t2, t11, f7), C2656q.b(r11, r12, f7), C2656q.b(q11, q12, f7), p11), C7807Z.s(j12));
    }

    public static final float h(long j11) {
        long j12;
        AbstractC8032c s11 = C7807Z.s(j11);
        long f7 = s11.f();
        j12 = C8031b.f73930a;
        if (!C8031b.d(f7, j12)) {
            C7833m0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) C8031b.e(s11.f())));
            throw null;
        }
        AY.a r11 = ((m1.p) s11).r();
        double m11 = m1.p.m((m1.p) r11.f677a, C7807Z.u(j11));
        double t2 = C7807Z.t(j11);
        m1.p pVar = (m1.p) r11.f677a;
        float m12 = (float) ((m1.p.m(pVar, C7807Z.r(j11)) * 0.0722d) + (m1.p.m(pVar, t2) * 0.7152d) + (m11 * 0.2126d));
        if (m12 < 0.0f) {
            m12 = 0.0f;
        }
        if (m12 > 1.0f) {
            return 1.0f;
        }
        return m12;
    }

    public static final int i(long j11) {
        long n11 = C7807Z.n(j11, C8034e.s()) >>> 32;
        C.Companion companion = Sc.C.INSTANCE;
        return (int) n11;
    }
}
