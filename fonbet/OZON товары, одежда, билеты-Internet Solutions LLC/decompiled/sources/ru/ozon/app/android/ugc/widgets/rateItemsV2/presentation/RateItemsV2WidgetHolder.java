package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import WZ.l;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.RateItemsDelegate;
import ru.ozon.app.android.tabbar.ui.model.BottomNavigationConfig;
import ru.ozon.app.android.ugc.R$layout;
import ru.ozon.app.android.ugc.databinding.WidgetRateItemsV2Binding;
import ru.ozon.app.android.ugc.flags.RateItemsClearDismissTimeoutHours;
import ru.ozon.app.android.ugc.flags.RateItemsClearStateOnAppRestartEnabled;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.C10727i;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 J2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001JBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J#\u0010\u001e\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R'\u00103\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00140-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R'\u00106\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00140-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R'\u00109\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00140-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u00102R&\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010F\u001a\u0004\u0018\u00010C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2WidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2WrapperVO;", "Ll10/i;", "container", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2ViewModel;", "viewModel", "LGZ/g;", "router", "LWZ/l;", "tokenizedAnalytics", "", "isTeen", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Ll10/i;Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2ViewModel;LGZ/g;LWZ/l;ZLVg/d;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "observeItems", "()V", "observeAppClose", "setupDelegate", "setupView", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "Lru/ozon/uni/android/haptic/HapticToken;", "hapticToken", "showNotificationWithVibration", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;Lru/ozon/uni/android/haptic/HapticToken;)V", "runVibration", "(Lru/ozon/uni/android/haptic/HapticToken;)V", "item", "bind", "(Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2WrapperVO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2ViewModel;", "LGZ/g;", "LWZ/l;", "Z", "LVg/d;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "ignoreActionHandler$delegate", "LSc/j;", "getIgnoreActionHandler", "()Lkotlin/jvm/functions/Function1;", "ignoreActionHandler", "addReviewActionHandler$delegate", "getAddReviewActionHandler", "addReviewActionHandler", "actionHandler$delegate", "getActionHandler", "actionHandler", "Lkotlin/Function2;", "onTimerFinish", "Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "view", "Landroid/view/View;", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2View;", "rateItemsV2View", "Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2View;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getCoordinatorLayout", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "coordinatorLayout", "getMetricView", "()Landroid/view/View;", "metricView", "Companion", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateItemsV2WidgetHolder extends AbstractC6065b<RateItemsV2WrapperVO> {

    /* renamed from: actionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j actionHandler;

    /* renamed from: addReviewActionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j addReviewActionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FeatureService featureService;

    /* renamed from: ignoreActionHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ignoreActionHandler;
    private final boolean isTeen;

    @NotNull
    private final Function2<Boolean, Boolean, Unit> onTimerFinish;
    private RateItemsV2View rateItemsV2View;

    @NotNull
    private final g router;

    @NotNull
    private final l tokenizedAnalytics;
    private View view;

    @NotNull
    private final RateItemsV2ViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/rateItemsV2/presentation/RateItemsV2WidgetHolder$Companion;", "", "<init>", "()V", "SKIP_REVIEW_COMPOSER_ACTION_V1", "", "SKIP_REVIEW_COMPOSER_ACTION_V2", "WITH_ANIMATION_ACTION_PARAM", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RateItemsV2WidgetHolder(@NotNull i container, @NotNull RateItemsV2ViewModel viewModel, @NotNull g router, @NotNull l tokenizedAnalytics, boolean z11, @NotNull d customActionHandlersStoreFactory, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.container = container;
        this.viewModel = viewModel;
        this.router = router;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.isTeen = z11;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.featureService = featureService;
        this.ignoreActionHandler = k.b(new RateItemsV2WidgetHolder$ignoreActionHandler$2(this));
        this.addReviewActionHandler = k.b(new RateItemsV2WidgetHolder$addReviewActionHandler$2(this));
        this.actionHandler = k.b(new RateItemsV2WidgetHolder$actionHandler$2(this));
        this.onTimerFinish = new RateItemsV2WidgetHolder$onTimerFinish$1(this);
        setupDelegate();
        setupView();
        observeItems();
        observeAppClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> getActionHandler() {
        return (Function1) this.actionHandler.getValue();
    }

    private final Function1<AtomAction, Unit> getAddReviewActionHandler() {
        return (Function1) this.addReviewActionHandler.getValue();
    }

    private final CoordinatorLayout getCoordinatorLayout() {
        return ComposerViewExtensionKt.composerCoordinatorLayout(this.container.Z());
    }

    private final Function1<AtomAction, Unit> getIgnoreActionHandler() {
        return (Function1) this.ignoreActionHandler.getValue();
    }

    private final void observeAppClose() {
        AbstractC5434v lifecycle;
        r a11 = this.container.Q().a();
        if (a11 == null || (lifecycle = a11.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$observeAppClose$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                r rVar = owner instanceof r ? (r) owner : null;
                if (rVar != null && !rVar.isChangingConfigurations()) {
                    RateItemsDelegate.INSTANCE.clear();
                }
                owner.getLifecycle().e(this);
            }
        });
    }

    private final void observeItems() {
        C10727i.c(K.a(this.container.Q().g()), null, null, new RateItemsV2WidgetHolder$observeItems$1(this, null), 3);
        C10727i.c(K.a(this.container.Q().g()), null, null, new RateItemsV2WidgetHolder$observeItems$2(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runVibration(HapticToken hapticToken) {
        View view;
        if (hapticToken == null || (view = this.view) == null) {
            return;
        }
        HapticVibrator.INSTANCE.vibrate(view, hapticToken);
    }

    private final void setupDelegate() {
        RateItemsDelegate.INSTANCE.setupDelegate(this.featureService.getBooleanKey(RateItemsClearStateOnAppRestartEnabled.INSTANCE), this.featureService.getIntKey(RateItemsClearDismissTimeoutHours.INSTANCE));
    }

    private final void setupView() {
        WidgetRateItemsV2Binding bind;
        CoordinatorLayout coordinatorLayout = getCoordinatorLayout();
        View inflate = coordinatorLayout != null ? ViewGroupExtKt.inflate(coordinatorLayout, R$layout.widget_rate_items_v2) : null;
        CoordinatorLayout coordinatorLayout2 = getCoordinatorLayout();
        if (coordinatorLayout2 != null) {
            coordinatorLayout2.addView(inflate);
        }
        this.view = inflate;
        if (inflate == null || (bind = WidgetRateItemsV2Binding.bind(inflate)) == null) {
            return;
        }
        ConstraintLayout rateItemContainer = bind.rateItemContainer;
        Intrinsics.checkNotNullExpressionValue(rateItemContainer, "rateItemContainer");
        ViewExtKt.updatePadding$default(rateItemContainer, 0, 0, 0, BottomNavigationConfig.DEFAULT.getHeight(), 7, null);
        this.rateItemsV2View = new RateItemsV2View(bind, RateItemsDelegate.INSTANCE, this.router, this.tokenizedAnalytics, this.container, getActionHandler(), getIgnoreActionHandler(), this.onTimerFinish, getAddReviewActionHandler(), this.isTeen, new RateItemsV2WidgetHolder$setupView$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationWithVibration(NotificationDTO notification, HapticToken hapticToken) {
        NotificationLayoutManager asNotificationLayoutManager$default;
        C4911f Q11 = this.container.Q();
        if (notification != null) {
            ViewGroup rootView = ContextExtKt.getRootView(Q11.c());
            if (rootView == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
                return;
            } else {
                NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notification, Q11.g(), null, 8, null).show();
            }
        }
        runVibration(hapticToken);
    }

    @Override // d20.AbstractC6065b
    /* renamed from: getMetricView, reason: from getter */
    public View getView() {
        return this.view;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        super.onWidgetDestroyed();
        CoordinatorLayout coordinatorLayout = getCoordinatorLayout();
        if (coordinatorLayout != null) {
            coordinatorLayout.removeView(this.view);
        }
        RateItemsV2View rateItemsV2View = this.rateItemsV2View;
        if (rateItemsV2View != null) {
            rateItemsV2View.removeCallBacks();
        }
        RateItemsV2View rateItemsV2View2 = this.rateItemsV2View;
        if (rateItemsV2View2 != null) {
            rateItemsV2View2.setBottomBorderViewToBehaviour(null);
        }
        this.rateItemsV2View = null;
        this.view = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RateItemsV2WrapperVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String asyncData = item.getAsyncData();
        if (asyncData != null) {
            this.viewModel.fetch(asyncData);
        }
    }
}
