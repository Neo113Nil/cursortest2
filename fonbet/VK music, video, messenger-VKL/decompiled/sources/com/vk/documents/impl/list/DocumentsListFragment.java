package com.vk.documents.impl.list;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.documents.impl.list.DocumentsListFragment;
import com.vk.documents.ui.fragments.DocumentsViewFragment;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import xsna.gun;
import xsna.gvn;
import xsna.h7u0;
import xsna.mhy;
import xsna.u9;
import xsna.wun;
import xsna.xg5;
import xsna.ytn;

/* compiled from: DocumentsListFragment.kt */
/* loaded from: classes18.dex */
public abstract class DocumentsListFragment extends BaseFragment implements ytn, gun {
    public static final /* synthetic */ int V = 0;
    public wun S;
    public VkRecyclerPaginatedView T;
    public final a U = new a();

    /* compiled from: DocumentsListFragment.kt */
    public static final class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            FragmentActivity activity;
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 || i != 1 || (activity = DocumentsListFragment.this.getActivity()) == null) {
                return;
            }
            mhy.b(activity);
        }
    }

    @Override // xsna.ytn
    public final boolean Sh(final Document document) {
        UserId userId;
        FragmentActivity activity;
        if (document == null || (userId = document.h) == null) {
            userId = UserId.d;
        }
        if (document == null || !xg5.a().d(userId) || (activity = getActivity()) == null) {
            return false;
        }
        h7u0.a aVar = new h7u0.a(activity);
        aVar.b0(new DialogInterface.OnShowListener() { // from class: xsna.xun
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                DocumentsListFragment documentsListFragment = DocumentsListFragment.this;
                VkRecyclerPaginatedView vkRecyclerPaginatedView = documentsListFragment.T;
                if (vkRecyclerPaginatedView != null) {
                    vkRecyclerPaginatedView.setCanScroll(false);
                }
                Fragment parentFragment = documentsListFragment.getParentFragment();
                DocumentsViewFragment documentsViewFragment = parentFragment instanceof DocumentsViewFragment ? (DocumentsViewFragment) parentFragment : null;
                if (documentsViewFragment != null) {
                    documentsViewFragment.l0.n(false);
                }
            }
        });
        aVar.a0(new DialogInterface.OnDismissListener() { // from class: xsna.yun
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                DocumentsListFragment documentsListFragment = DocumentsListFragment.this;
                VkRecyclerPaginatedView vkRecyclerPaginatedView = documentsListFragment.T;
                if (vkRecyclerPaginatedView != null) {
                    vkRecyclerPaginatedView.setCanScroll(true);
                }
                Fragment parentFragment = documentsListFragment.getParentFragment();
                DocumentsViewFragment documentsViewFragment = parentFragment instanceof DocumentsViewFragment ? (DocumentsViewFragment) parentFragment : null;
                if (documentsViewFragment != null) {
                    documentsViewFragment.l0.n(true);
                }
            }
        });
        aVar.T(new String[]{getString(R.string.download), getString(R.string.delete)}, new DialogInterface.OnClickListener() { // from class: xsna.zun
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FragmentActivity activity2;
                int i2 = DocumentsListFragment.V;
                final Document document2 = Document.this;
                final DocumentsListFragment documentsListFragment = this;
                if (i != 0) {
                    if (i == 1 && (activity2 = documentsListFragment.getActivity()) != null) {
                        h7u0.a aVar2 = new h7u0.a(activity2);
                        aVar2.g0(R.string.confirm);
                        aVar2.U(R.string.document_delete_confirm);
                        aVar2.c0(R.string.yes, new DialogInterface.OnClickListener() { // from class: xsna.avn
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface2, int i3) {
                                int i4 = DocumentsListFragment.V;
                                Document document3 = document2;
                                UserId userId2 = document3.h;
                                int i5 = document3.b;
                                utn utnVar = new utn("docs.delete");
                                utnVar.F(userId2, "oid");
                                utnVar.F(userId2, "owner_id");
                                utnVar.C(i5, "did");
                                utnVar.C(i5, "doc_id");
                                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(utnVar, null, null, 3);
                                DocumentsListFragment documentsListFragment2 = documentsListFragment;
                                documentsListFragment2.eo(hg1.m(y0, documentsListFragment2.getActivity(), 0L, false, 62).subscribe(new j22(new d05(17, documentsListFragment2, document3), 27), new gf0(new j9k(documentsListFragment2, 5), 21)));
                            }
                        });
                        aVar2.W(R.string.no, null);
                        aVar2.m();
                        return;
                    }
                    return;
                }
                FragmentActivity activity3 = documentsListFragment.getActivity();
                if (activity3 == null) {
                    return;
                }
                rp1 rp1Var = new rp1(9, document2, activity3);
                if (gz80.a(34)) {
                    rp1Var.invoke();
                    return;
                }
                PermissionHelper permissionHelper = PermissionHelper.a;
                permissionHelper.getClass();
                permissionHelper.d(activity3, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, rp1Var, null);
            }
        });
        aVar.m();
        return true;
    }

    public final void io(int i) {
        wun wunVar = this.S;
        if (wunVar != null) {
            wunVar.l = i;
            wunVar.k.a = i;
            wunVar.notifyItemRangeChanged(Math.max(i - 1, 0), Math.min(3, wunVar.getItemCount()));
        }
    }

    @Override // xsna.ytn
    public final void lh(Document document) {
        if (document == null) {
            return;
        }
        gvn.e(document, kn(), new u9(13, document, this));
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = new wun(this, this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkRecyclerPaginatedView vkRecyclerPaginatedView = new VkRecyclerPaginatedView(requireContext(), null, 6, 0);
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, vkRecyclerPaginatedView).a();
        vkRecyclerPaginatedView.setAdapter(this.S);
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        vkRecyclerPaginatedView.getRecyclerView().addOnScrollListener(this.U);
        this.T = vkRecyclerPaginatedView;
        return vkRecyclerPaginatedView;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.T = null;
        super.onDestroyView();
    }
}
