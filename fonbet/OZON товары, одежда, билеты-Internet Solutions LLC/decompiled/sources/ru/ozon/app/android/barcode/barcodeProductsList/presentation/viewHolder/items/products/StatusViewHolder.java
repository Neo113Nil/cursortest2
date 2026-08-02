package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/StatusViewHolder;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsItemViewHolder;", "view", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/StatusView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/StatusView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Status;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StatusViewHolder extends ProductsItemViewHolder {

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private final StatusView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public StatusViewHolder(@NotNull StatusView view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.onAction = onAction;
    }

    public final void bind(@NotNull ProductListItem.Status item) {
        Intrinsics.checkNotNullParameter(item, "item");
        StatusView statusView = this.view;
        TextHolderKt.bind(statusView.getTitleView(), item.getTitle(), this.onAction);
        TextHolderKt.bindOrGone(statusView.getCountView(), item.getCount(), this.onAction);
        PriceAtomHolderKt.bindOrGone(statusView.getPriceView(), item.getPrice(), this.onAction);
    }
}
