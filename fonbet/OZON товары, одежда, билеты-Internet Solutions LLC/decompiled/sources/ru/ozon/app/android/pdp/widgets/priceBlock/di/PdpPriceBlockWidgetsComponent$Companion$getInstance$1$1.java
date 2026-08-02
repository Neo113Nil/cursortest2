package ru.ozon.app.android.pdp.widgets.priceBlock.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingRepository;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.core.PriceActionsMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.core.PriceCellMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2InfoMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2MainMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core.PriceV2SeparatorMapper;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables.PriceV2ShapeDrawableStorage;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u00ad\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010%R\u001e\u0010)\u001a\u00060'j\u0002`(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\n\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u0002028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u00105¨\u0006_"}, d2 = {"ru/ozon/app/android/pdp/widgets/priceBlock/di/PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/widgets/priceBlock/di/PdpPriceBlockWidgetsComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "pdpOnBoardingRepository$delegate", "LSc/j;", "getPdpOnBoardingRepository", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "pdpOnBoardingRepository", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2MainMapper;", "priceV2Mapper$delegate", "getPriceV2Mapper", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2MainMapper;", "priceV2Mapper", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2InfoMapper;", "priceV2InfoMapper$delegate", "getPriceV2InfoMapper", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2InfoMapper;", "priceV2InfoMapper", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/core/PriceActionsMapper;", "priceActionsMapper$delegate", "getPriceActionsMapper", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/core/PriceActionsMapper;", "priceActionsMapper", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2SeparatorMapper;", "priceV2SeparatorMapper$delegate", "getPriceV2SeparatorMapper", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/core/PriceV2SeparatorMapper;", "priceV2SeparatorMapper", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/core/PriceCellMapper;", "priceCellMapper$delegate", "getPriceCellMapper", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceCell/core/PriceCellMapper;", "priceCellMapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlerStoreFactory", "LVg/d;", "getCustomActionHandlerStoreFactory", "()LVg/d;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "defaultOnboardingViewModel$delegate", "getDefaultOnboardingViewModel", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "defaultOnboardingViewModel", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "priceV2ShapeDrawableStorage$delegate", "getPriceV2ShapeDrawableStorage", "()Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "priceV2ShapeDrawableStorage", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "getCustomActionHandlersComponentApi", "()Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionHandlersComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "getViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "viewModel", "Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "getViewModelSaleBlock", "()Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "viewModelSaleBlock", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "getPOnBoardingViewModel", "pOnBoardingViewModel", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1 implements PdpPriceBlockWidgetsComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
    private final OnBoardingComponentApi onboardingComponentApi;

    /* renamed from: pdpOnBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j pdpOnBoardingRepository = k.b(new PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$pdpOnBoardingRepository$2(this));

    /* renamed from: priceV2Mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceV2Mapper = k.b(PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceV2Mapper$2.INSTANCE);

    /* renamed from: priceV2InfoMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceV2InfoMapper = k.b(PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceV2InfoMapper$2.INSTANCE);

    /* renamed from: priceActionsMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceActionsMapper = k.b(new PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceActionsMapper$2(this));

    /* renamed from: priceV2SeparatorMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceV2SeparatorMapper = k.b(PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceV2SeparatorMapper$2.INSTANCE);

    /* renamed from: priceCellMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceCellMapper = k.b(PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceCellMapper$2.INSTANCE);
    private final d customActionHandlerStoreFactory = getCustomActionHandlersComponentApi().getCustomActionHandlersStoreFactory();

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j handlersInhibitor = k.b(PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$handlersInhibitor$2.INSTANCE);

    /* renamed from: defaultOnboardingViewModel$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j defaultOnboardingViewModel = k.b(new PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$defaultOnboardingViewModel$2(this));

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType = DelegatesKt.lazyUnsafe(new PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$appType$2(this));

    /* renamed from: priceV2ShapeDrawableStorage$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j priceV2ShapeDrawableStorage = k.b(new PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceV2ShapeDrawableStorage$2(this));

    PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContextComponentDependencies getContextComponentDependencies() {
        return (ContextComponentDependencies) this.$storage.getComponent(ContextComponentDependencies.class);
    }

    private final CustomActionHandlersComponentApi getCustomActionHandlersComponentApi() {
        return (CustomActionHandlersComponentApi) this.$storage.getComponent(CustomActionHandlersComponentApi.class);
    }

    private final PDPOnBoardingRepository getPdpOnBoardingRepository() {
        return (PDPOnBoardingRepository) this.pdpOnBoardingRepository.getValue();
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageComponentApi getStorageComponentApi() {
        return (StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public d getCustomActionHandlerStoreFactory() {
        return this.customActionHandlerStoreFactory;
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public BaseOnBoardingViewModel.Default getPOnBoardingViewModel() {
        return new BaseOnBoardingViewModel.Default(this.onboardingComponentApi.getDefaultOnBoardingDisplayRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public PriceActionsMapper getPriceActionsMapper() {
        return (PriceActionsMapper) this.priceActionsMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public PriceCellMapper getPriceCellMapper() {
        return (PriceCellMapper) this.priceCellMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public PriceV2InfoMapper getPriceV2InfoMapper() {
        return (PriceV2InfoMapper) this.priceV2InfoMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public PriceV2MainMapper getPriceV2Mapper() {
        return (PriceV2MainMapper) this.priceV2Mapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public PriceV2SeparatorMapper getPriceV2SeparatorMapper() {
        return (PriceV2SeparatorMapper) this.priceV2SeparatorMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public PriceV2ShapeDrawableStorage getPriceV2ShapeDrawableStorage() {
        return (PriceV2ShapeDrawableStorage) this.priceV2ShapeDrawableStorage.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public PDPOnBoardingViewModel getViewModel() {
        return new PDPOnBoardingViewModel(getPdpOnBoardingRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.priceBlock.di.PdpPriceBlockWidgetsComponent
    public SaleBlockViewModel getViewModelSaleBlock() {
        return new SaleBlockViewModel();
    }
}
