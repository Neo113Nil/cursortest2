package com.vk.newsfeed.impl.explore;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.lifecycle.f;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.fragments.h;
import com.vk.newsfeed.common.util.k;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.utils.Logger;
import xsna.j5g;
import xsna.pds;
import xsna.t2l;
import xsna.vbs;

/* compiled from: ExploreTabAdapter.kt */
/* loaded from: classes4.dex */
public final class a extends h {
    public final InterfaceC1379a k;
    public FragmentImpl l;
    public int m;
    public final ArrayList<FragmentImpl> n;

    /* compiled from: ExploreTabAdapter.kt */
    /* renamed from: com.vk.newsfeed.impl.explore.a$a, reason: collision with other inner class name */
    public interface InterfaceC1379a {
        String a(int i);

        void d(Bundle bundle);

        String e(int i);

        Bundle r();
    }

    public a(vbs vbsVar, InterfaceC1379a interfaceC1379a) {
        super(vbsVar, true);
        this.k = interfaceC1379a;
        this.m = -1;
        this.n = new ArrayList<>();
    }

    @Override // com.vk.core.fragments.h
    public final FragmentImpl c(int i) {
        return this.n.get(i);
    }

    public final FragmentImpl g(int i) {
        return (FragmentImpl) j5g.b0(i, this.n);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.n.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.k.a(i);
    }

    public final void h(List<? extends FragmentImpl> list) {
        ArrayList<FragmentImpl> arrayList = this.n;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public final void j(int i, int i2, String str) {
        if (i == i2) {
            return;
        }
        String str2 = k.a;
        InterfaceC1379a interfaceC1379a = this.k;
        k.d(i2, i, str, interfaceC1379a.e(i2), interfaceC1379a.e(i));
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        super.restoreState(parcelable, classLoader);
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.k.d(bundle.getBundle("titles"));
            ArrayList<FragmentImpl> arrayList = this.n;
            arrayList.clear();
            int i = bundle.getInt("count");
            for (int i2 = 0; i2 < i; i2++) {
                FragmentImpl b = b(i2);
                if (b == null) {
                    FragmentEntry fragmentEntry = (FragmentEntry) bundle.getParcelable(Logger.METHOD_E + i2);
                    b = fragmentEntry != null ? fragmentEntry.Ab() : null;
                }
                if (b != null) {
                    arrayList.add(b);
                }
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.vk.core.fragments.h, androidx.viewpager.widget.PagerAdapter
    public final Parcelable saveState() {
        Parcelable saveState = super.saveState();
        Bundle bundle = saveState != null ? (Bundle) saveState : new Bundle();
        ArrayList<FragmentImpl> arrayList = this.n;
        bundle.putInt("count", arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentEntry Kn = arrayList.get(i).Kn();
            if (Kn != null) {
                bundle.putParcelable(Logger.METHOD_E + i, Kn);
            }
        }
        bundle.putBundle("titles", this.k.r());
        return bundle;
    }

    @Override // com.vk.core.fragments.h, xsna.s1q0, androidx.viewpager.widget.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        int i2 = this.m;
        f fVar = this.l;
        FragmentImpl fragmentImpl = obj instanceof FragmentImpl ? (FragmentImpl) obj : null;
        this.l = fragmentImpl;
        this.m = i;
        if (i2 != i) {
            if (fVar instanceof pds) {
                ((pds) fVar).J0();
            }
            if (fragmentImpl instanceof pds) {
                ((pds) fragmentImpl).i5(new t2l(fragmentImpl, 7));
            }
        }
        j(i, i2, "swipe");
    }
}
