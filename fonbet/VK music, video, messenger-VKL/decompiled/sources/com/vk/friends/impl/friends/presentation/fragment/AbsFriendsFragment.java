package com.vk.friends.impl.friends.presentation.fragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.friends.api.presentation.FriendsListType;
import com.vk.friends.impl.friends.presentation.fragment.AbsFriendsFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import defpackage.i;
import kotlin.jvm.internal.Ref$IntRef;
import me.grishka.appkit.fragments.AppKitFragment;
import xsna.bwt0;
import xsna.dhr0;
import xsna.hg6;
import xsna.iqs;
import xsna.lpj;
import xsna.nqs;
import xsna.oz50;
import xsna.sb;
import xsna.tb;
import xsna.wb;
import xsna.xb;
import xsna.xqs;
import xsna.y1z;
import xsna.yqs;

/* compiled from: AbsFriendsFragment.kt */
/* loaded from: classes.dex */
public abstract class AbsFriendsFragment<P extends xqs, A extends xb> extends AppKitFragment implements yqs {
    public static final /* synthetic */ int l0 = 0;
    public RecyclerPaginatedView Z;
    public View a0;
    public View b0;
    public View c0;
    public ViewGroup d0;
    public hg6<nqs> e0;
    public final c f0;
    public Integer g0;
    public P h0;
    public A i0;
    public final io.reactivex.rxjava3.disposables.b j0;
    public final b k0;

    /* compiled from: AbsFriendsFragment.kt */
    /* loaded from: classes15.dex */
    public static class a extends oz50 {
        public final void y(iqs iqsVar) {
            UserId userId = iqsVar.a;
            Bundle bundle = this.j;
            bundle.putParcelable("user_id", userId);
            bundle.putString("list_type", iqsVar.d.name());
            bundle.putString("referrer", iqsVar.b);
            bundle.putString("event_screen", iqsVar.c.name());
            bundle.putBoolean("global_search_enabled", iqsVar.e);
        }
    }

    /* compiled from: AbsFriendsFragment.kt */
    /* loaded from: classes15.dex */
    public static final class b extends FragmentImpl.b {
        public b(AbsFriendsFragment<P, A> absFriendsFragment) {
        }

        @Override // com.vk.core.fragments.FragmentImpl.a
        public final void a(lpj lpjVar) {
            dhr0.a.getClass();
            dhr0.l(lpjVar);
        }
    }

    /* compiled from: AbsFriendsFragment.kt */
    /* loaded from: classes15.dex */
    public static final class c extends RecyclerView.i {
        public final /* synthetic */ AbsFriendsFragment<P, A> a;

        public c(AbsFriendsFragment<P, A> absFriendsFragment) {
            this.a = absFriendsFragment;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void b() {
            int i = AbsFriendsFragment.l0;
            this.a.so();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void e(int i, int i2) {
            int i3 = AbsFriendsFragment.l0;
            this.a.so();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void g(int i, int i2) {
            int i3 = AbsFriendsFragment.l0;
            this.a.so();
        }
    }

    public AbsFriendsFragment() {
        FriendsListType friendsListType = FriendsListType.ALL;
        this.f0 = new c(this);
        this.j0 = new io.reactivex.rxjava3.disposables.b();
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
        this.k0 = new b(this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final FragmentImpl.a Jn() {
        return this.k0;
    }

    @Override // xsna.yqs
    public void d8(hg6<nqs> hg6Var) {
        hg6<nqs> hg6Var2 = this.e0;
        if (hg6Var2 != null) {
            hg6Var2.q(this.f0);
        }
        this.e0 = hg6Var;
        A no = no(hg6Var);
        this.i0 = no;
        RecyclerPaginatedView recyclerPaginatedView = this.Z;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.setAdapter(no);
        ro(qo());
        so();
    }

    public abstract A no(hg6<nqs> hg6Var);

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ro(qo());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
        this.h0 = (P) oo(this, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.friends_list_paginated, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.j0.dispose();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        hg6<nqs> hg6Var = this.e0;
        if (hg6Var != null) {
            hg6Var.q(this.f0);
        }
        this.e0 = null;
        this.d0 = null;
        super.onDestroyView();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        this.Z = (RecyclerPaginatedView) view.findViewById(R.id.friends_list_view);
        this.a0 = view.findViewById(R.id.progress_bar);
        this.b0 = view.findViewById(R.id.progress_spinner);
        requireContext();
        this.c0 = view.findViewById(R.id.search_query_view_container);
        this.d0 = (ViewGroup) view.findViewById(R.id.empty_state_container);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("list_type")) == null || FriendsListType.valueOf(string) == null) {
            FriendsListType friendsListType = FriendsListType.ALL;
        }
        P p = this.h0;
        if (p == null) {
            p = null;
        }
        p.d();
        wb wbVar = new wb(this);
        RecyclerPaginatedView recyclerPaginatedView = this.Z;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        AbstractPaginatedView.d o = recyclerPaginatedView.o(AbstractPaginatedView.LayoutType.GRID);
        int qo = qo();
        this.g0 = Integer.valueOf(qo);
        o.c(qo);
        o.e(wbVar);
        o.a();
        RecyclerPaginatedView recyclerPaginatedView2 = this.Z;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        View progressView = recyclerPaginatedView2.getProgressView();
        int i = 0;
        if (progressView != null) {
            bwt0.k(progressView, new tb(this, i));
        }
        RecyclerPaginatedView recyclerPaginatedView3 = this.Z;
        (recyclerPaginatedView3 != null ? recyclerPaginatedView3 : null).setDataObserver(new i(this, 2));
        po().setClipToPadding(false);
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        po().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: xsna.ub
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = AbsFriendsFragment.l0;
                AbsFriendsFragment absFriendsFragment = AbsFriendsFragment.this;
                int width = absFriendsFragment.po().getWidth();
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                if (width != ref$IntRef2.element) {
                    ref$IntRef2.element = absFriendsFragment.po().getWidth();
                    absFriendsFragment.ro(absFriendsFragment.qo());
                }
            }
        });
    }

    public abstract xqs oo(AbsFriendsFragment absFriendsFragment, Bundle bundle);

    public final RecyclerView po() {
        RecyclerPaginatedView recyclerPaginatedView = this.Z;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        return recyclerPaginatedView.getRecyclerView();
    }

    public abstract int qo();

    public final void ro(int i) {
        A a2 = this.i0;
        if (a2 != null) {
            a2.i0(i);
        }
        Integer num = this.g0;
        if (num != null && i == num.intValue()) {
            return;
        }
        RecyclerView.o layoutManager = po().getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null) {
            gridLayoutManager.setSpanCount(i);
        }
        this.g0 = Integer.valueOf(i);
        po().post(new sb(this, 0));
    }

    public final void so() {
        if (getView() == null) {
            return;
        }
        ViewGroup viewGroup = this.d0;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        RecyclerPaginatedView recyclerPaginatedView = this.Z;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.setVisibility(0);
    }
}
