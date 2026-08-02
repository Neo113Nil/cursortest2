package ru.ozon.app.android.ugc.widgets.selectionsList.presentation.footer;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/presentation/footer/ReviewPreviewPriceViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "priceAtomView", "<init>", "(Lru/ozon/uni/android/atom/price/ui/PriceAtomView;)V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$PriceWrapper;", "item", "", "bind", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$TileFooterContent$PriceWrapper;)V", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReviewPreviewPriceViewHolder extends RecyclerView.C {
    public static final int $stable = PriceAtomView.$stable;

    @NotNull
    private final PriceAtomView priceAtomView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewPreviewPriceViewHolder(@NotNull PriceAtomView priceAtomView) {
        super(priceAtomView);
        Intrinsics.checkNotNullParameter(priceAtomView, "priceAtomView");
        this.priceAtomView = priceAtomView;
    }

    public final void bind(@NotNull SelectionsListVI.TileFooterContent.PriceWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        PriceAtomHolderKt.bind$default(this.priceAtomView, item.getPrice(), null, 2, null);
    }
}
