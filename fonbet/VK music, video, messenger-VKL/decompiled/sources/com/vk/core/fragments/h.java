package com.vk.core.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.impl.support.ParentSupportFragment;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import xsna.brm0;
import xsna.j9x;
import xsna.k9x;
import xsna.lhg;
import xsna.s1q0;
import xsna.vbs;

/* compiled from: FragmentStatePagerAdapterImpl.kt */
/* loaded from: classes17.dex */
public abstract class h extends s1q0 {
    public final vbs f;
    public final boolean g;
    public final ArrayList<Parcelable> h = new ArrayList<>();
    public final ArrayList<FragmentImpl> i = new ArrayList<>();
    public FragmentImpl j;

    public h(vbs vbsVar, boolean z) {
        this.f = vbsVar;
        this.g = z;
    }

    public static void e(FragmentImpl fragmentImpl, boolean z) {
        if (fragmentImpl != null) {
            fragmentImpl.setMenuVisibility(z);
        }
        if (fragmentImpl != null) {
            fragmentImpl.setUserVisibleHint(z);
        }
    }

    public final FragmentImpl b(int i) {
        ArrayList<FragmentImpl> arrayList = this.i;
        if (arrayList.size() > i) {
            return arrayList.get(i);
        }
        return null;
    }

    public abstract FragmentImpl c(int i);

    public final void d(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ArrayList<Parcelable> arrayList;
        FragmentImpl fragmentImpl = obj instanceof FragmentImpl ? (FragmentImpl) obj : null;
        if (fragmentImpl == null) {
            return;
        }
        vbs vbsVar = this.f;
        if (vbsVar.f == null) {
            vbsVar.c();
        }
        while (true) {
            arrayList = this.h;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i, fragmentImpl.isAdded() ? vbsVar.a.h0(fragmentImpl) : null);
        this.i.set(i, null);
        vbsVar.k(fragmentImpl);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void finishUpdate(ViewGroup viewGroup) {
        vbs vbsVar = this.f;
        if (vbsVar.f != null) {
            vbsVar.d();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Parcelable parcelable;
        FragmentImpl fragmentImpl;
        ArrayList<FragmentImpl> arrayList = this.i;
        if (arrayList.size() > i && (fragmentImpl = arrayList.get(i)) != null) {
            if (fragmentImpl.equals(c(i)) || !this.g) {
                return fragmentImpl;
            }
            destroyItem(viewGroup, i, (Object) fragmentImpl);
        }
        vbs vbsVar = this.f;
        if (vbsVar.f == null) {
            vbsVar.c();
        }
        FragmentImpl c = c(i);
        ArrayList<Parcelable> arrayList2 = this.h;
        if (arrayList2.size() > i && (parcelable = arrayList2.get(i)) != null) {
            try {
                c.En(parcelable);
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.a(e);
            }
        }
        while (arrayList.size() <= i) {
            arrayList.add(null);
        }
        c.setMenuVisibility(false);
        try {
            c.setUserVisibleHint(false);
        } catch (Exception unused) {
            c.setInitialSavedState(null);
        }
        arrayList.set(i, c);
        int id = viewGroup.getId();
        Serializer.c<FragmentEntry> cVar = FragmentEntry.CREATOR;
        vbsVar.a(id, c, FragmentEntry.a.b(c), false);
        return c;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return ((FragmentImpl) obj).getView() == view;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040 A[SYNTHETIC] */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        ParentSupportFragment parentSupportFragment;
        FragmentImpl fragmentImpl;
        Fragment L;
        if (parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(classLoader);
        Parcelable[] parcelableArray = bundle.getParcelableArray("states");
        ArrayList<Parcelable> arrayList = this.h;
        arrayList.clear();
        ArrayList<FragmentImpl> arrayList2 = this.i;
        arrayList2.clear();
        if (parcelableArray != null) {
            j9x it = new k9x(0, parcelableArray.length - 1, 1).iterator();
            while (it.d) {
                arrayList.add((Fragment.SavedState) parcelableArray[it.nextInt()]);
            }
        }
        for (String str : bundle.keySet()) {
            if (brm0.B(str, InneractiveMediationDefs.GENDER_FEMALE, false)) {
                int parseInt = Integer.parseInt(str.substring(1));
                vbs vbsVar = this.f;
                vbsVar.getClass();
                try {
                    L = vbsVar.a.L(bundle, str);
                } catch (IllegalStateException unused) {
                }
                if (L instanceof ParentSupportFragment) {
                    parentSupportFragment = (ParentSupportFragment) L;
                    fragmentImpl = (FragmentImpl) parentSupportFragment;
                    if (fragmentImpl == null) {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        fragmentImpl.setMenuVisibility(false);
                        arrayList2.set(parseInt, fragmentImpl);
                    }
                }
                parentSupportFragment = null;
                fragmentImpl = (FragmentImpl) parentSupportFragment;
                if (fragmentImpl == null) {
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Bundle bundle;
        ArrayList<Parcelable> arrayList = this.h;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        ArrayList<FragmentImpl> arrayList2 = this.i;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            FragmentImpl fragmentImpl = arrayList2.get(i);
            if (fragmentImpl != null && fragmentImpl.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f.a.b0(bundle, lhg.a(i, InneractiveMediationDefs.GENDER_FEMALE), fragmentImpl);
            }
        }
        return bundle;
    }

    @Override // xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment parentFragment;
        FragmentImpl fragmentImpl;
        FragmentImpl fragmentImpl2 = obj instanceof FragmentImpl ? (FragmentImpl) obj : null;
        if (fragmentImpl2 == null || (parentFragment = fragmentImpl2.getParentFragment()) == null || !parentFragment.getUserVisibleHint() || fragmentImpl2 == (fragmentImpl = this.j)) {
            return;
        }
        e(fragmentImpl, false);
        e(fragmentImpl2, true);
        this.j = fragmentImpl2;
        super.setPrimaryItem(viewGroup, i, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
