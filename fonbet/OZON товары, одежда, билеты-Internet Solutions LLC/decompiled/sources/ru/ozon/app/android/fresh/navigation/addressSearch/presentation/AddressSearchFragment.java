package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import EI.a;
import GZ.g;
import GZ.l;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.Q;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.ComposerComponentApi;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.fresh.navigation.R$id;
import ru.ozon.app.android.fresh.navigation.R$layout;
import ru.ozon.app.android.fresh.navigation.addressSearch.di.AddressSearchComponent;
import ru.ozon.app.android.fresh.navigation.addressSearch.di.DaggerAddressSearchComponent;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchFragment;
import ru.ozon.app.android.fresh.navigation.databinding.FragmentAddressSearchSuggestionsBinding;
import ru.ozon.app.android.mapcommon.map.di.OzonMapComponentApi;
import ru.ozon.app.android.mapcommon.mapcommon.di.MapCommonComponentApi;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.newrouter.ui.fragment.FullScreenFragmentObserver;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00014\u0018\u0000 @2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010+\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "", SearchIntents.EXTRA_QUERY, "", "switchLayouts", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;", "viewModel", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;", "getViewModel", "()Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;", "setViewModel", "(Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel;)V", "LGZ/g;", "ozonRouter", "LGZ/g;", "getOzonRouter", "()LGZ/g;", "setOzonRouter", "(LGZ/g;)V", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchBinder;", "binder", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchBinder;", "getBinder", "()Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchBinder;", "setBinder", "(Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchBinder;)V", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentAddressSearchSuggestionsBinding;", "_binding", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentAddressSearchSuggestionsBinding;", "ru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchFragment$hideKeyboardOnScrollListener$1", "hideKeyboardOnScrollListener", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchFragment$hideKeyboardOnScrollListener$1;", "", "activitySoftInputMode", "Ljava/lang/Integer;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "myAddressesFragment$delegate", "LSc/j;", "getMyAddressesFragment", "()Lru/ozon/app/android/composer/universalscreen/view/ComposerFragment;", "myAddressesFragment", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSearchFragment extends ComponentCallbacksC5392m {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private FragmentAddressSearchSuggestionsBinding _binding;
    private Integer activitySoftInputMode;
    public AddressSearchBinder binder;

    @NotNull
    private final AddressSearchFragment$hideKeyboardOnScrollListener$1 hideKeyboardOnScrollListener = new RecyclerView.t() { // from class: ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchFragment$hideKeyboardOnScrollListener$1
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (dy > 0) {
                KeyboardUtilsKt.hideKeyboard(AddressSearchFragment.this);
            }
        }
    };

    /* renamed from: myAddressesFragment$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j myAddressesFragment = k.b(new AddressSearchFragment$myAddressesFragment$2(this));
    public g ozonRouter;
    public AddressSearchViewModel viewModel;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchFragment$Companion;", "", "<init>", "()V", "TAG", "", "COMPOSER_TAG", "ARG_SEARCH_QUERY", "ARG_DEEPLINK", "MIN_SEARCH_QUERY_LENGTH", "", "newInstance", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchFragment;", SearchIntents.EXTRA_QUERY, "deeplink", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AddressSearchFragment newInstance(String query, @NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            AddressSearchFragment addressSearchFragment = new AddressSearchFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_SEARCH_QUERY", query);
            bundle.putString("ARG_DEEPLINK", deeplink);
            addressSearchFragment.setArguments(bundle);
            return addressSearchFragment;
        }

        private Companion() {
        }
    }

    private final ComposerFragment getMyAddressesFragment() {
        return (ComposerFragment) this.myAddressesFragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(AddressSearchFragment addressSearchFragment, View view) {
        l.a(addressSearchFragment.getOzonRouter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(AddressSearchFragment addressSearchFragment, View view, boolean z11) {
        if (z11) {
            KeyboardUtilsKt.toggleKeyboard(addressSearchFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchLayouts(String query) {
        if (query == null || query.length() <= 0) {
            Q p11 = getChildFragmentManager().p();
            p11.y(getMyAddressesFragment());
            p11.k();
        } else {
            Q p12 = getChildFragmentManager().p();
            p12.o(getMyAddressesFragment());
            p12.k();
        }
    }

    @NotNull
    public final AddressSearchBinder getBinder() {
        AddressSearchBinder addressSearchBinder = this.binder;
        if (addressSearchBinder != null) {
            return addressSearchBinder;
        }
        Intrinsics.n("binder");
        throw null;
    }

    @NotNull
    public final g getOzonRouter() {
        g gVar = this.ozonRouter;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("ozonRouter");
        throw null;
    }

    @NotNull
    public final AddressSearchViewModel getViewModel() {
        AddressSearchViewModel addressSearchViewModel = this.viewModel;
        if (addressSearchViewModel != null) {
            return addressSearchViewModel;
        }
        Intrinsics.n("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AddressSearchComponent.Factory factory = DaggerAddressSearchComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage2.b(NavigationComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, ComposerComponentApi.class).getDependencyStorage();
        if (ComposerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ComposerComponentApi is not DiComponent");
        }
        ComposerComponentApi composerComponentApi = (ComposerComponentApi) dependencyStorage3.b(ComposerComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, ContextComponentDependencies.class).getDependencyStorage();
        if (ContextComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ContextComponentDependencies is not DiComponent");
        }
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) dependencyStorage4.b(ContextComponentDependencies.class);
        C6740b dependencyStorage5 = C6739a.b(this, OzonMapComponentApi.class).getDependencyStorage();
        if (OzonMapComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OzonMapComponentApi is not DiComponent");
        }
        OzonMapComponentApi ozonMapComponentApi = (OzonMapComponentApi) dependencyStorage5.b(OzonMapComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, MapCommonComponentApi.class).getDependencyStorage();
        if (MapCommonComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component MapCommonComponentApi is not DiComponent");
        }
        factory.create(networkComponentApi, navigationComponentApi, composerComponentApi, contextComponentDependencies, ozonMapComponentApi, (MapCommonComponentApi) dependencyStorage6.b(MapCommonComponentApi.class)).inject(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBinder(new AddressSearchBinder(this, getViewModel()));
        FullScreenFragmentObserver.Companion.showFullScreen$default(FullScreenFragmentObserver.INSTANCE, this, false, 0L, 6, null);
        Q p11 = getChildFragmentManager().p();
        p11.b(R$id.composerContainer, getMyAddressesFragment(), "COMPOSER_TAG");
        p11.k();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentAddressSearchSuggestionsBinding bind = FragmentAddressSearchSuggestionsBinding.bind(inflater.inflate(R$layout.fragment_address_search_suggestions, container, false));
        this._binding = bind;
        if (bind != null) {
            return bind.getConstraintLayout();
        }
        return null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        Window window;
        RecyclerView recyclerView;
        FragmentAddressSearchSuggestionsBinding fragmentAddressSearchSuggestionsBinding = this._binding;
        if (fragmentAddressSearchSuggestionsBinding != null && (recyclerView = fragmentAddressSearchSuggestionsBinding.suggestionsRv) != null) {
            recyclerView.removeOnScrollListener(this.hideKeyboardOnScrollListener);
        }
        KeyboardUtilsKt.hideKeyboard(this);
        Integer num = this.activitySoftInputMode;
        if (num != null) {
            int intValue = num.intValue();
            r activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(intValue);
            }
        }
        this._binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        String string;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAddressSearchSuggestionsBinding fragmentAddressSearchSuggestionsBinding = this._binding;
        if (fragmentAddressSearchSuggestionsBinding == null) {
            return;
        }
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Window window = requireActivity.getWindow();
        String str = null;
        this.activitySoftInputMode = (window == null || (attributes = window.getAttributes()) == null) ? null : Integer.valueOf(attributes.softInputMode);
        SuggestionsAdapter suggestionsAdapter = new SuggestionsAdapter(new AddressSearchItemCallback());
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        getBinder().setView(new AddressSearchView(fragmentAddressSearchSuggestionsBinding, suggestionsAdapter, requireActivity, viewLifecycleOwner));
        Window window2 = requireActivity.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        fragmentAddressSearchSuggestionsBinding.cancelButton.setOnClickListener(new a(this, 3));
        StatusBarController.setStatusBarColorByTheme$default(StatusBarController.INSTANCE, this, StatusBarController.UpdateReason.NewState.INSTANCE, 0, 4, null);
        fragmentAddressSearchSuggestionsBinding.searchSv.n(new View.OnFocusChangeListener() { // from class: Nw.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                AddressSearchFragment.onViewCreated$lambda$1(AddressSearchFragment.this, view2, z11);
            }
        });
        fragmentAddressSearchSuggestionsBinding.searchSv.o(new AddressSearchFragment$onViewCreated$3(this));
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("ARG_SEARCH_QUERY")) != null) {
            fragmentAddressSearchSuggestionsBinding.searchSv.p(string, false);
            str = string;
        }
        switchLayouts(str);
        Context context = getContext();
        if (context != null) {
            fragmentAddressSearchSuggestionsBinding.suggestionsRv.addItemDecoration(new SearchDividerDecoration(context));
        }
        fragmentAddressSearchSuggestionsBinding.suggestionsRv.addOnScrollListener(this.hideKeyboardOnScrollListener);
        getViewModel().bindInitial(str);
    }

    public final void setBinder(@NotNull AddressSearchBinder addressSearchBinder) {
        Intrinsics.checkNotNullParameter(addressSearchBinder, "<set-?>");
        this.binder = addressSearchBinder;
    }
}
