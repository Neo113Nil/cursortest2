package com.vk.catalog2.common.ui.mvp.holder.video.showcase;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.vk.catalog2.common.ui.mvp.R$styleable;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.ui.CircularProgressView;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.enj;
import xsna.f4m;
import xsna.fxc0;
import xsna.h1n0;
import xsna.iah0;
import xsna.iv1;
import xsna.m33;
import xsna.s3q0;
import xsna.v3s0;
import xsna.xcs0;

/* compiled from: VideoAutoPlayHolderView.kt */
/* loaded from: classes16.dex */
public final class VideoAutoPlayHolderView extends RatioFrameLayout {
    public static final /* synthetic */ int x = 0;
    public final VideoTextureView e;
    public h1n0 f;
    public final VKImageView g;
    public FrameLayout h;
    public View i;
    public View j;
    public ImageView k;
    public LinearLayout l;
    public DurationView m;
    public InteractiveDurationView n;
    public SpectatorsCounterView o;
    public ProgressBar p;
    public ImageView q;
    public xcs0 r;
    public VideoErrorView s;
    public ActionLinkView t;
    public VideoAdLayout u;
    public VideoOverlayView v;
    public CircularProgressView w;

    /* compiled from: VideoAutoPlayHolderView.kt */
    public static final class a {
        public static final void a(CircularProgressView circularProgressView) {
            int i = VideoAutoPlayHolderView.x;
            if (fxc0.B().J().O()) {
                circularProgressView.post(new iv1(circularProgressView, 14));
            } else {
                circularProgressView.setIndeterminate(true);
                circularProgressView.b();
            }
        }
    }

    public VideoAutoPlayHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VideoTextureView videoTextureView = new VideoTextureView(context, null, 6, 0);
        videoTextureView.setId(R.id.video_display);
        videoTextureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        this.e = videoTextureView;
        VKImageView vKImageView = new VKImageView(context, null, 6, 0);
        vKImageView.setId(R.id.video_preview);
        vKImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        vKImageView.setContentDescription(null);
        this.g = vKImageView;
        VideoOverlayView videoOverlayView = new VideoOverlayView(context, VideoOverlayView.VideoRestrictionSize.MEDIUM);
        videoOverlayView.setId(R.id.video_overlay);
        videoOverlayView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        videoOverlayView.setVisibility(8);
        this.v = videoOverlayView;
        setId(R.id.video_wrap);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setBackground(m33.a(R.color.vk_black, getContext()));
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        int integer = obtainStyledAttributes.getInteger(0, 15);
        obtainStyledAttributes.recycle();
        Trace.beginSection("VideoAutoPlayHolderView.addChildren");
        try {
            addView(videoTextureView);
            NoStyleSubtitleView noStyleSubtitleView = new NoStyleSubtitleView(getContext(), null);
            noStyleSubtitleView.setId(R.id.video_subtitles);
            noStyleSubtitleView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            noStyleSubtitleView.setVisibility(8);
            noStyleSubtitleView.setBottomMarginOverride(Integer.valueOf(iah0.a(40)));
            this.f = noStyleSubtitleView;
            addView(noStyleSubtitleView);
            addView(vKImageView);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setId(R.id.video_inline_live_holder);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.h = frameLayout;
            addView(frameLayout);
            LinearLayout linearLayout = new LinearLayout(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            linearLayout.setLayoutParams(layoutParams);
            if ((integer & 1) == 1) {
                linearLayout.addView(m(linearLayout.getContext()));
            }
            if ((integer & 2) == 2) {
                Context context2 = linearLayout.getContext();
                View view = new View(context2);
                view.setId(R.id.video_subtitles_control);
                float f = 48;
                view.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 8388661));
                e3m.a aVar = e3m.a;
                view.setBackground(m33.a(R.drawable.subtitles_shadow_48, context2));
                view.setContentDescription(null);
                view.setVisibility(8);
                this.j = view;
                linearLayout.addView(view);
            }
            if ((integer & 4) == 4) {
                Context context3 = linearLayout.getContext();
                View view2 = new View(context3);
                view2.setId(R.id.sound_control);
                float f2 = 48;
                view2.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f2), 8388661));
                e3m.a aVar2 = e3m.a;
                view2.setBackground(m33.a(R.drawable.ic_sound_off_shadow_48, context3));
                view2.setContentDescription(null);
                view2.setVisibility(8);
                this.i = view2;
                linearLayout.addView(view2);
            }
            addView(linearLayout);
            addView(i(getContext()));
            Context context4 = getContext();
            InteractiveDurationView interactiveDurationView = new InteractiveDurationView(context4, null, 6);
            interactiveDurationView.setId(R.id.video_interactive_duration);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
            int a2 = iah0.a(8);
            layoutParams2.setMargins(a2, a2, a2, a2);
            interactiveDurationView.setLayoutParams(layoutParams2);
            e3m.a aVar3 = e3m.a;
            interactiveDurationView.setBackground(m33.a(R.drawable.bg_interactiv_video_duration_label_rounded_4, context4));
            this.n = interactiveDurationView;
            addView(interactiveDurationView);
            if (z) {
                addView(l(getContext()));
            }
            addView(k(getContext()));
            xcs0 xcs0Var = new xcs0(getContext(), null, null, 62);
            xcs0Var.setId(R.id.video_complete_view);
            xcs0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            xcs0Var.setVisibility(8);
            this.r = xcs0Var;
            addView(xcs0Var);
            VideoErrorView videoErrorView = new VideoErrorView(getContext(), null, 6);
            videoErrorView.setId(R.id.video_error);
            videoErrorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            videoErrorView.setVisibility(8);
            this.s = videoErrorView;
            addView(videoErrorView);
            if ((integer & 8) == 8) {
                addView(h(getContext()));
            }
            VideoAdLayout videoAdLayout = new VideoAdLayout(getContext(), null, 6);
            videoAdLayout.setId(R.id.video_instream_ad);
            videoAdLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            videoAdLayout.setVisibility(8);
            this.u = videoAdLayout;
            addView(videoAdLayout);
            addView(this.v);
            addView(j(getContext()));
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final ActionLinkView getVideoActionLink() {
        return this.t;
    }

    public final xcs0 getVideoComplete() {
        return this.r;
    }

    public final VideoTextureView getVideoDisplay() {
        return this.e;
    }

    public final DurationView getVideoDuration() {
        return this.m;
    }

    public final LinearLayout getVideoDurationHolder() {
        return this.l;
    }

    public final VideoErrorView getVideoError() {
        return this.s;
    }

    public final FrameLayout getVideoInlineLiveHolder() {
        return this.h;
    }

    public final VideoAdLayout getVideoInstreamAd() {
        return this.u;
    }

    public final InteractiveDurationView getVideoInteractiveDuration() {
        return this.n;
    }

    public final CircularProgressView getVideoLoader() {
        return this.w;
    }

    public final VideoOverlayView getVideoOverlay() {
        return this.v;
    }

    public final ImageView getVideoPlay() {
        return this.q;
    }

    public final VKImageView getVideoPreview() {
        return this.g;
    }

    public final ProgressBar getVideoProgress() {
        return this.p;
    }

    public final View getVideoSoundControl() {
        return this.i;
    }

    public final SpectatorsCounterView getVideoSpectators() {
        return this.o;
    }

    public final h1n0 getVideoSubtitles() {
        return this.f;
    }

    public final View getVideoSubtitlesControl() {
        return this.j;
    }

    public final ImageView getVideoWatchLaterControl() {
        return this.k;
    }

    public final ActionLinkView h(Context context) {
        ActionLinkView actionLinkView = new ActionLinkView(new ContextThemeWrapper(context, R.style.VkLegacyButton_MediaOverlay8), null, 6);
        actionLinkView.setId(R.id.video_action_link);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388691);
        float f = 8;
        int a2 = iah0.a(f);
        int a3 = iah0.a(f);
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int marginEnd = layoutParams.getMarginEnd();
        layoutParams.setMarginStart(a2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        layoutParams.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = a3;
        actionLinkView.setLayoutParams(layoutParams);
        actionLinkView.setMinimumHeight(iah0.a(30));
        actionLinkView.setPaddingRelative(0, actionLinkView.getPaddingTop(), 0, actionLinkView.getPaddingBottom());
        actionLinkView.setVisibility(8);
        this.t = actionLinkView;
        return actionLinkView;
    }

    public final LinearLayout i(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.video_duration_holder);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a2 = iah0.a(8);
        layoutParams.setMargins(a2, a2, a2, a2);
        layoutParams.gravity = 8388693;
        linearLayout.setLayoutParams(layoutParams);
        DurationView durationView = new DurationView(context, null, 6);
        durationView.setId(R.id.video_duration);
        durationView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.m = durationView;
        linearLayout.addView(durationView);
        SpectatorsCounterView spectatorsCounterView = new SpectatorsCounterView(context, null, 6);
        spectatorsCounterView.setId(R.id.video_spectators);
        spectatorsCounterView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        spectatorsCounterView.setVisibility(8);
        this.o = spectatorsCounterView;
        linearLayout.addView(spectatorsCounterView);
        this.l = linearLayout;
        return linearLayout;
    }

    public final CircularProgressView j(Context context) {
        CircularProgressView circularProgressView = new CircularProgressView(context);
        circularProgressView.setId(R.id.video_loader);
        int a2 = iah0.a(24);
        int a3 = iah0.a(12);
        circularProgressView.setLayoutParams(new FrameLayout.LayoutParams(a2, a2, 8388661));
        bwt0.e0(circularProgressView, 0, a3, a3, 0);
        circularProgressView.setThickness(iah0.a(2));
        circularProgressView.setVisibility(8);
        e3m.a aVar = e3m.a;
        circularProgressView.setColor(context.getColor(R.color.vk_white));
        if (circularProgressView.isAttachedToWindow()) {
            Trace.beginSection("VideoAutoPlayHolderView.createVideoLoaderView.doOnAttach");
            try {
                a.a(circularProgressView);
                s3q0 s3q0Var = s3q0.a;
            } finally {
                Trace.endSection();
            }
        } else {
            circularProgressView.addOnAttachStateChangeListener(new v3s0(circularProgressView, circularProgressView));
        }
        this.w = circularProgressView;
        return circularProgressView;
    }

    public final ImageView k(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.video_play);
        float f = 40;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 17));
        imageView.setVisibility(8);
        imageView.setContentDescription(context.getString(R.string.video_accessibility_play));
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(m33.a(R.drawable.ic_attachment_video_play, context));
        this.q = imageView;
        return imageView;
    }

    public final ProgressBar l(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, android.R.style.Widget.ProgressBar.Horizontal);
        progressBar.setId(R.id.video_progress);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(6.0f), 80));
        progressBar.setIndeterminate(false);
        e3m.a aVar = e3m.a;
        progressBar.setProgressDrawable(m33.a(R.drawable.video_progress_redesign, context));
        float f = -1;
        f4m.u(progressBar, iah0.a(f), 0, iah0.a(f), iah0.a(f));
        progressBar.setVisibility(8);
        this.p = progressBar;
        return progressBar;
    }

    public final ImageView m(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.video_watch_later_control);
        float f = 48;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 8388661));
        float f2 = 12;
        imageView.setPadding(iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2));
        e3m.a aVar = e3m.a;
        imageView.setImageDrawable(enj.c(R.drawable.vk_icon_clock_24, context.getColor(R.color.vk_white), context));
        imageView.setContentDescription(context.getString(R.string.watch_video_later));
        imageView.setVisibility(8);
        this.k = imageView;
        return imageView;
    }

    public final void setVideoActionLink(ActionLinkView actionLinkView) {
        this.t = actionLinkView;
    }

    public final void setVideoComplete(xcs0 xcs0Var) {
        this.r = xcs0Var;
    }

    public final void setVideoDuration(DurationView durationView) {
        this.m = durationView;
    }

    public final void setVideoDurationHolder(LinearLayout linearLayout) {
        this.l = linearLayout;
    }

    public final void setVideoError(VideoErrorView videoErrorView) {
        this.s = videoErrorView;
    }

    public final void setVideoInlineLiveHolder(FrameLayout frameLayout) {
        this.h = frameLayout;
    }

    public final void setVideoInstreamAd(VideoAdLayout videoAdLayout) {
        this.u = videoAdLayout;
    }

    public final void setVideoInteractiveDuration(InteractiveDurationView interactiveDurationView) {
        this.n = interactiveDurationView;
    }

    public final void setVideoLoader(CircularProgressView circularProgressView) {
        this.w = circularProgressView;
    }

    public final void setVideoOverlay(VideoOverlayView videoOverlayView) {
        this.v = videoOverlayView;
    }

    public final void setVideoPlay(ImageView imageView) {
        this.q = imageView;
    }

    public final void setVideoProgress(ProgressBar progressBar) {
        this.p = progressBar;
    }

    public final void setVideoSoundControl(View view) {
        this.i = view;
    }

    public final void setVideoSpectators(SpectatorsCounterView spectatorsCounterView) {
        this.o = spectatorsCounterView;
    }

    public final void setVideoSubtitles(h1n0 h1n0Var) {
        this.f = h1n0Var;
    }

    public final void setVideoSubtitlesControl(View view) {
        this.j = view;
    }

    public final void setVideoWatchLaterControl(ImageView imageView) {
        this.k = imageView;
    }
}
