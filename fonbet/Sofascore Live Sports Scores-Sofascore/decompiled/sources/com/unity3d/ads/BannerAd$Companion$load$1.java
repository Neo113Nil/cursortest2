package com.unity3d.ads;

import android.content.Context;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServicesRegistry;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import defpackage.a70;
import defpackage.duf;
import defpackage.fuf;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
@il4(c = "com.unity3d.ads.BannerAd$Companion$load$1", f = "BannerAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BannerAd$Companion$load$1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
    final /* synthetic */ BannerConfiguration $configuration;
    final /* synthetic */ LoadListener<BannerAd> $listener;
    int label;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"com/unity3d/ads/BannerAd$Companion$load$1$2", "Lcom/unity3d/services/banners/BannerView$IListener;", "Lcom/unity3d/ads/BannerShowListenerWithOnFailedToShow;", "onBannerLoaded", "", "bannerAdView", "Lcom/unity3d/services/banners/BannerView;", "onBannerFailedToLoad", "errorInfo", "Lcom/unity3d/services/banners/BannerErrorInfo;", "onBannerClick", "onBannerLeftApplication", "onBannerFailedToShow", "onBannerShown", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.unity3d.ads.BannerAd$Companion$load$1$2, reason: invalid class name */
    public static final class AnonymousClass2 implements BannerView.IListener, BannerShowListenerWithOnFailedToShow {
        final /* synthetic */ AtomicReference<BannerAd> $bannerAdRef;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ BannerConfiguration $configuration;
        final /* synthetic */ LoadListener<BannerAd> $listener;
        final /* synthetic */ UUID $opportunityId;

        public AnonymousClass2(UUID uuid, LoadListener<BannerAd> loadListener, BannerConfiguration bannerConfiguration, BannerView bannerView, AtomicReference<BannerAd> atomicReference) {
            this.$opportunityId = uuid;
            this.$listener = loadListener;
            this.$configuration = bannerConfiguration;
            this.$bannerView = bannerView;
            this.$bannerAdRef = atomicReference;
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerAdView) {
            bannerAdView.getClass();
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onClicked(bannerAd);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerAdView, BannerErrorInfo errorInfo) {
            bannerAdView.getClass();
            errorInfo.getClass();
            LoadListener<BannerAd> loadListener = this.$listener;
            int i = errorInfo.publicErrorCode;
            String str = errorInfo.errorMessage;
            if (str == null) {
                str = "Failed to load banner ad for placement: " + bannerAdView.getPlacementId() + '.';
            }
            loadListener.onAdLoaded(null, new UnityAdsError(i, str));
        }

        @Override // com.unity3d.ads.BannerShowListenerWithOnFailedToShow
        public void onBannerFailedToShow(BannerView bannerAdView, BannerErrorInfo errorInfo) {
            bannerAdView.getClass();
            errorInfo.getClass();
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                BannerShowListener listener = this.$configuration.getListener();
                int i = errorInfo.publicErrorCode;
                String str = errorInfo.errorMessage;
                str.getClass();
                listener.onFailedToShow(bannerAd, new UnityAdsError(i, str));
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerAdView) {
            bannerAdView.getClass();
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerAdView) {
            bannerAdView.getClass();
            ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
            IServicesRegistry registry = serviceProvider.getRegistry();
            fuf fufVar = duf.a;
            AdRepository adRepository = (AdRepository) registry.resolveService(new ServiceKey(null, fufVar.getOrCreateKotlinClass(AdRepository.class), 1, null));
            SafeCallbackInvoke safeCallbackInvoke = (SafeCallbackInvoke) serviceProvider.getRegistry().resolveService(new ServiceKey(null, fufVar.getOrCreateKotlinClass(SafeCallbackInvoke.class), 1, null));
            UUID uuid = this.$opportunityId;
            uuid.getClass();
            AdObject ad = adRepository.getAd(ProtobufExtensionsKt.toByteString(uuid));
            if (ad != null) {
                BannerAd bannerAd = new BannerAd(ad, this.$bannerView, safeCallbackInvoke);
                this.$bannerAdRef.set(bannerAd);
                this.$listener.onAdLoaded(bannerAd, null);
            } else {
                this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId()));
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerAdView) {
            bannerAdView.getClass();
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onImpression(bannerAd);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$Companion$load$1(LoadListener<BannerAd> loadListener, BannerConfiguration bannerConfiguration, rq3<? super BannerAd$Companion$load$1> rq3Var) {
        super(2, rq3Var);
        this.$listener = loadListener;
        this.$configuration = bannerConfiguration;
    }

    @Override // defpackage.h21
    public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
        return new BannerAd$Companion$load$1(this.$listener, this.$configuration, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
        return ((BannerAd$Companion$load$1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        if (this.label != 0) {
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext == null) {
            this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId() + ". Verify that Unity Ads has been initialized."));
            return Unit.a;
        }
        UUID randomUUID = UUID.randomUUID();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        BannerConfiguration bannerConfiguration = this.$configuration;
        unityAdsLoadOptions.setObjectId(randomUUID.toString());
        unityAdsLoadOptions.setAdMarkup(bannerConfiguration.getAdMarkup());
        unityAdsLoadOptions.loadConfiguration = new LoadConfigurationInternal(bannerConfiguration.getPlacementId(), bannerConfiguration.getAdMarkup(), bannerConfiguration.getMediationAdUnitId(), bannerConfiguration.getMediationInfo(), bannerConfiguration.getExtras());
        if (!this.$configuration.getExtras().isEmpty()) {
            MetaData metaData = new MetaData(applicationContext);
            for (Map.Entry<String, String> entry : this.$configuration.getExtras().entrySet()) {
                metaData.set(entry.getKey(), entry.getValue());
            }
            metaData.commit();
        }
        AtomicReference atomicReference = new AtomicReference(null);
        BannerView bannerView = new BannerView(applicationContext, this.$configuration.getPlacementId(), new UnityBannerSize(this.$configuration.getBannerSize().getWidth(), this.$configuration.getBannerSize().getHeight()));
        bannerView.setListener(new AnonymousClass2(randomUUID, this.$listener, this.$configuration, bannerView, atomicReference));
        bannerView.load(unityAdsLoadOptions);
        return Unit.a;
    }
}
