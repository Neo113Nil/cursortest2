package com.vk.superapp.miniapps.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$MiniAppCatalogSectionItem;
import com.vk.stat.scheme.SchemeStat$TypeMiniAppCatalogItem;
import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import com.vk.superapp.miniapps.impl.AppsCatalogSearchFragment;
import com.vk.superapp.miniapps.impl.AppsCatalogSectionDetailsFragment;
import com.vk.superapp.miniapps.impl.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.anj;
import xsna.bpn0;
import xsna.c5g;
import xsna.ca;
import xsna.epx;
import xsna.f1a;
import xsna.f5z;
import xsna.fco0;
import xsna.fpf0;
import xsna.g5g;
import xsna.g620;
import xsna.ge3;
import xsna.he3;
import xsna.hf8;
import xsna.j5g;
import xsna.je3;
import xsna.l8r0;
import xsna.m7m;
import xsna.mzp0;
import xsna.o25;
import xsna.oz50;
import xsna.pn00;
import xsna.q8r0;
import xsna.r6;
import xsna.rzp0;
import xsna.tz5;
import xsna.vau0;
import xsna.vre0;
import xsna.w40;
import xsna.x7a;
import xsna.z23;

/* compiled from: AppsCatalogFragment.kt */
/* loaded from: classes6.dex */
public final class AppsCatalogFragment extends BaseFragment implements q8r0 {
    public static final /* synthetic */ int W = 0;
    public l8r0 S;
    public final com.vk.superapp.miniapps.impl.a T = new com.vk.superapp.miniapps.impl.a();
    public final b U = new b();
    public final bpn0 V = new bpn0(new w40(this, 5));

    /* compiled from: AppsCatalogFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(AppsCatalogFragment.class, null, null);
        }
    }

    /* compiled from: AppsCatalogFragment.kt */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i = AppsCatalogFragment.W;
            f1a f1aVar = new f1a(pn00.k(new Pair("groups", Integer.valueOf(g620.l)), new Pair("friends", Integer.valueOf(g620.g))));
            l8r0 l8r0Var = AppsCatalogFragment.this.S;
            if (l8r0Var != null) {
                l8r0Var.c(f1aVar);
            }
        }
    }

    public AppsCatalogFragment() {
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 mzp0Var = (mzp0) rzp0.c(UiMeasuringScreen.MINIAPPS_CATALOG, null, false, 62).j();
        this.J = mzp0Var;
        if (mzp0Var != null) {
            mzp0Var.init();
        }
    }

    @Override // xsna.q8r0
    public final void Rm() {
        new AppsCatalogSearchFragment.a(AppsCatalogSearchFragment.class, null, null).l(this);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        a.C1885a c1885a = this.T.a;
        if (c1885a == null) {
            return false;
        }
        c1885a.d = null;
        return false;
    }

    @Override // xsna.q8r0
    public final void c(boolean z) {
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.c(z);
        }
    }

    @Override // xsna.q8r0
    public final void mc(String str, String str2) {
        new AppsCatalogSectionDetailsFragment.a(str, str2).l(this);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = ((AppsCatalogComponent) m7m.d(this).mo408a(fpf0.a(AppsCatalogComponent.class))).qa(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l8r0 l8r0Var = this.S;
        if (l8r0Var != null) {
            return l8r0Var.e(requireContext(), viewGroup);
        }
        return null;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        l8r0 l8r0Var = this.S;
        if (l8r0Var != null) {
            l8r0Var.onDestroyView();
        }
        this.S = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        IntentFilter a2 = z23.a("com.vkontakte.android.COUNTERS_UPDATED");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            anj.d(activity, this.U, a2, hf8.a, 4);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.unregisterReceiver(this.U);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerPaginatedView f;
        super.onViewCreated(view, bundle);
        mzp0 mzp0Var = this.J;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        l8r0 l8r0Var = this.S;
        if (l8r0Var != null) {
            l8r0Var.b(view, requireContext(), this.T);
        }
        f5z viewLifecycleOwner = getViewLifecycleOwner();
        bpn0 bpn0Var = new bpn0(new ca(this, 4));
        r6 r6Var = new r6(this, 4);
        d dVar = new d();
        c cVar = dVar.a;
        if (cVar != null) {
            cVar.dismiss();
        }
        dVar.a = null;
        if (viewLifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            dVar.a = new c(vre0.e((vre0) bpn0Var.getValue(), new BadgeEvent(o25.a().c()), "apps_catalog_badges", null, new he3(0, new com.vk.superapp.miniapps.impl.b(), r6Var), null, null, 108));
            viewLifecycleOwner.getLifecycle().addObserver(new tz5(dVar));
        }
        l8r0 l8r0Var2 = this.S;
        if (l8r0Var2 == null || (f = l8r0Var2.f()) == null) {
            return;
        }
        f.setUiStateCallbacks(new je3(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        SchemeStat$EventItem schemeStat$EventItem;
        com.vk.superapp.miniapps.impl.a aVar = this.T;
        a.C1885a c1885a = aVar.a;
        if (c1885a == null) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, null, null, 62, null);
            return;
        }
        RecyclerView recyclerView = c1885a.a;
        Set<String> set = c1885a.e;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new SchemeStat$MiniAppCatalogSectionItem((String) it.next()));
        }
        LinkedList linkedList = new LinkedList();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView.e0 findContainingViewHolder = recyclerView.findContainingViewHolder(recyclerView.getChildAt(i));
            if (findContainingViewHolder != 0 && (findContainingViewHolder instanceof vau0)) {
                vau0 vau0Var = (vau0) findContainingViewHolder;
                if (vau0Var.getItem() instanceof x7a.d) {
                    boolean f = fco0.f(recyclerView, findContainingViewHolder.itemView, 1.0f, 1.0f, true);
                    String str = ((x7a.d) vau0Var.getItem()).d;
                    if (f && c1885a.e.contains(str)) {
                        linkedList.add(str);
                    }
                }
            }
        }
        for (Map.Entry entry : c1885a.f.entrySet()) {
            String str2 = (String) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedList) {
                if (epx.f((String) obj, str2)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() != list.size()) {
                g5g.D(linkedList, true, new ge3(str2, 0));
            }
        }
        String str3 = (String) j5g.k0(linkedList);
        SchemeStat$TypeMiniAppCatalogItem schemeStat$TypeMiniAppCatalogItem = new SchemeStat$TypeMiniAppCatalogItem(arrayList, c1885a.b, c1885a.c, Integer.valueOf(str3 == null ? -1 : j5g.c0(c1885a.e, str3)));
        c1885a.b = -1;
        SchemeStat$EventItem schemeStat$EventItem2 = null;
        c1885a.c = null;
        uiTrackingScreen.a(schemeStat$TypeMiniAppCatalogItem);
        a.C1885a c1885a2 = aVar.a;
        if (c1885a2 != null) {
            Boolean bool = c1885a2.d;
            if (epx.f(bool, Boolean.TRUE)) {
                schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MINI_APP, null, null, null, null, null, 62, null);
            } else if (epx.f(bool, Boolean.FALSE)) {
                schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, null, null, 62, null);
            } else if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            schemeStat$EventItem2 = schemeStat$EventItem;
        }
        uiTrackingScreen.f = schemeStat$EventItem2;
    }
}
