package ru.ozon.app.android.pdp.widgets.galleryV3.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3ViewModelImpl;
import ru.ozon.app.android.pdp.widgets.galleryV3.core.GalleryV3Mapper;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryAnalytics;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.GalleryRouter;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.player.GalleryVideoPlayer;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.video.di.VideoComponentApi;
import ru.ozon.app.android.video.player.soundservice.SoundService;

@Metadata(d1 = {"\u0000m\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"ru/ozon/app/android/pdp/widgets/galleryV3/di/GalleryWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdp/widgets/galleryV3/di/GalleryWidgetComponent;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO;", "providersStorage$delegate", "LSc/j;", "getProvidersStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "providersStorage", "Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Mapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/pdp/widgets/galleryV3/core/GalleryV3Mapper;", "mapper", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryAnalytics;", "analytics$delegate", "getAnalytics", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryAnalytics;", "analytics", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryRouter;", "router$delegate", "getRouter", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryRouter;", "router", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "getNavigationComponentApi", "()Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "getVideoComponentApi", "()Lru/ozon/app/android/video/di/VideoComponentApi;", "videoComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "getVideoPlayer", "()Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/player/GalleryVideoPlayer;", "videoPlayer", "Lru/ozon/app/android/video/player/soundservice/SoundService;", "getSoundService", "()Lru/ozon/app/android/video/player/soundservice/SoundService;", "soundService", "Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModelImpl;", "getViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3ViewModelImpl;", "viewModel", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryWidgetComponent$Companion$create$1$1 implements GalleryWidgetComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: providersStorage$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j providersStorage = k.b(GalleryWidgetComponent$Companion$create$1$1$providersStorage$2.INSTANCE);

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new GalleryWidgetComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: analytics$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j analytics = k.b(GalleryWidgetComponent$Companion$create$1$1$analytics$2.INSTANCE);

    /* renamed from: router$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j router = k.b(new GalleryWidgetComponent$Companion$create$1$1$router$2(this));

    GalleryWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationComponentApi getNavigationComponentApi() {
        return (NavigationComponentApi) this.$storage.getComponent(NavigationComponentApi.class);
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    private final VideoComponentApi getVideoComponentApi() {
        return (VideoComponentApi) this.$storage.getComponent(VideoComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent
    public GalleryAnalytics getAnalytics() {
        return (GalleryAnalytics) this.analytics.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent
    public GalleryV3Mapper getMapper() {
        return (GalleryV3Mapper) this.mapper.getValue();
    }

    public final ImagePrefetchInfoProviderStorage<GalleryV3VO> getProvidersStorage() {
        return (ImagePrefetchInfoProviderStorage) this.providersStorage.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent
    public GalleryRouter getRouter() {
        return (GalleryRouter) this.router.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent
    public SoundService getSoundService() {
        return getVideoComponentApi().getSoundService();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent
    public GalleryVideoPlayer getVideoPlayer() {
        return new GalleryVideoPlayer(getVideoComponentApi().getVideoController(), false, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.galleryV3.di.GalleryWidgetComponent
    public GalleryV3ViewModelImpl getViewModel() {
        return new GalleryV3ViewModelImpl();
    }
}
