package m1;

import android.util.Pair;
import b1.AbstractC2346O;
import e1.AbstractC4134a;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5492a extends AbstractC2346O {

    /* renamed from: e, reason: collision with root package name */
    public final int f56159e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.e0 f56160f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56161g;

    public AbstractC5492a(boolean z10, androidx.media3.exoplayer.source.e0 e0Var) {
        this.f56161g = z10;
        this.f56160f = e0Var;
        this.f56159e = e0Var.getLength();
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    public abstract int A(int i10);

    public final int B(int i10, boolean z10) {
        if (z10) {
            return this.f56160f.c(i10);
        }
        if (i10 < this.f56159e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int C(int i10, boolean z10) {
        if (z10) {
            return this.f56160f.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public abstract AbstractC2346O D(int i10);

    @Override // b1.AbstractC2346O
    public int a(boolean z10) {
        if (this.f56159e == 0) {
            return -1;
        }
        if (this.f56161g) {
            z10 = false;
        }
        int f10 = z10 ? this.f56160f.f() : 0;
        while (D(f10).q()) {
            f10 = B(f10, z10);
            if (f10 == -1) {
                return -1;
            }
        }
        return A(f10) + D(f10).a(z10);
    }

    @Override // b1.AbstractC2346O
    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        if (s10 == -1 || (b10 = D(s10).b(v10)) == -1) {
            return -1;
        }
        return z(s10) + b10;
    }

    @Override // b1.AbstractC2346O
    public int c(boolean z10) {
        int i10 = this.f56159e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f56161g) {
            z10 = false;
        }
        int d10 = z10 ? this.f56160f.d() : i10 - 1;
        while (D(d10).q()) {
            d10 = C(d10, z10);
            if (d10 == -1) {
                return -1;
            }
        }
        return A(d10) + D(d10).c(z10);
    }

    @Override // b1.AbstractC2346O
    public int e(int i10, int i11, boolean z10) {
        if (this.f56161g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A10 = A(u10);
        int e10 = D(u10).e(i10 - A10, i11 != 2 ? i11 : 0, z10);
        if (e10 != -1) {
            return A10 + e10;
        }
        int B10 = B(u10, z10);
        while (B10 != -1 && D(B10).q()) {
            B10 = B(B10, z10);
        }
        if (B10 != -1) {
            return A(B10) + D(B10).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // b1.AbstractC2346O
    public final AbstractC2346O.b g(int i10, AbstractC2346O.b bVar, boolean z10) {
        int t10 = t(i10);
        int A10 = A(t10);
        D(t10).g(i10 - z(t10), bVar, z10);
        bVar.f24356c += A10;
        if (z10) {
            bVar.f24355b = y(x(t10), AbstractC4134a.e(bVar.f24355b));
        }
        return bVar;
    }

    @Override // b1.AbstractC2346O
    public final AbstractC2346O.b h(Object obj, AbstractC2346O.b bVar) {
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        int A10 = A(s10);
        D(s10).h(v10, bVar);
        bVar.f24356c += A10;
        bVar.f24355b = obj;
        return bVar;
    }

    @Override // b1.AbstractC2346O
    public int l(int i10, int i11, boolean z10) {
        if (this.f56161g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A10 = A(u10);
        int l10 = D(u10).l(i10 - A10, i11 != 2 ? i11 : 0, z10);
        if (l10 != -1) {
            return A10 + l10;
        }
        int C10 = C(u10, z10);
        while (C10 != -1 && D(C10).q()) {
            C10 = C(C10, z10);
        }
        if (C10 != -1) {
            return A(C10) + D(C10).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    @Override // b1.AbstractC2346O
    public final Object m(int i10) {
        int t10 = t(i10);
        return y(x(t10), D(t10).m(i10 - z(t10)));
    }

    @Override // b1.AbstractC2346O
    public final AbstractC2346O.c o(int i10, AbstractC2346O.c cVar, long j10) {
        int u10 = u(i10);
        int A10 = A(u10);
        int z10 = z(u10);
        D(u10).o(i10 - A10, cVar, j10);
        Object x10 = x(u10);
        if (!AbstractC2346O.c.f24367q.equals(cVar.f24377a)) {
            x10 = y(x10, cVar.f24377a);
        }
        cVar.f24377a = x10;
        cVar.f24390n += z10;
        cVar.f24391o += z10;
        return cVar;
    }

    public abstract int s(Object obj);

    public abstract int t(int i10);

    public abstract int u(int i10);

    public abstract Object x(int i10);

    public abstract int z(int i10);
}
