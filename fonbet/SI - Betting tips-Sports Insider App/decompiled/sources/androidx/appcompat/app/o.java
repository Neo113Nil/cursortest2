package androidx.appcompat.app;

import android.R;
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
import android.view.Window;
import androidx.appcompat.widget.m4;
import androidx.appcompat.widget.r4;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ViewUtils;
import com.sports.insider.ui.activities.MainActivity;
import j$.util.Objects;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class o extends androidx.fragment.app.p0 implements p {

    /* renamed from: z, reason: collision with root package name */
    public l0 f335z;

    @Override // e.j, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        l0 l0Var = (l0) t();
        l0Var.t();
        ((ViewGroup) l0Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        l0Var.f307m.a(l0Var.f305l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        l0 l0Var = (l0) t();
        l0Var.Z = true;
        int i5 = l0Var.j0;
        if (i5 == -100) {
            i5 = v.f354b;
        }
        int A = l0Var.A(context, i5);
        if (v.b(context) && v.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (v.f361i) {
                    try {
                        l0.g gVar = v.f355c;
                        if (gVar == null) {
                            if (v.f356d == null) {
                                v.f356d = l0.g.b(c0.d.e(context));
                            }
                            if (!v.f356d.f19306a.isEmpty()) {
                                v.f355c = v.f356d;
                            }
                        } else if (!gVar.equals(v.f356d)) {
                            l0.g gVar2 = v.f355c;
                            v.f356d = gVar2;
                            c0.d.d(context, gVar2.f19306a.a());
                        }
                    } finally {
                    }
                }
            } else if (!v.f358f) {
                v.f353a.execute(new q(context, 0));
            }
        }
        l0.g m6 = l0.m(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(l0.q(context, A, m6, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof n.d) {
            try {
                ((n.d) context).a(l0.q(context, A, m6, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (l0.A0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f6 = configuration3.fontScale;
                    float f10 = configuration4.fontScale;
                    if (f6 != f10) {
                        configuration.fontScale = f10;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        a0.a(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                    int i34 = configuration4.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        s6.a.e(configuration3, configuration4, configuration);
                    }
                    int i35 = configuration3.uiMode & 15;
                    int i36 = configuration4.uiMode & 15;
                    if (i35 != i36) {
                        configuration.uiMode |= i36;
                    }
                    int i37 = configuration3.uiMode & 48;
                    int i38 = configuration4.uiMode & 48;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.screenWidthDp;
                    int i40 = configuration4.screenWidthDp;
                    if (i39 != i40) {
                        configuration.screenWidthDp = i40;
                    }
                    int i41 = configuration3.screenHeightDp;
                    int i42 = configuration4.screenHeightDp;
                    if (i41 != i42) {
                        configuration.screenHeightDp = i42;
                    }
                    int i43 = configuration3.smallestScreenWidthDp;
                    int i44 = configuration4.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration.smallestScreenWidthDp = i44;
                    }
                    int i45 = configuration3.densityDpi;
                    int i46 = configuration4.densityDpi;
                    if (i45 != i46) {
                        configuration.densityDpi = i46;
                    }
                }
            }
            Configuration q = l0.q(context, A, m6, configuration, true);
            n.d dVar = new n.d(context, com.sports.insider.R.style.Theme_AppCompat_Empty);
            dVar.a(q);
            try {
                if (context.getTheme() != null) {
                    f0.b.i(dVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = dVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((l0) t()).y();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // c0.f, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((l0) t()).y();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i5) {
        l0 l0Var = (l0) t();
        l0Var.t();
        return l0Var.f305l.findViewById(i5);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        l0 l0Var = (l0) t();
        if (l0Var.f313p == null) {
            l0Var.y();
            y0 y0Var = l0Var.f311o;
            l0Var.f313p = new n.i(y0Var != null ? y0Var.b() : l0Var.f304k);
        }
        return l0Var.f313p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i5 = r4.f904a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        l0 l0Var = (l0) t();
        if (l0Var.f311o != null) {
            l0Var.y();
            l0Var.f311o.getClass();
            l0Var.z(0);
        }
    }

    @Override // e.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l0 l0Var = (l0) t();
        if (l0Var.F && l0Var.f330z) {
            l0Var.y();
            y0 y0Var = l0Var.f311o;
            if (y0Var != null) {
                y0Var.e(y0Var.f382a.getResources().getBoolean(com.sports.insider.R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.b0 a7 = androidx.appcompat.widget.b0.a();
        Context context = l0Var.f304k;
        synchronized (a7) {
            a7.f703a.l(context);
        }
        l0Var.f303i0 = new Configuration(l0Var.f304k.getResources().getConfiguration());
        l0Var.k(false, false);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t().d();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i5, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i5, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.p0, e.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i5, MenuItem menuItem) {
        if (!super.onMenuItemSelected(i5, menuItem)) {
            l0 l0Var = (l0) t();
            l0Var.y();
            y0 y0Var = l0Var.f311o;
            if (menuItem.getItemId() != 16908332 || y0Var == null || (((m4) y0Var.f386e).f822b & 4) == 0) {
                return false;
            }
            MainActivity mainActivity = (MainActivity) this;
            y1.f0 navController = mainActivity.C();
            io.sentry.internal.debugmeta.c configuration = mainActivity.f6897v0;
            if (configuration == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
                configuration = null;
            }
            Intrinsics.checkNotNullParameter(navController, "<this>");
            Intrinsics.checkNotNullParameter(configuration, "appBarConfiguration");
            Intrinsics.checkNotNullParameter(navController, "navController");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            androidx.customview.widget.f fVar = (androidx.customview.widget.f) configuration.f16518c;
            y1.b0 destination = navController.f25625b.f();
            if (fVar != null && destination != null) {
                Intrinsics.checkNotNullParameter(destination, "destination");
                int i10 = y1.b0.f25532f;
                Intrinsics.checkNotNullParameter(destination, "<this>");
                for (y1.b0 b0Var : bg.n.b(new ub.b(12), destination)) {
                    if (((HashSet) configuration.f16517b).contains(Integer.valueOf(b0Var.f25534b.f3017e))) {
                        if (b0Var instanceof y1.d0) {
                            int i11 = destination.f25534b.f3017e;
                            int i12 = y1.d0.f25542h;
                            if (i11 == y4.a.t((y1.d0) b0Var).f25534b.f3017e) {
                            }
                        }
                        ((DrawerLayout) fVar).n();
                        return true;
                    }
                }
            }
            if (!navController.e()) {
                Intent b10 = c0.d.b(mainActivity);
                if (b10 == null) {
                    return false;
                }
                if (mainActivity.shouldUpRecreateTask(b10)) {
                    c0.m0 m0Var = new c0.m0(mainActivity);
                    Intent b11 = c0.d.b(mainActivity);
                    if (b11 == null) {
                        b11 = c0.d.b(mainActivity);
                    }
                    if (b11 != null) {
                        ComponentName component = b11.getComponent();
                        if (component == null) {
                            component = b11.resolveActivity(m0Var.f3285b.getPackageManager());
                        }
                        m0Var.a(component);
                        m0Var.f3284a.add(b11);
                    }
                    m0Var.b();
                    try {
                        mainActivity.finishAffinity();
                    } catch (IllegalStateException unused) {
                        mainActivity.finish();
                    }
                } else {
                    mainActivity.navigateUpTo(b10);
                }
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((l0) t()).t();
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        l0 l0Var = (l0) t();
        l0Var.y();
        y0 y0Var = l0Var.f311o;
        if (y0Var != null) {
            y0Var.f399t = true;
        }
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onStart() {
        super.onStart();
        ((l0) t()).k(true, false);
    }

    @Override // androidx.fragment.app.p0, android.app.Activity
    public void onStop() {
        super.onStop();
        l0 l0Var = (l0) t();
        l0Var.y();
        y0 y0Var = l0Var.f311o;
        if (y0Var != null) {
            y0Var.f399t = false;
            n.j jVar = y0Var.f398s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i5) {
        super.onTitleChanged(charSequence, i5);
        t().j(charSequence);
    }

    @Override // androidx.appcompat.app.p
    public final n.b onWindowStartingSupportActionMode(n.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((l0) t()).y();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // e.j, android.app.Activity
    public final void setContentView(int i5) {
        p();
        t().g(i5);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i5) {
        super.setTheme(i5);
        ((l0) t()).k0 = i5;
    }

    public final v t() {
        if (this.f335z == null) {
            k2.a0 a0Var = v.f353a;
            this.f335z = new l0(this, null, this, this);
        }
        return this.f335z;
    }

    @Override // e.j, android.app.Activity
    public void setContentView(View view) {
        p();
        t().h(view);
    }

    @Override // e.j, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        t().i(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.appcompat.app.p
    public final void onSupportActionModeFinished(n.b bVar) {
    }

    @Override // androidx.appcompat.app.p
    public final void onSupportActionModeStarted(n.b bVar) {
    }
}
