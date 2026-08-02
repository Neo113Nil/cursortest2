package ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage;

import Ae.C2399j;
import Ae.C2408n0;
import Pc.a;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.os.c;
import androidx.core.os.d;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.screen.storage.di.AnalyticsScreenStorageComponentApi;
import ru.ozon.app.android.common.di.SearchPrefetchApi;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.search.databinding.FragmentSearchPhotoLoadBinding;
import ru.ozon.app.android.search.di.searchHistoryRepository.SearchHistoryRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchOnboarding.di.repository.SearchOnboardingRepositoryComponentApi;
import ru.ozon.app.android.search.widgets.searchbar.di.DaggerSearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchBarComponent;
import ru.ozon.app.android.search.widgets.searchbar.di.SearchByImageRepositoryComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.domain.onboarding.di.OnboardingComponentApi;
import wZ.C10464f;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageLoadFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/ozon/app/android/search/databinding/FragmentSearchPhotoLoadBinding;", "_binding", "Lru/ozon/app/android/search/databinding/FragmentSearchPhotoLoadBinding;", "LPc/a;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "vmProvider", "LPc/a;", "searchByImageViewModel", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageViewModel;", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "Lru/ozon/app/android/composer/ComposerNavigator;", "getBinding", "()Lru/ozon/app/android/search/databinding/FragmentSearchPhotoLoadBinding;", "binding", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SearchByImageLoadFragment extends ComponentCallbacksC5392m {
    private FragmentSearchPhotoLoadBinding _binding;
    private ComposerNavigator navigator;
    private SearchByImageViewModel searchByImageViewModel;
    private a<SearchByImageViewModel> vmProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageLoadFragment$Companion;", "", "<init>", "()V", "KEY_EXTRA_URI", "", "newInstance", "Lru/ozon/app/android/search/widgets/searchbar/presentation/searchByImage/SearchByImageLoadFragment;", "uri", "Landroid/net/Uri;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SearchByImageLoadFragment newInstance(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            SearchByImageLoadFragment searchByImageLoadFragment = new SearchByImageLoadFragment();
            searchByImageLoadFragment.setArguments(d.b(new Pair("KeyExtraUri", uri)));
            return searchByImageLoadFragment;
        }

        private Companion() {
        }
    }

    private final FragmentSearchPhotoLoadBinding getBinding() {
        FragmentSearchPhotoLoadBinding fragmentSearchPhotoLoadBinding = this._binding;
        Intrinsics.f(fragmentSearchPhotoLoadBinding);
        return fragmentSearchPhotoLoadBinding;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SearchBarComponent.Factory factory = DaggerSearchBarComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage2.b(ActionComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, SearchHistoryRepositoryComponentApi.class).getDependencyStorage();
        if (SearchHistoryRepositoryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchHistoryRepositoryComponentApi is not DiComponent");
        }
        SearchHistoryRepositoryComponentApi searchHistoryRepositoryComponentApi = (SearchHistoryRepositoryComponentApi) dependencyStorage3.b(SearchHistoryRepositoryComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, SearchPrefetchApi.class).getDependencyStorage();
        if (SearchPrefetchApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchPrefetchApi is not DiComponent");
        }
        SearchPrefetchApi searchPrefetchApi = (SearchPrefetchApi) dependencyStorage4.b(SearchPrefetchApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage5.b(ComposerComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, SearchByImageRepositoryComponentApi.class).getDependencyStorage();
        if (SearchByImageRepositoryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchByImageRepositoryComponentApi is not DiComponent");
        }
        SearchByImageRepositoryComponentApi searchByImageRepositoryComponentApi = (SearchByImageRepositoryComponentApi) dependencyStorage6.b(SearchByImageRepositoryComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, SearchOnboardingRepositoryComponentApi.class).getDependencyStorage();
        if (SearchOnboardingRepositoryComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component SearchOnboardingRepositoryComponentApi is not DiComponent");
        }
        SearchOnboardingRepositoryComponentApi searchOnboardingRepositoryComponentApi = (SearchOnboardingRepositoryComponentApi) dependencyStorage7.b(SearchOnboardingRepositoryComponentApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        AndroidPlatformComponentApi androidPlatformComponentApi = (AndroidPlatformComponentApi) dependencyStorage8.b(AndroidPlatformComponentApi.class);
        C6740b dependencyStorage9 = C6739a.b(this, OnboardingComponentApi.class).getDependencyStorage();
        if (OnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingComponentApi is not DiComponent");
        }
        OnboardingComponentApi onboardingComponentApi = (OnboardingComponentApi) dependencyStorage9.b(OnboardingComponentApi.class);
        C6740b dependencyStorage10 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage10.b(ContextComponentDependencies.class);
        C6740b dependencyStorage11 = C6739a.b(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage11.b(StorageComponentApi.class);
        C6740b dependencyStorage12 = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage12.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage13 = C6739a.b(this, AnalyticsScreenStorageComponentApi.class).getDependencyStorage();
        if (AnalyticsScreenStorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsScreenStorageComponentApi is not DiComponent");
        }
        AnalyticsScreenStorageComponentApi analyticsScreenStorageComponentApi = (AnalyticsScreenStorageComponentApi) dependencyStorage13.b(AnalyticsScreenStorageComponentApi.class);
        C6740b dependencyStorage14 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage14.b(AccountComponentApi.class);
        C6740b dependencyStorage15 = C6739a.b(this, CustomActionHandlersComponentApi.class).getDependencyStorage();
        if (CustomActionHandlersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CustomActionHandlersComponentApi is not DiComponent");
        }
        SearchBarComponent create = factory.create(networkComponentApi, actionComponentApi, searchHistoryRepositoryComponentApi, searchByImageRepositoryComponentApi, searchPrefetchApi, composerComponentApi, searchOnboardingRepositoryComponentApi, onboardingComponentApi, storageComponentApi, contextComponentDependencies, androidPlatformComponentApi, analyticsComponentApi, analyticsScreenStorageComponentApi, accountComponentApi, (CustomActionHandlersComponentApi) dependencyStorage15.b(CustomActionHandlersComponentApi.class));
        this.vmProvider = create.searchPhotoViewModel();
        this.searchByImageViewModel = (SearchByImageViewModel) new z0(C10464f.a(this), new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageLoadFragment$onAttach$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                a aVar;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                aVar = SearchByImageLoadFragment.this.vmProvider;
                if (aVar == null) {
                    Intrinsics.n("vmProvider");
                    throw null;
                }
                SearchByImageViewModel searchByImageViewModel = (SearchByImageViewModel) aVar.get();
                Intrinsics.g(searchByImageViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return searchByImageViewModel;
            }
        }).a(SearchByImageViewModel.class);
        this.navigator = create.navigator();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, this, false, 0L, 6, null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentSearchPhotoLoadBinding.inflate(inflater, container, false);
        FrameLayout constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Uri uri;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null && (uri = (Uri) c.a(arguments, "KeyExtraUri", Uri.class)) != null) {
            SearchByImageViewModel searchByImageViewModel = this.searchByImageViewModel;
            if (searchByImageViewModel == null) {
                Intrinsics.n("searchByImageViewModel");
                throw null;
            }
            ContentResolver contentResolver = requireActivity().getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            searchByImageViewModel.searchByImage(uri, contentResolver);
        }
        SearchByImageViewModel searchByImageViewModel2 = this.searchByImageViewModel;
        if (searchByImageViewModel2 == null) {
            Intrinsics.n("searchByImageViewModel");
            throw null;
        }
        C2399j.C(new C2408n0(searchByImageViewModel2.getOpenSearchResultFlow(), new SearchByImageLoadFragment$onViewCreated$3(this, null)), K.a(this));
        SearchByImageViewModel searchByImageViewModel3 = this.searchByImageViewModel;
        if (searchByImageViewModel3 != null) {
            C2399j.C(new C2408n0(searchByImageViewModel3.getShowErrorNotificationFlow(), new SearchByImageLoadFragment$onViewCreated$4(this, null)), K.a(this));
        } else {
            Intrinsics.n("searchByImageViewModel");
            throw null;
        }
    }
}
