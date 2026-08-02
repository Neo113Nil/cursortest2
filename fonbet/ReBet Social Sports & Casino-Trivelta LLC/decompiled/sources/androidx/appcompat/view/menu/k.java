package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.O;

/* loaded from: classes.dex */
public final class k extends r.d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {

    /* renamed from: v, reason: collision with root package name */
    public static final int f16775v = l.g.f55134m;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16776b;

    /* renamed from: c, reason: collision with root package name */
    public final e f16777c;

    /* renamed from: d, reason: collision with root package name */
    public final d f16778d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16779e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16780f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16781g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16782h;

    /* renamed from: i, reason: collision with root package name */
    public final O f16783i;

    /* renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f16786l;

    /* renamed from: m, reason: collision with root package name */
    public View f16787m;

    /* renamed from: n, reason: collision with root package name */
    public View f16788n;

    /* renamed from: o, reason: collision with root package name */
    public i.a f16789o;

    /* renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f16790p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f16791q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16792r;

    /* renamed from: s, reason: collision with root package name */
    public int f16793s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f16795u;

    /* renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f16784j = new a();

    /* renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f16785k = new b();

    /* renamed from: t, reason: collision with root package name */
    public int f16794t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.isShowing() || k.this.f16783i.z()) {
                return;
            }
            View view = k.this.f16788n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.f16783i.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f16790p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f16790p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f16790p.removeGlobalOnLayoutListener(kVar.f16784j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.f16776b = context;
        this.f16777c = eVar;
        this.f16779e = z10;
        this.f16778d = new d(eVar, LayoutInflater.from(context), z10, f16775v);
        this.f16781g = i10;
        this.f16782h = i11;
        Resources resources = context.getResources();
        this.f16780f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(l.d.f55022b));
        this.f16787m = view;
        this.f16783i = new O(context, null, i10, i11);
        eVar.c(this, context);
    }

    @Override // androidx.appcompat.view.menu.i
    public void a(e eVar, boolean z10) {
        if (eVar != this.f16777c) {
            return;
        }
        dismiss();
        i.a aVar = this.f16789o;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(i.a aVar) {
        this.f16789o = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(Parcelable parcelable) {
    }

    @Override // r.f
    public void dismiss() {
        if (isShowing()) {
            this.f16783i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.f16776b, lVar, this.f16788n, this.f16779e, this.f16781g, this.f16782h);
            hVar.j(this.f16789o);
            hVar.g(r.d.x(lVar));
            hVar.i(this.f16786l);
            this.f16786l = null;
            this.f16777c.e(false);
            int b10 = this.f16783i.b();
            int k10 = this.f16783i.k();
            if ((Gravity.getAbsoluteGravity(this.f16794t, this.f16787m.getLayoutDirection()) & 7) == 5) {
                b10 += this.f16787m.getWidth();
            }
            if (hVar.n(b10, k10)) {
                i.a aVar = this.f16789o;
                if (aVar == null) {
                    return true;
                }
                aVar.b(lVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable f() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.i
    public void g(boolean z10) {
        this.f16792r = false;
        d dVar = this.f16778d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h() {
        return false;
    }

    @Override // r.f
    public boolean isShowing() {
        return !this.f16791q && this.f16783i.isShowing();
    }

    @Override // r.d
    public void k(e eVar) {
    }

    @Override // r.f
    public ListView n() {
        return this.f16783i.n();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f16791q = true;
        this.f16777c.close();
        ViewTreeObserver viewTreeObserver = this.f16790p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f16790p = this.f16788n.getViewTreeObserver();
            }
            this.f16790p.removeGlobalOnLayoutListener(this.f16784j);
            this.f16790p = null;
        }
        this.f16788n.removeOnAttachStateChangeListener(this.f16785k);
        PopupWindow.OnDismissListener onDismissListener = this.f16786l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // r.d
    public void p(View view) {
        this.f16787m = view;
    }

    @Override // r.d
    public void r(boolean z10) {
        this.f16778d.d(z10);
    }

    @Override // r.d
    public void s(int i10) {
        this.f16794t = i10;
    }

    @Override // r.f
    public void show() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // r.d
    public void t(int i10) {
        this.f16783i.d(i10);
    }

    @Override // r.d
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f16786l = onDismissListener;
    }

    @Override // r.d
    public void v(boolean z10) {
        this.f16795u = z10;
    }

    @Override // r.d
    public void w(int i10) {
        this.f16783i.h(i10);
    }

    public final boolean z() {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f16791q || (view = this.f16787m) == null) {
            return false;
        }
        this.f16788n = view;
        this.f16783i.J(this);
        this.f16783i.K(this);
        this.f16783i.I(true);
        View view2 = this.f16788n;
        boolean z10 = this.f16790p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f16790p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f16784j);
        }
        view2.addOnAttachStateChangeListener(this.f16785k);
        this.f16783i.B(view2);
        this.f16783i.E(this.f16794t);
        if (!this.f16792r) {
            this.f16793s = r.d.o(this.f16778d, null, this.f16776b, this.f16780f);
            this.f16792r = true;
        }
        this.f16783i.D(this.f16793s);
        this.f16783i.H(2);
        this.f16783i.F(m());
        this.f16783i.show();
        ListView n10 = this.f16783i.n();
        n10.setOnKeyListener(this);
        if (this.f16795u && this.f16777c.z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f16776b).inflate(l.g.f55133l, (ViewGroup) n10, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f16777c.z());
            }
            frameLayout.setEnabled(false);
            n10.addHeaderView(frameLayout, null, false);
        }
        this.f16783i.l(this.f16778d);
        this.f16783i.show();
        return true;
    }
}
