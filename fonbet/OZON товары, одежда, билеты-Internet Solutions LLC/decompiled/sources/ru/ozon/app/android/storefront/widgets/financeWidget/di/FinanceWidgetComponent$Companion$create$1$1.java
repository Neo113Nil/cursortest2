package ru.ozon.app.android.storefront.widgets.financeWidget.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.flags.AccountMainPlaceholderRateOptimizationEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.storefront.utils.ImagePrefetcherWrapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.carousel.CarouselCardMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.couple.CoupleCardMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.prefetch.FinanceWidgetCaruselPrefetchInfoProvider;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.prefetch.FinanceWidgetItemVOPrefetchInfoProvider;
import ru.ozon.app.android.storefront.widgets.financeWidget.core.single.SingleCardMapper;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.carousel.CarouselCardVO;
import ru.ozon.app.android.storefront.widgets.financeWidget.presentation.couple.ItemVO;

@Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020!0%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010-\u001a\u00060)j\u0002`*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"ru/ozon/app/android/storefront/widgets/financeWidget/di/FinanceWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/storefront/widgets/financeWidget/di/FinanceWidgetComponent;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/storefront/widgets/financeWidget/core/couple/CoupleCardMapper;", "coupleCardMapper$delegate", "LSc/j;", "getCoupleCardMapper", "()Lru/ozon/app/android/storefront/widgets/financeWidget/core/couple/CoupleCardMapper;", "coupleCardMapper", "Lru/ozon/app/android/storefront/widgets/financeWidget/core/carousel/CarouselCardMapper;", "carouselCardMapper$delegate", "getCarouselCardMapper", "()Lru/ozon/app/android/storefront/widgets/financeWidget/core/carousel/CarouselCardMapper;", "carouselCardMapper", "Lru/ozon/app/android/storefront/widgets/financeWidget/core/single/SingleCardMapper;", "singleCardMapper$delegate", "getSingleCardMapper", "()Lru/ozon/app/android/storefront/widgets/financeWidget/core/single/SingleCardMapper;", "singleCardMapper", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "", "getProviderStorage", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetchInfoProviderStorage;", "providerStorage", "Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "getImagePrefetcherWrapper", "()Lru/ozon/app/android/storefront/utils/ImagePrefetcherWrapper;", "imagePrefetcherWrapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceWidgetComponent$Companion$create$1$1 implements FinanceWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final ContextComponentDependencies contextComponentDependencies;
    private final NetworkComponentApi networkComponentApi;

    /* renamed from: coupleCardMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j coupleCardMapper = k.b(new FinanceWidgetComponent$Companion$create$1$1$coupleCardMapper$2(this));

    /* renamed from: carouselCardMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j carouselCardMapper = k.b(new FinanceWidgetComponent$Companion$create$1$1$carouselCardMapper$2(this));

    /* renamed from: singleCardMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j singleCardMapper = k.b(new FinanceWidgetComponent$Companion$create$1$1$singleCardMapper$2(this));

    FinanceWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        return this.contextComponentDependencies.getContext();
    }

    private final FeatureChecker getFeatureChecker() {
        return this.networkComponentApi.getFeatureChecker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePrefetcherWrapper<Object> getImagePrefetcherWrapper() {
        return new ImagePrefetcherWrapper<>(new ImagePrefetcher(4, getProviderStorage()), getFeatureChecker().isEnabled(AccountMainPlaceholderRateOptimizationEnabled.INSTANCE));
    }

    private final ImagePrefetchInfoProviderStorage<Object> getProviderStorage() {
        ImagePrefetchInfoProviderStorage<Object> imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage<>();
        imagePrefetchInfoProviderStorage.addProvider(N.b(CarouselCardVO.Banner.class), new FinanceWidgetCaruselPrefetchInfoProvider());
        imagePrefetchInfoProviderStorage.addProvider(N.b(ItemVO.class), new FinanceWidgetItemVOPrefetchInfoProvider());
        return imagePrefetchInfoProviderStorage;
    }

    @Override // ru.ozon.app.android.storefront.widgets.financeWidget.di.FinanceWidgetComponent
    public CarouselCardMapper getCarouselCardMapper() {
        return (CarouselCardMapper) this.carouselCardMapper.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.financeWidget.di.FinanceWidgetComponent
    public CoupleCardMapper getCoupleCardMapper() {
        return (CoupleCardMapper) this.coupleCardMapper.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.financeWidget.di.FinanceWidgetComponent
    public SingleCardMapper getSingleCardMapper() {
        return (SingleCardMapper) this.singleCardMapper.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.financeWidget.di.FinanceWidgetComponent
    public l getTokenizedAnalytics() {
        return ((RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class)).getTokenizedAnalytics();
    }
}
