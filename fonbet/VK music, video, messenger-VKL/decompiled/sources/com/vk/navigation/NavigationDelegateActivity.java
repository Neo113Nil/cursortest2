package com.vk.navigation;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragmentWrapperActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.metrics.eventtracking.b;
import com.vk.permission.d;
import com.vkontakte.android.MainActivity;
import com.vkontakte.android.VKActivity;
import java.util.HashSet;
import java.util.List;
import xsna.a0a;
import xsna.dhr0;
import xsna.ey50;
import xsna.fnj;
import xsna.fy50;
import xsna.iah0;
import xsna.ify;
import xsna.nht;
import xsna.nx50;
import xsna.sgn0;
import xsna.tvo;
import xsna.xdr0;
import xsna.yx50;
import xsna.z1h0;

/* compiled from: NavigationDelegateActivity.kt */
/* loaded from: classes.dex */
public abstract class NavigationDelegateActivity extends VKActivity implements ey50, tvo.a, nht {
    public xdr0<? extends NavigationDelegateActivity> v;

    @Override // xsna.nht
    public void K0(int i, String[] strArr) {
        ify.a Y = Y();
        nht nhtVar = Y instanceof nht ? (nht) Y : null;
        if (nhtVar != null) {
            nhtVar.K0(i, strArr);
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity
    public void O1(Configuration configuration) {
        super.O1(configuration);
        Y().F(configuration);
    }

    @Override // com.vkontakte.android.VKActivity
    public void R1() {
        if (isInPictureInPictureMode()) {
            return;
        }
        super.R1();
        xdr0<? extends NavigationDelegateActivity> xdr0Var = this.v;
        if (xdr0Var != null) {
            xdr0Var.j0();
        }
        xdr0<? extends NavigationDelegateActivity> xdr0Var2 = this.v;
        if (xdr0Var2 != null) {
            xdr0Var2.l0(true);
        }
        super.recreate();
    }

    public final void T1() {
        if (W1()) {
            return;
        }
        Bundle extras = getIntent().getExtras();
        int i = extras != null ? extras.getInt("theme", 0) : 0;
        if (i == 0) {
            setTheme(dhr0.C().c);
        } else {
            setTheme(i);
        }
    }

    @Override // xsna.ey50
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public final xdr0<NavigationDelegateActivity> Y() {
        xdr0<NavigationDelegateActivity> nx50Var;
        xdr0 xdr0Var = this.v;
        if (xdr0Var != null) {
            return xdr0Var;
        }
        HashSet hashSet = iah0.a;
        if (fnj.d(this)) {
            boolean V1 = V1();
            a0a a0aVar = sgn0.d;
            (a0aVar != null ? a0aVar : null).getClass();
            nx50Var = new yx50<>(this, V1);
        } else {
            boolean V12 = V1();
            a0a a0aVar2 = sgn0.d;
            (a0aVar2 != null ? a0aVar2 : null).getClass();
            nx50Var = new nx50<>(this, V12);
        }
        this.v = nx50Var;
        return nx50Var;
    }

    public boolean V1() {
        return this instanceof MainActivity;
    }

    public boolean W1() {
        return this instanceof ClipsPlaylistPickerFragmentWrapperActivity;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return Y().o(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        xdr0<NavigationDelegateActivity> Y = Y();
        int i = ify.a;
        ify.g(Y);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = super.getResources();
        Resources resources2 = this.v != null ? resources : null;
        return resources2 == null ? resources : resources2;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Y().E(i, i2, intent);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FragmentImpl u;
        if ((Y().I() || (u = Y().u()) == null || !u.a0()) && !Y().a0()) {
            super.onBackPressed();
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Y().n0(bundle);
        T1();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Y().G();
        this.v = null;
    }

    @Override // android.app.Activity
    public final boolean onNavigateUp() {
        return Y().L(Y().u());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Y().M(intent);
    }

    @Override // com.vkontakte.android.VKActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Y();
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Y().N();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        Y();
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Y().O(menu);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        Y();
    }

    @Override // com.vk.core.activity.BaseActivity, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Y().P(bundle);
        for (z1h0 z1h0Var : getSupportFragmentManager().c.f()) {
            if (z1h0Var instanceof fy50) {
                ((fy50) z1h0Var).lf();
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, com.vk.core.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Y().Q();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        try {
            super.onSaveInstanceState(bundle2);
            bundle.putAll(bundle2);
        } catch (Throwable th) {
            b.a.a(th);
        }
        Bundle bundle3 = new Bundle();
        try {
            Y().R(bundle3);
            bundle.putAll(bundle3);
        } catch (Throwable th2) {
            b.a.a(th2);
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        Y().T();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        Y().U();
    }

    @Override // xsna.tvo.a
    public void pc(int i, List<String> list) {
        Y();
        d a = d.a.a(this);
        if (a != null) {
            a.pc(i, list);
        }
    }

    @Override // xsna.tvo.a
    public void wi(int i, List<String> list) {
        Y();
        d a = d.a.a(this);
        if (a != null) {
            a.wi(i, list);
        }
    }
}
