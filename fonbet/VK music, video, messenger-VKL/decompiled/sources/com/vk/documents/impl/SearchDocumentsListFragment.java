package com.vk.documents.impl;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.search.ui.stat.SearchContext;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import com.vkontakte.android.api.DocsGetTypesResult;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.adz;
import xsna.af50;
import xsna.azh0;
import xsna.b0y;
import xsna.bdz;
import xsna.bpn0;
import xsna.bqs;
import xsna.brm0;
import xsna.cvk;
import xsna.d02;
import xsna.d50;
import xsna.drm0;
import xsna.ejf0;
import xsna.ept;
import xsna.gd70;
import xsna.izs;
import xsna.j03;
import xsna.kjs;
import xsna.l1r;
import xsna.m1r;
import xsna.mhy;
import xsna.mi10;
import xsna.msy;
import xsna.o7y;
import xsna.oqh0;
import xsna.orl;
import xsna.oz50;
import xsna.p5w;
import xsna.qf3;
import xsna.qr;
import xsna.rsg0;
import xsna.s3q0;
import xsna.v100;
import xsna.vqu0;
import xsna.wmi0;
import xsna.xqu0;
import xsna.xsw;
import xsna.xtn;
import xsna.z260;

/* compiled from: SearchDocumentsListFragment.kt */
/* loaded from: classes18.dex */
public final class SearchDocumentsListFragment extends DocumentsListFragment {
    public static final /* synthetic */ int h0 = 0;
    public VkSearchView W;
    public com.vk.lists.c X;
    public com.vk.lists.c Y;
    public int c0;
    public final bpn0 Z = new bpn0(new xsw(this, 28));
    public String a0 = "";
    public final ArrayList<Document> b0 = new ArrayList<>();
    public final Object d0 = msy.a(LazyThreadSafetyMode.NONE, new gd70(this, 23));
    public final bpn0 e0 = new bpn0(new v100(this, 26));
    public final bpn0 f0 = new bpn0(new oqh0(this, 0));
    public final bpn0 g0 = new bpn0(new z260(this, 22));

    /* compiled from: SearchDocumentsListFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(SearchDocumentsListFragment.class, null, null);
        }

        public final void y(UserId userId) {
            this.j.putParcelable("ownerId", userId);
        }
    }

    /* compiled from: SearchDocumentsListFragment.kt */
    public static final class b implements izs<Throwable, s3q0> {
        public b() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            if (th2 instanceof VKApiExecutionException) {
                String message = th2.getMessage();
                SearchDocumentsListFragment searchDocumentsListFragment = SearchDocumentsListFragment.this;
                cvk.w((message == null || !brm0.v(message, "q should be not more 512 letters length", false)) ? j03.d(searchDocumentsListFragment.getActivity(), (VKApiExecutionException) th2) : searchDocumentsListFragment.getString(R.string.documents_search_query_max_length), false);
            }
            return s3q0.a;
        }
    }

    /* compiled from: SearchDocumentsListFragment.kt */
    public static final class c implements c.l<xtn.a> {
        public c() {
        }

        @Override // com.vk.lists.c.k
        public final q<xtn.a> hj(com.vk.lists.c cVar, boolean z) {
            return ui(0, cVar);
        }

        @Override // com.vk.lists.c.l
        public final q<xtn.a> ui(int i, com.vk.lists.c cVar) {
            SearchDocumentsListFragment searchDocumentsListFragment = SearchDocumentsListFragment.this;
            String str = searchDocumentsListFragment.a0;
            UserId userId = (UserId) searchDocumentsListFragment.Z.getValue();
            com.vk.lists.c cVar2 = searchDocumentsListFragment.X;
            return rsg0.y0(new xtn(i, userId, cVar2 != null ? cVar2.k() : 50, str), null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<xtn.a> qVar, boolean z, com.vk.lists.c cVar) {
            SearchDocumentsListFragment searchDocumentsListFragment = SearchDocumentsListFragment.this;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new o7y(new d50(23, searchDocumentsListFragment, cVar), 14), new bdz((b) searchDocumentsListFragment.g0.getValue(), 18));
            if (subscribe == null) {
                return;
            }
            searchDocumentsListFragment.Q.b(subscribe);
        }
    }

    /* compiled from: SearchDocumentsListFragment.kt */
    public static final class d implements c.l<VkPaginationList<Document>> {
        public d() {
        }

        @Override // com.vk.lists.c.k
        public final q<VkPaginationList<Document>> hj(com.vk.lists.c cVar, boolean z) {
            SearchDocumentsListFragment searchDocumentsListFragment = SearchDocumentsListFragment.this;
            ArrayList<Document> arrayList = searchDocumentsListFragment.b0;
            if (arrayList.isEmpty()) {
                return wmi0.a.i("userDocs", true);
            }
            return q.T(new VkPaginationList(arrayList, searchDocumentsListFragment.c0, arrayList.size() < searchDocumentsListFragment.c0, 0, 8, null));
        }

        @Override // com.vk.lists.c.l
        public final q<VkPaginationList<Document>> ui(int i, com.vk.lists.c cVar) {
            return rsg0.y0(new qf3(i, cVar.k(), DocsGetTypesResult.DocType.Type.ALL.h(), (UserId) SearchDocumentsListFragment.this.Z.getValue()), null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<VkPaginationList<Document>> qVar, boolean z, com.vk.lists.c cVar) {
            SearchDocumentsListFragment searchDocumentsListFragment = SearchDocumentsListFragment.this;
            io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new m1r(new l1r(searchDocumentsListFragment, cVar, z), 25), new b0y((b) searchDocumentsListFragment.g0.getValue(), 21));
            if (subscribe == null) {
                return;
            }
            searchDocumentsListFragment.Q.b(subscribe);
        }
    }

    @Override // com.vk.documents.impl.list.DocumentsListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.documents_search, viewGroup, false);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.c(new AppBarLayout.ScrollingViewBehavior());
        onCreateView.setLayoutParams(fVar);
        VkSearchView vkSearchView = (VkSearchView) inflate.findViewById(R.id.search_view);
        orl.a(vkSearchView);
        this.W = vkSearchView;
        ((ViewGroup) inflate.findViewById(R.id.documents_search_root_layout)).addView(onCreateView, 1);
        return inflate;
    }

    @Override // com.vk.documents.impl.list.DocumentsListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.vk.lists.c cVar = this.Y;
        if (cVar != null) {
            cVar.v();
        }
        this.Y = null;
        com.vk.lists.c cVar2 = this.X;
        if (cVar2 != null) {
            cVar2.v();
        }
        this.X = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        mhy.b(getActivity());
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @SuppressLint({"CheckResult"})
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkSearchView vkSearchView = this.W;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        vkSearchView.setOnBackClickListener(new ejf0(this, 2));
        vkSearchView.setVoiceInputEnabled(true);
        j1 U = d02.y(vkSearchView, 200L, 2).U(new adz(new ept(26), 10));
        bqs bqsVar = new bqs(new af50(this, 24), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        U.E(bqsVar, lVar, kVar, kVar).subscribe(new kjs(new mi10(this, 20), 18));
        vkSearchView.setHint(R.string.search_documents);
        vqu0 vqu0Var = new vqu0(new qr(29));
        xqu0 xqu0Var = new xqu0(new p5w(this, 14));
        c.h hVar = new c.h((c) this.e0.getValue());
        hVar.i = 50;
        hVar.g = false;
        hVar.c = 10;
        hVar.n = xqu0Var;
        hVar.o = vqu0Var;
        this.X = f.a(hVar, this.T);
        c.h hVar2 = new c.h((d) this.f0.getValue());
        hVar2.i = 50;
        hVar2.c = 10;
        this.Y = f.a(hVar2, this.T);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle(R.string.docs);
        }
        VkSearchView vkSearchView2 = this.W;
        VkSearchView vkSearchView3 = vkSearchView2 != null ? vkSearchView2 : null;
        if (drm0.N(vkSearchView3.getQuery())) {
            vkSearchView3.b5(500L);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gun
    public final void u3(Document document, int i) {
        azh0 azh0Var = (azh0) this.d0.getValue();
        MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action = MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.TAP;
        SearchContext searchContext = new SearchContext(this.a0, i, SchemeStat$EventItem.Type.DOCUMENT, document.b, null, null, 32, null);
        UiTracker uiTracker = UiTracker.a;
        azh0Var.b(action, searchContext, UiTracker.c());
    }
}
