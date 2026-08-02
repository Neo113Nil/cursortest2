package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
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
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.aq8;
import defpackage.b8;
import defpackage.bo8;
import defpackage.bq8;
import defpackage.d6b;
import defpackage.de;
import defpackage.dmi;
import defpackage.e6b;
import defpackage.e6g;
import defpackage.egb;
import defpackage.fb3;
import defpackage.fc6;
import defpackage.fgb;
import defpackage.fp8;
import defpackage.g6b;
import defpackage.h79;
import defpackage.j0l;
import defpackage.je;
import defpackage.keb;
import defpackage.kt8;
import defpackage.lnb;
import defpackage.lp8;
import defpackage.ly3;
import defpackage.no8;
import defpackage.nqg;
import defpackage.o9h;
import defpackage.oqg;
import defpackage.ox8;
import defpackage.pqg;
import defpackage.ptk;
import defpackage.q9h;
import defpackage.qha;
import defpackage.qmi;
import defpackage.qn8;
import defpackage.qqg;
import defpackage.qtk;
import defpackage.qx8;
import defpackage.qzc;
import defpackage.r9h;
import defpackage.rn8;
import defpackage.rx8;
import defpackage.sn8;
import defpackage.sqg;
import defpackage.stk;
import defpackage.tn8;
import defpackage.ttk;
import defpackage.u6b;
import defpackage.un8;
import defpackage.vdh;
import defpackage.wb3;
import defpackage.wc;
import defpackage.wn8;
import defpackage.xd;
import defpackage.xo8;
import defpackage.y6b;
import defpackage.yd;
import defpackage.yso;
import defpackage.yzc;
import defpackage.zp8;
import defpackage.zwh;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, u6b, ttk, h79, qqg {
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
    tn8 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    s mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    qtk mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    s mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    no8 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    y6b mLifecycleRegistry;
    e6b mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<un8> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @Nullable
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final un8 mSavedStateAttachListener;
    oqg mSavedStateRegistryController;

    @Nullable
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

    @Nullable
    w mViewLifecycleOwner;
    yzc mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new fp8();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new rn8(this, 0);
        this.mMaxState = e6b.e;
        this.mViewLifecycleOwnerLiveData = new yzc();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new i(this);
        initLifecycle();
    }

    private tn8 ensureAnimationInfo() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var != null) {
            return tn8Var;
        }
        tn8 tn8Var2 = new tn8();
        tn8Var2.i = null;
        Object obj = USE_DEFAULT_TRANSITION;
        tn8Var2.j = obj;
        tn8Var2.k = null;
        tn8Var2.l = obj;
        tn8Var2.m = null;
        tn8Var2.n = obj;
        tn8Var2.q = 1.0f;
        tn8Var2.r = null;
        this.mAnimationInfo = tn8Var2;
        return tn8Var2;
    }

    private int getMinimumMaxLifecycleState() {
        e6b e6bVar = this.mMaxState;
        return (e6bVar == e6b.b || this.mParentFragment == null) ? e6bVar.ordinal() : Math.min(e6bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @Nullable
    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            aq8 aq8Var = bq8.a;
            rx8 rx8Var = new rx8(this, "Attempting to get target fragment from fragment " + this);
            bq8.c(rx8Var);
            aq8 a = bq8.a(this);
            if (a.a.contains(zp8.h) && bq8.e(a, getClass(), rx8.class)) {
                bq8.b(a, rx8Var);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        s sVar = this.mFragmentManager;
        if (sVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return sVar.c.b(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new y6b(this, true);
        this.mSavedStateRegistryController = new oqg(new pqg(this, new e6g(this, 8)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle) {
        try {
            Fragment fragment = (Fragment) xo8.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e) {
            throw new fb3(6, lnb.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e);
        } catch (InstantiationException e2) {
            throw new fb3(6, lnb.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), (Throwable) e2);
        } catch (NoSuchMethodException e3) {
            throw new fb3(6, lnb.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), (Throwable) e3);
        } catch (InvocationTargetException e4) {
            throw new fb3(6, lnb.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), (Throwable) e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        w wVar = this.mViewLifecycleOwner;
        wVar.f.a(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @NonNull
    private <I, O> de prepareCallInternal(@NonNull yd ydVar, @NonNull kt8 kt8Var, @NonNull xd xdVar) {
        if (this.mState > 1) {
            a70.r(fc6.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new sn8(this, kt8Var, atomicReference, ydVar, xdVar));
        return new qn8(atomicReference);
    }

    private void registerOnPreAttachListener(@NonNull un8 un8Var) {
        if (this.mState >= 0) {
            un8Var.a();
        } else {
            this.mOnPreAttachedListeners.add(un8Var);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        s sVar;
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var != null) {
            tn8Var.s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (sVar = this.mFragmentManager) == null) {
            return;
        }
        h j = h.j(viewGroup, sVar);
        j.l();
        if (z) {
            this.mHost.c.post(new b8(j, 16));
        } else {
            j.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public bo8 createFragmentContainer() {
        return new j(this);
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
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
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
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
            egb.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.v(dmi.y(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj;
    }

    @Nullable
    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.c.c(str);
    }

    public Activity g() {
        return getActivity();
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @Nullable
    public final FragmentActivity getActivity() {
        no8 no8Var = this.mHost;
        if (no8Var == null) {
            return null;
        }
        return no8Var.a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null || (bool = tn8Var.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null || (bool = tn8Var.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        tn8Var.getClass();
        return null;
    }

    @Nullable
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final s getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        a70.r(fc6.m("Fragment ", this, " has not been attached yet."));
        return null;
    }

    @Nullable
    public Context getContext() {
        no8 no8Var = this.mHost;
        if (no8Var == null) {
            return null;
        }
        return no8Var.b;
    }

    @Override // defpackage.h79
    @NonNull
    public ly3 getDefaultViewModelCreationExtras() {
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
        if (application == null && s.O(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        qzc qzcVar = new qzc(0);
        LinkedHashMap linkedHashMap = qzcVar.a;
        if (application != null) {
            linkedHashMap.put(ptk.d, application);
        }
        linkedHashMap.put(yso.l, this);
        linkedHashMap.put(yso.m, this);
        if (getArguments() != null) {
            linkedHashMap.put(yso.n, getArguments());
        }
        return qzcVar;
    }

    @Override // defpackage.h79
    @NonNull
    public qtk getDefaultViewModelProviderFactory() {
        Application application = null;
        if (this.mFragmentManager == null) {
            a70.r("Can't access ViewModels from detached fragment");
            return null;
        }
        qtk qtkVar = this.mDefaultFactory;
        if (qtkVar != null) {
            return qtkVar;
        }
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && s.O(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        sqg sqgVar = new sqg(application, this, getArguments());
        this.mDefaultFactory = sqgVar;
        return sqgVar;
    }

    public int getEnterAnim() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return 0;
        }
        return tn8Var.b;
    }

    @Nullable
    public Object getEnterTransition() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        return tn8Var.i;
    }

    public vdh getEnterTransitionCallback() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        tn8Var.getClass();
        return null;
    }

    public int getExitAnim() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return 0;
        }
        return tn8Var.c;
    }

    @Nullable
    public Object getExitTransition() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        return tn8Var.k;
    }

    public vdh getExitTransitionCallback() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        tn8Var.getClass();
        return null;
    }

    public View getFocusedView() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        return tn8Var.r;
    }

    @Nullable
    @Deprecated
    public final s getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable
    public final Object getHost() {
        no8 no8Var = this.mHost;
        if (no8Var == null) {
            return null;
        }
        return ((wn8) no8Var).e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(@Nullable Bundle bundle) {
        no8 no8Var = this.mHost;
        if (no8Var == null) {
            a70.r("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        FragmentActivity fragmentActivity = ((wn8) no8Var).e;
        LayoutInflater cloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
        cloneInContext.setFactory2(this.mChildFragmentManager.f);
        return cloneInContext;
    }

    @Override // defpackage.u6b
    @NonNull
    public g6b getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public egb getLoaderManager() {
        return egb.a(this);
    }

    public int getNextTransition() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return 0;
        }
        return tn8Var.f;
    }

    @Nullable
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final s getParentFragmentManager() {
        s sVar = this.mFragmentManager;
        if (sVar != null) {
            return sVar;
        }
        a70.r(fc6.m("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return false;
        }
        return tn8Var.a;
    }

    public int getPopEnterAnim() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return 0;
        }
        return tn8Var.d;
    }

    public int getPopExitAnim() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return 0;
        }
        return tn8Var.e;
    }

    public float getPostOnViewCreatedAlpha() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return 1.0f;
        }
        return tn8Var.q;
    }

    @Nullable
    public Object getReenterTransition() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        Object obj = tn8Var.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        aq8 aq8Var = bq8.a;
        ox8 ox8Var = new ox8(this, "Attempting to get retain instance for fragment " + this);
        bq8.c(ox8Var);
        aq8 a = bq8.a(this);
        if (a.a.contains(zp8.f) && bq8.e(a, getClass(), ox8.class)) {
            bq8.b(a, ox8Var);
        }
        return this.mRetainInstance;
    }

    @Nullable
    public Object getReturnTransition() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        Object obj = tn8Var.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.qqg
    @NonNull
    public final nqg getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    @Nullable
    public Object getSharedElementEnterTransition() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        return tn8Var.m;
    }

    @Nullable
    public Object getSharedElementReturnTransition() {
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return null;
        }
        Object obj = tn8Var.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        tn8 tn8Var = this.mAnimationInfo;
        return (tn8Var == null || (arrayList = tn8Var.g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        tn8 tn8Var = this.mAnimationInfo;
        return (tn8Var == null || (arrayList = tn8Var.h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i) {
        return getResources().getString(i);
    }

    @Nullable
    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        aq8 aq8Var = bq8.a;
        qx8 qx8Var = new qx8(this, "Attempting to get target request code from fragment " + this);
        bq8.c(qx8Var);
        aq8 a = bq8.a(this);
        if (a.a.contains(zp8.h) && bq8.e(a, getClass(), qx8.class)) {
            bq8.b(a, qx8Var);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable
    public View getView() {
        return this.mView;
    }

    @NonNull
    public u6b getViewLifecycleOwner() {
        w wVar = this.mViewLifecycleOwner;
        if (wVar != null) {
            return wVar;
        }
        a70.r(fc6.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    @NonNull
    public keb getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.ttk
    @NonNull
    public stk getViewModelStore() {
        if (this.mFragmentManager == null) {
            a70.r("Can't access ViewModels from detached fragment");
            return null;
        }
        int minimumMaxLifecycleState = getMinimumMaxLifecycleState();
        e6b e6bVar = e6b.a;
        if (minimumMaxLifecycleState == 1) {
            a70.r("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.mFragmentManager.P.d;
        stk stkVar = (stk) hashMap.get(this.mWho);
        if (stkVar != null) {
            return stkVar;
        }
        stk stkVar2 = new stk();
        hashMap.put(this.mWho, stkVar2);
        return stkVar2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new fp8();
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
        s sVar = this.mFragmentManager;
        if (sVar != null) {
            Fragment fragment = this.mParentFragment;
            sVar.getClass();
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
        tn8 tn8Var = this.mAnimationInfo;
        if (tn8Var == null) {
            return false;
        }
        return tn8Var.s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        s sVar = this.mFragmentManager;
        if (sVar == null) {
            return false;
        }
        return sVar.S();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.U();
    }

    @Deprecated
    public void onActivityCreated(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (s.O(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        no8 no8Var = this.mHost;
        FragmentActivity fragmentActivity = no8Var == null ? null : no8Var.a;
        if (fragmentActivity != null) {
            this.mCalled = false;
            onAttach((Activity) fragmentActivity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(@Nullable Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        s sVar = this.mChildFragmentManager;
        if (sVar.w >= 1) {
            return;
        }
        sVar.I = false;
        sVar.J = false;
        sVar.P.g = false;
        sVar.u(1);
    }

    @Nullable
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Nullable
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, @Nullable ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
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
    public LayoutInflater onGetLayoutInflater(@Nullable Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
        no8 no8Var = this.mHost;
        FragmentActivity fragmentActivity = no8Var == null ? null : no8Var.a;
        if (fragmentActivity != null) {
            this.mCalled = false;
            onInflate((Activity) fragmentActivity, attributeSet, bundle);
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

    public void onViewStateRestored(@Nullable Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.U();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        s sVar = this.mChildFragmentManager;
        sVar.I = false;
        sVar.J = false;
        sVar.P.g = false;
        sVar.u(4);
    }

    public void performAttach() {
        Iterator<un8> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.b);
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        s sVar = this.mFragmentManager;
        Iterator it2 = sVar.q.iterator();
        while (it2.hasNext()) {
            ((lp8) it2.next()).a(sVar, this);
        }
        s sVar2 = this.mChildFragmentManager;
        sVar2.I = false;
        sVar2.J = false;
        sVar2.P.g = false;
        sVar2.u(0);
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
        this.mChildFragmentManager.U();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new k(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.g(d6b.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.mChildFragmentManager.U();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new w(this, getViewModelStore(), new wb3(this, 28));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        w wVar = this.mViewLifecycleOwner;
        if (onCreateView == null) {
            if (wVar.e == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                a70.r("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        wVar.b();
        if (s.O(3)) {
            Objects.toString(this.mView);
            toString();
        }
        qha.Q(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        w wVar2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, wVar2);
        View view2 = this.mView;
        w wVar3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_saved_state_registry_owner, wVar3);
        this.mViewLifecycleOwnerLiveData.j(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.g(d6b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            w wVar = this.mViewLifecycleOwner;
            wVar.b();
            if (wVar.e.i.compareTo(e6b.c) >= 0) {
                this.mViewLifecycleOwner.a(d6b.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        zwh zwhVar = egb.a(this).b.b;
        int e = zwhVar.e();
        for (int i = 0; i < e; i++) {
            ((fgb) zwhVar.f(i)).l();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        s sVar = this.mChildFragmentManager;
        if (sVar.K) {
            return;
        }
        sVar.l();
        this.mChildFragmentManager = new fp8();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(@Nullable Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
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
            this.mViewLifecycleOwner.a(d6b.ON_PAUSE);
        }
        this.mLifecycleRegistry.g(d6b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return this.mChildFragmentManager.t(menu) | z;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean R = s.R(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != R) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(R);
            onPrimaryNavigationFragmentChanged(R);
            s sVar = this.mChildFragmentManager;
            sVar.o0();
            sVar.r(sVar.A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.U();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        y6b y6bVar = this.mLifecycleRegistry;
        d6b d6bVar = d6b.ON_RESUME;
        y6bVar.g(d6bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.e.g(d6bVar);
        }
        s sVar = this.mChildFragmentManager;
        sVar.I = false;
        sVar.J = false;
        sVar.P.g = false;
        sVar.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.U();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        y6b y6bVar = this.mLifecycleRegistry;
        d6b d6bVar = d6b.ON_START;
        y6bVar.g(d6bVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.e.g(d6bVar);
        }
        s sVar = this.mChildFragmentManager;
        sVar.I = false;
        sVar.J = false;
        sVar.P.g = false;
        sVar.u(5);
    }

    public void performStop() {
        s sVar = this.mChildFragmentManager;
        sVar.J = true;
        sVar.P.g = true;
        sVar.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d6b.ON_STOP);
        }
        this.mLifecycleRegistry.g(d6b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public final void postponeEnterTransition(long j, @NonNull TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().s = true;
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        s sVar = this.mFragmentManager;
        if (sVar != null) {
            handler = sVar.x.c;
            this.mPostponedHandler = handler;
        } else {
            handler = new Handler(Looper.getMainLooper());
            this.mPostponedHandler = handler;
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    @NonNull
    public final <I, O> de registerForActivityResult(@NonNull yd ydVar, @NonNull je jeVar, @NonNull xd xdVar) {
        return prepareCallInternal(ydVar, new j0l(jeVar, 26), xdVar);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i) {
        if (this.mHost == null) {
            a70.r(fc6.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        s parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F == null) {
            parentFragmentManager.x.getClass();
            strArr.getClass();
        } else {
            parentFragmentManager.G.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
            parentFragmentManager.F.a(strArr, null);
        }
    }

    @NonNull
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        a70.r(fc6.m("Fragment ", this, " not attached to an activity."));
        return null;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        a70.r(fc6.m("Fragment ", this, " does not have any arguments."));
        return null;
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        a70.r(fc6.m("Fragment ", this, " not attached to a context."));
        return null;
    }

    @NonNull
    @Deprecated
    public final s requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        a70.r(fc6.m("Fragment ", this, " not attached to a host."));
        return null;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            a70.r(fc6.m("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context context = getContext();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(context);
        throw new IllegalStateException(sb.toString());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        a70.r(fc6.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.c0(bundle);
        s sVar = this.mChildFragmentManager;
        sVar.I = false;
        sVar.J = false;
        sVar.P.g = false;
        sVar.u(1);
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
            throw new qmi(fc6.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(d6b.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().b = i;
        ensureAnimationInfo().c = i2;
        ensureAnimationInfo().d = i3;
        ensureAnimationInfo().e = i4;
    }

    public void setArguments(@Nullable Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            a70.r("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(@Nullable vdh vdhVar) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(@Nullable vdh vdhVar) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(@Nullable Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((wn8) this.mHost).e.invalidateMenu();
        }
    }

    public void setInitialSavedState(@Nullable SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            a70.r("Fragment already added");
            return;
        }
        if (savedState == null || (bundle = savedState.a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((wn8) this.mHost).e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().a = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().q = f;
    }

    public void setReenterTransition(@Nullable Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        aq8 aq8Var = bq8.a;
        o9h o9hVar = new o9h(this, "Attempting to set retain instance for fragment " + this);
        bq8.c(o9hVar);
        aq8 a = bq8.a(this);
        if (a.a.contains(zp8.f) && bq8.e(a, getClass(), o9h.class)) {
            bq8.b(a, o9hVar);
        }
        this.mRetainInstance = z;
        s sVar = this.mFragmentManager;
        if (sVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        t tVar = sVar.P;
        if (z) {
            tVar.f(this);
        } else {
            tVar.h(this);
        }
    }

    public void setReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(@Nullable Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(@Nullable ArrayList<String> arrayList, @Nullable ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        tn8 tn8Var = this.mAnimationInfo;
        tn8Var.g = arrayList;
        tn8Var.h = arrayList2;
    }

    public void setSharedElementReturnTransition(@Nullable Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(@Nullable Fragment fragment, int i) {
        if (fragment != null) {
            aq8 aq8Var = bq8.a;
            q9h q9hVar = new q9h(this, "Attempting to set target fragment " + fragment + " with request code " + i + " for fragment " + this);
            bq8.c(q9hVar);
            aq8 a = bq8.a(this);
            if (a.a.contains(zp8.h) && bq8.e(a, getClass(), q9h.class)) {
                bq8.b(a, q9hVar);
            }
        }
        s sVar = this.mFragmentManager;
        s sVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (sVar != null && sVar2 != null && sVar != sVar2) {
            a70.p(fc6.m("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        aq8 aq8Var = bq8.a;
        r9h r9hVar = new r9h(this, "Attempting to set user visible hint to " + z + " for fragment " + this);
        bq8.c(r9hVar);
        aq8 a = bq8.a(this);
        if (a.a.contains(zp8.g) && bq8.e(a, getClass(), r9h.class)) {
            bq8.b(a, r9hVar);
        }
        boolean z2 = false;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            s sVar = this.mFragmentManager;
            u g = sVar.g(this);
            Fragment fragment = g.c;
            if (fragment.mDeferStart) {
                if (sVar.b) {
                    sVar.L = true;
                } else {
                    fragment.mDeferStart = false;
                    g.i();
                }
            }
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        no8 no8Var = this.mHost;
        if (no8Var != null) {
            return wc.b0(((wn8) no8Var).e, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        no8 no8Var = this.mHost;
        if (no8Var == null) {
            a70.r(fc6.m("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            no8Var.b.startActivity(intent, bundle);
        }
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i, @Nullable Bundle bundle) {
        if (this.mHost == null) {
            a70.r(fc6.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        s parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D != null) {
            parentFragmentManager.G.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.D.a(intent, null);
            return;
        }
        no8 no8Var = parentFragmentManager.x;
        no8Var.getClass();
        intent.getClass();
        if (i == -1) {
            no8Var.b.startActivity(intent, bundle);
        } else {
            a70.r("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mHost == null) {
            a70.r(fc6.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (s.O(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        s parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            no8 no8Var = parentFragmentManager.x;
            no8Var.getClass();
            intentSender.getClass();
            if (i == -1) {
                no8Var.a.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                return;
            } else {
                a70.r("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (s.O(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        intentSender.getClass();
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent2, i2, i3);
        parentFragmentManager.G.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
        if (s.O(2)) {
            toString();
        }
        parentFragmentManager.E.a(intentSenderRequest, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().s) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().s = false;
        } else if (Looper.myLooper() != this.mHost.c.getLooper()) {
            this.mHost.c.postAtFrontOfQueue(new rn8(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @NonNull
    public final String getString(int i, @Nullable Object... objArr) {
        return getResources().getString(i, objArr);
    }

    @NonNull
    public final <I, O> de registerForActivityResult(@NonNull yd ydVar, @NonNull xd xdVar) {
        return prepareCallInternal(ydVar, new o(this, 3), xdVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class SavedState implements Parcelable {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new l();
        public final Bundle a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.a = readBundle;
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
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.a);
        }

        public SavedState(Bundle bundle) {
            this.a = bundle;
        }
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, @Nullable Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
    }

    private void restoreViewState() {
        if (s.O(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().s = true;
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Nullable
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
