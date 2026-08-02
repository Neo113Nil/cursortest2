package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC2185j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class L extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    public final FragmentManager f20035c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20036d;

    /* renamed from: e, reason: collision with root package name */
    public N f20037e = null;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f20038f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f20039g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public Fragment f20040h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20041i;

    public L(FragmentManager fragmentManager, int i10) {
        this.f20035c = fragmentManager;
        this.f20036d = i10;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f20037e == null) {
            this.f20037e = this.f20035c.s();
        }
        while (this.f20038f.size() <= i10) {
            this.f20038f.add(null);
        }
        this.f20038f.set(i10, fragment.isAdded() ? this.f20035c.x1(fragment) : null);
        this.f20039g.set(i10, null);
        this.f20037e.n(fragment);
        if (fragment.equals(this.f20040h)) {
            this.f20040h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void c(ViewGroup viewGroup) {
        N n10 = this.f20037e;
        if (n10 != null) {
            if (!this.f20041i) {
                try {
                    this.f20041i = true;
                    n10.k();
                } finally {
                    this.f20041i = false;
                }
            }
            this.f20037e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i10) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f20039g.size() > i10 && (fragment = (Fragment) this.f20039g.get(i10)) != null) {
            return fragment;
        }
        if (this.f20037e == null) {
            this.f20037e = this.f20035c.s();
        }
        Fragment s10 = s(i10);
        if (this.f20038f.size() > i10 && (savedState = (Fragment.SavedState) this.f20038f.get(i10)) != null) {
            s10.setInitialSavedState(savedState);
        }
        while (this.f20039g.size() <= i10) {
            this.f20039g.add(null);
        }
        s10.setMenuVisibility(false);
        if (this.f20036d == 0) {
            s10.setUserVisibleHint(false);
        }
        this.f20039g.set(i10, s10);
        this.f20037e.b(viewGroup.getId(), s10);
        if (this.f20036d == 1) {
            this.f20037e.u(s10, AbstractC2185j.b.f20393d);
        }
        return s10;
    }

    @Override // androidx.viewpager.widget.a
    public boolean i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void l(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f20038f.clear();
            this.f20039g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f20038f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment z02 = this.f20035c.z0(bundle, str);
                    if (z02 != null) {
                        while (this.f20039g.size() <= parseInt) {
                            this.f20039g.add(null);
                        }
                        z02.setMenuVisibility(false);
                        this.f20039g.set(parseInt, z02);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable m() {
        Bundle bundle;
        if (this.f20038f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f20038f.size()];
            this.f20038f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f20039g.size(); i10++) {
            Fragment fragment = (Fragment) this.f20039g.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f20035c.n1(bundle, "f" + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void n(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f20040h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f20036d == 1) {
                    if (this.f20037e == null) {
                        this.f20037e = this.f20035c.s();
                    }
                    this.f20037e.u(this.f20040h, AbstractC2185j.b.f20393d);
                } else {
                    this.f20040h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f20036d == 1) {
                if (this.f20037e == null) {
                    this.f20037e = this.f20035c.s();
                }
                this.f20037e.u(fragment, AbstractC2185j.b.f20394e);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f20040h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void q(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment s(int i10);
}
