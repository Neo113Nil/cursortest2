package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r8l extends o02 implements gb {
    public static final AccelerateInterpolator L = new AccelerateInterpolator();
    public static final DecelerateInterpolator M = new DecelerateInterpolator();
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public uuk F;
    public boolean G;
    public boolean H;
    public final p8l I;
    public final p8l J;
    public final d4a K;
    public Context m;
    public Context n;
    public final Activity o;
    public ActionBarOverlayLayout p;
    public ActionBarContainer q;
    public pm4 r;
    public ActionBarContextView s;
    public final View t;
    public boolean u;
    public q8l v;
    public q8l w;
    public f4a x;
    public boolean y;
    public final ArrayList z;

    public r8l(Activity activity, boolean z) {
        new ArrayList();
        this.z = new ArrayList();
        this.A = 0;
        this.B = true;
        this.E = true;
        this.I = new p8l(this, 0);
        this.J = new p8l(this, 1);
        this.K = new d4a(this, 25);
        this.o = activity;
        View decorView = activity.getWindow().getDecorView();
        A0(decorView);
        if (z) {
            return;
        }
        this.t = decorView.findViewById(R.id.content);
    }

    public final void A0(View view) {
        pm4 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.sofascore.results.R.id.decor_content_parent);
        this.p = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.sofascore.results.R.id.action_bar);
        if (findViewById instanceof pm4) {
            wrapper = (pm4) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.r = wrapper;
        this.s = (ActionBarContextView) view.findViewById(com.sofascore.results.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.sofascore.results.R.id.action_bar_container);
        this.q = actionBarContainer;
        pm4 pm4Var = this.r;
        if (pm4Var == null || this.s == null || actionBarContainer == null) {
            a70.r(r8l.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((okj) pm4Var).a.getContext();
        this.m = context;
        if ((((okj) this.r).b & 4) != 0) {
            this.u = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.r.getClass();
        B0(context.getResources().getBoolean(com.sofascore.results.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.m.obtainStyledAttributes(null, dkf.a, com.sofascore.results.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.p;
            if (!actionBarOverlayLayout2.g) {
                a70.r("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.H = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.q;
            WeakHashMap weakHashMap = bsk.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void B0(boolean z) {
        if (z) {
            this.q.setTabContainer(null);
            ((okj) this.r).getClass();
        } else {
            ((okj) this.r).getClass();
            this.q.setTabContainer(null);
        }
        this.r.getClass();
        ((okj) this.r).a.setCollapsible(false);
        this.p.setHasNonEmbeddedTabs(false);
    }

    public final void C0(boolean z) {
        boolean z2 = this.D || !this.C;
        boolean z3 = this.E;
        d4a d4aVar = this.K;
        View view = this.t;
        if (!z2) {
            if (z3) {
                this.E = false;
                uuk uukVar = this.F;
                if (uukVar != null) {
                    uukVar.a();
                }
                int i = this.A;
                p8l p8lVar = this.I;
                if (i != 0 || (!this.G && !z)) {
                    p8lVar.c();
                    return;
                }
                this.q.setAlpha(1.0f);
                this.q.setTransitioning(true);
                uuk uukVar2 = new uuk();
                float f = -this.q.getHeight();
                if (z) {
                    this.q.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                tuk b = bsk.b(this.q);
                b.e(f);
                View view2 = (View) b.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(d4aVar != null ? new p6(10, d4aVar, view2) : null);
                }
                boolean z4 = uukVar2.e;
                ArrayList arrayList = uukVar2.a;
                if (!z4) {
                    arrayList.add(b);
                }
                if (this.B && view != null) {
                    tuk b2 = bsk.b(view);
                    b2.e(f);
                    if (!uukVar2.e) {
                        arrayList.add(b2);
                    }
                }
                boolean z5 = uukVar2.e;
                if (!z5) {
                    uukVar2.c = L;
                }
                if (!z5) {
                    uukVar2.b = 250L;
                }
                if (!z5) {
                    uukVar2.d = p8lVar;
                }
                this.F = uukVar2;
                uukVar2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.E = true;
        uuk uukVar3 = this.F;
        if (uukVar3 != null) {
            uukVar3.a();
        }
        this.q.setVisibility(0);
        int i2 = this.A;
        p8l p8lVar2 = this.J;
        if (i2 == 0 && (this.G || z)) {
            this.q.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            float f2 = -this.q.getHeight();
            if (z) {
                this.q.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.q.setTranslationY(f2);
            uuk uukVar4 = new uuk();
            tuk b3 = bsk.b(this.q);
            b3.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            View view3 = (View) b3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(d4aVar != null ? new p6(10, d4aVar, view3) : null);
            }
            boolean z6 = uukVar4.e;
            ArrayList arrayList2 = uukVar4.a;
            if (!z6) {
                arrayList2.add(b3);
            }
            if (this.B && view != null) {
                view.setTranslationY(f2);
                tuk b4 = bsk.b(view);
                b4.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (!uukVar4.e) {
                    arrayList2.add(b4);
                }
            }
            boolean z7 = uukVar4.e;
            if (!z7) {
                uukVar4.c = M;
            }
            if (!z7) {
                uukVar4.b = 250L;
            }
            if (!z7) {
                uukVar4.d = p8lVar2;
            }
            this.F = uukVar4;
            uukVar4.b();
        } else {
            this.q.setAlpha(1.0f);
            this.q.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            if (this.B && view != null) {
                view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            p8lVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.p;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = bsk.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // defpackage.o02
    public final boolean N() {
        ckj ckjVar;
        pm4 pm4Var = this.r;
        if (pm4Var == null || (ckjVar = ((okj) pm4Var).a.M) == null || ckjVar.b == null) {
            return false;
        }
        ckj ckjVar2 = ((okj) pm4Var).a.M;
        efc efcVar = ckjVar2 == null ? null : ckjVar2.b;
        if (efcVar == null) {
            return true;
        }
        efcVar.collapseActionView();
        return true;
    }

    @Override // defpackage.o02
    public final void O(boolean z) {
        if (z == this.y) {
            return;
        }
        this.y = z;
        ArrayList arrayList = this.z;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        pvd.j();
    }

    @Override // defpackage.o02
    public final int S() {
        return ((okj) this.r).b;
    }

    @Override // defpackage.o02
    public final Context Y() {
        Context context = this.n;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.m.getTheme().resolveAttribute(com.sofascore.results.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.m, i);
            this.n = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.m;
        this.n = context2;
        return context2;
    }

    @Override // defpackage.o02
    public final void d0() {
        B0(this.m.getResources().getBoolean(com.sofascore.results.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.o02
    public final boolean f0(int i, KeyEvent keyEvent) {
        vec vecVar;
        q8l q8lVar = this.v;
        if (q8lVar == null || (vecVar = q8lVar.d) == null) {
            return false;
        }
        vecVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return vecVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.o02
    public final void m0(boolean z) {
        if (this.u) {
            return;
        }
        n0(z);
    }

    @Override // defpackage.o02
    public final void n0(boolean z) {
        int i = z ? 4 : 0;
        okj okjVar = (okj) this.r;
        int i2 = okjVar.b;
        this.u = true;
        okjVar.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.o02
    public final void o0() {
        okj okjVar = (okj) this.r;
        okjVar.a(okjVar.b & (-9));
    }

    @Override // defpackage.o02
    public final void p0(int i) {
        ((okj) this.r).b(i);
    }

    @Override // defpackage.o02
    public final void q0() {
        okj okjVar = (okj) this.r;
        Toolbar toolbar = okjVar.a;
        Drawable d0 = td4.d0(2131232812, toolbar.getContext());
        okjVar.f = d0;
        if ((okjVar.b & 4) == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (d0 == null) {
            d0 = okjVar.o;
        }
        toolbar.setNavigationIcon(d0);
    }

    @Override // defpackage.o02
    public final void r0(Drawable drawable) {
        okj okjVar = (okj) this.r;
        okjVar.f = drawable;
        int i = okjVar.b & 4;
        Toolbar toolbar = okjVar.a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = okjVar.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // defpackage.o02
    public final void s0(boolean z) {
        uuk uukVar;
        this.G = z;
        if (z || (uukVar = this.F) == null) {
            return;
        }
        uukVar.a();
    }

    @Override // defpackage.o02
    public final void t0(String str) {
        ((okj) this.r).c(str);
    }

    @Override // defpackage.o02
    public final void u0(String str) {
        okj okjVar = (okj) this.r;
        okjVar.g = true;
        Toolbar toolbar = okjVar.a;
        okjVar.h = str;
        if ((okjVar.b & 8) != 0) {
            toolbar.setTitle(str);
            if (okjVar.g) {
                bsk.r(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.o02
    public final void v0(CharSequence charSequence) {
        okj okjVar = (okj) this.r;
        if (okjVar.g) {
            return;
        }
        Toolbar toolbar = okjVar.a;
        okjVar.h = charSequence;
        if ((okjVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (okjVar.g) {
                bsk.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.o02
    public final hc x0(f4a f4aVar) {
        q8l q8lVar = this.v;
        if (q8lVar != null) {
            q8lVar.a();
        }
        this.p.setHideOnContentScrollEnabled(false);
        this.s.e();
        q8l q8lVar2 = new q8l(this, this.s.getContext(), f4aVar);
        vec vecVar = q8lVar2.d;
        vecVar.w();
        try {
            if (!((g7h) q8lVar2.e.b).y(q8lVar2, vecVar)) {
                return null;
            }
            this.v = q8lVar2;
            q8lVar2.g();
            this.s.c(q8lVar2);
            z0(true);
            return q8lVar2;
        } finally {
            vecVar.v();
        }
    }

    public final void z0(boolean z) {
        tuk i;
        tuk tukVar;
        boolean z2 = this.D;
        if (z) {
            if (!z2) {
                this.D = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.p;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                C0(false);
            }
        } else if (z2) {
            this.D = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.p;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            C0(false);
        }
        boolean isLaidOut = this.q.isLaidOut();
        pm4 pm4Var = this.r;
        if (!isLaidOut) {
            if (z) {
                ((okj) pm4Var).a.setVisibility(4);
                this.s.setVisibility(0);
                return;
            } else {
                ((okj) pm4Var).a.setVisibility(0);
                this.s.setVisibility(8);
                return;
            }
        }
        if (z) {
            okj okjVar = (okj) pm4Var;
            i = bsk.b(okjVar.a);
            i.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            i.c(100L);
            i.d(new nkj(okjVar, 4));
            tukVar = this.s.i(0, 200L);
        } else {
            okj okjVar2 = (okj) pm4Var;
            tuk b = bsk.b(okjVar2.a);
            b.a(1.0f);
            b.c(200L);
            b.d(new nkj(okjVar2, 0));
            i = this.s.i(8, 100L);
            tukVar = b;
        }
        uuk uukVar = new uuk();
        ArrayList arrayList = uukVar.a;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) tukVar.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(tukVar);
        uukVar.b();
    }

    public r8l(Dialog dialog) {
        new ArrayList();
        this.z = new ArrayList();
        this.A = 0;
        this.B = true;
        this.E = true;
        this.I = new p8l(this, 0);
        this.J = new p8l(this, 1);
        this.K = new d4a(this, 25);
        A0(dialog.getWindow().getDecorView());
    }
}
