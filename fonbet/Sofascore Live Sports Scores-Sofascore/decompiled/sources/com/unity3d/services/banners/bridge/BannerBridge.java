package com.unity3d.services.banners.bridge;

import android.view.View;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.ads.BannerShowListenerWithOnFailedToShow;
import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceProvider;
import defpackage.bsk;
import gatewayprotocol.v1.ErrorOuterClass;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fJ,\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J:\u0010\u0015\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001e\u001a\u00020\u0017H\u0007J\u0012\u0010\u001f\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010 \u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010!\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\"\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006#"}, d2 = {"Lcom/unity3d/services/banners/bridge/BannerBridge;", "", "<init>", "()V", "load", "", "placementId", "", "bannerAdId", "bannerSize", "Lcom/unity3d/services/banners/UnityBannerSize;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "onBannerLoaded", "bannerAdView", "Lcom/unity3d/services/banners/BannerView;", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "data", "Lorg/json/JSONObject;", "destroy", "resize", "left", "", PlayerKt.E_SPORTS_TOP, "right", "bottom", "alpha", "", "visibilityChanged", "visibility", "didLoad", "didDestroy", "didAttach", "didDetach", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BannerBridge {

    @NotNull
    public static final BannerBridge INSTANCE = new BannerBridge();

    private BannerBridge() {
    }

    private final boolean isHeaderBidding(JSONObject data) {
        if (data == null) {
            return false;
        }
        return data.has("adMarkup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onBannerLoaded(BannerView bannerAdView, final String bannerAdId, final String placementId, final UnityAdsLoadOptions loadOptions) {
        final BannerView bannerView;
        final BannerView.IListener listener = bannerAdView.getListener();
        final BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
        if (bannerView2 == null) {
            if (listener != null) {
                listener.onBannerFailedToLoad(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = bsk.a;
        if (bannerView2.isAttachedToWindow()) {
            if (BannerViewCache.getInstance().getBannerView(bannerAdId) != null) {
                UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
                unityAdsShowOptions.setObjectId(loadOptions.getObjectId());
                LoadConfigurationInternal loadConfigurationInternal = loadOptions.loadConfiguration;
                IServiceProvider iServiceProvider = null;
                Object[] objArr = 0;
                if (loadConfigurationInternal != null) {
                    unityAdsShowOptions.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                }
                new UnityAdsSDK(iServiceProvider, 1, objArr == true ? 1 : 0).show(placementId, unityAdsShowOptions, new BannerBridge$onBannerLoaded$1$2(listener, bannerAdView));
            } else if (listener instanceof BannerShowListenerWithOnFailedToShow) {
                ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerAdView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
            }
            bannerView = bannerAdView;
        } else {
            bannerView = bannerAdView;
            bannerView2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$onBannerLoaded$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    view.getClass();
                    bannerView2.removeOnAttachStateChangeListener(this);
                    if (BannerViewCache.getInstance().getBannerView(bannerAdId) == null) {
                        BannerView.IListener iListener = listener;
                        if (iListener instanceof BannerShowListenerWithOnFailedToShow) {
                            iListener.getClass();
                            ((BannerShowListenerWithOnFailedToShow) listener).onBannerFailedToShow(bannerView, new BannerErrorInfo("Banner view not found in cache during show", BannerErrorCode.NATIVE_ERROR, ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL.getNumber()));
                            return;
                        }
                        return;
                    }
                    UnityAdsShowOptions unityAdsShowOptions2 = new UnityAdsShowOptions();
                    unityAdsShowOptions2.setObjectId(loadOptions.getObjectId());
                    if (loadOptions.loadConfiguration != null) {
                        unityAdsShowOptions2.showConfiguration = new ShowConfigurationInternal(null, null, 3, null);
                    }
                    new UnityAdsSDK(null, 1, null).show(placementId, unityAdsShowOptions2, new BannerBridge$onBannerLoaded$1$2(listener, bannerView));
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                    view.getClass();
                }
            });
        }
        if (listener != null) {
            listener.onBannerLoaded(bannerView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void load(@Nullable final String placementId, @Nullable final String bannerAdId, @Nullable UnityBannerSize bannerSize, @NotNull final UnityAdsLoadOptions loadOptions) {
        loadOptions.getClass();
        final BannerView bannerView = BannerViewCache.getInstance().getBannerView(bannerAdId);
        if (bannerView == null) {
            return;
        }
        if (loadOptions.getObjectId() == null) {
            loadOptions.setObjectId(bannerAdId);
        }
        new UnityAdsSDK(null, 1, 0 == true ? 1 : 0).load(placementId, loadOptions, new InternalLoadListener() { // from class: com.unity3d.services.banners.bridge.BannerBridge$load$listener$1
            @Override // com.unity3d.ads.core.domain.InternalLoadListener
            public void onAdLoadFail(UnityAdsError error) {
                error.getClass();
                BannerView bannerView2 = BannerViewCache.getInstance().getBannerView(bannerAdId);
                if (bannerView2 == null || bannerView2.getListener() == null) {
                    return;
                }
                bannerView2.getListener().onBannerFailedToLoad(bannerView2, BannerErrorInfo.fromLoadError(error));
            }

            @Override // com.unity3d.ads.core.domain.InternalLoadListener
            public void onAdLoaded(AdObject adObject) {
                adObject.getClass();
                BannerBridge.INSTANCE.onBannerLoaded(bannerView, bannerAdId, placementId, loadOptions);
            }
        }, bannerSize);
    }

    public static final void destroy(@Nullable String bannerAdId) {
    }

    public static final void didAttach(@Nullable String bannerAdId) {
    }

    public static final void didDestroy(@Nullable String bannerAdId) {
    }

    public static final void didDetach(@Nullable String bannerAdId) {
    }

    public static final void didLoad(@Nullable String bannerAdId) {
    }

    public static final void visibilityChanged(@Nullable String bannerAdId, int visibility) {
    }

    public static final void resize(@Nullable String bannerAdId, int left, int top, int right, int bottom, float alpha) {
    }
}
