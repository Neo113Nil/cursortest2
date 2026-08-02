package ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewHolder.items.products;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewItem.ProductListItem;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ButtonViewHolder;", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewHolder/items/products/ProductsItemViewHolder;", "view", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;Lkotlin/jvm/functions/Function1;)V", "horizontalMargin", "", "verticalMargin", "bind", "item", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewItem/ProductListItem$Button;", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ButtonViewHolder extends ProductsItemViewHolder {
    private final int horizontalMargin;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;
    private final int verticalMargin;

    @NotNull
    private final ButtonV3View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonViewHolder(@NotNull ButtonV3View view, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.view = view;
        this.onAction = onAction;
        int px = ResourceExtKt.toPx(16);
        this.horizontalMargin = px;
        int px2 = ResourceExtKt.toPx(16);
        this.verticalMargin = px2;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(px, 0, px, px2);
        view.setLayoutParams(marginLayoutParams);
    }

    public final void bind(@NotNull ProductListItem.Button item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ButtonV3HolderKt.bind(this.view, item.getButton(), this.onAction);
    }
}
