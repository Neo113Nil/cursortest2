package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wg0 {
    public final fh0 b;
    public final ejg c;
    public int a = 0;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public wg0(fh0 fh0Var, ejg ejgVar) {
        this.b = fh0Var;
        this.c = ejgVar;
    }

    public final void a(rvh rvhVar, float f, boolean z) {
        int[] iArr;
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.h;
            fh0 fh0Var = this.b;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f;
                this.e[0] = rvhVar.b;
                this.f[0] = -1;
                rvhVar.k++;
                rvhVar.a(fh0Var);
                this.a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr2 = this.e;
                if (i2 >= iArr2.length) {
                    this.j = true;
                    this.i = iArr2.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.e[i];
                int i6 = rvhVar.b;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        int i7 = this.h;
                        int[] iArr3 = this.f;
                        if (i == i7) {
                            this.h = iArr3[i];
                        } else {
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            rvhVar.b(fh0Var);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        rvhVar.k--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f[i];
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.j) {
                int[] iArr4 = this.e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.e;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    iArr = this.e;
                    if (i10 >= iArr.length) {
                        iArr5 = iArr;
                        break;
                    } else {
                        if (iArr[i10] == -1) {
                            i8 = i10;
                            break;
                        }
                        i10++;
                    }
                }
            }
            iArr = iArr5;
            if (i8 >= iArr.length) {
                i8 = iArr.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.j = false;
                this.i = i8 - 1;
                this.g = Arrays.copyOf(this.g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i8] = rvhVar.b;
            this.g[i8] = f;
            int[] iArr6 = this.f;
            if (i3 != -1) {
                iArr6[i8] = iArr6[i3];
                iArr6[i3] = i8;
            } else {
                iArr6[i8] = this.h;
                this.h = i8;
            }
            rvhVar.k++;
            rvhVar.a(fh0Var);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int[] iArr7 = this.e;
            if (i12 >= iArr7.length) {
                this.j = true;
                this.i = iArr7.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            rvh rvhVar = ((rvh[]) this.c.d)[this.e[i]];
            if (rvhVar != null) {
                rvhVar.b(this.b);
            }
            i = this.f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final float c(rvh rvhVar) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.e[i] == rvhVar.b) {
                return this.g[i];
            }
            i = this.f[i];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final int d() {
        return this.a;
    }

    public final rvh e(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return ((rvh[]) this.c.d)[this.e[i2]];
            }
            i2 = this.f[i2];
        }
        return null;
    }

    public final float f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f[i2];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(rvh rvhVar, float f) {
        int[] iArr;
        int i;
        int[] iArr2;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            h(rvhVar, true);
            return;
        }
        int i2 = this.h;
        fh0 fh0Var = this.b;
        if (i2 == -1) {
            this.h = 0;
            this.g[0] = f;
            this.e[0] = rvhVar.b;
            this.f[0] = -1;
            rvhVar.k++;
            rvhVar.a(fh0Var);
            this.a++;
            if (this.j) {
                return;
            }
            int i3 = this.i + 1;
            this.i = i3;
            int[] iArr3 = this.e;
            if (i3 >= iArr3.length) {
                this.j = true;
                this.i = iArr3.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.a; i5++) {
            int i6 = this.e[i2];
            int i7 = rvhVar.b;
            if (i6 == i7) {
                this.g[i2] = f;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f[i2];
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.j) {
            int[] iArr4 = this.e;
            if (iArr4[i8] != -1) {
                i8 = iArr4.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr5 = this.e;
        if (i8 >= iArr5.length && this.a < iArr5.length) {
            int i10 = 0;
            while (true) {
                iArr = this.e;
                if (i10 >= iArr.length) {
                    iArr5 = iArr;
                    break;
                } else {
                    if (iArr[i10] == -1) {
                        i8 = i10;
                        break;
                    }
                    i10++;
                }
            }
            if (i8 >= iArr.length) {
                i8 = iArr.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.j = false;
                this.i = i8 - 1;
                this.g = Arrays.copyOf(this.g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i8] = rvhVar.b;
            this.g[i8] = f;
            int[] iArr6 = this.f;
            if (i4 == -1) {
                iArr6[i8] = iArr6[i4];
                iArr6[i4] = i8;
            } else {
                iArr6[i8] = this.h;
                this.h = i8;
            }
            rvhVar.k++;
            rvhVar.a(fh0Var);
            i = this.a + 1;
            this.a = i;
            if (!this.j) {
                this.i++;
            }
            iArr2 = this.e;
            if (i >= iArr2.length) {
                this.j = true;
            }
            if (this.i < iArr2.length) {
                this.j = true;
                this.i = iArr2.length - 1;
                return;
            }
            return;
        }
        iArr = iArr5;
        if (i8 >= iArr.length) {
        }
        this.e[i8] = rvhVar.b;
        this.g[i8] = f;
        int[] iArr62 = this.f;
        if (i4 == -1) {
        }
        rvhVar.k++;
        rvhVar.a(fh0Var);
        i = this.a + 1;
        this.a = i;
        if (!this.j) {
        }
        iArr2 = this.e;
        if (i >= iArr2.length) {
        }
        if (this.i < iArr2.length) {
        }
    }

    public final float h(rvh rvhVar, boolean z) {
        int i = this.h;
        if (i == -1) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.e[i] == rvhVar.b) {
                int i4 = this.h;
                int[] iArr = this.f;
                if (i == i4) {
                    this.h = iArr[i];
                } else {
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    rvhVar.b(this.b);
                }
                rvhVar.k--;
                this.a--;
                this.e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f[i];
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            StringBuilder sb = new StringBuilder(str.concat(" -> ") + this.g[i] + " : ");
            sb.append(((rvh[]) this.c.d)[this.e[i]]);
            str = sb.toString();
            i = this.f[i];
        }
        return str;
    }
}
