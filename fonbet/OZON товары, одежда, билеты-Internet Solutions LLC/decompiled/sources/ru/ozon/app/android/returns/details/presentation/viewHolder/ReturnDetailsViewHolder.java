package ru.ozon.app.android.returns.details.presentation.viewHolder;

import Vg.d;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.ReturnStatusViewHolderDelegate;
import ru.ozon.app.android.returns.common.presentation.viewHolderDelegate.total.ReturnTotalViewHolderDelegate;
import ru.ozon.app.android.returns.details.presentation.viewHolder.decoration.AvailableActionsDecorator;
import ru.ozon.app.android.returns.details.presentation.viewHolder.decoration.ComponentsDecoration;
import ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components.ComponentsAdapter;
import ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.items.ReturnItemsViewHolderDelegate;
import ru.ozon.app.android.returns.details.presentation.viewModel.ReturnDetailsViewModel;
import ru.ozon.app.android.returns.details.presentation.viewObject.ReturnDetailsVO;
import ru.ozon.app.android.returns.details.presentation.views.ReturnDetailsView;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0012\u001a\u00020\u0011*\u00020\u00032\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00110\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/ReturnDetailsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnDetailsVO;", "Lru/ozon/app/android/returns/details/presentation/views/ReturnDetailsView;", "detailsView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/returns/details/presentation/views/ReturnDetailsView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;LVg/d;)V", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "availableActions", "", "bind", "(Lru/ozon/app/android/returns/details/presentation/views/ReturnDetailsView;Ljava/util/List;)V", "item", "Ll20/d;", "info", "(Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnDetailsVO;Ll20/d;)V", "Lru/ozon/app/android/returns/details/presentation/views/ReturnDetailsView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/ReturnStatusViewHolderDelegate;", "statusDelegate", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/ReturnStatusViewHolderDelegate;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/ReturnItemsViewHolderDelegate;", "itemsDelegate", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/ReturnItemsViewHolderDelegate;", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/ReturnTotalViewHolderDelegate;", "totalDelegate", "Lru/ozon/app/android/returns/common/presentation/viewHolderDelegate/total/ReturnTotalViewHolderDelegate;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentsAdapter;", "componentsAdapter", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentsAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "actionsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsViewHolder extends k<ReturnDetailsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter actionsAdapter;

    @NotNull
    private final ComponentsAdapter componentsAdapter;

    @NotNull
    private final ReturnDetailsView detailsView;

    @NotNull
    private final ReturnItemsViewHolderDelegate itemsDelegate;

    @NotNull
    private final ReturnStatusViewHolderDelegate statusDelegate;

    @NotNull
    private final ReturnTotalViewHolderDelegate totalDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnDetailsViewHolder(@NotNull ReturnDetailsView detailsView, @NotNull ComposerReferences composerReferences, @NotNull ReturnDetailsViewModel viewModel, @NotNull d customActionHandlersStoreFactory) {
        super(detailsView);
        Intrinsics.checkNotNullParameter(detailsView, "detailsView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.detailsView = detailsView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new ReturnDetailsViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        this.statusDelegate = new ReturnStatusViewHolderDelegate(detailsView.getStatus(), buildHandler);
        this.itemsDelegate = new ReturnItemsViewHolderDelegate(detailsView.getItemsView(), buildHandler);
        this.totalDelegate = new ReturnTotalViewHolderDelegate(detailsView.getTotal(), buildHandler, null, null, null, this, 28, null);
        ComponentsAdapter componentsAdapter = new ComponentsAdapter(viewModel, composerReferences, buildHandler);
        this.componentsAdapter = componentsAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.actionsAdapter = atomsAdapter;
        RecyclerView componentsRecyclerView = detailsView.getComponentsRecyclerView();
        componentsRecyclerView.addItemDecoration(new ComponentsDecoration());
        componentsRecyclerView.setItemAnimator(null);
        componentsRecyclerView.setAdapter(componentsAdapter);
        VerticalAtomsLayout availableActionsVerticalAtomsLayout = detailsView.getAvailableActionsVerticalAtomsLayout();
        Context context = availableActionsVerticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        availableActionsVerticalAtomsLayout.setDecorator(new AvailableActionsDecorator(context));
        availableActionsVerticalAtomsLayout.setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnDetailsVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.statusDelegate.bind(item.getStatus());
        this.componentsAdapter.submitList(item.getComponents());
        this.itemsDelegate.bind(item.getItems());
        this.totalDelegate.bind(item.getTotal());
        bind(this.detailsView, item.getAvailableActions());
        this.detailsView.setTotalBlockVisibility(item.getTotal() != null);
    }

    private final void bind(ReturnDetailsView returnDetailsView, List<ButtonV3Atom.SmallButton> list) {
        if (list != null) {
            AtomsAdapter atomsAdapter = this.actionsAdapter;
            Context context = returnDetailsView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, list);
            ViewExtKt.show(returnDetailsView.getAvailableActionsVerticalAtomsLayout());
            return;
        }
        ViewExtKt.gone(returnDetailsView.getAvailableActionsVerticalAtomsLayout());
    }
}
