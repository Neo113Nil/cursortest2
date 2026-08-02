package ru.ozon.app.android.storefront.screens.about;

import Dc0.m;
import Dc0.n;
import GZ.g;
import Pc.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.mapcommon.mapcommon.di.LocationComponentApi;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.R$drawable;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$string;
import ru.ozon.app.android.storefront.databinding.FragmentAboutBinding;
import ru.ozon.app.android.storefront.databinding.ViewStubAboutToolbarSelectBinding;
import ru.ozon.app.android.storefront.screens.about.di.AboutFragmentComponent;
import ru.ozon.app.android.storefront.screens.about.di.DaggerAboutFragmentComponent;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.uikit.utils.StatusBarController;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001WB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R(\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\"\u0010I\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010R\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006X"}, d2 = {"Lru/ozon/app/android/storefront/screens/about/AboutFragment;", "Landroidx/fragment/app/m;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/widget/TextView;", "", "applyUnderlineSpan", "(Landroid/widget/TextView;)V", "Lru/ozon/app/android/storefront/databinding/FragmentAboutBinding;", "inflateToolbarForSelect", "(Lru/ozon/app/android/storefront/databinding/FragmentAboutBinding;)Lkotlin/Unit;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onClick", "(Landroid/view/View;)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/app/android/account/user/UserManager;", "getUserManager", "()Lru/ozon/app/android/account/user/UserManager;", "setUserManager", "(Lru/ozon/app/android/account/user/UserManager;)V", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "getConfig", "()Lru/ozon/app/android/network/di/NetworkComponentConfig;", "setConfig", "(Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "getDebugToolsService", "()Lru/ozon/app/android/storage/debug/DebugToolsService;", "setDebugToolsService", "(Lru/ozon/app/android/storage/debug/DebugToolsService;)V", "LPc/a;", "Lru/ozon/app/android/storefront/screens/about/AboutViewModelImpl;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "setViewModelProvider", "(LPc/a;)V", "Lru/ozon/app/android/storefront/screens/about/AboutViewModel;", "aboutViewModel", "Lru/ozon/app/android/storefront/screens/about/AboutViewModel;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "setAppType", "(Lru/ozon/app/android/utils/AppType;)V", "", "personalDataUrl", "Ljava/lang/String;", "_binding", "Lru/ozon/app/android/storefront/databinding/FragmentAboutBinding;", "getBinding", "()Lru/ozon/app/android/storefront/databinding/FragmentAboutBinding;", "binding", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AboutFragment extends ComponentCallbacksC5392m implements View.OnClickListener {
    private FragmentAboutBinding _binding;
    private AboutViewModel aboutViewModel;
    public AppType appType;
    public NetworkComponentConfig config;
    public DebugToolsService debugToolsService;
    private String personalDataUrl;
    public g router;
    public UserManager userManager;
    public a<AboutViewModelImpl> viewModelProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/screens/about/AboutFragment$Companion;", "", "<init>", "()V", "BX_LICENSE_URI", "", "SELECT_LICENSE_URI", "TOOLBAR_SEPARATOR_HEIGHT", "", "newInstance", "Lru/ozon/app/android/storefront/screens/about/AboutFragment;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AboutFragment newInstance() {
            return new AboutFragment();
        }

        private Companion() {
        }
    }

    private final void applyUnderlineSpan(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
        textView.setText(spannableString);
    }

    private final FragmentAboutBinding getBinding() {
        FragmentAboutBinding fragmentAboutBinding = this._binding;
        if (fragmentAboutBinding != null) {
            return fragmentAboutBinding;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Unit inflateToolbarForSelect(FragmentAboutBinding fragmentAboutBinding) {
        Drawable mutate;
        ViewStubAboutToolbarSelectBinding bind = ViewStubAboutToolbarSelectBinding.bind(fragmentAboutBinding.toolbarSelect.inflate());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int themeColor = ThemeExtKt.themeColor(requireContext, R$attr.bgDarkKey);
        bind.roundedSeparator.setViewState(new IslandSeparatorView.ViewState(false, false, 8, themeColor, 2, null));
        StatusBarController statusBarController = StatusBarController.INSTANCE;
        StatusBarController.UpdateReason.NewState newState = StatusBarController.UpdateReason.NewState.INSTANCE;
        statusBarController.setStatusBarBackgroundColor(this, newState, themeColor);
        StatusBarController.setStatusBarContentColor$default(statusBarController, this, newState, true, false, 8, null);
        bind.toolbarSelect.setNavigationOnClickListener(new n(this, 11));
        Drawable navigationIcon = bind.toolbarSelect.getNavigationIcon();
        if (navigationIcon == null || (mutate = navigationIcon.mutate()) == null) {
            return null;
        }
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        mutate.setTint(ThemeExtKt.themeColor(requireContext2, R$attr.graphicTertiaryOnDark));
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inflateToolbarForSelect$lambda$7$lambda$6(AboutFragment aboutFragment, View view) {
        aboutFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3$lambda$2(AboutFragment aboutFragment, View view) {
        aboutFragment.requireActivity().onBackPressed();
    }

    @NotNull
    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.n("appType");
        throw null;
    }

    @NotNull
    public final NetworkComponentConfig getConfig() {
        NetworkComponentConfig networkComponentConfig = this.config;
        if (networkComponentConfig != null) {
            return networkComponentConfig;
        }
        Intrinsics.n("config");
        throw null;
    }

    @NotNull
    public final DebugToolsService getDebugToolsService() {
        DebugToolsService debugToolsService = this.debugToolsService;
        if (debugToolsService != null) {
            return debugToolsService;
        }
        Intrinsics.n("debugToolsService");
        throw null;
    }

    @NotNull
    public final g getRouter() {
        g gVar = this.router;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.n("router");
        throw null;
    }

    @NotNull
    public final UserManager getUserManager() {
        UserManager userManager = this.userManager;
        if (userManager != null) {
            return userManager;
        }
        Intrinsics.n("userManager");
        throw null;
    }

    @NotNull
    public final a<AboutViewModelImpl> getViewModelProvider() {
        a<AboutViewModelImpl> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AboutFragmentComponent.Factory factory = DaggerAboutFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage2.b(StorageComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage3.b(NavigationComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage4.b(AccountComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, LocationComponentApi.class).getDependencyStorage();
        if (LocationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component LocationComponentApi is not DiComponent");
        }
        LocationComponentApi locationComponentApi = (LocationComponentApi) dependencyStorage5.b(LocationComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, AndroidPlatformComponentDependencies.class).getDependencyStorage();
        if (AndroidPlatformComponentDependencies.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentDependencies is not DiComponent");
        }
        factory.create(networkComponentApi, storageComponentApi, navigationComponentApi, accountComponentApi, locationComponentApi, (AndroidPlatformComponentDependencies) dependencyStorage6.b(AndroidPlatformComponentDependencies.class)).inject(this);
        super.onAttach(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        int id2 = view.getId();
        if (id2 != R$id.license) {
            if (id2 != R$id.personalData || (str = this.personalDataUrl) == null) {
                return;
            }
            g.a.a(getRouter(), str, null, null, 6);
            return;
        }
        Uri webView$default = LinkGenerator.webView$default(LinkGenerator.INSTANCE, getAppType() == AppType.SELECT ? "https://docs.ozon.ru/legal/terms-of-use/site/ozon-select-terms" : "https://docs.ozon.ru/common/pravila-prodayoi-i-rekvizity/litsenzionnoe-soglashenie-na-ispol-zovanie-programmy-ozon-ru-dlya-android/", StringProvider.getString(R$string.about_app_name_non_caps_android), false, false, 12, null);
        g router = getRouter();
        String uri = webView$default.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        g.a.a(router, uri, null, null, 6);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.aboutViewModel = (AboutViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.storefront.screens.about.AboutFragment$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AboutViewModelImpl aboutViewModelImpl = AboutFragment.this.getViewModelProvider().get();
                Intrinsics.g(aboutViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return aboutViewModelImpl;
            }
        }).a(AboutViewModelImpl.class);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentAboutBinding.inflate(inflater, null, false);
        LinearLayoutCompat constraintLayout = getBinding().getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        this._binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @SuppressLint({"SetTextI18n"})
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentAboutBinding binding = getBinding();
        AboutViewModel aboutViewModel = this.aboutViewModel;
        if (aboutViewModel == null) {
            Intrinsics.n("aboutViewModel");
            throw null;
        }
        aboutViewModel.getAboutInfo().observe(getViewLifecycleOwner(), new AboutFragment$sam$androidx_lifecycle_Observer$0(new AboutFragment$onViewCreated$1$1(binding, this)));
        binding.version.setText(StringProvider.getString(R$string.about_app_short_version_android, "19.28.0", 2698));
        long userId = getUserManager().getUserId();
        TextView textView = binding.userId;
        Intrinsics.f(textView);
        textView.setVisibility(userId != 0 ? 0 : 8);
        textView.setText(String.valueOf(userId));
        binding.copyrightRange.setText(StringProvider.getString(R$string.about_copyright_years_range_android, String.valueOf(Calendar.getInstance().get(1))));
        try {
            if (getConfig().getIsDebug()) {
                binding.commitHashTv.setText(getDebugToolsService().getCommitHash());
                TextView commitHashTv = binding.commitHashTv;
                Intrinsics.checkNotNullExpressionValue(commitHashTv, "commitHashTv");
                commitHashTv.setVisibility(0);
            }
        } catch (Exception e11) {
            Lm0.a.f17149a.w(e11);
        }
        binding.license.setOnClickListener(this);
        binding.personalData.setOnClickListener(this);
        if (getAppType() != AppType.SELECT) {
            Toolbar toolbar = binding.toolbar;
            Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
            toolbar.setVisibility(0);
            binding.toolbar.setTitle(R$string.about_toolbar_title_android);
            binding.toolbar.setNavigationOnClickListener(new m(this, 9));
            binding.logo.setImageResource(R$drawable.ic_logo_about);
            return;
        }
        inflateToolbarForSelect(binding);
        binding.logo.setImageResource(R$drawable.ic_logo_about_select);
        ImageView logo = binding.logo;
        Intrinsics.checkNotNullExpressionValue(logo, "logo");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ThemeExtKt.tint(logo, Integer.valueOf(ThemeExtKt.themeColor(requireContext, R$attr.graphicKey)));
        Button license = binding.license;
        Intrinsics.checkNotNullExpressionValue(license, "license");
        applyUnderlineSpan(license);
        Button personalData = binding.personalData;
        Intrinsics.checkNotNullExpressionValue(personalData, "personalData");
        applyUnderlineSpan(personalData);
    }
}
