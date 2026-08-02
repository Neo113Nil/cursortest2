package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f2039a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f2040b;

    /* renamed from: c, reason: collision with root package name */
    public final Fragment f2041c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2042d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f2043e = -1;

    public p1(q0 q0Var, q1 q1Var, Fragment fragment) {
        this.f2039a = q0Var;
        this.f2040b = q1Var;
        this.f2041c = fragment;
    }

    public final void a() {
        boolean L = j1.L(3);
        Fragment fragment = this.f2041c;
        if (L) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f2039a.a(fragment, false);
    }

    public final void b() {
        Fragment expectedParentFragment;
        View view;
        View view2;
        Fragment fragment = this.f2041c;
        View view3 = fragment.mContainer;
        while (true) {
            expectedParentFragment = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            Fragment fragment2 = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment2 != null) {
                expectedParentFragment = fragment2;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        Fragment parentFragment = fragment.getParentFragment();
        if (expectedParentFragment != null && !expectedParentFragment.equals(parentFragment)) {
            int i5 = fragment.mContainerId;
            o1.c cVar = o1.d.f21091a;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment);
            sb2.append(" within the view of parent fragment ");
            sb2.append(expectedParentFragment);
            sb2.append(" via container with ID ");
            o1.o oVar = new o1.o(fragment, r4.k.n(sb2, i5, " without using parent's childFragmentManager"));
            o1.d.c(oVar);
            o1.c a7 = o1.d.a(fragment);
            if (a7.f21089a.contains(o1.b.f21083e) && o1.d.e(a7, fragment.getClass(), o1.o.class)) {
                o1.d.b(a7, oVar);
            }
        }
        ArrayList arrayList = this.f2040b.f2049a;
        ViewGroup viewGroup = fragment.mContainer;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(fragment);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment3 = (Fragment) arrayList.get(indexOf);
                        if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment4 = (Fragment) arrayList.get(i11);
                    if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i10);
    }

    public final void c() {
        boolean L = j1.L(3);
        Fragment fragment = this.f2041c;
        if (L) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        p1 p1Var = null;
        q1 q1Var = this.f2040b;
        if (fragment2 != null) {
            p1 p1Var2 = (p1) q1Var.f2050b.get(fragment2.mWho);
            if (p1Var2 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            p1Var = p1Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (p1Var = (p1) q1Var.f2050b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(d9.e.l(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (p1Var != null) {
            p1Var.k();
        }
        j1 j1Var = fragment.mFragmentManager;
        fragment.mHost = j1Var.f1983w;
        fragment.mParentFragment = j1Var.f1985y;
        q0 q0Var = this.f2039a;
        q0Var.g(fragment, false);
        fragment.performAttach();
        q0Var.b(fragment, false);
    }

    public final int d() {
        Fragment fragment = this.f2041c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i5 = this.f2043e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i5 = Math.min(i5, 0);
        } else if (ordinal == 2) {
            i5 = Math.min(i5, 1);
        } else if (ordinal == 3) {
            i5 = Math.min(i5, 5);
        } else if (ordinal != 4) {
            i5 = Math.min(i5, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i5 = Math.max(this.f2043e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i5 = Math.min(i5, 2);
                }
            } else {
                i5 = this.f2043e < 4 ? Math.min(i5, fragment.mState) : Math.min(i5, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            i5 = Math.min(i5, 4);
        }
        if (!fragment.mAdded) {
            i5 = Math.min(i5, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            k2 j = k2.j(viewGroup, fragment.getParentFragmentManager());
            Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
            Intrinsics.checkNotNullExpressionValue(fragment, "fragmentStateManager.fragment");
            f2 g10 = j.g(fragment);
            g2 g2Var = g10 != null ? g10.f1904b : null;
            f2 h10 = j.h(fragment);
            r9 = h10 != null ? h10.f1904b : null;
            int i10 = g2Var == null ? -1 : j2.$EnumSwitchMapping$0[g2Var.ordinal()];
            if (i10 != -1 && i10 != 1) {
                r9 = g2Var;
            }
        }
        if (r9 == g2.f1926b) {
            i5 = Math.min(i5, 6);
        } else if (r9 == g2.f1927c) {
            i5 = Math.max(i5, 3);
        } else if (fragment.mRemoving) {
            i5 = fragment.isInBackStack() ? Math.min(i5, 1) : Math.min(i5, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i5 = Math.min(i5, 4);
        }
        if (fragment.mTransitioning) {
            i5 = Math.max(i5, 3);
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i5 + " for " + fragment);
        }
        return i5;
    }

    public final void e() {
        boolean L = j1.L(3);
        Fragment fragment = this.f2041c;
        if (L) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            q0 q0Var = this.f2039a;
            q0Var.h(fragment, false);
            fragment.performCreate(bundle2);
            q0Var.c(fragment, false);
        }
    }

    public final void f() {
        String str;
        Fragment fragment = this.f2041c;
        if (fragment.mFromLayout) {
            return;
        }
        if (j1.L(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup container = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            container = viewGroup;
        } else {
            int i5 = fragment.mContainerId;
            if (i5 != 0) {
                if (i5 == -1) {
                    throw new IllegalArgumentException(androidx.appcompat.widget.c1.l("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                container = (ViewGroup) fragment.mFragmentManager.f1984x.e(i5);
                if (container == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            str = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                    }
                } else if (!(container instanceof FragmentContainerView)) {
                    o1.c cVar = o1.d.f21091a;
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.checkNotNullParameter(container, "container");
                    o1.n nVar = new o1.n(fragment, "Attempting to add fragment " + fragment + " to container " + container + " which is not a FragmentContainerView");
                    o1.d.c(nVar);
                    o1.c a7 = o1.d.a(fragment);
                    if (a7.f21089a.contains(o1.b.f21087i) && o1.d.e(a7, fragment.getClass(), o1.n.class)) {
                        o1.d.b(a7, nVar);
                    }
                }
            }
        }
        fragment.mContainer = container;
        fragment.performCreateView(performGetLayoutInflater, container, bundle2);
        if (fragment.mView != null) {
            if (j1.L(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (container != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            if (fragment.mView.isAttachedToWindow()) {
                View view = fragment.mView;
                WeakHashMap weakHashMap = androidx.core.view.z0.f1413a;
                androidx.core.view.o0.c(view);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new o1(view2));
            }
            fragment.performViewCreated();
            this.f2039a.m(fragment, fragment.mView, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (j1.L(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment b10;
        boolean L = j1.L(3);
        Fragment fragment = this.f2041c;
        if (L) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean z5 = true;
        boolean z7 = fragment.mRemoving && !fragment.isInBackStack();
        q1 q1Var = this.f2040b;
        if (z7 && !fragment.mBeingSaved) {
            q1Var.i(null, fragment.mWho);
        }
        if (!z7) {
            m1 m1Var = q1Var.f2052d;
            if (!((m1Var.f2003b.containsKey(fragment.mWho) && m1Var.f2006e) ? m1Var.f2007f : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (b10 = q1Var.b(str)) != null && b10.mRetainInstance) {
                    fragment.mTarget = b10;
                }
                fragment.mState = 0;
                return;
            }
        }
        t0 t0Var = fragment.mHost;
        if (t0Var instanceof androidx.lifecycle.p1) {
            z5 = q1Var.f2052d.f2007f;
        } else {
            p0 p0Var = t0Var.f2087b;
            if (androidx.appcompat.widget.c1.v(p0Var)) {
                z5 = true ^ p0Var.isChangingConfigurations();
            }
        }
        if ((z7 && !fragment.mBeingSaved) || z5) {
            q1Var.f2052d.f(fragment, false);
        }
        fragment.performDestroy();
        this.f2039a.d(fragment, false);
        Iterator it = q1Var.d().iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if (p1Var != null) {
                Fragment fragment2 = p1Var.f2041c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = q1Var.b(str2);
        }
        q1Var.h(this);
    }

    public final void h() {
        View view;
        boolean L = j1.L(3);
        Fragment fragment = this.f2041c;
        if (L) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f2039a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean L = j1.L(3);
        Fragment fragment = this.f2041c;
        if (L) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f2039a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            m1 m1Var = this.f2040b.f2052d;
            if (!((m1Var.f2003b.containsKey(fragment.mWho) && m1Var.f2006e) ? m1Var.f2007f : true)) {
                return;
            }
        }
        if (j1.L(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f2041c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (j1.L(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
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
                this.f2039a.m(fragment, fragment.mView, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x019f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z5 = this.f2042d;
        Fragment fragment = this.f2041c;
        if (z5) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f2042d = true;
            boolean z7 = false;
            while (true) {
                int d10 = d();
                int i5 = fragment.mState;
                i2 i2Var = i2.f1958b;
                i2 i2Var2 = i2.f1959c;
                q1 q1Var = this.f2040b;
                if (d10 == i5) {
                    if (!z7 && i5 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (j1.L(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        q1Var.f2052d.f(fragment, true);
                        q1Var.h(this);
                        if (j1.L(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            k2 j = k2.j(viewGroup, fragment.getParentFragmentManager());
                            boolean z10 = fragment.mHidden;
                            g2 g2Var = g2.f1925a;
                            if (z10) {
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (j1.L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                j.d(i2Var2, g2Var, this);
                            } else {
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (j1.L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                j.d(i2Var, g2Var, this);
                            }
                        }
                        j1 j1Var = fragment.mFragmentManager;
                        if (j1Var != null && fragment.mAdded && j1.M(fragment)) {
                            j1Var.G = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    this.f2042d = false;
                    return;
                }
                q0 q0Var = this.f2039a;
                if (d10 <= i5) {
                    switch (i5 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) q1Var.f2051c.get(fragment.mWho)) == null) {
                                    q1Var.i(n(), fragment.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (j1.L(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                q1Var.i(n(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                o();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                k2 j6 = k2.j(viewGroup2, fragment.getParentFragmentManager());
                                Intrinsics.checkNotNullParameter(this, "fragmentStateManager");
                                if (j1.L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                j6.d(i2.f1957a, g2.f1927c, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (j1.L(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            q0Var.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (j1.L(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            q0Var.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i5 + 1) {
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
                                k2 j10 = k2.j(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility != 0) {
                                    if (visibility == 4) {
                                        i2Var = i2.f1960d;
                                    } else {
                                        if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        i2Var = i2Var2;
                                    }
                                }
                                j10.e(i2Var, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (j1.L(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            q0Var.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z7 = true;
            }
        } catch (Throwable th2) {
            this.f2042d = false;
            throw th2;
        }
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f2041c;
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
                fragment.mTargetWho = fragmentState.f1856m;
                fragment.mTargetRequestCode = fragmentState.f1857n;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = fragmentState.f1858o;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e7);
        }
    }

    public final void m() {
        boolean L = j1.L(3);
        Fragment fragment = this.f2041c;
        if (L) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            if (focusedView != fragment.mView) {
                for (ViewParent parent = focusedView.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != fragment.mView) {
                    }
                }
            }
            boolean requestFocus = focusedView.requestFocus();
            if (j1.L(2)) {
                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(fragment);
                sb2.append(" resulting in focused view ");
                sb2.append(fragment.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f2039a.i(fragment, false);
        this.f2040b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f2041c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2039a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle Y = fragment.mChildFragmentManager.Y();
            if (!Y.isEmpty()) {
                bundle2.putBundle("childFragmentManager", Y);
            }
            if (fragment.mView != null) {
                o();
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

    public final void o() {
        Fragment fragment = this.f2041c;
        if (fragment.mView == null) {
            return;
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f1876f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public p1(q0 q0Var, q1 q1Var, ClassLoader classLoader, b1 b1Var, Bundle bundle) {
        this.f2039a = q0Var;
        this.f2040b = q1Var;
        Fragment a7 = ((FragmentState) bundle.getParcelable("state")).a(b1Var);
        this.f2041c = a7;
        a7.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a7.setArguments(bundle2);
        if (j1.L(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a7);
        }
    }

    public p1(q0 q0Var, q1 q1Var, Fragment fragment, Bundle bundle) {
        this.f2039a = q0Var;
        this.f2040b = q1Var;
        this.f2041c = fragment;
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
