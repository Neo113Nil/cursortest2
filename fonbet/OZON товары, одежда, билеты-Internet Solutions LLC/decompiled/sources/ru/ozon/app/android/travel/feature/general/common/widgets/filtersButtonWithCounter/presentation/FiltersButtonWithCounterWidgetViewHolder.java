package ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation;

import Sc.o;
import T00.m;
import WZ.l;
import WZ.t;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.navigation.FlowTag;
import ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation.FiltersButtonWithCounterVO;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonView;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import uZ.C9992d;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\u00172\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010:\u001a\u0004\u0018\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006?"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterAsyncActionWidgetViewModel;", "asyncActionWidgetViewModel", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterAsyncActionWidgetViewModel;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "onButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "onDetachViewModel", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "onAsyncWidgetAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "", "provideTraceWidgetName", "()Ljava/lang/String;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterAsyncActionWidgetViewModel;", "", "defaultBackgroundColor", "I", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonView;", "filtersButtonView", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonView;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FiltersButtonWithCounterWidgetViewHolder extends k<FiltersButtonWithCounterVO> implements AsyncActionWidgetCallbacks<FiltersButtonWithCounterVO.FiltersButtonWithCounterState>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FiltersButtonWithCounterAsyncActionWidgetViewModel asyncActionWidgetViewModel;
    private final int defaultBackgroundColor;
    private final TravelFiltersButtonView filtersButtonView;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersButtonWithCounterWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull l tokenizedAnalytics, @NotNull FiltersButtonWithCounterAsyncActionWidgetViewModel asyncActionWidgetViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(asyncActionWidgetViewModel, "asyncActionWidgetViewModel");
        this.references = references;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.asyncActionWidgetViewModel = asyncActionWidgetViewModel;
        this.defaultBackgroundColor = R$color.transparent;
        FrameLayout frameLayout = containerView instanceof FrameLayout ? (FrameLayout) containerView : null;
        KeyEvent.Callback childAt = frameLayout != null ? frameLayout.getChildAt(0) : null;
        this.filtersButtonView = childAt instanceof TravelFiltersButtonView ? (TravelFiltersButtonView) childAt : null;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onButtonClicked(AtomAction action, t tokenizedEvent) {
        if (!(action instanceof AtomAction.OpenComposerNestedPage)) {
            this.actionHandler.invoke(action);
            return;
        }
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        AtomAction.OpenComposerNestedPage openComposerNestedPage = (AtomAction.OpenComposerNestedPage) action;
        ComposerNavigator.DefaultImpls.openDeeplinkInBottomSheet$default(this.references.getNavigator(), openComposerNestedPage.getLink(), openComposerNestedPage.getLink(), 9001, new C9992d.b.C2202b(FlowTag.FILTER_VALUES), null, 16, null);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks
    public void onAsyncWidgetAction(@NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<FiltersButtonWithCounterVO.FiltersButtonWithCounterState> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        this.references.getController().update(new FiltersButtonWithCounterUpdate(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncActionWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        this.asyncActionWidgetViewModel.setCallbacks(this);
        this.asyncActionWidgetViewModel.setTraceNameProvider(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onDetachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onDetachViewModel(lifecycle);
        this.asyncActionWidgetViewModel.removeCallbacks();
        this.asyncActionWidgetViewModel.removeTraceNameProvider();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FiltersButtonWithCounterVO item, @NotNull d info) {
        TravelFiltersButtonView.CounterPosition counterPosition;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getState().getAsyncAction() != null) {
            this.asyncActionWidgetViewModel.submit(item.getState().getAsyncAction());
        }
        FiltersButtonWithCounterVO.FiltersButtonWithCounterState state = item.getState();
        this.itemView.setBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), state.getBackgroundColor(), this.defaultBackgroundColor));
        TravelFiltersButtonView travelFiltersButtonView = this.filtersButtonView;
        if (travelFiltersButtonView != null) {
            travelFiltersButtonView.bind(state.getButton(), new FiltersButtonWithCounterWidgetViewHolder$bind$2$2(this));
        }
        FiltersButtonWithCounterVO.CounterPosition counterPosition2 = state.getCounterPosition();
        if (counterPosition2 != null) {
            if (counterPosition2.equals(FiltersButtonWithCounterVO.CounterPosition.Right.INSTANCE)) {
                counterPosition = TravelFiltersButtonView.CounterPosition.RIGHT;
            } else if (counterPosition2.equals(FiltersButtonWithCounterVO.CounterPosition.RightTop.INSTANCE)) {
                counterPosition = TravelFiltersButtonView.CounterPosition.RIGHT_TOP;
            } else {
                if (!counterPosition2.equals(FiltersButtonWithCounterVO.CounterPosition.RightTopOverlay.INSTANCE)) {
                    throw new o();
                }
                counterPosition = TravelFiltersButtonView.CounterPosition.RIGHT_TOP_OVERLAY;
            }
            TravelFiltersButtonView travelFiltersButtonView2 = this.filtersButtonView;
            if (travelFiltersButtonView2 != null) {
                travelFiltersButtonView2.setCounterPosition(counterPosition);
            }
        }
    }
}
