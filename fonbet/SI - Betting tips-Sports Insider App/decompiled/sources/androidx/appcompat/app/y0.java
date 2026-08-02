package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l4;
import androidx.appcompat.widget.m4;
import androidx.appcompat.widget.w1;
import androidx.core.view.f1;
import androidx.core.view.g1;
import androidx.core.view.z0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends a implements androidx.appcompat.widget.f {

    /* renamed from: y, reason: collision with root package name */
    public static final AccelerateInterpolator f380y = new AccelerateInterpolator();

    /* renamed from: z, reason: collision with root package name */
    public static final DecelerateInterpolator f381z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f382a;

    /* renamed from: b, reason: collision with root package name */
    public Context f383b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f384c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f385d;

    /* renamed from: e, reason: collision with root package name */
    public w1 f386e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f387f;

    /* renamed from: g, reason: collision with root package name */
    public final View f388g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f389h;

    /* renamed from: i, reason: collision with root package name */
    public x0 f390i;
    public x0 j;

    /* renamed from: k, reason: collision with root package name */
    public l1.a f391k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f392l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f393m;

    /* renamed from: n, reason: collision with root package name */
    public int f394n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f395o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396p;
    public boolean q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f397r;

    /* renamed from: s, reason: collision with root package name */
    public n.j f398s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f399t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f400u;

    /* renamed from: v, reason: collision with root package name */
    public final w0 f401v;

    /* renamed from: w, reason: collision with root package name */
    public final w0 f402w;

    /* renamed from: x, reason: collision with root package name */
    public final h9.c f403x;

    public y0(Activity activity, boolean z5) {
        new ArrayList();
        this.f393m = new ArrayList();
        this.f394n = 0;
        this.f395o = true;
        this.f397r = true;
        this.f401v = new w0(this, 0);
        this.f402w = new w0(this, 1);
        this.f403x = new h9.c(4, this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z5) {
            return;
        }
        this.f388g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z5) {
        g1 i5;
        g1 g1Var;
        if (z5) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f384c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                f(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f384c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            f(false);
        }
        if (!this.f385d.isLaidOut()) {
            if (z5) {
                ((m4) this.f386e).f821a.setVisibility(4);
                this.f387f.setVisibility(0);
                return;
            } else {
                ((m4) this.f386e).f821a.setVisibility(0);
                this.f387f.setVisibility(8);
                return;
            }
        }
        if (z5) {
            m4 m4Var = (m4) this.f386e;
            i5 = z0.a(m4Var.f821a);
            i5.a(0.0f);
            i5.c(100L);
            i5.d(new l4(m4Var, 4));
            g1Var = this.f387f.i(0, 200L);
        } else {
            m4 m4Var2 = (m4) this.f386e;
            g1 a7 = z0.a(m4Var2.f821a);
            a7.a(1.0f);
            a7.c(200L);
            a7.d(new l4(m4Var2, 0));
            i5 = this.f387f.i(8, 100L);
            g1Var = a7;
        }
        n.j jVar = new n.j();
        ArrayList arrayList = jVar.f20808a;
        arrayList.add(i5);
        View view = (View) i5.f1322a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) g1Var.f1322a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(g1Var);
        jVar.b();
    }

    public final Context b() {
        if (this.f383b == null) {
            TypedValue typedValue = new TypedValue();
            this.f382a.getTheme().resolveAttribute(com.sports.insider.R.attr.actionBarWidgetTheme, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                this.f383b = new ContextThemeWrapper(this.f382a, i5);
            } else {
                this.f383b = this.f382a;
            }
        }
        return this.f383b;
    }

    public final void c(View view) {
        w1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.sports.insider.R.id.decor_content_parent);
        this.f384c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.sports.insider.R.id.action_bar);
        if (findViewById instanceof w1) {
            wrapper = (w1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f386e = wrapper;
        this.f387f = (ActionBarContextView) view.findViewById(com.sports.insider.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.sports.insider.R.id.action_bar_container);
        this.f385d = actionBarContainer;
        w1 w1Var = this.f386e;
        if (w1Var == null || this.f387f == null || actionBarContainer == null) {
            throw new IllegalStateException(y0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((m4) w1Var).f821a.getContext();
        this.f382a = context;
        if ((((m4) this.f386e).f822b & 4) != 0) {
            this.f389h = true;
        }
        int i5 = context.getApplicationInfo().targetSdkVersion;
        this.f386e.getClass();
        e(context.getResources().getBoolean(com.sports.insider.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f382a.obtainStyledAttributes(null, i.a.f10830a, com.sports.insider.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f384c;
            if (!actionBarOverlayLayout2.f595g) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f400u = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f385d;
            WeakHashMap weakHashMap = z0.f1413a;
            androidx.core.view.q0.k(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void d(boolean z5) {
        if (this.f389h) {
            return;
        }
        int i5 = z5 ? 4 : 0;
        m4 m4Var = (m4) this.f386e;
        int i10 = m4Var.f822b;
        this.f389h = true;
        m4Var.a((i5 & 4) | (i10 & (-5)));
    }

    public final void e(boolean z5) {
        if (z5) {
            this.f385d.setTabContainer(null);
            ((m4) this.f386e).getClass();
        } else {
            ((m4) this.f386e).getClass();
            this.f385d.setTabContainer(null);
        }
        this.f386e.getClass();
        ((m4) this.f386e).f821a.setCollapsible(false);
        this.f384c.setHasNonEmbeddedTabs(false);
    }

    public final void f(boolean z5) {
        boolean z7 = this.f396p;
        boolean z10 = this.q;
        h9.c cVar = this.f403x;
        View view = this.f388g;
        if (!z10 && z7) {
            if (this.f397r) {
                this.f397r = false;
                n.j jVar = this.f398s;
                if (jVar != null) {
                    jVar.a();
                }
                int i5 = this.f394n;
                w0 w0Var = this.f401v;
                if (i5 != 0 || (!this.f399t && !z5)) {
                    w0Var.onAnimationEnd();
                    return;
                }
                this.f385d.setAlpha(1.0f);
                this.f385d.setTransitioning(true);
                n.j jVar2 = new n.j();
                float f6 = -this.f385d.getHeight();
                if (z5) {
                    this.f385d.getLocationInWindow(new int[]{0, 0});
                    f6 -= r12[1];
                }
                g1 a7 = z0.a(this.f385d);
                a7.e(f6);
                View view2 = (View) a7.f1322a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new f1(cVar, view2) : null);
                }
                boolean z11 = jVar2.f20812e;
                ArrayList arrayList = jVar2.f20808a;
                if (!z11) {
                    arrayList.add(a7);
                }
                if (this.f395o && view != null) {
                    g1 a10 = z0.a(view);
                    a10.e(f6);
                    if (!jVar2.f20812e) {
                        arrayList.add(a10);
                    }
                }
                boolean z12 = jVar2.f20812e;
                if (!z12) {
                    jVar2.f20810c = f380y;
                }
                if (!z12) {
                    jVar2.f20809b = 250L;
                }
                if (!z12) {
                    jVar2.f20811d = w0Var;
                }
                this.f398s = jVar2;
                jVar2.b();
                return;
            }
            return;
        }
        if (this.f397r) {
            return;
        }
        this.f397r = true;
        n.j jVar3 = this.f398s;
        if (jVar3 != null) {
            jVar3.a();
        }
        this.f385d.setVisibility(0);
        int i10 = this.f394n;
        w0 w0Var2 = this.f402w;
        if (i10 == 0 && (this.f399t || z5)) {
            this.f385d.setTranslationY(0.0f);
            float f10 = -this.f385d.getHeight();
            if (z5) {
                this.f385d.getLocationInWindow(new int[]{0, 0});
                f10 -= r12[1];
            }
            this.f385d.setTranslationY(f10);
            n.j jVar4 = new n.j();
            g1 a11 = z0.a(this.f385d);
            a11.e(0.0f);
            View view3 = (View) a11.f1322a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new f1(cVar, view3) : null);
            }
            boolean z13 = jVar4.f20812e;
            ArrayList arrayList2 = jVar4.f20808a;
            if (!z13) {
                arrayList2.add(a11);
            }
            if (this.f395o && view != null) {
                view.setTranslationY(f10);
                g1 a12 = z0.a(view);
                a12.e(0.0f);
                if (!jVar4.f20812e) {
                    arrayList2.add(a12);
                }
            }
            boolean z14 = jVar4.f20812e;
            if (!z14) {
                jVar4.f20810c = f381z;
            }
            if (!z14) {
                jVar4.f20809b = 250L;
            }
            if (!z14) {
                jVar4.f20811d = w0Var2;
            }
            this.f398s = jVar4;
            jVar4.b();
        } else {
            this.f385d.setAlpha(1.0f);
            this.f385d.setTranslationY(0.0f);
            if (this.f395o && view != null) {
                view.setTranslationY(0.0f);
            }
            w0Var2.onAnimationEnd();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f384c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = z0.f1413a;
            androidx.core.view.o0.c(actionBarOverlayLayout);
        }
    }

    public y0(Dialog dialog) {
        new ArrayList();
        this.f393m = new ArrayList();
        this.f394n = 0;
        this.f395o = true;
        this.f397r = true;
        this.f401v = new w0(this, 0);
        this.f402w = new w0(this, 1);
        this.f403x = new h9.c(4, this);
        c(dialog.getWindow().getDecorView());
    }
}
