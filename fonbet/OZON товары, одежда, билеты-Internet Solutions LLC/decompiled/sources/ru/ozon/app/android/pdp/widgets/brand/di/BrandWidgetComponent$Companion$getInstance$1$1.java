package ru.ozon.app.android.pdp.widgets.brand.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.data.PDPOnBoardingRepository;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di.WidgetImagePlaceholderComponent;
import ru.ozon.app.android.pdp.widgets.brand.core.cell.OriginalBrandMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.dsButton.ButtonBrandMapper;
import ru.ozon.app.android.pdp.widgets.brand.core.dsCell.DsCellBrandMapper;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"ru/ozon/app/android/pdp/widgets/brand/di/BrandWidgetComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/widgets/brand/di/BrandWidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "widgetImagePlaceholderComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "onboardingComponentApi", "Lru/ozon/app/android/composer/widgets/v2/onboarding/di/OnBoardingComponentApi;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "onBoardingRepository$delegate", "LSc/j;", "getOnBoardingRepository", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/data/PDPOnBoardingRepository;", "onBoardingRepository", "Lru/ozon/app/android/pdp/widgets/brand/core/cell/OriginalBrandMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/pdp/widgets/brand/core/cell/OriginalBrandMapper;", "mapper", "Lru/ozon/app/android/pdp/widgets/brand/core/dsCell/DsCellBrandMapper;", "dsCellMapper$delegate", "getDsCellMapper", "()Lru/ozon/app/android/pdp/widgets/brand/core/dsCell/DsCellBrandMapper;", "dsCellMapper", "Lru/ozon/app/android/pdp/widgets/brand/core/dsButton/ButtonBrandMapper;", "buttonMapper$delegate", "getButtonMapper", "()Lru/ozon/app/android/pdp/widgets/brand/core/dsButton/ButtonBrandMapper;", "buttonMapper", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "getStorageComponentApi", "()Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "getViewModel", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/onboarding/PDPOnBoardingViewModel;", "viewModel", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "getWidgetImagePlaceholderAdapter", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BrandWidgetComponent$Companion$getInstance$1$1 implements BrandWidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final OnBoardingComponentApi onboardingComponentApi;
    private final WidgetImagePlaceholderComponent widgetImagePlaceholderComponentApi;

    /* renamed from: onBoardingRepository$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j onBoardingRepository = k.b(new BrandWidgetComponent$Companion$getInstance$1$1$onBoardingRepository$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(BrandWidgetComponent$Companion$getInstance$1$1$mapper$2.INSTANCE);

    /* renamed from: dsCellMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j dsCellMapper = k.b(BrandWidgetComponent$Companion$getInstance$1$1$dsCellMapper$2.INSTANCE);

    /* renamed from: buttonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j buttonMapper = k.b(BrandWidgetComponent$Companion$getInstance$1$1$buttonMapper$2.INSTANCE);
    private final l tokenizedAnalytics = getRetainComposerComponentApi().getTokenizedAnalytics();

    BrandWidgetComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.widgetImagePlaceholderComponentApi = (WidgetImagePlaceholderComponent) c7475g.getComponent(WidgetImagePlaceholderComponent.class);
        this.onboardingComponentApi = (OnBoardingComponentApi) c7475g.getComponent(OnBoardingComponentApi.class);
    }

    private final PDPOnBoardingRepository getOnBoardingRepository() {
        return (PDPOnBoardingRepository) this.onBoardingRepository.getValue();
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageComponentApi getStorageComponentApi() {
        return (StorageComponentApi) this.$storage.getComponent(StorageComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent
    public ButtonBrandMapper getButtonMapper() {
        return (ButtonBrandMapper) this.buttonMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent
    public DsCellBrandMapper getDsCellMapper() {
        return (DsCellBrandMapper) this.dsCellMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent
    public OriginalBrandMapper getMapper() {
        return (OriginalBrandMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent
    public l getTokenizedAnalytics() {
        return this.tokenizedAnalytics;
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent
    public PDPOnBoardingViewModel getViewModel() {
        return new PDPOnBoardingViewModel(getOnBoardingRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayOnPageRepository(), this.onboardingComponentApi.getDefaultOnBoardingDisplayDisableRepository());
    }

    @Override // ru.ozon.app.android.pdp.widgets.brand.di.BrandWidgetComponent
    public WidgetImagePlaceholderAdapter getWidgetImagePlaceholderAdapter() {
        return this.widgetImagePlaceholderComponentApi.getWidgetImagePlaceholderAdapter();
    }
}
