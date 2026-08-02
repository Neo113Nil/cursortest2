package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c4;
import androidx.appcompat.widget.m4;
import androidx.appcompat.widget.r4;
import androidx.appcompat.widget.u4;
import androidx.appcompat.widget.v1;
import androidx.appcompat.widget.w1;
import androidx.core.view.g1;
import androidx.core.view.z0;
import io.appmetrica.analytics.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l0 extends v implements androidx.appcompat.view.menu.l, LayoutInflater.Factory2 {
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public k0[] L;
    public k0 X;
    public boolean Y;
    public boolean Z;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f301g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f302h0;

    /* renamed from: i0, reason: collision with root package name */
    public Configuration f303i0;
    public final Object j;
    public final int j0;

    /* renamed from: k, reason: collision with root package name */
    public final Context f304k;
    public int k0;

    /* renamed from: l, reason: collision with root package name */
    public Window f305l;

    /* renamed from: l0, reason: collision with root package name */
    public int f306l0;

    /* renamed from: m, reason: collision with root package name */
    public e0 f307m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f308m0;

    /* renamed from: n, reason: collision with root package name */
    public final Object f309n;

    /* renamed from: n0, reason: collision with root package name */
    public f0 f310n0;

    /* renamed from: o, reason: collision with root package name */
    public y0 f311o;

    /* renamed from: o0, reason: collision with root package name */
    public f0 f312o0;

    /* renamed from: p, reason: collision with root package name */
    public n.i f313p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f314p0;
    public CharSequence q;

    /* renamed from: q0, reason: collision with root package name */
    public int f315q0;

    /* renamed from: r, reason: collision with root package name */
    public v1 f316r;

    /* renamed from: s, reason: collision with root package name */
    public x f318s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f319s0;

    /* renamed from: t, reason: collision with root package name */
    public x f320t;

    /* renamed from: t0, reason: collision with root package name */
    public Rect f321t0;

    /* renamed from: u, reason: collision with root package name */
    public n.b f322u;

    /* renamed from: u0, reason: collision with root package name */
    public Rect f323u0;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f324v;

    /* renamed from: v0, reason: collision with root package name */
    public q0 f325v0;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f326w;

    /* renamed from: w0, reason: collision with root package name */
    public OnBackInvokedDispatcher f327w0;

    /* renamed from: x, reason: collision with root package name */
    public w f328x;
    public OnBackInvokedCallback x0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f330z;

    /* renamed from: y0, reason: collision with root package name */
    public static final s.n f300y0 = new s.n(0);
    public static final int[] z0 = {R.attr.windowBackground};
    public static final boolean A0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: y, reason: collision with root package name */
    public g1 f329y = null;

    /* renamed from: r0, reason: collision with root package name */
    public final w f317r0 = new w(this, 0);

    public l0(Context context, Window window, p pVar, Object obj) {
        o oVar = null;
        this.j0 = -100;
        this.f304k = context;
        this.f309n = pVar;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof o)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        oVar = (o) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (oVar != null) {
                this.j0 = ((l0) oVar.t()).j0;
            }
        }
        if (this.j0 == -100) {
            String name = this.j.getClass().getName();
            s.n nVar = f300y0;
            Integer num = (Integer) nVar.get(name);
            if (num != null) {
                this.j0 = num.intValue();
                nVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        androidx.appcompat.widget.b0.d();
    }

    public static l0.g m(Context context) {
        l0.g gVar;
        l0.g b10;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33 || (gVar = v.f355c) == null) {
            return null;
        }
        l0.i iVar = gVar.f19306a;
        l0.g w10 = w(context.getApplicationContext().getResources().getConfiguration());
        int i10 = 0;
        if (i5 < 24) {
            b10 = iVar.isEmpty() ? l0.g.f19305b : l0.g.b(z.b(iVar.get(0)));
        } else if (iVar.isEmpty()) {
            b10 = l0.g.f19305b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i10 < w10.f19306a.size() + iVar.size()) {
                Locale locale = i10 < iVar.size() ? iVar.get(i10) : w10.f19306a.get(i10 - iVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i10++;
            }
            b10 = l0.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return b10.f19306a.isEmpty() ? w10 : b10;
    }

    public static Configuration q(Context context, int i5, l0.g gVar, Configuration configuration, boolean z5) {
        int i10 = i5 != 1 ? i5 != 2 ? z5 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            l0.i iVar = gVar.f19306a;
            if (Build.VERSION.SDK_INT >= 24) {
                a0.d(configuration2, gVar);
                return configuration2;
            }
            configuration2.setLocale(iVar.get(0));
            configuration2.setLayoutDirection(iVar.get(0));
        }
        return configuration2;
    }

    public static l0.g w(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? a0.b(configuration) : l0.g.b(z.b(configuration.locale));
    }

    public final int A(Context context, int i5) {
        if (i5 != -100) {
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1 && i5 != 2) {
                        if (i5 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f312o0 == null) {
                            this.f312o0 = new f0(this, context);
                        }
                        return this.f312o0.e();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return v(context).e();
                }
            }
            return i5;
        }
        return -1;
    }

    public final boolean B() {
        w1 w1Var;
        boolean z5 = this.Y;
        this.Y = false;
        k0 x10 = x(0);
        if (x10.f295m) {
            if (!z5) {
                p(x10, true);
            }
            return true;
        }
        n.b bVar = this.f322u;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        y();
        y0 y0Var = this.f311o;
        if (y0Var == null || (w1Var = y0Var.f386e) == null || !((m4) w1Var).f821a.hasExpandedActionView()) {
            return false;
        }
        ((m4) y0Var.f386e).f821a.collapseActionView();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0174, code lost:
    
        if (r2.f507f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(k0 k0Var, KeyEvent keyEvent) {
        int i5;
        ViewGroup.LayoutParams layoutParams;
        boolean z5 = k0Var.f295m;
        int i10 = k0Var.f284a;
        if (z5 || this.f302h0) {
            return;
        }
        Context context = this.f304k;
        if (i10 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f305l.getCallback();
        if (callback != null && !callback.onMenuOpened(i10, k0Var.f291h)) {
            p(k0Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !E(k0Var, keyEvent)) {
            return;
        }
        i0 i0Var = k0Var.f288e;
        if (i0Var == null || k0Var.f296n) {
            if (i0Var == null) {
                y();
                y0 y0Var = this.f311o;
                Context b10 = y0Var != null ? y0Var.b() : null;
                if (b10 != null) {
                    context = b10;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.sports.insider.R.attr.actionBarPopupTheme, typedValue, true);
                int i11 = typedValue.resourceId;
                if (i11 != 0) {
                    newTheme.applyStyle(i11, true);
                }
                newTheme.resolveAttribute(com.sports.insider.R.attr.panelMenuListTheme, typedValue, true);
                int i12 = typedValue.resourceId;
                if (i12 != 0) {
                    newTheme.applyStyle(i12, true);
                } else {
                    newTheme.applyStyle(com.sports.insider.R.style.Theme_AppCompat_CompactMenu, true);
                }
                n.d dVar = new n.d(context, 0);
                dVar.getTheme().setTo(newTheme);
                k0Var.j = dVar;
                TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(i.a.j);
                k0Var.f285b = obtainStyledAttributes.getResourceId(86, 0);
                k0Var.f287d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                k0Var.f288e = new i0(this, k0Var.j);
                k0Var.f286c = 81;
            } else if (k0Var.f296n && i0Var.getChildCount() > 0) {
                k0Var.f288e.removeAllViews();
            }
            View view = k0Var.f290g;
            if (view == null) {
                if (k0Var.f291h != null) {
                    if (this.f320t == null) {
                        this.f320t = new x(this, 3);
                    }
                    x xVar = this.f320t;
                    if (k0Var.f292i == null) {
                        androidx.appcompat.view.menu.j jVar = new androidx.appcompat.view.menu.j(k0Var.j);
                        k0Var.f292i = jVar;
                        jVar.f506e = xVar;
                        k0Var.f291h.addMenuPresenter(jVar);
                    }
                    androidx.appcompat.view.menu.j jVar2 = k0Var.f292i;
                    i0 i0Var2 = k0Var.f288e;
                    if (jVar2.f505d == null) {
                        jVar2.f505d = (ExpandedMenuView) jVar2.f503b.inflate(com.sports.insider.R.layout.abc_expanded_menu_layout, (ViewGroup) i0Var2, false);
                        if (jVar2.f507f == null) {
                            jVar2.f507f = new androidx.appcompat.view.menu.i(jVar2);
                        }
                        jVar2.f505d.setAdapter((ListAdapter) jVar2.f507f);
                        jVar2.f505d.setOnItemClickListener(jVar2);
                    }
                    ExpandedMenuView expandedMenuView = jVar2.f505d;
                    k0Var.f289f = expandedMenuView;
                }
                k0Var.f296n = true;
                return;
            }
            k0Var.f289f = view;
            if (k0Var.f289f != null) {
                if (k0Var.f290g == null) {
                    androidx.appcompat.view.menu.j jVar3 = k0Var.f292i;
                    if (jVar3.f507f == null) {
                        jVar3.f507f = new androidx.appcompat.view.menu.i(jVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = k0Var.f289f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                k0Var.f288e.setBackgroundResource(k0Var.f285b);
                ViewParent parent = k0Var.f289f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(k0Var.f289f);
                }
                k0Var.f288e.addView(k0Var.f289f, layoutParams2);
                if (!k0Var.f289f.hasFocus()) {
                    k0Var.f289f.requestFocus();
                }
            }
            k0Var.f296n = true;
            return;
        }
        View view2 = k0Var.f290g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i5 = -1;
            k0Var.f294l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i5, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = k0Var.f286c;
            layoutParams3.windowAnimations = k0Var.f287d;
            windowManager.addView(k0Var.f288e, layoutParams3);
            k0Var.f295m = true;
            if (i10 != 0) {
                G();
                return;
            }
            return;
        }
        i5 = -2;
        k0Var.f294l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i5, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = k0Var.f286c;
        layoutParams32.windowAnimations = k0Var.f287d;
        windowManager.addView(k0Var.f288e, layoutParams32);
        k0Var.f295m = true;
        if (i10 != 0) {
        }
    }

    public final boolean D(k0 k0Var, int i5, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.n nVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((k0Var.f293k || E(k0Var, keyEvent)) && (nVar = k0Var.f291h) != null) {
            return nVar.performShortcut(i5, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        if (r13.f291h == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean E(k0 k0Var, KeyEvent keyEvent) {
        v1 v1Var;
        v1 v1Var2;
        Resources.Theme theme;
        v1 v1Var3;
        v1 v1Var4;
        if (!this.f302h0) {
            boolean z5 = k0Var.f293k;
            int i5 = k0Var.f284a;
            if (z5) {
                return true;
            }
            k0 k0Var2 = this.X;
            if (k0Var2 != null && k0Var2 != k0Var) {
                p(k0Var2, false);
            }
            Window.Callback callback = this.f305l.getCallback();
            if (callback != null) {
                k0Var.f290g = callback.onCreatePanelView(i5);
            }
            boolean z7 = i5 == 0 || i5 == 108;
            if (z7 && (v1Var4 = this.f316r) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) v1Var4;
                actionBarOverlayLayout.e();
                ((m4) actionBarOverlayLayout.f593e).f831l = true;
            }
            if (k0Var.f290g == null) {
                androidx.appcompat.view.menu.n nVar = k0Var.f291h;
                if (nVar == null || k0Var.f297o) {
                    if (nVar == null) {
                        Context context = this.f304k;
                        if ((i5 == 0 || i5 == 108) && this.f316r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.sports.insider.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.sports.insider.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.sports.insider.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                n.d dVar = new n.d(context, 0);
                                dVar.getTheme().setTo(theme);
                                context = dVar;
                            }
                        }
                        androidx.appcompat.view.menu.n nVar2 = new androidx.appcompat.view.menu.n(context);
                        nVar2.setCallback(this);
                        androidx.appcompat.view.menu.n nVar3 = k0Var.f291h;
                        if (nVar2 != nVar3) {
                            if (nVar3 != null) {
                                nVar3.removeMenuPresenter(k0Var.f292i);
                            }
                            k0Var.f291h = nVar2;
                            androidx.appcompat.view.menu.j jVar = k0Var.f292i;
                            if (jVar != null) {
                                nVar2.addMenuPresenter(jVar);
                            }
                        }
                    }
                    if (z7 && (v1Var2 = this.f316r) != null) {
                        if (this.f318s == null) {
                            this.f318s = new x(this, 2);
                        }
                        ((ActionBarOverlayLayout) v1Var2).f(k0Var.f291h, this.f318s);
                    }
                    k0Var.f291h.stopDispatchingItemsChanged();
                    if (callback.onCreatePanelMenu(i5, k0Var.f291h)) {
                        k0Var.f297o = false;
                    } else {
                        androidx.appcompat.view.menu.n nVar4 = k0Var.f291h;
                        if (nVar4 != null) {
                            if (nVar4 != null) {
                                nVar4.removeMenuPresenter(k0Var.f292i);
                            }
                            k0Var.f291h = null;
                        }
                        if (z7 && (v1Var = this.f316r) != null) {
                            ((ActionBarOverlayLayout) v1Var).f(null, this.f318s);
                        }
                    }
                }
                k0Var.f291h.stopDispatchingItemsChanged();
                Bundle bundle = k0Var.f298p;
                if (bundle != null) {
                    k0Var.f291h.restoreActionViewStates(bundle);
                    k0Var.f298p = null;
                }
                if (!callback.onPreparePanel(0, k0Var.f290g, k0Var.f291h)) {
                    if (z7 && (v1Var3 = this.f316r) != null) {
                        ((ActionBarOverlayLayout) v1Var3).f(null, this.f318s);
                    }
                    k0Var.f291h.startDispatchingItemsChanged();
                    return false;
                }
                k0Var.f291h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                k0Var.f291h.startDispatchingItemsChanged();
            }
            k0Var.f293k = true;
            k0Var.f294l = false;
            this.X = k0Var;
            return true;
        }
        return false;
    }

    public final void F() {
        if (this.f330z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void G() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z5 = false;
            if (this.f327w0 != null && (x(0).f295m || this.f322u != null)) {
                z5 = true;
            }
            if (z5 && this.x0 == null) {
                this.x0 = d0.b(this.f327w0, this);
            } else {
                if (z5 || (onBackInvokedCallback = this.x0) == null) {
                    return;
                }
                d0.c(this.f327w0, onBackInvokedCallback);
                this.x0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.v
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f304k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof l0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.v
    public final void c() {
        String str;
        this.Z = true;
        k(false, true);
        u();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = c0.d.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                y0 y0Var = this.f311o;
                if (y0Var == null) {
                    this.f319s0 = true;
                } else {
                    y0Var.d(true);
                }
            }
            synchronized (v.f360h) {
                v.e(this);
                v.f359g.add(new WeakReference(this));
            }
        }
        this.f303i0 = new Configuration(this.f304k.getResources().getConfiguration());
        this.f301g0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        f0 f0Var;
        f0 f0Var2;
        if (this.j instanceof Activity) {
            synchronized (v.f360h) {
                v.e(this);
            }
        }
        if (this.f314p0) {
            this.f305l.getDecorView().removeCallbacks(this.f317r0);
        }
        this.f302h0 = true;
        if (this.j0 != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f300y0.put(this.j.getClass().getName(), Integer.valueOf(this.j0));
                f0Var = this.f310n0;
                if (f0Var != null) {
                    f0Var.c();
                }
                f0Var2 = this.f312o0;
                if (f0Var2 == null) {
                    f0Var2.c();
                    return;
                }
                return;
            }
        }
        f300y0.remove(this.j.getClass().getName());
        f0Var = this.f310n0;
        if (f0Var != null) {
        }
        f0Var2 = this.f312o0;
        if (f0Var2 == null) {
        }
    }

    @Override // androidx.appcompat.app.v
    public final boolean f(int i5) {
        if (i5 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i5 = 108;
        } else if (i5 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i5 = 109;
        }
        if (this.J && i5 == 108) {
            return false;
        }
        if (this.F && i5 == 1) {
            this.F = false;
        }
        if (i5 == 1) {
            F();
            this.J = true;
            return true;
        }
        if (i5 == 2) {
            F();
            this.D = true;
            return true;
        }
        if (i5 == 5) {
            F();
            this.E = true;
            return true;
        }
        if (i5 == 10) {
            F();
            this.H = true;
            return true;
        }
        if (i5 == 108) {
            F();
            this.F = true;
            return true;
        }
        if (i5 != 109) {
            return this.f305l.requestFeature(i5);
        }
        F();
        this.G = true;
        return true;
    }

    @Override // androidx.appcompat.app.v
    public final void g(int i5) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f304k).inflate(i5, viewGroup);
        this.f307m.a(this.f305l.getCallback());
    }

    @Override // androidx.appcompat.app.v
    public final void h(View view) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f307m.a(this.f305l.getCallback());
    }

    @Override // androidx.appcompat.app.v
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f307m.a(this.f305l.getCallback());
    }

    @Override // androidx.appcompat.app.v
    public final void j(CharSequence charSequence) {
        this.q = charSequence;
        v1 v1Var = this.f316r;
        if (v1Var != null) {
            v1Var.setWindowTitle(charSequence);
            return;
        }
        y0 y0Var = this.f311o;
        if (y0Var == null) {
            TextView textView = this.B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        m4 m4Var = (m4) y0Var.f386e;
        if (m4Var.f827g) {
            return;
        }
        Toolbar toolbar = m4Var.f821a;
        m4Var.f828h = charSequence;
        if ((m4Var.f822b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (m4Var.f827g) {
                z0.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(boolean z5, boolean z7) {
        int i5;
        Configuration configuration;
        l0.g w10;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        Activity activity;
        if (this.f302h0) {
            return false;
        }
        int i11 = this.j0;
        if (i11 == -100) {
            i11 = v.f354b;
        }
        Context context = this.f304k;
        int A = A(context, i11);
        int i12 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        l0.g m6 = i12 < 33 ? m(context) : null;
        if (!z7 && m6 != null) {
            m6 = w(context.getResources().getConfiguration());
        }
        Configuration q = q(context, A, m6, null, false);
        boolean z13 = this.f308m0;
        Object obj3 = this.j;
        if (!z13 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i5 = 0;
                configuration = this.f303i0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i13 = configuration.uiMode & 48;
                int i14 = q.uiMode & 48;
                l0.g w11 = w(configuration);
                w10 = m6 != null ? null : w(q);
                i10 = i13 == i14 ? 512 : 0;
                if (w10 != null && !w11.equals(w10)) {
                    i10 |= 8196;
                }
                if (((~i5) & i10) != 0 && z5 && this.Z && ((A0 || this.f301g0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 >= 31 && (i10 & Segment.SIZE) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(q.getLayoutDirection());
                        }
                        if (i15 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new aa.c(5, activity));
                        }
                        z10 = true;
                        if (!z10 || i10 == 0) {
                            z11 = z10;
                        } else {
                            boolean z14 = (i5 & i10) == i10;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i14;
                            if (w10 != null) {
                                l0.i iVar = w10.f19306a;
                                if (Build.VERSION.SDK_INT >= 24) {
                                    a0.d(configuration2, w10);
                                } else {
                                    configuration2.setLocale(iVar.get(0));
                                    configuration2.setLayoutDirection(iVar.get(0));
                                }
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i16 = Build.VERSION.SDK_INT;
                            if (i16 < 26 && i16 < 28) {
                                if (i16 >= 24) {
                                    if (!io.sentry.config.a.f16294h) {
                                        try {
                                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                            io.sentry.config.a.f16293g = declaredField;
                                            declaredField.setAccessible(true);
                                        } catch (NoSuchFieldException e7) {
                                            io.sentry.android.core.w0.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e7);
                                        }
                                        io.sentry.config.a.f16294h = true;
                                    }
                                    Field field = io.sentry.config.a.f16293g;
                                    if (field != null) {
                                        try {
                                            obj = field.get(resources);
                                        } catch (IllegalAccessException e9) {
                                            io.sentry.android.core.w0.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
                                            obj = null;
                                        }
                                        if (obj != null) {
                                            if (!io.sentry.config.a.f16288b) {
                                                try {
                                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                    io.sentry.config.a.f16287a = declaredField2;
                                                    declaredField2.setAccessible(true);
                                                } catch (NoSuchFieldException e10) {
                                                    io.sentry.android.core.w0.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                                                }
                                                io.sentry.config.a.f16288b = true;
                                            }
                                            Field field2 = io.sentry.config.a.f16287a;
                                            if (field2 != null) {
                                                try {
                                                    obj2 = field2.get(obj);
                                                } catch (IllegalAccessException e11) {
                                                    io.sentry.android.core.w0.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                                }
                                            }
                                            if (obj2 != null) {
                                                io.sentry.config.a.m(obj2);
                                            }
                                        }
                                    }
                                } else {
                                    if (!io.sentry.config.a.f16288b) {
                                        try {
                                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                                            io.sentry.config.a.f16287a = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e12) {
                                            io.sentry.android.core.w0.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e12);
                                        }
                                        io.sentry.config.a.f16288b = true;
                                    }
                                    Field field3 = io.sentry.config.a.f16287a;
                                    if (field3 != null) {
                                        try {
                                            obj2 = field3.get(resources);
                                        } catch (IllegalAccessException e13) {
                                            io.sentry.android.core.w0.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e13);
                                        }
                                    }
                                    if (obj2 != null) {
                                        io.sentry.config.a.m(obj2);
                                    }
                                }
                            }
                            int i17 = this.k0;
                            if (i17 != 0) {
                                context.setTheme(i17);
                                z12 = true;
                                context.getTheme().applyStyle(this.k0, true);
                            } else {
                                z12 = true;
                            }
                            if (z14 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof androidx.lifecycle.e0) {
                                    if (((androidx.lifecycle.g0) ((androidx.lifecycle.e0) activity2).getLifecycle()).f2169d.a(androidx.lifecycle.x.f2255c)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f301g0 && !this.f302h0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                            z11 = z12;
                        }
                        if (w10 != null) {
                            l0.g w12 = w(context.getResources().getConfiguration());
                            if (Build.VERSION.SDK_INT >= 24) {
                                a0.c(w12);
                            } else {
                                Locale.setDefault(w12.f19306a.get(0));
                            }
                        }
                        if (i11 == 0) {
                            v(context).h();
                        } else {
                            f0 f0Var = this.f310n0;
                            if (f0Var != null) {
                                f0Var.c();
                            }
                        }
                        if (i11 == 3) {
                            if (this.f312o0 == null) {
                                this.f312o0 = new f0(this, context);
                            }
                            this.f312o0.h();
                        } else {
                            f0 f0Var2 = this.f312o0;
                            if (f0Var2 != null) {
                                f0Var2.c();
                            }
                        }
                        return z11;
                    }
                }
                z10 = false;
                if (z10) {
                }
                z11 = z10;
                if (w10 != null) {
                }
                if (i11 == 0) {
                }
                if (i11 == 3) {
                }
                return z11;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i12 >= 29 ? 269221888 : i12 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f306l0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e14) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e14);
                this.f306l0 = 0;
            }
        }
        this.f308m0 = true;
        i5 = this.f306l0;
        configuration = this.f303i0;
        if (configuration == null) {
        }
        int i132 = configuration.uiMode & 48;
        int i142 = q.uiMode & 48;
        l0.g w112 = w(configuration);
        if (m6 != null) {
        }
        if (i132 == i142) {
        }
        if (w10 != null) {
            i10 |= 8196;
        }
        if (((~i5) & i10) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z10 = false;
        if (z10) {
        }
        z11 = z10;
        if (w10 != null) {
        }
        if (i11 == 0) {
        }
        if (i11 == 3) {
        }
        return z11;
    }

    public final void l(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f305l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof e0) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        e0 e0Var = new e0(this, callback);
        this.f307m = e0Var;
        window.setCallback(e0Var);
        c4 e7 = c4.e(this.f304k, null, z0);
        Drawable c2 = e7.c(0);
        if (c2 != null) {
            window.setBackgroundDrawable(c2);
        }
        e7.g();
        this.f305l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f327w0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.x0) != null) {
            d0.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.x0 = null;
        }
        Object obj = this.j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f327w0 = d0.a(activity);
                G();
            }
        }
        this.f327w0 = null;
        G();
    }

    public final void n(int i5, k0 k0Var, androidx.appcompat.view.menu.n nVar) {
        if (nVar == null) {
            if (k0Var == null && i5 >= 0) {
                k0[] k0VarArr = this.L;
                if (i5 < k0VarArr.length) {
                    k0Var = k0VarArr[i5];
                }
            }
            if (k0Var != null) {
                nVar = k0Var.f291h;
            }
        }
        if ((k0Var == null || k0Var.f295m) && !this.f302h0) {
            e0 e0Var = this.f307m;
            Window.Callback callback = this.f305l.getCallback();
            e0Var.getClass();
            try {
                e0Var.f221d = true;
                callback.onPanelClosed(i5, nVar);
            } finally {
                e0Var.f221d = false;
            }
        }
    }

    public final void o(androidx.appcompat.view.menu.n nVar) {
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f316r;
        actionBarOverlayLayout.e();
        ((m4) actionBarOverlayLayout.f593e).f821a.dismissPopupMenus();
        Window.Callback callback = this.f305l.getCallback();
        if (callback != null && !this.f302h0) {
            callback.onPanelClosed(108, nVar);
        }
        this.K = false;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f325v0 == null) {
            int[] iArr = i.a.j;
            Context context2 = this.f304k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(BuildConfig.API_LEVEL);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f325v0 = new q0();
            } else {
                try {
                    this.f325v0 = (q0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f325v0 = new q0();
                }
            }
        }
        q0 q0Var = this.f325v0;
        int i5 = r4.f904a;
        return q0Var.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // androidx.appcompat.view.menu.l
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.n nVar, MenuItem menuItem) {
        k0 k0Var;
        Window.Callback callback = this.f305l.getCallback();
        if (callback != null && !this.f302h0) {
            androidx.appcompat.view.menu.n rootMenu = nVar.getRootMenu();
            k0[] k0VarArr = this.L;
            int length = k0VarArr != null ? k0VarArr.length : 0;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    k0Var = k0VarArr[i5];
                    if (k0Var != null && k0Var.f291h == rootMenu) {
                        break;
                    }
                    i5++;
                } else {
                    k0Var = null;
                    break;
                }
            }
            if (k0Var != null) {
                return callback.onMenuItemSelected(k0Var.f284a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (((androidx.appcompat.widget.m4) r6.f593e).f821a.isOverflowMenuShowPending() != false) goto L10;
     */
    @Override // androidx.appcompat.view.menu.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMenuModeChange(androidx.appcompat.view.menu.n nVar) {
        v1 v1Var = this.f316r;
        if (v1Var != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) v1Var;
            actionBarOverlayLayout.e();
            if (((m4) actionBarOverlayLayout.f593e).f821a.canShowOverflowMenu()) {
                if (ViewConfiguration.get(this.f304k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f316r;
                    actionBarOverlayLayout2.e();
                }
                Window.Callback callback = this.f305l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f316r;
                actionBarOverlayLayout3.e();
                if (((m4) actionBarOverlayLayout3.f593e).f821a.isOverflowMenuShowing()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f316r;
                    actionBarOverlayLayout4.e();
                    ((m4) actionBarOverlayLayout4.f593e).f821a.hideOverflowMenu();
                    if (this.f302h0) {
                        return;
                    }
                    callback.onPanelClosed(108, x(0).f291h);
                    return;
                }
                if (callback == null || this.f302h0) {
                    return;
                }
                if (this.f314p0 && (1 & this.f315q0) != 0) {
                    View decorView = this.f305l.getDecorView();
                    w wVar = this.f317r0;
                    decorView.removeCallbacks(wVar);
                    wVar.run();
                }
                k0 x10 = x(0);
                androidx.appcompat.view.menu.n nVar2 = x10.f291h;
                if (nVar2 == null || x10.f297o || !callback.onPreparePanel(0, x10.f290g, nVar2)) {
                    return;
                }
                callback.onMenuOpened(108, x10.f291h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f316r;
                actionBarOverlayLayout5.e();
                ((m4) actionBarOverlayLayout5.f593e).f821a.showOverflowMenu();
                return;
            }
        }
        k0 x11 = x(0);
        x11.f296n = true;
        p(x11, false);
        C(x11, null);
    }

    public final void p(k0 k0Var, boolean z5) {
        i0 i0Var;
        v1 v1Var;
        if (z5 && k0Var.f284a == 0 && (v1Var = this.f316r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) v1Var;
            actionBarOverlayLayout.e();
            if (((m4) actionBarOverlayLayout.f593e).f821a.isOverflowMenuShowing()) {
                o(k0Var.f291h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f304k.getSystemService("window");
        if (windowManager != null && k0Var.f295m && (i0Var = k0Var.f288e) != null) {
            windowManager.removeView(i0Var);
            if (z5) {
                n(k0Var.f284a, k0Var, null);
            }
        }
        k0Var.f293k = false;
        k0Var.f294l = false;
        k0Var.f295m = false;
        k0Var.f289f = null;
        k0Var.f296n = true;
        if (this.X == k0Var) {
            this.X = null;
        }
        if (k0Var.f284a == 0) {
            G();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(KeyEvent keyEvent) {
        View decorView;
        boolean z5;
        boolean z7;
        Object obj = this.j;
        if ((!(obj instanceof androidx.core.view.m) && !(obj instanceof n0)) || (decorView = this.f305l.getDecorView()) == null || !rh.g.g(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                e0 e0Var = this.f307m;
                Window.Callback callback = this.f305l.getCallback();
                e0Var.getClass();
                try {
                    e0Var.f220c = true;
                } finally {
                    e0Var.f220c = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.Y = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        k0 x10 = x(0);
                        if (!x10.f295m) {
                            E(x10, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f322u == null) {
                        k0 x11 = x(0);
                        v1 v1Var = this.f316r;
                        Context context = this.f304k;
                        if (v1Var != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) v1Var;
                            actionBarOverlayLayout.e();
                            if (((m4) actionBarOverlayLayout.f593e).f821a.canShowOverflowMenu() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f316r;
                                actionBarOverlayLayout2.e();
                                if (((m4) actionBarOverlayLayout2.f593e).f821a.isOverflowMenuShowing()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f316r;
                                    actionBarOverlayLayout3.e();
                                    z5 = ((m4) actionBarOverlayLayout3.f593e).f821a.hideOverflowMenu();
                                } else {
                                    if (!this.f302h0 && E(x11, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f316r;
                                        actionBarOverlayLayout4.e();
                                        z5 = ((m4) actionBarOverlayLayout4.f593e).f821a.showOverflowMenu();
                                    }
                                    z5 = false;
                                }
                                if (z5) {
                                    AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    io.sentry.android.core.w0.m("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        boolean z10 = x11.f295m;
                        if (z10 || x11.f294l) {
                            p(x11, true);
                            z5 = z10;
                        } else {
                            if (x11.f293k) {
                                if (x11.f297o) {
                                    x11.f293k = false;
                                    z7 = E(x11, keyEvent);
                                } else {
                                    z7 = true;
                                }
                                if (z7) {
                                    C(x11, keyEvent);
                                    z5 = true;
                                }
                            }
                            z5 = false;
                        }
                        if (z5) {
                        }
                    }
                }
                return false;
            }
            if (!B()) {
                return false;
            }
        }
        return true;
    }

    public final void s(int i5) {
        k0 x10 = x(i5);
        if (x10.f291h != null) {
            Bundle bundle = new Bundle();
            x10.f291h.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                x10.f298p = bundle;
            }
            x10.f291h.stopDispatchingItemsChanged();
            x10.f291h.clear();
        }
        x10.f297o = true;
        x10.f296n = true;
        if ((i5 == 108 || i5 == 0) && this.f316r != null) {
            k0 x11 = x(0);
            x11.f293k = false;
            E(x11, null);
        }
    }

    public final void t() {
        ViewGroup viewGroup;
        if (this.f330z) {
            return;
        }
        Context context = this.f304k;
        int[] iArr = i.a.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i5 = 0;
        int i10 = 1;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        u();
        this.f305l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) from.inflate(com.sports.insider.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.sports.insider.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) from.inflate(com.sports.insider.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.sports.insider.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.d(context, typedValue.resourceId) : context).inflate(com.sports.insider.R.layout.abc_screen_toolbar, (ViewGroup) null);
            v1 v1Var = (v1) viewGroup.findViewById(com.sports.insider.R.id.decor_content_parent);
            this.f316r = v1Var;
            v1Var.setWindowCallback(this.f305l.getCallback());
            if (this.G) {
                ((ActionBarOverlayLayout) this.f316r).d(109);
            }
            if (this.D) {
                ((ActionBarOverlayLayout) this.f316r).d(2);
            }
            if (this.E) {
                ((ActionBarOverlayLayout) this.f316r).d(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.I + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.J + " }");
        }
        x xVar = new x(this, i5);
        WeakHashMap weakHashMap = z0.f1413a;
        androidx.core.view.q0.l(viewGroup, xVar);
        if (this.f316r == null) {
            this.B = (TextView) viewGroup.findViewById(com.sports.insider.R.id.title);
        }
        boolean z5 = u4.f982a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e7) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e7);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e9) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.sports.insider.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f305l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f305l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new x(this, i10));
        this.A = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
        if (!TextUtils.isEmpty(title)) {
            v1 v1Var2 = this.f316r;
            if (v1Var2 != null) {
                v1Var2.setWindowTitle(title);
            } else {
                y0 y0Var = this.f311o;
                if (y0Var != null) {
                    m4 m4Var = (m4) y0Var.f386e;
                    if (!m4Var.f827g) {
                        Toolbar toolbar = m4Var.f821a;
                        m4Var.f828h = title;
                        if ((m4Var.f822b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (m4Var.f827g) {
                                z0.p(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.f305l.getDecorView();
        contentFrameLayout2.f636g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f330z = true;
        k0 x10 = x(0);
        if (this.f302h0 || x10.f291h != null) {
            return;
        }
        z(108);
    }

    public final void u() {
        if (this.f305l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f305l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final h0 v(Context context) {
        if (this.f310n0 == null) {
            if (v0.f362e == null) {
                Context applicationContext = context.getApplicationContext();
                v0.f362e = new v0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f310n0 = new f0(this, v0.f362e);
        }
        return this.f310n0;
    }

    public final k0 x(int i5) {
        k0[] k0VarArr = this.L;
        if (k0VarArr == null || k0VarArr.length <= i5) {
            k0[] k0VarArr2 = new k0[i5 + 1];
            if (k0VarArr != null) {
                System.arraycopy(k0VarArr, 0, k0VarArr2, 0, k0VarArr.length);
            }
            this.L = k0VarArr2;
            k0VarArr = k0VarArr2;
        }
        k0 k0Var = k0VarArr[i5];
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0();
        k0Var2.f284a = i5;
        k0Var2.f296n = false;
        k0VarArr[i5] = k0Var2;
        return k0Var2;
    }

    public final void y() {
        t();
        if (this.F && this.f311o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.f311o = new y0((Activity) obj, this.G);
            } else if (obj instanceof Dialog) {
                this.f311o = new y0((Dialog) obj);
            }
            y0 y0Var = this.f311o;
            if (y0Var != null) {
                y0Var.d(this.f319s0);
            }
        }
    }

    public final void z(int i5) {
        this.f315q0 = (1 << i5) | this.f315q0;
        if (this.f314p0) {
            return;
        }
        View decorView = this.f305l.getDecorView();
        WeakHashMap weakHashMap = z0.f1413a;
        decorView.postOnAnimation(this.f317r0);
        this.f314p0 = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
