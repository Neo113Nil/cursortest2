package ru.ozon.app.android.pdp.widgets.galleryV5.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GallerySyncViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pdp.widgets.galleryV5.data.GalleryV5ButtonsOnBoardingRepository;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.soundservice.SoundService;

@Metadata(d1 = {"\u0000\u0081\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"ru/ozon/app/android/pdp/widgets/galleryV5/di/GalleryV5WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/galleryV5/di/GalleryV5WidgetComponent;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "platformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;", "buttonsOnBoardingRepository$delegate", "LSc/j;", "getButtonsOnBoardingRepository", "()Lru/ozon/app/android/pdp/widgets/galleryV5/data/GalleryV5ButtonsOnBoardingRepository;", "buttonsOnBoardingRepository", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "getVideoComponentApi", "()Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "getOnboardingViewModel", "()Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnboardingViewModel;", "onboardingViewModel", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "getGallerySyncVMP", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "gallerySyncVMP", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "getVideoPlayer", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayer", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "getSoundService", "()Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV5WidgetComponent$Companion$create$1$1 implements GalleryV5WidgetComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: buttonsOnBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonsOnBoardingRepository = k.b(new GalleryV5WidgetComponent$Companion$create$1$1$buttonsOnBoardingRepository$2(this));
    private final AndroidPlatformComponentDependencies platformComponentDependencies;

    GalleryV5WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.platformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public AppType getAppType() {
        return this.platformComponentDependencies.getAppType();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public GalleryV5ButtonsOnBoardingRepository getButtonsOnBoardingRepository() {
        return (GalleryV5ButtonsOnBoardingRepository) this.buttonsOnBoardingRepository.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public Context getContext() {
        return getContextComponentDependencies().getContext();
    }

    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public FeatureChecker getFeatureChecker() {
        return getNetworkComponentApi().getFeatureChecker();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public GallerySyncViewModelImpl getGallerySyncVMP() {
        return new GallerySyncViewModelImpl();
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public GalleryV5OnboardingViewModel getOnboardingViewModel() {
        return new GalleryV5OnboardingViewModel(getButtonsOnBoardingRepository());
    }

    public final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public SoundService getSoundService() {
        return getVideoComponentApi().getSoundService();
    }

    public final StorageComponentApi getStorageComponentApi() {
        return (StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    public final VideoComponentApi getVideoComponentApi() {
        return (VideoComponentApi) this.$storage.getComponent(VideoComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV5.di.GalleryV5WidgetComponent
    public GalleryVideoPlayer getVideoPlayer() {
        return new GalleryVideoPlayer(getVideoComponentApi().getVideoController(), true, getVideoComponentApi().getPlayerPreloader());
    }
}
