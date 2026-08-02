package defpackage;

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
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
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
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ub0 extends kb0 implements tec, LayoutInflater.Factory2 {
    public static final fhh h0 = new fhh(0);
    public static final int[] i0 = {R.attr.windowBackground};
    public static final boolean j0 = !"robolectric".equals(Build.FINGERPRINT);
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
    public tb0[] L;
    public tb0 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public rb0 W;
    public rb0 X;
    public boolean Y;
    public int Z;
    public boolean b0;
    public Rect c0;
    public Rect d0;
    public id0 e0;
    public OnBackInvokedDispatcher f0;
    public OnBackInvokedCallback g0;
    public final Object j;
    public final Context k;
    public Window l;
    public qb0 m;
    public o02 n;
    public ani o;
    public CharSequence p;
    public ActionBarOverlayLayout q;
    public sz8 r;
    public t9d s;
    public hc t;
    public ActionBarContextView u;
    public PopupWindow v;
    public lb0 w;
    public boolean z;
    public tuk x = null;
    public final boolean y = true;
    public final lb0 a0 = new lb0(this, 0);

    public ub0(Context context, Window window, db0 db0Var, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.S = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.S = ((ub0) appCompatActivity.m()).S;
            }
        }
        if (this.S == -100) {
            String name = this.j.getClass().getName();
            fhh fhhVar = h0;
            Integer num = (Integer) fhhVar.get(name);
            if (num != null) {
                this.S = num.intValue();
                fhhVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            s(window);
        }
        xb0.d();
    }

    public static fib t(Context context) {
        fib fibVar;
        fib d;
        if (Build.VERSION.SDK_INT >= 33 || (fibVar = kb0.c) == null) {
            return null;
        }
        gib gibVar = fibVar.a;
        fib b = ob0.b(context.getApplicationContext().getResources().getConfiguration());
        if (gibVar.a.isEmpty()) {
            d = fib.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + gibVar.a.size()) {
                Locale b2 = i < gibVar.a.size() ? fibVar.b(i) : b.b(i - gibVar.a.size());
                if (b2 != null) {
                    linkedHashSet.add(b2);
                }
                i++;
            }
            d = fib.d(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
        }
        return d.a.a.isEmpty() ? b : d;
    }

    public static Configuration x(Context context, int i, fib fibVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (fibVar != null) {
            ob0.d(configuration2, fibVar);
        }
        return configuration2;
    }

    public final void A() {
        ViewGroup viewGroup;
        if (this.z) {
            return;
        }
        Context context = this.k;
        int[] iArr = dkf.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)) {
            obtainStyledAttributes.recycle();
            a70.r("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 1;
        if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, false)) {
            i(1);
        } else if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, false)) {
            i(108);
        }
        if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, false)) {
            i(109);
        }
        if (obtainStyledAttributes.getBoolean(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, false)) {
            i(10);
        }
        this.I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        B();
        this.l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.H ? (ViewGroup) from.inflate(com.sofascore.results.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.sofascore.results.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.I) {
            viewGroup = (ViewGroup) from.inflate(com.sofascore.results.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.G = false;
            this.F = false;
        } else if (this.F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.sofascore.results.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new lq3(context, typedValue.resourceId) : context).inflate(com.sofascore.results.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.sofascore.results.R.id.decor_content_parent);
            this.q = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.l.getCallback());
            if (this.G) {
                this.q.j(109);
            }
            if (this.D) {
                this.q.j(2);
            }
            if (this.E) {
                this.q.j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.F);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.G);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.I);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.H);
            sb.append(", windowNoTitle: ");
            a70.p(wt3.p(sb, this.J, " }"));
            return;
        }
        sa0 sa0Var = new sa0(this, i);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(viewGroup, sa0Var);
        if (this.q == null) {
            this.B = (TextView) viewGroup.findViewById(com.sofascore.results.R.id.title);
        }
        boolean z = lvk.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.sofascore.results.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
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
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new de0(this, 8));
        this.A = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.p;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.q;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                o02 o02Var = this.n;
                if (o02Var != null) {
                    o02Var.v0(title);
                } else {
                    TextView textView = this.B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)) {
            obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)) {
            obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(Sdk.SDKError.Reason.TPAT_ERROR_VALUE)) {
            obtainStyledAttributes2.getValue(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.z = true;
        tb0 E = E(0);
        if (this.Q || E.h != null) {
            return;
        }
        G(108);
    }

    public final void B() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                s(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
            return;
        }
        a70.r("We have not been given a Window");
    }

    public final Context C() {
        F();
        o02 o02Var = this.n;
        Context Y = o02Var != null ? o02Var.Y() : null;
        return Y == null ? this.k : Y;
    }

    public final r9 D(Context context) {
        rb0 rb0Var = this.W;
        if (rb0Var == null) {
            x6k x6kVar = x6k.h;
            if (x6kVar == null) {
                Context applicationContext = context.getApplicationContext();
                x6kVar = new x6k(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                x6k.h = x6kVar;
            }
            rb0Var = new rb0(this, x6kVar);
            this.W = rb0Var;
        }
        return rb0Var;
    }

    public final tb0 E(int i) {
        tb0[] tb0VarArr = this.L;
        if (tb0VarArr == null || tb0VarArr.length <= i) {
            tb0[] tb0VarArr2 = new tb0[i + 1];
            if (tb0VarArr != null) {
                System.arraycopy(tb0VarArr, 0, tb0VarArr2, 0, tb0VarArr.length);
            }
            this.L = tb0VarArr2;
            tb0VarArr = tb0VarArr2;
        }
        tb0 tb0Var = tb0VarArr[i];
        if (tb0Var != null) {
            return tb0Var;
        }
        tb0 tb0Var2 = new tb0();
        tb0Var2.a = i;
        tb0Var2.n = false;
        tb0VarArr[i] = tb0Var2;
        return tb0Var2;
    }

    public final void F() {
        o02 o02Var;
        A();
        if (this.F && (o02Var = this.n) == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                o02Var = new r8l((Activity) obj, this.G);
                this.n = o02Var;
            } else if (obj instanceof Dialog) {
                o02Var = new r8l((Dialog) obj);
                this.n = o02Var;
            }
            if (o02Var != null) {
                o02Var.m0(this.b0);
            }
        }
    }

    public final void G(int i) {
        this.Z = (1 << i) | this.Z;
        if (this.Y) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = bsk.a;
        decorView.postOnAnimation(this.a0);
        this.Y = true;
    }

    public final int H(int i, Context context) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            a70.r("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        rb0 rb0Var = this.X;
                        if (rb0Var == null) {
                            rb0Var = new rb0(this, context);
                            this.X = rb0Var;
                        }
                        return rb0Var.h();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return D(context).h();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean I() {
        boolean z = this.N;
        this.N = false;
        tb0 E = E(0);
        if (!E.m) {
            hc hcVar = this.t;
            if (hcVar != null) {
                hcVar.a();
                return true;
            }
            F();
            o02 o02Var = this.n;
            if (o02Var == null || !o02Var.N()) {
                return false;
            }
        } else if (!z) {
            w(E, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x015e, code lost:
    
        if (r5.getCount() > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(tb0 tb0Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = tb0Var.m;
        int i2 = tb0Var.a;
        if (z || this.Q) {
            return;
        }
        Context context = this.k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, tb0Var.h)) {
            w(tb0Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !L(tb0Var, keyEvent)) {
            return;
        }
        sb0 sb0Var = tb0Var.e;
        if (sb0Var == null || tb0Var.n) {
            if (sb0Var == null) {
                Context C = C();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = C.getResources().newTheme();
                newTheme.setTo(C.getTheme());
                newTheme.resolveAttribute(com.sofascore.results.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.sofascore.results.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.sofascore.results.R.style.Theme_AppCompat_CompactMenu, true);
                }
                lq3 lq3Var = new lq3(C, 0);
                lq3Var.getTheme().setTo(newTheme);
                tb0Var.j = lq3Var;
                TypedArray obtainStyledAttributes = lq3Var.obtainStyledAttributes(dkf.j);
                tb0Var.b = obtainStyledAttributes.getResourceId(86, 0);
                tb0Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                tb0Var.e = new sb0(this, tb0Var.j);
                tb0Var.c = 81;
            } else if (tb0Var.n && sb0Var.getChildCount() > 0) {
                tb0Var.e.removeAllViews();
            }
            View view = tb0Var.g;
            if (view == null) {
                if (tb0Var.h != null) {
                    t9d t9dVar = this.s;
                    if (t9dVar == null) {
                        t9dVar = new t9d(this);
                        this.s = t9dVar;
                    }
                    if (tb0Var.i == null) {
                        lcb lcbVar = new lcb(tb0Var.j);
                        tb0Var.i = lcbVar;
                        lcbVar.e = t9dVar;
                        vec vecVar = tb0Var.h;
                        vecVar.b(lcbVar, vecVar.a);
                    }
                    lcb lcbVar2 = tb0Var.i;
                    sb0 sb0Var2 = tb0Var.e;
                    if (lcbVar2.d == null) {
                        lcbVar2.d = (ExpandedMenuView) lcbVar2.b.inflate(com.sofascore.results.R.layout.abc_expanded_menu_layout, (ViewGroup) sb0Var2, false);
                        kcb kcbVar = lcbVar2.f;
                        if (kcbVar == null) {
                            kcbVar = new kcb(lcbVar2);
                            lcbVar2.f = kcbVar;
                        }
                        lcbVar2.d.setAdapter((ListAdapter) kcbVar);
                        lcbVar2.d.setOnItemClickListener(lcbVar2);
                    }
                    ExpandedMenuView expandedMenuView = lcbVar2.d;
                    tb0Var.f = expandedMenuView;
                }
                tb0Var.n = true;
                return;
            }
            tb0Var.f = view;
            if (tb0Var.f != null) {
                if (tb0Var.g == null) {
                    lcb lcbVar3 = tb0Var.i;
                    kcb kcbVar2 = lcbVar3.f;
                    if (kcbVar2 == null) {
                        kcbVar2 = new kcb(lcbVar3);
                        lcbVar3.f = kcbVar2;
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = tb0Var.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                tb0Var.e.setBackgroundResource(tb0Var.b);
                ViewParent parent = tb0Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(tb0Var.f);
                }
                tb0Var.e.addView(tb0Var.f, layoutParams2);
                if (!tb0Var.f.hasFocus()) {
                    tb0Var.f.requestFocus();
                }
            }
            tb0Var.n = true;
            return;
        }
        View view2 = tb0Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            tb0Var.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = tb0Var.c;
            layoutParams3.windowAnimations = tb0Var.d;
            windowManager.addView(tb0Var.e, layoutParams3);
            tb0Var.m = true;
            if (i2 != 0) {
                N();
                return;
            }
            return;
        }
        i = -2;
        tb0Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = tb0Var.c;
        layoutParams32.windowAnimations = tb0Var.d;
        windowManager.addView(tb0Var.e, layoutParams32);
        tb0Var.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean K(tb0 tb0Var, int i, KeyEvent keyEvent) {
        vec vecVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tb0Var.k || L(tb0Var, keyEvent)) && (vecVar = tb0Var.h) != null) {
            return vecVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r6 == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(tb0 tb0Var, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.Q) {
            boolean z = tb0Var.k;
            int i = tb0Var.a;
            if (z) {
                return true;
            }
            tb0 tb0Var2 = this.M;
            if (tb0Var2 != null && tb0Var2 != tb0Var) {
                w(tb0Var2, false);
            }
            Window.Callback callback = this.l.getCallback();
            if (callback != null) {
                tb0Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.q) != null) {
                actionBarOverlayLayout4.k();
                ((okj) actionBarOverlayLayout4.e).l = true;
            }
            if (tb0Var.g == null && (!z2 || !(this.n instanceof fkj))) {
                vec vecVar = tb0Var.h;
                if (vecVar == null || tb0Var.o) {
                    if (vecVar == null) {
                        Context context = this.k;
                        if ((i == 0 || i == 108) && this.q != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.sofascore.results.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.sofascore.results.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.sofascore.results.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                lq3 lq3Var = new lq3(context, 0);
                                lq3Var.getTheme().setTo(theme);
                                context = lq3Var;
                            }
                        }
                        vec vecVar2 = new vec(context);
                        vecVar2.e = this;
                        vec vecVar3 = tb0Var.h;
                        if (vecVar2 != vecVar3) {
                            if (vecVar3 != null) {
                                vecVar3.r(tb0Var.i);
                            }
                            tb0Var.h = vecVar2;
                            lcb lcbVar = tb0Var.i;
                            if (lcbVar != null) {
                                vecVar2.b(lcbVar, vecVar2.a);
                            }
                        }
                        vecVar = tb0Var.h;
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.q) != null) {
                        sz8 sz8Var = this.r;
                        if (sz8Var == null) {
                            sz8Var = new sz8(this, 7);
                            this.r = sz8Var;
                        }
                        actionBarOverlayLayout2.l(vecVar, sz8Var);
                    }
                    tb0Var.h.w();
                    if (callback.onCreatePanelMenu(i, tb0Var.h)) {
                        tb0Var.o = false;
                    } else {
                        vec vecVar4 = tb0Var.h;
                        if (vecVar4 != null) {
                            if (vecVar4 != null) {
                                vecVar4.r(tb0Var.i);
                            }
                            tb0Var.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.q) != null) {
                            actionBarOverlayLayout.l(null, this.r);
                        }
                    }
                }
                tb0Var.h.w();
                Bundle bundle = tb0Var.p;
                if (bundle != null) {
                    tb0Var.h.s(bundle);
                    tb0Var.p = null;
                }
                if (!callback.onPreparePanel(0, tb0Var.g, tb0Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.q) != null) {
                        actionBarOverlayLayout3.l(null, this.r);
                    }
                    tb0Var.h.v();
                    return false;
                }
                tb0Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                tb0Var.h.v();
            }
            tb0Var.k = true;
            tb0Var.l = false;
            this.M = tb0Var;
            return true;
        }
        return false;
    }

    public final void M() {
        if (this.z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void N() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f0 != null && (E(0).m || this.t != null)) {
                z = true;
            }
            if (z && this.g0 == null) {
                this.g0 = pb0.b(this.f0, this);
            } else {
                if (z || (onBackInvokedCallback = this.g0) == null) {
                    return;
                }
                pb0.c(this.f0, onBackInvokedCallback);
                this.g0 = null;
            }
        }
    }

    @Override // defpackage.kb0
    public final void d() {
        if (this.n != null) {
            F();
            if (this.n.b0()) {
                return;
            }
            G(0);
        }
    }

    @Override // defpackage.kb0
    public final void f() {
        String str;
        this.O = true;
        r(false, true);
        B();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = d7a.y(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                o02 o02Var = this.n;
                if (o02Var == null) {
                    this.b0 = true;
                } else {
                    o02Var.m0(true);
                }
            }
            synchronized (kb0.h) {
                kb0.h(this);
                kb0.g.add(new WeakReference(this));
            }
        }
        this.R = new Configuration(this.k.getResources().getConfiguration());
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.kb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        o02 o02Var;
        rb0 rb0Var;
        rb0 rb0Var2;
        if (this.j instanceof Activity) {
            synchronized (kb0.h) {
                kb0.h(this);
            }
        }
        if (this.Y) {
            this.l.getDecorView().removeCallbacks(this.a0);
        }
        this.Q = true;
        if (this.S != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                h0.put(this.j.getClass().getName(), Integer.valueOf(this.S));
                o02Var = this.n;
                if (o02Var != null) {
                    o02Var.e0();
                }
                rb0Var = this.W;
                if (rb0Var != null) {
                    rb0Var.e();
                }
                rb0Var2 = this.X;
                if (rb0Var2 == null) {
                    rb0Var2.e();
                    return;
                }
                return;
            }
        }
        h0.remove(this.j.getClass().getName());
        o02Var = this.n;
        if (o02Var != null) {
        }
        rb0Var = this.W;
        if (rb0Var != null) {
        }
        rb0Var2 = this.X;
        if (rb0Var2 == null) {
        }
    }

    @Override // defpackage.kb0
    public final boolean i(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.J && i == 108) {
            return false;
        }
        if (this.F && i == 1) {
            this.F = false;
        }
        if (i == 1) {
            M();
            this.J = true;
            return true;
        }
        if (i == 2) {
            M();
            this.D = true;
            return true;
        }
        if (i == 5) {
            M();
            this.E = true;
            return true;
        }
        if (i == 10) {
            M();
            this.H = true;
            return true;
        }
        if (i == 108) {
            M();
            this.F = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        M();
        this.G = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // defpackage.tec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(vec vecVar) {
        ActionMenuView actionMenuView;
        dc dcVar;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((okj) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.d) {
                if (ViewConfiguration.get(this.k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.q;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((okj) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        dc dcVar2 = actionMenuView2.e;
                        if (dcVar2 != null) {
                            if (dcVar2.s == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.q;
                actionBarOverlayLayout3.k();
                if (((okj) actionBarOverlayLayout3.e).a.o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.q;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((okj) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView3 != null && (dcVar = actionMenuView3.e) != null) {
                        dcVar.j();
                    }
                    if (this.Q) {
                        return;
                    }
                    callback.onPanelClosed(108, E(0).h);
                    return;
                }
                if (callback == null || this.Q) {
                    return;
                }
                if (this.Y && (1 & this.Z) != 0) {
                    View decorView = this.l.getDecorView();
                    lb0 lb0Var = this.a0;
                    decorView.removeCallbacks(lb0Var);
                    lb0Var.run();
                }
                tb0 E = E(0);
                vec vecVar2 = E.h;
                if (vecVar2 == null || E.o || !callback.onPreparePanel(0, E.g, vecVar2)) {
                    return;
                }
                callback.onMenuOpened(108, E.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.q;
                actionBarOverlayLayout5.k();
                ((okj) actionBarOverlayLayout5.e).a.u();
                return;
            }
        }
        tb0 E2 = E(0);
        E2.n = true;
        w(E2, false);
        J(E2, null);
    }

    @Override // defpackage.kb0
    public final void k(int i) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.kb0
    public final void l(View view) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.kb0
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.kb0
    public final void o(CharSequence charSequence) {
        this.p = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        o02 o02Var = this.n;
        if (o02Var != null) {
            o02Var.v0(charSequence);
            return;
        }
        TextView textView = this.B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00e9, code lost:
    
        if (r10.equals("ImageButton") == false) goto L20;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        id0 id0Var = this.e0;
        View view2 = null;
        if (id0Var == null) {
            int[] iArr = dkf.j;
            Context context2 = this.k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE);
            obtainStyledAttributes.recycle();
            if (string == null) {
                id0Var = new id0();
                this.e0 = id0Var;
            } else {
                try {
                    id0Var = (id0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.e0 = id0Var;
                } catch (Throwable unused) {
                    id0Var = new id0();
                    this.e0 = id0Var;
                }
            }
        }
        int i = hmk.a;
        id0Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, dkf.A, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        obtainStyledAttributes2.recycle();
        Context lq3Var = (resourceId == 0 || ((context instanceof lq3) && ((lq3) context).a == resourceId)) ? context : new lq3(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(lq3Var, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new fb0(lq3Var, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new dc0(lq3Var, attributeSet);
                break;
            case 3:
                appCompatRatingBar = id0Var.e(lq3Var, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new bc0(lq3Var, attributeSet, com.sofascore.results.R.attr.imageButtonStyle);
                break;
            case 5:
                appCompatRatingBar = new gc0(lq3Var, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new b(lq3Var, attributeSet);
                break;
            case 7:
                appCompatRatingBar = id0Var.d(lq3Var, attributeSet);
                break;
            case '\b':
                appCompatRatingBar = new gd0(lq3Var, attributeSet);
                break;
            case '\t':
                appCompatRatingBar = new AppCompatImageView(lq3Var, attributeSet);
                break;
            case '\n':
                appCompatRatingBar = id0Var.a(lq3Var, attributeSet);
                break;
            case 11:
                appCompatRatingBar = id0Var.c(lq3Var, attributeSet);
                break;
            case '\f':
                appCompatRatingBar = new zb0(lq3Var, attributeSet);
                break;
            case '\r':
                appCompatRatingBar = id0Var.b(lq3Var, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != lq3Var) {
            Object[] objArr = id0Var.a;
            if (str.equals(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = lq3Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = id0.g;
                        if (i2 < 3) {
                            View f = id0Var.f(lq3Var, str, strArr[i2]);
                            if (f != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f2 = id0Var.f(lq3Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && appCompatRatingBar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, id0.c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    appCompatRatingBar.setOnClickListener(new hd0(appCompatRatingBar, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = lq3Var.obtainStyledAttributes(attributeSet, id0.d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = bsk.a;
                    new ork(com.sofascore.results.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(appCompatRatingBar, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = lq3Var.obtainStyledAttributes(attributeSet, id0.e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    bsk.r(appCompatRatingBar, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = lq3Var.obtainStyledAttributes(attributeSet, id0.f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = bsk.a;
                    new ork(com.sofascore.results.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(appCompatRatingBar, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return appCompatRatingBar;
    }

    @Override // defpackage.tec
    public final boolean p(vec vecVar, MenuItem menuItem) {
        tb0 tb0Var;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            vec k = vecVar.k();
            tb0[] tb0VarArr = this.L;
            int length = tb0VarArr != null ? tb0VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    tb0Var = tb0VarArr[i];
                    if (tb0Var != null && tb0Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    tb0Var = null;
                    break;
                }
            }
            if (tb0Var != null) {
                return callback.onMenuItemSelected(tb0Var.a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        fib b;
        int i2;
        boolean z3;
        Activity activity;
        if (this.Q) {
            return false;
        }
        int i3 = this.S;
        if (i3 == -100) {
            i3 = kb0.b;
        }
        Context context = this.k;
        int H = H(i3, context);
        int i4 = Build.VERSION.SDK_INT;
        fib t = i4 < 33 ? t(context) : null;
        if (!z2 && t != null) {
            t = ob0.b(context.getResources().getConfiguration());
        }
        Configuration x = x(context, H, t, null, false);
        boolean z4 = this.V;
        boolean z5 = true;
        Object obj = this.j;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.R;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = x.uiMode & 48;
                fib b2 = ob0.b(configuration);
                b = t != null ? null : ob0.b(x);
                i2 = i5 == i6 ? 512 : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.O && ((j0 || this.P) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(x.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new y2(activity, 4));
                        }
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z5 = z3;
                        } else {
                            boolean z6 = (i2 & i) == i2;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (b != null) {
                                ob0.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.T;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.T, true);
                            }
                            if (z6 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof u6b) {
                                    if (((u6b) activity2).getLifecycle().b().compareTo(e6b.c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.P && !this.Q) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (b != null) {
                            ob0.c(ob0.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            D(context).B();
                        } else {
                            rb0 rb0Var = this.W;
                            if (rb0Var != null) {
                                rb0Var.e();
                            }
                        }
                        rb0 rb0Var2 = this.X;
                        if (i3 == 3) {
                            if (rb0Var2 == null) {
                                rb0Var2 = new rb0(this, context);
                                this.X = rb0Var2;
                            }
                            rb0Var2.B();
                        } else if (rb0Var2 != null) {
                            rb0Var2.e();
                        }
                        return z5;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z5 = z3;
                if (b != null) {
                }
                if (i3 == 0) {
                }
                rb0 rb0Var22 = this.X;
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.U = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                this.U = 0;
            }
        }
        this.V = true;
        i = this.U;
        configuration = this.R;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = x.uiMode & 48;
        fib b22 = ob0.b(configuration);
        if (t != null) {
        }
        if (i52 == i62) {
        }
        if (b != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z5 = z3;
        if (b != null) {
        }
        if (i3 == 0) {
        }
        rb0 rb0Var222 = this.X;
        if (i3 == 3) {
        }
        return z5;
    }

    public final void s(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.l != null) {
            a70.r("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof qb0) {
            a70.r("AppCompat has already installed itself into the Window");
            return;
        }
        qb0 qb0Var = new qb0(this, callback);
        this.m = qb0Var;
        window.setCallback(qb0Var);
        Context context = this.k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, i0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            xb0 a = xb0.a();
            synchronized (a) {
                drawable = a.a.d(resourceId, true, context);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f0) != null) {
            return;
        }
        Object obj = this.j;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.g0) != null) {
            pb0.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.g0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f0 = pb0.a(activity);
                N();
            }
        }
        this.f0 = null;
        N();
    }

    public final void u(int i, tb0 tb0Var, vec vecVar) {
        if (vecVar == null) {
            if (tb0Var == null && i >= 0) {
                tb0[] tb0VarArr = this.L;
                if (i < tb0VarArr.length) {
                    tb0Var = tb0VarArr[i];
                }
            }
            if (tb0Var != null) {
                vecVar = tb0Var.h;
            }
        }
        if ((tb0Var == null || tb0Var.m) && !this.Q) {
            qb0 qb0Var = this.m;
            Window.Callback callback = this.l.getCallback();
            qb0Var.getClass();
            try {
                qb0Var.e = true;
                callback.onPanelClosed(i, vecVar);
            } finally {
                qb0Var.e = false;
            }
        }
    }

    public final void v(vec vecVar) {
        dc dcVar;
        if (this.K) {
            return;
        }
        this.K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((okj) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (dcVar = actionMenuView.e) != null) {
            dcVar.j();
            ac acVar = dcVar.r;
            if (acVar != null && acVar.b()) {
                acVar.j.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.Q) {
            callback.onPanelClosed(108, vecVar);
        }
        this.K = false;
    }

    public final void w(tb0 tb0Var, boolean z) {
        sb0 sb0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && tb0Var.a == 0 && (actionBarOverlayLayout = this.q) != null) {
            actionBarOverlayLayout.k();
            if (((okj) actionBarOverlayLayout.e).a.o()) {
                v(tb0Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && tb0Var.m && (sb0Var = tb0Var.e) != null) {
            windowManager.removeView(sb0Var);
            if (z) {
                u(tb0Var.a, tb0Var, null);
            }
        }
        tb0Var.k = false;
        tb0Var.l = false;
        tb0Var.m = false;
        tb0Var.f = null;
        tb0Var.n = true;
        if (this.M == tb0Var) {
            this.M = null;
        }
        if (tb0Var.a == 0) {
            N();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
    
        if (r6.j() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        AudioManager audioManager;
        ActionMenuView actionMenuView;
        Object obj = this.j;
        if ((!(obj instanceof tia) && !(obj instanceof wb0)) || (decorView = this.l.getDecorView()) == null || !bsk.e(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                qb0 qb0Var = this.m;
                Window.Callback callback = this.l.getCallback();
                qb0Var.getClass();
                try {
                    qb0Var.d = true;
                } finally {
                    qb0Var.d = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.N = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        tb0 E = E(0);
                        if (!E.m) {
                            L(E, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.t == null) {
                        tb0 E2 = E(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.q;
                        Context context = this.k;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((okj) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.d && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.q;
                                actionBarOverlayLayout2.k();
                                if (((okj) actionBarOverlayLayout2.e).a.o()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.q;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((okj) actionBarOverlayLayout3.e).a.a;
                                    if (actionMenuView2 != null) {
                                        dc dcVar = actionMenuView2.e;
                                        if (dcVar != null) {
                                        }
                                    }
                                } else if (!this.Q && L(E2, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.q;
                                    actionBarOverlayLayout4.k();
                                    z = ((okj) actionBarOverlayLayout4.e).a.u();
                                    if (z && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                }
                                z = false;
                                if (z) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                            }
                        }
                        boolean z3 = E2.m;
                        if (z3 || E2.l) {
                            w(E2, true);
                            z = z3;
                            if (z) {
                            }
                        } else {
                            if (E2.k) {
                                if (E2.o) {
                                    E2.k = false;
                                    z2 = L(E2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    J(E2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!I()) {
                return false;
            }
        }
        return true;
    }

    public final void z(int i) {
        tb0 E = E(i);
        if (E.h != null) {
            Bundle bundle = new Bundle();
            E.h.t(bundle);
            if (bundle.size() > 0) {
                E.p = bundle;
            }
            E.h.w();
            E.h.clear();
        }
        E.o = true;
        E.n = true;
        if ((i == 108 || i == 0) && this.q != null) {
            tb0 E2 = E(0);
            E2.k = false;
            L(E2, null);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
