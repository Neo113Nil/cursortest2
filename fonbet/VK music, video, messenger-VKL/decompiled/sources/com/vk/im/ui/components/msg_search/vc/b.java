package com.vk.im.ui.components.msg_search.vc;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dialogssearch.impl.DialogsSearchFragment;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.components.msg_search.vc.d;
import com.vk.lists.DefaultErrorView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.b0i0;
import xsna.d3m;
import xsna.dcf0;
import xsna.drm0;
import xsna.e43;
import xsna.f4m;
import xsna.g2v;
import xsna.g6o0;
import xsna.hu90;
import xsna.hy30;
import xsna.j5g;
import xsna.lib;
import xsna.lvm;
import xsna.mkr0;
import xsna.msy;
import xsna.q5u0;
import xsna.rwh0;
import xsna.rx30;
import xsna.uw30;
import xsna.ux30;
import xsna.uyv;
import xsna.vyv;
import xsna.wyv;
import xsna.x4u;

/* compiled from: MultiTabsMsgSearchPagerAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends ux30 {
    public final boolean f;
    public final boolean g;
    public final g6o0 h;
    public final Object i;
    public uw30 j;
    public hu90 k;
    public lib l;
    public boolean m;

    public b(List<rwh0> list, mkr0 mkr0Var, LayoutInflater layoutInflater, boolean z, boolean z2, g6o0 g6o0Var) {
        super(list, mkr0Var, layoutInflater);
        this.f = z;
        this.g = z2;
        this.h = g6o0Var;
        this.i = msy.a(LazyThreadSafetyMode.NONE, new x4u(layoutInflater, 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ux30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(hy30 hy30Var) {
        lib libVar;
        rwh0 rwh0Var;
        rwh0 rwh0Var2;
        ArrayList a;
        ArrayList a2;
        ArrayList a3;
        int i;
        if (this.e.isEmpty()) {
            return;
        }
        List<rwh0> list = this.b;
        rwh0 rwh0Var3 = (rwh0) j5g.b0(0, list);
        ?? r5 = this.i;
        if (rwh0Var3 != null) {
            SearchMode searchMode = hy30Var.h;
            SearchMode searchMode2 = SearchMode.PEERS;
            if (searchMode == searchMode2) {
                ArrayList a4 = ((d) r5.getValue()).a(hy30Var, searchMode2, new d.a(false, this.f, true));
                rwh0Var3.f.setItems(a4);
                rwh0Var3.g = hy30Var.d;
                hu90 hu90Var = this.k;
                if (hu90Var == null) {
                    hu90Var = null;
                }
                ?? r10 = hu90Var.m;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                SparseArray<CharSequence> sparseArray = new SparseArray<>();
                Iterator it = a4.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    i = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    Class<?> cls = ((a) next).getClass();
                    if (r10.containsKey(cls) && !linkedHashSet.contains(cls)) {
                        linkedHashSet.add(cls);
                        Context context = hu90Var.b;
                        Object obj = r10.get(cls);
                        if (obj == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        sparseArray.put(i2, context.getString(((Number) obj).intValue()));
                    }
                    i2 = i;
                }
                libVar = null;
                hu90Var.h = sparseArray;
                if (rwh0Var3.a() || drm0.N(rwh0Var3.g)) {
                    b(0).a();
                } else {
                    b(0).b();
                }
                rwh0Var = (rwh0) j5g.b0(1, list);
                if (rwh0Var != null) {
                    SearchMode searchMode3 = hy30Var.h;
                    SearchMode searchMode4 = SearchMode.MESSAGES;
                    if (searchMode3 == searchMode4) {
                        a3 = ((d) r5.getValue()).a(hy30Var, searchMode4, new d.a(7));
                        rwh0Var.f.setItems(a3);
                        rwh0Var.g = hy30Var.d;
                        uw30 uw30Var = this.j;
                        uw30 uw30Var2 = uw30Var;
                        if (uw30Var == null) {
                            uw30Var2 = libVar;
                        }
                        uw30Var2.o(a3);
                        if (rwh0Var.a() || drm0.N(rwh0Var.g)) {
                            b(1).a();
                        } else {
                            com.vk.core.utils.newtork.b.a.getClass();
                            if (com.vk.core.utils.newtork.b.d()) {
                                b(1).b();
                            } else {
                                b0i0 b = b(1);
                                RecyclerView recyclerView = b.d;
                                DefaultErrorView defaultErrorView = b.c;
                                if (f4m.g(defaultErrorView)) {
                                    d3m.c(b.c, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                recyclerView.setVisibility(4);
                                recyclerView.stopScroll();
                                b.a.setVisibility(4);
                                b.b.setVisibility(4);
                                defaultErrorView.setVisibility(0);
                            }
                        }
                    }
                }
                rwh0Var2 = (rwh0) j5g.b0(2, list);
                if (rwh0Var2 == null) {
                    rx30 rx30Var = rwh0Var2.f;
                    SearchMode searchMode5 = hy30Var.h;
                    SearchMode searchMode6 = SearchMode.CHANNELS;
                    if (searchMode5 == searchMode6) {
                        a2 = ((d) r5.getValue()).a(hy30Var, searchMode6, new d.a(7));
                        rx30Var.setItems(a2);
                        rwh0Var2.g = hy30Var.d;
                        lib libVar2 = this.l;
                        (libVar2 == null ? libVar : libVar2).o(a2);
                        if (rwh0Var2.a() || drm0.N(rwh0Var2.g)) {
                            b(2).a();
                            return;
                        } else {
                            b(2).b();
                            return;
                        }
                    }
                    List<dcf0> list2 = hy30Var.l;
                    if (list2 == null || list2.isEmpty() || this.m) {
                        return;
                    }
                    this.m = true;
                    a = ((d) r5.getValue()).a(hy30Var, searchMode6, new d.a(7));
                    rx30Var.setItems(a);
                    lib libVar3 = this.l;
                    (libVar3 == null ? libVar : libVar3).o(a);
                    return;
                }
                return;
            }
        }
        libVar = null;
        rwh0Var = (rwh0) j5g.b0(1, list);
        if (rwh0Var != null) {
        }
        rwh0Var2 = (rwh0) j5g.b0(2, list);
        if (rwh0Var2 == null) {
        }
    }

    @Override // xsna.ux30, androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        b0i0 b = b(i);
        if (i == 0) {
            hu90 hu90Var = new hu90(viewGroup.getContext());
            this.k = hu90Var;
            b.d.addItemDecoration(hu90Var);
            return instantiateItem;
        }
        if (i == 1) {
            uw30 uw30Var = new uw30(viewGroup.getContext());
            this.j = uw30Var;
            b.d.addItemDecoration(uw30Var);
            return instantiateItem;
        }
        if (i == 2) {
            lib libVar = new lib(viewGroup.getContext(), this.g);
            this.l = libVar;
            b.d.addItemDecoration(libVar);
            g6o0 g6o0Var = this.h;
            if (g6o0Var != null) {
                RecyclerView recyclerView = b.d;
                DialogsSearchFragment dialogsSearchFragment = ((lvm) g6o0Var.b).n;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHANNELS;
                dialogsSearchFragment.getLifecycle().addObserver(new wyv(recyclerView, new vyv(mobileOfficialAppsCoreNavStat$EventScreen), null, new uyv(com.vk.metrics.eventtracking.b.a), new q5u0(0.5f, 1), 12));
                g2v.c().getClass();
            }
        }
        return instantiateItem;
    }
}
