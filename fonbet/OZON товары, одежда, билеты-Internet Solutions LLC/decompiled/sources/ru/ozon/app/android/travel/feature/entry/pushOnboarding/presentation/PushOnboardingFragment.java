package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import GZ.g;
import LZ.b;
import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import a1.C4912a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rZ.C9236a;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.data.PushOnboardingPageData;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.DaggerPushOnboardingFragmentComponent;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.PushOnboardingFragmentComponent;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.di.TravelPushOnboardingComponentApi;
import ru.ozon.app.android.travel.utils.fullScreenWidget.FullScreenController;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00101\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingFragment;", "Landroidx/fragment/app/m;", "<init>", "()V", "", "observeViewModel", "closeFlow", "initDependencies", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LPc/a;", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "setViewModelProvider", "(LPc/a;)V", "LGZ/g;", "router", "LGZ/g;", "getRouter", "()LGZ/g;", "setRouter", "(LGZ/g;)V", "Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;", "fullScreenController$delegate", "LSc/j;", "getFullScreenController", "()Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;", "fullScreenController", "viewModel$delegate", "getViewModel", "()Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingViewModel;", "viewModel", "Companion", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushOnboardingFragment extends ComponentCallbacksC5392m {
    public g router;
    public a<PushOnboardingViewModel> viewModelProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: fullScreenController$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j fullScreenController = LazyUtilsKt.unsafeLazy(PushOnboardingFragment$fullScreenController$2.INSTANCE);

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j viewModel = k.a(n.NONE, new PushOnboardingFragment$viewModel$2(this));

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/PushOnboardingFragment$Companion;", "", "<init>", "()V", "Landroidx/fragment/app/m;", "newInstance", "()Landroidx/fragment/app/m;", "", "TAG", "Ljava/lang/String;", "entry_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComponentCallbacksC5392m newInstance() {
            return new PushOnboardingFragment();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeFlow() {
        getRouter().c(new b(new C9236a(FlowTag.PUSH_ONBOARDING, null)), null);
    }

    private final FullScreenController getFullScreenController() {
        return (FullScreenController) this.fullScreenController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PushOnboardingViewModel getViewModel() {
        Object value = this.viewModel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PushOnboardingViewModel) value;
    }

    private final void initDependencies() {
        PushOnboardingFragmentComponent.Factory factory = DaggerPushOnboardingFragmentComponent.factory();
        C6740b dependencyStorage = C6739a.b(this, NavigationComponentApi.class).getDependencyStorage();
        if (NavigationComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NavigationComponentApi is not DiComponent");
        }
        NavigationComponentApi navigationComponentApi = (NavigationComponentApi) dependencyStorage.b(NavigationComponentApi.class);
        C6740b dependencyStorage2 = C6739a.b(this, TravelPushOnboardingComponentApi.class).getDependencyStorage();
        if (TravelPushOnboardingComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component TravelPushOnboardingComponentApi is not DiComponent");
        }
        TravelPushOnboardingComponentApi travelPushOnboardingComponentApi = (TravelPushOnboardingComponentApi) dependencyStorage2.b(TravelPushOnboardingComponentApi.class);
        C6740b dependencyStorage3 = C6739a.b(this, AndroidPlatformComponentApi.class).getDependencyStorage();
        if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
        }
        factory.create(navigationComponentApi, travelPushOnboardingComponentApi, (AndroidPlatformComponentApi) dependencyStorage3.b(AndroidPlatformComponentApi.class)).inject(this);
    }

    private final void observeViewModel() {
        C2408n0 c2408n0 = new C2408n0(C5427n.a(getViewModel().getOnboardingAction(), getViewLifecycleOwner().getLifecycle(), AbstractC5434v.b.STARTED), new PushOnboardingFragment$observeViewModel$1(this, null));
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C2399j.C(c2408n0, K.a(viewLifecycleOwner));
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
    public final a<PushOnboardingViewModel> getViewModelProvider() {
        a<PushOnboardingViewModel> aVar = this.viewModelProvider;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("viewModelProvider");
        throw null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        initDependencies();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        getFullScreenController().clearWindow(this, false, true);
        PushOnboardingPageData data = getViewModel().getData();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 6, 0);
        composeView.a(new C4912a(true, 243033126, new PushOnboardingFragment$onCreateView$1$1(data, this)));
        return composeView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onDestroyView() {
        super.onDestroyView();
        getFullScreenController().restoreWindow(this);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        observeViewModel();
    }
}
