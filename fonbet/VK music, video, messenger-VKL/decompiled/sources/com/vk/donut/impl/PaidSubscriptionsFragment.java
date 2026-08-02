package com.vk.donut.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.dto.common.actions.Action;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a8t;
import xsna.ag90;
import xsna.aj50;
import xsna.bg90;
import xsna.dg90;
import xsna.eg90;
import xsna.f3p0;
import xsna.gpu0;
import xsna.hd60;
import xsna.iah0;
import xsna.izs;
import xsna.jjv0;
import xsna.nyn;
import xsna.oz50;
import xsna.qhh0;
import xsna.rbe;
import xsna.rwi;
import xsna.s3q0;

/* compiled from: PaidSubscriptionsFragment.kt */
/* loaded from: classes18.dex */
public final class PaidSubscriptionsFragment extends BaseMvpFragment<bg90> implements qhh0 {
    public static final /* synthetic */ int V = 0;
    public RecyclerPaginatedView T;
    public final b U = new b();

    /* compiled from: PaidSubscriptionsFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(PaidSubscriptionsFragment.class, null, null);
        }
    }

    /* compiled from: PaidSubscriptionsFragment.kt */
    public static final class b implements dg90 {
    }

    /* compiled from: PaidSubscriptionsFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<a8t, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(a8t a8tVar) {
            PaidSubscriptionsFragment paidSubscriptionsFragment = (PaidSubscriptionsFragment) this.receiver;
            int i = PaidSubscriptionsFragment.V;
            paidSubscriptionsFragment.getClass();
            rwi.d().q().a(paidSubscriptionsFragment, a8tVar.b);
            return s3q0.a;
        }
    }

    /* compiled from: PaidSubscriptionsFragment.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<nyn, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(nyn nynVar) {
            Action action;
            nyn nynVar2 = nynVar;
            PaidSubscriptionsFragment paidSubscriptionsFragment = (PaidSubscriptionsFragment) this.receiver;
            int i = PaidSubscriptionsFragment.V;
            Context B = paidSubscriptionsFragment.B();
            if (B != null && (action = nynVar2.b.c) != null) {
                hd60.a().v(action, B, (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
            }
            return s3q0.a;
        }
    }

    /* compiled from: PaidSubscriptionsFragment.kt */
    public static final class e implements jjv0 {
        public final /* synthetic */ ag90 b;

        public e(ag90 ag90Var) {
            this.b = ag90Var;
        }

        @Override // xsna.jjv0
        public final int n1(int i) {
            ag90 ag90Var = this.b;
            if (i < ag90Var.getItemCount() && i > 0) {
                eg90 eg90Var = (eg90) ag90Var.c.c(i);
                if (((eg90Var != null ? eg90Var.a : 0) & 2) != 0) {
                    return 1;
                }
            }
            return 0;
        }

        @Override // xsna.jjv0
        public final int t(int i) {
            if (this.b.getItemViewType(i) == 3) {
                return 0;
            }
            return iah0.a(4.0f);
        }
    }

    public final void jo() {
        rwi.d().q().b(this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        bg90 bg90Var;
        super.onActivityResult(i, i2, intent);
        if (i == 422 && i2 == -1) {
            bg90 bg90Var2 = (bg90) this.S;
            if (bg90Var2 != null) {
                bg90Var2.l4();
                return;
            }
            return;
        }
        if ((i == 423 || (i == 422 && i2 == 0)) && (bg90Var = (bg90) this.S) != null) {
            bg90Var.q2();
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.S = new com.vk.donut.impl.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.layout_paid_subscriptions_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setOnClickListener(new rbe(this, 4));
            toolbar.setTitle(getString(R.string.settings_paid_subscriptions));
            f3p0.a(toolbar, this, new aj50(this, 5));
        }
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        if (recyclerPaginatedView != null) {
            new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
            ag90 ag90Var = new ag90(((bg90) this.S).r0(), new c(1, this, PaidSubscriptionsFragment.class, "showSubscriptionFragment", "showSubscriptionFragment(Lcom/vk/donut/impl/items/GameSubscriptionRecyclerItem;)V", 0), new d(1, this, PaidSubscriptionsFragment.class, "processActionForDonutBlock", "processActionForDonutBlock(Lcom/vk/donut/impl/items/DonutBlockRecyclerItem;)V", 0));
            ag90Var.g = this.U;
            recyclerPaginatedView.setAdapter(ag90Var);
            recyclerPaginatedView.setSwipeRefreshEnabled(true);
            gpu0 gpu0Var = new gpu0(inflate.getContext());
            gpu0Var.j = new e(ag90Var);
            recyclerPaginatedView.getRecyclerView().addItemDecoration(gpu0Var);
        } else {
            recyclerPaginatedView = null;
        }
        this.T = recyclerPaginatedView;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.T = null;
        super.onDestroyView();
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.T;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }
}
