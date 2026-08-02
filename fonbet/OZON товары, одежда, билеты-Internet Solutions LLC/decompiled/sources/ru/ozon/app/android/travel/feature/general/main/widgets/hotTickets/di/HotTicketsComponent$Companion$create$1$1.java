package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data.HotTicketsMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.prefetch.HotTicketsBackgroundImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.prefetch.HotTicketsImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.prefetch.HotTicketsTitleImagePrefetcherInfoProvider;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation.HotTicketsWidgetViewModel;
import ru.ozon.app.android.travel.molecules.view.themeImage.v1.ThemeImageV1VO;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000u\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR!\u0010$\u001a\b\u0012\u0004\u0012\u00020 0\u001f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u0018\u0010)\u001a\u00060%j\u0002`&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"ru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/di/HotTicketsComponent$Companion$create$1$1", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/di/HotTicketsComponent;", "Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO$LoadedState;", "createBackgroundImagePrefetcher", "()Lru/ozon/app/android/pikazon/preload/ImagePrefetcher;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "createTitleImagePrefetcher", "Lru/ozon/app/android/travel/molecules/view/themeImage/v1/ThemeImageV1VO;", "createImagePrefetcher", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "customActionComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "composerWidgetAsyncComponentApi", "Lru/ozon/app/android/composer/widgets/async/di/ComposerWidgetAsyncComponentApi;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsWidgetViewModel;", "viewModelProvider$delegate", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotTicketsComponent$Companion$create$1$1 implements HotTicketsComponent {
    final /* synthetic */ C7475g $storage;
    private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
    private final ContextComponentDependencies contextComponentDependencies;
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;
    private final CustomActionHandlersComponentApi customActionComponentApi;
    private final RetainComposerComponentApi retainComponentApi;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new HotTicketsComponent$Companion$create$1$1$mapper$2(this));

    /* renamed from: viewModelProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j viewModelProvider = k.b(new HotTicketsComponent$Companion$create$1$1$viewModelProvider$2(this));

    HotTicketsComponent$Companion$create$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.customActionComponentApi = (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class);
        this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
        this.retainComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) c7475g.getComponent(CoroutineDispatchersComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePrefetcher<HotTicketsVO.LoadedState> createBackgroundImagePrefetcher() {
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(HotTicketsVO.LoadedState.class), new HotTicketsBackgroundImagePrefetchInfoProvider(ComposerWidgetComponentStorageKt.getContext(this.$storage)));
        Unit unit = Unit.f71690a;
        return new ImagePrefetcher<>(1, imagePrefetchInfoProviderStorage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePrefetcher<ThemeImageV1VO> createImagePrefetcher() {
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ThemeImageV1VO.class), new HotTicketsImagePrefetchInfoProvider(ComposerWidgetComponentStorageKt.getContext(this.$storage)));
        Unit unit = Unit.f71690a;
        return new ImagePrefetcher<>(1, imagePrefetchInfoProviderStorage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePrefetcher<ImageDTO> createTitleImagePrefetcher() {
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ImageDTO.class), new HotTicketsTitleImagePrefetcherInfoProvider());
        Unit unit = Unit.f71690a;
        return new ImagePrefetcher<>(1, imagePrefetchInfoProviderStorage);
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.di.HotTicketsComponent
    public d getCustomActionHandlersStoreFactory() {
        return this.customActionComponentApi.getCustomActionHandlersStoreFactory();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.di.HotTicketsComponent
    public HotTicketsMapper getMapper() {
        return (HotTicketsMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.di.HotTicketsComponent
    public l getTokenizedAnalytics() {
        return this.retainComponentApi.getTokenizedAnalytics();
    }

    @Override // ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.di.HotTicketsComponent
    public Pc.a<HotTicketsWidgetViewModel> getViewModelProvider() {
        return (Pc.a) this.viewModelProvider.getValue();
    }
}
