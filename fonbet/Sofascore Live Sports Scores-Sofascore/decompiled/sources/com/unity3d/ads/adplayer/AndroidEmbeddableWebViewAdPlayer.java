package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.ironsource.C4018c8;
import com.ironsource.U3;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import defpackage.a70;
import defpackage.bsk;
import defpackage.hc5;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.z88;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u001b\u001a\u00020\u00132\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018H\u0096A¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0096A¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001fH\u0096A¢\u0006\u0004\b$\u0010\"J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001fH\u0096A¢\u0006\u0004\b&\u0010\"J\u0010\u0010'\u001a\u00020\u0013H\u0096A¢\u0006\u0004\b'\u0010\u0017J\u0018\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0096A¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,H\u0096A¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,H\u0096A¢\u0006\u0004\b0\u0010/J\u0018\u00101\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,H\u0096A¢\u0006\u0004\b1\u0010/J\u0018\u00103\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u0005H\u0096A¢\u0006\u0004\b3\u00104J\u0018\u00106\u001a\u00020\u00132\u0006\u00102\u001a\u000205H\u0096A¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010=R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010>R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0014\u0010C\u001a\u00020@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020I0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010GR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020L0D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010G¨\u0006O"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "webViewAdPlayer", "", "opportunityId", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Landroid/content/Context;", "context", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Landroid/content/Context;)V", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", "", "show", "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "(Lrq3;)Ljava/lang/Object;", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "", "isMuted", "sendMuteChange", "(ZLrq3;)Ljava/lang/Object;", C4018c8.k, "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "", "volume", "sendVolumeChange", "(DLrq3;)Ljava/lang/Object;", "", U3.i.X, "sendUserConsentChange", "([BLrq3;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onAllowedPiiChange", "event", "onBroadcastEvent", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Ljava/lang/String;", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Landroid/content/Context;", "Lku3;", "getScope", "()Lku3;", "scope", "Lz88;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "()Lz88;", "onShowEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "onLoadEvent", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {

    @NotNull
    private final Context context;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final String opportunityId;

    @NotNull
    private final WebViewAdPlayer webViewAdPlayer;

    @NotNull
    private final AndroidWebViewContainer webViewContainer;

    public AndroidEmbeddableWebViewAdPlayer(@NotNull WebViewAdPlayer webViewAdPlayer, @NotNull String str, @NotNull AndroidWebViewContainer androidWebViewContainer, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull Context context) {
        webViewAdPlayer.getClass();
        str.getClass();
        androidWebViewContainer.getClass();
        openMeasurementRepository.getClass();
        lifecycleDataSource.getClass();
        context.getClass();
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r8.destroy(r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (defpackage.n4o.y(1000, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(@NotNull rq3<? super Unit> rq3Var) {
        AndroidEmbeddableWebViewAdPlayer$destroy$1 androidEmbeddableWebViewAdPlayer$destroy$1;
        int i;
        if (rq3Var instanceof AndroidEmbeddableWebViewAdPlayer$destroy$1) {
            androidEmbeddableWebViewAdPlayer$destroy$1 = (AndroidEmbeddableWebViewAdPlayer$destroy$1) rq3Var;
            int i2 = androidEmbeddableWebViewAdPlayer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidEmbeddableWebViewAdPlayer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidEmbeddableWebViewAdPlayer$destroy$1.result;
                lu3 lu3Var = lu3.a;
                i = androidEmbeddableWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    this.webViewAdPlayer.dispatchShowCompleted();
                    if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
                        androidEmbeddableWebViewAdPlayer$destroy$1.label = 1;
                    }
                } else if (i == 1) {
                    y6a.M(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                    androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
                }
                AndroidWebViewContainer webViewContainer = getWebViewContainer();
                androidEmbeddableWebViewAdPlayer$destroy$1.label = 2;
            }
        }
        androidEmbeddableWebViewAdPlayer$destroy$1 = new AndroidEmbeddableWebViewAdPlayer$destroy$1(this, rq3Var);
        Object obj2 = androidEmbeddableWebViewAdPlayer$destroy$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidEmbeddableWebViewAdPlayer$destroy$1.label;
        if (i != 0) {
        }
        AndroidWebViewContainer webViewContainer2 = getWebViewContainer();
        androidEmbeddableWebViewAdPlayer$destroy$1.label = 2;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public z88 getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public ku3 getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.onBroadcastEvent(str, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.requestShow(map, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendActivityDestroyed(rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendFocusChange(z, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendMuteChange(z, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(boolean z, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendVisibilityChange(z, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(double d, @NotNull rq3<? super Unit> rq3Var) {
        return this.webViewAdPlayer.sendVolumeChange(d, rq3Var);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull final ShowOptions showOptions) {
        showOptions.getClass();
        if (!(showOptions instanceof AndroidShowOptions)) {
            a70.p("Failed requirement.");
            return;
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            hc5.f(bannerViewCache.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found");
            return;
        }
        xw3.L(s9a.k(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1(this, bannerView, null), 3);
        final WebView webView = getWebViewContainer().getWebView();
        WeakHashMap weakHashMap = bsk.a;
        if (webView.isAttachedToWindow()) {
            xw3.L(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3);
            if (webView.isAttachedToWindow()) {
                webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(webView, this));
            } else {
                xw3.L(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3);
            }
        } else {
            webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    view.getClass();
                    webView.removeOnAttachStateChangeListener(this);
                    xw3.L(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3);
                    WeakHashMap weakHashMap2 = bsk.a;
                    boolean isAttachedToWindow = view.isAttachedToWindow();
                    AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer = this;
                    if (isAttachedToWindow) {
                        view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(view, androidEmbeddableWebViewAdPlayer));
                    } else {
                        xw3.L(androidEmbeddableWebViewAdPlayer.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                    view.getClass();
                }
            });
        }
        xw3.L(s9a.k(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3(bannerView, this, null), 3);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
