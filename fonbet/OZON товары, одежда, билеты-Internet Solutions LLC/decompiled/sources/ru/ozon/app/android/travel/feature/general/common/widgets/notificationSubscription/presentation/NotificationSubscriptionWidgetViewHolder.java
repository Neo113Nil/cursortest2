package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation;

import Lm0.a;
import Sc.o;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import WZ.x;
import androidx.lifecycle.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.NotificationSubscriptionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view.NotificationSubscriptionView;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010\u0013J\u001f\u0010$\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J)\u0010*\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00112\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00112\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0011098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u0004\u0018\u00010=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionView;", "containerView", "LWZ/l;", "tokenizedAnalytics", "Ll10/b;", "controller", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;", "viewModel", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionView;LWZ/l;Ll10/b;Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;)V", "", "removeWidget", "()V", "observeLiveData", "", "isChecked", "updateCheckboxState", "(Z)V", "state", "sendViewEvent", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO$Loaded;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onAttach", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onAsyncWidgetSkipped", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionView;", "LWZ/l;", "Ll10/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionWidgetViewModel;", "getWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/presentation/NotificationSubscriptionWidgetViewModel;", "widgetViewModel", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationSubscriptionWidgetViewHolder extends k<NotificationSubscriptionVO> implements AsyncWidgetCallbacks<NotificationSubscriptionVO.Loaded> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final NotificationSubscriptionView containerView;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final NotificationSubscriptionViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSubscriptionWidgetViewHolder(@NotNull i container, @NotNull NotificationSubscriptionView containerView, @NotNull l tokenizedAnalytics, @NotNull InterfaceC7851b controller, @NotNull NotificationSubscriptionViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.controller = controller;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
    }

    private final NotificationSubscriptionWidgetViewModel getWidgetViewModel() {
        return (NotificationSubscriptionWidgetViewModel) getWidgetViewModel();
    }

    private final void observeLiveData() {
        this.viewModel.getRevertLiveData().observe(this, new NotificationSubscriptionWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new NotificationSubscriptionWidgetViewHolder$observeLiveData$1(this)));
        this.viewModel.getNewStateLiveData().observe(this, new NotificationSubscriptionWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new NotificationSubscriptionWidgetViewHolder$observeLiveData$2(this)));
    }

    private final void removeWidget() {
        NotificationSubscriptionVO boundData = getBoundData();
        if (boundData != null) {
            this.controller.m(boundData.getId());
        }
    }

    private final void sendViewEvent(NotificationSubscriptionVO.Loaded state) {
        Map<String, TokenizedTrackingInfo> analytics;
        if (state == null || (analytics = state.getAnalytics()) == null) {
            return;
        }
        NotificationSubscriptionVO boundData = getBoundData();
        Long valueOf = boundData != null ? Long.valueOf(boundData.getId()) : null;
        Intrinsics.checkNotNullParameter(analytics, "<this>");
        t b11 = x.b(analytics, valueOf, null);
        if (b11 != null) {
            m.c(this.tokenizedAnalytics, b11, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCheckboxState(boolean isChecked) {
        CheckBoxDTO checkbox;
        CheckBoxDTO.CheckboxStatus checkboxStatus = isChecked ? CheckBoxDTO.CheckboxStatus.SELECTED : CheckBoxDTO.CheckboxStatus.EMPTY;
        NotificationSubscriptionVO boundData = getBoundData();
        NotificationSubscriptionVO.State state = boundData != null ? boundData.getState() : null;
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

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        NotificationSubscriptionWidgetViewModel widgetViewModel = getWidgetViewModel();
        if (widgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(widgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull NotificationSubscriptionVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        NotificationSubscriptionVO.State state = item.getState();
        if (state instanceof NotificationSubscriptionVO.Fetch) {
            this.containerView.showLoading();
            this.containerView.hideContent();
            NotificationSubscriptionWidgetViewModel widgetViewModel = getWidgetViewModel();
            if (widgetViewModel != null) {
                widgetViewModel.fetchWidgetWithParams(((NotificationSubscriptionVO.Fetch) item.getState()).getAsyncData(), ((NotificationSubscriptionVO.Fetch) item.getState()).getAsyncParams());
                return;
            }
            return;
        }
        if (!(state instanceof NotificationSubscriptionVO.Loaded)) {
            throw new o();
        }
        this.containerView.bind((NotificationSubscriptionVO.Loaded) item.getState(), this.actionHandler, new NotificationSubscriptionWidgetViewHolder$bind$1(this, item));
        this.containerView.showContent();
        this.containerView.hideLoading();
        if (isInVisibleBounds()) {
            sendViewEvent((NotificationSubscriptionVO.Loaded) item.getState());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull NotificationSubscriptionVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((NotificationSubscriptionWidgetViewHolder) item, trackingData, viewedPond);
        NotificationSubscriptionVO.State state = item.getState();
        sendViewEvent(state instanceof NotificationSubscriptionVO.Loaded ? (NotificationSubscriptionVO.Loaded) state : null);
    }
}
