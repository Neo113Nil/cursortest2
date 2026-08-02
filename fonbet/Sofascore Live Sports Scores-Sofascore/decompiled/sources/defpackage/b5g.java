package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b5g extends j23 {
    public static final pvd r = new pvd(21);
    public final u5l d;
    public final float e;
    public final float f;
    public final kvj g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final b75 k;
    public final a5g l;
    public final x4g m;
    public final b75 n;
    public final a5g o;
    public final x4g p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01d9, code lost:
    
        if ((((r23 - r11) * r1) - ((r1 - r13) * r3)) >= com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5g(String str, float[] fArr, u5l u5lVar, float[] fArr2, b75 b75Var, b75 b75Var2, float f, float f2, kvj kvjVar, int i) {
        super(i, 12884901888L, str);
        ?? r44;
        ?? r26;
        int i2;
        float f3;
        float[] fArr3;
        float f4;
        boolean z;
        this.d = u5lVar;
        this.e = f;
        this.f = f2;
        this.g = kvjVar;
        this.k = b75Var;
        int i3 = 1;
        this.l = new a5g(this, i3);
        int i4 = 0;
        this.m = new x4g(this, i4);
        this.n = b75Var2;
        this.o = new a5g(this, i4);
        this.p = new x4g(this, i3);
        if (fArr.length != 6 && fArr.length != 9) {
            a70.p("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            zzl.k("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max");
            throw null;
        }
        float[] fArr4 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr4[0] = f5 / f7;
            fArr4[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr4[2] = f8 / f10;
            fArr4[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr4[4] = f11 / f13;
            fArr4[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr4, 0, 6);
        }
        this.h = fArr4;
        if (fArr2 == null) {
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = fArr4[2];
            float f17 = fArr4[3];
            float f18 = fArr4[4];
            float f19 = fArr4[5];
            f3 = 1.0f;
            float f20 = u5lVar.a;
            r44 = 1;
            float f21 = u5lVar.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = f20 / f21;
            float f29 = (f16 / f17) - f27;
            float f30 = f28 - f27;
            float f31 = (f24 / f17) - f23;
            float f32 = ((f26 - f23) * f29) - (f30 * f31);
            float f33 = ((f25 / f19) - f23) * f29;
            r26 = 0;
            float f34 = (f18 / f19) - f27;
            float f35 = f33 - (f31 * f34);
            i2 = 6;
            float f36 = f32 / f35;
            float c = mz1.c(f36, f34, f30, f29);
            float f37 = (1.0f - c) - f36;
            float f38 = f37 / f15;
            float f39 = c / f17;
            float f40 = f36 / f19;
            fArr3 = new float[]{f14 * f38, f37, (f22 - f15) * f38, f16 * f39, c, (f24 - f17) * f39, f18 * f40, f36, (f25 - f19) * f40};
            this.i = fArr3;
        } else {
            r44 = 1;
            r26 = 0;
            i2 = 6;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                hg6.d(fArr2.length, "Transform must have 9 entries! Has ");
                throw null;
            }
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = pd0.A(fArr3);
        float q = d7a.q(fArr4);
        float[] fArr5 = l23.a;
        if (q / d7a.q(l23.b) > 0.9f) {
            float[] fArr6 = l23.a;
            float f41 = fArr4[r26];
            float f42 = fArr6[r26];
            float f43 = fArr4[r44];
            float f44 = fArr6[r44];
            float f45 = fArr4[2];
            float f46 = fArr6[2];
            float f47 = fArr4[3];
            float f48 = fArr6[3];
            float f49 = fArr4[4];
            float f50 = fArr6[4];
            float f51 = fArr4[5];
            float f52 = fArr6[5];
            float f53 = f51 - f52;
            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float[] fArr7 = new float[i2];
            fArr7[r26] = f41 - f42;
            fArr7[r44] = f43 - f44;
            fArr7[2] = f45 - f46;
            fArr7[3] = f47 - f48;
            fArr7[4] = f49 - f50;
            fArr7[5] = f53;
            float f54 = fArr7[r26];
            float f55 = fArr7[r44];
            if (((f44 - f52) * f54) - ((f42 - f50) * f55) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((f42 - f46) * f55) - ((f44 - f48) * f54) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f56 = fArr7[2];
                float f57 = fArr7[3];
                if (((f48 - f44) * f56) - ((f46 - f42) * f57) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && ((f46 - f50) * f57) - ((f48 - f52) * f56) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f58 = fArr7[4];
                    float f59 = fArr7[5];
                    if (((f52 - f48) * f58) - ((f50 - f46) * f59) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    }
                }
            }
        } else {
            f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i5 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            float[] fArr8 = l23.a;
            if (fArr4 != fArr8) {
                for (int i6 = r26; i6 < 6; i6++) {
                    if (Float.compare(fArr4[i6], fArr8[i6]) != 0 && Math.abs(fArr4[i6] - fArr8[i6]) > 0.001f) {
                        break;
                    }
                }
            }
            if (pd0.l(u5lVar, xw3.h) && f == f4 && f2 == f3) {
                float[] fArr9 = l23.a;
                b5g b5gVar = l23.e;
                for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(b75Var.h(d) - b5gVar.k.h(d)) <= 0.001d && Math.abs(b75Var2.h(d) - b5gVar.n.h(d)) <= 0.001d) {
                    }
                }
            }
            z = r26;
            this.q = z;
        }
        z = r44;
        this.q = z;
    }

    @Override // defpackage.j23
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.j23
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.j23
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.j23
    public final long d(float f, float f2, float f3) {
        double d = f;
        x4g x4gVar = this.p;
        float h = (float) x4gVar.h(d);
        float h2 = (float) x4gVar.h(f2);
        float h3 = (float) x4gVar.h(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * h3) + (fArr[3] * h2) + (fArr[0] * h);
        float f5 = (fArr[7] * h3) + (fArr[4] * h2) + (fArr[1] * h);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.j23
    public final float e(float f, float f2, float f3) {
        double d = f;
        x4g x4gVar = this.p;
        float h = (float) x4gVar.h(d);
        float h2 = (float) x4gVar.h(f2);
        float h3 = (float) x4gVar.h(f3);
        float[] fArr = this.i;
        return (fArr[8] * h3) + (fArr[5] * h2) + (fArr[2] * h);
    }

    @Override // defpackage.j23
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b5g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        b5g b5gVar = (b5g) obj;
        if (Float.compare(b5gVar.e, this.e) != 0 || Float.compare(b5gVar.f, this.f) != 0 || !Intrinsics.c(this.d, b5gVar.d) || !Arrays.equals(this.h, b5gVar.h)) {
            return false;
        }
        kvj kvjVar = b5gVar.g;
        kvj kvjVar2 = this.g;
        if (kvjVar2 != null) {
            return Intrinsics.c(kvjVar2, kvjVar);
        }
        if (kvjVar == null) {
            return true;
        }
        if (Intrinsics.c(this.k, b5gVar.k)) {
            return Intrinsics.c(this.n, b5gVar.n);
        }
        return false;
    }

    @Override // defpackage.j23
    public final long f(float f, float f2, float f3, float f4, j23 j23Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        x4g x4gVar = this.m;
        return hkg.a((float) x4gVar.h(f5), (float) x4gVar.h(f6), (float) x4gVar.h(f7), f4, j23Var);
    }

    @Override // defpackage.j23
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int floatToIntBits = (hashCode + (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int floatToIntBits2 = (floatToIntBits + (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : Float.floatToIntBits(f2))) * 31;
        kvj kvjVar = this.g;
        int hashCode2 = floatToIntBits2 + (kvjVar != null ? kvjVar.hashCode() : 0);
        if (kvjVar != null) {
            return hashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (hashCode2 * 31)) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5g(String str, float[] fArr, u5l u5lVar, final kvj kvjVar, int i) {
        this(str, fArr, u5lVar, null, r4, r0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, kvjVar, i);
        double d;
        b75 b75Var;
        b75 b75Var2;
        double d2 = kvjVar.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = kvjVar.g;
        double d4 = kvjVar.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            b75Var = new b75() { // from class: z4g
                @Override // defpackage.b75
                public final double h(double d5) {
                    int i5 = i4;
                    kvj kvjVar2 = kvjVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = l23.a;
                            return l23.a(kvjVar2, d5);
                        case 1:
                            float[] fArr3 = l23.a;
                            return l23.c(kvjVar2, d5);
                        case 2:
                            double d6 = kvjVar2.b;
                            return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                        case 3:
                            double d7 = kvjVar2.b;
                            double d8 = kvjVar2.c;
                            double d9 = kvjVar2.d;
                            return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                        case 4:
                            float[] fArr4 = l23.a;
                            return l23.b(kvjVar2, d5);
                        case 5:
                            float[] fArr5 = l23.a;
                            return l23.d(kvjVar2, d5);
                        case 6:
                            double d10 = kvjVar2.b;
                            double d11 = kvjVar2.c;
                            double d12 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = kvjVar2.b;
                            double d14 = kvjVar2.c;
                            double d15 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                b75Var = new b75() { // from class: z4g
                    @Override // defpackage.b75
                    public final double h(double d5) {
                        int i52 = i5;
                        kvj kvjVar2 = kvjVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = l23.a;
                                return l23.a(kvjVar2, d5);
                            case 1:
                                float[] fArr3 = l23.a;
                                return l23.c(kvjVar2, d5);
                            case 2:
                                double d6 = kvjVar2.b;
                                return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                            case 3:
                                double d7 = kvjVar2.b;
                                double d8 = kvjVar2.c;
                                double d9 = kvjVar2.d;
                                return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                            case 4:
                                float[] fArr4 = l23.a;
                                return l23.b(kvjVar2, d5);
                            case 5:
                                float[] fArr5 = l23.a;
                                return l23.d(kvjVar2, d5);
                            case 6:
                                double d10 = kvjVar2.b;
                                double d11 = kvjVar2.c;
                                double d12 = kvjVar2.d;
                                return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = kvjVar2.b;
                                double d14 = kvjVar2.c;
                                double d15 = kvjVar2.d;
                                return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                b75Var = new b75() { // from class: z4g
                    @Override // defpackage.b75
                    public final double h(double d5) {
                        int i52 = i6;
                        kvj kvjVar2 = kvjVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = l23.a;
                                return l23.a(kvjVar2, d5);
                            case 1:
                                float[] fArr3 = l23.a;
                                return l23.c(kvjVar2, d5);
                            case 2:
                                double d6 = kvjVar2.b;
                                return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                            case 3:
                                double d7 = kvjVar2.b;
                                double d8 = kvjVar2.c;
                                double d9 = kvjVar2.d;
                                return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                            case 4:
                                float[] fArr4 = l23.a;
                                return l23.b(kvjVar2, d5);
                            case 5:
                                float[] fArr5 = l23.a;
                                return l23.d(kvjVar2, d5);
                            case 6:
                                double d10 = kvjVar2.b;
                                double d11 = kvjVar2.c;
                                double d12 = kvjVar2.d;
                                return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = kvjVar2.b;
                                double d14 = kvjVar2.c;
                                double d15 = kvjVar2.d;
                                return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                b75Var = new b75() { // from class: z4g
                    @Override // defpackage.b75
                    public final double h(double d5) {
                        int i52 = i7;
                        kvj kvjVar2 = kvjVar;
                        switch (i52) {
                            case 0:
                                float[] fArr2 = l23.a;
                                return l23.a(kvjVar2, d5);
                            case 1:
                                float[] fArr3 = l23.a;
                                return l23.c(kvjVar2, d5);
                            case 2:
                                double d6 = kvjVar2.b;
                                return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                            case 3:
                                double d7 = kvjVar2.b;
                                double d8 = kvjVar2.c;
                                double d9 = kvjVar2.d;
                                return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                            case 4:
                                float[] fArr4 = l23.a;
                                return l23.b(kvjVar2, d5);
                            case 5:
                                float[] fArr5 = l23.a;
                                return l23.d(kvjVar2, d5);
                            case 6:
                                double d10 = kvjVar2.b;
                                double d11 = kvjVar2.c;
                                double d12 = kvjVar2.d;
                                return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = kvjVar2.b;
                                double d14 = kvjVar2.c;
                                double d15 = kvjVar2.d;
                                return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            b75Var2 = new b75() { // from class: z4g
                @Override // defpackage.b75
                public final double h(double d5) {
                    int i52 = i2;
                    kvj kvjVar2 = kvjVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = l23.a;
                            return l23.a(kvjVar2, d5);
                        case 1:
                            float[] fArr3 = l23.a;
                            return l23.c(kvjVar2, d5);
                        case 2:
                            double d6 = kvjVar2.b;
                            return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                        case 3:
                            double d7 = kvjVar2.b;
                            double d8 = kvjVar2.c;
                            double d9 = kvjVar2.d;
                            return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                        case 4:
                            float[] fArr4 = l23.a;
                            return l23.b(kvjVar2, d5);
                        case 5:
                            float[] fArr5 = l23.a;
                            return l23.d(kvjVar2, d5);
                        case 6:
                            double d10 = kvjVar2.b;
                            double d11 = kvjVar2.c;
                            double d12 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = kvjVar2.b;
                            double d14 = kvjVar2.c;
                            double d15 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            b75Var2 = new b75() { // from class: z4g
                @Override // defpackage.b75
                public final double h(double d5) {
                    int i52 = i3;
                    kvj kvjVar2 = kvjVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = l23.a;
                            return l23.a(kvjVar2, d5);
                        case 1:
                            float[] fArr3 = l23.a;
                            return l23.c(kvjVar2, d5);
                        case 2:
                            double d6 = kvjVar2.b;
                            return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                        case 3:
                            double d7 = kvjVar2.b;
                            double d8 = kvjVar2.c;
                            double d9 = kvjVar2.d;
                            return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                        case 4:
                            float[] fArr4 = l23.a;
                            return l23.b(kvjVar2, d5);
                        case 5:
                            float[] fArr5 = l23.a;
                            return l23.d(kvjVar2, d5);
                        case 6:
                            double d10 = kvjVar2.b;
                            double d11 = kvjVar2.c;
                            double d12 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = kvjVar2.b;
                            double d14 = kvjVar2.c;
                            double d15 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            b75Var2 = new b75() { // from class: z4g
                @Override // defpackage.b75
                public final double h(double d5) {
                    int i52 = i8;
                    kvj kvjVar2 = kvjVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = l23.a;
                            return l23.a(kvjVar2, d5);
                        case 1:
                            float[] fArr3 = l23.a;
                            return l23.c(kvjVar2, d5);
                        case 2:
                            double d6 = kvjVar2.b;
                            return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                        case 3:
                            double d7 = kvjVar2.b;
                            double d8 = kvjVar2.c;
                            double d9 = kvjVar2.d;
                            return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                        case 4:
                            float[] fArr4 = l23.a;
                            return l23.b(kvjVar2, d5);
                        case 5:
                            float[] fArr5 = l23.a;
                            return l23.d(kvjVar2, d5);
                        case 6:
                            double d10 = kvjVar2.b;
                            double d11 = kvjVar2.c;
                            double d12 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = kvjVar2.b;
                            double d14 = kvjVar2.c;
                            double d15 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            b75Var2 = new b75() { // from class: z4g
                @Override // defpackage.b75
                public final double h(double d5) {
                    int i52 = i9;
                    kvj kvjVar2 = kvjVar;
                    switch (i52) {
                        case 0:
                            float[] fArr2 = l23.a;
                            return l23.a(kvjVar2, d5);
                        case 1:
                            float[] fArr3 = l23.a;
                            return l23.c(kvjVar2, d5);
                        case 2:
                            double d6 = kvjVar2.b;
                            return d5 >= kvjVar2.e ? Math.pow((d6 * d5) + kvjVar2.c, kvjVar2.a) : kvjVar2.d * d5;
                        case 3:
                            double d7 = kvjVar2.b;
                            double d8 = kvjVar2.c;
                            double d9 = kvjVar2.d;
                            return d5 >= kvjVar2.e ? Math.pow((d7 * d5) + d8, kvjVar2.a) + kvjVar2.f : (d9 * d5) + kvjVar2.g;
                        case 4:
                            float[] fArr4 = l23.a;
                            return l23.b(kvjVar2, d5);
                        case 5:
                            float[] fArr5 = l23.a;
                            return l23.d(kvjVar2, d5);
                        case 6:
                            double d10 = kvjVar2.b;
                            double d11 = kvjVar2.c;
                            double d12 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d12 ? (Math.pow(d5, 1.0d / kvjVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = kvjVar2.b;
                            double d14 = kvjVar2.c;
                            double d15 = kvjVar2.d;
                            return d5 >= kvjVar2.e * d15 ? (Math.pow(d5 - kvjVar2.f, 1.0d / kvjVar2.a) - d14) / d13 : (d5 - kvjVar2.g) / d15;
                    }
                }
            };
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b5g(String str, float[] fArr, u5l u5lVar, final double d, float f, float f2, int i) {
        this(str, fArr, u5lVar, null, r11, r12, f, f2, new kvj(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
        b75 b75Var;
        b75 b75Var2 = r;
        if (d == 1.0d) {
            b75Var = b75Var2;
        } else {
            final int i2 = 0;
            b75Var = new b75() { // from class: y4g
                @Override // defpackage.b75
                public final double h(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            b75Var2 = new b75() { // from class: y4g
                @Override // defpackage.b75
                public final double h(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        b75 b75Var3 = b75Var2;
    }
}
