package ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.presentation;

import android.view.View;
import android.widget.FrameLayout;
import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.actionhandler.travelResultAction.ModalParentRefreshSharedViewModel;
import ru.ozon.app.android.travel.feature.general.main.databinding.WidgetCalendarBinding;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.analytics.CalendarAnalytics;
import ru.ozon.app.android.travel.feature.general.main.widgets.calendar.v1.view.CalendarView;
import ru.ozon.app.android.travel.utils.extensions.ViewsExtensionsKt;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel;", "viewModel", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "modalParentRefreshViewModel", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/analytics/CalendarAnalytics;", "calendarAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel;Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/analytics/CalendarAnalytics;)V", "", "observeAction", "()V", "onAttach", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/presentation/CalendarViewModel;", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "Lru/ozon/app/android/travel/feature/general/main/widgets/calendar/v1/analytics/CalendarAnalytics;", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetCalendarBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetCalendarBinding;", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "progressBar", "Lru/ozon/app/android/uikit/utils/DelayedVisibilityHandler;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalendarWidgetViewHolder extends k<CalendarVO> {

    @NotNull
    private final WidgetCalendarBinding binding;

    @NotNull
    private final CalendarAnalytics calendarAnalytics;

    @NotNull
    private final View containerView;

    @NotNull
    private final ModalParentRefreshSharedViewModel modalParentRefreshViewModel;

    @NotNull
    private DelayedVisibilityHandler progressBar;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final CalendarViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull CalendarViewModel viewModel, @NotNull ModalParentRefreshSharedViewModel modalParentRefreshViewModel, @NotNull CalendarAnalytics calendarAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(modalParentRefreshViewModel, "modalParentRefreshViewModel");
        Intrinsics.checkNotNullParameter(calendarAnalytics, "calendarAnalytics");
        this.containerView = containerView;
        this.references = references;
        this.viewModel = viewModel;
        this.modalParentRefreshViewModel = modalParentRefreshViewModel;
        this.calendarAnalytics = calendarAnalytics;
        WidgetCalendarBinding bind = WidgetCalendarBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        FrameLayout travelCalendarProgressBar = bind.travelCalendarProgressBar;
        Intrinsics.checkNotNullExpressionValue(travelCalendarProgressBar, "travelCalendarProgressBar");
        this.progressBar = new DelayedVisibilityHandler(travelCalendarProgressBar, 0L, 2, null);
        CalendarView calendarView = bind.calendarView;
        calendarView.setOnDateClickListener(new CalendarWidgetViewHolder$1$1(viewModel));
        calendarView.setOnReadyClickListener(new CalendarWidgetViewHolder$1$2(viewModel));
        calendarView.setOnDateControlClickListener(new CalendarWidgetViewHolder$1$3(viewModel));
        calendarView.setOnTripTypeSwitchListener(new CalendarWidgetViewHolder$1$4(viewModel));
        calendarView.setOnDaysRoundControlClickListener(new CalendarWidgetViewHolder$1$5(viewModel));
    }

    private final void observeAction() {
        this.viewModel.calendarLiveData().observe(this, new CalendarWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CalendarWidgetViewHolder$observeAction$1(this)));
        this.viewModel.actionLiveData().observe(this, new CalendarWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CalendarWidgetViewHolder$observeAction$2(this)));
        this.viewModel.progressLiveData().observe(this, new CalendarWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CalendarWidgetViewHolder$observeAction$3(this)));
        this.viewModel.customAnalyticsLiveData().observe(this, new CalendarWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new CalendarWidgetViewHolder$observeAction$4(this)));
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeAction();
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        ViewsExtensionsKt.updateHeightRegardingOverlapContainers$default(this.containerView, info, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CalendarVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.setUpViewModel(item);
    }
}
