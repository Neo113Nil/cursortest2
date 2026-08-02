package ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation;

import El.C2971a;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import java.util.Map;
import jk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.calendar.view.CalendarView;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.TravelPriceCalendarV3VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.analytics.TravelPriceCalendarV3AnalyticsViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.dynamic.TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.dynamic.TravelPriceCalendarV3DynamicUpdate;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.dynamic.TravelPriceCalendarV3DynamicUpdateVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B?\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f\u0012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J3\u0010*\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010&\u001a\u00060$j\u0002`%2\u000e\u0010)\u001a\n\u0018\u00010'j\u0004\u0018\u0001`(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001d\u00101\u001a\u00020\u00162\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050/H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00162\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00109R\u0018\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010:R\u0016\u0010<\u001a\u0004\u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00160>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010E\u001a\u0004\u0018\u00010B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3WidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicUpdateVO;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModel", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;", "analyticsViewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;LWZ/l;LVg/d;)V", "", "observeLiveData", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO;Ll20/d;)V", "onAttach", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/TravelPriceCalendarV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/analytics/TravelPriceCalendarV3AnalyticsViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/calendar/view/CalendarView;", "calendarView", "Lru/ozon/app/android/travel/calendar/view/CalendarView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;", "getDynamicBehaviorWidgetViewModel", "()Lru/ozon/app/android/travel/feature/general/main/widgets/travelPriceCalendar/v3/presentation/dynamic/TravelPriceCalendarV3DynamicBehaviorWidgetViewModel;", "dynamicBehaviorWidgetViewModel", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceCalendarV3WidgetViewHolder extends k<TravelPriceCalendarV3VO> implements AsyncWidgetCallbacks<TravelPriceCalendarV3DynamicUpdateVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TravelPriceCalendarV3AnalyticsViewModel analyticsViewModel;
    private final CalendarView calendarView;

    @NotNull
    private final CalendarViewModel calendarViewModel;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "date", "Lorg/joda/time/LocalDate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.main.widgets.travelPriceCalendar.v3.presentation.TravelPriceCalendarV3WidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<LocalDate, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
            invoke2(localDate);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LocalDate date) {
            Intrinsics.checkNotNullParameter(date, "date");
            TravelPriceCalendarV3WidgetViewHolder.this.calendarViewModel.onDateClicked(TravelPriceCalendarV3WidgetViewHolder.this.getContext(), date);
            TravelPriceCalendarV3VO boundData = TravelPriceCalendarV3WidgetViewHolder.this.getBoundData();
            AtomActionDTO oneClickDateAction = boundData != null ? boundData.getOneClickDateAction() : null;
            if (oneClickDateAction != null) {
                TravelPriceCalendarV3WidgetViewHolder.this.actionHandler.invoke(TravelPriceCalendarV3WidgetViewHolder.this.calendarViewModel.prepareActionForDate(oneClickDateAction, date));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelPriceCalendarV3WidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull CalendarViewModel calendarViewModel, @NotNull TravelPriceCalendarV3AnalyticsViewModel analyticsViewModel, @NotNull l tokenizedAnalytics, @NotNull d customActionHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(calendarViewModel, "calendarViewModel");
        Intrinsics.checkNotNullParameter(analyticsViewModel, "analyticsViewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.references = references;
        this.calendarViewModel = calendarViewModel;
        this.analyticsViewModel = analyticsViewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        CalendarView calendarView = containerView instanceof CalendarView ? (CalendarView) containerView : null;
        this.calendarView = calendarView;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelPriceCalendarV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        if (calendarView != null) {
            calendarView.setOnDateClickListener(new AnonymousClass1());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TravelPriceCalendarV3DynamicBehaviorWidgetViewModel getDynamicBehaviorWidgetViewModel() {
        return (TravelPriceCalendarV3DynamicBehaviorWidgetViewModel) getWidgetViewModel();
    }

    private final void observeLiveData() {
        this.calendarViewModel.calendarLiveData().observe(this, new TravelPriceCalendarV3WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelPriceCalendarV3WidgetViewHolder$observeLiveData$1(this)));
        this.calendarViewModel.calendarTokenizedEventLiveData().observe(this, new TravelPriceCalendarV3WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelPriceCalendarV3WidgetViewHolder$observeLiveData$2(this)));
        this.calendarViewModel.selectionLiveData().observe(this, new TravelPriceCalendarV3WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelPriceCalendarV3WidgetViewHolder$observeLiveData$3(this)));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<TravelPriceCalendarV3DynamicUpdateVO> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.references.getController().update(new TravelPriceCalendarV3DynamicUpdate(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ViewGroup b11 = C2971a.b(this.references);
        if (b11 != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, b11, null, null, null, null, null, this, 62, null).show();
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
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
        TravelPriceCalendarV3DynamicBehaviorWidgetViewModel dynamicBehaviorWidgetViewModel = getDynamicBehaviorWidgetViewModel();
        if (dynamicBehaviorWidgetViewModel != null) {
            AbstractAsyncWidgetViewModel.observeEvents$default(dynamicBehaviorWidgetViewModel, lifecycle, this, null, 4, null);
        }
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        int height = getViewHolderPositionInfo().a().e().height();
        int height2 = getViewHolderPositionInfo().a().d().height() / 2;
        int i11 = (height + height2) - (info.b().top - info.a().e().top);
        CalendarView calendarView = this.calendarView;
        if (calendarView != null) {
            calendarView.setBottomOffset(height2);
        }
        if (this.itemView.getHeight() == i11 || height <= 0) {
            return;
        }
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i11;
        itemView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelPriceCalendarV3VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.calendarViewModel.setUpViewModel(item.getCalendar(), item.getBehavior() instanceof TravelPriceCalendarV3VO.Behavior.Dynamic);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelPriceCalendarV3VO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelPriceCalendarV3WidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
