package ru.ozon.app.android.returns.ui.molecules.cellContent.presentaion;

import Vg.d;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.ui.molecules.cellContent.presentaion.row.ReturnCellContentBalanceRowListAdapter;
import ru.ozon.app.android.returns.ui.molecules.cellContent.presentaion.row.ReturnCellContentBalanceRowListDecorator;
import ru.ozon.app.android.returns.ui.molecules.cellContent.viewObject.ReturnCellContentVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/ReturnCellContentViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/ReturnCellContentView;", "view", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/ReturnCellContentView;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/returns/ui/molecules/cellContent/viewObject/ReturnCellContentVO;Ll20/d;)V", "Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/ReturnCellContentView;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/row/ReturnCellContentBalanceRowListAdapter;", "rowAdapter", "Lru/ozon/app/android/returns/ui/molecules/cellContent/presentaion/row/ReturnCellContentBalanceRowListAdapter;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCellContentViewHolder extends k<ReturnCellContentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final ReturnCellContentBalanceRowListAdapter rowAdapter;

    @NotNull
    private final ReturnCellContentView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReturnCellContentViewHolder(@NotNull ReturnCellContentView view, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.view = view;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ReturnCellContentViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        ReturnCellContentBalanceRowListAdapter returnCellContentBalanceRowListAdapter = new ReturnCellContentBalanceRowListAdapter(buildHandler);
        this.rowAdapter = returnCellContentBalanceRowListAdapter;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.buttonsAdapter = atomsAdapter;
        RecyclerView rowsRecyclerView = view.getRowsRecyclerView();
        rowsRecyclerView.setAdapter(returnCellContentBalanceRowListAdapter);
        Context context = rowsRecyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rowsRecyclerView.addItemDecoration(new ReturnCellContentBalanceRowListDecorator(context));
        view.getButtonsVAL().setAdapter(atomsAdapter);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReturnCellContentVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ReturnCellContentView returnCellContentView = this.view;
        TextHolderKt.bind(returnCellContentView.getTitleTextAtomView(), item.getTitle(), this.actionHandler);
        this.rowAdapter.submitList(item.getRows());
        returnCellContentView.bindSeparator(item.getSeparator());
        TextHolderKt.bind(returnCellContentView.getTotalTextAtomView(), item.getTotal().getText(), this.actionHandler);
        PriceAtomHolderKt.bind(returnCellContentView.getTotalPriceAtomView(), item.getTotal().getPrice(), this.actionHandler);
        TextHolderKt.bindOrGone(returnCellContentView.getDescriptionTextAtomView(), item.getDescription(), this.actionHandler);
        returnCellContentView.getButtonsVAL().setVisibility(!item.getButtons().isEmpty() ? 0 : 8);
        AtomsAdapter atomsAdapter = this.buttonsAdapter;
        Context context = returnCellContentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getButtons());
    }
}
