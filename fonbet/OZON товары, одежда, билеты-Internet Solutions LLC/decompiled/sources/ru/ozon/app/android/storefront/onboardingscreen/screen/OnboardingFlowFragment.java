package ru.ozon.app.android.storefront.onboardingscreen.screen;

import Aw.ViewOnClickListenerC2448a;
import G.g;
import LZ.b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.activity.L;
import androidx.core.os.d;
import androidx.fragment.app.r;
import com.google.android.gms.common.internal.ImagesContract;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.e;
import qZ.C9010b;
import qZ.C9011c;
import qZ.InterfaceC9014f;
import rZ.C9236a;
import ru.ozon.app.android.account.di.AccountComponentApi;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.analytics.startup.AppLaunchAnalytics;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.utils.DeeplinkExtKt;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.permission.extension.ActivitiesKt;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefront.R$layout;
import ru.ozon.app.android.storefront.onboardingscreen.closeFlowWatcher.OnboardingCloseFlowWatcher;
import ru.ozon.app.android.storefront.onboardingscreen.di.CloseFlowWatcherComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.DaggerOnboardingFragmentComponent;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingCheckerComponentApi;
import ru.ozon.app.android.storefront.onboardingscreen.di.OnboardingFragmentComponent;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001b\u00106\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00068"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/OnboardingFlowFragment;", "LqZ/c;", "<init>", "()V", "", "shouldAwaitRemote", "", "requestSystemPushEnabled", "(Z)V", "Landroid/net/Uri;", "deeplink", "referrer", "finishWithDeeplink", "(Landroid/net/Uri;Landroid/net/Uri;)V", ImagesContract.URL, "associateReferrer", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "appLaunchAnalytics", "Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "getAppLaunchAnalytics", "()Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;", "setAppLaunchAnalytics", "(Lru/ozon/app/android/analytics/startup/AppLaunchAnalytics;)V", "Lru/ozon/app/android/storefront/onboardingscreen/closeFlowWatcher/OnboardingCloseFlowWatcher;", "closeFlowWatcher", "Lru/ozon/app/android/storefront/onboardingscreen/closeFlowWatcher/OnboardingCloseFlowWatcher;", "getCloseFlowWatcher", "()Lru/ozon/app/android/storefront/onboardingscreen/closeFlowWatcher/OnboardingCloseFlowWatcher;", "setCloseFlowWatcher", "(Lru/ozon/app/android/storefront/onboardingscreen/closeFlowWatcher/OnboardingCloseFlowWatcher;)V", "LPc/a;", "Lru/ozon/app/android/storefront/onboardingscreen/screen/OnboardingFlowFragmentViewModel;", "pViewModel", "LPc/a;", "getPViewModel$storefront_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$storefront_prodGoogleAllVendorsRelease", "(LPc/a;)V", "viewModel$delegate", "LSc/j;", "getViewModel", "()Lru/ozon/app/android/storefront/onboardingscreen/screen/OnboardingFlowFragmentViewModel;", "viewModel", "Companion", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OnboardingFlowFragment extends C9011c {
    public AppLaunchAnalytics appLaunchAnalytics;
    public OnboardingCloseFlowWatcher closeFlowWatcher;
    public a<OnboardingFlowFragmentViewModel> pViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.b(new OnboardingFlowFragment$viewModel$2(this));

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/onboardingscreen/screen/OnboardingFlowFragment$Companion;", "", "<init>", "()V", "LqZ/b;", "config", "Lru/ozon/app/android/storefront/onboardingscreen/screen/OnboardingFlowFragment;", "newInstance", "(LqZ/b;)Lru/ozon/app/android/storefront/onboardingscreen/screen/OnboardingFlowFragment;", "", "ARG_CONFIG", "Ljava/lang/String;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OnboardingFlowFragment newInstance(@NotNull C9010b config) {
            Intrinsics.checkNotNullParameter(config, "config");
            OnboardingFlowFragment onboardingFlowFragment = new OnboardingFlowFragment();
            onboardingFlowFragment.setArguments(d.b(new Pair("ru.ozon.app.android.navigation.newrouter.navigators.flow.CONFIG", config)));
            return onboardingFlowFragment;
        }

        private Companion() {
        }
    }

    private final void associateReferrer(Uri referrer, Uri url) {
        String c11 = DeeplinkExtKt.isDeeplink(url) ? g.c(url.getAuthority(), "/", url.getPath()) : url.getPath();
        if (c11 == null || h.K(c11)) {
            return;
        }
        AppLaunchAnalytics appLaunchAnalytics = getAppLaunchAnalytics();
        String uri = referrer.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        appLaunchAnalytics.associateReferrer(c11, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithDeeplink(Uri deeplink, Uri referrer) {
        if (referrer != null) {
            associateReferrer(referrer, deeplink);
        }
        GZ.g router = getRouter();
        InterfaceC9014f flowTag = getFlowTag();
        String uri = deeplink.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        router.c(new b(new C9236a(flowTag, new e(uri))), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OnboardingFlowFragmentViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OnboardingFlowFragmentViewModel) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(OnboardingFlowFragment onboardingFlowFragment, View view) {
        onboardingFlowFragment.getViewModel().forceCloseFlowState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"InlinedApi"})
    public final void requestSystemPushEnabled(boolean shouldAwaitRemote) {
        r activity = getActivity();
        if (activity != null) {
            ActivitiesKt.requestPermission(activity, new OnboardingFlowFragment$requestSystemPushEnabled$1(shouldAwaitRemote, this));
        }
    }

    @NotNull
    public final AppLaunchAnalytics getAppLaunchAnalytics() {
        AppLaunchAnalytics appLaunchAnalytics = this.appLaunchAnalytics;
        if (appLaunchAnalytics != null) {
            return appLaunchAnalytics;
        }
        Intrinsics.n("appLaunchAnalytics");
        throw null;
    }

    @NotNull
    public final a<OnboardingFlowFragmentViewModel> getPViewModel$storefront_prodGoogleAllVendorsRelease() {
        a<OnboardingFlowFragmentViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    @Override // qZ.C9011c, androidx.fragment.app.ComponentCallbacksC5392m
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R$layout.fragment_newcomer_onboarding, container, false);
    }

    @Override // qZ.C9011c, androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        ImageButton imageButton;
        Intrinsics.checkNotNullParameter(view, "view");
        OnboardingFragmentComponent.Factory factory = DaggerOnboardingFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, NetworkComponentApi.class).getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage2.b(NetworkComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, StorageComponentApi.class).getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage3.b(StorageComponentApi.class);
        C6740b dependencyStorage4 = C6739a.b(this, ActionComponentApi.class).getDependencyStorage();
        if (ActionComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component ActionComponentApi is not DiComponent");
        }
        ActionComponentApi actionComponentApi = (ActionComponentApi) dependencyStorage4.b(ActionComponentApi.class);
        C6740b dependencyStorage5 = C6739a.b(this, OnboardingCheckerComponentApi.class).getDependencyStorage();
        if (OnboardingCheckerComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component OnboardingCheckerComponentApi is not DiComponent");
        }
        OnboardingCheckerComponentApi onboardingCheckerComponentApi = (OnboardingCheckerComponentApi) dependencyStorage5.b(OnboardingCheckerComponentApi.class);
        C6740b dependencyStorage6 = C6739a.b(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        AnalyticsComponentApi analyticsComponentApi = (AnalyticsComponentApi) dependencyStorage6.b(AnalyticsComponentApi.class);
        C6740b dependencyStorage7 = C6739a.b(this, CloseFlowWatcherComponentApi.class).getDependencyStorage();
        if (CloseFlowWatcherComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component CloseFlowWatcherComponentApi is not DiComponent");
        }
        CloseFlowWatcherComponentApi closeFlowWatcherComponentApi = (CloseFlowWatcherComponentApi) dependencyStorage7.b(CloseFlowWatcherComponentApi.class);
        C6740b dependencyStorage8 = C6739a.b(this, AccountComponentApi.class).getDependencyStorage();
        if (AccountComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AccountComponentApi is not DiComponent");
        }
        AccountComponentApi accountComponentApi = (AccountComponentApi) dependencyStorage8.b(AccountComponentApi.class);
        C6740b dependencyStorage9 = C6739a.b(this, NetworkOzonIdComponentApi.class).getDependencyStorage();
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, networkComponentApi, (NetworkOzonIdComponentApi) dependencyStorage9.b(NetworkOzonIdComponentApi.class), storageComponentApi, actionComponentApi, onboardingCheckerComponentApi, analyticsComponentApi, closeFlowWatcherComponentApi, accountComponentApi).inject(this);
        super.onViewCreated(view, savedInstanceState);
        L.a(requireActivity().getOnBackPressedDispatcher(), this, OnboardingFlowFragment$onViewCreated$1.INSTANCE, 2);
        ViewGroup rootView = ContextExtKt.getRootView(this);
        if (rootView != null && (imageButton = (ImageButton) rootView.findViewById(R$id.closeFlowButton)) != null) {
            imageButton.setOnClickListener(new ViewOnClickListenerC2448a(this, 10));
        }
        getViewModel().getNavigationStateLiveData().observe(getViewLifecycleOwner(), new OnboardingFlowFragment$sam$androidx_lifecycle_Observer$0(new OnboardingFlowFragment$onViewCreated$3(this)));
    }
}
