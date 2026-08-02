package ru.ozon.app.android.ads.widgets.advBanner.v4.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.ads.data.pixel.di.PixelRepositoryComponentApi;
import ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4Component$Companion$create$1$1;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainMapper;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewModel;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single.AdvBannerV4PlainSingleMapper;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0018\u001a\u00020\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"ru/ozon/app/android/ads/widgets/advBanner/v4/di/AdvBannerV4Component$Companion$create$1$1", "Lru/ozon/app/android/ads/widgets/advBanner/v4/di/AdvBannerV4Component;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainMapper;", "mapper", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4PlainSingleMapper;", "mapperSingle$delegate", "getMapperSingle", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4PlainSingleMapper;", "mapperSingle", "LPc/a;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewModel;", "kotlin.jvm.PlatformType", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker$delegate", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4Component$Companion$create$1$1 implements AdvBannerV4Component {
    final /* synthetic */ RetainComposerComponentApi $retainComponentApi;

    /* renamed from: featureChecker$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j featureChecker;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper;

    /* renamed from: mapperSingle$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapperSingle;
    private final a<AdvBannerV4PlainViewModel> viewModelProvider;

    AdvBannerV4Component$Companion$create$1$1(ContextComponentDependencies contextComponentDependencies, final PixelRepositoryComponentApi pixelRepositoryComponentApi, RetainComposerComponentApi retainComposerComponentApi, C7475g c7475g) {
        this.$retainComponentApi = retainComposerComponentApi;
        this.mapper = k.b(new AdvBannerV4Component$Companion$create$1$1$mapper$2(contextComponentDependencies));
        this.mapperSingle = k.b(new AdvBannerV4Component$Companion$create$1$1$mapperSingle$2(contextComponentDependencies));
        this.viewModelProvider = new a() { // from class: xl.a
            @Override // Pc.a
            public final Object get() {
                AdvBannerV4PlainViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = AdvBannerV4Component$Companion$create$1$1.viewModelProvider$lambda$0(PixelRepositoryComponentApi.this);
                return viewModelProvider$lambda$0;
            }
        };
        this.featureChecker = k.b(new AdvBannerV4Component$Companion$create$1$1$featureChecker$2(c7475g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AdvBannerV4PlainViewModel viewModelProvider$lambda$0(PixelRepositoryComponentApi pixelRepositoryComponentApi) {
        return new AdvBannerV4PlainViewModel(pixelRepositoryComponentApi.getPixelRepository());
    }

    @Override // ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4Component
    public FeatureChecker getFeatureChecker() {
        return (FeatureChecker) this.featureChecker.getValue();
    }

    @Override // ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4Component
    public AdvBannerV4PlainMapper getMapper() {
        return (AdvBannerV4PlainMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4Component
    public AdvBannerV4PlainSingleMapper getMapperSingle() {
        return (AdvBannerV4PlainSingleMapper) this.mapperSingle.getValue();
    }

    @Override // ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4Component
    public l getTokenizedAnalytics() {
        return this.$retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.ads.widgets.advBanner.v4.di.AdvBannerV4Component
    public a<AdvBannerV4PlainViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
