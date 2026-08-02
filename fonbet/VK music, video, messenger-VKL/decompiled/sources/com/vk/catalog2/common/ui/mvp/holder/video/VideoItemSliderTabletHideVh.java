package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.UIBlockVideoHide;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.video.VideoItemListSettings;
import com.vk.catalog2.common.ui.holders.video.info_overlays.a;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.ui.VideoHideView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bpn0;
import xsna.bwt0;
import xsna.f4m;
import xsna.iah0;
import xsna.k7a;
import xsna.k990;
import xsna.m33;
import xsna.o44;
import xsna.vpj0;

/* compiled from: VideoItemSliderTabletHideVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemSliderTabletHideVh extends VideoItemVh {
    public final k7a m;
    public final float n;
    public LinearLayout o;
    public AspectRatioFrameLayout p;
    public VideoHideView q;
    public com.vk.catalog2.common.ui.holders.video.info_overlays.a r;
    public final bpn0 s;

    public VideoItemSliderTabletHideVh(b5a b5aVar, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(b5aVar, searchStatInfoProvider, null, null, null, null, null, null, 252);
        this.m = k7aVar;
        this.n = iah0.b(8.0f);
        this.s = new bpn0(new vpj0(this, 16));
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockVideo uIBlockVideo;
        UIBlockVideoHide uIBlockVideoHide = uIBlock instanceof UIBlockVideoHide ? (UIBlockVideoHide) uIBlock : null;
        if (uIBlockVideoHide == null || (uIBlockVideo = uIBlockVideoHide.y) == null) {
            return;
        }
        super.N6(uIBlockVideo);
        VideoFile videoFile = uIBlockVideo.B;
        LinearLayout linearLayout = this.o;
        if (linearLayout != null) {
            bwt0.r0(-2, linearLayout);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.p;
        com.vk.catalog2.common.ui.holders.video.info_overlays.a aVar = this.r;
        if (aspectRatioFrameLayout != null && aVar != null) {
            bpn0 bpn0Var = this.s;
            aspectRatioFrameLayout.setAspectRation(((VideoItemListSettings) bpn0Var.getValue()).c);
            ViewGroup.LayoutParams layoutParams = aspectRatioFrameLayout.getLayoutParams();
            layoutParams.width = ((VideoItemListSettings) bpn0Var.getValue()).a;
            layoutParams.height = ((VideoItemListSettings) bpn0Var.getValue()).b;
            aspectRatioFrameLayout.setLayoutParams(layoutParams);
            bwt0.e0(aspectRatioFrameLayout, 0, iah0.a(aVar.e()), 0, iah0.a(aVar.e()));
        }
        com.vk.catalog2.common.ui.holders.video.info_overlays.a aVar2 = this.r;
        if (aVar2 != null) {
            aVar2.a(videoFile, null, null);
        }
        VideoHideView videoHideView = this.q;
        if (videoHideView != null) {
            videoHideView.setVideoFile(videoFile);
        }
        VideoHideView videoHideView2 = this.q;
        if (videoHideView2 != null) {
            videoHideView2.setIsHideByOwner(((UIBlockVideoHide) uIBlock).z);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh
    public final float c() {
        return this.n;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.content);
        linearLayout.setLayoutParams(new RecyclerView.p(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setForeground(m33.a(R.drawable.highlight, context));
        this.o = linearLayout;
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context, null, 6);
        this.p = aspectRatioFrameLayout;
        VideoHideView videoHideView = new VideoHideView(aspectRatioFrameLayout.getContext(), null, 0, 6, 0);
        videoHideView.setText(R.string.similar_videos_will_rarely_be_shown);
        videoHideView.setCancelText(R.string.cancel);
        videoHideView.setId(R.id.video_hide_view);
        videoHideView.setLayoutParams(new RecyclerView.p(-1, -1));
        videoHideView.setBackgroundResource(R.drawable.background_video_hide_12);
        this.q = videoHideView;
        aspectRatioFrameLayout.addView(videoHideView, new FrameLayout.LayoutParams(-1, -1));
        aspectRatioFrameLayout.setBackgroundResource(R.drawable.background_rounded_12);
        bwt0.d(aspectRatioFrameLayout, this.n, (r4 & 2) != 0, (r4 & 4) != 0);
        linearLayout.addView(aspectRatioFrameLayout, new LinearLayout.LayoutParams(-1, -2));
        com.vk.catalog2.common.ui.holders.video.info_overlays.a a = a.C0491a.a((VideoItemListSettings) this.s.getValue(), this.m, false);
        this.r = a;
        a.b(layoutInflater, linearLayout, aspectRatioFrameLayout, new o44(0), new k990(25));
        f4m.y(0, linearLayout);
        View findViewById = linearLayout.findViewById(R.id.info_holder);
        if (findViewById != null) {
            findViewById.setAlpha(0.2f);
        }
        TextView textView = (TextView) linearLayout.findViewById(R.id.title);
        if (textView != null) {
            textView.setMaxLines(1);
        }
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.subtitle_views);
        if (textView2 != null) {
            textView2.setTextAppearance(R.style.VkUiTypography_Footnote);
        }
        return linearLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
