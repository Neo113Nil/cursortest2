package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.header;

import A00.a;
import I00.a;
import T00.j;
import T00.m;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import j10.InterfaceC7238a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data.EmptyStateV2WidgetDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersAsyncMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersAsyncActionViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersEmptyStateUpdate;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersRefreshActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersUpdate;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersUpdateVO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks;
import ru.ozon.composer.ui.widget.l;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B]\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010$J\u0017\u0010'\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020 2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020 2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020 0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010D\u001a\u0004\u0018\u00010A8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderStickyViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersUpdateVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Ll10/i;", "container", "Lj10/a;", "Lru/ozon/composer/ui/widget/l;", "composerStore", "LI00/a;", "composerUpdateMapper", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersAsyncActionViewModel;", "asyncActionWidgetViewModel", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersAsyncMapper;", "filtersAsyncMapper", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lj10/a;LI00/a;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersAsyncActionViewModel;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersAsyncMapper;Ld20/e;)V", "boundData", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "dto", "LT00/a;", "composerState", "", "showErrorScreen", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;LT00/a;)V", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderVO;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "onAsyncWidgetAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "Ll10/i;", "Lj10/a;", "LI00/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersAsyncActionViewModel;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersAsyncMapper;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersRefreshActionHandler;", "filtersRefreshActionHandler", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersRefreshActionHandler;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderView;", "getFiltersHeaderView", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/header/FiltersHeaderView;", "filtersHeaderView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersHeaderStickyViewHolder extends AbstractC6067d<FiltersHeaderVO> implements AsyncActionWidgetCallbacks<FiltersUpdateVO>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final FiltersAsyncActionViewModel asyncActionWidgetViewModel;

    @NotNull
    private final InterfaceC7238a<l> composerStore;

    @NotNull
    private final a<l> composerUpdateMapper;

    @NotNull
    private final i container;

    @NotNull
    private final FiltersAsyncMapper filtersAsyncMapper;

    @NotNull
    private final FiltersRefreshActionHandler filtersRefreshActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersHeaderStickyViewHolder(@NotNull i container, @NotNull InterfaceC7238a<l> composerStore, @NotNull a<l> composerUpdateMapper, @NotNull WZ.l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor, @NotNull FiltersAsyncActionViewModel asyncActionWidgetViewModel, @NotNull FiltersAsyncMapper filtersAsyncMapper, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(composerStore, "composerStore");
        Intrinsics.checkNotNullParameter(composerUpdateMapper, "composerUpdateMapper");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(asyncActionWidgetViewModel, "asyncActionWidgetViewModel");
        Intrinsics.checkNotNullParameter(filtersAsyncMapper, "filtersAsyncMapper");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.composerStore = composerStore;
        this.composerUpdateMapper = composerUpdateMapper;
        this.asyncActionWidgetViewModel = asyncActionWidgetViewModel;
        this.filtersAsyncMapper = filtersAsyncMapper;
        this.actionHandler = new ActionHandler.Builder(container, this).buildHandler();
        this.filtersRefreshActionHandler = new FiltersRefreshActionHandler(container, tokenizedAnalytics, handlersInhibitor, this);
    }

    private final FiltersHeaderView getFiltersHeaderView() {
        View view = getView();
        if (view instanceof FiltersHeaderView) {
            return (FiltersHeaderView) view;
        }
        return null;
    }

    private final void showErrorScreen(FiltersHeaderVO boundData, EmptyStateV2WidgetDTO dto, T00.a composerState) {
        this.container.M().update(new FiltersEmptyStateUpdate());
        List<l> a11 = this.composerUpdateMapper.a(new j(new m(2L, "travel", "emptyState", boundData.getId() + "travelemptyState"), dto), composerState);
        a.C2371l.C0009a c0009a = new a.C2371l.C0009a();
        c0009a.b();
        c0009a.e(a11);
        this.composerStore.c(c0009a.c());
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionWidgetCallbacks
    public void onAsyncWidgetAction(@NotNull AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.actionHandler.invoke(AtomActionMapperKt.toAtomAction(action, null));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<FiltersUpdateVO> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        this.container.M().update(new FiltersUpdate(fetchedModel.getFetchedState()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        l viewItem;
        b i11;
        d b11;
        T00.a b12;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        FiltersHeaderVO filtersHeaderVO = (FiltersHeaderVO) getBoundData();
        if (filtersHeaderVO == null) {
            return;
        }
        EmptyStateV2WidgetDTO asyncServerErrorMessage = filtersHeaderVO.getAsyncServerErrorMessage();
        if ((asyncServerErrorMessage == null && (asyncServerErrorMessage = filtersHeaderVO.getAsyncErrorMessage()) == null) || (viewItem = getViewItem()) == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (b12 = b11.b()) == null) {
            return;
        }
        showErrorScreen(filtersHeaderVO, asyncServerErrorMessage, b12);
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncActionWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.asyncActionWidgetViewModel.setCallbacks(this);
        this.asyncActionWidgetViewModel.setTraceNameProvider(this);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.asyncActionWidgetViewModel.removeCallbacks();
        this.asyncActionWidgetViewModel.removeTraceNameProvider();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        return AsyncWidgetTraceNameProvider.DefaultImpls.provideTraceWidgetName(this);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FiltersHeaderVO item) {
        b i11;
        d b11;
        Intrinsics.checkNotNullParameter(item, "item");
        l viewItem = getViewItem();
        T00.a b12 = (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null) ? null : b11.b();
        if (item.getAsyncServerErrorMessage() == null || b12 == null) {
            FiltersAsyncMapper filtersAsyncMapper = this.filtersAsyncMapper;
            l viewItem2 = getViewItem();
            filtersAsyncMapper.setWidgetInfo(viewItem2 != null ? viewItem2.c() : null);
            if (item.getAsyncAction() != null) {
                this.asyncActionWidgetViewModel.submit(item.getAsyncAction());
            }
        } else {
            showErrorScreen(item, item.getAsyncServerErrorMessage(), b12);
        }
        this.filtersRefreshActionHandler.bind(item.getId());
        FiltersHeaderView filtersHeaderView = getFiltersHeaderView();
        if (filtersHeaderView != null) {
            filtersHeaderView.bind(item, this.filtersRefreshActionHandler);
        }
    }
}
