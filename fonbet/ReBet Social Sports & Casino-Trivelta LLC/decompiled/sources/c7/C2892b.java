package c7;

import D6.i;
import D6.k;
import V6.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import b7.InterfaceC2406a;
import b7.InterfaceC2407b;
import com.facebook.drawee.drawable.F;
import com.facebook.drawee.drawable.G;

/* renamed from: c7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2892b implements G {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2407b f27613d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f27610a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f27611b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27612c = true;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2406a f27614e = null;

    /* renamed from: f, reason: collision with root package name */
    public final V6.c f27615f = V6.c.a();

    public C2892b(InterfaceC2407b interfaceC2407b) {
        if (interfaceC2407b != null) {
            p(interfaceC2407b);
        }
    }

    public static C2892b c(InterfaceC2407b interfaceC2407b, Context context) {
        C2892b c2892b = new C2892b(interfaceC2407b);
        c2892b.m(context);
        return c2892b;
    }

    @Override // com.facebook.drawee.drawable.G
    public void U(boolean z10) {
        if (this.f27612c == z10) {
            return;
        }
        this.f27615f.b(z10 ? c.a.ON_DRAWABLE_SHOW : c.a.ON_DRAWABLE_HIDE);
        this.f27612c = z10;
        b();
    }

    public final void a() {
        if (this.f27610a) {
            return;
        }
        this.f27615f.b(c.a.ON_ATTACH_CONTROLLER);
        this.f27610a = true;
        InterfaceC2406a interfaceC2406a = this.f27614e;
        if (interfaceC2406a == null || interfaceC2406a.g() == null) {
            return;
        }
        this.f27614e.e();
    }

    public final void b() {
        if (this.f27611b && this.f27612c) {
            a();
        } else {
            d();
        }
    }

    public final void d() {
        if (this.f27610a) {
            this.f27615f.b(c.a.ON_DETACH_CONTROLLER);
            this.f27610a = false;
            if (i()) {
                this.f27614e.f();
            }
        }
    }

    public InterfaceC2406a e() {
        return this.f27614e;
    }

    public InterfaceC2407b f() {
        return (InterfaceC2407b) k.g(this.f27613d);
    }

    public Drawable g() {
        InterfaceC2407b interfaceC2407b = this.f27613d;
        if (interfaceC2407b == null) {
            return null;
        }
        return interfaceC2407b.d();
    }

    public boolean h() {
        return this.f27613d != null;
    }

    public boolean i() {
        InterfaceC2406a interfaceC2406a = this.f27614e;
        return interfaceC2406a != null && interfaceC2406a.g() == this.f27613d;
    }

    public void j() {
        this.f27615f.b(c.a.ON_HOLDER_ATTACH);
        this.f27611b = true;
        b();
    }

    public void k() {
        this.f27615f.b(c.a.ON_HOLDER_DETACH);
        this.f27611b = false;
        b();
    }

    public boolean l(MotionEvent motionEvent) {
        if (i()) {
            return this.f27614e.d(motionEvent);
        }
        return false;
    }

    public void n() {
        o(null);
    }

    public void o(InterfaceC2406a interfaceC2406a) {
        boolean z10 = this.f27610a;
        if (z10) {
            d();
        }
        if (i()) {
            this.f27615f.b(c.a.ON_CLEAR_OLD_CONTROLLER);
            this.f27614e.i(null);
        }
        this.f27614e = interfaceC2406a;
        if (interfaceC2406a != null) {
            this.f27615f.b(c.a.ON_SET_CONTROLLER);
            this.f27614e.i(this.f27613d);
        } else {
            this.f27615f.b(c.a.ON_CLEAR_CONTROLLER);
        }
        if (z10) {
            a();
        }
    }

    @Override // com.facebook.drawee.drawable.G
    public void onDraw() {
        if (this.f27610a) {
            return;
        }
        E6.a.I(V6.c.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f27614e)), toString());
        this.f27611b = true;
        this.f27612c = true;
        b();
    }

    public void p(InterfaceC2407b interfaceC2407b) {
        this.f27615f.b(c.a.ON_SET_HIERARCHY);
        boolean i10 = i();
        q(null);
        InterfaceC2407b interfaceC2407b2 = (InterfaceC2407b) k.g(interfaceC2407b);
        this.f27613d = interfaceC2407b2;
        Drawable d10 = interfaceC2407b2.d();
        U(d10 == null || d10.isVisible());
        q(this);
        if (i10) {
            this.f27614e.i(interfaceC2407b);
        }
    }

    public final void q(G g10) {
        Object g11 = g();
        if (g11 instanceof F) {
            ((F) g11).g(g10);
        }
    }

    public String toString() {
        return i.b(this).c("controllerAttached", this.f27610a).c("holderAttached", this.f27611b).c("drawableVisible", this.f27612c).b("events", this.f27615f.toString()).toString();
    }

    public void m(Context context) {
    }
}
