package com.applovin.impl.sdk.nativeAd;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.b8;
import com.applovin.impl.c1;
import com.applovin.impl.c8;
import com.applovin.impl.d8;
import com.applovin.impl.f8;
import com.applovin.impl.g1;
import com.applovin.impl.g8;
import com.applovin.impl.n7;
import com.applovin.impl.q7;
import com.applovin.impl.r7;
import com.applovin.impl.s0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.w7;
import com.applovin.impl.x7;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.AppLovinVideoBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class AppLovinVastMediaView extends AppLovinMediaView implements AppLovinCommunicatorSubscriber {
    private static final String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final String TAG = "AppLovinVastMediaView";
    private final AtomicBoolean automaticPauseHandled;
    private final AtomicBoolean automaticResumeHandled;
    private final Handler countdownHandler;
    private final c1 countdownManager;
    private ImageView industryIconImageView;
    private final AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private boolean isViewAttached;
    private int lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.b lifecycleCallbacksAdapter;
    private final AtomicBoolean mediaErrorHandled;
    private MediaPlayer mediaPlayer;
    private ImageView muteButtonImageView;
    private ImageView playPauseButtonImageView;
    private FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final r7 vastAd;
    private long videoDurationMillis;
    private final AtomicBoolean videoEndListenerNotified;
    private final Set<b8> videoProgressTrackers;
    private final e videoUiEventHandler;
    private final AppLovinVideoView videoView;
    private boolean videoWasCompleted;
    private LinearLayout videoWidgetLinearLayout;
    private Activity viewActivity;

    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity.equals(AppLovinVastMediaView.this.viewActivity)) {
                AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (!activity.equals(AppLovinVastMediaView.this.viewActivity) || AppLovinVastMediaView.this.isVideoPausedByUser) {
                return;
            }
            AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    class b implements c1.b {
        b() {
        }

        @Override // com.applovin.impl.c1.b
        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis - (AppLovinVastMediaView.this.videoView.getDuration() - AppLovinVastMediaView.this.videoView.getCurrentPosition()));
            int videoPercentViewed = AppLovinVastMediaView.this.getVideoPercentViewed();
            HashSet hashSet = new HashSet();
            Iterator it = new HashSet(AppLovinVastMediaView.this.videoProgressTrackers).iterator();
            while (it.hasNext()) {
                b8 b8Var = (b8) it.next();
                if (b8Var.a(seconds, videoPercentViewed)) {
                    hashSet.add(b8Var);
                    AppLovinVastMediaView.this.videoProgressTrackers.remove(b8Var);
                }
            }
            AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().x();
                return;
            }
            if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().y();
            } else if (videoPercentViewed >= 75) {
                AppLovinVastMediaView.this.vastAd.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.c1.b
        public boolean b() {
            return !AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    private class c implements View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Uri c;
            x7 l1 = AppLovinVastMediaView.this.vastAd.l1();
            if (l1 == null || (c = l1.c()) == null) {
                return;
            }
            p pVar = AppLovinVastMediaView.this.logger;
            if (p.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + c);
            }
            AppLovinVastMediaView.this.maybeFireTrackers(r7.d.INDUSTRY_ICON_CLICK);
            if (!AppLovinVastMediaView.this.nativeAd.isCustomTabsEnabled()) {
                n7.a(c, view.getContext(), AppLovinVastMediaView.this.sdk);
                return;
            }
            g1 A = AppLovinVastMediaView.this.sdk.A();
            AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
            A.a(c, appLovinVastMediaView.nativeAd, appLovinVastMediaView.sdk.w0());
        }

        /* synthetic */ c(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    private class d implements AppLovinTouchToClickListener.OnClickListener {
        private d() {
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(View view, MotionEvent motionEvent) {
            Uri e0;
            AppLovinVastMediaView.this.maybeFireTrackers(r7.d.VIDEO_CLICK);
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().v();
            if (AppLovinVastMediaView.this.vastAd.C0() && (e0 = AppLovinVastMediaView.this.vastAd.e0()) != null) {
                p pVar = AppLovinVastMediaView.this.logger;
                if (p.a()) {
                    AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Clicking through video");
                }
                AppLovinVastMediaView.this.sdk.l().maybeSubmitPersistentPostbacks(AppLovinVastMediaView.this.vastAd.b(motionEvent));
                AppLovinVastMediaView.this.nativeAd.handleNativeAdClick(e0, null, (!((Boolean) AppLovinVastMediaView.this.sdk.a(z4.w)).booleanValue() || AppLovinVastMediaView.this.viewActivity == null) ? AppLovinVastMediaView.this.getContext() : AppLovinVastMediaView.this.viewActivity);
            }
        }

        /* synthetic */ d(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnCompletionListener {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoView.seekTo(0);
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/impl/sdk/nativeAd/AppLovinVastMediaView$e;->onCompletion(Landroid/media/MediaPlayer;)V");
            CreativeInfoManager.onVideoCompleted(h.a, mediaPlayer, "media-player");
            safedk_AppLovinVastMediaView$e_onCompletion_88f7c28abf0dd7120d52ce73cde77146(mediaPlayer);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            AppLovinVastMediaView.this.handleMediaError("Video view error (" + i + "," + i2 + ")");
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i != 3) {
                return false;
            }
            AppLovinVastMediaView.this.countdownManager.b();
            if (AppLovinVastMediaView.this.isViewAttached) {
                return false;
            }
            AppLovinVastMediaView.this.pauseVideo();
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinVastMediaView.this.mediaPlayer = mediaPlayer;
            AppLovinVastMediaView.this.mediaPlayer.setOnInfoListener(AppLovinVastMediaView.this.videoUiEventHandler);
            AppLovinVastMediaView.this.mediaPlayer.setOnErrorListener(AppLovinVastMediaView.this.videoUiEventHandler);
            float f = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
            AppLovinVastMediaView.this.mediaPlayer.setVolume(f, f);
            AppLovinVastMediaView.this.videoDurationMillis = r4.mediaPlayer.getDuration();
            AppLovinVastMediaView.this.vastAd.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(AppLovinVastMediaView.this.videoDurationMillis), q7.e(AppLovinVastMediaView.this.sdk));
            p pVar = AppLovinVastMediaView.this.logger;
            if (p.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + AppLovinVastMediaView.this.mediaPlayer);
            }
            if (AppLovinVastMediaView.this.isViewAttached) {
                AppLovinVideoBridge.VideoViewPlay(AppLovinVastMediaView.this.videoView);
            }
        }

        public void safedk_AppLovinVastMediaView$e_onCompletion_88f7c28abf0dd7120d52ce73cde77146(MediaPlayer p0) {
            p pVar = AppLovinVastMediaView.this.logger;
            if (p.a()) {
                AppLovinVastMediaView.this.logger.a(AppLovinVastMediaView.TAG, "Video completed");
            }
            AppLovinVastMediaView.this.videoWasCompleted = true;
            AppLovinVastMediaView.this.finishVideo();
            if (AppLovinVastMediaView.this.replayIconContainer != null) {
                g8.a(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$e$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppLovinVastMediaView.e.this.a();
                    }
                });
            } else {
                AppLovinVastMediaView.this.showMediaImageView();
            }
        }

        /* synthetic */ e(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements View.OnClickListener {
        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            AppLovinVastMediaView.this.videoWasCompleted = false;
            AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            AppLovinVastMediaView.this.sdk.e().a(AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            AppLovinVastMediaView.this.maybeHandleResume();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (AppLovinVastMediaView.this.videoView.isPlaying()) {
                    AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view != AppLovinVastMediaView.this.muteButtonImageView) {
                if (view == AppLovinVastMediaView.this.replayIconContainer) {
                    g8.b(AppLovinVastMediaView.this.replayIconContainer, AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$f$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            AppLovinVastMediaView.f.this.a();
                        }
                    });
                }
            } else {
                if (AppLovinVastMediaView.this.mediaPlayer == null) {
                    return;
                }
                try {
                    AppLovinVastMediaView.this.isVideoMuted = !r4.isVideoMuted;
                    float f = !AppLovinVastMediaView.this.isVideoMuted ? 1 : 0;
                    AppLovinVastMediaView.this.mediaPlayer.setVolume(f, f);
                    AppLovinVastMediaView appLovinVastMediaView = AppLovinVastMediaView.this;
                    appLovinVastMediaView.populateMuteImage(appLovinVastMediaView.isVideoMuted);
                } catch (Throwable unused) {
                }
            }
        }

        /* synthetic */ f(AppLovinVastMediaView appLovinVastMediaView, a aVar) {
            this();
        }
    }

    public AppLovinVastMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, l lVar, Context context) {
        super(appLovinNativeAdImpl, lVar, context);
        a aVar = null;
        e eVar = new e(this, aVar);
        this.videoUiEventHandler = eVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new c1(handler, this.sdk);
        this.videoEndListenerNotified = new AtomicBoolean();
        this.mediaErrorHandled = new AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new AtomicBoolean();
        this.automaticPauseHandled = new AtomicBoolean();
        this.automaticResumeHandled = new AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1;
        HashSet hashSet = new HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new a();
        r7 vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean D0 = vastAd.D0();
        this.isVideoStream = D0;
        if (D0) {
            AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        if (vastAd.r1()) {
            this.industryIconImageView = x7.a(vastAd.l1().e(), context, lVar);
            int dpToPx = AppLovinSdkUtils.dpToPx(context, ((Integer) lVar.a(z4.b5)).intValue());
            this.industryIconImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) lVar.a(z4.d5)).intValue()));
            this.industryIconImageView.setOnClickListener(new c(this, aVar));
            addView(this.industryIconImageView);
        }
        if (((Boolean) lVar.a(z4.i5)).booleanValue()) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            int i = 0;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((Float) lVar.a(z4.h5)).floatValue());
            ImageView imageView = new ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            f fVar = new f(this, aVar);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int dpToPx2 = AppLovinSdkUtils.dpToPx(context, ((Integer) lVar.a(z4.f5)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2, dpToPx2));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                i = AppLovinSdkUtils.dpToPx(context, ((Integer) lVar.a(z4.e5)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            }
            int dpToPx3 = AppLovinSdkUtils.dpToPx(context, ((Integer) lVar.a(z4.g5)).intValue());
            this.videoWidgetLinearLayout.setPadding(dpToPx3, dpToPx3, dpToPx3, dpToPx3);
            int i2 = dpToPx3 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(dpToPx2 + i + i2, Math.max(dpToPx2, i) + i2, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((Boolean) lVar.a(z4.j5)).booleanValue()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            this.replayIconContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new f(this, aVar));
            ImageView imageView2 = new ImageView(getContext());
            int dpToPx4 = AppLovinSdkUtils.dpToPx(context, ((Integer) lVar.a(z4.k5)).intValue());
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(dpToPx4, dpToPx4, 17));
            imageView2.setImageResource(R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        AppLovinVideoView appLovinVideoView = new AppLovinVideoView(getContext());
        this.videoView = appLovinVideoView;
        appLovinVideoView.setOnPreparedListener(eVar);
        appLovinVideoView.setOnCompletionListener(eVar);
        appLovinVideoView.setOnErrorListener(eVar);
        appLovinVideoView.setOnTouchListener(new AppLovinTouchToClickListener(lVar, z4.f0, getContext(), new d(this, aVar)));
        addView(appLovinVideoView);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(appLovinVideoView);
        hashSet.addAll(vastAd.a(r7.d.VIDEO, c8.a));
    }

    private void areCachedAdResourcesMissing(boolean z) {
        if (q7.a(z, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(r7.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.l().trackVideoEnd(this.vastAd, TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        int currentPosition = this.videoView.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(String str) {
        if (p.a()) {
            this.logger.b(TAG, str);
        }
        maybeFireTrackers(r7.d.ERROR, w7.MEDIA_FILE_ERROR);
        this.vastAd.getAdEventTracker().b(str);
        if (this.mediaErrorHandled.compareAndSet(false, true)) {
            this.sdk.E().a("handleVastVideoError", str, this.vastAd);
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (p.a()) {
            this.logger.b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.h0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (p.a()) {
            this.logger.k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(Set<b8> set) {
        maybeFireTrackers(set, w7.UNSPECIFIED);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.r1()) {
                maybeFireTrackers(r7.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = SystemClock.elapsedRealtime();
            maybeFireTrackers(r7.d.IMPRESSION);
            maybeFireTrackers(r7.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().g();
            this.vastAd.setHasShown(true);
            this.sdk.l().trackImpression(this.vastAd);
            this.viewActivity = com.applovin.impl.d.a(g8.b(this));
            this.sdk.e().a(this.lifecycleCallbacksAdapter);
            AppLovinVideoBridge.VideoViewPlay(this.videoView);
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, TimeUnit.SECONDS.toMillis(1L), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(r7.d.VIDEO, "pause");
            this.vastAd.getAdEventTracker().z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(r7.d.VIDEO, "resume");
            this.vastAd.getAdEventTracker().A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (p.a()) {
                    this.logger.a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                AppLovinVideoBridge.VideoViewPlay(this.videoView);
                this.countdownManager.b();
                this.lastVideoPositionFromPauseMillis = -1;
            } else if (p.a()) {
                this.logger.a(TAG, "Invalid last video position");
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pauseVideo() {
        if (p.a()) {
            this.logger.a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.videoView.getCurrentPosition();
        AppLovinVideoBridge.VideoViewPause(this.videoView);
        this.countdownManager.c();
        if (p.a()) {
            this.logger.a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(z ? R.drawable.applovin_ic_unmute_to_mute : R.drawable.applovin_ic_mute_to_unmute);
        if (animatedVectorDrawable != null) {
            this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
            animatedVectorDrawable.start();
            return true;
        }
        Uri I = z ? this.vastAd.I() : this.vastAd.d0();
        if (I == null) {
            return false;
        }
        ImageViewUtils.setImageUri(this.muteButtonImageView, I, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z) {
        ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z ? R.drawable.applovin_ic_play_icon : R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        areCachedAdResourcesMissing(!this.isVideoStream);
        AppLovinVideoBridge.VideoViewSetVideoUri(this.videoView, this.vastAd.n0());
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            AppLovinVideoBridge.VideoViewPause(appLovinVideoView);
            AppLovinVideoBridge.VideoViewStop(this.videoView);
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            AppLovinVideoBridge.MediaPlayerRelease(mediaPlayer);
        }
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isViewAttached = true;
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isViewAttached = false;
        maybeHandlePause();
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong(CreativeInfo.c) == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i = messageData.getInt("load_response_code");
                String string = messageData.getString("load_exception_message");
                if ((string == null && !s0.a(i)) || this.videoWasCompleted || this.videoView.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(r7.d dVar) {
        maybeFireTrackers(dVar, w7.UNSPECIFIED);
    }

    private void maybeFireTrackers(r7.d dVar, String str) {
        maybeFireTrackers(dVar, str, w7.UNSPECIFIED);
    }

    private void maybeFireTrackers(r7.d dVar, w7 w7Var) {
        maybeFireTrackers(dVar, "", w7Var);
    }

    private void maybeFireTrackers(r7.d dVar, String str, w7 w7Var) {
        maybeFireTrackers((Set<b8>) this.vastAd.a(dVar, str), w7Var);
    }

    private void maybeFireTrackers(Set<b8> set, w7 w7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        f8 q1 = this.vastAd.q1();
        Uri d2 = q1 != null ? q1.d() : null;
        if (p.a()) {
            this.logger.a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        d8.a(set, seconds, d2, w7Var, this.sdk);
    }
}
