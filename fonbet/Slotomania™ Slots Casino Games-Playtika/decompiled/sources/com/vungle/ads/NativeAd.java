package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.ui.view.NativeAdOptionsView;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAd.kt */
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0019\u0018\u0000 D2\u00020\u0001:\u0002CDB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0015\u0010-\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u0003H\u0010¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0005J\r\u00102\u001a\u0004\u0018\u000103¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\u0005J\u0006\u00106\u001a\u00020\u0005J\u0006\u00107\u001a\u000208J\b\u00109\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020;J\u0006\u0010=\u001a\u00020>J0\u0010?\u001a\u00020>2\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eJ\u0006\u0010B\u001a\u00020>R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020&X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006E"}, d2 = {"Lcom/vungle/ads/NativeAd;", "Lcom/vungle/ads/BaseAd;", "context", "Landroid/content/Context;", "placementId", "", "(Landroid/content/Context;Ljava/lang/String;)V", "adConfig", "Lcom/vungle/ads/AdConfig;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "adContentView", "Lcom/vungle/ads/internal/ui/view/MediaView;", "adIconView", "Landroid/widget/ImageView;", "adOptionsPosition", "", "getAdOptionsPosition$annotations", "()V", "getAdOptionsPosition", "()I", "setAdOptionsPosition", "(I)V", "adOptionsView", "Lcom/vungle/ads/internal/ui/view/NativeAdOptionsView;", "adPlayCallback", "com/vungle/ads/NativeAd$adPlayCallback$1", "Lcom/vungle/ads/NativeAd$adPlayCallback$1;", "adRootView", "Landroid/widget/FrameLayout;", "clickableViews", "", "Landroid/view/View;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "displayCount", "nativeAdInternal", "Lcom/vungle/ads/internal/NativeAdInternal;", "nativeDisplayDurationMetric", "Lcom/vungle/ads/TimeIntervalMetric;", "getNativeDisplayDurationMetric$vungle_ads_release", "()Lcom/vungle/ads/TimeIntervalMetric;", "videoOptions", "Lcom/vungle/ads/nativead/NativeVideoOptions;", "getVideoOptions", "()Lcom/vungle/ads/nativead/NativeVideoOptions;", "constructAdInternal", "constructAdInternal$vungle_ads_release", "getAdBodyText", "getAdCallToActionText", "getAdSponsoredText", "getAdStarRating", "", "()Ljava/lang/Double;", "getAdTitle", "getAppIcon", "getMediaAspectRatio", "", "getMediaView", "hasCallToAction", "", "hasVideoContent", "performCTA", "", "registerViewForInteraction", "rootView", "mediaView", "unregisterView", "AdOptionsPosition", k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private MediaView adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private NativeAdOptionsView adOptionsView;
    private final NativeAd$adPlayCallback$1 adPlayCallback;
    private FrameLayout adRootView;
    private Collection<? extends View> clickableViews;
    private final AtomicBoolean destroyed;
    private int displayCount;
    private final NativeAdInternal nativeAdInternal;
    private final TimeIntervalMetric nativeDisplayDurationMetric;

    /* compiled from: NativeAd.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd$AdOptionsPosition;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface AdOptionsPosition {
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    private NativeAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adOptionsPosition = 1;
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        Intrinsics.checkNotNull(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.NativeAdInternal");
        this.nativeAdInternal = (NativeAdInternal) adInternal$vungle_ads_release;
        this.nativeDisplayDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION);
        this.destroyed = new AtomicBoolean(false);
        this.adPlayCallback = new AdPlayCallback() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String id) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String id) {
                NativeAd.this.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.PLAYING);
                NativeAd.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                NativeAd.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, NativeAd.this.getAdInternal$vungle_ads_release().getValidationToPresentMetric(), NativeAd.this.getLogEntry(), (String) null, 4, (Object) null);
                NativeAd.this.getPresentToDisplayMetric().markStart();
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = NativeAd.this;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(NativeAd.this);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String id) {
                NativeAd.this.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.IMPRESSION_LOGGED);
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = NativeAd.this;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getPresentToDisplayMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, NativeAd.this.getPresentToDisplayMetric(), NativeAd.this.getLogEntry(), (String) null, 4, (Object) null);
                NativeAd.this.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String id) {
                if (NativeAd.this.getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
                    NativeAd.this.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.READY);
                }
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = NativeAd.this;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getShowToCloseMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, NativeAd.this.getShowToCloseMetric(), NativeAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String id) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = NativeAd.this;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(NativeAd.this);
                        }
                    }
                });
                NativeAd.this.getDisplayToClickMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, NativeAd.this.getDisplayToClickMetric(), NativeAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String id) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = NativeAd.this;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(NativeAd.this);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, NativeAd.this.getLeaveApplicationMetric(), NativeAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final VungleError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                NativeAd.this.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = NativeAd.this;
                threadUtil.runOnUiThread(new Function0<Unit>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = NativeAd.this.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(NativeAd.this, error);
                        }
                    }
                });
                NativeAd.this.getShowToFailMetric().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(NativeAd.this.getShowToFailMetric(), NativeAd.this.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        };
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(Context context, String placementId) {
        this(context, placementId, new AdConfig());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
    }

    @Override // com.vungle.ads.BaseAd
    public NativeAdInternal constructAdInternal$vungle_ads_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new NativeAdInternal(context);
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final void setAdOptionsPosition(int i) {
        this.adOptionsPosition = i;
    }

    /* renamed from: getNativeDisplayDurationMetric$vungle_ads_release, reason: from getter */
    public final TimeIntervalMetric getNativeDisplayDurationMetric() {
        return this.nativeDisplayDurationMetric;
    }

    public final NativeVideoOptions getVideoOptions() {
        return this.nativeAdInternal.getVideoOptions$vungle_ads_release();
    }

    public final String getAppIcon() {
        return this.nativeAdInternal.getAppIcon();
    }

    public final String getAdTitle() {
        return this.nativeAdInternal.getAdTitle();
    }

    public final String getAdBodyText() {
        return this.nativeAdInternal.getAdBodyText();
    }

    public final String getAdCallToActionText() {
        return this.nativeAdInternal.getAdCallToActionText();
    }

    public final Double getAdStarRating() {
        return this.nativeAdInternal.getAdStarRating();
    }

    public final String getAdSponsoredText() {
        return this.nativeAdInternal.getAdSponsoredText();
    }

    public final boolean hasCallToAction() {
        return this.nativeAdInternal.hasCallToAction();
    }

    public final float getMediaAspectRatio() {
        return this.nativeAdInternal.getAspectRatio();
    }

    /* renamed from: getMediaView, reason: from getter */
    public final MediaView getAdContentView() {
        return this.adContentView;
    }

    public final void unregisterView() {
        Logger.INSTANCE.w(TAG, "unregisterView  " + hashCode());
        if (this.destroyed.getAndSet(true)) {
            return;
        }
        this.nativeDisplayDurationMetric.markEnd();
        this.nativeDisplayDurationMetric.setMeta(String.valueOf(this.displayCount));
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.nativeDisplayDurationMetric, getLogEntry(), (String) null, 4, (Object) null);
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        this.adRootView = null;
        MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy$vungle_ads_release();
        }
        this.adContentView = null;
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        this.adOptionsView = null;
        this.nativeAdInternal.destroy();
        try {
            ImageView imageView = this.adIconView;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            Logger.INSTANCE.w(TAG, "error msg: " + e.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
    }

    public final boolean hasVideoContent() {
        return this.nativeAdInternal.hasVideoContent();
    }

    public final void registerViewForInteraction(FrameLayout rootView, MediaView mediaView, ImageView adIconView, Collection<? extends View> clickableViews) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Logger.INSTANCE.w(TAG, "registerViewForInteraction " + hashCode());
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (String) null, 4, (Object) null);
        this.displayCount++;
        this.nativeDisplayDurationMetric.markStart();
        getResponseToShowMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric().markStart();
        getShowToFailMetric().markStart();
        getShowToCloseMetric().markStart();
        if (getAdInternal$vungle_ads_release().isAdPlaying$vungle_ads_release()) {
            if (Intrinsics.areEqual(this.adRootView, rootView)) {
                Logger.INSTANCE.d(TAG, "no-op when re-play it on the same root view");
                return;
            }
            unregisterView();
        }
        this.destroyed.set(false);
        VungleError canPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (canPlayAd != null) {
            Logger.INSTANCE.w(TAG, "registerViewForInteraction can NOT play. " + hashCode() + ' ' + canPlayAd);
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, canPlayAd);
                return;
            }
            return;
        }
        this.adRootView = rootView;
        this.adContentView = mediaView;
        this.adIconView = adIconView;
        this.clickableViews = clickableViews;
        this.nativeAdInternal.initPresenter(rootView, this.adPlayCallback);
        if (this.adOptionsView == null) {
            this.adOptionsView = new NativeAdOptionsView(getContext());
        }
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.NativeAd$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.m10640registerViewForInteraction$lambda1(NativeAd.this, view);
                }
            });
        }
        if (clickableViews == null) {
            clickableViews = CollectionsKt.listOf(mediaView);
        }
        Iterator<T> it = clickableViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.NativeAd$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.m10641registerViewForInteraction$lambda3$lambda2(NativeAd.this, view);
                }
            });
        }
        NativeAdOptionsView nativeAdOptionsView2 = this.adOptionsView;
        if (nativeAdOptionsView2 != null) {
            nativeAdOptionsView2.renderTo(rootView, this.adOptionsPosition);
        }
        this.nativeAdInternal.trySetTouchListener(mediaView);
        mediaView.present$vungle_ads_release(this.nativeAdInternal);
        this.nativeAdInternal.displayAppIcon(adIconView);
        NativeAdInternal nativeAdInternal = this.nativeAdInternal;
        NativeAdOptionsView nativeAdOptionsView3 = this.adOptionsView;
        nativeAdInternal.displayPrivacyIcon(nativeAdOptionsView3 != null ? nativeAdOptionsView3.getPrivacyIcon$vungle_ads_release() : null);
        this.nativeAdInternal.showWatermark(rootView, getAdConfig().getWatermark$vungle_ads_release());
        getAdInternal$vungle_ads_release().getShowToValidationMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric(), getLogEntry(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric().markStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    public static final void m10640registerViewForInteraction$lambda1(NativeAd this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.nativeAdInternal.onPrivacyIconClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: registerViewForInteraction$lambda-3$lambda-2, reason: not valid java name */
    public static final void m10641registerViewForInteraction$lambda3$lambda2(NativeAd this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.nativeAdInternal.openCallToActionUrlByUser();
    }

    public final void performCTA() {
        this.nativeAdInternal.openCallToActionUrl();
    }
}
