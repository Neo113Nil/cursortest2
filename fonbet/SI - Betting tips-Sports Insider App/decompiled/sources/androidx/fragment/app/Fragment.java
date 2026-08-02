package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import com.sports.insider.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.e0, androidx.lifecycle.p1, androidx.lifecycle.r, q2.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    h0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    j1 mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.m1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    j1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    t0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.g0 mLifecycleRegistry;
    androidx.lifecycle.x mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<j0> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final j0 mSavedStateAttachListener;
    q2.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    b2 mViewLifecycleOwner;
    androidx.lifecycle.p0 mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new k0();

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f1830a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1830a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            parcel.writeBundle(this.f1830a);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new k1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b0(this, 0);
        this.mMaxState = androidx.lifecycle.x.f2257e;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.p0();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c0(this);
        D();
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    public final h0 A() {
        if (this.mAnimationInfo == null) {
            h0 h0Var = new h0();
            h0Var.f1942i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            h0Var.j = obj;
            h0Var.f1943k = null;
            h0Var.f1944l = obj;
            h0Var.f1945m = null;
            h0Var.f1946n = obj;
            h0Var.q = 1.0f;
            h0Var.f1949r = null;
            this.mAnimationInfo = h0Var;
        }
        return this.mAnimationInfo;
    }

    public final int B() {
        androidx.lifecycle.x xVar = this.mMaxState;
        return (xVar == androidx.lifecycle.x.f2254b || this.mParentFragment == null) ? xVar.ordinal() : Math.min(xVar.ordinal(), this.mParentFragment.B());
    }

    public final Fragment C(boolean z5) {
        String str;
        if (z5) {
            o1.c cVar = o1.d.f21091a;
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            o1.h hVar = new o1.h(this, "Attempting to get target fragment from fragment " + this);
            o1.d.c(hVar);
            o1.c a7 = o1.d.a(this);
            if (a7.f21089a.contains(o1.b.f21086h) && o1.d.e(a7, getClass(), o1.h.class)) {
                o1.d.b(a7, hVar);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        j1 j1Var = this.mFragmentManager;
        if (j1Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return j1Var.f1965c.b(str);
    }

    public final void D() {
        this.mLifecycleRegistry = new androidx.lifecycle.g0(this);
        Intrinsics.checkNotNullParameter(this, "owner");
        this.mSavedStateRegistryController = new q2.e(new r2.a(this, new me.a(10, this)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        j0 j0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            j0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(j0Var);
        }
    }

    public final a0 E(h.a aVar, f0 f0Var, g.a aVar2) {
        if (this.mState > 1) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        g0 g0Var = new g0(this, f0Var, atomicReference, aVar, aVar2);
        if (this.mState >= 0) {
            g0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(g0Var);
        }
        return new a0(atomicReference);
    }

    public void callStartTransitionListener(boolean z5) {
        ViewGroup viewGroup;
        j1 j1Var;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var != null) {
            h0Var.f1950s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (j1Var = this.mFragmentManager) == null) {
            return;
        }
        k2 j = k2.j(viewGroup, j1Var);
        j.l();
        if (z5) {
            this.mHost.f2088c.post(new t(1, j));
        } else {
            j.f();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public s0 createFragmentContainer() {
        return new d0(this);
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment C = C(false);
        if (C != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(C);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            v1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + StringUtils.PROCESS_POSTFIX_DELIMITER);
        this.mChildFragmentManager.v(r4.k.l(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f1965c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final p0 getActivity() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return t0Var.f2086a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f1948p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f1947o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final j1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return t0Var.f2087b;
    }

    @Override // androidx.lifecycle.r
    @NonNull
    public t1.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && j1.L(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        t1.e eVar = new t1.e(0);
        if (application != null) {
            eVar.b(androidx.lifecycle.l1.f2201e, application);
        }
        eVar.b(androidx.lifecycle.d1.f2149a, this);
        eVar.b(androidx.lifecycle.d1.f2150b, this);
        if (getArguments() != null) {
            eVar.b(androidx.lifecycle.d1.f2151c, getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    @NonNull
    public androidx.lifecycle.m1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && j1.L(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.g1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1935b;
    }

    public Object getEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f1942i;
    }

    public c0.l0 getEnterTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1936c;
    }

    public Object getExitTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f1943k;
    }

    public c0.l0 getExitTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f1949r;
    }

    @Deprecated
    public final j1 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return ((o0) t0Var).f2018e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.e0
    @NonNull
    public androidx.lifecycle.y getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public v1.a getLoaderManager() {
        return v1.a.a(this);
    }

    public int getNextTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1939f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final j1 getParentFragmentManager() {
        j1 j1Var = this.mFragmentManager;
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f1934a;
    }

    public int getPopEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1937d;
    }

    public int getPopExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f1938e;
    }

    public float getPostOnViewCreatedAlpha() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 1.0f;
        }
        return h0Var.q;
    }

    public Object getReenterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f1944l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        o1.c cVar = o1.d.f21091a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        o1.f fVar = new o1.f(this, "Attempting to get retain instance for fragment " + this);
        o1.d.c(fVar);
        o1.c a7 = o1.d.a(this);
        if (a7.f21089a.contains(o1.b.f21084f) && o1.d.e(a7, getClass(), o1.f.class)) {
            o1.d.b(a7, fVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // q2.f
    @NonNull
    public final q2.d getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f21928b;
    }

    public Object getSharedElementEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f1945m;
    }

    public Object getSharedElementReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f1946n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f1940g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f1941h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i5) {
        return getResources().getString(i5);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return C(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        o1.c cVar = o1.d.f21091a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        o1.g gVar = new o1.g(this, "Attempting to get target request code from fragment " + this);
        o1.d.c(gVar);
        o1.c a7 = o1.d.a(this);
        if (a7.f21089a.contains(o1.b.f21086h) && o1.d.e(a7, getClass(), o1.g.class)) {
            o1.d.b(a7, gVar);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i5) {
        return getResources().getText(i5);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public androidx.lifecycle.e0 getViewLifecycleOwner() {
        b2 b2Var = this.mViewLifecycleOwner;
        if (b2Var != null) {
            return b2Var;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @NonNull
    public androidx.lifecycle.n0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.p1
    @NonNull
    public androidx.lifecycle.o1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int B = B();
        androidx.lifecycle.x xVar = androidx.lifecycle.x.f2253a;
        if (B == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.mFragmentManager.O.f2005d;
        androidx.lifecycle.o1 o1Var = (androidx.lifecycle.o1) hashMap.get(this.mWho);
        if (o1Var != null) {
            return o1Var;
        }
        androidx.lifecycle.o1 o1Var2 = new androidx.lifecycle.o1();
        hashMap.put(this.mWho, o1Var2);
        return o1Var2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        D();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new k1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        j1 j1Var = this.mFragmentManager;
        if (j1Var != null) {
            Fragment fragment = this.mParentFragment;
            j1Var.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f1950s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        j1 j1Var = this.mFragmentManager;
        if (j1Var == null) {
            return false;
        }
        return j1Var.P();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public Activity j() {
        return getActivity();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.R();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i5, int i10, Intent intent) {
        if (j1.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i5 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        t0 t0Var = this.mHost;
        p0 p0Var = t0Var == null ? null : t0Var.f2086a;
        if (p0Var != null) {
            this.mCalled = false;
            onAttach((Activity) p0Var);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        j1 j1Var = this.mChildFragmentManager;
        if (j1Var.f1982v >= 1) {
            return;
        }
        j1Var.H = false;
        j1Var.I = false;
        j1Var.O.f2008g = false;
        j1Var.u(1);
    }

    public Animation onCreateAnimation(int i5, boolean z5, int i10) {
        return null;
    }

    public Animator onCreateAnimator(int i5, boolean z5, int i10) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i5 = this.mContentLayoutId;
        if (i5 != 0) {
            return layoutInflater.inflate(i5, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        t0 t0Var = this.mHost;
        p0 p0Var = t0Var == null ? null : t0Var.f2086a;
        if (p0Var != null) {
            this.mCalled = false;
            onInflate((Activity) p0Var, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (j1.L(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        j1 j1Var = this.mChildFragmentManager;
        j1Var.H = false;
        j1Var.I = false;
        j1Var.O.f2008g = false;
        j1Var.u(4);
    }

    public void performAttach() {
        Iterator<j0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f2087b);
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onAttach()"));
        }
        j1 j1Var = this.mFragmentManager;
        Iterator it2 = j1Var.f1977p.iterator();
        while (it2.hasNext()) {
            ((n1) it2.next()).a(j1Var, this);
        }
        j1 j1Var2 = this.mChildFragmentManager;
        j1Var2.H = false;
        j1Var2.I = false;
        j1Var2.O.f2008g = false;
        j1Var2.u(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new e0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.w.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z5 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z5 = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z5;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new b2(this, getViewModelStore(), new z(0, this));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f1875e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (j1.L(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        View view = this.mView;
        b2 b2Var = this.mViewLifecycleOwner;
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, b2Var);
        View view2 = this.mView;
        b2 b2Var2 = this.mViewLifecycleOwner;
        Intrinsics.checkNotNullParameter(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, b2Var2);
        View view3 = this.mView;
        b2 b2Var3 = this.mViewLifecycleOwner;
        Intrinsics.checkNotNullParameter(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, b2Var3);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.e(androidx.lifecycle.w.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            b2 b2Var = this.mViewLifecycleOwner;
            b2Var.b();
            if (b2Var.f1875e.f2169d.a(androidx.lifecycle.x.f2255c)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        s.o oVar = v1.a.a(this).f24389b.f24386b;
        int g10 = oVar.g();
        for (int i5 = 0; i5 < g10; i5++) {
            ((v1.b) oVar.h(i5)).k();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onDetach()"));
        }
        j1 j1Var = this.mChildFragmentManager;
        if (j1Var.J) {
            return;
        }
        j1Var.l();
        this.mChildFragmentManager = new k1();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z5) {
        onMultiWindowModeChanged(z5);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_PAUSE);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.w.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z5) {
        onPictureInPictureModeChanged(z5);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z5 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z5 = true;
        }
        return this.mChildFragmentManager.t(menu) | z5;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean O = j1.O(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != O) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(O);
            onPrimaryNavigationFragmentChanged(O);
            j1 j1Var = this.mChildFragmentManager;
            j1Var.g0();
            j1Var.r(j1Var.f1986z);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.g0 g0Var = this.mLifecycleRegistry;
        androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_RESUME;
        g0Var.e(wVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f1875e.e(wVar);
        }
        j1 j1Var = this.mChildFragmentManager;
        j1Var.H = false;
        j1Var.I = false;
        j1Var.O.f2008g = false;
        j1Var.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.g0 g0Var = this.mLifecycleRegistry;
        androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_START;
        g0Var.e(wVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f1875e.e(wVar);
        }
        j1 j1Var = this.mChildFragmentManager;
        j1Var.H = false;
        j1Var.I = false;
        j1Var.O.f2008g = false;
        j1Var.u(5);
    }

    public void performStop() {
        j1 j1Var = this.mChildFragmentManager;
        j1Var.I = true;
        j1Var.O.f2008g = true;
        j1Var.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_STOP);
        }
        this.mLifecycleRegistry.e(androidx.lifecycle.w.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        A().f1950s = true;
    }

    @NonNull
    public final <I, O> g.b registerForActivityResult(@NonNull h.a aVar, @NonNull g.a aVar2) {
        return E(aVar, new f0(0, this), aVar2);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] permissions, int i5) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not attached to Activity"));
        }
        j1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E != null) {
            parentFragmentManager.F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i5));
            parentFragmentManager.E.a(permissions);
        } else {
            parentFragmentManager.f1983w.getClass();
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
        }
    }

    @NonNull
    public final p0 requireActivity() {
        p0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not attached to an activity."));
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " does not have any arguments."));
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not attached to a context."));
    }

    @NonNull
    @Deprecated
    public final j1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not attached to a host."));
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.X(bundle);
        j1 j1Var = this.mChildFragmentManager;
        j1Var.H = false;
        j1Var.I = false;
        j1Var.O.f2008g = false;
        j1Var.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new l2(androidx.appcompat.widget.c1.l("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z5) {
        A().f1948p = Boolean.valueOf(z5);
    }

    public void setAllowReturnTransitionOverlap(boolean z5) {
        A().f1947o = Boolean.valueOf(z5);
    }

    public void setAnimations(int i5, int i10, int i11, int i12) {
        if (this.mAnimationInfo == null && i5 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        A().f1935b = i5;
        A().f1936c = i10;
        A().f1937d = i11;
        A().f1938e = i12;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(c0.l0 l0Var) {
        A().getClass();
    }

    public void setEnterTransition(Object obj) {
        A().f1942i = obj;
    }

    public void setExitSharedElementCallback(c0.l0 l0Var) {
        A().getClass();
    }

    public void setExitTransition(Object obj) {
        A().f1943k = obj;
    }

    public void setFocusedView(View view) {
        A().f1949r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z5) {
        if (this.mHasMenu != z5) {
            this.mHasMenu = z5;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((o0) this.mHost).f2018e.invalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f1830a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z5) {
        if (this.mMenuVisible != z5) {
            this.mMenuVisible = z5;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((o0) this.mHost).f2018e.invalidateOptionsMenu();
            }
        }
    }

    public void setNextTransition(int i5) {
        if (this.mAnimationInfo == null && i5 == 0) {
            return;
        }
        A();
        this.mAnimationInfo.f1939f = i5;
    }

    public void setPopDirection(boolean z5) {
        if (this.mAnimationInfo == null) {
            return;
        }
        A().f1934a = z5;
    }

    public void setPostOnViewCreatedAlpha(float f6) {
        A().q = f6;
    }

    public void setReenterTransition(Object obj) {
        A().f1944l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z5) {
        o1.c cVar = o1.d.f21091a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        o1.j jVar = new o1.j(this, "Attempting to set retain instance for fragment " + this);
        o1.d.c(jVar);
        o1.c a7 = o1.d.a(this);
        if (a7.f21089a.contains(o1.b.f21084f) && o1.d.e(a7, getClass(), o1.j.class)) {
            o1.d.b(a7, jVar);
        }
        this.mRetainInstance = z5;
        j1 j1Var = this.mFragmentManager;
        if (j1Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z5) {
            j1Var.O.e(this);
        } else {
            j1Var.O.i(this);
        }
    }

    public void setReturnTransition(Object obj) {
        A().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        A().f1945m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        A();
        h0 h0Var = this.mAnimationInfo;
        h0Var.f1940g = arrayList;
        h0Var.f1941h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        A().f1946n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment targetFragment, int i5) {
        if (targetFragment != null) {
            o1.c cVar = o1.d.f21091a;
            Intrinsics.checkNotNullParameter(this, "violatingFragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
            Intrinsics.checkNotNullParameter(this, "fragment");
            o1.k kVar = new o1.k(this, "Attempting to set target fragment " + targetFragment + " with request code " + i5 + " for fragment " + this);
            o1.d.c(kVar);
            o1.c a7 = o1.d.a(this);
            if (a7.f21089a.contains(o1.b.f21086h) && o1.d.e(a7, getClass(), o1.k.class)) {
                o1.d.b(a7, kVar);
            }
        }
        j1 j1Var = this.mFragmentManager;
        j1 j1Var2 = targetFragment != null ? targetFragment.mFragmentManager : null;
        if (j1Var != null && j1Var2 != null && j1Var != j1Var2) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.l("Fragment ", targetFragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment = targetFragment; fragment != null; fragment = fragment.C(false)) {
            if (fragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + targetFragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (targetFragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || targetFragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = targetFragment;
        } else {
            this.mTargetWho = targetFragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i5;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z5) {
        o1.c cVar = o1.d.f21091a;
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(this, "fragment");
        o1.l lVar = new o1.l(this, "Attempting to set user visible hint to " + z5 + " for fragment " + this);
        o1.d.c(lVar);
        o1.c a7 = o1.d.a(this);
        if (a7.f21089a.contains(o1.b.f21085g) && o1.d.e(a7, getClass(), o1.l.class)) {
            o1.d.b(a7, lVar);
        }
        boolean z7 = false;
        if (!this.mUserVisibleHint && z5 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            j1 j1Var = this.mFragmentManager;
            p1 g10 = j1Var.g(this);
            Fragment fragment = g10.f2041c;
            if (fragment.mDeferStart) {
                if (j1Var.f1964b) {
                    j1Var.K = true;
                } else {
                    fragment.mDeferStart = false;
                    g10.k();
                }
            }
        }
        this.mUserVisibleHint = z5;
        if (this.mState < 5 && !z5) {
            z7 = true;
        }
        this.mDeferStart = z7;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z5);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return false;
        }
        p0 p0Var = ((o0) t0Var).f2018e;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i5 >= 32) {
            return p0Var.shouldShowRequestPermissionRationale(str);
        }
        if (i5 != 31) {
            return p0Var.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(p0Var.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return p0Var.shouldShowRequestPermissionRationale(str);
        }
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i5) {
        startActivityForResult(intent, i5, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intent, int i5, Intent intent2, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not attached to Activity"));
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i5 + " IntentSender: " + intent + " fillInIntent: " + intent2 + " options: " + bundle);
        }
        j1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D == null) {
            t0 t0Var = parentFragmentManager.f1983w;
            t0Var.getClass();
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (i5 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            p0 p0Var = t0Var.f2086a;
            if (p0Var == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            p0Var.startIntentSenderForResult(intent, i5, intent2, i10, i11, i12, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (j1.L(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        Intrinsics.checkNotNullParameter(intent, "intentSender");
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intent, intent2, i10, i11);
        parentFragmentManager.F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i5));
        if (j1.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.D.a(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !A().f1950s) {
            return;
        }
        if (this.mHost == null) {
            A().f1950s = false;
        } else if (Looper.myLooper() != this.mHost.f2088c.getLooper()) {
            this.mHost.f2088c.postAtFrontOfQueue(new b0(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) b1.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e7) {
            throw new i0(androidx.appcompat.widget.c1.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e9) {
            throw new i0(androidx.appcompat.widget.c1.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e9);
        } catch (NoSuchMethodException e10) {
            throw new i0(androidx.appcompat.widget.c1.n("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e10);
        } catch (InvocationTargetException e11) {
            throw new i0(androidx.appcompat.widget.c1.n("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e11);
        }
    }

    @NonNull
    public final String getString(int i5, Object... objArr) {
        return getResources().getString(i5, objArr);
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        A().f1950s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        j1 j1Var = this.mFragmentManager;
        if (j1Var != null) {
            this.mPostponedHandler = j1Var.f1983w.f2088c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    public final <I, O> g.b registerForActivityResult(@NonNull h.a aVar, @NonNull g.g gVar, @NonNull g.a aVar2) {
        return E(aVar, new f0(1, gVar), aVar2);
    }

    public void startActivity(@NonNull Intent intent, Bundle bundle) {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not attached to Activity"));
        }
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        t0Var.f2087b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i5, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.l("Fragment ", this, " not attached to Activity"));
        }
        j1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.C != null) {
            parentFragmentManager.F.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i5));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.C.a(intent);
            return;
        }
        t0 t0Var = parentFragmentManager.f1983w;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(this, "fragment");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (i5 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        t0Var.f2087b.startActivity(intent, bundle);
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        t0 t0Var = this.mHost;
        if (t0Var != null) {
            p0 p0Var = ((o0) t0Var).f2018e;
            LayoutInflater cloneInContext = p0Var.getLayoutInflater().cloneInContext(p0Var);
            cloneInContext.setFactory2(this.mChildFragmentManager.f1968f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i5) {
        this();
        this.mContentLayoutId = i5;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    public void onHiddenChanged(boolean z5) {
    }

    public void onMultiWindowModeChanged(boolean z5) {
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z5) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z5) {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i5, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
