package ru.ozon.app.android.pdp.widgets.galleryV4.di;

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
import ru.ozon.app.android.pdp.widgets.galleryV4.data.GalleryV4ButtonsOnBoardingRepository;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4ButtonsViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.soundservice.SoundService;

@Metadata(d1 = {"\u0000q\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"ru/ozon/app/android/pdp/widgets/galleryV4/di/GalleryV4WidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/galleryV4/di/GalleryV4WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4ButtonsOnBoardingRepository;", "buttonsOnBoardingRepository$delegate", "LSc/j;", "getButtonsOnBoardingRepository", "()Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4ButtonsOnBoardingRepository;", "buttonsOnBoardingRepository", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "getVideoComponentApi", "()Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;", "getButtonsViewModelProvider", "()Lru/ozon/app/android/pdp/widgets/galleryV4/presentation/buttons/GalleryV4ButtonsViewModel;", "buttonsViewModelProvider", "Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "getGallerySyncVMP", "()Lru/ozon/app/android/pdp/widgets/galleryFullView/presentation/GallerySyncViewModelImpl;", "gallerySyncVMP", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "getVideoPlayer", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayer", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "getSoundService", "()Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4WidgetComponent$Companion$create$1$1 implements GalleryV4WidgetComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: buttonsOnBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonsOnBoardingRepository = k.b(new GalleryV4WidgetComponent$Companion$create$1$1$buttonsOnBoardingRepository$2(this));

    GalleryV4WidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    public GalleryV4ButtonsOnBoardingRepository getButtonsOnBoardingRepository() {
        return (GalleryV4ButtonsOnBoardingRepository) this.buttonsOnBoardingRepository.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent
    public GalleryV4ButtonsViewModel getButtonsViewModelProvider() {
        return new GalleryV4ButtonsViewModel(getButtonsOnBoardingRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent
    public Context getContext() {
        return getContextComponentDependencies().getContext();
    }

    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent
    public FeatureChecker getFeatureChecker() {
        return getNetworkComponentApi().getFeatureChecker();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent
    public GallerySyncViewModelImpl getGallerySyncVMP() {
        return new GallerySyncViewModelImpl();
    }

    public final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class);
    }

    public final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent
    public SoundService getSoundService() {
        return getVideoComponentApi().getSoundService();
    }

    public final StorageComponentApi getStorageComponentApi() {
        return (StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    public final VideoComponentApi getVideoComponentApi() {
        return (VideoComponentApi) this.$storage.getComponent(VideoComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV4.di.GalleryV4WidgetComponent
    public GalleryVideoPlayer getVideoPlayer() {
        return new GalleryVideoPlayer(getVideoComponentApi().getVideoController(), true, getVideoComponentApi().getPlayerPreloader());
    }
}
