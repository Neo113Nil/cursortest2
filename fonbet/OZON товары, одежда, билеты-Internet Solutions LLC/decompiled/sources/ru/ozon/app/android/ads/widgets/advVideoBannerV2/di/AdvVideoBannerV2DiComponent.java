package ru.ozon.app.android.ads.widgets.advVideoBannerV2.di;

import Pc.a;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2Mapper;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.video.di.VideoComponentApi;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0001\u000bJ\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/di/AdvVideoBannerV2DiComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/video/di/VideoComponentApi;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2Mapper;", "getMapper", "()Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2Mapper;", "LPc/a;", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewModelNew;", "getViewModelProviderNew", "()LPc/a;", "Factory", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AdvVideoBannerV2DiComponent extends InterfaceC6958a, VideoComponentApi {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/di/AdvVideoBannerV2DiComponent$Factory;", "", "create", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/di/AdvVideoBannerV2DiComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "videoComponentApi", "Lru/ozon/app/android/video/di/VideoComponentApi;", "pixelRepositoryComponentApi", "Lru/ozon/app/android/ads/data/pixel/di/PixelRepositoryComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        AdvVideoBannerV2DiComponent create(@NotNull ContextComponentDependencies contextComponentDependencies, @NotNull VideoComponentApi videoComponentApi, @NotNull PixelRepositoryComponentApi pixelRepositoryComponentApi, @NotNull RetainComposerComponentApi retainComposerComponentApi, @NotNull NetworkComponentApi networkComponentApi);
    }

    @NotNull
    AdvVideoBannerV2Mapper getMapper();

    @NotNull
    a<AdvVideoBannerV2ViewModelNew> getViewModelProviderNew();
}
