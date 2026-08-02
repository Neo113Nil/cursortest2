package v;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    public final a f24346d;

    /* renamed from: a, reason: collision with root package name */
    public g f24343a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f24344b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f24345c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f24347e = false;

    public b(kh.g gVar) {
        this.f24346d = new a(this, gVar);
    }

    public final void a(c cVar, int i5) {
        this.f24346d.g(cVar.j(i5), 1.0f);
        this.f24346d.g(cVar.j(i5), -1.0f);
    }

    public final void b(g gVar, g gVar2, g gVar3, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f24344b = i5;
        }
        if (z5) {
            this.f24346d.g(gVar, 1.0f);
            this.f24346d.g(gVar2, -1.0f);
            this.f24346d.g(gVar3, -1.0f);
        } else {
            this.f24346d.g(gVar, -1.0f);
            this.f24346d.g(gVar2, 1.0f);
            this.f24346d.g(gVar3, 1.0f);
        }
    }

    public final void c(g gVar, g gVar2, g gVar3, int i5) {
        boolean z5 = false;
        if (i5 != 0) {
            if (i5 < 0) {
                i5 *= -1;
                z5 = true;
            }
            this.f24344b = i5;
        }
        if (z5) {
            this.f24346d.g(gVar, 1.0f);
            this.f24346d.g(gVar2, -1.0f);
            this.f24346d.g(gVar3, 1.0f);
        } else {
            this.f24346d.g(gVar, -1.0f);
            this.f24346d.g(gVar2, 1.0f);
            this.f24346d.g(gVar3, -1.0f);
        }
    }

    public g d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f24343a == null && this.f24344b == 0.0f && this.f24346d.d() == 0;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i5;
        int d10 = this.f24346d.d();
        g gVar2 = null;
        float f6 = 0.0f;
        for (int i10 = 0; i10 < d10; i10++) {
            float f10 = this.f24346d.f(i10);
            if (f10 < 0.0f) {
                g e7 = this.f24346d.e(i10);
                if ((zArr == null || !zArr[e7.f24369b]) && e7 != gVar && (((i5 = e7.f24378l) == 3 || i5 == 4) && f10 < f6)) {
                    f6 = f10;
                    gVar2 = e7;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f24343a;
        if (gVar2 != null) {
            this.f24346d.g(gVar2, -1.0f);
            this.f24343a.f24370c = -1;
            this.f24343a = null;
        }
        float h10 = this.f24346d.h(gVar, true) * (-1.0f);
        this.f24343a = gVar;
        if (h10 == 1.0f) {
            return;
        }
        this.f24344b /= h10;
        a aVar = this.f24346d;
        int i5 = aVar.f24341h;
        for (int i10 = 0; i5 != -1 && i10 < aVar.f24334a; i10++) {
            float[] fArr = aVar.f24340g;
            fArr[i5] = fArr[i5] / h10;
            i5 = aVar.f24339f[i5];
        }
    }

    public final void h(c cVar, g gVar, boolean z5) {
        if (gVar.f24373f) {
            float c2 = this.f24346d.c(gVar);
            this.f24344b = (gVar.f24372e * c2) + this.f24344b;
            this.f24346d.h(gVar, z5);
            if (z5) {
                gVar.b(this);
            }
            if (this.f24346d.d() == 0) {
                this.f24347e = true;
                cVar.f24349b = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z5) {
        a aVar = this.f24346d;
        aVar.getClass();
        float c2 = aVar.c(bVar.f24343a);
        aVar.h(bVar.f24343a, z5);
        a aVar2 = bVar.f24346d;
        int d10 = aVar2.d();
        for (int i5 = 0; i5 < d10; i5++) {
            g e7 = aVar2.e(i5);
            aVar.a(e7, aVar2.c(e7) * c2, z5);
        }
        this.f24344b = (bVar.f24344b * c2) + this.f24344b;
        if (z5) {
            bVar.f24343a.b(this);
        }
        if (this.f24343a == null || this.f24346d.d() != 0) {
            return;
        }
        this.f24347e = true;
        cVar.f24349b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        boolean z5;
        String l6 = k.l(this.f24343a == null ? CommonUrlParts.Values.FALSE_INTEGER : "" + this.f24343a, " = ");
        if (this.f24344b != 0.0f) {
            StringBuilder b10 = f.b(l6);
            b10.append(this.f24344b);
            l6 = b10.toString();
            z5 = true;
        } else {
            z5 = false;
        }
        int d10 = this.f24346d.d();
        for (int i5 = 0; i5 < d10; i5++) {
            g e7 = this.f24346d.e(i5);
            if (e7 != null) {
                float f6 = this.f24346d.f(i5);
                if (f6 != 0.0f) {
                    String gVar = e7.toString();
                    if (!z5) {
                        if (f6 < 0.0f) {
                            l6 = k.l(l6, "- ");
                            f6 *= -1.0f;
                        }
                        l6 = f6 == 1.0f ? k.l(l6, gVar) : l6 + f6 + " " + gVar;
                        z5 = true;
                    } else if (f6 > 0.0f) {
                        l6 = k.l(l6, " + ");
                        if (f6 == 1.0f) {
                        }
                        z5 = true;
                    } else {
                        l6 = k.l(l6, " - ");
                        f6 *= -1.0f;
                        if (f6 == 1.0f) {
                        }
                        z5 = true;
                    }
                }
            }
        }
        return !z5 ? k.l(l6, "0.0") : l6;
    }
}
