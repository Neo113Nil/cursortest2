package Z6;

import D6.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import b7.InterfaceC2408c;
import com.facebook.drawee.drawable.C3015f;
import com.facebook.drawee.drawable.C3016g;
import com.facebook.drawee.drawable.InterfaceC3012c;
import com.facebook.drawee.drawable.p;
import com.facebook.drawee.drawable.r;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class a implements InterfaceC2408c {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f14684a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f14685b;

    /* renamed from: c, reason: collision with root package name */
    public e f14686c;

    /* renamed from: d, reason: collision with root package name */
    public final d f14687d;

    /* renamed from: e, reason: collision with root package name */
    public final C3015f f14688e;

    /* renamed from: f, reason: collision with root package name */
    public final C3016g f14689f;

    public a(b bVar) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f14684a = colorDrawable;
        if (N7.b.d()) {
            N7.b.a("GenericDraweeHierarchy()");
        }
        this.f14685b = bVar.p();
        this.f14686c = bVar.s();
        C3016g c3016g = new C3016g(colorDrawable);
        this.f14689f = c3016g;
        int i10 = 1;
        int size = bVar.j() != null ? bVar.j().size() : 1;
        int i11 = (size == 0 ? 1 : size) + (bVar.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i11 + 6];
        drawableArr[0] = h(bVar.e(), null);
        drawableArr[1] = h(bVar.k(), bVar.l());
        drawableArr[2] = g(c3016g, bVar.d(), bVar.c(), bVar.b());
        drawableArr[3] = h(bVar.n(), bVar.o());
        drawableArr[4] = h(bVar.q(), bVar.r());
        drawableArr[5] = h(bVar.h(), bVar.i());
        if (i11 > 0) {
            if (bVar.j() != null) {
                Iterator it = bVar.j().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    drawableArr[i10 + 6] = h((Drawable) it.next(), null);
                    i10++;
                }
            }
            if (bVar.m() != null) {
                drawableArr[i10 + 6] = h(bVar.m(), null);
            }
        }
        C3015f c3015f = new C3015f(drawableArr, false, 2);
        this.f14688e = c3015f;
        c3015f.r(bVar.g());
        d dVar = new d(f.e(c3015f, this.f14686c));
        this.f14687d = dVar;
        dVar.mutate();
        s();
        if (N7.b.d()) {
            N7.b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(float f10) {
        Drawable b10 = this.f14688e.b(3);
        if (b10 == 0) {
            return;
        }
        if (f10 >= 0.999f) {
            if (b10 instanceof Animatable) {
                ((Animatable) b10).stop();
            }
            k(3);
        } else {
            if (b10 instanceof Animatable) {
                ((Animatable) b10).start();
            }
            i(3);
        }
        b10.setLevel(Math.round(f10 * 10000.0f));
    }

    public void B(Drawable drawable) {
        u(3, drawable);
    }

    public void C(e eVar) {
        this.f14686c = eVar;
        f.j(this.f14687d, eVar);
        for (int i10 = 0; i10 < this.f14688e.d(); i10++) {
            f.i(n(i10), this.f14686c, this.f14685b);
        }
    }

    @Override // b7.InterfaceC2408c
    public void a(Throwable th2) {
        this.f14688e.f();
        j();
        if (this.f14688e.b(4) != null) {
            i(4);
        } else {
            i(1);
        }
        this.f14688e.h();
    }

    @Override // b7.InterfaceC2408c
    public void b(Throwable th2) {
        this.f14688e.f();
        j();
        if (this.f14688e.b(5) != null) {
            i(5);
        } else {
            i(1);
        }
        this.f14688e.h();
    }

    @Override // b7.InterfaceC2408c
    public void c(float f10, boolean z10) {
        if (this.f14688e.b(3) == null) {
            return;
        }
        this.f14688e.f();
        A(f10);
        if (z10) {
            this.f14688e.l();
        }
        this.f14688e.h();
    }

    @Override // b7.InterfaceC2407b
    public Drawable d() {
        return this.f14687d;
    }

    @Override // b7.InterfaceC2408c
    public void e(Drawable drawable, float f10, boolean z10) {
        Drawable d10 = f.d(drawable, this.f14686c, this.f14685b);
        d10.mutate();
        this.f14689f.setDrawable(d10);
        this.f14688e.f();
        j();
        i(2);
        A(f10);
        if (z10) {
            this.f14688e.l();
        }
        this.f14688e.h();
    }

    @Override // b7.InterfaceC2408c
    public void f(Drawable drawable) {
        this.f14687d.i(drawable);
    }

    public final Drawable g(Drawable drawable, r rVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return f.g(drawable, rVar, pointF);
    }

    @Override // b7.InterfaceC2407b
    public Rect getBounds() {
        return this.f14687d.getBounds();
    }

    public final Drawable h(Drawable drawable, r rVar) {
        return f.f(f.d(drawable, this.f14686c, this.f14685b), rVar);
    }

    public final void i(int i10) {
        if (i10 >= 0) {
            this.f14688e.j(i10);
        }
    }

    public final void j() {
        k(1);
        k(2);
        k(3);
        k(4);
        k(5);
    }

    public final void k(int i10) {
        if (i10 >= 0) {
            this.f14688e.k(i10);
        }
    }

    public PointF l() {
        if (q(2)) {
            return p(2).k();
        }
        return null;
    }

    public r m() {
        if (q(2)) {
            return p(2).l();
        }
        return null;
    }

    public final InterfaceC3012c n(int i10) {
        InterfaceC3012c c10 = this.f14688e.c(i10);
        c10.getDrawable();
        return c10.getDrawable() instanceof p ? (p) c10.getDrawable() : c10;
    }

    public e o() {
        return this.f14686c;
    }

    public final p p(int i10) {
        InterfaceC3012c n10 = n(i10);
        return n10 instanceof p ? (p) n10 : f.k(n10, r.f30520a);
    }

    public final boolean q(int i10) {
        return n(i10) instanceof p;
    }

    public final void r() {
        this.f14689f.setDrawable(this.f14684a);
    }

    @Override // b7.InterfaceC2408c
    public void reset() {
        r();
        s();
    }

    public final void s() {
        C3015f c3015f = this.f14688e;
        if (c3015f != null) {
            c3015f.f();
            this.f14688e.i();
            j();
            i(1);
            this.f14688e.l();
            this.f14688e.h();
        }
    }

    public void t(r rVar) {
        k.g(rVar);
        p(2).n(rVar);
    }

    public final void u(int i10, Drawable drawable) {
        if (drawable == null) {
            this.f14688e.e(i10, null);
        } else {
            n(i10).setDrawable(f.d(drawable, this.f14686c, this.f14685b));
        }
    }

    public void v(int i10) {
        this.f14688e.r(i10);
    }

    public void w(int i10, Drawable drawable) {
        k.c(i10 >= 0 && i10 + 6 < this.f14688e.d(), "The given index does not correspond to an overlay image.");
        u(i10 + 6, drawable);
    }

    public void x(Drawable drawable) {
        w(0, drawable);
    }

    public void y(Drawable drawable) {
        u(1, drawable);
    }

    public void z(Drawable drawable, r rVar) {
        u(1, drawable);
        p(1).n(rVar);
    }
}
