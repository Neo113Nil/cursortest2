package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.fbs;
import xsna.i5s;
import xsna.iut0;
import xsna.kas;
import xsna.xyt0;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public final class j {
    public final h a;
    public final k b;

    @NonNull
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    /* compiled from: FragmentStateManager.java */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public j(@NonNull h hVar, @NonNull k kVar, @NonNull Fragment fragment) {
        this.a = hVar;
        this.b = kVar;
        this.c = fragment;
    }

    public final void a() {
        Fragment fragment;
        View view;
        View view2;
        Fragment fragment2 = this.c;
        View view3 = fragment2.mContainer;
        while (true) {
            fragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment3 != null) {
                fragment = fragment3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment2.getParentFragment();
        if (fragment != null && !fragment.equals(parentFragment)) {
            int i = fragment2.mContainerId;
            FragmentStrictMode.a aVar = FragmentStrictMode.a;
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment2, fragment, i);
            FragmentStrictMode.c(wrongNestedHierarchyViolation);
            FragmentStrictMode.a a2 = FragmentStrictMode.a(fragment2);
            if (a2.a.contains(FragmentStrictMode.Flag.DETECT_WRONG_NESTED_HIERARCHY) && FragmentStrictMode.e(a2, fragment2.getClass(), WrongNestedHierarchyViolation.class)) {
                FragmentStrictMode.b(a2, wrongNestedHierarchyViolation);
            }
        }
        ArrayList<Fragment> arrayList = this.b.a;
        ViewGroup viewGroup = fragment2.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(fragment2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment4 = arrayList.get(indexOf);
                        if (fragment4.mContainer == viewGroup && (view = fragment4.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment5 = arrayList.get(i3);
                    if (fragment5.mContainer == viewGroup && (view2 = fragment5.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        fragment2.mContainer.addView(fragment2.mView, i2);
    }

    public final void b() {
        boolean P = FragmentManager.P(3);
        Fragment fragment = this.c;
        if (P) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        j jVar = null;
        k kVar = this.b;
        if (fragment2 != null) {
            j jVar2 = kVar.b.get(fragment2.mWho);
            if (jVar2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            jVar = jVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (jVar = kVar.b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(i5s.a(sb, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (jVar != null) {
            jVar.i();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.w;
        fragment.mParentFragment = fragmentManager.y;
        h hVar = this.a;
        hVar.g(fragment, false);
        fragment.performAttach();
        hVar.b(fragment, false);
    }

    public final int c() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.e;
        int i2 = b.a[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i = Math.max(this.e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, fragment.mState) : Math.min(i, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            i = Math.min(i, 4);
        }
        if (!fragment.mAdded) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            SpecialEffectsController i3 = SpecialEffectsController.i(viewGroup, fragment.getParentFragmentManager());
            i3.getClass();
            SpecialEffectsController.Operation f = i3.f(fragment);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = f != null ? f.b : null;
            SpecialEffectsController.Operation g = i3.g(fragment);
            r9 = g != null ? g.b : null;
            int i4 = lifecycleImpact == null ? -1 : SpecialEffectsController.c.$EnumSwitchMapping$0[lifecycleImpact.ordinal()];
            if (i4 != -1 && i4 != 1) {
                r9 = lifecycleImpact;
            }
        }
        if (r9 == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            i = Math.min(i, 6);
        } else if (r9 == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            i = Math.max(i, 3);
        } else if (fragment.mRemoving) {
            i = fragment.isInBackStack() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i = Math.min(i, 4);
        }
        if (fragment.mTransitioning) {
            i = Math.max(i, 3);
        }
        if (FragmentManager.P(2)) {
            Objects.toString(fragment);
        }
        return i;
    }

    public final void d() {
        String str;
        Fragment fragment = this.c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.P(3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(kas.a("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.x.b(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.a aVar = FragmentStrictMode.a;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
                    FragmentStrictMode.c(wrongFragmentContainerViolation);
                    FragmentStrictMode.a a2 = FragmentStrictMode.a(fragment);
                    if (a2.a.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.e(a2, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        FragmentStrictMode.b(a2, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.P(3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                View view = fragment.mView;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                view.requestApplyInsets();
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (FragmentManager.P(2)) {
                        findFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment b2;
        boolean P = FragmentManager.P(3);
        Fragment fragment = this.c;
        if (P) {
            Objects.toString(fragment);
        }
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        k kVar = this.b;
        if (z2 && !fragment.mBeingSaved) {
            kVar.i(null, fragment.mWho);
        }
        if (!z2) {
            i iVar = kVar.d;
            if (!((iVar.b.containsKey(fragment.mWho) && iVar.e) ? iVar.f : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (b2 = kVar.b(str)) != null && b2.mRetainInstance) {
                    fragment.mTarget = b2;
                }
                fragment.mState = 0;
                return;
            }
        }
        fbs<?> fbsVar = fragment.mHost;
        if (fbsVar instanceof xyt0) {
            z = kVar.d.f;
        } else {
            FragmentActivity fragmentActivity = fbsVar.c;
            if (fragmentActivity != null) {
                z = true ^ fragmentActivity.isChangingConfigurations();
            }
        }
        if ((z2 && !fragment.mBeingSaved) || z) {
            i iVar2 = kVar.d;
            iVar2.getClass();
            if (FragmentManager.P(3)) {
                Objects.toString(fragment);
            }
            iVar2.j(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.a.d(fragment, false);
        Iterator it = kVar.d().iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar != null) {
                Fragment fragment2 = jVar.c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = kVar.b(str2);
        }
        kVar.h(this);
    }

    public final void f() {
        View view;
        boolean P = FragmentManager.P(3);
        Fragment fragment = this.c;
        if (P) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean P = FragmentManager.P(3);
        Fragment fragment = this.c;
        if (P) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            i iVar = this.b.d;
            if (!((iVar.b.containsKey(fragment.mWho) && iVar.e) ? iVar.f : true)) {
                return;
            }
        }
        if (FragmentManager.P(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.P(3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (FragmentManager.P(2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int c = c();
                int i = fragment.mState;
                k kVar = this.b;
                if (c == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.P(3)) {
                            Objects.toString(fragment);
                        }
                        i iVar = kVar.d;
                        iVar.getClass();
                        if (FragmentManager.P(3)) {
                            Objects.toString(fragment);
                        }
                        iVar.j(fragment.mWho, true);
                        kVar.h(this);
                        if (FragmentManager.P(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            SpecialEffectsController i2 = SpecialEffectsController.i(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (FragmentManager.P(2)) {
                                    i2.getClass();
                                    Objects.toString(fragment);
                                }
                                i2.d(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            } else {
                                if (FragmentManager.P(2)) {
                                    i2.getClass();
                                    Objects.toString(fragment);
                                }
                                i2.d(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.Q(fragment)) {
                            fragmentManager.G = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.q();
                    }
                    this.d = false;
                    return;
                }
                h hVar = this.a;
                if (c <= i) {
                    switch (i - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (kVar.c.get(fragment.mWho) == null) {
                                    kVar.i(l(), fragment.mWho);
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.P(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                kVar.i(l(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                SpecialEffectsController i3 = SpecialEffectsController.i(viewGroup2, fragment.getParentFragmentManager());
                                if (FragmentManager.P(2)) {
                                    i3.getClass();
                                    Objects.toString(fragment);
                                }
                                i3.d(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.P(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            hVar.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.P(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            hVar.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (FragmentManager.P(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle = fragment.mSavedFragmentState;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                hVar.h(fragment, bundle2, false);
                                fragment.performCreate(bundle2);
                                hVar.c(fragment, bundle2, false);
                                break;
                            } else {
                                fragment.mState = 1;
                                fragment.restoreChildFragmentState();
                                break;
                            }
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (FragmentManager.P(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            fragment.performActivityCreated(bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                            hVar.a(fragment, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController i4 = SpecialEffectsController.i(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                SpecialEffectsController.Operation.State.Companion.getClass();
                                SpecialEffectsController.Operation.State b2 = SpecialEffectsController.Operation.State.a.b(visibility);
                                if (FragmentManager.P(2)) {
                                    i4.getClass();
                                    Objects.toString(fragment);
                                }
                                i4.d(b2, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.P(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            hVar.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void j(@NonNull ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                fragment.mTargetWho = fragmentState.n;
                fragment.mTargetRequestCode = fragmentState.o;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = fragmentState.p;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
        }
    }

    public final void k() {
        boolean P = FragmentManager.P(3);
        Fragment fragment = this.c;
        if (P) {
            Objects.toString(fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fragment.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.mView) {
                    }
                }
            }
            focusedView.requestFocus();
            if (FragmentManager.P(2)) {
                focusedView.toString();
                Objects.toString(fragment);
                Objects.toString(fragment.mView.findFocus());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.a.i(fragment, false);
        this.b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @NonNull
    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle g0 = fragment.mChildFragmentManager.g0();
            if (!g0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", g0);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.P(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.g.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public j(@NonNull h hVar, @NonNull k kVar, @NonNull ClassLoader classLoader, @NonNull f fVar, @NonNull Bundle bundle) {
        this.a = hVar;
        this.b = kVar;
        Fragment a2 = ((FragmentState) bundle.getParcelable("state")).a(fVar, classLoader);
        this.c = a2;
        a2.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.setArguments(bundle2);
        if (FragmentManager.P(2)) {
            Objects.toString(a2);
        }
    }

    public j(@NonNull h hVar, @NonNull k kVar, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        this.a = hVar;
        this.b = kVar;
        this.c = fragment;
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

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes12.dex */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.b;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view2.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
