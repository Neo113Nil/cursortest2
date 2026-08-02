package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import xsna.aa80;
import xsna.aaj0;
import xsna.b740;
import xsna.bsz;
import xsna.c820;
import xsna.fbs;
import xsna.h380;
import xsna.h90;
import xsna.j620;
import xsna.lb0;
import xsna.mc80;
import xsna.mcs;
import xsna.o7j;
import xsna.p180;
import xsna.p380;
import xsna.r180;
import xsna.r980;
import xsna.sb0;
import xsna.v1h0;
import xsna.vas;
import xsna.wbs;
import xsna.wyt0;
import xsna.xyt0;
import xsna.yja0;
import xsna.z1h0;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements h90.a, h90.b {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.m mFragmentLifecycleRegistry;
    final vas mFragments;
    boolean mResumed;
    boolean mStopped;

    public class a extends fbs<FragmentActivity> implements h380, mc80, r980, aa80, xyt0, r180, sb0, z1h0, mcs, j620 {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // xsna.mcs
        public final void a(@NonNull Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // xsna.j620
        public final void addMenuProvider(@NonNull c820 c820Var) {
            FragmentActivity.this.addMenuProvider(c820Var);
        }

        @Override // xsna.h380
        public final void addOnConfigurationChangedListener(@NonNull o7j<Configuration> o7jVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(o7jVar);
        }

        @Override // xsna.r980
        public final void addOnMultiWindowModeChangedListener(@NonNull o7j<b740> o7jVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(o7jVar);
        }

        @Override // xsna.aa80
        public final void addOnPictureInPictureModeChangedListener(@NonNull o7j<yja0> o7jVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(o7jVar);
        }

        @Override // xsna.mc80
        public final void addOnTrimMemoryListener(@NonNull o7j<Integer> o7jVar) {
            FragmentActivity.this.addOnTrimMemoryListener(o7jVar);
        }

        @Override // xsna.uas
        @Nullable
        public final View b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // xsna.uas
        public final boolean c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // xsna.fbs
        public final void d(@NonNull PrintWriter printWriter, @Nullable String[] strArr) {
            FragmentActivity.this.dump("  ", null, printWriter, strArr);
        }

        @Override // xsna.fbs
        public final FragmentActivity e() {
            return FragmentActivity.this;
        }

        @Override // xsna.fbs
        @NonNull
        public final LayoutInflater f() {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            return fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        }

        @Override // xsna.fbs
        public final boolean g(@NonNull String str) {
            return h90.l(FragmentActivity.this, str);
        }

        @Override // xsna.sb0
        @NonNull
        public final lb0 getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // xsna.f5z
        @NonNull
        public final Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // xsna.r180
        @NonNull
        public final p180 getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // xsna.z1h0
        @NonNull
        public final v1h0 getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // xsna.xyt0
        @NonNull
        public final wyt0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // xsna.fbs
        public final void h() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // xsna.j620
        public final void removeMenuProvider(@NonNull c820 c820Var) {
            FragmentActivity.this.removeMenuProvider(c820Var);
        }

        @Override // xsna.h380
        public final void removeOnConfigurationChangedListener(@NonNull o7j<Configuration> o7jVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(o7jVar);
        }

        @Override // xsna.r980
        public final void removeOnMultiWindowModeChangedListener(@NonNull o7j<b740> o7jVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(o7jVar);
        }

        @Override // xsna.aa80
        public final void removeOnPictureInPictureModeChangedListener(@NonNull o7j<yja0> o7jVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(o7jVar);
        }

        @Override // xsna.mc80
        public final void removeOnTrimMemoryListener(@NonNull o7j<Integer> o7jVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(o7jVar);
        }
    }

    public FragmentActivity() {
        this.mFragments = new vas(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.m(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new v1h0.b() { // from class: xsna.mas
            @Override // xsna.v1h0.b
            public final Bundle r() {
                Bundle lambda$init$0;
                lambda$init$0 = FragmentActivity.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnConfigurationChangedListener(new o7j() { // from class: xsna.nas
            @Override // xsna.o7j
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new o7j() { // from class: xsna.oas
            @Override // xsna.o7j
            public final void accept(Object obj) {
                FragmentActivity.this.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new p380() { // from class: xsna.pas
            @Override // xsna.p380
            public final void a(ComponentActivity componentActivity) {
                FragmentActivity.this.lambda$init$3(componentActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.c(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        a aVar = this.mFragments.a;
        aVar.e.b(aVar, aVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
                m mVar = fragment.mViewLifecycleOwner;
                if (mVar != null) {
                    mVar.b();
                    if (mVar.f.d.a(Lifecycle.State.STARTED)) {
                        fragment.mViewLifecycleOwner.f.e(state);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.d.a(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.e(state);
                    z = true;
                }
            }
        }
        return z;
    }

    @Nullable
    public final View dispatchFragmentsOnCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.a.e.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
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
                bsz.a(this).b(str2, printWriter);
            }
            this.mFragments.a.e.y(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.e;
    }

    @NonNull
    @Deprecated
    public bsz getSupportLoaderManager() {
        return bsz.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.c(Lifecycle.Event.ON_CREATE);
        wbs wbsVar = this.mFragments.a.e;
        wbsVar.H = false;
        wbsVar.I = false;
        wbsVar.O.g = false;
        wbsVar.w(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.e.n();
        this.mFragmentLifecycleRegistry.c(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.e.l(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.e.w(5);
        this.mFragmentLifecycleRegistry.c(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.e.C(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.c(Lifecycle.Event.ON_RESUME);
        wbs wbsVar = this.mFragments.a.e;
        wbsVar.H = false;
        wbsVar.I = false;
        wbsVar.O.g = false;
        wbsVar.w(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            wbs wbsVar = this.mFragments.a.e;
            wbsVar.H = false;
            wbsVar.I = false;
            wbsVar.O.g = false;
            wbsVar.w(4);
        }
        this.mFragments.a.e.C(true);
        this.mFragmentLifecycleRegistry.c(Lifecycle.Event.ON_START);
        wbs wbsVar2 = this.mFragments.a.e;
        wbsVar2.H = false;
        wbsVar2.I = false;
        wbsVar2.O.g = false;
        wbsVar2.w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        wbs wbsVar = this.mFragments.a.e;
        wbsVar.I = true;
        wbsVar.O.g = true;
        wbsVar.w(4);
        this.mFragmentLifecycleRegistry.c(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@Nullable aaj0 aaj0Var) {
        h90.j(this, aaj0Var);
    }

    public void setExitSharedElementCallback(@Nullable aaj0 aaj0Var) {
        h90.k(this, aaj0Var);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            h90.n(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        h90.f(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        h90.g(this);
    }

    public void supportStartPostponedEnterTransition() {
        h90.o(this);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (i == -1) {
            h90.m(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new vas(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.m(this, true);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // xsna.h90.b
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
