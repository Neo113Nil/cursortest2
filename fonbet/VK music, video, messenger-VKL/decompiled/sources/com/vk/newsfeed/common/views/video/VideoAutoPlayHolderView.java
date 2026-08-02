package com.vk.newsfeed.common.views.video;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.ui.CircularProgressView;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.libvideo.design.view.ad.VideoAdLayout;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.error.VideoErrorView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.design.view.spectators.SpectatorsCounterView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.player.subtitles.NoStyleSubtitleView;
import com.vk.newsfeed.common.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.e3m;
import xsna.enj;
import xsna.fxc0;
import xsna.h1n0;
import xsna.hv1;
import xsna.iah0;
import xsna.m33;
import xsna.s3q0;
import xsna.xcs0;

/* compiled from: VideoAutoPlayHolderView.kt */
/* loaded from: classes4.dex */
public final class VideoAutoPlayHolderView extends RatioFrameLayout {
    public static final /* synthetic */ int y = 0;
    public VideoTextureView e;
    public h1n0 f;
    public FrescoImageView g;
    public FrameLayout h;
    public View i;
    public View j;
    public LinearLayout k;
    public DurationView l;
    public InteractiveDurationView m;
    public SpectatorsCounterView n;
    public ProgressBar o;
    public ImageView p;
    public xcs0 q;
    public VideoErrorView r;
    public ActionLinkView s;
    public ViewStub t;
    public VideoAdLayout u;
    public VideoOverlayView v;
    public CircularProgressView w;
    public DonutBadge x;

    public VideoAutoPlayHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final DonutBadge getDonutBadge() {
        DonutBadge donutBadge = this.x;
        if (donutBadge != null) {
            return donutBadge;
        }
        return null;
    }

    public final ActionLinkView getVideoActionLink() {
        ActionLinkView actionLinkView = this.s;
        if (actionLinkView != null) {
            return actionLinkView;
        }
        return null;
    }

    public final ViewStub getVideoClipOverlayStub() {
        ViewStub viewStub = this.t;
        if (viewStub != null) {
            return viewStub;
        }
        return null;
    }

    public final xcs0 getVideoComplete() {
        xcs0 xcs0Var = this.q;
        if (xcs0Var != null) {
            return xcs0Var;
        }
        return null;
    }

    public final VideoTextureView getVideoDisplay() {
        VideoTextureView videoTextureView = this.e;
        if (videoTextureView != null) {
            return videoTextureView;
        }
        return null;
    }

    public final DurationView getVideoDuration() {
        DurationView durationView = this.l;
        if (durationView != null) {
            return durationView;
        }
        return null;
    }

    public final LinearLayout getVideoDurationHolder() {
        LinearLayout linearLayout = this.k;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final VideoErrorView getVideoError() {
        VideoErrorView videoErrorView = this.r;
        if (videoErrorView != null) {
            return videoErrorView;
        }
        return null;
    }

    public final FrameLayout getVideoInlineLiveHolder() {
        FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    public final VideoAdLayout getVideoInstreamAd() {
        VideoAdLayout videoAdLayout = this.u;
        if (videoAdLayout != null) {
            return videoAdLayout;
        }
        return null;
    }

    public final InteractiveDurationView getVideoInteractiveDuration() {
        InteractiveDurationView interactiveDurationView = this.m;
        if (interactiveDurationView != null) {
            return interactiveDurationView;
        }
        return null;
    }

    public final CircularProgressView getVideoLoader() {
        CircularProgressView circularProgressView = this.w;
        if (circularProgressView != null) {
            return circularProgressView;
        }
        return null;
    }

    public final VideoOverlayView getVideoOverlay() {
        VideoOverlayView videoOverlayView = this.v;
        if (videoOverlayView != null) {
            return videoOverlayView;
        }
        return null;
    }

    public final ImageView getVideoPlay() {
        ImageView imageView = this.p;
        if (imageView != null) {
            return imageView;
        }
        return null;
    }

    public final FrescoImageView getVideoPreview() {
        FrescoImageView frescoImageView = this.g;
        if (frescoImageView != null) {
            return frescoImageView;
        }
        return null;
    }

    public final ProgressBar getVideoProgress() {
        ProgressBar progressBar = this.o;
        if (progressBar != null) {
            return progressBar;
        }
        return null;
    }

    public final View getVideoSoundControl() {
        View view = this.i;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final SpectatorsCounterView getVideoSpectators() {
        SpectatorsCounterView spectatorsCounterView = this.n;
        if (spectatorsCounterView != null) {
            return spectatorsCounterView;
        }
        return null;
    }

    public final h1n0 getVideoSubtitles() {
        h1n0 h1n0Var = this.f;
        if (h1n0Var != null) {
            return h1n0Var;
        }
        return null;
    }

    public final View getVideoWatchLaterControl() {
        View view = this.j;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final DonutBadge h(Context context) {
        DonutBadge donutBadge = new DonutBadge(context, null, 6);
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
        donutBadge.setLayoutParams(layoutParams);
        donutBadge.setVisibility(8);
        setDonutBadge(donutBadge);
        return donutBadge;
    }

    public final ActionLinkView i(Context context) {
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
        setVideoActionLink(actionLinkView);
        return actionLinkView;
    }

    public final LinearLayout j(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.video_duration_holder);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 48);
        int a2 = iah0.a(8);
        layoutParams.setMargins(a2, a2, a2, a2);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setVisibility(8);
        DurationView durationView = new DurationView(context, null, 6);
        durationView.setId(R.id.video_duration);
        durationView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setVideoDuration(durationView);
        linearLayout.addView(durationView);
        SpectatorsCounterView spectatorsCounterView = new SpectatorsCounterView(context, null, 6);
        spectatorsCounterView.setId(R.id.video_spectators);
        spectatorsCounterView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        spectatorsCounterView.setVisibility(8);
        setVideoSpectators(spectatorsCounterView);
        linearLayout.addView(spectatorsCounterView);
        setVideoDurationHolder(linearLayout);
        return linearLayout;
    }

    public final ImageView k(Context context) {
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
        setVideoWatchLaterControl(imageView);
        return imageView;
    }

    public final void setDonutBadge(DonutBadge donutBadge) {
        this.x = donutBadge;
    }

    public final void setVideoActionLink(ActionLinkView actionLinkView) {
        this.s = actionLinkView;
    }

    public final void setVideoClipOverlayStub(ViewStub viewStub) {
        this.t = viewStub;
    }

    public final void setVideoComplete(xcs0 xcs0Var) {
        this.q = xcs0Var;
    }

    public final void setVideoDisplay(VideoTextureView videoTextureView) {
        this.e = videoTextureView;
    }

    public final void setVideoDuration(DurationView durationView) {
        this.l = durationView;
    }

    public final void setVideoDurationHolder(LinearLayout linearLayout) {
        this.k = linearLayout;
    }

    public final void setVideoError(VideoErrorView videoErrorView) {
        this.r = videoErrorView;
    }

    public final void setVideoInlineLiveHolder(FrameLayout frameLayout) {
        this.h = frameLayout;
    }

    public final void setVideoInstreamAd(VideoAdLayout videoAdLayout) {
        this.u = videoAdLayout;
    }

    public final void setVideoInteractiveDuration(InteractiveDurationView interactiveDurationView) {
        this.m = interactiveDurationView;
    }

    public final void setVideoLoader(CircularProgressView circularProgressView) {
        this.w = circularProgressView;
    }

    public final void setVideoOverlay(VideoOverlayView videoOverlayView) {
        this.v = videoOverlayView;
    }

    public final void setVideoPlay(ImageView imageView) {
        this.p = imageView;
    }

    public final void setVideoPreview(FrescoImageView frescoImageView) {
        this.g = frescoImageView;
    }

    public final void setVideoProgress(ProgressBar progressBar) {
        this.o = progressBar;
    }

    public final void setVideoSoundControl(View view) {
        this.i = view;
    }

    public final void setVideoSpectators(SpectatorsCounterView spectatorsCounterView) {
        this.n = spectatorsCounterView;
    }

    public final void setVideoSubtitles(h1n0 h1n0Var) {
        this.f = h1n0Var;
    }

    public final void setVideoWatchLaterControl(View view) {
        this.j = view;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoAutoPlayHolderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, r3, 0);
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        setId(R.id.video_wrap);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setContentDescription(context.getString(R.string.accessibility_video));
        setBackground(m33.a(R.color.vk_black, getContext()));
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.j, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        int integer = obtainStyledAttributes.getInteger(0, 15);
        obtainStyledAttributes.recycle();
        Trace.beginSection("VideoAutoPlayHolderView.addChildren");
        try {
            VideoTextureView b = a.b(getContext());
            setVideoDisplay(b);
            addView(b);
            NoStyleSubtitleView noStyleSubtitleView = new NoStyleSubtitleView(getContext(), null);
            noStyleSubtitleView.setId(R.id.video_subtitles);
            noStyleSubtitleView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            noStyleSubtitleView.setVisibility(8);
            noStyleSubtitleView.setBottomMarginOverride(Integer.valueOf(iah0.a(40)));
            setVideoSubtitles(noStyleSubtitleView);
            addView(noStyleSubtitleView);
            FrescoImageView g = a.g(getContext());
            setVideoPreview(g);
            addView(g);
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setId(R.id.video_inline_live_holder);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setVideoInlineLiveHolder(frameLayout);
            addView(frameLayout);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setId(R.id.video_controls_layout);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            linearLayout.setLayoutParams(layoutParams);
            if ((integer & 1) == 1) {
                linearLayout.addView(k(linearLayout.getContext()));
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
                setVideoSoundControl(view);
                linearLayout.addView(view);
            }
            if ((integer & 4) == 4) {
                Context context3 = linearLayout.getContext();
                View view2 = new View(context3);
                view2.setId(R.id.video_sound_control);
                float f2 = 48;
                view2.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f2), iah0.a(f2), 8388661));
                e3m.a aVar2 = e3m.a;
                view2.setBackground(m33.a(R.drawable.ic_sound_off_shadow_48, context3));
                view2.setContentDescription(null);
                view2.setVisibility(8);
                setVideoSoundControl(view2);
                linearLayout.addView(view2);
            }
            addView(linearLayout);
            addView(j(getContext()));
            Context context4 = getContext();
            InteractiveDurationView interactiveDurationView = new InteractiveDurationView(context4, null, 6);
            interactiveDurationView.setId(R.id.video_interactive_duration);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
            int a2 = iah0.a(8);
            layoutParams2.setMargins(a2, a2, a2, a2);
            interactiveDurationView.setLayoutParams(layoutParams2);
            e3m.a aVar3 = e3m.a;
            interactiveDurationView.setBackground(m33.a(R.drawable.bg_interactiv_video_duration_label_rounded_4, context4));
            setVideoInteractiveDuration(interactiveDurationView);
            addView(interactiveDurationView);
            if (z) {
                Context context5 = getContext();
                ProgressBar progressBar = new ProgressBar(context5, null, android.R.style.Widget.ProgressBar.Horizontal);
                progressBar.setId(R.id.video_progress);
                progressBar.setLayoutParams(new FrameLayout.LayoutParams(-1, iah0.a(2.5f), 80));
                progressBar.setIndeterminate(false);
                progressBar.setProgressDrawable(m33.a(R.drawable.progress_video_feed, context5));
                progressBar.setVisibility(8);
                setVideoProgress(progressBar);
                addView(progressBar);
            }
            ImageView f3 = a.f(getContext());
            setVideoPlay(f3);
            addView(f3);
            xcs0 xcs0Var = new xcs0(getContext(), null, null, 62);
            xcs0Var.setId(R.id.video_complete_view);
            xcs0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            xcs0Var.setVisibility(8);
            setVideoComplete(xcs0Var);
            addView(xcs0Var);
            VideoErrorView c = a.c(getContext());
            setVideoError(c);
            addView(c);
            if ((integer & 8) == 8) {
                addView(i(getContext()));
            }
            ViewStub viewStub = new ViewStub(getContext(), R.layout.attach_video_clip_overlay);
            viewStub.setId(R.id.video_clip_overlay_stub);
            viewStub.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewStub.setVisibility(8);
            setVideoClipOverlayStub(viewStub);
            addView(viewStub);
            VideoAdLayout videoAdLayout = new VideoAdLayout(getContext(), null, 6);
            videoAdLayout.setId(R.id.video_instream_ad);
            videoAdLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            videoAdLayout.setVisibility(8);
            setVideoInstreamAd(videoAdLayout);
            addView(videoAdLayout);
            VideoOverlayView e = a.e(getContext());
            setVideoOverlay(e);
            addView(e);
            addView(h(getContext()));
            CircularProgressView d = a.d(getContext());
            setVideoLoader(d);
            addView(d);
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* compiled from: VideoAutoPlayHolderView.kt */
    public static final class a {
        public static final void a(CircularProgressView circularProgressView) {
            int i = VideoAutoPlayHolderView.y;
            if (fxc0.B().J().O()) {
                circularProgressView.post(new hv1(circularProgressView, 20));
            } else {
                circularProgressView.setIndeterminate(true);
                circularProgressView.b();
            }
        }

        public static VideoTextureView b(Context context) {
            VideoTextureView videoTextureView = new VideoTextureView(context, null, 6, 0);
            videoTextureView.setId(R.id.video_display);
            videoTextureView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            return videoTextureView;
        }

        public static VideoErrorView c(Context context) {
            VideoErrorView videoErrorView = new VideoErrorView(context, null, 6);
            videoErrorView.setId(R.id.video_error);
            videoErrorView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            videoErrorView.setShouldBindOnlyWhenVisible(fxc0.B().J().O());
            videoErrorView.setVisibility(8);
            return videoErrorView;
        }

        public static CircularProgressView d(Context context) {
            CircularProgressView circularProgressView = new CircularProgressView(context);
            circularProgressView.setId(R.id.video_loader);
            int a = iah0.a(24);
            int a2 = iah0.a(12);
            circularProgressView.setLayoutParams(new FrameLayout.LayoutParams(a, a, 8388661));
            bwt0.e0(circularProgressView, 0, a2, a2, 0);
            circularProgressView.setThickness(iah0.a(2));
            circularProgressView.setVisibility(8);
            e3m.a aVar = e3m.a;
            circularProgressView.setColor(context.getColor(R.color.vk_white));
            if (!circularProgressView.isAttachedToWindow()) {
                circularProgressView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1377a(circularProgressView, circularProgressView));
                return circularProgressView;
            }
            Trace.beginSection("VideoAutoPlayHolderView.createVideoLoaderView.doOnAttach");
            try {
                int i = VideoAutoPlayHolderView.y;
                a(circularProgressView);
                s3q0 s3q0Var = s3q0.a;
                return circularProgressView;
            } finally {
                Trace.endSection();
            }
        }

        public static VideoOverlayView e(Context context) {
            VideoOverlayView videoOverlayView = new VideoOverlayView(context, VideoOverlayView.VideoRestrictionSize.MEDIUM);
            videoOverlayView.setId(R.id.video_overlay);
            videoOverlayView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            videoOverlayView.setVisibility(8);
            return videoOverlayView;
        }

        public static ImageView f(Context context) {
            ImageView imageView = new ImageView(context);
            imageView.setId(R.id.video_play);
            float f = 40;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(iah0.a(f), iah0.a(f), 17));
            imageView.setVisibility(8);
            imageView.setContentDescription(context.getString(R.string.video_accessibility_play));
            e3m.a aVar = e3m.a;
            imageView.setImageDrawable(m33.a(R.drawable.ic_attachment_video_play, context));
            return imageView;
        }

        public static FrescoImageView g(Context context) {
            FrescoImageView frescoImageView = new FrescoImageView(context, null, 6, 0);
            frescoImageView.setId(R.id.video_preview);
            frescoImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            frescoImageView.setContentDescription(null);
            return frescoImageView;
        }

        /* compiled from: View.kt */
        /* renamed from: com.vk.newsfeed.common.views.video.VideoAutoPlayHolderView$a$a, reason: collision with other inner class name */
        public static final class ViewOnAttachStateChangeListenerC1377a implements View.OnAttachStateChangeListener {
            public final /* synthetic */ CircularProgressView b;
            public final /* synthetic */ CircularProgressView c;

            public ViewOnAttachStateChangeListenerC1377a(CircularProgressView circularProgressView, CircularProgressView circularProgressView2) {
                this.b = circularProgressView;
                this.c = circularProgressView2;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                this.b.removeOnAttachStateChangeListener(this);
                Trace.beginSection("VideoAutoPlayHolderView.createVideoLoaderView.doOnAttach");
                try {
                    int i = VideoAutoPlayHolderView.y;
                    a.a(this.c);
                    s3q0 s3q0Var = s3q0.a;
                } finally {
                    Trace.endSection();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
