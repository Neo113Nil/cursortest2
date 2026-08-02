package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.appevents.UserDataStore;
import com.getcapacitor.PluginMethod;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import com.safedk.android.internal.partials.LiftoffMonetizeVideoBridge;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.nativead.NativeVideoContract;
import io.sentry.Session;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: AdVideoView.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\b\u0000\u0018\u0000 z2\u00020\u00012\u00020\u0002:\u0003z{|B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020AH\u0002J\b\u0010C\u001a\u00020AH\u0002J\b\u0010D\u001a\u00020AH\u0002J\b\u0010E\u001a\u00020AH\u0002J\b\u0010F\u001a\u00020AH\u0002J\b\u0010G\u001a\u00020AH\u0002J\b\u0010H\u001a\u00020AH\u0002J\u0006\u0010I\u001a\u00020\rJ\u0006\u0010J\u001a\u00020\rJ\u0006\u0010K\u001a\u00020\tJ\b\u0010L\u001a\u00020\tH\u0002J\b\u0010M\u001a\u00020AH\u0002J\u0018\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020\r2\u0006\u0010P\u001a\u00020QH\u0002J\u0010\u0010R\u001a\u00020A2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010S\u001a\u00020AH\u0002J\b\u0010T\u001a\u00020AH\u0002J\u0010\u0010U\u001a\u00020A2\u0006\u0010V\u001a\u00020\rH\u0002J\b\u0010W\u001a\u00020AH\u0014J\b\u0010X\u001a\u00020AH\u0014J \u0010Y\u001a\u00020A2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\rH\u0016J\u0010\u0010^\u001a\u00020\t2\u0006\u0010Z\u001a\u00020[H\u0016J \u0010_\u001a\u00020A2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\r2\u0006\u0010]\u001a\u00020\rH\u0016J\u0010\u0010`\u001a\u00020A2\u0006\u0010Z\u001a\u00020[H\u0016J\u0006\u0010a\u001a\u00020AJ\b\u0010b\u001a\u00020AH\u0002J\r\u0010c\u001a\u00020AH\u0000¢\u0006\u0002\bdJ\u0006\u0010e\u001a\u00020AJ\r\u0010f\u001a\u00020AH\u0000¢\u0006\u0002\bgJ\b\u0010h\u001a\u00020AH\u0002J\u0006\u0010i\u001a\u00020AJ\u000e\u0010j\u001a\u00020A2\u0006\u0010k\u001a\u00020\rJ\u0018\u0010l\u001a\u00020A2\u0006\u0010m\u001a\u00020\t2\b\b\u0002\u0010n\u001a\u00020>J\u000e\u0010o\u001a\u00020A2\u0006\u0010p\u001a\u00020\tJ\u000e\u0010q\u001a\u00020A2\u0006\u0010r\u001a\u00020\tJ\u000e\u0010s\u001a\u00020A2\u0006\u0010t\u001a\u00020(J\u000e\u0010u\u001a\u00020A2\u0006\u0010v\u001a\u00020\u000bJ\u0017\u0010w\u001a\u00020A2\b\u0010\n\u001a\u0004\u0018\u00010;H\u0000¢\u0006\u0002\bxJ\u0006\u0010y\u001a\u00020AR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010)\u001a\u0004\u0018\u00010*8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00100\u001a\u0002018\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u000e\u00107\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "autoVisibility", "", PluginMethod.RETURN_CALLBACK, "Lcom/vungle/ads/nativead/NativeVideoContract$VideoLifecycleCallback;", "durationMs", "", "handler", "Landroid/os/Handler;", "lastPosMs", "lastProgressSent", "layoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "looping", "mediaPlayerFactory", "Lkotlin/Function0;", "Landroid/media/MediaPlayer;", "getMediaPlayerFactory$vungle_ads_release$annotations", "()V", "getMediaPlayerFactory$vungle_ads_release", "()Lkotlin/jvm/functions/Function0;", "setMediaPlayerFactory$vungle_ads_release", "(Lkotlin/jvm/functions/Function0;)V", "mp", "muted", "prepared", "Ljava/util/concurrent/atomic/AtomicBoolean;", "preparing", "progressUpdater", "Lcom/vungle/ads/internal/ui/view/AdVideoView$ProgressUpdateRunnable;", "scrollListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "sourceUri", "Landroid/net/Uri;", "surface", "Landroid/view/Surface;", "getSurface$vungle_ads_release$annotations", "getSurface$vungle_ads_release", "()Landroid/view/Surface;", "setSurface$vungle_ads_release", "(Landroid/view/Surface;)V", "texture", "Landroid/view/TextureView;", "getTexture$vungle_ads_release$annotations", "getTexture$vungle_ads_release", "()Landroid/view/TextureView;", "setTexture$vungle_ads_release", "(Landroid/view/TextureView;)V", h.al, "videoH", "videoPaused", "videoTransformCallback", "Lcom/vungle/ads/internal/ui/view/AdVideoView$VideoTransformCallback;", "videoW", "visibilityThreshold", "", "wantPlay", "applyMute", "", "applyTransform", "beginProgressUpdates", "calculateAndNotifyProgress", "checkVisibility", "detachSurface", "endProgressUpdates", "ensurePlayer", "getCurrentPositionMs", "getDurationMs", "isMuted", "isVisibleEnough", "notifyCompleted", "notifyError", "what", "extra", "", "notifyMuted", "notifyPause", "notifyPlay", "notifyProgress", "percentage", "onAttachedToWindow", "onDetachedFromWindow", "onSurfaceTextureAvailable", UserDataStore.STATE, "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureDestroyed", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "pause", "pauseInternal", "pauseOnActivityPaused", "pauseOnActivityPaused$vungle_ads_release", "play", "playOnActivityResumed", "playOnActivityResumed$vungle_ads_release", "prepareIfNeeded", "release", "seekTo", "ms", "setAutoVisibility", "enabled", "threshold", "setLooping", "loop", "setMuted", "mute", "setSource", "uri", "setVideoLifecycleCallback", "lifecycleCallback", "setVideoTransformCallback", "setVideoTransformCallback$vungle_ads_release", "stop", k.M, "ProgressUpdateRunnable", "VideoTransformCallback", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AdVideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final int ERROR_VIDEO_PLAYBACK_FAILED = -2;
    public static final int ERROR_VIDEO_PREPARE_FAILED = -1;
    private static final long PROGRESS_INTERVAL_MS = 1000;
    private static final String TAG = "NativeAd-Video";
    private boolean autoVisibility;
    private NativeVideoContract.VideoLifecycleCallback callback;
    private int durationMs;
    private final Handler handler;
    private int lastPosMs;
    private int lastProgressSent;
    private final ViewTreeObserver.OnGlobalLayoutListener layoutListener;
    private boolean looping;
    private Function0<? extends MediaPlayer> mediaPlayerFactory;
    private MediaPlayer mp;
    private boolean muted;
    private AtomicBoolean prepared;
    private AtomicBoolean preparing;
    private final ProgressUpdateRunnable progressUpdater;
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    private Uri sourceUri;
    private Surface surface;
    private TextureView texture;
    private boolean videoCompleted;
    private int videoH;
    private boolean videoPaused;
    private VideoTransformCallback videoTransformCallback;
    private int videoW;
    private float visibilityThreshold;
    private boolean wantPlay;

    /* compiled from: AdVideoView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$VideoTransformCallback;", "", "onVideoTransformed", "", "left", "", "top", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface VideoTransformCallback {
        void onVideoTransformed(float left, float top);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdVideoView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getMediaPlayerFactory$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getSurface$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getTexture$vungle_ads_release$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.d, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture st) {
        Intrinsics.checkNotNullParameter(st, "st");
    }

    public /* synthetic */ AdVideoView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.scrollListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AdVideoView.m10743scrollListener$lambda0(AdVideoView.this);
            }
        };
        this.layoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AdVideoView.m10742layoutListener$lambda1(AdVideoView.this);
            }
        };
        this.visibilityThreshold = 0.01f;
        TextureView textureView = new TextureView(context);
        textureView.setSurfaceTextureListener(this);
        this.texture = textureView;
        this.prepared = new AtomicBoolean(false);
        this.preparing = new AtomicBoolean(false);
        this.lastProgressSent = -1;
        this.handler = new Handler(Looper.getMainLooper());
        this.progressUpdater = new ProgressUpdateRunnable(this);
        this.mediaPlayerFactory = new Function0<MediaPlayer>() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$mediaPlayerFactory$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MediaPlayer invoke() {
                return new MediaPlayer();
            }
        };
        setClickable(false);
        setFocusable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.texture, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scrollListener$lambda-0, reason: not valid java name */
    public static final void m10743scrollListener$lambda0(AdVideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: layoutListener$lambda-1, reason: not valid java name */
    public static final void m10742layoutListener$lambda1(AdVideoView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.checkVisibility();
    }

    /* renamed from: getTexture$vungle_ads_release, reason: from getter */
    public final TextureView getTexture() {
        return this.texture;
    }

    public final void setTexture$vungle_ads_release(TextureView textureView) {
        Intrinsics.checkNotNullParameter(textureView, "<set-?>");
        this.texture = textureView;
    }

    /* renamed from: getSurface$vungle_ads_release, reason: from getter */
    public final Surface getSurface() {
        return this.surface;
    }

    public final void setSurface$vungle_ads_release(Surface surface) {
        this.surface = surface;
    }

    public final Function0<MediaPlayer> getMediaPlayerFactory$vungle_ads_release() {
        return this.mediaPlayerFactory;
    }

    public final void setMediaPlayerFactory$vungle_ads_release(Function0<? extends MediaPlayer> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.mediaPlayerFactory = function0;
    }

    /* compiled from: AdVideoView.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00030\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/ui/view/AdVideoView$ProgressUpdateRunnable;", "Ljava/lang/Runnable;", "adVideoView", "Lcom/vungle/ads/internal/ui/view/AdVideoView;", "(Lcom/vungle/ads/internal/ui/view/AdVideoView;)V", "weakRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "run", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class ProgressUpdateRunnable implements Runnable {
        private final WeakReference<AdVideoView> weakRef;

        public ProgressUpdateRunnable(AdVideoView adVideoView) {
            Intrinsics.checkNotNullParameter(adVideoView, "adVideoView");
            this.weakRef = new WeakReference<>(adVideoView);
        }

        @Override // java.lang.Runnable
        public void run() {
            MediaPlayer mediaPlayer;
            AdVideoView adVideoView = this.weakRef.get();
            if (adVideoView == null) {
                return;
            }
            adVideoView.calculateAndNotifyProgress();
            if (!adVideoView.prepared.get() || (mediaPlayer = adVideoView.mp) == null || !mediaPlayer.isPlaying() || adVideoView.videoCompleted) {
                return;
            }
            adVideoView.handler.postDelayed(this, 1000L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Logger.INSTANCE.d(TAG, "onAttachedToWindow()");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().addOnGlobalLayoutListener(this.layoutListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Logger.INSTANCE.d(TAG, "onDetachedFromWindow()");
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollListener);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.layoutListener);
        pauseInternal();
        detachSurface();
    }

    public final void setVideoLifecycleCallback(NativeVideoContract.VideoLifecycleCallback lifecycleCallback) {
        Intrinsics.checkNotNullParameter(lifecycleCallback, "lifecycleCallback");
        this.callback = lifecycleCallback;
    }

    public final void setVideoTransformCallback$vungle_ads_release(VideoTransformCallback callback) {
        this.videoTransformCallback = callback;
    }

    public final void setSource(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.sourceUri = uri;
        this.prepared.set(false);
        this.preparing.set(false);
        this.videoW = 0;
        this.videoH = 0;
        prepareIfNeeded();
    }

    public final void playOnActivityResumed$vungle_ads_release() {
        if (this.wantPlay && this.videoPaused && !this.videoCompleted) {
            play();
        }
    }

    public final void play() {
        Surface surface;
        this.wantPlay = true;
        this.videoPaused = false;
        this.videoCompleted = false;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder append = new StringBuilder("play(): prepared=").append(this.prepared).append(", surfaceValid=");
        Surface surface2 = this.surface;
        companion.d(TAG, append.append(surface2 != null ? Boolean.valueOf(surface2.isValid()) : null).append(", visible=").append(isVisibleEnough()).toString());
        if (this.prepared.get() && (surface = this.surface) != null && surface.isValid() && isVisibleEnough()) {
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                Logger.Companion companion2 = Logger.INSTANCE;
                StringBuilder sb = new StringBuilder("play(): pos=");
                MediaPlayer mediaPlayer2 = this.mp;
                companion2.d(TAG, sb.append(mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.getCurrentPosition()) : null).append(" ms").toString());
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer3);
                }
                notifyPlay();
                return;
            }
            return;
        }
        prepareIfNeeded();
    }

    public final void pauseOnActivityPaused$vungle_ads_release() {
        this.videoPaused = true;
        pauseInternal();
    }

    public final void pause() {
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder sb = new StringBuilder("pause() at pos=");
        MediaPlayer mediaPlayer = this.mp;
        companion.d(TAG, sb.append(mediaPlayer != null ? Integer.valueOf(mediaPlayer.getCurrentPosition()) : null).append(" ms").toString());
        this.videoPaused = true;
        this.wantPlay = false;
        pauseInternal();
    }

    public final void stop() {
        this.wantPlay = false;
        this.lastPosMs = 0;
        this.videoCompleted = false;
        MediaPlayer mediaPlayer = this.mp;
        Logger.Companion companion = Logger.INSTANCE;
        StringBuilder append = new StringBuilder("stop(): prepared=").append(this.prepared).append(", surface=");
        Surface surface = this.surface;
        companion.d(TAG, append.append(surface != null ? Boolean.valueOf(surface.isValid()) : null).toString());
        if (mediaPlayer != null && this.prepared.get()) {
            if (mediaPlayer.isPlaying()) {
                LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer);
                notifyPause();
            }
            mediaPlayer.seekTo(0);
            Surface surface2 = this.surface;
            if (surface2 != null && surface2.isValid() && !mediaPlayer.isPlaying()) {
                LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer);
                LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer);
            }
        }
        endProgressUpdates();
        this.lastProgressSent = -1;
    }

    public final void seekTo(int ms) {
        this.lastPosMs = RangesKt.coerceAtLeast(ms, 0);
        Logger.INSTANCE.d(TAG, "seekTo " + this.lastPosMs);
        if (this.prepared.get()) {
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(this.lastPosMs);
            }
            calculateAndNotifyProgress();
        }
    }

    public final void setLooping(boolean loop) {
        Logger.INSTANCE.d(TAG, "setLooping to " + this.looping);
        this.looping = loop;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null) {
            return;
        }
        mediaPlayer.setLooping(loop);
    }

    public final void setMuted(boolean mute) {
        Logger.INSTANCE.d(TAG, "setMuted to " + mute);
        this.muted = mute;
        applyMute();
        notifyMuted(mute);
    }

    /* renamed from: isMuted, reason: from getter */
    public final boolean getMuted() {
        return this.muted;
    }

    public static /* synthetic */ void setAutoVisibility$default(AdVideoView adVideoView, boolean z, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.8f;
        }
        adVideoView.setAutoVisibility(z, f);
    }

    public final void setAutoVisibility(boolean enabled, float threshold) {
        Logger.INSTANCE.d(TAG, "setAutoVisibility enabled=" + enabled + " threshold=" + threshold);
        this.autoVisibility = enabled;
        this.visibilityThreshold = RangesKt.coerceIn(threshold, 0.0f, 1.0f);
        if (enabled) {
            checkVisibility();
        }
    }

    public final int getCurrentPositionMs() {
        Object m11180constructorimpl;
        if (this.prepared.get()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AdVideoView adVideoView = this;
                MediaPlayer mediaPlayer = this.mp;
                m11180constructorimpl = Result.m11180constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
            }
            Integer valueOf = Integer.valueOf(this.lastPosMs);
            if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                m11180constructorimpl = valueOf;
            }
            return RangesKt.coerceAtLeast(((Number) m11180constructorimpl).intValue(), 0);
        }
        return RangesKt.coerceAtLeast(this.lastPosMs, 0);
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final void release() {
        Object m11180constructorimpl;
        Object m11180constructorimpl2;
        Object m11180constructorimpl3;
        Unit unit;
        Unit unit2;
        Unit unit3;
        Logger.INSTANCE.d(TAG, "release()");
        pause();
        this.handler.removeCallbacks(this.progressUpdater);
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
                unit3 = Unit.INSTANCE;
            } else {
                unit3 = null;
            }
            m11180constructorimpl = Result.m11180constructorimpl(unit3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "Failed to clear Surface", m11183exceptionOrNullimpl);
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            AdVideoView adVideoView2 = this;
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerStop(mediaPlayer2);
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            m11180constructorimpl2 = Result.m11180constructorimpl(unit2);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m11180constructorimpl2 = Result.m11180constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(m11180constructorimpl2);
        if (m11183exceptionOrNullimpl2 != null) {
            Logger.INSTANCE.e(TAG, "Failed to stop MediaPlayer", m11183exceptionOrNullimpl2);
        }
        try {
            Result.Companion companion5 = Result.INSTANCE;
            AdVideoView adVideoView3 = this;
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerRelease(mediaPlayer3);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m11180constructorimpl3 = Result.m11180constructorimpl(unit);
        } catch (Throwable th3) {
            Result.Companion companion6 = Result.INSTANCE;
            m11180constructorimpl3 = Result.m11180constructorimpl(ResultKt.createFailure(th3));
        }
        Throwable m11183exceptionOrNullimpl3 = Result.m11183exceptionOrNullimpl(m11180constructorimpl3);
        if (m11183exceptionOrNullimpl3 != null) {
            Logger.INSTANCE.e(TAG, "Failed to release MediaPlayer", m11183exceptionOrNullimpl3);
        }
        this.mp = null;
        detachSurface();
        this.prepared.set(false);
        this.preparing.set(false);
    }

    private final void ensurePlayer() {
        if (this.mp != null) {
            return;
        }
        MediaPlayer invoke = this.mediaPlayerFactory.invoke();
        invoke.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
        invoke.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda2
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                AdVideoView.m10738ensurePlayer$lambda14$lambda10(AdVideoView.this, mediaPlayer);
            }
        });
        invoke.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda3
            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                AdVideoView.m10739ensurePlayer$lambda14$lambda11(AdVideoView.this, mediaPlayer, i, i2);
            }
        });
        invoke.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                com.safedk.android.utils.Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/view/AdVideoView$$ExternalSyntheticLambda4;->onCompletion(Landroid/media/MediaPlayer;)V");
                CreativeInfoManager.onVideoCompleted(com.safedk.android.utils.h.d, mediaPlayer, "media-player");
                safedk_AdVideoView$$ExternalSyntheticLambda4_onCompletion_c4329944f055a8b255b9e265b122b14c(mediaPlayer);
            }

            public void safedk_AdVideoView$$ExternalSyntheticLambda4_onCompletion_c4329944f055a8b255b9e265b122b14c(MediaPlayer p0) {
                AdVideoView.m10740ensurePlayer$lambda14$lambda12(AdVideoView.this, p0);
            }
        });
        invoke.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.vungle.ads.internal.ui.view.AdVideoView$$ExternalSyntheticLambda5
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                boolean m10741ensurePlayer$lambda14$lambda13;
                m10741ensurePlayer$lambda14$lambda13 = AdVideoView.m10741ensurePlayer$lambda14$lambda13(AdVideoView.this, mediaPlayer, i, i2);
                return m10741ensurePlayer$lambda14$lambda13;
            }
        });
        this.mp = invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-10, reason: not valid java name */
    public static final void m10738ensurePlayer$lambda14$lambda10(AdVideoView this$0, MediaPlayer mediaPlayer) {
        Surface surface;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this$0.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPrepared();
        }
        this$0.durationMs = mediaPlayer.getDuration();
        this$0.preparing.set(false);
        this$0.prepared.set(true);
        int i = this$0.lastPosMs;
        if (i > 0) {
            mediaPlayer.seekTo(i);
        }
        this$0.applyMute();
        Logger.INSTANCE.d(TAG, "onPrepared(): duration=" + this$0.durationMs + " ms lastPos=" + this$0.lastPosMs + " wantPlay=" + this$0.wantPlay);
        if (this$0.wantPlay && (surface = this$0.surface) != null && surface.isValid()) {
            Logger.INSTANCE.d(TAG, "start video on prepared.");
            LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer);
            this$0.notifyPlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-11, reason: not valid java name */
    public static final void m10739ensurePlayer$lambda14$lambda11(AdVideoView this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this$0.videoW = i;
        this$0.videoH = i2;
        SurfaceTexture surfaceTexture = this$0.texture.getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        this$0.applyTransform();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-12, reason: not valid java name */
    public static final void m10740ensurePlayer$lambda14$lambda12(AdVideoView this$0, MediaPlayer mediaPlayer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.d(TAG, "onCompletion()");
        this$0.lastPosMs = this$0.durationMs;
        this$0.videoCompleted = true;
        this$0.endProgressUpdates();
        this$0.lastProgressSent = 100;
        this$0.notifyProgress(100);
        this$0.notifyCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ensurePlayer$lambda-14$lambda-13, reason: not valid java name */
    public static final boolean m10741ensurePlayer$lambda14$lambda13(AdVideoView this$0, MediaPlayer mediaPlayer, int i, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.w(TAG, "onError(): what=" + i + ", extra=" + i2);
        this$0.preparing.set(false);
        this$0.prepared.set(false);
        this$0.notifyError(i, String.valueOf(i2));
        return true;
    }

    private final void pauseInternal() {
        Object m11180constructorimpl;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer == null || !this.prepared.get() || !mediaPlayer.isPlaying()) {
            Logger.INSTANCE.d(TAG, "pauseInternal(): no-op (not playing or no player)");
        } else {
            Logger.INSTANCE.d(TAG, "pauseInternal(): pos=" + mediaPlayer.getCurrentPosition() + " ms");
            LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer);
            notifyPause();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            m11180constructorimpl = Result.m11180constructorimpl(Integer.valueOf(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : this.lastPosMs));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Integer valueOf = Integer.valueOf(this.lastPosMs);
        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
            m11180constructorimpl = valueOf;
        }
        this.lastPosMs = ((Number) m11180constructorimpl).intValue();
    }

    private final void prepareIfNeeded() {
        Object m11180constructorimpl;
        Uri uri;
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            uri = this.sourceUri;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        if (uri != null && !this.prepared.get() && !this.preparing.get()) {
            ensurePlayer();
            this.preparing.set(true);
            this.prepared.set(false);
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
            MediaPlayer mediaPlayer2 = this.mp;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setLooping(this.looping);
            }
            MediaPlayer mediaPlayer3 = this.mp;
            if (mediaPlayer3 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer3, this.surface);
            }
            MediaPlayer mediaPlayer4 = this.mp;
            if (mediaPlayer4 != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetDataSource(mediaPlayer4, getContext(), uri);
            }
            Logger.Companion companion3 = Logger.INSTANCE;
            StringBuilder append = new StringBuilder("prepareAsync(): uri=").append(uri).append(", surfaceValid=");
            Surface surface = this.surface;
            Unit unit = null;
            companion3.d(TAG, append.append(surface != null ? Boolean.valueOf(surface.isValid()) : null).toString());
            MediaPlayer mediaPlayer5 = this.mp;
            if (mediaPlayer5 != null) {
                mediaPlayer5.prepareAsync();
                unit = Unit.INSTANCE;
            }
            m11180constructorimpl = Result.m11180constructorimpl(unit);
            Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
            if (m11183exceptionOrNullimpl != null) {
                notifyError(-1, String.valueOf(m11183exceptionOrNullimpl.getLocalizedMessage()));
            }
        }
    }

    private final void applyMute() {
        float f = this.muted ? 0.0f : 1.0f;
        MediaPlayer mediaPlayer = this.mp;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(f, f);
        }
    }

    private final void notifyPlay() {
        beginProgressUpdates();
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPlay();
        }
    }

    private final void notifyPause() {
        endProgressUpdates();
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoPause();
        }
    }

    private final void notifyCompleted() {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoCompleted();
        }
    }

    private final void notifyMuted(boolean muted) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoMuted(muted);
        }
    }

    private final void notifyError(int what, String extra) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoError(what, extra);
        }
    }

    private final void notifyProgress(int percentage) {
        NativeVideoContract.VideoLifecycleCallback videoLifecycleCallback = this.callback;
        if (videoLifecycleCallback != null) {
            videoLifecycleCallback.onVideoProgress(percentage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void calculateAndNotifyProgress() {
        int coerceIn;
        int i = this.durationMs;
        if (i <= 0 || !this.prepared.get() || (coerceIn = RangesKt.coerceIn((int) ((getCurrentPositionMs() * 100) / i), 0, 100)) == this.lastProgressSent) {
            return;
        }
        this.lastProgressSent = coerceIn;
        notifyProgress(coerceIn);
    }

    private final void beginProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        this.handler.post(this.progressUpdater);
    }

    private final void endProgressUpdates() {
        this.handler.removeCallbacks(this.progressUpdater);
        calculateAndNotifyProgress();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture st, int width, int height) {
        Object m11180constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(st, "st");
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = new Surface(st);
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            MediaPlayer mediaPlayer = this.mp;
            if (mediaPlayer != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer, this.surface);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m11180constructorimpl = Result.m11180constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "Failed to set surface", m11183exceptionOrNullimpl);
        }
        boolean m11187isSuccessimpl = Result.m11187isSuccessimpl(m11180constructorimpl);
        Logger.INSTANCE.d(TAG, "onSurfaceTextureAvailable(): " + width + " x " + height + ", prepared=" + this.prepared + ", wantPlay=" + this.wantPlay + ", surfaceRet=" + m11187isSuccessimpl);
        if (m11187isSuccessimpl && this.prepared.get() && this.wantPlay) {
            Logger.INSTANCE.d(TAG, "onSurfaceTextureAvailable and videoCompleted=" + this.videoCompleted);
            if (!this.videoCompleted) {
                MediaPlayer mediaPlayer2 = this.mp;
                if (mediaPlayer2 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer2);
                }
                notifyPlay();
            } else {
                seekTo(this.durationMs);
                MediaPlayer mediaPlayer3 = this.mp;
                if (mediaPlayer3 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer3);
                }
                MediaPlayer mediaPlayer4 = this.mp;
                if (mediaPlayer4 != null) {
                    LiftoffMonetizeVideoBridge.MediaPlayerPause(mediaPlayer4);
                }
            }
        } else {
            prepareIfNeeded();
        }
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture st, int width, int height) {
        Intrinsics.checkNotNullParameter(st, "st");
        Logger.INSTANCE.d(TAG, "onSurfaceTextureSizeChanged() width=" + width + " height=" + height);
        applyTransform();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture st) {
        Object m11180constructorimpl;
        Intrinsics.checkNotNullParameter(st, "st");
        Logger.INSTANCE.d(TAG, "onSurfaceTextureDestroyed()");
        pauseInternal();
        try {
            Result.Companion companion = Result.INSTANCE;
            AdVideoView adVideoView = this;
            MediaPlayer mediaPlayer = this.mp;
            Unit unit = null;
            if (mediaPlayer != null) {
                LiftoffMonetizeVideoBridge.MediaPlayerSetSurface(mediaPlayer, null);
                unit = Unit.INSTANCE;
            }
            m11180constructorimpl = Result.m11180constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "Failed to clear surface", m11183exceptionOrNullimpl);
        }
        detachSurface();
        endProgressUpdates();
        return true;
    }

    private final void detachSurface() {
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        this.surface = null;
    }

    private final void applyTransform() {
        float f;
        if (this.videoW <= 0 || this.videoH <= 0) {
            return;
        }
        int width = this.texture.getWidth();
        int height = this.texture.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        float f2 = width;
        float f3 = height;
        float f4 = f2 / f3;
        float f5 = this.videoW / this.videoH;
        Matrix matrix = new Matrix();
        if (f4 > f5) {
            f = f3 / this.videoH;
        } else {
            f = f2 / this.videoW;
        }
        matrix.setScale((this.videoW * f) / f2, (this.videoH * f) / f3, f2 / 2.0f, f3 / 2.0f);
        this.texture.setTransform(matrix);
        this.texture.invalidate();
        float f6 = (f2 - (this.videoW * f)) / 2.0f;
        float f7 = (f3 - (this.videoH * f)) / 2.0f;
        VideoTransformCallback videoTransformCallback = this.videoTransformCallback;
        if (videoTransformCallback != null) {
            videoTransformCallback.onVideoTransformed(this.texture.getX() + f6, this.texture.getY() + f7);
        }
    }

    private final void checkVisibility() {
        MediaPlayer mediaPlayer;
        Surface surface;
        if (this.autoVisibility) {
            if (isVisibleEnough() && this.wantPlay && !this.videoPaused) {
                if (this.prepared.get() && (surface = this.surface) != null && surface.isValid()) {
                    MediaPlayer mediaPlayer2 = this.mp;
                    if ((mediaPlayer2 == null || !mediaPlayer2.isPlaying()) && !this.videoCompleted) {
                        Logger.Companion companion = Logger.INSTANCE;
                        StringBuilder sb = new StringBuilder("auto-resume: visibility OK, start() at pos=");
                        MediaPlayer mediaPlayer3 = this.mp;
                        companion.d(TAG, sb.append(mediaPlayer3 != null ? Integer.valueOf(mediaPlayer3.getCurrentPosition()) : null).append(" ms").toString());
                        MediaPlayer mediaPlayer4 = this.mp;
                        if (mediaPlayer4 != null) {
                            LiftoffMonetizeVideoBridge.MediaPlayerStart(mediaPlayer4);
                        }
                        notifyPlay();
                        return;
                    }
                    return;
                }
                prepareIfNeeded();
                return;
            }
            if (this.prepared.get() && (mediaPlayer = this.mp) != null && mediaPlayer.isPlaying()) {
                Logger.INSTANCE.d(TAG, "auto-pause: visibility NOT enough");
                pauseInternal();
            }
        }
    }

    private final boolean isVisibleEnough() {
        if (!isShown()) {
            return false;
        }
        if (!getGlobalVisibleRect(new Rect())) {
            return false;
        }
        long height = getHeight() * getWidth();
        return height > 0 && ((float) (r0.height() * r0.width())) / ((float) height) >= this.visibilityThreshold;
    }
}
