package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation;

import T00.m;
import Vg.d;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l20.b;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.PriceCalendarFooterV3VO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v3.presentation.view.PriceCalendarFooterV3View;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.app.android.travel.utils.placeholder.PlaceholderParser;
import ru.ozon.app.android.travel.utils.utils.AsyncWidgetPerformanceTrackerKt;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001XBQ\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ'\u0010$\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00192\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001c\u00105\u001a\n 4*\u0004\u0018\u000103038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR`\u0010J\u001aN\u0012\u0004\u0012\u00020D\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Fj\u0002`G0Ej\f\u0012\b\u0012\u00060Fj\u0002`G`H0Cj&\u0012\u0004\u0012\u00020D\u0012\u001c\u0012\u001a\u0012\b\u0012\u00060Fj\u0002`G0Ej\f\u0012\b\u0012\u00060Fj\u0002`G`H`I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00190L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010S\u001a\u0004\u0018\u00010P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3WidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO$Content;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3WidgetViewModel;", "widgetViewModel", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModel", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "placeholderParser", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "nestedWidgetsManager", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LVg/d;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3WidgetViewModel;Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Ld20/e;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;)V", "onWidgetDestroyed", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3WidgetViewModel;", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "Lru/ozon/app/android/travel/utils/placeholder/PlaceholderParser;", "Lru/ozon/app/android/travel/utils/placeholder/NestedWidgetsManager;", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "LWZ/l;", "tokenizedAnalytics", "LWZ/l;", "Ll10/b;", "composerController", "Ll10/b;", "La00/f;", "composerContainer", "La00/f;", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "currentPlaceholder", "Lru/ozon/app/android/travel/utils/placeholder/Placeholder;", "Ljava/util/HashMap;", "", "Lru/ozon/composer/ui/widget/k;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lkotlin/collections/HashMap;", "currentViewHolders", "Ljava/util/HashMap;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/view/PriceCalendarFooterV3View;", "getPriceCalendarView", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/view/PriceCalendarFooterV3View;", "priceCalendarView", "", "getWidgetName", "()Ljava/lang/String;", "widgetName", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarFooterV3WidgetViewHolder extends AbstractC6064a<PriceCalendarFooterV3VO> implements AsyncWidgetCallbacks<PriceCalendarFooterV3VO.Content> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CalendarViewModel calendarViewModel;

    @NotNull
    private final C4911f composerContainer;

    @NotNull
    private final InterfaceC7851b composerController;
    private final Context context;

    @NotNull
    private Placeholder currentPlaceholder;

    @NotNull
    private final HashMap<Integer, k<c>> currentViewHolders;

    @NotNull
    private final NestedWidgetsManager nestedWidgetsManager;

    @NotNull
    private final PerformanceTrackerDelegate performanceTrackerDelegate;

    @NotNull
    private final PlaceholderParser placeholderParser;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final PriceCalendarFooterV3WidgetViewModel widgetViewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v3/presentation/PriceCalendarFooterV3WidgetViewHolder$Companion;", "", "<init>", "()V", "ACTION_ID_RESET_DATES", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceCalendarFooterV3WidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull PriceCalendarFooterV3WidgetViewModel widgetViewModel, @NotNull CalendarViewModel calendarViewModel, @NotNull PlaceholderParser placeholderParser, @NotNull NestedWidgetsManager nestedWidgetsManager, @NotNull PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        Intrinsics.checkNotNullParameter(calendarViewModel, "calendarViewModel");
        Intrinsics.checkNotNullParameter(placeholderParser, "placeholderParser");
        Intrinsics.checkNotNullParameter(nestedWidgetsManager, "nestedWidgetsManager");
        Intrinsics.checkNotNullParameter(performanceTrackerDelegate, "performanceTrackerDelegate");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.widgetViewModel = widgetViewModel;
        this.calendarViewModel = calendarViewModel;
        this.placeholderParser = placeholderParser;
        this.nestedWidgetsManager = nestedWidgetsManager;
        this.performanceTrackerDelegate = performanceTrackerDelegate;
        this.context = container.L();
        this.tokenizedAnalytics = container.X();
        this.composerController = container.M();
        this.composerContainer = container.Q();
        this.currentPlaceholder = Placeholder.INSTANCE.getEMPTY();
        this.currentViewHolders = new HashMap<>();
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new PriceCalendarFooterV3WidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new PriceCalendarFooterV3WidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PriceCalendarFooterV3View getPriceCalendarView() {
        View view = getView();
        if (view instanceof PriceCalendarFooterV3View) {
            return (PriceCalendarFooterV3View) view;
        }
        return null;
    }

    private final String getWidgetName() {
        b i11;
        l20.d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<PriceCalendarFooterV3VO.Content> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        AsyncWidgetPerformanceTrackerKt.trackAsyncWidgetEndTime(this.performanceTrackerDelegate, getWidgetName(), fetchedModel.getMetrics());
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.composerController.update(new PriceCalendarFooterV3Update(fetchedModel.getFetchedState()));
        PriceCalendarFooterV3View priceCalendarView = getPriceCalendarView();
        if (priceCalendarView != null) {
            priceCalendarView.hideLoader();
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        PriceCalendarFooterV3View priceCalendarView = getPriceCalendarView();
        if (priceCalendarView != null) {
            priceCalendarView.hideLoader();
        }
        ViewGroup rootView = ContextExtKt.getRootView(this.composerContainer.c());
        if (rootView != null) {
            FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, this, 62, null).show();
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        NestedWidgetsManager nestedWidgetsManager = this.nestedWidgetsManager;
        PriceCalendarFooterV3View priceCalendarView = getPriceCalendarView();
        nestedWidgetsManager.setContainer(priceCalendarView != null ? priceCalendarView.getContentView() : null);
        AbstractAsyncWidgetViewModel.observeEvents$default(this.widgetViewModel, this, this, null, 4, null);
        this.calendarViewModel.selectionLiveData().observe(this, new PriceCalendarFooterV3WidgetViewHolder$sam$androidx_lifecycle_Observer$0(new PriceCalendarFooterV3WidgetViewHolder$onWidgetCreated$1(this)));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.nestedWidgetsManager.detachNestedViewHolders(this.currentViewHolders);
        this.widgetViewModel.onCleared();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PriceCalendarFooterV3VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Placeholder parsePlaceholders = this.placeholderParser.parsePlaceholders(getViewItem(), this.currentPlaceholder);
        this.currentPlaceholder = parsePlaceholders;
        this.nestedWidgetsManager.addNestedWidgets(parsePlaceholders, this.currentViewHolders);
        PriceCalendarFooterV3View priceCalendarView = getPriceCalendarView();
        if (priceCalendarView != null) {
            priceCalendarView.bind(item, !this.currentPlaceholder.getViewObjects().isEmpty(), this.actionHandler);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull PriceCalendarFooterV3VO item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        t tokenizedEvent$default;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        Map<String, TokenizedTrackingInfo> trackingInfo = item.getContent().getTrackingInfo();
        if (trackingInfo == null || (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(item.getId()), null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent$default, null, 2, null);
    }
}
