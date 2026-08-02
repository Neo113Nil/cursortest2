package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewHolder;

import Vg.d;
import android.widget.LinearLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationReasonsNestedBinding;
import ru.ozon.app.android.returns.creation.databinding.ReturnCreationReasonsReasonBinding;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewHolder.nested.NestedReasonsBindingDelegate;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem.ReasonVI;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper.ReasonWidgetViewMapperUpdateCommentKey;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.cell.CellView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewHolder/ReasonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsReasonBinding;", "binding", "Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;", "inputViewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;", "oneTimePostRefreshHandler", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsReasonBinding;Lru/ozon/app/android/returns/ui/molecules/reason/viewModel/InputViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/OneTimePostRefreshHandler;LVg/d;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;Ll20/d;)V", "onViewOutOfOverlapBounds", "()V", "Lru/ozon/app/android/returns/creation/databinding/ReturnCreationReasonsReasonBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewHolder/nested/NestedReasonsBindingDelegate;", "nestedReasonsReasonBinding", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewHolder/nested/NestedReasonsBindingDelegate;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReasonViewHolder extends k<ReasonVI> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnCreationReasonsReasonBinding binding;

    @NotNull
    private final NestedReasonsBindingDelegate nestedReasonsReasonBinding;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ReasonViewHolder(@NotNull ReturnCreationReasonsReasonBinding binding, @NotNull InputViewModel inputViewModel, @NotNull ComposerReferences refs, @NotNull OneTimePostRefreshHandler oneTimePostRefreshHandler, @NotNull d customActionHandlersStoreFactory) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(inputViewModel, "inputViewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(oneTimePostRefreshHandler, "oneTimePostRefreshHandler");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        LinearLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new ReasonViewHolder$actionHandler$1(oneTimePostRefreshHandler)).customActionHandlers(new ReasonViewHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        ReturnCreationReasonsNestedBinding nestedReasonsContainer = binding.nestedReasonsContainer;
        Intrinsics.checkNotNullExpressionValue(nestedReasonsContainer, "nestedReasonsContainer");
        this.nestedReasonsReasonBinding = new NestedReasonsBindingDelegate(nestedReasonsContainer, inputViewModel, refs, buildHandler);
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfOverlapBounds() {
        Map<Long, String> commentCache = this.nestedReasonsReasonBinding.getCommentCache();
        for (Map.Entry<Long, String> entry : commentCache.entrySet()) {
            this.refs.getController().update(new ReasonWidgetViewMapperUpdateCommentKey(entry.getKey().longValue(), entry.getValue()));
        }
        commentCache.clear();
        super.onViewOutOfOverlapBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReasonVI item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        CellView reasonCell = this.binding.reasonCell;
        Intrinsics.checkNotNullExpressionValue(reasonCell, "reasonCell");
        ReasonRow reason = item.getReason();
        ReasonRow.CellRow cellRow = reason instanceof ReasonRow.CellRow ? (ReasonRow.CellRow) reason : null;
        CellHolderKt.bindOrGone(reasonCell, cellRow != null ? cellRow.getCell() : null, this.actionHandler);
        this.nestedReasonsReasonBinding.bindOrGone(item.getNestedReasons());
    }
}
