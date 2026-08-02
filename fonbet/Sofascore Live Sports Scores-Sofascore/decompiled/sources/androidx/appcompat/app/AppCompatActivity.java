package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ab0;
import defpackage.ani;
import defpackage.c6o;
import defpackage.d7a;
import defpackage.db0;
import defpackage.eq3;
import defpackage.fib;
import defpackage.fkj;
import defpackage.hmk;
import defpackage.ica;
import defpackage.kb0;
import defpackage.lq3;
import defpackage.n5h;
import defpackage.nkb;
import defpackage.o02;
import defpackage.ob0;
import defpackage.r8l;
import defpackage.t1g;
import defpackage.ub0;
import defpackage.xb0;
import defpackage.za0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements db0 {
    public ub0 h;

    public AppCompatActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new za0(this));
        addOnContextAvailableListener(new ab0(this, 0));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ub0 ub0Var = (ub0) m();
        ub0Var.A();
        ((ViewGroup) ub0Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        ub0Var.m.a(ub0Var.l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        ub0 ub0Var = (ub0) m();
        ub0Var.O = true;
        int i = ub0Var.S;
        if (i == -100) {
            i = kb0.b;
        }
        int H = ub0Var.H(i, context);
        if (kb0.e(context)) {
            kb0.q(context);
        }
        fib t = ub0.t(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(ub0.x(context, H, t, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof lq3) {
            try {
                ((lq3) context).a(ub0.x(context, H, t, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (ub0.j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    ob0.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & PsExtractor.AUDIO_STREAM;
                    int i21 = configuration4.screenLayout & PsExtractor.AUDIO_STREAM;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration x = ub0.x(context, H, t, configuration, true);
            lq3 lq3Var = new lq3(context, com.sofascore.results.R.style.Theme_AppCompat_Empty);
            lq3Var.a(x);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = lq3Var.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        eq3.I(theme);
                    } else {
                        synchronized (c6o.i) {
                            if (!c6o.k) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    c6o.j = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                c6o.k = true;
                            }
                            Method method = c6o.j;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    c6o.j = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = lq3Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        o02 n = n();
        if (getWindow().hasFeature(0)) {
            if (n == null || !n.M()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        o02 n = n();
        if (keyCode == 82 && n != null && n.g0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        ub0 ub0Var = (ub0) m();
        ub0Var.A();
        return ub0Var.l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        ub0 ub0Var = (ub0) m();
        ani aniVar = ub0Var.o;
        if (aniVar == null) {
            ub0Var.F();
            o02 o02Var = ub0Var.n;
            aniVar = new ani(o02Var != null ? o02Var.Y() : ub0Var.k);
            ub0Var.o = aniVar;
        }
        return aniVar;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = hmk.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        m().d();
    }

    public final kb0 m() {
        ub0 ub0Var = this.h;
        if (ub0Var != null) {
            return ub0Var;
        }
        n5h n5hVar = kb0.a;
        ub0 ub0Var2 = new ub0(this, null, this, this);
        this.h = ub0Var2;
        return ub0Var2;
    }

    public final o02 n() {
        ub0 ub0Var = (ub0) m();
        ub0Var.F();
        return ub0Var.n;
    }

    public final void o(Toolbar toolbar) {
        ub0 ub0Var = (ub0) m();
        Object obj = ub0Var.j;
        if (obj instanceof Activity) {
            ub0Var.F();
            o02 o02Var = ub0Var.n;
            if (o02Var instanceof r8l) {
                a70.r("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            ub0Var.o = null;
            if (o02Var != null) {
                o02Var.e0();
            }
            ub0Var.n = null;
            if (toolbar != null) {
                fkj fkjVar = new fkj(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : ub0Var.p, ub0Var.m);
                ub0Var.n = fkjVar;
                ub0Var.m.b = fkjVar.o;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                ub0Var.m.b = null;
            }
            ub0Var.d();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ub0 ub0Var = (ub0) m();
        if (ub0Var.F && ub0Var.z) {
            ub0Var.F();
            o02 o02Var = ub0Var.n;
            if (o02Var != null) {
                o02Var.d0();
            }
        }
        xb0 a = xb0.a();
        Context context = ub0Var.k;
        synchronized (a) {
            t1g t1gVar = a.a;
            synchronized (t1gVar) {
                nkb nkbVar = (nkb) t1gVar.b.get(context);
                if (nkbVar != null) {
                    nkbVar.a();
                }
            }
        }
        ub0Var.R = new Configuration(ub0Var.k.getResources().getConfiguration());
        ub0Var.r(false, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m().g();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent x;
        if (!super.onMenuItemSelected(i, menuItem)) {
            o02 n = n();
            if (menuItem.getItemId() != 16908332 || n == null || (n.S() & 4) == 0 || (x = d7a.x(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(x)) {
                navigateUpTo(x);
                return true;
            }
            ica icaVar = new ica(this);
            Intent x2 = d7a.x(this);
            if (x2 == null) {
                x2 = d7a.x(this);
            }
            if (x2 != null) {
                ComponentName component = x2.getComponent();
                if (component == null) {
                    component = x2.resolveActivity(((Context) icaVar.c).getPackageManager());
                }
                icaVar.b(component);
                ((ArrayList) icaVar.b).add(x2);
            }
            icaVar.c();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((ub0) m()).A();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        ub0 ub0Var = (ub0) m();
        ub0Var.F();
        o02 o02Var = ub0Var.n;
        if (o02Var != null) {
            o02Var.s0(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        ((ub0) m()).r(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ub0 ub0Var = (ub0) m();
        ub0Var.F();
        o02 o02Var = ub0Var.n;
        if (o02Var != null) {
            o02Var.s0(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m().o(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        o02 n = n();
        if (getWindow().hasFeature(0)) {
            if (n == null || !n.i0()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        m().k(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((ub0) m()).T = i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        m().l(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        m().m(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
