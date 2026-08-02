package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC2082d0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.X;
import androidx.lifecycle.AbstractC2185j;
import java.util.Objects;

/* loaded from: classes.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    public final C2175z f20028a;

    /* renamed from: b, reason: collision with root package name */
    public final M f20029b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f20030c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20031d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f20032e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f20033a;

        public a(View view) {
            this.f20033a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f20033a.removeOnAttachStateChangeListener(this);
            AbstractC2082d0.i0(this.f20033a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State;

        static {
            int[] iArr = new int[AbstractC2185j.b.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$State = iArr;
            try {
                iArr[AbstractC2185j.b.f20394e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[AbstractC2185j.b.f20393d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[AbstractC2185j.b.f20392c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$State[AbstractC2185j.b.f20391b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public K(C2175z c2175z, M m10, Fragment fragment) {
        this.f20028a = c2175z;
        this.f20029b = m10;
        this.f20030c = fragment;
    }

    public void a() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        Bundle bundle = this.f20030c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f20030c.performActivityCreated(bundle2);
        this.f20028a.a(this.f20030c, bundle2, false);
    }

    public void b() {
        Fragment s02 = FragmentManager.s0(this.f20030c.mContainer);
        Fragment parentFragment = this.f20030c.getParentFragment();
        if (s02 != null && !s02.equals(parentFragment)) {
            Fragment fragment = this.f20030c;
            S0.c.o(fragment, s02, fragment.mContainerId);
        }
        int j10 = this.f20029b.j(this.f20030c);
        Fragment fragment2 = this.f20030c;
        fragment2.mContainer.addView(fragment2.mView, j10);
    }

    public void c() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        Fragment fragment = this.f20030c;
        Fragment fragment2 = fragment.mTarget;
        K k10 = null;
        if (fragment2 != null) {
            K n10 = this.f20029b.n(fragment2.mWho);
            if (n10 == null) {
                throw new IllegalStateException("Fragment " + this.f20030c + " declared target fragment " + this.f20030c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f20030c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            k10 = n10;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (k10 = this.f20029b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f20030c + " declared target fragment " + this.f20030c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (k10 != null) {
            k10.m();
        }
        Fragment fragment4 = this.f20030c;
        fragment4.mHost = fragment4.mFragmentManager.D0();
        Fragment fragment5 = this.f20030c;
        fragment5.mParentFragment = fragment5.mFragmentManager.G0();
        this.f20028a.g(this.f20030c, false);
        this.f20030c.performAttach();
        this.f20028a.b(this.f20030c, false);
    }

    public int d() {
        Fragment fragment = this.f20030c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i10 = this.f20032e;
        int i11 = b.$SwitchMap$androidx$lifecycle$Lifecycle$State[fragment.mMaxState.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment2 = this.f20030c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i10 = Math.max(this.f20032e, 2);
                View view = this.f20030c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f20032e < 4 ? Math.min(i10, fragment2.mState) : Math.min(i10, 1);
            }
        }
        Fragment fragment3 = this.f20030c;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            i10 = Math.min(i10, 4);
        }
        if (!this.f20030c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        Fragment fragment4 = this.f20030c;
        ViewGroup viewGroup = fragment4.mContainer;
        X.d.a s10 = viewGroup != null ? X.u(viewGroup, fragment4.getParentFragmentManager()).s(this) : null;
        if (s10 == X.d.a.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (s10 == X.d.a.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment5 = this.f20030c;
            if (fragment5.mRemoving) {
                i10 = fragment5.isInBackStack() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment6 = this.f20030c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        if (this.f20030c.mTransitioning) {
            i10 = Math.max(i10, 3);
        }
        if (FragmentManager.Q0(2)) {
            Objects.toString(this.f20030c);
        }
        return i10;
    }

    public void e() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        Bundle bundle = this.f20030c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f20030c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f20028a.h(fragment, bundle2, false);
            this.f20030c.performCreate(bundle2);
            this.f20028a.c(this.f20030c, bundle2, false);
        }
    }

    public void f() {
        String str;
        if (this.f20030c.mFromLayout) {
            return;
        }
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        Bundle bundle = this.f20030c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = this.f20030c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f20030c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f20030c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.y0().c(this.f20030c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f20030c;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            str = fragment2.getResources().getResourceName(this.f20030c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f20030c.mContainerId) + " (" + str + ") for fragment " + this.f20030c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    S0.c.n(this.f20030c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f20030c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (this.f20030c.mView != null) {
            if (FragmentManager.Q0(3)) {
                Objects.toString(this.f20030c);
            }
            this.f20030c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f20030c;
            fragment4.mView.setTag(R0.b.f9915a, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f20030c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f20030c.mView.isAttachedToWindow()) {
                AbstractC2082d0.i0(this.f20030c.mView);
            } else {
                View view = this.f20030c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f20030c.performViewCreated();
            C2175z c2175z = this.f20028a;
            Fragment fragment6 = this.f20030c;
            c2175z.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f20030c.mView.getVisibility();
            this.f20030c.setPostOnViewCreatedAlpha(this.f20030c.mView.getAlpha());
            Fragment fragment7 = this.f20030c;
            if (fragment7.mContainer != null && visibility == 0) {
                View findFocus = fragment7.mView.findFocus();
                if (findFocus != null) {
                    this.f20030c.setFocusedView(findFocus);
                    if (FragmentManager.Q0(2)) {
                        findFocus.toString();
                        Objects.toString(this.f20030c);
                    }
                }
                this.f20030c.mView.setAlpha(0.0f);
            }
        }
        this.f20030c.mState = 2;
    }

    public void g() {
        Fragment f10;
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        Fragment fragment = this.f20030c;
        boolean z10 = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        if (z11) {
            Fragment fragment2 = this.f20030c;
            if (!fragment2.mBeingSaved) {
                this.f20029b.B(fragment2.mWho, null);
            }
        }
        if (!z11 && !this.f20029b.p().m(this.f20030c)) {
            String str = this.f20030c.mTargetWho;
            if (str != null && (f10 = this.f20029b.f(str)) != null && f10.mRetainInstance) {
                this.f20030c.mTarget = f10;
            }
            this.f20030c.mState = 0;
            return;
        }
        AbstractC2173x abstractC2173x = this.f20030c.mHost;
        if (abstractC2173x instanceof androidx.lifecycle.W) {
            z10 = this.f20029b.p().j();
        } else if (abstractC2173x.f() instanceof Activity) {
            z10 = true ^ ((Activity) abstractC2173x.f()).isChangingConfigurations();
        }
        if ((z11 && !this.f20030c.mBeingSaved) || z10) {
            this.f20029b.p().b(this.f20030c, false);
        }
        this.f20030c.performDestroy();
        this.f20028a.d(this.f20030c, false);
        for (K k10 : this.f20029b.k()) {
            if (k10 != null) {
                Fragment k11 = k10.k();
                if (this.f20030c.mWho.equals(k11.mTargetWho)) {
                    k11.mTarget = this.f20030c;
                    k11.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f20030c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f20029b.f(str2);
        }
        this.f20029b.s(this);
    }

    public void h() {
        View view;
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        Fragment fragment = this.f20030c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f20030c.performDestroyView();
        this.f20028a.n(this.f20030c, false);
        Fragment fragment2 = this.f20030c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f20030c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        this.f20030c.performDetach();
        this.f20028a.e(this.f20030c, false);
        Fragment fragment = this.f20030c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if ((!fragment.mRemoving || fragment.isInBackStack()) && !this.f20029b.p().m(this.f20030c)) {
            return;
        }
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        this.f20030c.initState();
    }

    public void j() {
        Fragment fragment = this.f20030c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.Q0(3)) {
                Objects.toString(this.f20030c);
            }
            Bundle bundle = this.f20030c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f20030c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f20030c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f20030c;
                fragment3.mView.setTag(R0.b.f9915a, fragment3);
                Fragment fragment4 = this.f20030c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f20030c.performViewCreated();
                C2175z c2175z = this.f20028a;
                Fragment fragment5 = this.f20030c;
                c2175z.m(fragment5, fragment5.mView, bundle2, false);
                this.f20030c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.f20030c;
    }

    public final boolean l(View view) {
        if (view == this.f20030c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f20030c.mView) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f20031d) {
            if (FragmentManager.Q0(2)) {
                Objects.toString(k());
                return;
            }
            return;
        }
        try {
            this.f20031d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                Fragment fragment = this.f20030c;
                int i10 = fragment.mState;
                if (d10 == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f20030c.mBeingSaved) {
                        if (FragmentManager.Q0(3)) {
                            Objects.toString(this.f20030c);
                        }
                        this.f20029b.p().b(this.f20030c, true);
                        this.f20029b.s(this);
                        if (FragmentManager.Q0(3)) {
                            Objects.toString(this.f20030c);
                        }
                        this.f20030c.initState();
                    }
                    Fragment fragment2 = this.f20030c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            X u10 = X.u(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f20030c.mHidden) {
                                u10.k(this);
                            } else {
                                u10.m(this);
                            }
                        }
                        Fragment fragment3 = this.f20030c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.O0(fragment3);
                        }
                        Fragment fragment4 = this.f20030c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f20030c.mChildFragmentManager.O();
                    }
                    this.f20031d = false;
                    return;
                }
                if (d10 <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f20029b.q(fragment.mWho) == null) {
                                this.f20029b.B(this.f20030c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f20030c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.Q0(3)) {
                                Objects.toString(this.f20030c);
                            }
                            Fragment fragment5 = this.f20030c;
                            if (fragment5.mBeingSaved) {
                                this.f20029b.B(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f20030c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                X.u(viewGroup2, fragment6.getParentFragmentManager()).l(this);
                            }
                            this.f20030c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                X.u(viewGroup3, fragment.getParentFragmentManager()).j(X.d.b.c(this.f20030c.mView.getVisibility()), this);
                            }
                            this.f20030c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f20031d = false;
            throw th2;
        }
    }

    public void n() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        this.f20030c.performPause();
        this.f20028a.f(this.f20030c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f20030c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f20030c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f20030c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f20030c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f20030c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f20030c.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.f20030c;
                fragment3.mTargetWho = fragmentState.f20017m;
                fragment3.mTargetRequestCode = fragmentState.f20018n;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f20030c.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = fragmentState.f20019o;
                }
            }
            Fragment fragment4 = this.f20030c;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    public void p() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        View focusedView = this.f20030c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            focusedView.requestFocus();
            if (FragmentManager.Q0(2)) {
                focusedView.toString();
                Objects.toString(this.f20030c);
                Objects.toString(this.f20030c.mView.findFocus());
            }
        }
        this.f20030c.setFocusedView(null);
        this.f20030c.performResume();
        this.f20028a.i(this.f20030c, false);
        this.f20029b.B(this.f20030c.mWho, null);
        Fragment fragment = this.f20030c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public Fragment.SavedState q() {
        if (this.f20030c.mState > -1) {
            return new Fragment.SavedState(r());
        }
        return null;
    }

    public Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f20030c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f20030c));
        if (this.f20030c.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.f20030c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f20028a.j(this.f20030c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f20030c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle w12 = this.f20030c.mChildFragmentManager.w1();
            if (!w12.isEmpty()) {
                bundle2.putBundle("childFragmentManager", w12);
            }
            if (this.f20030c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f20030c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f20030c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f20030c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void s() {
        if (this.f20030c.mView == null) {
            return;
        }
        if (FragmentManager.Q0(2)) {
            Objects.toString(this.f20030c);
            Objects.toString(this.f20030c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f20030c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f20030c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f20030c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f20030c.mSavedViewRegistryState = bundle;
    }

    public void t(int i10) {
        this.f20032e = i10;
    }

    public void u() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        this.f20030c.performStart();
        this.f20028a.k(this.f20030c, false);
    }

    public void v() {
        if (FragmentManager.Q0(3)) {
            Objects.toString(this.f20030c);
        }
        this.f20030c.performStop();
        this.f20028a.l(this.f20030c, false);
    }

    public K(C2175z c2175z, M m10, ClassLoader classLoader, AbstractC2172w abstractC2172w, Bundle bundle) {
        this.f20028a = c2175z;
        this.f20029b = m10;
        Fragment a10 = ((FragmentState) bundle.getParcelable("state")).a(abstractC2172w, classLoader);
        this.f20030c = a10;
        a10.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a10.setArguments(bundle2);
        if (FragmentManager.Q0(2)) {
            Objects.toString(a10);
        }
    }

    public K(C2175z c2175z, M m10, Fragment fragment, Bundle bundle) {
        this.f20028a = c2175z;
        this.f20029b = m10;
        this.f20030c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
