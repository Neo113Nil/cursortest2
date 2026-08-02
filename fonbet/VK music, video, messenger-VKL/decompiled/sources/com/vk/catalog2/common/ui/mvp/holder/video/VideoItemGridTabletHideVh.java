package com.vk.catalog2.common.ui.mvp.holder.video;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
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
import xsna.bwt0;
import xsna.dl70;
import xsna.iah0;
import xsna.k7a;
import xsna.m33;
import xsna.o44;

/* compiled from: VideoItemGridTabletHideVh.kt */
/* loaded from: classes16.dex */
public final class VideoItemGridTabletHideVh extends VideoItemVh {
    public final VideoItemListSettings m;
    public final float n;
    public LinearLayout o;
    public AspectRatioFrameLayout p;
    public VideoHideView q;
    public final com.vk.catalog2.common.ui.holders.video.info_overlays.a r;

    public VideoItemGridTabletHideVh(b5a b5aVar, VideoItemListSettings videoItemListSettings, k7a k7aVar, SearchStatInfoProvider searchStatInfoProvider) {
        super(b5aVar, searchStatInfoProvider, null, null, null, null, null, null, 252);
        this.m = videoItemListSettings;
        this.n = videoItemListSettings.e ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : iah0.b(8.0f);
        this.r = a.C0491a.a(videoItemListSettings, k7aVar, false);
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
        VideoItemListSettings videoItemListSettings = this.m;
        if (linearLayout != null) {
            bwt0.r0(videoItemListSettings.b() ? -2 : -1, linearLayout);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.p;
        if (aspectRatioFrameLayout != null) {
            boolean z = videoItemListSettings.b() || videoItemListSettings.e;
            aspectRatioFrameLayout.setAspectRation(videoItemListSettings.c);
            ViewGroup.LayoutParams layoutParams = aspectRatioFrameLayout.getLayoutParams();
            layoutParams.width = videoItemListSettings.a;
            layoutParams.height = videoItemListSettings.b;
            aspectRatioFrameLayout.setLayoutParams(layoutParams);
            com.vk.catalog2.common.ui.holders.video.info_overlays.a aVar = this.r;
            bwt0.e0(aspectRatioFrameLayout, z ? 0 : iah0.a(aVar.c()), iah0.a(aVar.e()), z ? 0 : iah0.a(aVar.c()), iah0.a(aVar.e()));
        }
        this.r.a(videoFile, null, null);
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
        videoHideView.setCancelText(R.string.video_hide_cancel);
        videoHideView.setId(R.id.video_hide_view);
        videoHideView.setLayoutParams(new RecyclerView.p(-1, -1));
        this.q = videoHideView;
        aspectRatioFrameLayout.addView(videoHideView, new FrameLayout.LayoutParams(-1, -1));
        if (this.m.e) {
            aspectRatioFrameLayout.setBackgroundResource(R.drawable.background_borders);
        } else {
            aspectRatioFrameLayout.setBackgroundResource(R.drawable.background_rounded);
            bwt0.d(aspectRatioFrameLayout, this.n, (r4 & 2) != 0, (r4 & 4) != 0);
        }
        linearLayout.addView(aspectRatioFrameLayout, new LinearLayout.LayoutParams(-1, -2));
        this.r.b(layoutInflater, linearLayout, aspectRatioFrameLayout, new o44(0), new dl70(26));
        linearLayout.findViewById(R.id.info_holder).setAlpha(0.2f);
        return linearLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
