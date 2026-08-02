package ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation;

import FV.a;
import Sc.o;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import a00.C4911f;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.atoms.v3.holders.texts.TextAtomWithIconHolderKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetTravelSearchSortAndFilterBinding;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelSearchSortAndFilter.presentation.TravelSearchSortAndFilterViewModel;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.view.travelButtonWithIcon.TravelButtonWithIconVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;
import ru.ozon.app.android.travel.molecules.view.travelSorting.TravelSortingExtKt;
import ru.ozon.app.android.travel.molecules.view.travelSorting.TravelSortingVO;
import ru.ozon.app.android.uikit.view.atoms.select.SelectView;
import ru.ozon.app.android.uikit.view.atoms.texts.TextAtomWithIconView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import uZ.C9992d;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001bJ#\u0010%\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#H\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0017H\u0016¢\u0006\u0004\b'\u0010\u001bJ3\u0010.\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00022\n\u0010*\u001a\u00060(j\u0002`)2\u000e\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R#\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0017068\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel;", "viewModel", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel;LWZ/l;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "clickEvent", "", "processFiltersAction", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "observeLiveData", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result;", "result", "handleResult", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel$Result;)V", "showFlashBarError", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterVO;Ll20/d;)V", "onAttach", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelSearchSortAndFilter/presentation/TravelSearchSortAndFilterViewModel;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetTravelSearchSortAndFilterBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/booking/databinding/WidgetTravelSearchSortAndFilterBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelSearchSortAndFilterWidgetViewHolder extends k<TravelSearchSortAndFilterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetTravelSearchSortAndFilterBinding binding;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final TravelSearchSortAndFilterViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelSearchSortAndFilterWidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences references, @NotNull TravelSearchSortAndFilterViewModel viewModel, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.viewModel = viewModel;
        this.tokenizedAnalytics = tokenizedAnalytics;
        WidgetTravelSearchSortAndFilterBinding bind = WidgetTravelSearchSortAndFilterBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new TravelSearchSortAndFilterWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new TravelSearchSortAndFilterWidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$3$lambda$2(TravelSearchSortAndFilterVO travelSearchSortAndFilterVO, TravelSearchSortAndFilterWidgetViewHolder travelSearchSortAndFilterWidgetViewHolder, View view) {
        AtomAction action;
        TravelButtonWithIconVO priceCalendarText = travelSearchSortAndFilterVO.getPriceCalendarText();
        if (priceCalendarText == null || (action = priceCalendarText.getAction()) == null) {
            return;
        }
        travelSearchSortAndFilterWidgetViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleResult(TravelSearchSortAndFilterViewModel.Result result) {
        if (result instanceof TravelSearchSortAndFilterViewModel.Result.Success) {
            this.actionHandler.invoke(((TravelSearchSortAndFilterViewModel.Result.Success) result).getAction());
        } else {
            if (!Intrinsics.d(result, TravelSearchSortAndFilterViewModel.Result.Error.INSTANCE)) {
                throw new o();
            }
            showFlashBarError();
        }
    }

    private final void observeLiveData() {
        this.viewModel.atomActionLiveData().observe(this, new TravelSearchSortAndFilterWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new TravelSearchSortAndFilterWidgetViewHolder$observeLiveData$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processFiltersAction(AtomAction atomAction, t clickEvent) {
        String link;
        AtomAction.OpenComposerNestedPage openComposerNestedPage = atomAction instanceof AtomAction.OpenComposerNestedPage ? (AtomAction.OpenComposerNestedPage) atomAction : null;
        if (openComposerNestedPage == null || (link = openComposerNestedPage.getLink()) == null) {
            return;
        }
        ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(this.references.getNavigator(), link, link, 9001, new C9992d.b.C2202b(FlowTag.FILTER_VALUES), null, 16, null);
        if (clickEvent != null) {
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(this.tokenizedAnalytics, clickEvent, null, 2, null);
        }
    }

    private final void showFlashBarError() {
        C4911f container = this.references.getContainer();
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        observeLiveData();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TravelSearchSortAndFilterVO item, @NotNull l20.d info) {
        TextAtomWithIcon buttonText;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        SelectView sortingSelectView = this.binding.sortingSelectView;
        Intrinsics.checkNotNullExpressionValue(sortingSelectView, "sortingSelectView");
        sortingSelectView.setVisibility(item.getIsSortingVisible() ? 0 : 8);
        TravelSortingVO sorting = item.getSorting();
        if (sorting != null) {
            SelectView sortingSelectView2 = this.binding.sortingSelectView;
            Intrinsics.checkNotNullExpressionValue(sortingSelectView2, "sortingSelectView");
            TravelSortingExtKt.bind(sortingSelectView2, sorting, this.actionHandler);
        }
        TextAtomWithIconView textAtomWithIconView = this.binding.buttonTAWIV;
        Intrinsics.f(textAtomWithIconView);
        TravelButtonWithIconVO priceCalendarText = item.getPriceCalendarText();
        TextAtomWithIconHolderKt.bindOrGone$default(textAtomWithIconView, (priceCalendarText == null || (buttonText = priceCalendarText.getButtonText()) == null) ? null : TextAtomWithIcon.copy$default(buttonText, null, null, null, null, null, null, TextAtomWithIcon.IconAlignment.CENTER, null, null, null, 959, null), null, 2, null);
        textAtomWithIconView.setTextSize(1, 14.0f);
        textAtomWithIconView.setEllipsize(TextUtils.TruncateAt.END);
        textAtomWithIconView.setOnClickListener(new a(2, item, this));
        TravelFiltersButtonView travelFiltersButtonViewTfbv = this.binding.travelFiltersButtonViewTfbv;
        Intrinsics.checkNotNullExpressionValue(travelFiltersButtonViewTfbv, "travelFiltersButtonViewTfbv");
        travelFiltersButtonViewTfbv.setVisibility(item.getIsTravelFiltersButtonVisible() ? 0 : 8);
        TravelFiltersButtonVO travelFiltersButton = item.getTravelFiltersButton();
        if (travelFiltersButton != null) {
            this.binding.travelFiltersButtonViewTfbv.bind(travelFiltersButton, new TravelSearchSortAndFilterWidgetViewHolder$bind$3$1(this));
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull TravelSearchSortAndFilterVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((TravelSearchSortAndFilterWidgetViewHolder) item, trackingData, viewedPond);
        t viewEvent = item.getViewEvent();
        if (viewEvent != null) {
            ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, viewEvent, null, 2, null);
        }
    }
}
