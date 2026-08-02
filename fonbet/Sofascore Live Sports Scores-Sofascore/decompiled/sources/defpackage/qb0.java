package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qb0 implements Window.Callback {
    public final Window.Callback a;
    public yia b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ub0 f;

    public qb0(ub0 ub0Var, Window.Callback callback) {
        this.f = ub0Var;
        if (callback != null) {
            this.a = callback;
        } else {
            a70.p("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
        } finally {
            this.c = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        n8l.a(this.a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.d;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f.y(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            ub0 ub0Var = this.f;
            ub0Var.F();
            o02 o02Var = ub0Var.n;
            if (o02Var == null || !o02Var.f0(keyCode, keyEvent)) {
                tb0 tb0Var = ub0Var.M;
                if (tb0Var == null || !ub0Var.K(tb0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (ub0Var.M == null) {
                        tb0 E = ub0Var.E(0);
                        ub0Var.L(E, keyEvent);
                        boolean K = ub0Var.K(E, keyEvent.getKeyCode(), keyEvent);
                        E.k = false;
                        if (K) {
                        }
                    }
                    return false;
                }
                tb0 tb0Var2 = ub0Var.M;
                if (tb0Var2 != null) {
                    tb0Var2.l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof vec)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        yia yiaVar = this.b;
        if (yiaVar != null) {
            View view = i == 0 ? new View(((fkj) yiaVar.b).m.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            ub0 ub0Var = this.f;
            ub0Var.F();
            o02 o02Var = ub0Var.n;
            if (o02Var != null) {
                o02Var.O(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.e) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        ub0 ub0Var = this.f;
        if (i == 108) {
            ub0Var.F();
            o02 o02Var = ub0Var.n;
            if (o02Var != null) {
                o02Var.O(false);
                return;
            }
            return;
        }
        if (i == 0) {
            tb0 E = ub0Var.E(i);
            if (E.m) {
                ub0Var.w(E, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        o8l.a(this.a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        vec vecVar = menu instanceof vec ? (vec) menu : null;
        if (i == 0 && vecVar == null) {
            return false;
        }
        if (vecVar != null) {
            vecVar.x = true;
        }
        yia yiaVar = this.b;
        if (yiaVar != null && i == 0) {
            fkj fkjVar = (fkj) yiaVar.b;
            if (!fkjVar.p) {
                fkjVar.m.l = true;
                fkjVar.p = true;
            }
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (vecVar != null) {
            vecVar.x = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        vec vecVar = this.f.E(0).h;
        if (vecVar != null) {
            d(list, vecVar, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return m8l.a(this.a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        ub0 ub0Var = this.f;
        Context context = ub0Var.k;
        if (!ub0Var.y || i != 0) {
            return m8l.b(this.a, callback, i);
        }
        g7h g7hVar = new g7h(context, callback);
        hc hcVar = ub0Var.t;
        if (hcVar != null) {
            hcVar.a();
        }
        f4a f4aVar = new f4a(18, ub0Var, g7hVar);
        ub0Var.F();
        o02 o02Var = ub0Var.n;
        if (o02Var != null) {
            ub0Var.t = o02Var.x0(f4aVar);
        }
        if (ub0Var.t == null) {
            tuk tukVar = ub0Var.x;
            if (tukVar != null) {
                tukVar.b();
            }
            hc hcVar2 = ub0Var.t;
            if (hcVar2 != null) {
                hcVar2.a();
            }
            int i2 = 1;
            if (ub0Var.u == null) {
                if (ub0Var.I) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        lq3 lq3Var = new lq3(context, 0);
                        lq3Var.getTheme().setTo(newTheme);
                        context = lq3Var;
                    }
                    ub0Var.u = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    ub0Var.v = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    ub0Var.v.setContentView(ub0Var.u);
                    ub0Var.v.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    ub0Var.u.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    ub0Var.v.setHeight(-2);
                    ub0Var.w = new lb0(ub0Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) ub0Var.A.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(ub0Var.C()));
                        ub0Var.u = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (ub0Var.u != null) {
                tuk tukVar2 = ub0Var.x;
                if (tukVar2 != null) {
                    tukVar2.b();
                }
                ub0Var.u.e();
                Context context2 = ub0Var.u.getContext();
                ActionBarContextView actionBarContextView = ub0Var.u;
                f9i f9iVar = new f9i();
                f9iVar.c = context2;
                f9iVar.d = actionBarContextView;
                f9iVar.e = f4aVar;
                vec vecVar = new vec(actionBarContextView.getContext());
                vecVar.l = 1;
                f9iVar.h = vecVar;
                vecVar.e = f9iVar;
                if (((g7h) f4aVar.b).y(f9iVar, vecVar)) {
                    f9iVar.g();
                    ub0Var.u.c(f9iVar);
                    ub0Var.t = f9iVar;
                    boolean z = ub0Var.z && (viewGroup = ub0Var.A) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = ub0Var.u;
                    if (z) {
                        actionBarContextView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        tuk b = bsk.b(ub0Var.u);
                        b.a(1.0f);
                        ub0Var.x = b;
                        b.d(new mb0(ub0Var, i2));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        ub0Var.u.setVisibility(0);
                        if (ub0Var.u.getParent() instanceof View) {
                            View view = (View) ub0Var.u.getParent();
                            WeakHashMap weakHashMap = bsk.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (ub0Var.v != null) {
                        ub0Var.l.getDecorView().post(ub0Var.w);
                    }
                } else {
                    ub0Var.t = null;
                }
            }
            ub0Var.N();
            ub0Var.t = ub0Var.t;
        }
        ub0Var.N();
        hc hcVar3 = ub0Var.t;
        if (hcVar3 != null) {
            return g7hVar.q(hcVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
