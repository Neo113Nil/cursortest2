package com.vk.navigation;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.themes.ThemableActivity;
import java.util.List;
import xsna.bpn0;
import xsna.ey50;
import xsna.ndp0;
import xsna.q5f;
import xsna.s3q0;
import xsna.tvo;
import xsna.vbs;
import xsna.ww50;
import xsna.xbs;

/* compiled from: ImNavigationDelegateActivity.kt */
/* loaded from: classes3.dex */
public abstract class ImNavigationDelegateActivity extends ThemableActivity implements ey50, xbs, tvo.a {
    public static final /* synthetic */ int n = 0;
    public final bpn0 l = new bpn0(new q5f(this, 29));
    public ww50<? extends ImNavigationDelegateActivity> m;

    @Override // com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public final void O1(Configuration configuration) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onOverriddenConfigurationChanged"));
        try {
            super.O1(configuration);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.F(configuration);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    public abstract void R1();

    @Override // xsna.ey50
    public final ww50<ImNavigationDelegateActivity> Y() {
        ww50 ww50Var = this.m;
        if (ww50Var == null) {
            return null;
        }
        return ww50Var;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
        if (ww50Var == null) {
            ww50Var = null;
        }
        return ww50Var.o(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // xsna.xbs
    public final vbs n() {
        return (vbs) this.l.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onActivityResult"));
        try {
            super.onActivityResult(i, i2, intent);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.E(i, i2, intent);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onBackPressed"));
        try {
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            ww50<? extends ImNavigationDelegateActivity> ww50Var2 = null;
            if (ww50Var == null) {
                ww50Var = null;
            }
            if (!ww50Var.I()) {
                ww50<? extends ImNavigationDelegateActivity> ww50Var3 = this.m;
                if (ww50Var3 == null) {
                    ww50Var3 = null;
                }
                FragmentImpl u = ww50Var3.u();
                if (u != null && u.a0()) {
                    return;
                }
            }
            ww50<? extends ImNavigationDelegateActivity> ww50Var4 = this.m;
            if (ww50Var4 != null) {
                ww50Var2 = ww50Var4;
            }
            if (!ww50Var2.a0()) {
                super.onBackPressed();
            }
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onCreate"));
        try {
            R1();
            this.m = null;
            throw null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onDestroy"));
        try {
            super.onDestroy();
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.G();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final boolean onNavigateUp() {
        ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
        if (ww50Var == null) {
            ww50Var = null;
        }
        FragmentImpl u = ww50Var.u();
        if (u == null) {
            return false;
        }
        ww50<? extends ImNavigationDelegateActivity> ww50Var2 = this.m;
        return (ww50Var2 != null ? ww50Var2 : null).L(u);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onNewIntent"));
        try {
            super.onNewIntent(intent);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.M(intent);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
        if (ww50Var == null) {
            ww50Var = null;
        }
        ww50Var.getClass();
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onPause"));
        try {
            super.onPause();
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.N();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onPostCreate"));
        try {
            super.onPostCreate(bundle);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.getClass();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onPrepareOptionsMenu"));
        try {
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.O(menu);
            return super.onPrepareOptionsMenu(menu);
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onRequestPermissionsResult"));
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.getClass();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.vk.core.activity.BaseActivity, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onRestoreInstanceState"));
        try {
            super.onRestoreInstanceState(bundle);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.P(bundle);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onResume"));
        try {
            super.onResume();
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.Q();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onSaveInstanceState"));
        try {
            super.onSaveInstanceState(bundle);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.R(bundle);
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onStart"));
        try {
            super.onStart();
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.T();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onStop"));
        try {
            super.onStop();
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.U();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onTrimMemory"));
        try {
            super.onTrimMemory(i);
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.getClass();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onPermissionsGranted"));
        try {
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.getClass();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        Trace.beginSection(ndp0.f("ImNavigationDelegateActivity.onPermissionsDenied"));
        try {
            ww50<? extends ImNavigationDelegateActivity> ww50Var = this.m;
            if (ww50Var == null) {
                ww50Var = null;
            }
            ww50Var.getClass();
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }
}
