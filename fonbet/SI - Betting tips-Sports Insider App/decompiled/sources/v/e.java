package v;

import androidx.coordinatorlayout.widget.i;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: f, reason: collision with root package name */
    public g[] f24363f;

    /* renamed from: g, reason: collision with root package name */
    public g[] f24364g;

    /* renamed from: h, reason: collision with root package name */
    public int f24365h;

    /* renamed from: i, reason: collision with root package name */
    public d7.e f24366i;

    @Override // v.b
    public final g d(boolean[] zArr) {
        int i5 = -1;
        for (int i10 = 0; i10 < this.f24365h; i10++) {
            g[] gVarArr = this.f24363f;
            g gVar = gVarArr[i10];
            if (!zArr[gVar.f24369b]) {
                d7.e eVar = this.f24366i;
                eVar.f8268b = gVar;
                int i11 = 8;
                if (i5 == -1) {
                    while (i11 >= 0) {
                        float f6 = ((g) eVar.f8268b).f24375h[i11];
                        if (f6 <= 0.0f) {
                            if (f6 < 0.0f) {
                                i5 = i10;
                                break;
                            }
                            i11--;
                        }
                    }
                } else {
                    g gVar2 = gVarArr[i5];
                    while (true) {
                        if (i11 >= 0) {
                            float f10 = gVar2.f24375h[i11];
                            float f11 = ((g) eVar.f8268b).f24375h[i11];
                            if (f11 == f10) {
                                i11--;
                            } else if (f11 >= f10) {
                            }
                        }
                    }
                }
            }
        }
        if (i5 == -1) {
            return null;
        }
        return this.f24363f[i5];
    }

    @Override // v.b
    public final boolean e() {
        return this.f24365h == 0;
    }

    @Override // v.b
    public final void i(c cVar, b bVar, boolean z5) {
        g gVar = bVar.f24343a;
        if (gVar == null) {
            return;
        }
        float[] fArr = gVar.f24375h;
        a aVar = bVar.f24346d;
        int d10 = aVar.d();
        for (int i5 = 0; i5 < d10; i5++) {
            g e7 = aVar.e(i5);
            float f6 = aVar.f(i5);
            d7.e eVar = this.f24366i;
            eVar.f8268b = e7;
            if (e7.f24368a) {
                boolean z7 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((g) eVar.f8268b).f24375h;
                    float f10 = (fArr[i10] * f6) + fArr2[i10];
                    fArr2[i10] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        ((g) eVar.f8268b).f24375h[i10] = 0.0f;
                    } else {
                        z7 = false;
                    }
                }
                if (z7) {
                    ((e) eVar.f8269c).k((g) eVar.f8268b);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f11 = fArr[i11];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f6;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        ((g) eVar.f8268b).f24375h[i11] = f12;
                    } else {
                        ((g) eVar.f8268b).f24375h[i11] = 0.0f;
                    }
                }
                j(e7);
            }
            this.f24344b = (bVar.f24344b * f6) + this.f24344b;
        }
        k(gVar);
    }

    public final void j(g gVar) {
        int i5;
        int i10 = this.f24365h + 1;
        g[] gVarArr = this.f24363f;
        if (i10 > gVarArr.length) {
            g[] gVarArr2 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            this.f24363f = gVarArr2;
            this.f24364g = (g[]) Arrays.copyOf(gVarArr2, gVarArr2.length * 2);
        }
        g[] gVarArr3 = this.f24363f;
        int i11 = this.f24365h;
        gVarArr3[i11] = gVar;
        int i12 = i11 + 1;
        this.f24365h = i12;
        if (i12 > 1 && gVarArr3[i11].f24369b > gVar.f24369b) {
            int i13 = 0;
            while (true) {
                i5 = this.f24365h;
                if (i13 >= i5) {
                    break;
                }
                this.f24364g[i13] = this.f24363f[i13];
                i13++;
            }
            Arrays.sort(this.f24364g, 0, i5, new i(18));
            for (int i14 = 0; i14 < this.f24365h; i14++) {
                this.f24363f[i14] = this.f24364g[i14];
            }
        }
        gVar.f24368a = true;
        gVar.a(this);
    }

    public final void k(g gVar) {
        int i5 = 0;
        while (i5 < this.f24365h) {
            if (this.f24363f[i5] == gVar) {
                while (true) {
                    int i10 = this.f24365h;
                    if (i5 >= i10 - 1) {
                        this.f24365h = i10 - 1;
                        gVar.f24368a = false;
                        return;
                    } else {
                        g[] gVarArr = this.f24363f;
                        int i11 = i5 + 1;
                        gVarArr[i5] = gVarArr[i11];
                        i5 = i11;
                    }
                }
            } else {
                i5++;
            }
        }
    }

    @Override // v.b
    public final String toString() {
        d7.e eVar = this.f24366i;
        String str = " goal -> (" + this.f24344b + ") : ";
        for (int i5 = 0; i5 < this.f24365h; i5++) {
            eVar.f8268b = this.f24363f[i5];
            str = str + eVar + " ";
        }
        return str;
    }
}
