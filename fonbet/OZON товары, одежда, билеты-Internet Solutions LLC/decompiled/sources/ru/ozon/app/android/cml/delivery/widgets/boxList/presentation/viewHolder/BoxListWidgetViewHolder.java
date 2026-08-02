package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.viewHolder;

import Vg.d;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cml.delivery.common.ext.WidgetExtKt;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.BoxListCardsDecoration;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.BoxListViewModel;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.adapter.BoxListCardsAdapter;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.model.BoxListVO;
import ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.view.BoxListView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolderKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 32\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00013B3\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0017J)\u0010&\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/viewHolder/BoxListWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/model/BoxListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/view/BoxListView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/BoxListViewModel;", "viewModel", "<init>", "(LVg/d;Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/view/BoxListView;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/BoxListViewModel;)V", "", "boxId", "", "onBoxClick", "(Ljava/lang/String;)V", "setupBoxesRv", "()V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/model/BoxListVO;Ll20/d;)V", "onDetach", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/model/BoxListVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/view/BoxListView;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/BoxListViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter;", "itemsAdapter", "Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/adapter/BoxListCardsAdapter;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxListWidgetViewHolder extends k<BoxListVO> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BoxListView containerView;

    @NotNull
    private final BoxListCardsAdapter itemsAdapter;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final BoxListViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/viewHolder/BoxListWidgetViewHolder$Companion;", "", "<init>", "()V", "SPAN_COUNT", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxListWidgetViewHolder(@NotNull d customActionHandlersStoreFactory, @NotNull BoxListView containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull BoxListViewModel viewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.containerView = containerView;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new BoxListWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.itemsAdapter = new BoxListCardsAdapter(new BoxListWidgetViewHolder$itemsAdapter$1(this), tokenizedAnalytics, this);
        setupBoxesRv();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBoxClick(String boxId) {
        this.viewModel.setSelectedBoxId(boxId);
    }

    private final void setupBoxesRv() {
        RecyclerView boxesRv = this.containerView.getBoxesRv();
        int px = ResourceExtKt.toPx(16);
        BoxListCardsDecoration boxListCardsDecoration = new BoxListCardsDecoration(0, 0, px, px, ResourceExtKt.toPx(4));
        boxesRv.setRecycledViewPool(this.refs.getComposerViewPoolProvider().getViewPool());
        boxesRv.addItemDecoration(boxListCardsDecoration);
        boxesRv.setAdapter(this.itemsAdapter);
        boxesRv.setLayoutManager(new GridLayoutManager(boxesRv.getContext(), 2));
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        super.onAttachViewModel(lifecycle);
        RecyclerView.o layoutManager = this.containerView.getBoxesRv().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.onRestoreInstanceState(this.viewModel.getScrollState());
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        BoxListViewModel boxListViewModel = this.viewModel;
        RecyclerView.o layoutManager = this.containerView.getBoxesRv().getLayoutManager();
        boxListViewModel.saveScrollState(layoutManager != null ? layoutManager.onSaveInstanceState() : null);
        super.onDetach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BoxListVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.init(item, WidgetExtKt.isEditMode(info));
        DSDisclaimerHolderKt.bindOrGone(this.containerView.getBoxRequirementsDisclaimer(), item.getBoxRequirements(), this.actionHandler);
        BoxListCardsAdapter boxListCardsAdapter = this.itemsAdapter;
        Integer lastSelectedBoxIndex = this.viewModel.getLastSelectedBoxIndex();
        if (lastSelectedBoxIndex != null) {
            boxListCardsAdapter.setSelectedIndex(lastSelectedBoxIndex.intValue());
        }
        boxListCardsAdapter.submitList(item.getBoxList());
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BoxListVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((BoxListWidgetViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
