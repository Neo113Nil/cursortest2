package m;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.AbstractC2106p0;
import androidx.core.view.C2102n0;
import androidx.core.view.InterfaceC2104o0;
import androidx.core.view.InterfaceC2108q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.AbstractC5335a;

/* renamed from: m.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5478B extends AbstractC5479a implements ActionBarOverlayLayout.d {

    /* renamed from: D, reason: collision with root package name */
    public static final Interpolator f55880D = new AccelerateInterpolator();

    /* renamed from: E, reason: collision with root package name */
    public static final Interpolator f55881E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f55885a;

    /* renamed from: b, reason: collision with root package name */
    public Context f55886b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f55887c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f55888d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContainer f55889e;

    /* renamed from: f, reason: collision with root package name */
    public D f55890f;

    /* renamed from: g, reason: collision with root package name */
    public ActionBarContextView f55891g;

    /* renamed from: h, reason: collision with root package name */
    public View f55892h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f55895k;

    /* renamed from: l, reason: collision with root package name */
    public d f55896l;

    /* renamed from: m, reason: collision with root package name */
    public androidx.appcompat.view.b f55897m;

    /* renamed from: n, reason: collision with root package name */
    public b.a f55898n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f55899o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f55901q;

    /* renamed from: t, reason: collision with root package name */
    public boolean f55904t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f55905u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f55906v;

    /* renamed from: x, reason: collision with root package name */
    public androidx.appcompat.view.h f55908x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f55909y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f55910z;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f55893i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public int f55894j = -1;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f55900p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int f55902r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f55903s = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f55907w = true;

    /* renamed from: A, reason: collision with root package name */
    public final InterfaceC2104o0 f55882A = new a();

    /* renamed from: B, reason: collision with root package name */
    public final InterfaceC2104o0 f55883B = new b();

    /* renamed from: C, reason: collision with root package name */
    public final InterfaceC2108q0 f55884C = new c();

    /* renamed from: m.B$a */
    public class a extends AbstractC2106p0 {
        public a() {
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void b(View view) {
            View view2;
            C5478B c5478b = C5478B.this;
            if (c5478b.f55903s && (view2 = c5478b.f55892h) != null) {
                view2.setTranslationY(0.0f);
                C5478B.this.f55889e.setTranslationY(0.0f);
            }
            C5478B.this.f55889e.setVisibility(8);
            C5478B.this.f55889e.setTransitioning(false);
            C5478B c5478b2 = C5478B.this;
            c5478b2.f55908x = null;
            c5478b2.I();
            ActionBarOverlayLayout actionBarOverlayLayout = C5478B.this.f55888d;
            if (actionBarOverlayLayout != null) {
                AbstractC2082d0.i0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: m.B$b */
    public class b extends AbstractC2106p0 {
        public b() {
        }

        @Override // androidx.core.view.InterfaceC2104o0
        public void b(View view) {
            C5478B c5478b = C5478B.this;
            c5478b.f55908x = null;
            c5478b.f55889e.requestLayout();
        }
    }

    /* renamed from: m.B$c */
    public class c implements InterfaceC2108q0 {
        public c() {
        }

        @Override // androidx.core.view.InterfaceC2108q0
        public void a(View view) {
            ((View) C5478B.this.f55889e.getParent()).invalidate();
        }
    }

    /* renamed from: m.B$d */
    public class d extends androidx.appcompat.view.b implements e.a {

        /* renamed from: c, reason: collision with root package name */
        public final Context f55914c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f55915d;

        /* renamed from: e, reason: collision with root package name */
        public b.a f55916e;

        /* renamed from: f, reason: collision with root package name */
        public WeakReference f55917f;

        public d(Context context, b.a aVar) {
            this.f55914c = context;
            this.f55916e = aVar;
            androidx.appcompat.view.menu.e X10 = new androidx.appcompat.view.menu.e(context).X(1);
            this.f55915d = X10;
            X10.W(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f55916e;
            if (aVar != null) {
                return aVar.c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f55916e == null) {
                return;
            }
            k();
            C5478B.this.f55891g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            C5478B c5478b = C5478B.this;
            if (c5478b.f55896l != this) {
                return;
            }
            if (C5478B.H(c5478b.f55904t, c5478b.f55905u, false)) {
                this.f55916e.a(this);
            } else {
                C5478B c5478b2 = C5478B.this;
                c5478b2.f55897m = this;
                c5478b2.f55898n = this.f55916e;
            }
            this.f55916e = null;
            C5478B.this.G(false);
            C5478B.this.f55891g.g();
            C5478B c5478b3 = C5478B.this;
            c5478b3.f55888d.setHideOnContentScrollEnabled(c5478b3.f55910z);
            C5478B.this.f55896l = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference weakReference = this.f55917f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f55915d;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f55914c);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return C5478B.this.f55891g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return C5478B.this.f55891g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (C5478B.this.f55896l != this) {
                return;
            }
            this.f55915d.i0();
            try {
                this.f55916e.d(this, this.f55915d);
            } finally {
                this.f55915d.h0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return C5478B.this.f55891g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            C5478B.this.f55891g.setCustomView(view);
            this.f55917f = new WeakReference(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(C5478B.this.f55885a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            C5478B.this.f55891g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(C5478B.this.f55885a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            C5478B.this.f55891g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            C5478B.this.f55891g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f55915d.i0();
            try {
                return this.f55916e.b(this, this.f55915d);
            } finally {
                this.f55915d.h0();
            }
        }
    }

    public C5478B(Activity activity, boolean z10) {
        this.f55887c = activity;
        View decorView = activity.getWindow().getDecorView();
        O(decorView);
        if (z10) {
            return;
        }
        this.f55892h = decorView.findViewById(R.id.content);
    }

    public static boolean H(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        return (z10 || z11) ? false : true;
    }

    @Override // m.AbstractC5479a
    public void A(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f55909y = z10;
        if (z10 || (hVar = this.f55908x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // m.AbstractC5479a
    public void B(CharSequence charSequence) {
        this.f55890f.k(charSequence);
    }

    @Override // m.AbstractC5479a
    public void C(int i10) {
        D(this.f55885a.getString(i10));
    }

    @Override // m.AbstractC5479a
    public void D(CharSequence charSequence) {
        this.f55890f.setTitle(charSequence);
    }

    @Override // m.AbstractC5479a
    public void E(CharSequence charSequence) {
        this.f55890f.setWindowTitle(charSequence);
    }

    @Override // m.AbstractC5479a
    public androidx.appcompat.view.b F(b.a aVar) {
        d dVar = this.f55896l;
        if (dVar != null) {
            dVar.c();
        }
        this.f55888d.setHideOnContentScrollEnabled(false);
        this.f55891g.k();
        d dVar2 = new d(this.f55891g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f55896l = dVar2;
        dVar2.k();
        this.f55891g.h(dVar2);
        G(true);
        return dVar2;
    }

    public void G(boolean z10) {
        C2102n0 n10;
        C2102n0 f10;
        if (z10) {
            U();
        } else {
            N();
        }
        if (!T()) {
            if (z10) {
                this.f55890f.setVisibility(4);
                this.f55891g.setVisibility(0);
                return;
            } else {
                this.f55890f.setVisibility(0);
                this.f55891g.setVisibility(8);
                return;
            }
        }
        if (z10) {
            f10 = this.f55890f.n(4, 100L);
            n10 = this.f55891g.f(0, 200L);
        } else {
            n10 = this.f55890f.n(0, 200L);
            f10 = this.f55891g.f(8, 100L);
        }
        androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
        hVar.d(f10, n10);
        hVar.h();
    }

    public void I() {
        b.a aVar = this.f55898n;
        if (aVar != null) {
            aVar.a(this.f55897m);
            this.f55897m = null;
            this.f55898n = null;
        }
    }

    public void J(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f55908x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f55902r != 0 || (!this.f55909y && !z10)) {
            this.f55882A.b(null);
            return;
        }
        this.f55889e.setAlpha(1.0f);
        this.f55889e.setTransitioning(true);
        androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
        float f10 = -this.f55889e.getHeight();
        if (z10) {
            this.f55889e.getLocationInWindow(new int[]{0, 0});
            f10 -= r5[1];
        }
        C2102n0 l10 = AbstractC2082d0.f(this.f55889e).l(f10);
        l10.j(this.f55884C);
        hVar2.c(l10);
        if (this.f55903s && (view = this.f55892h) != null) {
            hVar2.c(AbstractC2082d0.f(view).l(f10));
        }
        hVar2.f(f55880D);
        hVar2.e(250L);
        hVar2.g(this.f55882A);
        this.f55908x = hVar2;
        hVar2.h();
    }

    public void K(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f55908x;
        if (hVar != null) {
            hVar.a();
        }
        this.f55889e.setVisibility(0);
        if (this.f55902r == 0 && (this.f55909y || z10)) {
            this.f55889e.setTranslationY(0.0f);
            float f10 = -this.f55889e.getHeight();
            if (z10) {
                this.f55889e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f55889e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            C2102n0 l10 = AbstractC2082d0.f(this.f55889e).l(0.0f);
            l10.j(this.f55884C);
            hVar2.c(l10);
            if (this.f55903s && (view2 = this.f55892h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(AbstractC2082d0.f(this.f55892h).l(0.0f));
            }
            hVar2.f(f55881E);
            hVar2.e(250L);
            hVar2.g(this.f55883B);
            this.f55908x = hVar2;
            hVar2.h();
        } else {
            this.f55889e.setAlpha(1.0f);
            this.f55889e.setTranslationY(0.0f);
            if (this.f55903s && (view = this.f55892h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f55883B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f55888d;
        if (actionBarOverlayLayout != null) {
            AbstractC2082d0.i0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final D L(View view) {
        if (view instanceof D) {
            return (D) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        sb2.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb2.toString());
    }

    public int M() {
        return this.f55890f.m();
    }

    public final void N() {
        if (this.f55906v) {
            this.f55906v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f55888d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            V(false);
        }
    }

    public final void O(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(l.f.f55112q);
        this.f55888d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f55890f = L(view.findViewById(l.f.f55096a));
        this.f55891g = (ActionBarContextView) view.findViewById(l.f.f55102g);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(l.f.f55098c);
        this.f55889e = actionBarContainer;
        D d10 = this.f55890f;
        if (d10 == null || this.f55891g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f55885a = d10.getContext();
        boolean z10 = (this.f55890f.x() & 4) != 0;
        if (z10) {
            this.f55895k = true;
        }
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f55885a);
        y(b10.a() || z10);
        R(b10.e());
        TypedArray obtainStyledAttributes = this.f55885a.obtainStyledAttributes(null, l.j.ActionBar, AbstractC5335a.f54988c, 0);
        if (obtainStyledAttributes.getBoolean(l.j.f55315j, false)) {
            S(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(l.j.f55305h, 0);
        if (dimensionPixelSize != 0) {
            Q(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void P(int i10, int i11) {
        int x10 = this.f55890f.x();
        if ((i11 & 4) != 0) {
            this.f55895k = true;
        }
        this.f55890f.j((i10 & i11) | ((~i11) & x10));
    }

    public void Q(float f10) {
        AbstractC2082d0.s0(this.f55889e, f10);
    }

    public final void R(boolean z10) {
        this.f55901q = z10;
        if (z10) {
            this.f55889e.setTabContainer(null);
            this.f55890f.t(null);
        } else {
            this.f55890f.t(null);
            this.f55889e.setTabContainer(null);
        }
        boolean z11 = false;
        boolean z12 = M() == 2;
        this.f55890f.r(!this.f55901q && z12);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f55888d;
        if (!this.f55901q && z12) {
            z11 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z11);
    }

    public void S(boolean z10) {
        if (z10 && !this.f55888d.r()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f55910z = z10;
        this.f55888d.setHideOnContentScrollEnabled(z10);
    }

    public final boolean T() {
        return this.f55889e.isLaidOut();
    }

    public final void U() {
        if (this.f55906v) {
            return;
        }
        this.f55906v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f55888d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        V(false);
    }

    public final void V(boolean z10) {
        if (H(this.f55904t, this.f55905u, this.f55906v)) {
            if (this.f55907w) {
                return;
            }
            this.f55907w = true;
            K(z10);
            return;
        }
        if (this.f55907w) {
            this.f55907w = false;
            J(z10);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f55905u) {
            this.f55905u = false;
            V(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f55903s = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f55905u) {
            return;
        }
        this.f55905u = true;
        V(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f55908x;
        if (hVar != null) {
            hVar.a();
            this.f55908x = null;
        }
    }

    @Override // m.AbstractC5479a
    public boolean g() {
        D d10 = this.f55890f;
        if (d10 == null || !d10.i()) {
            return false;
        }
        this.f55890f.collapseActionView();
        return true;
    }

    @Override // m.AbstractC5479a
    public void h(boolean z10) {
        if (z10 == this.f55899o) {
            return;
        }
        this.f55899o = z10;
        if (this.f55900p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f55900p.get(0));
        throw null;
    }

    @Override // m.AbstractC5479a
    public int i() {
        return this.f55890f.x();
    }

    @Override // m.AbstractC5479a
    public Context j() {
        if (this.f55886b == null) {
            TypedValue typedValue = new TypedValue();
            this.f55885a.getTheme().resolveAttribute(AbstractC5335a.f54990e, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f55886b = new ContextThemeWrapper(this.f55885a, i10);
            } else {
                this.f55886b = this.f55885a;
            }
        }
        return this.f55886b;
    }

    @Override // m.AbstractC5479a
    public void k() {
        if (this.f55904t) {
            return;
        }
        this.f55904t = true;
        V(false);
    }

    @Override // m.AbstractC5479a
    public void m(Configuration configuration) {
        R(androidx.appcompat.view.a.b(this.f55885a).e());
    }

    @Override // m.AbstractC5479a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f55896l;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        e10.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f55902r = i10;
    }

    @Override // m.AbstractC5479a
    public void r(Drawable drawable) {
        this.f55889e.setPrimaryBackground(drawable);
    }

    @Override // m.AbstractC5479a
    public void s(boolean z10) {
        if (this.f55895k) {
            return;
        }
        t(z10);
    }

    @Override // m.AbstractC5479a
    public void t(boolean z10) {
        P(z10 ? 4 : 0, 4);
    }

    @Override // m.AbstractC5479a
    public void u(boolean z10) {
        P(z10 ? 2 : 0, 2);
    }

    @Override // m.AbstractC5479a
    public void v(boolean z10) {
        P(z10 ? 8 : 0, 8);
    }

    @Override // m.AbstractC5479a
    public void w(int i10) {
        this.f55890f.v(i10);
    }

    @Override // m.AbstractC5479a
    public void x(Drawable drawable) {
        this.f55890f.z(drawable);
    }

    @Override // m.AbstractC5479a
    public void y(boolean z10) {
        this.f55890f.p(z10);
    }

    @Override // m.AbstractC5479a
    public void z(Drawable drawable) {
        this.f55890f.setIcon(drawable);
    }

    public C5478B(Dialog dialog) {
        O(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
