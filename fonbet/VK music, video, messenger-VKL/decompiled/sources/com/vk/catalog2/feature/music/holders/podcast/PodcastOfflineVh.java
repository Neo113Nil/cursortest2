package com.vk.catalog2.feature.music.holders.podcast;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockOfflinePodcastItem;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ah40;
import xsna.ahn;
import xsna.bi40;
import xsna.c98;
import xsna.dhr0;
import xsna.e3m;
import xsna.fl4;
import xsna.hq;
import xsna.iah0;
import xsna.k1u0;
import xsna.kbj0;
import xsna.kr50;
import xsna.ngv0;
import xsna.phb0;
import xsna.qgv0;
import xsna.sgv0;
import xsna.tlo0;
import xsna.u2b0;
import xsna.vgv0;
import xsna.x7g;
import xsna.xg40;
import xsna.zg40;

/* compiled from: PodcastOfflineVh.kt */
/* loaded from: classes16.dex */
public final class PodcastOfflineVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final fl4 c;
    public final kbj0 d;
    public final phb0 e;
    public final PodcastBottomSheetHeaderComponent f;
    public UIBlockOfflinePodcastItem g;
    public VkRichCell h;
    public final io.reactivex.rxjava3.disposables.b i = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: PodcastOfflineVh.kt */
    public static final class a implements VkCell.d {
        public final ThumbsImageView a;

        public a(Context context) {
            ThumbsImageView thumbsImageView = new ThumbsImageView(context, null, 6, 0);
            thumbsImageView.setId(R.id.image_thumb);
            thumbsImageView.setBorderLineWidth(iah0.a(0.5f));
            thumbsImageView.setRadiusCorner(iah0.b(6.0f));
            thumbsImageView.setEmptyPlaceholder(R.drawable.vk_icon_podcast_outline_28);
            thumbsImageView.setEmptyTintAttr(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary);
            thumbsImageView.setBackground(dhr0.t.c(R.attr.vk_ui_vkontakte_color_placeholder_icon_tint));
            this.a = thumbsImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            if ((fVar instanceof c ? (c) fVar : null) != null) {
                this.a.setThumbs(((c) fVar).a);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: PodcastOfflineVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: PodcastOfflineVh.kt */
    public static final class c implements VkCell.f {
        public final List<Thumb> a;

        public c(List<Thumb> list) {
            this.a = list;
        }
    }

    public PodcastOfflineVh(u2b0 u2b0Var, fl4 fl4Var, kbj0 kbj0Var, phb0 phb0Var, PodcastBottomSheetHeaderComponent podcastBottomSheetHeaderComponent) {
        this.b = u2b0Var;
        this.c = fl4Var;
        this.d = kbj0Var;
        this.e = phb0Var;
        this.f = podcastBottomSheetHeaderComponent;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.i.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockOfflinePodcastItem) {
            UIBlockOfflinePodcastItem uIBlockOfflinePodcastItem = (UIBlockOfflinePodcastItem) uIBlock;
            OfflinePodcast offlinePodcast = uIBlockOfflinePodcastItem.y;
            this.g = uIBlockOfflinePodcastItem;
            Podcast podcast = offlinePodcast.b;
            List<Thumb> list = podcast.f;
            if (list != null) {
                VkRichCell vkRichCell = this.h;
                if (vkRichCell == null) {
                    vkRichCell = null;
                }
                vkRichCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new c(list), VkCell.Left.Main.Size.Large)));
            }
            VkRichCell vkRichCell2 = this.h;
            if (vkRichCell2 == null) {
                vkRichCell2 = null;
            }
            tlo0.d b2 = hq.b(tlo0.Companion, R.plurals.music_title_several_podcast_episodes, offlinePodcast.c);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            sgv0 sgv0Var = new sgv0(6, b2);
            String str = podcast.d;
            vgv0 vgv0Var = str != null ? new vgv0(new tlo0.h(str), (ngv0.a) null, (ngv0) null, 1, 6) : null;
            String str2 = podcast.i;
            vkRichCell2.setMiddle(ahn.v(vgv0Var, null, str2 != null ? new qgv0(new tlo0.h(str2), (ngv0.a) null, (ngv0.a) null, 1, 6) : null, sgv0Var, null, null, null, 498));
            VkRichCell vkRichCell3 = this.h;
            if (vkRichCell3 == null) {
                vkRichCell3 = null;
            }
            float f = 40;
            vkRichCell3.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, new VkCell.Right.e.d(new xg40(bi40.a.a), new Size(iah0.a(f), iah0.a(f))), new VkCell.Right.ExtraAction.d(new kr50(this, 10), new tlo0.f(R.string.music_talkback_more), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary))), null, 25));
            VkRichCell vkRichCell4 = this.h;
            View findViewById = (vkRichCell4 != null ? vkRichCell4 : null).findViewById(R.id.ds_internal_cell_right_extra_actions_wrapper);
            if (findViewById != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = iah0.a(26.0f);
                findViewById.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkRichCell vkRichCell = new VkRichCell(layoutInflater.getContext(), null, 6, 0);
        this.h = vkRichCell;
        vkRichCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        vkRichCell.setOnClickListener(new c98(this, 1));
        vkRichCell.setLeftMainPictureController(new b());
        vkRichCell.setRightExtraViewController(new ah40(zg40.b));
        return vkRichCell;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockOfflinePodcastItem uIBlockOfflinePodcastItem;
        OfflinePodcast offlinePodcast;
        Podcast podcast;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockOfflinePodcastItem = this.g) == null || (offlinePodcast = uIBlockOfflinePodcastItem.y) == null || (podcast = offlinePodcast.b) == null) {
            return;
        }
        CatalogLaunchOrigin catalogLaunchOrigin = uIBlockOfflinePodcastItem.p;
        if (catalogLaunchOrigin == null) {
            catalogLaunchOrigin = CatalogLaunchOrigin.UNKNOWN;
        }
        String str = uIBlockOfflinePodcastItem.b;
        if (str == null) {
            str = "";
        }
        MusicPlaybackLaunchContext Cb = MusicPlaybackLaunchContext.Fb(str).Cb(catalogLaunchOrigin.h());
        UserId userId = podcast.c;
        String str2 = podcast.d;
        this.c.J(h, userId, Cb, str2 != null ? str2 : "");
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
