package f2;

import Ij.C3261b;
import f2.C6404d;
import f2.h;
import java.util.ArrayList;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6402b implements C6404d.a {

    /* renamed from: d, reason: collision with root package name */
    public a f62448d;

    /* renamed from: a, reason: collision with root package name */
    h f62445a = null;

    /* renamed from: b, reason: collision with root package name */
    float f62446b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<h> f62447c = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    boolean f62449e = false;

    /* renamed from: f2.b$a */
    public interface a {
        void a(h hVar, float f7);

        h b(int i11);

        boolean c(h hVar);

        void clear();

        float d(h hVar, boolean z11);

        float e(C6402b c6402b, boolean z11);

        void f(float f7);

        void g();

        float h(h hVar);

        void i(h hVar, float f7, boolean z11);

        int j();

        float k(int i11);
    }

    public C6402b() {
    }

    private h i(boolean[] zArr, h hVar) {
        h.a aVar;
        int j11 = this.f62448d.j();
        h hVar2 = null;
        float f7 = 0.0f;
        for (int i11 = 0; i11 < j11; i11++) {
            float k11 = this.f62448d.k(i11);
            if (k11 < 0.0f) {
                h b11 = this.f62448d.b(i11);
                if ((zArr == null || !zArr[b11.f62479b]) && b11 != hVar && (((aVar = b11.f62486i) == h.a.SLACK || aVar == h.a.ERROR) && k11 < f7)) {
                    f7 = k11;
                    hVar2 = b11;
                }
            }
        }
        return hVar2;
    }

    @Override // f2.C6404d.a
    public h a(boolean[] zArr) {
        return i(zArr, null);
    }

    public final void b(C6404d c6404d, int i11) {
        this.f62448d.a(c6404d.j(i11), 1.0f);
        this.f62448d.a(c6404d.j(i11), -1.0f);
    }

    public final void c(float f7, float f11, float f12, h hVar, h hVar2, h hVar3, h hVar4) {
        this.f62446b = 0.0f;
        if (f11 == 0.0f || f7 == f12) {
            this.f62448d.a(hVar, 1.0f);
            this.f62448d.a(hVar2, -1.0f);
            this.f62448d.a(hVar4, 1.0f);
            this.f62448d.a(hVar3, -1.0f);
            return;
        }
        if (f7 == 0.0f) {
            this.f62448d.a(hVar, 1.0f);
            this.f62448d.a(hVar2, -1.0f);
        } else {
            if (f12 == 0.0f) {
                this.f62448d.a(hVar3, 1.0f);
                this.f62448d.a(hVar4, -1.0f);
                return;
            }
            float f13 = (f7 / f11) / (f12 / f11);
            this.f62448d.a(hVar, 1.0f);
            this.f62448d.a(hVar2, -1.0f);
            this.f62448d.a(hVar4, f13);
            this.f62448d.a(hVar3, -f13);
        }
    }

    public final void d(h hVar, h hVar2, h hVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f62446b = i11;
        }
        if (z11) {
            this.f62448d.a(hVar, 1.0f);
            this.f62448d.a(hVar2, -1.0f);
            this.f62448d.a(hVar3, -1.0f);
        } else {
            this.f62448d.a(hVar, -1.0f);
            this.f62448d.a(hVar2, 1.0f);
            this.f62448d.a(hVar3, 1.0f);
        }
    }

    public final void e(h hVar, h hVar2, h hVar3, int i11) {
        boolean z11 = false;
        if (i11 != 0) {
            if (i11 < 0) {
                i11 *= -1;
                z11 = true;
            }
            this.f62446b = i11;
        }
        if (z11) {
            this.f62448d.a(hVar, 1.0f);
            this.f62448d.a(hVar2, -1.0f);
            this.f62448d.a(hVar3, 1.0f);
        } else {
            this.f62448d.a(hVar, -1.0f);
            this.f62448d.a(hVar2, 1.0f);
            this.f62448d.a(hVar3, -1.0f);
        }
    }

    public final void f(h hVar, h hVar2, h hVar3, h hVar4, float f7) {
        this.f62448d.a(hVar3, 0.5f);
        this.f62448d.a(hVar4, 0.5f);
        this.f62448d.a(hVar, -0.5f);
        this.f62448d.a(hVar2, -0.5f);
        this.f62446b = -f7;
    }

    public boolean g() {
        return this.f62445a == null && this.f62446b == 0.0f && this.f62448d.j() == 0;
    }

    public final h h(h hVar) {
        return i(null, hVar);
    }

    final void j(h hVar) {
        h hVar2 = this.f62445a;
        if (hVar2 != null) {
            this.f62448d.a(hVar2, -1.0f);
            this.f62445a.f62480c = -1;
            this.f62445a = null;
        }
        float d11 = this.f62448d.d(hVar, true) * (-1.0f);
        this.f62445a = hVar;
        if (d11 == 1.0f) {
            return;
        }
        this.f62446b /= d11;
        this.f62448d.f(d11);
    }

    public final void k(C6404d c6404d, h hVar, boolean z11) {
        if (hVar == null || !hVar.f62483f) {
            return;
        }
        float h11 = this.f62448d.h(hVar);
        this.f62446b = (hVar.f62482e * h11) + this.f62446b;
        this.f62448d.d(hVar, z11);
        if (z11) {
            hVar.b(this);
        }
        if (this.f62448d.j() == 0) {
            this.f62449e = true;
            c6404d.f62455b = true;
        }
    }

    public void l(C6404d c6404d, C6402b c6402b, boolean z11) {
        float e11 = this.f62448d.e(c6402b, z11);
        this.f62446b = (c6402b.f62446b * e11) + this.f62446b;
        if (z11) {
            c6402b.f62445a.b(this);
        }
        if (this.f62445a == null || this.f62448d.j() != 0) {
            return;
        }
        this.f62449e = true;
        c6404d.f62455b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z11;
        String e11 = U7.d.e(this.f62445a == null ? "0" : "" + this.f62445a, " = ");
        if (this.f62446b != 0.0f) {
            StringBuilder e12 = C3261b.e(e11);
            e12.append(this.f62446b);
            e11 = e12.toString();
            z11 = true;
        } else {
            z11 = false;
        }
        int j11 = this.f62448d.j();
        for (int i11 = 0; i11 < j11; i11++) {
            h b11 = this.f62448d.b(i11);
            if (b11 != null) {
                float k11 = this.f62448d.k(i11);
                if (k11 != 0.0f) {
                    String hVar = b11.toString();
                    if (!z11) {
                        if (k11 < 0.0f) {
                            e11 = U7.d.e(e11, "- ");
                            k11 *= -1.0f;
                        }
                        e11 = k11 == 1.0f ? U7.d.e(e11, hVar) : e11 + k11 + " " + hVar;
                        z11 = true;
                    } else if (k11 > 0.0f) {
                        e11 = U7.d.e(e11, " + ");
                        if (k11 == 1.0f) {
                        }
                        z11 = true;
                    } else {
                        e11 = U7.d.e(e11, " - ");
                        k11 *= -1.0f;
                        if (k11 == 1.0f) {
                        }
                        z11 = true;
                    }
                }
            }
        }
        return !z11 ? U7.d.e(e11, "0.0") : e11;
    }

    public C6402b(C6403c c6403c) {
        this.f62448d = new C6401a(this, c6403c);
    }
}
