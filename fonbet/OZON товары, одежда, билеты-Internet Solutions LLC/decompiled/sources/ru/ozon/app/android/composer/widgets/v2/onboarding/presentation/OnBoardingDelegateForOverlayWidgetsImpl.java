package ru.ozon.app.android.composer.widgets.v2.onboarding.presentation;

import Sc.InterfaceC4008j;
import WZ.l;
import WZ.t;
import WZ.x;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialog;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.dialog.OnBoardingDialogCutConfig;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0017H\u0002¢\u0006\u0004\b\u0011\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012J/\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R0\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0010\u0018\u00010(8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001d\u0010E\u001a\u0004\u0018\u00010@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010B\u001a\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010MR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100¨\u0006N"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgetsImpl;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateForOverlayWidgets;", "Ll10/i;", "container", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "widgetId", "", "widgetKey", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "onBoardingDto", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "viewModel", "<init>", "(Ll10/i;Landroidx/lifecycle/J;Ljava/lang/Long;Ljava/lang/String;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;)V", "", "showOnboarding", "()V", "", "isShown", "onShownOnboarding", "(Z)V", "Landroidx/fragment/app/G;", "(Landroidx/fragment/app/G;)V", "trackOnboardingView", "Landroid/view/View;", "view", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "onBoardingCutConfig", "Lkotlin/Function0;", "onCropAreaClick", "bind", "(Landroid/view/View;Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;Lkotlin/jvm/functions/Function0;)V", "unbind", "Landroidx/lifecycle/J;", "Ljava/lang/Long;", "Ljava/lang/String;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lkotlin/Function1;", "onShownListener", "Lkotlin/jvm/functions/Function1;", "getOnShownListener", "()Lkotlin/jvm/functions/Function1;", "setOnShownListener", "(Lkotlin/jvm/functions/Function1;)V", "onUnbindListener", "Lkotlin/jvm/functions/Function0;", "getOnUnbindListener", "()Lkotlin/jvm/functions/Function0;", "setOnUnbindListener", "(Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "fragmentManager", "Landroidx/fragment/app/G;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "onBoardingDialog", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/dialog/OnBoardingDialog;", "Landroid/view/ViewGroup;", "rootView$delegate", "LSc/j;", "getRootView", "()Landroid/view/ViewGroup;", "rootView", "", "statusBarHeight$delegate", "getStatusBarHeight", "()I", "statusBarHeight", "targetView", "Landroid/view/View;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingCutConfig;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OnBoardingDelegateForOverlayWidgetsImpl implements OnBoardingDelegateForOverlayWidgets {
    private final G fragmentManager;

    @NotNull
    private final J lifecycleOwner;
    private OnBoardingCutConfig onBoardingCutConfig;
    private OnBoardingDialog onBoardingDialog;

    @NotNull
    private final OnBoardingDTO onBoardingDto;
    private Function0<Unit> onCropAreaClick;
    private Function1<? super Boolean, Unit> onShownListener;
    private Function0<Unit> onUnbindListener;

    @NotNull
    private final ComposerReferences refs;

    /* renamed from: rootView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j rootView;

    /* renamed from: statusBarHeight$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j statusBarHeight;
    private View targetView;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final BaseOnBoardingViewModel viewModel;
    private final Long widgetId;

    @NotNull
    private final String widgetKey;

    public OnBoardingDelegateForOverlayWidgetsImpl(@NotNull i container, @NotNull J lifecycleOwner, Long l11, @NotNull String widgetKey, @NotNull OnBoardingDTO onBoardingDto, @NotNull BaseOnBoardingViewModel viewModel) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        Intrinsics.checkNotNullParameter(onBoardingDto, "onBoardingDto");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.lifecycleOwner = lifecycleOwner;
        this.widgetId = l11;
        this.widgetKey = widgetKey;
        this.onBoardingDto = onBoardingDto;
        this.viewModel = viewModel;
        e V11 = container.V();
        Intrinsics.g(V11, "null cannot be cast to non-null type ru.ozon.app.android.composer.ComposerReferences");
        this.refs = (ComposerReferences) V11;
        this.tokenizedAnalytics = container.X();
        r a11 = container.K().a();
        this.fragmentManager = a11 != null ? a11.getSupportFragmentManager() : null;
        this.rootView = LazyUtilsKt.unsafeLazy(new OnBoardingDelegateForOverlayWidgetsImpl$rootView$2(container));
        this.statusBarHeight = LazyUtilsKt.unsafeLazy(new OnBoardingDelegateForOverlayWidgetsImpl$statusBarHeight$2(this));
        final AbstractC5434v lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b() == AbstractC5434v.b.DESTROYED) {
            unbind();
        } else {
            lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgetsImpl$special$$inlined$whenDestroyed$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(J owner) {
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    this.unbind();
                    AbstractC5434v.this.e(this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getRootView() {
        return (ViewGroup) this.rootView.getValue();
    }

    private final int getStatusBarHeight() {
        return ((Number) this.statusBarHeight.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShownOnboarding(boolean isShown) {
        this.viewModel.onShown(this.widgetKey, isShown);
        Function1<Boolean, Unit> onShownListener = getOnShownListener();
        if (onShownListener != null) {
            onShownListener.invoke(Boolean.valueOf(isShown));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOnboarding() {
        G g10 = this.fragmentManager;
        if (g10 != null) {
            OnBoardingDelegateExtKt.setupFragmentResultListener(g10, this.targetView, this.lifecycleOwner, new OnBoardingDelegateForOverlayWidgetsImpl$showOnboarding$1$1(this), this.onCropAreaClick);
            showOnboarding(g10);
        }
    }

    private final void trackOnboardingView() {
        t b11;
        Map<String, TokenizedTrackingInfo> trackingInfo = this.onBoardingDto.getTrackingInfo();
        if (trackingInfo == null || (b11 = x.b(trackingInfo, this.widgetId, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgets
    public void bind(@NotNull View view, @NotNull OnBoardingCutConfig onBoardingCutConfig, Function0<Unit> onCropAreaClick) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onBoardingCutConfig, "onBoardingCutConfig");
        this.targetView = view;
        this.onBoardingCutConfig = onBoardingCutConfig;
        this.onCropAreaClick = onCropAreaClick;
        OnBoardingDelegateExtKt.showOnboarding(this.refs.getContainer(), this.widgetKey, this.viewModel, new OnBoardingDelegateForOverlayWidgetsImpl$bind$1(this));
    }

    public Function1<Boolean, Unit> getOnShownListener() {
        return this.onShownListener;
    }

    public Function0<Unit> getOnUnbindListener() {
        return this.onUnbindListener;
    }

    public void setOnShownListener(Function1<? super Boolean, Unit> function1) {
        this.onShownListener = function1;
    }

    public void setOnUnbindListener(Function0<Unit> function0) {
        this.onUnbindListener = function0;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgets
    public void unbind() {
        Function0<Unit> onUnbindListener = getOnUnbindListener();
        if (onUnbindListener != null) {
            onUnbindListener.invoke();
        }
        this.viewModel.onUnbind$composer_prodGoogleAllVendorsRelease();
        this.targetView = null;
        OnBoardingDelegateExtKt.unbind(this.onBoardingDialog);
        this.onBoardingDialog = null;
        setOnUnbindListener(null);
    }

    private final void showOnboarding(G g10) {
        OnBoardingDialogCutConfig createOnboardingValues;
        View view = this.targetView;
        if (view == null || (createOnboardingValues = OnBoardingDelegateExtKt.createOnboardingValues(view, getStatusBarHeight(), this.onBoardingCutConfig)) == null) {
            return;
        }
        OnBoardingDialog newInstance = OnBoardingDialog.INSTANCE.newInstance(createOnboardingValues, this.onBoardingDto);
        newInstance.show(g10, "OnBoardingDialog");
        trackOnboardingView();
        this.onBoardingDialog = newInstance;
    }
}
