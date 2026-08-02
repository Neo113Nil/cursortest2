package com.vk.superapp.browser.internal.ui.menu.action;

import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.tile.VkTile;
import com.vk.core.view.components.tile.VkTileImageView;
import com.vk.superapp.browser.internal.ui.menu.action.i;
import com.vk.superapp.ui.shimmer.Shimmer;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.e370;
import xsna.e3m;
import xsna.f4m;
import xsna.hbh0;
import xsna.iah0;
import xsna.ifx0;
import xsna.jjc;
import xsna.m520;
import xsna.nl30;
import xsna.oq;
import xsna.qzt0;
import xsna.thw;
import xsna.tlo0;
import xsna.vjo;

/* compiled from: RecommendationsViewHolder.kt */
/* loaded from: classes6.dex */
public final class j extends RecyclerView.e0 {
    public final b l;
    public final ShimmerFrameLayout m;
    public final VkGroupHeader n;

    /* compiled from: RecommendationsViewHolder.kt */
    public static final class a extends RecyclerView.e0 {
        public final m520 l;
        public i m;
        public final ShimmerFrameLayout n;
        public final VkTile o;

        public a(m520 m520Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.vk_recommendations_menu_item, viewGroup, false));
            this.l = m520Var;
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer_layout);
            this.n = shimmerFrameLayout;
            VkTile vkTile = (VkTile) this.itemView.findViewById(R.id.recommendation_item);
            this.o = vkTile;
            jjc.g(this.itemView, new nl30(this, 21));
            Shimmer.c cVar = (Shimmer.c) new Shimmer.c().j();
            cVar.k(e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming, shimmerFrameLayout.getContext()));
            cVar.a.d = e3m.f(R.attr.vk_ui_track_background, shimmerFrameLayout.getContext());
            shimmerFrameLayout.b(cVar.d(1.0f).a());
            View view = this.itemView;
            view.setBackground(vjo.a(view.getContext(), 0, 0, 0, iah0.b(8.0f), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 444));
            ifx0 ifx0Var = e370.c;
            vkTile.setVisualContentController(new com.vk.core.view.components.tile.c(new thw((ifx0Var == null ? null : ifx0Var).b().create(vkTile.getContext())), this.itemView.getContext()));
        }
    }

    /* compiled from: RecommendationsViewHolder.kt */
    public static final class b extends RecyclerView.Adapter<a> {
        public final m520 c;
        public List<? extends i> d = EmptyList.b;

        public b(m520 m520Var) {
            this.c = m520Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i) {
            a aVar2 = aVar;
            i iVar = this.d.get(i);
            ShimmerFrameLayout shimmerFrameLayout = aVar2.n;
            VkTile vkTile = aVar2.o;
            aVar2.m = iVar;
            if (!(iVar instanceof i.b)) {
                if (!(iVar instanceof i.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                shimmerFrameLayout.setVisibility(0);
                shimmerFrameLayout.c();
                shimmerFrameLayout.invalidate();
                vkTile.setVisibility(8);
                return;
            }
            vkTile.setVisibility(0);
            shimmerFrameLayout.setVisibility(8);
            i.b bVar = (i.b) iVar;
            vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, bVar.a.c), 2, null, null, null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED));
            vkTile.setVisualContentParams(new VkTileImageView.a(new Size(hbh0.b(56, vkTile.getContext()), hbh0.b(56, vkTile.getContext())), new qzt0((String) bVar.b.getValue(), new VKImageController.b(16.0f, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65534)), null, 4));
            vkTile.setVisualContentType(VkTile.VisualContentType.Other);
            ViewGroup.LayoutParams layoutParams = vkTile.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = hbh0.b(72, vkTile.getContext());
            vkTile.setLayoutParams(layoutParams);
            shimmerFrameLayout.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new a(this.c, LayoutInflater.from(viewGroup.getContext()), viewGroup);
        }
    }

    public j(c cVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        super(layoutInflater.inflate(R.layout.vk_action_menu_recommendations_item, viewGroup, false));
        b bVar = new b(cVar);
        this.l = bVar;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) this.itemView.findViewById(R.id.shimmer_layout);
        this.m = shimmerFrameLayout;
        this.n = (VkGroupHeader) this.itemView.findViewById(R.id.title);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recommendation_recycler);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(bVar);
        Shimmer.c cVar2 = (Shimmer.c) new Shimmer.c().j();
        cVar2.k(e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming, shimmerFrameLayout.getContext()));
        cVar2.a.d = e3m.f(R.attr.vk_ui_track_background, shimmerFrameLayout.getContext());
        shimmerFrameLayout.b(cVar2.d(1.0f).a());
        ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.container);
        f4m.j(this.itemView.findViewById(R.id.separator));
        constraintLayout.setBackgroundColor(0);
    }
}
