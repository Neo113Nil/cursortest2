package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.f;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.b0u0;
import xsna.d4p0;
import xsna.f0u0;
import xsna.iut0;
import xsna.m33;
import xsna.t8l;
import xsna.ypg0;
import xsna.yyo0;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes11.dex */
public final class d implements t8l {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public Window.Callback k;
    public boolean l;
    public ActionMenuPresenter m;
    public final int n;
    public final Drawable o;

    /* compiled from: ToolbarWidgetWrapper.java */
    public class a extends f0u0 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // xsna.f0u0, xsna.e0u0
        public final void a() {
            d.this.a.setVisibility(0);
        }

        @Override // xsna.e0u0
        public final void b() {
            if (this.a) {
                return;
            }
            d.this.a.setVisibility(this.b);
        }

        @Override // xsna.f0u0, xsna.e0u0
        public final void c() {
            this.a = true;
        }
    }

    public d(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        yyo0 e = yyo0.e(toolbar.getContext(), null, R$styleable.a, R.attr.actionBarStyle, 0);
        TypedArray typedArray = e.b;
        int i = 15;
        this.o = e.b(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                p(text2);
            }
            Drawable b = e.b(20);
            if (b != null) {
                this.e = b;
                v();
            }
            Drawable b2 = e.b(17);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                o(drawable);
            }
            h(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                h(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                if (toolbar.u == null) {
                    toolbar.u = new ypg0();
                }
                toolbar.u.g(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.t(resourceId2, toolbar.getContext());
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.s(resourceId3, toolbar.getContext());
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        e.f();
        if (R.string.abc_action_bar_up_description != this.n) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                j(this.n);
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new d4p0(this));
    }

    @Override // xsna.t8l
    public final boolean a() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.b;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.u) == null || !actionMenuPresenter.l()) ? false : true;
    }

    @Override // xsna.t8l
    public final void b(Menu menu, j.a aVar) {
        ActionMenuPresenter actionMenuPresenter = this.m;
        Toolbar toolbar = this.a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.m = actionMenuPresenter2;
            actionMenuPresenter2.j = R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.m;
        actionMenuPresenter3.f = aVar;
        f fVar = (f) menu;
        if (fVar == null && toolbar.b == null) {
            return;
        }
        toolbar.e();
        f fVar2 = toolbar.b.q;
        if (fVar2 == fVar) {
            return;
        }
        if (fVar2 != null) {
            fVar2.r(toolbar.M);
            fVar2.r(toolbar.N);
        }
        if (toolbar.N == null) {
            toolbar.N = toolbar.new f();
        }
        actionMenuPresenter3.s = true;
        if (fVar != null) {
            fVar.b(actionMenuPresenter3, toolbar.k);
            fVar.b(toolbar.N, toolbar.k);
        } else {
            actionMenuPresenter3.h(toolbar.k, null);
            toolbar.N.h(toolbar.k, null);
            actionMenuPresenter3.c(true);
            toolbar.N.c(true);
        }
        toolbar.b.setPopupTheme(toolbar.l);
        toolbar.b.setPresenter(actionMenuPresenter3);
        toolbar.M = actionMenuPresenter3;
        toolbar.v();
    }

    @Override // xsna.t8l
    public final boolean c() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.b;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.u) == null) {
            return false;
        }
        return actionMenuPresenter.w != null || actionMenuPresenter.m();
    }

    @Override // xsna.t8l
    public final void collapseActionView() {
        Toolbar.f fVar = this.a.N;
        h hVar = fVar == null ? null : fVar.c;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // xsna.t8l
    public final boolean d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.b) != null && actionMenuView.t;
    }

    @Override // xsna.t8l
    public final boolean e() {
        ActionMenuView actionMenuView = this.a.b;
        return actionMenuView != null && actionMenuView.r();
    }

    @Override // xsna.t8l
    public final boolean f() {
        ActionMenuView actionMenuView = this.a.b;
        return actionMenuView != null && actionMenuView.o();
    }

    @Override // xsna.t8l
    public final void g() {
        this.l = true;
    }

    @Override // xsna.t8l
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // xsna.t8l
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // xsna.t8l
    public final void h(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    u();
                }
                int i3 = this.b & 4;
                Toolbar toolbar = this.a;
                if (i3 != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                v();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.h);
                    toolbar2.setSubtitle(this.i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // xsna.t8l
    public final int i() {
        return 0;
    }

    @Override // xsna.t8l
    public final void j(int i) {
        this.j = i == 0 ? null : this.a.getContext().getString(i);
        u();
    }

    @Override // xsna.t8l
    public final void k(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // xsna.t8l
    public final void l() {
        ActionMenuView actionMenuView = this.a.b;
        if (actionMenuView != null) {
            actionMenuView.k();
        }
    }

    @Override // xsna.t8l
    public final int n() {
        return this.b;
    }

    @Override // xsna.t8l
    public final void o(Drawable drawable) {
        this.f = drawable;
        int i = this.b & 4;
        Toolbar toolbar = this.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // xsna.t8l
    public final void p(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setSubtitle(charSequence);
        }
    }

    @Override // xsna.t8l
    public final b0u0 q(int i, long j) {
        b0u0 b = iut0.b(this.a);
        b.a(i == 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        b.c(j);
        b.d(new a(i));
        return b;
    }

    @Override // xsna.t8l
    public final boolean r() {
        Toolbar.f fVar = this.a.N;
        return (fVar == null || fVar.c == null) ? false : true;
    }

    @Override // xsna.t8l
    public final void s() {
        o(m33.a(R.drawable.quantum_ic_keyboard_arrow_down_white_36, this.a.getContext()));
    }

    @Override // xsna.t8l
    public final void setIcon(int i) {
        setIcon(i != 0 ? m33.a(i, this.a.getContext()) : null);
    }

    @Override // xsna.t8l
    public final void setTitle(CharSequence charSequence) {
        this.g = true;
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                iut0.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // xsna.t8l
    public final void setVisibility(int i) {
        this.a.setVisibility(i);
    }

    @Override // xsna.t8l
    public final void setWindowCallback(Window.Callback callback) {
        this.k = callback;
    }

    @Override // xsna.t8l
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.g) {
            return;
        }
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                iut0.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // xsna.t8l
    public final void t(int i) {
        this.e = i != 0 ? m33.a(i, this.a.getContext()) : null;
        v();
    }

    public final void u() {
        if ((this.b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void v() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.e;
            if (drawable == null) {
                drawable = this.d;
            }
        } else {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }

    @Override // xsna.t8l
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        v();
    }

    @Override // xsna.t8l
    public final void m() {
    }
}
