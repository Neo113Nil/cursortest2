package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.b0u0;
import xsna.iut0;
import xsna.ksr;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.yvj;
import xsna.zvj;

/* compiled from: AndroidEmbeddableWebViewAdPlayer.kt */
/* loaded from: classes14.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final Context context;
    private final LifecycleDataSource lifecycleDataSource;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String str, AndroidWebViewContainer androidWebViewContainer, OpenMeasurementRepository openMeasurementRepository, LifecycleDataSource lifecycleDataSource, Context context) {
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r7, r0) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r8.destroy(r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (xsna.qsl.b(1000, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object destroy(spj<? super s3q0> spjVar) {
        AndroidEmbeddableWebViewAdPlayer$destroy$1 androidEmbeddableWebViewAdPlayer$destroy$1;
        int i;
        if (spjVar instanceof AndroidEmbeddableWebViewAdPlayer$destroy$1) {
            androidEmbeddableWebViewAdPlayer$destroy$1 = (AndroidEmbeddableWebViewAdPlayer$destroy$1) spjVar;
            int i2 = androidEmbeddableWebViewAdPlayer$destroy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidEmbeddableWebViewAdPlayer$destroy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidEmbeddableWebViewAdPlayer$destroy$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidEmbeddableWebViewAdPlayer$destroy$1.label;
                if (i != 0) {
                    a.a(obj);
                    this.webViewAdPlayer.dispatchShowCompleted();
                    if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
                        androidEmbeddableWebViewAdPlayer$destroy$1.label = 1;
                    }
                } else if (i == 1) {
                    a.a(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                        return s3q0.a;
                    }
                    a.a(obj);
                    androidEmbeddableWebViewAdPlayer$destroy$1.label = 3;
                }
                AndroidWebViewContainer webViewContainer = getWebViewContainer();
                androidEmbeddableWebViewAdPlayer$destroy$1.label = 2;
            }
        }
        androidEmbeddableWebViewAdPlayer$destroy$1 = new AndroidEmbeddableWebViewAdPlayer$destroy$1(this, spjVar);
        Object obj2 = androidEmbeddableWebViewAdPlayer$destroy$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
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
    public ksr<LoadEvent> getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public ksr<OfferwallShowEvent> getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public ksr<ShowEvent> getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public yvj getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.onBroadcastEvent(str, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.requestShow(map, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendActivityDestroyed(spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendFocusChange(z, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendMuteChange(z, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendOfferwallEvent(OfferwallEvent offerwallEvent, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendVisibilityChange(z, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, spj<? super s3q0> spjVar) {
        return this.webViewAdPlayer.sendVolumeChange(d, spjVar);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final ShowOptions showOptions) {
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            throw new IllegalStateException((bannerViewCache.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found").toString());
        }
        myc0.h(zvj.b(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1(this, bannerView, null), 3);
        final WebView webView = getWebViewContainer().getWebView();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        if (webView.isAttachedToWindow()) {
            myc0.h(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3);
            if (webView.isAttachedToWindow()) {
                webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(webView, this));
            } else {
                myc0.h(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3);
            }
        } else {
            webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    webView.removeOnAttachStateChangeListener(this);
                    myc0.h(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$1(this, showOptions, null), 3);
                    WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                    if (view.isAttachedToWindow()) {
                        view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(view, this));
                    } else {
                        myc0.h(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$2$2$1(this, null), 3);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        myc0.h(zvj.b(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3(bannerView, this, null), 3);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
