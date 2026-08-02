package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.NonNull;
import androidx.core.app.b;
import androidx.core.view.InterfaceC2120x;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.C2195u;
import androidx.savedstate.a;
import i.InterfaceC4514b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l0.InterfaceC5340e;
import l0.InterfaceC5341f;
import x0.InterfaceC6772a;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC2168s extends ComponentActivity implements b.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C2171v mFragments = C2171v.b(new a());
    final C2195u mFragmentLifecycleRegistry = new C2195u(this);
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.s$a */
    public class a extends AbstractC2173x implements InterfaceC5340e, InterfaceC5341f, androidx.core.app.s, androidx.core.app.t, androidx.lifecycle.W, androidx.activity.H, j.e, B2.g, I, InterfaceC2120x {
        public a() {
            super(AbstractActivityC2168s.this);
        }

        @Override // androidx.fragment.app.I
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            AbstractActivityC2168s.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.InterfaceC2120x
        public void addMenuProvider(androidx.core.view.C c10) {
            AbstractActivityC2168s.this.addMenuProvider(c10);
        }

        @Override // l0.InterfaceC5340e
        public void addOnConfigurationChangedListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.addOnConfigurationChangedListener(interfaceC6772a);
        }

        @Override // androidx.core.app.s
        public void addOnMultiWindowModeChangedListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.addOnMultiWindowModeChangedListener(interfaceC6772a);
        }

        @Override // androidx.core.app.t
        public void addOnPictureInPictureModeChangedListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.addOnPictureInPictureModeChangedListener(interfaceC6772a);
        }

        @Override // l0.InterfaceC5341f
        public void addOnTrimMemoryListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.addOnTrimMemoryListener(interfaceC6772a);
        }

        @Override // androidx.fragment.app.AbstractC2170u
        public View c(int i10) {
            return AbstractActivityC2168s.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC2170u
        public boolean d() {
            Window window = AbstractActivityC2168s.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // j.e
        public j.d getActivityResultRegistry() {
            return AbstractActivityC2168s.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC2193s
        public AbstractC2185j getLifecycle() {
            return AbstractActivityC2168s.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.H
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return AbstractActivityC2168s.this.getOnBackPressedDispatcher();
        }

        @Override // B2.g
        public androidx.savedstate.a getSavedStateRegistry() {
            return AbstractActivityC2168s.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.W
        public androidx.lifecycle.V getViewModelStore() {
            return AbstractActivityC2168s.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC2173x
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC2168s.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC2173x
        public LayoutInflater k() {
            return AbstractActivityC2168s.this.getLayoutInflater().cloneInContext(AbstractActivityC2168s.this);
        }

        @Override // androidx.fragment.app.AbstractC2173x
        public boolean m(String str) {
            return androidx.core.app.b.i(AbstractActivityC2168s.this, str);
        }

        @Override // androidx.fragment.app.AbstractC2173x
        public void p() {
            q();
        }

        public void q() {
            AbstractActivityC2168s.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.AbstractC2173x
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC2168s j() {
            return AbstractActivityC2168s.this;
        }

        @Override // androidx.core.view.InterfaceC2120x
        public void removeMenuProvider(androidx.core.view.C c10) {
            AbstractActivityC2168s.this.removeMenuProvider(c10);
        }

        @Override // l0.InterfaceC5340e
        public void removeOnConfigurationChangedListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.removeOnConfigurationChangedListener(interfaceC6772a);
        }

        @Override // androidx.core.app.s
        public void removeOnMultiWindowModeChangedListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.removeOnMultiWindowModeChangedListener(interfaceC6772a);
        }

        @Override // androidx.core.app.t
        public void removeOnPictureInPictureModeChangedListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.removeOnPictureInPictureModeChangedListener(interfaceC6772a);
        }

        @Override // l0.InterfaceC5341f
        public void removeOnTrimMemoryListener(InterfaceC6772a interfaceC6772a) {
            AbstractActivityC2168s.this.removeOnTrimMemoryListener(interfaceC6772a);
        }
    }

    public AbstractActivityC2168s() {
        w();
    }

    public static /* synthetic */ Bundle u(AbstractActivityC2168s abstractActivityC2168s) {
        abstractActivityC2168s.markFragmentsCreated();
        abstractActivityC2168s.mFragmentLifecycleRegistry.i(AbstractC2185j.a.ON_STOP);
        return new Bundle();
    }

    private void w() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new a.b() { // from class: androidx.fragment.app.o
            @Override // androidx.savedstate.a.b
            public final Bundle a() {
                return AbstractActivityC2168s.u(AbstractActivityC2168s.this);
            }
        });
        addOnConfigurationChangedListener(new InterfaceC6772a() { // from class: androidx.fragment.app.p
            @Override // x0.InterfaceC6772a
            public final void accept(Object obj) {
                AbstractActivityC2168s.this.mFragments.m();
            }
        });
        addOnNewIntentListener(new InterfaceC6772a() { // from class: androidx.fragment.app.q
            @Override // x0.InterfaceC6772a
            public final void accept(Object obj) {
                AbstractActivityC2168s.this.mFragments.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC4514b() { // from class: androidx.fragment.app.r
            @Override // i.InterfaceC4514b
            public final void a(Context context) {
                AbstractActivityC2168s.this.mFragments.a(null);
            }
        });
    }

    public static boolean x(FragmentManager fragmentManager, AbstractC2185j.b bVar) {
        boolean z10 = false;
        for (Fragment fragment : fragmentManager.C0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= x(fragment.getChildFragmentManager(), bVar);
                }
                S s10 = fragment.mViewLifecycleOwner;
                if (s10 != null && s10.getLifecycle().b().b(AbstractC2185j.b.f20393d)) {
                    fragment.mViewLifecycleOwner.f(bVar);
                    z10 = true;
                }
                if (fragment.mLifecycleRegistry.b().b(AbstractC2185j.b.f20393d)) {
                    fragment.mLifecycleRegistry.n(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                Z0.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().c0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @NonNull
    @Deprecated
    public Z0.a getSupportLoaderManager() {
        return Z0.a.b(this);
    }

    public void markFragmentsCreated() {
        while (x(getSupportFragmentManager(), AbstractC2185j.b.f20392c)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(AbstractC2185j.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.i(AbstractC2185j.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.i(AbstractC2185j.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(AbstractC2185j.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.i(AbstractC2185j.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.i(AbstractC2185j.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.y yVar) {
        androidx.core.app.b.g(this, yVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.y yVar) {
        androidx.core.app.b.h(this, yVar);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.k(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.c(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.d(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.l(this);
    }

    @Override // androidx.core.app.b.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.j(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
