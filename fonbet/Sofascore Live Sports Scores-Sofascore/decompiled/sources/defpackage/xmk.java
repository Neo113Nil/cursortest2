package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xmk {
    public final boolean a;
    public final wmk b;
    public final int c;
    public final ee4[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public xmk(boolean z, wmk wmkVar) {
        int i;
        this.a = z;
        this.b = wmkVar;
        if (z && wmkVar.equals(wmk.a)) {
            a70.r("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = wmkVar.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                zzl.b();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new ee4[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        ee4[] ee4VarArr = this.d;
        ee4 ee4Var = ee4VarArr[i];
        if (ee4Var != null) {
            ee4Var.a = j;
            ee4Var.b = f;
        } else {
            ee4 ee4Var2 = new ee4();
            ee4Var2.a = j;
            ee4Var2.b = f;
            ee4VarArr[i] = ee4Var2;
        }
    }

    public final float b(float f) {
        wmk wmkVar;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            r3a.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.e;
        ee4[] ee4VarArr = this.d;
        ee4 ee4Var = ee4VarArr[i2];
        if (ee4Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            ee4 ee4Var2 = ee4Var;
            while (true) {
                ee4 ee4Var3 = ee4VarArr[i2];
                boolean z2 = this.a;
                wmkVar = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (ee4Var3 != null) {
                    long j = ee4Var.a;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = ee4Var3.a;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = Math.abs(j2 - ee4Var2.a);
                    ee4Var2 = (wmkVar == wmk.a || z) ? ee4Var3 : ee4Var;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = ee4Var3.b;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.c) {
                int ordinal = wmkVar.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        y6a.I(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        zzl.b();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += Math.abs(f10) * (f10 - (Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = Math.signum(f8) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ xmk() {
        this(false, wmk.a);
    }

    public xmk(int i) {
        this(true, wmk.b);
    }
}
