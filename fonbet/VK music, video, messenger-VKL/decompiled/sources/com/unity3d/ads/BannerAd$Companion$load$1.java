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
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import io.jsonwebtoken.JwtParser;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.fpf0;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;

/* compiled from: BannerAd.kt */
@b6l(c = "com.unity3d.ads.BannerAd$Companion$load$1", f = "BannerAd.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class BannerAd$Companion$load$1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ BannerConfiguration $configuration;
    final /* synthetic */ LoadListener<BannerAd> $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAd$Companion$load$1(LoadListener<BannerAd> loadListener, BannerConfiguration bannerConfiguration, spj<? super BannerAd$Companion$load$1> spjVar) {
        super(2, spjVar);
        this.$listener = loadListener;
        this.$configuration = bannerConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new BannerAd$Companion$load$1(this.$listener, this.$configuration, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext == null) {
            this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId() + ". Verify that Unity Ads has been initialized."));
            return s3q0.a;
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
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((BannerAd$Companion$load$1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* compiled from: BannerAd.kt */
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
        public void onBannerClick(BannerView bannerView) {
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onClicked(bannerAd);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            LoadListener<BannerAd> loadListener = this.$listener;
            int i = bannerErrorInfo.publicErrorCode;
            String str = bannerErrorInfo.errorMessage;
            if (str == null) {
                str = "Failed to load banner ad for placement: " + bannerView.getPlacementId() + JwtParser.SEPARATOR_CHAR;
            }
            loadListener.onAdLoaded(null, new UnityAdsError(i, str));
        }

        @Override // com.unity3d.ads.BannerShowListenerWithOnFailedToShow
        public void onBannerFailedToShow(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onFailedToShow(bannerAd, new UnityAdsError(bannerErrorInfo.publicErrorCode, bannerErrorInfo.errorMessage));
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
            ServiceProvider serviceProvider = ServiceProvider.INSTANCE;
            AdRepository adRepository = (AdRepository) serviceProvider.getRegistry().resolveService(new ServiceKey(null, fpf0.a(AdRepository.class), 1, null));
            SafeCallbackInvoke safeCallbackInvoke = (SafeCallbackInvoke) serviceProvider.getRegistry().resolveService(new ServiceKey(null, fpf0.a(SafeCallbackInvoke.class), 1, null));
            AdObject ad = adRepository.getAd(ProtobufExtensionsKt.toByteString(this.$opportunityId));
            if (ad != null) {
                BannerAd bannerAd = new BannerAd(ad, this.$bannerView, safeCallbackInvoke);
                this.$bannerAdRef.set(bannerAd);
                this.$listener.onAdLoaded(bannerAd, null);
            } else {
                this.$listener.onAdLoaded(null, new UnityAdsError(0, "Failed to load banner ad for placement: " + this.$configuration.getPlacementId()));
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerShown(BannerView bannerView) {
            BannerAd bannerAd = this.$bannerAdRef.get();
            if (bannerAd != null) {
                this.$configuration.getListener().onImpression(bannerAd);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
        }
    }
}
