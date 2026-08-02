package com.vk.documents.impl;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.O6;
import com.vk.api.base.Document;
import com.vk.api.base.VkPaginationList;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.api.DocsGetTypesResult;
import io.reactivex.rxjava3.core.q;
import java.util.List;
import xsna.bdz;
import xsna.bpn0;
import xsna.dl30;
import xsna.eun;
import xsna.fyd0;
import xsna.jz70;
import xsna.nvm0;
import xsna.oz50;
import xsna.qf3;
import xsna.qhh0;
import xsna.rsg0;
import xsna.svk0;
import xsna.yqd0;

/* compiled from: TypedDocumentsListFragment.kt */
/* loaded from: classes18.dex */
public final class TypedDocumentsListFragment extends DocumentsListFragment implements qhh0 {
    public static final /* synthetic */ int e0 = 0;
    public boolean X;
    public VkPaginationList<Document> Y;
    public c Z;
    public boolean a0;
    public eun c0;
    public final bpn0 W = new bpn0(new fyd0(this, 13));
    public final bpn0 b0 = new bpn0(new yqd0(this, 11));
    public final bpn0 d0 = new bpn0(new jz70(this, 28));

    /* compiled from: TypedDocumentsListFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(TypedDocumentsListFragment.class, null, null);
        }
    }

    /* compiled from: TypedDocumentsListFragment.kt */
    public static final class b implements c.l<VkPaginationList<Document>> {
        public b() {
        }

        @Override // com.vk.lists.c.k
        public final q<VkPaginationList<Document>> hj(c cVar, boolean z) {
            List<Document> list;
            TypedDocumentsListFragment typedDocumentsListFragment = TypedDocumentsListFragment.this;
            if (z) {
                c cVar2 = typedDocumentsListFragment.Z;
                if (cVar2 != null) {
                    cVar2.r(true);
                }
                typedDocumentsListFragment.Y = null;
            }
            VkPaginationList<Document> vkPaginationList = typedDocumentsListFragment.Y;
            return (vkPaginationList == null || ((list = vkPaginationList.b) != null && list.isEmpty())) ? ui(0, cVar) : q.T(typedDocumentsListFragment.Y);
        }

        @Override // com.vk.lists.c.l
        public final q<VkPaginationList<Document>> ui(int i, c cVar) {
            TypedDocumentsListFragment typedDocumentsListFragment = TypedDocumentsListFragment.this;
            return rsg0.y0(new qf3(i, cVar.k(), typedDocumentsListFragment.jo(), (UserId) typedDocumentsListFragment.W.getValue()), null, null, 3);
        }

        @Override // com.vk.lists.c.k
        public final void wd(q<VkPaginationList<Document>> qVar, boolean z, c cVar) {
            TypedDocumentsListFragment typedDocumentsListFragment = TypedDocumentsListFragment.this;
            qVar.subscribe(new nvm0(new dl30(typedDocumentsListFragment, cVar, z, 1), 3), new bdz(new svk0(typedDocumentsListFragment, 12), 26));
        }
    }

    public final int jo() {
        return ((Number) this.b0.getValue()).intValue();
    }

    public final void ko() {
        c cVar;
        this.X = true;
        if (!this.a0 || (cVar = this.Z) == null) {
            return;
        }
        cVar.p(true);
    }

    @Override // com.vk.documents.impl.list.DocumentsListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.X) {
            return;
        }
        this.Y = (VkPaginationList) requireArguments().getParcelable(O6.C0);
        requireArguments().remove(O6.C0);
    }

    @Override // com.vk.documents.impl.list.DocumentsListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        c cVar = this.Z;
        if (cVar != null) {
            cVar.v();
        }
        this.Z = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("swipeRefresh", true) : true;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.T;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.setSwipeRefreshEnabled(z);
        }
        if (this.X) {
            this.Y = null;
        }
        c.h hVar = new c.h((b) this.d0.getValue());
        hVar.c = 10;
        hVar.i = 50;
        hVar.l = this.X;
        VkPaginationList<Document> vkPaginationList = this.Y;
        if (vkPaginationList != null && vkPaginationList.d) {
            List<Document> list = vkPaginationList.b;
            hVar.k = String.valueOf(list != null ? list.size() : 0);
        }
        c a2 = f.a(hVar, this.T);
        this.Z = a2;
        VkPaginationList<Document> vkPaginationList2 = this.Y;
        if (vkPaginationList2 == null || vkPaginationList2.d) {
            return;
        }
        a2.r(false);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.T;
        if (vkRecyclerPaginatedView == null || (recyclerView = vkRecyclerPaginatedView.getRecyclerView()) == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        int jo = jo();
        uiTrackingScreen.a = jo == DocsGetTypesResult.DocType.Type.ALL.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_ALL : jo == DocsGetTypesResult.DocType.Type.TEXTS.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_TEXT : jo == DocsGetTypesResult.DocType.Type.ARCHIVES.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_ARCHIVES : jo == DocsGetTypesResult.DocType.Type.GIFS.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_GIFS : jo == DocsGetTypesResult.DocType.Type.IMAGES.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_IMAGES : jo == DocsGetTypesResult.DocType.Type.MUSIC.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_AUDIOS : jo == DocsGetTypesResult.DocType.Type.VIDEOS.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_VIDEOS : jo == DocsGetTypesResult.DocType.Type.EBOOKS.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_EBOOKS : jo == DocsGetTypesResult.DocType.Type.OTHERS.h() ? MobileOfficialAppsCoreNavStat$EventScreen.DOCS_OTHERS : MobileOfficialAppsCoreNavStat$EventScreen.DOCS_OTHERS;
    }

    @Override // xsna.gun
    public final void u3(Document document, int i) {
    }
}
