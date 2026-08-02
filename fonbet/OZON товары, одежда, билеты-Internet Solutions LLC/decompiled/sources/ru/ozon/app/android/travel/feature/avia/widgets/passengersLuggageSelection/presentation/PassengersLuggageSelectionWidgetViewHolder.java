package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation;

import Lm0.a;
import Sc.o;
import T00.m;
import Vg.d;
import WZ.l;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C5316f0;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.data.storage.page.TravelPageKeyValueStorage;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.passengers.PassengersLuggageSelectionAdapter;
import ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.adapter.passengers.PassengersLuggageSelectionDecoration;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006B7\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00022\n\u0010$\u001a\u00060\"j\u0002`#H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b)\u0010*J\u001d\u0010-\u001a\u00020\u00172\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0018\u0010\r\u001a\u00060\u000bj\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00107R\u0018\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR \u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00170B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010G\u001a\u0012\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00170Bj\u0002`F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u0004\u0018\u00010N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetCallbacks;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "pageStorage", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;LWZ/l;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$LoadedState;", "state", "", "bindLoadedState", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$LoadedState;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$FetchState;", "", "asyncData", "bindFetchState", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$FetchState;Ljava/lang/String;)V", "bindRefreshState", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO;Ll20/d;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;", "fetchedModel", "onAsyncWidgetFetched", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetFetchedModel;)V", "", "throwable", "onAsyncWidgetFetchingFailed", "(Ljava/lang/Throwable;)V", "provideTraceWidgetName", "()Ljava/lang/String;", "Lru/ozon/app/android/composer/ComposerReferences;", "LVg/d;", "Lru/ozon/app/android/travel/data/storage/page/TravelPageKeyValueStorage;", "LWZ/l;", "Landroid/widget/LinearLayout;", "container", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Landroidx/recyclerview/widget/RecyclerView;", "passengersRV", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/action/BuildedActionHandler;", "processedActionHandler", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/adapter/passengers/PassengersLuggageSelectionAdapter;", "passengersAdapter", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/adapter/passengers/PassengersLuggageSelectionAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/adapter/passengers/PassengersLuggageSelectionDecoration;", "passengersDecorator", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/adapter/passengers/PassengersLuggageSelectionDecoration;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionWidgetViewModel;", "getViewModel", "()Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionWidgetViewModel;", "viewModel", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PassengersLuggageSelectionWidgetViewHolder extends k<PassengersLuggageSelectionVO> implements AsyncWidgetCallbacks<PassengersLuggageSelectionVO.State>, AsyncWidgetTraceNameProvider {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final LinearLayout container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final TravelPageKeyValueStorage pageStorage;

    @NotNull
    private final PassengersLuggageSelectionAdapter passengersAdapter;

    @NotNull
    private final PassengersLuggageSelectionDecoration passengersDecorator;

    @NotNull
    private final RecyclerView passengersRV;

    @NotNull
    private final Function1<AtomAction, Unit> processedActionHandler;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final TextAtomV2View titleTAV;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassengersLuggageSelectionWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences references, @NotNull d customActionHandlersStoreFactory, @NotNull TravelPageKeyValueStorage pageStorage, @NotNull l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(pageStorage, "pageStorage");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.references = references;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.pageStorage = pageStorage;
        this.tokenizedAnalytics = tokenizedAnalytics;
        LinearLayout linearLayout = (LinearLayout) containerView;
        this.container = linearLayout;
        this.titleTAV = (TextAtomV2View) C5316f0.a(linearLayout, 0);
        RecyclerView recyclerView = (RecyclerView) C5316f0.a(linearLayout, 1);
        this.passengersRV = recyclerView;
        this.actionHandler = new ActionHandler.Builder(references, this).customActionHandlers(new PassengersLuggageSelectionWidgetViewHolder$actionHandler$1(this)).buildHandler();
        PassengersLuggageSelectionWidgetViewHolder$processedActionHandler$1 passengersLuggageSelectionWidgetViewHolder$processedActionHandler$1 = new PassengersLuggageSelectionWidgetViewHolder$processedActionHandler$1(this);
        this.processedActionHandler = passengersLuggageSelectionWidgetViewHolder$processedActionHandler$1;
        PassengersLuggageSelectionAdapter passengersLuggageSelectionAdapter = new PassengersLuggageSelectionAdapter(passengersLuggageSelectionWidgetViewHolder$processedActionHandler$1);
        this.passengersAdapter = passengersLuggageSelectionAdapter;
        PassengersLuggageSelectionDecoration passengersLuggageSelectionDecoration = new PassengersLuggageSelectionDecoration(getContext());
        this.passengersDecorator = passengersLuggageSelectionDecoration;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(passengersLuggageSelectionAdapter);
        recyclerView.addItemDecoration(passengersLuggageSelectionDecoration);
    }

    private final void bindFetchState(PassengersLuggageSelectionVO.State.FetchState state, String asyncData) {
        PassengersLuggageSelectionWidgetViewModel viewModel;
        this.passengersAdapter.setItems(state.getPassengers());
        if (asyncData == null || (viewModel = getViewModel()) == null) {
            return;
        }
        viewModel.fetchWidgetWithParams(asyncData, state.getAsyncParams());
    }

    private final void bindLoadedState(PassengersLuggageSelectionVO.State.LoadedState state) {
        this.passengersAdapter.setItems(state.getPassengers());
    }

    private final void bindRefreshState() {
        InterfaceC7851b.a.a(this.references.getController(), null, null, null, null, 15);
    }

    private final PassengersLuggageSelectionWidgetViewModel getViewModel() {
        return (PassengersLuggageSelectionWidgetViewModel) getWidgetViewModel();
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetched(@NotNull AsyncWidgetFetchedModel<PassengersLuggageSelectionVO.State> fetchedModel) {
        Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
        Map<String, String> trackingPayloads = fetchedModel.getTrackingPayloads();
        if (trackingPayloads != null) {
            this.tokenizedAnalytics.e(trackingPayloads);
        }
        this.references.getController().update(new PassengersLuggageSelectionUpdateStateEvent(fetchedModel.getFetchedState()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetFetchingFailed(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        a.f17149a.e(throwable);
        PassengersLuggageSelectionVO boundData = getBoundData();
        PassengersLuggageSelectionVO.State state = boundData != null ? boundData.getState() : null;
        if (state instanceof PassengersLuggageSelectionVO.State.FetchState) {
            this.references.getController().update(new PassengersLuggageSelectionHideSkeletonsEvent((PassengersLuggageSelectionVO.State.FetchState) state));
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
    public void onAsyncWidgetSkipped() {
        AsyncWidgetCallbacks.DefaultImpls.onAsyncWidgetSkipped(this);
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        PassengersLuggageSelectionWidgetViewModel viewModel = getViewModel();
        if (viewModel != null) {
            viewModel.observeEvents(lifecycle, this, this);
        }
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
    public String provideTraceWidgetName() {
        b i11;
        l20.d b11;
        m c11;
        ru.ozon.composer.ui.widget.l viewItem = getViewItem();
        if (viewItem == null || (i11 = viewItem.i()) == null || (b11 = i11.b()) == null || (c11 = b11.c()) == null) {
            return null;
        }
        return c11.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull PassengersLuggageSelectionVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextHolderKt.bind$default(this.titleTAV, item.getTitle(), null, 2, null);
        PassengersLuggageSelectionVO.State state = item.getState();
        if (state instanceof PassengersLuggageSelectionVO.State.LoadedState) {
            bindLoadedState((PassengersLuggageSelectionVO.State.LoadedState) item.getState());
        } else if (state instanceof PassengersLuggageSelectionVO.State.FetchState) {
            bindFetchState((PassengersLuggageSelectionVO.State.FetchState) item.getState(), item.getAsyncData());
        } else {
            if (!(state instanceof PassengersLuggageSelectionVO.State.RefreshState)) {
                throw new o();
            }
            bindRefreshState();
        }
    }
}
