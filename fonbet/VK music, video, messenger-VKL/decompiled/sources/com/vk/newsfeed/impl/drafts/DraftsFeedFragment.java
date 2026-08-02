package com.vk.newsfeed.impl.drafts;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.newsfeed.impl.fragments.EntriesListFragment;
import com.vkontakte.android.R;
import xsna.dqp;
import xsna.fe90;
import xsna.hjf0;
import xsna.jo3;
import xsna.mqp;
import xsna.oz50;
import xsna.rdo;
import xsna.t2l;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;
import xsna.vhp;

/* compiled from: DraftsFeedFragment.kt */
/* loaded from: classes4.dex */
public final class DraftsFeedFragment extends EntriesListFragment<dqp> {
    public static final /* synthetic */ int o0 = 0;
    public final int n0 = R.layout.drafts_feed_fragment;

    /* compiled from: DraftsFeedFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final int jo() {
        return this.n0;
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment
    public final dqp no() {
        return new rdo(this);
    }

    @Override // com.vk.newsfeed.impl.fragments.EntriesListFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FragmentManager supportFragmentManager;
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = this.U;
        if (vkTopBar != null) {
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.newsfeed_drafts), null, null, null, null, 30), null, null, null, 14));
        }
        VkTopBar vkTopBar2 = this.U;
        if (vkTopBar2 != null) {
            vkTopBar2.setShowBottomDivider(true);
        }
        mqp mqpVar = this.d0;
        RecyclerPaginatedView recyclerPaginatedView = ((mqp) mqpVar.H.a.c).h;
        KeyEvent.Callback emptyView = recyclerPaginatedView != null ? recyclerPaginatedView.getEmptyView() : null;
        fe90 fe90Var = emptyView instanceof fe90 ? (fe90) emptyView : null;
        if (fe90Var != null) {
            fe90Var.setText(R.string.newsfeed_empty_drafts);
        }
        hjf0 hjf0Var = mqpVar.H;
        t2l t2lVar = new t2l(this, 5);
        too0 too0Var = ((mqp) hjf0Var.a.c).h;
        vhp vhpVar = too0Var instanceof vhp ? (vhp) too0Var : null;
        if (vhpVar != null) {
            vhpVar.setEmptyViewButtonListener(t2lVar);
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.l0("closeDrafts", this, new jo3(this, 10));
    }
}
