package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2106p0;
import androidx.core.view.C2102n0;
import l.AbstractC5335a;
import n.AbstractC5596a;
import r.C6194a;

/* loaded from: classes.dex */
public class e0 implements D {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f17274a;

    /* renamed from: b, reason: collision with root package name */
    public int f17275b;

    /* renamed from: c, reason: collision with root package name */
    public View f17276c;

    /* renamed from: d, reason: collision with root package name */
    public View f17277d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f17278e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f17279f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f17280g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17281h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f17282i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f17283j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f17284k;

    /* renamed from: l, reason: collision with root package name */
    public Window.Callback f17285l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17286m;

    /* renamed from: n, reason: collision with root package name */
    public ActionMenuPresenter f17287n;

    /* renamed from: o, reason: collision with root package name */
    public int f17288o;

    /* renamed from: p, reason: collision with root package name */
    public int f17289p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f17290q;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final C6194a f17291a;

        public a() {
            this.f17291a = new C6194a(e0.this.f17274a.getContext(), 0, R.id.home, 0, 0, e0.this.f17282i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e0 e0Var = e0.this;
            Window.Callback callback = e0Var.f17285l;
            if (callback == null || !e0Var.f17286m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f17291a);
        }
    }

    public class b extends AbstractC2106p0 {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17293a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17294b;

        public b(int i10) {
            this.f17294b = i10;
        }

        @Override // androidx.core.view.AbstractC2106p0, androidx.core.view.InterfaceC2104o0
        public void a(View view) {
            this.f17293a = true;
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void b(View view) {
            if (this.f17293a) {
                return;
            }
            e0.this.f17274a.setVisibility(this.f17294b);
        }

        @Override // androidx.core.view.AbstractC2106p0, androidx.core.view.InterfaceC2104o0
        public void c(View view) {
            e0.this.f17274a.setVisibility(0);
        }
    }

    public e0(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, l.h.f55142a, l.e.f55066n);
    }

    public final int A() {
        if (this.f17274a.getNavigationIcon() == null) {
            return 11;
        }
        this.f17290q = this.f17274a.getNavigationIcon();
        return 15;
    }

    public void B(View view) {
        View view2 = this.f17277d;
        if (view2 != null && (this.f17275b & 16) != 0) {
            this.f17274a.removeView(view2);
        }
        this.f17277d = view;
        if (view == null || (this.f17275b & 16) == 0) {
            return;
        }
        this.f17274a.addView(view);
    }

    public void C(int i10) {
        if (i10 == this.f17289p) {
            return;
        }
        this.f17289p = i10;
        if (TextUtils.isEmpty(this.f17274a.getNavigationContentDescription())) {
            E(this.f17289p);
        }
    }

    public void D(Drawable drawable) {
        this.f17279f = drawable;
        J();
    }

    public void E(int i10) {
        F(i10 == 0 ? null : getContext().getString(i10));
    }

    public void F(CharSequence charSequence) {
        this.f17284k = charSequence;
        H();
    }

    public final void G(CharSequence charSequence) {
        this.f17282i = charSequence;
        if ((this.f17275b & 8) != 0) {
            this.f17274a.setTitle(charSequence);
            if (this.f17281h) {
                AbstractC2082d0.o0(this.f17274a.getRootView(), charSequence);
            }
        }
    }

    public final void H() {
        if ((this.f17275b & 4) != 0) {
            if (TextUtils.isEmpty(this.f17284k)) {
                this.f17274a.setNavigationContentDescription(this.f17289p);
            } else {
                this.f17274a.setNavigationContentDescription(this.f17284k);
            }
        }
    }

    public final void I() {
        if ((this.f17275b & 4) == 0) {
            this.f17274a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f17274a;
        Drawable drawable = this.f17280g;
        if (drawable == null) {
            drawable = this.f17290q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void J() {
        Drawable drawable;
        int i10 = this.f17275b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f17279f;
            if (drawable == null) {
                drawable = this.f17278e;
            }
        } else {
            drawable = this.f17278e;
        }
        this.f17274a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.D
    public void a(Drawable drawable) {
        this.f17274a.setBackground(drawable);
    }

    @Override // androidx.appcompat.widget.D
    public boolean b() {
        return this.f17274a.d();
    }

    @Override // androidx.appcompat.widget.D
    public boolean c() {
        return this.f17274a.w();
    }

    @Override // androidx.appcompat.widget.D
    public void collapseActionView() {
        this.f17274a.e();
    }

    @Override // androidx.appcompat.widget.D
    public boolean d() {
        return this.f17274a.Q();
    }

    @Override // androidx.appcompat.widget.D
    public void e(Menu menu, i.a aVar) {
        if (this.f17287n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f17274a.getContext());
            this.f17287n = actionMenuPresenter;
            actionMenuPresenter.r(l.f.f55103h);
        }
        this.f17287n.c(aVar);
        this.f17274a.K((androidx.appcompat.view.menu.e) menu, this.f17287n);
    }

    @Override // androidx.appcompat.widget.D
    public boolean f() {
        return this.f17274a.B();
    }

    @Override // androidx.appcompat.widget.D
    public void g() {
        this.f17286m = true;
    }

    @Override // androidx.appcompat.widget.D
    public Context getContext() {
        return this.f17274a.getContext();
    }

    @Override // androidx.appcompat.widget.D
    public CharSequence getTitle() {
        return this.f17274a.getTitle();
    }

    @Override // androidx.appcompat.widget.D
    public boolean h() {
        return this.f17274a.A();
    }

    @Override // androidx.appcompat.widget.D
    public boolean i() {
        return this.f17274a.v();
    }

    @Override // androidx.appcompat.widget.D
    public void j(int i10) {
        View view;
        int i11 = this.f17275b ^ i10;
        this.f17275b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i11 & 3) != 0) {
                J();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f17274a.setTitle(this.f17282i);
                    this.f17274a.setSubtitle(this.f17283j);
                } else {
                    this.f17274a.setTitle((CharSequence) null);
                    this.f17274a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f17277d) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                this.f17274a.addView(view);
            } else {
                this.f17274a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.D
    public void k(CharSequence charSequence) {
        this.f17283j = charSequence;
        if ((this.f17275b & 8) != 0) {
            this.f17274a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.D
    public Menu l() {
        return this.f17274a.getMenu();
    }

    @Override // androidx.appcompat.widget.D
    public int m() {
        return this.f17288o;
    }

    @Override // androidx.appcompat.widget.D
    public C2102n0 n(int i10, long j10) {
        return AbstractC2082d0.f(this.f17274a).b(i10 == 0 ? 1.0f : 0.0f).e(j10).g(new b(i10));
    }

    @Override // androidx.appcompat.widget.D
    public ViewGroup o() {
        return this.f17274a;
    }

    @Override // androidx.appcompat.widget.D
    public void p(boolean z10) {
    }

    @Override // androidx.appcompat.widget.D
    public void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.D
    public void r(boolean z10) {
        this.f17274a.setCollapsible(z10);
    }

    @Override // androidx.appcompat.widget.D
    public void s() {
        this.f17274a.f();
    }

    @Override // androidx.appcompat.widget.D
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.D
    public void setTitle(CharSequence charSequence) {
        this.f17281h = true;
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.D
    public void setVisibility(int i10) {
        this.f17274a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.D
    public void setWindowCallback(Window.Callback callback) {
        this.f17285l = callback;
    }

    @Override // androidx.appcompat.widget.D
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f17281h) {
            return;
        }
        G(charSequence);
    }

    @Override // androidx.appcompat.widget.D
    public void t(T t10) {
        View view = this.f17276c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f17274a;
            if (parent == toolbar) {
                toolbar.removeView(this.f17276c);
            }
        }
        this.f17276c = t10;
    }

    @Override // androidx.appcompat.widget.D
    public void u(int i10) {
        D(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.D
    public void v(int i10) {
        z(i10 != 0 ? AbstractC5596a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.D
    public void w(i.a aVar, e.a aVar2) {
        this.f17274a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.D
    public int x() {
        return this.f17275b;
    }

    @Override // androidx.appcompat.widget.D
    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.D
    public void z(Drawable drawable) {
        this.f17280g = drawable;
        I();
    }

    public e0(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f17288o = 0;
        this.f17289p = 0;
        this.f17274a = toolbar;
        this.f17282i = toolbar.getTitle();
        this.f17283j = toolbar.getSubtitle();
        this.f17281h = this.f17282i != null;
        this.f17280g = toolbar.getNavigationIcon();
        a0 v10 = a0.v(toolbar.getContext(), null, l.j.ActionBar, AbstractC5335a.f54988c, 0);
        this.f17290q = v10.g(l.j.f55320k);
        if (z10) {
            CharSequence p10 = v10.p(l.j.f55350q);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(l.j.f55340o);
            if (!TextUtils.isEmpty(p11)) {
                k(p11);
            }
            Drawable g10 = v10.g(l.j.f55330m);
            if (g10 != null) {
                D(g10);
            }
            Drawable g11 = v10.g(l.j.f55325l);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f17280g == null && (drawable = this.f17290q) != null) {
                z(drawable);
            }
            j(v10.k(l.j.f55300g, 0));
            int n10 = v10.n(l.j.f55295f, 0);
            if (n10 != 0) {
                B(LayoutInflater.from(this.f17274a.getContext()).inflate(n10, (ViewGroup) this.f17274a, false));
                j(this.f17275b | 16);
            }
            int m10 = v10.m(l.j.f55310i, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f17274a.getLayoutParams();
                layoutParams.height = m10;
                this.f17274a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(l.j.f55290e, -1);
            int e11 = v10.e(l.j.f55285d, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f17274a.J(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(l.j.f55354r, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f17274a;
                toolbar2.N(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(l.j.f55345p, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f17274a;
                toolbar3.M(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(l.j.f55335n, 0);
            if (n13 != 0) {
                this.f17274a.setPopupTheme(n13);
            }
        } else {
            this.f17275b = A();
        }
        v10.x();
        C(i10);
        this.f17284k = this.f17274a.getNavigationContentDescription();
        this.f17274a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.D
    public void setIcon(Drawable drawable) {
        this.f17278e = drawable;
        J();
    }
}
