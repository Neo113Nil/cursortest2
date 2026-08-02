package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Ae.B0;
import Ae.C2399j;
import Ae.C2408n0;
import An.C2439a;
import Sc.InterfaceC4008j;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.t;
import a00.C4911f;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapterDelegate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentDiffUtil;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.view.StaticCouponListView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 Y2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001YBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010\u001fJ\u0017\u0010+\u001a\u00020\u0016*\u00060)j\u0002`*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u0016*\u00060)j\u0002`*H\u0002¢\u0006\u0004\b-\u0010,J\u0017\u00100\u001a\u00020\u00162\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00022\u0006\u00104\u001a\u000203H\u0014¢\u0006\u0004\b5\u00106J'\u00105\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00108\u001a\u000207H\u0014¢\u0006\u0004\b5\u00109J)\u0010>\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00160B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010P\u001a\u00060Nj\u0002`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapterDelegate;", "delegates", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentDiffUtil;", "contentDiffUtil", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "<init>", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListView;LWZ/l;Ljava/util/Map;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentDiffUtil;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "handleComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result;", "result", "handleComposerActionResult", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Success;", "handleSuccessResult", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Success;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Error;", "handleErrorResult", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result$Error;)V", "", "widgetId", "couponId", "updateTearAnimation", "(JJ)V", "performResultWithDelay", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "startPageLoading", "(Ll10/b;)V", "stopPageLoading", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;Ll20/d;Ljava/lang/Object;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/view/StaticCouponListView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter;", "adapter$delegate", "LSc/j;", "getAdapter", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter;", "adapter", "controller", "Ll10/b;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "La00/f;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListNotificationManager;", "notificationManager", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListNotificationManager;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel;", "widgetViewModel", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListViewHolder extends k<StaticCouponListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j adapter;

    @NotNull
    private final C4911f container;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final StaticCouponListNotificationManager notificationManager;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final StaticCouponListView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListViewHolder$Companion;", "", "<init>", "()V", "TEAR_ANIMATION_DURATION", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListViewHolder(@NotNull StaticCouponListView view, @NotNull l tokenizedAnalytics, @NotNull Map<Integer, ? extends StaticCouponListContentAdapterDelegate> delegates, @NotNull StaticCouponListContentDiffUtil contentDiffUtil, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor handlersInhibitor) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(contentDiffUtil, "contentDiffUtil");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(refs, this).onComposerAction(new StaticCouponListViewHolder$actionHandler$1(this)).enableClickThrottling(handlersInhibitor).buildHandler();
        this.adapter = UtilsKt.unsafeLazy(new StaticCouponListViewHolder$adapter$2(refs, this, delegates, contentDiffUtil));
        this.controller = refs.getController();
        this.container = refs.getContainer();
        this.notificationManager = new StaticCouponListNotificationManager();
        view.setUpRecycler(getAdapter(), refs.getComposerViewPoolProvider().getViewPool());
    }

    private final StaticCouponListContentAdapter getAdapter() {
        return (StaticCouponListContentAdapter) this.adapter.getValue();
    }

    private final StaticCouponListWidgetViewModel getWidgetViewModel() {
        return (StaticCouponListWidgetViewModel) getWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleComposerAction(AtomAction.ComposerAction action) {
        startPageLoading(this.controller);
        StaticCouponListWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            widgetViewModel.handleComposerAction(action, getTrackingData());
        }
    }

    private final void handleComposerActionResult(StaticCouponListWidgetViewModel.Result result) {
        if (result instanceof StaticCouponListWidgetViewModel.Result.Success) {
            handleSuccessResult((StaticCouponListWidgetViewModel.Result.Success) result);
        } else {
            if (!(result instanceof StaticCouponListWidgetViewModel.Result.Error)) {
                throw new o();
            }
            handleErrorResult((StaticCouponListWidgetViewModel.Result.Error) result);
        }
    }

    private final void handleErrorResult(StaticCouponListWidgetViewModel.Result.Error result) {
        stopPageLoading(this.controller);
        this.notificationManager.showDefaultError(this.container, result.getMessage(), result.getIsNetworkRelatedError());
    }

    private final void handleSuccessResult(StaticCouponListWidgetViewModel.Result.Success result) {
        stopPageLoading(this.controller);
        StaticCouponListVO boundData = getBoundData();
        if (boundData != null) {
            updateTearAnimation(boundData.getId(), result.getCouponId());
        }
        performResultWithDelay(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$handleComposerActionResult(StaticCouponListViewHolder staticCouponListViewHolder, StaticCouponListWidgetViewModel.Result result, d dVar) {
        staticCouponListViewHolder.handleComposerActionResult(result);
        return Unit.f71690a;
    }

    private final void performResultWithDelay(StaticCouponListWidgetViewModel.Result.Success result) {
        C10727i.c(K.a(this.container.e()), null, null, new StaticCouponListViewHolder$performResultWithDelay$1(this, result, null), 3);
    }

    private final void startPageLoading(InterfaceC7851b interfaceC7851b) {
        C2439a.b(0L, null, 3, interfaceC7851b);
    }

    private final void stopPageLoading(InterfaceC7851b interfaceC7851b) {
        interfaceC7851b.hideLoader();
    }

    private final void updateTearAnimation(long widgetId, long couponId) {
        this.controller.update(new StaticCouponListTearAnimationUpdate(widgetId, couponId, true));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        B0<StaticCouponListWidgetViewModel.Result> resultFlow;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        StaticCouponListWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel == null || (resultFlow = widgetViewModel.getResultFlow()) == null) {
            return;
        }
        C2399j.C(new C2408n0(C5427n.a(resultFlow, lifecycle.getLifecycle(), AbstractC5434v.b.STARTED), new StaticCouponListViewHolder$onAttachViewModel$1(this)), K.a(this));
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull StaticCouponListVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StaticCouponListVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.view.bind(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StaticCouponListVO item, @NotNull l20.d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!(payload instanceof List)) {
            bind(item, info);
            return;
        }
        for (Object obj : (Iterable) payload) {
            if (obj == StaticCouponListPayload.IMAGE) {
                this.view.bindBackground(item.getBackgroundImage());
            } else if (obj == StaticCouponListPayload.CONTENT) {
                this.view.bindContent(item.getContent());
            }
        }
    }
}
