package com.vk.catalog2.common.ui.mvp.holder.video.showcase;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.video.ShowcaseListItem;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemAutoPlayVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.info.VideoInfoTextView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.overlay.b;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.view.subtitles.BaseSubtitleView;
import xsna.a390;
import xsna.akj0;
import xsna.awt0;
import xsna.b5a;
import xsna.bbb0;
import xsna.bgn;
import xsna.bj6;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cqs0;
import xsna.d1x;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fh5;
import xsna.fxc0;
import xsna.g7s0;
import xsna.gc;
import xsna.h1n0;
import xsna.i13;
import xsna.i1t0;
import xsna.iah0;
import xsna.ih5;
import xsna.iud0;
import xsna.jc;
import xsna.msy;
import xsna.noo;
import xsna.os30;
import xsna.p5;
import xsna.qah0;
import xsna.qsd0;
import xsna.u4a;
import xsna.wfk0;
import xsna.wqj;
import xsna.xcs0;
import xsna.y8g0;
import xsna.yg5;
import xsna.z8s;
import xsna.zjj0;

/* compiled from: ShowcaseVideoAutoPlayViewHolder.kt */
/* loaded from: classes16.dex */
public final class ShowcaseVideoAutoPlayViewHolder extends VideoItemVh implements AutoPlayingVideoItemViewHolder {
    public BaseSubtitleView A;
    public VideoOverlayView B;
    public FrameLayout C;
    public VideoAdLayout D;
    public LinearLayout E;
    public ImageView F;
    public TextView G;
    public VideoInfoTextView H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final Object M;
    public final cqs0 N;
    public View O;
    public final zjj0 m;
    public final akj0 n;
    public final boolean o;
    public View p;
    public View q;
    public VideoErrorView r;
    public ImageView s;
    public xcs0 t;
    public VKImageView u;
    public DurationView v;
    public InteractiveDurationView w;
    public VideoTextureView x;
    public VideoAutoPlayHolderView y;
    public ProgressBar z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShowcaseVideoAutoPlayViewHolder(zjj0 zjj0Var, akj0 akj0Var, boolean z, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, u4a.a aVar, int i) {
        super(b5aVar, searchStatInfoProvider, r3, null, null, null, null, aVar, 120);
        z = (i & 4) != 0 ? false : z;
        g7s0 B = fxc0.B();
        this.m = zjj0Var;
        this.n = akj0Var;
        this.o = z;
        i13 i13Var = new i13(27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.I = msy.a(lazyThreadSafetyMode, i13Var);
        this.J = msy.a(lazyThreadSafetyMode, new iud0(4));
        this.K = msy.a(lazyThreadSafetyMode, new gc(28));
        this.L = msy.a(lazyThreadSafetyMode, new os30(B, 22));
        this.M = msy.a(lazyThreadSafetyMode, new qah0(B, 4));
        this.N = new cqs0(null, 3);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final ImageView G7() {
        return this.s;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final View Gd() {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r1 != null) goto L40;
     */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.catalog2.common.ui.mvp.holder.video.VideoItemVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        String title;
        VideoFile A;
        String string;
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockVideo) {
            TextView textView = this.G;
            String str = null;
            if (textView == null) {
                textView = null;
            }
            UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
            VideoFile videoFile = uIBlockVideo.B;
            ShowcaseListItem showcaseListItem = uIBlockVideo.G;
            if (showcaseListItem == null || (title = showcaseListItem.c) == null) {
                title = videoFile.getTitle();
            }
            textView.setText(title);
            VideoInfoTextView videoInfoTextView = this.H;
            VideoInfoTextView videoInfoTextView2 = videoInfoTextView == null ? null : videoInfoTextView;
            if (videoInfoTextView == null) {
                videoInfoTextView = null;
            }
            videoInfoTextView2.setText(this.N.c(videoFile, videoInfoTextView.getContext(), null));
            LinearLayout linearLayout = this.E;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            UIBlockVideo.ItemViewContentDescription itemViewContentDescription = uIBlockVideo.F;
            if (itemViewContentDescription != null) {
                int i = itemViewContentDescription.b;
                VideoAutoPlayHolderView videoAutoPlayHolderView = this.y;
                VideoAutoPlayHolderView videoAutoPlayHolderView2 = videoAutoPlayHolderView == null ? null : videoAutoPlayHolderView;
                List<String> list = itemViewContentDescription.c;
                if (list != null) {
                    if (videoAutoPlayHolderView == null) {
                        videoAutoPlayHolderView = null;
                    }
                    Context context = videoAutoPlayHolderView.getContext();
                    String[] strArr = (String[]) list.toArray(new String[0]);
                    string = context.getString(i, Arrays.copyOf(strArr, strArr.length));
                }
                VideoAutoPlayHolderView videoAutoPlayHolderView3 = this.y;
                if (videoAutoPlayHolderView3 == null) {
                    videoAutoPlayHolderView3 = null;
                }
                string = videoAutoPlayHolderView3.getContext().getString(i);
                videoAutoPlayHolderView2.setContentDescription(string);
            } else {
                View view = this.O;
                if (view == null) {
                    view = null;
                }
                StringBuilder sb = new StringBuilder();
                TextView textView2 = this.G;
                if (textView2 == null) {
                    textView2 = null;
                }
                sb.append((Object) textView2.getText());
                sb.append(", ");
                View view2 = this.O;
                if (view2 == null) {
                    view2 = null;
                }
                sb.append(e(view2.getContext(), videoFile));
                view.setContentDescription(sb.toString());
            }
            bpn0 bpn0Var = VideoOverlayView.I;
            VKImageView vKImageView = this.u;
            VKImageView vKImageView2 = vKImageView != null ? vKImageView : null;
            VideoOverlayView videoOverlayView = this.B;
            VideoOverlayView videoOverlayView2 = videoOverlayView == null ? null : videoOverlayView;
            DurationView durationView = this.v;
            boolean c = fxc0.B().c(videoFile);
            VideoRestriction O = videoFile.O();
            b a = O != null ? ((a390) this.K.getValue()).a(O) : null;
            boolean z = videoFile.d8() || videoFile.z0();
            VideoPipStateHolder.a.getClass();
            yg5 c2 = VideoPipStateHolder.c();
            if (c2 != null && (A = c2.A()) != null) {
                str = A.a1();
            }
            VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView2, videoOverlayView2, new qsd0(4, this, videoFile), null, durationView, true, false, c, new jc(2, videoFile), new p5(24, this, videoFile), a, z, epx.f(str, videoFile.a1()), new bbb0(this, 17), (i1t0) this.L.getValue(), null, 65704));
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final View O3() {
        return this.q;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final ActionLinkView Oi() {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final fh5 Tl(VideoItemAutoPlayVh videoItemAutoPlayVh) {
        VideoErrorView videoErrorView = this.r;
        ImageView imageView = this.s;
        View view = this.p;
        wfk0.a aVar = view != null ? new wfk0.a(view) : null;
        View view2 = this.q;
        ImageView imageView2 = this.F;
        xcs0 xcs0Var = this.t;
        VKImageView vKImageView = this.u;
        VKImageView vKImageView2 = vKImageView != null ? vKImageView : null;
        DurationView durationView = this.v;
        InteractiveDurationView interactiveDurationView = this.w;
        VideoTextureView videoTextureView = this.x;
        if (videoTextureView == null) {
            videoTextureView = null;
        }
        VideoAutoPlayHolderView videoAutoPlayHolderView = this.y;
        if (videoAutoPlayHolderView == null) {
            videoAutoPlayHolderView = null;
        }
        ProgressBar progressBar = this.z;
        BaseSubtitleView baseSubtitleView = this.A;
        VideoOverlayView videoOverlayView = this.B;
        fh5 fh5Var = new fh5(videoItemAutoPlayVh, videoTextureView, videoAutoPlayHolderView, this.k, vKImageView2, imageView, null, xcs0Var, progressBar, null, aVar, imageView2, view2, durationView, interactiveDurationView, baseSubtitleView, videoOverlayView == null ? null : videoOverlayView, videoErrorView, this.C, null, true, null, this.D, new wqj(null, null, null, null, null, null, null, 32766), new ih5(new noo(R.drawable.bg_video_live_rounded, R.drawable.bg_video_live_rounded)), null, null, null, null, null, 478151328, 31);
        fh5Var.B0 = new bgn(this, fh5Var);
        return fh5Var;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final LinearLayout Ug() {
        return null;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final ProgressBar Zb() {
        return this.z;
    }

    public final String e(Context context, VideoFile videoFile) {
        String str;
        if (videoFile.q0()) {
            return context.getString(R.string.video_live).toUpperCase(Locale.ROOT);
        }
        UIBlockVideo uIBlockVideo = this.j;
        if (uIBlockVideo == null) {
            return "";
        }
        ShowcaseListItem showcaseListItem = uIBlockVideo.G;
        return (showcaseListItem == null || (str = showcaseListItem.e) == null) ? z8s.a(uIBlockVideo.B.getDuration()) : str;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final xcs0 hg() {
        return this.t;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int a;
        int a2;
        View inflate = layoutInflater.inflate(R.layout.catalog_video_item_showcase, viewGroup, false);
        VideoAutoPlayHolderView videoAutoPlayHolderView = (VideoAutoPlayHolderView) inflate.findViewById(R.id.video_wrap);
        videoAutoPlayHolderView.removeView(videoAutoPlayHolderView.getVideoWatchLaterControl());
        videoAutoPlayHolderView.setVideoWatchLaterControl(null);
        akj0.a aVar = akj0.a.a;
        akj0 akj0Var = this.n;
        if (epx.f(akj0Var, aVar)) {
            videoAutoPlayHolderView.removeView(videoAutoPlayHolderView.k);
            videoAutoPlayHolderView.k = null;
            videoAutoPlayHolderView.removeView(videoAutoPlayHolderView.i);
            videoAutoPlayHolderView.i = null;
            videoAutoPlayHolderView.removeView(videoAutoPlayHolderView.j);
            videoAutoPlayHolderView.j = null;
            videoAutoPlayHolderView.removeView(videoAutoPlayHolderView.getVideoProgress());
            videoAutoPlayHolderView.setVideoProgress(null);
        }
        this.r = videoAutoPlayHolderView.getVideoError();
        this.s = videoAutoPlayHolderView.getVideoPlay();
        this.t = videoAutoPlayHolderView.getVideoComplete();
        this.u = videoAutoPlayHolderView.getVideoPreview();
        this.v = videoAutoPlayHolderView.getVideoDuration();
        this.E = videoAutoPlayHolderView.getVideoDurationHolder();
        this.w = videoAutoPlayHolderView.getVideoInteractiveDuration();
        this.x = videoAutoPlayHolderView.getVideoDisplay();
        this.y = videoAutoPlayHolderView;
        this.z = videoAutoPlayHolderView.getVideoProgress();
        h1n0 videoSubtitles = videoAutoPlayHolderView.getVideoSubtitles();
        this.A = videoSubtitles instanceof BaseSubtitleView ? (BaseSubtitleView) videoSubtitles : null;
        this.B = videoAutoPlayHolderView.getVideoOverlay();
        this.C = videoAutoPlayHolderView.getVideoInlineLiveHolder();
        this.D = videoAutoPlayHolderView.getVideoInstreamAd();
        this.p = videoAutoPlayHolderView.getVideoSoundControl();
        this.F = videoAutoPlayHolderView.getVideoWatchLaterControl();
        this.q = videoAutoPlayHolderView.getVideoSubtitlesControl();
        this.z = videoAutoPlayHolderView.getVideoProgress();
        zjj0 zjj0Var = this.m;
        boolean z = zjj0Var instanceof zjj0.a;
        if (z) {
            a = y8g0.a(R.dimen.showcase_list_item_large_width);
        } else {
            if (!(zjj0Var instanceof zjj0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a = y8g0.a(R.dimen.showcase_list_item_medium_width);
        }
        if (z) {
            a2 = y8g0.a(R.dimen.showcase_list_item_large_height);
        } else {
            if (!(zjj0Var instanceof zjj0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = y8g0.a(R.dimen.showcase_list_item_medium_height);
        }
        bwt0.m0(a, a2, videoAutoPlayHolderView);
        bwt0.d(videoAutoPlayHolderView, e3m.a(R.dimen.large_video_corner_radius, layoutInflater.getContext()), (r4 & 2) != 0, (r4 & 4) != 0);
        Context context = videoAutoPlayHolderView.getContext();
        VKImageView vKImageView = this.u;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setForeground(new d1x(e3m.a(R.dimen.large_video_corner_radius, context), e3m.f(R.attr.vk_ui_transparent, context), iah0.a(1), context));
        VKImageView vKImageView2 = this.u;
        if (vKImageView2 == null) {
            vKImageView2 = null;
        }
        vKImageView2.setPlaceholderImage(R.drawable.default_placeholder_8);
        VKImageView vKImageView3 = this.u;
        if (vKImageView3 == null) {
            vKImageView3 = null;
        }
        vKImageView3.A0(R.drawable.default_placeholder_8, ImageView.ScaleType.FIT_CENTER);
        DurationView durationView = this.v;
        if (durationView != null) {
            durationView.setBackgroundColor(e3m.f(R.attr.vk_ui_overlay_primary, durationView.getContext()));
            boolean f = epx.f(akj0Var, aVar);
            FontFamily fontFamily = FontFamily.MEDIUM;
            durationView.q = f;
            durationView.o = fontFamily;
            durationView.p = 12.0f;
            float f2 = 6;
            float f3 = 3;
            durationView.setPadding(iah0.a(f2), iah0.a(f3), iah0.a(f2), iah0.a(f3));
        }
        this.G = (TextView) inflate.findViewById(R.id.title);
        ((ImageView) inflate.findViewById(R.id.menu)).setOnClickListener(new bj6(this, 8));
        this.H = (VideoInfoTextView) inflate.findViewById(R.id.subtitle);
        if (!zjj0Var.a()) {
            f4m.j(inflate.findViewById(R.id.subtitleMeasureView));
            VideoInfoTextView videoInfoTextView = this.H;
            f4m.j(videoInfoTextView != null ? videoInfoTextView : null);
        }
        this.O = inflate;
        if (this.o) {
            awt0.x(inflate, 0, 0, 0, e3m.a(R.dimen.vk_ui_spacing_size4_xl, inflate.getContext()), 7);
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.video.AutoPlayingVideoItemViewHolder
    public final VideoErrorView m0() {
        return this.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
