package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.aq8;
import defpackage.bq8;
import defpackage.bsk;
import defpackage.fc6;
import defpackage.fp4;
import defpackage.jxh;
import defpackage.mml;
import defpackage.mz1;
import defpackage.nml;
import defpackage.no8;
import defpackage.ttk;
import defpackage.wt3;
import defpackage.xo8;
import defpackage.y00;
import defpackage.zp8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u {
    public final fp4 a;
    public final v b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public u(fp4 fp4Var, v vVar, ClassLoader classLoader, xo8 xo8Var, Bundle bundle) {
        this.a = fp4Var;
        this.b = vVar;
        Fragment a = ((FragmentState) bundle.getParcelable("state")).a(xo8Var);
        this.c = a;
        a.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a.setArguments(bundle2);
        if (s.O(2)) {
            Objects.toString(a);
        }
    }

    public final void a() {
        View view;
        View view2;
        Fragment fragment = this.c;
        Fragment G = s.G(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (G != null && !G.equals(parentFragment)) {
            int i = fragment.mContainerId;
            aq8 aq8Var = bq8.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(G);
            sb.append(" via container with ID ");
            nml nmlVar = new nml(fragment, fc6.h(i, " without using parent's childFragmentManager", sb));
            bq8.c(nmlVar);
            aq8 a = bq8.a(fragment);
            if (a.a.contains(zp8.e) && bq8.e(a, fragment.getClass(), nml.class)) {
                bq8.b(a, nmlVar);
            }
        }
        ArrayList arrayList = this.b.a;
        ViewGroup viewGroup = fragment.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(fragment);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i2);
    }

    public final void b() {
        boolean O = s.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        u uVar = null;
        v vVar = this.b;
        if (fragment2 != null) {
            u uVar2 = (u) vVar.b.get(fragment2.mWho);
            if (uVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            uVar = uVar2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (uVar = (u) vVar.b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                a70.r(mz1.o(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (uVar != null) {
            uVar.i();
        }
        s sVar = fragment.mFragmentManager;
        fragment.mHost = sVar.x;
        fragment.mParentFragment = sVar.z;
        fp4 fp4Var = this.a;
        fp4Var.t(fragment, false);
        fragment.performAttach();
        fp4Var.o(fragment, false);
    }

    public final int c() {
        Fragment fragment = this.c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i = this.e;
        int ordinal = fragment.mMaxState.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (fragment.mFromLayout) {
            boolean z = fragment.mInLayout;
            int i2 = this.e;
            if (z) {
                i = Math.max(i2, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i2 < 4 ? Math.min(i, fragment.mState) : Math.min(i, 1);
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
            h j = h.j(viewGroup, fragment.getParentFragmentManager());
            y g = j.g(fragment);
            int i3 = g != null ? g.b : 0;
            y h = j.h(fragment);
            r3 = h != null ? h.b : 0;
            int i4 = i3 == 0 ? -1 : jxh.a[wt3.C(i3)];
            if (i4 != -1 && i4 != 1) {
                r3 = i3;
            }
        }
        if (r3 == 2) {
            i = Math.min(i, 6);
        } else if (r3 == 3) {
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
        if (s.O(2)) {
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
        int i = 3;
        if (s.O(3)) {
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
            int i2 = fragment.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    a70.p(fc6.m("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.y.b(i2);
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
                    aq8 aq8Var = bq8.a;
                    mml mmlVar = new mml(fragment, viewGroup);
                    bq8.c(mmlVar);
                    aq8 a = bq8.a(fragment);
                    if (a.a.contains(zp8.i) && bq8.e(a, fragment.getClass(), mml.class)) {
                        bq8.b(a, mmlVar);
                    }
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (s.O(3)) {
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
            boolean isAttachedToWindow = fragment.mView.isAttachedToWindow();
            View view = fragment.mView;
            if (isAttachedToWindow) {
                WeakHashMap weakHashMap = bsk.a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new y00(view, i));
            }
            fragment.performViewCreated();
            this.a.z(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (s.O(2)) {
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
        Fragment b;
        boolean O = s.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        v vVar = this.b;
        if (z2 && !fragment.mBeingSaved) {
            vVar.i(null, fragment.mWho);
        }
        if (!z2) {
            t tVar = vVar.d;
            if (!((tVar.b.containsKey(fragment.mWho) && tVar.e) ? tVar.f : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (b = vVar.b(str)) != null && b.mRetainInstance) {
                    fragment.mTarget = b;
                }
                fragment.mState = 0;
                return;
            }
        }
        no8 no8Var = fragment.mHost;
        if (no8Var instanceof ttk) {
            z = vVar.d.f;
        } else {
            Context context = no8Var.b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z2 && !fragment.mBeingSaved) || z) {
            t tVar2 = vVar.d;
            if (s.O(3)) {
                tVar2.getClass();
                Objects.toString(fragment);
            }
            tVar2.g(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.a.q(fragment, false);
        Iterator it = vVar.d().iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar != null) {
                Fragment fragment2 = uVar.c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = vVar.b(str2);
        }
        vVar.h(this);
    }

    public final void f() {
        View view;
        boolean O = s.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.a.A(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.j(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean O = s.O(3);
        Fragment fragment = this.c;
        if (O) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.a.r(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            t tVar = this.b.d;
            if (!((tVar.b.containsKey(fragment.mWho) && tVar.e) ? tVar.f : true)) {
                return;
            }
        }
        if (s.O(3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (s.O(3)) {
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
                this.a.z(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x017b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (s.O(2)) {
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
                int i2 = 3;
                v vVar = this.b;
                if (c == i) {
                    if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (s.O(3)) {
                            Objects.toString(fragment);
                        }
                        t tVar = vVar.d;
                        if (s.O(3)) {
                            tVar.getClass();
                            Objects.toString(fragment);
                        }
                        tVar.g(fragment.mWho, true);
                        vVar.h(this);
                        if (s.O(3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            h j = h.j(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (s.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j.d(3, 1, this);
                            } else {
                                if (s.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j.d(2, 1, this);
                            }
                        }
                        s sVar = fragment.mFragmentManager;
                        if (sVar != null && fragment.mAdded && s.P(fragment)) {
                            sVar.H = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    this.d = false;
                    return;
                }
                fp4 fp4Var = this.a;
                if (c <= i) {
                    switch (i - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) vVar.c.get(fragment.mWho)) == null) {
                                    vVar.i(l(), fragment.mWho);
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
                            if (s.O(3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                vVar.i(l(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                h j2 = h.j(viewGroup2, fragment.getParentFragmentManager());
                                if (s.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j2.d(1, 3, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (s.O(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            fp4Var.y(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (s.O(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            fp4Var.s(fragment, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (s.O(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle = fragment.mSavedFragmentState;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                fp4Var.u(fragment, false);
                                fragment.performCreate(bundle2);
                                fp4Var.p(fragment, false);
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
                            if (s.O(3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            fragment.performActivityCreated(bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                            fp4Var.n(fragment, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                h j3 = h.j(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (s.O(2)) {
                                    Objects.toString(fragment);
                                }
                                j3.d(i2, 2, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (s.O(3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            fp4Var.x(fragment, false);
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

    public final void j(ClassLoader classLoader) {
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
                fragment.mTargetWho = fragmentState.m;
                fragment.mTargetRequestCode = fragmentState.n;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = fragmentState.o;
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
        boolean O = s.O(3);
        Fragment fragment = this.c;
        if (O) {
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
            if (s.O(2)) {
                focusedView.toString();
                Objects.toString(fragment);
                Objects.toString(fragment.mView.findFocus());
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.a.v(fragment, false);
        this.b.i(null, fragment.mWho);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
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
            this.a.w(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle d0 = fragment.mChildFragmentManager.d0();
            if (!d0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", d0);
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
        if (s.O(2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public u(fp4 fp4Var, v vVar, Fragment fragment) {
        this.a = fp4Var;
        this.b = vVar;
        this.c = fragment;
    }

    public u(fp4 fp4Var, v vVar, Fragment fragment, Bundle bundle) {
        this.a = fp4Var;
        this.b = vVar;
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
}
