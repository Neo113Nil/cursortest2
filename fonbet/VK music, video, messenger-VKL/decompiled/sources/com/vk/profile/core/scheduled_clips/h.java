package com.vk.profile.core.scheduled_clips;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.b1i;
import xsna.e4;
import xsna.f4m;
import xsna.f5z;
import xsna.fnj;
import xsna.gjf0;
import xsna.gm50;
import xsna.iah0;
import xsna.jcg;
import xsna.msy;
import xsna.pce;
import xsna.t0i;
import xsna.trf;
import xsna.uoh;
import xsna.wdi;
import xsna.zkh;

/* compiled from: CommunityScheduledClipsGridView.kt */
/* loaded from: classes5.dex */
public final class h implements gm50 {
    public final FragmentActivity b;
    public final UserId c;
    public final com.vk.im.ui.fragments.b d;
    public final f5z e;
    public final View f;
    public final CommunityScheduledClipsGridPaginatedView g;
    public final VkPlaceholder h;
    public final ComposeView i;
    public final ComposeView j;
    public final Object k;

    public h(FragmentActivity fragmentActivity, f5z f5zVar, UserId userId, com.vk.im.ui.fragments.b bVar) {
        this.b = fragmentActivity;
        this.c = userId;
        this.d = bVar;
        this.e = f5zVar;
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.community_fragment_scheduled_clips_grid, (ViewGroup) null);
        this.f = inflate;
        Lazy a = msy.a(LazyThreadSafetyMode.NONE, new jcg(this, 5));
        this.k = a;
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        CommunityScheduledClipsGridPaginatedView communityScheduledClipsGridPaginatedView = (CommunityScheduledClipsGridPaginatedView) inflate.findViewById(R.id.community_scheduled_clips_grid_paginated_view);
        this.g = communityScheduledClipsGridPaginatedView;
        this.h = (VkPlaceholder) inflate.findViewById(R.id.community_scheduled_clips_grid_paginated_view_placeholder);
        this.i = (ComposeView) inflate.findViewById(R.id.community_scheduled_clips_grid_overlay);
        ComposeView composeView = (ComposeView) inflate.findViewById(R.id.community_scheduled_clips_grid_paginated_view_skeleton);
        this.j = composeView;
        Context context = inflate.getContext();
        HashSet hashSet = iah0.a;
        int i = 1;
        if (fnj.d(context)) {
            int a2 = gjf0.a(inflate.getContext(), true);
            f4m.l(a2, a2, inflate);
        }
        communityScheduledClipsGridPaginatedView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, communityScheduledClipsGridPaginatedView);
        dVar.c(3);
        dVar.e = new b1i();
        dVar.a();
        communityScheduledClipsGridPaginatedView.setAdapter((t0i) a.getValue());
        communityScheduledClipsGridPaginatedView.setSwipeRefreshEnabled(true);
        communityScheduledClipsGridPaginatedView.setOnRefreshListener(new trf(this, 6));
        RecyclerView recyclerView = communityScheduledClipsGridPaginatedView.getRecyclerView();
        recyclerView.setClipToPadding(false);
        recyclerView.setMotionEventSplittingEnabled(false);
        vkTopBar.setBack(new VkTopBar.b(new pce(this, 12), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new uoh(vkTopBar, i), 3), 14));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(vkTopBar.getContext().getString(R.string.community_scheduled_clips_grid_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, com.vk.core.compose.component.semantics.b.a(null, new zkh(vkTopBar, 2), 3), 6));
        composeView.setContent(wdi.c);
    }

    @Override // xsna.gm50
    public final f5z getViewOwner() {
        return this.e;
    }
}
