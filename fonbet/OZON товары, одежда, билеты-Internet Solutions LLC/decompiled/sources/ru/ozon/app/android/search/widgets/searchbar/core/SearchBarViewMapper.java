package ru.ozon.app.android.search.widgets.searchbar.core;

import A00.a;
import Fu.C3060a;
import a00.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gk0.q;
import j10.InterfaceC7238a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.e;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.common.actionHandlers.ModifySearchUrlViewModel;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.updates.VoiceRecognitionData;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.search.R$layout;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.di.DaggerSearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageRouter;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0016j\b\u0012\u0004\u0012\u00020\u0002`\u00172\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020&0%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/search/widgets/searchbar/di/SearchBarComponent;", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarDTO;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchBar/SearchBarVO;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Ll10/i;", "container", "view", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "createHolder", "(Ll10/i;Landroid/view/View;)Lru/ozon/composer/ui/widget/k;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "", "Ljava/lang/Class;", "LA00/a$J$a;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "layoutRes", "I", "Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarMapper;", "getMapper", "()Lru/ozon/app/android/search/widgets/searchbar/core/SearchBarMapper;", "mapper", "", "getHolderProducer", "()Ljava/lang/Void;", "holderProducer", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchBarViewMapper extends WidgetViewMapper2<SearchBarComponent, SearchBarDTO, SearchBarVO> {
    private final Integer layout;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(VoiceRecognitionData.class);
    private final int layoutRes = R$layout.widget_searchbar;

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarComponent widgetComponent$lambda$2(C7475g c7475g) {
        SearchBarComponent.Factory factory = DaggerSearchBarComponent.factory();
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        ActionComponentApi actionComponentApi = (ActionComponentApi) c7475g.getComponent(ActionComponentApi.class);
        SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) c7475g.getComponent(SearchHistoryRepositoryComponentApi.class);
        SearchPrefetchApi searchPrefetchApi = (SearchPrefetchApi) c7475g.getComponent(SearchPrefetchApi.class);
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) c7475g.getComponent(ComposerComponentApi.class);
        OnboardingComponentApi onboardingComponentApi = (OnboardingComponentApi) c7475g.getComponent(OnboardingComponentApi.class);
        StorageComponentApi storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi = (SearchByImageRepositoryComponentApi) c7475g.getComponent(SearchByImageRepositoryComponentApi.class);
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) c7475g.getComponent(AndroidPlatformComponentApi.class);
        return factory.create(networkComponentApi, actionComponentApi, searchHistoryRepositoryComponentApi, searchByImageRepositoryComponentApi, searchPrefetchApi, composerComponentApi, (SearchOnboardingRepositoryComponentApi) c7475g.getComponent(SearchOnboardingRepositoryComponentApi.class), onboardingComponentApi, storageComponentApi, (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class), androidPlatformComponentApi, (AnalyticsComponentApi) c7475g.getComponent(AnalyticsComponentApi.class), (AnalyticsScreenStorageComponentApi) c7475g.getComponent(AnalyticsScreenStorageComponentApi.class), (AccountComponentApi) c7475g.getComponent(AccountComponentApi.class), (CustomActionHandlersComponentApi) c7475g.getComponent(CustomActionHandlersComponentApi.class));
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SearchBarDTO) && !Intrinsics.d(((SearchBarDTO) state).isActive(), Boolean.TRUE);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g
    @NotNull
    /* renamed from: createHolder */
    public k<SearchBarVO> createHolder2(@NotNull i container, @NotNull View view) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(view, "view");
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        ComposerReferences composerReferences = (ComposerReferences) V11;
        SearchUrlPrefetchService searchUrlPrefetchService = component().searchUrlPrefetchService();
        FeatureService featureService = component().featureService();
        CommonOnboardingRepository onboardingRepository = component().getOnboardingRepository();
        BaseOnBoardingViewModel.Default r11 = (BaseOnBoardingViewModel.Default) ((w0) j.a(container.a0().a(), N.b(BaseOnBoardingViewModel.Default.class), new SearchBarViewMapper$createHolder$1(this)).getValue());
        w0 a11 = new z0(container.a0().b(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchbar.core.SearchBarViewMapper$createHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SearchByImageViewModel searchByImageViewModel = SearchBarViewMapper.this.component().searchPhotoViewModel().get();
                Intrinsics.g(searchByImageViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return searchByImageViewModel;
            }
        }).a(SearchByImageViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "sharedViewModel(...)");
        SearchByImageViewModel searchByImageViewModel = (SearchByImageViewModel) a11;
        SearchByImageRouter searchByImageRouter = component().searchByImageRouter();
        InterfaceC7238a<l> r12 = container.J().r();
        FeatureChecker featureChecker = component().featureChecker();
        w0 a12 = new z0(container.a0().b(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchbar.core.SearchBarViewMapper$createHolder$$inlined$sharedViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ModifySearchUrlViewModel modifySearchUrlViewModel = SearchBarViewMapper.this.component().modifySearchUrlViewModel().get();
                Intrinsics.g(modifySearchUrlViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return modifySearchUrlViewModel;
            }
        }).a(ModifySearchUrlViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "sharedViewModel(...)");
        return new SearchBarViewHolder(view, composerReferences, searchUrlPrefetchService, featureChecker, featureService, searchByImageViewModel, searchByImageRouter, onboardingRepository, r11, r12, (ModifySearchUrlViewModel) a12, component().sharedPreferences(), component().authStateStorage(), component().userManager(), component().customActionHandlersStoreFactory());
    }

    @Override // ru.ozon.composer.ui.widget.g
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(this.layoutRes);
        return h11 == null ? LayoutInflater.from(parent.getContext()).inflate(this.layoutRes, parent, false) : h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SearchBarComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(SearchBarComponent.class), new C3060a(storage, 3));
    }

    @NotNull
    public Void getHolderProducer() {
        throw new UnsupportedOperationException();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SearchBarMapper getMapper() {
        return component().staticSearchBarMapper();
    }
}
