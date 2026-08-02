package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.sticky;

import Lm0.a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionUpdateEvent;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionWidgetViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view.NotificationSubscriptionView;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0017J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010(\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00022\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00152\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010\u0017J\u000f\u00103\u001a\u00020\u0015H\u0016¢\u0006\u0004\b3\u0010\u0017R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u0015088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/sticky/NotificationSubscriptionStickyWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionWidgetViewModel;", "widgetViewModel", "Ll10/b;", "controller", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;", "viewModel", "<init>", "(Ll10/i;Ld20/e;LWZ/l;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionWidgetViewModel;Ll10/b;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;)V", "", "removeWidget", "()V", "observeLiveData", "", "isChecked", "updateCheckboxState", "(Z)V", "state", "sendViewEvent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;)V", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "onWidgetDestroyed", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionWidgetViewModel;", "Ll10/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionView;", "getContainerView", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionView;", "containerView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionStickyWidgetViewHolder extends AbstractC6064a<NotificationSubscriptionVO> implements AsyncWidgetCallbacks<NotificationSubscriptionVO.Loaded> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final NotificationSubscriptionViewModel viewModel;

    @NotNull
    private final NotificationSubscriptionWidgetViewModel widgetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionStickyWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull l tokenizedAnalytics, @NotNull NotificationSubscriptionWidgetViewModel widgetViewModel, @NotNull InterfaceC7851b controller, @NotNull NotificationSubscriptionViewModel viewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.widgetViewModel = widgetViewModel;
        this.controller = controller;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationSubscriptionView getContainerView() {
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view.NotificationSubscriptionView");
        return (NotificationSubscriptionView) view;
    }

    private final void observeLiveData() {
        this.viewModel.getRevertLiveData().observe(this, new NotificationSubscriptionStickyWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new NotificationSubscriptionStickyWidgetViewHolder$observeLiveData$1(this)));
        this.viewModel.getNewStateLiveData().observe(this, new NotificationSubscriptionStickyWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new NotificationSubscriptionStickyWidgetViewHolder$observeLiveData$2(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeWidget() {
        NotificationSubscriptionVO notificationSubscriptionVO = (NotificationSubscriptionVO) getBoundData();
        if (notificationSubscriptionVO != null) {
            this.controller.m(notificationSubscriptionVO.getId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sendViewEvent(NotificationSubscriptionVO.Loaded state) {
        Map<String, TokenizedTrackingInfo> analytics;
        if (state == null || (analytics = state.getAnalytics()) == null) {
            return;
        }
        NotificationSubscriptionVO notificationSubscriptionVO = (NotificationSubscriptionVO) getBoundData();
        t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(analytics, notificationSubscriptionVO != null ? Long.valueOf(notificationSubscriptionVO.getId()) : null, null, 2, null);
        if (mapToTokenizedEvent$default != null) {
            m.c(this.tokenizedAnalytics, mapToTokenizedEvent$default, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateCheckboxState(boolean isChecked) {
        CheckBoxDTO checkbox;
        CheckBoxDTO.CheckboxStatus checkboxStatus = isChecked ? CheckBoxDTO.CheckboxStatus.SELECTED : CheckBoxDTO.CheckboxStatus.EMPTY;
        NotificationSubscriptionVO notificationSubscriptionVO = (NotificationSubscriptionVO) getBoundData();
        NotificationSubscriptionVO.State state = notificationSubscriptionVO != null ? notificationSubscriptionVO.getState() : null;
        NotificationSubscriptionVO.Loaded loaded = state instanceof NotificationSubscriptionVO.Loaded ? (NotificationSubscriptionVO.Loaded) state : null;
        CheckBoxDTO copy$default = (loaded == null || (checkbox = loaded.getCheckbox()) == null) ? null : CheckBoxDTO.copy$default(checkbox, null, checkboxStatus, null, null, null, null, null, null, null, null, 1021, null);
        if (copy$default != null) {
            this.controller.d(new NotificationSubscriptionUpdateEvent(NotificationSubscriptionVO.Loaded.copy$default(loaded, copy$default, null, null, null, 14, null)));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<NotificationSubscriptionVO.Loaded> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        NotificationSubscriptionVO.Loaded fetchedState = fetchedModel.getFetchedState();
        if (fetchedState == null) {
            removeWidget();
        } else {
            this.controller.update(new NotificationSubscriptionUpdateEvent(fetchedState));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        removeWidget();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        removeWidget();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        AbstractAsyncWidgetViewModel.observeEvents$default(this.widgetViewModel, this, this, null, 4, null);
        observeLiveData();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.widgetViewModel.onCleared();
        super.onWidgetDestroyed();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull NotificationSubscriptionVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        NotificationSubscriptionVO.State state = item.getState();
        if (state instanceof NotificationSubscriptionVO.Fetch) {
            getContainerView().showLoading();
            getContainerView().hideContent();
            this.widgetViewModel.fetchWidgetWithParams(((NotificationSubscriptionVO.Fetch) item.getState()).getAsyncData(), ((NotificationSubscriptionVO.Fetch) item.getState()).getAsyncParams());
        } else {
            if (!(state instanceof NotificationSubscriptionVO.Loaded)) {
                throw new o();
            }
            getContainerView().bind((NotificationSubscriptionVO.Loaded) item.getState(), this.actionHandler, new NotificationSubscriptionStickyWidgetViewHolder$bind$1(this, item));
            getContainerView().showContent();
            getContainerView().hideLoading();
            sendViewEvent((NotificationSubscriptionVO.Loaded) item.getState());
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull NotificationSubscriptionVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((NotificationSubscriptionStickyWidgetViewHolder) item, trackingData, viewedPond);
        NotificationSubscriptionVO.State state = item.getState();
        sendViewEvent(state instanceof NotificationSubscriptionVO.Loaded ? (NotificationSubscriptionVO.Loaded) state : null);
    }
}
