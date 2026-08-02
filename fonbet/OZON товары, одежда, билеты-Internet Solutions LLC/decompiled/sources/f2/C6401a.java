package f2;

import B4.V;
import Ij.C3261b;
import f2.C6402b;
import java.util.Arrays;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6401a implements C6402b.a {

    /* renamed from: b, reason: collision with root package name */
    private final C6402b f62436b;

    /* renamed from: c, reason: collision with root package name */
    protected final C6403c f62437c;

    /* renamed from: a, reason: collision with root package name */
    int f62435a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f62438d = 8;

    /* renamed from: e, reason: collision with root package name */
    private int[] f62439e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    private int[] f62440f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private float[] f62441g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    private int f62442h = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f62443i = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f62444j = false;

    C6401a(C6402b c6402b, C6403c c6403c) {
        this.f62436b = c6402b;
        this.f62437c = c6403c;
    }

    @Override // f2.C6402b.a
    public final void a(h hVar, float f7) {
        if (f7 == 0.0f) {
            d(hVar, true);
            return;
        }
        int i11 = this.f62442h;
        C6402b c6402b = this.f62436b;
        if (i11 == -1) {
            this.f62442h = 0;
            this.f62441g[0] = f7;
            this.f62439e[0] = hVar.f62479b;
            this.f62440f[0] = -1;
            hVar.f62489l++;
            hVar.a(c6402b);
            this.f62435a++;
            if (this.f62444j) {
                return;
            }
            int i12 = this.f62443i + 1;
            this.f62443i = i12;
            int[] iArr = this.f62439e;
            if (i12 >= iArr.length) {
                this.f62444j = true;
                this.f62443i = iArr.length - 1;
                return;
            }
            return;
        }
        int i13 = -1;
        for (int i14 = 0; i11 != -1 && i14 < this.f62435a; i14++) {
            int i15 = this.f62439e[i11];
            int i16 = hVar.f62479b;
            if (i15 == i16) {
                this.f62441g[i11] = f7;
                return;
            }
            if (i15 < i16) {
                i13 = i11;
            }
            i11 = this.f62440f[i11];
        }
        int i17 = this.f62443i;
        int i18 = i17 + 1;
        if (this.f62444j) {
            int[] iArr2 = this.f62439e;
            if (iArr2[i17] != -1) {
                i17 = iArr2.length;
            }
        } else {
            i17 = i18;
        }
        int[] iArr3 = this.f62439e;
        if (i17 >= iArr3.length && this.f62435a < iArr3.length) {
            int i19 = 0;
            while (true) {
                int[] iArr4 = this.f62439e;
                if (i19 >= iArr4.length) {
                    break;
                }
                if (iArr4[i19] == -1) {
                    i17 = i19;
                    break;
                }
                i19++;
            }
        }
        int[] iArr5 = this.f62439e;
        if (i17 >= iArr5.length) {
            i17 = iArr5.length;
            int i21 = this.f62438d * 2;
            this.f62438d = i21;
            this.f62444j = false;
            this.f62443i = i17 - 1;
            this.f62441g = Arrays.copyOf(this.f62441g, i21);
            this.f62439e = Arrays.copyOf(this.f62439e, this.f62438d);
            this.f62440f = Arrays.copyOf(this.f62440f, this.f62438d);
        }
        this.f62439e[i17] = hVar.f62479b;
        this.f62441g[i17] = f7;
        if (i13 != -1) {
            int[] iArr6 = this.f62440f;
            iArr6[i17] = iArr6[i13];
            iArr6[i13] = i17;
        } else {
            this.f62440f[i17] = this.f62442h;
            this.f62442h = i17;
        }
        hVar.f62489l++;
        hVar.a(c6402b);
        int i22 = this.f62435a + 1;
        this.f62435a = i22;
        if (!this.f62444j) {
            this.f62443i++;
        }
        int[] iArr7 = this.f62439e;
        if (i22 >= iArr7.length) {
            this.f62444j = true;
        }
        if (this.f62443i >= iArr7.length) {
            this.f62444j = true;
            this.f62443i = iArr7.length - 1;
        }
    }

    @Override // f2.C6402b.a
    public final h b(int i11) {
        int i12 = this.f62442h;
        for (int i13 = 0; i12 != -1 && i13 < this.f62435a; i13++) {
            if (i13 == i11) {
                return this.f62437c.f62452c[this.f62439e[i12]];
            }
            i12 = this.f62440f[i12];
        }
        return null;
    }

    @Override // f2.C6402b.a
    public final boolean c(h hVar) {
        int i11 = this.f62442h;
        if (i11 != -1) {
            for (int i12 = 0; i11 != -1 && i12 < this.f62435a; i12++) {
                if (this.f62439e[i11] == hVar.f62479b) {
                    return true;
                }
                i11 = this.f62440f[i11];
            }
        }
        return false;
    }

    @Override // f2.C6402b.a
    public final void clear() {
        int i11 = this.f62442h;
        for (int i12 = 0; i11 != -1 && i12 < this.f62435a; i12++) {
            h hVar = this.f62437c.f62452c[this.f62439e[i11]];
            if (hVar != null) {
                hVar.b(this.f62436b);
            }
            i11 = this.f62440f[i11];
        }
        this.f62442h = -1;
        this.f62443i = -1;
        this.f62444j = false;
        this.f62435a = 0;
    }

    @Override // f2.C6402b.a
    public final float d(h hVar, boolean z11) {
        int i11 = this.f62442h;
        if (i11 == -1) {
            return 0.0f;
        }
        int i12 = 0;
        int i13 = -1;
        while (i11 != -1 && i12 < this.f62435a) {
            if (this.f62439e[i11] == hVar.f62479b) {
                if (i11 == this.f62442h) {
                    this.f62442h = this.f62440f[i11];
                } else {
                    int[] iArr = this.f62440f;
                    iArr[i13] = iArr[i11];
                }
                if (z11) {
                    hVar.b(this.f62436b);
                }
                hVar.f62489l--;
                this.f62435a--;
                this.f62439e[i11] = -1;
                if (this.f62444j) {
                    this.f62443i = i11;
                }
                return this.f62441g[i11];
            }
            i12++;
            i13 = i11;
            i11 = this.f62440f[i11];
        }
        return 0.0f;
    }

    @Override // f2.C6402b.a
    public final float e(C6402b c6402b, boolean z11) {
        float h11 = h(c6402b.f62445a);
        d(c6402b.f62445a, z11);
        C6402b.a aVar = c6402b.f62448d;
        int j11 = aVar.j();
        for (int i11 = 0; i11 < j11; i11++) {
            h b11 = aVar.b(i11);
            i(b11, aVar.h(b11) * h11, z11);
        }
        return h11;
    }

    @Override // f2.C6402b.a
    public final void f(float f7) {
        int i11 = this.f62442h;
        for (int i12 = 0; i11 != -1 && i12 < this.f62435a; i12++) {
            float[] fArr = this.f62441g;
            fArr[i11] = fArr[i11] / f7;
            i11 = this.f62440f[i11];
        }
    }

    @Override // f2.C6402b.a
    public final void g() {
        int i11 = this.f62442h;
        for (int i12 = 0; i11 != -1 && i12 < this.f62435a; i12++) {
            float[] fArr = this.f62441g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f62440f[i11];
        }
    }

    @Override // f2.C6402b.a
    public final float h(h hVar) {
        int i11 = this.f62442h;
        for (int i12 = 0; i11 != -1 && i12 < this.f62435a; i12++) {
            if (this.f62439e[i11] == hVar.f62479b) {
                return this.f62441g[i11];
            }
            i11 = this.f62440f[i11];
        }
        return 0.0f;
    }

    @Override // f2.C6402b.a
    public final void i(h hVar, float f7, boolean z11) {
        if (f7 <= -0.001f || f7 >= 0.001f) {
            int i11 = this.f62442h;
            C6402b c6402b = this.f62436b;
            if (i11 == -1) {
                this.f62442h = 0;
                this.f62441g[0] = f7;
                this.f62439e[0] = hVar.f62479b;
                this.f62440f[0] = -1;
                hVar.f62489l++;
                hVar.a(c6402b);
                this.f62435a++;
                if (this.f62444j) {
                    return;
                }
                int i12 = this.f62443i + 1;
                this.f62443i = i12;
                int[] iArr = this.f62439e;
                if (i12 >= iArr.length) {
                    this.f62444j = true;
                    this.f62443i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i13 = -1;
            for (int i14 = 0; i11 != -1 && i14 < this.f62435a; i14++) {
                int i15 = this.f62439e[i11];
                int i16 = hVar.f62479b;
                if (i15 == i16) {
                    float[] fArr = this.f62441g;
                    float f11 = fArr[i11] + f7;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i11] = f11;
                    if (f11 == 0.0f) {
                        if (i11 == this.f62442h) {
                            this.f62442h = this.f62440f[i11];
                        } else {
                            int[] iArr2 = this.f62440f;
                            iArr2[i13] = iArr2[i11];
                        }
                        if (z11) {
                            hVar.b(c6402b);
                        }
                        if (this.f62444j) {
                            this.f62443i = i11;
                        }
                        hVar.f62489l--;
                        this.f62435a--;
                        return;
                    }
                    return;
                }
                if (i15 < i16) {
                    i13 = i11;
                }
                i11 = this.f62440f[i11];
            }
            int i17 = this.f62443i;
            int i18 = i17 + 1;
            if (this.f62444j) {
                int[] iArr3 = this.f62439e;
                if (iArr3[i17] != -1) {
                    i17 = iArr3.length;
                }
            } else {
                i17 = i18;
            }
            int[] iArr4 = this.f62439e;
            if (i17 >= iArr4.length && this.f62435a < iArr4.length) {
                int i19 = 0;
                while (true) {
                    int[] iArr5 = this.f62439e;
                    if (i19 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i19] == -1) {
                        i17 = i19;
                        break;
                    }
                    i19++;
                }
            }
            int[] iArr6 = this.f62439e;
            if (i17 >= iArr6.length) {
                i17 = iArr6.length;
                int i21 = this.f62438d * 2;
                this.f62438d = i21;
                this.f62444j = false;
                this.f62443i = i17 - 1;
                this.f62441g = Arrays.copyOf(this.f62441g, i21);
                this.f62439e = Arrays.copyOf(this.f62439e, this.f62438d);
                this.f62440f = Arrays.copyOf(this.f62440f, this.f62438d);
            }
            this.f62439e[i17] = hVar.f62479b;
            this.f62441g[i17] = f7;
            if (i13 != -1) {
                int[] iArr7 = this.f62440f;
                iArr7[i17] = iArr7[i13];
                iArr7[i13] = i17;
            } else {
                this.f62440f[i17] = this.f62442h;
                this.f62442h = i17;
            }
            hVar.f62489l++;
            hVar.a(c6402b);
            this.f62435a++;
            if (!this.f62444j) {
                this.f62443i++;
            }
            int i22 = this.f62443i;
            int[] iArr8 = this.f62439e;
            if (i22 >= iArr8.length) {
                this.f62444j = true;
                this.f62443i = iArr8.length - 1;
            }
        }
    }

    @Override // f2.C6402b.a
    public final int j() {
        return this.f62435a;
    }

    @Override // f2.C6402b.a
    public final float k(int i11) {
        int i12 = this.f62442h;
        for (int i13 = 0; i12 != -1 && i13 < this.f62435a; i13++) {
            if (i13 == i11) {
                return this.f62441g[i12];
            }
            i12 = this.f62440f[i12];
        }
        return 0.0f;
    }

    public final String toString() {
        int i11 = this.f62442h;
        String str = "";
        for (int i12 = 0; i11 != -1 && i12 < this.f62435a; i12++) {
            StringBuilder e11 = C3261b.e(V.b(this.f62441g[i11], " : ", C3261b.e(U7.d.e(str, " -> "))));
            e11.append(this.f62437c.f62452c[this.f62439e[i11]]);
            str = e11.toString();
            i11 = this.f62440f[i11];
        }
        return str;
    }
}
