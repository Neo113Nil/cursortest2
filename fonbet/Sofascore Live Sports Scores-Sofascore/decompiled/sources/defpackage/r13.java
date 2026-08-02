package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r13 {
    public static final long b = hkg.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final /* synthetic */ int j = 0;
    public final long a;

    static {
        hkg.d(4282664004L);
        c = hkg.d(4287137928L);
        hkg.d(4291611852L);
        d = hkg.d(4294967295L);
        e = hkg.d(4294901760L);
        hkg.d(4278255360L);
        f = hkg.d(4278190335L);
        g = hkg.d(4294967040L);
        hkg.d(4278255615L);
        hkg.d(4294902015L);
        h = hkg.b(0);
        i = hkg.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l23.u);
    }

    public /* synthetic */ r13(long j2) {
        this.a = j2;
    }

    public static final /* synthetic */ r13 a(long j2) {
        return new r13(j2);
    }

    public static final long b(long j2, j23 j23Var) {
        vk3 vk3Var;
        j23 f2 = f(j2);
        int i2 = f2.c;
        int i3 = j23Var.c;
        if ((i2 | i3) < 0) {
            vk3Var = pd0.m(f2, j23Var);
        } else {
            uzc uzcVar = wk3.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = uzcVar.b(i4);
            if (b2 == null) {
                b2 = pd0.m(f2, j23Var);
                uzcVar.i(i4, b2);
            }
            vk3Var = (vk3) b2;
        }
        return vk3Var.a(j2);
    }

    public static long c(long j2, float f2) {
        return hkg.a(h(j2), g(j2), e(j2), f2, f(j2));
    }

    public static final float d(long j2) {
        float I;
        float f2;
        long j3 = 63 & j2;
        d8k d8kVar = e8k.b;
        if (j3 == 0) {
            I = (float) haa.I((j2 >>> 56) & 255);
            f2 = 255.0f;
        } else {
            I = (float) haa.I((j2 >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return I / f2;
    }

    public static final float e(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        d8k d8kVar = e8k.b;
        if (j3 == 0) {
            return ((float) haa.I((j2 >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - t78.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final j23 f(long j2) {
        float[] fArr = l23.a;
        d8k d8kVar = e8k.b;
        return l23.y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        d8k d8kVar = e8k.b;
        if (j3 == 0) {
            return ((float) haa.I((j2 >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - t78.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j2) {
        int i2;
        int i3;
        int i4;
        long j3 = 63 & j2;
        d8k d8kVar = e8k.b;
        if (j3 == 0) {
            return ((float) haa.I((j2 >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j2 >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - t78.a;
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j2) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j2));
        sb.append(", ");
        sb.append(g(j2));
        sb.append(", ");
        sb.append(e(j2));
        sb.append(", ");
        sb.append(d(j2));
        sb.append(", ");
        return lnb.q(sb, f(j2).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r13) {
            return this.a == ((r13) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        d8k d8kVar = e8k.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
