package v;

import java.util.Arrays;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public final b f24335b;

    /* renamed from: c, reason: collision with root package name */
    public final kh.g f24336c;

    /* renamed from: a, reason: collision with root package name */
    public int f24334a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24337d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f24338e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f24339f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f24340g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f24341h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f24342i = -1;
    public boolean j = false;

    public a(b bVar, kh.g gVar) {
        this.f24335b = bVar;
        this.f24336c = gVar;
    }

    public final void a(g gVar, float f6, boolean z5) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i5 = this.f24341h;
            b bVar = this.f24335b;
            if (i5 == -1) {
                this.f24341h = 0;
                this.f24340g[0] = f6;
                this.f24338e[0] = gVar.f24369b;
                this.f24339f[0] = -1;
                gVar.f24377k++;
                gVar.a(bVar);
                this.f24334a++;
                if (this.j) {
                    return;
                }
                int i10 = this.f24342i + 1;
                this.f24342i = i10;
                int[] iArr = this.f24338e;
                if (i10 >= iArr.length) {
                    this.j = true;
                    this.f24342i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i5 != -1 && i12 < this.f24334a; i12++) {
                int i13 = this.f24338e[i5];
                int i14 = gVar.f24369b;
                if (i13 == i14) {
                    float[] fArr = this.f24340g;
                    float f10 = fArr[i5] + f6;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i5] = f10;
                    if (f10 == 0.0f) {
                        if (i5 == this.f24341h) {
                            this.f24341h = this.f24339f[i5];
                        } else {
                            int[] iArr2 = this.f24339f;
                            iArr2[i11] = iArr2[i5];
                        }
                        if (z5) {
                            gVar.b(bVar);
                        }
                        if (this.j) {
                            this.f24342i = i5;
                        }
                        gVar.f24377k--;
                        this.f24334a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i5;
                }
                i5 = this.f24339f[i5];
            }
            int i15 = this.f24342i;
            int i16 = i15 + 1;
            if (this.j) {
                int[] iArr3 = this.f24338e;
                if (iArr3[i15] != -1) {
                    i15 = iArr3.length;
                }
            } else {
                i15 = i16;
            }
            int[] iArr4 = this.f24338e;
            if (i15 >= iArr4.length && this.f24334a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f24338e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        i15 = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f24338e;
            if (i15 >= iArr6.length) {
                i15 = iArr6.length;
                int i18 = this.f24337d * 2;
                this.f24337d = i18;
                this.j = false;
                this.f24342i = i15 - 1;
                this.f24340g = Arrays.copyOf(this.f24340g, i18);
                this.f24338e = Arrays.copyOf(this.f24338e, this.f24337d);
                this.f24339f = Arrays.copyOf(this.f24339f, this.f24337d);
            }
            this.f24338e[i15] = gVar.f24369b;
            this.f24340g[i15] = f6;
            if (i11 != -1) {
                int[] iArr7 = this.f24339f;
                iArr7[i15] = iArr7[i11];
                iArr7[i11] = i15;
            } else {
                this.f24339f[i15] = this.f24341h;
                this.f24341h = i15;
            }
            gVar.f24377k++;
            gVar.a(bVar);
            this.f24334a++;
            if (!this.j) {
                this.f24342i++;
            }
            int i19 = this.f24342i;
            int[] iArr8 = this.f24338e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f24342i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i5 = this.f24341h;
        for (int i10 = 0; i5 != -1 && i10 < this.f24334a; i10++) {
            g gVar = ((g[]) this.f24336c.f19117d)[this.f24338e[i5]];
            if (gVar != null) {
                gVar.b(this.f24335b);
            }
            i5 = this.f24339f[i5];
        }
        this.f24341h = -1;
        this.f24342i = -1;
        this.j = false;
        this.f24334a = 0;
    }

    public final float c(g gVar) {
        int i5 = this.f24341h;
        for (int i10 = 0; i5 != -1 && i10 < this.f24334a; i10++) {
            if (this.f24338e[i5] == gVar.f24369b) {
                return this.f24340g[i5];
            }
            i5 = this.f24339f[i5];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f24334a;
    }

    public final g e(int i5) {
        int i10 = this.f24341h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24334a; i11++) {
            if (i11 == i5) {
                return ((g[]) this.f24336c.f19117d)[this.f24338e[i10]];
            }
            i10 = this.f24339f[i10];
        }
        return null;
    }

    public final float f(int i5) {
        int i10 = this.f24341h;
        for (int i11 = 0; i10 != -1 && i11 < this.f24334a; i11++) {
            if (i11 == i5) {
                return this.f24340g[i10];
            }
            i10 = this.f24339f[i10];
        }
        return 0.0f;
    }

    public final void g(g gVar, float f6) {
        if (f6 == 0.0f) {
            h(gVar, true);
            return;
        }
        int i5 = this.f24341h;
        b bVar = this.f24335b;
        if (i5 == -1) {
            this.f24341h = 0;
            this.f24340g[0] = f6;
            this.f24338e[0] = gVar.f24369b;
            this.f24339f[0] = -1;
            gVar.f24377k++;
            gVar.a(bVar);
            this.f24334a++;
            if (this.j) {
                return;
            }
            int i10 = this.f24342i + 1;
            this.f24342i = i10;
            int[] iArr = this.f24338e;
            if (i10 >= iArr.length) {
                this.j = true;
                this.f24342i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i5 != -1 && i12 < this.f24334a; i12++) {
            int i13 = this.f24338e[i5];
            int i14 = gVar.f24369b;
            if (i13 == i14) {
                this.f24340g[i5] = f6;
                return;
            }
            if (i13 < i14) {
                i11 = i5;
            }
            i5 = this.f24339f[i5];
        }
        int i15 = this.f24342i;
        int i16 = i15 + 1;
        if (this.j) {
            int[] iArr2 = this.f24338e;
            if (iArr2[i15] != -1) {
                i15 = iArr2.length;
            }
        } else {
            i15 = i16;
        }
        int[] iArr3 = this.f24338e;
        if (i15 >= iArr3.length && this.f24334a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f24338e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    i15 = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f24338e;
        if (i15 >= iArr5.length) {
            i15 = iArr5.length;
            int i18 = this.f24337d * 2;
            this.f24337d = i18;
            this.j = false;
            this.f24342i = i15 - 1;
            this.f24340g = Arrays.copyOf(this.f24340g, i18);
            this.f24338e = Arrays.copyOf(this.f24338e, this.f24337d);
            this.f24339f = Arrays.copyOf(this.f24339f, this.f24337d);
        }
        this.f24338e[i15] = gVar.f24369b;
        this.f24340g[i15] = f6;
        if (i11 != -1) {
            int[] iArr6 = this.f24339f;
            iArr6[i15] = iArr6[i11];
            iArr6[i11] = i15;
        } else {
            this.f24339f[i15] = this.f24341h;
            this.f24341h = i15;
        }
        gVar.f24377k++;
        gVar.a(bVar);
        int i19 = this.f24334a + 1;
        this.f24334a = i19;
        if (!this.j) {
            this.f24342i++;
        }
        int[] iArr7 = this.f24338e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f24342i >= iArr7.length) {
            this.j = true;
            this.f24342i = iArr7.length - 1;
        }
    }

    public final float h(g gVar, boolean z5) {
        int i5 = this.f24341h;
        if (i5 == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i5 != -1 && i10 < this.f24334a) {
            if (this.f24338e[i5] == gVar.f24369b) {
                if (i5 == this.f24341h) {
                    this.f24341h = this.f24339f[i5];
                } else {
                    int[] iArr = this.f24339f;
                    iArr[i11] = iArr[i5];
                }
                if (z5) {
                    gVar.b(this.f24335b);
                }
                gVar.f24377k--;
                this.f24334a--;
                this.f24338e[i5] = -1;
                if (this.j) {
                    this.f24342i = i5;
                }
                return this.f24340g[i5];
            }
            i10++;
            i11 = i5;
            i5 = this.f24339f[i5];
        }
        return 0.0f;
    }

    public final String toString() {
        int i5 = this.f24341h;
        String str = "";
        for (int i10 = 0; i5 != -1 && i10 < this.f24334a; i10++) {
            StringBuilder b10 = f.b(k.l(str, " -> "));
            b10.append(this.f24340g[i5]);
            b10.append(" : ");
            StringBuilder b11 = f.b(b10.toString());
            b11.append(((g[]) this.f24336c.f19117d)[this.f24338e[i5]]);
            str = b11.toString();
            i5 = this.f24339f[i5];
        }
        return str;
    }
}
