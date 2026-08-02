package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation;

import Sc.o;
import T00.m;
import Vg.d;
import Vg.f;
import android.view.View;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l10.t;
import l20.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.travel.actionhandler.forceRedirect.TravelForceRedirectActionHandler;
import ru.ozon.app.android.travel.actionhandler.travelResultActionV2.TravelResultActionV2Handler;
import ru.ozon.app.android.travel.actionhandler.utils.NotificationBarUtilsKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2VO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.update.TimeoutAndActionV2Update;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.viewmodel.TimeoutAndActionV2AsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.utils.AsyncWidgetPerformanceTrackerKt;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u001d\u0010\u001c\u001a\u00020\u00112\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u0011028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020807068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u0004\u0018\u00010<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2WidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel;", "widgetViewModel", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;)V", "timerState", "", "startTimer", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;)V", "item", "fetchWidget", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;)V", "onWidgetCreated", "()V", "bind", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "onWidgetDestroyed", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/viewmodel/TimeoutAndActionV2AsyncWidgetViewModel;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Ll10/b;", "controller", "Ll10/b;", "Ll10/t;", "Ll10/t;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "timerHelper", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "Ljava/lang/Class;", "LVg/f;", "getSupportedActionHandlers", "()[Ljava/lang/Class;", "supportedActionHandlers", "", "getWidgetName", "()Ljava/lang/String;", "widgetName", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutAndActionV2WidgetHolder extends AbstractC6065b<TimeoutAndActionV2VO> implements AsyncWidgetCallbacks<TimeoutAndActionV2VO.State> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final t container;

    @NotNull
    private final InterfaceC7851b controller;
    private final View metricView;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;
    private TimerHelper timerHelper;

    @NotNull
    private final TimeoutAndActionV2AsyncWidgetViewModel widgetViewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeoutAndActionV2VO.TimerMode.values().length];
            try {
                iArr[TimeoutAndActionV2VO.TimerMode.START_IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeoutAndActionV2VO.TimerMode.POLLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeoutAndActionV2VO.TimerMode.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TimeoutAndActionV2WidgetHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull TimeoutAndActionV2AsyncWidgetViewModel widgetViewModel, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        this.widgetViewModel = widgetViewModel;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.controller = container.M();
        this.container = container.K();
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TimeoutAndActionV2WidgetHolder$actionHandler$1(customActionHandlersStoreFactory, this)).buildHandler();
    }

    private final void fetchWidget(TimeoutAndActionV2VO item) {
        this.widgetViewModel.fetchWidget(item.getState().getPollingDelayMs(), item.getAsyncData(), item.getState().getAsyncParameters());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<? extends f>[] getSupportedActionHandlers() {
        return new Class[]{TravelResultActionV2Handler.class, TravelForceRedirectActionHandler.class};
    }

    private final String getWidgetName() {
        b i11;
        l20.d b11;
        m c11;
        l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    private final void startTimer(TimeoutAndActionV2VO.State timerState) {
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        TimerHelper timerHelper2 = this.timerHelper;
        if (timerHelper2 != null) {
            TimerHelper.startTimer$default(timerHelper2, Long.valueOf(timerState.getDeadline()), new TimeoutAndActionV2WidgetHolder$startTimer$1$1(timerState, this), (Function1) null, 4, (Object) null);
        }
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<TimeoutAndActionV2VO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        AsyncWidgetPerformanceTrackerKt.trackAsyncWidgetEndTime(this.performanceTrackerDelegate, getWidgetName(), fetchedModel.getMetrics());
        TimeoutAndActionV2VO boundData = getBoundData();
        if (boundData != null) {
            this.controller.update(TimeoutAndActionV2Update.m1258boximpl(TimeoutAndActionV2Update.m1259constructorimpl(TimeoutAndActionV2VO.copy$default(boundData, 0L, fetchedModel.getFetchedState(), null, 5, null))));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        NotificationBarUtilsKt.showDefaultError(this.container);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.timerHelper = new TimerHelper(getLifecycle());
        this.widgetViewModel.collectEvents(getLifecycle(), this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.widgetViewModel.onCleared();
        TimerHelper timerHelper = this.timerHelper;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timerHelper = null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TimeoutAndActionV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TimeoutAndActionV2VO.State state = item.getState();
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.getTimerMode().ordinal()];
        if (i11 == 1) {
            startTimer(state);
        } else if (i11 == 2) {
            fetchWidget(item);
        } else if (i11 != 3) {
            throw new o();
        }
    }
}
