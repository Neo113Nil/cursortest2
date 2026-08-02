package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
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
import androidx.core.view.g1;
import androidx.core.view.z0;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e0 implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f218a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f219b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f220c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l0 f222e;

    public e0(l0 l0Var, Window.Callback callback) {
        this.f222e = l0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f218a = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f219b = true;
            callback.onContentChanged();
        } finally {
            this.f219b = false;
        }
    }

    public final boolean b(int i5, Menu menu) {
        return this.f218a.onMenuOpened(i5, menu);
    }

    public final void c(int i5, Menu menu) {
        this.f218a.onPanelClosed(i5, menu);
    }

    public final void d(List list, Menu menu, int i5) {
        n.l.a(this.f218a, list, menu, i5);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f218a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z5 = this.f220c;
        Window.Callback callback = this.f218a;
        return z5 ? callback.dispatchKeyEvent(keyEvent) : this.f222e.r(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z5;
        androidx.appcompat.view.menu.n nVar;
        boolean performShortcut;
        if (!this.f218a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            l0 l0Var = this.f222e;
            l0Var.y();
            y0 y0Var = l0Var.f311o;
            if (y0Var != null) {
                x0 x0Var = y0Var.f390i;
                if (x0Var == null || (nVar = x0Var.f374d) == null) {
                    performShortcut = false;
                } else {
                    nVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    performShortcut = nVar.performShortcut(keyCode, keyEvent, 0);
                }
            }
            k0 k0Var = l0Var.X;
            if (k0Var == null || !l0Var.D(k0Var, keyEvent.getKeyCode(), keyEvent)) {
                if (l0Var.X == null) {
                    k0 x10 = l0Var.x(0);
                    l0Var.E(x10, keyEvent);
                    boolean D = l0Var.D(x10, keyEvent.getKeyCode(), keyEvent);
                    x10.f293k = false;
                }
                z5 = false;
                if (z5) {
                    return false;
                }
            } else {
                k0 k0Var2 = l0Var.X;
                if (k0Var2 != null) {
                    k0Var2.f294l = true;
                }
            }
            z5 = true;
            if (z5) {
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f218a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f218a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f218a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f218a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f218a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f218a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f219b) {
            this.f218a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i5, Menu menu) {
        if (i5 != 0 || (menu instanceof androidx.appcompat.view.menu.n)) {
            return this.f218a.onCreatePanelMenu(i5, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i5) {
        return this.f218a.onCreatePanelView(i5);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f218a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        return this.f218a.onMenuItemSelected(i5, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i5, Menu menu) {
        b(i5, menu);
        if (i5 == 108) {
            l0 l0Var = this.f222e;
            l0Var.y();
            y0 y0Var = l0Var.f311o;
            if (y0Var != null) {
                ArrayList arrayList = y0Var.f393m;
                if (true != y0Var.f392l) {
                    y0Var.f392l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i5, Menu menu) {
        if (this.f221d) {
            this.f218a.onPanelClosed(i5, menu);
            return;
        }
        c(i5, menu);
        l0 l0Var = this.f222e;
        if (i5 != 108) {
            if (i5 == 0) {
                k0 x10 = l0Var.x(i5);
                if (x10.f295m) {
                    l0Var.p(x10, false);
                    return;
                }
                return;
            }
            return;
        }
        l0Var.y();
        y0 y0Var = l0Var.f311o;
        if (y0Var != null) {
            ArrayList arrayList = y0Var.f393m;
            if (y0Var.f392l) {
                y0Var.f392l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z5) {
        n.m.a(this.f218a, z5);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i5, View view, Menu menu) {
        androidx.appcompat.view.menu.n nVar = menu instanceof androidx.appcompat.view.menu.n ? (androidx.appcompat.view.menu.n) menu : null;
        if (i5 == 0 && nVar == null) {
            return false;
        }
        if (nVar != null) {
            nVar.setOverrideVisibleItems(true);
        }
        boolean onPreparePanel = this.f218a.onPreparePanel(i5, view, menu);
        if (nVar != null) {
            nVar.setOverrideVisibleItems(false);
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i5) {
        androidx.appcompat.view.menu.n nVar = this.f222e.x(0).f291h;
        if (nVar != null) {
            d(list, nVar, i5);
        } else {
            d(list, menu, i5);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return n.k.a(this.f218a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f218a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z5) {
        this.f218a.onWindowFocusChanged(z5);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f218a.onSearchRequested();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.appcompat.app.p, java.lang.Object] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i5) {
        n.b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        n.b bVar;
        if (i5 != 0) {
            return n.k.b(this.f218a, callback, i5);
        }
        l0 l0Var = this.f222e;
        Context context = l0Var.f304k;
        com.google.firebase.messaging.x xVar = new com.google.firebase.messaging.x();
        xVar.f6183b = context;
        xVar.f6182a = callback;
        xVar.f6184c = new ArrayList();
        xVar.f6185d = new s.n(0);
        ?? r11 = l0Var.f309n;
        n.b bVar2 = l0Var.f322u;
        if (bVar2 != null) {
            bVar2.a();
        }
        int i10 = 1;
        l1.a aVar = new l1.a(i10, l0Var, xVar);
        l0Var.y();
        y0 y0Var = l0Var.f311o;
        if (y0Var != null) {
            x0 x0Var = y0Var.f390i;
            if (x0Var != null) {
                x0Var.a();
            }
            y0Var.f384c.setHideOnContentScrollEnabled(false);
            y0Var.f387f.e();
            x0 x0Var2 = new x0(y0Var, y0Var.f387f.getContext(), aVar);
            androidx.appcompat.view.menu.n nVar = x0Var2.f374d;
            nVar.stopDispatchingItemsChanged();
            try {
                if (((com.google.firebase.messaging.x) x0Var2.f375e.f19314b).F(x0Var2, nVar)) {
                    y0Var.f390i = x0Var2;
                    x0Var2.g();
                    y0Var.f387f.c(x0Var2);
                    y0Var.a(true);
                } else {
                    x0Var2 = null;
                }
                l0Var.f322u = x0Var2;
                if (x0Var2 != null) {
                    r11.onSupportActionModeStarted(x0Var2);
                }
            } finally {
                nVar.startDispatchingItemsChanged();
            }
        }
        if (l0Var.f322u == null) {
            g1 g1Var = l0Var.f329y;
            if (g1Var != null) {
                g1Var.b();
            }
            n.b bVar3 = l0Var.f322u;
            if (bVar3 != null) {
                bVar3.a();
            }
            if (!l0Var.f302h0) {
                try {
                    onWindowStartingSupportActionMode = r11.onWindowStartingSupportActionMode(aVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    l0Var.f322u = onWindowStartingSupportActionMode;
                } else {
                    if (l0Var.f324v == null) {
                        if (l0Var.I) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                n.d dVar = new n.d(context, 0);
                                dVar.getTheme().setTo(newTheme);
                                context = dVar;
                            }
                            l0Var.f324v = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                            l0Var.f326w = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            l0Var.f326w.setContentView(l0Var.f324v);
                            l0Var.f326w.setWidth(-1);
                            context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                            l0Var.f324v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            l0Var.f326w.setHeight(-2);
                            l0Var.f328x = new w(l0Var, i10);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) l0Var.A.findViewById(R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                l0Var.y();
                                y0 y0Var2 = l0Var.f311o;
                                Context b10 = y0Var2 != null ? y0Var2.b() : null;
                                if (b10 != null) {
                                    context = b10;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                l0Var.f324v = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (l0Var.f324v != null) {
                        g1 g1Var2 = l0Var.f329y;
                        if (g1Var2 != null) {
                            g1Var2.b();
                        }
                        l0Var.f324v.e();
                        Context context2 = l0Var.f324v.getContext();
                        ActionBarContextView actionBarContextView = l0Var.f324v;
                        n.e eVar = new n.e();
                        eVar.f20767c = context2;
                        eVar.f20768d = actionBarContextView;
                        eVar.f20769e = aVar;
                        androidx.appcompat.view.menu.n defaultShowAsAction = new androidx.appcompat.view.menu.n(actionBarContextView.getContext()).setDefaultShowAsAction(1);
                        eVar.f20772h = defaultShowAsAction;
                        defaultShowAsAction.setCallback(eVar);
                        if (((com.google.firebase.messaging.x) aVar.f19314b).F(eVar, defaultShowAsAction)) {
                            eVar.g();
                            l0Var.f324v.c(eVar);
                            l0Var.f322u = eVar;
                            if (l0Var.f330z && (viewGroup = l0Var.A) != null && viewGroup.isLaidOut()) {
                                l0Var.f324v.setAlpha(0.0f);
                                g1 a7 = z0.a(l0Var.f324v);
                                a7.a(1.0f);
                                l0Var.f329y = a7;
                                a7.d(new y(i10, l0Var));
                            } else {
                                l0Var.f324v.setAlpha(1.0f);
                                l0Var.f324v.setVisibility(0);
                                if (l0Var.f324v.getParent() instanceof View) {
                                    View view = (View) l0Var.f324v.getParent();
                                    WeakHashMap weakHashMap = z0.f1413a;
                                    androidx.core.view.o0.c(view);
                                }
                            }
                            if (l0Var.f326w != null) {
                                l0Var.f305l.getDecorView().post(l0Var.f328x);
                            }
                        } else {
                            l0Var.f322u = null;
                        }
                    }
                }
                bVar = l0Var.f322u;
                if (bVar != null) {
                    r11.onSupportActionModeStarted(bVar);
                }
                l0Var.G();
                l0Var.f322u = l0Var.f322u;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            bVar = l0Var.f322u;
            if (bVar != null) {
            }
            l0Var.G();
            l0Var.f322u = l0Var.f322u;
        }
        l0Var.G();
        n.b bVar4 = l0Var.f322u;
        if (bVar4 != null) {
            return xVar.u(bVar4);
        }
        return null;
    }
}
