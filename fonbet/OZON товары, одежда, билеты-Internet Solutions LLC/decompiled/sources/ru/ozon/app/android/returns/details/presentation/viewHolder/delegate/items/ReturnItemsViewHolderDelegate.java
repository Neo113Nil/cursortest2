package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.items;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.details.data.dto.ReturnItemsDto;
import ru.ozon.app.android.returns.details.presentation.viewObject.ReturnItemsVO;
import ru.ozon.app.android.returns.details.presentation.views.ReturnItemsView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.ContainerExtKt;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/ReturnItemsViewHolderDelegate;", "", "returnItemsView", "Lru/ozon/app/android/returns/details/presentation/views/ReturnItemsView;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/returns/details/presentation/views/ReturnItemsView;Lkotlin/jvm/functions/Function1;)V", "itemsAdapter", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/items/ReturnItemsAdapter;", "bind", "returnItems", "Lru/ozon/app/android/returns/details/presentation/viewObject/ReturnItemsVO;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnItemsViewHolderDelegate {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReturnItemsAdapter itemsAdapter;

    @NotNull
    private final ReturnItemsView returnItemsView;

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnItemsViewHolderDelegate(@NotNull ReturnItemsView returnItemsView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(returnItemsView, "returnItemsView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.returnItemsView = returnItemsView;
        this.actionHandler = actionHandler;
        ReturnItemsAdapter returnItemsAdapter = new ReturnItemsAdapter(actionHandler);
        this.itemsAdapter = returnItemsAdapter;
        RecyclerView itemsRecyclerView = returnItemsView.getItemsRecyclerView();
        itemsRecyclerView.addItemDecoration(new ReturnItemsDecoration());
        itemsRecyclerView.setAdapter(returnItemsAdapter);
        returnItemsView.getPackingInstructionSingleAtom().setOnAction(actionHandler);
    }

    public final void bind(@NotNull ReturnItemsVO returnItems) {
        Intrinsics.checkNotNullParameter(returnItems, "returnItems");
        ReturnItemsView returnItemsView = this.returnItemsView;
        TextAtomHolderKt.bind$default(returnItemsView.getTitleTextAtomView(), returnItems.getTitle(), null, 2, null);
        ReturnItemsDto.Subtitle subtitle = returnItems.getSubtitle();
        TextAtomHolderKt.bindOrGone$default(returnItemsView.getSubtitleTextAtomView(), subtitle != null ? subtitle.getText() : null, null, 2, null);
        WrappedBorderlessButtonHolderKt.bindOrGone(returnItemsView.getOrderLinkSmallBorderlessButtonView(), subtitle != null ? subtitle.getOrderLink() : null, this.actionHandler);
        ContainerExtKt.bindOrGone$default(returnItemsView.getPackingInstructionSingleAtom(), returnItems.getPackingInstruction(), false, 2, null);
        this.itemsAdapter.submitList(returnItems.getItems());
    }
}
