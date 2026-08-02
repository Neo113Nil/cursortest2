package com.vk.catalog2.feature.music.holders.podcast;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastItem;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.Podcast;
import com.vk.music.bottomsheets.di.PodcastBottomSheetHeaderComponent;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c98;
import xsna.cvk;
import xsna.e3m;
import xsna.gzs;
import xsna.i0q0;
import xsna.i3r;
import xsna.itg0;
import xsna.izs;
import xsna.k1u0;
import xsna.kbj0;
import xsna.oq;
import xsna.phb0;
import xsna.qdz;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.u2b0;
import xsna.x7g;
import xsna.yna;
import xsna.zna;

/* compiled from: PodcastSliderCellVh.kt */
/* loaded from: classes16.dex */
public final class PodcastSliderCellVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final qdz c;
    public final kbj0 d;
    public final phb0 e;
    public final PodcastBottomSheetHeaderComponent f;
    public UIBlockPodcastItem g;
    public VkCell h;

    /* compiled from: PodcastSliderCellVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            Podcast podcast;
            phb0 phb0Var;
            String h;
            CatalogLaunchOrigin catalogLaunchOrigin;
            int intValue = num.intValue();
            PodcastSliderCellVh podcastSliderCellVh = (PodcastSliderCellVh) this.receiver;
            UIBlockPodcastItem uIBlockPodcastItem = podcastSliderCellVh.g;
            if (uIBlockPodcastItem != null && (podcast = uIBlockPodcastItem.y) != null) {
                UserId userId = podcast.c;
                VkCell vkCell = podcastSliderCellVh.h;
                if (vkCell == null) {
                    vkCell = null;
                }
                Context context = vkCell.getContext();
                if (context != null) {
                    if (intValue == R.id.music_action_go_to_community) {
                        UIBlockPodcastItem uIBlockPodcastItem2 = podcastSliderCellVh.g;
                        if ((uIBlockPodcastItem2 != null ? uIBlockPodcastItem2.p : null) == CatalogLaunchOrigin.KIDS_SECTION) {
                            i0q0.f(new i3r(context, 2));
                        } else {
                            podcastSliderCellVh.f.R3(userId.b, context);
                        }
                    } else if (intValue == R.id.music_action_share) {
                        kbj0.c(podcastSliderCellVh.d, context, podcast.d(), true, null, null, false, 120);
                    } else if (intValue == R.id.music_action_copy_link) {
                        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                        String d = podcast.d();
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(d, d));
                        cvk.u(R.string.link_copied, false);
                    } else if (intValue == R.id.music_action_podcast_unsubscribe && (phb0Var = podcastSliderCellVh.e) != null) {
                        Integer valueOf = Integer.valueOf(podcast.b);
                        UIBlockPodcastItem uIBlockPodcastItem3 = podcastSliderCellVh.g;
                        if (uIBlockPodcastItem3 == null || (catalogLaunchOrigin = uIBlockPodcastItem3.p) == null || (h = catalogLaunchOrigin.h()) == null) {
                            h = CatalogLaunchOrigin.UNKNOWN.h();
                        }
                        UIBlockPodcastItem uIBlockPodcastItem4 = podcastSliderCellVh.g;
                        itg0.l(phb0Var.c(userId, valueOf, h, uIBlockPodcastItem4 != null ? uIBlockPodcastItem4.f : null));
                    }
                }
            }
            return s3q0.a;
        }
    }

    public PodcastSliderCellVh(u2b0 u2b0Var, qdz qdzVar, kbj0 kbj0Var, phb0 phb0Var, PodcastBottomSheetHeaderComponent podcastBottomSheetHeaderComponent) {
        this.b = u2b0Var;
        this.c = qdzVar;
        this.d = kbj0Var;
        this.e = phb0Var;
        this.f = podcastBottomSheetHeaderComponent;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockPodcastItem) {
            UIBlockPodcastItem uIBlockPodcastItem = (UIBlockPodcastItem) uIBlock;
            this.g = uIBlockPodcastItem;
            Podcast podcast = uIBlockPodcastItem.y;
            String str = podcast.d;
            String str2 = podcast.i;
            VkCell vkCell = this.h;
            if (vkCell == null) {
                vkCell = null;
            }
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, str == null ? null : new VkCell.Middle.e(oq.d(tlo0.Companion, str), 2, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), str2 == null ? null : new VkCell.Middle.d(oq.d(tlo0.Companion, str2), (gzs) null, 2, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
            List<Thumb> list = podcast.f;
            if (list != null) {
                VkCell vkCell2 = this.h;
                (vkCell2 != null ? vkCell2 : null).setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new zna(list), VkCell.Left.Main.Size.Large)));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_vk_cell_item, viewGroup, false);
        inflate.setOnClickListener(new c98(this, 1));
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.cell);
        vkCell.setLeftMainPictureController(new yna());
        vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new com.vk.catalog2.common.ui.holders.a(23, this, inflate), tq.h(tlo0.Companion, R.string.music_talkback_more), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary))), null, 27));
        this.h = vkCell;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockPodcastItem uIBlockPodcastItem;
        Podcast podcast;
        CatalogLaunchOrigin catalogLaunchOrigin;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockPodcastItem = this.g) == null || (podcast = uIBlockPodcastItem.y) == null) {
            return;
        }
        UIBlockPodcastItem uIBlockPodcastItem2 = this.g;
        this.c.e().d(h, Uri.parse(podcast.d()), new LaunchContext(false, false, false, uIBlockPodcastItem2 != null ? uIBlockPodcastItem2.f : null, (uIBlockPodcastItem2 == null || (catalogLaunchOrigin = uIBlockPodcastItem2.p) == null) ? null : catalogLaunchOrigin.h(), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108839), null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
