package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k0;
import androidx.core.app.z;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.savedstate.a;
import i.InterfaceC4514b;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5481c extends AbstractActivityC2168s implements InterfaceC5482d, z.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC5484f mDelegate;
    private Resources mResources;

    /* renamed from: m.c$a */
    public class a implements a.b {
        public a() {
        }

        @Override // androidx.savedstate.a.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            AbstractActivityC5481c.this.getDelegate().D(bundle);
            return bundle;
        }
    }

    /* renamed from: m.c$b */
    public class b implements InterfaceC4514b {
        public b() {
        }

        @Override // i.InterfaceC4514b
        public void a(Context context) {
            AbstractC5484f delegate = AbstractActivityC5481c.this.getDelegate();
            delegate.v();
            delegate.z(AbstractActivityC5481c.this.getSavedStateRegistry().a(AbstractActivityC5481c.DELEGATE_TAG));
        }
    }

    public AbstractActivityC5481c() {
        y();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC5479a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC5479a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i10) {
        return (T) getDelegate().l(i10);
    }

    @NonNull
    public AbstractC5484f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC5484f.j(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC5480b getDrawerToggleDelegate() {
        return getDelegate().p();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && k0.d()) {
            this.mResources = new k0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC5479a getSupportActionBar() {
        return getDelegate().u();
    }

    @Override // androidx.core.app.z.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.j.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().w();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().y(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull androidx.core.app.z zVar) {
        zVar.b(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (z(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        AbstractC5479a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().B(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().C();
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().E();
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().F();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        androidx.core.app.z f10 = androidx.core.app.z.f(this);
        onCreateSupportNavigateUpTaskStack(f10);
        onPrepareSupportNavigateUpTaskStack(f10);
        f10.i();
        try {
            androidx.core.app.b.b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        getDelegate().R(charSequence);
    }

    @Override // m.InterfaceC5482d
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(@NonNull b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC5479a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        getDelegate().K(i10);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().P(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i10);
        getDelegate().Q(i10);
    }

    public androidx.appcompat.view.b startSupportActionMode(@NonNull b.a aVar) {
        return getDelegate().S(aVar);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s
    public void supportInvalidateOptionsMenu() {
        getDelegate().w();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        androidx.core.app.j.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i10) {
        return getDelegate().I(i10);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return androidx.core.app.j.f(this, intent);
    }

    public final void y() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    public final boolean z(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().L(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().M(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(@NonNull u0.i iVar) {
    }

    public void onNightModeChanged(int i10) {
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull androidx.core.app.z zVar) {
    }

    @Override // m.InterfaceC5482d
    public void onSupportActionModeFinished(@NonNull androidx.appcompat.view.b bVar) {
    }

    @Override // m.InterfaceC5482d
    public void onSupportActionModeStarted(@NonNull androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void setSupportProgress(int i10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z10) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z10) {
    }
}
