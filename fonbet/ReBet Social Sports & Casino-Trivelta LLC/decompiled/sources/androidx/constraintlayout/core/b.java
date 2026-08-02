package androidx.constraintlayout.core;

import androidx.constraintlayout.core.d;
import androidx.constraintlayout.core.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f17723e;

    /* renamed from: a, reason: collision with root package name */
    public i f17719a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f17720b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17721c = false;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f17722d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f17724f = false;

    public interface a {
        boolean a(i iVar);

        i b(int i10);

        void c(i iVar, float f10, boolean z10);

        void clear();

        float d(i iVar, boolean z10);

        int e();

        float f(b bVar, boolean z10);

        void g(i iVar, float f10);

        float h(int i10);

        float i(i iVar);

        void invert();

        void j(float f10);
    }

    public b() {
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f17766g) {
            return;
        }
        this.f17720b += iVar.f17765f * this.f17723e.i(iVar);
        this.f17723e.d(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        if (d.f17730r && this.f17723e.e() == 0) {
            this.f17724f = true;
            dVar.f17736b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f17720b += bVar.f17720b * this.f17723e.f(bVar, z10);
        if (z10) {
            bVar.f17719a.d(this);
        }
        if (d.f17730r && this.f17719a != null && this.f17723e.e() == 0) {
            this.f17724f = true;
            dVar.f17736b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f17770k) {
            return;
        }
        float i10 = this.f17723e.i(iVar);
        this.f17720b += iVar.f17772m * i10;
        this.f17723e.d(iVar, z10);
        if (z10) {
            iVar.d(this);
        }
        this.f17723e.c(dVar.f17747m.mIndexedVariables[iVar.f17771l], i10, z10);
        if (d.f17730r && this.f17723e.e() == 0) {
            this.f17724f = true;
            dVar.f17736b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.mRows.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int e10 = this.f17723e.e();
            for (int i10 = 0; i10 < e10; i10++) {
                i b10 = this.f17723e.b(i10);
                if (b10.f17763d != -1 || b10.f17766g || b10.f17770k) {
                    this.f17722d.add(b10);
                }
            }
            int size = this.f17722d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = (i) this.f17722d.get(i11);
                    if (iVar.f17766g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f17770k) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.mRows[iVar.f17763d], true);
                    }
                }
                this.f17722d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f17730r && this.f17719a != null && this.f17723e.e() == 0) {
            this.f17724f = true;
            dVar.f17736b = true;
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f17719a = null;
            this.f17723e.clear();
            for (int i10 = 0; i10 < bVar.f17723e.e(); i10++) {
                this.f17723e.c(bVar.f17723e.b(i10), bVar.f17723e.h(i10), true);
            }
        }
    }

    @Override // androidx.constraintlayout.core.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // androidx.constraintlayout.core.d.a
    public void c(i iVar) {
        int i10 = iVar.f17764e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f17723e.g(iVar, f10);
    }

    @Override // androidx.constraintlayout.core.d.a
    public void clear() {
        this.f17723e.clear();
        this.f17719a = null;
        this.f17720b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f17723e.g(dVar.o(i10, "ep"), 1.0f);
        this.f17723e.g(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f17723e.g(iVar, i10);
        return this;
    }

    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f17723e.e() == 0) {
            this.f17724f = true;
        }
        return z10;
    }

    public i g(d dVar) {
        boolean u10;
        boolean u11;
        int e10 = this.f17723e.e();
        i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        i iVar2 = null;
        for (int i10 = 0; i10 < e10; i10++) {
            float h10 = this.f17723e.h(i10);
            i b10 = this.f17723e.b(i10);
            if (b10.f17767h == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u11 = u(b10, dVar);
                } else if (f10 > h10) {
                    u11 = u(b10, dVar);
                } else if (!z10 && u(b10, dVar)) {
                    f10 = h10;
                    iVar = b10;
                    z10 = true;
                }
                z10 = u11;
                f10 = h10;
                iVar = b10;
            } else if (iVar == null && h10 < 0.0f) {
                if (iVar2 == null) {
                    u10 = u(b10, dVar);
                } else if (f11 > h10) {
                    u10 = u(b10, dVar);
                } else if (!z11 && u(b10, dVar)) {
                    f11 = h10;
                    iVar2 = b10;
                    z11 = true;
                }
                z11 = u10;
                f11 = h10;
                iVar2 = b10;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // androidx.constraintlayout.core.d.a
    public i getKey() {
        return this.f17719a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f17723e.g(iVar, 1.0f);
            this.f17723e.g(iVar4, 1.0f);
            this.f17723e.g(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f17723e.g(iVar, 1.0f);
            this.f17723e.g(iVar2, -1.0f);
            this.f17723e.g(iVar3, -1.0f);
            this.f17723e.g(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f17720b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f17723e.g(iVar, -1.0f);
                this.f17723e.g(iVar2, 1.0f);
                this.f17720b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f17723e.g(iVar4, -1.0f);
                this.f17723e.g(iVar3, 1.0f);
                this.f17720b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f17723e.g(iVar, f11 * 1.0f);
            this.f17723e.g(iVar2, f11 * (-1.0f));
            this.f17723e.g(iVar3, (-1.0f) * f10);
            this.f17723e.g(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f17720b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    public b i(i iVar, int i10) {
        this.f17719a = iVar;
        float f10 = i10;
        iVar.f17765f = f10;
        this.f17720b = f10;
        this.f17724f = true;
        return this;
    }

    @Override // androidx.constraintlayout.core.d.a
    public boolean isEmpty() {
        return this.f17719a == null && this.f17720b == 0.0f && this.f17723e.e() == 0;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f17723e.g(iVar, -1.0f);
        this.f17723e.g(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f17723e.g(iVar, -1.0f);
        this.f17723e.g(iVar2, 1.0f);
        this.f17723e.g(iVar3, f10);
        this.f17723e.g(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f17720b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f17723e.g(iVar, 1.0f);
            this.f17723e.g(iVar2, -1.0f);
            this.f17723e.g(iVar4, 1.0f);
            this.f17723e.g(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f17723e.g(iVar, 1.0f);
            this.f17723e.g(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f17723e.g(iVar3, 1.0f);
            this.f17723e.g(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f17723e.g(iVar, 1.0f);
        this.f17723e.g(iVar2, -1.0f);
        this.f17723e.g(iVar4, f13);
        this.f17723e.g(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f17720b = i10 * (-1);
            this.f17723e.g(iVar, 1.0f);
            return this;
        }
        this.f17720b = i10;
        this.f17723e.g(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17720b = i10;
        }
        if (z10) {
            this.f17723e.g(iVar, 1.0f);
            this.f17723e.g(iVar2, -1.0f);
            return this;
        }
        this.f17723e.g(iVar, -1.0f);
        this.f17723e.g(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17720b = i10;
        }
        if (z10) {
            this.f17723e.g(iVar, 1.0f);
            this.f17723e.g(iVar2, -1.0f);
            this.f17723e.g(iVar3, -1.0f);
            return this;
        }
        this.f17723e.g(iVar, -1.0f);
        this.f17723e.g(iVar2, 1.0f);
        this.f17723e.g(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f17720b = i10;
        }
        if (z10) {
            this.f17723e.g(iVar, 1.0f);
            this.f17723e.g(iVar2, -1.0f);
            this.f17723e.g(iVar3, 1.0f);
            return this;
        }
        this.f17723e.g(iVar, -1.0f);
        this.f17723e.g(iVar2, 1.0f);
        this.f17723e.g(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f17723e.g(iVar3, 0.5f);
        this.f17723e.g(iVar4, 0.5f);
        this.f17723e.g(iVar, -0.5f);
        this.f17723e.g(iVar2, -0.5f);
        this.f17720b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.f17720b;
        if (f10 < 0.0f) {
            this.f17720b = f10 * (-1.0f);
            this.f17723e.invert();
        }
    }

    public boolean s() {
        i iVar = this.f17719a;
        if (iVar != null) {
            return iVar.f17767h == i.a.UNRESTRICTED || this.f17720b >= 0.0f;
        }
        return false;
    }

    public boolean t(i iVar) {
        return this.f17723e.a(iVar);
    }

    public String toString() {
        return z();
    }

    public final boolean u(i iVar, d dVar) {
        return iVar.f17769j <= 1;
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public final i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int e10 = this.f17723e.e();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < e10; i10++) {
            float h10 = this.f17723e.h(i10);
            if (h10 < 0.0f) {
                i b10 = this.f17723e.b(i10);
                if ((zArr == null || !zArr[b10.f17762c]) && b10 != iVar && (((aVar = b10.f17767h) == i.a.SLACK || aVar == i.a.ERROR) && h10 < f10)) {
                    f10 = h10;
                    iVar2 = b10;
                }
            }
        }
        return iVar2;
    }

    public void x(i iVar) {
        i iVar2 = this.f17719a;
        if (iVar2 != null) {
            this.f17723e.g(iVar2, -1.0f);
            this.f17719a.f17763d = -1;
            this.f17719a = null;
        }
        float d10 = this.f17723e.d(iVar, true) * (-1.0f);
        this.f17719a = iVar;
        if (d10 == 1.0f) {
            return;
        }
        this.f17720b /= d10;
        this.f17723e.j(d10);
    }

    public void y() {
        this.f17719a = null;
        this.f17723e.clear();
        this.f17720b = 0.0f;
        this.f17724f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String z() {
        boolean z10;
        String str = (this.f17719a == null ? "0" : "" + this.f17719a) + " = ";
        if (this.f17720b != 0.0f) {
            str = str + this.f17720b;
            z10 = true;
        } else {
            z10 = false;
        }
        int e10 = this.f17723e.e();
        for (int i10 = 0; i10 < e10; i10++) {
            i b10 = this.f17723e.b(i10);
            if (b10 != null) {
                float h10 = this.f17723e.h(i10);
                if (h10 != 0.0f) {
                    String iVar = b10.toString();
                    if (!z10) {
                        if (h10 < 0.0f) {
                            str = str + "- ";
                            h10 *= -1.0f;
                        }
                        str = h10 == 1.0f ? str + iVar : str + h10 + " " + iVar;
                        z10 = true;
                    } else if (h10 > 0.0f) {
                        str = str + " + ";
                        if (h10 == 1.0f) {
                        }
                        z10 = true;
                    } else {
                        str = str + " - ";
                        h10 *= -1.0f;
                        if (h10 == 1.0f) {
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            return str;
        }
        return str + "0.0";
    }

    public b(c cVar) {
        this.f17723e = new androidx.constraintlayout.core.a(this, cVar);
    }
}
